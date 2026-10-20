package f5;

import com.auto.accept.data.model.UserProfile;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import i.C0315;
import m4.C0353;
import o5.C0370;
import o7.i2;
import q0.C0381;
import s3.C0412;
import v0.C0440;
import x0.C0466;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f393short = {640, 686, 685, 673, 681, 679, 678, 746, 690, 688, 685, 676, 683, 686, 679, 767, 2229};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfile f6229a;

    public a(UserProfile userProfile) {
        this.f6229a = userProfile;
        int iM4372 = C0226.m4372();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4372 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0381.m7482("o9ea87Z0HObyIj"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5329() {
        int iM3153 = C0164.m3153();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3153 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f393short;
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
                    boolean z10 = obj instanceof a;
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
                                boolean zM4399 = C0228.m4399(C0353.m6924(this), C0353.m6924((a) obj));
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
                                            return true;
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

    public final int hashCode() {
        return C0315.m6099(C0353.m6924(this));
    }

    public final String toString() {
        String str = "\u06e4\u06e0\u06e0";
        StringBuilder sb = null;
        UserProfile userProfileM6924 = null;
        short[] sArrM5329 = null;
        String strM8103 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56296:
                    str = "\u06e2\u06e0\u06e8";
                    strM8103 = C0370.m7267(sArrM5329, 0, i11, 706);
                    break;
                case 1746847:
                    return strM8103;
                case 1747686:
                    C0142.m2728(sb, strM8103);
                    str = "\u06e0\u06e7\u06e0";
                    break;
                case 1747897:
                    str = "\u06df\u06e4\u06e4";
                    strM8103 = C0440.m8605(sb);
                    break;
                case 1748646:
                    str = "\u06e0\u06e0\u06e6";
                    strM8103 = C0412.m8103(sArrM5329, 16, 1, 2204);
                    break;
                case 1749610:
                    sb = new StringBuilder(strM8103);
                    str = "\u06e4\u06e8\u06e8";
                    break;
                case 1751524:
                    str = "\u06e7\u06e8\u06e6";
                    sArrM5329 = m5329();
                    break;
                case 1751780:
                    str = "\u06e8\u06e2\u06e2";
                    userProfileM6924 = C0353.m6924(this);
                    break;
                case 1754661:
                    i10 = C0466.f737;
                    str = "\u06df\u06e5\u06e0";
                    break;
                case 1755404:
                    str = "\u06e1\u06e0\u06e5";
                    sArrM5329 = m5329();
                    break;
                case 1755432:
                    C0213.m4074(sb, userProfileM6924);
                    str = "\u06e8\u06e1\u06e5";
                    break;
                default:
                    i11 = i10 ^ 324;
                    str = "\u06df\u06e7";
                    break;
            }
        }
    }
}
