package m0;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m9.k f11515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.c f11516b;

    public g0(m9.l lVar, c9.c cVar) {
        this.f11515a = lVar;
        this.f11516b = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Object objN;
        Choreographer choreographer = h0.f11551a;
        try {
            objN = this.f11516b.invoke(Long.valueOf(j10));
        } catch (Throwable th) {
            objN = d7.t.N(th);
        }
        this.f11515a.resumeWith(objN);
    }
}
