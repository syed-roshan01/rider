package f0;

import a2.C0004;
import a8.C0009;
import aa.C0012;
import androidx.activity.C0017;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.node.C0037;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.internal.Code;
import d4.C0218;
import d5.C0219;
import dagger.hilt.internal.componenttreedeps.C0249;
import e1.C0260;
import g9.C0295;
import i4.C0318;
import j2.C0325;
import l6.C0344;
import m9.C0360;
import o2.C0369;
import o7.i2;
import q1.C0384;
import t7.C0426;
import v0.C0444;
import v5.C0445;
import w4.C0462;
import w5.C0464;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class x extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f5989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2.b0 f5990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2.a0 f5993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g2.o f5994f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g2.s f5995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h0.v0 f5996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m9.d0 f5997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0.f f5998q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c2 c2Var, g2.b0 b0Var, boolean z10, boolean z11, g2.a0 a0Var, g2.o oVar, g2.s sVar, h0.v0 v0Var, m9.d0 d0Var, c0.f fVar) {
        super(1);
        this.f5989a = c2Var;
        this.f5990b = b0Var;
        this.f5991c = z10;
        this.f5992d = z11;
        this.f5993e = a0Var;
        this.f5994f = oVar;
        this.f5995n = sVar;
        this.f5996o = v0Var;
        this.f5997p = d0Var;
        this.f5998q = fVar;
        int iM8351 = C0426.m8351();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8351 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0173.m3303("PdAqTiUZmgfM")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        c2 c2VarM8989 = C0462.m8989(this);
        boolean zM6272 = C0325.m6272(c2VarM8989);
        c1.o oVar = (c1.o) ((c1.n) obj);
        boolean zM337 = C0017.m337(oVar);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM6272 == zM337) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    C0037.m728(C0219.m4227(c2VarM8989), C0009.m192(C0017.m337(oVar)));
                    g2.b0 b0VarM7055 = C0360.m7055(this);
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = b0VarM7055 != null ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                boolean zM6273 = C0325.m6272(c2VarM8989);
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            C0218.m4146(c2VarM8989);
                                            break;
                                        case 76:
                                            boolean zM8658 = C0444.m8658(this);
                                            int i14 = 48891;
                                            while (true) {
                                                i14 ^= 48908;
                                                switch (i14) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        C0218.m4146(c2VarM8989);
                                                        break;
                                                    case 503:
                                                        i14 = zM8658 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        boolean zM8675 = C0445.m8675(this);
                                                        int i15 = 49666;
                                                        while (true) {
                                                            i15 ^= 49683;
                                                            switch (i15) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i15 = !zM8675 ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    g2.a0 a0VarM77 = C0004.m77(this);
                                                                    c2VarM8989.f5640e = C0120.m2320(b0VarM7055, a0VarM77, C0101.m1984(c2VarM8989), C0426.m8332(this), C0249.m4757(c2VarM8989), C0183.m3493(c2VarM8989));
                                                                    C0295.m5664(c2VarM8989, a0VarM77, C0369.m7224(this));
                                                                    int i16 = 49790;
                                                                    while (true) {
                                                                        i16 ^= 49807;
                                                                        switch (i16) {
                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 241:
                                                                                i16 = 49821;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    C0218.m4146(c2VarM8989);
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
                                        case 239:
                                            i13 = zM6273 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                boolean zM338 = C0017.m337(oVar);
                                int i17 = 49914;
                                while (true) {
                                    i17 ^= 49931;
                                    switch (i17) {
                                        case 497:
                                            i17 = zM338 ? 50658 : 50627;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            d2 d2VarM9440 = C0486.m9440(c2VarM8989);
                                            int i18 = 50689;
                                            while (true) {
                                                i18 ^= 50706;
                                                switch (i18) {
                                                    case 19:
                                                        i18 = d2VarM9440 != null ? 50782 : 50751;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        C0384.m7508(C0344.m6739(this), null, 0, new w(C0464.m9040(this), C0004.m77(this), C0462.m8989(this), d2VarM9440, C0369.m7224(this), null), C0318.f465 ^ 342);
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
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM339 = C0017.m337(oVar);
                    int i19 = 50813;
                    while (true) {
                        i19 ^= 50830;
                        switch (i19) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                break;
                            case 243:
                                if (!zM339) {
                                    i19 = 51557;
                                }
                                break;
                            case 4075:
                                C0260.m4955(C0029.m569(this), null);
                                break;
                            default:
                                continue;
                        }
                        i19 = 50875;
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
