package r7;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class v extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f13642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13643c;

    public v(Method method, Object obj) {
        this.f13642b = method;
        this.f13643c = obj;
    }

    @Override // r7.z
    public final Object a(Class cls) {
        String strA = h.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f13642b.invoke(this.f13643c, cls);
    }
}
