package r6;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends t implements NavigableSet, j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Comparator f13585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient v f13586e;

    public v(Comparator comparator) {
        this.f13585d = comparator;
    }

    public static h0 r(Comparator comparator) {
        return y.f13589a.equals(comparator) ? h0.f13552n : new h0(a0.f13516e, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f13585d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        v vVarR = this.f13586e;
        if (vVarR == null) {
            h0 h0Var = (h0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(h0Var.f13585d);
            vVarR = h0Var.isEmpty() ? r(comparatorReverseOrder) : new h0(h0Var.f13553f.q(), comparatorReverseOrder);
            this.f13586e = vVarR;
            vVarR.f13586e = this;
        }
        return vVarR;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        h0 h0Var = (h0) this;
        return h0Var.t(0, h0Var.u(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final h0 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        y3.e.H(this.f13585d.compare(obj, obj2) <= 0);
        h0 h0Var = (h0) this;
        h0 h0VarT = h0Var.t(h0Var.v(obj, z10), h0Var.f13553f.size());
        return h0VarT.t(0, h0VarT.u(obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        h0 h0Var = (h0) this;
        return h0Var.t(h0Var.v(obj, z10), h0Var.f13553f.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        h0 h0Var = (h0) this;
        return h0Var.t(0, h0Var.u(obj, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        h0 h0Var = (h0) this;
        return h0Var.t(h0Var.v(obj, true), h0Var.f13553f.size());
    }
}
