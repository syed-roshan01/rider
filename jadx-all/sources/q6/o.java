package q6;

import g2.j0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f13217c = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile m f13218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13219b;

    @Override // q6.m
    public final Object get() {
        m mVar = this.f13218a;
        j0 j0Var = f13217c;
        if (mVar != j0Var) {
            synchronized (this) {
                try {
                    if (this.f13218a != j0Var) {
                        Object obj = this.f13218a.get();
                        this.f13219b = obj;
                        this.f13218a = j0Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13219b;
    }

    public final String toString() {
        Object obj = this.f13218a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f13217c) {
            obj = "<supplier that returned " + this.f13219b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
