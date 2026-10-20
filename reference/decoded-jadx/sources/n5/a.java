package n5;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12228c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile p8.a f12229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f12230b;

    public static p8.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f12230b = f12228c;
        aVar.f12229a = bVar;
        return aVar;
    }

    @Override // p8.a
    public final Object get() {
        Object obj = this.f12230b;
        Object obj2 = f12228c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f12230b;
                    if (obj == obj2) {
                        obj = this.f12229a.get();
                        Object obj3 = this.f12230b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f12230b = obj;
                        this.f12229a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
