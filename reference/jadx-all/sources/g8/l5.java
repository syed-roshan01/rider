package g8;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l5 extends e8.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e8.i f6959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m5 f6960e;

    public l5(m5 m5Var, e8.i iVar) {
        this.f6960e = m5Var;
        this.f6959d = iVar;
    }

    @Override // e8.i
    public final void d(e8.c2 c2Var) {
        this.f6959d.d(c2Var);
        this.f6960e.f6966c.execute(new androidx.activity.d(this, 15));
    }

    @Override // e8.i
    public final void e(e8.s1 s1Var) {
        e8.b bVar = m5.f6964d;
        e8.c cVar = s1Var.f5362b;
        if (cVar.f5207a.get(bVar) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        Collections.emptyList();
        e8.c cVar2 = e8.c.f5206b;
        cVar.getClass();
        k5 k5Var = new k5(this.f6960e);
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(bVar, k5Var);
        for (Map.Entry entry : cVar.f5207a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((e8.b) entry.getKey(), entry.getValue());
            }
        }
        this.f6959d.e(new e8.s1(s1Var.f5361a, new e8.c(identityHashMap), s1Var.f5363c));
    }
}
