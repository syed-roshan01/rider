package g8;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(v0 v0Var, e8.j jVar, e8.c2 c2Var) {
        super(v0Var.f7163c, 0);
        this.f6710c = 3;
        this.f6713f = v0Var;
        this.f6711d = jVar;
        this.f6712e = c2Var;
    }

    @Override // g8.q0
    public final void b() {
        int i10 = this.f6710c;
        Object obj = this.f6713f;
        Object obj2 = this.f6712e;
        Object obj3 = this.f6711d;
        switch (i10) {
            case 0:
                e8.c2 c2VarG = e8.c2.f5223l.g(String.format("Unable to find compressor by name %s", (String) obj2));
                e8.l1 l1Var = new e8.l1();
                ((g0) obj).getClass();
                ((e8.j) obj3).onClose(c2VarG, l1Var);
                return;
            case 1:
                o8.b.d();
                try {
                    o8.c cVar = ((f0) obj).f6758c.f6771b;
                    o8.b.a();
                    o8.b.b();
                    if (((f0) obj).f6757b == null) {
                        try {
                            ((f0) obj).f6756a.onHeaders((e8.l1) obj2);
                        } catch (Throwable th) {
                            f0 f0Var = (f0) obj;
                            e8.c2 c2VarG2 = e8.c2.f5217f.f(th).g("Failed to read headers");
                            f0Var.f6757b = c2VarG2;
                            f0Var.f6758c.f6779j.i(c2VarG2);
                        }
                        break;
                    }
                    o8.b.f12664a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        o8.b.f12664a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 2:
                o8.b.d();
                try {
                    o8.c cVar2 = ((f0) obj).f6758c.f6771b;
                    o8.b.a();
                    o8.b.b();
                    c();
                    o8.b.f12664a.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        o8.b.f12664a.getClass();
                        break;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            case 3:
                ((e8.j) obj3).onClose((e8.c2) obj2, new e8.l1());
                return;
            default:
                ((e8.j) obj3).onClose((e8.c2) obj2, new e8.l1());
                return;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003a */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f6713f
            r1 = r0
            g8.f0 r1 = (g8.f0) r1
            e8.c2 r2 = r1.f6757b
            java.lang.Object r3 = r6.f6712e
            if (r2 == 0) goto L1a
            g8.a6 r3 = (g8.a6) r3
            java.util.logging.Logger r0 = g8.s1.f7085a
        Lf:
            java.io.InputStream r0 = r3.next()
            if (r0 == 0) goto L19
            g8.s1.b(r0)
            goto Lf
        L19:
            return
        L1a:
            r2 = r3
            g8.a6 r2 = (g8.a6) r2     // Catch: java.lang.Throwable -> L3a
            java.io.InputStream r2 = r2.next()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L64
            r4 = r0
            g8.f0 r4 = (g8.f0) r4     // Catch: java.lang.Throwable -> L3c
            e8.j r4 = r4.f6756a     // Catch: java.lang.Throwable -> L3c
            r5 = r0
            g8.f0 r5 = (g8.f0) r5     // Catch: java.lang.Throwable -> L3c
            g8.g0 r5 = r5.f6758c     // Catch: java.lang.Throwable -> L3c
            e8.p1 r5 = r5.f6770a     // Catch: java.lang.Throwable -> L3c
            com.google.protobuf.t1 r5 = r5.c(r2)     // Catch: java.lang.Throwable -> L3c
            r4.onMessage(r5)     // Catch: java.lang.Throwable -> L3c
            r2.close()     // Catch: java.lang.Throwable -> L3a
            goto L1a
        L3a:
            r0 = move-exception
            goto L41
        L3c:
            r0 = move-exception
            g8.s1.b(r2)     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        L41:
            g8.a6 r3 = (g8.a6) r3
            java.util.logging.Logger r2 = g8.s1.f7085a
        L45:
            java.io.InputStream r2 = r3.next()
            if (r2 == 0) goto L4f
            g8.s1.b(r2)
            goto L45
        L4f:
            e8.c2 r2 = e8.c2.f5217f
            e8.c2 r0 = r2.f(r0)
            java.lang.String r2 = "Failed to read message."
            e8.c2 r0 = r0.g(r2)
            r1.f6757b = r0
            g8.g0 r1 = r1.f6758c
            g8.h0 r1 = r1.f6779j
            r1.i(r0)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.d0.c():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, e8.j jVar, String str) {
        super(g0Var.f6775f, 0);
        this.f6710c = 0;
        this.f6713f = g0Var;
        this.f6711d = jVar;
        this.f6712e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, e8.l1 l1Var) {
        super(f0Var.f6758c.f6775f, 0);
        a4.q qVar = o8.a.f12663b;
        this.f6710c = 1;
        this.f6713f = f0Var;
        this.f6711d = qVar;
        this.f6712e = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, a6 a6Var) {
        super(f0Var.f6758c.f6775f, 0);
        a4.q qVar = o8.a.f12663b;
        this.f6710c = 2;
        this.f6713f = f0Var;
        this.f6711d = qVar;
        this.f6712e = a6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(z2 z2Var, e8.j jVar, e8.c2 c2Var) {
        super(z2Var.f7305e, 0);
        this.f6710c = 4;
        this.f6713f = z2Var;
        this.f6711d = jVar;
        this.f6712e = c2Var;
    }
}
