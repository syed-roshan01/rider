package v;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends w8.i implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15733a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i10, u8.e eVar) {
        super(3, eVar);
        this.f15733a = i10;
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        q8.l lVar = q8.l.f13235a;
        int i10 = 0;
        int i11 = 2;
        int i12 = this.f15733a;
        switch (i12) {
            case 0:
                long j10 = ((d1.c) obj2).f4330a;
                u8.e eVar = (u8.e) obj3;
                switch (i12) {
                    case 0:
                        new p0(i10, eVar).invokeSuspend(lVar);
                        break;
                    default:
                        new p0(i11, eVar).invokeSuspend(lVar);
                        break;
                }
                break;
            case 1:
                ((Number) obj2).floatValue();
                new p0(1, (u8.e) obj3).invokeSuspend(lVar);
                break;
            case 2:
                long j11 = ((d1.c) obj2).f4330a;
                u8.e eVar2 = (u8.e) obj3;
                switch (i12) {
                    case 0:
                        new p0(i10, eVar2).invokeSuspend(lVar);
                        break;
                    default:
                        new p0(i11, eVar2).invokeSuspend(lVar);
                        break;
                }
                break;
            default:
                long j12 = ((d1.c) obj2).f4330a;
                new p0(3, (u8.e) obj3).invokeSuspend(lVar);
                break;
        }
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f15733a) {
            case 0:
                v8.a aVar = v8.a.f15963a;
                d7.t.v0(obj);
                break;
            case 1:
                v8.a aVar2 = v8.a.f15963a;
                d7.t.v0(obj);
                break;
            case 2:
                v8.a aVar3 = v8.a.f15963a;
                d7.t.v0(obj);
                break;
            default:
                v8.a aVar4 = v8.a.f15963a;
                d7.t.v0(obj);
                break;
        }
        return lVar;
    }
}
