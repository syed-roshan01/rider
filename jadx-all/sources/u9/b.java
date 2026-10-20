package u9;

import q8.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f15442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f15443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i10) {
        super(1);
        this.f15441a = i10;
        this.f15442b = dVar;
        this.f15443c = cVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        l lVar = l.f13235a;
        c cVar = this.f15443c;
        d dVar = this.f15442b;
        int i10 = this.f15441a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        dVar.d(cVar.f15445b);
                        break;
                    default:
                        d.f15447h.set(dVar, cVar.f15445b);
                        dVar.d(cVar.f15445b);
                        break;
                }
                break;
            default:
                switch (i10) {
                    case 0:
                        dVar.d(cVar.f15445b);
                        break;
                    default:
                        d.f15447h.set(dVar, cVar.f15445b);
                        dVar.d(cVar.f15445b);
                        break;
                }
                break;
        }
        return lVar;
    }
}
