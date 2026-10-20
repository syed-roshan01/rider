package androidx.lifecycle;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2136a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2137b;

    public f(k[] kVarArr) {
        this.f2137b = kVarArr;
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(w wVar, p pVar) {
        int i10 = this.f2136a;
        Object obj = this.f2137b;
        switch (i10) {
            case 0:
                new HashMap();
                k[] kVarArr = (k[]) obj;
                if (kVarArr.length > 0) {
                    k kVar = kVarArr[0];
                    throw null;
                }
                if (kVarArr.length <= 0) {
                    return;
                }
                k kVar2 = kVarArr[0];
                throw null;
            case 1:
                if (pVar == p.ON_CREATE) {
                    wVar.getLifecycle().c(this);
                    ((t0) obj).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + pVar).toString());
                }
            default:
                a7.a.w(obj);
                throw null;
        }
    }

    public f(t0 t0Var) {
        this.f2137b = t0Var;
    }
}
