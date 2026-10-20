package k6;

import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzo;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.migration.C0254;
import java.util.Map;
import l6.C0343;
import r5.C0399;
import v5.C0445;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class y4 implements zzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4 f10567b;

    public y4(t4 t4Var, String str) {
        this.f10567b = t4Var;
        this.f10566a = str;
        int iM7828 = C0399.m7828();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7828 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0343.m6731("JUdkxsWMc9PSGZ1uiF1qkUqaHM")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) C0183.m3495(C0132.m2542(C0445.m8695(this)), C0254.m4860(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = map != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM1819 = C0085.m1819(map, str);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = !zM1819 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                return (String) C0487.m9501(map, str);
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            continue;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
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
        return null;
    }
}
