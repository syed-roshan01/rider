package u1;

import android.view.View;
import android.view.ViewGroup;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f15392a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    public static final x3 a(a aVar, m0.u uVar, u0.b bVar) {
        w wVar;
        m0.x xVar;
        x3 x3Var;
        if (b2.f15031a.compareAndSet(false, true)) {
            o9.c cVarA = z6.a.a(1, null, 6);
            z6.a.Q(d7.a.b((u8.j) e1.f15072t.getValue()), null, 0, new a2(cVarA, null), 3);
            h1.b bVar2 = new h1.b(cVarA, 8);
            synchronized (w0.p.f16109b) {
                w0.p.f16115h = r8.p.Q0(w0.p.f16115h, bVar2);
            }
            w0.p.e(w0.o.f16105b);
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof w) {
                wVar = (w) childAt;
            }
            if (wVar == null) {
                wVar = new w(aVar.getContext(), uVar.g());
                aVar.addView(wVar.getView(), f15392a);
            }
            t1.w1 w1Var = new t1.w1(wVar.getRoot());
            Object obj = m0.y.f11761a;
            xVar = new m0.x(uVar, w1Var);
            Object tag = wVar.getView().getTag(R.id.wrapped_composition_tag);
            x3Var = tag instanceof x3 ? (x3) tag : null;
            if (x3Var == null) {
                x3Var = new x3(wVar, xVar);
                wVar.getView().setTag(R.id.wrapped_composition_tag, x3Var);
            }
            x3Var.e(bVar);
            return x3Var;
        }
        aVar.removeAllViews();
        wVar = null;
        if (wVar == null) {
            wVar = new w(aVar.getContext(), uVar.g());
            aVar.addView(wVar.getView(), f15392a);
        }
        t1.w1 w1Var2 = new t1.w1(wVar.getRoot());
        Object obj2 = m0.y.f11761a;
        xVar = new m0.x(uVar, w1Var2);
        Object tag2 = wVar.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof x3) {
        }
        if (x3Var == null) {
            x3Var = new x3(wVar, xVar);
            wVar.getView().setTag(R.id.wrapped_composition_tag, x3Var);
        }
        x3Var.e(bVar);
        return x3Var;
    }
}
