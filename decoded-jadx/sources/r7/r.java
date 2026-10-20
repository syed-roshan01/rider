package r7;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class r extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f13640b;

    public r(Method method) {
        this.f13640b = method;
    }

    @Override // r7.t
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f13640b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e4) {
            throw new RuntimeException("Failed invoking canAccess", e4);
        }
    }
}
