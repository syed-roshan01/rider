package r0;

/* JADX INFO: loaded from: classes.dex */
public class d extends r8.e implements p0.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f13303c = new d(r.f13328e, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f13304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13305b;

    public d(r rVar, int i10) {
        this.f13304a = rVar;
        this.f13305b = i10;
    }

    @Override // p0.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f builder() {
        return new f(this);
    }

    public final d b(Object obj, s0.a aVar) {
        q qVarU = this.f13304a.u(obj, obj != null ? obj.hashCode() : 0, 0, aVar);
        return qVarU == null ? this : new d(qVarU.f13326a, this.f13305b + qVarU.f13327b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f13304a.d(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f13304a.g(obj, obj != null ? obj.hashCode() : 0, 0);
    }
}
