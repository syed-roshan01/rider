package o2;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.ride.accepter.R;
import java.util.UUID;
import k0.y0;
import m0.j0;
import m0.n1;
import m0.o3;
import m0.x1;
import t.o0;
import u1.z0;
import u1.z2;
import w0.a0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u1.a {
    public m2.j A;
    public final j0 B;
    public final Rect C;
    public final a0 D;
    public final n1 E;
    public boolean F;
    public final int[] G;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c9.a f12499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u f12500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f12501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f12502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a4.q f12503t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final WindowManager f12504u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final WindowManager.LayoutParams f12505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t f12506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m2.l f12507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n1 f12508y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final n1 f12509z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c9.a aVar, u uVar, String str, View view, m2.b bVar, t tVar, UUID uuid) {
        super(view.getContext());
        a4.q sVar = Build.VERSION.SDK_INT >= 29 ? new s() : new a4.q();
        this.f12499p = aVar;
        this.f12500q = uVar;
        this.f12501r = str;
        this.f12502s = view;
        this.f12503t = sVar;
        Object systemService = view.getContext().getSystemService("window");
        d7.a.k(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f12504u = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f12505v = layoutParams;
        this.f12506w = tVar;
        this.f12507x = m2.l.f11815a;
        o3 o3Var = o3.f11621a;
        this.f12508y = d7.t.g0(null, o3Var);
        this.f12509z = d7.t.g0(null, o3Var);
        this.B = d7.t.R(new z0(this, 6));
        this.C = new Rect();
        int i10 = 2;
        this.D = new a0(new i(this, i10));
        setId(android.R.id.content);
        o1.s.i0(this, o1.s.A(view));
        i1.b.F(this, i1.b.p(view));
        y3.e.C0(this, y3.e.j0(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.v((float) 8));
        setOutlineProvider(new z2(i10));
        this.E = d7.t.g0(m.f12482a, o3Var);
        this.G = new int[2];
    }

    private final c9.e getContent() {
        return (c9.e) this.E.getValue();
    }

    private final int getDisplayHeight() {
        return d7.t.p0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return d7.t.p0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r1.s getParentLayoutCoordinates() {
        return (r1.s) this.f12509z.getValue();
    }

    private final void setClippingEnabled(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.f12505v;
        layoutParams.flags = z10 ? layoutParams.flags & (-513) : layoutParams.flags | 512;
        this.f12503t.getClass();
        this.f12504u.updateViewLayout(this, layoutParams);
    }

    private final void setContent(c9.e eVar) {
        this.E.setValue(eVar);
    }

    private final void setIsFocusable(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.f12505v;
        layoutParams.flags = !z10 ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        this.f12503t.getClass();
        this.f12504u.updateViewLayout(this, layoutParams);
    }

    private final void setParentLayoutCoordinates(r1.s sVar) {
        this.f12509z.setValue(sVar);
    }

    private final void setSecurePolicy(v vVar) {
        boolean zB = j.b(this.f12502s);
        int iOrdinal = vVar.ordinal();
        if (iOrdinal != 0) {
            zB = true;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new androidx.fragment.app.a0();
                }
                zB = false;
            }
        }
        WindowManager.LayoutParams layoutParams = this.f12505v;
        layoutParams.flags = zB ? layoutParams.flags | 8192 : layoutParams.flags & (-8193);
        this.f12503t.getClass();
        this.f12504u.updateViewLayout(this, layoutParams);
    }

    @Override // u1.a
    public final void a(m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-857613600);
        getContent().invoke(qVar, 0);
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new o0(this, i10, 6);
        }
    }

    @Override // u1.a
    public final void d(int i10, int i11, int i12, int i13, boolean z10) {
        super.d(i10, i11, i12, i13, z10);
        this.f12500q.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f12505v;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f12503t.getClass();
        this.f12504u.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f12500q.f12511b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                c9.a aVar = this.f12499p;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // u1.a
    public final void e(int i10, int i11) {
        this.f12500q.getClass();
        super.e(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f12505v;
    }

    public final m2.l getParentLayoutDirection() {
        return this.f12507x;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final m2.k m7214getPopupContentSizebOM6tXw() {
        return (m2.k) this.f12508y.getValue();
    }

    public final t getPositionProvider() {
        return this.f12506w;
    }

    @Override // u1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.F;
    }

    public u1.a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f12501r;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h(m0.u uVar, c9.e eVar) {
        setParentCompositionContext(uVar);
        setContent(eVar);
        this.F = true;
    }

    public final void i(c9.a aVar, u uVar, String str, m2.l lVar) {
        int i10;
        this.f12499p = aVar;
        uVar.getClass();
        this.f12500q = uVar;
        this.f12501r = str;
        setIsFocusable(uVar.f12510a);
        setSecurePolicy(uVar.f12513d);
        setClippingEnabled(uVar.f12515f);
        int iOrdinal = lVar.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new androidx.fragment.app.a0();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    public final void j() {
        r1.s parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jM = parentLayoutCoordinates.M();
        long jI = parentLayoutCoordinates.i(d1.c.f4326b);
        long jC = i1.b.c(d7.t.p0(d1.c.d(jI)), d7.t.p0(d1.c.e(jI)));
        int i10 = m2.i.f11808c;
        int i11 = (int) (jC >> 32);
        int i12 = (int) (jC & 4294967295L);
        m2.j jVar = new m2.j(i11, i12, ((int) (jM >> 32)) + i11, ((int) (jM & 4294967295L)) + i12);
        if (d7.a.d(jVar, this.A)) {
            return;
        }
        this.A = jVar;
        l();
    }

    public final void k(r1.s sVar) {
        setParentLayoutCoordinates(sVar);
        j();
    }

    public final void l() {
        m2.k kVarM7214getPopupContentSizebOM6tXw;
        m2.j jVar = this.A;
        if (jVar == null || (kVarM7214getPopupContentSizebOM6tXw = m7214getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j10 = kVarM7214getPopupContentSizebOM6tXw.f11814a;
        a4.q qVar = this.f12503t;
        qVar.getClass();
        View view = this.f12502s;
        Rect rect = this.C;
        view.getWindowVisibleDisplayFrame(rect);
        long jE = o1.s.e(rect.right - rect.left, rect.bottom - rect.top);
        d9.t tVar = new d9.t();
        int i10 = m2.i.f11808c;
        tVar.f4951a = m2.i.f11807b;
        this.D.c(this, b.f12455n, new q(tVar, this, jVar, jE, j10));
        WindowManager.LayoutParams layoutParams = this.f12505v;
        long j11 = tVar.f4951a;
        layoutParams.x = (int) (j11 >> 32);
        layoutParams.y = (int) (j11 & 4294967295L);
        if (this.f12500q.f12514e) {
            qVar.l(this, (int) (jE >> 32), (int) (jE & 4294967295L));
        }
        qVar.getClass();
        this.f12504u.updateViewLayout(this, layoutParams);
    }

    @Override // u1.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a0 a0Var = this.D;
        a0Var.f16028g = y0.f(a0Var.f16025d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a0 a0Var = this.D;
        w0.h hVar = a0Var.f16028g;
        if (hVar != null) {
            hVar.a();
        }
        a0Var.b();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12500q.f12512c) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            c9.a aVar = this.f12499p;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        c9.a aVar2 = this.f12499p;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(m2.l lVar) {
        this.f12507x = lVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7215setPopupContentSizefhxjrPA(m2.k kVar) {
        this.f12508y.setValue(kVar);
    }

    public final void setPositionProvider(t tVar) {
        this.f12506w = tVar;
    }

    public final void setTestTag(String str) {
        this.f12501r = str;
    }
}
