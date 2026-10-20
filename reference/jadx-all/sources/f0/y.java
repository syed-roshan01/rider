package f0;

import a.C0000;
import aa.C0012;
import android.support.v4.graphics.drawable.C0016;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.node.C0037;
import androidx.startup.C0047;
import b3.C0051;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.messaging.C0191;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.sql.C0208;
import d2.C0216;
import dagger.hilt.android.components.C0230;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.componenttreedeps.C0249;
import dagger.hilt.internal.generatesrootinput.C0251;
import e1.C0260;
import f6.C0278;
import i6.C0321;
import j2.C0325;
import l0.C0340;
import l8.C0347;
import m1.C0351;
import m5.C0356;
import o4.C0370;
import o7.i2;
import q9.C0392;
import s.C0408;
import s8.C0417;
import u1.C0433;
import u1.t2;
import v0.C0443;
import z3.C0486;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class y extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f6002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1.k f6003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.v0 f6005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2.s f6006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c2 c2Var, c1.k kVar, boolean z10, h0.v0 v0Var, g2.s sVar) {
        super(1);
        this.f6002a = c2Var;
        this.f6003b = kVar;
        this.f6004c = z10;
        this.f6005d = v0Var;
        this.f6006e = sVar;
        int iM6658 = C0340.m6658();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6658 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0443.m8645("HK1tr7N")));
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
    @Override // c9.c
    public final Object invoke(Object obj) {
        long jM235 = C0012.m235((d1.c) obj);
        boolean zM3653 = C0191.m3653(this);
        c2 c2VarM3158 = C0165.m3158(this);
        boolean zM6272 = C0325.m6272(c2VarM3158);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM6272 ? 1709 : 1678;
                    break;
                case 204:
                    C0157.m3001(C0051.m997(this));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = ((((zM3653 ? 1 : 0) ^ 65535) & 1) | ((zM3653 ? 1 : 0) & 65534)) != 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                t2 t2VarM4831 = C0253.m4831(c2VarM3158);
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 76:
                                            g2.b0 b0VarM309 = C0016.m309((u1.u1) t2VarM4831);
                                            g2.h0 h0Var = (g2.h0) C0491.m9542(C0230.m4413(b0VarM309));
                                            int i14 = 48891;
                                            while (true) {
                                                i14 ^= 48908;
                                                switch (i14) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 503:
                                                        i14 = h0Var != null ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        C0392.m7655((g2.e0) C0022.m427(b0VarM309), C0000.m7());
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i13 = t2VarM4831 != null ? 48860 : 48829;
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
                    break;
                default:
                    break;
            }
        }
        boolean zM6273 = C0325.m6272(c2VarM3158);
        int i15 = 49666;
        while (true) {
            i15 ^= 49683;
            switch (i15) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (zM6273) {
                        i15 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    o0 o0VarM7252 = C0370.m7252(c2VarM3158);
                    o0 o0VarM8467 = C0433.m8467();
                    int i16 = 49790;
                    while (true) {
                        i16 ^= 49807;
                        switch (i16) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                C0260.m4955(C0047.m901(this), new d1.c(jM235));
                                break;
                            case 84:
                                d2 d2VarM9440 = C0486.m9440(c2VarM3158);
                                int i17 = 49914;
                                while (true) {
                                    i17 ^= 49931;
                                    switch (i17) {
                                        case 497:
                                            if (d2VarM9440 != null) {
                                                i17 = 50658;
                                            }
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            int iM3988 = C0208.m3988(C0347.m6784(this), C0029.m560(d2VarM9440, jM235, true));
                                            C0130.m2513(C0249.m4757(c2VarM3158), C0020.m412(C0408.m7993(C0101.m1984(c2VarM3158)), null, C0251.m4797(iM3988, iM3988), C0351.f621 ^ (-715)));
                                            int iM8181 = C0417.m8181(C0278.m5369(C0216.m4109(C0321.m6196(c2VarM3158))));
                                            int i18 = 50689;
                                            while (true) {
                                                i18 ^= 50706;
                                                switch (i18) {
                                                    case 19:
                                                        if (iM8181 > 0) {
                                                            i18 = 50782;
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        C0037.m728(C0356.m6974(c2VarM3158), C0165.m3162());
                                                        int i19 = 50813;
                                                        while (true) {
                                                            i19 ^= 50830;
                                                            switch (i19) {
                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 243:
                                                                    i19 = 50844;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i18 = 50751;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i17 = 50627;
                                }
                                break;
                            case 241:
                                if (o0VarM7252 != o0VarM8467) {
                                    i16 = 49883;
                                }
                                break;
                            default:
                                continue;
                        }
                        i16 = 49852;
                    }
                    break;
                case 83:
                    break;
                default:
                    continue;
            }
            i15 = 49728;
        }
        return C0012.m238();
    }
}
