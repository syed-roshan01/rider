package n2;

import q.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile a0 f12125a = new a0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f12126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12127c;

    static {
        Object[] objArr = new Object[0];
        f12126b = objArr;
        f12127c = 1.05f;
        synchronized (objArr) {
            f12125a.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f12125a.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f12125a.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f12125a.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f12125a.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        float f10 = (f12125a.f12975a[0] / 100.0f) - 0.02f;
        f12127c = f10;
        if (f10 <= 1.0f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1".toString());
        }
    }

    public static a a(float f10) {
        if (f10 < f12127c) {
            return null;
        }
        int i10 = (int) (f10 * 100.0f);
        a aVar = (a) f12125a.c(i10);
        if (aVar != null) {
            return aVar;
        }
        a0 a0Var = f12125a;
        int iA = r.a.a(a0Var.f12977c, i10, a0Var.f12975a);
        if (iA >= 0) {
            return (a) f12125a.f12976b[iA];
        }
        int i11 = -(iA + 1);
        int i12 = i11 - 1;
        if (i12 < 0 || i11 >= f12125a.f12977c) {
            c cVar = new c(new float[]{1.0f}, new float[]{f10});
            b(f10, cVar);
            return cVar;
        }
        float f11 = f12125a.f12975a[i12] / 100.0f;
        float f12 = f12125a.f12975a[i11] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f11 == f12 ? 0.0f : (f10 - f11) / (f12 - f11))) * 1.0f) + 0.0f;
        a aVar2 = (a) f12125a.f12976b[i12];
        a aVar3 = (a) f12125a.f12976b[i11];
        float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f13 = fArr[i13];
            float fB = aVar2.b(f13);
            fArr2[i13] = ((aVar3.b(f13) - fB) * fMax) + fB;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f10, cVar2);
        return cVar2;
    }

    public static void b(float f10, c cVar) {
        synchronized (f12126b) {
            a0 a0VarClone = f12125a.clone();
            a0VarClone.d((int) (f10 * 100.0f), cVar);
            f12125a = a0VarClone;
        }
    }
}
