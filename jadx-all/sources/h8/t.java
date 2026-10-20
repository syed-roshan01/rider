package h8;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.g f7718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7720c;

    public t(ja.g gVar, int i10) {
        this.f7718a = gVar;
        this.f7719b = i10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        this.f7718a.f0(bArr, i10, i11);
        this.f7719b -= i11;
        this.f7720c += i11;
    }
}
