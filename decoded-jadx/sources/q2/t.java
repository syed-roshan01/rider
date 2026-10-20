package q2;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class t extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f13098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IconCompat f13099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13100d;

    @Override // q2.y
    public final void b(k0 k0Var) {
        Bitmap bitmap;
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPictureStyleC = q.c(q.b(k0Var.f13084b), null);
        IconCompat iconCompat = this.f13098b;
        Context context = k0Var.f13083a;
        if (iconCompat != null) {
            if (i10 >= 31) {
                s.a(bigPictureStyleC, v2.c.c(iconCompat, context));
            } else if (iconCompat.c() == 1) {
                IconCompat iconCompat2 = this.f13098b;
                int i11 = iconCompat2.f1803a;
                if (i11 == -1) {
                    Object obj = iconCompat2.f1804b;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i11 == 1) {
                    bitmap = (Bitmap) iconCompat2.f1804b;
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat2.f1804b;
                    int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    float f10 = iMin;
                    float f11 = 0.5f * f10;
                    float f12 = 0.9166667f * f11;
                    float f13 = 0.010416667f * f10;
                    paint.setColor(0);
                    paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
                    canvas.drawCircle(f11, f11, f12, paint);
                    paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f11, f11, f12, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f11, f11, f12, paint);
                    canvas.setBitmap(null);
                    bitmap = bitmapCreateBitmap;
                }
                bigPictureStyleC = q.a(bigPictureStyleC, bitmap);
            }
        }
        if (this.f13100d) {
            IconCompat iconCompat3 = this.f13099c;
            if (iconCompat3 == null) {
                q.d(bigPictureStyleC, null);
            } else {
                r.a(bigPictureStyleC, v2.c.c(iconCompat3, context));
            }
        }
        if (i10 >= 31) {
            s.c(bigPictureStyleC, false);
            s.b(bigPictureStyleC, null);
        }
    }

    @Override // q2.y
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
