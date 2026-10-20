package u;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.a f14762b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(c9.a aVar, int i10) {
        super(0);
        this.f14761a = i10;
        this.f14762b = aVar;
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14761a;
        c9.a aVar = this.f14762b;
        switch (i10) {
            case 0:
                return aVar.invoke();
            case 1:
                return aVar.invoke();
            case 2:
                return aVar.invoke();
            case 3:
                return aVar.invoke();
            case 4:
                return aVar.invoke();
            case 5:
                m8391invoke();
                return lVar;
            case 6:
                m8391invoke();
                return lVar;
            case 7:
                m8391invoke();
                return lVar;
            case 8:
                m8391invoke();
                return lVar;
            case 9:
                m8391invoke();
                return lVar;
            default:
                try {
                    return (List) aVar.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return r8.r.f13661a;
                }
        }
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m8391invoke() {
        int i10 = this.f14761a;
        c9.a aVar = this.f14762b;
        switch (i10) {
            case 5:
                aVar.invoke();
                break;
            case 6:
                aVar.invoke();
                break;
            case 7:
                aVar.invoke();
                break;
            case 8:
                aVar.invoke();
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
