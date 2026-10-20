package dagger.hilt.android.internal.modules;

import android.content.Context;
import d8.b;

/* JADX INFO: loaded from: classes.dex */
public final class ApplicationContextModule_ProvideContextFactory implements b {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideContextFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideContextFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideContextFactory(applicationContextModule);
    }

    public static Context provideContext(ApplicationContextModule applicationContextModule) {
        Context contextProvideContext = applicationContextModule.provideContext();
        if (contextProvideContext != null) {
            return contextProvideContext;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p8.a
    public Context get() {
        return provideContext(this.module);
    }
}
