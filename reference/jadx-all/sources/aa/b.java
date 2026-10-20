package aa;

import ba.k;
import ba.l;
import ea.r;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj, String str) {
        super(str, true);
        this.f1340e = i10;
        this.f1341f = obj;
    }

    @Override // aa.a
    public final long a() {
        int i10 = 0;
        switch (this.f1340e) {
            case 0:
                ((c9.a) this.f1341f).invoke();
                return -1L;
            case 1:
                l lVar = (l) this.f1341f;
                long jNanoTime = System.nanoTime();
                long j10 = Long.MIN_VALUE;
                k kVar = null;
                int i11 = 0;
                for (k kVar2 : lVar.f2829e) {
                    d7.a.l(kVar2, "connection");
                    synchronized (kVar2) {
                        if (lVar.b(kVar2, jNanoTime) > 0) {
                            i11++;
                        } else {
                            i10++;
                            long j11 = jNanoTime - kVar2.f2824q;
                            if (j11 > j10) {
                                kVar = kVar2;
                                j10 = j11;
                            }
                        }
                    }
                }
                long j12 = lVar.f2826b;
                if (j10 < j12 && i10 <= lVar.f2825a) {
                    if (i10 > 0) {
                        return j12 - j10;
                    }
                    if (i11 > 0) {
                        return j12;
                    }
                    return -1L;
                }
                d7.a.j(kVar);
                synchronized (kVar) {
                    if (!(!kVar.f2823p.isEmpty()) && kVar.f2824q + j10 == jNanoTime) {
                        kVar.f2817j = true;
                        lVar.f2829e.remove(kVar);
                        Socket socket = kVar.f2811d;
                        d7.a.j(socket);
                        y9.b.c(socket);
                        if (lVar.f2829e.isEmpty()) {
                            lVar.f2827c.a();
                        }
                    }
                }
                return 0L;
            default:
                r rVar = (r) this.f1341f;
                rVar.getClass();
                try {
                    rVar.F.X(2, false, 0);
                    break;
                } catch (IOException e4) {
                    rVar.b(e4);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.f1340e = 1;
        this.f1341f = lVar;
    }
}
