package v0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f15861a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.f15861a = jVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        l lVar = this.f15861a.f15868c;
        return Boolean.valueOf(lVar != null ? lVar.a(obj) : true);
    }
}
