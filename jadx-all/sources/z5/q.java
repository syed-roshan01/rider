package z5;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.u0;
import com.google.android.gms.common.internal.v0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17272b;

    public q(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        f6.a.r(bArr.length == 25);
        this.f17272b = Arrays.hashCode(bArr);
    }

    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    public abstract byte[] b();

    public final boolean equals(Object obj) {
        g6.a aVarZzd;
        if (obj != null && (obj instanceof v0)) {
            try {
                v0 v0Var = (v0) obj;
                if (v0Var.zzc() == this.f17272b && (aVarZzd = v0Var.zzd()) != null) {
                    return Arrays.equals(b(), (byte[]) g6.b.b(aVarZzd));
                }
                return false;
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17272b;
    }

    @Override // com.google.android.gms.common.internal.v0
    public final int zzc() {
        return this.f17272b;
    }

    @Override // com.google.android.gms.common.internal.v0
    public final g6.a zzd() {
        return new g6.b(b());
    }
}
