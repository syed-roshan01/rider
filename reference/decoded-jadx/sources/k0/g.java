package k0;

import a7.C0008;
import aa.C0012;
import androidx.compose.foundation.text.modifiers.C0025;
import b7.C0054;
import c0.C0057;
import c1.C0059;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.C0127;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import dagger.hilt.C0255;
import dagger.hilt.android.lifecycle.C0237;
import e2.C0263;
import f.C0269;
import i.C0315;
import java.util.ArrayList;
import java.util.List;
import k2.C0333;
import m1.C0350;
import m7.C0357;
import s0.C0410;
import t1.C0419;
import u1.C0431;
import w.C0453;
import x4.C0468;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class g implements r1.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8935b;

    public g(float f10, float f11) {
        this.f8934a = f10;
        this.f8935b = f11;
        int iM4876 = C0255.m4876();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4876 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0419.m8235("LRTgkzHtvDR2j7WCQAOW3za0R1fk")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(ArrayList arrayList, d9.s sVar, r1.l0 l0Var, float f10, ArrayList arrayList2, ArrayList arrayList3, d9.s sVar2, ArrayList arrayList4, d9.s sVar3, d9.s sVar4) {
        boolean zM9582 = C0492.m9582(arrayList);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (((((zM9582 ? 1 : 0) ^ '\uffff') & 1) | ((zM9582 ? 1 : 0) & '\ufffe')) != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    sVar.f4950a = C0152.m2912(l0Var, f10) - (0 - C0269.m5138(sVar));
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        C0468.m9127(arrayList, 0, C0012.m227(arrayList2));
        C0431.m8441(arrayList3, C0057.m1083(C0269.m5138(sVar2)));
        C0431.m8441(arrayList4, C0057.m1083(C0269.m5138(sVar)));
        sVar.f4950a = ((C0269.m5138(sVar) + 2) + C0269.m5138(sVar2)) - 2;
        sVar3.f4950a = C0059.m1119(C0269.m5138(sVar3), C0269.m5138(sVar4));
        C0333.m6473(arrayList2);
        sVar4.f4950a = 0;
        sVar2.f4950a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00a2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0036. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r1.j0
    public final r1.k0 e(r1.l0 l0Var, List list, long j10) {
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        d9.s sVar = new d9.s();
        d9.s sVar2 = new d9.s();
        ArrayList arrayList4 = new ArrayList();
        d9.s sVar3 = new d9.s();
        d9.s sVar4 = new d9.s();
        float fM1042 = C0054.m1042(this);
        int iM171 = C0008.m171(list);
        int i11 = 0;
        while (true) {
            int i12 = i11;
            int i13 = 1616;
            while (true) {
                i13 ^= 1633;
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i13 = i12 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                boolean zM3889 = C0203.m3889(arrayList4);
                int i14 = 49790;
                while (true) {
                    i14 ^= 49807;
                    switch (i14) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            break;
                        case 84:
                            C0263.m5035(arrayList, sVar2, l0Var, C0054.m1042(this), arrayList4, arrayList2, sVar4, arrayList3, sVar, sVar3);
                            break;
                        case 241:
                            if (((((zM3889 ? 1 : 0) ^ '\uffff') & 1) | ((zM3889 ? 1 : 0) & '\ufffe')) != 0) {
                                i14 = 49883;
                            }
                            break;
                        default:
                            continue;
                    }
                    i14 = 49852;
                }
                int iM1119 = C0059.m1119(C0269.m5138(sVar), C0090.m1927(j10));
                return C0410.m8048(l0Var, iM1119, C0059.m1119(C0269.m5138(sVar2), C0117.m2264(j10)), C0127.m2452(), new f(arrayList, l0Var, C0025.m502(this), iM1119, arrayList3));
            }
            r1.x0 x0VarM8844 = C0453.m8844((r1.i0) C0315.m6101(list, i12), j10);
            boolean zM38810 = C0203.m3889(arrayList4);
            float fM502 = C0025.m502(this);
            int i15 = 1740;
            while (true) {
                i15 ^= 1757;
                switch (i15) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i15 = !zM38810 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        i10 = 48767;
                        while (true) {
                            i10 ^= 48784;
                            switch (i10) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 239:
                                    i10 = 48798;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        int iM5138 = C0269.m5138(sVar3);
                        int iM2912 = C0152.m2912(l0Var, fM502);
                        int iM1647 = C0076.m1647(x0VarM8844);
                        int iM3212 = C0168.m3212(j10);
                        int i16 = 1864;
                        while (true) {
                            i16 ^= 1881;
                            switch (i16) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i16 = (((((iM2912 + 30) + iM5138) + (-30)) + (-19)) + iM1647) + 19 <= iM3212 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    C0263.m5035(arrayList, sVar2, l0Var, fM1042, arrayList4, arrayList2, sVar4, arrayList3, sVar, sVar3);
                                    break;
                                case 47417:
                                    i10 = 48767;
                                    while (true) {
                                        i10 ^= 48784;
                                        switch (i10) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i10 = 48798;
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
                boolean zM38811 = C0203.m3889(arrayList4);
                int i17 = 48891;
                while (true) {
                    i17 ^= 48908;
                    switch (i17) {
                        case 22:
                            break;
                        case 53:
                            break;
                        case 503:
                            i17 = ((((zM38811 ? 1 : 0) ^ '\uffff') & 1) | ((zM38811 ? 1 : 0) & '\ufffe')) != 0 ? 49635 : 48953;
                            break;
                        case 32495:
                            sVar3.f4950a = C0152.m2912(l0Var, fM502) - (0 - C0269.m5138(sVar3));
                            break;
                        default:
                            break;
                    }
                }
                C0357.m6998(arrayList4, x0VarM8844);
                sVar3.f4950a = ((C0269.m5138(sVar3) + 27) + C0076.m1647(x0VarM8844)) - 27;
                sVar4.f4950a = C0059.m1119(C0269.m5138(sVar4), C0350.m6867(x0VarM8844));
                i11 = (C0237.f317 ^ (-616)) + i12;
                int i18 = 49666;
                while (true) {
                    i18 ^= 49683;
                    switch (i18) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i18 = 49697;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                    }
                }
            }
        }
    }
}
