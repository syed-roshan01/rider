package p9;

/* JADX INFO: loaded from: classes.dex */
public final class u extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f12961a;

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        u uVar = new u(2, eVar);
        uVar.f12961a = ((Number) obj).intValue();
        return uVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create(Integer.valueOf(((Number) obj).intValue()), (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        return Boolean.valueOf(this.f12961a > 0);
    }
}
