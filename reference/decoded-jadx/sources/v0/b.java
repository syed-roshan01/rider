package v0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f15843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object[] f15846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, p pVar, l lVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f15841a = dVar;
        this.f15842b = pVar;
        this.f15843c = lVar;
        this.f15844d = str;
        this.f15845e = obj;
        this.f15846f = objArr;
    }

    @Override // c9.a
    public final Object invoke() {
        boolean z10;
        d dVar = this.f15841a;
        l lVar = dVar.f15849b;
        l lVar2 = this.f15843c;
        boolean z11 = true;
        if (lVar != lVar2) {
            dVar.f15849b = lVar2;
            z10 = true;
        } else {
            z10 = false;
        }
        String str = dVar.f15850c;
        String str2 = this.f15844d;
        if (d7.a.d(str, str2)) {
            z11 = z10;
        } else {
            dVar.f15850c = str2;
        }
        dVar.f15848a = this.f15842b;
        dVar.f15851d = this.f15845e;
        dVar.f15852e = this.f15846f;
        m mVar = dVar.f15853f;
        if (mVar != null && z11) {
            mVar.a();
            dVar.f15853f = null;
            dVar.c();
        }
        return q8.l.f13235a;
    }
}
