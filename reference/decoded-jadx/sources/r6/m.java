package r6;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f13567c;

    public m(p pVar, int i10) {
        super(pVar.size(), i10);
        this.f13567c = pVar;
    }

    @Override // r6.a
    public final Object b(int i10) {
        return this.f13567c.get(i10);
    }
}
