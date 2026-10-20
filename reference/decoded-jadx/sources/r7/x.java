package r7;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class x extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f13646b;

    public x(Method method) {
        this.f13646b = method;
    }

    @Override // r7.z
    public final Object a(Class cls) {
        String strA = h.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f13646b.invoke(null, cls, Object.class);
    }
}
