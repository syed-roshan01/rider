package k6;

import com.auto.accept.ui.viewmodel.C0075;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.internal.Code;
import d.C0211;
import d1.C0213;
import dagger.hilt.internal.C0254;
import f.C0270;
import h1.C0301;
import java.util.concurrent.Callable;
import k8.C0339;
import o2.C0369;
import r6.C0403;

/* JADX INFO: loaded from: classes.dex */
public final class k5 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h5 f10158e;

    public /* synthetic */ k5(h5 h5Var, String str, String str2, String str3, int i10) {
        this.f10154a = i10;
        this.f10158e = h5Var;
        this.f10155b = str;
        this.f10156c = str2;
        this.f10157d = str3;
        int iM7897 = C0403.m7897();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7897 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0211.m4020("NjybOHA9lEdGxXtRCraqYrz3bYiyh")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int iM5787 = C0301.m5787(this);
        String strM7219 = C0369.m7219(this);
        String strM3022 = C0158.m3022(this);
        String strM1641 = C0075.m1641(this);
        h5 h5VarM4837 = C0254.m4837(this);
        switch (iM5787) {
            case 0:
                C0339.m6647(C0270.m5151(h5VarM4837));
                k kVarM4068 = C0213.m4068(C0270.m5151(h5VarM4837));
                C0173.m3298(kVarM4068);
                return C0149.m2849(kVarM4068, strM7219, strM1641, strM3022);
            case 1:
                C0339.m6647(C0270.m5151(h5VarM4837));
                k kVarM4069 = C0213.m4068(C0270.m5151(h5VarM4837));
                C0173.m3298(kVarM4069);
                return C0170.m3258(kVarM4069, strM7219, strM1641, strM3022);
            case 2:
                C0339.m6647(C0270.m5151(h5VarM4837));
                k kVarM40610 = C0213.m4068(C0270.m5151(h5VarM4837));
                C0173.m3298(kVarM40610);
                return C0149.m2849(kVarM40610, strM7219, strM1641, strM3022);
            default:
                C0339.m6647(C0270.m5151(h5VarM4837));
                k kVarM40611 = C0213.m4068(C0270.m5151(h5VarM4837));
                C0173.m3298(kVarM40611);
                return C0170.m3258(kVarM40611, strM7219, strM1641, strM3022);
        }
    }
}
