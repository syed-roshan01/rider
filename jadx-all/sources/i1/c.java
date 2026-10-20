package i1;

import e1.n0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f7733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7734c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7735d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7736e = e1.r.f5065g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f7737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e1.i f7739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c9.c f7740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1.b f7741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f7743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f7744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f7745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f7746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f7747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f7748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7750s;

    public c() {
        int i10 = h0.f7832a;
        this.f7737f = r8.r.f13661a;
        this.f7738g = true;
        this.f7741j = new h1.b(this, 1);
        this.f7742k = "";
        this.f7746o = 1.0f;
        this.f7747p = 1.0f;
        this.f7750s = true;
    }

    @Override // i1.c0
    public final void a(g1.g gVar) {
        if (this.f7750s) {
            float[] fArr = this.f7733b;
            if (fArr == null) {
                fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                this.f7733b = fArr;
            } else {
                e1.a0.c(fArr);
            }
            e1.a0.e(fArr, this.f7748q + this.f7744m, this.f7749r + this.f7745n);
            double d10 = (((double) this.f7743l) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d10);
            float fSin = (float) Math.sin(d10);
            float f10 = fArr[0];
            float f11 = fArr[4];
            float f12 = (fSin * f11) + (fCos * f10);
            float f13 = -fSin;
            float f14 = (f11 * fCos) + (f10 * f13);
            float f15 = fArr[1];
            float f16 = fArr[5];
            float f17 = (fSin * f16) + (fCos * f15);
            float f18 = (f16 * fCos) + (f15 * f13);
            float f19 = fArr[2];
            float f20 = fArr[6];
            float f21 = (fSin * f20) + (fCos * f19);
            float f22 = (f20 * fCos) + (f19 * f13);
            float f23 = fArr[3];
            float f24 = fArr[7];
            float f25 = (fSin * f24) + (fCos * f23);
            float f26 = (fCos * f24) + (f13 * f23);
            fArr[0] = f12;
            fArr[1] = f17;
            fArr[2] = f21;
            fArr[3] = f25;
            fArr[4] = f14;
            fArr[5] = f18;
            fArr[6] = f22;
            fArr[7] = f26;
            float f27 = this.f7746o;
            float f28 = this.f7747p;
            fArr[0] = f12 * f27;
            fArr[1] = f17 * f27;
            fArr[2] = f21 * f27;
            fArr[3] = f25 * f27;
            fArr[4] = f14 * f28;
            fArr[5] = f18 * f28;
            fArr[6] = f22 * f28;
            fArr[7] = f26 * f28;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            e1.a0.e(fArr, -this.f7744m, -this.f7745n);
            this.f7750s = false;
        }
        if (this.f7738g) {
            if (!this.f7737f.isEmpty()) {
                e1.i iVarG = this.f7739h;
                if (iVarG == null) {
                    iVarG = androidx.compose.ui.graphics.a.g();
                    this.f7739h = iVarG;
                }
                b.M(this.f7737f, iVarG);
            }
            this.f7738g = false;
        }
        g1.b bVarA = gVar.A();
        long jB = bVarA.b();
        bVarA.a().j();
        float[] fArr2 = this.f7733b;
        g1.d dVar = bVarA.f6494a;
        if (fArr2 != null) {
            dVar.f6500a.a().q(fArr2);
        }
        e1.i iVar = this.f7739h;
        if ((!this.f7737f.isEmpty()) && iVar != null) {
            dVar.f6500a.a().t(iVar, 1);
        }
        ArrayList arrayList = this.f7734c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) arrayList.get(i10)).a(gVar);
        }
        bVarA.a().h();
        bVarA.c(jB);
    }

    @Override // i1.c0
    public final c9.c b() {
        return this.f7740i;
    }

    @Override // i1.c0
    public final void d(h1.b bVar) {
        this.f7740i = bVar;
    }

    public final void e(int i10, c0 c0Var) {
        ArrayList arrayList = this.f7734c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.f7741j);
        c();
    }

    public final void f(long j10) {
        if (this.f7735d) {
            long j11 = e1.r.f5065g;
            if (j10 != j11) {
                long j12 = this.f7736e;
                if (j12 == j11) {
                    this.f7736e = j10;
                    return;
                }
                int i10 = h0.f7832a;
                if (e1.r.h(j12) == e1.r.h(j10) && e1.r.g(j12) == e1.r.g(j10) && e1.r.e(j12) == e1.r.e(j10)) {
                    return;
                }
                this.f7735d = false;
                this.f7736e = j11;
            }
        }
    }

    public final void g(c0 c0Var) {
        if (!(c0Var instanceof h)) {
            if (c0Var instanceof c) {
                c cVar = (c) c0Var;
                if (cVar.f7735d && this.f7735d) {
                    f(cVar.f7736e);
                    return;
                } else {
                    this.f7735d = false;
                    this.f7736e = e1.r.f5065g;
                    return;
                }
            }
            return;
        }
        h hVar = (h) c0Var;
        e1.n nVar = hVar.f7813b;
        if (this.f7735d && nVar != null) {
            if (nVar instanceof n0) {
                f(((n0) nVar).f5052a);
            } else {
                this.f7735d = false;
                this.f7736e = e1.r.f5065g;
            }
        }
        e1.n nVar2 = hVar.f7818g;
        if (this.f7735d && nVar2 != null) {
            if (nVar2 instanceof n0) {
                f(((n0) nVar2).f5052a);
            } else {
                this.f7735d = false;
                this.f7736e = e1.r.f5065g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f7742k);
        ArrayList arrayList = this.f7734c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) arrayList.get(i10);
            sb.append("\t");
            sb.append(c0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
