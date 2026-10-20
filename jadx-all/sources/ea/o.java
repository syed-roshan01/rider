package ea;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends aa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f5486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5488h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, r rVar, int i10, Object obj, int i11) {
        super(str, true);
        this.f5485e = i11;
        this.f5486f = rVar;
        this.f5487g = i10;
        this.f5488h = obj;
    }

    @Override // aa.a
    public final long a() {
        switch (this.f5485e) {
            case 0:
                a4.q qVar = this.f5486f.f5505s;
                b bVar = (b) this.f5488h;
                qVar.getClass();
                d7.a.m(bVar, "errorCode");
                synchronized (this.f5486f) {
                    this.f5486f.H.remove(Integer.valueOf(this.f5487g));
                }
                return -1L;
            case 1:
                r rVar = this.f5486f;
                try {
                    int i10 = this.f5487g;
                    b bVar2 = (b) this.f5488h;
                    rVar.getClass();
                    d7.a.m(bVar2, "statusCode");
                    rVar.F.f(i10, bVar2);
                    break;
                } catch (IOException e4) {
                    rVar.b(e4);
                }
                return -1L;
            default:
                a4.q qVar2 = this.f5486f.f5505s;
                List list = (List) this.f5488h;
                qVar2.getClass();
                d7.a.m(list, "requestHeaders");
                try {
                    this.f5486f.F.f(this.f5487g, b.CANCEL);
                    synchronized (this.f5486f) {
                        this.f5486f.H.remove(Integer.valueOf(this.f5487g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
        }
    }
}
