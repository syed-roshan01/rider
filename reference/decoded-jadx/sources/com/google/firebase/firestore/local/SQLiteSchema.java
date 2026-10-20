package com.google.firebase.firestore.local;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.a1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class SQLiteSchema {
    static final int MIGRATION_BATCH_SIZE = 100;
    static final int VERSION = 16;
    private final SQLiteDatabase db;
    private final LocalSerializer serializer;

    public SQLiteSchema(SQLiteDatabase sQLiteDatabase, LocalSerializer localSerializer) {
        this.db = sQLiteDatabase;
        this.serializer = localSerializer;
    }

    private void addPathLength() {
        if (tableContainsColumn("remote_documents", "path_length")) {
            return;
        }
        this.db.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    private void addPendingDataMigration(String str) {
        this.db.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    private void addReadTime() {
        this.db.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.db.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void addSequenceNumber() {
        if (tableContainsColumn("target_documents", "sequence_number")) {
            return;
        }
        this.db.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    private void addTargetCount() {
        if (!tableContainsColumn("target_globals", "target_count")) {
            this.db.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(this.db, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(jQueryNumEntries));
        this.db.update("target_globals", contentValues, null, null);
    }

    private void createBundleCache() {
        ifTablesDontExist(new String[]{"bundles", "named_queries"}, new g0(this, 5));
    }

    private void createDataMigrationTable() {
        ifTablesDontExist(new String[]{"data_migrations"}, new g0(this, 1));
    }

    private void createFieldIndex() {
        ifTablesDontExist(new String[]{"index_configuration", "index_state", "index_entries"}, new g0(this, 3));
    }

    private void createOverlays() {
        ifTablesDontExist(new String[]{"document_overlays"}, new g0(this, 2));
    }

    private void createV1MutationQueue() {
        ifTablesDontExist(new String[]{"mutation_queues", "mutations", "document_mutations"}, new g0(this, 6));
    }

    private void createV1RemoteDocumentCache() {
        ifTablesDontExist(new String[]{"remote_documents"}, new g0(this, 4));
    }

    private void createV1TargetCache() {
        ifTablesDontExist(new String[]{"targets", "target_globals", "target_documents"}, new g0(this, 0));
    }

    private void createV8CollectionParentsIndex() {
        ifTablesDontExist(new String[]{"collection_parents"}, new g0(this, 7));
        int i10 = 2;
        v vVar = new v(i10, new MemoryIndexManager.MemoryCollectionParentIndex(), this.db.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"));
        new SQLitePersistence.Query(this.db, "SELECT path FROM remote_documents").forEach(new x(vVar, 1));
        new SQLitePersistence.Query(this.db, "SELECT path FROM document_mutations").forEach(new x(vVar, i10));
    }

    private void dropLastLimboFreeSnapshotVersion() {
        new SQLitePersistence.Query(this.db, "SELECT target_id, target_proto FROM targets").forEach(new h0(this, 2));
    }

    private void dropV1TargetCache() {
        if (tableExists("targets")) {
            this.db.execSQL("DROP TABLE targets");
        }
        if (tableExists("target_globals")) {
            this.db.execSQL("DROP TABLE target_globals");
        }
        if (tableExists("target_documents")) {
            this.db.execSQL("DROP TABLE target_documents");
        }
    }

    private void ensurePathLength() {
        SQLitePersistence.Query queryBinding = new SQLitePersistence.Query(this.db, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").binding(Integer.valueOf(MIGRATION_BATCH_SIZE));
        SQLiteStatement sQLiteStatementCompileStatement = this.db.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            queryBinding.forEach(new v(3, zArr, sQLiteStatementCompileStatement));
        } while (zArr[0]);
    }

    private void ensureReadTime() {
        this.db.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    private void ensureSequenceNumbers() {
        Long l10 = (Long) new SQLitePersistence.Query(this.db, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").firstValue(new w(2));
        Assert.hardAssert(l10 != null, "Missing highest sequence number", new Object[0]);
        final long jLongValue = l10.longValue();
        final SQLiteStatement sQLiteStatementCompileStatement = this.db.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        SQLitePersistence.Query queryBinding = new SQLitePersistence.Query(this.db, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").binding(Integer.valueOf(MIGRATION_BATCH_SIZE));
        final boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            queryBinding.forEach(new Consumer() { // from class: com.google.firebase.firestore.local.i0
                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    SQLiteSchema.lambda$ensureSequenceNumbers$8(zArr, sQLiteStatementCompileStatement, jLongValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void ensureTargetGlobal() {
        if (DatabaseUtils.queryNumEntries(this.db, "target_globals") == 1) {
            return;
        }
        this.db.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    private boolean hasReadTime() {
        boolean zTableContainsColumn = tableContainsColumn("remote_documents", "read_time_seconds");
        boolean zTableContainsColumn2 = tableContainsColumn("remote_documents", "read_time_nanos");
        Assert.hardAssert(zTableContainsColumn == zTableContainsColumn2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return zTableContainsColumn && zTableContainsColumn2;
    }

    private void ifTablesDontExist(String[] strArr, Runnable runnable) {
        String strP = a7.a.p(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z10 = false;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            boolean zTableExists = tableExists(str);
            if (i10 == 0) {
                z10 = zTableExists;
            } else if (zTableExists != z10) {
                String strK = l.q.k("Expected all of ", strP, " to either exist or not, but ");
                throw new IllegalStateException(z10 ? strK + strArr[0] + " exists and " + str + " does not" : strK + strArr[0] + " does not exist and " + str + " does");
            }
        }
        if (z10) {
            Logger.debug("SQLiteSchema", l.q.k("Skipping migration because all of ", strP, " already exist"), new Object[0]);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createBundleCache$15() {
        this.db.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.db.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createDataMigrationTable$17() {
        this.db.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFieldIndex$5() {
        this.db.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.db.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.db.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.db.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createOverlays$16() {
        this.db.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.db.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.db.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1MutationQueue$0() {
        this.db.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.db.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.db.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1RemoteDocumentCache$4() {
        this.db.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1TargetCache$3() {
        this.db.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.db.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.db.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.db.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.db.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$10(MemoryIndexManager.MemoryCollectionParentIndex memoryCollectionParentIndex, SQLiteStatement sQLiteStatement, ResourcePath resourcePath) {
        if (memoryCollectionParentIndex.add(resourcePath)) {
            String lastSegment = resourcePath.getLastSegment();
            ResourcePath resourcePathPopLast = resourcePath.popLast();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, lastSegment);
            sQLiteStatement.bindString(2, EncodedPath.encode(resourcePathPopLast));
            sQLiteStatement.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$11(Consumer consumer, Cursor cursor) {
        consumer.accept(EncodedPath.decodeResourcePath(cursor.getString(0)).popLast());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$12(Consumer consumer, Cursor cursor) {
        consumer.accept(EncodedPath.decodeResourcePath(cursor.getString(0)).popLast());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV8CollectionParentsIndex$9() {
        this.db.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dropLastLimboFreeSnapshotVersion$6(Cursor cursor) {
        int i10 = cursor.getInt(0);
        try {
            this.db.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((Target) ((Target.Builder) Target.parseFrom(cursor.getBlob(1)).m4005toBuilder()).clearLastLimboFreeSnapshotVersion().m3997build()).toByteArray(), Integer.valueOf(i10)});
        } catch (a1 unused) {
            throw Assert.fail("Failed to decode Query data for target %s", Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensurePathLength$14(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        ResourcePath resourcePathDecodeResourcePath = EncodedPath.decodeResourcePath(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, resourcePathDecodeResourcePath.length());
        sQLiteStatement.bindString(2, string);
        Assert.hardAssert(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$ensureSequenceNumbers$7(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensureSequenceNumbers$8(boolean[] zArr, SQLiteStatement sQLiteStatement, long j10, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j10);
        Assert.hardAssert(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAcknowledgedMutations$1(String str, Cursor cursor) {
        removeMutationBatch(str, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAcknowledgedMutations$2(Cursor cursor) {
        String string = cursor.getString(0);
        new SQLitePersistence.Query(this.db, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").binding(string, Long.valueOf(cursor.getLong(1))).forEach(new v(1, this, string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$rewriteCanonicalIds$13(Cursor cursor) {
        int i10 = cursor.getInt(0);
        try {
            this.db.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{this.serializer.decodeTargetData(Target.parseFrom(cursor.getBlob(1))).getTarget().getCanonicalId(), Integer.valueOf(i10)});
        } catch (a1 unused) {
            throw Assert.fail("Failed to decode Query data for target %s", Integer.valueOf(i10));
        }
    }

    private void removeAcknowledgedMutations() {
        new SQLitePersistence.Query(this.db, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").forEach(new h0(this, 1));
    }

    private void removeMutationBatch(String str, int i10) {
        SQLiteStatement sQLiteStatementCompileStatement = this.db.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        sQLiteStatementCompileStatement.bindString(1, str);
        sQLiteStatementCompileStatement.bindLong(2, i10);
        Assert.hardAssert(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i10));
        this.db.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i10)});
    }

    private void rewriteCanonicalIds() {
        new SQLitePersistence.Query(this.db, "SELECT target_id, target_proto FROM targets").forEach(new h0(this, 0));
    }

    private boolean tableContainsColumn(String str, String str2) {
        return getTableColumns(str).indexOf(str2) != -1;
    }

    private boolean tableExists(String str) {
        return !new SQLitePersistence.Query(this.db, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").binding(str).isEmpty();
    }

    public List<String> getTableColumns(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.db.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex("name");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public void runSchemaUpgrades() {
        runSchemaUpgrades(0);
    }

    public void runSchemaUpgrades(int i10) {
        runSchemaUpgrades(i10, 16);
    }

    public void runSchemaUpgrades(int i10, int i11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 < 1 && i11 >= 1) {
            createV1MutationQueue();
            createV1TargetCache();
            createV1RemoteDocumentCache();
        }
        if (i10 < 3 && i11 >= 3 && i10 != 0) {
            dropV1TargetCache();
            createV1TargetCache();
        }
        if (i10 < 4 && i11 >= 4) {
            ensureTargetGlobal();
            addTargetCount();
        }
        if (i10 < 5 && i11 >= 5) {
            addSequenceNumber();
        }
        if (i10 < 6 && i11 >= 6) {
            removeAcknowledgedMutations();
        }
        if (i10 < 7 && i11 >= 7) {
            ensureSequenceNumbers();
        }
        if (i10 < 8 && i11 >= 8) {
            createV8CollectionParentsIndex();
        }
        if (i10 < 9 && i11 >= 9) {
            if (!hasReadTime()) {
                addReadTime();
            } else {
                dropLastLimboFreeSnapshotVersion();
            }
        }
        if (i10 == 9 && i11 >= 10) {
            dropLastLimboFreeSnapshotVersion();
        }
        if (i10 < 11 && i11 >= 11) {
            rewriteCanonicalIds();
        }
        if (i10 < 12 && i11 >= 12) {
            createBundleCache();
        }
        if (i10 < 13 && i11 >= 13) {
            addPathLength();
            ensurePathLength();
        }
        if (i10 < 14 && i11 >= 14) {
            createOverlays();
            createDataMigrationTable();
            addPendingDataMigration(Persistence.DATA_MIGRATION_BUILD_OVERLAYS);
        }
        if (i10 < 15 && i11 >= 15) {
            ensureReadTime();
        }
        if (i10 < 16 && i11 >= 16) {
            createFieldIndex();
        }
        Logger.debug("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i10), Integer.valueOf(i11), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
