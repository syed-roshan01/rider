package g2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.e f6507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6508b;

    public a(a2.e eVar, int i10) {
        this.f6507a = eVar;
        this.f6508b = i10;
    }

    @Override // g2.i
    public final void a(k kVar) {
        int i10 = kVar.f6574d;
        boolean z10 = i10 != -1;
        a2.e eVar = this.f6507a;
        if (z10) {
            kVar.d(i10, kVar.f6575e, eVar.f918a);
        } else {
            kVar.d(kVar.f6572b, kVar.f6573c, eVar.f918a);
        }
        int i11 = kVar.f6572b;
        int i12 = kVar.f6573c;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f6508b;
        int iR = z6.a.r(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - eVar.f918a.length(), 0, kVar.f6571a.a());
        kVar.f(iR, iR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d7.a.d(this.f6507a.f918a, aVar.f6507a.f918a) && this.f6508b == aVar.f6508b;
    }

    public final int hashCode() {
        return (this.f6507a.f918a.hashCode() * 31) + this.f6508b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f6507a.f918a);
        sb.append("', newCursorPosition=");
        return a7.a.o(sb, this.f6508b, ')');
    }

    public a(String str, int i10) {
        this(new a2.e(str, null, 6), i10);
    }
}
