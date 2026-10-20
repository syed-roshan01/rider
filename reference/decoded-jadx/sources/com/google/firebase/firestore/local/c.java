package com.google.firebase.firestore.local;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3751b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f3750a = i10;
        this.f3751b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3750a;
        Object obj = this.f3751b;
        switch (i10) {
            case 0:
                ((IndexBackfiller.Scheduler) obj).lambda$scheduleBackfill$0();
                break;
            case 1:
                ((LruGarbageCollector.GCScheduler) obj).lambda$scheduleGC$0();
                break;
            default:
                ((SQLiteOverlayMigrationManager) obj).lambda$buildOverlays$0();
                break;
        }
    }
}
