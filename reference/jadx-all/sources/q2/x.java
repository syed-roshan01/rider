package q2;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.ride.accepter.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13102a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f13106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f13107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f13108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f13109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13111j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y f13113l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f13116o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f13119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f13120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Notification f13121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f13122u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13103b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13104c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13105d = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13112k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13114m = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13117p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13118q = 0;

    public x(Context context, String str) {
        Notification notification = new Notification();
        this.f13121t = notification;
        this.f13102a = context;
        this.f13119r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f13111j = 0;
        this.f13122u = new ArrayList();
        this.f13120s = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        k0 k0Var = new k0(this);
        y yVar = k0Var.f13085c.f13113l;
        if (yVar != null) {
            yVar.b(k0Var);
        }
        Notification notificationA = z.a(k0Var.f13084b);
        k0Var.f13085c.getClass();
        if (yVar != null) {
            k0Var.f13085c.f13113l.getClass();
        }
        if (yVar != null && (bundle = notificationA.extras) != null) {
            yVar.a(bundle);
        }
        return notificationA;
    }

    public final void c(int i10, boolean z10) {
        Notification notification = this.f13121t;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f13102a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f1802k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f1804b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f13109h = iconCompat;
    }

    public final void e(y yVar) {
        if (this.f13113l != yVar) {
            this.f13113l = yVar;
            if (yVar.f13123a != this) {
                yVar.f13123a = this;
                e(yVar);
            }
        }
    }
}
