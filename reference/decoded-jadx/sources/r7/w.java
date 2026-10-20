package r7;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class w extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f13644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13645c;

    public w(int i10, Method method) {
        this.f13644b = method;
        this.f13645c = i10;
    }

    @Override // r7.z
    public final Object a(Class cls) {
        String strA = h.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f13644b.invoke(null, cls, Integer.valueOf(this.f13645c));
    }
}
