package u1;

import android.view.View;
import com.ride.accepter.R;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f15364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.e f15365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(x3 x3Var, c9.e eVar, int i10) {
        super(2);
        this.f15363a = i10;
        this.f15364b = x3Var;
        this.f15365c = eVar;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f15363a;
        c9.e eVar = this.f15365c;
        x3 x3Var = this.f15364b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                y0.a(x3Var.f15370a, eVar, mVar, 8);
                break;
            default:
                if ((i10 & 11) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                Object tag = x3Var.f15370a.getTag(R.id.inspection_slot_table_set);
                int i12 = 0;
                Set set = (tag instanceof Set) && (!(tag instanceof e9.a) || (tag instanceof e9.e)) ? (Set) tag : null;
                w wVar = x3Var.f15370a;
                if (set == null) {
                    Object parent = wVar.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                    set = (!(tag2 instanceof Set) || ((tag2 instanceof e9.a) && !(tag2 instanceof e9.e))) ? null : (Set) tag2;
                }
                if (set != null) {
                    m0.q qVar3 = (m0.q) mVar;
                    set.add(qVar3.f11632c);
                    qVar3.f11645p = true;
                    qVar3.B = true;
                }
                m0.s.b(wVar, new v3(x3Var, null), mVar);
                f6.a.b(x0.b.f16285a.b(set), d7.t.K(mVar, -1193460702, new w3(x3Var, eVar, i12)), mVar, 56);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f15363a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
