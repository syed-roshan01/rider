package k6;

import a.C0000;
import a.C0002;
import a7.C0008;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.layout.C0035;
import androidx.preference.C0044;
import androidx.versionedparcelable.C0048;
import b4.C0052;
import c1.C0060;
import c3.C0062;
import ca.C0070;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import d1.C0211;
import d5.C0218;
import d9.C0224;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.internal.definecomponent.C0249;
import e2.C0260;
import e8.C0265;
import f4.C0275;
import fa.C0281;
import g2.C0287;
import h4.C0304;
import h4.C0305;
import i.C0315;
import i5.C0318;
import j4.C0326;
import j5.C0327;
import java.util.ArrayList;
import java.util.List;
import m1.C0350;
import m1.C0351;
import m4.C0353;
import m7.C0358;
import o1.C0367;
import p0.C0373;
import p0.C0374;
import q0.C0381;
import q1.C0383;
import q2.C0384;
import q7.C0389;
import r6.C0401;
import r6.C0402;
import r7.C0404;
import s6.C0413;
import s8.C0416;
import w.C0453;
import w2.C0456;
import y9.C0478;
import z3.C0485;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class x7 extends a6.a {
    public static final Parcelable.Creator<x7> CREATOR = new z5.n(C0402.f673 ^ 771);
    public final List A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final boolean F;
    public final long G;
    public final int H;
    public final String I;
    public final int J;
    public final long K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10548f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f10552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f10554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f10555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f10556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f10557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f10558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f10560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f10561z;

    public x7(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, boolean z14, long j15, int i11, String str11, int i12, long j16) {
        C0281.m5438(str);
        this.f10543a = str;
        boolean zM1883 = C0088.m1883(str2);
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i13 = zM1883 ? 1709 : 1678;
                    break;
                case 204:
                    str2 = null;
                    int i14 = 1740;
                    while (true) {
                        i14 ^= 1757;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = 1771;
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
        this.f10544b = str2;
        this.f10545c = str3;
        this.f10552q = j10;
        this.f10546d = str4;
        this.f10547e = j11;
        this.f10548f = j12;
        this.f10549n = str5;
        this.f10550o = z10;
        this.f10551p = z11;
        this.f10553r = str6;
        this.f10554s = 0L;
        this.f10555t = j13;
        this.f10556u = i10;
        this.f10557v = z12;
        this.f10558w = z13;
        this.f10559x = str7;
        this.f10560y = bool;
        this.f10561z = j14;
        this.A = list;
        this.B = null;
        this.C = str8;
        this.D = str9;
        this.E = str10;
        this.F = z14;
        this.G = j15;
        this.H = i11;
        this.I = str11;
        this.J = i12;
        this.K = j16;
        int iM5904 = C0305.m5904();
        int i15 = 1864;
        while (true) {
            i15 ^= 1881;
            switch (i15) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM5904 <= 0) {
                        i15 = 48736;
                    }
                    break;
                case 47384:
                    return;
                case 47417:
                    System.out.println(Long.decode(C0052.m1015("wDC8qgiVBW9Jx3UmEbu3s6A9")));
                    return;
                case 47483:
                    break;
                default:
                    continue;
            }
            i15 = 48705;
        }
    }

    public x7(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17) {
        this.f10543a = str;
        this.f10544b = str2;
        this.f10545c = str3;
        this.f10552q = j12;
        this.f10546d = str4;
        this.f10547e = j10;
        this.f10548f = j11;
        this.f10549n = str5;
        this.f10550o = z10;
        this.f10551p = z11;
        this.f10553r = str6;
        this.f10554s = j13;
        this.f10555t = j14;
        this.f10556u = i10;
        this.f10557v = z12;
        this.f10558w = z13;
        this.f10559x = str7;
        this.f10560y = bool;
        this.f10561z = j15;
        this.A = arrayList;
        this.B = str8;
        this.C = str9;
        this.D = str10;
        this.E = str11;
        this.F = z14;
        this.G = j16;
        this.H = i11;
        this.I = str12;
        this.J = i12;
        this.K = j17;
        int iM1013 = C0052.m1013();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1013 <= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0132.m2539("bcwbz")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM1863 = C0087.m1863(C0125.f151 ^ 19564, parcel);
        C0048.m942(parcel, C0200.f224 ^ 308, C0074.m1624(this));
        C0048.m942(parcel, C0224.f304 ^ 849, C0138.m2678(this));
        String strM2530 = C0131.m2530(this);
        int i11 = C0035.f55 ^ (-712);
        C0048.m942(parcel, i11, strM2530);
        C0048.m942(parcel, C0456.f727 ^ 711, C0008.m165(this));
        int i12 = C0453.f724;
        int i13 = C0389.f660 ^ 207;
        C0229.m4414(parcel, i12 ^ 889, i13);
        C0044.m853(parcel, C0202.m3875(this));
        C0229.m4414(parcel, C0367.f638 ^ (-552), i13);
        C0044.m853(parcel, C0304.m5876(this));
        C0048.m942(parcel, i13, C0062.m1205(this));
        C0229.m4414(parcel, C0351.f622 ^ 543, i11);
        C0103.m2015(parcel, C0384.m7528(this) ? 1 : 0);
        C0229.m4414(parcel, C0102.f128 ^ 228, i11);
        C0103.m2015(parcel, C0070.m1358(this) ? 1 : 0);
        C0229.m4414(parcel, C0200.f224 ^ 317, i13);
        C0044.m853(parcel, C0188.m3589(this));
        C0048.m942(parcel, C0260.f340 ^ (-761), C0232.m4466(this));
        C0229.m4414(parcel, C0002.f770 ^ (-7), i13);
        C0044.m853(parcel, C0401.m7867(this));
        C0229.m4414(parcel, C0082.f116 ^ 375, i13);
        C0044.m853(parcel, C0022.m424(this));
        C0229.m4414(parcel, C0033.f53 ^ (-237), i11);
        C0103.m2015(parcel, C0179.m3422(this));
        C0229.m4414(parcel, C0315.f463 ^ 530, i11);
        C0103.m2015(parcel, C0404.m7933(this) ? 1 : 0);
        C0229.m4414(parcel, C0287.f432 ^ (-527), i11);
        C0103.m2015(parcel, C0381.m7478(this) ? 1 : 0);
        C0048.m942(parcel, C0485.f759 ^ 36, C0016.m311(this));
        Boolean boolM3394 = C0178.m3394(this);
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = boolM3394 == null ? 1709 : 1678;
                    break;
                case 204:
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    C0229.m4414(parcel, C0082.f116 ^ 364, i11);
                    C0103.m2015(parcel, C0000.m14(boolM3394) ? 1 : 0);
                    break;
                default:
                    break;
            }
        }
        C0229.m4414(parcel, C0235.f315 ^ (-673), i13);
        C0044.m853(parcel, C0211.m4033(this));
        C0091.m1949(parcel, C0353.f624 ^ 878, C0192.m3666(this));
        C0048.m942(parcel, C0060.f80 ^ (-872), C0416.m8172(this));
        C0048.m942(parcel, C0265.f345 ^ 903, C0233.m4499(this));
        C0048.m942(parcel, C0374.f645 ^ (-788), C0373.m7328(this));
        C0048.m942(parcel, C0413.f684 ^ (-936), C0327.m6330(this));
        C0229.m4414(parcel, C0249.f329 ^ (-808), i11);
        C0103.m2015(parcel, C0100.m1957(this) ? 1 : 0);
        C0229.m4414(parcel, C0478.f752 ^ (-807), i13);
        C0044.m853(parcel, C0326.m6302(this));
        C0229.m4414(parcel, C0350.f621 ^ (-722), i11);
        C0103.m2015(parcel, C0490.m9549(this));
        C0048.m942(parcel, C0275.f391 ^ 964, C0159.m3041(this));
        C0229.m4414(parcel, C0358.f629 ^ 562, i11);
        C0103.m2015(parcel, C0383.m7510(this));
        C0229.m4414(parcel, C0350.f621 ^ (-750), i13);
        C0044.m853(parcel, C0017.m335(this));
        C0318.m6160(iM1863, parcel);
        int iM1779 = C0083.m1779();
        int i16 = 1864;
        while (true) {
            i16 ^= 1881;
            switch (i16) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM1779 <= 0) {
                        i16 = 48736;
                    }
                    break;
                case 47384:
                    return;
                case 47417:
                    System.out.println(Double.parseDouble(C0218.m4218("kG")));
                    return;
                case 47483:
                    break;
                default:
                    continue;
            }
            i16 = 48705;
        }
    }
}
