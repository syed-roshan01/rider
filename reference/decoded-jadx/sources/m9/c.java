package m9;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11909o = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer");
    private volatile Object _disposer;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f11910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o0 f11911f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f11912n;

    public c(e eVar, l lVar) {
        this.f11912n = eVar;
        this.f11910e = lVar;
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return q8.l.f13235a;
    }

    @Override // m9.j1
    public final void n(Throwable th) {
        k kVar = this.f11910e;
        if (th != null) {
            i3.u uVarW = kVar.w(th);
            if (uVarW != null) {
                kVar.x(uVarW);
                d dVar = (d) f11909o.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f11922b;
        e eVar = this.f11912n;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            h0[] h0VarArr = eVar.f11923a;
            ArrayList arrayList = new ArrayList(h0VarArr.length);
            for (h0 h0Var : h0VarArr) {
                arrayList.add(h0Var.g());
            }
            kVar.resumeWith(arrayList);
        }
    }
}
