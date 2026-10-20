package dagger.hilt.android.internal.modules;

import android.app.Activity;
import androidx.fragment.app.g0;
import d8.b;
import p8.a;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityModule_ProvideFragmentActivityFactory implements b {
    private final a activityProvider;

    public ActivityModule_ProvideFragmentActivityFactory(a aVar) {
        this.activityProvider = aVar;
    }

    public static ActivityModule_ProvideFragmentActivityFactory create(a aVar) {
        return new ActivityModule_ProvideFragmentActivityFactory(aVar);
    }

    public static g0 provideFragmentActivity(Activity activity) {
        g0 g0VarProvideFragmentActivity = ActivityModule.provideFragmentActivity(activity);
        if (g0VarProvideFragmentActivity != null) {
            return g0VarProvideFragmentActivity;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p8.a
    public g0 get() {
        return provideFragmentActivity((Activity) this.activityProvider.get());
    }
}
