package b0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o1.u f2344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o1.u f2345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0 f2348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h0 h0Var, u8.e eVar) {
        super(eVar);
        this.f2348f = h0Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        d dVar = new d(this.f2348f, eVar);
        dVar.f2347e = obj;
        return dVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090 A[LOOP:0: B:20:0x007c->B:24:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x008a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006c -> B:19:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            v8.a r0 = v8.a.f15963a
            int r1 = r13.f2346d
            o1.l r2 = o1.l.f12400a
            r3 = 1
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L30
            if (r1 == r3) goto L28
            if (r1 != r4) goto L20
            o1.u r1 = r13.f2345c
            o1.u r3 = r13.f2344b
            java.lang.Object r6 = r13.f2347e
            o1.h0 r6 = (o1.h0) r6
            d7.t.v0(r14)
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r13
            goto L73
        L20:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L28:
            java.lang.Object r1 = r13.f2347e
            o1.h0 r1 = (o1.h0) r1
            d7.t.v0(r14)
            goto L43
        L30:
            d7.t.v0(r14)
            java.lang.Object r14 = r13.f2347e
            r1 = r14
            o1.h0 r1 = (o1.h0) r1
            r13.f2347e = r1
            r13.f2346d = r3
            java.lang.Object r14 = v.k3.b(r1, r5, r2, r13)
            if (r14 != r0) goto L43
            return r0
        L43:
            o1.u r14 = (o1.u) r14
            long r6 = d1.c.f4326b
            b0.h0 r3 = r13.f2348f
            r3.getClass()
            d1.c r8 = new d1.c
            r8.<init>(r6)
            m0.n1 r3 = r3.f2393a
            r3.setValue(r8)
            r3 = 0
            r6 = r1
            r1 = r3
            r3 = r14
            r14 = r13
        L5b:
            if (r1 != 0) goto La2
            r14.f2347e = r6
            r14.f2344b = r3
            r14.f2345c = r1
            r14.f2346d = r4
            java.lang.Object r7 = r6.a(r2, r14)
            if (r7 != r0) goto L6c
            return r0
        L6c:
            r12 = r0
            r0 = r14
            r14 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r12
        L73:
            o1.k r14 = (o1.k) r14
            java.util.List r8 = r14.f12397a
            int r9 = r8.size()
            r10 = r5
        L7c:
            if (r10 >= r9) goto L93
            java.lang.Object r11 = r8.get(r10)
            o1.u r11 = (o1.u) r11
            boolean r11 = m9.e0.s(r11)
            if (r11 != 0) goto L90
            r14 = r0
            r0 = r1
            r1 = r3
            r3 = r6
            r6 = r7
            goto L5b
        L90:
            int r10 = r10 + 1
            goto L7c
        L93:
            java.util.List r14 = r14.f12397a
            java.lang.Object r14 = r14.get(r5)
            o1.u r14 = (o1.u) r14
            r3 = r6
            r6 = r7
            r12 = r1
            r1 = r14
            r14 = r0
            r0 = r12
            goto L5b
        La2:
            long r2 = r3.f12416c
            long r0 = r1.f12416c
            long r0 = d1.c.f(r0, r2)
            b0.h0 r14 = r14.f2348f
            r14.getClass()
            d1.c r2 = new d1.c
            r2.<init>(r0)
            m0.n1 r14 = r14.f2393a
            r14.setValue(r2)
            q8.l r14 = q8.l.f13235a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
