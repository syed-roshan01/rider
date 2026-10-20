package f4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o1;
import b3.q0;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class m extends o1 {
    @Override // androidx.fragment.app.o1
    public final void a(View view, Object obj) {
        ((q) obj).b(view);
    }

    @Override // androidx.fragment.app.o1
    public final void b(Object obj, ArrayList arrayList) {
        q qVar = (q) obj;
        if (qVar == null) {
            return;
        }
        int i10 = 0;
        if (qVar instanceof v) {
            v vVar = (v) qVar;
            int size = vVar.E.size();
            while (i10 < size) {
                b((i10 < 0 || i10 >= vVar.E.size()) ? null : (q) vVar.E.get(i10), arrayList);
                i10++;
            }
            return;
        }
        if (o1.h(qVar.f6200e) && o1.h(null) && o1.h(null) && o1.h(qVar.f6201f)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                qVar.b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.o1
    public final void c(ViewGroup viewGroup, Object obj) {
        q qVar = (q) obj;
        ArrayList arrayList = t.f6218b;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        Field field = q0.f2670a;
        if (b3.e0.c(viewGroup)) {
            arrayList.add(viewGroup);
            q qVarClone = qVar.clone();
            ArrayList arrayList2 = (ArrayList) t.a().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).v(viewGroup);
                }
            }
            if (qVarClone != null) {
                qVarClone.i(viewGroup, true);
            }
            a7.a.w(viewGroup.getTag(R.id.transition_current_scene));
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (qVarClone != null) {
                s sVar = new s();
                sVar.f6215a = qVarClone;
                sVar.f6216b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(sVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(sVar);
            }
        }
    }

    @Override // androidx.fragment.app.o1
    public final boolean e(Object obj) {
        return obj instanceof q;
    }

    @Override // androidx.fragment.app.o1
    public final Object f(Object obj) {
        if (obj != null) {
            return ((q) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o1
    public final Object i(Object obj, Object obj2, Object obj3) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        q qVar3 = (q) obj3;
        if (qVar != null && qVar2 != null) {
            v vVar = new v();
            vVar.I(qVar);
            vVar.I(qVar2);
            vVar.F = false;
            qVar = vVar;
        } else if (qVar == null) {
            qVar = qVar2 != null ? qVar2 : null;
        }
        if (qVar3 == null) {
            return qVar;
        }
        v vVar2 = new v();
        if (qVar != null) {
            vVar2.I(qVar);
        }
        vVar2.I(qVar3);
        return vVar2;
    }

    @Override // androidx.fragment.app.o1
    public final Object j(Object obj, Object obj2) {
        v vVar = new v();
        if (obj != null) {
            vVar.I((q) obj);
        }
        vVar.I((q) obj2);
        return vVar;
    }

    @Override // androidx.fragment.app.o1
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((q) obj).a(new j(view, arrayList));
    }

    @Override // androidx.fragment.app.o1
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((q) obj).a(new k(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.o1
    public final void m(View view, Object obj) {
        if (view != null) {
            o1.g(view, new Rect());
            ((q) obj).B(new i());
        }
    }

    @Override // androidx.fragment.app.o1
    public final void n(Object obj, Rect rect) {
        ((q) obj).B(new i());
    }

    @Override // androidx.fragment.app.o1
    public final void o(Object obj, x2.g gVar, y2.a aVar) {
        q qVar = (q) obj;
        gVar.b(new l.t(this, qVar, 10));
        qVar.a(new l(aVar));
    }

    @Override // androidx.fragment.app.o1
    public final void p(Object obj, View view, ArrayList arrayList) {
        v vVar = (v) obj;
        ArrayList arrayList2 = vVar.f6201f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o1.d((View) arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }

    @Override // androidx.fragment.app.o1
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        v vVar = (v) obj;
        if (vVar != null) {
            ArrayList arrayList3 = vVar.f6201f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.o1
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        vVar.I((q) obj);
        return vVar;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        q qVar = (q) obj;
        int i10 = 0;
        if (qVar instanceof v) {
            v vVar = (v) qVar;
            int size = vVar.E.size();
            while (i10 < size) {
                s((i10 < 0 || i10 >= vVar.E.size()) ? null : (q) vVar.E.get(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (o1.h(qVar.f6200e) && o1.h(null) && o1.h(null)) {
            ArrayList arrayList3 = qVar.f6201f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size2) {
                    qVar.b((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    qVar.x((View) arrayList.get(size3));
                }
            }
        }
    }
}
