package k0;

import a7.C0008;
import aa.C0012;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.key.C0033;
import androidx.preference.C0044;
import androidx.versionedparcelable.C0048;
import b3.C0051;
import b7.C0054;
import c0.C0057;
import com.auto.accept.data.model.C0071;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.encoders.C0143;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.firebase.remoteconfiginterop.C0203;
import d7.C0219;
import d8.C0221;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.generatesrootinput.C0250;
import dagger.hilt.migration.C0254;
import g.C0284;
import h.C0296;
import h1.C0300;
import h3.C0302;
import h8.C0313;
import i.C0315;
import java.util.ArrayList;
import java.util.List;
import k.C0331;
import l0.C0340;
import l2.C0341;
import m0.C0349;
import m1.C0350;
import m7.C0357;
import m9.C0359;
import n9.C0366;
import o1.C0367;
import p0.C0374;
import p8.C0379;
import s.C0408;
import t2.C0420;
import w.C0453;
import w4.C0461;
import y6.C0477;
import z.C0480;
import z3.C0485;
import z3.C0486;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.i1 f8969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f8970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f8971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.e f8972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8974f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y.i1 f8975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f8976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c9.e f8977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9.f f8978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8979r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(r1.i1 i1Var, c9.e eVar, c9.e eVar2, c9.e eVar3, int i10, int i11, y.i1 i1Var2, long j10, c9.e eVar4, c9.f fVar, int i12) {
        super(1);
        this.f8969a = i1Var;
        this.f8970b = eVar;
        this.f8971c = eVar2;
        this.f8972d = eVar3;
        this.f8973e = i10;
        this.f8974f = i11;
        this.f8975n = i1Var2;
        this.f8976o = j10;
        this.f8977p = eVar4;
        this.f8978q = fVar;
        this.f8979r = i12;
        int iM3762 = C0196.m3762();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3762 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0195.m3747("fi")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:1134:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1135:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1137:0x0636 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:844:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:845:0x06b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:847:0x0612 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:124:0x0240. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:181:0x0314. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:202:0x0376. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:224:0x03f7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:287:0x04eb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:293:0x04fc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:335:0x05ae. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:407:0x06fd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:449:0x07ae. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:455:0x07be. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x00e4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:553:0x0966. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:568:0x09a9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:582:0x09e7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:596:0x0a29. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x002b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:610:0x0a86. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:624:0x0aba. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:644:0x0b08. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x0147. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c9.c
    public final Object invoke(Object obj) {
        Object obj2;
        int iM6867;
        Object obj3;
        int i10;
        Object obj4;
        int i11;
        b3.s sVar;
        Object obj5;
        Integer numM1083;
        Integer num;
        int i12;
        int iM7190;
        int iM3559;
        int iM7191;
        int iM2912;
        Object obj6;
        Object obj7;
        int iM2913;
        int iM2914;
        int i13;
        int i14;
        r1.w0 w0Var = (r1.w0) obj;
        o2 o2VarM6841 = C0349.m6841();
        c9.e eVarM1052 = C0054.m1052(this);
        r1.i1 i1VarM5832 = C0302.m5832(this);
        List listM1463 = C0071.m1463(i1VarM5832, o2VarM6841, eVarM1052);
        ArrayList arrayList = new ArrayList(C0008.m171(listM1463));
        int iM171 = C0008.m171(listM1463);
        int i15 = 0;
        while (true) {
            int i16 = i15;
            long jM433 = C0022.m433(this);
            int i17 = 1616;
            while (true) {
                i17 ^= 1633;
                switch (i17) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i17 = i16 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                boolean zM3889 = C0203.m3889(arrayList);
                int i18 = 1864;
                while (true) {
                    i18 ^= 1881;
                    switch (i18) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i18 = zM3889 ? 48736 : 48705;
                            break;
                        case 47384:
                            Object objM4486 = C0233.m4486(arrayList, 0);
                            int iM6868 = C0350.m6867((r1.x0) objM4486);
                            int iM5781 = C0300.m5781(arrayList);
                            int i19 = 48891;
                            while (true) {
                                i19 ^= 48908;
                                switch (i19) {
                                    case 22:
                                        break;
                                    case 53:
                                        break;
                                    case 503:
                                        i19 = 1 <= iM5781 ? 49635 : 48953;
                                        break;
                                    case 32495:
                                        int i20 = 1;
                                        while (true) {
                                            Object obj8 = objM4486;
                                            int i21 = iM6868;
                                            objM4486 = C0233.m4486(arrayList, i20);
                                            iM6868 = C0350.m6867((r1.x0) objM4486);
                                            int i22 = 49666;
                                            while (true) {
                                                i22 ^= 49683;
                                                switch (i22) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i22 = i21 < iM6868 ? 49759 : 49728;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        break;
                                                    case 83:
                                                        iM6868 = i21;
                                                        objM4486 = obj8;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int i23 = 49790;
                                            while (true) {
                                                i23 ^= 49807;
                                                switch (i23) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        i20 += C0032.f52 ^ (-737);
                                                        int i24 = 49914;
                                                        while (true) {
                                                            i24 ^= 49931;
                                                            switch (i24) {
                                                                case 497:
                                                                    i24 = 50596;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 241:
                                                        i23 = i20 != iM5781 ? 49883 : 49852;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            obj2 = objM4486;
                            break;
                        case 47417:
                            int i25 = 48767;
                            while (true) {
                                i25 ^= 48784;
                                switch (i25) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        obj2 = null;
                                        break;
                                    case 239:
                                        i25 = 48798;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 47483:
                            break;
                        default:
                            break;
                    }
                }
                r1.x0 x0Var = (r1.x0) obj2;
                int i26 = 50689;
                while (true) {
                    i26 ^= 50706;
                    switch (i26) {
                        case 19:
                            i26 = x0Var != null ? 50782 : 50751;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            iM6867 = 0;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            iM6867 = C0350.m6867(x0Var);
                            int i27 = 50813;
                            while (true) {
                                i27 ^= 50830;
                                switch (i27) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 243:
                                        i27 = 50844;
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
                List listM1464 = C0071.m1463(i1VarM5832, C0379.m7445(), C0487.m9502(this));
                ArrayList arrayList2 = new ArrayList(C0008.m171(listM1464));
                int iM172 = C0008.m171(listM1464);
                int i28 = 0;
                while (true) {
                    int i29 = i28;
                    y.i1 i1VarM933 = C0048.m933(this);
                    int i30 = 51588;
                    while (true) {
                        i30 ^= 51605;
                        switch (i30) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i30 = i29 < iM172 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                break;
                            default:
                                break;
                        }
                        boolean zM38810 = C0203.m3889(arrayList2);
                        int i31 = 51836;
                        while (true) {
                            i31 ^= 51853;
                            switch (i31) {
                                case 241:
                                    i31 = zM38810 ? 52580 : 52549;
                                    break;
                                case 1963:
                                    break;
                                case 1992:
                                    Object objM4487 = C0233.m4486(arrayList2, 0);
                                    int iM6869 = C0350.m6867((r1.x0) objM4487);
                                    int iM5782 = C0300.m5781(arrayList2);
                                    int i32 = 52735;
                                    while (true) {
                                        i32 ^= 52752;
                                        switch (i32) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case 1007:
                                                i32 = 1 <= iM5782 ? 53479 : 52797;
                                                break;
                                            case 7927:
                                                int i33 = 1;
                                                while (true) {
                                                    Object obj9 = objM4487;
                                                    int i34 = iM6869;
                                                    objM4487 = C0233.m4486(arrayList2, i33);
                                                    iM6869 = C0350.m6867((r1.x0) objM4487);
                                                    int i35 = 53510;
                                                    while (true) {
                                                        i35 ^= 53527;
                                                        switch (i35) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i35 = i34 < iM6869 ? 53603 : 53572;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 83:
                                                                iM6869 = i34;
                                                                objM4487 = obj9;
                                                                break;
                                                            case 116:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    int i36 = 53634;
                                                    while (true) {
                                                        i36 ^= 53651;
                                                        switch (i36) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i36 = i33 != iM5782 ? 53727 : 53696;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                i33 += C0125.f151 ^ 808;
                                                                int i37 = 53758;
                                                                while (true) {
                                                                    i37 ^= 53775;
                                                                    switch (i37) {
                                                                        case 1009:
                                                                            i37 = 54440;
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
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    obj3 = objM4487;
                                    break;
                                case 2025:
                                    int i38 = 52611;
                                    while (true) {
                                        i38 ^= 52628;
                                        switch (i38) {
                                            case 23:
                                                i38 = 52642;
                                                continue;
                                            case 54:
                                                obj3 = null;
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
                        r1.x0 x0Var2 = (r1.x0) obj3;
                        int i39 = 54533;
                        while (true) {
                            i39 ^= 54550;
                            switch (i39) {
                                case 19:
                                    i39 = x0Var2 != null ? 54626 : 54595;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 85:
                                    i10 = 0;
                                    break;
                                case 116:
                                    int iM68610 = C0350.m6867(x0Var2);
                                    int i40 = 54657;
                                    while (true) {
                                        i40 ^= 54674;
                                        switch (i40) {
                                            case 19:
                                                i40 = 54688;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                i10 = iM68610;
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
                        boolean zM38811 = C0203.m3889(arrayList2);
                        int i41 = 55432;
                        while (true) {
                            i41 ^= 55449;
                            switch (i41) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i41 = zM38811 ? 55525 : 55494;
                                    break;
                                case 62:
                                    break;
                                case 95:
                                    Object objM4488 = C0233.m4486(arrayList2, 0);
                                    int iM1647 = C0076.m1647((r1.x0) objM4488);
                                    int iM5783 = C0300.m5781(arrayList2);
                                    int i42 = 55680;
                                    while (true) {
                                        i42 ^= 55697;
                                        switch (i42) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i42 = 1 <= iM5783 ? 56424 : 56393;
                                                break;
                                            case 1467:
                                                break;
                                            case 1496:
                                                break;
                                            case 1529:
                                                int i43 = 1;
                                                while (true) {
                                                    Object obj10 = objM4488;
                                                    int i44 = iM1647;
                                                    objM4488 = C0233.m4486(arrayList2, i43);
                                                    iM1647 = C0076.m1647((r1.x0) objM4488);
                                                    int i45 = 56455;
                                                    while (true) {
                                                        i45 ^= 56472;
                                                        switch (i45) {
                                                            case 31:
                                                                i45 = i44 < iM1647 ? 56548 : 56517;
                                                                break;
                                                            case 62:
                                                                break;
                                                            case 93:
                                                                iM1647 = i44;
                                                                objM4488 = obj10;
                                                                break;
                                                            case 124:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    int i46 = 56579;
                                                    while (true) {
                                                        i46 ^= 56596;
                                                        switch (i46) {
                                                            case 23:
                                                                i46 = i43 != iM5783 ? 1507472 : 56641;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 1564036:
                                                                i43 += C0461.f732 ^ 860;
                                                                int i47 = 1507503;
                                                                while (true) {
                                                                    i47 ^= 1507520;
                                                                    switch (i47) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 111:
                                                                            i47 = 1507534;
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    obj4 = objM4488;
                                    break;
                                case 124:
                                    int i48 = 55556;
                                    while (true) {
                                        i48 ^= 55573;
                                        switch (i48) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i48 = 55587;
                                                continue;
                                            case 54:
                                                obj4 = null;
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
                        r1.x0 x0Var3 = (r1.x0) obj4;
                        int i49 = 1507627;
                        while (true) {
                            i49 ^= 1507644;
                            switch (i49) {
                                case 23:
                                    i49 = x0Var3 != null ? 1507720 : 1507689;
                                    break;
                                case 85:
                                    i11 = 0;
                                    break;
                                case 118:
                                    break;
                                case 180:
                                    int iM1648 = C0076.m1647(x0Var3);
                                    int i50 = 1507751;
                                    while (true) {
                                        i50 ^= 1507768;
                                        switch (i50) {
                                            case 31:
                                                i50 = 1508433;
                                                continue;
                                            case 1513:
                                                i11 = iM1648;
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
                        List listM1465 = C0071.m1463(i1VarM5832, C0477.m9306(), C0408.m8017(this));
                        ArrayList arrayList3 = new ArrayList(C0008.m171(listM1465));
                        int iM173 = C0008.m171(listM1465);
                        int i51 = 0;
                        while (true) {
                            int i52 = i51;
                            int i53 = 1508526;
                            while (true) {
                                i53 ^= 1508543;
                                switch (i53) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i53 = i52 < iM173 ? 1508619 : 1508588;
                                        break;
                                    case 83:
                                        break;
                                    case 114:
                                        break;
                                    case 436:
                                        break;
                                    default:
                                        break;
                                }
                                boolean zM38812 = C0203.m3889(arrayList3);
                                int iM5488 = C0284.m5488(this);
                                int i54 = 1510572;
                                while (true) {
                                    i54 ^= 1510589;
                                    switch (i54) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i54 = ((((zM38812 ? 1 : 0) ^ '\uffff') & 1) | ((zM38812 ? 1 : 0) & '\ufffe')) != 0 ? 1511316 : 1510634;
                                            break;
                                        case 87:
                                            sVar = null;
                                            break;
                                        case 118:
                                            break;
                                        case 809:
                                            boolean zM38813 = C0203.m3889(arrayList3);
                                            int i55 = 1511347;
                                            while (true) {
                                                i55 ^= 1511364;
                                                switch (i55) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        Object objM4489 = C0233.m4486(arrayList3, 0);
                                                        int iM1649 = C0076.m1647((r1.x0) objM4489);
                                                        int iM5784 = C0300.m5781(arrayList3);
                                                        int i56 = 1511595;
                                                        while (true) {
                                                            i56 ^= 1511612;
                                                            switch (i56) {
                                                                case 23:
                                                                    i56 = 1 <= iM5784 ? 1512339 : 1512308;
                                                                    break;
                                                                case 815:
                                                                    int i57 = 1;
                                                                    while (true) {
                                                                        Object obj11 = objM4489;
                                                                        int i58 = iM1649;
                                                                        objM4489 = C0233.m4486(arrayList3, i57);
                                                                        iM1649 = C0076.m1647((r1.x0) objM4489);
                                                                        int i59 = 1512370;
                                                                        while (true) {
                                                                            i59 ^= 1512387;
                                                                            switch (i59) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 51:
                                                                                    objM4489 = obj11;
                                                                                    iM1649 = i58;
                                                                                    break;
                                                                                case 113:
                                                                                    i59 = i58 < iM1649 ? 1512463 : 1512432;
                                                                                    break;
                                                                                case 1996:
                                                                                    int i60 = 1512494;
                                                                                    while (true) {
                                                                                        i60 ^= 1512511;
                                                                                        switch (i60) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i60 = 1512525;
                                                                                                break;
                                                                                            case 114:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        int i61 = 1513269;
                                                                        while (true) {
                                                                            i61 ^= 1513286;
                                                                            switch (i61) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 53:
                                                                                    break;
                                                                                case 115:
                                                                                    i61 = i57 != iM5784 ? 1513362 : 1513331;
                                                                                    break;
                                                                                case 212:
                                                                                    i57 += C0219.f299 ^ 259;
                                                                                    int i62 = 1513393;
                                                                                    while (true) {
                                                                                        i62 ^= 1513410;
                                                                                        switch (i62) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 115:
                                                                                                i62 = 1513424;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 968:
                                                                    break;
                                                                case 1001:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        obj6 = objM4489;
                                                        break;
                                                    case 119:
                                                        i55 = zM38813 ? 1511440 : 1511409;
                                                        break;
                                                    case 8148:
                                                        int i63 = 1511471;
                                                        while (true) {
                                                            i63 ^= 1511488;
                                                            switch (i63) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    obj6 = null;
                                                                    break;
                                                                case 111:
                                                                    i63 = 1511502;
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
                                            C0189.m3608(obj6);
                                            int iM16410 = C0076.m1647((r1.x0) obj6);
                                            boolean zM38814 = C0203.m3889(arrayList3);
                                            int i64 = 1513517;
                                            while (true) {
                                                i64 ^= 1513534;
                                                switch (i64) {
                                                    case 19:
                                                        i64 = zM38814 ? 1514261 : 1514230;
                                                        break;
                                                    case 712:
                                                        Object objM44810 = C0233.m4486(arrayList3, 0);
                                                        int iM68611 = C0350.m6867((r1.x0) objM44810);
                                                        int iM5785 = C0300.m5781(arrayList3);
                                                        int i65 = 1514416;
                                                        while (true) {
                                                            i65 ^= 1514433;
                                                            switch (i65) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 47:
                                                                    obj7 = objM44810;
                                                                    break;
                                                                case 113:
                                                                    i65 = 1 <= iM5785 ? 1515160 : 1514478;
                                                                    break;
                                                                case 1369:
                                                                    int i66 = 1;
                                                                    while (true) {
                                                                        Object obj12 = objM44810;
                                                                        int i67 = iM68611;
                                                                        objM44810 = C0233.m4486(arrayList3, i66);
                                                                        iM68611 = C0350.m6867((r1.x0) objM44810);
                                                                        int i68 = 1515191;
                                                                        while (true) {
                                                                            i68 ^= 1515208;
                                                                            switch (i68) {
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                    break;
                                                                                case 61:
                                                                                    objM44810 = obj12;
                                                                                    iM68611 = i67;
                                                                                    break;
                                                                                case 127:
                                                                                    i68 = i67 < iM68611 ? 1515284 : 1515253;
                                                                                    break;
                                                                                case 476:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        int i69 = 1515315;
                                                                        while (true) {
                                                                            i69 ^= 1515332;
                                                                            switch (i69) {
                                                                                case 22:
                                                                                    break;
                                                                                case 53:
                                                                                    break;
                                                                                case 119:
                                                                                    i69 = i66 != iM5785 ? 1515408 : 1515377;
                                                                                    break;
                                                                                case 212:
                                                                                    i66 += C0033.f53 ^ (-227);
                                                                                    int i70 = 1515439;
                                                                                    while (true) {
                                                                                        i70 ^= 1515456;
                                                                                        switch (i70) {
                                                                                            case 111:
                                                                                                i70 = 1516121;
                                                                                                break;
                                                                                            case 15769:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            int i71 = 1516214;
                                                                            while (true) {
                                                                                i71 ^= 1516231;
                                                                                switch (i71) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        obj7 = objM44810;
                                                                                        break;
                                                                                    case 113:
                                                                                        i71 = 1516245;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
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
                                                    case 811:
                                                        int i72 = 1514292;
                                                        while (true) {
                                                            i72 ^= 1514309;
                                                            switch (i72) {
                                                                case 22:
                                                                    obj7 = null;
                                                                    break;
                                                                case 113:
                                                                    i72 = 1514323;
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
                                            C0189.m3608(obj7);
                                            int iM68612 = C0350.m6867((r1.x0) obj7);
                                            int iM7343 = C0374.m7343(this);
                                            boolean zM2687 = C0139.m2687(iM7343, 0);
                                            m2.l lVarM2798 = C0146.m2798();
                                            int i73 = 1516338;
                                            while (true) {
                                                i73 ^= 1516355;
                                                switch (i73) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        boolean zM2688 = C0139.m2687(iM7343, C0367.f638 ^ (-547));
                                                        int i74 = 1538317;
                                                        while (true) {
                                                            i74 ^= 1538334;
                                                            switch (i74) {
                                                                case 19:
                                                                    i74 = zM2688 ? 1538410 : 1538379;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 85:
                                                                    iM2913 = (((iM5488 + 13) - iM16410) - 13) / 2;
                                                                    break;
                                                                case 116:
                                                                    m2.l lVarM7050 = C0359.m7050(i1VarM5832);
                                                                    int i75 = 1538441;
                                                                    while (true) {
                                                                        i75 ^= 1538458;
                                                                        switch (i75) {
                                                                            case 19:
                                                                                i75 = lVarM7050 == lVarM2798 ? 1539185 : 1538503;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 93:
                                                                                iM2913 = C0152.m2912(i1VarM5832, C0379.m7443());
                                                                                int i76 = 1539340;
                                                                                while (true) {
                                                                                    i76 ^= 1539357;
                                                                                    switch (i76) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i76 = 1539371;
                                                                                            continue;
                                                                                        case 54:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1515:
                                                                                iM2914 = C0152.m2912(i1VarM5832, C0379.m7443());
                                                                                int i77 = 1539216;
                                                                                while (true) {
                                                                                    i77 ^= 1539233;
                                                                                    switch (i77) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 49:
                                                                                            i77 = 1539247;
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    iM2913 = (((((iM5488 - 26) - iM2914) + 26) - 1) - iM16410) + 1;
                                                                                    i13 = 1537542;
                                                                                    while (true) {
                                                                                        i13 ^= 1537559;
                                                                                        switch (i13) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i13 = 1538224;
                                                                                                continue;
                                                                                                continue;
                                                                                            case 3751:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                        i14 = 1537418;
                                                                        while (true) {
                                                                            i14 ^= 1537435;
                                                                            switch (i14) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i14 = 1537449;
                                                                                    continue;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 113:
                                                        i73 = zM2687 ? 1537263 : 1516400;
                                                        break;
                                                    case 22444:
                                                        m2.l lVarM7051 = C0359.m7050(i1VarM5832);
                                                        int i78 = 1537294;
                                                        while (true) {
                                                            i78 ^= 1537311;
                                                            switch (i78) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i78 = lVarM7051 == lVarM2798 ? 1537387 : 1537356;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 83:
                                                                    iM2914 = C0152.m2912(i1VarM5832, C0379.m7443());
                                                                    iM2913 = (((((iM5488 - 26) - iM2914) + 26) - 1) - iM16410) + 1;
                                                                    i13 = 1537542;
                                                                    while (true) {
                                                                        i13 ^= 1537559;
                                                                        switch (i13) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i13 = 1538224;
                                                                                continue;
                                                                                continue;
                                                                            case 3751:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    iM2913 = C0152.m2912(i1VarM5832, C0379.m7443());
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            i14 = 1537418;
                                                            while (true) {
                                                                i14 ^= 1537435;
                                                                switch (i14) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i14 = 1537449;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                b3.s sVar2 = new b3.s(iM2913, iM68612);
                                                int i79 = 1539464;
                                                while (true) {
                                                    i79 ^= 1539481;
                                                    switch (i79) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i79 = 1540146;
                                                            continue;
                                                        case 64939:
                                                            sVar = sVar2;
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                List listM1466 = C0071.m1463(i1VarM5832, C0331.m6399(), new u0.b((-791102030) ^ C0120.f146, new g2(sVar, C0487.m9492(this), 0), true));
                                ArrayList arrayList4 = new ArrayList(C0008.m171(listM1466));
                                int iM174 = C0008.m171(listM1466);
                                int i80 = 0;
                                while (true) {
                                    int i81 = i80;
                                    int i82 = 1540239;
                                    while (true) {
                                        i82 ^= 1540256;
                                        switch (i82) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 47:
                                                i82 = i81 < iM174 ? 1540332 : 1540301;
                                                break;
                                            case 76:
                                                break;
                                            case 109:
                                                break;
                                            default:
                                                break;
                                        }
                                        boolean zM38815 = C0203.m3889(arrayList4);
                                        int i83 = 1541138;
                                        while (true) {
                                            i83 ^= 1541155;
                                            switch (i83) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 49:
                                                    if (zM38815) {
                                                        i83 = 1541231;
                                                    }
                                                    break;
                                                case 76:
                                                    obj5 = null;
                                                    int i84 = 1541262;
                                                    while (true) {
                                                        i84 ^= 1541279;
                                                        switch (i84) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i84 = 1541293;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 115:
                                                    Object objM44811 = C0233.m4486(arrayList4, 0);
                                                    int iM68613 = C0350.m6867((r1.x0) objM44811);
                                                    int iM5786 = C0300.m5781(arrayList4);
                                                    int i85 = 1541386;
                                                    while (true) {
                                                        i85 ^= 1541403;
                                                        switch (i85) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (1 <= iM5786) {
                                                                    i85 = 1542130;
                                                                }
                                                                break;
                                                            case 687:
                                                                break;
                                                            case 712:
                                                                obj5 = objM44811;
                                                                break;
                                                            case 745:
                                                                int i86 = 1;
                                                                int i87 = iM68613;
                                                                Object obj13 = objM44811;
                                                                while (true) {
                                                                    Object objM44812 = C0233.m4486(arrayList4, i86);
                                                                    int iM68614 = C0350.m6867((r1.x0) objM44812);
                                                                    int i88 = 1542161;
                                                                    while (true) {
                                                                        i88 ^= 1542178;
                                                                        switch (i88) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                i88 = i87 < iM68614 ? 1542254 : 1542223;
                                                                                break;
                                                                            case 76:
                                                                                int i89 = 1542285;
                                                                                while (true) {
                                                                                    i89 ^= 1542302;
                                                                                    switch (i89) {
                                                                                        case 19:
                                                                                            i89 = 1542316;
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                    obj13 = objM44812;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 109:
                                                                                iM68614 = i87;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    int i90 = 1543060;
                                                                    while (true) {
                                                                        i90 ^= 1543077;
                                                                        switch (i90) {
                                                                            case 22:
                                                                                break;
                                                                            case 49:
                                                                                i90 = i86 != iM5786 ? 1543153 : 1543122;
                                                                                break;
                                                                            case 84:
                                                                                int i91 = (C0143.f169 ^ (-376)) + i86;
                                                                                int i92 = 1543184;
                                                                                while (true) {
                                                                                    i92 ^= 1543201;
                                                                                    switch (i92) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 49:
                                                                                            i92 = 1543215;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i87 = iM68614;
                                                                                i86 = i91;
                                                                                break;
                                                                            case 119:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                        obj5 = obj13;
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i85 = 1542099;
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i83 = 1541200;
                                        }
                                        r1.x0 x0Var4 = (r1.x0) obj5;
                                        int i93 = 1543308;
                                        while (true) {
                                            i93 ^= 1543325;
                                            switch (i93) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i93 = x0Var4 != null ? 1544052 : 1544021;
                                                    break;
                                                case 939:
                                                    break;
                                                case 968:
                                                    numM1083 = null;
                                                    break;
                                                case 1001:
                                                    numM1083 = C0057.m1083(C0350.m6867(x0Var4));
                                                    int i94 = 1544083;
                                                    while (true) {
                                                        i94 ^= 1544100;
                                                        switch (i94) {
                                                            case 22:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                i94 = 1544114;
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
                                        int i95 = 1544207;
                                        while (true) {
                                            i95 ^= 1544224;
                                            switch (i95) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 47:
                                                    if (sVar != null) {
                                                        i95 = 1544951;
                                                    }
                                                    break;
                                                case 109:
                                                    num = null;
                                                    break;
                                                case 727:
                                                    int iM4796 = C0250.m4796(sVar);
                                                    int i96 = 1544982;
                                                    while (true) {
                                                        i96 ^= 1544999;
                                                        switch (i96) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 49:
                                                                i96 = numM1083 == null ? 1545075 : 1545044;
                                                                break;
                                                            case 84:
                                                                iM7191 = 0 - ((0 - C0152.m2912(i1VarM5832, C0379.m7443())) - iM4796);
                                                                iM2912 = C0186.m3559(i1VarM933, i1VarM5832);
                                                                break;
                                                            case 115:
                                                                iM7191 = (C0366.m7190(numM1083) - 5) + iM4796 + 5;
                                                                iM2912 = C0152.m2912(i1VarM5832, C0379.m7443());
                                                                int i97 = 1545230;
                                                                while (true) {
                                                                    i97 ^= 1545247;
                                                                    switch (i97) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i97 = 1545912;
                                                                            continue;
                                                                        case 679:
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
                                                    int i98 = 1545106;
                                                    while (true) {
                                                        i98 ^= 1545123;
                                                        switch (i98) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                Integer numM1084 = C0057.m1083((iM2912 - 14) + iM7191 + 14);
                                                                int i99 = 1546005;
                                                                while (true) {
                                                                    i99 ^= 1546022;
                                                                    switch (i99) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            num = numM1084;
                                                                            break;
                                                                        case 51:
                                                                            i99 = 1546036;
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 49:
                                                                i98 = 1545137;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i95 = 1544269;
                                        }
                                        int i100 = 1546129;
                                        while (true) {
                                            i100 ^= 1546146;
                                            switch (i100) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    i100 = i10 != 0 ? 1567054 : 1546191;
                                                    break;
                                                case 109:
                                                    i12 = 0;
                                                    break;
                                                case 32492:
                                                    int i101 = 1567085;
                                                    while (true) {
                                                        i101 ^= 1567102;
                                                        switch (i101) {
                                                            case 19:
                                                                i101 = num != null ? 1567178 : 1567147;
                                                                break;
                                                            case 180:
                                                                iM3559 = C0366.m7190(num);
                                                                int i102 = 1567209;
                                                                while (true) {
                                                                    i102 ^= 1567226;
                                                                    switch (i102) {
                                                                        case 19:
                                                                            i102 = 1567240;
                                                                            continue;
                                                                        case 1010:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 213:
                                                                int i103 = 1567333;
                                                                while (true) {
                                                                    i103 ^= 1567350;
                                                                    switch (i103) {
                                                                        case 19:
                                                                            i103 = numM1083 != null ? 1568077 : 1568046;
                                                                            break;
                                                                        case 1851:
                                                                            iM3559 = C0366.m7190(numM1083);
                                                                            int i104 = 1568108;
                                                                            while (true) {
                                                                                i104 ^= 1568125;
                                                                                switch (i104) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i104 = 1568139;
                                                                                        continue;
                                                                                    case 246:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1880:
                                                                            iM3559 = C0186.m3559(i1VarM933, i1VarM5832);
                                                                            break;
                                                                        case 1913:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 242:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    int i105 = iM3559 + (i10 - 32) + 32;
                                                    int i106 = 1568232;
                                                    while (true) {
                                                        i106 ^= 1568249;
                                                        switch (i106) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i106 = 1568263;
                                                                continue;
                                                            case 1022:
                                                                i12 = i105;
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
                                        r1.i1 i1VarM5833 = C0302.m5832(this);
                                        List listM1467 = C0071.m1463(i1VarM5833, C0202.m3886(), new u0.b((-495329500) ^ C0142.f168, new f2(C0048.m933(this), i1VarM5833, arrayList, iM6867, arrayList4, numM1083, C0340.m6680(this), 0), true));
                                        ArrayList arrayList5 = new ArrayList(C0008.m171(listM1467));
                                        int iM175 = C0008.m171(listM1467);
                                        int i107 = 0;
                                        while (true) {
                                            int i108 = i107;
                                            int i109 = 1569007;
                                            while (true) {
                                                i109 ^= 1569024;
                                                switch (i109) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 76:
                                                        break;
                                                    case 495:
                                                        i109 = i108 < iM175 ? 1569100 : 1569069;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                int iM4637 = C0241.m4637(arrayList5);
                                                int i110 = 0;
                                                while (true) {
                                                    int i111 = i110;
                                                    int i112 = 1569255;
                                                    while (true) {
                                                        i112 ^= 1569272;
                                                        switch (i112) {
                                                            case 31:
                                                                i112 = i111 < iM4637 ? 1569999 : 1569968;
                                                                break;
                                                            case 1335:
                                                                break;
                                                            case 1352:
                                                                break;
                                                            case 1385:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        int iM4638 = C0241.m4637(arrayList);
                                                        int i113 = 0;
                                                        while (true) {
                                                            int i114 = i113;
                                                            int i115 = 1570154;
                                                            while (true) {
                                                                i115 ^= 1570171;
                                                                switch (i115) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i115 = i114 < iM4638 ? 1570898 : 1570216;
                                                                        break;
                                                                    case 211:
                                                                        break;
                                                                    case 242:
                                                                        break;
                                                                    case 3369:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                int iM4639 = C0241.m4637(arrayList2);
                                                                int i116 = 0;
                                                                while (true) {
                                                                    int i117 = i116;
                                                                    int iM9473 = C0486.m9473(this);
                                                                    int i118 = 1571053;
                                                                    while (true) {
                                                                        i118 ^= 1571070;
                                                                        switch (i118) {
                                                                            case 19:
                                                                                i118 = i117 < iM4639 ? 1571146 : 1571115;
                                                                                break;
                                                                            case 436:
                                                                                break;
                                                                            case 469:
                                                                                break;
                                                                            case 498:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                        int iM46310 = C0241.m4637(arrayList4);
                                                                        int i119 = 0;
                                                                        while (true) {
                                                                            int i120 = i119;
                                                                            int i121 = 1571952;
                                                                            while (true) {
                                                                                i121 ^= 1571969;
                                                                                switch (i121) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 47:
                                                                                        break;
                                                                                    case 76:
                                                                                        break;
                                                                                    case 241:
                                                                                        i121 = i120 < iM46310 ? 1572045 : 1572014;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                                int i122 = 1573099;
                                                                                while (true) {
                                                                                    i122 ^= 1573116;
                                                                                    switch (i122) {
                                                                                        case 23:
                                                                                            if (sVar != null) {
                                                                                                i122 = 1573843;
                                                                                            }
                                                                                            break;
                                                                                        case 815:
                                                                                            int iM46311 = C0241.m4637(arrayList3);
                                                                                            int i123 = 0;
                                                                                            while (true) {
                                                                                                int i124 = i123;
                                                                                                int i125 = 1573874;
                                                                                                while (true) {
                                                                                                    i125 ^= 1573891;
                                                                                                    switch (i125) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 51:
                                                                                                            break;
                                                                                                        case 76:
                                                                                                            break;
                                                                                                        case 2033:
                                                                                                            i125 = i124 < iM46311 ? 1573967 : 1573936;
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                r1.x0 x0Var5 = (r1.x0) C0233.m4486(arrayList3, i124);
                                                                                                C0189.m3608(num);
                                                                                                C0016.m326(w0Var, x0Var5, C0100.m1960(sVar), ((iM9473 - 28) - C0366.m7190(num)) + 28);
                                                                                                i123 = (C0480.f754 ^ (-685)) + i124;
                                                                                                int i126 = 1573998;
                                                                                                while (true) {
                                                                                                    i126 ^= 1574015;
                                                                                                    switch (i126) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i126 = 1574029;
                                                                                                            break;
                                                                                                        case 242:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 840:
                                                                                            break;
                                                                                        case 873:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i122 = 1573812;
                                                                                }
                                                                                return C0012.m238();
                                                                            }
                                                                            r1.x0 x0Var6 = (r1.x0) C0233.m4486(arrayList4, i120);
                                                                            int i127 = 1572076;
                                                                            while (true) {
                                                                                i127 ^= 1572093;
                                                                                switch (i127) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i127 = numM1083 != null ? 1572820 : 1572138;
                                                                                        break;
                                                                                    case 471:
                                                                                        iM7190 = 0;
                                                                                        break;
                                                                                    case 502:
                                                                                        break;
                                                                                    case 809:
                                                                                        iM7190 = C0366.m7190(numM1083);
                                                                                        int i128 = 1572851;
                                                                                        while (true) {
                                                                                            i128 ^= 1572868;
                                                                                            switch (i128) {
                                                                                                case 22:
                                                                                                    break;
                                                                                                case 1048567:
                                                                                                    i128 = 1572882;
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0016.m326(w0Var, x0Var6, 0, ((iM9473 + 23) - iM7190) - 23);
                                                                            i119 = (C0051.f71 ^ (-429)) + i120;
                                                                            int i129 = 1572975;
                                                                            while (true) {
                                                                                i129 ^= 1572992;
                                                                                switch (i129) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 239:
                                                                                        i129 = 1573006;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    C0016.m326(w0Var, (r1.x0) C0233.m4486(arrayList2, i117), C0420.m8261(i1VarM933, i1VarM5832, C0359.m7050(i1VarM5832)) - (0 - ((((iM5488 - 6) - i11) + 6) / (C0160.f184 ^ 745))), ((iM9473 + 18) - i12) - 18);
                                                                    i116 = (C0302.f450 ^ (-347)) + i117;
                                                                    int i130 = 1571177;
                                                                    while (true) {
                                                                        i130 ^= 1571194;
                                                                        switch (i130) {
                                                                            case 19:
                                                                                i130 = 1571859;
                                                                                break;
                                                                            case 1385:
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            C0016.m326(w0Var, (r1.x0) C0233.m4486(arrayList, i114), 0, 0);
                                                            i113 = (C0296.f444 ^ (-993)) + i114;
                                                            int i131 = 1570929;
                                                            while (true) {
                                                                i131 ^= 1570946;
                                                                switch (i131) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 243:
                                                                        i131 = 1570960;
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    C0016.m326(w0Var, (r1.x0) C0233.m4486(arrayList5, i111), 0, 0);
                                                    i110 = (C0082.f116 ^ 376) + i111;
                                                    int i132 = 1570030;
                                                    while (true) {
                                                        i132 ^= 1570047;
                                                        switch (i132) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i132 = 1570061;
                                                                break;
                                                            case 498:
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                            C0357.m6998(arrayList5, C0453.m8844((r1.i0) C0315.m6101(listM1467, i108), jM433));
                                            i107 = (C0254.f334 ^ (-971)) + i108;
                                            int i133 = 1569131;
                                            while (true) {
                                                i133 ^= 1569148;
                                                switch (i133) {
                                                    case 23:
                                                        i133 = 1569162;
                                                        break;
                                                    case 246:
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    C0357.m6998(arrayList4, C0453.m8844((r1.i0) C0315.m6101(listM1466, i81), jM433));
                                    i80 = (C0485.f759 ^ 54) + i81;
                                    int i134 = 1540363;
                                    while (true) {
                                        i134 ^= 1540380;
                                        switch (i134) {
                                            case 23:
                                                i134 = 1540394;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                }
                            }
                            r1.x0 x0VarM8844 = C0453.m8844((r1.i0) C0315.m6101(listM1465, i52), C0341.m6705(jM433, (((-C0420.m8261(i1VarM933, i1VarM5832, C0359.m7050(i1VarM5832))) - 5) - C0180.m3431(i1VarM933, i1VarM5832, C0359.m7050(i1VarM5832))) + 5, -C0186.m3559(i1VarM933, i1VarM5832)));
                            int iM68615 = C0350.m6867(x0VarM8844);
                            int i135 = 1508650;
                            while (true) {
                                i135 ^= 1508667;
                                switch (i135) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i135 = iM68615 != 0 ? 1509394 : 1508712;
                                        break;
                                    case 83:
                                        x0VarM8844 = null;
                                        break;
                                    case 114:
                                        break;
                                    case 3369:
                                        int iM16411 = C0076.m1647(x0VarM8844);
                                        int i136 = 1509425;
                                        while (true) {
                                            i136 ^= 1509442;
                                            switch (i136) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    x0VarM8844 = null;
                                                    break;
                                                case 115:
                                                    i136 = iM16411 != 0 ? 1509518 : 1509487;
                                                    break;
                                                case 204:
                                                    int i137 = 1509549;
                                                    while (true) {
                                                        i137 ^= 1509566;
                                                        switch (i137) {
                                                            case 19:
                                                                i137 = 1509580;
                                                                break;
                                                            case 114:
                                                                break;
                                                            default:
                                                                break;
                                                        }
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
                            int i138 = 1509673;
                            while (true) {
                                i138 ^= 1509690;
                                switch (i138) {
                                    case 19:
                                        i138 = x0VarM8844 != null ? 1510417 : 1510386;
                                        break;
                                    case 712:
                                        break;
                                    case 745:
                                        break;
                                    case 1323:
                                        C0357.m6998(arrayList3, x0VarM8844);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i51 = (C0221.f301 ^ (-748)) + i52;
                            int i139 = 1510448;
                            while (true) {
                                i139 ^= 1510465;
                                switch (i139) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 113:
                                        i139 = 1510479;
                                        break;
                                }
                            }
                        }
                    }
                    C0357.m6998(arrayList2, C0453.m8844((r1.i0) C0315.m6101(listM1464, i29), C0341.m6705(jM433, (((-C0420.m8261(i1VarM933, i1VarM5832, C0359.m7050(i1VarM5832))) - 6) - C0180.m3431(i1VarM933, i1VarM5832, C0359.m7050(i1VarM5832))) + 6, -C0186.m3559(i1VarM933, i1VarM5832))));
                    i28 = (C0313.f461 ^ 569) + i29;
                    int i140 = 51712;
                    while (true) {
                        i140 ^= 51729;
                        switch (i140) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i140 = 51743;
                                break;
                        }
                    }
                }
            }
            C0357.m6998(arrayList, C0453.m8844((r1.i0) C0315.m6101(listM1463, i16), jM433));
            i15 = (C0044.f64 ^ 63) + i16;
            int i141 = 1740;
            while (true) {
                i141 ^= 1757;
                switch (i141) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i141 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }
}
