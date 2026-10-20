package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f2192a = d7.t.e0(Application.class, p0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f2193b = d7.t.d0(p0.class);

    public static final Constructor a(Class cls, List list) {
        d7.a.m(cls, "modelClass");
        d7.a.m(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        d7.a.l(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            d7.a.l(parameterTypes, "constructor.parameterTypes");
            List listX = b9.b.X(parameterTypes);
            if (d7.a.d(list, listX)) {
                return constructor;
            }
            if (list.size() == listX.size() && listX.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final x0 b(Class cls, Constructor constructor, Object... objArr) {
        d7.a.m(cls, "modelClass");
        try {
            return (x0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access " + cls, e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
