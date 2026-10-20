package a5;

import a0.C0003;
import aa.C0012;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.profileinstaller.C0046;
import androidx.startup.C0047;
import b1.C0050;
import c1.C0058;
import c3.C0062;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.iid.C0171;
import com.google.firebase.inject.C0172;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import d7.C0221;
import d9.C0225;
import dagger.hilt.android.internal.modules.C0235;
import h0.C0300;
import h3.C0302;
import i6.C0321;
import i9.C0322;
import j9.C0330;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import k2.C0334;
import k3.C0336;
import k4.C0337;
import m5.C0356;
import o7.i2;
import org.json.JSONObject;
import p7.C0379;
import v.C0440;
import v0.C0441;
import v9.C0453;
import w5.C0463;

/* JADX INFO: loaded from: classes.dex */
public final class n extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f19short = {924, 896, 896, 900, 903, 974, 987, 987, 902, 925, 912, 913, 917, 919, 919, 913, 900, 896, 913, 902, 986, 925, 922, 987, 917, 900, 925, 987, 900, 924, 923, 896, 923, 939, 915, 913, 896, 986, 900, 924, 900, 971, 897, 925, 912, 969, 470, 461, 468, 468, 408, 475, 473, 470, 470, 471, 460, 408, 474, 477, 408, 475, 473, 459, 460, 408, 460, 471, 408, 470, 471, 470, 405, 470, 461, 468, 468, 408, 460, 449, 456, 477, 408, 466, 473, 462, 473, 406, 470, 477, 460, 406, 496, 460, 460, 456, 493, 490, 500, 507, 471, 470, 470, 477, 475, 460, 465, 471, 470, 831, 829, 812, 1522, 1520, 1505, 1500, 1531, 1509, 1504, 1505, 1478, 1505, 1511, 1520, 1524, 1528, 1469, 1467, 1467, 1467, 1468, 1116, 1092, 1091, 1112, 1091, 1145, 1118, 1088};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1289a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, u8.e eVar) {
        super(C0116.f142 ^ 238, eVar);
        this.f1289a = str;
        int iM6226 = C0322.m6226();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6226 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0047.m913("jP8fnHYnvdy1")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۣۦ, reason: contains not printable characters */
    public static short[] m136() {
        int iM3296 = C0172.m3296();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3296 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f19short;
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
        String strM2672 = null;
        String str = "ۢۥۧ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749764:
                    strM2672 = C0138.m2672(this);
                    str = "ۢۧۦ";
                    break;
                case 1751590:
                    return this;
                default:
                    this = new n(strM2672, eVar);
                    str = "ۤۢۤ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۢۦ";
        u8.e eVar = null;
        q8.l lVarM238 = null;
        Object objM968 = obj;
        m9.d0 d0Var = null;
        u8.e eVarM9008 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56506:
                    return objM968;
                case 1747836:
                    str = "ۥۤ۟";
                    this = (n) eVarM9008;
                    break;
                case 1749852:
                    objM968 = C0050.m968(this, lVarM238);
                    str = "ۦ۠";
                    break;
                case 1752453:
                    eVarM9008 = C0463.m9008(this, d0Var, eVar);
                    str = "۠ۥۡ";
                    break;
                case 1752608:
                    str = "ۢۨۢ";
                    lVarM238 = C0012.m238();
                    break;
                case 1754535:
                    str = "ۥ۟۟";
                    eVar = (u8.e) obj2;
                    break;
                default:
                    str = "ۧۤۤ";
                    d0Var = (m9.d0) objM968;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        BufferedReader bufferedReader;
        String strM3816 = C0199.m3816(m136(), 0, C0058.f78 ^ (-534), 1012);
        C0300.m5766();
        C0330.m6365(obj);
        try {
            String strM2672 = C0138.m2672(this);
            StringBuilder sb = new StringBuilder(strM3816);
            C0142.m2728(sb, strM2672);
            URLConnection uRLConnectionM2216 = C0114.m2216(new URL(C0441.m8605(sb)));
            C0302.m5795(uRLConnectionM2216, C0046.m889(m136(), 46, C0200.f224 ^ 265, 440));
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionM2216;
            C0235.m4509(httpURLConnection, C0171.m3275(m136(), 109, C0356.f626 ^ (-115), 888));
            int i10 = C0129.f155 ^ 9696;
            C0334.m6475(httpURLConnection, i10);
            C0062.m1177(httpURLConnection, i10);
            InputStream inputStreamM59 = C0003.m59(httpURLConnection);
            C0336.m6501(inputStreamM59, C0379.m7424(m136(), 112, C0337.f520 ^ (-856), 1429));
            Reader inputStreamReader = new InputStreamReader(inputStreamM59, C0453.m8816());
            boolean z10 = inputStreamReader instanceof BufferedReader;
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = z10 ? 1709 : 1678;
                        break;
                    case 204:
                        bufferedReader = (BufferedReader) inputStreamReader;
                        int i12 = 1740;
                        while (true) {
                            i12 ^= 1757;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = 1771;
                                    continue;
                                case 54:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 239:
                        bufferedReader = new BufferedReader(inputStreamReader, C0017.f37 ^ (-8625));
                        break;
                    default:
                        break;
                }
            }
            String strM391 = C0019.m391(bufferedReader);
            C0321.m6209(httpURLConnection);
            String strM4327 = C0225.m4327(new JSONObject(strM391), C0221.m4259(m136(), 131, C0075.f109 ^ 265, 1068), C0440.m8581());
            int iM2942 = C0153.m2942(strM4327);
            int i13 = 1864;
            while (true) {
                i13 ^= 1881;
                switch (i13) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        if (iM2942 == 0) {
                            i13 = 48736;
                        }
                        break;
                    case 47384:
                        return strM4327;
                    case 47417:
                        int i14 = 48767;
                        while (true) {
                            i14 ^= 48784;
                            switch (i14) {
                                case Code.UNAVAILABLE /* 14 */:
                                    return null;
                                case 239:
                                    i14 = 48798;
                                    break;
                            }
                        }
                        break;
                    case 47483:
                        break;
                    default:
                        continue;
                }
                i13 = 48705;
            }
        } catch (Exception e4) {
            int i15 = 48891;
            while (true) {
                i15 ^= 48908;
                switch (i15) {
                    case 22:
                        return null;
                    case 503:
                        i15 = 48922;
                        break;
                }
            }
        }
    }
}
