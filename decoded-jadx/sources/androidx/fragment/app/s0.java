package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q.z f2021b = new q.z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f2022a;

    public s0(x0 x0Var) {
        this.f2022a = x0Var;
    }

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        q.z zVar = f2021b;
        q.z zVar2 = (q.z) zVar.get(classLoader);
        if (zVar2 == null) {
            zVar2 = new q.z();
            zVar.put(classLoader, zVar2);
        }
        Class cls = (Class) zVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        zVar2.put(str, cls2);
        return cls2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e4) {
            throw new a0(l.q.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e4);
        } catch (ClassNotFoundException e10) {
            throw new a0(l.q.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }
}
