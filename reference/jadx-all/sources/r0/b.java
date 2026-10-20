package r0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b implements Map.Entry, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13300b;

    public b(Object obj, Object obj2) {
        this.f13299a = obj;
        this.f13300b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && d7.a.d(entry.getKey(), this.f13299a) && d7.a.d(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13299a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f13300b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f13299a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13299a);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
