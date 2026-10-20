package o2;

import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f12474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, u8.e eVar) {
        super(2, eVar);
        this.f12474c = rVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        h hVar = new h(this.f12474c, eVar);
        hVar.f12473b = obj;
        return hVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:13:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0048 -> B:14:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x005d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            v8.a r0 = v8.a.f15963a
            int r1 = r9.f12472a
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r9.f12473b
            m9.d0 r1 = (m9.d0) r1
            d7.t.v0(r10)
            r10 = r9
            goto L4b
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            d7.t.v0(r10)
            java.lang.Object r10 = r9.f12473b
            m9.d0 r10 = (m9.d0) r10
            r1 = r10
            r10 = r9
        L23:
            boolean r3 = d7.a.x(r1)
            if (r3 == 0) goto L65
            o2.b r3 = o2.b.f12451c
            r10.f12473b = r1
            r10.f12472a = r2
            u8.j r4 = r10.getContext()
            u1.c2 r5 = u1.c2.f15056a
            u8.h r4 = r4.f(r5)
            t.k.d(r4)
            u8.j r4 = r10.getContext()
            m0.a1 r4 = d9.i.p(r4)
            java.lang.Object r3 = r4.T(r3, r10)
            if (r3 != r0) goto L4b
            return r0
        L4b:
            o2.r r3 = r10.f12474c
            int[] r4 = r3.G
            r5 = 0
            r6 = r4[r5]
            r7 = r4[r2]
            android.view.View r8 = r3.f12502s
            r8.getLocationOnScreen(r4)
            r5 = r4[r5]
            if (r6 != r5) goto L61
            r4 = r4[r2]
            if (r7 == r4) goto L23
        L61:
            r3.j()
            goto L23
        L65:
            q8.l r10 = q8.l.f13235a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
