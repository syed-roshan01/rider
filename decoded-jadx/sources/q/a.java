package q;

import com.google.crypto.tink.shaded.protobuf.l1;
import com.google.crypto.tink.shaded.protobuf.m1;
import com.google.protobuf.k2;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f12974b;

    public /* synthetic */ a(int i10, Map map) {
        this.f12973a = i10;
        this.f12974b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        switch (this.f12973a) {
            case 1:
                return e((Map.Entry) obj);
            case 2:
                return e((Map.Entry) obj);
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f12973a;
        Map map = this.f12974b;
        switch (i10) {
            case 1:
                ((l1) map).b();
                break;
            case 2:
                ((k2) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f12973a;
        Map map = this.f12974b;
        switch (i10) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object objC = ((l1) map).c(entry.getKey());
                Object value = entry.getValue();
                if (objC != value) {
                    return objC != null && objC.equals(value);
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object objH = ((k2) map).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (objH != value2) {
                    return objH != null && objH.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    public final boolean e(Map.Entry entry) {
        int i10 = this.f12973a;
        Map map = this.f12974b;
        switch (i10) {
            case 1:
                if (contains(entry)) {
                    return false;
                }
                ((l1) map).d((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                if (contains(entry)) {
                    return false;
                }
                ((k2) map).put((Comparable) entry.getKey(), entry.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i10 = this.f12973a;
        Map map = this.f12974b;
        switch (i10) {
            case 0:
                return new d((f) map);
            case 1:
                return new m1((l1) map);
            default:
                return new m1((k2) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10 = this.f12973a;
        Map map = this.f12974b;
        switch (i10) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((l1) map).e(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((k2) map).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f12973a;
        Map map = this.f12974b;
        switch (i10) {
            case 0:
                return ((f) map).f13045c;
            case 1:
                return ((l1) map).h();
            default:
                return ((k2) map).size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(k2 k2Var) {
        this(2, k2Var);
        this.f12973a = 2;
    }
}
