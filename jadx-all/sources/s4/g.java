package s4;

import androidx.lifecycle.v;

/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.lifecycle.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f13967a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f13968b = new f();

    @Override // androidx.lifecycle.r
    public final void a(v vVar) {
        if (!(vVar instanceof androidx.lifecycle.g)) {
            throw new IllegalArgumentException((vVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        androidx.lifecycle.g gVar = (androidx.lifecycle.g) vVar;
        gVar.getClass();
        f fVar = f13968b;
        d7.a.m(fVar, "owner");
        gVar.d(fVar);
        gVar.b(fVar);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.q b() {
        return androidx.lifecycle.q.f2173e;
    }

    @Override // androidx.lifecycle.r
    public final void c(v vVar) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
