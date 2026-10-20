package a;

import a2.b0;
import a2.c0;
import android.graphics.Rect;
import b.g;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.c;
import d7.t;
import d9.i;
import d9.u;
import f0.j1;
import f0.o1;
import f0.v;
import f2.d;
import g0.b;
import g2.a0;
import g2.h0;
import g2.j;
import g2.o;
import k.r;
import m2.l;
import m9.e0;
import o1.s;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f767a;

    public /* synthetic */ a(int i10) {
        this.f767a = i10;
    }

    public static b a(b bVar, l lVar, c0 c0Var, m2.b bVar2, d dVar) {
        if (bVar != null && lVar == bVar.f6423a && d7.a.d(c0Var, bVar.f6424b) && bVar2.c() == bVar.f6425c.c() && dVar == bVar.f6426d) {
            return bVar;
        }
        b bVar3 = b.f6422h;
        if (bVar3 != null && lVar == bVar3.f6423a && d7.a.d(c0Var, bVar3.f6424b) && bVar2.c() == bVar3.f6425c.c() && dVar == bVar3.f6426d) {
            return bVar3;
        }
        b bVar4 = new b(lVar, s.g0(c0Var, lVar), bVar2, dVar);
        b.f6422h = bVar4;
        return bVar4;
    }

    public static void b(a0 a0Var, j1 j1Var, a2.a0 a0Var2, r1.s sVar, h0 h0Var, boolean z10, g2.s sVar2) {
        d1.d dVarB;
        Rect rect;
        if (z10) {
            int iB = sVar2.b(b0.d(a0Var.f6510b));
            if (iB < a0Var2.f893a.f1052a.f918a.length()) {
                dVarB = a0Var2.b(iB);
            } else {
                dVarB = iB != 0 ? a0Var2.b(iB - 1) : new d1.d(0.0f, 0.0f, 1.0f, (int) (o1.b(j1Var.f5798b, j1Var.f5803g, j1Var.f5804h) & 4294967295L));
            }
            long jP = sVar.P(i.f(dVarB.f4332a, dVarB.f4333b));
            d1.d dVarH = e0.h(i.f(c.d(jP), c.e(jP)), t.j(dVarB.c(), dVarB.b()));
            if (d7.a.d((h0) h0Var.f6565a.f6513b.get(), h0Var)) {
                g2.e0 e0Var = (g2.e0) h0Var.f6566b;
                e0Var.getClass();
                e0Var.f6554k = new Rect(t.p0(dVarH.f4332a), t.p0(dVarH.f4333b), t.p0(dVarH.f4334c), t.p0(dVarH.f4335d));
                if (!e0Var.f6552i.isEmpty() || (rect = e0Var.f6554k) == null) {
                    return;
                }
                e0Var.f6544a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    public static h0 d(g2.b0 b0Var, a0 a0Var, j jVar, o oVar, v vVar, v vVar2) {
        u uVar = new u();
        g gVar = new g(jVar, vVar, uVar, 13);
        g2.v vVar3 = b0Var.f6512a;
        g2.e0 e0Var = (g2.e0) vVar3;
        e0Var.f6547d = true;
        e0Var.f6550g = a0Var;
        e0Var.f6551h = oVar;
        e0Var.f6548e = gVar;
        e0Var.f6549f = vVar2;
        e0Var.a(g2.c0.f6514a);
        h0 h0Var = new h0(b0Var, vVar3);
        b0Var.f6513b.set(h0Var);
        uVar.f4952a = h0Var;
        return h0Var;
    }

    @Override // k.r
    public final void c(k.l lVar, boolean z10) {
    }

    @Override // k.r
    public final boolean h(k.l lVar) {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        this(1);
        this.f767a = i10;
        switch (i10) {
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
            default:
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case Code.UNAVAILABLE /* 14 */:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                this(16);
                break;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                this(17);
                break;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
