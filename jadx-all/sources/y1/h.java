package y1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.a f16758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f16759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16760c;

    public h(c9.a aVar, c9.a aVar2, boolean z10) {
        this.f16758a = aVar;
        this.f16759b = aVar2;
        this.f16760c = z10;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f16758a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f16759b.invoke()).floatValue() + ", reverseScrolling=" + this.f16760c + ')';
    }
}
