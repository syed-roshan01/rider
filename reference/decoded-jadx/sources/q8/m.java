package q8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c9.a f13236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13237b;

    @Override // q8.c
    public final Object getValue() {
        if (this.f13237b == k.f13234a) {
            c9.a aVar = this.f13236a;
            d7.a.j(aVar);
            this.f13237b = aVar.invoke();
            this.f13236a = null;
        }
        return this.f13237b;
    }

    public final String toString() {
        return this.f13237b != k.f13234a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
