package v;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f15807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.e f15808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, c9.e eVar, u8.e eVar2) {
        super(2, eVar2);
        this.f15807c = yVar;
        this.f15808d = eVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        v vVar = new v(this.f15807c, this.f15808d, eVar);
        vVar.f15806b = obj;
        return vVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((r1) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15805a;
        y yVar = this.f15807c;
        try {
            if (i10 == 0) {
                d7.t.v0(obj);
                r1 r1Var = (r1) this.f15806b;
                yVar.f15829d.setValue(Boolean.TRUE);
                c9.e eVar = this.f15808d;
                this.f15805a = 1;
                if (eVar.invoke(r1Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            yVar.f15829d.setValue(Boolean.FALSE);
            return q8.l.f13235a;
        } catch (Throwable th) {
            yVar.f15829d.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
