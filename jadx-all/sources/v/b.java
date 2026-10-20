package v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f15478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m9.d0 f15479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m9.d0 f15482f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f15483n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, u8.e eVar, m9.d0 d0Var) {
        super(eVar);
        this.f15482f = d0Var;
        this.f15483n = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        b bVar = new b(this.f15483n, eVar, this.f15482f);
        bVar.f15481e = obj;
        return bVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [n9.d, u8.e] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v4, types: [m9.d0, v.j] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bf -> B:81:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0138 -> B:52:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x015f -> B:70:0x014a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
