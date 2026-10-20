package f0;

import a7.C0008;
import aa.C0012;
import c1.C0060;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.codegen.C0242;
import g8.C0294;
import h0.C0300;
import h1.C0301;
import j9.C0330;
import m7.C0359;
import o7.i2;
import okhttp3.internal.publicsuffix.C0373;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f363short = {1606, 1604, 1609, 1609, 1541, 1617, 1610, 1541, 1538, 1623, 1600, 1622, 1616, 1608, 1600, 1538, 1541, 1607, 1600, 1603, 1610, 1623, 1600, 1541, 1538, 1612, 1611, 1619, 1610, 1614, 1600, 1538, 1541, 1618, 1612, 1617, 1613, 1541, 1606, 1610, 1623, 1610, 1616, 1617, 1612, 1611, 1600};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f5795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.v0 f5796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k1 k1Var, h0.v0 v0Var, u8.e eVar) {
        super(C0060.f80 ^ (-894), eVar);
        this.f5795c = k1Var;
        this.f5796d = v0Var;
        int iM169 = C0008.m169();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM169 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0294.m5651("wmJFtKsXyJ85QDqgnUXWf")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۨۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5192() {
        int iM3737 = C0195.m3737();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3737 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f363short;
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
        String str = "ۦۣۢ";
        h0.v0 v0VarM7030 = null;
        k1 k1VarM1635 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749730:
                    v0VarM7030 = C0359.m7030(this);
                    str = "۟ۢ";
                    break;
                case 1753511:
                    str = "ۢۤۤ";
                    k1VarM1635 = C0075.m1635(this);
                    break;
                case 1754630:
                    this.f5794b = obj;
                    str = "ۣۨۡ";
                    break;
                case 1755462:
                    return this;
                default:
                    this = new j0(k1VarM1635, v0VarM7030, eVar);
                    str = "ۧۧۦ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۤۢۦ";
        u8.e eVarM7303 = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        Object objM4438 = obj;
        o1.z zVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746911:
                    return objM4438;
                case 1747935:
                    str = "ۣۨۨ";
                    this = (j0) eVarM7303;
                    break;
                case 1754412:
                    str = "ۨۥ۠";
                    eVar = (u8.e) obj2;
                    break;
                case 1755469:
                    str = "ۨۨ۠";
                    lVarM238 = C0012.m238();
                    break;
                case 1755523:
                    eVarM7303 = C0373.m7303(this, zVar, eVar);
                    str = "۠ۨۧ";
                    break;
                case 1755616:
                    objM4438 = C0231.m4438(this, lVarM238);
                    str = "۟ۦۦ";
                    break;
                default:
                    str = "ۧ۠ۥ";
                    zVar = (o1.z) objM4438;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0300.m5766();
        int iM3788 = C0197.m3788(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM3788 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM3788 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0301.m5777(m5192(), 0, C0300.f447 ^ 590, 1573));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0330.m6365(obj);
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
                    C0330.m6365(obj);
                    i0 i0Var = new i0((o1.z) C0294.m5641(this), C0075.m1635(this), C0359.m7030(this), null);
                    this.f5793a = 1;
                    Object objM4634 = C0242.m4634(i0Var, this);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                return aVarM5766;
                            case 239:
                                i13 = objM4634 == aVarM5766 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return C0012.m238();
    }
}
