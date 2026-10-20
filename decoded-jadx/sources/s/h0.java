package s;

import t.x1;
import t.y1;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f13784b = new h0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f13785c = new h0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f13786d = new h0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h0 f13787e = new h0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f13788f = new h0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h0 f13789n = new h0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13790a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i10) {
        super(1);
        this.f13790a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f13790a;
        switch (i10) {
            case 0:
                long jA = e1.r.a(((e1.r) obj).f5067a, f1.e.f6047t);
                return new t.s(e1.r.d(jA), e1.r.h(jA), e1.r.g(jA), e1.r.e(jA));
            case 1:
                h0 h0Var = f13784b;
                q.w wVar = new q.w((f1.d) obj, 3);
                x1 x1Var = y1.f14355a;
                return new x1(h0Var, wVar);
            case 2:
                long j10 = ((e1.p0) obj).f5057a;
                return new t.q(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (4294967295L & j10)));
            case 3:
                t.q qVar = (t.q) obj;
                float f10 = qVar.f14279a;
                return new e1.p0((4294967295L & ((long) Float.floatToRawIntBits(qVar.f14280b))) | (Float.floatToRawIntBits(f10) << 32));
            case 4:
                switch (i10) {
                    case 4:
                        return t.e.r(0.0f, null, 7);
                    default:
                        return androidx.compose.animation.a.f1594c;
                }
            default:
                switch (i10) {
                    case 4:
                        return t.e.r(0.0f, null, 7);
                    default:
                        return androidx.compose.animation.a.f1594c;
                }
        }
    }
}
