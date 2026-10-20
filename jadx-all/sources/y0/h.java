package y0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f16724a = new h(2);

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        m mVar = (m) obj2;
        if (str.length() == 0) {
            return mVar.toString();
        }
        return str + ", " + mVar;
    }
}
