package e1;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f5014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f5015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f5016c;

    public i(Path path) {
        this.f5014a = path;
    }

    public final void a(d1.e eVar) {
        if (this.f5015b == null) {
            this.f5015b = new RectF();
        }
        RectF rectF = this.f5015b;
        d7.a.j(rectF);
        rectF.set(eVar.f4336a, eVar.f4337b, eVar.f4338c, eVar.f4339d);
        if (this.f5016c == null) {
            this.f5016c = new float[8];
        }
        float[] fArr = this.f5016c;
        d7.a.j(fArr);
        long j10 = eVar.f4340e;
        fArr[0] = d1.a.b(j10);
        fArr[1] = d1.a.c(j10);
        long j11 = eVar.f4341f;
        fArr[2] = d1.a.b(j11);
        fArr[3] = d1.a.c(j11);
        long j12 = eVar.f4342g;
        fArr[4] = d1.a.b(j12);
        fArr[5] = d1.a.c(j12);
        long j13 = eVar.f4343h;
        fArr[6] = d1.a.b(j13);
        fArr[7] = d1.a.c(j13);
        RectF rectF2 = this.f5015b;
        d7.a.j(rectF2);
        float[] fArr2 = this.f5016c;
        d7.a.j(fArr2);
        this.f5014a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final boolean b(d0 d0Var, d0 d0Var2, int i10) {
        Path.Op op;
        if (i10 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i10 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i10 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(d0Var instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        i iVar = (i) d0Var;
        if (d0Var2 instanceof i) {
            return this.f5014a.op(iVar.f5014a, ((i) d0Var2).f5014a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void c(int i10) {
        this.f5014a.setFillType(i10 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
