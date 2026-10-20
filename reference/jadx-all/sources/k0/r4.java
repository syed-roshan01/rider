package k0;

import a.C0000;
import aa.C0012;
import android.support.v4.app.C0014;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.graphics.C0032;
import androidx.preference.C0044;
import c1.C0059;
import c4.C0065;
import c7.C0068;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.datatransport.cct.C0077;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.play.core.integrity.client.C0107;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.ktx.C0179;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0206;
import d1.C0212;
import d9.C0227;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.android.migration.C0240;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.aggregatedroot.C0247;
import dagger.hilt.internal.definecomponent.C0250;
import dagger.hilt.migration.C0255;
import e1.C0259;
import e2.C0262;
import ea.C0269;
import fa.C0281;
import g.C0285;
import g4.C0290;
import h5.C0307;
import i5.C0319;
import i6.C0321;
import i9.C0322;
import ja.C0331;
import k2.C0334;
import k8.C0339;
import l6.C0344;
import l9.C0348;
import la.C0349;
import m1.C0351;
import m3.C0353;
import m5.C0355;
import o5.C0371;
import p0.C0375;
import p5.C0378;
import q5.C0386;
import q7.C0390;
import r5.C0400;
import r5.C0401;
import r9.C0406;
import s2.C0412;
import s8.C0417;
import t0.C0419;
import t2.C0424;
import t3.C0425;
import t8.C0427;
import u4.C0436;
import v.C0440;
import v9.C0452;
import w0.C0455;
import w2.C0458;
import w5.C0464;
import w9.C0466;
import x5.C0471;
import y6.C0477;
import y9.C0479;
import z.C0481;
import z0.C0483;
import z1.C0484;
import z2.C0485;

/* JADX INFO: loaded from: classes.dex */
public final class r4 extends d9.j implements c9.h {
    public final c9.e A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.e f9423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4 f9424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.l f9427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.e f9428f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f9429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.e f9430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c9.e f9431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9.e f9432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c9.e f9433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c9.e f9434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a5 f9435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c9.e f9436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y.t0 f9438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f9439x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a2.c0 f9440y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a2.c0 f9441z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(c9.e eVar, m4 m4Var, boolean z10, boolean z11, x.l lVar, c9.e eVar2, String str, c9.e eVar3, c9.e eVar4, c9.e eVar5, c9.e eVar6, c9.e eVar7, a5 a5Var, c9.e eVar8, boolean z12, y.t0 t0Var, boolean z13, a2.c0 c0Var, a2.c0 c0Var2, c9.e eVar9) {
        super(C0466.f736 ^ 209);
        this.f9423a = eVar;
        this.f9424b = m4Var;
        this.f9425c = z10;
        this.f9426d = z11;
        this.f9427e = lVar;
        this.f9428f = eVar2;
        this.f9429n = str;
        this.f9430o = eVar3;
        this.f9431p = eVar4;
        this.f9432q = eVar5;
        this.f9433r = eVar6;
        this.f9434s = eVar7;
        this.f9435t = a5Var;
        this.f9436u = eVar8;
        this.f9437v = z12;
        this.f9438w = t0Var;
        this.f9439x = z13;
        this.f9440y = c0Var;
        this.f9441z = c0Var2;
        this.A = eVar9;
        int iM8793 = C0452.m8793();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8793 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0269.m5134("qJLqQU6ynbkPdjO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:120:0x01bb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x01e5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:234:0x03ea. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:267:0x0463. Please report as an issue. */
    @Override // c9.h
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Integer num) {
        int i10;
        int i11;
        u0.b bVarM1122;
        long jM9042;
        u0.b bVarM1123;
        long jM6650;
        u0.b bVarM1124;
        long jM7560;
        u0.b bVarM1125;
        long jM1670;
        u0.b bVarM1126;
        long jM7630;
        u0.b bVarM1127;
        long jM632;
        u0.b bVarM1128;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float fM3299 = C0173.m3299((Number) obj);
        long jM8864 = C0455.m8864((e1.r) obj2);
        long jM8865 = C0455.m8864((e1.r) obj3);
        float fM32910 = C0173.m3299((Number) obj4);
        float fM32911 = C0173.m3299((Number) obj5);
        m0.m mVar = (m0.m) obj6;
        int iM8515 = C0436.m8515(num);
        int i17 = C0484.f757;
        int i18 = 1616;
        while (true) {
            i18 ^= 1633;
            switch (i18) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i18 = ((i17 ^ (-779)) & iM8515) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM5919 = C0307.m5919((m0.q) mVar, fM3299);
                    int i19 = 1740;
                    while (true) {
                        i19 ^= 1757;
                        switch (i19) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i19 = zM5919 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i16 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i16 = 4;
                                int i20 = 1864;
                                while (true) {
                                    i20 ^= 1881;
                                    switch (i20) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = 48674;
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
                    int i21 = (i16 & iM8515) | (i16 ^ iM8515);
                    int i22 = 48767;
                    while (true) {
                        i22 ^= 48784;
                        switch (i22) {
                            case Code.UNAVAILABLE /* 14 */:
                                i10 = i21;
                                break;
                            case 239:
                                i22 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i10 = iM8515;
                    break;
                default:
                    break;
            }
        }
        int i23 = C0247.f326;
        int i24 = 48891;
        while (true) {
            i24 ^= 48908;
            switch (i24) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i24 = ((i23 ^ (-702)) & iM8515) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM4041 = C0212.m4041((m0.q) mVar, jM8864);
                    int i25 = 49666;
                    while (true) {
                        i25 ^= 49683;
                        switch (i25) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i25 = zM4041 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i15 = 32;
                                int i26 = 49790;
                                while (true) {
                                    i26 ^= 49807;
                                    switch (i26) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i26 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i15 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i10 = (i10 ^ i15) | (i15 & i10);
                    break;
                default:
                    break;
            }
        }
        int i27 = C0240.f319;
        int i28 = 49914;
        while (true) {
            i28 ^= 49931;
            switch (i28) {
                case 497:
                    i28 = ((i27 ^ 330) & iM8515) == 0 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    boolean zM4042 = C0212.m4041((m0.q) mVar, jM8865);
                    int i29 = 50689;
                    while (true) {
                        i29 ^= 50706;
                        switch (i29) {
                            case 19:
                                i29 = zM4042 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i14 = 128;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i14 = 256;
                                int i30 = 50813;
                                while (true) {
                                    i30 ^= 50830;
                                    switch (i30) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i30 = 50844;
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
                    i10 = (i10 ^ i14) | (i14 & i10);
                    break;
                default:
                    break;
            }
        }
        int i31 = C0160.f184;
        int i32 = 51588;
        while (true) {
            i32 ^= 51605;
            switch (i32) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i32 = ((i31 ^ 3819) & iM8515) == 0 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    break;
                case 116:
                    boolean zM59110 = C0307.m5919((m0.q) mVar, fM32910);
                    int i33 = 51712;
                    while (true) {
                        i33 ^= 51729;
                        switch (i33) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i33 = zM59110 ? 51805 : 51774;
                                break;
                            case 47:
                                i13 = 1024;
                                break;
                            case 76:
                                i13 = 2048;
                                int i34 = 51836;
                                while (true) {
                                    i34 ^= 51853;
                                    switch (i34) {
                                        case 241:
                                            i34 = 52518;
                                            continue;
                                        case 1963:
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
                    i10 = (i10 ^ i13) | (i13 & i10);
                    break;
                default:
                    break;
            }
        }
        int i35 = C0244.f323;
        int i36 = 52611;
        while (true) {
            i36 ^= 52628;
            switch (i36) {
                case 23:
                    i36 = ((i35 ^ 24688) & iM8515) == 0 ? 52704 : 52673;
                    break;
                case 54:
                    break;
                case 85:
                    i11 = i10;
                    break;
                case 116:
                    boolean zM59111 = C0307.m5919((m0.q) mVar, fM32911);
                    int i37 = 52735;
                    while (true) {
                        i37 ^= 52752;
                        switch (i37) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i12 = 8192;
                                break;
                            case 1007:
                                i37 = zM59111 ? 53479 : 52797;
                                break;
                            case 7927:
                                i12 = 16384;
                                int i38 = 53510;
                                while (true) {
                                    i38 ^= 53527;
                                    switch (i38) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i38 = 53541;
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
                    i11 = (i10 ^ i12) | (i12 & i10);
                    break;
                default:
                    break;
            }
        }
        int i39 = 53634;
        while (true) {
            i39 ^= 53651;
            switch (i39) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i39 = (74899 & ((i11 ^ (-1)) ^ 74899)) == 74898 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i40 = 53758;
                    while (true) {
                        i40 ^= 53775;
                        switch (i40) {
                            case 1009:
                                i40 = !zM1625 ? 54502 : 54471;
                                break;
                            case 1703:
                                break;
                            case 1736:
                                C0471.m9156(qVar);
                                int i41 = 54657;
                                while (true) {
                                    i41 ^= 54674;
                                    switch (i41) {
                                        case 19:
                                            i41 = 54688;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                    }
                                }
                                break;
                            case 1769:
                                int i42 = 54533;
                                while (true) {
                                    i42 ^= 54550;
                                    switch (i42) {
                                        case 19:
                                            i42 = 54564;
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
                case 83:
                    break;
                default:
                    break;
            }
            return C0012.m238();
        }
        c9.e eVarM854 = C0044.m854(this);
        int i43 = 55432;
        while (true) {
            i43 ^= 55449;
            switch (i43) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i43 = eVarM854 != null ? 55525 : 55494;
                    break;
                case 62:
                    break;
                case 95:
                    bVarM1122 = null;
                    break;
                case 124:
                    bVarM1122 = C0059.m1122(mVar, (-382297624) ^ C0355.f625, new n4(fM3299, jM8865, eVarM854, C0485.m9428(this), jM8864));
                    int i44 = 55556;
                    while (true) {
                        i44 ^= 55573;
                        switch (i44) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i44 = 55587;
                                continue;
                            case 54:
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
        m4 m4VarM3405 = C0179.m3405(this);
        C0014.m280(m4VarM3405);
        m0.q qVar2 = (m0.q) mVar;
        C0262.m4990(qVar2, 653850665 ^ C0244.f323);
        x.l lVarM8303 = C0424.m8303(this);
        m0.g1 g1VarM7951 = C0406.m7951(lVarM8303, qVar2, 0);
        boolean zM465 = C0023.m465(this);
        boolean zM282 = C0014.m282(this);
        int i45 = 55680;
        while (true) {
            i45 ^= 55697;
            switch (i45) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i45 = !zM282 ? 56424 : 56393;
                    break;
                case 1467:
                    break;
                case 1496:
                    int i46 = 56579;
                    while (true) {
                        i46 ^= 56596;
                        switch (i46) {
                            case 23:
                                i46 = zM465 ? 1507472 : 56641;
                                break;
                            case 54:
                                break;
                            case 85:
                                boolean zM14 = C0000.m14((Boolean) C0419.m8214(g1VarM7951));
                                int i47 = 1507627;
                                while (true) {
                                    i47 ^= 1507644;
                                    switch (i47) {
                                        case 23:
                                            i47 = zM14 ? 1507720 : 1507689;
                                            break;
                                        case 85:
                                            jM9042 = C0464.m9042(m4VarM3405);
                                            break;
                                        case 118:
                                            break;
                                        case 180:
                                            jM9042 = C0322.m6221(m4VarM3405);
                                            int i48 = 1507751;
                                            while (true) {
                                                i48 ^= 1507768;
                                                switch (i48) {
                                                    case 31:
                                                        i48 = 1508433;
                                                        continue;
                                                    case 1513:
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
                            case 1564036:
                                jM9042 = C0065.m1247(m4VarM3405);
                                int i49 = 1507503;
                                while (true) {
                                    i49 ^= 1507520;
                                    switch (i49) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 111:
                                            i49 = 1507534;
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
                    break;
                case 1529:
                    jM9042 = C0044.m863(m4VarM3405);
                    int i50 = 56455;
                    while (true) {
                        i50 ^= 56472;
                        switch (i50) {
                            case 31:
                                i50 = 56486;
                                continue;
                            case 62:
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
        m0.g1 g1VarM862 = C0044.m862(new e1.r(jM9042), qVar2);
        C0171.m3270(qVar2, false);
        long jM8866 = C0455.m8864((e1.r) C0419.m8214(g1VarM862));
        c9.e eVarM2956 = C0154.m2956(this);
        int i51 = 1508526;
        while (true) {
            i51 ^= 1508543;
            switch (i51) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i51 = eVarM2956 != null ? 1508619 : 1508588;
                    break;
                case 83:
                    bVarM1123 = null;
                    break;
                case 114:
                    break;
                case 436:
                    int iM8181 = C0417.m8181(C0331.m6382(this));
                    int i52 = 1508650;
                    while (true) {
                        i52 ^= 1508667;
                        switch (i52) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i52 = iM8181 == 0 ? 1509394 : 1508712;
                                break;
                            case 83:
                                bVarM1123 = null;
                                break;
                            case 114:
                                break;
                            case 3369:
                                int i53 = 1509425;
                                while (true) {
                                    i53 ^= 1509442;
                                    switch (i53) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            bVarM1123 = null;
                                            break;
                                        case 115:
                                            i53 = fM32910 > 0.0f ? 1509518 : 1509487;
                                            break;
                                        case 204:
                                            bVarM1123 = C0059.m1122(mVar, (-524658246) ^ C0483.f756, new p4(fM32910, jM8866, eVarM2956));
                                            int i54 = 1509549;
                                            while (true) {
                                                i54 ^= 1509566;
                                                switch (i54) {
                                                    case 19:
                                                        i54 = 1509580;
                                                        continue;
                                                    case 114:
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
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        C0262.m4990(qVar2, 129569531 ^ C0319.f466);
        m0.g1 g1VarM7952 = C0406.m7951(lVarM8303, qVar2, 0);
        int i55 = 1509673;
        while (true) {
            i55 ^= 1509690;
            switch (i55) {
                case 19:
                    i55 = !zM282 ? 1510417 : 1510386;
                    break;
                case 712:
                    int i56 = 1510572;
                    while (true) {
                        i56 ^= 1510589;
                        switch (i56) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i56 = zM465 ? 1511316 : 1510634;
                                break;
                            case 87:
                                boolean zM15 = C0000.m14((Boolean) C0419.m8214(g1VarM7952));
                                int i57 = 1511471;
                                while (true) {
                                    i57 ^= 1511488;
                                    switch (i57) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            jM6650 = C0339.m6650(m4VarM3405);
                                            break;
                                        case 111:
                                            i57 = zM15 ? 1511564 : 1511533;
                                            break;
                                        case 204:
                                            jM6650 = C0307.m5922(m4VarM3405);
                                            int i58 = 1511595;
                                            while (true) {
                                                i58 ^= 1511612;
                                                switch (i58) {
                                                    case 23:
                                                        i58 = 1512277;
                                                        continue;
                                                    case 1001:
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
                            case 118:
                                break;
                            case 809:
                                jM6650 = C0425.m8328(m4VarM3405);
                                int i59 = 1511347;
                                while (true) {
                                    i59 ^= 1511364;
                                    switch (i59) {
                                        case 22:
                                            break;
                                        case 119:
                                            i59 = 1511378;
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
                    break;
                case 745:
                    break;
                case 1323:
                    jM6650 = C0400.m7818(m4VarM3405);
                    int i60 = 1510448;
                    while (true) {
                        i60 ^= 1510465;
                        switch (i60) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 113:
                                i60 = 1510479;
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
        m0.g1 g1VarM863 = C0044.m862(new e1.r(jM6650), qVar2);
        C0171.m3270(qVar2, false);
        long jM8867 = C0455.m8864((e1.r) C0419.m8214(g1VarM863));
        c9.e eVarM6813 = C0349.m6813(this);
        int i61 = 1512370;
        while (true) {
            i61 ^= 1512387;
            switch (i61) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    bVarM1124 = null;
                    break;
                case 113:
                    i61 = eVarM6813 != null ? 1512463 : 1512432;
                    break;
                case 1996:
                    int i62 = 1512494;
                    while (true) {
                        i62 ^= 1512511;
                        switch (i62) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i62 = fM32911 > 0.0f ? 1513238 : 1512556;
                                break;
                            case 83:
                                bVarM1124 = null;
                                break;
                            case 114:
                                break;
                            case 809:
                                bVarM1124 = C0059.m1122(mVar, (-1824482955) ^ C0151.f176, new q4(fM32911, jM8867, C0440.m8570(this), eVarM6813, 0));
                                int i63 = 1513269;
                                while (true) {
                                    i63 ^= 1513286;
                                    switch (i63) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 115:
                                            i63 = 1513300;
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
        C0262.m4990(qVar2, 1575329375 ^ C0193.f217);
        m0.g1 g1VarM7953 = C0406.m7951(lVarM8303, qVar2, 0);
        int i64 = 1513393;
        while (true) {
            i64 ^= 1513410;
            switch (i64) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    int i65 = 1514292;
                    while (true) {
                        i65 ^= 1514309;
                        switch (i65) {
                            case 22:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                boolean zM16 = C0000.m14((Boolean) C0419.m8214(g1VarM7953));
                                int i66 = 1515191;
                                while (true) {
                                    i66 ^= 1515208;
                                    switch (i66) {
                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                            break;
                                        case 61:
                                            jM7560 = C0386.m7560(m4VarM3405);
                                            break;
                                        case 127:
                                            i66 = zM16 ? 1515284 : 1515253;
                                            break;
                                        case 476:
                                            jM7560 = C0458.m8907(m4VarM3405);
                                            int i67 = 1515315;
                                            while (true) {
                                                i67 ^= 1515332;
                                                switch (i67) {
                                                    case 22:
                                                        break;
                                                    case 119:
                                                        i67 = 1515346;
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
                                break;
                            case 113:
                                i65 = zM465 ? 1514385 : 1514354;
                                break;
                            case 212:
                                jM7560 = C0281.m5418(m4VarM3405);
                                int i68 = 1514416;
                                while (true) {
                                    i68 ^= 1514433;
                                    switch (i68) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 113:
                                            i68 = 1514447;
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
                    break;
                case 115:
                    i64 = !zM282 ? 1513486 : 1513455;
                    break;
                case 4044:
                    jM7560 = C0160.m3065(m4VarM3405);
                    int i69 = 1513517;
                    while (true) {
                        i69 ^= 1513534;
                        switch (i69) {
                            case 19:
                                i69 = 1514199;
                                continue;
                            case 745:
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
        m0.g1 g1VarM864 = C0044.m862(new e1.r(jM7560), qVar2);
        C0171.m3270(qVar2, false);
        long jM8868 = C0455.m8864((e1.r) C0419.m8214(g1VarM864));
        c9.e eVarM393 = C0019.m393(this);
        int i70 = 1515439;
        while (true) {
            i70 ^= 1515456;
            switch (i70) {
                case 111:
                    i70 = eVarM393 != null ? 1516183 : 1516152;
                    break;
                case 15703:
                    int i71 = 1516214;
                    while (true) {
                        i71 ^= 1516231;
                        switch (i71) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                bVarM1125 = null;
                                break;
                            case 113:
                                i71 = fM32911 > 0.0f ? 1516307 : 1516276;
                                break;
                            case 468:
                                bVarM1125 = C0059.m1122(mVar, 907456071 ^ C0110.f136, new q4(fM32911, jM8868, C0440.m8570(this), eVarM393, 1));
                                int i72 = 1516338;
                                while (true) {
                                    i72 ^= 1516355;
                                    switch (i72) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 113:
                                            i72 = 1516369;
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
                    break;
                case 15769:
                    break;
                case 15800:
                    bVarM1125 = null;
                    break;
                default:
                    break;
            }
        }
        C0262.m4990(qVar2, (-925127499) ^ C0351.f621);
        m0.g1 g1VarM7954 = C0406.m7951(lVarM8303, qVar2, 0);
        int i73 = 1537294;
        while (true) {
            i73 ^= 1537311;
            switch (i73) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i73 = !zM282 ? 1537387 : 1537356;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 83:
                    int i74 = 1537542;
                    while (true) {
                        i74 ^= 1537559;
                        switch (i74) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i74 = zM465 ? 1538286 : 1538255;
                                break;
                            case 3751:
                                break;
                            case 3800:
                                boolean zM17 = C0000.m14((Boolean) C0419.m8214(g1VarM7954));
                                int i75 = 1538441;
                                while (true) {
                                    i75 ^= 1538458;
                                    switch (i75) {
                                        case 19:
                                            i75 = zM17 ? 1539185 : 1538503;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 93:
                                            jM1670 = C0077.m1670(m4VarM3405);
                                            break;
                                        case 1515:
                                            jM1670 = C0419.m8228(m4VarM3405);
                                            int i76 = 1539216;
                                            while (true) {
                                                i76 ^= 1539233;
                                                switch (i76) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 49:
                                                        i76 = 1539247;
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
                                break;
                            case 3833:
                                jM1670 = C0068.m1318(m4VarM3405);
                                int i77 = 1538317;
                                while (true) {
                                    i77 ^= 1538334;
                                    switch (i77) {
                                        case 19:
                                            i77 = 1538348;
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
                case 116:
                    jM1670 = C0065.m1253(m4VarM3405);
                    int i78 = 1537418;
                    while (true) {
                        i78 ^= 1537435;
                        switch (i78) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i78 = 1537449;
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
        m0.g1 g1VarM865 = C0044.m862(new e1.r(jM1670), qVar2);
        C0171.m3270(qVar2, false);
        long jM8869 = C0455.m8864((e1.r) C0419.m8214(g1VarM865));
        c9.e eVarM4674 = C0244.m4674(this);
        int i79 = 1539340;
        while (true) {
            i79 ^= 1539357;
            switch (i79) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (eVarM4674 != null) {
                        i79 = 1539433;
                    }
                    break;
                case 54:
                    break;
                case 87:
                    bVarM1126 = null;
                    break;
                case 116:
                    bVarM1126 = C0059.m1122(mVar, 90769922 ^ C0253.f332, new o4(jM8869, eVarM4674, 0));
                    int i80 = 1539464;
                    while (true) {
                        i80 ^= 1539481;
                        switch (i80) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i80 = 1540146;
                                break;
                            case 64939:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i79 = 1539402;
        }
        C0262.m4990(qVar2, (-109503688) ^ C0477.f750);
        m0.g1 g1VarM7955 = C0406.m7951(lVarM8303, qVar2, 0);
        int i81 = 1540239;
        while (true) {
            i81 ^= 1540256;
            switch (i81) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 47:
                    i81 = !zM282 ? 1540332 : 1540301;
                    break;
                case 76:
                    jM7630 = C0142.m2733(m4VarM3405);
                    int i82 = 1540363;
                    while (true) {
                        i82 ^= 1540380;
                        switch (i82) {
                            case 23:
                                i82 = 1540394;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 109:
                    int i83 = 1541138;
                    while (true) {
                        i83 ^= 1541155;
                        switch (i83) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 49:
                                i83 = zM465 ? 1541231 : 1541200;
                                break;
                            case 76:
                                jM7630 = C0371.m7271(m4VarM3405);
                                int i84 = 1541262;
                                while (true) {
                                    i84 ^= 1541279;
                                    switch (i84) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i84 = 1541293;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 115:
                                boolean zM18 = C0000.m14((Boolean) C0419.m8214(g1VarM7955));
                                int i85 = 1541386;
                                while (true) {
                                    i85 ^= 1541403;
                                    switch (i85) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i85 = zM18 ? 1542130 : 1542099;
                                            break;
                                        case 687:
                                            break;
                                        case 712:
                                            jM7630 = C0390.m7630(m4VarM3405);
                                            break;
                                        case 745:
                                            jM7630 = C0334.m6478(m4VarM3405);
                                            int i86 = 1542161;
                                            while (true) {
                                                i86 ^= 1542178;
                                                switch (i86) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        i86 = 1542192;
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
        m0.g1 g1VarM866 = C0044.m862(new e1.r(jM7630), qVar2);
        C0171.m3270(qVar2, false);
        long jM88610 = C0455.m8864((e1.r) C0419.m8214(g1VarM866));
        c9.e eVarM4579 = C0238.m4579(this);
        int i87 = 1542285;
        while (true) {
            i87 ^= 1542302;
            switch (i87) {
                case 19:
                    i87 = eVarM4579 != null ? 1543029 : 1542347;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 85:
                    bVarM1127 = null;
                    break;
                case 1003:
                    bVarM1127 = C0059.m1122(mVar, (-2077795329) ^ C0250.f329, new o4(jM88610, eVarM4579, 1));
                    int i88 = 1543060;
                    while (true) {
                        i88 ^= 1543077;
                        switch (i88) {
                            case 22:
                                break;
                            case 49:
                                i88 = 1543091;
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
        C0262.m4990(qVar2, (-1464709226) ^ C0079.f113);
        m0.g1 g1VarM7956 = C0406.m7951(lVarM8303, qVar2, 0);
        int i89 = 1543184;
        while (true) {
            i89 ^= 1543201;
            switch (i89) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i89 = !zM282 ? 1543277 : 1543246;
                    break;
                case 76:
                    jM632 = C0107.m2087(m4VarM3405);
                    int i90 = 1543308;
                    while (true) {
                        i90 ^= 1543325;
                        switch (i90) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i90 = 1543990;
                                continue;
                            case 939:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 111:
                    int i91 = 1544083;
                    while (true) {
                        i91 ^= 1544100;
                        switch (i91) {
                            case 22:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                i91 = zM465 ? 1544176 : 1544145;
                                break;
                            case 84:
                                jM632 = C0481.m9351(m4VarM3405);
                                int i92 = 1544207;
                                while (true) {
                                    i92 ^= 1544224;
                                    switch (i92) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 47:
                                            i92 = 1544238;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 117:
                                boolean zM19 = C0000.m14((Boolean) C0419.m8214(g1VarM7956));
                                int i93 = 1544982;
                                while (true) {
                                    i93 ^= 1544999;
                                    switch (i93) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 49:
                                            i93 = zM19 ? 1545075 : 1545044;
                                            break;
                                        case 84:
                                            jM632 = C0180.m3438(m4VarM3405);
                                            int i94 = 1545106;
                                            while (true) {
                                                i94 ^= 1545123;
                                                switch (i94) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 49:
                                                        i94 = 1545137;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 115:
                                            jM632 = C0032.m632(m4VarM3405);
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
        m0.g1 g1VarM867 = C0044.m862(new e1.r(jM632), qVar2);
        C0171.m3270(qVar2, false);
        long jM88611 = C0455.m8864((e1.r) C0419.m8214(g1VarM867));
        c9.e eVarM3944 = C0206.m3944(this);
        int i95 = 1545230;
        while (true) {
            i95 ^= 1545247;
            switch (i95) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i95 = eVarM3944 != null ? 1545974 : 1545943;
                    break;
                case 679:
                    break;
                case 712:
                    bVarM1128 = null;
                    break;
                case 745:
                    bVarM1128 = C0059.m1122(mVar, (-1531019778) ^ C0401.f671, new e0(jM88611, C0290.m5582(this), eVarM3944, 2));
                    int i96 = 1546005;
                    while (true) {
                        i96 ^= 1546022;
                        switch (i96) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                i96 = 1546036;
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
        int iM6740 = C0344.m6740(C0477.m9293(this));
        y0.l lVarM4370 = C0227.m4370();
        c9.e eVarM4544 = C0237.m4544(this);
        int i97 = 1546129;
        while (true) {
            i97 ^= 1546146;
            switch (i97) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    if (iM6740 != 0) {
                        i97 = 1567054;
                    }
                    break;
                case 109:
                    C0262.m4990(qVar2, (-404042203) ^ C0247.f326);
                    u0.b bVarM1129 = C0059.m1122(qVar2, (-2124778881) ^ C0371.f641, new y3(eVarM4544, 1));
                    c9.e eVarM7833 = C0401.m7833(this);
                    boolean zM4494 = C0234.m4494(this);
                    y.t0 t0VarM6199 = C0321.m6199(this);
                    int i98 = i11 << (C0028.f48 ^ 352);
                    C0181.m3466(lVarM4370, eVarM7833, bVarM1122, bVarM1123, bVarM1126, bVarM1127, bVarM1124, bVarM1125, zM4494, fM3299, bVarM1129, bVarM1128, t0VarM6199, qVar2, (i98 & ((-1879048193) ^ i98)) | (C0146.f171 ^ (-435)), 6);
                    C0171.m3270(qVar2, false);
                    break;
                case 32492:
                    int i99 = 1567085;
                    while (true) {
                        i99 ^= 1567102;
                        switch (i99) {
                            case 19:
                                if (iM6740 != 1) {
                                    i99 = 1567178;
                                }
                                break;
                            case 180:
                                C0262.m4990(qVar2, 404045625 ^ C0259.f338);
                                C0171.m3270(qVar2, false);
                                int i100 = 1567209;
                                while (true) {
                                    i100 ^= 1567226;
                                    switch (i100) {
                                        case 19:
                                            i100 = 1567240;
                                            break;
                                        case 1010:
                                            break;
                                    }
                                }
                                break;
                            case 213:
                                C0262.m4990(qVar2, (-404043636) ^ C0019.f39);
                                C0262.m4990(qVar2, (-404042869) ^ C0375.f645);
                                Object objM8078 = C0412.m8078(qVar2);
                                Object objM2417 = C0125.m2417();
                                int i101 = 1567333;
                                while (true) {
                                    i101 ^= 1567350;
                                    switch (i101) {
                                        case 19:
                                            i101 = objM8078 == objM2417 ? 1568077 : 1568046;
                                            break;
                                        case 1851:
                                            objM8078 = C0173.m3305(new d1.f(C0427.m8361()), C0111.m2137());
                                            C0479.m9328(qVar2, objM8078);
                                            break;
                                        case 1880:
                                            break;
                                        case 1913:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                m0.g1 g1Var = (m0.g1) objM8078;
                                C0171.m3270(qVar2, false);
                                u0.b bVarM11210 = C0059.m1122(qVar2, 1902534768 ^ C0285.f429, new c((Object) g1Var, (Object) C0321.m6199(this), eVarM4544, 1));
                                c9.e eVarM7834 = C0401.m7833(this);
                                boolean zM4495 = C0234.m4494(this);
                                C0262.m4990(qVar2, 404044754 ^ C0378.f648);
                                int i102 = C0244.f323;
                                int i103 = 1568108;
                                while (true) {
                                    i103 ^= 1568125;
                                    switch (i103) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i103 = ((i102 ^ 126) & i11) == 4 ? 1568201 : 1568170;
                                            break;
                                        case 180:
                                            z10 = true;
                                            int i104 = 1568232;
                                            while (true) {
                                                i104 ^= 1568249;
                                                switch (i104) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i104 = 1568263;
                                                        continue;
                                                    case 1022:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 215:
                                            z10 = false;
                                            break;
                                        case 246:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                Object objM8079 = C0412.m8078(qVar2);
                                int i105 = 1569007;
                                while (true) {
                                    i105 ^= 1569024;
                                    switch (i105) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            objM8079 = new t.r1(fM3299, g1Var);
                                            C0479.m9328(qVar2, objM8079);
                                            break;
                                        case 76:
                                            int i106 = 1569131;
                                            while (true) {
                                                i106 ^= 1569148;
                                                switch (i106) {
                                                    case 23:
                                                        i106 = objM8079 == objM2417 ? 1569224 : 1569193;
                                                        break;
                                                    case 180:
                                                        objM8079 = new t.r1(fM3299, g1Var);
                                                        C0479.m9328(qVar2, objM8079);
                                                        break;
                                                    case 213:
                                                        break;
                                                    case 246:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 495:
                                            i105 = !z10 ? 1569100 : 1569069;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0171.m3270(qVar2, false);
                                y.t0 t0VarM61910 = C0321.m6199(this);
                                int i107 = i11 << (C0353.f623 ^ (-618));
                                C0255.m4859(lVarM4370, eVarM7834, bVarM1123, bVarM1122, bVarM1126, bVarM1127, bVarM1124, bVarM1125, zM4495, fM3299, (c9.c) objM8079, bVarM11210, bVarM1128, t0VarM61910, qVar2, (i107 & ((-1879048193) ^ i107)) | (C0348.f618 ^ 390), C0031.f51 ^ (-170));
                                C0171.m3270(qVar2, false);
                                int i108 = 1569255;
                                while (true) {
                                    i108 ^= 1569272;
                                    switch (i108) {
                                        case 31:
                                            i108 = 1569937;
                                            break;
                                        case 1385:
                                            break;
                                    }
                                }
                                break;
                            case 242:
                                break;
                            default:
                                continue;
                        }
                        i99 = 1567147;
                    }
                    break;
                default:
                    continue;
            }
            i97 = 1546191;
        }
        return C0012.m238();
    }
}
