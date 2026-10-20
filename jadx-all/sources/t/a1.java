package t;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u9.a f14074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b1 f14076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14079f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b1 f14080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c9.c f14081o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(int i10, b1 b1Var, c9.c cVar, u8.e eVar) {
        super(2, eVar);
        this.f14079f = i10;
        this.f14080n = b1Var;
        this.f14081o = cVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        a1 a1Var = new a1(this.f14079f, this.f14080n, this.f14081o, eVar);
        a1Var.f14078e = obj;
        return a1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a1) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        b1 b1Var;
        c9.c cVar;
        z0 z0Var;
        u9.a aVar;
        u9.a aVar2;
        z0 z0Var2;
        b1 b1Var2;
        Throwable th;
        AtomicReference atomicReference;
        u9.a aVar3;
        AtomicReference atomicReference2;
        v8.a aVar4 = v8.a.f15963a;
        ?? r10 = this.f14077d;
        try {
            try {
                if (r10 == 0) {
                    d7.t.v0(obj);
                    u8.h hVarF = ((m9.d0) this.f14078e).q().f(m9.a0.f11902b);
                    d7.a.j(hVarF);
                    z0 z0Var3 = new z0(this.f14079f, (m9.f1) hVarF);
                    loop2: while (true) {
                        b1Var = this.f14080n;
                        AtomicReference atomicReference3 = b1Var.f14091a;
                        z0 z0Var4 = (z0) atomicReference3.get();
                        if (z0Var4 != null && k.a(z0Var3.f14364a, z0Var4.f14364a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(z0Var4, z0Var3)) {
                                if (z0Var4 != null) {
                                    z0Var4.f14365b.a(new y0(0, 0));
                                }
                                this.f14078e = z0Var3;
                                u9.d dVar = b1Var.f14092b;
                                this.f14074a = dVar;
                                c9.c cVar2 = this.f14081o;
                                this.f14075b = cVar2;
                                this.f14076c = b1Var;
                                this.f14077d = 1;
                                if (dVar.c(null, this) != aVar4) {
                                    cVar = cVar2;
                                    z0Var = z0Var3;
                                    aVar = dVar;
                                    break loop2;
                                }
                                return aVar4;
                            }
                        } while (atomicReference3.get() == z0Var4);
                    }
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b1Var2 = (b1) this.f14075b;
                        u9.a aVar5 = this.f14074a;
                        z0Var2 = (z0) this.f14078e;
                        try {
                            d7.t.v0(obj);
                            aVar3 = aVar5;
                            atomicReference2 = b1Var2.f14091a;
                            while (!atomicReference2.compareAndSet(z0Var2, null) && atomicReference2.get() == z0Var2) {
                            }
                            ((u9.d) aVar3).d(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = b1Var2.f14091a;
                            while (!atomicReference.compareAndSet(z0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    b1 b1Var3 = this.f14076c;
                    cVar = (c9.c) this.f14075b;
                    u9.a aVar6 = this.f14074a;
                    z0Var = (z0) this.f14078e;
                    d7.t.v0(obj);
                    b1Var = b1Var3;
                    aVar = aVar6;
                }
                this.f14078e = z0Var;
                this.f14074a = aVar2;
                this.f14075b = b1Var;
                this.f14076c = null;
                this.f14077d = 2;
                Object objInvoke = cVar.invoke(this);
                if (objInvoke == aVar4) {
                    return aVar4;
                }
                b1Var2 = b1Var;
                obj = objInvoke;
                z0Var2 = z0Var;
                aVar3 = aVar2;
                atomicReference2 = b1Var2.f14091a;
                while (!atomicReference2.compareAndSet(z0Var2, null)) {
                }
                ((u9.d) aVar3).d(null);
                return obj;
            } catch (Throwable th3) {
                z0Var2 = z0Var;
                b1Var2 = b1Var;
                th = th3;
                atomicReference = b1Var2.f14091a;
                while (!atomicReference.compareAndSet(z0Var2, null) && atomicReference.get() == z0Var2) {
                }
                throw th;
            }
            aVar2 = aVar;
        } catch (Throwable th4) {
            ((u9.d) r10).d(null);
            throw th4;
        }
    }
}
