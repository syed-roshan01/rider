package u;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f14775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, u8.e eVar) {
        super(eVar);
        this.f14775d = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        g gVar = new g(this.f14775d, eVar);
        gVar.f14774c = obj;
        return gVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:17:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x0076
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
