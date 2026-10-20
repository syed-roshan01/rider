package k6;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.compose.foundation.C0026;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.ktx.C0180;
import com.google.firebase.remoteconfig.internal.Code;
import e1.C0257;
import e2.C0263;
import f1.C0273;
import g.C0283;
import g4.C0289;
import ja.C0330;
import r1.C0393;
import t1.C0419;
import v0.C0440;

/* JADX INFO: loaded from: classes.dex */
public final class a implements u5 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f521short = {615, 596, 583, 588, 598, 514, 590, 587, 593, 598, 583, 588, 583, 592, 514, 598, 586, 592, 583, 597, 514, 583, 602, 577, 583, 594, 598, 587, 589, 588};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzda f9860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMeasurementDynamiteService f9861b;

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, zzda zzdaVar) {
        this.f9861b = appMeasurementDynamiteService;
        this.f9860a = zzdaVar;
        int iM2116 = C0109.m2116();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2116 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0273.m5262("PDzqzAy")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۨۨۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6532() {
        int iM1692 = C0078.m1692();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1692 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f521short;
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

    @Override // k6.u5
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            C0440.m8593(C0289.m5568(this), str, str2, bundle, j10);
        } catch (RemoteException e4) {
            f5 f5VarM5039 = C0263.m5039(C0026.m519(this));
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        if (f5VarM5039 != null) {
                            i10 = 1709;
                        }
                        break;
                    case 204:
                        d4 d4VarM3434 = C0180.m3434(f5VarM5039);
                        C0257.m4924(d4VarM3434);
                        C0419.m8245(C0330.m6385(d4VarM3434), C0283.m5471(m6532(), 0, C0393.f664 ^ 267, 546), e4);
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i10 = 1678;
            }
        }
    }
}
