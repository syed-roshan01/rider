package dagger.hilt.android.internal.builders;

import android.app.Activity;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ActivityComponent;

/* JADX INFO: loaded from: classes.dex */
@DefineComponent.Builder
public interface ActivityComponentBuilder {
    ActivityComponentBuilder activity(Activity activity);

    ActivityComponent build();
}
