package h5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.a0;
import d1.f;
import d7.t;
import e1.e;
import e1.l;
import e1.p;
import g1.g;
import m0.i2;
import m0.n1;
import m0.o3;
import q8.i;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h1.c implements i2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f7555f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n1 f7556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n1 f7557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f7558p;

    public a(Drawable drawable) {
        d7.a.m(drawable, "drawable");
        this.f7555f = drawable;
        o3 o3Var = o3.f11621a;
        this.f7556n = t.g0(0, o3Var);
        q8.c cVar = c.f7560a;
        this.f7557o = t.g0(new f((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? f.f4345c : t.j(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())), o3Var);
        this.f7558p = new i(new z0(this, 13));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m0.i2
    public final void a() {
        Drawable.Callback callback = (Drawable.Callback) this.f7558p.getValue();
        Drawable drawable = this.f7555f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // m0.i2
    public final void b() {
        d();
    }

    @Override // h1.c
    public final boolean c(float f10) {
        this.f7555f.setAlpha(z6.a.r(t.p0(f10 * 255), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m0.i2
    public final void d() {
        Drawable drawable = this.f7555f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // h1.c
    public final boolean e(l lVar) {
        this.f7555f.setColorFilter(lVar != null ? lVar.f5042a : null);
        return true;
    }

    @Override // h1.c
    public final void f(m2.l lVar) {
        int i10;
        d7.a.m(lVar, "layoutDirection");
        int iOrdinal = lVar.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new a0();
            }
        } else {
            i10 = 0;
        }
        this.f7555f.setLayoutDirection(i10);
    }

    @Override // h1.c
    public final long h() {
        return ((f) this.f7557o.getValue()).f4347a;
    }

    @Override // h1.c
    public final void i(g gVar) {
        d7.a.m(gVar, "<this>");
        p pVarA = gVar.A().a();
        ((Number) this.f7556n.getValue()).intValue();
        int iP0 = t.p0(f.d(gVar.e()));
        int iP1 = t.p0(f.b(gVar.e()));
        Drawable drawable = this.f7555f;
        drawable.setBounds(0, 0, iP0, iP1);
        try {
            pVarA.j();
            drawable.draw(e.a(pVarA));
        } finally {
            pVarA.h();
        }
    }
}
