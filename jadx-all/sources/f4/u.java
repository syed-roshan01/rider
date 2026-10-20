package f4;

/* JADX INFO: loaded from: classes.dex */
public final class u extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f6219a;

    @Override // f4.r, f4.p
    public final void a(q qVar) {
        v vVar = this.f6219a;
        if (vVar.H) {
            return;
        }
        vVar.G();
        vVar.H = true;
    }

    @Override // f4.p
    public final void c(q qVar) {
        v vVar = this.f6219a;
        int i10 = vVar.G - 1;
        vVar.G = i10;
        if (i10 == 0) {
            vVar.H = false;
            vVar.n();
        }
        qVar.w(this);
    }
}
