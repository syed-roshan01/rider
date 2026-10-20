package k0;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.annotation.C0019;
import b1.C0050;
import c1.C0059;
import c3.C0062;
import c7.C0069;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.cct.C0076;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0170;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.lifecycle.C0237;
import e1.C0258;
import e8.C0266;
import f4.C0276;
import h6.C0310;
import k1.C0333;
import k7.C0338;
import la.C0349;
import m1.C0351;
import m7.C0359;
import p0.C0375;
import p8.C0380;
import r1.C0394;
import t9.C0428;
import u.C0429;
import v8.C0451;
import y.C0476;

/* JADX INFO: loaded from: classes.dex */
public final class w4 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.x0 f9619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1.x0 f9622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r1.x0 f9623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r1.x0 f9624f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r1.x0 f9625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r1.x0 f9626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r1.x0 f9627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r1.x0 f9628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r1.x0 f9629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x4 f9630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r1.l0 f9632u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(r1.x0 x0Var, int i10, int i11, r1.x0 x0Var2, r1.x0 x0Var3, r1.x0 x0Var4, r1.x0 x0Var5, r1.x0 x0Var6, r1.x0 x0Var7, r1.x0 x0Var8, r1.x0 x0Var9, x4 x4Var, int i12, r1.l0 l0Var) {
        super(1);
        this.f9619a = x0Var;
        this.f9620b = i10;
        this.f9621c = i11;
        this.f9622d = x0Var2;
        this.f9623e = x0Var3;
        this.f9624f = x0Var4;
        this.f9625n = x0Var5;
        this.f9626o = x0Var6;
        this.f9627p = x0Var7;
        this.f9628q = x0Var8;
        this.f9629r = x0Var9;
        this.f9630s = x4Var;
        this.f9631t = i12;
        this.f9632u = l0Var;
        int iM8371 = C0428.m8371();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8371 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0276.m5304("ZGfMulk7JQ9tdpNiUaiXtHBaw")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int iM4912;
        r1.w0 w0Var = (r1.w0) obj;
        r1.x0 x0VarM1178 = C0062.m1178(this);
        r1.x0 x0VarM2212 = C0114.m2212(this);
        r1.l0 l0VarM7440 = C0380.m7440(this);
        r1.x0 x0VarM2372 = C0123.m2372(this);
        r1.x0 x0VarM1598 = C0073.m1598(this);
        r1.x0 x0VarM6815 = C0349.m6815(this);
        r1.x0 x0VarM2928 = C0152.m2928(this);
        r1.x0 x0VarM7351 = C0375.m7351(this);
        r1.x0 x0VarM7714 = C0394.m7714(this);
        int iM7023 = C0359.m7023(this);
        int iM4548 = C0237.m4548(this);
        x4 x4VarM8779 = C0451.m8779(this);
        r1.x0 x0VarM5077 = C0266.m5077(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (x0VarM5077 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM1132 = C0059.m1132(x4VarM8779);
                    int iM6867 = C0351.m6867(x0VarM5077);
                    int iM385 = C0019.m385(this);
                    int i11 = iM6867 - (0 - iM385);
                    float fM4299 = C0224.m4299(l0VarM7440);
                    C0170.m3249(w0Var, x0VarM1178, C0310.m5966());
                    int iM6460 = ((iM7023 + 23) - C0333.m6460(x0VarM2372)) - 23;
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = x0VarM7351 != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0050.m966(w0Var, x0VarM7351, 0, C0258.m4912(((((iM6460 - 17) - C0351.m6867(x0VarM7351)) + 17) / 2.0f) * (0.0f - ((0.0f - 1) - 0.0f))));
                                break;
                            default:
                                break;
                        }
                    }
                    int i13 = 1864;
                    while (true) {
                        i13 ^= 1881;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = x0VarM2928 != null ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                C0050.m966(w0Var, x0VarM2928, ((iM4548 + 4) - C0076.m1647(x0VarM2928)) - 4, C0258.m4912(((((iM6460 + 20) - C0351.m6867(x0VarM2928)) - 20) / 2.0f) * (0.0f - ((0.0f - 1) - 0.0f))));
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                iM4912 = C0258.m4912(C0429.m8394() * fM4299);
                                break;
                            case 76:
                                iM4912 = C0258.m4912(((((iM6460 + 3) - C0351.m6867(x0VarM5077)) - 3) / 2.0f) * ((1 - 23.0f) + 0.0f + 23.0f));
                                int i15 = 48891;
                                while (true) {
                                    i15 ^= 48908;
                                    switch (i15) {
                                        case 22:
                                            break;
                                        case 503:
                                            i15 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 239:
                                i14 = zM1132 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    C0050.m966(w0Var, x0VarM5077, C0228.m4386(x0VarM7351), ((iM4912 - 22) - C0258.m4912((((iM4912 - 7) - iM385) + 7) * C0014.m281(x4VarM8779))) + 22);
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = x0VarM6815 != null ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0050.m966(w0Var, x0VarM6815, C0228.m4386(x0VarM7351), i11);
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                                break;
                            default:
                                break;
                        }
                    }
                    int i18 = 49914;
                    while (true) {
                        i18 ^= 49931;
                        switch (i18) {
                            case 497:
                                i18 = x0VarM1598 != null ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                C0050.m966(w0Var, x0VarM1598, (((((iM4548 - 22) - C0228.m4386(x0VarM2928)) + 22) - 8) - C0076.m1647(x0VarM1598)) + 8, i11);
                                break;
                            default:
                                break;
                        }
                    }
                    int iM4386 = C0228.m4386(x0VarM6815) - (0 - C0228.m4386(x0VarM7351));
                    C0050.m966(w0Var, x0VarM2212, iM4386, i11);
                    int i19 = 50689;
                    while (true) {
                        i19 ^= 50706;
                        switch (i19) {
                            case 19:
                                i19 = x0VarM7714 != null ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0050.m966(w0Var, x0VarM7714, iM4386, i11);
                                break;
                            default:
                                break;
                        }
                    }
                    int i20 = 50813;
                    while (true) {
                        i20 ^= 50830;
                        switch (i20) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                break;
                            case 243:
                                if (x0VarM2372 != null) {
                                    i20 = 51557;
                                }
                                break;
                            case 4075:
                                C0050.m966(w0Var, x0VarM2372, 0, iM6460);
                                int i21 = 51588;
                                while (true) {
                                    i21 ^= 51605;
                                    switch (i21) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = 51619;
                                            break;
                                        case 54:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i20 = 50875;
                    }
                    break;
                case 239:
                    boolean zM1133 = C0059.m1132(x4VarM8779);
                    float fM42910 = C0224.m4299(l0VarM7440);
                    C0170.m3249(w0Var, x0VarM1178, C0310.m5966());
                    int iM6461 = ((iM7023 + 3) - C0333.m6460(x0VarM2372)) - 3;
                    int iM4913 = C0258.m4912(fM42910 * C0338.m6619(C0069.m1346(x4VarM8779)));
                    int i22 = 51712;
                    while (true) {
                        i22 ^= 51729;
                        switch (i22) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i22 = x0VarM7351 != null ? 51805 : 51774;
                                break;
                            case 47:
                                break;
                            case 76:
                                C0050.m966(w0Var, x0VarM7351, 0, C0258.m4912(((((iM6461 - 3) - C0351.m6867(x0VarM7351)) + 3) / 2.0f) * (1 - (0.0f - 0.0f))));
                                break;
                            default:
                                break;
                        }
                    }
                    int i23 = 51836;
                    while (true) {
                        i23 ^= 51853;
                        switch (i23) {
                            case 241:
                                i23 = x0VarM2928 != null ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                break;
                            case 2025:
                                C0050.m966(w0Var, x0VarM2928, ((iM4548 - 16) - C0076.m1647(x0VarM2928)) + 16, C0258.m4912(((((iM6461 - 1) - C0351.m6867(x0VarM2928)) + 1) / 2.0f) * (0.0f - (0.0f - 1))));
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
                                i24 = x0VarM6815 != null ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                break;
                            case 116:
                                C0050.m966(w0Var, x0VarM6815, C0228.m4386(x0VarM7351), C0476.m9261(zM1133, iM6461, iM4913, x0VarM6815));
                                break;
                            default:
                                break;
                        }
                    }
                    int i25 = 52735;
                    while (true) {
                        i25 ^= 52752;
                        switch (i25) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 1007:
                                i25 = x0VarM1598 != null ? 53479 : 52797;
                                break;
                            case 7927:
                                C0050.m966(w0Var, x0VarM1598, (((((iM4548 + 19) - C0228.m4386(x0VarM2928)) - 19) + 14) - C0076.m1647(x0VarM1598)) - 14, C0476.m9261(zM1133, iM6461, iM4913, x0VarM1598));
                                break;
                            default:
                                break;
                        }
                    }
                    int iM4387 = C0228.m4386(x0VarM6815) - (0 - C0228.m4386(x0VarM7351));
                    C0050.m966(w0Var, x0VarM2212, iM4387, C0476.m9261(zM1133, iM6461, iM4913, x0VarM2212));
                    int i26 = 53510;
                    while (true) {
                        i26 ^= 53527;
                        switch (i26) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i26 = x0VarM7714 != null ? 53603 : 53572;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 83:
                                break;
                            case 116:
                                C0050.m966(w0Var, x0VarM7714, iM4387, C0476.m9261(zM1133, iM6461, iM4913, x0VarM7714));
                                break;
                            default:
                                break;
                        }
                    }
                    int i27 = 53634;
                    while (true) {
                        i27 ^= 53651;
                        switch (i27) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (x0VarM2372 != null) {
                                    i27 = 53727;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0050.m966(w0Var, x0VarM2372, 0, iM6461);
                                break;
                            case 83:
                                break;
                            default:
                                continue;
                        }
                        i27 = 53696;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0012.m238();
    }
}
