package g8;

import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends d4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.c2 f6862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f6863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e8.p[] f6864e;

    public j1(e8.c2 c2Var, e8.p[] pVarArr) {
        this(c2Var, i0.f6839a, pVarArr);
    }

    @Override // g8.d4, g8.h0
    public final void f(u uVar) {
        uVar.c(this.f6862c, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        uVar.c(this.f6863d, "progress");
    }

    @Override // g8.d4, g8.h0
    public final void j(j0 j0Var) {
        y3.e.N("already started", !this.f6861b);
        this.f6861b = true;
        e8.p[] pVarArr = this.f6864e;
        int length = pVarArr.length;
        int i10 = 0;
        while (true) {
            e8.c2 c2Var = this.f6862c;
            if (i10 >= length) {
                j0Var.c(c2Var, this.f6863d, new e8.l1());
                return;
            } else {
                pVarArr[i10].j0(c2Var);
                i10++;
            }
        }
    }

    public j1(e8.c2 c2Var, i0 i0Var, e8.p[] pVarArr) {
        y3.e.G("error must not be OK", !c2Var.e());
        this.f6862c = c2Var;
        this.f6863d = i0Var;
        this.f6864e = pVarArr;
    }
}
