package f0;

import a6.C0007;
import aa.C0012;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.iid.C0170;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0211;
import d3.C0216;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.codegen.C0241;
import g.C0284;
import h0.C0299;
import j9.C0329;
import n7.C0363;
import o7.i2;
import q1.C0383;
import v.i3;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f359short = {529, 531, 542, 542, 594, 518, 541, 594, 597, 512, 535, 513, 519, 543, 535, 597, 594, 528, 535, 532, 541, 512, 535, 594, 597, 539, 540, 516, 541, 537, 535, 597, 594, 517, 539, 518, 538, 594, 529, 541, 512, 541, 519, 518, 539, 540, 535};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.z f5731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.v0 f5732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(o1.z zVar, h0.v0 v0Var, u8.e eVar) {
        super(C0170.f194 ^ (-151), eVar);
        this.f5731b = zVar;
        this.f5732c = v0Var;
        int iM2311 = C0120.m2311();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2311 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0007.m151("g2hRfIxxAYc")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5188() {
        int iM4046 = C0211.m4046();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4046 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f359short;
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
        String str = "\u06e8\u06e6\u06e5";
        h0.v0 v0VarM4533 = null;
        o1.z zVarM7116 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750718:
                    this = new h0(zVarM7116, v0VarM4533, eVar);
                    str = "\u06e1\u06e3";
                    break;
                case 1753635:
                    v0VarM4533 = C0235.m4533(this);
                    str = "\u06e3\u06e5\u06e0";
                    break;
                case 1755559:
                    str = "\u06e6\u06e6\u06e3";
                    zVarM7116 = C0363.m7116(this);
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e7\u06e3\u06e1";
        u8.e eVarM4457 = null;
        m9.d0 d0Var = null;
        Object objM5489 = obj;
        q8.l lVarM238 = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746913:
                    objM5489 = C0284.m5489(this, lVarM238);
                    str = "\u06e8\u06e7\u06e0";
                    break;
                case 1748830:
                    eVarM4457 = C0231.m4457(this, d0Var, eVar);
                    str = "\u06e3\u06e3\u06e8";
                    break;
                case 1751648:
                    str = "\u06e1\u06e6\u06e3";
                    eVar = (u8.e) obj2;
                    break;
                case 1754501:
                    str = "\u06e4\u06e4\u06e0";
                    d0Var = (m9.d0) objM5489;
                    break;
                case 1754569:
                    str = "\u06df\u06e6\u06e8";
                    lVarM238 = C0012.m238();
                    break;
                case 1755585:
                    return objM5489;
                default:
                    str = "\u06e7\u06e5\u06e7";
                    this = (h0) eVarM4457;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        int i10 = 1;
        v8.a aVarM5766 = C0299.m5766();
        int iM4113 = C0216.m4113(this);
        q8.l lVarM238 = C0012.m238();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4113 != 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM4113 == 1) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0159.m3045(m5188(), 0, C0154.f179 ^ (-10), 626));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
                                            break;
                                        case 47483:
                                            return lVarM238;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    C0329.m6365(obj);
                    o1.z zVarM7116 = C0363.m7116(this);
                    p pVar = new p(C0235.m4533(this), i10);
                    this.f5730a = 1;
                    Object objM4634 = C0241.m4634(new i3(zVarM7116, null, null, null, pVar, C0383.m7517()), this);
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                objM4634 = lVarM238;
                                break;
                            case 76:
                                int i15 = 48891;
                                while (true) {
                                    i15 ^= 48908;
                                    switch (i15) {
                                        case 22:
                                            break;
                                        case 503:
                                            i15 = 48922;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i14 = objM4634 == aVarM5766 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (objM4634 == aVarM5766) {
                                    i16 = 49759;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                return aVarM5766;
                            case 83:
                                return lVarM238;
                            default:
                                continue;
                        }
                        i16 = 49728;
                    }
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }
}
