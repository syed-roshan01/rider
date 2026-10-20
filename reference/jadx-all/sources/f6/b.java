package f6;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f6377b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j.a f6378a;

    static {
        b bVar = new b();
        bVar.f6378a = null;
        f6377b = bVar;
    }

    public static j.a a(Context context) {
        j.a aVar;
        b bVar = f6377b;
        synchronized (bVar) {
            try {
                if (bVar.f6378a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f6378a = new j.a(context);
                }
                aVar = bVar.f6378a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
