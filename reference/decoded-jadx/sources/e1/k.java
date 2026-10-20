package e1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final f1.d a(Bitmap bitmap) {
        f1.d dVarB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (dVarB = u.b(colorSpace)) != null) {
            return dVarB;
        }
        float[] fArr = f1.e.f6028a;
        return f1.e.f6030c;
    }

    public static final Bitmap b(int i10, int i11, int i12, boolean z10, f1.d dVar) {
        return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, androidx.compose.ui.graphics.a.t(i12), z10, u.a(dVar));
    }
}
