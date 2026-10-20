package y4;

import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import i3.a0;
import java.util.Set;
import r6.i0;
import r6.t;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f16923c = this;

    public h(n nVar, j jVar) {
        this.f16921a = nVar;
        this.f16922b = jVar;
    }

    @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
    public final FragmentComponentBuilder fragmentComponentBuilder() {
        return new a0(this.f16921a, this.f16922b, this.f16923c);
    }

    @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
    public final DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new o(this.f16921a, this.f16922b));
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
    public final ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new o(this.f16921a, this.f16922b);
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
    public final Set getViewModelKeys() {
        int i10 = t.f13582c;
        return new i0("com.auto.accept.ui.viewmodel.MainViewModel");
    }

    @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
    public final ViewComponentBuilder viewComponentBuilder() {
        return new a0(this.f16921a, this.f16922b, this.f16923c);
    }
}
