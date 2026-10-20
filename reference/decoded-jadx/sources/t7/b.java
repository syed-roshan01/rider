package t7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d0 {
    public final Method A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Method f14664x = Class.class.getMethod("isRecord", new Class[0]);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Method f14665y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Method f14666z;

    public b() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f14665y = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f14666z = componentType.getMethod("getName", new Class[0]);
        this.A = componentType.getMethod("getType", new Class[0]);
    }

    @Override // o7.d0
    public final String[] F(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f14665y.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f14666z.invoke(objArr[i10], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e4);
        }
    }

    @Override // o7.d0
    public final boolean Q(Class cls) {
        try {
            return ((Boolean) this.f14664x.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e4);
        }
    }

    @Override // o7.d0
    public final Method x(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e4);
        }
    }

    @Override // o7.d0
    public final Constructor z(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f14665y.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.A.invoke(objArr[i10], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e4);
        }
    }
}
