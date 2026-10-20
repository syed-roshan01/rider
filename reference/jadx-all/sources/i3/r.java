package i3;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f7987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2.l f7988b;

    public r(g0 g0Var, l2.l lVar) {
        this.f7987a = g0Var;
        this.f7988b = lVar;
    }

    @Override // i3.s
    public final Object a() {
        return this.f7987a;
    }

    @Override // i3.s
    public final boolean b(CharSequence charSequence, int i10, int i11, d0 d0Var) {
        if ((d0Var.f7952c & 4) > 0) {
            return true;
        }
        if (this.f7987a == null) {
            this.f7987a = new g0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        this.f7988b.getClass();
        this.f7987a.setSpan(new e0(d0Var), i10, i11, 33);
        return true;
    }
}
