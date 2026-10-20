package dagger.hilt.android.internal.builders;

import android.view.View;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;

/* JADX INFO: loaded from: classes.dex */
@DefineComponent.Builder
public interface ViewWithFragmentComponentBuilder {
    ViewWithFragmentComponent build();

    ViewWithFragmentComponentBuilder view(View view);
}
