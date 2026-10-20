package f1;

import java.util.Arrays;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f6049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f6050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f6051j;

    public g(q qVar, q qVar2, int i10) {
        float[] fArrT;
        super(qVar2, qVar, qVar2, null);
        this.f6049h = qVar;
        this.f6050i = qVar2;
        s sVar = qVar2.f6077d;
        s sVar2 = qVar.f6077d;
        boolean zP = d0.p(sVar2, sVar);
        float[] fArrT2 = qVar.f6082i;
        float[] fArrO = qVar2.f6083j;
        if (zP) {
            fArrT = d0.T(fArrO, fArrT2);
        } else {
            float[] fArrA = sVar2.a();
            s sVar3 = qVar2.f6077d;
            float[] fArrA2 = sVar3.a();
            s sVar4 = j.f6060b;
            boolean zP2 = d0.p(sVar2, sVar4);
            float[] fArr = j.f6063e;
            float[] fArr2 = b.f6018b.f6019a;
            if (!zP2) {
                float[] fArrCopyOf = Arrays.copyOf(fArr, 3);
                d7.a.l(fArrCopyOf, "copyOf(this, size)");
                fArrT2 = d0.T(d0.n(fArr2, fArrA, fArrCopyOf), fArrT2);
            }
            if (!d0.p(sVar3, sVar4)) {
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, 3);
                d7.a.l(fArrCopyOf2, "copyOf(this, size)");
                fArrO = d0.O(d0.T(d0.n(fArr2, fArrA2, fArrCopyOf2), qVar2.f6082i));
            }
            fArrT = d0.T(fArrO, i10 == 3 ? d0.U(new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]}, fArrT2) : fArrT2);
        }
        this.f6051j = fArrT;
    }

    @Override // f1.h
    public final long a(float f10, float f11, float f12, float f13) {
        q qVar = this.f6049h;
        float fB = (float) qVar.f6089p.b(f10);
        double d10 = f11;
        m mVar = qVar.f6089p;
        float fB2 = (float) mVar.b(d10);
        float fB3 = (float) mVar.b(f12);
        float[] fArr = this.f6051j;
        float fW = d0.W(fArr, fB, fB2, fB3);
        float fX = d0.X(fArr, fB, fB2, fB3);
        float fY = d0.Y(fArr, fB, fB2, fB3);
        q qVar2 = this.f6050i;
        float fB4 = (float) qVar2.f6086m.b(fW);
        double d11 = fX;
        m mVar2 = qVar2.f6086m;
        return androidx.compose.ui.graphics.a.a(fB4, (float) mVar2.b(d11), (float) mVar2.b(fY), f13, qVar2);
    }
}
