package i3;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class u implements s, r7.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7993b;

    public /* synthetic */ u(String str, int i10) {
        this.f7992a = i10;
        this.f7993b = str;
    }

    @Override // i3.s
    public final Object a() {
        return this;
    }

    @Override // i3.s
    public final boolean b(CharSequence charSequence, int i10, int i11, d0 d0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f7993b)) {
            return true;
        }
        d0Var.f7952c = (d0Var.f7952c & 3) | 4;
        return false;
    }

    @Override // r7.q
    public final Object e() {
        switch (this.f7992a) {
            case 3:
                throw new p7.q(this.f7993b);
            default:
                throw new p7.q(this.f7993b);
        }
    }

    public final String toString() {
        switch (this.f7992a) {
            case 5:
                return "<" + this.f7993b + '>';
            default:
                return super.toString();
        }
    }

    public u(String str) {
        this.f7992a = 2;
        str.getClass();
        this.f7993b = str;
    }
}
