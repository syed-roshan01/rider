package w4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d7.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16168a = 9;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16169b = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16170c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16171d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16172e = 15;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (h6.g.f(r9, r1, d7.a.d(r7, r2) ? r0.getWidth() : w4.e.e(r7.f14658a, r8), d7.a.d(r7, r2) ? r0.getHeight() : w4.e.e(r7.f14659b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(Drawable drawable, Bitmap.Config config, t4.f fVar, t4.e eVar, boolean z10) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || config == Bitmap.Config.HARDWARE) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z10) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    t4.f fVar2 = t4.f.f14657c;
                }
                return bitmap3;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        Bitmap.Config[] configArr = e.f16163a;
        boolean z11 = drawableMutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z11 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? drawableMutate.getIntrinsicWidth() : bitmap2.getWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z11 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? drawableMutate.getIntrinsicHeight() : bitmap.getHeight();
        int i10 = intrinsicHeight > 0 ? intrinsicHeight : 512;
        t4.f fVar3 = t4.f.f14657c;
        double dF = h6.g.f(intrinsicWidth, i10, d7.a.d(fVar, fVar3) ? intrinsicWidth : e.e(fVar.f14658a, eVar), d7.a.d(fVar, fVar3) ? i10 : e.e(fVar.f14659b, eVar), eVar);
        int iO0 = t.o0(((double) intrinsicWidth) * dF);
        int iO1 = t.o0(dF * ((double) i10));
        if (config == null || config == Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iO0, iO1, config);
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iO0, iO1);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }

    public static final void b(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
