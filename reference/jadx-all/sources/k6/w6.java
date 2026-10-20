package k6;

import android.support.v4.app.C0015;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.node.C0037;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import f.C0270;
import f.C0271;
import h.C0298;
import h7.C0311;
import j5.C0328;
import m5.C0356;
import m7.C0357;
import r2.C0397;
import r9.C0406;
import w0.C0455;
import w2.C0458;

/* JADX INFO: loaded from: classes.dex */
public final class w6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f598short = {1841, 1820, 1798, 1814, 1812, 1799, 1809, 1820, 1819, 1810, 1877, 1809, 1812, 1793, 1812, 1883, 1877, 1843, 1812, 1820, 1817, 1808, 1809, 1877, 1793, 1818, 1877, 1798, 1808, 1819, 1809, 1877, 1814, 1818, 1819, 1809, 1820, 1793, 1820, 1818, 1819, 1812, 1817, 1877, 1792, 1798, 1808, 1799, 1877, 1797, 1799, 1818, 1797, 1808, 1799, 1793, 1804, 1877, 1793, 1818, 1877, 1798, 1808, 1799, 1795, 1820, 1814, 1808, 1735, 1770, 1776, 1760, 1762, 1777, 1767, 1770, 1773, 1764, 1699, 1767, 1762, 1783, 1762, 1709, 1699, 1733, 1762, 1770, 1775, 1766, 1767, 1699, 1783, 1772, 1699, 1776, 1766, 1773, 1767, 1699, 1766, 1781, 1766, 1773, 1783, 1699, 1783, 1772, 1699, 1776, 1766, 1777, 1781, 1770, 1760, 1766};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10466a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7 f10467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s6 f10469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a6.a f10470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10471f;

    public w6(s6 s6Var, x7 x7Var, boolean z10, e eVar, e eVar2) {
        this.f10469d = s6Var;
        this.f10467b = x7Var;
        this.f10468c = z10;
        this.f10470e = eVar;
        int iM2434 = C0126.m2434();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2434 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0298.m5717("TUXSYzhMfiOCiqKLHwcCOyhxUouE"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public w6(s6 s6Var, x7 x7Var, boolean z10, v vVar, String str) {
        this.f10469d = s6Var;
        this.f10467b = x7Var;
        this.f10468c = z10;
        this.f10470e = vVar;
        int iM6984 = C0357.m6984();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6984 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0270.m5142("i6giidtsBszskQIKgLLd"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6608() {
        int iM7952 = C0406.m7952();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7952 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f598short;
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

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        v vVar = null;
        int iM735 = C0037.m735(this);
        a6.a aVarM2876 = C0150.m2876(this);
        boolean zM4703 = C0246.m4703(this);
        x7 x7VarM297 = C0015.m297(this);
        s6 s6VarM6977 = C0356.m6977(this);
        switch (iM735) {
            case 0:
                y3 y3VarM2387 = C0124.m2387(s6VarM6977);
                int i10 = 48891;
                while (true) {
                    i10 ^= 48908;
                    switch (i10) {
                        case 22:
                            break;
                        case 53:
                            C0271.m5173(x7VarM297);
                            int i11 = 49790;
                            while (true) {
                                i11 ^= 49807;
                                switch (i11) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 51:
                                        vVar = (v) aVarM2876;
                                        break;
                                    case 84:
                                        int i12 = 49914;
                                        while (true) {
                                            i12 ^= 49931;
                                            switch (i12) {
                                                case 497:
                                                    i12 = 50596;
                                                    break;
                                                case 1711:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 241:
                                        i11 = zM4703 ? 49883 : 49852;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0458.m8908(s6VarM6977, y3VarM2387, vVar, x7VarM297);
                            C0311.m6011(s6VarM6977);
                            break;
                        case 503:
                            if (y3VarM2387 == null) {
                                i10 = 49635;
                            }
                            break;
                        case 32495:
                            C0135.m2604(C0455.m8871(C0029.m572(s6VarM6977)), C0328.m6318(m6608(), 68, C0137.f163 ^ 82, 1667));
                            int i13 = 49666;
                            while (true) {
                                i13 ^= 49683;
                                switch (i13) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i13 = 49697;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    i10 = 48953;
                }
                break;
            default:
                y3 y3VarM2388 = C0124.m2387(s6VarM6977);
                int i14 = 1616;
                while (true) {
                    i14 ^= 1633;
                    switch (i14) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (y3VarM2388 == null) {
                                i14 = 1709;
                            }
                            break;
                        case 204:
                            C0135.m2604(C0455.m8871(C0029.m572(s6VarM6977)), C0397.m7757(m6608(), 0, C0079.f113 ^ (-624), 1909));
                            int i15 = 1740;
                            while (true) {
                                i15 ^= 1757;
                                switch (i15) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            C0271.m5173(x7VarM297);
                            int i16 = 1864;
                            while (true) {
                                i16 ^= 1881;
                                switch (i16) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (zM4703) {
                                            i16 = 48736;
                                        }
                                        break;
                                    case 47384:
                                        eVar = (e) aVarM2876;
                                        break;
                                    case 47417:
                                        int i17 = 48767;
                                        while (true) {
                                            i17 ^= 48784;
                                            switch (i17) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    eVar = null;
                                                    break;
                                                case 239:
                                                    i17 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        break;
                                }
                                i16 = 48705;
                            }
                            C0458.m8908(s6VarM6977, y3VarM2388, eVar, x7VarM297);
                            C0311.m6011(s6VarM6977);
                            break;
                        default:
                            continue;
                    }
                    i14 = 1678;
                }
                break;
        }
    }
}
