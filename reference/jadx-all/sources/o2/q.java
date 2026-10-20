package o2;

import androidx.fragment.app.a0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9.t f12495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f12496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m2.j f12497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f12498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d9.t tVar, r rVar, m2.j jVar, long j10, long j11) {
        super(0);
        this.f12495a = tVar;
        this.f12496b = rVar;
        this.f12497c = jVar;
        this.f12498d = j11;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10;
        r rVar = this.f12496b;
        t positionProvider = rVar.getPositionProvider();
        rVar.getParentLayoutDirection();
        h0.j jVar = (h0.j) positionProvider;
        long jA = jVar.f7410b.a();
        if (!d9.i.u(jA)) {
            jA = jVar.f7411c;
        }
        jVar.f7411c = jA;
        int iOrdinal = jVar.f7409a.ordinal();
        if (iOrdinal != 0) {
            long j10 = this.f12498d;
            if (iOrdinal == 1) {
                i10 = (int) (j10 >> 32);
            } else {
                if (iOrdinal != 2) {
                    throw new a0();
                }
                i10 = ((int) (j10 >> 32)) / 2;
            }
        } else {
            i10 = 0;
        }
        long jC = i1.b.c(d7.t.p0(d1.c.d(jA)), d7.t.p0(d1.c.e(jA)));
        m2.j jVar2 = this.f12497c;
        int i11 = jVar2.f11810a;
        int i12 = m2.i.f11808c;
        this.f12495a.f4951a = i1.b.c((i11 + ((int) (jC >> 32))) - i10, jVar2.f11811b + ((int) (4294967295L & jC)));
        return q8.l.f13235a;
    }
}
