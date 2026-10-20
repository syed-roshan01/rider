package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import k.a;
import k.b;
import k.k;
import k.m;
import k.t;
import l.j0;
import l.k3;
import l.l;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends j0 implements t, View.OnClickListener, l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f1433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f1434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f1435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k f1436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f1437s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f1438t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1439u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1440v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1443y;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1439u = p();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5567c, 0, 0);
        this.f1441w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1443y = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1442x = -1;
        setSaveEnabled(false);
    }

    @Override // k.t
    public final void a(m mVar) {
        this.f1433o = mVar;
        setIcon(mVar.getIcon());
        setTitle(mVar.getTitleCondensed());
        setId(mVar.f8648a);
        setVisibility(mVar.isVisible() ? 0 : 8);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.f1437s == null) {
            this.f1437s = new a(this);
        }
    }

    @Override // l.l
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.l
    public final boolean c() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f1433o.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.t
    public m getItemData() {
        return this.f1433o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f1436r;
        if (kVar != null) {
            kVar.a(this.f1433o);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1439u = p();
        q();
    }

    @Override // l.j0, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10 = !TextUtils.isEmpty(getText());
        if (z10 && (i12 = this.f1442x) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f1441w;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (z10 || this.f1435q == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1435q.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f1433o.hasSubMenu() && (aVar = this.f1437s) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean p() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void q() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1434p);
        if (this.f1435q != null && ((this.f1433o.f8672y & 4) != 4 || (!this.f1439u && !this.f1440v))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f1434p : null);
        CharSequence charSequence = this.f1433o.f8664q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f1433o.f8652e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1433o.f8665r;
        if (TextUtils.isEmpty(charSequence2)) {
            k3.a(this, z12 ? null : this.f1433o.f8652e);
        } else {
            k3.a(this, charSequence2);
        }
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1440v != z10) {
            this.f1440v = z10;
            m mVar = this.f1433o;
            if (mVar != null) {
                k.l lVar = mVar.f8661n;
                lVar.f8638k = true;
                lVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1435q = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1443y;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        q();
    }

    public void setItemInvoker(k kVar) {
        this.f1436r = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f1442x = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f1438t = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1434p = charSequence;
        q();
    }
}
