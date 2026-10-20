package k0;

import a7.C0008;
import aa.C0012;
import android.support.v4.graphics.drawable.C0016;
import c1.C0058;
import com.google.android.datatransport.cct.C0076;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.lifecycle.C0237;
import g.C0282;
import h.C0297;
import h1.C0300;
import i.C0315;
import java.util.ArrayList;
import java.util.List;
import m9.C0359;
import q7.C0390;
import r6.C0401;
import u1.C0432;
import u4.C0435;
import y9.C0478;
import z3.C0485;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1.l0 f8896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArrayList arrayList, r1.l0 l0Var, float f10, int i10, ArrayList arrayList2) {
        super(1);
        this.f8895a = arrayList;
        this.f8896b = l0Var;
        this.f8897c = f10;
        this.f8898d = i10;
        this.f8899e = arrayList2;
        int iM9326 = C0478.m9326();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9326 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0282.m5450("3wQc")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0071. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00a6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00dd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0014. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x0110. Please report as an issue. */
    @Override // c9.c
    public final Object invoke(Object obj) {
        int iM2912;
        r1.w0 w0Var = (r1.w0) obj;
        int iM3654 = C0191.m3654(this);
        List listM7640 = C0390.m7640(this);
        int iM171 = C0008.m171(listM7640);
        int i10 = 0;
        while (true) {
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = i10 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                return C0012.m238();
            }
            List list = (List) C0315.m6101(listM7640, i10);
            int iM172 = C0008.m171(list);
            int[] iArr = new int[iM172];
            int i12 = 0;
            while (true) {
                r1.l0 l0VarM1105 = C0058.m1105(this);
                int i13 = 1740;
                while (true) {
                    i13 ^= 1757;
                    switch (i13) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i13 = i12 < iM172 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            int iM1647 = C0076.m1647((r1.x0) C0315.m6101(list, i12));
                            int iM5781 = C0300.m5781(list);
                            int i14 = 1864;
                            while (true) {
                                i14 ^= 1881;
                                switch (i14) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i14 = i12 < iM5781 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        iM2912 = 0;
                                        break;
                                    case 47417:
                                        iM2912 = C0152.m2912(l0VarM1105, C0186.m3549(this));
                                        int i15 = 48767;
                                        while (true) {
                                            i15 ^= 48784;
                                            switch (i15) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i15 = 48798;
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
                            iArr[i12] = (iM2912 + (iM1647 + 26)) - 26;
                            int i16 = (C0109.f135 ^ 66) + i12;
                            int i17 = 48891;
                            while (true) {
                                i17 ^= 48908;
                                switch (i17) {
                                    case 22:
                                        break;
                                    case 503:
                                        i17 = 48922;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i12 = i16;
                            break;
                        default:
                            break;
                    }
                    y.d dVarM5714 = C0297.m5714();
                    int[] iArr2 = new int[iM172];
                    int i18 = 0;
                    while (true) {
                        int i19 = 49666;
                        while (true) {
                            i19 ^= 49683;
                            switch (i19) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i19 = i18 < iM172 ? 49759 : 49728;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    iArr2[i18] = 0;
                                    i18 += C0432.f703 ^ 524;
                                    int i20 = 49790;
                                    while (true) {
                                        i20 ^= 49807;
                                        switch (i20) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 241:
                                                i20 = 49821;
                                                break;
                                        }
                                    }
                                    break;
                                case 83:
                                    break;
                                default:
                                    break;
                            }
                            C0485.m9439(dVarM5714, l0VarM1105, iM3654, iArr, C0359.m7050(l0VarM1105), iArr2);
                            int iM173 = C0008.m171(list);
                            int i21 = 0;
                            while (true) {
                                int i22 = 49914;
                                while (true) {
                                    i22 ^= 49931;
                                    switch (i22) {
                                        case 497:
                                            i22 = i21 < iM173 ? 50658 : 50627;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            C0016.m326(w0Var, (r1.x0) C0315.m6101(list, i21), iArr2[i21], C0435.m8515((Number) C0315.m6101(C0401.m7877(this), i10)));
                                            int i23 = (C0188.f212 ^ 104) + i21;
                                            int i24 = 50689;
                                            while (true) {
                                                i24 ^= 50706;
                                                switch (i24) {
                                                    case 19:
                                                        i24 = 50720;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            i21 = i23;
                                            break;
                                        default:
                                            break;
                                    }
                                    int i25 = (C0237.f317 ^ (-616)) + i10;
                                    int i26 = 50813;
                                    while (true) {
                                        i26 ^= 50830;
                                        switch (i26) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 243:
                                                i26 = 50844;
                                                break;
                                        }
                                    }
                                    i10 = i25;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
