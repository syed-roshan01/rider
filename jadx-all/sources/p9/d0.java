package p9;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i3.u f12882a = new i3.u("NO_VALUE", 5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i3.u f12883b = new i3.u("NONE", 5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i3.u f12884c = new i3.u("PENDING", 5);

    public static final q0 a(Object obj) {
        if (obj == null) {
            obj = q9.c.f13247b;
        }
        return new q0(obj);
    }

    public static final void b(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
