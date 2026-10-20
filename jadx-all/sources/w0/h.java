package w0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.a f16066b;

    public /* synthetic */ h(s.i iVar, int i10) {
        this.f16065a = i10;
        this.f16066b = iVar;
    }

    public final void a() {
        switch (this.f16065a) {
            case 0:
                c9.e eVar = (c9.e) this.f16066b;
                synchronized (p.f16109b) {
                    p.f16114g = r8.p.O0(p.f16114g, eVar);
                }
                return;
            default:
                c9.c cVar = (c9.c) this.f16066b;
                synchronized (p.f16109b) {
                    p.f16115h = r8.p.O0(p.f16115h, cVar);
                }
                p.e(o.f16105b);
                return;
        }
    }
}
