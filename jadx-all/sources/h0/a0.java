package h0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.c f7344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c9.c cVar, u8.e eVar) {
        super(eVar);
        this.f7344d = cVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        a0 a0Var = new a0(this.f7344d, eVar);
        a0Var.f7343c = obj;
        return a0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            v8.a r0 = v8.a.f15963a
            int r1 = r6.f7342b
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r6.f7343c
            o1.h0 r1 = (o1.h0) r1
            d7.t.v0(r7)
            r3 = r1
            r1 = r0
            r0 = r6
            goto L37
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            d7.t.v0(r7)
            java.lang.Object r7 = r6.f7343c
            o1.h0 r7 = (o1.h0) r7
            r1 = r7
            r7 = r6
        L25:
            o1.l r3 = o1.l.f12400a
            r7.f7343c = r1
            r7.f7342b = r2
            java.lang.Object r3 = r1.a(r3, r7)
            if (r3 != r0) goto L32
            return r0
        L32:
            r5 = r0
            r0 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L37:
            o1.k r7 = (o1.k) r7
            boolean r7 = d9.i.t(r7)
            r7 = r7 ^ r2
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            c9.c r4 = r0.f7344d
            r4.invoke(r7)
            r7 = r0
            r0 = r1
            r1 = r3
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
