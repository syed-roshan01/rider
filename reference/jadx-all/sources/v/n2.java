package v;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1.u f15720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(o1.u uVar, u8.e eVar) {
        super(eVar);
        this.f15720e = uVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        n2 n2Var = new n2(this.f15720e, eVar);
        n2Var.f15719d = obj;
        return n2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0045 -> B:13:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            v8.a r0 = v8.a.f15963a
            int r1 = r9.f15718c
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            long r3 = r9.f15717b
            java.lang.Object r1 = r9.f15719d
            o1.h0 r1 = (o1.h0) r1
            d7.t.v0(r10)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L4b
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            d7.t.v0(r10)
            java.lang.Object r10 = r9.f15719d
            o1.h0 r10 = (o1.h0) r10
            o1.u r1 = r9.f15720e
            long r3 = r1.f12415b
            u1.y2 r1 = r10.g()
            r1.c()
            r5 = 40
            long r5 = r5 + r3
            r1 = r10
            r3 = r5
            r10 = r9
        L37:
            r10.f15719d = r1
            r10.f15717b = r3
            r10.f15718c = r2
            r5 = 3
            java.lang.Object r5 = v.k3.c(r1, r10, r5)
            if (r5 != r0) goto L45
            return r0
        L45:
            r8 = r0
            r0 = r10
            r10 = r5
            r4 = r3
            r3 = r1
            r1 = r8
        L4b:
            o1.u r10 = (o1.u) r10
            long r6 = r10.f12415b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L54
            return r10
        L54:
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
