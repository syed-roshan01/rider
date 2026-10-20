package ba;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.c f2827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final aa.b f2828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f2829e;

    public l(aa.f fVar, TimeUnit timeUnit) {
        d7.a.m(fVar, "taskRunner");
        d7.a.m(timeUnit, "timeUnit");
        this.f2825a = 5;
        this.f2826b = timeUnit.toNanos(5L);
        this.f2827c = fVar.f();
        this.f2828d = new aa.b(this, a7.a.p(new StringBuilder(), y9.b.f17005f, " ConnectionPool"));
        this.f2829e = new ConcurrentLinkedQueue();
    }

    public final boolean a(x9.a aVar, i iVar, List list, boolean z10) {
        d7.a.m(aVar, "address");
        d7.a.m(iVar, "call");
        for (k kVar : this.f2829e) {
            d7.a.l(kVar, "connection");
            synchronized (kVar) {
                if (z10) {
                    if (kVar.f2814g == null) {
                        continue;
                    }
                }
                if (kVar.h(aVar, list)) {
                    iVar.b(kVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(k kVar, long j10) {
        byte[] bArr = y9.b.f17000a;
        ArrayList arrayList = kVar.f2823p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + kVar.f2809b.f16377a.f16327i + " was leaked. Did you forget to close a response body?";
                fa.m mVar = fa.m.f6417a;
                fa.m.f6417a.j(((g) reference).f2788a, str);
                arrayList.remove(i10);
                kVar.f2817j = true;
                if (arrayList.isEmpty()) {
                    kVar.f2824q = j10 - this.f2826b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
