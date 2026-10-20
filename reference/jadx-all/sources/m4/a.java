package m4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11828a;

    public /* synthetic */ a(int i10) {
        this.f11828a = i10;
    }

    @Override // m4.f
    public final g a(Object obj, s4.n nVar, i4.i iVar) {
        switch (this.f11828a) {
            case 0:
                return b((Uri) obj, nVar);
            case 1:
                return new c((Bitmap) obj, nVar, 0);
            case 2:
                return new c((ByteBuffer) obj, nVar, 1);
            case 3:
                return b((Uri) obj, nVar);
            case 4:
                return new c((Drawable) obj, nVar, 2);
            case 5:
                return new h((File) obj);
            default:
                return b((Uri) obj, nVar);
        }
    }

    public final g b(Uri uri, s4.n nVar) {
        switch (this.f11828a) {
            case 0:
                if (w4.e.d(uri)) {
                    return new b(uri, nVar, 0);
                }
                return null;
            case 3:
                if (d7.a.d(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                    return new b(uri, nVar, 1);
                }
                return null;
            default:
                if (d7.a.d(uri.getScheme(), "android.resource")) {
                    return new m(uri, nVar);
                }
                return null;
        }
    }
}
