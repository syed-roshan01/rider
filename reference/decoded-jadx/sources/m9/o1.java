package m9;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t1 f11981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r9.j f11982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f11984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f11985f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(u8.e eVar, p1 p1Var) {
        super(eVar);
        this.f11985f = p1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        o1 o1Var = new o1(eVar, this.f11985f);
        o1Var.f11984e = obj;
        return o1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o1) create((k9.j) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0064 -> B:26:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0078 -> B:26:0x007b). Please report as a decompilation issue!!! */
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
            int r1 = r7.f11983d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            r9.j r1 = r7.f11982c
            m9.t1 r3 = r7.f11981b
            java.lang.Object r4 = r7.f11984e
            k9.j r4 = (k9.j) r4
            d7.t.v0(r8)
            r8 = r7
            goto L7b
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            d7.t.v0(r8)
            goto L80
        L25:
            d7.t.v0(r8)
            java.lang.Object r8 = r7.f11984e
            k9.j r8 = (k9.j) r8
            m9.p1 r1 = r7.f11985f
            java.lang.Object r1 = r1.N()
            boolean r4 = r1 instanceof m9.p
            if (r4 == 0) goto L40
            m9.p r1 = (m9.p) r1
            m9.q r1 = r1.f11986e
            r7.f11983d = r3
            r8.c(r1, r7)
            return r0
        L40:
            boolean r3 = r1 instanceof m9.b1
            if (r3 == 0) goto L80
            m9.b1 r1 = (m9.b1) r1
            m9.t1 r1 = r1.f()
            if (r1 == 0) goto L80
            java.lang.Object r3 = r1.j()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            d7.a.k(r3, r4)
            r9.j r3 = (r9.j) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L5c:
            boolean r5 = d7.a.d(r1, r3)
            if (r5 != 0) goto L80
            boolean r5 = r1 instanceof m9.p
            if (r5 == 0) goto L7b
            r5 = r1
            m9.p r5 = (m9.p) r5
            r8.f11984e = r4
            r8.f11981b = r3
            r8.f11982c = r1
            r8.f11983d = r2
            m9.q r5 = r5.f11986e
            r4.c(r5, r8)
            v8.a r5 = v8.a.f15963a
            if (r5 != r0) goto L7b
            return r0
        L7b:
            r9.j r1 = r1.k()
            goto L5c
        L80:
            q8.l r8 = q8.l.f13235a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
