package c5;

import android.os.Bundle;
import androidx.lifecycle.b1;
import com.auto.accept.ui.MainActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends androidx.activity.p implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SavedStateHandleHolder f2978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ActivityComponentManager f2979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2980c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2981d = false;

    public e() {
        addOnContextAvailableListener(new d((MainActivity) this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.f2979b == null) {
            synchronized (this.f2980c) {
                try {
                    if (this.f2979b == null) {
                        this.f2979b = new ActivityComponentManager(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f2979b;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.p
    public final b1 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.activity.p, q2.m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof GeneratedComponentManager) {
            SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
            this.f2978a = savedStateHandleHolder;
            if (savedStateHandleHolder.isInvalid()) {
                this.f2978a.setExtras(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.f2978a;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }
}
