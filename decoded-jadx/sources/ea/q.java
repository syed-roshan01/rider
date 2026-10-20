package ea;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends aa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f5491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5493g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, r rVar, int i10, long j10) {
        super(str, true);
        this.f5491e = rVar;
        this.f5492f = i10;
        this.f5493g = j10;
    }

    @Override // aa.a
    public final long a() {
        r rVar = this.f5491e;
        try {
            rVar.F.N(this.f5492f, this.f5493g);
            return -1L;
        } catch (IOException e4) {
            rVar.b(e4);
            return -1L;
        }
    }
}
