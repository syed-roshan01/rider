package d8;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4927c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f4928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f4929b;

    public static b a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f4929b = f4927c;
        aVar.f4928a = bVar;
        return aVar;
    }

    @Override // p8.a
    public final Object get() {
        Object obj = this.f4929b;
        Object obj2 = f4927c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f4929b;
                    if (obj == obj2) {
                        obj = this.f4928a.get();
                        Object obj3 = this.f4929b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f4929b = obj;
                        this.f4928a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
