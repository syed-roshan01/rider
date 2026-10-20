package g8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class q4 implements s2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f7061b = Logger.getLogger(q4.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f7062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f7063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RuntimeException f7064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f7065f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7066a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            int i10 = 0;
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", new Class[0]);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                while (true) {
                    if (i10 >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i10];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f7061b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null || constructor == null) {
            f7062c = null;
            f7063d = null;
            f7064e = new RuntimeException(th);
        } else {
            f7062c = constructor;
            f7063d = method;
            f7064e = null;
        }
        f7065f = new Object[]{1L};
    }

    public q4() {
        RuntimeException runtimeException = f7064e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f7066a = f7062c.newInstance(new Object[0]);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // g8.s2
    public final void a() {
        try {
            f7063d.invoke(this.f7066a, f7065f);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
