package i1;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e1.n f7813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f7814c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f7815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f7816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f7817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e1.n f7818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f7822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f7823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f7824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g1.k f7828q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e1.i f7829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e1.i f7830s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q8.c f7831t;

    public h() {
        int i10 = h0.f7832a;
        this.f7815d = r8.r.f13661a;
        this.f7816e = 1.0f;
        this.f7819h = 0;
        this.f7820i = 0;
        this.f7821j = 4.0f;
        this.f7823l = 1.0f;
        this.f7825n = true;
        this.f7826o = true;
        e1.i iVarG = androidx.compose.ui.graphics.a.g();
        this.f7829r = iVarG;
        this.f7830s = iVarG;
        q8.d[] dVarArr = q8.d.f13224a;
        this.f7831t = z6.a.R(g.f7800b);
    }

    @Override // i1.c0
    public final void a(g1.g gVar) {
        if (this.f7825n) {
            b.M(this.f7815d, this.f7829r);
            e();
        } else if (this.f7827p) {
            e();
        }
        this.f7825n = false;
        this.f7827p = false;
        e1.n nVar = this.f7813b;
        if (nVar != null) {
            g1.g.D(gVar, this.f7830s, nVar, this.f7814c, null, 56);
        }
        e1.n nVar2 = this.f7818g;
        if (nVar2 != null) {
            g1.k kVar = this.f7828q;
            if (this.f7826o || kVar == null) {
                kVar = new g1.k(this.f7817f, this.f7821j, this.f7819h, this.f7820i, 16);
                this.f7828q = kVar;
                this.f7826o = false;
            }
            g1.g.D(gVar, this.f7830s, nVar2, this.f7816e, kVar, 48);
        }
    }

    public final void e() {
        Path path;
        float f10 = this.f7822k;
        e1.i iVar = this.f7829r;
        if (f10 == 0.0f && this.f7823l == 1.0f) {
            this.f7830s = iVar;
            return;
        }
        if (d7.a.d(this.f7830s, iVar)) {
            this.f7830s = androidx.compose.ui.graphics.a.g();
        } else {
            int i10 = this.f7830s.f5014a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f7830s.f5014a.rewind();
            this.f7830s.c(i10);
        }
        q8.c cVar = this.f7831t;
        e1.j jVar = (e1.j) cVar.getValue();
        if (iVar != null) {
            jVar.getClass();
            path = iVar.f5014a;
        } else {
            path = null;
        }
        jVar.f5035a.setPath(path, false);
        float length = ((e1.j) cVar.getValue()).f5035a.getLength();
        float f11 = this.f7822k;
        float f12 = this.f7824m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f7823l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((e1.j) cVar.getValue()).a(f13, f14, this.f7830s);
        } else {
            ((e1.j) cVar.getValue()).a(f13, length, this.f7830s);
            ((e1.j) cVar.getValue()).a(0.0f, f14, this.f7830s);
        }
    }

    public final String toString() {
        return this.f7829r.toString();
    }
}
