package dagger.hilt.android.internal.managers;

import d8.b;
import dagger.hilt.android.ActivityRetainedLifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory implements b {

    public static final class InstanceHolder {
        private static final ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory INSTANCE = new ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory();

        private InstanceHolder() {
        }
    }

    public static ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
        ActivityRetainedLifecycle activityRetainedLifecycleProvideActivityRetainedLifecycle = ActivityRetainedComponentManager.LifecycleModule.provideActivityRetainedLifecycle();
        if (activityRetainedLifecycleProvideActivityRetainedLifecycle != null) {
            return activityRetainedLifecycleProvideActivityRetainedLifecycle;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p8.a
    public ActivityRetainedLifecycle get() {
        return provideActivityRetainedLifecycle();
    }
}
