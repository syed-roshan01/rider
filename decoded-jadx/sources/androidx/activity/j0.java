package androidx.activity;

import androidx.fragment.app.x0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1403d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(o2.a aVar, boolean z10) {
        super(z10);
        this.f1404e = aVar;
    }

    @Override // androidx.activity.y
    public final void a() {
        int i10 = this.f1403d;
        Object obj = this.f1404e;
        switch (i10) {
            case 0:
                ((c9.c) obj).invoke(this);
                break;
            default:
                x0 x0Var = (x0) obj;
                x0Var.t(true);
                if (!x0Var.f2055h.f1428a) {
                    x0Var.f2054g.b();
                } else {
                    x0Var.G();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(x0 x0Var) {
        super(false);
        this.f1404e = x0Var;
    }
}
