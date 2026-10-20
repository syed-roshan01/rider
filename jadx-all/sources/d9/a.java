package d9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4931b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4932c = 2;

    public a(j4.l lVar) {
        this.f4930a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4931b == aVar.f4931b && this.f4932c == aVar.f4932c && d7.a.d(this.f4930a, aVar.f4930a) && d7.a.d(j4.l.class, j4.l.class);
    }

    @Override // d9.g
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        Object obj = this.f4930a;
        return ((((((((((j4.l.class.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31) - 584535736) * 31) + 1554688608) * 31) + (this.f4931b ? 1231 : 1237)) * 31) + 2) * 31) + this.f4932c;
    }

    public final String toString() {
        v.f4953a.getClass();
        return w.a(this);
    }
}
