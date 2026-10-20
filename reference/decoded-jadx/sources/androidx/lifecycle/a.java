package androidx.lifecycle;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f2106a;

    public a(Application application) {
        d7.a.m(application, "application");
        this.f2106a = application;
    }

    public final Application b() {
        Application application = this.f2106a;
        d7.a.k(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }
}
