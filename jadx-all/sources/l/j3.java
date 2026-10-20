package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class j3 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f10788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f10790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f10791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f10792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f10793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f10795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f10796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f10797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f10798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f10800m;

    public final void a(int i10) {
        View view;
        int i11 = this.f10789b ^ i10;
        this.f10789b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                int i12 = this.f10789b & 4;
                Toolbar toolbar = this.f10788a;
                if (i12 != 0) {
                    Drawable drawable = this.f10793f;
                    if (drawable == null) {
                        drawable = this.f10800m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                c();
            }
            int i13 = i11 & 8;
            Toolbar toolbar2 = this.f10788a;
            if (i13 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar2.setTitle(this.f10795h);
                    toolbar2.setSubtitle(this.f10796i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f10790c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f10789b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f10797j);
            Toolbar toolbar = this.f10788a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f10799l);
            } else {
                toolbar.setNavigationContentDescription(this.f10797j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f10789b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f10792e) == null) {
            drawable = this.f10791d;
        }
        this.f10788a.setLogo(drawable);
    }
}
