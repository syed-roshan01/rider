package m9;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f11946a;

    static {
        String property;
        j0 j0Var;
        int i10 = r9.v.f13730a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null || !Boolean.parseBoolean(property)) {
            j0Var = f0.f11940q;
        } else {
            t9.d dVar = m0.f11969a;
            u8.j jVar = r9.o.f13724a;
            n9.d dVar2 = ((n9.d) jVar).f12323f;
            j0Var = !(jVar instanceof j0) ? f0.f11940q : (j0) jVar;
        }
        f11946a = j0Var;
    }
}
