package q;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        super(gVar.f12992c);
        this.f12978d = 2;
        this.f12979e = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i10) {
        super(fVar.f13045c);
        this.f12978d = i10;
        if (i10 != 1) {
            this.f12979e = fVar;
        } else {
            this.f12979e = fVar;
            super(fVar.f13045c);
        }
    }
}
