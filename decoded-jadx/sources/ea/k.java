package ea;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends aa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f5473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5474f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f5475g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, l lVar, c0 c0Var) {
        super(str, true);
        this.f5473e = lVar;
        this.f5475g = c0Var;
    }

    @Override // aa.a
    public final long a() {
        long jA;
        int i10;
        y[] yVarArr;
        l lVar = this.f5473e;
        boolean z10 = this.f5474f;
        c0 c0Var = this.f5475g;
        lVar.getClass();
        d7.a.m(c0Var, "settings");
        d9.u uVar = new d9.u();
        r rVar = lVar.f5477b;
        synchronized (rVar.F) {
            synchronized (rVar) {
                try {
                    c0 c0Var2 = rVar.f5512z;
                    if (!z10) {
                        c0 c0Var3 = new c0();
                        c0Var3.b(c0Var2);
                        c0Var3.b(c0Var);
                        c0Var = c0Var3;
                    }
                    uVar.f4952a = c0Var;
                    jA = ((long) c0Var.a()) - ((long) c0Var2.a());
                    yVarArr = (jA == 0 || rVar.f5496c.isEmpty()) ? null : (y[]) rVar.f5496c.values().toArray(new y[0]);
                    c0 c0Var4 = (c0) uVar.f4952a;
                    d7.a.m(c0Var4, "<set-?>");
                    rVar.f5512z = c0Var4;
                    rVar.f5504r.c(new i(rVar.f5497d + " onSettings", rVar, uVar, 0), 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                rVar.F.a((c0) uVar.f4952a);
            } catch (IOException e4) {
                rVar.b(e4);
            }
        }
        if (yVarArr == null) {
            return -1L;
        }
        for (y yVar : yVarArr) {
            synchronized (yVar) {
                yVar.f5549f += jA;
                if (jA > 0) {
                    yVar.notifyAll();
                }
            }
        }
        return -1L;
    }
}
