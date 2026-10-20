package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f1386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f1387b;

    public g0(i0 i0Var, y yVar) {
        d7.a.m(yVar, "onBackPressedCallback");
        this.f1387b = i0Var;
        this.f1386a = yVar;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        i0 i0Var = this.f1387b;
        r8.l lVar = i0Var.f1395b;
        y yVar = this.f1386a;
        lVar.remove(yVar);
        if (d7.a.d(i0Var.f1396c, yVar)) {
            yVar.getClass();
            i0Var.f1396c = null;
        }
        yVar.getClass();
        yVar.f1429b.remove(this);
        c9.a aVar = yVar.f1430c;
        if (aVar != null) {
            aVar.invoke();
        }
        yVar.f1430c = null;
    }
}
