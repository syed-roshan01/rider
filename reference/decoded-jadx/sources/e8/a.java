package e8;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f5195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IdentityHashMap f5196b;

    public a(c cVar) {
        this.f5195a = cVar;
    }

    public final c a() {
        if (this.f5196b != null) {
            for (Map.Entry entry : this.f5195a.f5207a.entrySet()) {
                if (!this.f5196b.containsKey(entry.getKey())) {
                    this.f5196b.put((b) entry.getKey(), entry.getValue());
                }
            }
            this.f5195a = new c(this.f5196b);
            this.f5196b = null;
        }
        return this.f5195a;
    }

    public final void b(b bVar) {
        if (this.f5195a.f5207a.containsKey(bVar)) {
            IdentityHashMap identityHashMap = new IdentityHashMap(this.f5195a.f5207a);
            identityHashMap.remove(bVar);
            this.f5195a = new c(identityHashMap);
        }
        IdentityHashMap identityHashMap2 = this.f5196b;
        if (identityHashMap2 != null) {
            identityHashMap2.remove(bVar);
        }
    }

    public final void c(b bVar, Object obj) {
        if (this.f5196b == null) {
            this.f5196b = new IdentityHashMap(1);
        }
        this.f5196b.put(bVar, obj);
    }
}
