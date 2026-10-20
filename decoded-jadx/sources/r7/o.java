package r7;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f13622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f13623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f13624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f13625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f13626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13627f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f13629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13630p;

    public o(boolean z10) {
        this.f13627f = null;
        this.f13628n = z10;
        this.f13626e = this;
        this.f13625d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f13627f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f13629o;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13627f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13629o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f13627f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f13629o;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f13628n) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f13629o;
        this.f13629o = obj;
        return obj2;
    }

    public final String toString() {
        return this.f13627f + "=" + this.f13629o;
    }

    public o(boolean z10, o oVar, Object obj, o oVar2, o oVar3) {
        this.f13622a = oVar;
        this.f13627f = obj;
        this.f13628n = z10;
        this.f13630p = 1;
        this.f13625d = oVar2;
        this.f13626e = oVar3;
        oVar3.f13625d = this;
        oVar2.f13626e = this;
    }
}
