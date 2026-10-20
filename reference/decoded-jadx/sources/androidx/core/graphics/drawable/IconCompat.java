package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import v2.c;
import v2.e;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1802k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1812j;

    public IconCompat() {
        this.f1803a = -1;
        this.f1805c = null;
        this.f1806d = null;
        this.f1807e = 0;
        this.f1808f = 0;
        this.f1809g = null;
        this.f1810h = f1802k;
        this.f1811i = null;
    }

    public static IconCompat a(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1807e = i10;
        iconCompat.f1804b = "";
        iconCompat.f1812j = "";
        return iconCompat;
    }

    public final int b() {
        int i10 = this.f1803a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f1807e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f1804b;
        if (i11 >= 28) {
            return e.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        }
    }

    public final int c() {
        int i10 = this.f1803a;
        if (i10 != -1) {
            return i10;
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f1804b;
        if (i11 >= 28) {
            return e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        }
    }

    public final Uri d() {
        int i10 = this.f1803a;
        if (i10 == -1) {
            return c.a(this.f1804b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f1804b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f1803a == -1) {
            return String.valueOf(this.f1804b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1803a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1803a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1804b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1804b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1812j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1807e);
                if (this.f1808f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1808f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1804b);
                break;
        }
        if (this.f1809g != null) {
            sb.append(" tint=");
            sb.append(this.f1809g);
        }
        if (this.f1810h != f1802k) {
            sb.append(" mode=");
            sb.append(this.f1810h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i10) {
        this.f1805c = null;
        this.f1806d = null;
        this.f1807e = 0;
        this.f1808f = 0;
        this.f1809g = null;
        this.f1810h = f1802k;
        this.f1811i = null;
        this.f1803a = i10;
    }
}
