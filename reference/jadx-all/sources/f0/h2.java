package f0;

import a7.C0008;
import androidx.compose.foundation.relocation.C0024;
import androidx.core.content.C0041;
import c3.C0062;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.cct.C0076;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.gson.internal.bind.C0207;
import d1.C0214;
import dagger.hilt.android.components.C0229;
import dagger.hilt.codegen.C0242;
import e1.C0258;
import k.C0332;
import l6.C0344;
import m1.C0351;
import m5.C0355;
import m7.C0359;
import n8.C0366;
import o5.C0371;
import o7.i2;
import q5.C0386;
import r9.C0406;
import s0.C0411;
import u1.C0432;
import v0.C0441;
import w.C0454;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements r1.v {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f361short = {970, 1017, 1006, 1000, 1013, 1023, 1021, 1008, 975, 1023, 1006, 1011, 1008, 1008, 976, 1021, 997, 1011, 1001, 1000, 977, 1011, 1016, 1013, 1018, 1013, 1017, 1006, 948, 1007, 1023, 1006, 1011, 1008, 1008, 1017, 1006, 972, 1011, 1007, 1013, 1000, 1013, 1011, 1010, 929, 1486, 1474, 1409, 1431, 1424, 1425, 1421, 1424, 1453, 1412, 1412, 1425, 1415, 1430, 1503, 1201, 1213, 1257, 1263, 1276, 1267, 1262, 1275, 1266, 1263, 1264, 1272, 1273, 1225, 1272, 1253, 1257, 1184, 551, 555, 639, 622, 627, 639, 583, 618, 626, 612, 638, 639, 601, 622, 632, 638, 615, 639, 603, 633, 612, 637, 610, 623, 622, 633, 566};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f5737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.i0 f5739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.a f5740e;

    public h2(a2 a2Var, int i10, g2.i0 i0Var, t.l0 l0Var) {
        this.f5737b = a2Var;
        this.f5738c = i10;
        this.f5739d = i0Var;
        this.f5740e = l0Var;
        int iM7035 = C0359.m7035();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7035 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0108.m2097("2bJRYvF")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۤۦۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5190() {
        int iM7269 = C0371.m7269();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7269 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f361short;
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

    public final boolean equals(Object obj) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (this == obj) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    boolean z10 = obj instanceof h2;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                h2 h2Var = (h2) obj;
                                boolean zM4399 = C0229.m4399(C0332.m6400(this), C0332.m6400(h2Var));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM4399) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            int iM3963 = C0207.m3963(this);
                                            int iM3964 = C0207.m3963(h2Var);
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM43910 = C0229.m4399(C0041.m817(this), C0041.m817(h2Var));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    boolean zM43911 = C0229.m4399(C0386.m7550(this), C0386.m7550(h2Var));
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM43911) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                return true;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i15 = 49728;
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    if (!zM43910) {
                                                                        i14 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    return false;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 48953;
                                                        }
                                                        break;
                                                    case 76:
                                                        return false;
                                                    case 239:
                                                        if (iM3963 != iM3964) {
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
                                            return false;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return false;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // r1.v
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        int iM6867 = 0;
        int iM8451 = 0;
        long jM3547 = 0;
        String str = "ۢۢۤ";
        r1.k0 k0VarM8048 = null;
        r1.x0 x0VarM8844 = null;
        r8.s sVarM2452 = null;
        r0 r0Var = null;
        int iM1191 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747685:
                    str = "ۧۦۢ";
                    iM1191 = C0062.m1191(iM6867, iM8451);
                    break;
                case 1748767:
                    k0VarM8048 = C0411.m8048(l0Var, iM6867, iM1191, sVarM2452, r0Var);
                    str = "ۤ۠ۢ";
                    break;
                case 1749668:
                    str = "ۧۤۦ";
                    iM6867 = C0242.f321;
                    break;
                case 1749728:
                    str = "ۣۡۧ";
                    iM6867 = C0351.m6867(x0VarM8844);
                    break;
                case 1750601:
                    iM8451 = C0432.m8451(j10);
                    str = "۠۠ۥ";
                    break;
                case 1751526:
                    return k0VarM8048;
                case 1752678:
                    sVarM2452 = C0127.m2452();
                    str = "ۡۤۢ";
                    break;
                case 1753639:
                    r0Var = new r0(iM1191, 1, l0Var, this, x0VarM8844);
                    str = "ۥۦۧ";
                    break;
                case 1754595:
                    str = "ۦۦۧ";
                    iM6867 = C0076.m1647(x0VarM8844);
                    break;
                case 1755429:
                    x0VarM8844 = C0454.m8844(i0Var, jM3547);
                    str = "ۢۤۢ";
                    break;
                case 1755462:
                    str = "ۨۢ۟";
                    jM3547 = C0186.m3547(j10, 0, 0, 0, Integer.MAX_VALUE, iM8451);
                    break;
                default:
                    iM8451 = iM6867 ^ (-803);
                    str = "ۣۨۡ";
                    break;
            }
        }
    }

    public final int hashCode() {
        String str = "ۢۦۦ";
        c9.a aVarM7550 = null;
        a2 a2VarM6400 = null;
        g2.i0 i0VarM817 = null;
        int i10 = 0;
        int iM7548 = 0;
        int iM2842 = 0;
        int iM1571 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746880:
                    str = "۠ۨۥ";
                    iM7548 = iM1571 - iM2842;
                    break;
                case 1747686:
                    i10 = iM2842 ^ (-321);
                    str = "ۣۦۧ";
                    break;
                case 1747902:
                    str = "ۢۤۢ";
                    iM7548 = C0386.m7548(iM1571, iM2842, i10);
                    break;
                case 1747933:
                    str = "ۢۤۡ";
                    iM1571 = iM7548 * i10;
                    break;
                case 1747936:
                    str = "۠۠ۦ";
                    iM2842 = C0258.f337;
                    break;
                case 1749664:
                    str = "۠ۧۥ";
                    iM1571 = C0207.m3963(this);
                    break;
                case 1749665:
                    i10 = iM1571 - iM7548;
                    str = "ۨۥ۠";
                    break;
                case 1749727:
                    aVarM7550 = C0386.m7550(this);
                    str = "ۢۥ۠";
                    break;
                case 1749728:
                    str = "ۥۨ";
                    i0VarM817 = C0041.m817(this);
                    break;
                case 1749757:
                    str = "ۧۦۣ";
                    iM2842 = C0148.m2842(aVarM7550);
                    break;
                case 1749794:
                    str = "ۤۦۡ";
                    a2VarM6400 = C0332.m6400(this);
                    break;
                case 1750756:
                    str = "ۢۢ۠";
                    iM2842 = iM1571 * i10;
                    break;
                case 1751711:
                    str = "۠ۨۨ";
                    iM1571 = C0148.m2842(a2VarM6400);
                    break;
                case 1754596:
                    str = "ۢۢۡ";
                    iM7548 = 0 - iM2842;
                    break;
                case 1755369:
                    str = "۟ۥۦ";
                    iM2842 = 0 - iM7548;
                    break;
                case 1755523:
                    return i10;
                default:
                    str = "ۨ۠ۡ";
                    iM1571 = C0073.m1571(i0VarM817);
                    break;
            }
        }
    }

    public final String toString() {
        String str = "ۡۦۨ";
        StringBuilder sb = null;
        g2.i0 i0VarM817 = null;
        a2 a2VarM6400 = null;
        c9.a aVarM7550 = null;
        short[] sArrM5190 = null;
        String strM9476 = null;
        int i10 = 0;
        int iM3963 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56292:
                    str = "ۧ۟ۡ";
                    i0VarM817 = C0041.m817(this);
                    break;
                case 56513:
                    str = "۠ۧۦ";
                    strM9476 = C0441.m8605(sb);
                    break;
                case 56568:
                    iM3963 = i10 ^ (-29);
                    str = "ۣۥ۠";
                    break;
                case 56575:
                    i10 = C0008.f28;
                    str = "ۨ۠";
                    break;
                case 1746751:
                    i10 = iM3963 ^ (-150);
                    str = "ۦ۠ۨ";
                    break;
                case 1747777:
                    C0142.m2728(sb, strM9476);
                    str = "ۨۤۦ";
                    break;
                case 1747871:
                    str = "ۦ۟۟";
                    strM9476 = C0344.m6742(sArrM5190, 46, i10, 1506);
                    break;
                case 1747903:
                    return strM9476;
                case 1748614:
                    iM3963 = C0366.f636;
                    str = "۟ۡۡ";
                    break;
                case 1748616:
                    str = "ۤۡۨ";
                    strM9476 = C0406.m7957(sArrM5190, 61, iM3963, 1181);
                    break;
                case 1748766:
                    str = "ۢۢ";
                    a2VarM6400 = C0332.m6400(this);
                    break;
                case 1748835:
                    str = "ۡ۟ۤ";
                    sArrM5190 = m5190();
                    break;
                case 1749669:
                    i10 = C0198.f222;
                    str = "ۣۧۢ";
                    break;
                case 1749759:
                    str = "ۢۢۥ";
                    sArrM5190 = m5190();
                    break;
                case 1749790:
                    C0175.m3331(sb, ')');
                    str = "ۦۧ";
                    break;
                case 1750533:
                    C0214.m4074(sb, aVarM7550);
                    str = "ۢۦۢ";
                    break;
                case 1750718:
                    str = "ۣ۠ۤ";
                    strM9476 = C0024.m469(sArrM5190, 79, iM3963, 523);
                    break;
                case 1751563:
                    C0142.m2728(sb, strM9476);
                    str = "ۣ۟";
                    break;
                case 1752522:
                    str = "ۨۧ";
                    sArrM5190 = m5190();
                    break;
                case 1753414:
                    C0142.m2728(sb, strM9476);
                    str = "ۦۧۨ";
                    break;
                case 1753454:
                    str = "ۧۡۧ";
                    strM9476 = C0487.m9476(sArrM5190, 0, i10, 924);
                    break;
                case 1753481:
                    i10 = iM3963 ^ 294;
                    str = "۠ۦۥ";
                    break;
                case 1753639:
                    C0197.m3772(sb, iM3963);
                    str = "ۢۥۢ";
                    break;
                case 1753671:
                    iM3963 = C0207.m3963(this);
                    str = "ۦۦۧ";
                    break;
                case 1754377:
                    C0214.m4074(sb, i0VarM817);
                    str = "ۥۡۦ";
                    break;
                case 1754445:
                    sb = new StringBuilder(strM9476);
                    str = "ۡۤۡ";
                    break;
                case 1754472:
                    iM3963 = i10 ^ 313;
                    str = "ۡ۟ۦ";
                    break;
                case 1754563:
                    str = "ۣۨۨ";
                    sArrM5190 = m5190();
                    break;
                case 1755469:
                    iM3963 = C0355.f625;
                    str = "ۦۡۤ";
                    break;
                case 1755498:
                    str = "ۣ۟ۡ";
                    aVarM7550 = C0386.m7550(this);
                    break;
                default:
                    C0214.m4074(sb, a2VarM6400);
                    str = "ۧۥۡ";
                    break;
            }
        }
    }
}
