package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class SQLiteMutationQueue implements MutationQueue {
    private static final int BLOB_MAX_INLINE_LENGTH = 1000000;
    private final SQLitePersistence db;
    private final IndexManager indexManager;
    private com.google.protobuf.n lastStreamToken;
    private int nextBatchId;
    private final LocalSerializer serializer;
    private final String uid;

    public static class BlobAccumulator implements Consumer<Cursor> {
        private final ArrayList<com.google.protobuf.n> chunks = new ArrayList<>();
        private boolean more = true;

        public BlobAccumulator(byte[] bArr) {
            addChunk(bArr);
        }

        private void addChunk(byte[] bArr) {
            com.google.protobuf.m mVar = com.google.protobuf.n.f4181b;
            this.chunks.add(com.google.protobuf.n.o(bArr, 0, bArr.length));
        }

        public int numChunks() {
            return this.chunks.size();
        }

        public com.google.protobuf.n result() {
            int size;
            ArrayList<com.google.protobuf.n> arrayList = this.chunks;
            com.google.protobuf.m mVar = com.google.protobuf.n.f4181b;
            if (arrayList instanceof Collection) {
                size = arrayList.size();
            } else {
                Iterator<T> it = arrayList.iterator();
                size = 0;
                while (it.hasNext()) {
                    it.next();
                    size++;
                }
            }
            return size == 0 ? com.google.protobuf.n.f4181b : com.google.protobuf.n.g(arrayList.iterator(), size);
        }

        @Override // com.google.firebase.firestore.util.Consumer
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            addChunk(blob);
            if (blob.length < SQLiteMutationQueue.BLOB_MAX_INLINE_LENGTH) {
                this.more = false;
            }
        }
    }

    public SQLiteMutationQueue(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer, User user, IndexManager indexManager) {
        this.db = sQLitePersistence;
        this.serializer = localSerializer;
        this.uid = user.isAuthenticated() ? user.getUid() : "";
        this.lastStreamToken = WriteStream.EMPTY_STREAM_TOKEN;
        this.indexManager = indexManager;
    }

    private MutationBatch decodeInlineMutationBatch(int i10, byte[] bArr) {
        try {
            if (bArr.length < BLOB_MAX_INLINE_LENGTH) {
                return this.serializer.decodeMutationBatch(WriteBatch.parseFrom(bArr));
            }
            BlobAccumulator blobAccumulator = new BlobAccumulator(bArr);
            while (blobAccumulator.more) {
                this.db.query("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").binding(Integer.valueOf((blobAccumulator.numChunks() * BLOB_MAX_INLINE_LENGTH) + 1), Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, Integer.valueOf(i10)).first(blobAccumulator);
            }
            return this.serializer.decodeMutationBatch(WriteBatch.parseFrom(blobAccumulator.result()));
        } catch (a1 e4) {
            throw Assert.fail("MutationBatch failed to parse: %s", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatches$6(List list, Cursor cursor) {
        list.add(decodeInlineMutationBatch(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatchesAffectingDocumentKey$7(List list, Cursor cursor) {
        list.add(decodeInlineMutationBatch(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatchesAffectingDocumentKeys$8(Set set, List list, Cursor cursor) {
        int i10 = cursor.getInt(0);
        if (set.contains(Integer.valueOf(i10))) {
            return;
        }
        set.add(Integer.valueOf(i10));
        list.add(decodeInlineMutationBatch(i10, cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getAllMutationBatchesAffectingDocumentKeys$9(MutationBatch mutationBatch, MutationBatch mutationBatch2) {
        return Util.compareIntegers(mutationBatch.getBatchId(), mutationBatch2.getBatchId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatchesAffectingQuery$10(List list, int i10, Cursor cursor) {
        int i11 = cursor.getInt(0);
        int size = list.size();
        if ((size <= 0 || i11 != ((MutationBatch) list.get(size - 1)).getBatchId()) && EncodedPath.decodeResourcePath(cursor.getString(1)).length() == i10) {
            list.add(decodeInlineMutationBatch(i11, cursor.getBlob(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getHighestUnacknowledgedBatchId$5(Cursor cursor) {
        return Integer.valueOf(cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MutationBatch lambda$getNextMutationBatchAfterBatchId$4(Cursor cursor) {
        return decodeInlineMutationBatch(cursor.getInt(0), cursor.getBlob(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadNextBatchIdAcrossAllUsers$1(List list, Cursor cursor) {
        list.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNextBatchIdAcrossAllUsers$2(Cursor cursor) {
        this.nextBatchId = Math.max(this.nextBatchId, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MutationBatch lambda$lookupMutationBatch$3(int i10, Cursor cursor) {
        return decodeInlineMutationBatch(i10, cursor.getBlob(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$performConsistencyCheck$11(List list, Cursor cursor) {
        list.add(EncodedPath.decodeResourcePath(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$start$0(Cursor cursor) {
        byte[] blob = cursor.getBlob(0);
        com.google.protobuf.m mVar = com.google.protobuf.n.f4181b;
        this.lastStreamToken = com.google.protobuf.n.o(blob, 0, blob.length);
    }

    private void loadNextBatchIdAcrossAllUsers() {
        ArrayList arrayList = new ArrayList();
        this.db.query("SELECT uid FROM mutation_queues").forEach(new s(1, arrayList));
        int i10 = 0;
        this.nextBatchId = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.db.query("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").binding((String) it.next()).forEach(new z(this, i10));
        }
        this.nextBatchId++;
    }

    private void writeMutationQueueMetadata() {
        this.db.execute("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.uid, -1, this.lastStreamToken.z());
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void acknowledgeBatch(MutationBatch mutationBatch, com.google.protobuf.n nVar) {
        this.lastStreamToken = (com.google.protobuf.n) Preconditions.checkNotNull(nVar);
        writeMutationQueueMetadata();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public MutationBatch addMutationBatch(Timestamp timestamp, List<Mutation> list, List<Mutation> list2) {
        int i10 = this.nextBatchId;
        this.nextBatchId = i10 + 1;
        MutationBatch mutationBatch = new MutationBatch(i10, timestamp, list, list2);
        this.db.execute("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.uid, Integer.valueOf(i10), this.serializer.encodeMutationBatch(mutationBatch).toByteArray());
        HashSet hashSet = new HashSet();
        SQLiteStatement sQLiteStatementPrepare = this.db.prepare("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator<Mutation> it = list2.iterator();
        while (it.hasNext()) {
            DocumentKey key = it.next().getKey();
            if (hashSet.add(key)) {
                this.db.execute(sQLiteStatementPrepare, this.uid, EncodedPath.encode(key.getPath()), Integer.valueOf(i10));
                this.indexManager.addToCollectionParentIndex(key.getCollectionPath());
            }
        }
        return mutationBatch;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public List<MutationBatch> getAllMutationBatches() {
        ArrayList arrayList = new ArrayList();
        this.db.query("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid).forEach(new a0(this, arrayList, 0));
        return arrayList;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public List<MutationBatch> getAllMutationBatchesAffectingDocumentKey(DocumentKey documentKey) {
        String strEncode = EncodedPath.encode(documentKey.getPath());
        ArrayList arrayList = new ArrayList();
        this.db.query("SELECT m.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path = ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, strEncode).forEach(new a0(this, arrayList, 1));
        return arrayList;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public List<MutationBatch> getAllMutationBatchesAffectingDocumentKeys(Iterable<DocumentKey> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<DocumentKey> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(EncodedPath.encode(it.next().getPath()));
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.db, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int i10 = 1;
            if (!longQuery.hasMoreSubqueries()) {
                break;
            }
            longQuery.performNextSubquery().forEach(new u(this, hashSet, arrayList2, i10));
        }
        if (longQuery.getSubqueriesPerformed() > 1) {
            Collections.sort(arrayList2, new a(4));
        }
        return arrayList2;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public List<MutationBatch> getAllMutationBatchesAffectingQuery(Query query) {
        Assert.hardAssert(!query.isCollectionGroupQuery(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ResourcePath path = query.getPath();
        final int length = path.length() + 1;
        String strEncode = EncodedPath.encode(path);
        String strPrefixSuccessor = EncodedPath.prefixSuccessor(strEncode);
        final ArrayList arrayList = new ArrayList();
        this.db.query("SELECT dm.batch_id, dm.path, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path >= ? AND dm.path < ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, strEncode, strPrefixSuccessor).forEach(new Consumer() { // from class: com.google.firebase.firestore.local.b0
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f3747a.lambda$getAllMutationBatchesAffectingQuery$10(arrayList, length, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public int getHighestUnacknowledgedBatchId() {
        return ((Integer) this.db.query("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").binding(-1, this.uid).firstValue(new w(1))).intValue();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public com.google.protobuf.n getLastStreamToken() {
        return this.lastStreamToken;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public MutationBatch getNextMutationBatchAfterBatchId(int i10) {
        return (MutationBatch) this.db.query("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, Integer.valueOf(i10 + 1)).firstValue(new o(this, 1));
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public boolean isEmpty() {
        return this.db.query("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").binding(this.uid).isEmpty();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public MutationBatch lookupMutationBatch(int i10) {
        return (MutationBatch) this.db.query("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, Integer.valueOf(i10)).firstValue(new c0(this, i10));
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void performConsistencyCheck() {
        if (isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.db.query("SELECT path FROM document_mutations WHERE uid = ?").binding(this.uid).forEach(new s(2, arrayList));
            Assert.hardAssert(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void removeMutationBatch(MutationBatch mutationBatch) {
        SQLiteStatement sQLiteStatementPrepare = this.db.prepare("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementPrepare2 = this.db.prepare("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int batchId = mutationBatch.getBatchId();
        Assert.hardAssert(this.db.execute(sQLiteStatementPrepare, this.uid, Integer.valueOf(batchId)) != 0, "Mutation batch (%s, %d) did not exist", this.uid, Integer.valueOf(mutationBatch.getBatchId()));
        Iterator<Mutation> it = mutationBatch.getMutations().iterator();
        while (it.hasNext()) {
            DocumentKey key = it.next().getKey();
            this.db.execute(sQLiteStatementPrepare2, this.uid, EncodedPath.encode(key.getPath()), Integer.valueOf(batchId));
            this.db.getReferenceDelegate().removeMutationReference(key);
        }
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void setLastStreamToken(com.google.protobuf.n nVar) {
        this.lastStreamToken = (com.google.protobuf.n) Preconditions.checkNotNull(nVar);
        writeMutationQueueMetadata();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void start() {
        loadNextBatchIdAcrossAllUsers();
        if (this.db.query("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").binding(this.uid).first(new z(this, 1)) == 0) {
            writeMutationQueueMetadata();
        }
    }
}
