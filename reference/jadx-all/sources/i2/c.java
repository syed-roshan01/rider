package i2;

import android.graphics.Typeface;
import f2.v;
import f2.w;
import java.util.List;
import l.z2;
import m0.m;
import m0.q;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d9.j implements c9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i10) {
        super(4);
        this.f7913a = i10;
        this.f7914b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    @Override // c9.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11 = this.f7913a;
        Object obj5 = this.f7914b;
        switch (i11) {
            case 0:
                d dVar = (d) obj5;
                w wVarB = ((f2.f) dVar.f7919e).b((f2.e) obj, (f2.l) obj2, ((f2.j) obj3).f6112a, ((f2.k) obj4).f6113a);
                if (wVarB instanceof v) {
                    Object obj6 = ((v) wVarB).f6134a;
                    d7.a.k(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj6;
                }
                z2 z2Var = new z2(wVarB, dVar.f7924j);
                dVar.f7924j = z2Var;
                Object obj7 = z2Var.f10985d;
                d7.a.k(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj7;
            default:
                z.b bVar = (z.b) obj;
                int iIntValue = ((Number) obj2).intValue();
                m mVar = (m) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 14) == 0) {
                    i10 = (((q) mVar).g(bVar) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 112) == 0) {
                    i10 |= ((q) mVar).e(iIntValue) ? 32 : 16;
                }
                if ((i10 & 731) == 146) {
                    q qVar = (q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    } else {
                        y3.e.B((z4.f) ((List) obj5).get(iIntValue), mVar, ((i10 & 14) >> 3) & 14);
                    }
                } else {
                    y3.e.B((z4.f) ((List) obj5).get(iIntValue), mVar, ((i10 & 14) >> 3) & 14);
                }
                return q8.l.f13235a;
        }
    }
}
