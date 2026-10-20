package g2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f6571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6575e;

    public k(a2.e eVar, long j10) {
        String str = eVar.f918a;
        t tVar = new t();
        tVar.f6593a = str;
        tVar.f6595c = -1;
        tVar.f6596d = -1;
        this.f6571a = tVar;
        this.f6572b = a2.b0.e(j10);
        this.f6573c = a2.b0.d(j10);
        this.f6574d = -1;
        this.f6575e = -1;
        int iE = a2.b0.e(j10);
        int iD = a2.b0.d(j10);
        String str2 = eVar.f918a;
        if (iE < 0 || iE > str2.length()) {
            StringBuilder sbQ = a7.a.q("start (", iE, ") offset is outside of text region ");
            sbQ.append(str2.length());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (iD < 0 || iD > str2.length()) {
            StringBuilder sbQ2 = a7.a.q("end (", iD, ") offset is outside of text region ");
            sbQ2.append(str2.length());
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(l.q.i("Do not set reversed range: ", iE, " > ", iD));
        }
    }

    public final void a(int i10, int i11) {
        long jG = o1.s.g(i10, i11);
        this.f6571a.b(i10, i11, "");
        long jN0 = o1.s.n0(o1.s.g(this.f6572b, this.f6573c), jG);
        h(a2.b0.e(jN0));
        g(a2.b0.d(jN0));
        int i12 = this.f6574d;
        if (i12 != -1) {
            long jN1 = o1.s.n0(o1.s.g(i12, this.f6575e), jG);
            if (a2.b0.b(jN1)) {
                this.f6574d = -1;
                this.f6575e = -1;
            } else {
                this.f6574d = a2.b0.e(jN1);
                this.f6575e = a2.b0.d(jN1);
            }
        }
    }

    public final char b(int i10) {
        t tVar = this.f6571a;
        m mVar = tVar.f6594b;
        if (mVar != null && i10 >= tVar.f6595c) {
            int iA = mVar.f6578b - mVar.a();
            int i11 = tVar.f6595c;
            if (i10 >= iA + i11) {
                return tVar.f6593a.charAt(i10 - ((iA - tVar.f6596d) + i11));
            }
            int i12 = i10 - i11;
            int i13 = mVar.f6579c;
            return i12 < i13 ? ((char[]) mVar.f6581e)[i12] : ((char[]) mVar.f6581e)[(i12 - i13) + mVar.f6580d];
        }
        return tVar.f6593a.charAt(i10);
    }

    public final a2.b0 c() {
        int i10 = this.f6574d;
        if (i10 != -1) {
            return new a2.b0(o1.s.g(i10, this.f6575e));
        }
        return null;
    }

    public final void d(int i10, int i11, String str) {
        t tVar = this.f6571a;
        if (i10 < 0 || i10 > tVar.a()) {
            StringBuilder sbQ = a7.a.q("start (", i10, ") offset is outside of text region ");
            sbQ.append(tVar.a());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i11 < 0 || i11 > tVar.a()) {
            StringBuilder sbQ2 = a7.a.q("end (", i11, ") offset is outside of text region ");
            sbQ2.append(tVar.a());
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(l.q.i("Do not set reversed range: ", i10, " > ", i11));
        }
        tVar.b(i10, i11, str);
        h(str.length() + i10);
        g(str.length() + i10);
        this.f6574d = -1;
        this.f6575e = -1;
    }

    public final void e(int i10, int i11) {
        t tVar = this.f6571a;
        if (i10 < 0 || i10 > tVar.a()) {
            StringBuilder sbQ = a7.a.q("start (", i10, ") offset is outside of text region ");
            sbQ.append(tVar.a());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i11 < 0 || i11 > tVar.a()) {
            StringBuilder sbQ2 = a7.a.q("end (", i11, ") offset is outside of text region ");
            sbQ2.append(tVar.a());
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(l.q.i("Do not set reversed or empty range: ", i10, " > ", i11));
        }
        this.f6574d = i10;
        this.f6575e = i11;
    }

    public final void f(int i10, int i11) {
        t tVar = this.f6571a;
        if (i10 < 0 || i10 > tVar.a()) {
            StringBuilder sbQ = a7.a.q("start (", i10, ") offset is outside of text region ");
            sbQ.append(tVar.a());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i11 < 0 || i11 > tVar.a()) {
            StringBuilder sbQ2 = a7.a.q("end (", i11, ") offset is outside of text region ");
            sbQ2.append(tVar.a());
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(l.q.i("Do not set reversed range: ", i10, " > ", i11));
        }
        h(i10);
        g(i11);
    }

    public final void g(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.g("Cannot set selectionEnd to a negative value: ", i10).toString());
        }
        this.f6573c = i10;
    }

    public final void h(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.g("Cannot set selectionStart to a negative value: ", i10).toString());
        }
        this.f6572b = i10;
    }

    public final String toString() {
        return this.f6571a.toString();
    }
}
