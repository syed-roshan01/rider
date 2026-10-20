package r7;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f13641a;

    static {
        t rVar;
        if (j.f13613a >= 9) {
            try {
                rVar = new r(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                rVar = null;
            }
        } else {
            rVar = null;
        }
        if (rVar == null) {
            rVar = new s();
        }
        f13641a = rVar;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
