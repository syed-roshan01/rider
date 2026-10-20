package j0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends RippleDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e1.r f8261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f8262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8263d;

    public d0(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f8260a = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f8260a) {
            this.f8263d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f8263d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f8263d;
    }
}
