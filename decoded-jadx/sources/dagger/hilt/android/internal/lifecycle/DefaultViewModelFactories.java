package dagger.hilt.android.internal.lifecycle;

import androidx.activity.p;
import androidx.fragment.app.d0;
import androidx.lifecycle.b1;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.internal.Preconditions;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultViewModelFactories {

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    public interface ActivityEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    @InstallIn({ActivityComponent.class})
    public interface ActivityModule {
        @HiltViewModelMap.KeySet
        Set<String> viewModelKeys();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    public interface FragmentEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    public static final class InternalFactoryFactory {
        private final Set<String> keySet;
        private final ViewModelComponentBuilder viewModelComponentBuilder;

        public InternalFactoryFactory(@HiltViewModelMap.KeySet Set<String> set, ViewModelComponentBuilder viewModelComponentBuilder) {
            this.keySet = set;
            this.viewModelComponentBuilder = viewModelComponentBuilder;
        }

        private b1 getHiltViewModelFactory(b1 b1Var) {
            return new HiltViewModelFactory(this.keySet, (b1) Preconditions.checkNotNull(b1Var), this.viewModelComponentBuilder);
        }

        public b1 fromActivity(p pVar, b1 b1Var) {
            return getHiltViewModelFactory(b1Var);
        }

        public b1 fromFragment(d0 d0Var, b1 b1Var) {
            return getHiltViewModelFactory(b1Var);
        }
    }

    private DefaultViewModelFactories() {
    }

    public static b1 getActivityFactory(p pVar, b1 b1Var) {
        return ((ActivityEntryPoint) EntryPoints.get(pVar, ActivityEntryPoint.class)).getHiltInternalFactoryFactory().fromActivity(pVar, b1Var);
    }

    public static b1 getFragmentFactory(d0 d0Var, b1 b1Var) {
        return ((FragmentEntryPoint) EntryPoints.get(d0Var, FragmentEntryPoint.class)).getHiltInternalFactoryFactory().fromFragment(d0Var, b1Var);
    }
}
