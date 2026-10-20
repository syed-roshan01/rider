package t1;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14528a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.c f14529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f14530c;

    public q() {
        q8.d[] dVarArr = q8.d.f13224a;
        this.f14529b = z6.a.R(j.f14451b);
        this.f14530c = new v1(new p(0));
    }

    public final void a(androidx.compose.ui.node.a aVar) {
        if (!aVar.C()) {
            throw new IllegalStateException("DepthSortedSet.add called on an unattached node".toString());
        }
        if (this.f14528a) {
            q8.c cVar = this.f14529b;
            Integer num = (Integer) ((Map) cVar.getValue()).get(aVar);
            if (num == null) {
                ((Map) cVar.getValue()).put(aVar, Integer.valueOf(aVar.f1745q));
            } else {
                if (num.intValue() != aVar.f1745q) {
                    throw new IllegalStateException("invalid node depth".toString());
                }
            }
        }
        this.f14530c.add(aVar);
    }

    public final boolean b(androidx.compose.ui.node.a aVar) {
        boolean zContains = this.f14530c.contains(aVar);
        if (!this.f14528a || zContains == ((Map) this.f14529b.getValue()).containsKey(aVar)) {
            return zContains;
        }
        throw new IllegalStateException("inconsistency in TreeSet".toString());
    }

    public final boolean c(androidx.compose.ui.node.a aVar) {
        if (!aVar.C()) {
            throw new IllegalStateException("DepthSortedSet.remove called on an unattached node".toString());
        }
        boolean zRemove = this.f14530c.remove(aVar);
        if (this.f14528a) {
            if (!d7.a.d((Integer) ((Map) this.f14529b.getValue()).remove(aVar), zRemove ? Integer.valueOf(aVar.f1745q) : null)) {
                throw new IllegalStateException("invalid node depth".toString());
            }
        }
        return zRemove;
    }

    public final String toString() {
        return this.f14530c.toString();
    }
}
