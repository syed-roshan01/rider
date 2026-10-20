package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a1 f2107c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f2108b;

    public a1(Application application) {
        this.f2108b = application;
    }

    public final x0 a(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            x0 x0Var = (x0) cls.getConstructor(Application.class).newInstance(application);
            d7.a.l(x0Var, "{\n                try {\n…          }\n            }");
            return x0Var;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    @Override // androidx.lifecycle.b1
    public final x0 create(Class cls, q3.c cVar) {
        d7.a.m(cls, "modelClass");
        d7.a.m(cVar, "extras");
        if (this.f2108b != null) {
            return create(cls);
        }
        Application application = (Application) cVar.a(z0.f2212a);
        if (application != null) {
            return a(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.create(cls);
    }

    @Override // androidx.lifecycle.c1, androidx.lifecycle.b1
    public final x0 create(Class cls) {
        d7.a.m(cls, "modelClass");
        Application application = this.f2108b;
        if (application != null) {
            return a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
