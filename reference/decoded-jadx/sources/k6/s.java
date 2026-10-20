package k6;

import a8.C0009;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.C0026;
import c1.C0061;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.C0087;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import f6.C0278;
import g.C0283;
import i5.C0318;
import java.util.Iterator;
import r2.C0396;
import s7.C0414;
import s7.C0415;
import t2.C0422;
import u.C0428;
import x8.C0473;

/* JADX INFO: loaded from: classes.dex */
public final class s extends a6.a implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f10349a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f583short = {692, 675, 686, 695, 679};
    public static final Parcelable.Creator<s> CREATOR = new z5.n(C0396.f667 ^ (-196));

    public s(Bundle bundle) {
        this.f10349a = bundle;
        int iM508 = C0026.m508();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM508 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0278.m5390("lBBTsuK7"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6593() {
        int iM8409 = C0428.m8409();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8409 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f583short;
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

    public final Double e() {
        double dM2602 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String str = "\u06e6\u06e3\u06e7";
        Bundle bundleM2916 = null;
        Double dM8281 = null;
        short[] sArrM6593 = null;
        String strM179 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56294:
                    dM2602 = C0135.m2602(bundleM2916, strM179);
                    str = "\u06e4\u06e2\u06e1";
                    break;
                case 56483:
                    str = "\u06e1\u06e8\u06e3";
                    strM179 = C0009.m179(sArrM6593, 0, i10, 706);
                    break;
                case 1747649:
                    i11 = C0414.f685;
                    str = "\u06e3\u06e6\u06df";
                    break;
                case 1748892:
                    bundleM2916 = C0152.m2916(this);
                    str = "\u06df\u06e5";
                    break;
                case 1750748:
                    i10 = i11 ^ (-404);
                    str = "\u06e5\u06e8";
                    break;
                case 1751587:
                    str = "\u06e5\u06e4\u06e1";
                    dM8281 = C0422.m8281(dM2602);
                    break;
                case 1752610:
                    return dM8281;
                default:
                    str = "\u06e0\u06df\u06e0";
                    sArrM6593 = m6593();
                    break;
            }
        }
    }

    public final Bundle g() {
        return new Bundle(C0152.m2916(this));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }

    public final String toString() {
        return C0473.m9222(C0152.m2916(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundleM8166 = null;
        String str = "\u06e0\u06e0\u06e3";
        int i11 = 0;
        int i12 = 0;
        int iM1863 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746722:
                    C0318.m6160(iM1863, parcel);
                    str = "\u06df\u06e2\u06e1";
                    break;
                case 1746782:
                    return;
                case 1747683:
                    str = "\u06e0\u06e7\u06e1";
                    iM1863 = C0075.f109;
                    break;
                case 1747873:
                    C0061.m1170(parcel, i11, bundleM8166);
                    str = "\u06df\u06e0\u06e3";
                    break;
                case 1750594:
                    i11 = i12 ^ (-416);
                    str = "\u06e0\u06e6\u06e7";
                    break;
                case 1751709:
                    bundleM8166 = C0415.m8166(this);
                    str = "\u06e5\u06e3\u06df";
                    break;
                case 1752459:
                    str = "\u06e4\u06e6\u06df";
                    iM1863 = C0087.m1863(i12, parcel);
                    break;
                case 1752577:
                    str = "\u06e3\u06e1\u06e0";
                    i12 = C0283.f428;
                    break;
                default:
                    str = "\u06e5\u06df\u06e5";
                    i12 = iM1863 ^ 20036;
                    break;
            }
        }
    }
}
