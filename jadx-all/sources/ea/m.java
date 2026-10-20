package ea;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends aa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f5478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ja.g f5480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5481h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, r rVar, int i10, ja.g gVar, int i11, boolean z10) {
        super(str, true);
        this.f5478e = rVar;
        this.f5479f = i10;
        this.f5480g = gVar;
        this.f5481h = i11;
    }

    @Override // aa.a
    public final long a() {
        try {
            a4.q qVar = this.f5478e.f5505s;
            ja.g gVar = this.f5480g;
            int i10 = this.f5481h;
            qVar.getClass();
            d7.a.m(gVar, "source");
            gVar.l(i10);
            this.f5478e.F.f(this.f5479f, b.CANCEL);
            synchronized (this.f5478e) {
                this.f5478e.H.remove(Integer.valueOf(this.f5479f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
