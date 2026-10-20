package a0;

import com.auto.accept.ui.viewmodel.MainViewModel;
import k0.e5;
import k0.q2;
import k0.t0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f867f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f868n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(MainViewModel mainViewModel, String str, int i10, String str2, c9.a aVar, int i11) {
        super(2);
        this.f862a = 4;
        this.f864c = mainViewModel;
        this.f868n = str;
        this.f866e = i10;
        this.f865d = str2;
        this.f863b = aVar;
        this.f867f = i11;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f866e;
        int i12 = this.f862a;
        Object obj = this.f863b;
        Object obj2 = this.f865d;
        Object obj3 = this.f868n;
        Object obj4 = this.f864c;
        switch (i12) {
            case 0:
                f6.a.f((c9.a) obj, (y0.o) obj4, (d0) obj3, (c9.e) obj2, mVar, m0.s.m(i11 | 1), this.f867f);
                break;
            case 1:
                k0.n.b((c9.a) obj, (y0.o) obj4, (o2.o) obj3, (c9.e) obj2, mVar, m0.s.m(i11 | 1), this.f867f);
                break;
            case 2:
                t0.a((k0.i0) obj, (q2) obj4, (e5) obj3, (c9.e) obj2, mVar, m0.s.m(i11 | 1), this.f867f);
                break;
            case 3:
                o2.j.a((o2.t) obj4, (c9.a) obj, (o2.u) obj3, (c9.e) obj2, mVar, m0.s.m(i11 | 1), this.f867f);
                break;
            default:
                y3.e.k((MainViewModel) obj4, (String) obj3, i11, (String) obj2, (c9.a) obj, mVar, m0.s.m(this.f867f | 1));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f862a) {
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
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Object obj2, Object obj3, c9.e eVar, int i10, int i11, int i12) {
        super(2);
        this.f862a = i12;
        this.f863b = obj;
        this.f864c = obj2;
        this.f868n = obj3;
        this.f865d = eVar;
        this.f866e = i10;
        this.f867f = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o2.t tVar, c9.a aVar, o2.u uVar, c9.e eVar, int i10, int i11) {
        super(2);
        this.f862a = 3;
        this.f864c = tVar;
        this.f863b = aVar;
        this.f868n = uVar;
        this.f865d = eVar;
        this.f866e = i10;
        this.f867f = i11;
    }
}
