package i1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import m0.n1;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f7775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f7778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c9.a f7779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f7780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e1.l f7781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f7782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f7784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f7785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f7786m;

    public e0(c cVar) {
        this.f7775b = cVar;
        cVar.f7740i = new d0(this, 0);
        this.f7776c = "";
        this.f7777d = true;
        this.f7778e = new a();
        this.f7779f = g.f7801c;
        o3 o3Var = o3.f11621a;
        this.f7780g = d7.t.g0(null, o3Var);
        this.f7782i = d7.t.g0(new d1.f(d1.f.f4344b), o3Var);
        this.f7783j = d1.f.f4345c;
        this.f7784k = 1.0f;
        this.f7785l = 1.0f;
        this.f7786m = new d0(this, 1);
    }

    @Override // i1.c0
    public final void a(g1.g gVar) {
        e(gVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    public final void e(g1.g gVar, float f10, e1.l lVar) {
        e1.l lVar2;
        long jE;
        e1.f fVar;
        e1.d dVar;
        e1.f fVarE;
        long j10;
        ColorFilter porterDuffColorFilter;
        e1.l lVar3;
        int i10;
        c cVar = this.f7775b;
        boolean z10 = cVar.f7735d;
        n1 n1Var = this.f7780g;
        int i11 = (z10 && cVar.f7736e != e1.r.f5065g && h0.b((e1.l) n1Var.getValue()) && h0.b(lVar)) ? 1 : 0;
        boolean z11 = this.f7777d;
        a aVar = this.f7778e;
        if (z11 || !d1.f.a(this.f7783j, gVar.e())) {
            if (e1.g0.e(i11, 1)) {
                j10 = cVar.f7736e;
                if (Build.VERSION.SDK_INT >= 29) {
                    porterDuffColorFilter = e1.m.f5045a.a(j10, 5);
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(androidx.compose.ui.graphics.a.s(j10), androidx.compose.ui.graphics.a.u(5));
                }
                lVar2 = new e1.l(j10, 5, porterDuffColorFilter);
            } else {
                lVar2 = null;
            }
            this.f7781h = lVar2;
            float fD = d1.f.d(gVar.e());
            n1 n1Var2 = this.f7782i;
            this.f7784k = fD / d1.f.d(((d1.f) n1Var2.getValue()).f4347a);
            this.f7785l = d1.f.b(gVar.e()) / d1.f.b(((d1.f) n1Var2.getValue()).f4347a);
            jE = o1.s.e((int) Math.ceil(d1.f.d(gVar.e())), (int) Math.ceil(d1.f.b(gVar.e())));
            m2.l layoutDirection = gVar.getLayoutDirection();
            fVar = aVar.f7723a;
            dVar = aVar.f7724b;
            if (fVar != null || dVar == null) {
                fVarE = androidx.compose.ui.graphics.a.e((int) (jE >> 32), (int) (4294967295L & jE), i11);
                Canvas canvas = e1.e.f4997a;
                dVar = new e1.d();
                dVar.f4994a = new Canvas(androidx.compose.ui.graphics.a.i(fVarE));
                aVar.f7723a = fVarE;
                aVar.f7724b = dVar;
                aVar.f7726d = i11;
            } else {
                int i12 = (int) (jE >> 32);
                Bitmap bitmap = fVar.f5003a;
                if (i12 > bitmap.getWidth() || ((int) (jE & 4294967295L)) > bitmap.getHeight() || !e1.g0.e(aVar.f7726d, i11)) {
                    fVarE = androidx.compose.ui.graphics.a.e((int) (jE >> 32), (int) (4294967295L & jE), i11);
                    Canvas canvas2 = e1.e.f4997a;
                    dVar = new e1.d();
                    dVar.f4994a = new Canvas(androidx.compose.ui.graphics.a.i(fVarE));
                    aVar.f7723a = fVarE;
                    aVar.f7724b = dVar;
                    aVar.f7726d = i11;
                } else {
                    fVarE = fVar;
                }
            }
            aVar.f7725c = jE;
            long jM0 = o1.s.m0(jE);
            g1.c cVar2 = aVar.f7727e;
            g1.a aVar2 = cVar2.f6496a;
            m2.b bVar = aVar2.f6490a;
            m2.l lVar4 = aVar2.f6491b;
            e1.p pVar = aVar2.f6492c;
            long j11 = aVar2.f6493d;
            aVar2.f6490a = gVar;
            aVar2.f6491b = layoutDirection;
            aVar2.f6492c = dVar;
            aVar2.f6493d = jM0;
            dVar.j();
            g1.g.U(cVar2, e1.r.f5060b, 0L, 0L, 62);
            this.f7786m.invoke(cVar2);
            dVar.h();
            g1.a aVar3 = cVar2.f6496a;
            aVar3.f6490a = bVar;
            aVar3.f6491b = lVar4;
            aVar3.f6492c = pVar;
            aVar3.f6493d = j11;
            fVarE.f5003a.prepareToDraw();
            this.f7777d = false;
            this.f7783j = gVar.e();
        } else {
            e1.f fVar2 = aVar.f7723a;
            if (fVar2 == null) {
                i10 = 0;
            } else {
                Bitmap.Config config = fVar2.f5003a.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i10 = 1;
                } else if (config == Bitmap.Config.RGB_565) {
                    i10 = 2;
                } else if (config == Bitmap.Config.ARGB_4444) {
                    i10 = 0;
                } else if (config == Bitmap.Config.RGBA_F16) {
                    i10 = 3;
                } else if (config == Bitmap.Config.HARDWARE) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            }
            if (!e1.g0.e(i11, i10)) {
                if (e1.g0.e(i11, 1)) {
                    j10 = cVar.f7736e;
                    if (Build.VERSION.SDK_INT >= 29) {
                        porterDuffColorFilter = e1.m.f5045a.a(j10, 5);
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(androidx.compose.ui.graphics.a.s(j10), androidx.compose.ui.graphics.a.u(5));
                    }
                    lVar2 = new e1.l(j10, 5, porterDuffColorFilter);
                } else {
                    lVar2 = null;
                }
                this.f7781h = lVar2;
                float fD2 = d1.f.d(gVar.e());
                n1 n1Var3 = this.f7782i;
                this.f7784k = fD2 / d1.f.d(((d1.f) n1Var3.getValue()).f4347a);
                this.f7785l = d1.f.b(gVar.e()) / d1.f.b(((d1.f) n1Var3.getValue()).f4347a);
                jE = o1.s.e((int) Math.ceil(d1.f.d(gVar.e())), (int) Math.ceil(d1.f.b(gVar.e())));
                m2.l layoutDirection2 = gVar.getLayoutDirection();
                fVar = aVar.f7723a;
                dVar = aVar.f7724b;
                if (fVar != null) {
                    fVarE = androidx.compose.ui.graphics.a.e((int) (jE >> 32), (int) (4294967295L & jE), i11);
                    Canvas canvas3 = e1.e.f4997a;
                    dVar = new e1.d();
                    dVar.f4994a = new Canvas(androidx.compose.ui.graphics.a.i(fVarE));
                    aVar.f7723a = fVarE;
                    aVar.f7724b = dVar;
                    aVar.f7726d = i11;
                } else {
                    fVarE = androidx.compose.ui.graphics.a.e((int) (jE >> 32), (int) (4294967295L & jE), i11);
                    Canvas canvas4 = e1.e.f4997a;
                    dVar = new e1.d();
                    dVar.f4994a = new Canvas(androidx.compose.ui.graphics.a.i(fVarE));
                    aVar.f7723a = fVarE;
                    aVar.f7724b = dVar;
                    aVar.f7726d = i11;
                }
                aVar.f7725c = jE;
                long jM1 = o1.s.m0(jE);
                g1.c cVar3 = aVar.f7727e;
                g1.a aVar4 = cVar3.f6496a;
                m2.b bVar2 = aVar4.f6490a;
                m2.l lVar5 = aVar4.f6491b;
                e1.p pVar2 = aVar4.f6492c;
                long j12 = aVar4.f6493d;
                aVar4.f6490a = gVar;
                aVar4.f6491b = layoutDirection2;
                aVar4.f6492c = dVar;
                aVar4.f6493d = jM1;
                dVar.j();
                g1.g.U(cVar3, e1.r.f5060b, 0L, 0L, 62);
                this.f7786m.invoke(cVar3);
                dVar.h();
                g1.a aVar5 = cVar3.f6496a;
                aVar5.f6490a = bVar2;
                aVar5.f6491b = lVar5;
                aVar5.f6492c = pVar2;
                aVar5.f6493d = j12;
                fVarE.f5003a.prepareToDraw();
                this.f7777d = false;
                this.f7783j = gVar.e();
            }
        }
        if (lVar != null) {
            lVar3 = lVar;
        } else {
            lVar3 = ((e1.l) n1Var.getValue()) != null ? (e1.l) n1Var.getValue() : this.f7781h;
        }
        e1.f fVar3 = aVar.f7723a;
        if (fVar3 == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
        }
        g1.g.C(gVar, fVar3, 0L, aVar.f7725c, 0L, f10, lVar3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f7776c);
        sb.append("\n\tviewportWidth: ");
        n1 n1Var = this.f7782i;
        sb.append(d1.f.d(((d1.f) n1Var.getValue()).f4347a));
        sb.append("\n\tviewportHeight: ");
        sb.append(d1.f.b(((d1.f) n1Var.getValue()).f4347a));
        sb.append("\n");
        String string = sb.toString();
        d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
