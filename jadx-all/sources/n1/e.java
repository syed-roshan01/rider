package n1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f12109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f12113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12114f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, u8.e eVar) {
        super(eVar);
        this.f12113e = gVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12112d = obj;
        this.f12114f |= Integer.MIN_VALUE;
        return this.f12113e.L(0L, 0L, this);
    }
}
