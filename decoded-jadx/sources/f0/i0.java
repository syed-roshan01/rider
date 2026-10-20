package f0;

import aa.C0012;
import c0.C0056;
import c4.C0065;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.remoteconfig.internal.Code;
import g7.C0292;
import g9.C0294;
import h0.C0299;
import h7.C0310;
import j9.C0329;
import o4.C0369;
import q1.C0383;
import v6.C0447;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.z f5752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f5753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.v0 f5754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(o1.z zVar, k1 k1Var, h0.v0 v0Var, u8.e eVar) {
        super(C0056.f76 ^ (-848), eVar);
        this.f5752b = zVar;
        this.f5753c = k1Var;
        this.f5754d = v0Var;
        int iM5997 = C0310.m5997();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5997 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0114.m2208("iPdeTm1LUYbjS0O")));
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
        String str = "\u06e5\u06e4\u06e5";
        o1.z zVarM5625 = null;
        k1 k1VarM2957 = null;
        h0.v0 v0VarM2995 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750659:
                    this = new i0(zVarM5625, k1VarM2957, v0VarM2995, eVar);
                    str = "\u06e4\u06e5\u06e0";
                    break;
                case 1751679:
                    this.f5751a = obj;
                    str = "\u06e6\u06e6\u06e6";
                    break;
                case 1752614:
                    str = "\u06e5\u06e5\u06e8";
                    k1VarM2957 = C0154.m2957(this);
                    break;
                case 1753638:
                    return this;
                case 1755376:
                    zVarM5625 = C0292.m5625(this);
                    str = "\u06e3\u06e3\u06e3";
                    break;
                default:
                    str = "\u06e8\u06e0\u06e8";
                    v0VarM2995 = C0157.m2995(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e6\u06e8\u06df";
        u8.e eVar = null;
        m9.d0 d0Var = null;
        q8.l lVarM238 = null;
        Object objM7247 = obj;
        u8.e eVarM1261 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746690:
                    eVarM1261 = C0065.m1261(this, d0Var, eVar);
                    str = "\u06e5\u06e2\u06e0";
                    break;
                case 1751687:
                    str = "\u06df\u06df\u06e2";
                    eVar = (u8.e) obj2;
                    break;
                case 1752460:
                    objM7247 = C0369.m7247(this, lVarM238);
                    str = "\u06e1\u06e7\u06e1";
                    break;
                case 1752547:
                    str = "\u06e8\u06e8\u06e1";
                    this = (i0) eVarM1261;
                    break;
                case 1753693:
                    str = "\u06e4\u06e5\u06e8";
                    d0Var = (m9.d0) objM7247;
                    break;
                case 1755617:
                    str = "\u06e5\u06df\u06e6";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    return lVarM238;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        String str = "\u06e5\u06e5\u06e6";
        m9.d0 d0Var = null;
        g0 g0Var = null;
        k1 k1VarM2957 = null;
        h0 h0Var = null;
        o1.z zVarM5625 = null;
        Object objM8718 = obj;
        h0.v0 v0VarM2995 = null;
        q8.l lVarM238 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56448:
                    g0Var = new g0(zVarM5625, k1VarM2957, null);
                    str = "\u06e1\u06e1\u06e3";
                    break;
                case 1746850:
                    zVarM5625 = C0292.m5625(this);
                    str = "\u06e1\u06e5\u06e8";
                    break;
                case 1746874:
                    str = "\u06e3\u06e7\u06e8";
                    i11 = i10 ^ (-665);
                    break;
                case 1747742:
                    C0383.m7508(d0Var, null, i11, h0Var, 1);
                    str = "\u06e8\u06e5\u06e7";
                    break;
                case 1748675:
                    i10 = C0294.f442;
                    str = "\u06df\u06e5\u06e0";
                    break;
                case 1748804:
                    k1VarM2957 = C0154.m2957(this);
                    str = "\u06e4\u06e4";
                    break;
                case 1750568:
                    d0Var = (m9.d0) objM8718;
                    str = "\u06df\u06e4\u06e7";
                    break;
                case 1750788:
                    C0383.m7508(d0Var, null, i11, g0Var, 1);
                    str = "\u06e5\u06e3\u06e8";
                    break;
                case 1751529:
                    objM8718 = C0447.m8718(this);
                    str = "\u06e3\u06e0\u06e5";
                    break;
                case 1752586:
                    v0VarM2995 = C0157.m2995(this);
                    str = "\u06e7\u06e5\u06e3";
                    break;
                case 1752642:
                    return lVarM238;
                case 1752646:
                    C0299.m5766();
                    str = "\u06e0\u06e6\u06e0";
                    break;
                case 1754565:
                    h0Var = new h0(zVarM5625, v0VarM2995, null);
                    str = "\u06e0\u06e2\u06e0";
                    break;
                case 1755530:
                    lVarM238 = C0012.m238();
                    str = "\u06e5\u06e5\u06e2";
                    break;
                default:
                    C0329.m6365(objM8718);
                    str = "\u06e4\u06e0\u06e5";
                    break;
            }
        }
    }
}
