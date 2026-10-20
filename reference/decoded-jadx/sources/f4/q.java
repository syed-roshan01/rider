package f4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import b3.q0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Cloneable {
    public static final int[] B = {2, 1, 3, 4};
    public static final x9.v C = new x9.v(24);
    public static final ThreadLocal D = new ThreadLocal();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f6206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f6207s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public z6.a f6214z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6196a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6197b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6198c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f6199d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6200e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f6201f = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i3.a0 f6202n = new i3.a0(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i3.a0 f6203o = new i3.a0(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f6204p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f6205q = B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f6208t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6209u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6210v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6211w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f6212x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f6213y = new ArrayList();
    public x9.v A = C;

    public static void c(i3.a0 a0Var, View view, x xVar) {
        ((q.f) a0Var.f7941a).put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) a0Var.f7942b).indexOfKey(id) >= 0) {
                ((SparseArray) a0Var.f7942b).put(id, null);
            } else {
                ((SparseArray) a0Var.f7942b).put(id, view);
            }
        }
        Field field = q0.f2670a;
        String strK = b3.h0.k(view);
        if (strK != null) {
            if (((q.f) a0Var.f7944d).containsKey(strK)) {
                ((q.f) a0Var.f7944d).put(strK, null);
            } else {
                ((q.f) a0Var.f7944d).put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (((q.l) a0Var.f7943c).d(itemIdAtPosition) < 0) {
                    b3.b0.r(view, true);
                    ((q.l) a0Var.f7943c).f(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) ((q.l) a0Var.f7943c).c(itemIdAtPosition);
                if (view2 != null) {
                    b3.b0.r(view2, false);
                    ((q.l) a0Var.f7943c).f(null, itemIdAtPosition);
                }
            }
        }
    }

    public static q.f p() {
        ThreadLocal threadLocal = D;
        q.f fVar = (q.f) threadLocal.get();
        if (fVar != null) {
            return fVar;
        }
        q.f fVar2 = new q.f();
        threadLocal.set(fVar2);
        return fVar2;
    }

    public static boolean u(x xVar, x xVar2, String str) {
        Object obj = xVar.f6223a.get(str);
        Object obj2 = xVar2.f6223a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j10) {
        this.f6198c = j10;
    }

    public void B(z6.a aVar) {
        this.f6214z = aVar;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f6199d = timeInterpolator;
    }

    public void D(x9.v vVar) {
        if (vVar == null) {
            this.A = C;
        } else {
            this.A = vVar;
        }
    }

    public void E() {
    }

    public void F(long j10) {
        this.f6197b = j10;
    }

    public final void G() {
        if (this.f6209u == 0) {
            ArrayList arrayList = this.f6212x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6212x.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p) arrayList2.get(i10)).a(this);
                }
            }
            this.f6211w = false;
        }
        this.f6209u++;
    }

    public String H(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f6198c != -1) {
            str2 = str2 + "dur(" + this.f6198c + ") ";
        }
        if (this.f6197b != -1) {
            str2 = str2 + "dly(" + this.f6197b + ") ";
        }
        if (this.f6199d != null) {
            str2 = str2 + "interp(" + this.f6199d + ") ";
        }
        ArrayList arrayList = this.f6200e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f6201f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String strJ = l.q.j(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    strJ = l.q.j(strJ, ", ");
                }
                strJ = strJ + arrayList.get(i10);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 > 0) {
                    strJ = l.q.j(strJ, ", ");
                }
                strJ = strJ + arrayList2.get(i11);
            }
        }
        return l.q.j(strJ, ")");
    }

    public void a(p pVar) {
        if (this.f6212x == null) {
            this.f6212x = new ArrayList();
        }
        this.f6212x.add(pVar);
    }

    public void b(View view) {
        this.f6201f.add(view);
    }

    public void d() {
        ArrayList arrayList = this.f6208t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f6212x;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f6212x.clone();
        int size2 = arrayList3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((p) arrayList3.get(i10)).e();
        }
    }

    public abstract void e(x xVar);

    public final void f(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x xVar = new x(view);
            if (z10) {
                h(xVar);
            } else {
                e(xVar);
            }
            xVar.f6225c.add(this);
            g(xVar);
            if (z10) {
                c(this.f6202n, view, xVar);
            } else {
                c(this.f6203o, view, xVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public void g(x xVar) {
    }

    public abstract void h(x xVar);

    public final void i(ViewGroup viewGroup, boolean z10) {
        j(z10);
        ArrayList arrayList = this.f6200e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f6201f;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                x xVar = new x(viewFindViewById);
                if (z10) {
                    h(xVar);
                } else {
                    e(xVar);
                }
                xVar.f6225c.add(this);
                g(xVar);
                if (z10) {
                    c(this.f6202n, viewFindViewById, xVar);
                } else {
                    c(this.f6203o, viewFindViewById, xVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            x xVar2 = new x(view);
            if (z10) {
                h(xVar2);
            } else {
                e(xVar2);
            }
            xVar2.f6225c.add(this);
            g(xVar2);
            if (z10) {
                c(this.f6202n, view, xVar2);
            } else {
                c(this.f6203o, view, xVar2);
            }
        }
    }

    public final void j(boolean z10) {
        if (z10) {
            ((q.f) this.f6202n.f7941a).clear();
            ((SparseArray) this.f6202n.f7942b).clear();
            ((q.l) this.f6202n.f7943c).a();
        } else {
            ((q.f) this.f6203o.f7941a).clear();
            ((SparseArray) this.f6203o.f7942b).clear();
            ((q.l) this.f6203o.f7943c).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public q clone() {
        try {
            q qVar = (q) super.clone();
            qVar.f6213y = new ArrayList();
            qVar.f6202n = new i3.a0(1);
            qVar.f6203o = new i3.a0(1);
            qVar.f6206r = null;
            qVar.f6207s = null;
            return qVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, i3.a0 a0Var, i3.a0 a0Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorL;
        int i10;
        View view;
        x xVar;
        Animator animator;
        x xVar2;
        q.f fVarP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            x xVar3 = (x) arrayList.get(i11);
            x xVar4 = (x) arrayList2.get(i11);
            if (xVar3 != null && !xVar3.f6225c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f6225c.contains(this)) {
                xVar4 = null;
            }
            if (!(xVar3 == null && xVar4 == null) && ((xVar3 == null || xVar4 == null || s(xVar3, xVar4)) && (animatorL = l(viewGroup, xVar3, xVar4)) != null)) {
                String str = this.f6196a;
                if (xVar4 != null) {
                    String[] strArrQ = q();
                    view = xVar4.f6224b;
                    if (strArrQ != null && strArrQ.length > 0) {
                        xVar2 = new x(view);
                        x xVar5 = (x) ((q.f) a0Var2.f7941a).get(view);
                        i10 = size;
                        if (xVar5 != null) {
                            int i12 = 0;
                            while (i12 < strArrQ.length) {
                                HashMap map = xVar2.f6223a;
                                String str2 = strArrQ[i12];
                                map.put(str2, xVar5.f6223a.get(str2));
                                i12++;
                                strArrQ = strArrQ;
                            }
                        }
                        int i13 = fVarP.f13045c;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= i13) {
                                animator = animatorL;
                                break;
                            }
                            o oVar = (o) fVarP.get((Animator) fVarP.f(i14));
                            if (oVar.f6193c != null && oVar.f6191a == view && oVar.f6192b.equals(str) && oVar.f6193c.equals(xVar2)) {
                                animator = null;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        i10 = size;
                        animator = animatorL;
                        xVar2 = null;
                    }
                    animatorL = animator;
                    xVar = xVar2;
                } else {
                    i10 = size;
                    view = xVar3.f6224b;
                    xVar = null;
                }
                if (animatorL != null) {
                    d0 d0Var = z.f6227a;
                    i0 i0Var = new i0(viewGroup);
                    o oVar2 = new o();
                    oVar2.f6191a = view;
                    oVar2.f6192b = str;
                    oVar2.f6193c = xVar;
                    oVar2.f6194d = i0Var;
                    oVar2.f6195e = this;
                    fVarP.put(animatorL, oVar2);
                    this.f6213y.add(animatorL);
                }
            } else {
                i10 = size;
            }
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator2 = (Animator) this.f6213y.get(sparseIntArray.keyAt(i15));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i10 = this.f6209u - 1;
        this.f6209u = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f6212x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6212x.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((p) arrayList2.get(i11)).c(this);
                }
            }
            for (int i12 = 0; i12 < ((q.l) this.f6202n.f7943c).g(); i12++) {
                View view = (View) ((q.l) this.f6202n.f7943c).h(i12);
                if (view != null) {
                    Field field = q0.f2670a;
                    b3.b0.r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((q.l) this.f6203o.f7943c).g(); i13++) {
                View view2 = (View) ((q.l) this.f6203o.f7943c).h(i13);
                if (view2 != null) {
                    Field field2 = q0.f2670a;
                    b3.b0.r(view2, false);
                }
            }
            this.f6211w = true;
        }
    }

    public final x o(View view, boolean z10) {
        v vVar = this.f6204p;
        if (vVar != null) {
            return vVar.o(view, z10);
        }
        ArrayList arrayList = z10 ? this.f6206r : this.f6207s;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            x xVar = (x) arrayList.get(i10);
            if (xVar == null) {
                return null;
            }
            if (xVar.f6224b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (x) (z10 ? this.f6207s : this.f6206r).get(i10);
        }
        return null;
    }

    public String[] q() {
        return null;
    }

    public final x r(View view, boolean z10) {
        v vVar = this.f6204p;
        if (vVar != null) {
            return vVar.r(view, z10);
        }
        return (x) ((q.f) (z10 ? this.f6202n : this.f6203o).f7941a).get(view);
    }

    public boolean s(x xVar, x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        String[] strArrQ = q();
        if (strArrQ == null) {
            Iterator it = xVar.f6223a.keySet().iterator();
            while (it.hasNext()) {
                if (u(xVar, xVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrQ) {
            if (!u(xVar, xVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f6200e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f6201f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public void v(View view) {
        if (this.f6211w) {
            return;
        }
        ArrayList arrayList = this.f6208t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f6212x;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f6212x.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((p) arrayList3.get(i10)).b();
            }
        }
        this.f6210v = true;
    }

    public void w(p pVar) {
        ArrayList arrayList = this.f6212x;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(pVar);
        if (this.f6212x.size() == 0) {
            this.f6212x = null;
        }
    }

    public void x(View view) {
        this.f6201f.remove(view);
    }

    public void y(ViewGroup viewGroup) {
        if (this.f6210v) {
            if (!this.f6211w) {
                ArrayList arrayList = this.f6208t;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f6212x;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f6212x.clone();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((p) arrayList3.get(i10)).d();
                    }
                }
            }
            this.f6210v = false;
        }
    }

    public void z() {
        G();
        q.f fVarP = p();
        for (Animator animator : this.f6213y) {
            if (fVarP.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new n(this, fVarP));
                    long j10 = this.f6198c;
                    if (j10 >= 0) {
                        animator.setDuration(j10);
                    }
                    long j11 = this.f6197b;
                    if (j11 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f6199d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new l.b(this, 1));
                    animator.start();
                }
            }
        }
        this.f6213y.clear();
        n();
    }
}
