package ja;

import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f8558a;

    static {
        t tVar;
        try {
            Class.forName("java.nio.file.Files");
            tVar = new u();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        f8558a = tVar;
        String str = x.f8577b;
        String property = System.getProperty("java.io.tmpdir");
        d7.a.l(property, "getProperty(...)");
        fa.l.i(property, false);
        ClassLoader classLoader = ka.f.class.getClassLoader();
        d7.a.l(classLoader, "getClassLoader(...)");
        new ka.f(classLoader);
    }

    public abstract e0 a(x xVar);

    public abstract void b(x xVar, x xVar2);

    public abstract void c(x xVar);

    public abstract void d(x xVar);

    public final void e(x xVar) {
        d7.a.m(xVar, "path");
        d(xVar);
    }

    public final boolean f(x xVar) {
        d7.a.m(xVar, "path");
        return i(xVar) != null;
    }

    public abstract List g(x xVar);

    public final l h(x xVar) throws FileNotFoundException {
        d7.a.m(xVar, "path");
        l lVarI = i(xVar);
        if (lVarI != null) {
            return lVarI;
        }
        throw new FileNotFoundException("no such file: " + xVar);
    }

    public abstract l i(x xVar);

    public abstract s j(x xVar);

    public abstract e0 k(x xVar);

    public abstract g0 l(x xVar);
}
