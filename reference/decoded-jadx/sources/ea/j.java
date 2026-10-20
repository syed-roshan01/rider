package ea;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends aa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f5470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5472g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, r rVar, int i10, int i11) {
        super(str, true);
        this.f5470e = rVar;
        this.f5471f = i10;
        this.f5472g = i11;
    }

    @Override // aa.a
    public final long a() {
        int i10 = this.f5471f;
        int i11 = this.f5472g;
        r rVar = this.f5470e;
        rVar.getClass();
        try {
            rVar.F.X(i10, true, i11);
            return -1L;
        } catch (IOException e4) {
            rVar.b(e4);
            return -1L;
        }
    }
}
