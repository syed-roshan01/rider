package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u1.z;

/* JADX INFO: loaded from: classes.dex */
public class View {
    private boolean current;
    private DocumentSet documentSet;
    private final Query query;
    private ImmutableSortedSet<DocumentKey> syncedDocuments;
    private ViewSnapshot.SyncState syncState = ViewSnapshot.SyncState.NONE;
    private ImmutableSortedSet<DocumentKey> limboDocuments = DocumentKey.emptyKeySet();
    private ImmutableSortedSet<DocumentKey> mutatedKeys = DocumentKey.emptyKeySet();

    /* JADX INFO: renamed from: com.google.firebase.firestore.core.View$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$core$DocumentViewChange$Type;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            $SwitchMap$com$google$firebase$firestore$core$DocumentViewChange$Type = iArr;
            try {
                iArr[DocumentViewChange.Type.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$DocumentViewChange$Type[DocumentViewChange.Type.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$DocumentViewChange$Type[DocumentViewChange.Type.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$DocumentViewChange$Type[DocumentViewChange.Type.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class DocumentChanges {
        final DocumentViewChangeSet changeSet;
        final DocumentSet documentSet;
        final ImmutableSortedSet<DocumentKey> mutatedKeys;
        private final boolean needsRefill;

        public /* synthetic */ DocumentChanges(DocumentSet documentSet, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet immutableSortedSet, boolean z10, AnonymousClass1 anonymousClass1) {
            this(documentSet, documentViewChangeSet, immutableSortedSet, z10);
        }

        public boolean needsRefill() {
            return this.needsRefill;
        }

        private DocumentChanges(DocumentSet documentSet, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet<DocumentKey> immutableSortedSet, boolean z10) {
            this.documentSet = documentSet;
            this.changeSet = documentViewChangeSet;
            this.mutatedKeys = immutableSortedSet;
            this.needsRefill = z10;
        }
    }

    public View(Query query, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        this.query = query;
        this.documentSet = DocumentSet.emptySet(query.comparator());
        this.syncedDocuments = immutableSortedSet;
    }

    private void applyTargetChange(TargetChange targetChange) {
        if (targetChange != null) {
            Iterator<DocumentKey> it = targetChange.getAddedDocuments().iterator();
            while (it.hasNext()) {
                this.syncedDocuments = this.syncedDocuments.insert(it.next());
            }
            for (DocumentKey documentKey : targetChange.getModifiedDocuments()) {
                Assert.hardAssert(this.syncedDocuments.contains(documentKey), "Modified document %s not found in view.", documentKey);
            }
            Iterator<DocumentKey> it2 = targetChange.getRemovedDocuments().iterator();
            while (it2.hasNext()) {
                this.syncedDocuments = this.syncedDocuments.remove(it2.next());
            }
            this.current = targetChange.isCurrent();
        }
    }

    private static int changeTypeOrder(DocumentViewChange documentViewChange) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$firebase$firestore$core$DocumentViewChange$Type[documentViewChange.getType().ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + documentViewChange.getType());
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$applyChanges$0(DocumentViewChange documentViewChange, DocumentViewChange documentViewChange2) {
        int iCompareIntegers = Util.compareIntegers(changeTypeOrder(documentViewChange), changeTypeOrder(documentViewChange2));
        return iCompareIntegers != 0 ? iCompareIntegers : this.query.comparator().compare(documentViewChange.getDocument(), documentViewChange2.getDocument());
    }

    private boolean shouldBeLimboDoc(DocumentKey documentKey) {
        Document document;
        return (this.syncedDocuments.contains(documentKey) || (document = this.documentSet.getDocument(documentKey)) == null || document.hasLocalMutations()) ? false : true;
    }

    private boolean shouldWaitForSyncedDocument(Document document, Document document2) {
        return document.hasLocalMutations() && document2.hasCommittedMutations() && !document2.hasLocalMutations();
    }

    private List<LimboDocumentChange> updateLimboDocuments() {
        if (!this.current) {
            return Collections.emptyList();
        }
        ImmutableSortedSet<DocumentKey> immutableSortedSet = this.limboDocuments;
        this.limboDocuments = DocumentKey.emptyKeySet();
        for (Document document : this.documentSet) {
            if (shouldBeLimboDoc(document.getKey())) {
                this.limboDocuments = this.limboDocuments.insert(document.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(this.limboDocuments.size() + immutableSortedSet.size());
        for (DocumentKey documentKey : immutableSortedSet) {
            if (!this.limboDocuments.contains(documentKey)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.REMOVED, documentKey));
            }
        }
        for (DocumentKey documentKey2 : this.limboDocuments) {
            if (!immutableSortedSet.contains(documentKey2)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.ADDED, documentKey2));
            }
        }
        return arrayList;
    }

    public ViewChange applyChanges(DocumentChanges documentChanges) {
        return applyChanges(documentChanges, null);
    }

    public ViewChange applyOnlineStateChange(OnlineState onlineState) {
        if (!this.current || onlineState != OnlineState.OFFLINE) {
            return new ViewChange(null, Collections.emptyList());
        }
        this.current = false;
        return applyChanges(new DocumentChanges(this.documentSet, new DocumentViewChangeSet(), this.mutatedKeys, false, null));
    }

    public DocumentChanges computeDocChanges(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        return computeDocChanges(immutableSortedMap, null);
    }

    public ImmutableSortedSet<DocumentKey> getLimboDocuments() {
        return this.limboDocuments;
    }

    public ViewSnapshot.SyncState getSyncState() {
        return this.syncState;
    }

    public ImmutableSortedSet<DocumentKey> getSyncedDocuments() {
        return this.syncedDocuments;
    }

    public ViewChange applyChanges(DocumentChanges documentChanges, TargetChange targetChange) {
        return applyChanges(documentChanges, targetChange, false);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0134 A[PHI: r17
  0x0134: PHI (r17v4 com.google.firebase.firestore.model.DocumentSet) = 
  (r17v0 com.google.firebase.firestore.model.DocumentSet)
  (r17v0 com.google.firebase.firestore.model.DocumentSet)
  (r17v5 com.google.firebase.firestore.model.DocumentSet)
  (r17v5 com.google.firebase.firestore.model.DocumentSet)
 binds: [B:70:0x0130, B:71:0x0132, B:58:0x0103, B:55:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0136 A[PHI: r17
  0x0136: PHI (r17v1 com.google.firebase.firestore.model.DocumentSet) = 
  (r17v0 com.google.firebase.firestore.model.DocumentSet)
  (r17v0 com.google.firebase.firestore.model.DocumentSet)
  (r17v5 com.google.firebase.firestore.model.DocumentSet)
  (r17v5 com.google.firebase.firestore.model.DocumentSet)
 binds: [B:67:0x0123, B:68:0x0125, B:60:0x0106, B:51:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    public DocumentChanges computeDocChanges(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap, DocumentChanges documentChanges) {
        DocumentSet documentSet;
        boolean z10;
        ImmutableSortedSet<DocumentKey> immutableSortedSetRemove;
        DocumentViewChangeSet documentViewChangeSet = documentChanges != null ? documentChanges.changeSet : new DocumentViewChangeSet();
        DocumentSet documentSet2 = documentChanges != null ? documentChanges.documentSet : this.documentSet;
        ImmutableSortedSet<DocumentKey> immutableSortedSetRemove2 = documentChanges != null ? documentChanges.mutatedKeys : this.mutatedKeys;
        Document lastDocument = (this.query.getLimitType().equals(Query.LimitType.LIMIT_TO_FIRST) && ((long) documentSet2.size()) == this.query.getLimit()) ? documentSet2.getLastDocument() : null;
        Document firstDocument = (this.query.getLimitType().equals(Query.LimitType.LIMIT_TO_LAST) && ((long) documentSet2.size()) == this.query.getLimit()) ? documentSet2.getFirstDocument() : null;
        DocumentSet documentSetRemove = documentSet2;
        boolean z11 = false;
        for (Map.Entry<DocumentKey, Document> entry : immutableSortedMap) {
            DocumentKey key = entry.getKey();
            Document document = documentSet2.getDocument(key);
            Document value = this.query.matches(entry.getValue()) ? entry.getValue() : null;
            boolean z12 = document != null && this.mutatedKeys.contains(document.getKey());
            boolean z13 = value != null && (value.hasLocalMutations() || (this.mutatedKeys.contains(value.getKey()) && value.hasCommittedMutations()));
            if (document == null || value == null) {
                documentSet = documentSet2;
                if (document == null && value != null) {
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.ADDED, value));
                } else if (document == null || value != null) {
                    z10 = false;
                } else {
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.REMOVED, document));
                    if (lastDocument != null || firstDocument != null) {
                        z11 = true;
                    }
                }
                z10 = true;
            } else {
                documentSet = documentSet2;
                if (document.getData().equals(value.getData())) {
                    if (z12 != z13) {
                        documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.METADATA, value));
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (shouldWaitForSyncedDocument(document, value)) {
                    z10 = false;
                } else {
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.MODIFIED, value));
                    if ((lastDocument != null && this.query.comparator().compare(value, lastDocument) > 0) || (firstDocument != null && this.query.comparator().compare(value, firstDocument) < 0)) {
                        z11 = true;
                    }
                    z10 = true;
                }
            }
            if (z10) {
                if (value != null) {
                    documentSetRemove = documentSetRemove.add(value);
                    immutableSortedSetRemove = value.hasLocalMutations() ? immutableSortedSetRemove2.insert(value.getKey()) : immutableSortedSetRemove2.remove(value.getKey());
                } else {
                    documentSetRemove = documentSetRemove.remove(key);
                    immutableSortedSetRemove = immutableSortedSetRemove2.remove(key);
                }
                immutableSortedSetRemove2 = immutableSortedSetRemove;
            }
            documentSet2 = documentSet;
        }
        if (this.query.hasLimit()) {
            long size = documentSetRemove.size();
            long limit = this.query.getLimit();
            while (true) {
                size -= limit;
                if (size <= 0) {
                    break;
                }
                Document lastDocument2 = this.query.getLimitType().equals(Query.LimitType.LIMIT_TO_FIRST) ? documentSetRemove.getLastDocument() : documentSetRemove.getFirstDocument();
                documentSetRemove = documentSetRemove.remove(lastDocument2.getKey());
                immutableSortedSetRemove2 = immutableSortedSetRemove2.remove(lastDocument2.getKey());
                documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.REMOVED, lastDocument2));
                limit = 1;
            }
        }
        ImmutableSortedSet<DocumentKey> immutableSortedSet = immutableSortedSetRemove2;
        DocumentSet documentSet3 = documentSetRemove;
        Assert.hardAssert(!z11 || documentChanges == null, "View was refilled using docs that themselves needed refilling.", new Object[0]);
        return new DocumentChanges(documentSet3, documentViewChangeSet, immutableSortedSet, z11, null);
    }

    public ViewChange applyChanges(DocumentChanges documentChanges, TargetChange targetChange, boolean z10) {
        ViewSnapshot viewSnapshot;
        Assert.hardAssert(!documentChanges.needsRefill, "Cannot apply changes that need a refill", new Object[0]);
        DocumentSet documentSet = this.documentSet;
        this.documentSet = documentChanges.documentSet;
        this.mutatedKeys = documentChanges.mutatedKeys;
        List<DocumentViewChange> changes = documentChanges.changeSet.getChanges();
        Collections.sort(changes, new z(this, 1));
        applyTargetChange(targetChange);
        List<LimboDocumentChange> listEmptyList = z10 ? Collections.emptyList() : updateLimboDocuments();
        ViewSnapshot.SyncState syncState = (this.limboDocuments.size() == 0 && this.current && !z10) ? ViewSnapshot.SyncState.SYNCED : ViewSnapshot.SyncState.LOCAL;
        boolean z11 = syncState != this.syncState;
        this.syncState = syncState;
        if (changes.size() != 0 || z11) {
            viewSnapshot = new ViewSnapshot(this.query, documentChanges.documentSet, documentSet, changes, syncState == ViewSnapshot.SyncState.LOCAL, documentChanges.mutatedKeys, z11, false, (targetChange == null || targetChange.getResumeToken().isEmpty()) ? false : true);
        } else {
            viewSnapshot = null;
        }
        return new ViewChange(viewSnapshot, listEmptyList);
    }
}
