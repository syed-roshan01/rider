package u1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0.n1 f15248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15249q;

    public r1(Context context) {
        super(context, null, 0);
        this.f15248p = d7.t.g0(null, m0.o3.f11621a);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // u1.a
    public final void a(m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(420213850);
        c9.e eVar = (c9.e) this.f15248p.getValue();
        if (eVar != null) {
            eVar.invoke(qVar, 0);
        }
        m0.x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new t.o0(this, i10, 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return r1.class.getName();
    }

    @Override // u1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f15249q;
    }

    public final void setContent(c9.e eVar) {
        this.f15249q = true;
        this.f15248p.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f15016d == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
            }
            c();
        }
    }
}
