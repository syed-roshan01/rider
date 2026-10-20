package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o7.k;

/* JADX INFO: loaded from: classes.dex */
public class WatchChangeAggregator {
    private static final String LOG_TAG = "WatchChangeAggregator";
    private final TargetMetadataProvider targetMetadataProvider;
    private final Map<Integer, TargetState> targetStates = new HashMap();
    private Map<DocumentKey, MutableDocument> pendingDocumentUpdates = new HashMap();
    private Map<DocumentKey, Set<Integer>> pendingDocumentTargetMapping = new HashMap();
    private Map<Integer, QueryPurpose> pendingTargetResets = new HashMap();

    /* JADX INFO: renamed from: com.google.firebase.firestore.remote.WatchChangeAggregator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$remote$WatchChange$WatchTargetChangeType;

        static {
            int[] iArr = new int[WatchChange.WatchTargetChangeType.values().length];
            $SwitchMap$com$google$firebase$firestore$remote$WatchChange$WatchTargetChangeType = iArr;
            try {
                iArr[WatchChange.WatchTargetChangeType.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$remote$WatchChange$WatchTargetChangeType[WatchChange.WatchTargetChangeType.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$remote$WatchChange$WatchTargetChangeType[WatchChange.WatchTargetChangeType.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$remote$WatchChange$WatchTargetChangeType[WatchChange.WatchTargetChangeType.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$remote$WatchChange$WatchTargetChangeType[WatchChange.WatchTargetChangeType.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum BloomFilterApplicationStatus {
        SUCCESS,
        SKIPPED,
        FALSE_POSITIVE
    }

    public interface TargetMetadataProvider {
        DatabaseId getDatabaseId();

        ImmutableSortedSet<DocumentKey> getRemoteKeysForTarget(int i10);

        TargetData getTargetDataForTarget(int i10);
    }

    public WatchChangeAggregator(TargetMetadataProvider targetMetadataProvider) {
        this.targetMetadataProvider = targetMetadataProvider;
    }

    private void addDocumentToTarget(int i10, MutableDocument mutableDocument) {
        if (isActiveTarget(i10)) {
            ensureTargetState(i10).addDocumentChange(mutableDocument.getKey(), targetContainsDocument(i10, mutableDocument.getKey()) ? DocumentViewChange.Type.MODIFIED : DocumentViewChange.Type.ADDED);
            this.pendingDocumentUpdates.put(mutableDocument.getKey(), mutableDocument);
            ensureDocumentTargetMapping(mutableDocument.getKey()).add(Integer.valueOf(i10));
        }
    }

    private BloomFilterApplicationStatus applyBloomFilter(BloomFilter bloomFilter, WatchChange.ExistenceFilterWatchChange existenceFilterWatchChange, int i10) {
        return existenceFilterWatchChange.getExistenceFilter().getCount() == i10 - filterRemovedDocuments(bloomFilter, existenceFilterWatchChange.getTargetId()) ? BloomFilterApplicationStatus.SUCCESS : BloomFilterApplicationStatus.FALSE_POSITIVE;
    }

    private Set<Integer> ensureDocumentTargetMapping(DocumentKey documentKey) {
        Set<Integer> set = this.pendingDocumentTargetMapping.get(documentKey);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.pendingDocumentTargetMapping.put(documentKey, hashSet);
        return hashSet;
    }

    private TargetState ensureTargetState(int i10) {
        TargetState targetState = this.targetStates.get(Integer.valueOf(i10));
        if (targetState != null) {
            return targetState;
        }
        TargetState targetState2 = new TargetState();
        this.targetStates.put(Integer.valueOf(i10), targetState2);
        return targetState2;
    }

    private int filterRemovedDocuments(BloomFilter bloomFilter, int i10) {
        int i11 = 0;
        for (DocumentKey documentKey : this.targetMetadataProvider.getRemoteKeysForTarget(i10)) {
            DatabaseId databaseId = this.targetMetadataProvider.getDatabaseId();
            if (!bloomFilter.mightContain("projects/" + databaseId.getProjectId() + "/databases/" + databaseId.getDatabaseId() + "/documents/" + documentKey.getPath().canonicalString())) {
                removeDocumentFromTarget(i10, documentKey, null);
                i11++;
            }
        }
        return i11;
    }

    private int getCurrentDocumentCountForTarget(int i10) {
        TargetChange targetChange = ensureTargetState(i10).toTargetChange();
        return (targetChange.getAddedDocuments().size() + this.targetMetadataProvider.getRemoteKeysForTarget(i10).size()) - targetChange.getRemovedDocuments().size();
    }

    private Collection<Integer> getTargetIds(WatchChange.WatchTargetChange watchTargetChange) {
        List<Integer> targetIds = watchTargetChange.getTargetIds();
        if (!targetIds.isEmpty()) {
            return targetIds;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.targetStates.keySet()) {
            if (isActiveTarget(num.intValue())) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    private boolean isActiveTarget(int i10) {
        return queryDataForActiveTarget(i10) != null;
    }

    private BloomFilter parseBloomFilter(WatchChange.ExistenceFilterWatchChange existenceFilterWatchChange) {
        k unchangedNames = existenceFilterWatchChange.getExistenceFilter().getUnchangedNames();
        if (unchangedNames != null && unchangedNames.j()) {
            try {
                BloomFilter bloomFilterCreate = BloomFilter.create(unchangedNames.g().g(), unchangedNames.g().i(), unchangedNames.i());
                if (bloomFilterCreate.getBitCount() == 0) {
                    return null;
                }
                return bloomFilterCreate;
            } catch (BloomFilter.BloomFilterCreateException e4) {
                Logger.warn(LOG_TAG, "Applying bloom filter failed: (" + e4.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
            }
        }
        return null;
    }

    private TargetData queryDataForActiveTarget(int i10) {
        TargetState targetState = this.targetStates.get(Integer.valueOf(i10));
        if (targetState == null || !targetState.isPending()) {
            return this.targetMetadataProvider.getTargetDataForTarget(i10);
        }
        return null;
    }

    private void removeDocumentFromTarget(int i10, DocumentKey documentKey, MutableDocument mutableDocument) {
        if (isActiveTarget(i10)) {
            TargetState targetStateEnsureTargetState = ensureTargetState(i10);
            if (targetContainsDocument(i10, documentKey)) {
                targetStateEnsureTargetState.addDocumentChange(documentKey, DocumentViewChange.Type.REMOVED);
            } else {
                targetStateEnsureTargetState.removeDocumentChange(documentKey);
            }
            ensureDocumentTargetMapping(documentKey).add(Integer.valueOf(i10));
            if (mutableDocument != null) {
                this.pendingDocumentUpdates.put(documentKey, mutableDocument);
            }
        }
    }

    private void resetTarget(int i10) {
        Assert.hardAssert((this.targetStates.get(Integer.valueOf(i10)) == null || this.targetStates.get(Integer.valueOf(i10)).isPending()) ? false : true, "Should only reset active targets", new Object[0]);
        this.targetStates.put(Integer.valueOf(i10), new TargetState());
        Iterator<DocumentKey> it = this.targetMetadataProvider.getRemoteKeysForTarget(i10).iterator();
        while (it.hasNext()) {
            removeDocumentFromTarget(i10, it.next(), null);
        }
    }

    private boolean targetContainsDocument(int i10, DocumentKey documentKey) {
        return this.targetMetadataProvider.getRemoteKeysForTarget(i10).contains(documentKey);
    }

    public RemoteEvent createRemoteEvent(SnapshotVersion snapshotVersion) {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, TargetState> entry : this.targetStates.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            TargetState value = entry.getValue();
            TargetData targetDataQueryDataForActiveTarget = queryDataForActiveTarget(iIntValue);
            if (targetDataQueryDataForActiveTarget != null) {
                if (value.isCurrent() && targetDataQueryDataForActiveTarget.getTarget().isDocumentQuery()) {
                    DocumentKey documentKeyFromPath = DocumentKey.fromPath(targetDataQueryDataForActiveTarget.getTarget().getPath());
                    if (this.pendingDocumentUpdates.get(documentKeyFromPath) == null && !targetContainsDocument(iIntValue, documentKeyFromPath)) {
                        removeDocumentFromTarget(iIntValue, documentKeyFromPath, MutableDocument.newNoDocument(documentKeyFromPath, snapshotVersion));
                    }
                }
                if (value.hasChanges()) {
                    map.put(Integer.valueOf(iIntValue), value.toTargetChange());
                    value.clearChanges();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<DocumentKey, Set<Integer>> entry2 : this.pendingDocumentTargetMapping.entrySet()) {
            DocumentKey key = entry2.getKey();
            Iterator<Integer> it = entry2.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.add(key);
                    break;
                }
                TargetData targetDataQueryDataForActiveTarget2 = queryDataForActiveTarget(it.next().intValue());
                if (targetDataQueryDataForActiveTarget2 != null && !targetDataQueryDataForActiveTarget2.getPurpose().equals(QueryPurpose.LIMBO_RESOLUTION)) {
                    break;
                }
            }
        }
        Iterator<MutableDocument> it2 = this.pendingDocumentUpdates.values().iterator();
        while (it2.hasNext()) {
            it2.next().setReadTime(snapshotVersion);
        }
        RemoteEvent remoteEvent = new RemoteEvent(snapshotVersion, Collections.unmodifiableMap(map), Collections.unmodifiableMap(this.pendingTargetResets), Collections.unmodifiableMap(this.pendingDocumentUpdates), Collections.unmodifiableSet(hashSet));
        this.pendingDocumentUpdates = new HashMap();
        this.pendingDocumentTargetMapping = new HashMap();
        this.pendingTargetResets = new HashMap();
        return remoteEvent;
    }

    public void handleDocumentChange(WatchChange.DocumentChange documentChange) {
        MutableDocument newDocument = documentChange.getNewDocument();
        DocumentKey documentKey = documentChange.getDocumentKey();
        Iterator<Integer> it = documentChange.getUpdatedTargetIds().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (newDocument == null || !newDocument.isFoundDocument()) {
                removeDocumentFromTarget(iIntValue, documentKey, newDocument);
            } else {
                addDocumentToTarget(iIntValue, newDocument);
            }
        }
        Iterator<Integer> it2 = documentChange.getRemovedTargetIds().iterator();
        while (it2.hasNext()) {
            removeDocumentFromTarget(it2.next().intValue(), documentKey, documentChange.getNewDocument());
        }
    }

    public void handleExistenceFilter(WatchChange.ExistenceFilterWatchChange existenceFilterWatchChange) {
        int targetId = existenceFilterWatchChange.getTargetId();
        int count = existenceFilterWatchChange.getExistenceFilter().getCount();
        TargetData targetDataQueryDataForActiveTarget = queryDataForActiveTarget(targetId);
        if (targetDataQueryDataForActiveTarget != null) {
            Target target = targetDataQueryDataForActiveTarget.getTarget();
            if (target.isDocumentQuery()) {
                if (count != 0) {
                    Assert.hardAssert(count == 1, "Single document existence filter with count: %d", Integer.valueOf(count));
                    return;
                } else {
                    DocumentKey documentKeyFromPath = DocumentKey.fromPath(target.getPath());
                    removeDocumentFromTarget(targetId, documentKeyFromPath, MutableDocument.newNoDocument(documentKeyFromPath, SnapshotVersion.NONE));
                    return;
                }
            }
            int currentDocumentCountForTarget = getCurrentDocumentCountForTarget(targetId);
            if (currentDocumentCountForTarget != count) {
                BloomFilter bloomFilter = parseBloomFilter(existenceFilterWatchChange);
                BloomFilterApplicationStatus bloomFilterApplicationStatusApplyBloomFilter = bloomFilter != null ? applyBloomFilter(bloomFilter, existenceFilterWatchChange, currentDocumentCountForTarget) : BloomFilterApplicationStatus.SKIPPED;
                if (bloomFilterApplicationStatusApplyBloomFilter != BloomFilterApplicationStatus.SUCCESS) {
                    resetTarget(targetId);
                    this.pendingTargetResets.put(Integer.valueOf(targetId), bloomFilterApplicationStatusApplyBloomFilter == BloomFilterApplicationStatus.FALSE_POSITIVE ? QueryPurpose.EXISTENCE_FILTER_MISMATCH_BLOOM : QueryPurpose.EXISTENCE_FILTER_MISMATCH);
                }
                TestingHooks.getInstance().notifyOnExistenceFilterMismatch(TestingHooks.ExistenceFilterMismatchInfo.from(currentDocumentCountForTarget, existenceFilterWatchChange.getExistenceFilter(), this.targetMetadataProvider.getDatabaseId(), bloomFilter, bloomFilterApplicationStatusApplyBloomFilter));
            }
        }
    }

    public void handleTargetChange(WatchChange.WatchTargetChange watchTargetChange) {
        Iterator<Integer> it = getTargetIds(watchTargetChange).iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            TargetState targetStateEnsureTargetState = ensureTargetState(iIntValue);
            int i10 = AnonymousClass1.$SwitchMap$com$google$firebase$firestore$remote$WatchChange$WatchTargetChangeType[watchTargetChange.getChangeType().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    targetStateEnsureTargetState.recordTargetResponse();
                    if (!targetStateEnsureTargetState.isPending()) {
                        targetStateEnsureTargetState.clearChanges();
                    }
                    targetStateEnsureTargetState.updateResumeToken(watchTargetChange.getResumeToken());
                } else if (i10 == 3) {
                    targetStateEnsureTargetState.recordTargetResponse();
                    if (!targetStateEnsureTargetState.isPending()) {
                        removeTarget(iIntValue);
                    }
                    Assert.hardAssert(watchTargetChange.getCause() == null, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw Assert.fail("Unknown target watch change state: %s", watchTargetChange.getChangeType());
                    }
                    if (isActiveTarget(iIntValue)) {
                        resetTarget(iIntValue);
                        targetStateEnsureTargetState.updateResumeToken(watchTargetChange.getResumeToken());
                    }
                } else if (isActiveTarget(iIntValue)) {
                    targetStateEnsureTargetState.markCurrent();
                    targetStateEnsureTargetState.updateResumeToken(watchTargetChange.getResumeToken());
                }
            } else if (isActiveTarget(iIntValue)) {
                targetStateEnsureTargetState.updateResumeToken(watchTargetChange.getResumeToken());
            }
        }
    }

    public void recordPendingTargetRequest(int i10) {
        ensureTargetState(i10).recordPendingTargetRequest();
    }

    public void removeTarget(int i10) {
        this.targetStates.remove(Integer.valueOf(i10));
    }
}
