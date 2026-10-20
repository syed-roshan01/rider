package f0;

import a8.C0010;
import aa.C0012;
import android.graphics.Matrix;
import android.graphics.Path;
import android.support.v4.app.C0014;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.platform.C0038;
import androidx.preference.C0044;
import b4.C0052;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.aggregatedroot.C0247;
import dagger.hilt.internal.definecomponent.C0250;
import e0.C0257;
import g.C0283;
import m1.C0351;
import m7.C0358;
import o7.i2;
import q6.C0387;
import r5.C0400;
import u0.C0431;
import v0.C0441;
import w.C0454;
import w5.C0464;
import w6.C0465;
import w9.C0466;
import y.C0475;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f372short = {1525, 1522, 1511, 1524, 1522, 1454, 2157, 2148, 2091, 2102, 2148, 2081, 2090, 2080, 2156, 1767, 1774, 1703, 1725, 1774, 1697, 1723, 1722, 1774, 1697, 1704, 1774, 1724, 1711, 1696, 1705, 1707, 1774, 1685, 1790, 1760, 1760, 1912, 1801, 1797, 1866, 1879, 1797, 1878, 1873, 1860, 1879, 1873, 1797, 1819, 1797, 1856, 1867, 1857, 1796};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e1.i iVar, int i10, int i11) {
        super(1);
        this.f5845c = iVar;
        this.f5843a = i10;
        this.f5844b = i11;
        int iM8425 = C0431.m8425();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8425 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0351.m6859("ZrYVBWM36ICBkoSSDLJ370NL58"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5199() {
        int iM8831 = C0454.m8831();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8831 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f372short;
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
        a2.m mVar = (a2.m) obj;
        e1.d0 d0Var = (e1.d0) C0020.m407(this);
        a2.l lVarM9062 = C0466.m9062(mVar);
        int iM2350 = C0122.m2350(mVar, C0234.m4485(this));
        int iM2351 = C0122.m2350(mVar, C0387.m7569(this));
        a2.a aVar = (a2.a) lVarM9062;
        CharSequence charSequenceM4546 = C0237.m4546(aVar);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM2350 >= 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM2350 <= iM2351 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int iM2942 = C0153.m2942(charSequenceM4546);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = iM2351 <= iM2942 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            Path path = new Path();
                                            b2.v vVarM756 = C0038.m756(aVar);
                                            C0044.m856(C0052.m1020(vVarM756), iM2350, iM2351, path);
                                            int iM2665 = C0138.m2665(vVarM756);
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 76:
                                                        boolean zM1889 = C0088.m1889(path);
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    if (!zM1889) {
                                                                        i14 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    C0253.m4824(path, 0.0f, iM2665);
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        if (iM2665 != 0) {
                                                            i13 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48829;
                                            }
                                            long jM3152 = C0164.m3152(0.0f, C0159.m3032(mVar));
                                            Matrix matrix = new Matrix();
                                            C0157.m2992(matrix, C0257.m4903(jM3152), C0107.m2078(jM3152));
                                            C0283.m5445(path, matrix);
                                            long jM3534 = C0185.m3534();
                                            e1.i iVar = (e1.i) d0Var;
                                            C0014.m280(iVar);
                                            C0465.m9058(C0358.m7019(iVar), path, C0257.m4903(jM3534), C0107.m2078(jM3534));
                                            return C0012.m238();
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
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        StringBuilder sb = new StringBuilder(C0400.m7813(m5199(), 0, C0464.f734 ^ 293, 1414));
        C0197.m3772(sb, iM2350);
        C0142.m2728(sb, C0441.m8598(m5199(), 6, C0010.f30 ^ 888, 2116));
        C0197.m3772(sb, iM2351);
        C0142.m2728(sb, C0441.m8598(m5199(), 15, C0247.f326 ^ (-668), 1742));
        C0197.m3772(sb, C0153.m2942(charSequenceM4546));
        C0142.m2728(sb, C0250.m4771(m5199(), 37, C0475.f745 ^ (-628), 1829));
        throw new IllegalArgumentException(C0201.m3852(C0441.m8605(sb)));
    }
}
