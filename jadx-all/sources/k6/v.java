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
import d9.C0224;
import dagger.hilt.android.components.C0230;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.internal.generatesrootinput.C0251;
import f.C0271;
import f6.C0279;
import g.C0285;
import g5.C0291;
import h5.C0308;
import i5.C0319;
import j2.C0325;
import k1.C0333;
import la.C0349;
import o5.C0371;
import r1.C0394;
import u1.C0432;
import v.C0440;
import v0.C0441;
import w2.C0457;
import x7.C0472;
import z2.C0485;

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
        int iM7269 = C0371.m7269();
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
                    System.out.println(Float.decode(C0224.m4307("96Qf65eEQJ")));
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
        C0271.m5173(vVar);
        this.f10431a = C0279.m5389(vVar);
        this.f10432b = C0325.m6279(vVar);
        this.f10433c = C0472.m9170(vVar);
        this.f10434d = j10;
        int iM8447 = C0432.m8447();
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
        String str = "ۣۨۡ";
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
                    str = "۠ۡۨ";
                    break;
                case 1747719:
                    str = "ۤۢ۠";
                    sArrM6604 = m6604();
                    break;
                case 1747777:
                    return strM9170;
                case 1748705:
                    strM4789 = C0251.m4789(sVarM6279);
                    str = "ۡۦۧ";
                    break;
                case 1748767:
                    i11 = C0485.f758;
                    str = "ۢۧۨ";
                    break;
                case 1748834:
                    str = "ۡۤۢ";
                    sArrM6604 = m6604();
                    break;
                case 1749698:
                    str = "ۢۦۢ";
                    strM9170 = C0285.m5476(sArrM6604, 13, i10, 1676);
                    break;
                case 1749790:
                    C0142.m2728(sb, strM9170);
                    str = "ۣۨ۟";
                    break;
                case 1749827:
                    i10 = i11 ^ (-738);
                    str = "ۣۤ۠";
                    break;
                case 1750595:
                    str = "ۢۧ۟";
                    sb = new StringBuilder(strM9170);
                    break;
                case 1750687:
                    i11 = C0394.f664;
                    str = "ۨۢ۠";
                    break;
                case 1751527:
                    str = "ۣۡۡ";
                    strM9170 = C0333.m6448(sArrM6604, 0, i10, 451);
                    break;
                case 1751586:
                    i11 = C0090.f124;
                    str = "ۤۤ۟";
                    break;
                case 1751647:
                    i10 = i11 ^ 860;
                    str = "ۨۥۦ";
                    break;
                case 1752583:
                    str = "ۣ۠ۤ";
                    strM9170 = C0441.m8605(sb);
                    break;
                case 1752738:
                    str = "ۣۤ۠";
                    sArrM6604 = m6604();
                    break;
                case 1754379:
                    C0142.m2728(sb, strM9170);
                    str = "ۥۨۥ";
                    break;
                case 1754442:
                    C0142.m2728(sb, strM9170);
                    str = "ۧۦ۟";
                    break;
                case 1754592:
                    str = "ۣۧ۟";
                    strM9170 = C0279.m5389(this);
                    break;
                case 1755430:
                    i10 = i11 ^ 285;
                    str = "ۣۣۢ";
                    break;
                case 1755460:
                    C0142.m2728(sb, strM4789);
                    str = "ۥۣۥ";
                    break;
                case 1755462:
                    str = "ۡۢۢ";
                    sVarM6279 = C0325.m6279(this);
                    break;
                case 1755529:
                    str = "ۧۡۤ";
                    strM9170 = C0457.m8898(sArrM6604, 7, i10, 1027);
                    break;
                default:
                    str = "ۨۢ";
                    strM9170 = C0472.m9170(this);
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long jM5597 = 0;
        String str = "۠ۤۢ";
        s sVarM6279 = null;
        String strM5389 = null;
        int iM1863 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56324:
                    str = "ۦۧ";
                    i11 = C0349.f619;
                    break;
                case 56325:
                    i10 = C0075.f109;
                    str = "۠ۡۤ";
                    break;
                case 56383:
                    str = "۠ۨ۠";
                    i11 = i12 ^ (-317);
                    break;
                case 56568:
                    str = "ۣۢۥ";
                    i11 = i12 ^ (-773);
                    break;
                case 1746968:
                    str = "ۤۤۥ";
                    i11 = i12 ^ 967;
                    break;
                case 1747715:
                    str = "۠ۤ";
                    i12 = i10 ^ 265;
                    break;
                case 1747806:
                    iM1863 = C0130.f156;
                    str = "ۤ۠ۥ";
                    break;
                case 1747808:
                    C0044.m853(parcel, jM5597);
                    str = "ۧۢ۟";
                    break;
                case 1747928:
                    str = "ۣۢۢ";
                    strM5389 = C0472.m9170(this);
                    break;
                case 1748617:
                    str = "ۨ۠";
                    i12 = C0239.f318;
                    break;
                case 1748711:
                    str = "۟ۨۡ";
                    i12 = C0440.f710;
                    break;
                case 1749634:
                    C0048.m942(parcel, i11, strM5389);
                    str = "ۡۢۨ";
                    break;
                case 1749700:
                    str = "ۢۡۡ";
                    strM5389 = C0279.m5389(this);
                    break;
                case 1750627:
                    C0048.m942(parcel, i11, strM5389);
                    str = "۠ۥ";
                    break;
                case 1751492:
                    C0230.m4414(parcel, i10, i12);
                    str = "ۦۣۨ";
                    break;
                case 1751494:
                    str = "ۢۡ";
                    i12 = C0026.f46;
                    break;
                case 1751529:
                    str = "ۥۡۧ";
                    i12 = iM1863 ^ (-20350);
                    break;
                case 1751653:
                    sVarM6279 = C0325.m6279(this);
                    str = "ۧۢۧ";
                    break;
                case 1752454:
                    return;
                case 1752523:
                    iM1863 = C0087.m1863(i12, parcel);
                    str = "ۡ۟ۧ";
                    break;
                case 1753547:
                    jM5597 = C0291.m5597(this);
                    str = "۠ۤۤ";
                    break;
                case 1754468:
                    C0319.m6160(iM1863, parcel);
                    str = "ۥ۟۠";
                    break;
                case 1754476:
                    C0308.m5948(parcel, i11, sVarM6279, i10);
                    str = "ۤ۟ۡ";
                    break;
                default:
                    i10 = i11 ^ 976;
                    str = "ۤ۟۟";
                    break;
            }
        }
    }
}
