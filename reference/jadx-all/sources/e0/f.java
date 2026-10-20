package e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f4988a;

    static {
        d dVar = new d(50);
        f4988a = new e(dVar, dVar, dVar, dVar);
    }

    public static final e a(float f10) {
        c cVar = new c(f10);
        return new e(cVar, cVar, cVar, cVar);
    }

    public static e b(float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return new e(new c(f10), new c(f11), new c(f12), new c(f13));
    }
}
