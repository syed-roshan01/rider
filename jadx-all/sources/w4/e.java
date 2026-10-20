package w4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.a0;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import r8.p;
import x9.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f16163a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f16164b = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f16165c = new q((String[]) new ArrayList(20).toArray(new String[0]));

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || l9.i.R0(str)) {
            return null;
        }
        String strN1 = l9.i.n1(l9.i.n1(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(l9.i.k1(l9.i.k1(strN1, '/', strN1), '.', ""));
    }

    public static final File c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null".toString());
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final boolean d(Uri uri) {
        return d7.a.d(uri.getScheme(), "file") && d7.a.d((String) p.H0(uri.getPathSegments()), "android_asset");
    }

    public static final int e(f6.a aVar, t4.e eVar) {
        if (aVar instanceof t4.a) {
            return ((t4.a) aVar).f14647z;
        }
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new a0();
    }
}
