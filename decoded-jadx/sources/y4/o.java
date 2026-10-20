package y4;

import androidx.lifecycle.p0;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ViewModelComponentBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f16942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewModelLifecycle f16943d;

    public o(n nVar, j jVar) {
        this.f16940a = nVar;
        this.f16941b = jVar;
    }

    @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponent build() {
        z6.a.g(p0.class, this.f16942c);
        z6.a.g(ViewModelLifecycle.class, this.f16943d);
        return new q(this.f16940a, this.f16941b);
    }

    @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponentBuilder savedStateHandle(p0 p0Var) {
        p0Var.getClass();
        this.f16942c = p0Var;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponentBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
        viewModelLifecycle.getClass();
        this.f16943d = viewModelLifecycle;
        return this;
    }
}
