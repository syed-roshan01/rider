package a0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f784c;

    public e(o oVar, int i10, int i11) {
        this.f782a = i10;
        this.f783b = i11;
        this.f784c = oVar;
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.g("startIndex should be >= 0, but was ", i10).toString());
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(l.q.g("size should be >0, but was ", i11).toString());
        }
    }
}
