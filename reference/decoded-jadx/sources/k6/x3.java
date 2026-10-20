package k6;

import androidx.appcompat.widget.C0020;
import b.C0049;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import g0.C0285;
import ga.C0295;
import ja.C0330;
import java.util.Iterator;
import k1.C0332;
import r6.C0401;
import s6.C0413;
import w5.C0462;

/* JADX INFO: loaded from: classes.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w3 f10528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10531e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f10532f = null;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f600short = {468, 483, 480, 500, 483, 501, 494, 495, 488, 481, 422, 480, 490, 487, 481, 422, 485, 487, 485, 494, 483, 422, 491, 499, 501, 498, 422, 484, 483, 422, 482, 489, 488, 483, 422, 489, 488, 422, 487, 422, 497, 489, 500, 493, 483, 500, 422, 498, 494, 500, 483, 487, 482, 424};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f10526g = new Object();

    public x3(String str, Object obj, Object obj2, w3 w3Var) {
        this.f10527a = str;
        this.f10529c = obj;
        this.f10530d = obj2;
        this.f10528b = w3Var;
        int iM3070 = C0160.m3070();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3070 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0295.m5677("M7Dv6t5BciscBKjEsOYrX7B")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6609() {
        int iM399 = C0020.m399();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM399 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f600short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x016b. Please report as an issue. */
    public final Object a(Object obj) {
        w3 w3VarM6461;
        int i10;
        int i11;
        Object objM3641;
        synchronized (C0083.m1791(this)) {
        }
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (obj != null) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    return obj;
                case 239:
                    h hVarM5496 = C0285.m5496();
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (hVarM5496 == null) {
                                    i13 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                synchronized (C0194.m3714()) {
                                    try {
                                        boolean zM7872 = C0401.m7872();
                                        int i14 = 1864;
                                        while (true) {
                                            i14 ^= 1881;
                                            switch (i14) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (zM7872) {
                                                        i14 = 48736;
                                                    }
                                                    break;
                                                case 47384:
                                                    try {
                                                        Iterator itM2089 = C0107.m2089(C0049.m954());
                                                        while (true) {
                                                            boolean zM3327 = C0174.m3327(itM2089);
                                                            int i15 = 49790;
                                                            while (true) {
                                                                i15 ^= 49807;
                                                                switch (i15) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 84:
                                                                        x3 x3Var = (x3) C0413.m8115(itM2089);
                                                                        boolean zM7873 = C0401.m7872();
                                                                        int i16 = 49914;
                                                                        while (true) {
                                                                            i16 ^= 49931;
                                                                            switch (i16) {
                                                                                case 497:
                                                                                    i16 = !zM7873 ? 50658 : 50627;
                                                                                    break;
                                                                                case 1711:
                                                                                    break;
                                                                                case 1736:
                                                                                    throw new IllegalStateException(C0073.m1573(m6609(), 0, C0462.f733 ^ 259, 390));
                                                                                case 1769:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        Object objM3019 = null;
                                                                        try {
                                                                            w3 w3VarM6462 = C0332.m6461(x3Var);
                                                                            int i17 = 50689;
                                                                            while (true) {
                                                                                i17 ^= 50706;
                                                                                switch (i17) {
                                                                                    case 19:
                                                                                        i17 = w3VarM6462 != null ? 50782 : 50751;
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 76:
                                                                                        objM3019 = C0158.m3019(w3VarM6462);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            while (true) {
                                                                                i11 ^= 50830;
                                                                                switch (i11) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 243:
                                                                                        i11 = 50844;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } catch (IllegalStateException e4) {
                                                                            int i18 = 51836;
                                                                            while (true) {
                                                                                i18 ^= 51853;
                                                                                switch (i18) {
                                                                                    case 241:
                                                                                        i18 = 52518;
                                                                                        break;
                                                                                    case 1963:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                        synchronized (C0194.m3714()) {
                                                                            x3Var.f10532f = objM3019;
                                                                        }
                                                                        i11 = 50813;
                                                                        break;
                                                                    case 241:
                                                                        i15 = zM3327 ? 49883 : 49852;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        while (true) {
                                                            i10 ^= 51605;
                                                            switch (i10) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (w3VarM6461 == null) {
                                                                        i10 = 51681;
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    try {
                                                                        return C0158.m3019(w3VarM6461);
                                                                    } catch (IllegalStateException e10) {
                                                                        return C0330.m6376(this);
                                                                    } catch (SecurityException e11) {
                                                                        return C0330.m6376(this);
                                                                    }
                                                                case 116:
                                                                    return C0330.m6376(this);
                                                                default:
                                                                    continue;
                                                            }
                                                            i10 = 51650;
                                                        }
                                                    } catch (SecurityException e12) {
                                                        int i19 = 51712;
                                                        while (true) {
                                                            i19 ^= 51729;
                                                            switch (i19) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i19 = 51743;
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    w3VarM6461 = C0332.m6461(this);
                                                    i10 = 51588;
                                                    break;
                                                case 47417:
                                                    Object objM3642 = C0191.m3641(this);
                                                    int i20 = 48767;
                                                    while (true) {
                                                        i20 ^= 48784;
                                                        switch (i20) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                objM3641 = C0191.m3641(this);
                                                                break;
                                                            case 76:
                                                                objM3641 = C0330.m6376(this);
                                                                int i21 = 48891;
                                                                while (true) {
                                                                    i21 ^= 48908;
                                                                    switch (i21) {
                                                                        case 22:
                                                                            break;
                                                                        case 503:
                                                                            i21 = 48922;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                i20 = objM3642 == null ? 48860 : 48829;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    return objM3641;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i14 = 48705;
                                        }
                                    } catch (Throwable th) {
                                        int i22 = 49666;
                                        while (true) {
                                            i22 ^= 49683;
                                            switch (i22) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i22 = 49697;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    throw th;
                                            }
                                        }
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0330.m6376(this);
                            default:
                                continue;
                        }
                        i13 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }
}
