package k6;

import a6.C0007;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.layout.C0035;
import androidx.core.app.C0040;
import androidx.versionedparcelable.C0048;
import c1.C0061;
import c3.C0062;
import c3.C0063;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.abt.C0112;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.measurement.C0184;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0227;
import e2.C0260;
import f.C0270;
import g9.C0294;
import h.C0298;
import h6.C0309;
import h7.C0310;
import java.util.concurrent.atomic.AtomicReference;
import m5.C0354;
import p0.C0373;
import u4.C0436;
import w0.C0454;
import w2.C0457;
import w2.C0458;
import y9.C0479;

/* JADX INFO: loaded from: classes.dex */
public final class g6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f547short = {747, 716, 708, 705, 712, 713, 653, 729, 706, 653, 714, 712, 729, 653, 728, 734, 712, 735, 653, 733, 735, 706, 733, 712, 735, 729, 708, 712, 734, 662, 653, 707, 706, 729, 653, 718, 706, 707, 707, 712, 718, 729, 712, 713, 653, 729, 706, 653, 734, 712, 735, 731, 708, 718, 712, 684, 651, 643, 646, 655, 654, 714, 670, 645, 714, 653, 655, 670, 714, 671, 665, 655, 664, 714, 666, 664, 645, 666, 655, 664, 670, 643, 655, 665, 721, 714, 664, 655, 647, 645, 670, 655, 714, 655, 658, 649, 655, 666, 670, 643, 645, 644};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10069f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f10070n;

    public g6(s6 s6Var, String str, String str2, x7 x7Var, boolean z10, zzcv zzcvVar) {
        this.f10064a = 1;
        this.f10070n = s6Var;
        this.f10065b = str;
        this.f10066c = str2;
        this.f10068e = x7Var;
        this.f10067d = z10;
        this.f10069f = zzcvVar;
        int iM4380 = C0227.m4380();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4380 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0035.m677("VrK9Rxtjclrd")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public g6(y5 y5Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f10064a = 0;
        this.f10070n = y5Var;
        this.f10068e = atomicReference;
        this.f10065b = null;
        this.f10066c = str;
        this.f10069f = str2;
        this.f10067d = z10;
        int iM5663 = C0294.m5663();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5663 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0033.m642("joLa")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6559() {
        int iM2007 = C0102.m2007();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2007 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f547short;
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

    /* JADX WARN: Code duplicated, block: B:100:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0072 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0086. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r2v0, types: [k6.p2] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, k6.s6] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RemoteException remoteException;
        int i10;
        ?? r10;
        int i11;
        int iM1220 = C0063.m1220(this);
        ?? M5676 = C0294.m5676(this);
        Object objM676 = C0034.m676(this);
        Object objM8905 = C0457.m8905(this);
        switch (iM1220) {
            case 0:
                s6 s6VarM2789 = C0146.m2789((f5) C0163.m3121((y5) M5676));
                boolean zM931 = C0048.m931(this);
                C0040.m791(s6VarM2789);
                C0458.m8937(s6VarM2789);
                C0309.m5979(s6VarM2789, new x6(s6VarM2789, (AtomicReference) objM8905, C0184.m3515(this), (String) objM676, C0061.m1159(s6VarM2789, false), zM931));
                return;
            default:
                String strM7330 = C0373.m7330(this);
                Object bundle = new Bundle();
                try {
                    try {
                        y3 y3VarM2387 = C0124.m2387((s6) M5676);
                        String strM3515 = C0184.m3515(this);
                        int i12 = 1616;
                        while (true) {
                            i12 ^= 1633;
                            switch (i12) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 49:
                                    i12 = y3VarM2387 == null ? 1709 : 1678;
                                    break;
                                case 204:
                                    C0112.m2169(C0454.m8871(C0029.m572((s6) M5676)), C0260.m4969(m6559(), 0, C0126.f152 ^ (-249), 685), strM7330, strM3515);
                                    C0151.m2898(C0354.m6951((s6) M5676), (zzcv) objM676, bundle);
                                    int i13 = 1740;
                                    while (true) {
                                        i13 ^= 1757;
                                        switch (i13) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i13 = 1771;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    C0270.m5173((x7) objM8905);
                                    objM8905 = C0062.m1187(C0103.m2026(y3VarM2387, strM7330, strM3515, C0048.m931(this), (x7) objM8905));
                                    try {
                                        C0310.m6011((s6) M5676);
                                        objM676 = (zzcv) objM676;
                                        C0151.m2898(C0354.m6951((s6) M5676), objM676, objM8905);
                                        int i14 = 48891;
                                        while (true) {
                                            i14 ^= 48908;
                                            switch (i14) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i14 = 48922;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    } catch (RemoteException e4) {
                                        remoteException = e4;
                                        r10 = M5676;
                                        int i15 = 48767;
                                        while (true) {
                                            i15 ^= 48784;
                                            switch (i15) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i15 = 48798;
                                                    break;
                                                default:
                                                    break;
                                            }
                                            f4 f4VarM8871 = C0454.m8871(C0029.m572((s6) r10));
                                            bundle = C0298.m5745(m6559(), 55, C0007.f27 ^ (-400), 746);
                                            C0112.m2169(f4VarM8871, bundle, strM7330, remoteException);
                                            M5676 = (s6) r10;
                                            objM676 = (zzcv) objM676;
                                            C0151.m2898(C0354.m6951(M5676), objM676, objM8905);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        while (true) {
                            i11 ^= 49683;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (M5676 >= 0) {
                                        i11 = 49759;
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    System.out.println(Double.decode(C0479.m9340("aRD6mCyXuKLZYyEpvRozf")));
                                    return;
                                case 83:
                                    return;
                                default:
                                    continue;
                            }
                            i11 = 49728;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i10 = 1864;
                        while (true) {
                            i10 ^= 1881;
                            switch (i10) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i10 = 48674;
                                    break;
                                case 47483:
                                    C0151.m2898(C0354.m6951((s6) M5676), (zzcv) objM676, objM8905);
                                    throw th;
                            }
                        }
                    }
                } catch (RemoteException e10) {
                    remoteException = e10;
                    objM8905 = bundle;
                    r10 = M5676;
                } catch (Throwable th2) {
                    th = th2;
                    objM8905 = bundle;
                    i10 = 1864;
                    while (true) {
                        i10 ^= 1881;
                        switch (i10) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i10 = 48674;
                                break;
                            case 47483:
                                C0151.m2898(C0354.m6951((s6) M5676), (zzcv) objM676, objM8905);
                                throw th;
                        }
                    }
                }
                M5676 = C0436.m8524();
                i11 = 49666;
                break;
        }
    }
}
