package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2145a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2147c;

    public i(g gVar, u uVar) {
        d7.a.m(gVar, "defaultLifecycleObserver");
        this.f2146b = gVar;
        this.f2147c = uVar;
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(w wVar, p pVar) {
        int i10 = this.f2145a;
        Object obj = this.f2146b;
        Object obj2 = this.f2147c;
        switch (i10) {
            case 0:
                switch (h.f2139a[pVar.ordinal()]) {
                    case 1:
                        ((g) obj).getClass();
                        break;
                    case 2:
                        ((g) obj).d(wVar);
                        break;
                    case 3:
                        ((g) obj).b(wVar);
                        break;
                    case 4:
                        ((g) obj).getClass();
                        break;
                    case 5:
                        ((g) obj).f(wVar);
                        break;
                    case 6:
                        ((g) obj).c(wVar);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                u uVar = (u) obj2;
                if (uVar != null) {
                    uVar.onStateChanged(wVar, pVar);
                    return;
                }
                return;
            case 1:
                if (pVar == p.ON_START) {
                    ((r) obj).c(this);
                    ((b4.e) obj2).e();
                    return;
                }
                return;
            default:
                HashMap map = ((b) obj2).f2109a;
                b.a((List) map.get(pVar), wVar, pVar, obj);
                b.a((List) map.get(p.ON_ANY), wVar, pVar, obj);
                return;
        }
    }

    public i(Object obj) {
        this.f2146b = obj;
        this.f2147c = d.f2128c.b(obj.getClass());
    }

    public i(r rVar, b4.e eVar) {
        this.f2146b = rVar;
        this.f2147c = eVar;
    }
}
