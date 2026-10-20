package g8;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f6685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f6687c;

    public c2(j2 j2Var, o0 o0Var, boolean z10) {
        this.f6687c = j2Var;
        this.f6685a = o0Var;
        this.f6686b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6687c.f6884t.f(this.f6685a, this.f6686b);
    }
}
