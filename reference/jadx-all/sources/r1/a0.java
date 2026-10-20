package r1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m2.l f13338a = m2.l.f11816b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f13341d;

    public a0(f0 f0Var) {
        this.f13341d = f0Var;
    }

    @Override // r1.i1
    public final List H(Object obj, c9.e eVar) {
        f0 f0Var = this.f13341d;
        f0Var.e();
        androidx.compose.ui.node.a aVar = f0Var.f13359a;
        int i10 = aVar.D.f14496c;
        if (i10 != 1 && i10 != 3 && i10 != 2 && i10 != 4) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        HashMap map = f0Var.f13365n;
        Object objJ = map.get(obj);
        if (objJ == null) {
            objJ = (androidx.compose.ui.node.a) f0Var.f13368q.remove(obj);
            if (objJ != null) {
                int i11 = f0Var.f13373v;
                if (i11 <= 0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                f0Var.f13373v = i11 - 1;
            } else {
                objJ = f0Var.j(obj);
                if (objJ == null) {
                    int i12 = f0Var.f13362d;
                    androidx.compose.ui.node.a aVar2 = new androidx.compose.ui.node.a(true, 2);
                    aVar.f1746r = true;
                    aVar.v(i12, aVar2);
                    aVar.f1746r = false;
                    objJ = aVar2;
                }
            }
            map.put(obj, objJ);
        }
        androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) objJ;
        List listO = aVar.o();
        int i13 = f0Var.f13362d;
        if (((i13 < 0 || i13 > d7.t.Y(listO)) ? null : listO.get(i13)) != aVar3) {
            int iIndexOf = aVar.o().indexOf(aVar3);
            int i14 = f0Var.f13362d;
            if (iIndexOf < i14) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i14 != iIndexOf) {
                aVar.f1746r = true;
                aVar.G(iIndexOf, i14, 1);
                aVar.f1746r = false;
            }
        }
        f0Var.f13362d++;
        f0Var.h(aVar3, obj, eVar);
        return (i10 == 1 || i10 == 3) ? aVar3.l() : aVar3.k();
    }

    @Override // r1.l0
    public final k0 N(int i10, int i11, Map map, c9.c cVar) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new z(i10, i11, map, this, this.f13341d, cVar);
        }
        throw new IllegalStateException(("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @Override // m2.b
    public final float c() {
        return this.f13339b;
    }

    @Override // r1.q
    public final m2.l getLayoutDirection() {
        return this.f13338a;
    }

    @Override // m2.b
    public final float m() {
        return this.f13340c;
    }

    @Override // r1.q
    public final boolean q() {
        int i10 = this.f13341d.f13359a.D.f14496c;
        return i10 == 4 || i10 == 2;
    }
}
