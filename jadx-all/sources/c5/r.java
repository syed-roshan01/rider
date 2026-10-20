package c5;

import m0.n0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w f3009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.u f3010c;

    public /* synthetic */ r(androidx.lifecycle.w wVar, q qVar, int i10) {
        this.f3008a = i10;
        this.f3009b = wVar;
        this.f3010c = qVar;
    }

    @Override // m0.n0
    public final void a() {
        int i10 = this.f3008a;
        androidx.lifecycle.u uVar = this.f3010c;
        androidx.lifecycle.w wVar = this.f3009b;
        switch (i10) {
            case 0:
                wVar.getLifecycle().c(uVar);
                break;
            default:
                wVar.getLifecycle().c(uVar);
                break;
        }
    }
}
