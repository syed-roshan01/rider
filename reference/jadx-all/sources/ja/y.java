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
        To view partially-correct add '--show-bad-code' argument
    */
    public final long I(ja.g r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            d7.a.m(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L76
            boolean r3 = r8.f8583e
            r3 = r3 ^ 1
            if (r3 == 0) goto L6a
            ja.b0 r3 = r8.f8581c
            ja.g r4 = r8.f8580b
            if (r3 == 0) goto L31
            ja.b0 r5 = r4.f8533a
            if (r3 != r5) goto L25
            int r3 = r8.f8582d
            d7.a.j(r5)
            int r5 = r5.f8508b
            if (r3 != r5) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            long r0 = r8.f8584f
            r2 = 1
            long r0 = r0 + r2
            ja.i r2 = r8.f8579a
            boolean r0 = r2.n(r0)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            ja.b0 r0 = r8.f8581c
            if (r0 != 0) goto L52
            ja.b0 r0 = r4.f8533a
            if (r0 == 0) goto L52
            r8.f8581c = r0
            int r0 = r0.f8508b
            r8.f8582d = r0
        L52:
            long r0 = r4.f8534b
            long r2 = r8.f8584f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            ja.g r2 = r8.f8580b
            long r3 = r8.f8584f
            r5 = r10
            r7 = r9
            r2.e(r3, r5, r7)
            long r0 = r8.f8584f
            long r0 = r0 + r10
            r8.f8584f = r0
            return r10
        L6a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L76:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = a7.a.l(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.y.I(ja.g, long):long");
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
