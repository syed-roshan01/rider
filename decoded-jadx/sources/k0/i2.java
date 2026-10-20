package k0;

import a7.C0008;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.graphics.C0030;
import androidx.core.app.C0040;
import androidx.lifecycle.C0043;
import c0.C0057;
import c3.C0063;
import com.auto.accept.data.model.C0071;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.C0127;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.firebase.remoteconfiginterop.C0203;
import d2.C0215;
import dagger.hilt.C0255;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.migration.C0238;
import dagger.hilt.internal.generatesrootinput.C0250;
import e0.C0256;
import e1.C0258;
import e1.C0259;
import f.C0270;
import g3.C0288;
import g7.C0292;
import h1.C0300;
import h4.C0305;
import h8.C0313;
import i.C0315;
import j2.C0324;
import java.util.ArrayList;
import java.util.List;
import k.C0331;
import l2.C0341;
import m0.C0349;
import m1.C0350;
import m7.C0357;
import m9.C0359;
import n7.C0364;
import n9.C0366;
import p3.C0375;
import p8.C0379;
import r5.C0399;
import s0.C0410;
import t2.C0420;
import t2.C0421;
import t2.C0423;
import u.C0428;
import u1.C0431;
import v0.C0443;
import w.C0453;
import w5.C0462;
import y6.C0477;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f9024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.e f9026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y.i1 f9028f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.e f9029n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.f f9030o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(c9.e eVar, c9.e eVar2, c9.e eVar3, int i10, y.i1 i1Var, c9.e eVar4, c9.f fVar, int i11) {
        super(C0421.f692 ^ (-285));
        this.f9023a = i11;
        this.f9024b = eVar;
        this.f9025c = eVar2;
        this.f9026d = eVar3;
        this.f9027e = i10;
        this.f9028f = i1Var;
        this.f9029n = eVar4;
        this.f9030o = fVar;
        int iM315 = C0016.m315();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM315 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0313.m6070("ixWSZJIutJXh0r7c")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:1013:0x06d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1014:0x06d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1015:0x06df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1016:0x06f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1017:0x06db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1018:0x06d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1020:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1023:0x065f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1024:0x06f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1026:0x06ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1028:0x070d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1029:0x0723 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1031:0x0705 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:873:0x08ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:874:0x0917 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:876:0x090f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:993:0x0675 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:994:0x070d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:996:0x066d A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x0247. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:131:0x0258. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:188:0x032b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:216:0x03a9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:237:0x0421. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:299:0x051b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:303:0x0526. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:348:0x05e5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:431:0x0768. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:478:0x0829. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:482:0x0834. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:584:0x09eb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x015c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0042. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final r1.k0 a(r1.i1 i1Var, long j10) {
        Object obj;
        int iM6867;
        Object obj2;
        int i10;
        ArrayList arrayList;
        Object obj3;
        int iM1647;
        b3.s sVar;
        Object obj4;
        Integer numM1083;
        Integer numM1084;
        int i11;
        int iM3559;
        int iM2912;
        int iM35510;
        int i12;
        Object obj5;
        Object obj6;
        int iM2913;
        m2.l lVarM7050;
        int i13;
        int i14;
        int iM2914;
        int i15;
        int i16;
        int iM7826 = C0399.m7826(this);
        r8.s sVarM2452 = C0127.m2452();
        switch (iM7826) {
            case 0:
                int iM3212 = C0168.m3212(j10);
                int iM8451 = C0431.m8451(j10);
                return C0410.m8048(i1Var, iM3212, iM8451, sVarM2452, new h2(i1Var, C0030.m594(this), C0259.m4950(this), C0102.m1997(this), C0043.m845(this), iM3212, C0063.m1207(this), C0186.m3547(j10, 0, 0, 0, 0, C0324.f472 ^ (-429)), C0258.m4934(this), C0215.m4110(this), iM8451));
            default:
                int iM3213 = C0168.m3212(j10);
                int iM8452 = C0431.m8451(j10);
                long jM3547 = C0186.m3547(j10, 0, 0, 0, 0, C0270.f350 ^ (-724));
                List listM1463 = C0071.m1463(i1Var, C0349.m6841(), C0030.m594(this));
                ArrayList arrayList2 = new ArrayList(C0008.m171(listM1463));
                int iM171 = C0008.m171(listM1463);
                int i17 = 0;
                while (true) {
                    int i18 = i17;
                    int i19 = 1616;
                    while (true) {
                        i19 ^= 1633;
                        switch (i19) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 49:
                                i19 = i18 < iM171 ? 1709 : 1678;
                                break;
                            case 204:
                                break;
                            case 239:
                                break;
                            default:
                                break;
                        }
                        boolean zM3889 = C0203.m3889(arrayList2);
                        int i20 = 1864;
                        while (true) {
                            i20 ^= 1881;
                            switch (i20) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i20 = zM3889 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    Object objM4486 = C0233.m4486(arrayList2, 0);
                                    int iM6868 = C0350.m6867((r1.x0) objM4486);
                                    int iM5781 = C0300.m5781(arrayList2);
                                    int i21 = 48891;
                                    while (true) {
                                        i21 ^= 48908;
                                        switch (i21) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                i21 = 1 <= iM5781 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                int i22 = 1;
                                                while (true) {
                                                    Object obj7 = objM4486;
                                                    int i23 = iM6868;
                                                    objM4486 = C0233.m4486(arrayList2, i22);
                                                    iM6868 = C0350.m6867((r1.x0) objM4486);
                                                    int i24 = 49666;
                                                    while (true) {
                                                        i24 ^= 49683;
                                                        switch (i24) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i24 = i23 < iM6868 ? 49759 : 49728;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                break;
                                                            case 83:
                                                                objM4486 = obj7;
                                                                iM6868 = i23;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    int i25 = 49790;
                                                    while (true) {
                                                        i25 ^= 49807;
                                                        switch (i25) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 51:
                                                                break;
                                                            case 84:
                                                                i22 += C0428.f699 ^ 198;
                                                                int i26 = 49914;
                                                                while (true) {
                                                                    i26 ^= 49931;
                                                                    switch (i26) {
                                                                        case 497:
                                                                            i26 = 50596;
                                                                            break;
                                                                        case 1711:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 241:
                                                                i25 = i22 != iM5781 ? 49883 : 49852;
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
                                    obj = objM4486;
                                    break;
                                case 47417:
                                    int i27 = 48767;
                                    while (true) {
                                        i27 ^= 48784;
                                        switch (i27) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                obj = null;
                                                break;
                                            case 239:
                                                i27 = 48798;
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
                        r1.x0 x0Var = (r1.x0) obj;
                        int i28 = 50689;
                        while (true) {
                            i28 ^= 50706;
                            switch (i28) {
                                case 19:
                                    i28 = x0Var != null ? 50782 : 50751;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    iM6867 = 0;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    iM6867 = C0350.m6867(x0Var);
                                    int i29 = 50813;
                                    while (true) {
                                        i29 ^= 50830;
                                        switch (i29) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 243:
                                                i29 = 50844;
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
                        List listM1464 = C0071.m1463(i1Var, C0379.m7445(), C0259.m4950(this));
                        ArrayList arrayList3 = new ArrayList(C0008.m171(listM1464));
                        int iM172 = C0008.m171(listM1464);
                        int i30 = 0;
                        while (true) {
                            int i31 = i30;
                            y.i1 i1VarM1207 = C0063.m1207(this);
                            int i32 = 51588;
                            while (true) {
                                i32 ^= 51605;
                                switch (i32) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i32 = i31 < iM172 ? 51681 : 51650;
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
                                boolean zM38810 = C0203.m3889(arrayList3);
                                int i33 = 51836;
                                while (true) {
                                    i33 ^= 51853;
                                    switch (i33) {
                                        case 241:
                                            i33 = zM38810 ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            Object objM4487 = C0233.m4486(arrayList3, 0);
                                            int iM6869 = C0350.m6867((r1.x0) objM4487);
                                            int iM5782 = C0300.m5781(arrayList3);
                                            int i34 = 52735;
                                            while (true) {
                                                i34 ^= 52752;
                                                switch (i34) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 1007:
                                                        i34 = 1 <= iM5782 ? 53479 : 52797;
                                                        break;
                                                    case 7927:
                                                        int i35 = 1;
                                                        while (true) {
                                                            Object obj8 = objM4487;
                                                            int i36 = iM6869;
                                                            objM4487 = C0233.m4486(arrayList3, i35);
                                                            iM6869 = C0350.m6867((r1.x0) objM4487);
                                                            int i37 = 53510;
                                                            while (true) {
                                                                i37 ^= 53527;
                                                                switch (i37) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i37 = i36 < iM6869 ? 53603 : 53572;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        objM4487 = obj8;
                                                                        iM6869 = i36;
                                                                        break;
                                                                    case 116:
                                                                        int i38 = 53634;
                                                                        while (true) {
                                                                            i38 ^= 53651;
                                                                            switch (i38) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i38 = 53665;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                            int i39 = 53758;
                                                            while (true) {
                                                                i39 ^= 53775;
                                                                switch (i39) {
                                                                    case 1009:
                                                                        i39 = i35 != iM5782 ? 54502 : 54471;
                                                                        break;
                                                                    case 1703:
                                                                        break;
                                                                    case 1736:
                                                                        break;
                                                                    case 1769:
                                                                        i35 += C0238.f318 ^ (-776);
                                                                        int i40 = 54533;
                                                                        while (true) {
                                                                            i40 ^= 54550;
                                                                            switch (i40) {
                                                                                case 19:
                                                                                    i40 = 54564;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                            obj2 = objM4487;
                                            break;
                                        case 2025:
                                            int i41 = 52611;
                                            while (true) {
                                                i41 ^= 52628;
                                                switch (i41) {
                                                    case 23:
                                                        i41 = 52642;
                                                        continue;
                                                    case 54:
                                                        obj2 = null;
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
                                r1.x0 x0Var2 = (r1.x0) obj2;
                                int i42 = 54657;
                                while (true) {
                                    i42 ^= 54674;
                                    switch (i42) {
                                        case 19:
                                            i42 = x0Var2 != null ? 55401 : 54719;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i10 = 0;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 3579:
                                            int iM68610 = C0350.m6867(x0Var2);
                                            int i43 = 55432;
                                            while (true) {
                                                i43 ^= 55449;
                                                switch (i43) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i43 = 55463;
                                                        continue;
                                                    case 62:
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
                                boolean zM38811 = C0203.m3889(arrayList3);
                                int i44 = 55556;
                                while (true) {
                                    i44 ^= 55573;
                                    switch (i44) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM38811) {
                                                i44 = 55649;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            Object objM4488 = C0233.m4486(arrayList3, 0);
                                            int iM1648 = C0076.m1647((r1.x0) objM4488);
                                            int iM5783 = C0300.m5781(arrayList3);
                                            int i45 = 56455;
                                            while (true) {
                                                i45 ^= 56472;
                                                switch (i45) {
                                                    case 31:
                                                        if (1 <= iM5783) {
                                                            i45 = 56548;
                                                        }
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 93:
                                                        arrayList = arrayList3;
                                                        obj3 = objM4488;
                                                        break;
                                                    case 124:
                                                        int i46 = 1;
                                                        Object obj9 = objM4488;
                                                        int i47 = iM1648;
                                                        while (true) {
                                                            Object objM4489 = C0233.m4486(arrayList3, i46);
                                                            int iM1649 = C0076.m1647((r1.x0) objM4489);
                                                            int i48 = 56579;
                                                            while (true) {
                                                                i48 ^= 56596;
                                                                switch (i48) {
                                                                    case 23:
                                                                        i48 = i47 < iM1649 ? 1507472 : 56641;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        objM4489 = obj9;
                                                                        iM1649 = i47;
                                                                        break;
                                                                    case 1564036:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            int i49 = 1507503;
                                                            while (true) {
                                                                i49 ^= 1507520;
                                                                switch (i49) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        break;
                                                                    case 111:
                                                                        i49 = i46 != iM5783 ? 1507596 : 1507565;
                                                                        break;
                                                                    case 460:
                                                                        int i50 = i46 + (C0040.f60 ^ (-82));
                                                                        int i51 = 1507627;
                                                                        while (true) {
                                                                            i51 ^= 1507644;
                                                                            switch (i51) {
                                                                                case 23:
                                                                                    i51 = 1507658;
                                                                                    break;
                                                                                case 118:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        obj9 = objM4489;
                                                                        i47 = iM1649;
                                                                        i46 = i50;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                int i52 = 1507751;
                                                                while (true) {
                                                                    i52 ^= 1507768;
                                                                    switch (i52) {
                                                                        case 31:
                                                                            i52 = 1508433;
                                                                            break;
                                                                        case 1513:
                                                                            arrayList = arrayList3;
                                                                            obj3 = objM4489;
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i45 = 56517;
                                            }
                                            break;
                                        case 116:
                                            int i53 = 55680;
                                            while (true) {
                                                i53 ^= 55697;
                                                switch (i53) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i53 = 56362;
                                                        break;
                                                    case 1467:
                                                        arrayList = arrayList3;
                                                        obj3 = null;
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i44 = 55618;
                                }
                                r1.x0 x0Var3 = (r1.x0) obj3;
                                int i54 = 1508526;
                                while (true) {
                                    i54 ^= 1508543;
                                    switch (i54) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (x0Var3 != null) {
                                                i54 = 1508619;
                                            }
                                            break;
                                        case 83:
                                            iM1647 = 0;
                                            break;
                                        case 114:
                                            break;
                                        case 436:
                                            iM1647 = C0076.m1647(x0Var3);
                                            int i55 = 1508650;
                                            while (true) {
                                                i55 ^= 1508667;
                                                switch (i55) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i55 = 1508681;
                                                        break;
                                                    case 114:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i54 = 1508588;
                                }
                                List listM1465 = C0071.m1463(i1Var, C0477.m9306(), C0102.m1997(this));
                                ArrayList arrayList4 = new ArrayList(C0008.m171(listM1465));
                                int iM173 = C0008.m171(listM1465);
                                int i56 = 0;
                                while (true) {
                                    int i57 = i56;
                                    int i58 = 1509425;
                                    while (true) {
                                        i58 ^= 1509442;
                                        switch (i58) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case 115:
                                                i58 = i57 < iM173 ? 1509518 : 1509487;
                                                break;
                                            case 204:
                                                break;
                                            default:
                                                break;
                                        }
                                        boolean zM38812 = C0203.m3889(arrayList4);
                                        int iM845 = C0043.m845(this);
                                        int i59 = 1511471;
                                        while (true) {
                                            i59 ^= 1511488;
                                            switch (i59) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    sVar = null;
                                                    break;
                                                case 111:
                                                    i59 = ((((zM38812 ? 1 : 0) ^ '\uffff') & 1) | ((zM38812 ? 1 : 0) & '\ufffe')) != 0 ? 1511564 : 1511533;
                                                    break;
                                                case 204:
                                                    boolean zM38813 = C0203.m3889(arrayList4);
                                                    int i60 = 1511595;
                                                    while (true) {
                                                        i60 ^= 1511612;
                                                        switch (i60) {
                                                            case 23:
                                                                i60 = zM38813 ? 1512339 : 1512308;
                                                                break;
                                                            case 815:
                                                                int i61 = 1512370;
                                                                while (true) {
                                                                    i61 ^= 1512387;
                                                                    switch (i61) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            obj5 = null;
                                                                            break;
                                                                        case 113:
                                                                            i61 = 1512401;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 968:
                                                                Object objM44810 = C0233.m4486(arrayList4, 0);
                                                                int iM16410 = C0076.m1647((r1.x0) objM44810);
                                                                int iM5784 = C0300.m5781(arrayList4);
                                                                int i62 = 1512494;
                                                                while (true) {
                                                                    i62 ^= 1512511;
                                                                    switch (i62) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i62 = 1 <= iM5784 ? 1513238 : 1512556;
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 809:
                                                                            int i63 = 1;
                                                                            while (true) {
                                                                                Object obj10 = objM44810;
                                                                                int i64 = iM16410;
                                                                                objM44810 = C0233.m4486(arrayList4, i63);
                                                                                iM16410 = C0076.m1647((r1.x0) objM44810);
                                                                                int i65 = 1513269;
                                                                                while (true) {
                                                                                    i65 ^= 1513286;
                                                                                    switch (i65) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 53:
                                                                                            objM44810 = obj10;
                                                                                            iM16410 = i64;
                                                                                            break;
                                                                                        case 115:
                                                                                            i65 = i64 < iM16410 ? 1513362 : 1513331;
                                                                                            break;
                                                                                        case 212:
                                                                                            int i66 = 1513393;
                                                                                            while (true) {
                                                                                                i66 ^= 1513410;
                                                                                                switch (i66) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case 115:
                                                                                                        i66 = 1513424;
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
                                                                                int i67 = 1513517;
                                                                                while (true) {
                                                                                    i67 ^= 1513534;
                                                                                    switch (i67) {
                                                                                        case 19:
                                                                                            i67 = i63 != iM5784 ? 1514261 : 1514230;
                                                                                            break;
                                                                                        case 712:
                                                                                            break;
                                                                                        case 745:
                                                                                            break;
                                                                                        case 811:
                                                                                            i63 += C0375.f646 ^ (-122);
                                                                                            int i68 = 1514292;
                                                                                            while (true) {
                                                                                                i68 ^= 1514309;
                                                                                                switch (i68) {
                                                                                                    case 22:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        i68 = 1514323;
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
                                                                obj5 = objM44810;
                                                                break;
                                                            case 1001:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0189.m3608(obj5);
                                                    int iM16411 = C0076.m1647((r1.x0) obj5);
                                                    boolean zM38814 = C0203.m3889(arrayList4);
                                                    int i69 = 1514416;
                                                    while (true) {
                                                        i69 ^= 1514433;
                                                        switch (i69) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 47:
                                                                Object objM44811 = C0233.m4486(arrayList4, 0);
                                                                int iM68611 = C0350.m6867((r1.x0) objM44811);
                                                                int iM5785 = C0300.m5781(arrayList4);
                                                                int i70 = 1515315;
                                                                while (true) {
                                                                    i70 ^= 1515332;
                                                                    switch (i70) {
                                                                        case 22:
                                                                            break;
                                                                        case 53:
                                                                            obj6 = objM44811;
                                                                            break;
                                                                        case 119:
                                                                            i70 = 1 <= iM5785 ? 1515408 : 1515377;
                                                                            break;
                                                                        case 212:
                                                                            int i71 = 1;
                                                                            while (true) {
                                                                                Object obj11 = objM44811;
                                                                                int i72 = iM68611;
                                                                                objM44811 = C0233.m4486(arrayList4, i71);
                                                                                iM68611 = C0350.m6867((r1.x0) objM44811);
                                                                                int i73 = 1515439;
                                                                                while (true) {
                                                                                    i73 ^= 1515456;
                                                                                    switch (i73) {
                                                                                        case 111:
                                                                                            i73 = i72 < iM68611 ? 1516183 : 1516152;
                                                                                            break;
                                                                                        case 15703:
                                                                                            break;
                                                                                        case 15769:
                                                                                            break;
                                                                                        case 15800:
                                                                                            objM44811 = obj11;
                                                                                            iM68611 = i72;
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                int i74 = 1516214;
                                                                                while (true) {
                                                                                    i74 ^= 1516231;
                                                                                    switch (i74) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            break;
                                                                                        case 113:
                                                                                            i74 = i71 != iM5785 ? 1516307 : 1516276;
                                                                                            break;
                                                                                        case 468:
                                                                                            i71 += C0115.f141 ^ (-575);
                                                                                            int i75 = 1516338;
                                                                                            while (true) {
                                                                                                i75 ^= 1516355;
                                                                                                switch (i75) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        i75 = 1516369;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                    int i76 = 1537294;
                                                                                    while (true) {
                                                                                        i76 ^= 1537311;
                                                                                        switch (i76) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i76 = 1537325;
                                                                                                continue;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                obj6 = objM44811;
                                                                                                break;
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
                                                            case 113:
                                                                i69 = zM38814 ? 1515160 : 1514478;
                                                                break;
                                                            case 1369:
                                                                int i77 = 1515191;
                                                                while (true) {
                                                                    i77 ^= 1515208;
                                                                    switch (i77) {
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                            obj6 = null;
                                                                            break;
                                                                        case 127:
                                                                            i77 = 1515222;
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
                                                    int iM68612 = C0350.m6867((r1.x0) obj6);
                                                    boolean zM2687 = C0139.m2687(iM845, 0);
                                                    m2.l lVarM2798 = C0146.m2798();
                                                    int i78 = 1537418;
                                                    while (true) {
                                                        i78 ^= 1537435;
                                                        switch (i78) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i78 = zM2687 ? 1537511 : 1537480;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 83:
                                                                int i79 = C0366.f637 ^ 370;
                                                                boolean zM2688 = C0139.m2687(iM845, i79);
                                                                int i80 = 1539216;
                                                                while (true) {
                                                                    i80 ^= 1539233;
                                                                    switch (i80) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 49:
                                                                            i80 = zM2688 ? 1539309 : 1539278;
                                                                            break;
                                                                        case 76:
                                                                            int i81 = 1539340;
                                                                            while (true) {
                                                                                i81 ^= 1539357;
                                                                                switch (i81) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i81 = 1539371;
                                                                                        continue;
                                                                                    case 54:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                lVarM7050 = C0359.m7050(i1Var);
                                                                                i13 = 1540239;
                                                                                while (true) {
                                                                                    i13 ^= 1540256;
                                                                                    switch (i13) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 47:
                                                                                            i13 = lVarM7050 == lVarM2798 ? 1540332 : 1540301;
                                                                                            break;
                                                                                        case 76:
                                                                                            iM2914 = C0152.m2912(i1Var, C0379.m7443());
                                                                                            i15 = 1540363;
                                                                                            while (true) {
                                                                                                i15 ^= 1540380;
                                                                                                switch (i15) {
                                                                                                    case 23:
                                                                                                        i15 = 1540394;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 54:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                                iM2913 = (((((iM3213 - 27) - iM2914) + 27) - 14) - iM16411) + 14;
                                                                                                i16 = 1538441;
                                                                                                while (true) {
                                                                                                    i16 ^= 1538458;
                                                                                                    switch (i16) {
                                                                                                        case 19:
                                                                                                            i16 = 1538472;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 109:
                                                                                            iM2913 = C0152.m2912(i1Var, C0379.m7443());
                                                                                            i14 = 1541138;
                                                                                            while (true) {
                                                                                                i14 ^= 1541155;
                                                                                                switch (i14) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case 49:
                                                                                                        i14 = 1541169;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 111:
                                                                            boolean zM2689 = C0139.m2687(iM845, C0364.f635 ^ (-743));
                                                                            int i82 = 1539464;
                                                                            while (true) {
                                                                                i82 ^= 1539481;
                                                                                switch (i82) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i82 = zM2689 ? 1540208 : 1540177;
                                                                                        break;
                                                                                    case 64939:
                                                                                        break;
                                                                                    case 64968:
                                                                                        iM2913 = (((iM3213 - 15) - iM16411) + 15) / i79;
                                                                                        break;
                                                                                    case 65001:
                                                                                        lVarM7050 = C0359.m7050(i1Var);
                                                                                        i13 = 1540239;
                                                                                        while (true) {
                                                                                            i13 ^= 1540256;
                                                                                            switch (i13) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    break;
                                                                                                case 47:
                                                                                                    if (lVarM7050 == lVarM2798) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 76:
                                                                                                    iM2914 = C0152.m2912(i1Var, C0379.m7443());
                                                                                                    i15 = 1540363;
                                                                                                    while (true) {
                                                                                                        i15 ^= 1540380;
                                                                                                        switch (i15) {
                                                                                                            case 23:
                                                                                                                i15 = 1540394;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                        }
                                                                                                        iM2913 = (((((iM3213 - 27) - iM2914) + 27) - 14) - iM16411) + 14;
                                                                                                        i16 = 1538441;
                                                                                                        while (true) {
                                                                                                            i16 ^= 1538458;
                                                                                                            switch (i16) {
                                                                                                                case 19:
                                                                                                                    i16 = 1538472;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 109:
                                                                                                    iM2913 = C0152.m2912(i1Var, C0379.m7443());
                                                                                                    i14 = 1541138;
                                                                                                    while (true) {
                                                                                                        i14 ^= 1541155;
                                                                                                        switch (i14) {
                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                break;
                                                                                                            case 49:
                                                                                                                i14 = 1541169;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            default:
                                                                                                                continue;
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
                                                                break;
                                                            case 124:
                                                                m2.l lVarM7051 = C0359.m7050(i1Var);
                                                                int i83 = 1537542;
                                                                while (true) {
                                                                    i83 ^= 1537559;
                                                                    switch (i83) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i83 = lVarM7051 == lVarM2798 ? 1538286 : 1538255;
                                                                            break;
                                                                        case 3751:
                                                                            break;
                                                                        case 3800:
                                                                            iM2914 = C0152.m2912(i1Var, C0379.m7443());
                                                                            iM2913 = (((((iM3213 - 27) - iM2914) + 27) - 14) - iM16411) + 14;
                                                                            i16 = 1538441;
                                                                            while (true) {
                                                                                i16 ^= 1538458;
                                                                                switch (i16) {
                                                                                    case 19:
                                                                                        i16 = 1538472;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 3833:
                                                                            iM2913 = C0152.m2912(i1Var, C0379.m7443());
                                                                            int i84 = 1538317;
                                                                            while (true) {
                                                                                i84 ^= 1538334;
                                                                                switch (i84) {
                                                                                    case 19:
                                                                                        i84 = 1538348;
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
                                                            default:
                                                                break;
                                                        }
                                                        sVar = new b3.s(iM2913, iM68612);
                                                        int i85 = 1541262;
                                                        while (true) {
                                                            i85 ^= 1541279;
                                                            switch (i85) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i85 = 1541293;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                        List listM1466 = C0071.m1463(i1Var, C0331.m6399(), new u0.b((-1843374662) ^ C0443.f714, new g2(sVar, C0258.m4934(this), 1), true));
                                        ArrayList arrayList5 = new ArrayList(C0008.m171(listM1466));
                                        int iM174 = C0008.m171(listM1466);
                                        int i86 = 0;
                                        while (true) {
                                            int i87 = i86;
                                            int i88 = 1541386;
                                            while (true) {
                                                i88 ^= 1541403;
                                                switch (i88) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i88 = i87 < iM174 ? 1542130 : 1542099;
                                                        break;
                                                    case 687:
                                                        break;
                                                    case 712:
                                                        break;
                                                    case 745:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                boolean zM38815 = C0203.m3889(arrayList5);
                                                int i89 = 1542285;
                                                while (true) {
                                                    i89 ^= 1542302;
                                                    switch (i89) {
                                                        case 19:
                                                            i89 = zM38815 ? 1543029 : 1542347;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 85:
                                                            Object objM44812 = C0233.m4486(arrayList5, 0);
                                                            int iM68613 = C0350.m6867((r1.x0) objM44812);
                                                            int iM5786 = C0300.m5781(arrayList5);
                                                            int i90 = 1;
                                                            int i91 = 1543184;
                                                            while (true) {
                                                                i91 ^= 1543201;
                                                                switch (i91) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 49:
                                                                        i91 = 1 <= iM5786 ? 1543277 : 1543246;
                                                                        break;
                                                                    case 76:
                                                                        while (true) {
                                                                            Object obj12 = objM44812;
                                                                            int i92 = iM68613;
                                                                            objM44812 = C0233.m4486(arrayList5, i90);
                                                                            iM68613 = C0350.m6867((r1.x0) objM44812);
                                                                            int i93 = 1543308;
                                                                            while (true) {
                                                                                i93 ^= 1543325;
                                                                                switch (i93) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i93 = i92 < iM68613 ? 1544052 : 1544021;
                                                                                        break;
                                                                                    case 939:
                                                                                        break;
                                                                                    case 968:
                                                                                        objM44812 = obj12;
                                                                                        iM68613 = i92;
                                                                                        break;
                                                                                    case 1001:
                                                                                        int i94 = 1544083;
                                                                                        while (true) {
                                                                                            i94 ^= 1544100;
                                                                                            switch (i94) {
                                                                                                case 22:
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                                    i94 = 1544114;
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
                                                                            int i95 = 1544207;
                                                                            while (true) {
                                                                                i95 ^= 1544224;
                                                                                switch (i95) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 47:
                                                                                        i95 = i90 != iM5786 ? 1544951 : 1544269;
                                                                                        break;
                                                                                    case 109:
                                                                                        break;
                                                                                    case 727:
                                                                                        i90 += C0122.f148 ^ (-55);
                                                                                        int i96 = 1544982;
                                                                                        while (true) {
                                                                                            i96 ^= 1544999;
                                                                                            switch (i96) {
                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                    break;
                                                                                                case 49:
                                                                                                    i96 = 1545013;
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
                                                                    case 111:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            obj4 = objM44812;
                                                            break;
                                                        case 1003:
                                                            int i97 = 1543060;
                                                            while (true) {
                                                                i97 ^= 1543077;
                                                                switch (i97) {
                                                                    case 22:
                                                                        obj4 = null;
                                                                        break;
                                                                    case 49:
                                                                        i97 = 1543091;
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
                                                r1.x0 x0Var4 = (r1.x0) obj4;
                                                int i98 = 1545106;
                                                while (true) {
                                                    i98 ^= 1545123;
                                                    switch (i98) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 49:
                                                            i98 = x0Var4 != null ? 1545199 : 1545168;
                                                            break;
                                                        case 76:
                                                            numM1083 = C0057.m1083(C0350.m6867(x0Var4));
                                                            int i99 = 1545230;
                                                            while (true) {
                                                                i99 ^= 1545247;
                                                                switch (i99) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i99 = 1545912;
                                                                        continue;
                                                                    case 679:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 115:
                                                            numM1083 = null;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int i100 = 1546005;
                                                while (true) {
                                                    i100 ^= 1546022;
                                                    switch (i100) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            i100 = sVar != null ? 1546098 : 1546067;
                                                            break;
                                                        case 84:
                                                            int iM4796 = C0250.m4796(sVar);
                                                            int i101 = 1546129;
                                                            while (true) {
                                                                i101 ^= 1546146;
                                                                switch (i101) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        i101 = numM1083 != null ? 1567054 : 1546191;
                                                                        break;
                                                                    case 109:
                                                                        iM2912 = iM4796 - (0 - C0152.m2912(i1Var, C0379.m7443()));
                                                                        iM35510 = C0186.m3559(i1VarM1207, i1Var);
                                                                        i12 = 1568108;
                                                                        while (true) {
                                                                            i12 ^= 1568125;
                                                                            switch (i12) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i12 = 1568139;
                                                                                    continue;
                                                                                    continue;
                                                                                case 246:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 32492:
                                                                        boolean zM26810 = C0139.m2687(iM845, C0292.f440 ^ 44);
                                                                        int i102 = 1567085;
                                                                        while (true) {
                                                                            i102 ^= 1567102;
                                                                            switch (i102) {
                                                                                case 19:
                                                                                    i102 = zM26810 ? 1567178 : 1567147;
                                                                                    break;
                                                                                case 180:
                                                                                    int i103 = 1567209;
                                                                                    while (true) {
                                                                                        i103 ^= 1567226;
                                                                                        switch (i103) {
                                                                                            case 19:
                                                                                                i103 = 1567240;
                                                                                                continue;
                                                                                            case 1010:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                        iM2912 = iM4796 - (0 - C0152.m2912(i1Var, C0379.m7443()));
                                                                                        iM35510 = C0186.m3559(i1VarM1207, i1Var);
                                                                                        i12 = 1568108;
                                                                                        while (true) {
                                                                                            i12 ^= 1568125;
                                                                                            switch (i12) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i12 = 1568139;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 246:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 213:
                                                                                    iM2912 = 0 - ((0 - C0366.m7190(numM1083)) - iM4796);
                                                                                    iM35510 = C0152.m2912(i1Var, C0379.m7443());
                                                                                    break;
                                                                                case 242:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                int i104 = 1567333;
                                                                while (true) {
                                                                    i104 ^= 1567350;
                                                                    switch (i104) {
                                                                        case 19:
                                                                            i104 = 1568015;
                                                                            continue;
                                                                        case 1913:
                                                                            numM1084 = C0057.m1083((iM35510 - 15) + iM2912 + 15);
                                                                            int i105 = 1568232;
                                                                            while (true) {
                                                                                i105 ^= 1568249;
                                                                                switch (i105) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i105 = 1568263;
                                                                                        continue;
                                                                                    case 1022:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 117:
                                                            numM1084 = null;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int i106 = 1569007;
                                                while (true) {
                                                    i106 ^= 1569024;
                                                    switch (i106) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            i11 = 0;
                                                            break;
                                                        case 76:
                                                            int i107 = 1569131;
                                                            while (true) {
                                                                i107 ^= 1569148;
                                                                switch (i107) {
                                                                    case 23:
                                                                        i107 = numM1084 != null ? 1569224 : 1569193;
                                                                        break;
                                                                    case 180:
                                                                        iM3559 = C0366.m7190(numM1084);
                                                                        int i108 = 1569255;
                                                                        while (true) {
                                                                            i108 ^= 1569272;
                                                                            switch (i108) {
                                                                                case 31:
                                                                                    i108 = 1569937;
                                                                                    continue;
                                                                                case 1385:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 213:
                                                                        int i109 = 1570030;
                                                                        while (true) {
                                                                            i109 ^= 1570047;
                                                                            switch (i109) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i109 = numM1083 != null ? 1570123 : 1570092;
                                                                                    break;
                                                                                case 436:
                                                                                    iM3559 = C0366.m7190(numM1083);
                                                                                    int i110 = 1570154;
                                                                                    while (true) {
                                                                                        i110 ^= 1570171;
                                                                                        switch (i110) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i110 = 1570185;
                                                                                                continue;
                                                                                            case 242:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 467:
                                                                                    iM3559 = C0186.m3559(i1VarM1207, i1Var);
                                                                                    break;
                                                                                case 498:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 246:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i11 = iM3559 - (0 - i10);
                                                            int i111 = 1570929;
                                                            while (true) {
                                                                i111 ^= 1570946;
                                                                switch (i111) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 243:
                                                                        i111 = 1570960;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 495:
                                                            if (i10 != 0) {
                                                                i106 = 1569100;
                                                            }
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i106 = 1569069;
                                                }
                                                List listM1467 = C0071.m1463(i1Var, C0202.m3886(), new u0.b((-1655277131) ^ C0305.f453, new f2(C0063.m1207(this), i1Var, arrayList2, iM6867, arrayList5, numM1083, C0215.m4110(this), 1), true));
                                                ArrayList arrayList6 = new ArrayList(C0008.m171(listM1467));
                                                int iM175 = C0008.m171(listM1467);
                                                int i112 = 0;
                                                while (true) {
                                                    int i113 = i112;
                                                    int i114 = 1571053;
                                                    while (true) {
                                                        i114 ^= 1571070;
                                                        switch (i114) {
                                                            case 19:
                                                                i114 = i113 < iM175 ? 1571146 : 1571115;
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
                                                        return C0410.m8048(i1Var, iM3213, iM8452, sVarM2452, new m2(arrayList6, arrayList2, arrayList, arrayList5, sVar, iM3213, iM1647, C0063.m1207(this), i1Var, iM8452, i11, numM1083, arrayList4, numM1084));
                                                    }
                                                    C0357.m6998(arrayList6, C0453.m8844((r1.i0) C0315.m6101(listM1467, i113), jM3547));
                                                    i112 = (C0288.f433 ^ 758) + i113;
                                                    int i115 = 1571177;
                                                    while (true) {
                                                        i115 ^= 1571194;
                                                        switch (i115) {
                                                            case 19:
                                                                i115 = 1571859;
                                                                break;
                                                            case 1385:
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                            C0357.m6998(arrayList5, C0453.m8844((r1.i0) C0315.m6101(listM1466, i87), jM3547));
                                            i86 = (C0256.f336 ^ (-855)) + i87;
                                            int i116 = 1542161;
                                            while (true) {
                                                i116 ^= 1542178;
                                                switch (i116) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        i116 = 1542192;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    r1.x0 x0VarM8844 = C0453.m8844((r1.i0) C0315.m6101(listM1465, i57), C0341.m6705(jM3547, (((-C0420.m8261(i1VarM1207, i1Var, C0359.m7050(i1Var))) - 22) - C0180.m3431(i1VarM1207, i1Var, C0359.m7050(i1Var))) + 22, -C0186.m3559(i1VarM1207, i1Var)));
                                    int iM68614 = C0350.m6867(x0VarM8844);
                                    int i117 = 1509549;
                                    while (true) {
                                        i117 ^= 1509566;
                                        switch (i117) {
                                            case 19:
                                                i117 = iM68614 != 0 ? 1509642 : 1509611;
                                                break;
                                            case 85:
                                                x0VarM8844 = null;
                                                break;
                                            case 114:
                                                break;
                                            case 436:
                                                int iM16412 = C0076.m1647(x0VarM8844);
                                                int i118 = 1509673;
                                                while (true) {
                                                    i118 ^= 1509690;
                                                    switch (i118) {
                                                        case 19:
                                                            i118 = iM16412 != 0 ? 1510417 : 1510386;
                                                            break;
                                                        case 712:
                                                            x0VarM8844 = null;
                                                            break;
                                                        case 745:
                                                            break;
                                                        case 1323:
                                                            int i119 = 1510448;
                                                            while (true) {
                                                                i119 ^= 1510465;
                                                                switch (i119) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 113:
                                                                        i119 = 1510479;
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
                                    int i120 = 1510572;
                                    while (true) {
                                        i120 ^= 1510589;
                                        switch (i120) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i120 = x0VarM8844 != null ? 1511316 : 1510634;
                                                break;
                                            case 87:
                                                break;
                                            case 118:
                                                break;
                                            case 809:
                                                C0357.m6998(arrayList4, x0VarM8844);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    i56 = (C0462.f733 ^ 308) + i57;
                                    int i121 = 1511347;
                                    while (true) {
                                        i121 ^= 1511364;
                                        switch (i121) {
                                            case 22:
                                                break;
                                            case 119:
                                                i121 = 1511378;
                                                break;
                                        }
                                    }
                                }
                            }
                            C0357.m6998(arrayList3, C0453.m8844((r1.i0) C0315.m6101(listM1464, i31), C0341.m6705(jM3547, (((-C0420.m8261(i1VarM1207, i1Var, C0359.m7050(i1Var))) + 15) - C0180.m3431(i1VarM1207, i1Var, C0359.m7050(i1Var))) - 15, -C0186.m3559(i1VarM1207, i1Var))));
                            i30 = (C0255.f335 ^ (-329)) + i31;
                            int i122 = 51712;
                            while (true) {
                                i122 ^= 51729;
                                switch (i122) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i122 = 51743;
                                        break;
                                }
                            }
                        }
                    }
                    C0357.m6998(arrayList2, C0453.m8844((r1.i0) C0315.m6101(listM1463, i18), jM3547));
                    i17 = (C0423.f694 ^ 807) + i18;
                    int i123 = 1740;
                    while (true) {
                        i123 ^= 1757;
                        switch (i123) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i123 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                }
                break;
        }
    }

    @Override // c9.e
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (C0399.m7826(this)) {
            case 0:
                break;
        }
        return C0119.m2295(this, (r1.i1) obj, C0116.m2241((m2.a) obj2));
    }
}
