package k6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.input.pointer.C0034;
import b8.C0055;
import c1.C0059;
import c4.C0066;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import d3.C0217;
import d5.C0219;
import dagger.hilt.android.C0241;
import dagger.hilt.android.internal.C0236;
import e1.C0258;
import e2.C0263;
import i.C0316;
import i4.C0318;
import ja.C0331;
import l0.C0340;
import l3.C0343;
import n7.C0364;
import r5.C0401;
import t1.C0420;
import u7.C0438;
import v5.C0445;
import v6.C0448;
import z1.C0484;

/* JADX INFO: loaded from: classes.dex */
public final class y7 extends BroadcastReceiver {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f604short = {2637, 2684, 2684, 2604, 2686, 2665, 2671, 2665, 2661, 2682, 2665, 2686, 2604, 2671, 2669, 2656, 2656, 2665, 2664, 2604, 2683, 2661, 2680, 2660, 2604, 2658, 2681, 2656, 2656, 2604, 2661, 2658, 2680, 2665, 2658, 2680, 2656, 2641, 2641, 2561, 2643, 2628, 2626, 2628, 2632, 2647, 2628, 2643, 2561, 2626, 2624, 2637, 2637, 2628, 2629, 2561, 2646, 2632, 2645, 2633, 2561, 2639, 2644, 2637, 2637, 2561, 2624, 2626, 2645, 2632, 2638, 2639, 3320, 3316, 3318, 3253, 3324, 3316, 3316, 3324, 3319, 3326, 3253, 3322, 3317, 3327, 3305, 3316, 3314, 3327, 3253, 3324, 3318, 3304, 3253, 3318, 3326, 3322, 3304, 3310, 3305, 3326, 3318, 3326, 3317, 3311, 3253, 3279, 3273, 3282, 3292, 3292, 3294, 3273, 3272, 3268, 3290, 3277, 3290, 3282, 3287, 3290, 3289, 3287, 3294, 720, 737, 737, 689, 739, 756, 754, 756, 760, 743, 756, 739, 689, 754, 752, 765, 765, 756, 757, 689, 742, 760, 741, 761, 689, 740, 767, 762, 767, 766, 742, 767, 689, 752, 754, 741, 760, 766, 767, 719, 766, 766, 686, 764, 747, 749, 747, 743, 760, 747, 764, 686, 736, 737, 762, 743, 744, 743, 747, 746, 686, 762, 764, 743, 745, 745, 747, 764, 765, 686, 751, 764, 747, 686, 751, 760, 751, 743, 738, 751, 748, 738, 747};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5 f10586a;

    public y7(f5 f5Var) {
        this.f10586a = f5Var;
        int iM1056 = C0055.m1056();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1056 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0401.m7858("6u")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۨۥۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6614() {
        int iM8247 = C0420.m8247();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8247 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f604short;
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

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        f5 f5VarM662 = C0034.m662(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (intent == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    d4 d4VarM3434 = C0180.m3434(f5VarM662);
                    C0258.m4924(d4VarM3434);
                    C0135.m2604(C0331.m6385(d4VarM3434), C0217.m4120(m6614(), 0, C0364.f634 ^ (-44), 2572));
                    int iM5016 = C0263.m5016();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM5016 >= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Double.parseDouble(C0165.m3157("s2v433xp4boOq4E3")));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    String strM4226 = C0219.m4226(intent);
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (strM4226 == null) {
                                    i12 = 48736;
                                }
                                break;
                            case 47384:
                                boolean zM321 = C0016.m321(strM4226, C0119.m2300(m6614(), 72, C0316.f463 ^ 567, 3227));
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            boolean zM1131 = C0059.m1131();
                                            int i14 = 48891;
                                            while (true) {
                                                i14 ^= 48908;
                                                switch (i14) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        return;
                                                    case 503:
                                                        if (zM1131) {
                                                            i14 = 49635;
                                                        }
                                                        break;
                                                    case 32495:
                                                        boolean zM3575 = C0187.m3575(C0438.m8535(f5VarM662), null, C0318.m6157());
                                                        int i15 = 49666;
                                                        while (true) {
                                                            i15 ^= 49683;
                                                            switch (i15) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!zM3575) {
                                                                        i15 = 49759;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    int i16 = 49790;
                                                                    while (true) {
                                                                        i16 ^= 49807;
                                                                        switch (i16) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                return;
                                                                            case 241:
                                                                                i16 = 49821;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    d4 d4VarM3435 = C0180.m3434(f5VarM662);
                                                                    C0258.m4924(d4VarM3435);
                                                                    C0135.m2604(C0136.m2634(d4VarM3435), C0236.m4534(m6614(), 164, C0066.f86 ^ (-246), 654));
                                                                    z4 z4VarM8666 = C0445.m8666(f5VarM662);
                                                                    C0258.m4924(z4VarM8666);
                                                                    C0343.m6719(z4VarM8666, new h.a(f5VarM662, C0144.f170 ^ (-134)));
                                                                    return;
                                                                default:
                                                                    continue;
                                                            }
                                                            i15 = 49728;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i14 = 48953;
                                            }
                                            break;
                                        case 76:
                                            d4 d4VarM3436 = C0180.m3434(f5VarM662);
                                            C0258.m4924(d4VarM3436);
                                            C0135.m2604(C0331.m6385(d4VarM3436), C0448.m8719(m6614(), 125, C0484.f757 ^ (-812), 657));
                                            return;
                                        case 239:
                                            if (!zM321) {
                                                i13 = 48860;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48829;
                                }
                                break;
                            case 47417:
                                d4 d4VarM3437 = C0180.m3434(f5VarM662);
                                C0258.m4924(d4VarM3437);
                                C0135.m2604(C0331.m6385(d4VarM3437), C0241.m4608(m6614(), 36, C0340.f610 ^ (-1005), 2593));
                                return;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i12 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
