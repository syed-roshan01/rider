package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.a f2074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.b f2076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d.c f2077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f2078e;

    public y(d0 d0Var, o.a aVar, AtomicReference atomicReference, e.b bVar, d.c cVar) {
        this.f2078e = d0Var;
        this.f2074a = aVar;
        this.f2075b = atomicReference;
        this.f2076c = bVar;
        this.f2077d = cVar;
    }

    @Override // androidx.fragment.app.b0
    public final void a() {
        d0 d0Var = this.f2078e;
        this.f2075b.set(((d.i) this.f2074a.apply(null)).c(d0Var.generateActivityResultKey(), d0Var, this.f2076c, this.f2077d));
    }
}
