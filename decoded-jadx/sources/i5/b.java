package i5;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8064a;

    public b(Integer num) {
        this.f8064a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Integer num = this.f8064a;
        if (num == null) {
            return bVar.f8064a == null;
        }
        return num.equals(bVar.f8064a);
    }

    public final int hashCode() {
        Integer num = this.f8064a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f8064a + "}";
    }
}
