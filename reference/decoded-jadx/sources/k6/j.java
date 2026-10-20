package k6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.platform.C0038;
import c1.C0061;
import c6.C0067;
import com.google.android.gms.common.C0087;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import i5.C0318;
import k3.C0335;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new z5.n(C0224.f304 ^ 852);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f10115a;

    public j(Bundle bundle) {
        this.f10115a = bundle;
        int iM6500 = C0335.m6500();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6500 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0031.m609("kd8qleVmmLVe6J")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundleM746 = null;
        String str = "\u06e8\u06e5\u06e4";
        int i11 = 0;
        int iM1863 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747780:
                    bundleM746 = C0038.m746(this);
                    str = "\u06e7\u06e8\u06df";
                    break;
                case 1748674:
                    return;
                case 1751772:
                    str = "\u06e0\u06e3\u06e7";
                    iM1863 = C0087.m1863(i11, parcel);
                    break;
                case 1753634:
                    i11 = iM1863 ^ (-19555);
                    str = "\u06e4\u06e8\u06e0";
                    break;
                case 1754654:
                    C0061.m1170(parcel, 1, bundleM746);
                    str = "\u06e0\u06df\u06e8";
                    break;
                case 1755527:
                    str = "\u06e6\u06e6\u06e2";
                    iM1863 = C0067.f87;
                    break;
                default:
                    C0318.m6160(iM1863, parcel);
                    str = "\u06e1\u06e1\u06e2";
                    break;
            }
        }
    }
}
