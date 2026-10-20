package u1;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends View implements t1.j1 {
    public static boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z2 f15033w = new z2(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Method f15034x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static Field f15035y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f15036z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f15037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f15038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c9.c f15039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c9.a f15040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j2 f15041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15042f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f15043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k.f f15046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g2 f15047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f15048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f15050u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15051v;

    public b3(w wVar, z1 z1Var, h1.b bVar, t.l0 l0Var) {
        super(wVar.getContext());
        this.f15037a = wVar;
        this.f15038b = z1Var;
        this.f15039c = bVar;
        this.f15040d = l0Var;
        this.f15041e = new j2(wVar.getDensity());
        this.f15046q = new k.f(6);
        this.f15047r = new g2(o0.f15176e);
        this.f15048s = e1.p0.f5055b;
        this.f15049t = true;
        setWillNotDraw(false);
        z1Var.addView(this);
        this.f15050u = View.generateViewId();
    }

    private final e1.d0 getManualClipPath() {
        if (getClipToOutline()) {
            j2 j2Var = this.f15041e;
            if (!(!j2Var.f15129i)) {
                j2Var.e();
                return j2Var.f15127g;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f15044o) {
            this.f15044o = z10;
            this.f15037a.t(this, z10);
        }
    }

    @Override // t1.j1
    public final long a(long j10, boolean z10) {
        g2 g2Var = this.f15047r;
        if (!z10) {
            return e1.a0.a(g2Var.b(this), j10);
        }
        float[] fArrA = g2Var.a(this);
        if (fArrA != null) {
            return e1.a0.a(fArrA, j10);
        }
        int i10 = d1.c.f4329e;
        return d1.c.f4327c;
    }

    @Override // t1.j1
    public final void b(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        long j11 = this.f15048s;
        int i12 = e1.p0.f5056c;
        float f10 = i10;
        setPivotX(Float.intBitsToFloat((int) (j11 >> 32)) * f10);
        float f11 = i11;
        setPivotY(Float.intBitsToFloat((int) (4294967295L & this.f15048s)) * f11);
        long j12 = d7.t.j(f10, f11);
        j2 j2Var = this.f15041e;
        if (!d1.f.a(j2Var.f15124d, j12)) {
            j2Var.f15124d = j12;
            j2Var.f15128h = true;
        }
        setOutlineProvider(j2Var.b() != null ? f15033w : null);
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        m();
        this.f15047r.c();
    }

    @Override // t1.j1
    public final void c(float[] fArr) {
        e1.a0.d(fArr, this.f15047r.b(this));
    }

    @Override // t1.j1
    public final void d(float[] fArr) {
        float[] fArrA = this.f15047r.a(this);
        if (fArrA != null) {
            e1.a0.d(fArr, fArrA);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        k.f fVar = this.f15046q;
        Object obj = fVar.f8599b;
        Canvas canvas2 = ((e1.d) obj).f4994a;
        ((e1.d) obj).f4994a = canvas;
        e1.d dVar = (e1.d) obj;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            dVar.j();
            this.f15041e.a(dVar);
            z10 = true;
        }
        c9.c cVar = this.f15039c;
        if (cVar != null) {
            cVar.invoke(dVar);
        }
        if (z10) {
            dVar.h();
        }
        ((e1.d) fVar.f8599b).f4994a = canvas2;
        setInvalidated(false);
    }

    @Override // t1.j1
    public final void e(e1.i0 i0Var, m2.l lVar, m2.b bVar) {
        c9.a aVar;
        int i10 = i0Var.f5017a | this.f15051v;
        if ((i10 & 4096) != 0) {
            long j10 = i0Var.f5030u;
            this.f15048s = j10;
            int i11 = e1.p0.f5056c;
            setPivotX(Float.intBitsToFloat((int) (j10 >> 32)) * getWidth());
            setPivotY(Float.intBitsToFloat((int) (this.f15048s & 4294967295L)) * getHeight());
        }
        if ((i10 & 1) != 0) {
            setScaleX(i0Var.f5018b);
        }
        if ((i10 & 2) != 0) {
            setScaleY(i0Var.f5019c);
        }
        if ((i10 & 4) != 0) {
            setAlpha(i0Var.f5020d);
        }
        if ((i10 & 8) != 0) {
            setTranslationX(i0Var.f5021e);
        }
        if ((i10 & 16) != 0) {
            setTranslationY(i0Var.f5022f);
        }
        if ((i10 & 32) != 0) {
            setElevation(i0Var.f5023n);
        }
        if ((i10 & 1024) != 0) {
            setRotation(i0Var.f5028s);
        }
        if ((i10 & 256) != 0) {
            setRotationX(i0Var.f5026q);
        }
        if ((i10 & 512) != 0) {
            setRotationY(i0Var.f5027r);
        }
        if ((i10 & 2048) != 0) {
            setCameraDistancePx(i0Var.f5029t);
        }
        boolean z10 = true;
        boolean z11 = getManualClipPath() != null;
        boolean z12 = i0Var.f5032w;
        e1.f0 f0Var = e1.g0.f5008a;
        boolean z13 = z12 && i0Var.f5031v != f0Var;
        if ((i10 & 24576) != 0) {
            this.f15042f = z12 && i0Var.f5031v == f0Var;
            m();
            setClipToOutline(z13);
        }
        boolean zD = this.f15041e.d(i0Var.f5031v, i0Var.f5020d, z13, i0Var.f5023n, lVar, bVar);
        j2 j2Var = this.f15041e;
        if (j2Var.f15128h) {
            setOutlineProvider(j2Var.b() != null ? f15033w : null);
        }
        boolean z14 = getManualClipPath() != null;
        if (z11 != z14 || (z14 && zD)) {
            invalidate();
        }
        if (!this.f15045p && getElevation() > 0.0f && (aVar = this.f15040d) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f15047r.c();
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            int i13 = i10 & 64;
            d3 d3Var = d3.f15062a;
            if (i13 != 0) {
                d3Var.a(this, androidx.compose.ui.graphics.a.s(i0Var.f5024o));
            }
            if ((i10 & 128) != 0) {
                d3Var.b(this, androidx.compose.ui.graphics.a.s(i0Var.f5025p));
            }
        }
        if (i12 >= 31 && (131072 & i10) != 0) {
            e3.f15085a.a(this, null);
        }
        if ((i10 & 32768) != 0) {
            int i14 = i0Var.f5033x;
            if (e1.g0.c(i14, 1)) {
                setLayerType(2, null);
            } else if (e1.g0.c(i14, 2)) {
                setLayerType(0, null);
                z10 = false;
            } else {
                setLayerType(0, null);
            }
            this.f15049t = z10;
        }
        this.f15051v = i0Var.f5017a;
    }

    @Override // t1.j1
    public final void f() {
        f3 f3Var;
        Reference referencePoll;
        o0.i iVar;
        setInvalidated(false);
        w wVar = this.f15037a;
        wVar.C = true;
        this.f15039c = null;
        this.f15040d = null;
        do {
            f3Var = wVar.f15346t0;
            referencePoll = f3Var.f15092b.poll();
            iVar = f3Var.f15091a;
            if (referencePoll != null) {
                iVar.m(referencePoll);
            }
        } while (referencePoll != null);
        iVar.c(new WeakReference(this, f3Var.f15092b));
        this.f15038b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // t1.j1
    public final void g(long j10) {
        int i10 = m2.i.f11808c;
        int i11 = (int) (j10 >> 32);
        int left = getLeft();
        g2 g2Var = this.f15047r;
        if (i11 != left) {
            offsetLeftAndRight(i11 - getLeft());
            g2Var.c();
        }
        int i12 = (int) (j10 & 4294967295L);
        if (i12 != getTop()) {
            offsetTopAndBottom(i12 - getTop());
            g2Var.c();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final z1 getContainer() {
        return this.f15038b;
    }

    public long getLayerId() {
        return this.f15050u;
    }

    public final w getOwnerView() {
        return this.f15037a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a3.a(this.f15037a);
        }
        return -1L;
    }

    @Override // t1.j1
    public final void h() {
        if (!this.f15044o || A) {
            return;
        }
        k1.b.b(this);
        setInvalidated(false);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f15049t;
    }

    @Override // t1.j1
    public final void i(t.l0 l0Var, h1.b bVar) {
        this.f15038b.addView(this);
        this.f15042f = false;
        this.f15045p = false;
        this.f15048s = e1.p0.f5055b;
        this.f15039c = bVar;
        this.f15040d = l0Var;
    }

    @Override // android.view.View, t1.j1
    public final void invalidate() {
        if (this.f15044o) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f15037a.invalidate();
    }

    @Override // t1.j1
    public final void j(d1.b bVar, boolean z10) {
        g2 g2Var = this.f15047r;
        if (!z10) {
            e1.a0.b(g2Var.b(this), bVar);
            return;
        }
        float[] fArrA = g2Var.a(this);
        if (fArrA != null) {
            e1.a0.b(fArrA, bVar);
            return;
        }
        bVar.f4322a = 0.0f;
        bVar.f4323b = 0.0f;
        bVar.f4324c = 0.0f;
        bVar.f4325d = 0.0f;
    }

    @Override // t1.j1
    public final boolean k(long j10) {
        float fD = d1.c.d(j10);
        float fE = d1.c.e(j10);
        if (this.f15042f) {
            return 0.0f <= fD && fD < ((float) getWidth()) && 0.0f <= fE && fE < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f15041e.c(j10);
        }
        return true;
    }

    @Override // t1.j1
    public final void l(e1.p pVar) {
        boolean z10 = getElevation() > 0.0f;
        this.f15045p = z10;
        if (z10) {
            pVar.r();
        }
        this.f15038b.a(pVar, this, getDrawingTime());
        if (this.f15045p) {
            pVar.m();
        }
    }

    public final void m() {
        Rect rect;
        if (this.f15042f) {
            Rect rect2 = this.f15043n;
            if (rect2 == null) {
                this.f15043n = new Rect(0, 0, getWidth(), getHeight());
            } else {
                d7.a.j(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f15043n;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }
}
