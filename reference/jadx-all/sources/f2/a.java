package f2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6100a;

    public a(int i10) {
        this.f6100a = i10;
    }

    @Override // f2.r
    public final l a(l lVar) {
        int i10 = this.f6100a;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? lVar : new l(z6.a.r(lVar.f6122a + i10, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f6100a == ((a) obj).f6100a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6100a);
    }

    public final String toString() {
        return a7.a.o(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f6100a, ')');
    }
}
