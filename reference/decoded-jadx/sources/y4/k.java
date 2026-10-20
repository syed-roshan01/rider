package y4;

import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f16929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f16930d = this;

    public k(n nVar, j jVar, h hVar) {
        this.f16927a = nVar;
        this.f16928b = jVar;
        this.f16929c = hVar;
    }

    @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
    public final DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return this.f16929c.getHiltInternalFactoryFactory();
    }

    @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
    public final ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
        androidx.fragment.app.g gVar = new androidx.fragment.app.g();
        gVar.f1912b = this.f16927a;
        gVar.f1913c = this.f16928b;
        gVar.f1914d = this.f16929c;
        gVar.f1915e = this.f16930d;
        return gVar;
    }
}
