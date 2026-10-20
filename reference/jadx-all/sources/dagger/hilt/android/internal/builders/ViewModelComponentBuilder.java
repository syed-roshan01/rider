package dagger.hilt.android.internal.builders;

import androidx.lifecycle.p0;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;

/* JADX INFO: loaded from: classes.dex */
@DefineComponent.Builder
public interface ViewModelComponentBuilder {
    ViewModelComponent build();

    ViewModelComponentBuilder savedStateHandle(p0 p0Var);

    ViewModelComponentBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle);
}
