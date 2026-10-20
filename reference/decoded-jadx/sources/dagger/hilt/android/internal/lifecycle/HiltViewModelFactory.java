package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.lifecycle.s0;
import androidx.lifecycle.x0;
import b4.g;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;
import q3.b;
import q3.c;

/* JADX INFO: loaded from: classes.dex */
public final class HiltViewModelFactory implements b1 {
    public static final b CREATION_CALLBACK_KEY = new b() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.1
    };
    private final b1 delegateFactory;
    private final b1 hiltViewModelFactory;
    private final Set<String> hiltViewModelKeys;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    public interface ActivityCreatorEntryPoint {
        ViewModelComponentBuilder getViewModelComponentBuilder();

        @HiltViewModelMap.KeySet
        Set<String> getViewModelKeys();
    }

    @EntryPoint
    @InstallIn({ViewModelComponent.class})
    public interface ViewModelFactoriesEntryPoint {
        @HiltViewModelAssistedMap
        Map<String, Object> getHiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<String, p8.a> getHiltViewModelMap();
    }

    @InstallIn({ViewModelComponent.class})
    public interface ViewModelModule {
        @HiltViewModelAssistedMap
        Map<String, Object> hiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<String, x0> hiltViewModelMap();
    }

    public HiltViewModelFactory(Set<String> set, b1 b1Var, final ViewModelComponentBuilder viewModelComponentBuilder) {
        this.hiltViewModelKeys = set;
        this.delegateFactory = b1Var;
        this.hiltViewModelFactory = new b1() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.2
            private <T extends x0> T createViewModel(ViewModelComponent viewModelComponent, Class<T> cls, c cVar) {
                p8.a aVar = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelMap().get(cls.getName());
                c9.c cVar2 = (c9.c) cVar.a(HiltViewModelFactory.CREATION_CALLBACK_KEY);
                Object obj = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelAssistedMap().get(cls.getName());
                if (obj == null) {
                    if (cVar2 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (aVar != null) {
                        return (T) aVar.get();
                    }
                    throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                }
                if (aVar != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (cVar2 != null) {
                    return (T) cVar2.invoke(obj);
                }
                throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
            }

            @Override // androidx.lifecycle.b1
            public /* bridge */ /* synthetic */ x0 create(Class cls) {
                super.create(cls);
                throw null;
            }

            @Override // androidx.lifecycle.b1
            public <T extends x0> T create(Class<T> cls, c cVar) {
                final RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
                T t10 = (T) createViewModel(viewModelComponentBuilder.savedStateHandle(s0.b(cVar)).viewModelLifecycle(retainedLifecycleImpl).build(), cls, cVar);
                t10.addCloseable(new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.a
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        retainedLifecycleImpl.dispatchOnCleared();
                    }
                });
                return t10;
            }
        };
    }

    public static b1 createInternal(Activity activity, g gVar, Bundle bundle, b1 b1Var) {
        return createInternal(activity, b1Var);
    }

    @Override // androidx.lifecycle.b1
    public <T extends x0> T create(Class<T> cls, c cVar) {
        return this.hiltViewModelKeys.contains(cls.getName()) ? (T) this.hiltViewModelFactory.create(cls, cVar) : (T) this.delegateFactory.create(cls, cVar);
    }

    public static b1 createInternal(Activity activity, b1 b1Var) {
        ActivityCreatorEntryPoint activityCreatorEntryPoint = (ActivityCreatorEntryPoint) EntryPoints.get(activity, ActivityCreatorEntryPoint.class);
        return new HiltViewModelFactory(activityCreatorEntryPoint.getViewModelKeys(), b1Var, activityCreatorEntryPoint.getViewModelComponentBuilder());
    }

    @Override // androidx.lifecycle.b1
    public <T extends x0> T create(Class<T> cls) {
        if (this.hiltViewModelKeys.contains(cls.getName())) {
            return (T) this.hiltViewModelFactory.create(cls);
        }
        return (T) this.delegateFactory.create(cls);
    }
}
