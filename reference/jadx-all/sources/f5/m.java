package f5;

import a.C0000;
import c1.C0061;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import h.C0299;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MainViewModel f6296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f6298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MainViewModel f6300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(MainViewModel mainViewModel, u8.e eVar) {
        super(eVar);
        this.f6300e = mainViewModel;
        int iM5742 = C0299.m5742();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5742 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0000.m9("q5e3wIhD2K8EdONz2uxbTY")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        String str = "ۧۤۡ";
        MainViewModel mainViewModelM4436 = null;
        Object objM1165 = null;
        int i10 = 0;
        int i11 = 0;
        int iM3698 = 0;
        int i12 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56359:
                    return objM1165;
                case 1746721:
                    objM1165 = C0061.m1165(mainViewModelM4436, null, null, this);
                    str = "ۡۨ";
                    break;
                case 1747840:
                    str = "ۢۥ";
                    i12 = iM3698 & Integer.MIN_VALUE;
                    break;
                case 1749732:
                    mainViewModelM4436 = C0231.m4436(this);
                    str = "۟۠ۢ";
                    break;
                case 1750786:
                    str = "ۧۡ۟";
                    i11 = i10 | i12;
                    break;
                case 1754413:
                    str = "۠ۥۥ";
                    iM3698 = C0193.m3698(this);
                    break;
                case 1754437:
                    this.f6301f = i11;
                    str = "ۢۤۦ";
                    break;
                case 1754532:
                    this.f6299d = obj;
                    str = "ۧ۠ۦ";
                    break;
                default:
                    i10 = iM3698 ^ Integer.MIN_VALUE;
                    str = "ۣۧۦ";
                    break;
            }
        }
    }
}
