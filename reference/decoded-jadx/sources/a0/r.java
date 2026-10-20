package a0;

import k0.a3;
import k0.x2;
import r1.e1;
import r1.h1;

/* JADX INFO: loaded from: classes.dex */
public final class r extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Object obj, int i10, a0 a0Var, c9.e eVar, int i11) {
        super(2);
        this.f851a = 1;
        this.f852b = obj;
        this.f853c = i10;
        this.f855e = a0Var;
        this.f856f = eVar;
        this.f854d = i11;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f853c;
        Object obj = this.f852b;
        Object obj2 = this.f856f;
        int i12 = this.f851a;
        int i13 = this.f854d;
        Object obj3 = this.f855e;
        switch (i12) {
            case 0:
                f6.a.k((s) obj3, obj, i11, obj2, mVar, m0.s.m(i13 | 1));
                break;
            case 1:
                f6.a.g(obj, i11, (a0) obj3, (c9.e) obj2, mVar, m0.s.m(i13 | 1));
                break;
            case 2:
                m9.e0.e((x2) obj3, (y0.o) obj, (c9.f) obj2, mVar, m0.s.m(i11 | 1), this.f854d);
                break;
            case 3:
                m9.e0.i((a3) obj3, (y0.o) obj, (c9.f) obj2, mVar, m0.s.m(i11 | 1), this.f854d);
                break;
            case 4:
                e1.a((h1) obj3, (y0.o) obj, (c9.e) obj2, mVar, m0.s.m(i11 | 1), this.f854d);
                break;
            case 5:
                o1.s.d((c9.a) obj3, (o2.o) obj, (c9.e) obj2, mVar, m0.s.m(i11 | 1), this.f854d);
                break;
            default:
                y3.e.s((String) obj3, (String) obj, i11, (c9.a) obj2, mVar, m0.s.m(i13 | 1));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f851a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        super(2);
        this.f851a = i12;
        this.f855e = obj;
        this.f852b = obj2;
        this.f853c = i10;
        this.f856f = obj3;
        this.f854d = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, q8.a aVar, int i10, int i11, int i12) {
        super(2);
        this.f851a = i12;
        this.f855e = obj;
        this.f852b = obj2;
        this.f856f = aVar;
        this.f853c = i10;
        this.f854d = i11;
    }
}
