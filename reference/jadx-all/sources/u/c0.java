package u;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends t1.o implements t1.p1, m1.c {
    public final g0 A;
    public final e0 B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x.m f14742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c9.a f14744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f14745z;

    public c0(x.m mVar, boolean z10, String str, y1.g gVar, c9.a aVar) {
        this.f14742w = mVar;
        this.f14743x = z10;
        this.f14744y = aVar;
        a aVar2 = new a();
        this.f14745z = aVar2;
        g0 g0Var = new g0();
        g0Var.f14776u = z10;
        g0Var.f14777v = str;
        g0Var.f14778w = gVar;
        g0Var.f14779x = aVar;
        g0Var.f14780y = null;
        g0Var.f14781z = null;
        G0(g0Var);
        this.A = g0Var;
        e0 e0Var = new e0(z10, mVar, aVar, aVar2);
        G0(e0Var);
        this.B = e0Var;
    }

    @Override // y0.n
    public final void A0() {
        H0();
    }

    public final void H0() {
        a aVar = this.f14745z;
        x.o oVar = aVar.f14713b;
        if (oVar != null) {
            this.f14742w.b(new x.n(oVar));
        }
        LinkedHashMap linkedHashMap = aVar.f14712a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            this.f14742w.b(new x.n((x.o) it.next()));
        }
        aVar.f14713b = null;
        linkedHashMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0059  */
    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // m1.c
    public final boolean M(KeyEvent keyEvent) {
        boolean z10 = this.f14743x;
        a aVar = this.f14745z;
        if (!z10) {
            if (this.f14743x) {
                return false;
            }
            int i10 = h0.f14795b;
            return !z6.a.B(androidx.compose.ui.input.key.a.b(keyEvent), 1) ? false : false;
        }
        int i11 = h0.f14795b;
        if (z6.a.B(androidx.compose.ui.input.key.a.b(keyEvent), 2) && h0.a(keyEvent)) {
            if (aVar.f14712a.containsKey(new m1.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode())))) {
                return false;
            }
            x.o oVar = new x.o(aVar.f14714c);
            aVar.f14712a.put(new m1.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode())), oVar);
            z6.a.Q(v0(), null, 0, new b(this, oVar, null), 3);
        } else {
            if (this.f14743x) {
                return false;
            }
            int i12 = h0.f14795b;
            if (!z6.a.B(androidx.compose.ui.input.key.a.b(keyEvent), 1) && h0.a(keyEvent)) {
                x.o oVar2 = (x.o) aVar.f14712a.remove(new m1.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode())));
                if (oVar2 != null) {
                    z6.a.Q(v0(), null, 0, new c(this, oVar2, null), 3);
                }
                this.f14744y.invoke();
            }
        }
        return true;
    }

    @Override // t1.p1
    public final void b0() {
        this.B.b0();
    }

    @Override // m1.c
    public final /* bridge */ /* synthetic */ boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // t1.p1
    public final void y(o1.k kVar, o1.l lVar, long j10) {
        this.B.y(kVar, lVar, j10);
    }
}
