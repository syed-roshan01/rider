package dagger.hilt.android.internal.builders;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;

/* JADX INFO: loaded from: classes.dex */
@DefineComponent.Builder
public interface ActivityRetainedComponentBuilder {
    ActivityRetainedComponent build();

    ActivityRetainedComponentBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder);
}
