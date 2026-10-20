package d5;

import a.C0000;
import a8.C0009;
import aa.C0012;
import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.os.C0013;
import android.support.v4.app.C0015;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.relocation.C0024;
import b7.C0053;
import c4.C0065;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d4.C0217;
import d7.C0220;
import d9.C0224;
import dagger.hilt.C0255;
import dagger.hilt.android.components.C0227;
import dagger.hilt.codegen.C0242;
import e1.C0257;
import f4.C0274;
import f4.C0275;
import f6.C0277;
import g0.C0285;
import h0.C0299;
import h3.C0301;
import h8.C0313;
import h8.C0314;
import j6.C0328;
import j9.C0329;
import java.io.File;
import k1.C0332;
import k3.C0334;
import m0.C0349;
import m0.s2;
import m0.w2;
import m7.C0356;
import q7.C0390;
import r.C0392;
import r1.C0393;
import t0.C0418;
import t2.C0420;
import u1.C0431;
import u3.C0434;
import v.C0439;
import v5.C0445;
import w1.C0455;
import w9.C0465;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final class x extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f294short = {1316, 1318, 1323, 1323, 1383, 1331, 1320, 1383, 1376, 1333, 1314, 1332, 1330, 1322, 1314, 1376, 1383, 1317, 1314, 1313, 1320, 1333, 1314, 1383, 1376, 1326, 1321, 1329, 1320, 1324, 1314, 1376, 1383, 1328, 1326, 1331, 1327, 1383, 1316, 1320, 1333, 1320, 1330, 1331, 1326, 1321, 1314, 2320, 2331, 2307, 2330, 2328, 2331, 2325, 2320, 1910, 1901, 1908, 1908, 1848, 1915, 1913, 1910, 1910, 1911, 1900, 1848, 1914, 1917, 1848, 1915, 1913, 1899, 1900, 1848, 1900, 1911, 1848, 1910, 1911, 1910, 1845, 1910, 1901, 1908, 1908, 1848, 1900, 1889, 1896, 1917, 1848, 1913, 1910, 1916, 1898, 1911, 1905, 1916, 1846, 1913, 1896, 1896, 1846, 1884, 1911, 1903, 1910, 1908, 1911, 1913, 1916, 1877, 1913, 1910, 1913, 1919, 1917, 1898, 2259, 2248, 2245, 2260, 2242, 2286, 2242, 2270, 2286, 2263, 2256, 2243, 459, 464, 459, 478, 467, 480, 460, 470, 453, 474, 508, 507, 494, 507, 506, 508, 2744, 2747, 2743, 2741, 2744, 2699, 2721, 2726, 2749, 2851, 2824, 2832, 2825, 2827, 2824, 2822, 2819, 2887, 2817, 2822, 2830, 2827, 2818, 2819, 2889, 2887, 2871, 2827, 2818, 2822, 2836, 2818, 2887, 2835, 2837, 2846, 2887, 2822, 2816, 2822, 2830, 2825, 2889};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DownloadManager f4832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.f1 f4836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0.d1 f4837f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m0.g1 f4838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m0.g1 f4839o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, m0.g1 g1Var, m0.f1 f1Var, m0.d1 d1Var, m0.g1 g1Var2, m0.g1 g1Var3, u8.e eVar) {
        super(C0314.f462 ^ 256, eVar);
        this.f4834c = context;
        this.f4835d = g1Var;
        this.f4836e = f1Var;
        this.f4837f = d1Var;
        this.f4838n = g1Var2;
        this.f4839o = g1Var3;
        int iM177 = C0009.m177();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM177 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0117.m2252("ZSM8byvXnhfVZq")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4207() {
        int iM3380 = C0177.m3380();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3380 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f294short;
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
        String str = "\u06e7\u06e5\u06df";
        m0.f1 f1VarM4888 = null;
        m0.d1 d1VarM305 = null;
        m0.g1 g1VarM1260 = null;
        m0.g1 g1VarM4645 = null;
        Context contextM8492 = null;
        m0.g1 g1VarM5367 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747932:
                    d1VarM305 = C0015.m305(this);
                    str = "\u06e8\u06e6\u06e5";
                    break;
                case 1749731:
                    g1VarM5367 = C0277.m5367(this);
                    str = "\u06e1\u06e1\u06e8";
                    break;
                case 1750749:
                    str = "\u06e4\u06e7\u06e2";
                    this = new x(contextM8492, g1VarM5367, f1VarM4888, d1VarM305, g1VarM1260, g1VarM4645, eVar);
                    break;
                case 1751743:
                    return this;
                case 1754561:
                    contextM8492 = C0434.m8492(this);
                    str = "\u06e2\u06e4\u06e5";
                    break;
                case 1755559:
                    g1VarM1260 = C0065.m1260(this);
                    str = "\u06e8\u06e8\u06e5";
                    break;
                case 1755621:
                    g1VarM4645 = C0242.m4645(this);
                    str = "\u06e3\u06e6\u06e0";
                    break;
                default:
                    f1VarM4888 = C0255.m4888(this);
                    str = "\u06e0\u06e8\u06e4";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e8\u06e4\u06e7";
        u8.e eVarM3404 = null;
        u8.e eVar = null;
        m9.d0 d0Var = null;
        Object objM1916 = obj;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56390:
                    eVarM3404 = C0179.m3404(this, d0Var, eVar);
                    str = "\u06e4\u06e4\u06e7";
                    break;
                case 1750657:
                    return objM1916;
                case 1751655:
                    str = "\u06e6\u06e1\u06e7";
                    this = (x) eVarM3404;
                    break;
                case 1753484:
                    str = "\u06e7\u06e2\u06e6";
                    lVarM238 = C0012.m238();
                    break;
                case 1754475:
                    objM1916 = C0089.m1916(this, lVarM238);
                    str = "\u06e3\u06e3\u06e1";
                    break;
                case 1754597:
                    str = "\u06e2\u06e8";
                    eVar = (u8.e) obj2;
                    break;
                default:
                    str = "\u06e7\u06e6\u06e4";
                    d0Var = (m9.d0) objM1916;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:337:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:136:0x02c0. Please report as an issue. */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        DownloadManager downloadManager;
        int i10;
        v8.a aVarM5766 = C0299.m5766();
        int iM8444 = C0431.m8444(this);
        q8.l lVarM238 = C0012.m238();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = iM8444 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = iM8444 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0104.m2036(m4207(), 0, C0472.f743 ^ (-515), 1351));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                DownloadManager downloadManagerM2657 = C0137.m2657(this);
                                C0329.m6365(obj);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
                                            continue;
                                        case 47483:
                                            downloadManager = downloadManagerM2657;
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    C0329.m6365(obj);
                    boolean zM14 = C0000.m14((Boolean) C0418.m8214(C0277.m5367(this)));
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return lVarM238;
                            case 76:
                                long jM491 = C0024.m491((w2) C0255.m4888(this));
                                int i15 = 48891;
                                while (true) {
                                    i15 ^= 48908;
                                    switch (i15) {
                                        case 22:
                                            break;
                                        case 53:
                                            Object objM4133 = C0217.m4133(C0434.m8492(this), C0174.m3324(m4207(), 47, C0420.f691 ^ 317, 2420));
                                            C0301.m5795(objM4133, C0465.m9075(m4207(), 55, C0053.f73 ^ (-214), 1816));
                                            downloadManager = (DownloadManager) objM4133;
                                            break;
                                        case 503:
                                            i15 = jM491 == -1 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            int i16 = 49666;
                                            while (true) {
                                                i16 ^= 49683;
                                                switch (i16) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i16 = 49697;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                return lVarM238;
                                            }
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i14 = zM14 ? 48860 : 48829;
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
        while (true) {
            m0.g1 g1VarM5367 = C0277.m5367(this);
            boolean zM15 = C0000.m14((Boolean) C0418.m8214(g1VarM5367));
            int i17 = 49790;
            while (true) {
                i17 ^= 49807;
                switch (i17) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 51:
                        break;
                    case 84:
                        break;
                    case 241:
                        i17 = zM15 ? 49883 : 49852;
                        break;
                    default:
                        break;
                }
            }
            Cursor cursorM5754 = C0299.m5754(downloadManager, C0101.m1987(new DownloadManager.Query(), new long[]{C0024.m491((w2) C0255.m4888(this))}));
            int i18 = 49914;
            while (true) {
                i18 ^= 49931;
                switch (i18) {
                    case 497:
                        i18 = cursorM5754 != null ? 50658 : 50627;
                        break;
                    case 1711:
                        break;
                    case 1736:
                        break;
                    case 1769:
                        boolean zM6068 = C0313.m6068(cursorM5754);
                        int i19 = 50689;
                        while (true) {
                            i19 ^= 50706;
                            switch (i19) {
                                case 19:
                                    i19 = zM6068 ? 50782 : 50751;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    int iM6854 = C0349.m6854(cursorM5754, C0328.m6342(m4207(), 119, C0153.f178 ^ (-162), 2225));
                                    int iM6855 = C0349.m6854(cursorM5754, C0022.m430(m4207(), 131, C0445.f716 ^ 567, 447));
                                    int iM6856 = C0349.m6854(cursorM5754, C0257.m4914(m4207(), 141, C0021.f41 ^ 970, 399));
                                    m0.d1 d1VarM305 = C0015.m305(this);
                                    int i20 = 50813;
                                    while (true) {
                                        i20 ^= 50830;
                                        switch (i20) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                break;
                                            case 243:
                                                i20 = iM6854 >= 0 ? 51557 : 50875;
                                                break;
                                            case 4075:
                                                int i21 = 51588;
                                                while (true) {
                                                    i21 ^= 51605;
                                                    switch (i21) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i21 = iM6855 >= 0 ? 51681 : 51650;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            break;
                                                        case 116:
                                                            long jM7701 = C0393.m7701(cursorM5754, iM6854);
                                                            long jM7702 = C0393.m7701(cursorM5754, iM6855);
                                                            int i22 = 51712;
                                                            while (true) {
                                                                i22 ^= 51729;
                                                                switch (i22) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i22 = jM7702 > 0 ? 51805 : 51774;
                                                                        break;
                                                                    case 47:
                                                                        break;
                                                                    case 76:
                                                                        C0073.m1583((s2) d1VarM305, jM7701 / jM7702);
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
                                            default:
                                                break;
                                        }
                                    }
                                    int i23 = 51836;
                                    while (true) {
                                        i23 ^= 51853;
                                        switch (i23) {
                                            case 241:
                                                i23 = iM6856 >= 0 ? 52580 : 52549;
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                break;
                                            case 2025:
                                                int iM7639 = C0390.m7639(cursorM5754, iM6856);
                                                int i24 = 52611;
                                                while (true) {
                                                    i24 ^= 52628;
                                                    switch (i24) {
                                                        case 23:
                                                            i24 = iM7639 == 8 ? 52704 : 52673;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            i10 = 54657;
                                                            while (true) {
                                                                i10 ^= 54674;
                                                                switch (i10) {
                                                                    case 19:
                                                                        i10 = iM7639 == 16 ? 55401 : 54719;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 3579:
                                                                        C0224.m4315(g1VarM5367, C0455.m8876());
                                                                        C0079.m1702(C0356.m6990(C0434.m8492(this), C0275.m5301(m4207(), 156, C0274.f390 ^ 932, 2919), 0));
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 116:
                                                            m0.g1 g1VarM1260 = C0065.m1260(this);
                                                            boolean zM16 = C0000.m14((Boolean) C0418.m8214(g1VarM1260));
                                                            int i25 = 52735;
                                                            while (true) {
                                                                i25 ^= 52752;
                                                                switch (i25) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        i10 = 54657;
                                                                        while (true) {
                                                                            i10 ^= 54674;
                                                                            switch (i10) {
                                                                                case 19:
                                                                                    if (iM7639 == 16) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 3579:
                                                                                    C0224.m4315(g1VarM5367, C0455.m8876());
                                                                                    C0079.m1702(C0356.m6990(C0434.m8492(this), C0275.m5301(m4207(), 156, C0274.f390 ^ 932, 2919), 0));
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 1007:
                                                                        i25 = !zM16 ? 53479 : 52797;
                                                                        break;
                                                                    case 7927:
                                                                        C0224.m4315(g1VarM5367, C0455.m8876());
                                                                        C0224.m4315(g1VarM1260, C0334.m6483());
                                                                        C0073.m1583((s2) d1VarM305, 1.0f);
                                                                        int iM6857 = C0349.m6854(cursorM5754, C0392.m7676(m4207(), 147, C0013.f33 ^ 784, 2772));
                                                                        int i26 = 53510;
                                                                        while (true) {
                                                                            i26 ^= 53527;
                                                                            switch (i26) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i26 = iM6857 >= 0 ? 53603 : 53572;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                case 116:
                                                                                    String strM1262 = C0065.m1262(cursorM5754, iM6857);
                                                                                    int i27 = 53634;
                                                                                    while (true) {
                                                                                        i27 ^= 53651;
                                                                                        switch (i27) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i27 = strM1262 != null ? 53727 : 53696;
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 76:
                                                                                                String strM4252 = C0220.m4252(C0142.m2730(strM1262));
                                                                                                int i28 = 53758;
                                                                                                while (true) {
                                                                                                    i28 ^= 53775;
                                                                                                    switch (i28) {
                                                                                                        case 1009:
                                                                                                            i28 = strM4252 == null ? 54502 : 54471;
                                                                                                            break;
                                                                                                        case 1703:
                                                                                                            break;
                                                                                                        case 1736:
                                                                                                            break;
                                                                                                        case 1769:
                                                                                                            strM4252 = C0439.m8581();
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0224.m4315(C0242.m4645(this), new File(strM4252));
                                                                                                int i29 = 54533;
                                                                                                while (true) {
                                                                                                    i29 ^= 54550;
                                                                                                    switch (i29) {
                                                                                                        case 19:
                                                                                                            i29 = 54564;
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 83:
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
                    default:
                        break;
                }
            }
            int i30 = 55432;
            while (true) {
                i30 ^= 55449;
                switch (i30) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i30 = cursorM5754 != null ? 55525 : 55494;
                        break;
                    case 62:
                        break;
                    case 95:
                        break;
                    case 124:
                        C0227.m4391(cursorM5754);
                        break;
                    default:
                        break;
                }
            }
            this.f4832a = downloadManager;
            this.f4833b = 1;
            Object objM5493 = C0285.m5493(711 ^ ((long) C0332.f516), this);
            int i31 = 55556;
            while (true) {
                i31 ^= 55573;
                switch (i31) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i31 = objM5493 == aVarM5766 ? 55649 : 55618;
                        break;
                    case 54:
                        break;
                    case 87:
                        break;
                    case 116:
                        return aVarM5766;
                    default:
                        break;
                }
            }
        }
        return lVarM238;
    }
}
