package z5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.internal.common.zzc;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f17277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f17278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile f0 f17279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f17280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f17281e;

    static {
        new p(q.a("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new p(q.a("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f17277a = new p(q.a("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f17278b = new p(q.a("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
        f17280d = new Object();
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [z5.o] */
    public static z a(final String str, final q qVar, final boolean z10, boolean z11) {
        try {
            b();
            f6.a.x(f17281e);
            x xVar = new x(str, qVar, z10, z11);
            try {
                f0 f0Var = f17279c;
                g6.b bVar = new g6.b(f17281e.getPackageManager());
                d0 d0Var = (d0) f0Var;
                Parcel parcelZza = d0Var.zza();
                zzc.zzd(parcelZza, xVar);
                zzc.zzf(parcelZza, bVar);
                Parcel parcelZzB = d0Var.zzB(5, parcelZza);
                boolean zZzg = zzc.zzg(parcelZzB);
                parcelZzB.recycle();
                return zZzg ? z.f17296d : new y(new Callable() { // from class: z5.o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        MessageDigest messageDigest;
                        boolean z12 = z10;
                        String str2 = str;
                        q qVar2 = qVar;
                        Object[] objArr = new Object[5];
                        objArr[0] = (z12 || !u.a(str2, qVar2, true, false).f17297a) ? "not allowed" : "debug cert rejected";
                        objArr[1] = str2;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= 2) {
                                messageDigest = null;
                                break;
                            }
                            try {
                                messageDigest = MessageDigest.getInstance("SHA-256");
                                if (messageDigest != null) {
                                    break;
                                }
                                i10++;
                            } catch (NoSuchAlgorithmException unused) {
                            }
                        }
                        f6.a.x(messageDigest);
                        byte[] bArrDigest = messageDigest.digest(qVar2.b());
                        int length = bArrDigest.length;
                        char[] cArr = new char[length + length];
                        int i11 = 0;
                        for (byte b10 : bArrDigest) {
                            int i12 = i11 + 1;
                            char[] cArr2 = e6.d.f5145b;
                            cArr[i11] = cArr2[(b10 & 255) >>> 4];
                            i11 += 2;
                            cArr[i12] = cArr2[b10 & 15];
                        }
                        objArr[2] = new String(cArr);
                        objArr[3] = Boolean.valueOf(z12);
                        objArr[4] = "12451000.false";
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
                    }
                });
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                return new z(false, "module call", e4);
            }
        } catch (h6.b e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return new z(false, "module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }

    public static void b() {
        f0 d0Var;
        if (f17279c != null) {
            return;
        }
        f6.a.x(f17281e);
        synchronized (f17280d) {
            try {
                if (f17279c == null) {
                    IBinder iBinderB = h6.e.c(f17281e, h6.e.f7565c, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = e0.f3292a;
                    if (iBinderB == null) {
                        d0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        d0Var = iInterfaceQueryLocalInterface instanceof f0 ? (f0) iInterfaceQueryLocalInterface : new d0(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    f17279c = d0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
