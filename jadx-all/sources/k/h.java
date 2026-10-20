package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import b3.c0;
import b3.q0;
import com.ride.accepter.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.q1;
import l.r1;
import l.t1;
import l.u1;
import l.y;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public int B;
    public boolean D;
    public r E;
    public ViewTreeObserver F;
    public PopupWindow.OnDismissListener G;
    public boolean H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8607f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f8608n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f8611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f8612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f8613s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f8616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f8617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8620z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f8609o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f8610p = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8614t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8615u = 0;
    public boolean C = false;

    public h(Context context, View view, int i10, int i11, boolean z10) {
        int i12 = 0;
        this.f8611q = new c(this, i12);
        this.f8612r = new d(this, i12);
        this.f8613s = new f(this, i12);
        this.f8603b = context;
        this.f8616v = view;
        this.f8605d = i10;
        this.f8606e = i11;
        this.f8607f = z10;
        Field field = q0.f2670a;
        this.f8618x = c0.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f8604c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8608n = new Handler();
    }

    @Override // k.s
    public final boolean b(w wVar) {
        for (g gVar : this.f8610p) {
            if (wVar == gVar.f8601b) {
                gVar.f8600a.f10868c.requestFocus();
                return true;
            }
        }
        if (!wVar.hasVisibleItems()) {
            return false;
        }
        l(wVar);
        r rVar = this.E;
        if (rVar != null) {
            rVar.h(wVar);
        }
        return true;
    }

    @Override // k.s
    public final void c(l lVar, boolean z10) {
        ArrayList arrayList = this.f8610p;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((g) arrayList.get(i10)).f8601b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((g) arrayList.get(i11)).f8601b.c(false);
        }
        g gVar = (g) arrayList.remove(i10);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = gVar.f8601b.f8645r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            s sVar = (s) weakReference.get();
            if (sVar == null || sVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z11 = this.H;
        u1 u1Var = gVar.f8600a;
        if (z11) {
            q1.b(u1Var.C, null);
            u1Var.C.setAnimationStyle(0);
        }
        u1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f8618x = ((g) arrayList.get(size2 - 1)).f8602c;
        } else {
            View view = this.f8616v;
            Field field = q0.f2670a;
            this.f8618x = c0.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((g) arrayList.get(0)).f8601b.c(false);
                return;
            }
            return;
        }
        dismiss();
        r rVar = this.E;
        if (rVar != null) {
            rVar.c(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.F.removeGlobalOnLayoutListener(this.f8611q);
            }
            this.F = null;
        }
        this.f8617w.removeOnAttachStateChangeListener(this.f8612r);
        this.G.onDismiss();
    }

    @Override // k.u
    public final void dismiss() {
        ArrayList arrayList = this.f8610p;
        int size = arrayList.size();
        if (size > 0) {
            g[] gVarArr = (g[]) arrayList.toArray(new g[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                g gVar = gVarArr[i10];
                if (gVar.f8600a.C.isShowing()) {
                    gVar.f8600a.dismiss();
                }
            }
        }
    }

    @Override // k.u
    public final void e() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.f8609o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((l) it.next());
        }
        arrayList.clear();
        View view = this.f8616v;
        this.f8617w = view;
        if (view != null) {
            boolean z10 = this.F == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.F = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f8611q);
            }
            this.f8617w.addOnAttachStateChangeListener(this.f8612r);
        }
    }

    @Override // k.s
    public final void f() {
        Iterator it = this.f8610p.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((g) it.next()).f8600a.f10868c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.u
    public final ListView g() {
        ArrayList arrayList = this.f8610p;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((g) a7.a.k(arrayList, 1)).f8600a.f10868c;
    }

    @Override // k.s
    public final void h(r rVar) {
        this.E = rVar;
    }

    @Override // k.s
    public final boolean j() {
        return false;
    }

    @Override // k.u
    public final boolean k() {
        ArrayList arrayList = this.f8610p;
        return arrayList.size() > 0 && ((g) arrayList.get(0)).f8600a.C.isShowing();
    }

    @Override // k.n
    public final void l(l lVar) {
        lVar.b(this, this.f8603b);
        if (k()) {
            v(lVar);
        } else {
            this.f8609o.add(lVar);
        }
    }

    @Override // k.n
    public final void n(View view) {
        if (this.f8616v != view) {
            this.f8616v = view;
            int i10 = this.f8614t;
            Field field = q0.f2670a;
            this.f8615u = Gravity.getAbsoluteGravity(i10, c0.d(view));
        }
    }

    @Override // k.n
    public final void o(boolean z10) {
        this.C = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        g gVar;
        ArrayList arrayList = this.f8610p;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                gVar = null;
                break;
            }
            gVar = (g) arrayList.get(i10);
            if (!gVar.f8600a.C.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (gVar != null) {
            gVar.f8601b.c(false);
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
        if (this.f8614t != i10) {
            this.f8614t = i10;
            View view = this.f8616v;
            Field field = q0.f2670a;
            this.f8615u = Gravity.getAbsoluteGravity(i10, c0.d(view));
        }
    }

    @Override // k.n
    public final void q(int i10) {
        this.f8619y = true;
        this.A = i10;
    }

    @Override // k.n
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.G = onDismissListener;
    }

    @Override // k.n
    public final void s(boolean z10) {
        this.D = z10;
    }

    @Override // k.n
    public final void t(int i10) {
        this.f8620z = true;
        this.B = i10;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Code duplicated, block: B:76:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0192  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:99:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void v(l lVar) {
        g gVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i10;
        y yVar;
        t1 t1Var;
        int[] iArr;
        Rect rect3;
        int i11;
        boolean z10;
        Method method;
        MenuItem item;
        i iVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f8603b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        i iVar2 = new i(lVar, layoutInflaterFrom, this.f8607f, R.layout.abc_cascading_menu_item_layout);
        if (!k() && this.C) {
            iVar2.f8623c = true;
        } else if (k()) {
            iVar2.f8623c = n.u(lVar);
        }
        int iM = n.m(iVar2, context, this.f8604c);
        u1 u1Var = new u1(context, this.f8605d, this.f8606e);
        u1Var.F = this.f8613s;
        u1Var.f10878t = this;
        u1Var.C.setOnDismissListener(this);
        u1Var.f10877s = this.f8616v;
        u1Var.f10875q = this.f8615u;
        u1Var.B = true;
        u1Var.C.setFocusable(true);
        u1Var.C.setInputMethodMode(2);
        u1Var.a(iVar2);
        Drawable background = u1Var.C.getBackground();
        if (background != null) {
            Rect rect4 = u1Var.f10884z;
            background.getPadding(rect4);
            u1Var.f10869d = rect4.left + rect4.right + iM;
        } else {
            u1Var.f10869d = iM;
        }
        u1Var.f10875q = this.f8615u;
        ArrayList arrayList = this.f8610p;
        if (arrayList.size() > 0) {
            gVar = (g) a7.a.k(arrayList, 1);
            l lVar2 = gVar.f8601b;
            int size = lVar2.f8633f.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    item = null;
                    break;
                }
                item = lVar2.getItem(i12);
                if (item.hasSubMenu() && lVar == item.getSubMenu()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (item != null) {
                t1 t1Var2 = gVar.f8600a.f10868c;
                ListAdapter adapter = t1Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    iVar = (i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (i) adapter;
                    headersCount = 0;
                }
                int count = iVar.getCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= count) {
                        i13 = -1;
                        break;
                    } else if (item == iVar.getItem(i13)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                childAt = (i13 != -1 && (firstVisiblePosition = (i13 + headersCount) - t1Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < t1Var2.getChildCount()) ? t1Var2.getChildAt(firstVisiblePosition) : null;
            }
            if (childAt != null) {
                i10 = Build.VERSION.SDK_INT;
                yVar = u1Var.C;
                if (i10 <= 28) {
                    method = u1.G;
                    if (method != null) {
                        try {
                            method.invoke(yVar, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    r1.a(yVar, false);
                }
                q1.a(u1Var.C, null);
                t1Var = ((g) arrayList.get(arrayList.size() - 1)).f8600a.f10868c;
                iArr = new int[2];
                t1Var.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f8617w.getWindowVisibleDisplayFrame(rect3);
                if (this.f8618x == 1) {
                    if (t1Var.getWidth() + iArr[0] + iM > rect3.right) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                } else if (iArr[0] - iM < 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i11 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f8618x = i11;
                u1Var.f10877s = childAt;
                if ((this.f8615u & 5) == 5) {
                    if (!z10) {
                        iM = 0 - childAt.getWidth();
                    }
                } else if (z10) {
                    iM = childAt.getWidth();
                } else {
                    iM = 0 - iM;
                }
                u1Var.f10870e = iM;
                u1Var.f10874p = true;
                u1Var.f10873o = true;
                u1Var.f10871f = 0;
                u1Var.f10872n = true;
            } else {
                if (this.f8619y) {
                    u1Var.f10870e = this.A;
                }
                if (this.f8620z) {
                    u1Var.f10871f = this.B;
                    u1Var.f10872n = true;
                }
                rect = this.f8674a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                u1Var.A = rect2;
            }
            arrayList.add(new g(u1Var, lVar, this.f8618x));
            u1Var.e();
            t1 t1Var3 = u1Var.f10868c;
            t1Var3.setOnKeyListener(this);
            if (gVar == null || !this.D || lVar.f8639l == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) t1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.f8639l);
            t1Var3.addHeaderView(frameLayout, null, false);
            u1Var.e();
            return;
        }
        gVar = null;
        if (childAt != null) {
            i10 = Build.VERSION.SDK_INT;
            yVar = u1Var.C;
            if (i10 <= 28) {
                method = u1.G;
                if (method != null) {
                    method.invoke(yVar, Boolean.FALSE);
                }
            } else {
                r1.a(yVar, false);
            }
            q1.a(u1Var.C, null);
            t1Var = ((g) arrayList.get(arrayList.size() - 1)).f8600a.f10868c;
            iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f8617w.getWindowVisibleDisplayFrame(rect3);
            if (this.f8618x == 1) {
                if (t1Var.getWidth() + iArr[0] + iM > rect3.right) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f8618x = i11;
            u1Var.f10877s = childAt;
            if ((this.f8615u & 5) == 5) {
                if (!z10) {
                    iM = 0 - childAt.getWidth();
                }
            } else if (z10) {
                iM = childAt.getWidth();
            } else {
                iM = 0 - iM;
            }
            u1Var.f10870e = iM;
            u1Var.f10874p = true;
            u1Var.f10873o = true;
            u1Var.f10871f = 0;
            u1Var.f10872n = true;
        } else {
            if (this.f8619y) {
                u1Var.f10870e = this.A;
            }
            if (this.f8620z) {
                u1Var.f10871f = this.B;
                u1Var.f10872n = true;
            }
            rect = this.f8674a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            u1Var.A = rect2;
        }
        arrayList.add(new g(u1Var, lVar, this.f8618x));
        u1Var.e();
        t1 t1Var4 = u1Var.f10868c;
        t1Var4.setOnKeyListener(this);
        if (gVar == null) {
        }
    }
}
