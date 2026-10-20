package c5;

import com.auto.accept.ui.viewmodel.MainViewModel;
import m0.n0;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w f3012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f3013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(androidx.lifecycle.w wVar, MainViewModel mainViewModel, int i10) {
        super(1);
        this.f3011a = i10;
        this.f3012b = wVar;
        this.f3013c = mainViewModel;
    }

    public final n0 a(o0 o0Var) {
        int i10 = this.f3011a;
        androidx.lifecycle.w wVar = this.f3012b;
        MainViewModel mainViewModel = this.f3013c;
        switch (i10) {
            case 0:
                d7.a.m(o0Var, "$this$DisposableEffect");
                q qVar = new q(mainViewModel, 0);
                wVar.getLifecycle().a(qVar);
                return new r(wVar, qVar, 0);
            default:
                d7.a.m(o0Var, "$this$DisposableEffect");
                q qVar2 = new q(mainViewModel, 1);
                wVar.getLifecycle().a(qVar2);
                return new r(wVar, qVar2, 1);
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f3011a) {
            case 0:
                break;
        }
        return a((o0) obj);
    }
}
