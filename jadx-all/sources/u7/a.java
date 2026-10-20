package u7;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import r7.d;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f15425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f15426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15427c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeA = d.a(parameterizedType.getActualTypeArguments()[0]);
                this.f15426b = typeA;
                this.f15425a = d.e(typeA);
                this.f15427c = typeA.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (d.c(this.f15426b, ((a) obj).f15426b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15427c;
    }

    public final String toString() {
        return d.g(this.f15426b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = d.a(type);
        this.f15426b = typeA;
        this.f15425a = d.e(typeA);
        this.f15427c = typeA.hashCode();
    }
}
