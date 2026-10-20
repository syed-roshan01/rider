package z;

import r1.k0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.w f17119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a0.w wVar, long j10, int i10, int i11, int i12) {
        super(3);
        this.f17118a = i12;
        this.f17119b = wVar;
        this.f17120c = j10;
        this.f17121d = i10;
        this.f17122e = i11;
    }

    public final k0 a(int i10, int i11, c9.c cVar) {
        r8.s sVar = r8.s.f13662a;
        int i12 = this.f17118a;
        a0.w wVar = this.f17119b;
        int i13 = this.f17122e;
        long j10 = this.f17120c;
        int i14 = this.f17121d;
        switch (i12) {
            case 0:
                return ((a0.x) wVar).f870b.N(o1.s.q(i10 + i14, j10), o1.s.p(i11 + i13, j10), sVar, cVar);
            default:
                return ((a0.x) wVar).f870b.N(o1.s.q(i10 + i14, j10), o1.s.p(i11 + i13, j10), sVar, cVar);
        }
    }

    @Override // c9.f
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        switch (this.f17118a) {
            case 0:
                break;
        }
        return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (c9.c) obj3);
    }
}
