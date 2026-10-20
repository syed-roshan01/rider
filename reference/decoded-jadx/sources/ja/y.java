package ja;

/* JADX INFO: loaded from: classes.dex */
public final class y implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f8581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8584f;

    public y(i iVar) {
        d7.a.m(iVar, "upstream");
        this.f8579a = iVar;
        g gVarA = iVar.A();
        this.f8580b = gVarA;
        b0 b0Var = gVarA.f8533a;
        this.f8581c = b0Var;
        this.f8582d = b0Var != null ? b0Var.f8508b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3 == r5.f8508b) goto L15;
     */
    @Override // ja.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long I(g gVar, long j10) {
        b0 b0Var;
        d7.a.m(gVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f8583e)) {
            throw new IllegalStateException("closed".toString());
        }
        b0 b0Var2 = this.f8581c;
        g gVar2 = this.f8580b;
        if (b0Var2 != null) {
            b0 b0Var3 = gVar2.f8533a;
            if (b0Var2 == b0Var3) {
                int i10 = this.f8582d;
                d7.a.j(b0Var3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f8579a.n(this.f8584f + 1)) {
            return -1L;
        }
        if (this.f8581c == null && (b0Var = gVar2.f8533a) != null) {
            this.f8581c = b0Var;
            this.f8582d = b0Var.f8508b;
        }
        long jMin = Math.min(j10, gVar2.f8534b - this.f8584f);
        this.f8580b.e(this.f8584f, jMin, gVar);
        this.f8584f += jMin;
        return jMin;
    }

    @Override // ja.g0
    public final i0 c() {
        return this.f8579a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8583e = true;
    }
}
