package r9;

/* JADX INFO: loaded from: classes.dex */
public class s extends m9.a implements w8.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u8.e f13726d;

    public s(u8.e eVar, u8.j jVar) {
        super(jVar, true);
        this.f13726d = eVar;
    }

    @Override // m9.p1
    public final boolean V() {
        return true;
    }

    @Override // w8.d
    public final w8.d getCallerFrame() {
        u8.e eVar = this.f13726d;
        if (eVar instanceof w8.d) {
            return (w8.d) eVar;
        }
        return null;
    }

    @Override // m9.p1
    public void t(Object obj) {
        a.l(d7.t.b0(this.f13726d), d7.t.l0(obj), null);
    }

    @Override // m9.p1
    public void v(Object obj) {
        this.f13726d.resumeWith(d7.t.l0(obj));
    }
}
