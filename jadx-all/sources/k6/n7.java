package k6;

import c1.C0059;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import d1.C0214;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.codegen.C0242;
import e2.C0262;
import f.C0271;
import g3.C0289;
import h4.C0305;
import i6.C0320;
import j6.C0329;
import java.util.ArrayList;
import k3.C0336;
import m7.C0358;
import n9.C0367;
import u8.C0439;
import x7.C0472;
import x8.C0474;

/* JADX INFO: loaded from: classes.dex */
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzfi.zzj f10236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f10237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f10238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p7 f10240e;

    public n7(p7 p7Var) {
        this.f10240e = p7Var;
        int iM1597 = C0073.m1597();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1597 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0289.m5546("cfmgxrj")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void a(zzfi.zzj zzjVar) {
        C0271.m5173(zzjVar);
        this.f10236a = zzjVar;
    }

    public final boolean b(zzfi.zze zzeVar, long j10) {
        C0271.m5173(zzeVar);
        ArrayList arrayListM6345 = C0329.m6345(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = arrayListM6345 == null ? 1709 : 1678;
                    break;
                case 204:
                    this.f10238c = new ArrayList();
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        ArrayList arrayListM4073 = C0214.m4073(this);
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i11 = arrayListM4073 == null ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    this.f10237b = new ArrayList();
                    break;
                default:
                    break;
            }
        }
        boolean zM3889 = C0203.m3889(C0329.m6345(this));
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = !zM3889 ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    long jM6505 = ((C0336.m6505((zzfi.zze) C0234.m4486(C0329.m6345(this), 0)) / 1000) / 60) / 60;
                    long jM6506 = ((C0336.m6505(zzeVar) / 1000) / 60) / 60;
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                return false;
                            case 239:
                                i13 = jM6505 != jM6506 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        long jM9175 = 22 + (C0472.m9175(this) - 22) + ((long) C0474.m9226(zzeVar));
        p7 p7VarM1972 = C0101.m1972(this);
        C0086.m1839(p7VarM1972);
        long jM1119 = C0059.m1119(0, C0367.m7190((Integer) C0262.m4995(C0320.m6183(), null)));
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    this.f10239d = jM9175;
                    C0358.m6998(C0329.m6345(this), zzeVar);
                    C0358.m6998(C0214.m4073(this), C0439.m8554(j10));
                    int iM4637 = C0242.m4637(C0329.m6345(this));
                    C0086.m1839(p7VarM1972);
                    int iM1119 = C0059.m1119(1, C0367.m7190((Integer) C0262.m4995(C0305.m5877(), null)));
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM4637 >= iM1119) {
                                    i15 = 49759;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                return false;
                            case 83:
                                return true;
                            default:
                                continue;
                        }
                        i15 = 49728;
                    }
                    break;
                case 503:
                    if (jM9175 >= jM1119) {
                        i14 = 49635;
                    }
                    break;
                case 32495:
                    return false;
                default:
                    continue;
            }
            i14 = 48953;
        }
    }
}
