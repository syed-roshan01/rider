package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.ride.accepter.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k implements k.s {
    public h A;
    public g B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f10802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k.l f10803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f10804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k.r f10805e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ActionMenuView f10807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f10808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f10809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10814u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10815v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10816w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f10818y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f f10819z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10806f = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f10817x = new SparseBooleanArray();
    public final k.f C = new k.f(this, 2);

    public k(Context context) {
        this.f10801a = context;
        this.f10804d = LayoutInflater.from(context);
    }

    @Override // k.s
    public final /* bridge */ /* synthetic */ boolean a(k.m mVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.s
    public final boolean b(k.w wVar) {
        boolean z10;
        if (!wVar.hasVisibleItems()) {
            return false;
        }
        k.w wVar2 = wVar;
        while (true) {
            k.l lVar = wVar2.f8706v;
            if (lVar == this.f10803c) {
                break;
            }
            wVar2 = (k.w) lVar;
        }
        ActionMenuView actionMenuView = this.f10807n;
        View view = null;
        view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = actionMenuView.getChildAt(i10);
                if ((childAt instanceof k.t) && ((k.t) childAt).getItemData() == wVar2.f8707w) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        wVar.f8707w.getClass();
        int size = wVar.f8633f.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z10 = false;
                break;
            }
            MenuItem item = wVar.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i11++;
        }
        f fVar = new f(this, this.f10802b, wVar, view);
        this.f10819z = fVar;
        fVar.f8683h = z10;
        k.n nVar = fVar.f8685j;
        if (nVar != null) {
            nVar.o(z10);
        }
        f fVar2 = this.f10819z;
        if (!fVar2.b()) {
            if (fVar2.f8681f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            fVar2.d(0, 0, false, false);
        }
        k.r rVar = this.f10805e;
        if (rVar != null) {
            rVar.h(wVar);
        }
        return true;
    }

    @Override // k.s
    public final void c(k.l lVar, boolean z10) {
        g();
        f fVar = this.f10819z;
        if (fVar != null && fVar.b()) {
            fVar.f8685j.dismiss();
        }
        k.r rVar = this.f10805e;
        if (rVar != null) {
            rVar.c(lVar, z10);
        }
    }

    @Override // k.s
    public final /* bridge */ /* synthetic */ boolean d(k.m mVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View e(k.m mVar, View view, ViewGroup viewGroup) {
        View view2 = mVar.f8673z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || mVar.c()) {
            k.t tVar = view instanceof k.t ? (k.t) view : (k.t) this.f10804d.inflate(this.f10806f, viewGroup, false);
            tVar.a(mVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) tVar;
            actionMenuItemView.setItemInvoker(this.f10807n);
            if (this.B == null) {
                this.B = new g(this);
            }
            actionMenuItemView.setPopupCallback(this.B);
            view2 = (View) tVar;
        }
        view2.setVisibility(mVar.B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.s
    public final void f() {
        int size;
        int i10;
        ViewGroup viewGroup = this.f10807n;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            k.l lVar = this.f10803c;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListK = this.f10803c.k();
                int size2 = arrayListK.size();
                i10 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    k.m mVar = (k.m) arrayListK.get(i11);
                    if (mVar.d()) {
                        View childAt = viewGroup.getChildAt(i10);
                        k.m itemData = childAt instanceof k.t ? ((k.t) childAt).getItemData() : null;
                        View viewE = e(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
                            viewE.setPressed(false);
                            viewE.jumpDrawablesToCurrentState();
                        }
                        if (viewE != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewE.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewE);
                            }
                            this.f10807n.addView(viewE, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f10808o) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        this.f10807n.requestLayout();
        k.l lVar2 = this.f10803c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f8636i;
            int size3 = arrayList2.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((k.m) arrayList2.get(i12)).getClass();
            }
        }
        k.l lVar3 = this.f10803c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f8637j;
        }
        if (!this.f10811r || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((k.m) arrayList.get(0)).B))) {
            j jVar = this.f10808o;
            if (jVar != null) {
                ViewParent parent = jVar.getParent();
                ActionMenuView actionMenuView = this.f10807n;
                if (parent == actionMenuView) {
                    actionMenuView.removeView(this.f10808o);
                }
            }
        } else {
            if (this.f10808o == null) {
                this.f10808o = new j(this, this.f10801a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f10808o.getParent();
            if (viewGroup3 != this.f10807n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f10808o);
                }
                ActionMenuView actionMenuView2 = this.f10807n;
                j jVar2 = this.f10808o;
                actionMenuView2.getClass();
                m mVarH = ActionMenuView.h();
                mVarH.f10836a = true;
                actionMenuView2.addView(jVar2, mVarH);
            }
        }
        this.f10807n.setOverflowReserved(this.f10811r);
    }

    public final boolean g() {
        ActionMenuView actionMenuView;
        h hVar = this.A;
        if (hVar != null && (actionMenuView = this.f10807n) != null) {
            actionMenuView.removeCallbacks(hVar);
            this.A = null;
            return true;
        }
        f fVar = this.f10818y;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.f8685j.dismiss();
        }
        return true;
    }

    @Override // k.s
    public final void h(k.r rVar) {
        this.f10805e = rVar;
    }

    @Override // k.s
    public final void i(Context context, k.l lVar) {
        this.f10802b = context;
        LayoutInflater.from(context);
        this.f10803c = lVar;
        Resources resources = context.getResources();
        if (!this.f10812s) {
            this.f10811r = true;
        }
        int i10 = 2;
        this.f10813t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f10815v = i10;
        int measuredWidth = this.f10813t;
        if (this.f10811r) {
            if (this.f10808o == null) {
                j jVar = new j(this, this.f10801a);
                this.f10808o = jVar;
                if (this.f10810q) {
                    jVar.setImageDrawable(this.f10809p);
                    this.f10809p = null;
                    this.f10810q = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f10808o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f10808o.getMeasuredWidth();
        } else {
            this.f10808o = null;
        }
        this.f10814u = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // k.s
    public final boolean j() {
        int size;
        ArrayList arrayListK;
        int i10;
        boolean z10;
        k.l lVar = this.f10803c;
        if (lVar != null) {
            arrayListK = lVar.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i11 = this.f10815v;
        int i12 = this.f10814u;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f10807n;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            k.m mVar = (k.m) arrayListK.get(i13);
            int i16 = mVar.f8672y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (this.f10816w && mVar.B) {
                i11 = 0;
            }
            i13++;
        }
        if (this.f10811r && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = this.f10817x;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            k.m mVar2 = (k.m) arrayListK.get(i18);
            int i20 = mVar2.f8672y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = mVar2.f8649b;
            if (z12) {
                View viewE = e(mVar2, null, actionMenuView);
                viewE.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewE.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                mVar2.e(z10);
            } else {
                if ((i20 & 1) == z10) {
                    boolean z13 = sparseBooleanArray.get(i21);
                    boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                    if (z14) {
                        View viewE2 = e(mVar2, null, actionMenuView);
                        viewE2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewE2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z14 &= i12 + i19 > 0;
                    }
                    if (z14 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            k.m mVar3 = (k.m) arrayListK.get(i22);
                            if (mVar3.f8649b == i21) {
                                if (mVar3.d()) {
                                    i17++;
                                }
                                mVar3.e(false);
                            }
                        }
                    }
                    if (z14) {
                        i17--;
                    }
                    mVar2.e(z14);
                } else {
                    mVar2.e(false);
                }
                i18++;
                i10 = 2;
                z10 = true;
            }
            i18++;
            i10 = 2;
            z10 = true;
        }
        return z10;
    }

    public final boolean k() {
        f fVar;
        k.l lVar;
        int i10 = 0;
        if (this.f10811r && (((fVar = this.f10818y) == null || !fVar.b()) && (lVar = this.f10803c) != null && this.f10807n != null && this.A == null)) {
            lVar.i();
            if (!lVar.f8637j.isEmpty()) {
                h hVar = new h(i10, this, new f(this, this.f10802b, this.f10803c, this.f10808o));
                this.A = hVar;
                this.f10807n.post(hVar);
                return true;
            }
        }
        return false;
    }
}
