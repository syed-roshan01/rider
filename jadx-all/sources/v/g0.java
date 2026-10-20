package v;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o1.k f15555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d9.u f15559f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d9.u f15560n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(d9.u uVar, d9.u uVar2, u8.e eVar) {
        super(eVar);
        this.f15559f = uVar;
        this.f15560n = uVar2;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        g0 g0Var = new g0(this.f15559f, this.f15560n, eVar);
        g0Var.f15558e = obj;
        return g0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f A[LOOP:2: B:17:0x0060->B:21:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0073 A[EDGE_INSN: B:72:0x0073->B:23:0x0073 BREAK  A[LOOP:2: B:17:0x0060->B:21:0x006f], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:36:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
