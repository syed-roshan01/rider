package y4;

import android.app.Application;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends Application implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16946a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplicationComponentManager f16947b = new ApplicationComponentManager(new k.f(this, 22));

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        return this.f16947b;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return this.f16947b.generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.f16946a) {
            this.f16946a = true;
            b bVar = (b) generatedComponent();
            bVar.getClass();
        }
        super.onCreate();
    }
}
