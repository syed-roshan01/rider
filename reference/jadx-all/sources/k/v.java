package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import b3.c0;
import b3.q0;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import l.t1;
import l.u1;

/* JADX INFO: loaded from: classes.dex */
public final class v extends n implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A = 0;
    public boolean B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f8689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f8690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8692f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u1 f8695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f8696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f8697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f8699t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f8700u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r f8701v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewTreeObserver f8702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8704y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8705z;

    public v(int i10, int i11, Context context, View view, l lVar, boolean z10) {
        int i12 = 1;
        this.f8696q = new c(this, i12);
        this.f8697r = new d(this, i12);
        this.f8688b = context;
        this.f8689c = lVar;
        this.f8691e = z10;
        this.f8690d = new i(lVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f8693n = i10;
        this.f8694o = i11;
        Resources resources = context.getResources();
        this.f8692f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8699t = view;
        this.f8695p = new u1(context, i10, i11);
        lVar.b(this, context);
    }

    @Override // k.s
    public final boolean b(w wVar) {
        if (wVar.hasVisibleItems()) {
            q qVar = new q(this.f8693n, this.f8694o, this.f8688b, this.f8700u, wVar, this.f8691e);
            r rVar = this.f8701v;
            qVar.f8684i = rVar;
            n nVar = qVar.f8685j;
            if (nVar != null) {
                nVar.h(rVar);
            }
            boolean zU = n.u(wVar);
            qVar.f8683h = zU;
            n nVar2 = qVar.f8685j;
            if (nVar2 != null) {
                nVar2.o(zU);
            }
            qVar.f8686k = this.f8698s;
            this.f8698s = null;
            this.f8689c.c(false);
            u1 u1Var = this.f8695p;
            int width = u1Var.f10870e;
            int i10 = !u1Var.f10872n ? 0 : u1Var.f10871f;
            int i11 = this.A;
            View view = this.f8699t;
            Field field = q0.f2670a;
            if ((Gravity.getAbsoluteGravity(i11, c0.d(view)) & 7) == 5) {
                width += this.f8699t.getWidth();
            }
            if (!qVar.b()) {
                if (qVar.f8681f != null) {
                    qVar.d(width, i10, true, true);
                }
            }
            r rVar2 = this.f8701v;
            if (rVar2 != null) {
                rVar2.h(wVar);
            }
            return true;
        }
        return false;
    }

    @Override // k.s
    public final void c(l lVar, boolean z10) {
        if (lVar != this.f8689c) {
            return;
        }
        dismiss();
        r rVar = this.f8701v;
        if (rVar != null) {
            rVar.c(lVar, z10);
        }
    }

    @Override // k.u
    public final void dismiss() {
        if (k()) {
            this.f8695p.dismiss();
        }
    }

    @Override // k.u
    public final void e() {
        View view;
        if (k()) {
            return;
        }
        if (this.f8703x || (view = this.f8699t) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f8700u = view;
        u1 u1Var = this.f8695p;
        u1Var.C.setOnDismissListener(this);
        u1Var.f10878t = this;
        u1Var.B = true;
        u1Var.C.setFocusable(true);
        View view2 = this.f8700u;
        boolean z10 = this.f8702w == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f8702w = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f8696q);
        }
        view2.addOnAttachStateChangeListener(this.f8697r);
        u1Var.f10877s = view2;
        u1Var.f10875q = this.A;
        boolean z11 = this.f8704y;
        Context context = this.f8688b;
        i iVar = this.f8690d;
        if (!z11) {
            this.f8705z = n.m(iVar, context, this.f8692f);
            this.f8704y = true;
        }
        int i10 = this.f8705z;
        Drawable background = u1Var.C.getBackground();
        if (background != null) {
            Rect rect = u1Var.f10884z;
            background.getPadding(rect);
            u1Var.f10869d = rect.left + rect.right + i10;
        } else {
            u1Var.f10869d = i10;
        }
        u1Var.C.setInputMethodMode(2);
        Rect rect2 = this.f8674a;
        u1Var.A = rect2 != null ? new Rect(rect2) : null;
        u1Var.e();
        t1 t1Var = u1Var.f10868c;
        t1Var.setOnKeyListener(this);
        if (this.B) {
            l lVar = this.f8689c;
            if (lVar.f8639l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) t1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f8639l);
                }
                frameLayout.setEnabled(false);
                t1Var.addHeaderView(frameLayout, null, false);
            }
        }
        u1Var.a(iVar);
        u1Var.e();
    }

    @Override // k.s
    public final void f() {
        this.f8704y = false;
        i iVar = this.f8690d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // k.u
    public final ListView g() {
        return this.f8695p.f10868c;
    }

    @Override // k.s
    public final void h(r rVar) {
        this.f8701v = rVar;
    }

    @Override // k.s
    public final boolean j() {
        return false;
    }

    @Override // k.u
    public final boolean k() {
        return !this.f8703x && this.f8695p.C.isShowing();
    }

    @Override // k.n
    public final void l(l lVar) {
    }

    @Override // k.n
    public final void n(View view) {
        this.f8699t = view;
    }

    @Override // k.n
    public final void o(boolean z10) {
        this.f8690d.f8623c = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f8703x = true;
        this.f8689c.c(true);
        ViewTreeObserver viewTreeObserver = this.f8702w;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8702w = this.f8700u.getViewTreeObserver();
            }
            this.f8702w.removeGlobalOnLayoutListener(this.f8696q);
            this.f8702w = null;
        }
        this.f8700u.removeOnAttachStateChangeListener(this.f8697r);
        PopupWindow.OnDismissListener onDismissListener = this.f8698s;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.n
    public final void p(int i10) {
        this.A = i10;
    }

    @Override // k.n
    public final void q(int i10) {
        this.f8695p.f10870e = i10;
    }

    @Override // k.n
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f8698s = onDismissListener;
    }

    @Override // k.n
    public final void s(boolean z10) {
        this.B = z10;
    }

    @Override // k.n
    public final void t(int i10) {
        u1 u1Var = this.f8695p;
        u1Var.f10871f = i10;
        u1Var.f10872n = true;
    }
}
