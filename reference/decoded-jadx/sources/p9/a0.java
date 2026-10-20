package p9;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements m9.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f12854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u8.e f12857d;

    public a0(c0 c0Var, long j10, Object obj, m9.l lVar) {
        this.f12854a = c0Var;
        this.f12855b = j10;
        this.f12856c = obj;
        this.f12857d = lVar;
    }

    @Override // m9.o0
    public final void a() {
        c0 c0Var = this.f12854a;
        synchronized (c0Var) {
            if (this.f12855b < c0Var.o()) {
                return;
            }
            Object[] objArr = c0Var.f12874o;
            d7.a.j(objArr);
            long j10 = this.f12855b;
            if (objArr[((int) j10) & (objArr.length - 1)] != this) {
                return;
            }
            d0.b(objArr, j10, d0.f12882a);
            c0Var.j();
        }
    }
}
