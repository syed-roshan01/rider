package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class c1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c1 f2127a;

    @Override // androidx.lifecycle.b1
    public x0 create(Class cls) throws InvocationTargetException {
        d7.a.m(cls, "modelClass");
        try {
            Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            d7.a.l(objNewInstance, "{\n                modelC\u2026wInstance()\n            }");
            return (x0) objNewInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }
}
