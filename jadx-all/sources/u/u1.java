package u;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u9.a f14950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v1 f14953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f14955f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s1 f14956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v1 f14957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c9.e f14958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f14959q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(s1 s1Var, v1 v1Var, c9.e eVar, Object obj, u8.e eVar2) {
        super(2, eVar2);
        this.f14956n = s1Var;
        this.f14957o = v1Var;
        this.f14958p = eVar;
        this.f14959q = obj;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        u1 u1Var = new u1(this.f14956n, this.f14957o, this.f14958p, this.f14959q, eVar);
        u1Var.f14955f = obj;
        return u1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v1 v1Var;
        Object obj2;
        t1 t1Var;
        u9.a aVar;
        c9.e eVar;
        t1 t1Var2;
        v1 v1Var2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        v8.a aVar2 = v8.a.f15963a;
        ?? r10 = this.f14954e;
        try {
            try {
                if (r10 == 0) {
                    d7.t.v0(obj);
                    u8.h hVarF = ((m9.d0) this.f14955f).q().f(m9.a0.f11902b);
                    d7.a.j(hVarF);
                    t1 t1Var3 = new t1(this.f14956n, (m9.f1) hVarF);
                    loop2: while (true) {
                        v1Var = this.f14957o;
                        AtomicReference atomicReference3 = v1Var.f14965a;
                        t1 t1Var4 = (t1) atomicReference3.get();
                        if (t1Var4 != null && t1Var3.f14936a.compareTo(t1Var4.f14936a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(t1Var4, t1Var3)) {
                                if (t1Var4 != null) {
                                    t1Var4.f14937b.a(new t.y0(1, 0));
                                }
                                this.f14955f = t1Var3;
                                u9.d dVar = v1Var.f14966b;
                                this.f14950a = dVar;
                                c9.e eVar2 = this.f14958p;
                                this.f14951b = eVar2;
                                Object obj3 = this.f14959q;
                                this.f14952c = obj3;
                                this.f14953d = v1Var;
                                this.f14954e = 1;
                                if (dVar.c(null, this) != aVar2) {
                                    obj2 = obj3;
                                    t1Var = t1Var3;
                                    aVar = dVar;
                                    eVar = eVar2;
                                    break loop2;
                                }
                                return aVar2;
                            }
                        } while (atomicReference3.get() == t1Var4);
                    }
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v1Var2 = (v1) this.f14951b;
                        aVar = this.f14950a;
                        t1Var2 = (t1) this.f14955f;
                        try {
                            d7.t.v0(obj);
                            atomicReference2 = v1Var2.f14965a;
                            while (!atomicReference2.compareAndSet(t1Var2, null) && atomicReference2.get() == t1Var2) {
                            }
                            ((u9.d) aVar).d(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = v1Var2.f14965a;
                            while (!atomicReference.compareAndSet(t1Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    v1 v1Var3 = this.f14953d;
                    obj2 = this.f14952c;
                    eVar = (c9.e) this.f14951b;
                    u9.a aVar3 = this.f14950a;
                    t1Var = (t1) this.f14955f;
                    d7.t.v0(obj);
                    v1Var = v1Var3;
                    aVar = aVar3;
                }
                this.f14955f = t1Var;
                this.f14950a = aVar;
                this.f14951b = v1Var;
                this.f14952c = null;
                this.f14953d = null;
                this.f14954e = 2;
                Object objInvoke = eVar.invoke(obj2, this);
                if (objInvoke == aVar2) {
                    return aVar2;
                }
                v1Var2 = v1Var;
                obj = objInvoke;
                t1Var2 = t1Var;
                atomicReference2 = v1Var2.f14965a;
                while (!atomicReference2.compareAndSet(t1Var2, null)) {
                }
                ((u9.d) aVar).d(null);
                return obj;
            } catch (Throwable th3) {
                t1Var2 = t1Var;
                v1Var2 = v1Var;
                th = th3;
                atomicReference = v1Var2.f14965a;
                while (!atomicReference.compareAndSet(t1Var2, null) && atomicReference.get() == t1Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((u9.d) r10).d(null);
            throw th4;
        }
    }
}
