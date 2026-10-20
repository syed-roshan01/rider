package a0;

import h0.v0;
import r1.h1;
import t1.l1;
import u1.s1;
import u1.w2;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i10, int i11, Object obj, Object obj2, Object obj3) {
        super(2);
        this.f803a = i11;
        this.f805c = obj;
        this.f806d = obj2;
        this.f807e = obj3;
        this.f804b = i10;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f803a;
        int i12 = this.f804b;
        Object obj = this.f807e;
        Object obj2 = this.f806d;
        Object obj3 = this.f805c;
        switch (i11) {
            case 0:
                f6.a.h((d0) obj3, (q) obj2, (h1) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 1:
                ((o0) obj3).f(obj2, (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 2:
                d7.t.c((y0.o) obj3, (v0) obj2, (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 3:
                d7.t.e((h0.m) obj3, (h0.k) obj2, (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 4:
                ((u0.b) obj3).b(obj2, obj, mVar, m0.s.m(i12) | 1);
                break;
            case 5:
                ((v0.j) obj3).f(obj2, (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
            default:
                s1.a((l1) obj3, (w2) obj2, (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f803a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 1:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 2:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 3:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 4:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 5:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
