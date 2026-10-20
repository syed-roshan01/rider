package a5;

import aa.C0012;
import c1.C0059;
import c3.C0062;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.measurement.C0182;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.gson.internal.bind.C0206;
import dagger.hilt.android.internal.modules.C0235;
import e9.C0267;
import h0.C0300;
import h3.C0302;
import i6.C0321;
import j9.C0330;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import k2.C0334;
import m7.C0359;
import n7.C0365;
import o4.C0370;
import o7.i2;
import p0.C0374;
import r6.C0402;
import w2.C0458;
import x4.C0470;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f18short = {857, 837, 837, 833, 834, 779, 798, 798, 838, 838, 838, 799, 854, 862, 862, 854, 861, 852, 799, 850, 862, 860, 466, 457, 464, 464, 412, 479, 477, 466, 466, 467, 456, 412, 478, 473, 412, 479, 477, 463, 456, 412, 456, 467, 412, 466, 467, 466, 401, 466, 457, 464, 464, 412, 456, 453, 460, 473, 412, 470, 477, 458, 477, 402, 466, 473, 456, 402, 500, 456, 456, 460, 489, 494, 496, 511, 467, 466, 466, 473, 479, 456, 469, 467, 466, 2326, 2331, 2335, 2330};

    /* JADX INFO: renamed from: ۥۧۧۦ, reason: contains not printable characters */
    public static short[] m135() {
        int iM7254 = C0370.m7254();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7254 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f18short;
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        m mVar = null;
        String str = "ۤ۟ۥ";
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56574:
                    return mVar;
                case 1746755:
                    mVar = new m(i11, eVar);
                    str = "ۨۦ";
                    break;
                case 1755494:
                    str = "۟ۡۥ";
                    i11 = i10 ^ 323;
                    break;
                default:
                    i10 = C0458.f728;
                    str = "ۨۤۢ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "۟ۢۨ";
        u8.e eVarM7329 = null;
        q8.l lVarM238 = null;
        Object objM1965 = obj;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746789:
                    str = "ۥۦ۟";
                    d0Var = (m9.d0) objM1965;
                    break;
                case 1748740:
                    str = "۠ۦ۠";
                    lVarM238 = C0012.m238();
                    break;
                case 1748801:
                    return objM1965;
                case 1749792:
                    eVarM7329 = C0374.m7329(this, d0Var, eVar);
                    str = "ۧۧۤ";
                    break;
                case 1752670:
                    str = "ۢۦۤ";
                    eVar = (u8.e) obj2;
                    break;
                case 1754628:
                    str = "ۣۡۦ";
                    this = (m) eVarM7329;
                    break;
                default:
                    objM1965 = C0100.m1965(this, lVarM238);
                    str = "ۡۥۥ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x005e. Please report as an issue. */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        long jM7869;
        C0300.m5766();
        C0330.m6365(obj);
        try {
            URLConnection uRLConnectionM2216 = C0114.m2216(new URL(C0059.m1123(m135(), 0, C0359.f629 ^ 516, 817)));
            C0302.m5795(uRLConnectionM2216, C0267.m5096(m135(), 22, C0182.f206 ^ 304, 444));
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionM2216;
            int i10 = C0365.f635 ^ (-2398);
            C0334.m6475(httpURLConnection, i10);
            C0062.m1177(httpURLConnection, i10);
            C0235.m4509(httpURLConnection, C0102.m1999(m135(), 85, C0470.f740 ^ 207, 2398));
            C0196.m3760(httpURLConnection);
            long jM3933 = C0206.m3933(httpURLConnection);
            C0321.m6209(httpURLConnection);
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = jM3933 > 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i12 = 1740;
                        while (true) {
                            i12 ^= 1757;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = 1771;
                                    break;
                                case 54:
                                    jM7869 = jM3933;
                                    break;
                            }
                        }
                        break;
                    case 239:
                        jM7869 = C0402.m7869();
                        int i13 = 1864;
                        while (true) {
                            i13 ^= 1881;
                            switch (i13) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i13 = 48674;
                                    break;
                                case 47483:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e4) {
            jM7869 = C0402.m7869();
        }
        return new Long(jM7869);
    }
}
