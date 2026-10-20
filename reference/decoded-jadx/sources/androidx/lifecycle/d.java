package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f2128c = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2129a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2130b = new HashMap();

    public static void c(HashMap map, c cVar, p pVar, Class cls) {
        p pVar2 = (p) map.get(cVar);
        if (pVar2 == null || pVar == pVar2) {
            if (pVar2 == null) {
                map.put(cVar, pVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + cVar.f2116b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + pVar2 + ", new value " + pVar);
    }

    public final b a(Class cls, Method[] methodArr) {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(b(superclass).f2110b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).f2110b.entrySet()) {
                c(map, (c) entry.getKey(), (p) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            f0 f0Var = (f0) method.getAnnotation(f0.class);
            if (f0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!w.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                p pVarValue = f0Var.value();
                if (parameterTypes.length > 1) {
                    if (!p.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (pVarValue != p.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(map, new c(i10, method), pVarValue, cls);
                z10 = true;
            }
        }
        b bVar = new b(map);
        this.f2129a.put(cls, bVar);
        this.f2130b.put(cls, Boolean.valueOf(z10));
        return bVar;
    }

    public final b b(Class cls) {
        b bVar = (b) this.f2129a.get(cls);
        return bVar != null ? bVar : a(cls, null);
    }
}
