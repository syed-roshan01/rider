package e1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f5060b = androidx.compose.ui.graphics.a.c(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f5061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f5062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f5063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f5064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f5065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5066h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5067a;

    static {
        androidx.compose.ui.graphics.a.c(4282664004L);
        androidx.compose.ui.graphics.a.c(4287137928L);
        androidx.compose.ui.graphics.a.c(4291611852L);
        f5061c = androidx.compose.ui.graphics.a.c(4294967295L);
        f5062d = androidx.compose.ui.graphics.a.c(4294901760L);
        androidx.compose.ui.graphics.a.c(4278255360L);
        f5063e = androidx.compose.ui.graphics.a.c(4278190335L);
        androidx.compose.ui.graphics.a.c(4294967040L);
        androidx.compose.ui.graphics.a.c(4278255615L);
        androidx.compose.ui.graphics.a.c(4294902015L);
        f5064f = androidx.compose.ui.graphics.a.b(0);
        f5065g = androidx.compose.ui.graphics.a.a(0.0f, 0.0f, 0.0f, 0.0f, f1.e.f6046s);
    }

    public /* synthetic */ r(long j10) {
        this.f5067a = j10;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    public static final long a(long j10, f1.d dVar) {
        f1.h fVar;
        long j11;
        long j12;
        f1.h hVar;
        f1.d dVarF = f(j10);
        if (d7.a.d(dVar, dVarF)) {
            return j10;
        }
        f1.q qVar = f1.e.f6030c;
        if (dVarF == qVar) {
            if (dVar == qVar) {
                fVar = f1.h.f6052e;
            } else if (dVar == f1.e.f6047t) {
                fVar = f1.h.f6053f;
            } else if (dVarF == dVar) {
                f1.f fVar2 = f1.h.f6052e;
                fVar = new f1.f(dVarF, dVarF, 1);
            } else {
                j11 = dVarF.f6026b;
                j12 = f1.c.f6020a;
                if (f1.c.a(j11, j12) || !f1.c.a(dVar.f6026b, j12)) {
                    hVar = new f1.h(dVarF, dVar, 0);
                } else {
                    hVar = new f1.g((f1.q) dVarF, (f1.q) dVar, 0);
                }
                fVar = hVar;
            }
        } else if (dVarF == f1.e.f6047t && dVar == qVar) {
            fVar = f1.h.f6054g;
        } else if (dVarF == dVar) {
            f1.f fVar3 = f1.h.f6052e;
            fVar = new f1.f(dVarF, dVarF, 1);
        } else {
            j11 = dVarF.f6026b;
            j12 = f1.c.f6020a;
            if (f1.c.a(j11, j12)) {
                hVar = new f1.h(dVarF, dVar, 0);
            } else {
                hVar = new f1.h(dVarF, dVar, 0);
            }
            fVar = hVar;
        }
        return fVar.a(h(j10), g(j10), e(j10), d(j10));
    }

    public static long b(long j10, float f10) {
        return androidx.compose.ui.graphics.a.a(h(j10), g(j10), e(j10), f10, f(j10));
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        float fA0;
        float f10;
        if ((63 & j10) == 0) {
            fA0 = (float) h6.g.A0((j10 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fA0 = (float) h6.g.A0((j10 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fA0 / f10;
    }

    public static final float e(long j10) {
        return (63 & j10) == 0 ? ((float) h6.g.A0((j10 >>> 32) & 255)) / 255.0f : v.b((short) ((j10 >>> 16) & 65535));
    }

    public static final f1.d f(long j10) {
        float[] fArr = f1.e.f6028a;
        return f1.e.f6048u[(int) (j10 & 63)];
    }

    public static final float g(long j10) {
        return (63 & j10) == 0 ? ((float) h6.g.A0((j10 >>> 40) & 255)) / 255.0f : v.b((short) ((j10 >>> 32) & 65535));
    }

    public static final float h(long j10) {
        return (63 & j10) == 0 ? ((float) h6.g.A0((j10 >>> 48) & 255)) / 255.0f : v.b((short) ((j10 >>> 48) & 65535));
    }

    public static String i(long j10) {
        return "Color(" + h(j10) + ", " + g(j10) + ", " + e(j10) + ", " + d(j10) + ", " + f(j10).f6025a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f5067a == ((r) obj).f5067a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5067a);
    }

    public final String toString() {
        return i(this.f5067a);
    }
}
