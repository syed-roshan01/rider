package a5;

import aa.C0012;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.layout.C0022;
import c0.C0056;
import c1.C0060;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.abt.C0113;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0134;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.sql.C0208;
import d1.C0212;
import f4.C0275;
import g8.C0294;
import h0.C0300;
import h3.C0304;
import j9.C0330;
import k3.C0336;
import o7.i2;
import r5.C0401;
import u1.z0;
import v0.C0444;
import y6.C0477;

/* JADX INFO: loaded from: classes.dex */
public final class s extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f22short = {1783, 1781, 1784, 1784, 1716, 1760, 1787, 1716, 1715, 1766, 1777, 1767, 1761, 1785, 1777, 1715, 1716, 1782, 1777, 1778, 1787, 1766, 1777, 1716, 1715, 1789, 1786, 1762, 1787, 1791, 1777, 1715, 1716, 1763, 1789, 1760, 1788, 1716, 1783, 1787, 1766, 1787, 1761, 1760, 1789, 1786, 1777, 1333, 1331, 1317, 1330, 1331, 572, 569, 569, 526, 563, 572, 557, 558, 565, 562, 553, 529, 564, 558, 553, 568, 563, 568, 559, 629, 627, 627, 627, 628};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f1302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, String str, u8.e eVar) {
        super(C0178.f202 ^ 153, eVar);
        this.f1302c = zVar;
        this.f1303d = str;
        int iM2587 = C0134.m2587();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2587 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0060.m1142("nJjCZjBOKvJeUJGyIbJ8gkm")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۡۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m139() {
        int iM2101 = C0108.m2101();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2101 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f22short;
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
        String str = "ۦ۟۠";
        String strM3980 = null;
        z zVarM316 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56567:
                    this.f1301b = obj;
                    str = "ۡۢۥ";
                    break;
                case 1748708:
                    return this;
                case 1752583:
                    this = new s(zVarM316, strM3980, eVar);
                    str = "ۨ۟";
                    break;
                case 1753415:
                    str = "ۢۧۤ";
                    zVarM316 = C0016.m316(this);
                    break;
                default:
                    strM3980 = C0208.m3980(this);
                    str = "ۥۣۥ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "۠ۢۦ";
        u8.e eVarM8646 = null;
        Object objM5653 = obj;
        q8.l lVarM238 = null;
        o9.r rVar = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56446:
                    objM5653 = C0294.m5653(this, lVarM238);
                    str = "ۦۥۧ";
                    break;
                case 1746692:
                    str = "ۤ۠ۦ";
                    this = (s) eVarM8646;
                    break;
                case 1747748:
                    str = "ۣ۠ۦ";
                    rVar = (o9.r) objM5653;
                    break;
                case 1748710:
                    eVarM8646 = C0444.m8646(this, rVar, eVar);
                    str = "۟۟ۤ";
                    break;
                case 1750569:
                    str = "ۡۢۧ";
                    eVar = (u8.e) obj2;
                    break;
                case 1753608:
                    return objM5653;
                default:
                    str = "ۤۢ";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0300.m5766();
        int iM7835 = C0401.m7835(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM7835 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM7835 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0104.m2036(m139(), 0, C0113.f139 ^ (-113), 1684));
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
                    o9.r rVar = (o9.r) C0075.m1637(this);
                    z zVarM316 = C0016.m316(this);
                    ListenerRegistration listenerRegistrationM3464 = C0181.m3464(C0275.m5285(C0085.m1827(C0304.m5844(zVarM316), C0022.m430(m139(), 47, C0477.f750 ^ 586, 1344)), C0208.m3980(this)), new r(rVar, zVarM316));
                    C0336.m6501(listenerRegistrationM3464, C0140.m2696(m139(), 52, C0085.f119 ^ 129, 605));
                    z0 z0Var = new z0(listenerRegistrationM3464, C0056.f76 ^ (-840));
                    this.f1300a = 1;
                    Object objM4038 = C0212.m4038(rVar, z0Var, this);
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
                                i13 = objM4038 == aVarM5766 ? 48860 : 48829;
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
