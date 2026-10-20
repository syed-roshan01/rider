package k6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.semantics.C0039;
import androidx.preference.C0044;
import androidx.versionedparcelable.C0048;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0223;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.migration.C0238;
import dagger.hilt.internal.generatesrootinput.C0250;
import f.C0270;
import f6.C0278;
import g.C0284;
import g5.C0290;
import h5.C0307;
import i5.C0318;
import j2.C0324;
import k1.C0332;
import la.C0348;
import o5.C0370;
import r1.C0393;
import u1.C0431;
import v.C0439;
import v0.C0440;
import w2.C0456;
import x7.C0471;
import z2.C0484;

/* JADX INFO: loaded from: classes.dex */
public final class v extends a6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f10432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10434d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f594short = {428, 433, 426, 420, 426, 429, 510, 1071, 1133, 1122, 1134, 1126, 1086, 1696, 1788, 1773, 1790, 1773, 1761, 1791, 1713};
    public static final Parcelable.Creator<v> CREATOR = new z5.n(C0110.f136 ^ 467);

    public v(String str, s sVar, String str2, long j10) {
        this.f10431a = str;
        this.f10432b = sVar;
        this.f10433c = str2;
        this.f10434d = j10;
        int iM7269 = C0370.m7269();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7269 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0223.m4307("96Qf65eEQJ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public v(v vVar, long j10) {
        C0270.m5173(vVar);
        this.f10431a = C0278.m5389(vVar);
        this.f10432b = C0324.m6279(vVar);
        this.f10433c = C0471.m9170(vVar);
        this.f10434d = j10;
        int iM8447 = C0431.m8447();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8447 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0039.m775("EM2S0FmwDQRgQMDj")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6604() {
        int iM3691 = C0193.m3691();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3691 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f594short;
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

    public final String toString() {
        String str = "\u06e8\u06e3\u06e1";
        String strM4789 = null;
        StringBuilder sb = null;
        s sVarM6279 = null;
        short[] sArrM6604 = null;
        String strM9170 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56570:
                    C0142.m2728(sb, strM9170);
                    str = "\u06e0\u06e1\u06e8";
                    break;
                case 1747719:
                    str = "\u06e4\u06e2\u06e0";
                    sArrM6604 = m6604();
                    break;
                case 1747777:
                    return strM9170;
                case 1748705:
                    strM4789 = C0250.m4789(sVarM6279);
                    str = "\u06e1\u06e6\u06e7";
                    break;
                case 1748767:
                    i11 = C0484.f758;
                    str = "\u06e2\u06e7\u06e8";
                    break;
                case 1748834:
                    str = "\u06e1\u06e4\u06e2";
                    sArrM6604 = m6604();
                    break;
                case 1749698:
                    str = "\u06e2\u06e6\u06e2";
                    strM9170 = C0284.m5476(sArrM6604, 13, i10, 1676);
                    break;
                case 1749790:
                    C0142.m2728(sb, strM9170);
                    str = "\u06e8\u06e3\u06df";
                    break;
                case 1749827:
                    i10 = i11 ^ (-738);
                    str = "\u06e4\u06e0\u06e3";
                    break;
                case 1750595:
                    str = "\u06e2\u06e7\u06df";
                    sb = new StringBuilder(strM9170);
                    break;
                case 1750687:
                    i11 = C0393.f664;
                    str = "\u06e8\u06e2\u06e0";
                    break;
                case 1751527:
                    str = "\u06e3\u06e1\u06e1";
                    strM9170 = C0332.m6448(sArrM6604, 0, i10, 451);
                    break;
                case 1751586:
                    i11 = C0090.f124;
                    str = "\u06e4\u06e4\u06df";
                    break;
                case 1751647:
                    i10 = i11 ^ 860;
                    str = "\u06e8\u06e5\u06e6";
                    break;
                case 1752583:
                    str = "\u06e0\u06e3\u06e4";
                    strM9170 = C0440.m8605(sb);
                    break;
                case 1752738:
                    str = "\u06e3\u06e4\u06e0";
                    sArrM6604 = m6604();
                    break;
                case 1754379:
                    C0142.m2728(sb, strM9170);
                    str = "\u06e5\u06e8\u06e5";
                    break;
                case 1754442:
                    C0142.m2728(sb, strM9170);
                    str = "\u06e7\u06e6\u06df";
                    break;
                case 1754592:
                    str = "\u06e7\u06df\u06e3";
                    strM9170 = C0278.m5389(this);
                    break;
                case 1755430:
                    i10 = i11 ^ 285;
                    str = "\u06e2\u06e3\u06e3";
                    break;
                case 1755460:
                    C0142.m2728(sb, strM4789);
                    str = "\u06e5\u06e3\u06e5";
                    break;
                case 1755462:
                    str = "\u06e1\u06e2\u06e2";
                    sVarM6279 = C0324.m6279(this);
                    break;
                case 1755529:
                    str = "\u06e7\u06e1\u06e4";
                    strM9170 = C0456.m8898(sArrM6604, 7, i10, 1027);
                    break;
                default:
                    str = "\u06e8\u06e2";
                    strM9170 = C0471.m9170(this);
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long jM5597 = 0;
        String str = "\u06e0\u06e4\u06e2";
        s sVarM6279 = null;
        String strM5389 = null;
        int iM1863 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56324:
                    str = "\u06e6\u06e7";
                    i11 = C0348.f619;
                    break;
                case 56325:
                    i10 = C0075.f109;
                    str = "\u06e0\u06e1\u06e4";
                    break;
                case 56383:
                    str = "\u06e0\u06e8\u06e0";
                    i11 = i12 ^ (-317);
                    break;
                case 56568:
                    str = "\u06e2\u06e3\u06e5";
                    i11 = i12 ^ (-773);
                    break;
                case 1746968:
                    str = "\u06e4\u06e4\u06e5";
                    i11 = i12 ^ 967;
                    break;
                case 1747715:
                    str = "\u06e0\u06e4";
                    i12 = i10 ^ 265;
                    break;
                case 1747806:
                    iM1863 = C0130.f156;
                    str = "\u06e4\u06e0\u06e5";
                    break;
                case 1747808:
                    C0044.m853(parcel, jM5597);
                    str = "\u06e7\u06e2\u06df";
                    break;
                case 1747928:
                    str = "\u06e3\u06e2\u06e2";
                    strM5389 = C0471.m9170(this);
                    break;
                case 1748617:
                    str = "\u06e8\u06e0";
                    i12 = C0238.f318;
                    break;
                case 1748711:
                    str = "\u06df\u06e8\u06e1";
                    i12 = C0439.f710;
                    break;
                case 1749634:
                    C0048.m942(parcel, i11, strM5389);
                    str = "\u06e1\u06e2\u06e8";
                    break;
                case 1749700:
                    str = "\u06e2\u06e1\u06e1";
                    strM5389 = C0278.m5389(this);
                    break;
                case 1750627:
                    C0048.m942(parcel, i11, strM5389);
                    str = "\u06e0\u06e5";
                    break;
                case 1751492:
                    C0229.m4414(parcel, i10, i12);
                    str = "\u06e6\u06e3\u06e8";
                    break;
                case 1751494:
                    str = "\u06e2\u06e1";
                    i12 = C0026.f46;
                    break;
                case 1751529:
                    str = "\u06e5\u06e1\u06e7";
                    i12 = iM1863 ^ (-20350);
                    break;
                case 1751653:
                    sVarM6279 = C0324.m6279(this);
                    str = "\u06e7\u06e2\u06e7";
                    break;
                case 1752454:
                    return;
                case 1752523:
                    iM1863 = C0087.m1863(i12, parcel);
                    str = "\u06e1\u06df\u06e7";
                    break;
                case 1753547:
                    jM5597 = C0290.m5597(this);
                    str = "\u06e0\u06e4\u06e4";
                    break;
                case 1754468:
                    C0318.m6160(iM1863, parcel);
                    str = "\u06e5\u06df\u06e0";
                    break;
                case 1754476:
                    C0307.m5948(parcel, i11, sVarM6279, i10);
                    str = "\u06e4\u06df\u06e1";
                    break;
                default:
                    i10 = i11 ^ 976;
                    str = "\u06e4\u06df\u06df";
                    break;
            }
        }
    }
}
