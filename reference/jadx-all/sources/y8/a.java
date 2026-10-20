package y8;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f16997a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        d7.a.j(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (d7.a.d(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                d7.a.l(parameterTypes, "getParameterTypes(...)");
                if (d7.a.d(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f16997a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !d7.a.d(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
