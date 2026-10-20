package g8;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.b1 f7082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7083b;

    public s(String str) {
        e8.b1 b1VarA = e8.b1.a();
        y3.e.J(b1VarA, "registry");
        this.f7082a = b1VarA;
        y3.e.J(str, "defaultPolicy");
        this.f7083b = str;
    }

    public static e8.a1 a(s sVar, String str) throws r {
        e8.a1 a1VarB = sVar.f7082a.b(str);
        if (a1VarB != null) {
            return a1VarB;
        }
        throw new r(l.q.k("Trying to load '", str, "' because using default policy, but it's unavailable"));
    }
}
