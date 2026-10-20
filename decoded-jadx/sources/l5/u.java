package l5;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile k f11369e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5.a f11370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5.a f11371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5.d f11372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q5.i f11373d;

    public u(t5.a aVar, t5.a aVar2, p5.d dVar, q5.i iVar, q5.k kVar) {
        this.f11370a = aVar;
        this.f11371b = aVar2;
        this.f11372c = dVar;
        this.f11373d = iVar;
        kVar.getClass();
        kVar.f13196a.execute(new androidx.activity.d(kVar, 11));
    }

    public static u a() {
        k kVar = f11369e;
        if (kVar != null) {
            return (u) kVar.f11356f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f11369e == null) {
            synchronized (u.class) {
                try {
                    if (f11369e == null) {
                        j.a aVar = new j.a();
                        context.getClass();
                        aVar.f8194a = context;
                        f11369e = aVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
