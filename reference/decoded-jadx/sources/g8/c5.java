package g8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f6703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f6704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g5 f6706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6708h;

    public c5(List list, Collection collection, Collection collection2, g5 g5Var, boolean z10, boolean z11, boolean z12, int i10) {
        this.f6702b = list;
        y3.e.J(collection, "drainedSubstreams");
        this.f6703c = collection;
        this.f6706f = g5Var;
        this.f6704d = collection2;
        this.f6707g = z10;
        this.f6701a = z11;
        this.f6708h = z12;
        this.f6705e = i10;
        y3.e.N("passThrough should imply buffer is null", !z11 || list == null);
        y3.e.N("passThrough should imply winningSubstream != null", (z11 && g5Var == null) ? false : true);
        y3.e.N("passThrough should imply winningSubstream is drained", !z11 || (collection.size() == 1 && collection.contains(g5Var)) || (collection.size() == 0 && g5Var.f6818b));
        y3.e.N("cancelled should imply committed", (z10 && g5Var == null) ? false : true);
    }

    public final c5 a(g5 g5Var) {
        Collection collectionUnmodifiableCollection;
        y3.e.N("hedging frozen", !this.f6708h);
        y3.e.N("already committed", this.f6706f == null);
        Collection collection = this.f6704d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(g5Var);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(g5Var);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new c5(this.f6702b, this.f6703c, collectionUnmodifiableCollection, this.f6706f, this.f6707g, this.f6701a, this.f6708h, this.f6705e + 1);
    }

    public final c5 b(g5 g5Var) {
        ArrayList arrayList = new ArrayList(this.f6704d);
        arrayList.remove(g5Var);
        return new c5(this.f6702b, this.f6703c, Collections.unmodifiableCollection(arrayList), this.f6706f, this.f6707g, this.f6701a, this.f6708h, this.f6705e);
    }

    public final c5 c(g5 g5Var, g5 g5Var2) {
        ArrayList arrayList = new ArrayList(this.f6704d);
        arrayList.remove(g5Var);
        arrayList.add(g5Var2);
        return new c5(this.f6702b, this.f6703c, Collections.unmodifiableCollection(arrayList), this.f6706f, this.f6707g, this.f6701a, this.f6708h, this.f6705e);
    }

    public final c5 d(g5 g5Var) {
        g5Var.f6818b = true;
        Collection collection = this.f6703c;
        if (!collection.contains(g5Var)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(g5Var);
        return new c5(this.f6702b, Collections.unmodifiableCollection(arrayList), this.f6704d, this.f6706f, this.f6707g, this.f6701a, this.f6708h, this.f6705e);
    }

    public final c5 e(g5 g5Var) {
        List list;
        y3.e.N("Already passThrough", !this.f6701a);
        boolean z10 = g5Var.f6818b;
        Collection collectionUnmodifiableCollection = this.f6703c;
        if (!z10) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(g5Var);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(g5Var);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        g5 g5Var2 = this.f6706f;
        boolean z11 = g5Var2 != null;
        if (z11) {
            y3.e.N("Another RPC attempt has already committed", g5Var2 == g5Var);
            list = null;
        } else {
            list = this.f6702b;
        }
        return new c5(list, collection, this.f6704d, this.f6706f, this.f6707g, z11, this.f6708h, this.f6705e);
    }
}
