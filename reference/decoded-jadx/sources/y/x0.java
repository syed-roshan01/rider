package y;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f16697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f16698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f16699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r1.x0[] f16700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0[] f16701g;

    public x0(int i10, g gVar, i iVar, float f10, a0 a0Var, List list, r1.x0[] x0VarArr) {
        this.f16695a = i10;
        this.f16696b = gVar;
        this.f16697c = iVar;
        this.f16698d = a0Var;
        this.f16699e = list;
        this.f16700f = x0VarArr;
        int size = list.size();
        y0[] y0VarArr = new y0[size];
        for (int i11 = 0; i11 < size; i11++) {
            y0VarArr[i11] = androidx.compose.foundation.layout.a.g((r1.p) this.f16699e.get(i11));
        }
        this.f16701g = y0VarArr;
    }

    public final int a(r1.x0 x0Var) {
        return this.f16695a == 1 ? x0Var.f13423a : x0Var.f13424b;
    }
}
