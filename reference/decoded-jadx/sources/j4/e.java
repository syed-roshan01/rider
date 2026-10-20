package j4;

import s4.q;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.c f8344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f8345b;

    public e(h1.c cVar, q qVar) {
        this.f8344a = cVar;
        this.f8345b = qVar;
    }

    @Override // j4.f
    public final h1.c a() {
        return this.f8344a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d7.a.d(this.f8344a, eVar.f8344a) && d7.a.d(this.f8345b, eVar.f8345b);
    }

    public final int hashCode() {
        return this.f8345b.hashCode() + (this.f8344a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f8344a + ", result=" + this.f8345b + ')';
    }
}
