package f4;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class v extends q {
    public int G;
    public ArrayList E = new ArrayList();
    public boolean F = true;
    public boolean H = false;
    public int I = 0;

    @Override // f4.q
    public final void A(long j10) {
        ArrayList arrayList;
        this.f6198c = j10;
        if (j10 < 0 || (arrayList = this.E) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.E.get(i10)).A(j10);
        }
    }

    @Override // f4.q
    public final void B(z6.a aVar) {
        this.f6214z = aVar;
        this.I |= 8;
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.E.get(i10)).B(aVar);
        }
    }

    @Override // f4.q
    public final void C(TimeInterpolator timeInterpolator) {
        this.I |= 1;
        ArrayList arrayList = this.E;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((q) this.E.get(i10)).C(timeInterpolator);
            }
        }
        this.f6199d = timeInterpolator;
    }

    @Override // f4.q
    public final void D(x9.v vVar) {
        super.D(vVar);
        this.I |= 4;
        if (this.E != null) {
            for (int i10 = 0; i10 < this.E.size(); i10++) {
                ((q) this.E.get(i10)).D(vVar);
            }
        }
    }

    @Override // f4.q
    public final void E() {
        this.I |= 2;
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.E.get(i10)).E();
        }
    }

    @Override // f4.q
    public final void F(long j10) {
        this.f6197b = j10;
    }

    @Override // f4.q
    public final String H(String str) {
        String strH = super.H(str);
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strH);
            sb.append("\n");
            sb.append(((q) this.E.get(i10)).H(str + "  "));
            strH = sb.toString();
        }
        return strH;
    }

    public final void I(q qVar) {
        this.E.add(qVar);
        qVar.f6204p = this;
        long j10 = this.f6198c;
        if (j10 >= 0) {
            qVar.A(j10);
        }
        if ((this.I & 1) != 0) {
            qVar.C(this.f6199d);
        }
        if ((this.I & 2) != 0) {
            qVar.E();
        }
        if ((this.I & 4) != 0) {
            qVar.D(this.A);
        }
        if ((this.I & 8) != 0) {
            qVar.B(this.f6214z);
        }
    }

    @Override // f4.q
    public final void a(p pVar) {
        super.a(pVar);
    }

    @Override // f4.q
    public final void b(View view) {
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            ((q) this.E.get(i10)).b(view);
        }
        this.f6201f.add(view);
    }

    @Override // f4.q
    public final void d() {
        super.d();
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.E.get(i10)).d();
        }
    }

    @Override // f4.q
    public final void e(x xVar) {
        if (t(xVar.f6224b)) {
            for (q qVar : this.E) {
                if (qVar.t(xVar.f6224b)) {
                    qVar.e(xVar);
                    xVar.f6225c.add(qVar);
                }
            }
        }
    }

    @Override // f4.q
    public final void g(x xVar) {
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.E.get(i10)).g(xVar);
        }
    }

    @Override // f4.q
    public final void h(x xVar) {
        if (t(xVar.f6224b)) {
            for (q qVar : this.E) {
                if (qVar.t(xVar.f6224b)) {
                    qVar.h(xVar);
                    xVar.f6225c.add(qVar);
                }
            }
        }
    }

    @Override // f4.q
    /* JADX INFO: renamed from: k */
    public final q clone() {
        v vVar = (v) super.clone();
        vVar.E = new ArrayList();
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVarClone = ((q) this.E.get(i10)).clone();
            vVar.E.add(qVarClone);
            qVarClone.f6204p = vVar;
        }
        return vVar;
    }

    @Override // f4.q
    public final void m(ViewGroup viewGroup, i3.a0 a0Var, i3.a0 a0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j10 = this.f6197b;
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) this.E.get(i10);
            if (j10 > 0 && (this.F || i10 == 0)) {
                long j11 = qVar.f6197b;
                if (j11 > 0) {
                    qVar.F(j11 + j10);
                } else {
                    qVar.F(j10);
                }
            }
            qVar.m(viewGroup, a0Var, a0Var2, arrayList, arrayList2);
        }
    }

    @Override // f4.q
    public final void v(View view) {
        super.v(view);
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.E.get(i10)).v(view);
        }
    }

    @Override // f4.q
    public final void w(p pVar) {
        super.w(pVar);
    }

    @Override // f4.q
    public final void x(View view) {
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            ((q) this.E.get(i10)).x(view);
        }
        this.f6201f.remove(view);
    }

    @Override // f4.q
    public final void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.E.get(i10)).y(viewGroup);
        }
    }

    @Override // f4.q
    public final void z() {
        if (this.E.isEmpty()) {
            G();
            n();
            return;
        }
        u uVar = new u();
        uVar.f6219a = this;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(uVar);
        }
        this.G = this.E.size();
        if (this.F) {
            Iterator it2 = this.E.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).z();
            }
            return;
        }
        for (int i10 = 1; i10 < this.E.size(); i10++) {
            ((q) this.E.get(i10 - 1)).a(new g(2, this, (q) this.E.get(i10)));
        }
        q qVar = (q) this.E.get(0);
        if (qVar != null) {
            qVar.z();
        }
    }
}
