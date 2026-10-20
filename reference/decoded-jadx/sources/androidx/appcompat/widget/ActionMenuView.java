package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.f;
import k.j;
import k.k;
import k.l;
import k.r;
import l.f1;
import l.g1;
import l.m;
import l.n;
import l.o3;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends g1 implements k {
    public r A;
    public j B;
    public boolean C;
    public int D;
    public final int E;
    public final int F;
    public n G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l f1502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Context f1503x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1504y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l.k f1505z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.E = (int) (56.0f * f10);
        this.F = (int) (f10 * 4.0f);
        this.f1503x = context;
        this.f1504y = 0;
    }

    public static m h() {
        m mVar = new m(-2, -2);
        mVar.f10836a = false;
        ((LinearLayout.LayoutParams) mVar).gravity = 16;
        return mVar;
    }

    public static m i(ViewGroup.LayoutParams layoutParams) {
        m mVar;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof m) {
            m mVar2 = (m) layoutParams;
            mVar = new m(mVar2);
            mVar.f10836a = mVar2.f10836a;
        } else {
            mVar = new m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) mVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) mVar).gravity = 16;
        }
        return mVar;
    }

    @Override // k.k
    public final boolean a(k.m mVar) {
        return this.f1502w.p(mVar, null, 0);
    }

    @Override // l.g1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m;
    }

    @Override // l.g1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ f1 generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.g1
    /* JADX INFO: renamed from: e */
    public final f1 generateLayoutParams(AttributeSet attributeSet) {
        return new m(getContext(), attributeSet);
    }

    @Override // l.g1
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ f1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // l.g1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // l.g1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1502w == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.f1502w = lVar;
            lVar.f8632e = new f((Object) this, 3);
            l.k kVar = new l.k(context);
            this.f1505z = kVar;
            kVar.f10811r = true;
            kVar.f10812s = true;
            r aVar = this.A;
            if (aVar == null) {
                aVar = new a.a(6);
            }
            kVar.f10805e = aVar;
            this.f1502w.b(kVar, this.f1503x);
            l.k kVar2 = this.f1505z;
            kVar2.f10807n = this;
            this.f1502w = kVar2.f10803c;
        }
        return this.f1502w;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        l.k kVar = this.f1505z;
        l.j jVar = kVar.f10808o;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (kVar.f10810q) {
            return kVar.f10809p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1504y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i10) {
        boolean zB = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof l.l)) {
            zB = ((l.l) childAt).b();
        }
        return (i10 <= 0 || !(childAt2 instanceof l.l)) ? zB : zB | ((l.l) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l.k kVar = this.f1505z;
        if (kVar != null) {
            kVar.f();
            l.f fVar = this.f1505z.f10818y;
            if (fVar == null || !fVar.b()) {
                return;
            }
            this.f1505z.g();
            this.f1505z.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l.k kVar = this.f1505z;
        if (kVar != null) {
            kVar.g();
            l.f fVar = kVar.f10819z;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f8685j.dismiss();
        }
    }

    @Override // l.g1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.C) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zA = o3.a(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                m mVar = (m) childAt.getLayoutParams();
                if (mVar.f10836a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) mVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) mVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) mVar).leftMargin) + ((LinearLayout.LayoutParams) mVar).rightMargin;
                    j(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                m mVar2 = (m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mVar2.f10836a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) mVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) mVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            m mVar3 = (m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mVar3.f10836a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) mVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) mVar3).rightMargin + iMax + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // l.g1, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        ?? r10;
        int i16;
        l lVar;
        boolean z11 = this.C;
        boolean z12 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.C = z12;
        if (z11 != z12) {
            this.D = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.C && (lVar = this.f1502w) != null && size != this.D) {
            this.D = size;
            lVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.C || childCount <= 0) {
            for (int i17 = 0; i17 < childCount; i17++) {
                m mVar = (m) getChildAt(i17).getLayoutParams();
                ((LinearLayout.LayoutParams) mVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) mVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i18 = size2 - paddingRight;
        int i19 = this.E;
        int i20 = i18 / i19;
        int i21 = i18 % i19;
        if (i20 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i22 = (i21 / i20) + i19;
        int childCount2 = getChildCount();
        int i23 = 0;
        int iMax = 0;
        int i24 = 0;
        boolean z13 = false;
        int i25 = 0;
        int iMax2 = 0;
        long j10 = 0;
        while (true) {
            i12 = this.F;
            if (i24 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i24);
            int i26 = size3;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i27 = i23 + 1;
                if (z14) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                m mVar2 = (m) childAt.getLayoutParams();
                mVar2.f10841f = false;
                mVar2.f10838c = 0;
                mVar2.f10837b = 0;
                mVar2.f10839d = false;
                ((LinearLayout.LayoutParams) mVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) mVar2).rightMargin = 0;
                mVar2.f10840e = z14 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i28 = mVar2.f10836a ? 1 : i20;
                m mVar3 = (m) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z14 ? (ActionMenuItemView) childAt : null;
                boolean z15 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i28 <= 0 || (z15 && i28 < 2)) {
                    i16 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i28 * i22, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i16 = measuredWidth / i22;
                    if (measuredWidth % i22 != 0) {
                        i16++;
                    }
                    if (z15 && i16 < 2) {
                        i16 = 2;
                    }
                }
                mVar3.f10839d = !mVar3.f10836a && z15;
                mVar3.f10837b = i16;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i22, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i16);
                if (mVar2.f10839d) {
                    i25++;
                }
                if (mVar2.f10836a) {
                    z13 = true;
                }
                i20 -= i16;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i16 == 1) {
                    j10 |= (long) (1 << i24);
                }
                i23 = i27;
            }
            i24++;
            size3 = i26;
            paddingBottom = paddingBottom;
            i18 = i18;
        }
        int i29 = i18;
        int i30 = size3;
        int i31 = iMax2;
        boolean z16 = z13 && i23 == 2;
        boolean z17 = false;
        while (true) {
            if (i25 <= 0 || i20 <= 0) {
                i13 = i31;
                z10 = z17;
                break;
            }
            int i32 = Integer.MAX_VALUE;
            int i33 = 0;
            int i34 = 0;
            long j11 = 0;
            while (i34 < childCount2) {
                int i35 = i31;
                m mVar4 = (m) getChildAt(i34).getLayoutParams();
                boolean z18 = z17;
                if (mVar4.f10839d) {
                    int i36 = mVar4.f10837b;
                    if (i36 < i32) {
                        j11 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        i33++;
                        j11 |= 1 << i34;
                    }
                }
                i34++;
                z17 = z18;
                i31 = i35;
            }
            i13 = i31;
            z10 = z17;
            j10 |= j11;
            if (i33 > i20) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                m mVar5 = (m) childAt2.getLayoutParams();
                int i39 = mode;
                int i40 = childMeasureSpec;
                int i41 = childCount2;
                long j12 = 1 << i38;
                if ((j11 & j12) != 0) {
                    if (z16 && mVar5.f10840e) {
                        r10 = 1;
                        r10 = 1;
                        if (i20 == 1) {
                            childAt2.setPadding(i12 + i22, 0, i12, 0);
                        }
                    } else {
                        r10 = 1;
                    }
                    mVar5.f10837b += r10;
                    mVar5.f10841f = r10;
                    i20--;
                } else if (mVar5.f10837b == i37) {
                    j10 |= j12;
                }
                i38++;
                childMeasureSpec = i40;
                mode = i39;
                childCount2 = i41;
            }
            i31 = i13;
            z17 = true;
        }
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z19 = !z13 && i23 == 1;
        if (i20 <= 0 || j10 == 0 || (i20 >= i23 - 1 && !z19 && iMax <= 1)) {
            i14 = i43;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (!z19) {
                if ((j10 & 1) != 0 && !((m) getChildAt(0).getLayoutParams()).f10840e) {
                    fBitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j10 & ((long) (1 << i44))) != 0 && !((m) getChildAt(i44).getLayoutParams()).f10840e) {
                    fBitCount -= 0.5f;
                }
            }
            int i45 = fBitCount > 0.0f ? (int) ((i20 * i22) / fBitCount) : 0;
            i14 = i43;
            for (int i46 = 0; i46 < i14; i46++) {
                if ((j10 & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    m mVar6 = (m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        mVar6.f10838c = i45;
                        mVar6.f10841f = true;
                        if (i46 == 0 && !mVar6.f10840e) {
                            ((LinearLayout.LayoutParams) mVar6).leftMargin = (-i45) / 2;
                        }
                        z10 = true;
                    } else if (mVar6.f10836a) {
                        mVar6.f10838c = i45;
                        mVar6.f10841f = true;
                        ((LinearLayout.LayoutParams) mVar6).rightMargin = (-i45) / 2;
                        z10 = true;
                    } else {
                        if (i46 != 0) {
                            ((LinearLayout.LayoutParams) mVar6).leftMargin = i45 / 2;
                        }
                        if (i46 != i14 - 1) {
                            ((LinearLayout.LayoutParams) mVar6).rightMargin = i45 / 2;
                        }
                    }
                }
            }
        }
        if (z10) {
            int i47 = 0;
            while (i47 < i14) {
                View childAt4 = getChildAt(i47);
                m mVar7 = (m) childAt4.getLayoutParams();
                if (mVar7.f10841f) {
                    i15 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((mVar7.f10837b * i22) + mVar7.f10838c, 1073741824), i15);
                } else {
                    i15 = i42;
                }
                i47++;
                i42 = i15;
            }
        }
        setMeasuredDimension(i29, mode != 1073741824 ? i13 : i30);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1505z.f10816w = z10;
    }

    public void setOnMenuItemClickListener(n nVar) {
        this.G = nVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        l.k kVar = this.f1505z;
        l.j jVar = kVar.f10808o;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
        } else {
            kVar.f10810q = true;
            kVar.f10809p = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
    }

    public void setPopupTheme(int i10) {
        if (this.f1504y != i10) {
            this.f1504y = i10;
            if (i10 == 0) {
                this.f1503x = getContext();
            } else {
                this.f1503x = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(l.k kVar) {
        this.f1505z = kVar;
        kVar.f10807n = this;
        this.f1502w = kVar.f10803c;
    }

    @Override // l.g1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m(getContext(), attributeSet);
    }
}
