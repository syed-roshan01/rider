package y4;

import a5.i0;
import a5.z;
import com.auto.accept.ui.viewmodel.MainViewModel;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;

/* JADX INFO: loaded from: classes.dex */
public final class p implements d8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16944a;

    public p(n nVar) {
        this.f16944a = nVar;
    }

    @Override // p8.a
    public final Object get() {
        n nVar = this.f16944a;
        return new MainViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(nVar.f16933a), (z4.d) nVar.f16936d.get(), (a5.j) nVar.f16937e.get(), (z) nVar.f16938f.get(), (i0) nVar.f16939g.get());
    }
}
