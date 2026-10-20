package g8;

/* JADX INFO: loaded from: classes.dex */
public final class t4 implements y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f7142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7143c;

    public /* synthetic */ t4(y2 y2Var, Object obj, int i10) {
        this.f7141a = i10;
        this.f7142b = y2Var;
        this.f7143c = obj;
    }

    @Override // g8.y4
    public final void a(g5 g5Var) {
        int i10 = this.f7141a;
        Object obj = this.f7143c;
        switch (i10) {
            case 0:
                g5Var.f6817a.m((String) obj);
                break;
            case 1:
                g5Var.f6817a.d((e8.s) obj);
                break;
            case 2:
                g5Var.f6817a.g((e8.c0) obj);
                break;
            case 3:
                g5Var.f6817a.h((e8.e0) obj);
                break;
            default:
                g5Var.f6817a.l(this.f7142b.f7263a.d(obj));
                g5Var.f6817a.flush();
                break;
        }
    }
}
