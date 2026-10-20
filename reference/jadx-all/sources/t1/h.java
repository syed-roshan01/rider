package t1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f14439a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f14440b;

    @Override // c1.h
    public final boolean a() {
        Boolean bool = f14440b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("canFocus is read before it is written".toString());
    }

    @Override // c1.h
    public final void b(boolean z10) {
        f14440b = Boolean.valueOf(z10);
    }
}
