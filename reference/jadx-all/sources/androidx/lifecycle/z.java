package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f2210a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f2211b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            d7.a.l(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            a7.a.s(objNewInstance);
            throw null;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0103 A[PHI: r1
  0x0103: PHI (r1v6 java.util.ArrayList) = (r1v4 java.util.ArrayList), (r1v4 java.util.ArrayList), (r1v13 java.util.ArrayList) binds: [B:49:0x00e1, B:51:0x00e7, B:55:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0138 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor declaredConstructor;
        Class superclass;
        Class<?>[] interfaces;
        int length;
        Class<?> cls2;
        HashMap map = f2210a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r10 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r10 != null ? r10.getName() : "";
                d7.a.l(name, "fullPackage");
                if (name.length() != 0) {
                    d7.a.l(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    d7.a.l(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                d7.a.l(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = l9.i.c1(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            }
            HashMap map2 = f2211b;
            if (declaredConstructor != null) {
                map2.put(cls, d7.t.d0(declaredConstructor));
            } else {
                d dVar = d.f2128c;
                HashMap map3 = dVar.f2130b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool == null) {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        for (Method method : declaredMethods) {
                            if (((f0) method.getAnnotation(f0.class)) != null) {
                                dVar.a(cls, declaredMethods);
                            }
                        }
                        map3.put(cls, Boolean.FALSE);
                        superclass = cls.getSuperclass();
                        if (superclass == null) {
                            interfaces = cls.getInterfaces();
                            d7.a.l(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                cls2 = interfaces[i11];
                                if (cls2 == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        } else {
                            interfaces = cls.getInterfaces();
                            d7.a.l(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            while (i11 < length) {
                                cls2 = interfaces[i11];
                                if (cls2 == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } catch (NoClassDefFoundError e10) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
                    }
                } else if (!bool.booleanValue()) {
                    superclass = cls.getSuperclass();
                    if (superclass == null && v.class.isAssignableFrom(superclass)) {
                        d7.a.l(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            d7.a.j(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            d7.a.l(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            while (i11 < length) {
                                cls2 = interfaces[i11];
                                if (cls2 == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        d7.a.l(interfaces, "klass.interfaces");
                        length = interfaces.length;
                        while (i11 < length) {
                            cls2 = interfaces[i11];
                            if (cls2 == null && v.class.isAssignableFrom(cls2)) {
                                d7.a.l(cls2, "intrface");
                                if (b(cls2) != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj2 = map2.get(cls2);
                                    d7.a.j(obj2);
                                    arrayList.addAll((Collection) obj2);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        map.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
