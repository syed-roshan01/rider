package y2;

import java.util.ArrayList;
import l.t;
import q.z;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16858b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f16857a = i10;
        this.f16858b = obj;
    }

    public final void a(f fVar) {
        switch (this.f16857a) {
            case 0:
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((t) this.f16858b).g(fVar);
                return;
            default:
                synchronized (g.f16863c) {
                    try {
                        z zVar = g.f16864d;
                        ArrayList arrayList = (ArrayList) zVar.get((String) this.f16858b);
                        if (arrayList == null) {
                            return;
                        }
                        zVar.remove((String) this.f16858b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((a3.a) arrayList.get(i10)).accept(fVar);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    @Override // a3.a
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f16857a) {
            case 0:
                a((f) obj);
                break;
            default:
                a((f) obj);
                break;
        }
    }
}
