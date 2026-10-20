package g8;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7125b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.f7124a = i10;
        this.f7125b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        int i11 = this.f7124a;
        Object obj = this.f7125b;
        switch (i11) {
            case 0:
                ((v0) obj).f7166f.halfClose();
                break;
            case 1:
                ((u0) obj).f7148a.onReady();
                break;
            case 2:
                ((c1) obj).f6682a.b();
                break;
            case 3:
                j2 j2Var = (j2) ((x1) obj).f7215c;
                u3 u3Var = j2Var.f6882r;
                j2Var.f6881q = null;
                j2Var.f6882r = null;
                u3Var.f(e8.c2.f5224m.g("InternalSubchannel closed transport due to address change"));
                break;
            case 4:
                ((l3) ((z5.k) obj).f17260a).C();
                break;
            case 5:
                l3 l3Var = ((c3) obj).f6689b;
                l3Var.f6939m.d();
                if (l3Var.f6948v) {
                    l3Var.f6947u.n();
                }
                break;
            case 6:
                h3 h3Var = (h3) obj;
                Collection collection = h3Var.f6830n.f6853d.A;
                if (collection != null) {
                    collection.remove(h3Var);
                    i3 i3Var = h3Var.f6830n;
                    if (i3Var.f6853d.A.isEmpty()) {
                        l3 l3Var2 = i3Var.f6853d;
                        l3Var2.X.f(l3Var2.B, false);
                        l3 l3Var3 = i3Var.f6853d;
                        l3Var3.A = null;
                        if (l3Var3.F.get()) {
                            i3Var.f6853d.E.c(l3.f6922e0);
                        }
                    }
                }
                break;
            case 7:
                j2 j2Var2 = ((k3) obj).f6904f;
                e8.c2 c2Var = l3.f6923f0;
                j2Var2.getClass();
                j2Var2.f6875k.execute(new b2(j2Var2, c2Var, i10));
                break;
            case 8:
                ((e8.x0) ((w2) obj).f7192t).f();
                break;
            case 9:
                y2 y2Var = (y2) obj;
                if (!y2Var.f7288z) {
                    y2Var.f7283u.b();
                }
                break;
            case 10:
                d5 d5Var = (d5) obj;
                y2 y2Var2 = d5Var.f6731c.f6765b;
                e8.g1 g1Var = y2.E;
                y2Var2.v(d5Var.f6730b);
                break;
            default:
                ((m5) obj).n();
                break;
        }
    }
}
