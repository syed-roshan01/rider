package f4;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f6215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f6216b;

    /* JADX WARN: Code duplicated, block: B:101:0x0217  */
    /* JADX WARN: Code duplicated, block: B:102:0x0223  */
    /* JADX WARN: Code duplicated, block: B:106:0x0237  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e3 A[EDGE_INSN: B:135:0x01e3->B:89:0x01e3 BREAK  A[LOOP:1: B:19:0x0087->B:88:0x01da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:48:0x010c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0151  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:99:0x0209  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        q qVar;
        int i10;
        i3.a0 a0Var;
        i3.a0 a0Var2;
        q.f fVar;
        q.f fVar2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        q.f fVarP;
        int i14;
        Animator animator;
        o oVar;
        View view;
        x xVar;
        x xVar2;
        int i15;
        i3.a0 a0Var3;
        int i16;
        View view2;
        x xVar3;
        q.f fVar3;
        int i17;
        int i18;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i19;
        View view5;
        View view6;
        q.l lVar;
        int iG;
        int i20;
        View view7;
        i3.a0 a0Var4;
        Iterator it;
        ViewGroup viewGroup = this.f6216b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = t.f6218b;
        ViewGroup viewGroup2 = this.f6216b;
        int i21 = 1;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        q.f fVarA = t.a();
        ArrayList arrayList3 = (ArrayList) fVarA.get(viewGroup2);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            qVar = this.f6215a;
            arrayList3.add(qVar);
            qVar.a(new g(i21, this, fVarA));
            i10 = 0;
            qVar.i(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).y(viewGroup2);
                }
            }
            qVar.f6206r = new ArrayList();
            qVar.f6207s = new ArrayList();
            a0Var = qVar.f6202n;
            a0Var2 = qVar.f6203o;
            fVar = new q.f((q.f) a0Var.f7941a);
            fVar2 = new q.f((q.f) a0Var2.f7941a);
            i11 = 0;
            while (true) {
                iArr = qVar.f6205q;
                if (i11 < iArr.length) {
                    break;
                }
                i15 = iArr[i11];
                if (i15 != i21) {
                    a0Var3 = a0Var2;
                    for (i16 = fVar.f13045c - 1; i16 >= 0; i16--) {
                        view2 = (View) fVar.f(i16);
                        if (view2 == null && qVar.t(view2) && (xVar3 = (x) fVar2.remove(view2)) != null && qVar.t(xVar3.f6224b)) {
                            qVar.f6206r.add((x) fVar.h(i16));
                            qVar.f6207s.add(xVar3);
                        }
                    }
                } else if (i15 != 2) {
                    a0Var3 = a0Var2;
                    fVar3 = (q.f) a0Var.f7944d;
                    q.f fVar4 = (q.f) a0Var3.f7944d;
                    i17 = fVar3.f13045c;
                    for (i18 = 0; i18 < i17; i18++) {
                        view3 = (View) fVar3.j(i18);
                        if (view3 == null && qVar.t(view3) && (view4 = (View) fVar4.get(fVar3.f(i18))) != null && qVar.t(view4)) {
                            x xVar4 = (x) fVar.get(view3);
                            x xVar5 = (x) fVar2.get(view4);
                            if (xVar4 != null && xVar5 != null) {
                                qVar.f6206r.add(xVar4);
                                qVar.f6207s.add(xVar5);
                                fVar.remove(view3);
                                fVar2.remove(view4);
                            }
                        }
                    }
                } else if (i15 != 3) {
                    if (i15 == 4) {
                        lVar = (q.l) a0Var.f7943c;
                        q.l lVar2 = (q.l) a0Var2.f7943c;
                        iG = lVar.g();
                        i20 = i10;
                        while (i20 < iG) {
                            view7 = (View) lVar.h(i20);
                            if (view7 == null && qVar.t(view7)) {
                                a0Var4 = a0Var2;
                                View view8 = (View) lVar2.c(lVar.e(i20));
                                if (view8 != null && qVar.t(view8)) {
                                    x xVar6 = (x) fVar.get(view7);
                                    x xVar7 = (x) fVar2.get(view8);
                                    if (xVar6 != null && xVar7 != null) {
                                        qVar.f6206r.add(xVar6);
                                        qVar.f6207s.add(xVar7);
                                        fVar.remove(view7);
                                        fVar2.remove(view8);
                                    }
                                }
                            } else {
                                a0Var4 = a0Var2;
                            }
                            i20++;
                            a0Var2 = a0Var4;
                        }
                    }
                    a0Var3 = a0Var2;
                } else {
                    sparseArray = (SparseArray) a0Var.f7942b;
                    a0Var3 = a0Var2;
                    SparseArray sparseArray2 = (SparseArray) a0Var3.f7942b;
                    size = sparseArray.size();
                    for (i19 = 0; i19 < size; i19++) {
                        view5 = (View) sparseArray.valueAt(i19);
                        if (view5 == null && qVar.t(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i19))) != null && qVar.t(view6)) {
                            x xVar8 = (x) fVar.get(view5);
                            x xVar9 = (x) fVar2.get(view6);
                            if (xVar8 != null && xVar9 != null) {
                                qVar.f6206r.add(xVar8);
                                qVar.f6207s.add(xVar9);
                                fVar.remove(view5);
                                fVar2.remove(view6);
                            }
                        }
                    }
                }
                i11++;
                a0Var2 = a0Var3;
                i10 = 0;
                i21 = 1;
            }
            for (i12 = 0; i12 < fVar.f13045c; i12++) {
                xVar2 = (x) fVar.j(i12);
                if (qVar.t(xVar2.f6224b)) {
                    qVar.f6206r.add(xVar2);
                    qVar.f6207s.add(null);
                }
            }
            for (i13 = 0; i13 < fVar2.f13045c; i13++) {
                xVar = (x) fVar2.j(i13);
                if (qVar.t(xVar.f6224b)) {
                    qVar.f6207s.add(xVar);
                    qVar.f6206r.add(null);
                }
            }
            fVarP = q.p();
            int i22 = fVarP.f13045c;
            d0 d0Var = z.f6227a;
            WindowId windowId = viewGroup2.getWindowId();
            for (i14 = i22 - 1; i14 >= 0; i14--) {
                animator = (Animator) fVarP.f(i14);
                if (animator == null && (oVar = (o) fVarP.get(animator)) != null && (view = oVar.f6191a) != null) {
                    j0 j0Var = oVar.f6194d;
                    if ((j0Var instanceof i0) && ((i0) j0Var).f6178a.equals(windowId)) {
                        x xVarR = qVar.r(view, true);
                        x xVarO = qVar.o(view, true);
                        if (xVarR == null && xVarO == null) {
                            xVarO = (x) ((q.f) qVar.f6203o.f7941a).get(view);
                        }
                        if ((xVarR != null || xVarO != null) && oVar.f6195e.s(oVar.f6193c, xVarO)) {
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                fVarP.remove(animator);
                            }
                        }
                    }
                }
            }
            qVar.m(viewGroup2, qVar.f6202n, qVar.f6203o, qVar.f6206r, qVar.f6207s);
            qVar.z();
            return true;
        }
        arrayList3 = new ArrayList();
        fVarA.put(viewGroup2, arrayList3);
        qVar = this.f6215a;
        arrayList3.add(qVar);
        qVar.a(new g(i21, this, fVarA));
        i10 = 0;
        qVar.i(viewGroup2, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((q) it.next()).y(viewGroup2);
            }
        }
        qVar.f6206r = new ArrayList();
        qVar.f6207s = new ArrayList();
        a0Var = qVar.f6202n;
        a0Var2 = qVar.f6203o;
        fVar = new q.f((q.f) a0Var.f7941a);
        fVar2 = new q.f((q.f) a0Var2.f7941a);
        i11 = 0;
        while (true) {
            iArr = qVar.f6205q;
            if (i11 < iArr.length) {
                break;
                break;
            }
            i15 = iArr[i11];
            if (i15 != i21) {
                a0Var3 = a0Var2;
                while (i16 >= 0) {
                    view2 = (View) fVar.f(i16);
                    if (view2 == null) {
                    }
                }
            } else if (i15 != 2) {
                a0Var3 = a0Var2;
                fVar3 = (q.f) a0Var.f7944d;
                q.f fVar5 = (q.f) a0Var3.f7944d;
                i17 = fVar3.f13045c;
                while (i18 < i17) {
                    view3 = (View) fVar3.j(i18);
                    if (view3 == null) {
                    }
                }
            } else if (i15 != 3) {
                if (i15 == 4) {
                    lVar = (q.l) a0Var.f7943c;
                    q.l lVar3 = (q.l) a0Var2.f7943c;
                    iG = lVar.g();
                    i20 = i10;
                    while (i20 < iG) {
                        view7 = (View) lVar.h(i20);
                        if (view7 == null) {
                            a0Var4 = a0Var2;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        i20++;
                        a0Var2 = a0Var4;
                    }
                }
                a0Var3 = a0Var2;
            } else {
                sparseArray = (SparseArray) a0Var.f7942b;
                a0Var3 = a0Var2;
                SparseArray sparseArray3 = (SparseArray) a0Var3.f7942b;
                size = sparseArray.size();
                while (i19 < size) {
                    view5 = (View) sparseArray.valueAt(i19);
                    if (view5 == null) {
                    }
                }
            }
            i11++;
            a0Var2 = a0Var3;
            i10 = 0;
            i21 = 1;
        }
        while (i12 < fVar.f13045c) {
            xVar2 = (x) fVar.j(i12);
            if (qVar.t(xVar2.f6224b)) {
                qVar.f6206r.add(xVar2);
                qVar.f6207s.add(null);
            }
        }
        while (i13 < fVar2.f13045c) {
            xVar = (x) fVar2.j(i13);
            if (qVar.t(xVar.f6224b)) {
                qVar.f6207s.add(xVar);
                qVar.f6206r.add(null);
            }
        }
        fVarP = q.p();
        int i23 = fVarP.f13045c;
        d0 d0Var2 = z.f6227a;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i14 >= 0) {
            animator = (Animator) fVarP.f(i14);
            if (animator == null) {
            }
        }
        qVar.m(viewGroup2, qVar.f6202n, qVar.f6203o, qVar.f6206r, qVar.f6207s);
        qVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f6216b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = t.f6218b;
        ViewGroup viewGroup2 = this.f6216b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) t.a().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((q) it.next()).y(viewGroup2);
            }
        }
        this.f6215a.j(true);
    }
}
