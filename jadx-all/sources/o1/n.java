package o1;

import t1.t1;

/* JADX INFO: loaded from: classes.dex */
public final class n extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d9.u f12405b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10, d9.u uVar) {
        super(1);
        this.f12404a = i10;
        this.f12405b = uVar;
    }

    public final Boolean a(o oVar) {
        int i10 = this.f12404a;
        d9.u uVar = this.f12405b;
        switch (i10) {
            case 0:
                Object obj = uVar.f4952a;
                if (obj == null && oVar.f12408w) {
                    uVar.f4952a = oVar;
                } else if (obj != null && oVar.f12407v && oVar.f12408w) {
                    uVar.f4952a = oVar;
                }
                break;
            default:
                if (oVar.f12407v && oVar.f12408w) {
                    uVar.f4952a = oVar;
                }
                break;
        }
        return Boolean.TRUE;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f12404a) {
            case 0:
                return a((o) obj);
            case 1:
                o oVar = (o) obj;
                t1 t1Var = t1.f14554a;
                if (!oVar.f12408w) {
                    return t1Var;
                }
                this.f12405b.f4952a = oVar;
                return oVar.f12407v ? t1.f14555b : t1Var;
            default:
                return a((o) obj);
        }
    }
}
