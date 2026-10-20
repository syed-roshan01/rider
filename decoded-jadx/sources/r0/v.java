package r0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f13336d;

    public v(i iVar) {
        this.f13336d = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f13335c;
        this.f13335c = i10 + 2;
        Object[] objArr = this.f13333a;
        return new c(this.f13336d, objArr[i10], objArr[i10 + 1]);
    }
}
