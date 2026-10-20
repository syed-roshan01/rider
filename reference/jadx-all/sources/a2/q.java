package a2;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f967b = 0;

    static {
        m2.o[] oVarArr = m2.n.f11819b;
        f966a = m2.n.f11820c;
    }

    public static final p a(p pVar, int i10, int i11, long j10, l2.q qVar, r rVar, l2.g gVar, int i12, int i13, l2.r rVar2) {
        long j11;
        int i14 = i10;
        int i15 = i11;
        l2.q qVar2 = qVar;
        r rVar3 = rVar;
        l2.g gVar2 = gVar;
        int i16 = i12;
        int i17 = i13;
        l2.r rVar4 = rVar2;
        if (l2.i.a(i10, Integer.MIN_VALUE) || l2.i.a(i10, pVar.f957a)) {
            if (!o1.s.V(j10)) {
                j11 = j10;
                if (m2.n.a(j11, pVar.f959c)) {
                }
            } else {
                j11 = j10;
            }
            if ((qVar2 == null || d7.a.d(qVar2, pVar.f960d)) && ((l2.k.a(i15, Integer.MIN_VALUE) || l2.k.a(i15, pVar.f958b)) && ((rVar3 == null || d7.a.d(rVar3, pVar.f961e)) && ((gVar2 == null || d7.a.d(gVar2, pVar.f962f)) && ((i16 == 0 || i16 == pVar.f963g) && ((l2.d.a(i17, Integer.MIN_VALUE) || l2.d.a(i17, pVar.f964h)) && (rVar4 == null || d7.a.d(rVar4, pVar.f965i)))))))) {
                return pVar;
            }
        } else {
            j11 = j10;
        }
        long j12 = o1.s.V(j10) ? pVar.f959c : j11;
        if (qVar2 == null) {
            qVar2 = pVar.f960d;
        }
        if (l2.i.a(i10, Integer.MIN_VALUE)) {
            i14 = pVar.f957a;
        }
        if (l2.k.a(i15, Integer.MIN_VALUE)) {
            i15 = pVar.f958b;
        }
        r rVar5 = pVar.f961e;
        if (rVar5 != null && rVar3 == null) {
            rVar3 = rVar5;
        }
        if (gVar2 == null) {
            gVar2 = pVar.f962f;
        }
        if (i16 == 0) {
            i16 = pVar.f963g;
        }
        if (l2.d.a(i17, Integer.MIN_VALUE)) {
            i17 = pVar.f964h;
        }
        if (rVar4 == null) {
            rVar4 = pVar.f965i;
        }
        return new p(i14, i15, j12, qVar2, rVar3, gVar2, i16, i17, rVar4);
    }
}
