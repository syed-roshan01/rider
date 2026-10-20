package q8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c9.a f13230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f13231b = k.f13234a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13232c = this;

    public i(c9.a aVar) {
        this.f13230a = aVar;
    }

    @Override // q8.c
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f13231b;
        k kVar = k.f13234a;
        if (obj != kVar) {
            return obj;
        }
        synchronized (this.f13232c) {
            objInvoke = this.f13231b;
            if (objInvoke == kVar) {
                c9.a aVar = this.f13230a;
                d7.a.j(aVar);
                objInvoke = aVar.invoke();
                this.f13231b = objInvoke;
                this.f13230a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f13231b != k.f13234a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
