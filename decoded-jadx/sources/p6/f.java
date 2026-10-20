package p6;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12811c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile h f12812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f12813b;

    public static h b(g gVar) {
        if (gVar instanceof f) {
            return gVar;
        }
        f fVar = new f();
        fVar.f12813b = f12811c;
        fVar.f12812a = gVar;
        return fVar;
    }

    @Override // p6.h
    public final Object a() {
        Object objA = this.f12813b;
        Object obj = f12811c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f12813b;
                    if (objA == obj) {
                        objA = this.f12812a.a();
                        Object obj2 = this.f12813b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f12813b = objA;
                        this.f12812a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return objA;
    }
}
