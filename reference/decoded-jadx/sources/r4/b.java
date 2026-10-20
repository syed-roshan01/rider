package r4;

import android.graphics.Bitmap;
import ja.a0;
import ja.z;
import java.io.EOFException;
import x9.b0;
import x9.p;
import x9.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q8.c f13449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.c f13450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f13454f;

    public b(a0 a0Var) throws EOFException {
        q8.d[] dVarArr = q8.d.f13224a;
        this.f13449a = z6.a.R(new a(this, 0));
        this.f13450b = z6.a.R(new a(this, 1 == true ? 1 : 0));
        this.f13451c = Long.parseLong(a0Var.K(Long.MAX_VALUE));
        this.f13452d = Long.parseLong(a0Var.K(Long.MAX_VALUE));
        this.f13453e = Integer.parseInt(a0Var.K(Long.MAX_VALUE)) > 0;
        int i10 = Integer.parseInt(a0Var.K(Long.MAX_VALUE));
        p pVar = new p();
        for (int i11 = 0; i11 < i10; i11++) {
            String strK = a0Var.K(Long.MAX_VALUE);
            Bitmap.Config[] configArr = w4.e.f16163a;
            int iO0 = l9.i.O0(strK, ':', 0, false, 6);
            if (iO0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strK).toString());
            }
            String strSubstring = strK.substring(0, iO0);
            d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            String string = l9.i.o1(strSubstring).toString();
            String strSubstring2 = strK.substring(iO0 + 1);
            d7.a.l(strSubstring2, "this as java.lang.String).substring(startIndex)");
            pVar.b(string, strSubstring2);
        }
        this.f13454f = pVar.c();
    }

    public final void a(z zVar) {
        zVar.W(this.f13451c);
        zVar.C(10);
        zVar.W(this.f13452d);
        zVar.C(10);
        zVar.W(this.f13453e ? 1L : 0L);
        zVar.C(10);
        q qVar = this.f13454f;
        zVar.W(qVar.size());
        zVar.C(10);
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            zVar.V(qVar.i(i10));
            zVar.V(": ");
            zVar.V(qVar.n(i10));
            zVar.C(10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(b0 b0Var) {
        q8.d[] dVarArr = q8.d.f13224a;
        this.f13449a = z6.a.R(new a(this, 0 == true ? 1 : 0));
        this.f13450b = z6.a.R(new a(this, 1));
        this.f13451c = b0Var.f16354r;
        this.f13452d = b0Var.f16355s;
        this.f13453e = b0Var.f16348e != null;
        this.f13454f = b0Var.f16349f;
    }
}
