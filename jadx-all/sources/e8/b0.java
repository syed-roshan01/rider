package e8;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f5198a = Logger.getLogger(b0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f5199b = new b0();

    public static b0 b() {
        ((i2) z.f5405a).getClass();
        b0 b0Var = (b0) i2.f5288b.get();
        b0 b0Var2 = f5199b;
        if (b0Var == null) {
            b0Var = b0Var2;
        }
        return b0Var == null ? b0Var2 : b0Var;
    }

    public final b0 a() {
        ((i2) z.f5405a).getClass();
        ThreadLocal threadLocal = i2.f5288b;
        b0 b0Var = (b0) threadLocal.get();
        b0 b0Var2 = f5199b;
        if (b0Var == null) {
            b0Var = b0Var2;
        }
        threadLocal.set(this);
        return b0Var == null ? b0Var2 : b0Var;
    }

    public final void c(b0 b0Var) {
        if (b0Var == null) {
            throw new NullPointerException("toAttach");
        }
        ((i2) z.f5405a).getClass();
        ThreadLocal threadLocal = i2.f5288b;
        b0 b0Var2 = (b0) threadLocal.get();
        b0 b0Var3 = f5199b;
        if (b0Var2 == null) {
            b0Var2 = b0Var3;
        }
        if (b0Var2 != this) {
            i2.f5287a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (b0Var != b0Var3) {
            threadLocal.set(b0Var);
        } else {
            threadLocal.set(null);
        }
    }
}
