package u1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d9.u f15240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.g2 f15241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w f15242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r3 f15243f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f15244n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(d9.u uVar, m0.g2 g2Var, androidx.lifecycle.w wVar, r3 r3Var, View view, u8.e eVar) {
        super(2, eVar);
        this.f15240c = uVar;
        this.f15241d = g2Var;
        this.f15242e = wVar;
        this.f15243f = r3Var;
        this.f15244n = view;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        q3 q3Var = new q3(this.f15240c, this.f15241d, this.f15242e, this.f15243f, this.f15244n, eVar);
        q3Var.f15239b = obj;
        return q3Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q3) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        m9.f1 f1Var;
        m9.x1 x1VarQ;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15238a;
        q8.l lVar = q8.l.f13235a;
        r3 r3Var = this.f15243f;
        androidx.lifecycle.w wVar = this.f15242e;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f1Var = (m9.f1) this.f15239b;
            try {
                d7.t.v0(obj);
                if (f1Var != null) {
                    f1Var.a(null);
                }
                wVar.getLifecycle().c(r3Var);
                return lVar;
            } catch (Throwable th) {
                th = th;
                if (f1Var != null) {
                    f1Var.a(null);
                }
                wVar.getLifecycle().c(r3Var);
                throw th;
            }
        }
        d7.t.v0(obj);
        m9.d0 d0Var = (m9.d0) this.f15239b;
        try {
            h2 h2Var = (h2) this.f15240c.f4952a;
            if (h2Var != null) {
                p9.o0 o0VarA = u3.a(this.f15244n.getContext().getApplicationContext());
                h2Var.f15109a.f(((Number) o0VarA.getValue()).floatValue());
                x1VarQ = z6.a.Q(d0Var, null, 0, new p3(o0VarA, h2Var, null), 3);
            } else {
                x1VarQ = null;
            }
            try {
                m0.g2 g2Var = this.f15241d;
                this.f15239b = x1VarQ;
                this.f15238a = 1;
                g2Var.getClass();
                Object objU0 = z6.a.u0(g2Var.f11519a, new m0.d2(g2Var, new m0.f2(g2Var, null), d9.i.p(getContext()), null), this);
                if (objU0 != aVar) {
                    objU0 = lVar;
                }
                if (objU0 != aVar) {
                    objU0 = lVar;
                }
                if (objU0 == aVar) {
                    return aVar;
                }
                f1Var = x1VarQ;
                if (f1Var != null) {
                    f1Var.a(null);
                }
                wVar.getLifecycle().c(r3Var);
                return lVar;
            } catch (Throwable th2) {
                f1Var = x1VarQ;
                th = th2;
                if (f1Var != null) {
                    f1Var.a(null);
                }
                wVar.getLifecycle().c(r3Var);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f1Var = null;
        }
    }
}
