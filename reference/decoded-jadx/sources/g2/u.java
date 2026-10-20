package g2;

/* JADX INFO: loaded from: classes.dex */
public final class u implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f6597a = '\u2022';

    @Override // g2.l0
    public final i0 a(a2.e eVar) {
        return new i0(new a2.e(l9.i.b1(eVar.f918a.length(), String.valueOf(this.f6597a)), null, 6), r.f6592a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f6597a == ((u) obj).f6597a;
        }
        return false;
    }

    public final int hashCode() {
        return Character.hashCode(this.f6597a);
    }
}
