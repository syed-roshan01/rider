package g2;

import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f6565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f6566b;

    public h0(b0 b0Var, v vVar) {
        this.f6565a = b0Var;
        this.f6566b = vVar;
    }

    public final void a(a0 a0Var, a0 a0Var2) {
        if (d7.a.d((h0) this.f6565a.f6513b.get(), this)) {
            e0 e0Var = (e0) this.f6566b;
            long j10 = e0Var.f6550g.f6510b;
            long j11 = a0Var2.f6510b;
            boolean zA = a2.b0.a(j10, j11);
            a2.b0 b0Var = a0Var2.f6511c;
            boolean z10 = (zA && d7.a.d(e0Var.f6550g.f6511c, b0Var)) ? false : true;
            e0Var.f6550g = a0Var2;
            ArrayList arrayList = e0Var.f6552i;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                w wVar = (w) ((WeakReference) arrayList.get(i10)).get();
                if (wVar != null) {
                    wVar.f6601d = a0Var2;
                }
            }
            e eVar = e0Var.f6555l;
            eVar.f6535i = null;
            eVar.f6537k = null;
            eVar.f6536j = null;
            eVar.f6538l = d.f6519b;
            eVar.f6539m = null;
            eVar.f6540n = null;
            boolean zD = d7.a.d(a0Var, a0Var2);
            p pVar = e0Var.f6545b;
            if (zD) {
                if (z10) {
                    int iE = a2.b0.e(j11);
                    int iD = a2.b0.d(j11);
                    a2.b0 b0Var2 = e0Var.f6550g.f6511c;
                    int iE2 = b0Var2 != null ? a2.b0.e(b0Var2.f905a) : -1;
                    a2.b0 b0Var3 = e0Var.f6550g.f6511c;
                    q qVar = (q) pVar;
                    ((InputMethodManager) qVar.f6590b.getValue()).updateSelection(qVar.f6589a, iE, iD, iE2, b0Var3 != null ? a2.b0.d(b0Var3.f905a) : -1);
                    return;
                }
                return;
            }
            if (a0Var != null && (!d7.a.d(a0Var.f6509a.f918a, a0Var2.f6509a.f918a) || (a2.b0.a(a0Var.f6510b, j11) && !d7.a.d(a0Var.f6511c, b0Var)))) {
                q qVar2 = (q) pVar;
                ((InputMethodManager) qVar2.f6590b.getValue()).restartInput(qVar2.f6589a);
                return;
            }
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                w wVar2 = (w) ((WeakReference) arrayList.get(i11)).get();
                if (wVar2 != null) {
                    a0 a0Var3 = e0Var.f6550g;
                    if (wVar2.f6605h) {
                        wVar2.f6601d = a0Var3;
                        if (wVar2.f6603f) {
                            q qVar3 = (q) pVar;
                            ((InputMethodManager) qVar3.f6590b.getValue()).updateExtractedText(qVar3.f6589a, wVar2.f6602e, i1.b.L(a0Var3));
                        }
                        a2.b0 b0Var4 = a0Var3.f6511c;
                        int iE3 = b0Var4 != null ? a2.b0.e(b0Var4.f905a) : -1;
                        a2.b0 b0Var5 = a0Var3.f6511c;
                        int iD2 = b0Var5 != null ? a2.b0.d(b0Var5.f905a) : -1;
                        long j12 = a0Var3.f6510b;
                        q qVar4 = (q) pVar;
                        ((InputMethodManager) qVar4.f6590b.getValue()).updateSelection(qVar4.f6589a, a2.b0.e(j12), a2.b0.d(j12), iE3, iD2);
                    }
                }
            }
        }
    }
}
