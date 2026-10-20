package g2;

/* JADX INFO: loaded from: classes.dex */
public final class y implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.e f6608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6609b;

    public y(String str, int i10) {
        this.f6608a = new a2.e(str, null, 6);
        this.f6609b = i10;
    }

    @Override // g2.i
    public final void a(k kVar) {
        int i10 = kVar.f6574d;
        boolean z10 = i10 != -1;
        a2.e eVar = this.f6608a;
        if (z10) {
            kVar.d(i10, kVar.f6575e, eVar.f918a);
            String str = eVar.f918a;
            if (str.length() > 0) {
                kVar.e(i10, str.length() + i10);
            }
        } else {
            int i11 = kVar.f6572b;
            kVar.d(i11, kVar.f6573c, eVar.f918a);
            String str2 = eVar.f918a;
            if (str2.length() > 0) {
                kVar.e(i11, str2.length() + i11);
            }
        }
        int i12 = kVar.f6572b;
        int i13 = kVar.f6573c;
        int i14 = i12 == i13 ? i13 : -1;
        int i15 = this.f6609b;
        int iR = z6.a.r(i15 > 0 ? (i14 + i15) - 1 : (i14 + i15) - eVar.f918a.length(), 0, kVar.f6571a.a());
        kVar.f(iR, iR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return d7.a.d(this.f6608a.f918a, yVar.f6608a.f918a) && this.f6609b == yVar.f6609b;
    }

    public final int hashCode() {
        return (this.f6608a.f918a.hashCode() * 31) + this.f6609b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f6608a.f918a);
        sb.append("', newCursorPosition=");
        return a7.a.o(sb, this.f6609b, ')');
    }
}
