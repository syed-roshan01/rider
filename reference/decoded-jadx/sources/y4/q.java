package y4;

import java.util.Map;
import r6.f0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f16945a;

    public q(n nVar, j jVar) {
        this.f16945a = new p(nVar);
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
    public final Map getHiltViewModelAssistedMap() {
        return f0.f13537n;
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
    public final Map getHiltViewModelMap() {
        p pVar = this.f16945a;
        z6.a.j("com.auto.accept.ui.viewmodel.MainViewModel", pVar);
        return f0.b(1, new Object[]{"com.auto.accept.ui.viewmodel.MainViewModel", pVar}, null);
    }
}
