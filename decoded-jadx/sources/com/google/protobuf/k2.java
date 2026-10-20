package com.google.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends AbstractMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f4168n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4169a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile q.a f4173e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f4170b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f4171c = Collections.emptyMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f4174f = Collections.emptyMap();

    public k2(int i10) {
        this.f4169a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f4170b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((o2) this.f4170b.get(i12)).f4195a);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((o2) this.f4170b.get(i13)).f4195a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((o2) this.f4170b.get(i12)).f4195a);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void b() {
        if (this.f4172d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        b();
        if (!this.f4170b.isEmpty()) {
            this.f4170b.clear();
        }
        if (this.f4171c.isEmpty()) {
            return;
        }
        this.f4171c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4171c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        if (this.f4173e == null) {
            this.f4173e = new q.a(this);
        }
        return this.f4173e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return super.equals(obj);
        }
        k2 k2Var = (k2) obj;
        int size = size();
        if (size != k2Var.size()) {
            return false;
        }
        int size2 = this.f4170b.size();
        if (size2 != k2Var.f4170b.size()) {
            return entrySet().equals(k2Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!i(i10).equals(k2Var.i(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f4171c.equals(k2Var.f4171c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((o2) this.f4170b.get(iA)).f4196b : this.f4171c.get(comparable);
    }

    public final Map.Entry i(int i10) {
        return (Map.Entry) this.f4170b.get(i10);
    }

    public final Iterable j() {
        return this.f4171c.isEmpty() ? n2.f4187b : this.f4171c.entrySet();
    }

    public final SortedMap k() {
        b();
        if (this.f4171c.isEmpty() && !(this.f4171c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4171c = treeMap;
            this.f4174f = treeMap.descendingMap();
        }
        return (SortedMap) this.f4171c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int size = this.f4170b.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((o2) this.f4170b.get(i10)).hashCode();
        }
        return this.f4171c.size() > 0 ? iHashCode + this.f4171c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((o2) this.f4170b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f4170b.isEmpty();
        int i10 = this.f4169a;
        if (zIsEmpty && !(this.f4170b instanceof ArrayList)) {
            this.f4170b = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return k().put(comparable, obj);
        }
        if (this.f4170b.size() == i10) {
            o2 o2Var = (o2) this.f4170b.remove(i10 - 1);
            k().put(o2Var.f4195a, o2Var.f4196b);
        }
        this.f4170b.add(i11, new o2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return o(iA);
        }
        if (this.f4171c.isEmpty()) {
            return null;
        }
        return this.f4171c.remove(comparable);
    }

    public final Object o(int i10) {
        b();
        Object obj = ((o2) this.f4170b.remove(i10)).f4196b;
        if (!this.f4171c.isEmpty()) {
            Iterator it = k().entrySet().iterator();
            List list = this.f4170b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new o2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f4171c.size() + this.f4170b.size();
    }
}
