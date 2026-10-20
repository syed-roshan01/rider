package ea;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends aa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f5489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, r rVar, long j10) {
        super(str, true);
        this.f5489e = rVar;
        this.f5490f = j10;
    }

    @Override // aa.a
    public final long a() {
        r rVar;
        boolean z10;
        synchronized (this.f5489e) {
            rVar = this.f5489e;
            long j10 = rVar.f5507u;
            long j11 = rVar.f5506t;
            if (j10 < j11) {
                z10 = true;
            } else {
                rVar.f5506t = j11 + 1;
                z10 = false;
            }
        }
        if (z10) {
            rVar.b(null);
            return -1L;
        }
        try {
            rVar.F.X(1, false, 0);
        } catch (IOException e4) {
            rVar.b(e4);
        }
        return this.f5490f;
    }
}
