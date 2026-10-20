package k6;

import a.C0000;
import android.os.Bundle;
import b1.C0050;
import b7.C0054;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.datatransport.cct.C0078;
import com.google.firebase.abt.C0112;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import i6.C0320;
import m9.C0360;
import rikka.shizuku.C0407;
import v0.C0441;

/* JADX INFO: loaded from: classes.dex */
public final class e6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f10007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10009f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f10010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f10011o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y5 f10012p;

    public e6(y5 y5Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f10012p = y5Var;
        this.f10004a = str;
        this.f10005b = str2;
        this.f10006c = j10;
        this.f10007d = bundle;
        this.f10008e = z10;
        this.f10009f = z11;
        this.f10010n = z12;
        int iM7059 = C0360.m7059();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7059 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0320.m6178("ag2IwFs0b5G7Fo")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jM0 = 0;
        String str = "ۡۡ";
        String strM1686 = null;
        y5 y5VarM969 = null;
        String strM1639 = null;
        Bundle bundleM2827 = null;
        String strM4308 = null;
        boolean zM8595 = false;
        boolean zM7967 = false;
        boolean zM2175 = false;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56350:
                    zM7967 = C0407.m7967(this);
                    str = "ۤۢۥ";
                    break;
                case 1748611:
                    jM0 = C0000.m0(this);
                    str = "ۣ۠ۨ";
                    break;
                case 1749761:
                    strM4308 = C0224.m4308(this);
                    str = "ۨۨۡ";
                    break;
                case 1750571:
                    bundleM2827 = C0148.m2827(this);
                    str = "ۥۣ۟";
                    break;
                case 1750687:
                    zM2175 = C0112.m2175(this);
                    str = "ۡ۟";
                    break;
                case 1751591:
                    strM1686 = C0078.m1686(this);
                    str = "ۣۤۢ";
                    break;
                case 1751619:
                    C0054.m1045(y5VarM969, strM4308, strM1639, jM0, bundleM2827, zM8595, zM2175, zM7967, strM1686);
                    str = "ۥۣۡ";
                    break;
                case 1752519:
                    return;
                case 1752577:
                    zM8595 = C0441.m8595(this);
                    str = "ۣۤ۠";
                    break;
                case 1755617:
                    strM1639 = C0075.m1639(this);
                    str = "ۡ۟ۡ";
                    break;
                default:
                    y5VarM969 = C0050.m969(this);
                    str = "ۢۥۤ";
                    break;
            }
        }
    }
}
