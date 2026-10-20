package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.r0;
import b3.b0;
import b3.c0;
import b3.e0;
import b3.h;
import b3.i;
import b3.m;
import b3.o;
import b3.q0;
import com.ride.accepter.R;
import j.e;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k.l;
import l.a3;
import l.b3;
import l.c3;
import l.d3;
import l.e3;
import l.f;
import l.f3;
import l.g3;
import l.h3;
import l.i3;
import l.j0;
import l.j3;
import l.k;
import l.k3;
import l.o3;
import l.s0;
import l.v;
import l.x;
import l.y1;
import l.z2;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements i {
    public y1 A;
    public int B;
    public int C;
    public final int D;
    public CharSequence E;
    public CharSequence F;
    public ColorStateList G;
    public ColorStateList H;
    public boolean I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public final int[] M;
    public final m N;
    public ArrayList O;
    public final b3 P;
    public j3 Q;
    public e3 R;
    public boolean S;
    public OnBackInvokedCallback T;
    public OnBackInvokedDispatcher U;
    public boolean V;
    public final h.a W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f1560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f1561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f1562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f1563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f1564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f1565f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CharSequence f1566n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f1567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f1568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f1569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f1573u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1578z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.D = 8388627;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new int[2];
        this.N = new m(new a3(this, 0));
        this.O = new ArrayList();
        this.P = new b3(this);
        this.W = new h.a(this, 2);
        Context context2 = getContext();
        int[] iArr = f.a.f5584t;
        z2 z2VarI = z2.I(context2, attributeSet, iArr, R.attr.toolbarStyle);
        q0.c(this, context, iArr, attributeSet, (TypedArray) z2VarI.f10984c, R.attr.toolbarStyle);
        this.f1571s = z2VarI.z(28, 0);
        this.f1572t = z2VarI.z(19, 0);
        this.D = ((TypedArray) z2VarI.f10984c).getInteger(0, 8388627);
        this.f1573u = ((TypedArray) z2VarI.f10984c).getInteger(2, 48);
        int iR = z2VarI.r(22, 0);
        iR = z2VarI.D(27) ? z2VarI.r(27, iR) : iR;
        this.f1578z = iR;
        this.f1577y = iR;
        this.f1576x = iR;
        this.f1575w = iR;
        int iR2 = z2VarI.r(25, -1);
        if (iR2 >= 0) {
            this.f1575w = iR2;
        }
        int iR3 = z2VarI.r(24, -1);
        if (iR3 >= 0) {
            this.f1576x = iR3;
        }
        int iR4 = z2VarI.r(26, -1);
        if (iR4 >= 0) {
            this.f1577y = iR4;
        }
        int iR5 = z2VarI.r(23, -1);
        if (iR5 >= 0) {
            this.f1578z = iR5;
        }
        this.f1574v = z2VarI.s(13, -1);
        int iR6 = z2VarI.r(9, Integer.MIN_VALUE);
        int iR7 = z2VarI.r(5, Integer.MIN_VALUE);
        int iS = z2VarI.s(7, 0);
        int iS2 = z2VarI.s(8, 0);
        d();
        y1 y1Var = this.A;
        y1Var.f10979h = false;
        if (iS != Integer.MIN_VALUE) {
            y1Var.f10976e = iS;
            y1Var.f10972a = iS;
        }
        if (iS2 != Integer.MIN_VALUE) {
            y1Var.f10977f = iS2;
            y1Var.f10973b = iS2;
        }
        if (iR6 != Integer.MIN_VALUE || iR7 != Integer.MIN_VALUE) {
            y1Var.a(iR6, iR7);
        }
        this.B = z2VarI.r(10, Integer.MIN_VALUE);
        this.C = z2VarI.r(6, Integer.MIN_VALUE);
        this.f1565f = z2VarI.t(4);
        this.f1566n = z2VarI.C(3);
        CharSequence charSequenceC = z2VarI.C(21);
        if (!TextUtils.isEmpty(charSequenceC)) {
            setTitle(charSequenceC);
        }
        CharSequence charSequenceC2 = z2VarI.C(18);
        if (!TextUtils.isEmpty(charSequenceC2)) {
            setSubtitle(charSequenceC2);
        }
        this.f1569q = getContext();
        setPopupTheme(z2VarI.z(17, 0));
        Drawable drawableT = z2VarI.t(16);
        if (drawableT != null) {
            setNavigationIcon(drawableT);
        }
        CharSequence charSequenceC3 = z2VarI.C(15);
        if (!TextUtils.isEmpty(charSequenceC3)) {
            setNavigationContentDescription(charSequenceC3);
        }
        Drawable drawableT2 = z2VarI.t(11);
        if (drawableT2 != null) {
            setLogo(drawableT2);
        }
        CharSequence charSequenceC4 = z2VarI.C(12);
        if (!TextUtils.isEmpty(charSequenceC4)) {
            setLogoDescription(charSequenceC4);
        }
        if (z2VarI.D(29)) {
            setTitleTextColor(z2VarI.q(29));
        }
        if (z2VarI.D(20)) {
            setSubtitleTextColor(z2VarI.q(20));
        }
        if (z2VarI.D(14)) {
            getMenuInflater().inflate(z2VarI.z(14, 0), getMenu());
        }
        z2VarI.K();
    }

    public static f3 g() {
        f3 f3Var = new f3(-2, -2);
        f3Var.f10737b = 0;
        f3Var.f6419a = 8388627;
        return f3Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new e(getContext());
    }

    public static f3 h(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f3) {
            f3 f3Var = (f3) layoutParams;
            f3 f3Var2 = new f3(f3Var);
            f3Var2.f10737b = 0;
            f3Var2.f10737b = f3Var.f10737b;
            return f3Var2;
        }
        if (layoutParams instanceof g.a) {
            f3 f3Var3 = new f3((g.a) layoutParams);
            f3Var3.f10737b = 0;
            return f3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            f3 f3Var4 = new f3(layoutParams);
            f3Var4.f10737b = 0;
            return f3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        f3 f3Var5 = new f3(marginLayoutParams);
        f3Var5.f10737b = 0;
        ((ViewGroup.MarginLayoutParams) f3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) f3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) f3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) f3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return f3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return h.b(marginLayoutParams) + h.c(marginLayoutParams);
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        Field field = q0.f2670a;
        boolean z10 = c0.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, c0.d(this));
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                f3 f3Var = (f3) childAt.getLayoutParams();
                if (f3Var.f10737b == 0 && s(childAt) && i(f3Var.f6419a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            f3 f3Var2 = (f3) childAt2.getLayoutParams();
            if (f3Var2.f10737b == 0 && s(childAt2) && i(f3Var2.f6419a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    @Override // b3.i
    public final void addMenuProvider(o oVar) {
        m mVar = this.N;
        mVar.f2645b.add(oVar);
        mVar.f2644a.run();
    }

    public final void b(View view, boolean z10) {
        f3 f3VarH;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            f3VarH = g();
        } else {
            f3VarH = !checkLayoutParams(layoutParams) ? h(layoutParams) : (f3) layoutParams;
        }
        f3VarH.f10737b = 1;
        if (!z10 || this.f1568p == null) {
            addView(view, f3VarH);
        } else {
            view.setLayoutParams(f3VarH);
            this.L.add(view);
        }
    }

    public final void c() {
        if (this.f1567o == null) {
            v vVar = new v(getContext());
            this.f1567o = vVar;
            vVar.setImageDrawable(this.f1565f);
            this.f1567o.setContentDescription(this.f1566n);
            f3 f3VarG = g();
            f3VarG.f6419a = (this.f1573u & 112) | 8388611;
            f3VarG.f10737b = 2;
            this.f1567o.setLayoutParams(f3VarG);
            this.f1567o.setOnClickListener(new c3(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof f3);
    }

    public final void d() {
        if (this.A == null) {
            y1 y1Var = new y1();
            y1Var.f10972a = 0;
            y1Var.f10973b = 0;
            y1Var.f10974c = Integer.MIN_VALUE;
            y1Var.f10975d = Integer.MIN_VALUE;
            y1Var.f10976e = 0;
            y1Var.f10977f = 0;
            y1Var.f10978g = false;
            y1Var.f10979h = false;
            this.A = y1Var;
        }
    }

    public final void e() {
        if (this.f1560a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1560a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1570r);
            this.f1560a.setOnMenuItemClickListener(this.P);
            ActionMenuView actionMenuView2 = this.f1560a;
            b3 b3Var = new b3(this);
            actionMenuView2.A = null;
            actionMenuView2.B = b3Var;
            f3 f3VarG = g();
            f3VarG.f6419a = (this.f1573u & 112) | 8388613;
            this.f1560a.setLayoutParams(f3VarG);
            b(this.f1560a, false);
        }
        ActionMenuView actionMenuView3 = this.f1560a;
        if (actionMenuView3.f1502w == null) {
            l lVar = (l) actionMenuView3.getMenu();
            if (this.R == null) {
                this.R = new e3(this);
            }
            this.f1560a.setExpandedActionViewsExclusive(true);
            lVar.b(this.R, this.f1569q);
            t();
        }
    }

    public final void f() {
        if (this.f1563d == null) {
            this.f1563d = new v(getContext());
            f3 f3VarG = g();
            f3VarG.f6419a = (this.f1573u & 112) | 8388611;
            this.f1563d.setLayoutParams(f3VarG);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        v vVar = this.f1567o;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        v vVar = this.f1567o;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        y1 y1Var = this.A;
        if (y1Var != null) {
            return y1Var.f10978g ? y1Var.f10972a : y1Var.f10973b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.C;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        y1 y1Var = this.A;
        if (y1Var != null) {
            return y1Var.f10972a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        y1 y1Var = this.A;
        if (y1Var != null) {
            return y1Var.f10973b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        y1 y1Var = this.A;
        if (y1Var != null) {
            return y1Var.f10978g ? y1Var.f10973b : y1Var.f10972a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.B;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.f1560a;
        return (actionMenuView == null || (lVar = actionMenuView.f1502w) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.C, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = q0.f2670a;
        return c0.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = q0.f2670a;
        return c0.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.B, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        x xVar = this.f1564e;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        x xVar = this.f1564e;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1560a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1563d;
    }

    public CharSequence getNavigationContentDescription() {
        v vVar = this.f1563d;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        v vVar = this.f1563d;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public k getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1560a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1569q;
    }

    public int getPopupTheme() {
        return this.f1570r;
    }

    public CharSequence getSubtitle() {
        return this.F;
    }

    public final TextView getSubtitleTextView() {
        return this.f1562c;
    }

    public CharSequence getTitle() {
        return this.E;
    }

    public int getTitleMarginBottom() {
        return this.f1578z;
    }

    public int getTitleMarginEnd() {
        return this.f1576x;
    }

    public int getTitleMarginStart() {
        return this.f1575w;
    }

    public int getTitleMarginTop() {
        return this.f1577y;
    }

    public final TextView getTitleTextView() {
        return this.f1561b;
    }

    public s0 getWrapper() {
        Drawable drawable;
        if (this.Q == null) {
            j3 j3Var = new j3();
            j3Var.f10799l = 0;
            j3Var.f10788a = this;
            j3Var.f10795h = getTitle();
            j3Var.f10796i = getSubtitle();
            j3Var.f10794g = j3Var.f10795h != null;
            j3Var.f10793f = getNavigationIcon();
            z2 z2VarI = z2.I(getContext(), null, f.a.f5565a, R.attr.actionBarStyle);
            j3Var.f10800m = z2VarI.t(15);
            CharSequence charSequenceC = z2VarI.C(27);
            if (!TextUtils.isEmpty(charSequenceC)) {
                j3Var.f10794g = true;
                j3Var.f10795h = charSequenceC;
                if ((j3Var.f10789b & 8) != 0) {
                    Toolbar toolbar = j3Var.f10788a;
                    toolbar.setTitle(charSequenceC);
                    if (j3Var.f10794g) {
                        q0.e(toolbar.getRootView(), charSequenceC);
                    }
                }
            }
            CharSequence charSequenceC2 = z2VarI.C(25);
            if (!TextUtils.isEmpty(charSequenceC2)) {
                j3Var.f10796i = charSequenceC2;
                if ((j3Var.f10789b & 8) != 0) {
                    setSubtitle(charSequenceC2);
                }
            }
            Drawable drawableT = z2VarI.t(20);
            if (drawableT != null) {
                j3Var.f10792e = drawableT;
                j3Var.c();
            }
            Drawable drawableT2 = z2VarI.t(17);
            if (drawableT2 != null) {
                j3Var.f10791d = drawableT2;
                j3Var.c();
            }
            if (j3Var.f10793f == null && (drawable = j3Var.f10800m) != null) {
                j3Var.f10793f = drawable;
                int i10 = j3Var.f10789b & 4;
                Toolbar toolbar2 = j3Var.f10788a;
                if (i10 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            j3Var.a(z2VarI.v(10, 0));
            int iZ = z2VarI.z(9, 0);
            if (iZ != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(iZ, (ViewGroup) this, false);
                View view = j3Var.f10790c;
                if (view != null && (j3Var.f10789b & 16) != 0) {
                    removeView(view);
                }
                j3Var.f10790c = viewInflate;
                if (viewInflate != null && (j3Var.f10789b & 16) != 0) {
                    addView(viewInflate);
                }
                j3Var.a(j3Var.f10789b | 16);
            }
            int layoutDimension = ((TypedArray) z2VarI.f10984c).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int iR = z2VarI.r(7, -1);
            int iR2 = z2VarI.r(3, -1);
            if (iR >= 0 || iR2 >= 0) {
                int iMax = Math.max(iR, 0);
                int iMax2 = Math.max(iR2, 0);
                d();
                this.A.a(iMax, iMax2);
            }
            int iZ2 = z2VarI.z(28, 0);
            if (iZ2 != 0) {
                Context context = getContext();
                this.f1571s = iZ2;
                j0 j0Var = this.f1561b;
                if (j0Var != null) {
                    j0Var.setTextAppearance(context, iZ2);
                }
            }
            int iZ3 = z2VarI.z(26, 0);
            if (iZ3 != 0) {
                Context context2 = getContext();
                this.f1572t = iZ3;
                j0 j0Var2 = this.f1562c;
                if (j0Var2 != null) {
                    j0Var2.setTextAppearance(context2, iZ3);
                }
            }
            int iZ4 = z2VarI.z(22, 0);
            if (iZ4 != 0) {
                setPopupTheme(iZ4);
            }
            z2VarI.K();
            if (R.string.abc_action_bar_up_description != j3Var.f10799l) {
                j3Var.f10799l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i11 = j3Var.f10799l;
                    j3Var.f10797j = i11 != 0 ? getContext().getString(i11) : null;
                    j3Var.b();
                }
            }
            j3Var.f10797j = getNavigationContentDescription();
            setNavigationOnClickListener(new i3(j3Var));
            this.Q = j3Var;
        }
        return this.Q;
    }

    public final int i(int i10) {
        Field field = q0.f2670a;
        int iD = c0.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, iD) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return iD == 1 ? 5 : 3;
    }

    public final int j(View view, int i10) {
        f3 f3Var = (f3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = f3Var.f6419a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.D & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) f3Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) f3Var).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) f3Var).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.N.f2645b.iterator();
        while (it2.hasNext()) {
            ((r0) ((o) it2.next())).f2015a.i(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.O = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.L.contains(view);
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        f3 f3Var = (f3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) f3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) f3Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.W);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.J = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0281  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293 A[LOOP:0: B:104:0x0291->B:105:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02af A[LOOP:1: B:107:0x02ad->B:108:0x02af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02ce A[LOOP:2: B:110:0x02cc->B:111:0x02ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x030f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0311  */
    /* JADX WARN: Code duplicated, block: B:117:0x0315  */
    /* JADX WARN: Code duplicated, block: B:120:0x031c A[LOOP:3: B:119:0x031a->B:120:0x031c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188  */
    /* JADX WARN: Code duplicated, block: B:74:0x0194  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x0214  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x021f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0223  */
    /* JADX WARN: Code duplicated, block: B:96:0x0236  */
    /* JADX WARN: Code duplicated, block: B:97:0x0259  */
    /* JADX WARN: Code duplicated, block: B:99:0x025c  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        j0 j0Var;
        j0 j0Var2;
        f3 f3Var;
        f3 f3Var2;
        boolean z11;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList;
        int size;
        int iO2;
        int i26;
        int i27;
        int size2;
        int i28;
        int i29;
        int size3;
        int i30;
        int i31;
        int measuredWidth;
        int i32;
        int i33;
        int i34;
        int size4;
        Field field = q0.f2670a;
        boolean z12 = c0.d(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.M;
        iArr[1] = 0;
        iArr[0] = 0;
        int iD = b0.d(this);
        int iMin2 = iD >= 0 ? Math.min(iD, i13 - i11) : 0;
        if (s(this.f1563d)) {
            if (z12) {
                iP = p(this.f1563d, i35, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(this.f1563d, paddingLeft, iMin2, iArr);
            }
            if (s(this.f1567o)) {
                if (z12) {
                    iP = p(this.f1567o, iP, iMin2, iArr);
                } else {
                    iO = o(this.f1567o, iO, iMin2, iArr);
                }
            }
            if (s(this.f1560a)) {
                if (z12) {
                    iO = o(this.f1560a, iO, iMin2, iArr);
                } else {
                    iP = p(this.f1560a, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i35 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i35 - currentContentInsetRight);
            if (s(this.f1568p)) {
                if (z12) {
                    iMin = p(this.f1568p, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f1568p, iMax, iMin2, iArr);
                }
            }
            if (s(this.f1564e)) {
                if (z12) {
                    iMin = p(this.f1564e, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f1564e, iMax, iMin2, iArr);
                }
            }
            zS = s(this.f1561b);
            zS2 = s(this.f1562c);
            if (zS) {
                f3 f3Var3 = (f3) this.f1561b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) f3Var3).bottomMargin + this.f1561b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) f3Var3).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                f3 f3Var4 = (f3) this.f1562c.getLayoutParams();
                measuredHeight += this.f1562c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) f3Var4).topMargin + ((ViewGroup.MarginLayoutParams) f3Var4).bottomMargin;
            }
            if (!zS || zS2) {
                if (zS) {
                    j0Var = this.f1561b;
                } else {
                    j0Var = this.f1562c;
                }
                if (zS2) {
                    j0Var2 = this.f1562c;
                } else {
                    j0Var2 = this.f1561b;
                }
                f3Var = (f3) j0Var.getLayoutParams();
                f3Var2 = (f3) j0Var2.getLayoutParams();
                z11 = (!zS && this.f1561b.getMeasuredWidth() > 0) || (zS2 && this.f1562c.getMeasuredWidth() > 0);
                i14 = this.D & 112;
                i15 = paddingLeft;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) f3Var).topMargin + this.f1577y;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i22 = ((ViewGroup.MarginLayoutParams) f3Var).topMargin + this.f1577y;
                    if (iMax2 < i22) {
                        iMax2 = i22;
                    } else {
                        i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i24 = ((ViewGroup.MarginLayoutParams) f3Var).bottomMargin;
                        i25 = this.f1578z;
                        if (i23 < i24 + i25) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) f3Var2).bottomMargin + i25) - i23));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) f3Var2).bottomMargin) - this.f1578z) - measuredHeight;
                }
                if (z12) {
                    if (z11) {
                        i19 = this.f1575w;
                    } else {
                        i19 = 0;
                    }
                    int i36 = i19 - iArr[1];
                    iMin -= Math.max(0, i36);
                    iArr[1] = Math.max(0, -i36);
                    if (zS) {
                        f3 f3Var5 = (f3) this.f1561b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f1561b.getMeasuredWidth();
                        int measuredHeight2 = this.f1561b.getMeasuredHeight() + paddingTop;
                        this.f1561b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth2 - this.f1576x;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) f3Var5).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zS2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f3) this.f1562c.getLayoutParams())).topMargin;
                        this.f1562c.layout(iMin - this.f1562c.getMeasuredWidth(), i37, iMin, this.f1562c.getMeasuredHeight() + i37);
                        i21 = iMin - this.f1576x;
                    } else {
                        i21 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i20, i21);
                    }
                } else {
                    if (z11) {
                        i16 = this.f1575w;
                    } else {
                        i16 = 0;
                    }
                    int i38 = i16 - iArr[0];
                    iMax += Math.max(0, i38);
                    iArr[0] = Math.max(0, -i38);
                    if (zS) {
                        f3 f3Var6 = (f3) this.f1561b.getLayoutParams();
                        int measuredWidth3 = this.f1561b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1561b.getMeasuredHeight() + paddingTop;
                        this.f1561b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i17 = measuredWidth3 + this.f1576x;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) f3Var6).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zS2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f3) this.f1562c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f1562c.getMeasuredWidth() + iMax;
                        this.f1562c.layout(iMax, i39, measuredWidth4, this.f1562c.getMeasuredHeight() + i39);
                        i18 = measuredWidth4 + this.f1576x;
                    } else {
                        i18 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i17, i18);
                    }
                }
            } else {
                i15 = paddingLeft;
                iMin2 = iMin2;
            }
            arrayList = this.K;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax;
            for (i26 = 0; i26 < size; i26++) {
                iO2 = o((View) arrayList.get(i26), iO2, iMin2, iArr);
            }
            i27 = iMin2;
            a(5, arrayList);
            size2 = arrayList.size();
            for (i28 = 0; i28 < size2; i28++) {
                iMin = p((View) arrayList.get(i28), iMin, i27, iArr);
            }
            a(1, arrayList);
            int i40 = iArr[0];
            i29 = iArr[1];
            size3 = arrayList.size();
            i30 = i40;
            i31 = 0;
            measuredWidth = 0;
            while (i31 < size3) {
                View view = (View) arrayList.get(i31);
                f3 f3Var7 = (f3) view.getLayoutParams();
                int i41 = ((ViewGroup.MarginLayoutParams) f3Var7).leftMargin - i30;
                int i42 = ((ViewGroup.MarginLayoutParams) f3Var7).rightMargin - i29;
                int iMax3 = Math.max(0, i41);
                int iMax4 = Math.max(0, i42);
                int iMax5 = Math.max(0, -i41);
                int iMax6 = Math.max(0, -i42);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i31++;
                i29 = iMax6;
                i30 = iMax5;
            }
            i33 = ((((width - i15) - paddingRight) / 2) + i15) - (measuredWidth / 2);
            i34 = measuredWidth + i33;
            if (i33 >= iO2) {
                if (i34 > iMin) {
                    iO2 = i33 - (i34 - iMin);
                } else {
                    iO2 = i33;
                }
            }
            size4 = arrayList.size();
            for (i32 = 0; i32 < size4; i32++) {
                iO2 = o((View) arrayList.get(i32), iO2, i27, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i35;
        if (s(this.f1567o)) {
            if (z12) {
                iP = p(this.f1567o, iP, iMin2, iArr);
            } else {
                iO = o(this.f1567o, iO, iMin2, iArr);
            }
        }
        if (s(this.f1560a)) {
            if (z12) {
                iO = o(this.f1560a, iO, iMin2, iArr);
            } else {
                iP = p(this.f1560a, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i35 - currentContentInsetRight2);
        if (s(this.f1568p)) {
            if (z12) {
                iMin = p(this.f1568p, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f1568p, iMax, iMin2, iArr);
            }
        }
        if (s(this.f1564e)) {
            if (z12) {
                iMin = p(this.f1564e, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f1564e, iMax, iMin2, iArr);
            }
        }
        zS = s(this.f1561b);
        zS2 = s(this.f1562c);
        if (zS) {
            f3 f3Var8 = (f3) this.f1561b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) f3Var8).bottomMargin + this.f1561b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) f3Var8).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            f3 f3Var9 = (f3) this.f1562c.getLayoutParams();
            measuredHeight += this.f1562c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) f3Var9).topMargin + ((ViewGroup.MarginLayoutParams) f3Var9).bottomMargin;
        }
        if (zS) {
            if (zS) {
                j0Var = this.f1561b;
            } else {
                j0Var = this.f1562c;
            }
            if (zS2) {
                j0Var2 = this.f1562c;
            } else {
                j0Var2 = this.f1561b;
            }
            f3Var = (f3) j0Var.getLayoutParams();
            f3Var2 = (f3) j0Var2.getLayoutParams();
            if (zS) {
            }
            i14 = this.D & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) f3Var).topMargin + this.f1577y;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) f3Var).topMargin + this.f1577y;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) f3Var).bottomMargin;
                    i25 = this.f1578z;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) f3Var2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) f3Var2).bottomMargin) - this.f1578z) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i19 = this.f1575w;
                } else {
                    i19 = 0;
                }
                int i310 = i19 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zS) {
                    f3 f3Var10 = (f3) this.f1561b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f1561b.getMeasuredWidth();
                    int measuredHeight4 = this.f1561b.getMeasuredHeight() + paddingTop;
                    this.f1561b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth5 - this.f1576x;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) f3Var10).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zS2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f3) this.f1562c.getLayoutParams())).topMargin;
                    this.f1562c.layout(iMin - this.f1562c.getMeasuredWidth(), i311, iMin, this.f1562c.getMeasuredHeight() + i311);
                    i21 = iMin - this.f1576x;
                } else {
                    i21 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i20, i21);
                }
            } else {
                if (z11) {
                    i16 = this.f1575w;
                } else {
                    i16 = 0;
                }
                int i312 = i16 - iArr[0];
                iMax += Math.max(0, i312);
                iArr[0] = Math.max(0, -i312);
                if (zS) {
                    f3 f3Var11 = (f3) this.f1561b.getLayoutParams();
                    int measuredWidth6 = this.f1561b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1561b.getMeasuredHeight() + paddingTop;
                    this.f1561b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i17 = measuredWidth6 + this.f1576x;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) f3Var11).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zS2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f3) this.f1562c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f1562c.getMeasuredWidth() + iMax;
                    this.f1562c.layout(iMax, i313, measuredWidth7, this.f1562c.getMeasuredHeight() + i313);
                    i18 = measuredWidth7 + this.f1576x;
                } else {
                    i18 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i17, i18);
                }
            }
        } else {
            if (zS) {
                j0Var = this.f1561b;
            } else {
                j0Var = this.f1562c;
            }
            if (zS2) {
                j0Var2 = this.f1562c;
            } else {
                j0Var2 = this.f1561b;
            }
            f3Var = (f3) j0Var.getLayoutParams();
            f3Var2 = (f3) j0Var2.getLayoutParams();
            if (zS) {
            }
            i14 = this.D & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) f3Var).topMargin + this.f1577y;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) f3Var).topMargin + this.f1577y;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) f3Var).bottomMargin;
                    i25 = this.f1578z;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) f3Var2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) f3Var2).bottomMargin) - this.f1578z) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i19 = this.f1575w;
                } else {
                    i19 = 0;
                }
                int i314 = i19 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zS) {
                    f3 f3Var12 = (f3) this.f1561b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f1561b.getMeasuredWidth();
                    int measuredHeight6 = this.f1561b.getMeasuredHeight() + paddingTop;
                    this.f1561b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth8 - this.f1576x;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) f3Var12).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zS2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f3) this.f1562c.getLayoutParams())).topMargin;
                    this.f1562c.layout(iMin - this.f1562c.getMeasuredWidth(), i315, iMin, this.f1562c.getMeasuredHeight() + i315);
                    i21 = iMin - this.f1576x;
                } else {
                    i21 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i20, i21);
                }
            } else {
                if (z11) {
                    i16 = this.f1575w;
                } else {
                    i16 = 0;
                }
                int i316 = i16 - iArr[0];
                iMax += Math.max(0, i316);
                iArr[0] = Math.max(0, -i316);
                if (zS) {
                    f3 f3Var13 = (f3) this.f1561b.getLayoutParams();
                    int measuredWidth9 = this.f1561b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1561b.getMeasuredHeight() + paddingTop;
                    this.f1561b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i17 = measuredWidth9 + this.f1576x;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) f3Var13).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zS2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f3) this.f1562c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f1562c.getMeasuredWidth() + iMax;
                    this.f1562c.layout(iMax, i317, measuredWidth10, this.f1562c.getMeasuredHeight() + i317);
                    i18 = measuredWidth10 + this.f1576x;
                } else {
                    i18 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i17, i18);
                }
            }
        }
        arrayList = this.K;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax;
        while (i26 < size) {
            iO2 = o((View) arrayList.get(i26), iO2, iMin2, iArr);
        }
        i27 = iMin2;
        a(5, arrayList);
        size2 = arrayList.size();
        while (i28 < size2) {
            iMin = p((View) arrayList.get(i28), iMin, i27, iArr);
        }
        a(1, arrayList);
        int i43 = iArr[0];
        i29 = iArr[1];
        size3 = arrayList.size();
        i30 = i43;
        i31 = 0;
        measuredWidth = 0;
        while (i31 < size3) {
            View view2 = (View) arrayList.get(i31);
            f3 f3Var14 = (f3) view2.getLayoutParams();
            int i44 = ((ViewGroup.MarginLayoutParams) f3Var14).leftMargin - i30;
            int i45 = ((ViewGroup.MarginLayoutParams) f3Var14).rightMargin - i29;
            int iMax7 = Math.max(0, i44);
            int iMax8 = Math.max(0, i45);
            int iMax9 = Math.max(0, -i44);
            int iMax10 = Math.max(0, -i45);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i31++;
            i29 = iMax10;
            i30 = iMax9;
        }
        i33 = ((((width - i15) - paddingRight) / 2) + i15) - (measuredWidth / 2);
        i34 = measuredWidth + i33;
        if (i33 >= iO2) {
            if (i34 > iMin) {
                iO2 = i33 - (i34 - iMin);
            } else {
                iO2 = i33;
            }
        }
        size4 = arrayList.size();
        while (i32 < size4) {
            iO2 = o((View) arrayList.get(i32), iO2, i27, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = o3.a(this);
        int i12 = !zA ? 1 : 0;
        int i13 = 0;
        if (s(this.f1563d)) {
            r(this.f1563d, i10, 0, i11, this.f1574v);
            iK = k(this.f1563d) + this.f1563d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f1563d) + this.f1563d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1563d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.f1567o)) {
            r(this.f1567o, i10, 0, i11, this.f1574v);
            iK = k(this.f1567o) + this.f1567o.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f1567o) + this.f1567o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1567o.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.M;
        iArr[zA ? 1 : 0] = iMax4;
        if (s(this.f1560a)) {
            r(this.f1560a, i10, iMax3, i11, this.f1574v);
            iK2 = k(this.f1560a) + this.f1560a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f1560a) + this.f1560a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1560a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = Math.max(currentContentInsetEnd, iK2) + iMax3;
        iArr[i12] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.f1568p)) {
            iMax5 += q(this.f1568p, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f1568p) + this.f1568p.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1568p.getMeasuredState());
        }
        if (s(this.f1564e)) {
            iMax5 += q(this.f1564e, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f1564e) + this.f1564e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1564e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((f3) childAt.getLayoutParams()).f10737b == 0 && s(childAt)) {
                iMax5 += q(childAt, i10, iMax5, i11, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i15 = this.f1577y + this.f1578z;
        int i16 = this.f1575w + this.f1576x;
        if (s(this.f1561b)) {
            q(this.f1561b, i10, iMax5 + i16, i11, i15, iArr);
            int iK3 = k(this.f1561b) + this.f1561b.getMeasuredWidth();
            iL = l(this.f1561b) + this.f1561b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1561b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.f1562c)) {
            iMax2 = Math.max(iMax2, q(this.f1562c, i10, iMax5 + i16, i11, iL + i15, iArr));
            iL += l(this.f1562c) + this.f1562c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1562c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.S) {
            i13 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i13 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof h3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h3 h3Var = (h3) parcelable;
        super.onRestoreInstanceState(h3Var.f7543a);
        ActionMenuView actionMenuView = this.f1560a;
        l lVar = actionMenuView != null ? actionMenuView.f1502w : null;
        int i10 = h3Var.f10772c;
        if (i10 != 0 && this.R != null && lVar != null && (menuItemFindItem = lVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (h3Var.f10773d) {
            h.a aVar = this.W;
            removeCallbacks(aVar);
            post(aVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        y1 y1Var = this.A;
        boolean z10 = i10 == 1;
        if (z10 == y1Var.f10978g) {
            return;
        }
        y1Var.f10978g = z10;
        if (!y1Var.f10979h) {
            y1Var.f10972a = y1Var.f10976e;
            y1Var.f10973b = y1Var.f10977f;
            return;
        }
        if (z10) {
            int i11 = y1Var.f10975d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = y1Var.f10976e;
            }
            y1Var.f10972a = i11;
            int i12 = y1Var.f10974c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = y1Var.f10977f;
            }
            y1Var.f10973b = i12;
            return;
        }
        int i13 = y1Var.f10974c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = y1Var.f10976e;
        }
        y1Var.f10972a = i13;
        int i14 = y1Var.f10975d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = y1Var.f10977f;
        }
        y1Var.f10973b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar;
        f fVar;
        k.m mVar;
        h3 h3Var = new h3(super.onSaveInstanceState());
        e3 e3Var = this.R;
        if (e3Var != null && (mVar = e3Var.f10732b) != null) {
            h3Var.f10772c = mVar.f8648a;
        }
        ActionMenuView actionMenuView = this.f1560a;
        h3Var.f10773d = (actionMenuView == null || (kVar = actionMenuView.f1505z) == null || (fVar = kVar.f10818y) == null || !fVar.b()) ? false : true;
        return h3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int[] iArr) {
        f3 f3Var = (f3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) f3Var).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) f3Var).leftMargin);
    }

    public final int q(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // b3.i
    public final void removeMenuProvider(o oVar) {
        this.N.b(oVar);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            t();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(d0.C(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.S = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.C) {
            this.C = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.B) {
            this.B = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(d0.C(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(d0.C(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1563d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(g3 g3Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1560a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1570r != i10) {
            this.f1570r = i10;
            if (i10 == 0) {
                this.f1569q = getContext();
            } else {
                this.f1569q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1578z = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1576x = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1575w = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1577y = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public final void t() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = d3.a(this);
            e3 e3Var = this.R;
            int i10 = 1;
            if (e3Var == null || e3Var.f10732b == null || onBackInvokedDispatcherA == null) {
                z10 = false;
            } else {
                Field field = q0.f2670a;
                if (e0.b(this) && this.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10 && this.U == null) {
                if (this.T == null) {
                    this.T = d3.b(new a3(this, i10));
                }
                d3.c(onBackInvokedDispatcherA, this.T);
                this.U = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.U) == null) {
                return;
            }
            d3.d(onBackInvokedDispatcher, this.T);
            this.U = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f3 f3Var = new f3(context, attributeSet);
        f3Var.f6419a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5566b);
        f3Var.f6419a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        f3Var.f10737b = 0;
        return f3Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        v vVar = this.f1567o;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1567o.setImageDrawable(drawable);
        } else {
            v vVar = this.f1567o;
            if (vVar != null) {
                vVar.setImageDrawable(this.f1565f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1564e == null) {
                this.f1564e = new x(getContext(), 0);
            }
            if (!n(this.f1564e)) {
                b(this.f1564e, true);
            }
        } else {
            x xVar = this.f1564e;
            if (xVar != null && n(xVar)) {
                removeView(this.f1564e);
                this.L.remove(this.f1564e);
            }
        }
        x xVar2 = this.f1564e;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1564e == null) {
            this.f1564e = new x(getContext(), 0);
        }
        x xVar = this.f1564e;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        v vVar = this.f1563d;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
            k3.a(this.f1563d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!n(this.f1563d)) {
                b(this.f1563d, true);
            }
        } else {
            v vVar = this.f1563d;
            if (vVar != null && n(vVar)) {
                removeView(this.f1563d);
                this.L.remove(this.f1563d);
            }
        }
        v vVar2 = this.f1563d;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            j0 j0Var = this.f1562c;
            if (j0Var != null && n(j0Var)) {
                removeView(this.f1562c);
                this.L.remove(this.f1562c);
            }
        } else {
            if (this.f1562c == null) {
                Context context = getContext();
                j0 j0Var2 = new j0(context, null);
                this.f1562c = j0Var2;
                j0Var2.setSingleLine();
                this.f1562c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1572t;
                if (i10 != 0) {
                    this.f1562c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.f1562c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f1562c)) {
                b(this.f1562c, true);
            }
        }
        j0 j0Var3 = this.f1562c;
        if (j0Var3 != null) {
            j0Var3.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        j0 j0Var = this.f1562c;
        if (j0Var != null) {
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            j0 j0Var = this.f1561b;
            if (j0Var != null && n(j0Var)) {
                removeView(this.f1561b);
                this.L.remove(this.f1561b);
            }
        } else {
            if (this.f1561b == null) {
                Context context = getContext();
                j0 j0Var2 = new j0(context, null);
                this.f1561b = j0Var2;
                j0Var2.setSingleLine();
                this.f1561b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1571s;
                if (i10 != 0) {
                    this.f1561b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.f1561b.setTextColor(colorStateList);
                }
            }
            if (!n(this.f1561b)) {
                b(this.f1561b, true);
            }
        }
        j0 j0Var3 = this.f1561b;
        if (j0Var3 != null) {
            j0Var3.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        j0 j0Var = this.f1561b;
        if (j0Var != null) {
            j0Var.setTextColor(colorStateList);
        }
    }
}
