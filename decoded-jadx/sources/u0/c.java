package u0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15006a;

    public c(int i10) {
        this.f15006a = i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f15006a);
        sb.append(")@");
        int iHashCode = hashCode();
        d7.a.n(16);
        String string = Integer.toString(iHashCode, 16);
        d7.a.l(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }
}
