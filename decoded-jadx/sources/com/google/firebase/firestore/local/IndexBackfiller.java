package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class IndexBackfiller {
    private static final String LOG_TAG = "IndexBackfiller";
    private static final int MAX_DOCUMENTS_TO_PROCESS = 50;
    private final q6.m indexManagerOfCurrentUser;
    private final q6.m localDocumentsViewOfCurrentUser;
    private int maxDocumentsToProcess;
    private final Persistence persistence;
    private final Scheduler scheduler;
    private static final long INITIAL_BACKFILL_DELAY_MS = TimeUnit.SECONDS.toMillis(15);
    private static final long REGULAR_BACKFILL_DELAY_MS = TimeUnit.MINUTES.toMillis(1);

    public class Scheduler implements com.google.firebase.firestore.local.Scheduler {
        private final AsyncQueue asyncQueue;
        private AsyncQueue.DelayedTask backfillTask;

        public Scheduler(AsyncQueue asyncQueue) {
            this.asyncQueue = asyncQueue;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$scheduleBackfill$0() {
            Logger.debug(IndexBackfiller.LOG_TAG, "Documents written: %s", Integer.valueOf(IndexBackfiller.this.backfill()));
            scheduleBackfill(IndexBackfiller.REGULAR_BACKFILL_DELAY_MS);
        }

        private void scheduleBackfill(long j10) {
            this.backfillTask = this.asyncQueue.enqueueAfterDelay(AsyncQueue.TimerId.INDEX_BACKFILL, j10, new c(this, 0));
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public void start() {
            scheduleBackfill(IndexBackfiller.INITIAL_BACKFILL_DELAY_MS);
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public void stop() {
            AsyncQueue.DelayedTask delayedTask = this.backfillTask;
            if (delayedTask != null) {
                delayedTask.cancel();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IndexBackfiller(Persistence persistence, AsyncQueue asyncQueue, final LocalStore localStore) {
        Objects.requireNonNull(localStore);
        final int i10 = 0;
        final int i11 = 1;
        this(persistence, asyncQueue, new q6.m() { // from class: com.google.firebase.firestore.local.b
            @Override // q6.m
            public final Object get() {
                int i12 = i10;
                LocalStore localStore2 = localStore;
                switch (i12) {
                    case 0:
                        return localStore2.getIndexManagerForCurrentUser();
                    default:
                        return localStore2.getLocalDocumentsForCurrentUser();
                }
            }
        }, new q6.m() { // from class: com.google.firebase.firestore.local.b
            @Override // q6.m
            public final Object get() {
                int i12 = i11;
                LocalStore localStore2 = localStore;
                switch (i12) {
                    case 0:
                        return localStore2.getIndexManagerForCurrentUser();
                    default:
                        return localStore2.getLocalDocumentsForCurrentUser();
                }
            }
        });
    }

    private FieldIndex.IndexOffset getNewOffset(FieldIndex.IndexOffset indexOffset, LocalDocumentsResult localDocumentsResult) {
        Iterator<Map.Entry<DocumentKey, Document>> it = localDocumentsResult.getDocuments().iterator();
        FieldIndex.IndexOffset indexOffset2 = indexOffset;
        while (it.hasNext()) {
            FieldIndex.IndexOffset indexOffsetFromDocument = FieldIndex.IndexOffset.fromDocument(it.next().getValue());
            if (indexOffsetFromDocument.compareTo(indexOffset2) > 0) {
                indexOffset2 = indexOffsetFromDocument;
            }
        }
        return FieldIndex.IndexOffset.create(indexOffset2.getReadTime(), indexOffset2.getDocumentKey(), Math.max(localDocumentsResult.getBatchId(), indexOffset.getLargestBatchId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$backfill$0() {
        return Integer.valueOf(writeIndexEntries());
    }

    private int writeEntriesForCollectionGroup(String str, int i10) {
        IndexManager indexManager = (IndexManager) this.indexManagerOfCurrentUser.get();
        LocalDocumentsView localDocumentsView = (LocalDocumentsView) this.localDocumentsViewOfCurrentUser.get();
        FieldIndex.IndexOffset minOffset = indexManager.getMinOffset(str);
        LocalDocumentsResult nextDocuments = localDocumentsView.getNextDocuments(str, minOffset, i10);
        indexManager.updateIndexEntries(nextDocuments.getDocuments());
        FieldIndex.IndexOffset newOffset = getNewOffset(minOffset, nextDocuments);
        Logger.debug(LOG_TAG, "Updating offset: %s", newOffset);
        indexManager.updateCollectionGroup(str, newOffset);
        return nextDocuments.getDocuments().size();
    }

    private int writeIndexEntries() {
        IndexManager indexManager = (IndexManager) this.indexManagerOfCurrentUser.get();
        HashSet hashSet = new HashSet();
        int iWriteEntriesForCollectionGroup = this.maxDocumentsToProcess;
        while (iWriteEntriesForCollectionGroup > 0) {
            String nextCollectionGroupToUpdate = indexManager.getNextCollectionGroupToUpdate();
            if (nextCollectionGroupToUpdate == null || hashSet.contains(nextCollectionGroupToUpdate)) {
                break;
            }
            Logger.debug(LOG_TAG, "Processing collection: %s", nextCollectionGroupToUpdate);
            iWriteEntriesForCollectionGroup -= writeEntriesForCollectionGroup(nextCollectionGroupToUpdate, iWriteEntriesForCollectionGroup);
            hashSet.add(nextCollectionGroupToUpdate);
        }
        return this.maxDocumentsToProcess - iWriteEntriesForCollectionGroup;
    }

    public int backfill() {
        return ((Integer) this.persistence.runTransaction("Backfill Indexes", new o(this, 2))).intValue();
    }

    public Scheduler getScheduler() {
        return this.scheduler;
    }

    public void setMaxDocumentsToProcess(int i10) {
        this.maxDocumentsToProcess = i10;
    }

    public IndexBackfiller(Persistence persistence, AsyncQueue asyncQueue, q6.m mVar, q6.m mVar2) {
        this.maxDocumentsToProcess = 50;
        this.persistence = persistence;
        this.scheduler = new Scheduler(asyncQueue);
        this.indexManagerOfCurrentUser = mVar;
        this.localDocumentsViewOfCurrentUser = mVar2;
    }
}
