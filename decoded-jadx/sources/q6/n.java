package q6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f13214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient boolean f13215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object f13216c;

    public n(m mVar) {
        mVar.getClass();
        this.f13214a = mVar;
    }

    @Override // q6.m
    public final Object get() {
        if (!this.f13215b) {
            synchronized (this) {
                try {
                    if (!this.f13215b) {
                        Object obj = this.f13214a.get();
                        this.f13216c = obj;
                        this.f13215b = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13216c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f13215b) {
            obj = "<supplier that returned " + this.f13216c + ">";
        } else {
            obj = this.f13214a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
