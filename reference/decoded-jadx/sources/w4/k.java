package w4;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f16183a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l4.n f16184b;

    @Override // w4.i
    public boolean a() {
        boolean z10;
        synchronized (h.f16173a) {
            try {
                int i10 = h.f16175c;
                h.f16175c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > h.f16176d + ((long) 30000)) {
                    h.f16175c = 0;
                    h.f16176d = SystemClock.uptimeMillis();
                    String[] list = h.f16174b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    h.f16177e = list.length < 800;
                }
                z10 = h.f16177e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // w4.i
    public boolean b(t4.f fVar) {
        f6.a aVar = fVar.f14658a;
        if (!(aVar instanceof t4.a) || ((t4.a) aVar).f14647z > 100) {
            f6.a aVar2 = fVar.f14659b;
            if (!(aVar2 instanceof t4.a) || ((t4.a) aVar2).f14647z > 100) {
                return true;
            }
        }
        return false;
    }
}
