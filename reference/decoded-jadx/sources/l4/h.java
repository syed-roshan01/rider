package l4;

import d9.v;
import ja.e0;
import ja.g0;
import ja.s;
import ja.t;
import ja.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ja.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja.m f11296b;

    public h(t tVar) {
        d7.a.m(tVar, "delegate");
        this.f11296b = tVar;
    }

    @Override // ja.m
    public final e0 a(x xVar) {
        return this.f11296b.a(xVar);
    }

    @Override // ja.m
    public final void b(x xVar, x xVar2) {
        d7.a.m(xVar, "source");
        d7.a.m(xVar2, "target");
        this.f11296b.b(xVar, xVar2);
    }

    @Override // ja.m
    public final void c(x xVar) {
        this.f11296b.c(xVar);
    }

    @Override // ja.m
    public final void d(x xVar) {
        d7.a.m(xVar, "path");
        this.f11296b.d(xVar);
    }

    @Override // ja.m
    public final List g(x xVar) {
        d7.a.m(xVar, "dir");
        List<x> listG = this.f11296b.g(xVar);
        ArrayList arrayList = new ArrayList();
        for (x xVar2 : listG) {
            d7.a.m(xVar2, "path");
            arrayList.add(xVar2);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // ja.m
    public final ja.l i(x xVar) {
        d7.a.m(xVar, "path");
        ja.l lVarI = this.f11296b.i(xVar);
        if (lVarI == null) {
            return null;
        }
        x xVar2 = lVarI.f8552c;
        if (xVar2 == null) {
            return lVarI;
        }
        boolean z10 = lVarI.f8550a;
        boolean z11 = lVarI.f8551b;
        Long l10 = lVarI.f8553d;
        Long l11 = lVarI.f8554e;
        Long l12 = lVarI.f8555f;
        Long l13 = lVarI.f8556g;
        Map map = lVarI.f8557h;
        d7.a.m(map, "extras");
        return new ja.l(z10, z11, xVar2, l10, l11, l12, l13, map);
    }

    @Override // ja.m
    public final s j(x xVar) {
        d7.a.m(xVar, "file");
        return this.f11296b.j(xVar);
    }

    @Override // ja.m
    public final e0 k(x xVar) {
        x xVarB = xVar.b();
        ja.m mVar = this.f11296b;
        if (xVarB != null) {
            r8.l<x> lVar = new r8.l();
            while (xVarB != null && !f(xVarB)) {
                lVar.n(lVar.f13657c + 1);
                int length = lVar.f13655a;
                if (length == 0) {
                    Object[] objArr = lVar.f13656b;
                    d7.a.m(objArr, "<this>");
                    length = objArr.length;
                }
                int i10 = length - 1;
                lVar.f13655a = i10;
                lVar.f13656b[i10] = xVarB;
                lVar.f13657c++;
                xVarB = xVarB.b();
            }
            for (x xVar2 : lVar) {
                d7.a.m(xVar2, "dir");
                mVar.c(xVar2);
            }
        }
        return mVar.k(xVar);
    }

    @Override // ja.m
    public final g0 l(x xVar) {
        d7.a.m(xVar, "file");
        return this.f11296b.l(xVar);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return v.a(h.class).b() + '(' + this.f11296b + ')';
    }
}
