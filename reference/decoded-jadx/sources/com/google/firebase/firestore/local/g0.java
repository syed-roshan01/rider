package com.google.firebase.firestore.local;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteSchema f3779b;

    public /* synthetic */ g0(SQLiteSchema sQLiteSchema, int i10) {
        this.f3778a = i10;
        this.f3779b = sQLiteSchema;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3778a;
        SQLiteSchema sQLiteSchema = this.f3779b;
        switch (i10) {
            case 0:
                sQLiteSchema.lambda$createV1TargetCache$3();
                break;
            case 1:
                sQLiteSchema.lambda$createDataMigrationTable$17();
                break;
            case 2:
                sQLiteSchema.lambda$createOverlays$16();
                break;
            case 3:
                sQLiteSchema.lambda$createFieldIndex$5();
                break;
            case 4:
                sQLiteSchema.lambda$createV1RemoteDocumentCache$4();
                break;
            case 5:
                sQLiteSchema.lambda$createBundleCache$15();
                break;
            case 6:
                sQLiteSchema.lambda$createV1MutationQueue$0();
                break;
            default:
                sQLiteSchema.lambda$createV8CollectionParentsIndex$9();
                break;
        }
    }
}
