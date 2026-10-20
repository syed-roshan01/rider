package ea;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n extends aa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f5482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f5484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, r rVar, int i10, List list, boolean z10) {
        super(str, true);
        this.f5482e = rVar;
        this.f5483f = i10;
        this.f5484g = list;
    }

    @Override // aa.a
    public final long a() {
        a4.q qVar = this.f5482e.f5505s;
        List list = this.f5484g;
        qVar.getClass();
        d7.a.m(list, "responseHeaders");
        try {
            this.f5482e.F.f(this.f5483f, b.CANCEL);
            synchronized (this.f5482e) {
                this.f5482e.H.remove(Integer.valueOf(this.f5483f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
