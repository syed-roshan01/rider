package u1;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o9.s f15025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o9.b f15026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o9.g f15028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(o9.g gVar, u8.e eVar) {
        super(2, eVar);
        this.f15028d = gVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new a2(this.f15028d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a2) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #2 {all -> 0x0059, blocks: (B:18:0x003d, B:20:0x0045), top: B:34:0x003d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0037 -> B:34:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            v8.a r0 = v8.a.f15963a
            int r1 = r7.f15027c
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            o9.b r1 = r7.f15026b
            o9.s r3 = r7.f15025a
            d7.t.v0(r8)     // Catch: java.lang.Throwable -> L15
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L3d
        L15:
            r8 = move-exception
            goto L63
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            d7.t.v0(r8)
            o9.g r3 = r7.f15028d
            o9.b r8 = r3.iterator()     // Catch: java.lang.Throwable -> L15
            r1 = r8
            r8 = r7
        L2a:
            r8.f15025a = r3     // Catch: java.lang.Throwable -> L15
            r8.f15026b = r1     // Catch: java.lang.Throwable -> L15
            r8.f15027c = r2     // Catch: java.lang.Throwable -> L15
            java.lang.Object r4 = r1.b(r8)     // Catch: java.lang.Throwable -> L15
            if (r4 != r0) goto L37
            return r0
        L37:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L3d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L59
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r3.c()     // Catch: java.lang.Throwable -> L59
            q8.l r8 = (q8.l) r8     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicBoolean r8 = u1.b2.f15032b     // Catch: java.lang.Throwable -> L59
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L59
            k0.y0.g()     // Catch: java.lang.Throwable -> L59
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L2a
        L59:
            r8 = move-exception
            r3 = r4
            goto L63
        L5c:
            r8 = 0
            h6.g.c(r4, r8)
            q8.l r8 = q8.l.f13235a
            return r8
        L63:
            throw r8     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            h6.g.c(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.a2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
