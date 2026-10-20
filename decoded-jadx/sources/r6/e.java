package r6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f13529b;

    public /* synthetic */ e(i iVar, int i10) {
        this.f13528a = i10;
        this.f13529b = iVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f13528a;
        i iVar = this.f13529b;
        switch (i10) {
            case 0:
                iVar.clear();
                break;
            default:
                iVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f13528a;
        i iVar = this.f13529b;
        switch (i10) {
            case 0:
                Map mapB = iVar.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = iVar.d(entry.getKey());
                    if (iD != -1 && y3.e.f0(iVar.k()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return iVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f13528a;
        i iVar = this.f13529b;
        switch (i10) {
            case 0:
                Map mapB = iVar.b();
                return mapB != null ? mapB.entrySet().iterator() : new d(iVar, 1);
            default:
                Map mapB2 = iVar.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new d(iVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10 = this.f13528a;
        i iVar = this.f13529b;
        switch (i10) {
            case 0:
                Map mapB = iVar.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (iVar.f()) {
                    return false;
                }
                int iC = iVar.c();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = iVar.f13555a;
                Objects.requireNonNull(obj2);
                int iB0 = z6.a.b0(key, value, iC, obj2, iVar.i(), iVar.j(), iVar.k());
                if (iB0 == -1) {
                    return false;
                }
                iVar.e(iB0, iC);
                iVar.f13560f--;
                iVar.f13559e += 32;
                return true;
            default:
                Map mapB2 = iVar.b();
                if (mapB2 != null) {
                    return mapB2.keySet().remove(obj);
                }
                return iVar.h(obj) != i.f13554q;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f13528a;
        i iVar = this.f13529b;
        switch (i10) {
            case 0:
                break;
        }
        return iVar.size();
    }
}
