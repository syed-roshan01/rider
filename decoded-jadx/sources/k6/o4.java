package k6;

import a2.C0005;
import a7.C0008;
import android.content.SharedPreferences;
import android.support.v4.app.C0014;
import androidx.compose.foundation.relocation.C0024;
import com.google.android.gms.common.internal.C0084;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.remoteconfig.internal.Code;
import d7.C0220;
import d9.C0223;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.definecomponent.C0249;
import e2.C0260;
import f4.C0275;
import f6.C0278;
import fa.C0281;
import i.C0316;
import j6.C0328;
import k2.C0333;
import n.C0361;
import q6.C0388;
import r6.C0401;
import t2.C0421;
import t2.C0422;
import v8.C0450;
import w2.C0458;

/* JADX INFO: loaded from: classes.dex */
public final class o4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f569short = {1455, 1442, 1446, 1451, 1459, 1455, 1432, 1450, 1448, 1449, 1454, 1459, 1448, 1461, 1655, 1658, 1662, 1651, 1643, 1655, 1600, 1650, 1648, 1649, 1654, 1643, 1648, 1645, 1573, 1644, 1643, 1662, 1645, 1643, 707, 718, 714, 711, 735, 707, 756, 710, 708, 709, 706, 735, 708, 729, 657, 712, 708, 734, 709, 735, 1146, 1143, 1139, 1150, 1126, 1146, 1101, 1151, 1149, 1148, 1147, 1126, 1149, 1120, 1064, 1124, 1139, 1150, 1127, 1143};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l4 f10257e;

    public o4(l4 l4Var, long j10) {
        boolean z10 = false;
        this.f10257e = l4Var;
        C0281.m5438(C0278.m5391(m6581(), 0, C0421.f692 ^ (-273), 1479));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = j10 > 0 ? 1709 : 1678;
                    break;
                case 204:
                    z10 = true;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    break;
                default:
                    break;
            }
        }
        C0260.m4977(z10);
        this.f10253a = C0142.m2731(m6581(), 14, C0232.f312 ^ 552, 1567);
        this.f10254b = C0249.m4771(m6581(), 34, C0005.f1063 ^ 540, 683);
        this.f10255c = C0220.m4259(m6581(), 54, C0316.f464 ^ 187, 1042);
        this.f10256d = j10;
        int iM4660 = C0242.m4660();
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM4660 >= 0) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    return;
                case 47417:
                    System.out.println(Float.parseFloat(C0422.m8292("O2")));
                    return;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
    }

    /* JADX INFO: renamed from: ۥۤۡۦ, reason: contains not printable characters */
    public static short[] m6581() {
        int iM1804 = C0084.m1804();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1804 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f569short;
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

    public final void a() {
        l4 l4VarM2361 = C0123.m2361(this);
        C0223.m4302(l4VarM2361);
        C0014.m280((e6.c) C0166.m3176(l4VarM2361));
        long jM7869 = C0401.m7869();
        SharedPreferences.Editor editorM3199 = C0167.m3199(C0361.m7082(l4VarM2361));
        C0024.m478(editorM3199, C0275.m5298(this));
        C0024.m478(editorM3199, C0458.m8925(this));
        C0388.m7616(editorM3199, C0450.m8789(this), jM7869);
        C0333.m6480(editorM3199);
        int iM6350 = C0328.m6350();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6350 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0008.m162("zKpbb9XBYnyUjNans")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
