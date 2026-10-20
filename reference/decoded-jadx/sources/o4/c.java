package o4;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import s4.n;
import w4.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    @Override // o4.b
    public final String a(Object obj, n nVar) {
        Uri uri = (Uri) obj;
        if (!d7.a.d(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = nVar.f14022a.getResources().getConfiguration();
        Bitmap.Config[] configArr = e.f16163a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
