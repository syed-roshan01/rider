package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class v extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f10946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f10947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        s2.a(context);
        this.f10948c = false;
        r2.a(this, getContext());
        p pVar = new p(this);
        this.f10946a = pVar;
        pVar.d(null, R.attr.toolbarNavigationButtonStyle);
        w wVar = new w(this);
        this.f10947b = wVar;
        wVar.b(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f10946a;
        if (pVar != null) {
            pVar.a();
        }
        w wVar = this.f10947b;
        if (wVar != null) {
            wVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f10946a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f10946a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        t2 t2Var;
        w wVar = this.f10947b;
        if (wVar == null || (t2Var = (t2) wVar.f10955d) == null) {
            return null;
        }
        return (ColorStateList) t2Var.f10942c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        t2 t2Var;
        w wVar = this.f10947b;
        if (wVar == null || (t2Var = (t2) wVar.f10955d) == null) {
            return null;
        }
        return (PorterDuff.Mode) t2Var.f10943d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.f10947b.f10954c).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f10946a;
        if (pVar != null) {
            pVar.f10888b = -1;
            pVar.f(null);
            pVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        p pVar = this.f10946a;
        if (pVar != null) {
            pVar.e(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        w wVar = this.f10947b;
        if (wVar != null) {
            wVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        w wVar = this.f10947b;
        if (wVar != null && drawable != null && !this.f10948c) {
            wVar.f10953b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (wVar != null) {
            wVar.a();
            if (this.f10948c || ((ImageView) wVar.f10954c).getDrawable() == null) {
                return;
            }
            ((ImageView) wVar.f10954c).getDrawable().setLevel(wVar.f10953b);
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f10948c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f10947b.c(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        w wVar = this.f10947b;
        if (wVar != null) {
            wVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f10946a;
        if (pVar != null) {
            pVar.g(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f10946a;
        if (pVar != null) {
            pVar.h(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        w wVar = this.f10947b;
        if (wVar != null) {
            if (((t2) wVar.f10955d) == null) {
                wVar.f10955d = new t2();
            }
            t2 t2Var = (t2) wVar.f10955d;
            t2Var.f10942c = colorStateList;
            t2Var.f10941b = true;
            wVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        w wVar = this.f10947b;
        if (wVar != null) {
            if (((t2) wVar.f10955d) == null) {
                wVar.f10955d = new t2();
            }
            t2 t2Var = (t2) wVar.f10955d;
            t2Var.f10943d = mode;
            t2Var.f10940a = true;
            wVar.a();
        }
    }
}
