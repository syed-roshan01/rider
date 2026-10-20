package c5;

import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d5.o1;
import k0.y0;
import m0.g1;
import m0.l3;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d9.j implements c9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f2998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f2999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f3000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f3001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f3002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MainViewModel mainViewModel, g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4) {
        super(4);
        this.f2998a = mainViewModel;
        this.f2999b = g1Var;
        this.f3000c = g1Var2;
        this.f3001d = g1Var3;
        this.f3002e = g1Var4;
    }

    /* JADX WARN: Unreachable blocks removed: 14, instructions: 60 */
    @Override // c9.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        f5.h hVar = (f5.h) obj2;
        m0.m mVar = (m0.m) obj3;
        ((Number) obj4).intValue();
        d7.a.m((s.q) obj, "$this$AnimatedContent");
        d7.a.m(hVar, RemoteConfigConstants.ResponseFieldKey.STATE);
        boolean z10 = hVar instanceof f5.d;
        q8.l lVar = q8.l.f13235a;
        if (z10) {
            m0.q qVar = (m0.q) mVar;
            qVar.Z(-887099009);
            y3.e.d(qVar, 0);
            qVar.t(false);
        } else {
            boolean z11 = hVar instanceof f5.f;
            y0 y0Var = m0.l.f11578a;
            MainViewModel mainViewModel = this.f2998a;
            if (z11 || (hVar instanceof f5.c)) {
                m0.q qVar2 = (m0.q) mVar;
                qVar2.Z(-887098875);
                g1 g1Var = this.f2999b;
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    qVar2.Z(-887098841);
                    qVar2.Z(-887098714);
                    Object objP = qVar2.P();
                    if (objP == y0Var) {
                        objP = k1.b(0, g1Var, qVar2);
                    }
                    qVar2.t(false);
                    y3.e.u(mainViewModel, (c9.a) objP, qVar2, 56);
                    qVar2.t(false);
                } else {
                    qVar2.Z(-887098646);
                    qVar2.Z(-887098519);
                    Object objP2 = qVar2.P();
                    if (objP2 == y0Var) {
                        objP2 = k1.b(1, g1Var, qVar2);
                    }
                    qVar2.t(false);
                    y3.e.e(mainViewModel, (c9.a) objP2, qVar2, 56);
                    qVar2.t(false);
                }
                qVar2.t(false);
            } else if (hVar instanceof f5.b) {
                m0.q qVar3 = (m0.q) mVar;
                qVar3.Z(-887098384);
                f6.a.e(mainViewModel, ((f5.b) hVar).f6231a, qVar3, 8);
                qVar3.t(false);
            } else if (hVar instanceof f5.g) {
                m0.q qVar4 = (m0.q) mVar;
                qVar4.Z(-887098080);
                y3.e.z(mainViewModel, qVar4, 8);
                qVar4.t(false);
            } else if (hVar instanceof f5.a) {
                m0.q qVar5 = (m0.q) mVar;
                qVar5.Z(-887097961);
                y3.e.b(mainViewModel, qVar5, 8);
                qVar5.t(false);
            } else if (hVar instanceof f5.e) {
                m0.q qVar6 = (m0.q) mVar;
                qVar6.Z(-887097841);
                boolean zBooleanValue = ((Boolean) this.f3000c.getValue()).booleanValue();
                l3 l3Var = this.f3001d;
                if (!zBooleanValue || ((Number) l3Var.getValue()).longValue() > System.currentTimeMillis()) {
                }
                d7.a.d((String) this.f3002e.getValue(), "SUCCESS");
                qVar6.Z(-887097615);
                m0.s.b(lVar, new n(mainViewModel, null), qVar6);
                o1.f(mainViewModel, qVar6, 8);
                qVar6.t(false);
                qVar6.t(false);
            } else {
                m0.q qVar7 = (m0.q) mVar;
                qVar7.Z(-887096066);
                qVar7.t(false);
            }
        }
        return lVar;
    }
}
