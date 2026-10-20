package f4;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f6218b;

    static {
        a aVar = new a();
        aVar.F = false;
        aVar.I(new h(2));
        aVar.I(new f());
        aVar.I(new h(1));
        f6217a = new ThreadLocal();
        f6218b = new ArrayList();
    }

    public static q.f a() {
        q.f fVar;
        ThreadLocal threadLocal = f6217a;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (q.f) weakReference.get()) != null) {
            return fVar;
        }
        q.f fVar2 = new q.f();
        threadLocal.set(new WeakReference(fVar2));
        return fVar2;
    }
}
