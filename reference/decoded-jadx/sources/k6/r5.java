package k6;

import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.relocation.C0024;
import androidx.fragment.app.C0042;
import androidx.versionedparcelable.C0048;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.components.C0134;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.tracing.C0204;
import dagger.hilt.internal.processedrootsentinel.C0251;
import e8.C0265;
import f.C0269;
import i6.C0319;
import k8.C0338;
import l3.C0342;
import u3.C0434;
import v5.C0444;
import w1.C0455;
import w5.C0463;
import y.C0474;
import z.C0480;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r5 f10341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r5 f10342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r5 f10343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r5 f10344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r5[] f10345f;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f581short = {1436, 1433, 1442, 1422, 1417, 1426, 1423, 1436, 1434, 1432, 1825, 1828, 1855, 1843, 1844, 1839, 1842, 1825, 1831, 1829, 1602, 1613, 1602, 1615, 1626, 1623, 1610, 1600, 1616, 1660, 1616, 1623, 1612, 1617, 1602, 1604, 1606, 1440, 1455, 1440, 1453, 1464, 1461, 1448, 1442, 1458, 1470, 1458, 1461, 1454, 1459, 1440, 1446, 1444, 2867, 2870, 2829, 2855, 2849, 2871, 2848, 2829, 2870, 2867, 2854, 2867, 1704, 1709, 1718, 1724, 1722, 1708, 1723, 1718, 1709, 1704, 1725, 1704, 1073, 1076, 1039, 1056, 1077, 1058, 1059, 1087, 1086, 1073, 1084, 1081, 1066, 1073, 1060, 1081, 1087, 1086, 631, 626, 617, 614, 627, 612, 613, 633, 632, 631, 634, 639, 620, 631, 610, 639, 633, 632};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10346a;

    static {
        r5 r5Var = new r5(C0173.m3297(f581short, 10, C0251.f331 ^ 595, 1888), 0, C0177.m3376(f581short, 0, C0134.f160 ^ (-853), 1533));
        f10341b = r5Var;
        r5 r5Var2 = new r5(C0463.m9022(f581short, 37, C0338.f609 ^ 831, 1505), 1, C0024.m469(f581short, 20, C0079.f113 ^ (-571), 1571));
        f10342c = r5Var2;
        r5 r5Var3 = new r5(C0157.m2993(f581short, 66, C0434.f705 ^ 434, 1769), C0042.f62 ^ 91, C0104.m2036(f581short, 54, C0455.f726 ^ 572, 2898));
        f10343d = r5Var3;
        r5 r5Var4 = new r5(C0197.m3785(f581short, 96, C0342.f613 ^ 43, 566), C0204.f228 ^ 794, C0269.m5144(f581short, 78, C0319.f467 ^ 222, 1104));
        f10344e = r5Var4;
        r5[] r5VarArr = new r5[4];
        r5VarArr[C0020.f40 ^ (-667)] = r5Var;
        r5VarArr[C0444.f715 ^ (-855)] = r5Var2;
        r5VarArr[C0048.f68 ^ (-739)] = r5Var3;
        r5VarArr[C0265.f345 ^ 925] = r5Var4;
        f10345f = r5VarArr;
    }

    public r5(String str, int i10, String str2) {
        super(str, i10);
        this.f10346a = str2;
        int iM9354 = C0480.m9354();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9354 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0474.m9233("zrWw9QNVXyCc406GUX14C4w")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public static r5[] values() {
        return (r5[]) f10345f.clone();
    }
}
