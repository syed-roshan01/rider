package m0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n2 implements Iterable, e9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11597b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11601f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11602n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashMap f11604p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f11596a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f11598c = new Object[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f11603o = new ArrayList();

    public final int e(c cVar) {
        if (!(!this.f11601f)) {
            s.g("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        }
        if (cVar.a()) {
            return cVar.f11464a;
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    public final m2 i() {
        if (this.f11601f) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f11600e++;
        return new m2(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r0(0, this.f11597b, this);
    }

    public final q2 k() {
        if (!(!this.f11601f)) {
            s.g("Cannot start a writer when another writer is pending".toString());
            throw null;
        }
        if (this.f11600e > 0) {
            s.g("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        this.f11601f = true;
        this.f11602n++;
        return new q2(this);
    }

    public final boolean n(c cVar) {
        int iQ0;
        return cVar.a() && (iQ0 = d7.t.q0(this.f11603o, cVar.f11464a, this.f11597b)) >= 0 && d7.a.d(this.f11603o.get(iQ0), cVar);
    }
}
