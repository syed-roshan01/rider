package y0;

/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16743a = 0;

    boolean c(c9.c cVar);

    Object e(Object obj, c9.e eVar);

    default o j(o oVar) {
        return oVar == l.f16729b ? this : new i(this, oVar);
    }
}
