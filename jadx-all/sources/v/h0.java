package v;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o1.u f15579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d9.t f15580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o1.h0 f15581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i1 f15582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d9.t f15583f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o1.u f15584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f15586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15588r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c9.c f15589s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c9.e f15590t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c9.a f15591u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c9.a f15592v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(c9.c cVar, c9.e eVar, c9.a aVar, c9.a aVar2, u8.e eVar2) {
        super(eVar2);
        this.f15589s = cVar;
        this.f15590t = eVar;
        this.f15591u = aVar;
        this.f15592v = aVar2;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        h0 h0Var = new h0(this.f15589s, this.f15590t, this.f15591u, this.f15592v, eVar);
        h0Var.f15588r = obj;
        return h0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0103  */
    /* JADX WARN: Code duplicated, block: B:34:0x011c A[LOOP:0: B:30:0x0101->B:34:0x011c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x012d A[EDGE_INSN: B:84:0x012d->B:36:0x012d BREAK  A[LOOP:0: B:30:0x0101->B:34:0x011c], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ad -> B:68:0x01e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0133 -> B:68:0x01e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x016a -> B:26:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01b2 -> B:61:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01e3 -> B:68:0x01e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x024a -> B:26:0x00d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
