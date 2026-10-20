package t;

import m0.l3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o9.b f14182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o9.g f14185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f14186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3 f14187f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l3 f14188n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o9.g gVar, d dVar, l3 l3Var, l3 l3Var2, u8.e eVar) {
        super(2, eVar);
        this.f14185d = gVar;
        this.f14186e = dVar;
        this.f14187f = l3Var;
        this.f14188n = l3Var2;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        h hVar = new h(this.f14185d, this.f14186e, this.f14187f, this.f14188n, eVar);
        hVar.f14184c = obj;
        return hVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x0048
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            v8.a r1 = v8.a.f15963a
            int r2 = r0.f14183b
            r3 = 1
            if (r2 == 0) goto L20
            if (r2 != r3) goto L18
            o9.b r2 = r0.f14182a
            java.lang.Object r4 = r0.f14184c
            m9.d0 r4 = (m9.d0) r4
            d7.t.v0(r18)
            r6 = r18
            r5 = r0
            goto L40
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            d7.t.v0(r18)
            java.lang.Object r2 = r0.f14184c
            m9.d0 r2 = (m9.d0) r2
            o9.g r4 = r0.f14185d
            o9.b r4 = r4.iterator()
            r5 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L33:
            r5.f14184c = r4
            r5.f14182a = r2
            r5.f14183b = r3
            java.lang.Object r6 = r2.b(r5)
            if (r6 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L71
            java.lang.Object r6 = r2.c()
            o9.g r7 = r5.f14185d
            java.lang.Object r7 = r7.m()
            boolean r8 = r7 instanceof o9.i
            r9 = 0
            if (r8 != 0) goto L58
            goto L59
        L58:
            r7 = r9
        L59:
            if (r7 != 0) goto L5d
            r11 = r6
            goto L5e
        L5d:
            r11 = r7
        L5e:
            t.g r6 = new t.g
            t.d r12 = r5.f14186e
            m0.l3 r13 = r5.f14187f
            m0.l3 r14 = r5.f14188n
            r15 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            r7 = 3
            r8 = 0
            z6.a.Q(r4, r9, r8, r6, r7)
            goto L33
        L71:
            q8.l r1 = q8.l.f13235a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
