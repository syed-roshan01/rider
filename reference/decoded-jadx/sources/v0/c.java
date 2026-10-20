package v0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f15847a = dVar;
    }

    @Override // c9.a
    public final Object invoke() {
        d dVar = this.f15847a;
        p pVar = dVar.f15848a;
        Object obj = dVar.f15851d;
        if (obj != null) {
            return pVar.f15879a.invoke(dVar, obj);
        }
        throw new IllegalArgumentException("Value should be initialized".toString());
    }
}
