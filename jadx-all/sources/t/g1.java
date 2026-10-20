package t;

import com.google.firebase.remoteconfig.internal.Code;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f14162b = new g1(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f14163c = new g1(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1 f14164d = new g1(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g1 f14165e = new g1(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g1 f14166f = new g1(6);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g1 f14167n = new g1(7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g1 f14168o = new g1(8);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g1 f14169p = new g1(9);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g1 f14170q = new g1(10);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g1 f14171r = new g1(11);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g1 f14172s = new g1(12);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g1 f14173t = new g1(13);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g1 f14174u = new g1(14);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g1 f14175v = new g1(15);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g1 f14176w = new g1(16);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g1 f14177x = new g1(17);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g1 f14178y = new g1(18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final g1 f14179z = new g1(19);
    public static final g1 A = new g1(20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i10) {
        super(1);
        this.f14180a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f14180a) {
            case 0:
                return lVar;
            case 1:
                return lVar;
            case 2:
                return lVar;
            case 3:
                long j10 = ((m2.f) obj).f11801a;
                long j11 = m2.f.f11799b;
                if (j10 == j11) {
                    throw new IllegalStateException("DpOffset is unspecified".toString());
                }
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                if (j10 != j11) {
                    return new q(fIntBitsToFloat, Float.intBitsToFloat((int) (j10 & 4294967295L)));
                }
                throw new IllegalStateException("DpOffset is unspecified".toString());
            case 4:
                q qVar = (q) obj;
                return new m2.f(i1.b.a(qVar.f14279a, qVar.f14280b));
            case 5:
                return new p(((m2.e) obj).f11798a);
            case 6:
                return new m2.e(((p) obj).f14272a);
            case 7:
                return new p(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((p) obj).f14272a);
            case 9:
                long j12 = ((m2.i) obj).f11809a;
                int i10 = m2.i.f11808c;
                return new q((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 10:
                q qVar2 = (q) obj;
                return new m2.i(i1.b.c(d7.t.p0(qVar2.f14279a), d7.t.p0(qVar2.f14280b)));
            case 11:
                long j13 = ((m2.k) obj).f11814a;
                return new q((int) (j13 >> 32), (int) (j13 & 4294967295L));
            case 12:
                q qVar3 = (q) obj;
                return new m2.k(o1.s.e(d7.t.p0(qVar3.f14279a), d7.t.p0(qVar3.f14280b)));
            case 13:
                return new p(((Number) obj).intValue());
            case Code.UNAVAILABLE /* 14 */:
                return Integer.valueOf((int) ((p) obj).f14272a);
            case 15:
                long j14 = ((d1.c) obj).f4330a;
                return new q(d1.c.d(j14), d1.c.e(j14));
            case Code.UNAUTHENTICATED /* 16 */:
                q qVar4 = (q) obj;
                return new d1.c(d9.i.f(qVar4.f14279a, qVar4.f14280b));
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                d1.d dVar = (d1.d) obj;
                return new s(dVar.f4332a, dVar.f4333b, dVar.f4334c, dVar.f4335d);
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                s sVar = (s) obj;
                return new d1.d(sVar.f14306a, sVar.f14307b, sVar.f14308c, sVar.f14309d);
            case 19:
                long j15 = ((d1.f) obj).f4347a;
                return new q(d1.f.d(j15), d1.f.b(j15));
            default:
                q qVar5 = (q) obj;
                return new d1.f(d7.t.j(qVar5.f14279a, qVar5.f14280b));
        }
    }
}
