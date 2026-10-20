package j1;

import android.R;
import android.graphics.Shader;
import e1.n;
import e1.n0;
import e1.o;
import h0.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f8330a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f8331b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f8332c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f8333d = {R.attr.name, R.attr.pathData};

    public static final n a(i iVar) {
        Object obj = iVar.f7404c;
        if (!((((Shader) obj) == null && iVar.f7403b == 0) ? false : true)) {
            return null;
        }
        Shader shader = (Shader) obj;
        return shader != null ? new o(shader) : new n0(androidx.compose.ui.graphics.a.b(iVar.f7403b));
    }
}
