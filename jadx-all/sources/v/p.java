package v;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.a f15731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m9.k f15732b;

    public p(c0.i iVar, m9.l lVar) {
        this.f15731a = iVar;
        this.f15732b = lVar;
    }

    public final String toString() {
        m9.k kVar = this.f15732b;
        t.k.d(kVar.getContext().f(m9.c0.f11913b));
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        d7.a.n(16);
        String string = Integer.toString(iHashCode, 16);
        d7.a.l(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.f15731a.invoke());
        sb.append(", continuation=");
        sb.append(kVar);
        sb.append(')');
        return sb.toString();
    }
}
