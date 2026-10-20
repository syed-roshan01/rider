package l4;

import android.os.StatFs;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ja.t;
import ja.x;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f11273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f11274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f11275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t9.c f11278f;

    public final n a() {
        long jS;
        x xVar = this.f11273a;
        if (xVar == null) {
            throw new IllegalStateException("directory == null".toString());
        }
        double d10 = this.f11275c;
        if (d10 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            try {
                File fileE = xVar.e();
                fileE.mkdir();
                StatFs statFs = new StatFs(fileE.getAbsolutePath());
                jS = z6.a.s((long) (d10 * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f11276d, this.f11277e);
            } catch (Exception unused) {
                jS = this.f11276d;
            }
        } else {
            jS = 0;
        }
        return new n(jS, xVar, this.f11274b, this.f11278f);
    }
}
