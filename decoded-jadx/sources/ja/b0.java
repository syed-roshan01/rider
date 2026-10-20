package ja;

import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f8512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b0 f8513g;

    public b0() {
        this.f8507a = new byte[8192];
        this.f8511e = true;
        this.f8510d = false;
    }

    public final b0 a() {
        b0 b0Var = this.f8512f;
        if (b0Var == this) {
            b0Var = null;
        }
        b0 b0Var2 = this.f8513g;
        d7.a.j(b0Var2);
        b0Var2.f8512f = this.f8512f;
        b0 b0Var3 = this.f8512f;
        d7.a.j(b0Var3);
        b0Var3.f8513g = this.f8513g;
        this.f8512f = null;
        this.f8513g = null;
        return b0Var;
    }

    public final void b(b0 b0Var) {
        b0Var.f8513g = this;
        b0Var.f8512f = this.f8512f;
        b0 b0Var2 = this.f8512f;
        d7.a.j(b0Var2);
        b0Var2.f8513g = b0Var;
        this.f8512f = b0Var;
    }

    public final b0 c() {
        this.f8510d = true;
        return new b0(this.f8507a, this.f8508b, this.f8509c, true);
    }

    public final void d(b0 b0Var, int i10) {
        if (!b0Var.f8511e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = b0Var.f8509c;
        int i12 = i11 + i10;
        byte[] bArr = b0Var.f8507a;
        if (i12 > 8192) {
            if (b0Var.f8510d) {
                throw new IllegalArgumentException();
            }
            int i13 = b0Var.f8508b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            b9.b.I(bArr, 0, bArr, i13, i11);
            b0Var.f8509c -= b0Var.f8508b;
            b0Var.f8508b = 0;
        }
        int i14 = b0Var.f8509c;
        int i15 = this.f8508b;
        b9.b.I(this.f8507a, i14, bArr, i15, i15 + i10);
        b0Var.f8509c += i10;
        this.f8508b += i10;
    }

    public b0(byte[] bArr, int i10, int i11, boolean z10) {
        d7.a.m(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f8507a = bArr;
        this.f8508b = i10;
        this.f8509c = i11;
        this.f8510d = z10;
        this.f8511e = false;
    }
}
