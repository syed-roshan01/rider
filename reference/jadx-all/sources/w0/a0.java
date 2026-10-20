package w0;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.c f16022a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16024c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f16028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f16030i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f16023b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.i f16025d = new s.i(this, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q.w f16026e = new q.w(this, 27);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0.i f16027f = new o0.i(new z[16]);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16031j = -1;

    public a0(c9.c cVar) {
        this.f16022a = cVar;
    }

    public static final boolean a(a0 a0Var) {
        boolean z10;
        Set set;
        synchronized (a0Var.f16027f) {
            z10 = a0Var.f16024c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = a0Var.f16023b;
            Object obj = atomicReference.get();
            Set set2 = null;
            objSubList = null;
            Object objSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        m0.s.g("Unexpected notification");
                        throw null;
                    }
                    List list = (List) obj;
                    set = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                }
                Object obj2 = objSubList;
                while (true) {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set2 = set;
                    } else if (atomicReference.get() != obj) {
                    }
                }
            }
            if (set2 == null) {
                return z11;
            }
            synchronized (a0Var.f16027f) {
                o0.i iVar = a0Var.f16027f;
                int i10 = iVar.f12343c;
                if (i10 > 0) {
                    Object[] objArr = iVar.f12341a;
                    int i11 = 0;
                    do {
                        z11 = ((z) objArr[i11]).b(set2) || z11;
                        i11++;
                    } while (i11 < i10);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f16027f) {
            o0.i iVar = this.f16027f;
            int i10 = iVar.f12343c;
            if (i10 > 0) {
                Object[] objArr = iVar.f12341a;
                int i11 = 0;
                do {
                    z zVar = (z) objArr[i11];
                    zVar.f16137e.f12344a.a();
                    zVar.f16138f.a();
                    zVar.f16143k.f12344a.a();
                    zVar.f16144l.clear();
                    i11++;
                } while (i11 < i10);
            }
        }
    }

    public final void c(Object obj, c9.c cVar, c9.a aVar) {
        Object obj2;
        z zVar;
        synchronized (this.f16027f) {
            o0.i iVar = this.f16027f;
            int i10 = iVar.f12343c;
            if (i10 <= 0) {
                obj2 = null;
                break;
            }
            Object[] objArr = iVar.f12341a;
            int i11 = 0;
            while (true) {
                obj2 = objArr[i11];
                if (((z) obj2).f16133a == cVar) {
                    break;
                }
                i11++;
                if (i11 >= i10) {
                    obj2 = null;
                    break;
                }
            }
            zVar = (z) obj2;
            if (zVar == null) {
                d7.a.k(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                z6.a.f(1, cVar);
                zVar = new z(cVar);
                iVar.c(zVar);
            }
        }
        boolean z10 = this.f16029h;
        z zVar2 = this.f16030i;
        long j10 = this.f16031j;
        if (j10 != -1 && j10 != Thread.currentThread().getId()) {
            throw new IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + Thread.currentThread().getId() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
        }
        try {
            this.f16029h = false;
            this.f16030i = zVar;
            this.f16031j = Thread.currentThread().getId();
            zVar.a(obj, this.f16026e, aVar);
        } finally {
            this.f16030i = zVar2;
            this.f16029h = z10;
            this.f16031j = j10;
        }
    }
}
