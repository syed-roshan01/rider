package f0;

import aa.C0012;
import b8.C0055;
import com.auto.accept.service.C0072;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import h0.C0300;
import j9.C0330;
import q1.C0384;
import u1.C0433;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.z f5685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f5686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(o1.z zVar, k1 k1Var, u8.e eVar) {
        super(C0115.f141 ^ (-574), eVar);
        this.f5685b = zVar;
        this.f5686c = k1Var;
        int iM3868 = C0202.m3868();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3868 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0433.m8461("lV"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        String str = "ۣۡ۠";
        o1.z zVarM9447 = null;
        k1 k1VarM1067 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747869:
                    this = new e1(zVarM9447, k1VarM1067, eVar);
                    str = "ۧۨ۟";
                    break;
                case 1748644:
                    zVarM9447 = C0486.m9447(this);
                    str = "ۥۣۢ";
                    break;
                case 1752580:
                    str = "۠ۦۣ";
                    k1VarM1067 = C0055.m1067(this);
                    break;
                case 1752703:
                    return this;
                default:
                    this.f5684a = obj;
                    str = "ۥۧۡ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۡۥۤ";
        Object objM2112 = obj;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVarM4449 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748766:
                    str = "ۨۨۧ";
                    lVarM238 = C0012.m238();
                    break;
                case 1748800:
                    str = "ۢۡ۟";
                    d0Var = (m9.d0) objM2112;
                    break;
                case 1749632:
                    str = "ۦۨ۠";
                    eVar = (u8.e) obj2;
                    break;
                case 1752704:
                    str = "ۡۤۡ";
                    this = (e1) eVarM4449;
                    break;
                case 1753694:
                    eVarM4449 = C0232.m4449(this, d0Var, eVar);
                    str = "ۥۧۢ";
                    break;
                case 1755623:
                    objM2112 = C0109.m2112(this, lVarM238);
                    str = "ۣۧۧ";
                    break;
                default:
                    return objM2112;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        String str = "ۣۣۤ";
        o1.z zVarM9447 = null;
        k1 k1VarM1067 = null;
        d1 d1Var = null;
        m9.d0 d0Var = null;
        Object objM1566 = obj;
        c1 c1Var = null;
        m9.x1 x1VarM7508 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56381:
                    objM1566 = C0072.m1566(this);
                    str = "ۨ۟ۥ";
                    break;
                case 1746723:
                    C0330.m6365(objM1566);
                    str = "ۢ۟";
                    break;
                case 1748646:
                    str = "ۥۧۨ";
                    k1VarM1067 = C0055.m1067(this);
                    break;
                case 1749668:
                    str = "ۡ۠ۥ";
                    zVarM9447 = C0486.m9447(this);
                    break;
                case 1749795:
                    return x1VarM7508;
                case 1750690:
                    C0300.m5766();
                    str = "۟۠ۤ";
                    break;
                case 1751497:
                    str = "ۢۦۧ";
                    x1VarM7508 = C0384.m7508(d0Var, null, i11, d1Var, 1);
                    break;
                case 1751501:
                    str = "ۨ۠۟";
                    x1VarM7508 = C0384.m7508(d0Var, null, i11, c1Var, 1);
                    break;
                case 1752523:
                    str = "ۤ۟ۨ";
                    i11 = i10 ^ (-292);
                    break;
                case 1752710:
                    str = "ۨۥۨ";
                    c1Var = new c1(zVarM9447, k1VarM1067, null);
                    break;
                case 1755342:
                    str = "ۢۢۤ";
                    d0Var = (m9.d0) objM1566;
                    break;
                case 1755367:
                    str = "ۤ۟ۤ";
                    d1Var = new d1(zVarM9447, k1VarM1067, null);
                    break;
                default:
                    str = "ۥۡۧ";
                    i10 = C0114.f140;
                    break;
            }
        }
    }
}
