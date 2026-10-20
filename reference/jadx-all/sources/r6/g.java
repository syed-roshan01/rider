package r6;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f13543c;

    public g(i iVar, int i10) {
        this.f13543c = iVar;
        Object obj = i.f13554q;
        this.f13541a = iVar.j()[i10];
        this.f13542b = i10;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return y3.e.f0(this.f13541a, entry.getKey()) && y3.e.f0(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Object value = getValue();
        Object obj = this.f13541a;
        return (obj == null ? 0 : obj.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return this.f13541a + "=" + getValue();
    }

    public final void d() {
        int i10 = this.f13542b;
        Object obj = this.f13541a;
        i iVar = this.f13543c;
        if (i10 != -1 && i10 < iVar.size()) {
            if (y3.e.f0(obj, iVar.j()[this.f13542b])) {
                return;
            }
        }
        Object obj2 = i.f13554q;
        this.f13542b = iVar.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13541a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        i iVar = this.f13543c;
        Map mapB = iVar.b();
        if (mapB != null) {
            return mapB.get(this.f13541a);
        }
        d();
        int i10 = this.f13542b;
        if (i10 == -1) {
            return null;
        }
        return iVar.k()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        i iVar = this.f13543c;
        Map mapB = iVar.b();
        Object obj2 = this.f13541a;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        d();
        int i10 = this.f13542b;
        if (i10 == -1) {
            iVar.put(obj2, obj);
            return null;
        }
        Object obj3 = iVar.k()[i10];
        iVar.k()[this.f13542b] = obj;
        return obj3;
    }
}
