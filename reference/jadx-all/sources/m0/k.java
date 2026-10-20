package m0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11576a;

    public k(String str) {
        this.f11576a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f11576a;
    }
}
