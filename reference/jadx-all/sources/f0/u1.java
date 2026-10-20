package f0;

import a.C0000;
import a8.C0009;
import aa.C0012;
import androidx.activity.C0017;
import androidx.startup.C0047;
import b1.C0050;
import com.auto.accept.data.model.C0071;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.C0177;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import d3.C0217;
import dagger.hilt.components.C0245;
import h0.C0300;
import h6.C0310;
import j5.C0328;
import j9.C0330;
import o7.i2;
import p0.C0374;
import p5.C0378;
import q1.C0384;
import u7.C0438;
import v9.C0453;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends w8.i implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f381short = {2396, 2398, 2387, 2387, 2335, 2379, 2384, 2335, 2328, 2381, 2394, 2380, 2378, 2386, 2394, 2328, 2335, 2397, 2394, 2393, 2384, 2381, 2394, 2335, 2328, 2390, 2385, 2377, 2384, 2388, 2394, 2328, 2335, 2376, 2390, 2379, 2391, 2335, 2396, 2384, 2381, 2384, 2378, 2379, 2390, 2385, 2394};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v.l1 f5966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m9.d0 f5968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.g1 f5969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x.m f5970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(m9.d0 d0Var, m0.g1 g1Var, x.m mVar, u8.e eVar) {
        super(C0378.f648 ^ 188, eVar);
        this.f5968d = d0Var;
        this.f5969e = g1Var;
        this.f5970f = mVar;
        int iM1458 = C0071.m1458();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1458 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0374.m7335("k2GklFasqGWJHwMtCz9PK0zrux")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۡۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5208() {
        int iM982 = C0050.m982();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM982 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f381short;
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

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        long jM235 = 0;
        String str = "ۡۨۤ";
        v.l1 l1Var = null;
        m9.d0 d0VarM351 = null;
        Object objM3370 = obj;
        u8.e eVar = null;
        m0.g1 g1VarM915 = null;
        x.m mVarM8809 = null;
        q8.l lVarM238 = null;
        d1.c cVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746789:
                    this = new u1(d0VarM351, g1VarM915, mVarM8809, eVar);
                    str = "ۣۧ۟";
                    break;
                case 1746879:
                    str = "ۣۣ۟";
                    lVarM238 = C0012.m238();
                    break;
                case 1748830:
                    str = "ۤۨۢ";
                    cVar = (d1.c) obj2;
                    break;
                case 1748893:
                    str = "ۡۦۣ";
                    l1Var = (v.l1) objM3370;
                    break;
                case 1749573:
                    str = "ۣۣ۠";
                    d0VarM351 = C0017.m351(this);
                    break;
                case 1750535:
                    objM3370 = C0177.m3370(this, lVarM238);
                    str = "ۥ۠ۤ";
                    break;
                case 1750566:
                    str = "ۣۢ";
                    g1VarM915 = C0047.m915(this);
                    break;
                case 1751774:
                    jM235 = C0012.m235(cVar);
                    str = "ۥۥۡ";
                    break;
                case 1752458:
                    this.f5967c = jM235;
                    str = "۟ۥۥ";
                    break;
                case 1752489:
                    return objM3370;
                case 1752641:
                    str = "ۢ۟ۢ";
                    eVar = (u8.e) obj3;
                    break;
                case 1754379:
                    this.f5966b = l1Var;
                    str = "ۥ۟ۤ";
                    break;
                default:
                    str = "۟ۢۨ";
                    mVarM8809 = C0453.m8809(this);
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM8536;
        v8.a aVarM5766 = C0300.m5766();
        int iM189 = C0009.m189(this);
        int i10 = C0217.f240 ^ (-917);
        m9.d0 d0VarM351 = C0017.m351(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM189 != 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM189 == 1) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0245.m4690(m5208(), 0, C0190.f214 ^ (-12), 2367));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0330.m6365(obj);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
                                            break;
                                        case 47483:
                                            objM8536 = obj;
                                            break;
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
                    C0330.m6365(obj);
                    v.l1 l1VarM5983 = C0310.m5983(this);
                    C0384.m7508(d0VarM351, null, 0, new s1(C0047.m915(this), C0328.m6329(this), C0453.m8809(this), null), i10);
                    this.f5965a = 1;
                    objM8536 = C0438.m8536(l1VarM5983, this);
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                return aVarM5766;
                            case 239:
                                if (objM8536 == aVarM5766) {
                                    i14 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i14 = 48829;
                    }
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
        C0384.m7508(d0VarM351, null, 0, new t1(C0047.m915(this), C0000.m14((Boolean) objM8536), C0453.m8809(this), null), i10);
        return C0012.m238();
    }
}
