package r6;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13575c;

    public q(Object obj, Object obj2, Object obj3) {
        this.f13573a = obj;
        this.f13574b = obj2;
        this.f13575c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f13573a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f13574b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f13575c);
        return new IllegalArgumentException(sb.toString());
    }
}
