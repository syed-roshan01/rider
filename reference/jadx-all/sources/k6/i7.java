package k6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.draw.C0027;
import androidx.preference.C0044;
import androidx.versionedparcelable.C0048;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0230;
import dagger.hilt.codegen.C0243;
import dagger.hilt.components.C0244;
import f0.C0272;
import h3.C0303;
import i4.C0318;
import i5.C0319;
import i9.C0322;
import m7.C0358;
import z2.C0485;

/* JADX INFO: loaded from: classes.dex */
public final class i7 extends a6.a {
    public static final Parcelable.Creator<i7> CREATOR = new z5.n(C0020.f40 ^ (-660));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10114c;

    public i7(String str, long j10, int i10) {
        this.f10112a = str;
        this.f10113b = j10;
        this.f10114c = i10;
        int iM3594 = C0188.m3594();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3594 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0131.m2519("4JLEkOpghNnG5RoNzJyw")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM1863 = C0087.m1863(C0027.f47 ^ 19560, parcel);
        C0048.m942(parcel, 1, C0485.m9437(this));
        C0230.m4414(parcel, C0358.f628 ^ 782, C0272.f387 ^ (-810));
        C0044.m853(parcel, C0303.m5837(this));
        C0230.m4414(parcel, C0244.f323 ^ 115, C0322.f469 ^ (-621));
        C0103.m2015(parcel, C0243.m4648(this));
        C0319.m6160(iM1863, parcel);
        int iM3070 = C0160.m3070();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3070 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0318.m6148("VvMs3JPm8tVFh4jbvIg0ZA54bx")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }
}
