package a4;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1072c;

    public a1(int i10) {
        this.f1070a = i10;
        if (i10 != 1) {
            this.f1071b = new q.f();
            this.f1072c = new q.l();
        }
    }

    public final void a() {
        switch (this.f1070a) {
            case 0:
                ((q.f) this.f1071b).clear();
                ((q.l) this.f1072c).a();
                break;
            default:
                int[] iArr = (int[]) this.f1071b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f1072c = null;
                break;
        }
    }

    public final View b(int i10, int i11, int i12, int i13) {
        int iT;
        int i14;
        int iU;
        View viewO;
        c0 c0Var = (c0) ((y0) this.f1071b);
        int i15 = c0Var.f1079a;
        Object obj = c0Var.f1080b;
        switch (i15) {
            case 0:
                iT = ((e0) obj).t();
                break;
            default:
                iT = ((e0) obj).v();
                break;
        }
        c0 c0Var2 = (c0) ((y0) this.f1071b);
        int i16 = c0Var2.f1079a;
        Object obj2 = c0Var2.f1080b;
        switch (i16) {
            case 0:
                e0 e0Var = (e0) obj2;
                i14 = e0Var.f1104f;
                iU = e0Var.u();
                break;
            default:
                e0 e0Var2 = (e0) obj2;
                i14 = e0Var2.f1105g;
                iU = e0Var2.s();
                break;
        }
        int i17 = i14 - iU;
        int i18 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            c0 c0Var3 = (c0) ((y0) this.f1071b);
            int i19 = c0Var3.f1079a;
            Object obj3 = c0Var3.f1080b;
            switch (i19) {
                case 0:
                    viewO = ((e0) obj3).o(i10);
                    break;
                default:
                    viewO = ((e0) obj3).o(i10);
                    break;
            }
            int i20 = ((c0) ((y0) this.f1071b)).i(viewO);
            int iH = ((c0) ((y0) this.f1071b)).h(viewO);
            Object obj4 = this.f1072c;
            x0 x0Var = (x0) obj4;
            x0Var.f1212b = iT;
            x0Var.f1213c = i17;
            x0Var.f1214d = i20;
            x0Var.f1215e = iH;
            if (i12 != 0) {
                ((x0) obj4).f1211a = i12;
                if (((x0) obj4).a()) {
                    return viewO;
                }
            }
            if (i13 != 0) {
                Object obj5 = this.f1072c;
                ((x0) obj5).f1211a = i13;
                if (((x0) obj5).a()) {
                    view = viewO;
                }
            }
            i10 += i18;
        }
        return view;
    }

    public a1(c0 c0Var) {
        this.f1070a = 2;
        this.f1071b = c0Var;
        x0 x0Var = new x0();
        x0Var.f1211a = 0;
        this.f1072c = x0Var;
    }
}
