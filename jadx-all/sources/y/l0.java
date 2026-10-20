package y;

import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f16619b = new l0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f16620c = new l0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f16621d = new l0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f16622e = new l0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l0 f16623f = new l0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l0 f16624n = new l0(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l0 f16625o = new l0(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l0 f16626p = new l0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16627a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i10) {
        super(3);
        this.f16627a = i10;
    }

    public final Integer a(int i10, int i11, List list) {
        switch (this.f16627a) {
            case 0:
                return Integer.valueOf(androidx.compose.foundation.layout.a.d(list, j.f16565c, j.f16566d, i10, i11, 1, 2));
            case 1:
                return Integer.valueOf(androidx.compose.foundation.layout.a.d(list, j.f16567e, j.f16568f, i10, i11, 1, 1));
            case 2:
                return Integer.valueOf(androidx.compose.foundation.layout.a.d(list, j.f16569n, j.f16570o, i10, i11, 1, 2));
            case 3:
                return Integer.valueOf(androidx.compose.foundation.layout.a.d(list, j.f16571p, j.f16572q, i10, i11, 1, 1));
            case 4:
                return Integer.valueOf(androidx.compose.foundation.layout.a.d(list, j.f16573r, j.f16574s, i10, i11, 2, 2));
            case 5:
                return Integer.valueOf(androidx.compose.foundation.layout.a.d(list, j.f16575t, j.f16576u, i10, i11, 2, 1));
            case 6:
                return Integer.valueOf(androidx.compose.foundation.layout.a.d(list, j.f16577v, j.f16578w, i10, i11, 2, 2));
            default:
                return Integer.valueOf(androidx.compose.foundation.layout.a.d(list, j.f16579x, j.f16580y, i10, i11, 2, 1));
        }
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        switch (this.f16627a) {
            case 0:
                return a(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 1:
                return a(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 2:
                return a(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 3:
                return a(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 4:
                return a(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 5:
                return a(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 6:
                return a(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 7:
                return a(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            default:
                ((Number) obj3).intValue();
                m0.q qVar = (m0.q) ((m0.m) obj2);
                qVar.Z(359872873);
                WeakHashMap weakHashMap = j1.f16584u;
                j1 j1VarC = c0.c(qVar);
                qVar.Z(1157296644);
                boolean zG = qVar.g(j1VarC);
                Object objP = qVar.P();
                if (zG || objP == m0.l.f11578a) {
                    objP = new i0(j1VarC.f16590f);
                    qVar.l0(objP);
                }
                qVar.t(false);
                i0 i0Var = (i0) objP;
                qVar.t(false);
                return i0Var;
        }
    }
}
