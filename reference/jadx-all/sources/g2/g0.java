package g2;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f6562b;

    public /* synthetic */ g0(Runnable runnable, int i10) {
        this.f6561a = i10;
        this.f6562b = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        int i10 = this.f6561a;
        Runnable runnable = this.f6562b;
        switch (i10) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
