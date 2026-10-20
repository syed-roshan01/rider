package dagger.hilt.android.internal.modules;

import android.app.Application;
import d8.b;

/* JADX INFO: loaded from: classes.dex */
public final class ApplicationContextModule_ProvideApplicationFactory implements b {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideApplicationFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideApplicationFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideApplicationFactory(applicationContextModule);
    }

    public static Application provideApplication(ApplicationContextModule applicationContextModule) {
        Application applicationProvideApplication = applicationContextModule.provideApplication();
        if (applicationProvideApplication != null) {
            return applicationProvideApplication;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p8.a
    public Application get() {
        return provideApplication(this.module);
    }
}
