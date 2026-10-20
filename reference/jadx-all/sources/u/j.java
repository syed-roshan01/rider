package u;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f14804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d1.c f14805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EdgeEffect f14806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EdgeEffect f14807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f14808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f14809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f14810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EdgeEffect f14811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EdgeEffect f14812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EdgeEffect f14813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final EdgeEffect f14814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m0.l1 f14816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f14817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f14819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o1.t f14820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0.o f14821r;

    public j(Context context, z1 z1Var) {
        this.f14804a = z1Var;
        EdgeEffect edgeEffectC = f6.a.C(context);
        this.f14806c = edgeEffectC;
        EdgeEffect edgeEffectC2 = f6.a.C(context);
        this.f14807d = edgeEffectC2;
        EdgeEffect edgeEffectC3 = f6.a.C(context);
        this.f14808e = edgeEffectC3;
        EdgeEffect edgeEffectC4 = f6.a.C(context);
        this.f14809f = edgeEffectC4;
        List listE0 = d7.t.e0(edgeEffectC3, edgeEffectC, edgeEffectC4, edgeEffectC2);
        this.f14810g = listE0;
        this.f14811h = f6.a.C(context);
        this.f14812i = f6.a.C(context);
        this.f14813j = f6.a.C(context);
        this.f14814k = f6.a.C(context);
        int size = listE0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((EdgeEffect) listE0.get(i10)).setColor(androidx.compose.ui.graphics.a.s(this.f14804a.f14999a));
        }
        this.f14815l = -1;
        this.f14816m = o7.d0.Z(0);
        this.f14817n = true;
        this.f14819p = d1.f.f4344b;
        this.f14821r = o1.c0.a(m.f14850a, q8.l.f13235a, new h(this, null)).j(new r1.t0(new i(this))).j(new l0(this));
    }

    /* JADX WARN: Code duplicated, block: B:120:0x018e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0193  */
    /* JADX WARN: Code duplicated, block: B:124:0x019b  */
    /* JADX WARN: Code duplicated, block: B:125:0x019f  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:189:0x0291 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    @Override // u.b2
    public final long a(long j10, int i10, q2 q2Var) {
        EdgeEffect edgeEffect;
        float fM;
        float fK;
        float f10;
        boolean z10;
        boolean zIsFinished;
        boolean z11;
        boolean z12;
        float fB;
        if (d1.f.e(this.f14819p)) {
            return ((d1.c) q2Var.invoke(new d1.c(j10))).f4330a;
        }
        boolean z13 = this.f14818o;
        n nVar = n.f14854a;
        EdgeEffect edgeEffect2 = this.f14807d;
        EdgeEffect edgeEffect3 = this.f14806c;
        EdgeEffect edgeEffect4 = this.f14809f;
        EdgeEffect edgeEffect5 = this.f14808e;
        if (z13) {
            edgeEffect = edgeEffect2;
        } else {
            long jV = d7.t.V(this.f14819p);
            int i11 = Build.VERSION.SDK_INT;
            if ((i11 >= 31 ? nVar.b(edgeEffect5) : 0.0f) != 0.0f) {
                k(d1.c.f4326b, jV);
            }
            if ((i11 >= 31 ? nVar.b(edgeEffect4) : 0.0f) != 0.0f) {
                l(d1.c.f4326b, jV);
            }
            if ((i11 >= 31 ? nVar.b(edgeEffect3) : 0.0f) != 0.0f) {
                m(d1.c.f4326b, jV);
            }
            if (i11 >= 31) {
                edgeEffect = edgeEffect2;
                fB = nVar.b(edgeEffect);
            } else {
                edgeEffect = edgeEffect2;
                fB = 0.0f;
            }
            if (fB != 0.0f) {
                j(d1.c.f4326b, jV);
            }
            this.f14818o = true;
        }
        d1.c cVar = this.f14805b;
        long jV2 = cVar != null ? cVar.f4330a : d7.t.V(this.f14819p);
        if (d1.c.e(j10) != 0.0f) {
            int i12 = Build.VERSION.SDK_INT;
            if ((i12 >= 31 ? nVar.b(edgeEffect3) : 0.0f) == 0.0f) {
                if ((i12 >= 31 ? nVar.b(edgeEffect) : 0.0f) == 0.0f) {
                    fM = 0.0f;
                } else {
                    fM = j(j10, jV2);
                    if ((i12 >= 31 ? nVar.b(edgeEffect) : 0.0f) == 0.0f) {
                        edgeEffect.onRelease();
                    }
                }
            } else {
                fM = m(j10, jV2);
                if ((i12 >= 31 ? nVar.b(edgeEffect3) : 0.0f) == 0.0f) {
                    edgeEffect3.onRelease();
                }
            }
        } else {
            fM = 0.0f;
        }
        if (d1.c.d(j10) != 0.0f) {
            int i13 = Build.VERSION.SDK_INT;
            if ((i13 >= 31 ? nVar.b(edgeEffect5) : 0.0f) == 0.0f) {
                if ((i13 >= 31 ? nVar.b(edgeEffect4) : 0.0f) == 0.0f) {
                    f10 = 0.0f;
                } else {
                    fK = l(j10, jV2);
                    if ((i13 >= 31 ? nVar.b(edgeEffect4) : 0.0f) == 0.0f) {
                        edgeEffect4.onRelease();
                    }
                }
            } else {
                fK = k(j10, jV2);
                if ((i13 >= 31 ? nVar.b(edgeEffect5) : 0.0f) == 0.0f) {
                    edgeEffect5.onRelease();
                }
            }
            f10 = fK;
        } else {
            f10 = 0.0f;
        }
        long jF = d9.i.f(f10, fM);
        EdgeEffect edgeEffect6 = edgeEffect;
        if (!d1.c.b(jF, d1.c.f4326b)) {
            i();
        }
        long jF2 = d1.c.f(j10, jF);
        long j11 = ((d1.c) q2Var.invoke(new d1.c(jF2))).f4330a;
        long jF3 = d1.c.f(jF2, j11);
        boolean z14 = true;
        if (i10 == 1) {
            if (d1.c.d(jF3) > 0.5f) {
                k(jF3, jV2);
            } else {
                if (d1.c.d(jF3) < -0.5f) {
                    l(jF3, jV2);
                } else {
                    z11 = false;
                }
                if (d1.c.e(jF3) > 0.5f) {
                    m(jF3, jV2);
                } else {
                    if (d1.c.e(jF3) < -0.5f) {
                        j(jF3, jV2);
                    } else {
                        z12 = false;
                    }
                    if (!z11 || z12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                z12 = true;
                if (z11) {
                }
                z10 = true;
            }
            z11 = true;
            if (d1.c.e(jF3) > 0.5f) {
                m(jF3, jV2);
            } else {
                if (d1.c.e(jF3) < -0.5f) {
                    j(jF3, jV2);
                } else {
                    z12 = false;
                }
                if (z11) {
                }
                z10 = true;
            }
            z12 = true;
            if (z11) {
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (edgeEffect5.isFinished() || d1.c.d(j10) >= 0.0f) {
            zIsFinished = false;
        } else {
            float fD = d1.c.d(j10);
            if (edgeEffect5 instanceof y0) {
                y0 y0Var = (y0) edgeEffect5;
                float f11 = y0Var.f14987b + fD;
                y0Var.f14987b = f11;
                if (Math.abs(f11) > y0Var.f14986a) {
                    y0Var.onRelease();
                }
            } else {
                edgeEffect5.onRelease();
            }
            zIsFinished = edgeEffect5.isFinished();
        }
        if (!edgeEffect4.isFinished() && d1.c.d(j10) > 0.0f) {
            float fD2 = d1.c.d(j10);
            if (edgeEffect4 instanceof y0) {
                y0 y0Var2 = (y0) edgeEffect4;
                float f12 = y0Var2.f14987b + fD2;
                y0Var2.f14987b = f12;
                if (Math.abs(f12) > y0Var2.f14986a) {
                    y0Var2.onRelease();
                }
            } else {
                edgeEffect4.onRelease();
            }
            zIsFinished = zIsFinished || edgeEffect4.isFinished();
        }
        if (!edgeEffect3.isFinished() && d1.c.e(j10) < 0.0f) {
            float fE = d1.c.e(j10);
            if (edgeEffect3 instanceof y0) {
                y0 y0Var3 = (y0) edgeEffect3;
                float f13 = y0Var3.f14987b + fE;
                y0Var3.f14987b = f13;
                if (Math.abs(f13) > y0Var3.f14986a) {
                    y0Var3.onRelease();
                }
            } else {
                edgeEffect3.onRelease();
            }
            if (!zIsFinished && !edgeEffect3.isFinished()) {
                z14 = false;
            }
            zIsFinished = z14;
        }
        if (edgeEffect6.isFinished() || d1.c.e(j10) <= 0.0f) {
            if (!zIsFinished) {
                if (z10) {
                }
            }
            return d1.c.g(jF, j11);
        }
        float fE2 = d1.c.e(j10);
        if (edgeEffect6 instanceof y0) {
            y0 y0Var4 = (y0) edgeEffect6;
            float f14 = y0Var4.f14987b + fE2;
            y0Var4.f14987b = f14;
            if (Math.abs(f14) > y0Var4.f14986a) {
                y0Var4.onRelease();
            }
        } else {
            edgeEffect6.onRelease();
        }
        if (!zIsFinished && !edgeEffect6.isFinished()) {
            if (z10) {
            }
        }
        return d1.c.g(jF, j11);
        i();
        return d1.c.g(jF, j11);
    }

    @Override // u.b2
    public final boolean b() {
        List list = this.f14810g;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((Build.VERSION.SDK_INT >= 31 ? n.f14854a.b((EdgeEffect) list.get(i10)) : 0.0f) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // u.b2
    public final y0.o c() {
        return this.f14821r;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0190  */
    /* JADX WARN: Code duplicated, block: B:106:0x0198  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:131:0x0203  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x010d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0113  */
    /* JADX WARN: Code duplicated, block: B:76:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0174  */
    @Override // u.b2
    public final Object d(long j10, v.k2 k2Var, u8.e eVar) {
        f fVar;
        float fB;
        int i10;
        EdgeEffect edgeEffect;
        float fB2;
        int i11;
        float fC;
        int i12;
        EdgeEffect edgeEffect2;
        float fB3;
        int i13;
        long jD;
        j jVar;
        long jD2;
        int i14;
        int i15;
        EdgeEffect edgeEffect3;
        int i16;
        int i17;
        EdgeEffect edgeEffect4;
        int iP0;
        int i18;
        EdgeEffect edgeEffect5;
        int iP1;
        int i19;
        EdgeEffect edgeEffect6;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i20 = fVar.f14768e;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                fVar.f14768e = i20 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, eVar);
            }
        } else {
            fVar = new f(this, eVar);
        }
        Object objInvoke = fVar.f14766c;
        Object obj = v8.a.f15963a;
        int i21 = fVar.f14768e;
        q8.l lVar = q8.l.f13235a;
        if (i21 != 0) {
            if (i21 == 1) {
                d7.t.v0(objInvoke);
            }
            if (i21 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jD = fVar.f14765b;
            jVar = fVar.f14764a;
            d7.t.v0(objInvoke);
            jD2 = m2.p.d(jD, ((m2.p) objInvoke).f11825a);
            jVar.f14818o = false;
            if (m2.p.b(jD2) > 0.0f) {
                iP1 = d7.t.p0(m2.p.b(jD2));
                i19 = Build.VERSION.SDK_INT;
                edgeEffect6 = jVar.f14808e;
                if (i19 < 31 || edgeEffect6.isFinished()) {
                    edgeEffect6.onAbsorb(iP1);
                }
            } else if (m2.p.b(jD2) < 0.0f) {
                i14 = -d7.t.p0(m2.p.b(jD2));
                i15 = Build.VERSION.SDK_INT;
                edgeEffect3 = jVar.f14809f;
                if (i15 < 31 || edgeEffect3.isFinished()) {
                    edgeEffect3.onAbsorb(i14);
                }
            }
            if (m2.p.c(jD2) > 0.0f) {
                iP0 = d7.t.p0(m2.p.c(jD2));
                i18 = Build.VERSION.SDK_INT;
                edgeEffect5 = jVar.f14806c;
                if (i18 < 31 || edgeEffect5.isFinished()) {
                    edgeEffect5.onAbsorb(iP0);
                }
            } else if (m2.p.c(jD2) < 0.0f) {
                i16 = -d7.t.p0(m2.p.c(jD2));
                i17 = Build.VERSION.SDK_INT;
                edgeEffect4 = jVar.f14807d;
                if (i17 < 31 || edgeEffect4.isFinished()) {
                    edgeEffect4.onAbsorb(i16);
                }
            }
            if (jD2 != m2.p.f11823b) {
                jVar.i();
            }
            jVar.e();
            return lVar;
        }
        d7.t.v0(objInvoke);
        if (d1.f.e(this.f14819p)) {
            Object pVar = new m2.p(j10);
            fVar.f14768e = 1;
            return k2Var.invoke(pVar, fVar) == obj ? obj : lVar;
        }
        float fB4 = m2.p.b(j10);
        n nVar = n.f14854a;
        if (fB4 > 0.0f) {
            int i22 = Build.VERSION.SDK_INT;
            EdgeEffect edgeEffect7 = this.f14808e;
            if ((i22 >= 31 ? nVar.b(edgeEffect7) : 0.0f) != 0.0f) {
                int iP2 = d7.t.p0(m2.p.b(j10));
                if (i22 >= 31 || edgeEffect7.isFinished()) {
                    edgeEffect7.onAbsorb(iP2);
                }
                fB = m2.p.b(j10);
            } else if (m2.p.b(j10) < 0.0f) {
                i10 = Build.VERSION.SDK_INT;
                edgeEffect = this.f14809f;
                if (i10 >= 31) {
                    fB2 = nVar.b(edgeEffect);
                } else {
                    fB2 = 0.0f;
                }
                if (fB2 == 0.0f) {
                    fB = 0.0f;
                } else {
                    i11 = -d7.t.p0(m2.p.b(j10));
                    if (i10 < 31 || edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb(i11);
                    }
                    fB = m2.p.b(j10);
                }
            } else {
                fB = 0.0f;
            }
        } else if (m2.p.b(j10) < 0.0f) {
            i10 = Build.VERSION.SDK_INT;
            edgeEffect = this.f14809f;
            if (i10 >= 31) {
                fB2 = nVar.b(edgeEffect);
            } else {
                fB2 = 0.0f;
            }
            if (fB2 == 0.0f) {
                fB = 0.0f;
            } else {
                i11 = -d7.t.p0(m2.p.b(j10));
                if (i10 < 31) {
                    edgeEffect.onAbsorb(i11);
                } else {
                    edgeEffect.onAbsorb(i11);
                }
                fB = m2.p.b(j10);
            }
        } else {
            fB = 0.0f;
        }
        if (m2.p.c(j10) > 0.0f) {
            int i23 = Build.VERSION.SDK_INT;
            EdgeEffect edgeEffect8 = this.f14806c;
            if ((i23 >= 31 ? nVar.b(edgeEffect8) : 0.0f) != 0.0f) {
                int iP3 = d7.t.p0(m2.p.c(j10));
                if (i23 >= 31 || edgeEffect8.isFinished()) {
                    edgeEffect8.onAbsorb(iP3);
                }
                fC = m2.p.c(j10);
            } else if (m2.p.c(j10) < 0.0f) {
                i12 = Build.VERSION.SDK_INT;
                edgeEffect2 = this.f14807d;
                if (i12 >= 31) {
                    fB3 = nVar.b(edgeEffect2);
                } else {
                    fB3 = 0.0f;
                }
                if (fB3 == 0.0f) {
                    fC = 0.0f;
                } else {
                    i13 = -d7.t.p0(m2.p.c(j10));
                    if (i12 < 31 || edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb(i13);
                    }
                    fC = m2.p.c(j10);
                }
            } else {
                fC = 0.0f;
            }
        } else if (m2.p.c(j10) < 0.0f) {
            i12 = Build.VERSION.SDK_INT;
            edgeEffect2 = this.f14807d;
            if (i12 >= 31) {
                fB3 = nVar.b(edgeEffect2);
            } else {
                fB3 = 0.0f;
            }
            if (fB3 == 0.0f) {
                fC = 0.0f;
            } else {
                i13 = -d7.t.p0(m2.p.c(j10));
                if (i12 < 31) {
                    edgeEffect2.onAbsorb(i13);
                } else {
                    edgeEffect2.onAbsorb(i13);
                }
                fC = m2.p.c(j10);
            }
        } else {
            fC = 0.0f;
        }
        long jE = i1.b.e(fB, fC);
        if (jE != m2.p.f11823b) {
            i();
        }
        jD = m2.p.d(j10, jE);
        Object pVar2 = new m2.p(jD);
        fVar.f14764a = this;
        fVar.f14765b = jD;
        fVar.f14768e = 2;
        objInvoke = k2Var.invoke(pVar2, fVar);
        if (objInvoke == obj) {
            return obj;
        }
        jVar = this;
        jD2 = m2.p.d(jD, ((m2.p) objInvoke).f11825a);
        jVar.f14818o = false;
        if (m2.p.b(jD2) > 0.0f) {
            iP1 = d7.t.p0(m2.p.b(jD2));
            i19 = Build.VERSION.SDK_INT;
            edgeEffect6 = jVar.f14808e;
            if (i19 < 31) {
                edgeEffect6.onAbsorb(iP1);
            } else {
                edgeEffect6.onAbsorb(iP1);
            }
        } else if (m2.p.b(jD2) < 0.0f) {
            i14 = -d7.t.p0(m2.p.b(jD2));
            i15 = Build.VERSION.SDK_INT;
            edgeEffect3 = jVar.f14809f;
            if (i15 < 31) {
                edgeEffect3.onAbsorb(i14);
            } else {
                edgeEffect3.onAbsorb(i14);
            }
        }
        if (m2.p.c(jD2) > 0.0f) {
            iP0 = d7.t.p0(m2.p.c(jD2));
            i18 = Build.VERSION.SDK_INT;
            edgeEffect5 = jVar.f14806c;
            if (i18 < 31) {
                edgeEffect5.onAbsorb(iP0);
            } else {
                edgeEffect5.onAbsorb(iP0);
            }
        } else if (m2.p.c(jD2) < 0.0f) {
            i16 = -d7.t.p0(m2.p.c(jD2));
            i17 = Build.VERSION.SDK_INT;
            edgeEffect4 = jVar.f14807d;
            if (i17 < 31) {
                edgeEffect4.onAbsorb(i16);
            } else {
                edgeEffect4.onAbsorb(i16);
            }
        }
        if (jD2 != m2.p.f11823b) {
            jVar.i();
        }
        jVar.e();
        return lVar;
    }

    public final void e() {
        List list = this.f14810g;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i10);
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished() || z10;
        }
        if (z10) {
            i();
        }
    }

    public final boolean f(g1.g gVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-d1.f.d(this.f14819p), (-d1.f.b(this.f14819p)) + gVar.v(this.f14804a.f15000b.c()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean g(g1.g gVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-d1.f.b(this.f14819p), gVar.v(this.f14804a.f15000b.a(gVar.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean h(g1.g gVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iP0 = d7.t.p0(d1.f.d(this.f14819p));
        float fB = this.f14804a.f15000b.b(gVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, gVar.v(fB) + (-iP0));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final void i() {
        if (this.f14817n) {
            int i10 = this.f14815l;
            m0.l1 l1Var = this.f14816m;
            if (i10 == l1Var.d()) {
                l1Var.f(l1Var.d() + 1);
            }
        }
    }

    public final float j(long j10, long j11) {
        float fD = d1.c.d(j11) / d1.f.d(this.f14819p);
        float fC = -(d1.c.e(j10) / d1.f.b(this.f14819p));
        float f10 = 1 - fD;
        int i10 = Build.VERSION.SDK_INT;
        n nVar = n.f14854a;
        EdgeEffect edgeEffect = this.f14807d;
        if (i10 >= 31) {
            fC = nVar.c(edgeEffect, fC, f10);
        } else {
            edgeEffect.onPull(fC, f10);
        }
        return (Build.VERSION.SDK_INT >= 31 ? nVar.b(edgeEffect) : 0.0f) == 0.0f ? d1.f.b(this.f14819p) * (-fC) : d1.c.e(j10);
    }

    public final float k(long j10, long j11) {
        float fE = d1.c.e(j11) / d1.f.b(this.f14819p);
        float fD = d1.c.d(j10) / d1.f.d(this.f14819p);
        float f10 = 1 - fE;
        int i10 = Build.VERSION.SDK_INT;
        n nVar = n.f14854a;
        EdgeEffect edgeEffect = this.f14808e;
        if (i10 >= 31) {
            fD = nVar.c(edgeEffect, fD, f10);
        } else {
            edgeEffect.onPull(fD, f10);
        }
        return (Build.VERSION.SDK_INT >= 31 ? nVar.b(edgeEffect) : 0.0f) == 0.0f ? d1.f.d(this.f14819p) * fD : d1.c.d(j10);
    }

    public final float l(long j10, long j11) {
        float fE = d1.c.e(j11) / d1.f.b(this.f14819p);
        float fC = -(d1.c.d(j10) / d1.f.d(this.f14819p));
        int i10 = Build.VERSION.SDK_INT;
        n nVar = n.f14854a;
        EdgeEffect edgeEffect = this.f14809f;
        if (i10 >= 31) {
            fC = nVar.c(edgeEffect, fC, fE);
        } else {
            edgeEffect.onPull(fC, fE);
        }
        return (Build.VERSION.SDK_INT >= 31 ? nVar.b(edgeEffect) : 0.0f) == 0.0f ? d1.f.d(this.f14819p) * (-fC) : d1.c.d(j10);
    }

    public final float m(long j10, long j11) {
        float fD = d1.c.d(j11) / d1.f.d(this.f14819p);
        float fE = d1.c.e(j10) / d1.f.b(this.f14819p);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = n.f14854a;
        EdgeEffect edgeEffect = this.f14806c;
        if (i10 >= 31) {
            fE = nVar.c(edgeEffect, fE, fD);
        } else {
            edgeEffect.onPull(fE, fD);
        }
        return (Build.VERSION.SDK_INT >= 31 ? nVar.b(edgeEffect) : 0.0f) == 0.0f ? d1.f.b(this.f14819p) * fE : d1.c.e(j10);
    }
}
