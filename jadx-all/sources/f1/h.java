package f1;

import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f6052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f6053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f6054g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f6056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f6057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f6058d;

    static {
        q qVar = e.f6030c;
        f6052e = new f(qVar, qVar, 1);
        l lVar = e.f6047t;
        f6053f = new h(qVar, lVar, 0);
        f6054g = new h(lVar, qVar, 0);
    }

    public h(d dVar, d dVar2, d dVar3, float[] fArr) {
        this.f6055a = dVar;
        this.f6056b = dVar2;
        this.f6057c = dVar3;
        this.f6058d = fArr;
    }

    public long a(float f10, float f11, float f12, float f13) {
        d dVar = this.f6056b;
        long jD = dVar.d(f10, f11, f12);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = dVar.e(f10, f11, f12);
        float[] fArr = this.f6058d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f14 = fIntBitsToFloat2;
        float f15 = fIntBitsToFloat;
        return this.f6057c.f(f15, f14, fE, f13, this.f6055a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(d dVar, d dVar2, int i10) {
        long j10 = dVar.f6026b;
        long j11 = c.f6020a;
        d dVarG = c.a(j10, j11) ? d0.g(dVar) : dVar;
        d dVarG2 = c.a(dVar2.f6026b, j11) ? d0.g(dVar2) : dVar2;
        float[] fArr = null;
        if (i10 == 3) {
            boolean zA = c.a(dVar.f6026b, j11);
            boolean zA2 = c.a(dVar2.f6026b, j11);
            if ((!zA || !zA2) && (zA || zA2)) {
                dVar = zA ? dVar : dVar2;
                float[] fArrA = j.f6063e;
                s sVar = ((q) dVar).f6077d;
                float[] fArrA2 = zA ? sVar.a() : fArrA;
                fArrA = zA2 ? sVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(dVar2, dVarG, dVarG2, fArr);
    }
}
