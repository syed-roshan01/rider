package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f10980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10981b;

    public final void a(Canvas canvas) {
        this.f10980a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void jumpToCurrentState() {
        this.f10980a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onBoundsChange(Rect rect) {
        this.f10980a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void setAlpha(int i10) {
        this.f10980a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f10981b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void setAutoMirrored(boolean z10) {
        v2.a.e(this.f10980a, z10);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void setChangingConfigurations(int i10) {
        this.f10980a.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10980a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f10980a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f10980a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f10980a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f10980a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f10980a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f10980a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f10980a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f10980a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f10980a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f10980a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setDither(boolean z10) {
        this.f10980a.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setFilterBitmap(boolean z10) {
        this.f10980a.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return v2.a.d(this.f10980a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f10980a.isStateful();
    }

    public final void j(float f10, float f11) {
        v2.b.e(this.f10980a, f10, f11);
    }

    public final void k(int i10, int i11, int i12, int i13) {
        v2.b.f(this.f10980a, i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void setTint(int i10) {
        v2.b.g(this.f10980a, i10);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void setTintList(ColorStateList colorStateList) {
        v2.b.h(this.f10980a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void setTintMode(PorterDuff.Mode mode) {
        v2.b.i(this.f10980a, mode);
    }

    public final boolean o(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f10980a.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f10980a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        if (this.f10981b) {
            j(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f10981b) {
            k(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f10981b) {
            return this.f10980a.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f10981b) {
            return o(z10, z11);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
