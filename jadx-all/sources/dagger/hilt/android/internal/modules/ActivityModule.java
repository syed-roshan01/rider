package dagger.hilt.android.internal.modules;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.g0;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ActivityContext;

/* JADX INFO: loaded from: classes.dex */
@InstallIn({ActivityComponent.class})
abstract class ActivityModule {
    private ActivityModule() {
    }

    public static g0 provideFragmentActivity(Activity activity) {
        try {
            return (g0) activity;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e4);
        }
    }

    @ActivityContext
    public abstract Context provideContext(Activity activity);
}
