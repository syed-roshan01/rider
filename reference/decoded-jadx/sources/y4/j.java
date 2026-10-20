package y4;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16925b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8.b f16926c = d8.a.a(new i());

    public j(n nVar) {
        this.f16924a = nVar;
    }

    @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
    public final ActivityComponentBuilder activityComponentBuilder() {
        return new z2(this.f16924a, this.f16925b);
    }

    @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
    public final ActivityRetainedLifecycle getActivityRetainedLifecycle() {
        return (ActivityRetainedLifecycle) this.f16926c.get();
    }
}
