package e8;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLong f5342d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5345c;

    public q0(String str, String str2, long j10) {
        y3.e.J(str, "typeName");
        y3.e.G("empty type", !str.isEmpty());
        this.f5343a = str;
        this.f5344b = str2;
        this.f5345c = j10;
    }

    public static q0 a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new q0(simpleName, str, f5342d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5343a + "<" + this.f5345c + ">");
        String str = this.f5344b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
