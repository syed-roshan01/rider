package d5;

import a7.C0008;
import aa.C0012;
import androidx.activity.C0017;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.lifecycle.C0237;
import g2.C0288;
import java.util.List;
import q5.C0386;
import r5.C0400;
import s7.C0415;
import u4.C0436;
import w.C0454;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.a f4868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.a f4869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(List list, int i10, int i11, c9.a aVar, c9.a aVar2, int i12) {
        super(C0288.f432 ^ (-543));
        this.f4865a = list;
        this.f4866b = i10;
        this.f4867c = i11;
        this.f4868d = aVar;
        this.f4869e = aVar2;
        this.f4870f = i12;
        int iM7546 = C0386.m7546();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7546 <= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0400.m7815("jif3n6orYfTk")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = null;
        Number number = null;
        int iM336 = 0;
        List listM3319 = null;
        int iM2426 = 0;
        c9.a aVarM8840 = null;
        c9.a aVarM2830 = null;
        int iM159 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = "۟ۥۧ";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56357:
                    iM2426 = C0125.m2426(this);
                    str = "ۣۨۢ";
                    break;
                case 1746781:
                    return lVarM238;
                case 1746881:
                    mVar = (m0.m) obj;
                    str = "ۦۢۢ";
                    break;
                case 1748676:
                    i12 = i11 | i10;
                    str = "ۦ۟ۢ";
                    break;
                case 1748771:
                    C0237.m4556(listM3319, iM336, iM2426, aVarM8840, aVarM2830, mVar, iM159);
                    str = "ۤۦۣ";
                    break;
                case 1749573:
                    aVarM2830 = C0148.m2830(this);
                    str = "ۦۤۧ";
                    break;
                case 1750724:
                    i11 = iM159 ^ 1;
                    str = "ۡۡۤ";
                    break;
                case 1751679:
                    i10 = iM159 & 1;
                    str = "ۣۥۦ";
                    break;
                case 1751713:
                    str = "۟ۢ۠";
                    lVarM238 = C0012.m238();
                    break;
                case 1751775:
                    iM336 = C0436.m8515(number);
                    str = "ۥۧ۠";
                    break;
                case 1753417:
                    iM159 = C0008.m159(i12);
                    str = "ۡۤۦ";
                    break;
                case 1753510:
                    str = "ۣۤۨ";
                    number = (Number) obj2;
                    break;
                case 1753577:
                    iM159 = C0415.m8122(this);
                    str = "ۤۥ۠";
                    break;
                case 1755463:
                    aVarM8840 = C0454.m8840(this);
                    str = "ۢ۟ۢ";
                    break;
                case 1755591:
                    iM336 = C0017.m336(this);
                    str = "ۡۦ";
                    break;
                default:
                    listM3319 = C0174.m3319(this);
                    str = "ۨۧۦ";
                    break;
            }
        }
    }
}
