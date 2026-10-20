package dagger.hilt.android.internal.lifecycle;

import d8.b;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultViewModelFactories_InternalFactoryFactory_Factory implements b {
    private final p8.a keySetProvider;
    private final p8.a viewModelComponentBuilderProvider;

    public DefaultViewModelFactories_InternalFactoryFactory_Factory(p8.a aVar, p8.a aVar2) {
        this.keySetProvider = aVar;
        this.viewModelComponentBuilderProvider = aVar2;
    }

    public static DefaultViewModelFactories_InternalFactoryFactory_Factory create(p8.a aVar, p8.a aVar2) {
        return new DefaultViewModelFactories_InternalFactoryFactory_Factory(aVar, aVar2);
    }

    public static DefaultViewModelFactories.InternalFactoryFactory newInstance(Set<String> set, ViewModelComponentBuilder viewModelComponentBuilder) {
        return new DefaultViewModelFactories.InternalFactoryFactory(set, viewModelComponentBuilder);
    }

    @Override // p8.a
    public DefaultViewModelFactories.InternalFactoryFactory get() {
        return newInstance((Set) this.keySetProvider.get(), (ViewModelComponentBuilder) this.viewModelComponentBuilderProvider.get());
    }
}
