package r7;

import com.google.gson.internal.Excluder;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p7.a0;
import p7.b0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f13607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p7.n f13610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u7.a f13611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Excluder f13612f;

    public i(Excluder excluder, boolean z10, boolean z11, p7.n nVar, u7.a aVar) {
        this.f13612f = excluder;
        this.f13608b = z10;
        this.f13609c = z11;
        this.f13610d = nVar;
        this.f13611e = aVar;
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        if (this.f13608b) {
            aVar.q0();
            return null;
        }
        a0 a0Var = this.f13607a;
        if (a0Var == null) {
            p7.n nVar = this.f13610d;
            List list = nVar.f12838e;
            b0 b0Var = this.f13612f;
            if (!list.contains(b0Var)) {
                b0Var = nVar.f12837d;
            }
            Iterator it = list.iterator();
            boolean z10 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                u7.a aVar2 = this.f13611e;
                if (!zHasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + aVar2);
                }
                b0 b0Var2 = (b0) it.next();
                if (z10) {
                    a0 a0VarA = b0Var2.a(nVar, aVar2);
                    if (a0VarA != null) {
                        this.f13607a = a0VarA;
                        a0Var = a0VarA;
                    }
                } else if (b0Var2 == b0Var) {
                    z10 = true;
                }
            }
        }
        return a0Var.b(aVar);
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        if (this.f13609c) {
            bVar.M();
            return;
        }
        a0 a0Var = this.f13607a;
        if (a0Var == null) {
            p7.n nVar = this.f13610d;
            List list = nVar.f12838e;
            b0 b0Var = this.f13612f;
            if (!list.contains(b0Var)) {
                b0Var = nVar.f12837d;
            }
            Iterator it = list.iterator();
            boolean z10 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                u7.a aVar = this.f13611e;
                if (!zHasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + aVar);
                }
                b0 b0Var2 = (b0) it.next();
                if (z10) {
                    a0 a0VarA = b0Var2.a(nVar, aVar);
                    if (a0VarA != null) {
                        this.f13607a = a0VarA;
                        a0Var = a0VarA;
                    }
                } else if (b0Var2 == b0Var) {
                    z10 = true;
                }
            }
        }
        a0Var.c(bVar, obj);
    }
}
