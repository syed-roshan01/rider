package v;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f15528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(g1 g1Var, u8.e eVar) {
        super(eVar);
        this.f15528d = g1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        e1 e1Var = new e1(this.f15528d, eVar);
        e1Var.f15527c = obj;
        return e1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f A[LOOP:1: B:20:0x006b->B:22:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[EDGE_INSN: B:29:0x0083->B:23:0x0083 BREAK  A[LOOP:1: B:20:0x006b->B:22:0x006f], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x006b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            v8.a r0 = v8.a.f15963a
            int r1 = r14.f15526b
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r14.f15527c
            o1.h0 r1 = (o1.h0) r1
            d7.t.v0(r15)
            r3 = r1
            r1 = r0
            r0 = r14
            goto L35
        L14:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1c:
            d7.t.v0(r15)
            java.lang.Object r15 = r14.f15527c
            o1.h0 r15 = (o1.h0) r15
            r1 = r15
            r15 = r14
        L25:
            r15.f15527c = r1
            r15.f15526b = r2
            java.lang.Object r3 = androidx.compose.foundation.gestures.a.a(r1, r15)
            if (r3 != r0) goto L30
            return r0
        L30:
            r13 = r0
            r0 = r15
            r15 = r3
            r3 = r1
            r1 = r13
        L35:
            o1.k r15 = (o1.k) r15
            java.util.List r4 = r15.f12397a
            int r5 = r4.size()
            r6 = 0
            r7 = r6
        L3f:
            if (r7 >= r5) goto L52
            java.lang.Object r8 = r4.get(r7)
            o1.u r8 = (o1.u) r8
            boolean r8 = r8.b()
            r8 = r8 ^ r2
            if (r8 != 0) goto L4f
            goto Lb1
        L4f:
            int r7 = r7 + 1
            goto L3f
        L52:
            v.g1 r4 = r0.f15528d
            v.k r5 = r4.f15562x
            d7.a.j(r5)
            o1.j0 r5 = r3.f12379e
            long r7 = r5.A
            long r7 = d1.c.f4326b
            d1.c r5 = new d1.c
            r5.<init>(r7)
            java.util.List r15 = r15.f12397a
            int r7 = r15.size()
            r8 = r6
        L6b:
            long r9 = r5.f4330a
            if (r8 >= r7) goto L83
            java.lang.Object r5 = r15.get(r8)
            o1.u r5 = (o1.u) r5
            long r11 = r5.f12423j
            long r9 = d1.c.g(r9, r11)
            d1.c r5 = new d1.c
            r5.<init>(r9)
            int r8 = r8 + 1
            goto L6b
        L83:
            r5 = 64
            float r5 = (float) r5
            float r5 = r3.v(r5)
            float r5 = -r5
            long r7 = d1.c.h(r5, r9)
            m9.d0 r5 = r4.v0()
            v.d1 r9 = new v.d1
            v.l2 r4 = r4.f15561w
            r10 = 0
            r9.<init>(r4, r7, r10)
            r4 = 3
            z6.a.Q(r5, r10, r6, r9, r4)
            int r4 = r15.size()
        La3:
            if (r6 >= r4) goto Lb1
            java.lang.Object r5 = r15.get(r6)
            o1.u r5 = (o1.u) r5
            r5.a()
            int r6 = r6 + 1
            goto La3
        Lb1:
            r15 = r0
            r0 = r1
            r1 = r3
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
