package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f2194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f2195b;

    public final void a(w wVar, p pVar) {
        q qVarA = pVar.a();
        q qVar = this.f2194a;
        d7.a.m(qVar, "state1");
        if (qVarA.compareTo(qVar) < 0) {
            qVar = qVarA;
        }
        this.f2194a = qVar;
        this.f2195b.onStateChanged(wVar, pVar);
        this.f2194a = qVarA;
    }
}
