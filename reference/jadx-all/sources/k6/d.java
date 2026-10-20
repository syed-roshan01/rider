package k6;

import a.C0000;
import a7.C0008;
import a8.C0009;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.platform.C0038;
import androidx.fragment.app.C0042;
import c1.C0061;
import c3.C0062;
import c6.C0067;
import com.auto.accept.service.C0072;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.iid.C0170;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0226;
import dagger.hilt.C0256;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.C0254;
import dagger.hilt.internal.aliasof.C0248;
import f.C0271;
import g9.C0295;
import h.C0298;
import h1.C0301;
import h8.C0315;
import i.C0317;
import ja.C0331;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import l6.C0344;
import m7.C0358;
import n7.C0365;
import p0.C0374;
import p5.C0378;
import q5.C0386;
import q6.C0388;
import q7.C0391;
import r4.C0399;
import r5.C0400;
import r7.C0405;
import s3.C0413;
import s6.C0414;
import t1.C0420;
import u7.C0438;
import v6.C0448;
import w4.C0461;
import x0.C0467;
import z0.C0483;
import z2.C0485;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f533short = {1778, 1749, 1741, 1754, 1751, 1746, 1759, 1691, 1737, 1758, 1756, 1742, 1751, 1754, 1737, 1691, 1758, 1731, 1739, 1737, 1758, 1736, 1736, 1746, 1748, 1749, 1691, 1746, 1749, 1691, 1769, 1790, 1788, 1790, 1763, 1771, 1691, 1754, 1742, 1759, 1746, 1758, 1749, 1752, 1758, 1691, 1757, 1746, 1751, 1743, 1758, 1737, 1685, 1691, 1758, 1731, 1739, 1737, 1758, 1736, 1736, 1746, 1748, 1749};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f9953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f9954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f9955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f9956f;

    public d(String str, int i10) {
        this.f9951a = str;
        this.f9952b = i10;
        int iM820 = C0042.m820();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM820 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0242.m4631("LpUdvRM1B")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public static Boolean b(long j10, zzew.zzd zzdVar) {
        try {
            return C0301.m5794(new BigDecimal(j10), zzdVar, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        } catch (NumberFormatException e4) {
            return null;
        }
    }

    public static Boolean c(Boolean bool, boolean z10) {
        boolean z11;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bool == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    boolean zM14 = C0000.m14(bool);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM14 != z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                z11 = false;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                z11 = true;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    return C0009.m192(z11);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:117:0x019c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x007b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0094. Please report as an issue. */
    public static Boolean d(String str, zzew.zzf zzfVar, d4 d4Var) {
        String strM4563;
        List listM6129;
        String str2;
        int i10;
        Boolean boolM192 = null;
        C0271.m5173(zzfVar);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    break;
                case 239:
                    boolean zM8962 = C0461.m8962(zzfVar);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM8962) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                zzew.zzf.zza zzaVarM7930 = C0405.m7930(zzfVar);
                                zzew.zzf.zza zzaVarM2068 = C0106.m2068();
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zzaVarM7930 == zzaVarM2068) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            zzew.zzf.zza zzaVarM7931 = C0405.m7930(zzfVar);
                                            zzew.zzf.zza zzaVarM2339 = C0121.m2339();
                                            int i14 = 48891;
                                            while (true) {
                                                i14 ^= 48908;
                                                switch (i14) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM7394 = C0378.m7394(zzfVar);
                                                        int i15 = 49790;
                                                        while (true) {
                                                            i15 ^= 49807;
                                                            switch (i15) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    break;
                                                                case 241:
                                                                    i15 = !zM7394 ? 49883 : 49852;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        i14 = zzaVarM7931 == zzaVarM2339 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        int iM7830 = C0400.m7830(zzfVar);
                                                        int i16 = 49666;
                                                        while (true) {
                                                            i16 ^= 49683;
                                                            switch (i16) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i16 = iM7830 == 0 ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    break;
                                                                case 83:
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
                                            zzew.zzf.zza zzaVarM7932 = C0405.m7930(zzfVar);
                                            boolean zM1174 = C0061.m1174(zzfVar);
                                            int i17 = 49914;
                                            while (true) {
                                                i17 ^= 49931;
                                                switch (i17) {
                                                    case 497:
                                                        i17 = !zM1174 ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        strM4563 = C0238.m4563(zzfVar);
                                                        break;
                                                    case 1769:
                                                        zzew.zzf.zza zzaVarM9430 = C0485.m9430();
                                                        int i18 = 50689;
                                                        while (true) {
                                                            i18 ^= 50706;
                                                            switch (i18) {
                                                                case 19:
                                                                    i18 = zzaVarM7932 != zzaVarM9430 ? 50782 : 50751;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    strM4563 = C0238.m4563(zzfVar);
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    int i19 = 50813;
                                                                    while (true) {
                                                                        i19 ^= 50830;
                                                                        switch (i19) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 53:
                                                                                String strM4331 = C0226.m4331(C0238.m4563(zzfVar), C0315.m6082());
                                                                                int i20 = 51712;
                                                                                while (true) {
                                                                                    i20 ^= 51729;
                                                                                    switch (i20) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            strM4563 = strM4331;
                                                                                            break;
                                                                                        case 15:
                                                                                        case Code.UNAUTHENTICATED /* 16 */:
                                                                                        default:
                                                                                            continue;
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i20 = 51743;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 243:
                                                                                i19 = zzaVarM7932 == zzaVarM2339 ? 51557 : 50875;
                                                                                break;
                                                                            case 4075:
                                                                                int i21 = 51588;
                                                                                while (true) {
                                                                                    i21 ^= 51605;
                                                                                    switch (i21) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i21 = 51619;
                                                                                            continue;
                                                                                        case 54:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    strM4563 = C0238.m4563(zzfVar);
                                                                                    break;
                                                                                }
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
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int iM7831 = C0400.m7830(zzfVar);
                                            int i22 = 51836;
                                            while (true) {
                                                i22 ^= 51853;
                                                switch (i22) {
                                                    case 241:
                                                        i22 = iM7831 == 0 ? 52580 : 52549;
                                                        break;
                                                    case 1963:
                                                        break;
                                                    case 1992:
                                                        listM6129 = C0317.m6129(zzfVar);
                                                        int i23 = 52735;
                                                        while (true) {
                                                            i23 ^= 52752;
                                                            switch (i23) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    ArrayList arrayList = new ArrayList(C0008.m171(listM6129));
                                                                    Iterator itM2089 = C0107.m2089(listM6129);
                                                                    while (true) {
                                                                        boolean zM3327 = C0174.m3327(itM2089);
                                                                        int i24 = 53634;
                                                                        while (true) {
                                                                            i24 ^= 53651;
                                                                            switch (i24) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i24 = zM3327 ? 53727 : 53696;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 76:
                                                                                    C0358.m6998(arrayList, C0226.m4331((String) C0414.m8115(itM2089), C0315.m6082()));
                                                                                    int i25 = 53758;
                                                                                    while (true) {
                                                                                        i25 ^= 53775;
                                                                                        switch (i25) {
                                                                                            case 1009:
                                                                                                i25 = 54440;
                                                                                                break;
                                                                                            case 1703:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            listM6129 = C0038.m754(arrayList);
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1007:
                                                                    i23 = zM1174 ? 53479 : 52797;
                                                                    break;
                                                                case 7927:
                                                                    int i26 = 53510;
                                                                    while (true) {
                                                                        i26 ^= 53527;
                                                                        switch (i26) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i26 = 53541;
                                                                                continue;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                    case 2025:
                                                        int i27 = 52611;
                                                        while (true) {
                                                            i27 ^= 52628;
                                                            switch (i27) {
                                                                case 23:
                                                                    i27 = 52642;
                                                                    continue;
                                                                case 54:
                                                                    listM6129 = null;
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
                                            zzew.zzf.zza zzaVarM9431 = C0485.m9430();
                                            int i28 = 54533;
                                            while (true) {
                                                i28 ^= 54550;
                                                switch (i28) {
                                                    case 19:
                                                        i28 = zzaVarM7932 == zzaVarM9431 ? 54626 : 54595;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 85:
                                                        str2 = null;
                                                        break;
                                                    case 116:
                                                        int i29 = 54657;
                                                        while (true) {
                                                            i29 ^= 54674;
                                                            switch (i29) {
                                                                case 19:
                                                                    i29 = 54688;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    str2 = strM4563;
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
                                            zzew.zzf.zza zzaVarM23310 = C0121.m2339();
                                            int i30 = 55432;
                                            while (true) {
                                                i30 ^= 55449;
                                                switch (i30) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (zzaVarM7932 == zzaVarM23310) {
                                                            i30 = 55525;
                                                        }
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 95:
                                                        int i31 = 56579;
                                                        while (true) {
                                                            i31 ^= 56596;
                                                            switch (i31) {
                                                                case 23:
                                                                    if (strM4563 == null) {
                                                                        i31 = 1507472;
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 85:
                                                                    break;
                                                                case 1564036:
                                                                    int i32 = 1507503;
                                                                    while (true) {
                                                                        i32 ^= 1507520;
                                                                        switch (i32) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 111:
                                                                                i32 = 1507534;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i31 = 56641;
                                                        }
                                                        break;
                                                    case 124:
                                                        int i33 = 55556;
                                                        while (true) {
                                                            i33 ^= 55573;
                                                            switch (i33) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (listM6129 != null) {
                                                                        i33 = 55649;
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    break;
                                                                case 116:
                                                                    boolean zM7153 = C0365.m7153(listM6129);
                                                                    int i34 = 55680;
                                                                    while (true) {
                                                                        i34 ^= 55697;
                                                                        switch (i34) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (zM7153) {
                                                                                    i34 = 56424;
                                                                                }
                                                                                break;
                                                                            case 1467:
                                                                                break;
                                                                            case 1496:
                                                                                break;
                                                                            case 1529:
                                                                                int i35 = 56455;
                                                                                while (true) {
                                                                                    i35 ^= 56472;
                                                                                    switch (i35) {
                                                                                        case 31:
                                                                                            i35 = 56486;
                                                                                            break;
                                                                                        case 62:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i34 = 56393;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i33 = 55618;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i30 = 55494;
                                            }
                                            int i36 = 1507627;
                                            while (true) {
                                                i36 ^= 1507644;
                                                switch (i36) {
                                                    case 23:
                                                        i36 = !zM1174 ? 1507720 : 1507689;
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 118:
                                                        break;
                                                    case 180:
                                                        int i37 = 1507751;
                                                        while (true) {
                                                            i37 ^= 1507768;
                                                            switch (i37) {
                                                                case 31:
                                                                    i37 = zzaVarM7932 == zzaVarM9431 ? 1508495 : 1508464;
                                                                    break;
                                                                case 1335:
                                                                    int i38 = 1508526;
                                                                    while (true) {
                                                                        i38 ^= 1508543;
                                                                        switch (i38) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i38 = 1508557;
                                                                                continue;
                                                                            case 114:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1480:
                                                                    str = C0226.m4331(str, C0315.m6082());
                                                                    break;
                                                                case 1513:
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
                                            switch (C0180.m3450()[C0344.m6740(zzaVarM7932)]) {
                                                case 1:
                                                    int i39 = 1511595;
                                                    while (true) {
                                                        i39 ^= 1511612;
                                                        switch (i39) {
                                                            case 23:
                                                                if (str2 == null) {
                                                                    i39 = 1512339;
                                                                }
                                                                break;
                                                            case 815:
                                                                int i40 = 1512370;
                                                                while (true) {
                                                                    i40 ^= 1512387;
                                                                    switch (i40) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 113:
                                                                            i40 = 1512401;
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 968:
                                                                int i41 = 1512494;
                                                                while (true) {
                                                                    i41 ^= 1512511;
                                                                    switch (i41) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i41 = zM1174 ? 1513238 : 1512556;
                                                                            break;
                                                                        case 83:
                                                                            i10 = 66;
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 809:
                                                                            int i42 = 1513269;
                                                                            while (true) {
                                                                                i42 ^= 1513286;
                                                                                switch (i42) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        i10 = 0;
                                                                                        break;
                                                                                    case 115:
                                                                                        i42 = 1513300;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                try {
                                                                    boolM192 = C0009.m192(C0298.m5729(C0172.m3286(C0483.m9396(str2, i10), str)));
                                                                    int i43 = 1513393;
                                                                    while (true) {
                                                                        i43 ^= 1513410;
                                                                        switch (i43) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 115:
                                                                                i43 = 1513424;
                                                                                break;
                                                                        }
                                                                    }
                                                                } catch (PatternSyntaxException e4) {
                                                                    C0420.m8245(C0331.m6385(d4Var), C0386.m7543(m6545(), 0, C0111.f137 ^ (-833), 1723), str2);
                                                                    break;
                                                                }
                                                                break;
                                                            case 1001:
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i39 = 1512308;
                                                    }
                                                    break;
                                                case 2:
                                                    boolM192 = C0009.m192(C0448.m8715(str, strM4563));
                                                    int i44 = 1511471;
                                                    while (true) {
                                                        i44 ^= 1511488;
                                                        switch (i44) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 111:
                                                                i44 = 1511502;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    boolM192 = C0009.m192(C0413.m8099(str, strM4563));
                                                    int i45 = 1511347;
                                                    while (true) {
                                                        i45 ^= 1511364;
                                                        switch (i45) {
                                                            case 22:
                                                                break;
                                                            case 119:
                                                                i45 = 1511378;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 4:
                                                    boolM192 = C0009.m192(C0248.m4748(str, strM4563));
                                                    int i46 = 1510572;
                                                    while (true) {
                                                        i46 ^= 1510589;
                                                        switch (i46) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i46 = 1510603;
                                                                break;
                                                            case 118:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 5:
                                                    boolM192 = C0009.m192(C0016.m321(str, strM4563));
                                                    int i47 = 1510448;
                                                    while (true) {
                                                        i47 ^= 1510465;
                                                        switch (i47) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 113:
                                                                i47 = 1510479;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 6:
                                                    int i48 = 1509425;
                                                    while (true) {
                                                        i48 ^= 1509442;
                                                        switch (i48) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                boolM192 = C0009.m192(C0108.m2099(listM6129, str));
                                                                int i49 = 1509673;
                                                                while (true) {
                                                                    i49 ^= 1509690;
                                                                    switch (i49) {
                                                                        case 19:
                                                                            i49 = 1510355;
                                                                            break;
                                                                        case 745:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 115:
                                                                if (listM6129 == null) {
                                                                    i48 = 1509518;
                                                                }
                                                                break;
                                                            case 204:
                                                                int i50 = 1509549;
                                                                while (true) {
                                                                    i50 ^= 1509566;
                                                                    switch (i50) {
                                                                        case 19:
                                                                            i50 = 1509580;
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i48 = 1509487;
                                                    }
                                                    break;
                                                default:
                                                    int i51 = 1508650;
                                                    while (true) {
                                                        i51 ^= 1508667;
                                                        switch (i51) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i51 = 1508681;
                                                                break;
                                                            case 114:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 47417:
                                            int i52 = 48767;
                                            while (true) {
                                                i52 ^= 48784;
                                                switch (i52) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i52 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48705;
                                }
                                break;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
        return boolM192;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:156:0x0229. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:163:0x0242. Please report as an issue. */
    public static Boolean e(BigDecimal bigDecimal, zzew.zzd zzdVar, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        boolean z10;
        boolean z11 = false;
        boolean z12 = true;
        C0271.m5173(zzdVar);
        boolean zM7593 = C0388.m7593(zzdVar);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM7593) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    zzew.zzd.zzb zzbVarM3494 = C0183.m3494(zzdVar);
                    zzew.zzd.zzb zzbVarM2682 = C0139.m2682();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zzbVarM3494 == zzbVarM2682) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                zzew.zzd.zzb zzbVarM3495 = C0183.m3494(zzdVar);
                                zzew.zzd.zzb zzbVarM6125 = C0317.m6125();
                                int i12 = 48767;
                                while (true) {
                                    i12 ^= 48784;
                                    switch (i12) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            boolean zM7327 = C0374.m7327(zzdVar);
                                            int i13 = 49790;
                                            while (true) {
                                                i13 ^= 49807;
                                                switch (i13) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        return null;
                                                    case 241:
                                                        i13 = !zM7327 ? 49883 : 49852;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 76:
                                            boolean zM4849 = C0254.m4849(zzdVar);
                                            int i14 = 48891;
                                            while (true) {
                                                i14 ^= 48908;
                                                switch (i14) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        return null;
                                                    case 503:
                                                        i14 = zM4849 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        boolean zM7642 = C0391.m7642(zzdVar);
                                                        int i15 = 49666;
                                                        while (true) {
                                                            i15 ^= 49683;
                                                            switch (i15) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!zM7642) {
                                                                        i15 = 49759;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    return null;
                                                                case 83:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i15 = 49728;
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i12 = zzbVarM3495 == zzbVarM6125 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                zzew.zzd.zzb zzbVarM3496 = C0183.m3494(zzdVar);
                                zzew.zzd.zzb zzbVarM3497 = C0183.m3494(zzdVar);
                                int i16 = 49914;
                                while (true) {
                                    i16 ^= 49931;
                                    switch (i16) {
                                        case 497:
                                            i16 = zzbVarM3497 == zzbVarM6125 ? 50658 : 50627;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            boolean zM3091 = C0161.m3091(C0067.m1305(zzdVar));
                                            int i17 = 51836;
                                            while (true) {
                                                i17 ^= 51853;
                                                switch (i17) {
                                                    case 241:
                                                        i17 = !zM3091 ? 52580 : 52549;
                                                        break;
                                                    case 1963:
                                                        break;
                                                    case 1992:
                                                        try {
                                                            bigDecimal2 = new BigDecimal(C0067.m1305(zzdVar));
                                                            bigDecimal3 = null;
                                                            bigDecimal4 = null;
                                                            break;
                                                        } catch (NumberFormatException e4) {
                                                            int i18 = 1510572;
                                                            while (true) {
                                                                i18 ^= 1510589;
                                                                switch (i18) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i18 = 1510603;
                                                                        break;
                                                                    case 118:
                                                                        return null;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 2025:
                                                        return null;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1769:
                                            boolean zM3092 = C0161.m3091(C0295.m5672(zzdVar));
                                            int i19 = 50689;
                                            while (true) {
                                                i19 ^= 50706;
                                                switch (i19) {
                                                    case 19:
                                                        i19 = zM3092 ? 50782 : 50751;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return null;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        boolean zM3093 = C0161.m3091(C0256.m4882(zzdVar));
                                                        int i20 = 50813;
                                                        while (true) {
                                                            i20 ^= 50830;
                                                            switch (i20) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    try {
                                                                        bigDecimal3 = new BigDecimal(C0295.m5672(zzdVar));
                                                                        bigDecimal4 = new BigDecimal(C0256.m4882(zzdVar));
                                                                        int i21 = 51712;
                                                                        while (true) {
                                                                            i21 ^= 51729;
                                                                            switch (i21) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    bigDecimal2 = null;
                                                                                    break;
                                                                                case 15:
                                                                                case Code.UNAUTHENTICATED /* 16 */:
                                                                                default:
                                                                                    continue;
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i21 = 51743;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                    } catch (NumberFormatException e10) {
                                                                        int i22 = 1510448;
                                                                        while (true) {
                                                                            i22 ^= 1510465;
                                                                            switch (i22) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    return null;
                                                                                case 113:
                                                                                    i22 = 1510479;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                case 243:
                                                                    i20 = !zM3093 ? 51557 : 50875;
                                                                    break;
                                                                case 4075:
                                                                    int i23 = 51588;
                                                                    while (true) {
                                                                        i23 ^= 51605;
                                                                        switch (i23) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i23 = 51619;
                                                                                break;
                                                                            case 54:
                                                                                return null;
                                                                        }
                                                                    }
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
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i24 = 52611;
                                while (true) {
                                    i24 ^= 52628;
                                    switch (i24) {
                                        case 23:
                                            i24 = zzbVarM3496 == zzbVarM6125 ? 52704 : 52673;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            int i25 = 53510;
                                            while (true) {
                                                i25 ^= 53527;
                                                switch (i25) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i25 = bigDecimal2 != null ? 53603 : 53572;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 83:
                                                        return null;
                                                    case 116:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 116:
                                            int i26 = 52735;
                                            while (true) {
                                                i26 ^= 52752;
                                                switch (i26) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 1007:
                                                        i26 = bigDecimal3 == null ? 53479 : 52797;
                                                        break;
                                                    case 7927:
                                                        return null;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i27 = C0467.m9090()[C0344.m6740(zzbVarM3496)];
                                int i28 = 53634;
                                while (true) {
                                    i28 ^= 53651;
                                    switch (i28) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (i27 != 1) {
                                                i28 = 53727;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            int i29 = C0170.f194 ^ (-151);
                                            int i30 = 53758;
                                            while (true) {
                                                i30 ^= 53775;
                                                switch (i30) {
                                                    case 1009:
                                                        if (i27 != i29) {
                                                            i30 = 54502;
                                                        }
                                                        break;
                                                    case 1703:
                                                        break;
                                                    case 1736:
                                                        int i31 = 1508650;
                                                        while (true) {
                                                            i31 ^= 1508667;
                                                            switch (i31) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (bigDecimal2 != null) {
                                                                        i31 = 1509394;
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    return null;
                                                                case 114:
                                                                    break;
                                                                case 3369:
                                                                    int iM2691 = C0139.m2691(bigDecimal, bigDecimal2);
                                                                    int i32 = 1509425;
                                                                    while (true) {
                                                                        i32 ^= 1509442;
                                                                        switch (i32) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                z12 = false;
                                                                                break;
                                                                            case 115:
                                                                                i32 = iM2691 > 0 ? 1509518 : 1509487;
                                                                                break;
                                                                            case 204:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    return C0009.m192(z12);
                                                                default:
                                                                    continue;
                                                            }
                                                            i31 = 1508712;
                                                        }
                                                        break;
                                                    case 1769:
                                                        int i33 = 54533;
                                                        while (true) {
                                                            i33 ^= 54550;
                                                            switch (i33) {
                                                                case 19:
                                                                    if (i27 != 3) {
                                                                        i33 = 54626;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 85:
                                                                    int i34 = 56579;
                                                                    while (true) {
                                                                        i34 ^= 56596;
                                                                        switch (i34) {
                                                                            case 23:
                                                                                if (bigDecimal2 != null) {
                                                                                    i34 = 1507472;
                                                                                }
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 85:
                                                                                return null;
                                                                            case 1564036:
                                                                                int i35 = 1507503;
                                                                                while (true) {
                                                                                    i35 ^= 1507520;
                                                                                    switch (i35) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            int iM2692 = C0139.m2691(bigDecimal, bigDecimal2);
                                                                                            int i36 = 1508526;
                                                                                            while (true) {
                                                                                                i36 ^= 1508543;
                                                                                                switch (i36) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i36 = iM2692 == 0 ? 1508619 : 1508588;
                                                                                                        break;
                                                                                                    case 83:
                                                                                                        z12 = false;
                                                                                                        break;
                                                                                                    case 114:
                                                                                                        break;
                                                                                                    case 436:
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            return C0009.m192(z12);
                                                                                        case 111:
                                                                                            if (d10 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                                                                                i35 = 1507596;
                                                                                            }
                                                                                            break;
                                                                                        case 460:
                                                                                            int iM2693 = C0139.m2691(bigDecimal, C0438.m8542(bigDecimal2, C0399.m7787(new BigDecimal(d10), new BigDecimal(i29))));
                                                                                            int i37 = 1507627;
                                                                                            while (true) {
                                                                                                i37 ^= 1507644;
                                                                                                switch (i37) {
                                                                                                    case 23:
                                                                                                        i37 = iM2693 > 0 ? 1507720 : 1507689;
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        break;
                                                                                                    case 118:
                                                                                                        break;
                                                                                                    case 180:
                                                                                                        int iM2694 = C0139.m2691(bigDecimal, C0062.m1182(bigDecimal2, C0399.m7787(new BigDecimal(d10), new BigDecimal(i29))));
                                                                                                        int i38 = 1507751;
                                                                                                        while (true) {
                                                                                                            i38 ^= 1507768;
                                                                                                            switch (i38) {
                                                                                                                case 31:
                                                                                                                    i38 = iM2694 < 0 ? 1508495 : 1508464;
                                                                                                                    break;
                                                                                                                case 1335:
                                                                                                                    z11 = true;
                                                                                                                    break;
                                                                                                                case 1480:
                                                                                                                    break;
                                                                                                                case 1513:
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
                                                                                            return C0009.m192(z11);
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i35 = 1507565;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i34 = 56641;
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    int i39 = 54657;
                                                                    while (true) {
                                                                        i39 ^= 54674;
                                                                        switch (i39) {
                                                                            case 19:
                                                                                if (i27 != 4) {
                                                                                    i39 = 55401;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                int i40 = 55556;
                                                                                while (true) {
                                                                                    i40 ^= 55573;
                                                                                    switch (i40) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (bigDecimal3 == null) {
                                                                                                i40 = 55649;
                                                                                            }
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        case 87:
                                                                                            int iM2695 = C0139.m2691(bigDecimal, bigDecimal3);
                                                                                            int i41 = 55680;
                                                                                            while (true) {
                                                                                                i41 ^= 55697;
                                                                                                switch (i41) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i41 = iM2695 >= 0 ? 56424 : 56393;
                                                                                                        break;
                                                                                                    case 1467:
                                                                                                        break;
                                                                                                    case 1496:
                                                                                                        z10 = false;
                                                                                                        break;
                                                                                                    case 1529:
                                                                                                        int iM2696 = C0139.m2691(bigDecimal, bigDecimal4);
                                                                                                        int i42 = 56455;
                                                                                                        while (true) {
                                                                                                            i42 ^= 56472;
                                                                                                            switch (i42) {
                                                                                                                case 31:
                                                                                                                    i42 = iM2696 <= 0 ? 56548 : 56517;
                                                                                                                    break;
                                                                                                                case 62:
                                                                                                                    break;
                                                                                                                case 93:
                                                                                                                    z10 = false;
                                                                                                                    break;
                                                                                                                case 124:
                                                                                                                    z10 = true;
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
                                                                                            return C0009.m192(z10);
                                                                                        case 116:
                                                                                            return null;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i40 = 55618;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 3579:
                                                                                int i43 = 55432;
                                                                                while (true) {
                                                                                    i43 ^= 55449;
                                                                                    switch (i43) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i43 = 55463;
                                                                                            break;
                                                                                        case 62:
                                                                                            return null;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i39 = 54719;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i33 = 54595;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i30 = 54471;
                                            }
                                            break;
                                        case 83:
                                            int i44 = 1509549;
                                            while (true) {
                                                i44 ^= 1509566;
                                                switch (i44) {
                                                    case 19:
                                                        if (bigDecimal2 != null) {
                                                            i44 = 1509642;
                                                        }
                                                        break;
                                                    case 85:
                                                        return null;
                                                    case 114:
                                                        break;
                                                    case 436:
                                                        int iM2697 = C0139.m2691(bigDecimal, bigDecimal2);
                                                        int i45 = 1509673;
                                                        while (true) {
                                                            i45 ^= 1509690;
                                                            switch (i45) {
                                                                case 19:
                                                                    i45 = iM2697 < 0 ? 1510417 : 1510386;
                                                                    break;
                                                                case 712:
                                                                    z12 = false;
                                                                    break;
                                                                case 745:
                                                                    break;
                                                                case 1323:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        return C0009.m192(z12);
                                                    default:
                                                        continue;
                                                }
                                                i44 = 1509611;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i28 = 53696;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i46 = 1864;
                                while (true) {
                                    i46 ^= 1881;
                                    switch (i46) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i46 = 48674;
                                            break;
                                        case 47483:
                                            return null;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    return null;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6545() {
        int iM1556 = C0072.m1556();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1556 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f533short;
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

    public abstract int a();

    public abstract boolean f();

    public abstract boolean g();
}
