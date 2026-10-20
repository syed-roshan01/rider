package m0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0.h f11475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2 f11478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.f f11479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a1 f11480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(g2 g2Var, c9.f fVar, a1 a1Var, u8.e eVar) {
        super(2, eVar);
        this.f11478d = g2Var;
        this.f11479e = fVar;
        this.f11480f = a1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        d2 d2Var = new d2(this.f11478d, this.f11479e, this.f11480f, eVar);
        d2Var.f11477c = obj;
        return d2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d2) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c A[Catch: all -> 0x010f, TryCatch #5 {all -> 0x010f, blocks: (B:52:0x0108, B:54:0x010c, B:57:0x0111), top: B:96:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0132 A[Catch: all -> 0x0135, TryCatch #1 {all -> 0x0135, blocks: (B:68:0x012e, B:70:0x0132, B:73:0x0137), top: B:90:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        m9.f1 f1VarG0;
        p9.q0 q0Var;
        Object obj2;
        s0.b bVar;
        w0.h hVar;
        Throwable th;
        List listX;
        g2 g2Var;
        g2 g2Var2;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f11476b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = this.f11475a;
            f1VarG0 = (m9.f1) this.f11477c;
            try {
                d7.t.v0(obj);
                hVar.a();
                g2Var2 = this.f11478d;
                synchronized (g2Var2.f11520b) {
                    try {
                        if (g2Var2.f11521c == f1VarG0) {
                            g2Var2.f11521c = null;
                        }
                        g2Var2.u();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                p9.q0 q0Var2 = g2.f11517v;
                k0.y0.a(this.f11478d.f11539u);
                return q8.l.f13235a;
            } catch (Throwable th3) {
                th = th3;
                hVar.a();
                g2Var = this.f11478d;
                synchronized (g2Var.f11520b) {
                    try {
                        if (g2Var.f11521c == f1VarG0) {
                            g2Var.f11521c = null;
                        }
                        g2Var.u();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                p9.q0 q0Var3 = g2.f11517v;
                k0.y0.a(this.f11478d.f11539u);
                throw th;
            }
        }
        d7.t.v0(obj);
        f1VarG0 = h6.g.g0(((m9.d0) this.f11477c).q());
        g2 g2Var3 = this.f11478d;
        synchronized (g2Var3.f11520b) {
            Throwable th5 = g2Var3.f11522d;
            if (th5 != null) {
                throw th5;
            }
            if (((a2) g2Var3.f11536r.getValue()).compareTo(a2.f11448b) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (g2Var3.f11521c != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            g2Var3.f11521c = f1VarG0;
            g2Var3.u();
        }
        w0.h hVarF = k0.y0.f(new s.i(this.f11478d, 6));
        p9.q0 q0Var4 = g2.f11517v;
        k.f fVar = this.f11478d.f11539u;
        do {
            q0Var = g2.f11517v;
            obj2 = (p0.g) q0Var.getValue();
            bVar = (s0.b) obj2;
            r0.d dVar = bVar.f13901c;
            if (!dVar.containsKey(fVar)) {
                boolean zIsEmpty = bVar.isEmpty();
                t0.b bVar2 = t0.b.f14367a;
                if (zIsEmpty) {
                    bVar = new s0.b(fVar, fVar, dVar.b(fVar, new s0.a(bVar2, bVar2)));
                } else {
                    Object obj3 = bVar.f13900b;
                    Object obj4 = dVar.get(obj3);
                    d7.a.j(obj4);
                    bVar = new s0.b(bVar.f13899a, fVar, dVar.b(obj3, new s0.a(((s0.a) obj4).f13896a, fVar)).b(fVar, new s0.a(obj3, bVar2)));
                }
            }
            if (obj2 == bVar) {
                break;
            }
            i3.u uVar = q9.c.f13247b;
            if (obj2 == null) {
                obj2 = uVar;
            }
        } while (!q0Var.j(obj2, bVar));
        try {
            g2 g2Var4 = this.f11478d;
            synchronized (g2Var4.f11520b) {
                listX = g2Var4.x();
            }
            int size = listX.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((x) ((e0) listX.get(i11))).t();
            }
            c2 c2Var = new c2(this.f11479e, this.f11480f, null);
            this.f11477c = f1VarG0;
            this.f11475a = hVarF;
            this.f11476b = 1;
            if (d7.a.q(c2Var, this) == aVar) {
                return aVar;
            }
            hVar = hVarF;
            hVar.a();
            g2Var2 = this.f11478d;
            synchronized (g2Var2.f11520b) {
                if (g2Var2.f11521c == f1VarG0) {
                    g2Var2.f11521c = null;
                }
                g2Var2.u();
                p9.q0 q0Var5 = g2.f11517v;
                k0.y0.a(this.f11478d.f11539u);
                return q8.l.f13235a;
            }
        } catch (Throwable th6) {
            hVar = hVarF;
            th = th6;
            hVar.a();
            g2Var = this.f11478d;
            synchronized (g2Var.f11520b) {
                if (g2Var.f11521c == f1VarG0) {
                    g2Var.f11521c = null;
                }
                g2Var.u();
                p9.q0 q0Var6 = g2.f11517v;
                k0.y0.a(this.f11478d.f11539u);
                throw th;
            }
        }
    }
}
