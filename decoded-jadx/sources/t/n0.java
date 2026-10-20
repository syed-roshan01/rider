package t;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d9.r f14255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.g1 f14258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f14259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m0.g1 g1Var, p0 p0Var, u8.e eVar) {
        super(2, eVar);
        this.f14258d = g1Var;
        this.f14259e = p0Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        n0 n0Var = new n0(this.f14258d, this.f14259e, eVar);
        n0Var.f14257c = obj;
        return n0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:12:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:12:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0072
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            v8.a r0 = v8.a.f15963a
            int r1 = r12.f14256b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L1f
            if (r1 != r3) goto L17
            d9.r r1 = r12.f14255a
            java.lang.Object r4 = r12.f14257c
            m9.d0 r4 = (m9.d0) r4
            d7.t.v0(r13)
            r13 = r4
            goto L3b
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            d9.r r1 = r12.f14255a
            java.lang.Object r4 = r12.f14257c
            m9.d0 r4 = (m9.d0) r4
            d7.t.v0(r13)
            r13 = r4
            r4 = r12
            goto L6b
        L2b:
            d7.t.v0(r13)
            java.lang.Object r13 = r12.f14257c
            m9.d0 r13 = (m9.d0) r13
            d9.r r1 = new d9.r
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f4949a = r4
        L3b:
            r4 = r12
        L3c:
            t.a r11 = new t.a
            m0.g1 r6 = r4.f14258d
            t.p0 r7 = r4.f14259e
            r10 = 1
            r5 = r11
            r8 = r1
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r4.f14257c = r13
            r4.f14255a = r1
            r4.f14256b = r2
            u8.j r5 = r4.getContext()
            u1.c2 r6 = u1.c2.f15056a
            u8.h r5 = r5.f(r6)
            t.k.d(r5)
            u8.j r5 = r4.getContext()
            m0.a1 r5 = d9.i.p(r5)
            java.lang.Object r5 = r5.T(r11, r4)
            if (r5 != r0) goto L6b
            return r0
        L6b:
            float r5 = r1.f4949a
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L3c
            t.l0 r5 = new t.l0
            r6 = 0
            r5.<init>(r13, r6)
            a4.c0 r5 = d7.t.t0(r5)
            t.m0 r6 = new t.m0
            r7 = 0
            r6.<init>(r3, r7)
            r4.f14257c = r13
            r4.f14255a = r1
            r4.f14256b = r3
            java.lang.Object r5 = h6.g.W(r5, r6, r4)
            if (r5 != r0) goto L3c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
