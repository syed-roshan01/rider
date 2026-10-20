package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f10779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f10779d = kVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        k3.a(this, getContentDescription());
        setOnTouchListener(new i(this, this));
    }

    @Override // l.l
    public final boolean b() {
        return false;
    }

    @Override // l.l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f10779d.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            v2.b.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
