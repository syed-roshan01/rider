package r8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f13674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13677f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f13678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Iterator f13680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f13681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f13682r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i10, int i11, Iterator it, boolean z10, boolean z11, u8.e eVar) {
        super(eVar);
        this.f13678n = i10;
        this.f13679o = i11;
        this.f13680p = it;
        this.f13681q = z10;
        this.f13682r = z11;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        y yVar = new y(this.f13678n, this.f13679o, this.f13680p, this.f13681q, this.f13682r, eVar);
        yVar.f13677f = obj;
        return yVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((k9.j) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009e -> B:16:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0146 -> B:73:0x0149). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x017b -> B:88:0x017e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
