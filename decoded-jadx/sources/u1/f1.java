package u1;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m9.k f15088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.c f15089b;

    public f1(m9.l lVar, g1 g1Var, c9.c cVar) {
        this.f15088a = lVar;
        this.f15089b = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Object objN;
        try {
            objN = this.f15089b.invoke(Long.valueOf(j10));
        } catch (Throwable th) {
            objN = d7.t.N(th);
        }
        this.f15088a.resumeWith(objN);
    }
}
