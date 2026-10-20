package f0;

import a8.C0010;
import aa.C0012;
import androidx.core.app.C0040;
import c0.C0056;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.encoders.C0143;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfiginterop.C0203;
import d1.C0211;
import d8.C0221;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.componenttreedeps.C0248;
import dagger.hilt.internal.generatesrootinput.C0250;
import e7.C0264;
import f6.C0277;
import h6.C0309;
import i4.C0317;
import i5.C0318;
import k3.C0334;
import l3.C0342;
import m3.C0352;
import o7.i2;
import p3.C0375;
import p8.C0379;
import r5.C0399;
import r9.C0405;
import s8.C0416;
import v0.C0440;
import w1.C0455;
import x0.C0466;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f351short = {428, 484, 504, 505, 483, 430, 1890, 1909, 1888, 1916, 1905, 1907, 1909, 1917, 1909, 1918, 1892, 466, 505, 499, 439, 510, 505, 499, 498, 495, 439, 447, 603, 594, 539, 513, 594, 542, 535, 513, 513, 594, 518, 538, 531, 540, 594, 513, 518, 531, 512, 518, 594, 539, 540, 534, 535, 522, 594, 602, 2838, 2833};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f5610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.a0 f5611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z10, boolean z11, c2 c2Var, y1.v vVar, g2.a0 a0Var) {
        super(1);
        this.f5608a = z10;
        this.f5609b = z11;
        this.f5610c = c2Var;
        this.f5611d = a0Var;
        int iM4453 = C0231.m4453();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4453 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0243.m4679("3YPMeKERC8eyjukkPG")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5179() {
        int iM4762 = C0248.m4762();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4762 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f351short;
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

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVarM238 = null;
        a2.e eVar = (a2.e) obj;
        boolean zM6141 = C0317.m6141(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM6141) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM7432 = C0379.m7432(this);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM7432) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                c2 c2VarM3228 = C0168.m3228(this);
                                g2.h0 h0VarM3751 = C0196.m3751(c2VarM3228);
                                v vVarM4757 = C0248.m4757(c2VarM3228);
                                int i12 = 48767;
                                while (true) {
                                    i12 ^= 48784;
                                    switch (i12) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 76:
                                            g2.a0 a0VarM6718 = C0342.m6718(C0101.m1984(c2VarM3228), C0405.m7965(new g2.i[]{new g2.l(), new g2.a(eVar, 1)}));
                                            C0103.m2029(h0VarM3751, null, a0VarM6718);
                                            C0130.m2513(vVarM4757, a0VarM6718);
                                            lVarM238 = C0012.m238();
                                            break;
                                        case 239:
                                            i12 = h0VarM3751 != null ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i13 = 48891;
                                while (true) {
                                    i13 ^= 48908;
                                    switch (i13) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i13 = lVarM238 == null ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            g2.a0 a0VarM9199 = C0472.m9199(this);
                                            String strM5369 = C0277.m5369(C0143.m2754(a0VarM9199));
                                            C0153.m2937();
                                            long jM5972 = C0309.m5972(a0VarM9199);
                                            int i14 = (int) (jM5972 >> 32);
                                            int i15 = (int) (jM5972 & ((4294967295L ^ (-1)) ^ jM5972));
                                            C0375.m7360(strM5369, C0160.m3074(m5179(), 0, C0352.f623 ^ (-629), 400));
                                            C0375.m7360(eVar, C0264.m5055(m5179(), 6, C0040.f60 ^ (-92), 1808));
                                            int i16 = 49666;
                                            while (true) {
                                                i16 ^= 49683;
                                                switch (i16) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i16 = i15 >= i14 ? 49759 : 49728;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        StringBuilder sb = new StringBuilder();
                                                        C0466.m9092(sb, strM5369, 0, i14);
                                                        C0203.m3892(sb, eVar);
                                                        C0466.m9092(sb, strM5369, i15, C0416.m8181(strM5369));
                                                        String strM3852 = C0201.m3852(sb);
                                                        int iM8181 = i14 - (0 - C0416.m8181(C0277.m5369(eVar)));
                                                        C0130.m2513(vVarM4757, new g2.a0(strM3852, C0250.m4797(iM8181, iM8181), C0399.f670 ^ 6));
                                                        int i17 = 49790;
                                                        while (true) {
                                                            i17 ^= 49807;
                                                            switch (i17) {
                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 241:
                                                                    i17 = 49821;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        StringBuilder sb2 = new StringBuilder(C0221.m4271(m5179(), 17, C0040.f60 ^ (-92), 407));
                                                        C0197.m3772(sb2, i15);
                                                        C0142.m2728(sb2, C0211.m4036(m5179(), 28, C0318.f466 ^ 179, 626));
                                                        C0197.m3772(sb2, i14);
                                                        C0142.m2728(sb2, C0010.m206(m5179(), 56, C0056.f76 ^ (-848), 2879));
                                                        throw new IndexOutOfBoundsException(C0440.m8605(sb2));
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                Boolean boolM6483 = C0334.m6483();
                                int i18 = 49914;
                                while (true) {
                                    i18 ^= 49931;
                                    switch (i18) {
                                        case 497:
                                            i18 = 50596;
                                            break;
                                        case 1711:
                                            return boolM6483;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i19 = 1864;
                                while (true) {
                                    i19 ^= 1881;
                                    switch (i19) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i19 = 48674;
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
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0455.m8876();
    }
}
