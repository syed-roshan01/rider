package k6;

import a.C0000;
import a7.C0008;
import a8.C0009;
import android.os.Bundle;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import androidx.core.app.C0040;
import c0.C0057;
import c1.C0061;
import c6.C0067;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import d.C0211;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.migration.C0240;
import e7.C0265;
import e9.C0267;
import h6.C0310;
import java.util.concurrent.atomic.AtomicReference;
import k8.C0339;
import l2.C0342;
import l8.C0347;
import m3.C0353;
import n7.C0365;
import p8.C0380;
import r1.C0394;
import r6.C0403;
import rikka.shizuku.C0407;
import s8.C0417;
import t2.C0423;
import u7.C0438;
import u8.C0439;
import v.C0440;
import v9.C0453;
import w0.C0455;
import w2.C0459;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f10615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f10616c;

    public /* synthetic */ z5(y5 y5Var, AtomicReference atomicReference, int i10) {
        this.f10614a = i10;
        this.f10616c = y5Var;
        this.f10615b = atomicReference;
        int iM5099 = C0267.m5099();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5099 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0228.m4378("TQK3znVBxAFyBahfXussaA")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    private final void a() {
        synchronized (C0438.m8545(this)) {
            try {
                try {
                    AtomicReference atomicReferenceM8545 = C0438.m8545(this);
                    f fVarM1951 = C0091.m1951(C0342.m6706(this));
                    String strM5048 = C0265.m5048(C0455.m8874(C0342.m6706(this)));
                    C0014.m280(fVarM1951);
                    C0226.m4329(atomicReferenceM8545, C0009.m192(C0187.m3575(fVarM1951, strM5048, C0017.m344())));
                    C0123.m2376(C0438.m8545(this));
                } catch (Throwable th) {
                    C0123.m2376(C0438.m8545(this));
                    throw th;
                }
            } catch (Throwable th2) {
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            throw th2;
                        case 49:
                            i10 = 1647;
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m6617(Object obj) {
        int iM3452 = C0181.m3452();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM3452 <= 0 ? 1709 : 1678;
                    break;
                case 204:
                    ((z5) obj).a();
                    break;
                case 239:
                    int i11 = 1864;
                    while (true) {
                        i11 ^= 1881;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 48674;
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
        int iM7977 = C0407.m7977();
        int i12 = 1740;
        while (true) {
            i12 ^= 1757;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM7977 >= 0) {
                        i12 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    System.out.println(Long.decode(C0008.m162("vXWUC")));
                    return;
                default:
                    continue;
            }
            i12 = 1802;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0347.m6783(this)) {
            case 0:
                AtomicReference atomicReferenceM8545 = C0438.m8545(this);
                y5 y5VarM6706 = C0342.m6706(this);
                Bundle bundleM1313 = C0067.m1313(C0211.m4025(C0339.m6640(y5VarM6706)));
                s6 s6VarM7706 = C0394.m7706(y5VarM6706);
                int i10 = 49666;
                while (true) {
                    i10 ^= 49683;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i10 = bundleM1313 == null ? 49759 : 49728;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            bundleM1313 = new Bundle();
                            break;
                        case 83:
                            break;
                        default:
                            break;
                    }
                }
                C0040.m791(s6VarM7706);
                C0459.m8937(s6VarM7706);
                C0310.m5979(s6VarM7706, new k.e(s6VarM7706, atomicReferenceM8545, C0061.m1159(s6VarM7706, false), bundleM1313, C0440.f710 ^ 966));
                return;
            case 1:
                m6617(this);
                return;
            case 2:
                synchronized (C0438.m8545(this)) {
                    try {
                        try {
                            AtomicReference atomicReferenceM8546 = C0438.m8545(this);
                            f fVarM1951 = C0091.m1951(C0342.m6706(this));
                            String strM5048 = C0265.m5048(C0455.m8874(C0342.m6706(this)));
                            C0014.m280(fVarM1951);
                            C0226.m4329(atomicReferenceM8546, C0147.m2813(fVarM1951, strM5048, C0365.m7145()));
                            C0123.m2376(C0438.m8545(this));
                        } catch (Throwable th) {
                            int i11 = 48891;
                            while (true) {
                                i11 ^= 48908;
                                switch (i11) {
                                    case 22:
                                        throw th;
                                    case 503:
                                        i11 = 48922;
                                        break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        C0123.m2376(C0438.m8545(this));
                        throw th2;
                    }
                }
                return;
            case 3:
                synchronized (C0438.m8545(this)) {
                    try {
                        try {
                            C0226.m4329(C0438.m8545(this), C0057.m1083(C0000.m1(C0091.m1951(C0342.m6706(this)), C0265.m5048(C0455.m8874(C0342.m6706(this))), C0240.m4590())));
                            C0123.m2376(C0438.m8545(this));
                        } catch (Throwable th3) {
                            int i12 = 48767;
                            while (true) {
                                i12 ^= 48784;
                                switch (i12) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        throw th3;
                                    case 239:
                                        i12 = 48798;
                                        break;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        C0123.m2376(C0438.m8545(this));
                        throw th4;
                    }
                }
                return;
            case 4:
                synchronized (C0438.m8545(this)) {
                    try {
                        try {
                            C0226.m4329(C0438.m8545(this), C0439.m8554(C0380.m7426(C0091.m1951(C0342.m6706(this)), C0265.m5048(C0455.m8874(C0342.m6706(this))), C0453.m8811())));
                            C0123.m2376(C0438.m8545(this));
                        } catch (Throwable th5) {
                            C0123.m2376(C0438.m8545(this));
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        int i13 = 1864;
                        while (true) {
                            i13 ^= 1881;
                            switch (i13) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i13 = 48674;
                                    break;
                                case 47483:
                                    throw th6;
                            }
                        }
                    }
                }
                return;
            default:
                synchronized (C0438.m8545(this)) {
                    try {
                        try {
                            C0226.m4329(C0438.m8545(this), C0423.m8281(C0236.m4540(C0091.m1951(C0342.m6706(this)), C0265.m5048(C0455.m8874(C0342.m6706(this))), C0403.m7900())));
                            C0123.m2376(C0438.m8545(this));
                        } catch (Throwable th7) {
                            C0123.m2376(C0438.m8545(this));
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        int i14 = 1740;
                        while (true) {
                            i14 ^= 1757;
                            switch (i14) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i14 = 1771;
                                    break;
                                case 54:
                                    throw th8;
                            }
                        }
                    }
                }
                int iM6904 = C0353.m6904();
                int i15 = 1616;
                while (true) {
                    i15 ^= 1633;
                    switch (i15) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM6904 >= 0) {
                                i15 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Float.valueOf(C0417.m8175("gzX8Bsr7hhksLdXR2pEZBXJAU")));
                            return;
                        case 239:
                            return;
                        default:
                            continue;
                    }
                    i15 = 1678;
                }
                break;
        }
    }
}
