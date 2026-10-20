package k6;

import a.C0000;
import a.C0001;
import androidx.core.app.C0040;
import c1.C0061;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.android.lifecycle.C0236;
import e2.C0263;
import h.C0296;
import h6.C0309;
import n1.C0362;
import t2.C0420;
import w2.C0458;
import x7.C0471;

/* JADX INFO: loaded from: classes.dex */
public final class n5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcv f10227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppMeasurementDynamiteService f10228c;

    public /* synthetic */ n5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, int i10) {
        this.f10226a = i10;
        this.f10228c = appMeasurementDynamiteService;
        this.f10227b = zzcvVar;
        int iM4482 = C0232.m4482();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4482 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0001.m38("9mFjO6AYV051jjCEm5eO8LSjolhvl"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        int iM5702 = C0296.m5702(this);
        zzcv zzcvVarM1596 = C0073.m1596(this);
        AppMeasurementDynamiteService appMeasurementDynamiteServiceM8267 = C0420.m8267(this);
        switch (iM5702) {
            case 0:
                s6 s6VarM2789 = C0146.m2789(C0263.m5039(appMeasurementDynamiteServiceM8267));
                C0040.m791(s6VarM2789);
                C0458.m8937(s6VarM2789);
                C0309.m5979(s6VarM2789, new y2.a(s6VarM2789, C0061.m1159(s6VarM2789, false), zzcvVarM1596, C0074.f108 ^ (-674)));
                break;
            default:
                u7 u7VarM9185 = C0471.m9185(C0263.m5039(appMeasurementDynamiteServiceM8267));
                C0236.m4550(u7VarM9185);
                f5 f5VarM5039 = C0263.m5039(appMeasurementDynamiteServiceM8267);
                Boolean boolM2948 = C0154.m2948(f5VarM5039);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = boolM2948 != null ? 1709 : 1678;
                            break;
                        case 204:
                            boolean zM14 = C0000.m14(C0154.m2948(f5VarM5039));
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = zM14 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        z10 = true;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
                C0188.m3597(u7VarM9185, zzcvVarM1596, z10);
                int iM2903 = C0151.m2903();
                int i12 = 1864;
                while (true) {
                    i12 ^= 1881;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM2903 <= 0) {
                                i12 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            System.out.println(Float.parseFloat(C0362.m7098("jVikcEoPjYWK4fKji")));
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i12 = 48705;
                }
                break;
        }
    }
}
