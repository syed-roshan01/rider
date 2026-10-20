package ea;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends aa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f5468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5469g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, r rVar, Object obj, int i10) {
        super(str, true);
        this.f5467e = i10;
        this.f5468f = rVar;
        this.f5469g = obj;
    }

    @Override // aa.a
    public final long a() {
        switch (this.f5467e) {
            case 0:
                r rVar = this.f5468f;
                rVar.f5495b.a(rVar, (c0) ((d9.u) this.f5469g).f4952a);
                break;
            default:
                try {
                    this.f5468f.f5495b.b((y) this.f5469g);
                } catch (IOException e4) {
                    fa.m mVar = fa.m.f6417a;
                    fa.m mVar2 = fa.m.f6417a;
                    String str = "Http2Connection.Listener failure for " + this.f5468f.f5497d;
                    mVar2.getClass();
                    fa.m.i(4, str, e4);
                    try {
                        ((y) this.f5469g).c(b.PROTOCOL_ERROR, e4);
                    } catch (IOException unused) {
                    }
                }
                break;
        }
        return -1L;
    }
}
