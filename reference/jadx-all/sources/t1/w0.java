package t1;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0.n f14569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0.i f14571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0.i f14572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f14574f;

    public w0(x0 x0Var, y0.n nVar, int i10, o0.i iVar, o0.i iVar2, boolean z10) {
        this.f14574f = x0Var;
        this.f14569a = nVar;
        this.f14570b = i10;
        this.f14571c = iVar;
        this.f14572d = iVar2;
        this.f14573e = z10;
    }

    public final boolean a(int i10, int i11) {
        o0.i iVar = this.f14571c;
        int i12 = this.f14570b;
        return androidx.compose.ui.node.b.a((y0.m) iVar.f12341a[i10 + i12], (y0.m) this.f14572d.f12341a[i12 + i11]) != 0;
    }
}
