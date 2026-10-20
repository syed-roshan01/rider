package y1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.a f16746b;

    public a(String str, q8.a aVar) {
        this.f16745a = str;
        this.f16746b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d7.a.d(this.f16745a, aVar.f16745a) && d7.a.d(this.f16746b, aVar.f16746b);
    }

    public final int hashCode() {
        String str = this.f16745a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        q8.a aVar = this.f16746b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f16745a + ", action=" + this.f16746b + ')';
    }
}
