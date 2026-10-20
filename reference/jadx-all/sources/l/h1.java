package l;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f10771b;

    public /* synthetic */ h1(o1 o1Var, int i10) {
        this.f10770a = i10;
        this.f10771b = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10770a;
        o1 o1Var = this.f10771b;
        switch (i10) {
            case 1:
                t1 t1Var = o1Var.f10868c;
                if (t1Var != null) {
                    t1Var.setListSelectionHidden(true);
                    t1Var.requestLayout();
                }
                break;
            default:
                t1 t1Var2 = o1Var.f10868c;
                if (t1Var2 != null) {
                    Field field = b3.q0.f2670a;
                    if (b3.e0.b(t1Var2) && o1Var.f10868c.getCount() > o1Var.f10868c.getChildCount() && o1Var.f10868c.getChildCount() <= Integer.MAX_VALUE) {
                        o1Var.C.setInputMethodMode(2);
                        o1Var.e();
                        break;
                    }
                }
                break;
        }
    }
}
