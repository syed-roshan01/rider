package v;

/* JADX INFO: loaded from: classes.dex */
public final class i extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d9.u f15610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d9.u f15611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f15614e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, u8.e eVar) {
        super(2, eVar);
        this.f15614e = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        i iVar = new i(this.f15614e, eVar);
        iVar.f15613d = obj;
        return iVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca A[Catch: CancellationException -> 0x00e1, TryCatch #0 {CancellationException -> 0x00e1, blocks: (B:40:0x00c4, B:42:0x00ca, B:46:0x00e3, B:48:0x00e7), top: B:60:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3 A[Catch: CancellationException -> 0x00e1, TryCatch #0 {CancellationException -> 0x00e1, blocks: (B:40:0x00c4, B:42:0x00ca, B:46:0x00e3, B:48:0x00e7), top: B:60:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7 A[Catch: CancellationException -> 0x00e1, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00e1, blocks: (B:40:0x00c4, B:42:0x00ca, B:46:0x00e3, B:48:0x00e7), top: B:60:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f7 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x010d -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
