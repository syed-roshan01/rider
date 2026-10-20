package n;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f12031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f12032d;

    public c(Object obj, Object obj2) {
        this.f12029a = obj;
        this.f12030b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12029a.equals(cVar.f12029a) && this.f12030b.equals(cVar.f12030b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12029a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12030b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12029a.hashCode() ^ this.f12030b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f12029a + "=" + this.f12030b;
    }
}
