package m9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.a f11920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c9.a aVar, u8.e eVar) {
        super(2, eVar);
        this.f11920b = aVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        d1 d1Var = new d1(this.f11920b, eVar);
        d1Var.f11919a = obj;
        return d1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        u8.j jVarQ = ((d0) this.f11919a).q();
        c9.a aVar2 = this.f11920b;
        try {
            f1 f1VarG0 = h6.g.g0(jVarQ);
            c2 c2Var = new c2(f1VarG0);
            c2Var.f11917b = ((p1) f1VarG0).U(true, true, c2Var);
            do {
                atomicIntegerFieldUpdater = c2.f11915c;
                i10 = atomicIntegerFieldUpdater.get(c2Var);
                if (i10 != 0) {
                    if (i10 == 2 || i10 == 3) {
                        break;
                        break;
                    }
                    c2.b(i10);
                    throw null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c2Var, i10, 0));
            try {
                return aVar2.invoke();
            } finally {
                c2Var.a();
            }
        } catch (InterruptedException e4) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e4);
        }
    }
}
