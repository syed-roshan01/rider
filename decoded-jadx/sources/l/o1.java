package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 implements k.u {
    public static final Method D;
    public static final Method E;
    public Rect A;
    public boolean B;
    public final y C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f10867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t1 f10868c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10871f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10874p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l1 f10876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f10877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AdapterView.OnItemClickListener f10878t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Handler f10883y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10869d = -2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10875q = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h1 f10879u = new h1(this, 2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n1 f10880v = new n1(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m1 f10881w = new m1(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f10882x = new h1(this, 1);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f10884z = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                D = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                E = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public o1(Context context, int i10, int i11) {
        int resourceId;
        this.f10866a = context;
        this.f10883y = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f5575k, i10, i11);
        this.f10870e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f10871f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f10872n = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        y yVar = new y(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, f.a.f5579o, i10, i11);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            e3.l.c(yVar, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : o7.d0.C(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.C = yVar;
        yVar.setInputMethodMode(1);
    }

    public final void a(k.i iVar) {
        l1 l1Var = this.f10876r;
        if (l1Var == null) {
            this.f10876r = new l1(this, 0);
        } else {
            ListAdapter listAdapter = this.f10867b;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(l1Var);
            }
        }
        this.f10867b = iVar;
        if (iVar != null) {
            iVar.registerDataSetObserver(this.f10876r);
        }
        t1 t1Var = this.f10868c;
        if (t1Var != null) {
            t1Var.setAdapter(this.f10867b);
        }
    }

    @Override // k.u
    public final void dismiss() {
        y yVar = this.C;
        yVar.dismiss();
        yVar.setContentView(null);
        this.f10868c = null;
        this.f10883y.removeCallbacks(this.f10879u);
    }

    @Override // k.u
    public final void e() {
        int i10;
        int iMakeMeasureSpec;
        t1 t1Var;
        t1 t1Var2 = this.f10868c;
        y yVar = this.C;
        Context context = this.f10866a;
        int i11 = 0;
        if (t1Var2 == null) {
            t1 t1Var3 = new t1(context, !this.B);
            t1Var3.setHoverListener((u1) this);
            this.f10868c = t1Var3;
            t1Var3.setAdapter(this.f10867b);
            this.f10868c.setOnItemClickListener(this.f10878t);
            this.f10868c.setFocusable(true);
            this.f10868c.setFocusableInTouchMode(true);
            this.f10868c.setOnItemSelectedListener(new i1(this, i11));
            this.f10868c.setOnScrollListener(this.f10881w);
            yVar.setContentView(this.f10868c);
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.f10884z;
        if (background != null) {
            background.getPadding(rect);
            int i12 = rect.top;
            i10 = rect.bottom + i12;
            if (!this.f10872n) {
                this.f10871f = -i12;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iA = j1.a(yVar, this.f10877s, this.f10871f, yVar.getInputMethodMode() == 2);
        int i13 = this.f10869d;
        if (i13 != -2) {
            iMakeMeasureSpec = i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int iA2 = this.f10868c.a(iMakeMeasureSpec, iA);
        int paddingBottom = iA2 + (iA2 > 0 ? this.f10868c.getPaddingBottom() + this.f10868c.getPaddingTop() + i10 : 0);
        this.C.getInputMethodMode();
        e3.l.d(yVar, 1002);
        if (yVar.isShowing()) {
            View view = this.f10877s;
            Field field = b3.q0.f2670a;
            if (b3.e0.b(view)) {
                int width = this.f10869d;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f10877s.getWidth();
                }
                yVar.setOutsideTouchable(true);
                View view2 = this.f10877s;
                int i14 = this.f10870e;
                int i15 = this.f10871f;
                int i16 = width < 0 ? -1 : width;
                if (paddingBottom < 0) {
                    paddingBottom = -1;
                }
                yVar.update(view2, i14, i15, i16, paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f10869d;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f10877s.getWidth();
        }
        yVar.setWidth(width2);
        yVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = D;
            if (method != null) {
                try {
                    method.invoke(yVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            k1.b(yVar, true);
        }
        yVar.setOutsideTouchable(true);
        yVar.setTouchInterceptor(this.f10880v);
        if (this.f10874p) {
            e3.l.c(yVar, this.f10873o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = E;
            if (method2 != null) {
                try {
                    method2.invoke(yVar, this.A);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            k1.a(yVar, this.A);
        }
        e3.k.a(yVar, this.f10877s, this.f10870e, this.f10871f, this.f10875q);
        this.f10868c.setSelection(-1);
        if ((!this.B || this.f10868c.isInTouchMode()) && (t1Var = this.f10868c) != null) {
            t1Var.setListSelectionHidden(true);
            t1Var.requestLayout();
        }
        if (this.B) {
            return;
        }
        this.f10883y.post(this.f10882x);
    }

    @Override // k.u
    public final ListView g() {
        return this.f10868c;
    }

    @Override // k.u
    public final boolean k() {
        return this.C.isShowing();
    }
}
