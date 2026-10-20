package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.u1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f8590b;

    public /* synthetic */ c(n nVar, int i10) {
        this.f8589a = i10;
        this.f8590b = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f8589a;
        n nVar = this.f8590b;
        switch (i10) {
            case 0:
                h hVar = (h) nVar;
                if (hVar.k()) {
                    ArrayList arrayList = hVar.f8610p;
                    if (arrayList.size() > 0 && !((g) arrayList.get(0)).f8600a.B) {
                        View view = hVar.f8617w;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((g) it.next()).f8600a.e();
                            }
                        } else {
                            hVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            default:
                v vVar = (v) nVar;
                if (vVar.k()) {
                    u1 u1Var = vVar.f8695p;
                    if (!u1Var.B) {
                        View view2 = vVar.f8700u;
                        if (view2 != null && view2.isShown()) {
                            u1Var.e();
                        } else {
                            vVar.dismiss();
                        }
                    }
                }
                break;
        }
    }
}
