package g8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f6762b;

    public /* synthetic */ f3(i3 i3Var, int i10) {
        this.f6761a = i10;
        this.f6762b = i3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.f6761a) {
            case 0:
                i3 i3Var = this.f6762b;
                if (i3Var.f6853d.A == null) {
                    if (i3Var.f6850a.get() == l3.f6925h0) {
                        i3Var.f6850a.set(null);
                    }
                    i3Var.f6853d.E.c(l3.f6922e0);
                    return;
                }
                return;
            case 1:
                if (this.f6762b.f6850a.get() == l3.f6925h0) {
                    this.f6762b.f6850a.set(null);
                }
                Collection collection = this.f6762b.f6853d.A;
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((h3) it.next()).cancel("Channel is forcefully shutdown", null);
                    }
                }
                i3.a0 a0Var = this.f6762b.f6853d.E;
                e8.c2 c2Var = l3.f6921d0;
                a0Var.c(c2Var);
                synchronized (a0Var.f7941a) {
                    arrayList = new ArrayList((Collection) a0Var.f7942b);
                    break;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((h0) it2.next()).i(c2Var);
                }
                ((l3) a0Var.f7944d).D.c(c2Var);
                return;
            default:
                this.f6762b.f6853d.C();
                return;
        }
    }
}
