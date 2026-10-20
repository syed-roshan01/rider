package d5;

import aa.C0012;
import android.os.C0013;
import androidx.lifecycle.C0043;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0226;
import dagger.hilt.android.lifecycle.C0237;
import f4.C0274;
import g4.C0289;
import l6.C0344;
import m0.l3;
import m1.C0351;
import p3.C0375;
import s7.C0415;
import t2.C0421;
import w4.C0459;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f248short = {1733, 1735, 1738, 1738, 1670, 1746, 1737, 1670, 1665, 1748, 1731, 1749, 1747, 1739, 1731, 1665, 1670, 1732, 1731, 1728, 1737, 1748, 1731, 1670, 1665, 1743, 1736, 1744, 1737, 1741, 1731, 1665, 1670, 1745, 1743, 1746, 1742, 1670, 1733, 1737, 1748, 1737, 1747, 1746, 1743, 1736, 1731, 928, 934, 944, 944, 950, 928, 928};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MainViewModel f4418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0.g1 f4421f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l3 f4422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m0.e1 f4423o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l3 f4424p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(MainViewModel mainViewModel, String str, int i10, m0.g1 g1Var, l3 l3Var, m0.e1 e1Var, l3 l3Var2, u8.e eVar) {
        super(C0226.f306 ^ 837, eVar);
        this.f4418c = mainViewModel;
        this.f4419d = str;
        this.f4420e = i10;
        this.f4421f = g1Var;
        this.f4422n = l3Var;
        this.f4423o = e1Var;
        this.f4424p = l3Var2;
        int iM5286 = C0274.m5286();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5286 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0421.m8275("NpiqQBiAseWcrkhaB5d6Smu6l")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m4154() {
        int iM9373 = C0481.m9373();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9373 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f248short;
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        int iM6753 = 0;
        String str = "\u06e7\u06e0\u06e5";
        String strM8159 = null;
        m0.e1 e1VarM5571 = null;
        l3 l3VarM6895 = null;
        l3 l3VarM264 = null;
        MainViewModel mainViewModelM7359 = null;
        m0.g1 g1VarM8942 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56350:
                    e1VarM5571 = C0289.m5571(this);
                    str = "\u06e3\u06df\u06df";
                    break;
                case 56386:
                    iM6753 = C0344.m6753(this);
                    str = "\u06e0\u06e4\u06e5";
                    break;
                case 1746780:
                    return this;
                case 1747809:
                    g1VarM8942 = C0459.m8942(this);
                    str = "\u06e6\u06e7\u06e3";
                    break;
                case 1748859:
                    str = "\u06df\u06e2\u06df";
                    this = new b2(mainViewModelM7359, strM8159, iM6753, g1VarM8942, l3VarM264, e1VarM5571, l3VarM6895, eVar);
                    break;
                case 1750531:
                    l3VarM6895 = C0351.m6895(this);
                    str = "\u06e1\u06e7\u06e1";
                    break;
                case 1753666:
                    l3VarM264 = C0013.m264(this);
                    str = "\u06e1\u06df";
                    break;
                case 1754412:
                    mainViewModelM7359 = C0375.m7359(this);
                    str = "\u06e4\u06e1\u06e7";
                    break;
                default:
                    strM8159 = C0415.m8159(this);
                    str = "\u06e2\u06e4";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e3\u06e1\u06e2";
        u8.e eVar = null;
        Object objM4571 = obj;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVarM837 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747713:
                    str = "\u06e3\u06e2\u06e5";
                    lVarM238 = C0012.m238();
                    break;
                case 1747774:
                    return objM4571;
                case 1747900:
                    str = "\u06e0\u06e1\u06e2";
                    this = (b2) eVarM837;
                    break;
                case 1750596:
                    str = "\u06e2\u06e3";
                    d0Var = (m9.d0) objM4571;
                    break;
                case 1750630:
                    objM4571 = C0237.m4571(this, lVarM238);
                    str = "\u06e0\u06e3\u06e1";
                    break;
                case 1754531:
                    eVarM837 = C0043.m837(this, d0Var, eVar);
                    str = "\u06e0\u06e7\u06e3";
                    break;
                default:
                    str = "\u06e7\u06e4\u06e0";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0128 -> B:22:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:71:0x014e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.b2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
