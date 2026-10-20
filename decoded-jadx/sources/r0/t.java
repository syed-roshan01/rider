package r0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends s {
    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f13335c;
        this.f13335c = i10 + 2;
        Object[] objArr = this.f13333a;
        return new b(objArr[i10], objArr[i10 + 1]);
    }
}
