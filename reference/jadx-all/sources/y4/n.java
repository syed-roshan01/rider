package y4;

import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import java.util.Set;
import r6.g0;
import r6.t;

/* JADX INFO: loaded from: classes.dex */
public final class n extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationContextModule f16933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f16934b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8.b f16935c = d8.a.a(new m(this, 1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d8.b f16936d = d8.a.a(new m(this, 0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d8.b f16937e = d8.a.a(new m(this, 2));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d8.b f16938f = d8.a.a(new m(this, 3));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d8.b f16939g = d8.a.a(new m(this, 4));

    public n(ApplicationContextModule applicationContextModule) {
        this.f16933a = applicationContextModule;
    }

    @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
    public final Set getDisableFragmentGetContextFix() {
        int i10 = t.f13582c;
        return g0.f13545q;
    }

    @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
    public final ActivityRetainedComponentBuilder retainedComponentBuilder() {
        return new l.t(this.f16934b);
    }

    @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
    public final ServiceComponentBuilder serviceComponentBuilder() {
        return new l.t(this.f16934b, 0);
    }
}
