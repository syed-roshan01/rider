package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class LruGarbageCollector {
    private static final long INITIAL_GC_DELAY_MS;
    private static final long REGULAR_GC_DELAY_MS;
    private final LruDelegate delegate;
    private final Params params;

    public class GCScheduler implements Scheduler {
        private final AsyncQueue asyncQueue;
        private AsyncQueue.DelayedTask gcTask;
        private boolean hasRun = false;
        private final LocalStore localStore;

        public GCScheduler(AsyncQueue asyncQueue, LocalStore localStore) {
            this.asyncQueue = asyncQueue;
            this.localStore = localStore;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$scheduleGC$0() {
            this.localStore.collectGarbage(LruGarbageCollector.this);
            this.hasRun = true;
            scheduleGC();
        }

        private void scheduleGC() {
            this.gcTask = this.asyncQueue.enqueueAfterDelay(AsyncQueue.TimerId.GARBAGE_COLLECTION, this.hasRun ? LruGarbageCollector.REGULAR_GC_DELAY_MS : LruGarbageCollector.INITIAL_GC_DELAY_MS, new c(this, 1));
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public void start() {
            if (LruGarbageCollector.this.params.minBytesThreshold != -1) {
                scheduleGC();
            }
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public void stop() {
            AsyncQueue.DelayedTask delayedTask = this.gcTask;
            if (delayedTask != null) {
                delayedTask.cancel();
            }
        }
    }

    public static class Params {
        private static final long COLLECTION_DISABLED = -1;
        private static final long DEFAULT_CACHE_SIZE_BYTES = 104857600;
        private static final int DEFAULT_COLLECTION_PERCENTILE = 10;
        private static final int DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT = 1000;
        final int maximumSequenceNumbersToCollect;
        long minBytesThreshold;
        int percentileToCollect;

        public Params(long j10, int i10, int i11) {
            this.minBytesThreshold = j10;
            this.percentileToCollect = i10;
            this.maximumSequenceNumbersToCollect = i11;
        }

        public static Params Default() {
            return new Params(DEFAULT_CACHE_SIZE_BYTES, 10, DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT);
        }

        public static Params Disabled() {
            return new Params(-1L, 0, 0);
        }

        public static Params WithCacheSizeBytes(long j10) {
            return new Params(j10, 10, DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT);
        }
    }

    public static class Results {
        private final int documentsRemoved;
        private final boolean hasRun;
        private final int sequenceNumbersCollected;
        private final int targetsRemoved;

        public Results(boolean z10, int i10, int i11, int i12) {
            this.hasRun = z10;
            this.sequenceNumbersCollected = i10;
            this.targetsRemoved = i11;
            this.documentsRemoved = i12;
        }

        public static Results DidNotRun() {
            return new Results(false, 0, 0, 0);
        }

        public int getDocumentsRemoved() {
            return this.documentsRemoved;
        }

        public int getSequenceNumbersCollected() {
            return this.sequenceNumbersCollected;
        }

        public int getTargetsRemoved() {
            return this.targetsRemoved;
        }

        public boolean hasRun() {
            return this.hasRun;
        }
    }

    public static class RollingSequenceNumberBuffer {
        private static final Comparator<Long> COMPARATOR = new a(2);
        private final int maxElements;
        private final PriorityQueue<Long> queue;

        public RollingSequenceNumberBuffer(int i10) {
            this.maxElements = i10;
            this.queue = new PriorityQueue<>(i10, COMPARATOR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(Long l10, Long l11) {
            return l11.compareTo(l10);
        }

        public void addElement(Long l10) {
            if (this.queue.size() < this.maxElements) {
                this.queue.add(l10);
                return;
            }
            if (l10.longValue() < this.queue.peek().longValue()) {
                this.queue.poll();
                this.queue.add(l10);
            }
        }

        public long getMaxValue() {
            return this.queue.peek().longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        INITIAL_GC_DELAY_MS = timeUnit.toMillis(1L);
        REGULAR_GC_DELAY_MS = timeUnit.toMillis(5L);
    }

    public LruGarbageCollector(LruDelegate lruDelegate, Params params) {
        this.delegate = lruDelegate;
        this.params = params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getNthSequenceNumber$0(RollingSequenceNumberBuffer rollingSequenceNumberBuffer, TargetData targetData) {
        rollingSequenceNumberBuffer.addElement(Long.valueOf(targetData.getSequenceNumber()));
    }

    private Results runGarbageCollection(SparseArray<?> sparseArray) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iCalculateQueryCount = calculateQueryCount(this.params.percentileToCollect);
        if (iCalculateQueryCount > this.params.maximumSequenceNumbersToCollect) {
            Logger.debug("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.params.maximumSequenceNumbersToCollect + " from " + iCalculateQueryCount, new Object[0]);
            iCalculateQueryCount = this.params.maximumSequenceNumbersToCollect;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long nthSequenceNumber = getNthSequenceNumber(iCalculateQueryCount);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        int iRemoveTargets = removeTargets(nthSequenceNumber, sparseArray);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        int iRemoveOrphanedDocuments = removeOrphanedDocuments(nthSequenceNumber);
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        if (Logger.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LRU Garbage Collection:\n\tCounted targets in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(iCalculateQueryCount), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2)));
            Logger.debug("LruGarbageCollector", ((sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(iRemoveTargets), Long.valueOf(jCurrentTimeMillis4 - jCurrentTimeMillis3))) + String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(iRemoveOrphanedDocuments), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis4))) + String.format(locale, "Total Duration: %dms", Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis)), new Object[0]);
        }
        return new Results(true, iCalculateQueryCount, iRemoveTargets, iRemoveOrphanedDocuments);
    }

    public int calculateQueryCount(int i10) {
        return (int) ((i10 / 100.0f) * this.delegate.getSequenceNumberCount());
    }

    public Results collect(SparseArray<?> sparseArray) {
        if (this.params.minBytesThreshold == -1) {
            Logger.debug("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return Results.DidNotRun();
        }
        long byteSize = getByteSize();
        if (byteSize >= this.params.minBytesThreshold) {
            return runGarbageCollection(sparseArray);
        }
        Logger.debug("LruGarbageCollector", "Garbage collection skipped; Cache size " + byteSize + " is lower than threshold " + this.params.minBytesThreshold, new Object[0]);
        return Results.DidNotRun();
    }

    public long getByteSize() {
        return this.delegate.getByteSize();
    }

    public long getNthSequenceNumber(int i10) {
        if (i10 == 0) {
            return -1L;
        }
        final RollingSequenceNumberBuffer rollingSequenceNumberBuffer = new RollingSequenceNumberBuffer(i10);
        final int i11 = 0;
        this.delegate.forEachTarget(new Consumer() { // from class: com.google.firebase.firestore.local.m
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                int i12 = i11;
                LruGarbageCollector.RollingSequenceNumberBuffer rollingSequenceNumberBuffer2 = rollingSequenceNumberBuffer;
                switch (i12) {
                    case 0:
                        LruGarbageCollector.lambda$getNthSequenceNumber$0(rollingSequenceNumberBuffer2, (TargetData) obj);
                        break;
                    default:
                        rollingSequenceNumberBuffer2.addElement((Long) obj);
                        break;
                }
            }
        });
        final int i12 = 1;
        this.delegate.forEachOrphanedDocumentSequenceNumber(new Consumer() { // from class: com.google.firebase.firestore.local.m
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                int i13 = i12;
                LruGarbageCollector.RollingSequenceNumberBuffer rollingSequenceNumberBuffer2 = rollingSequenceNumberBuffer;
                switch (i13) {
                    case 0:
                        LruGarbageCollector.lambda$getNthSequenceNumber$0(rollingSequenceNumberBuffer2, (TargetData) obj);
                        break;
                    default:
                        rollingSequenceNumberBuffer2.addElement((Long) obj);
                        break;
                }
            }
        });
        return rollingSequenceNumberBuffer.getMaxValue();
    }

    public GCScheduler newScheduler(AsyncQueue asyncQueue, LocalStore localStore) {
        return new GCScheduler(asyncQueue, localStore);
    }

    public int removeOrphanedDocuments(long j10) {
        return this.delegate.removeOrphanedDocuments(j10);
    }

    public int removeTargets(long j10, SparseArray<?> sparseArray) {
        return this.delegate.removeTargets(j10, sparseArray);
    }

    public LruGarbageCollector withNewThreshold(long j10) {
        Params params = this.params;
        params.minBytesThreshold = j10;
        params.percentileToCollect = 100;
        return this;
    }
}
