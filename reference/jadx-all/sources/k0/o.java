package k0;

import a.C0000;
import aa.C0012;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.node.C0037;
import c1.C0060;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0169;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import d1.C0214;
import d4.C0218;
import d9.C0224;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.migration.C0239;
import fa.C0281;
import l0.C0340;
import m1.C0352;
import n.C0362;
import n7.C0364;
import n7.C0365;
import r2.C0398;
import r9.C0406;
import t2.C0421;
import v.C0440;
import v0.C0441;
import w2.C0458;
import x4.C0469;
import y6.C0478;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d9.j implements c9.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f499short = {3069, 3038, 3014, 3028, 3011, 2961, 3027, 3038, 3012, 3039, 3029, 2961, 3036, 3012, 3010, 3013, 2961, 3027, 3028, 2961, 3039, 3038, 2961, 3030, 3011, 3028, 3024, 3013, 3028, 3011, 2961, 3013, 3033, 3024, 3039, 2961, 3012, 3009, 3009, 3028, 3011, 2961, 3027, 3038, 3012, 3039, 3029, 2961, 3038, 3039, 2961, 2971, 3024, 3037, 3037, 2971, 2961, 3029, 3032, 3036, 3028, 3039, 3010, 3032, 3038, 3039, 3010, 2975, 2961, 3045, 3033, 3028, 2961, 3009, 3011, 3038, 3015, 3032, 3029, 3028, 3029, 2961, 3037, 3038, 3014, 3028, 3011, 2961, 3027, 3038, 3012, 3039, 3029, 2955, 2961, 1559, 1630, 1604, 1559, 1616, 1605, 1618, 1622, 1603, 1618, 1605, 1559, 1603, 1631, 1622, 1625, 1559, 1602, 1607, 1607, 1618, 1605, 1559, 1621, 1624, 1602, 1625, 1619, 1559, 1555, 1628, 1629, 1555, 1626, 1629, 1623, 1622, 1611, 1555};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, float f10, int i10) {
        super(0);
        this.f9281a = i10;
        this.f9283c = obj;
        this.f9282b = f10;
        int iM2627 = C0136.m2627();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2627 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0129.m2491("HVzGk6j2E11edIboSOzfUPmsQC")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۥۤۤ, reason: contains not printable characters */
    public static short[] m6427() {
        int iM2559 = C0133.m2559();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2559 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f499short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVarM238 = C0012.m238();
        switch (C0440.m8577(this)) {
            case 0:
                C0090.m1929(this);
                return lVarM238;
            default:
                C0090.m1929(this);
                return lVarM238;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m6428invoke() {
        t.t tVarM2360;
        t.t tVarM3525;
        int iM8577 = C0440.m8577(this);
        Object objM1833 = C0086.m1833(this);
        switch (iM8577) {
            case 0:
                C0365.m7148(objM1833);
                C0365.m7148(objM1833);
                return;
            default:
                t.d dVar = (t.d) objM1833;
                Float fM4139 = C0218.m4139(C0478.m9313(this));
                Object objM9318 = C0478.m9318(dVar);
                t.x1 x1VarM8260 = C0421.m8260(dVar);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = fM4139 != null ? 1709 : 1678;
                            break;
                        case 204:
                            t.t tVar = (t.t) C0224.m4297(C0060.m1154(x1VarM8260), fM4139);
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = tVar == null ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        tVarM2360 = tVar;
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        tVarM2360 = C0123.m2360(dVar);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            tVarM2360 = C0123.m2360(dVar);
                            break;
                        default:
                            break;
                    }
                }
                int i12 = 1864;
                while (true) {
                    i12 ^= 1881;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i12 = objM9318 != null ? 48736 : 48705;
                            break;
                        case 47384:
                            tVarM3525 = C0185.m3525(dVar);
                            break;
                        case 47417:
                            tVarM3525 = (t.t) C0224.m4297(C0060.m1154(x1VarM8260), objM9318);
                            int i13 = 48767;
                            while (true) {
                                i13 ^= 48784;
                                switch (i13) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        break;
                                    case 76:
                                        tVarM3525 = C0185.m3525(dVar);
                                        break;
                                    case 239:
                                        i13 = tVarM3525 == null ? 48860 : 48829;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 47483:
                            break;
                        default:
                            break;
                    }
                }
                int iM7094 = C0362.m7094(tVarM2360);
                int i14 = 0;
                while (true) {
                    int i15 = 48891;
                    while (true) {
                        i15 ^= 48908;
                        switch (i15) {
                            case 22:
                                break;
                            case 53:
                                dVar.f14118k = tVarM2360;
                                dVar.f14119l = tVarM3525;
                                dVar.f14114g = objM9318;
                                dVar.f14113f = fM4139;
                                boolean zM14 = C0000.m14((Boolean) C0458.m8909(C0181.m3455(dVar)));
                                int i16 = 49914;
                                while (true) {
                                    i16 ^= 49931;
                                    switch (i16) {
                                        case 497:
                                            if (!zM14) {
                                                i16 = 50658;
                                            }
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            return;
                                        case 1769:
                                            Object objM579 = C0030.m579(dVar, C0281.m5433(dVar));
                                            boolean zM4399 = C0229.m4399(objM579, C0281.m5433(dVar));
                                            int i17 = 50689;
                                            while (true) {
                                                i17 ^= 50706;
                                                switch (i17) {
                                                    case 19:
                                                        if (!zM4399) {
                                                            i17 = 50782;
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        C0037.m728(C0398.m7773(C0469.m9117(dVar)), objM579);
                                                        return;
                                                    default:
                                                        continue;
                                                }
                                                i17 = 50751;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i16 = 50627;
                                }
                                break;
                            case 503:
                                i15 = i14 < iM7094 ? 49635 : 48953;
                                break;
                            case 32495:
                                break;
                            default:
                                break;
                        }
                    }
                    float fM6657 = C0340.m6657(tVarM2360, i14);
                    float fM6658 = C0340.m6657(tVarM3525, i14);
                    int i18 = 49666;
                    while (true) {
                        i18 ^= 49683;
                        switch (i18) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i18 = fM6657 <= fM6658 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                break;
                            case 83:
                                StringBuilder sb = new StringBuilder(C0281.m5427(m6427(), 0, C0239.f318 ^ (-858), 2993));
                                C0214.m4074(sb, tVarM2360);
                                C0142.m2728(sb, C0406.m7957(m6427(), 95, C0364.f634 ^ (-19), 1591));
                                C0214.m4074(sb, tVarM3525);
                                C0142.m2728(sb, C0196.m3766(m6427(), 124, C0352.f622 ^ 540, 1587));
                                C0197.m3772(sb, i14);
                                throw new IllegalStateException(C0201.m3852(C0441.m8605(sb)));
                            default:
                                break;
                        }
                    }
                    i14 += C0169.f193 ^ 741;
                    int i19 = 49790;
                    while (true) {
                        i19 ^= 49807;
                        switch (i19) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 241:
                                i19 = 49821;
                                break;
                        }
                    }
                }
                break;
        }
    }
}
