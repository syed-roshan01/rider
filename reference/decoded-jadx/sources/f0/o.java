package f0;

import a0.C0003;
import aa.C0012;
import androidx.startup.C0047;
import c3.C0062;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.inject.C0172;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d4.C0217;
import dagger.hilt.internal.definecomponent.C0249;
import e1.C0257;
import e1.C0259;
import h0.C0299;
import j9.C0329;
import l2.C0341;
import m0.l3;
import o7.i2;
import q6.C0386;
import t9.C0427;
import v7.C0449;
import w0.C0454;
import z8.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f369short = {3120, 3122, 3135, 3135, 3187, 3111, 3132, 3187, 3188, 3105, 3126, 3104, 3110, 3134, 3126, 3188, 3187, 3121, 3126, 3125, 3132, 3105, 3126, 3187, 3188, 3130, 3133, 3109, 3132, 3128, 3126, 3188, 3187, 3108, 3130, 3111, 3131, 3187, 3120, 3132, 3105, 3132, 3110, 3111, 3130, 3133, 3126};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f5830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3 f5831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.b0 f5832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.v0 f5833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g2.o f5834f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g2.s f5835n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c2 c2Var, l3 l3Var, g2.b0 b0Var, h0.v0 v0Var, g2.o oVar, g2.s sVar, u8.e eVar) {
        super(C0172.f196 ^ 290, eVar);
        this.f5830b = c2Var;
        this.f5831c = l3Var;
        this.f5832d = b0Var;
        this.f5833e = v0Var;
        this.f5834f = oVar;
        this.f5835n = sVar;
        int iM4959 = C0259.m4959();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4959 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0427.m8390("zQnFOjXQjD3jv")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۤ۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m5197() {
        int iM4918 = C0257.m4918();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4918 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f369short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        String str = "\u06e6\u06e7\u06e1";
        c2 c2VarM1602 = null;
        g2.o oVarM912 = null;
        h0.v0 v0VarM2801 = null;
        l3 l3VarM2663 = null;
        g2.b0 b0VarM6688 = null;
        g2.s sVarM8857 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746943:
                    v0VarM2801 = C0147.m2801(this);
                    str = "\u06e4\u06e7\u06e3";
                    break;
                case 1747653:
                    sVarM8857 = C0454.m8857(this);
                    str = "\u06e2\u06e8\u06e2";
                    break;
                case 1747903:
                    l3VarM2663 = C0138.m2663(this);
                    str = "\u06e1\u06e7\u06e0";
                    break;
                case 1749852:
                    str = "\u06e5\u06e6\u06df";
                    this = new o(c2VarM1602, l3VarM2663, b0VarM6688, v0VarM2801, oVarM912, sVarM8857, eVar);
                    break;
                case 1751744:
                    oVarM912 = C0047.m912(this);
                    str = "\u06e0\u06df\u06e4";
                    break;
                case 1752670:
                    return this;
                case 1753664:
                    c2VarM1602 = C0074.m1602(this);
                    str = "\u06e0\u06e7\u06e6";
                    break;
                default:
                    b0VarM6688 = C0341.m6688(this);
                    str = "\u06df\u06e7\u06e7";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e5\u06e8";
        Object objM1176 = obj;
        u8.e eVar = null;
        m9.d0 d0Var = null;
        u8.e eVarM9562 = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747682:
                    str = "\u06e0\u06e3\u06e4";
                    lVarM238 = C0012.m238();
                    break;
                case 1747777:
                    objM1176 = C0062.m1176(this, lVarM238);
                    str = "\u06e7\u06e2\u06e8";
                    break;
                case 1748679:
                    eVarM9562 = C0491.m9562(this, d0Var, eVar);
                    str = "\u06e6\u06e8\u06e1";
                    break;
                case 1749703:
                    str = "\u06e1\u06e1\u06e7";
                    eVar = (u8.e) obj2;
                    break;
                case 1753695:
                    str = "\u06e0\u06e0\u06e2";
                    this = (o) eVarM9562;
                    break;
                case 1754477:
                    return objM1176;
                default:
                    str = "\u06e2\u06e3\u06e8";
                    d0Var = (m9.d0) objM1176;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0299.m5766();
        int iM3663 = C0192.m3663(this);
        c2 c2VarM1602 = C0074.m1602(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            try {
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = iM3663 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = iM3663 == 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    throw new IllegalStateException(C0249.m4771(m5197(), 0, C0003.f881 ^ (-884), 3155));
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    C0329.m6365(obj);
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i12 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        C0329.m6365(obj);
                        a4.c0 c0VarM7565 = C0386.m7565(new z.o(C0138.m2663(this), C0166.f190 ^ (-571)));
                        n nVar = new n(C0074.m1602(this), C0341.m6688(this), C0147.m2801(this), C0047.m912(this), C0454.m8857(this));
                        this.f5829a = 1;
                        Object objM8764 = C0449.m8764(c0VarM7565, nVar, this);
                        int i13 = 48891;
                        while (true) {
                            i13 ^= 48908;
                            switch (i13) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    i13 = objM8764 == aVarM5766 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    return aVarM5766;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            } catch (Throwable th) {
                int i14 = 48767;
                while (true) {
                    i14 ^= 48784;
                    switch (i14) {
                        case Code.UNAVAILABLE /* 14 */:
                            C0217.m4146(c2VarM1602);
                            throw th;
                        case 239:
                            i14 = 48798;
                            break;
                    }
                }
            }
        }
        C0217.m4146(c2VarM1602);
        return C0012.m238();
    }
}
