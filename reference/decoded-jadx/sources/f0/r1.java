package f0;

import androidx.compose.ui.draw.C0028;
import b1.C0050;
import b4.C0052;
import ca.C0070;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import d.C0210;
import dagger.hilt.internal.processedrootsentinel.C0251;
import e2.C0261;
import ea.C0267;
import h5.C0307;
import j3.C0325;
import o2.C0368;
import o7.i2;
import r2.C0394;
import s2.C0411;
import u4.C0435;
import x5.C0470;
import y9.C0478;
import z2.C0484;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f376short = {1220, 1222, 1243, 1239, 1233, 1223, 1223, 1308, 1310, 1283, 1295, 1289, 1311, 1311, 1345, 1334, 1281, 1283, 1287, 1341, 1300, 1283, 1348, 1312, 1293, 1282, 1288, 1310, 1283, 1285, 1288, 1347, 1306, 1285, 1289, 1307, 1347, 1319, 1289, 1301, 1321, 1306, 1289, 1282, 1304, 1367, 1349, 1334};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f5873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.v0 f5874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.a0 f5875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g2.s f5878f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e2 f5879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.c f5880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5881p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(c2 c2Var, h0.v0 v0Var, g2.a0 a0Var, boolean z10, boolean z11, g2.s sVar, e2 e2Var, v vVar, int i10) {
        super(C0325.f473 ^ 368);
        this.f5873a = c2Var;
        this.f5874b = v0Var;
        this.f5875c = a0Var;
        this.f5876d = z10;
        this.f5877e = z11;
        this.f5878f = sVar;
        this.f5879n = e2Var;
        this.f5880o = vVar;
        this.f5881p = i10;
        int iM557 = C0028.m557();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM557 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0028.m550("6umwnueO3fMmY9rM")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5204() {
        int iM7729 = C0394.m7729();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7729 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f376short;
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

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        C0435.m8515((Number) obj3);
        m0.q qVar = (m0.q) ((m0.m) obj2);
        C0261.m4990(qVar, 2057324364 ^ C0052.f72);
        int i10 = C0175.f199 ^ (-492369258);
        C0261.m4990(qVar, i10);
        Object objM8078 = C0411.m8078(qVar);
        Object objM2417 = C0125.m2417();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = objM8078 == objM2417 ? 1709 : 1678;
                    break;
                case 204:
                    objM8078 = new h0.a1();
                    C0478.m9328(qVar, objM8078);
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        C0171.m3270(qVar, false);
        h0.a1 a1Var = (h0.a1) objM8078;
        C0261.m4990(qVar, i10);
        Object objM8079 = C0411.m8078(qVar);
        int i12 = 1740;
        while (true) {
            i12 ^= 1757;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (objM8079 == objM2417) {
                        i12 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    objM8079 = new k0();
                    C0478.m9328(qVar, objM8079);
                    break;
                default:
                    continue;
            }
            i12 = 1802;
        }
        C0171.m3270(qVar, false);
        y0.o oVarM7236 = C0368.m7236(new q1(1, new p1(C0114.m2197(this), C0470.m9150(this), C0050.m974(this), C0272.m5254(this), C0267.m5112(this), a1Var, C0251.m4808(this), C0307.m5928(this), (k0) objM8079, C0484.m9429(this), C0486.m9472(this)), p1.class, C0210.m4027(m5204(), 0, C0179.f203 ^ 568, 1204), C0207.m3953(m5204(), 7, C0070.f90 ^ 724, 1388)));
        C0171.m3270(qVar, false);
        return oVarM7236;
    }
}
