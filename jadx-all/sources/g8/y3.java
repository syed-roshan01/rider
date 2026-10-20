package g8;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7289a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h8.t f7290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4 f7291c;

    public y3(b4 b4Var) {
        this.f7291c = b4Var;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        h8.t tVar = this.f7290b;
        ArrayList arrayList = this.f7289a;
        b4 b4Var = this.f7291c;
        if (tVar == null) {
            b4Var.f6672h.getClass();
            h8.t tVarE = a4.q.e(i11);
            this.f7290b = tVarE;
            arrayList.add(tVarE);
        }
        while (i11 > 0) {
            int iMin = Math.min(i11, this.f7290b.f7719b);
            if (iMin == 0) {
                int iMax = Math.max(i11, this.f7290b.f7720c * 2);
                b4Var.f6672h.getClass();
                h8.t tVarE2 = a4.q.e(iMax);
                this.f7290b = tVarE2;
                arrayList.add(tVarE2);
            } else {
                this.f7290b.a(bArr, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        h8.t tVar = this.f7290b;
        if (tVar != null && tVar.f7719b > 0) {
            tVar.f7718a.h0((byte) i10);
            tVar.f7719b--;
            tVar.f7720c++;
            return;
        }
        write(new byte[]{(byte) i10}, 0, 1);
    }
}
