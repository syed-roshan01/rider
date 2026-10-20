package w0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f16094f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f16095n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, u8.e eVar) {
        super(eVar);
        this.f16095n = nVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        m mVar = new m(this.f16095n, eVar);
        mVar.f16094f = obj;
        return mVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((k9.j) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:19:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ad -> B:32:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b0 -> B:32:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e4 -> B:44:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e7 -> B:44:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
