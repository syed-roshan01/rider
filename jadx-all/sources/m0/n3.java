package m0;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11605a;

    public n3(Object obj) {
        this.f11605a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3) && d7.a.d(this.f11605a, ((n3) obj).f11605a);
    }

    @Override // m0.l3
    public final Object getValue() {
        return this.f11605a;
    }

    public final int hashCode() {
        Object obj = this.f11605a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f11605a + ')';
    }
}
