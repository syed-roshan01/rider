package dagger.hilt.android.internal.managers;

import androidx.lifecycle.p0;
import d8.b;
import p8.a;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleModule_ProvideSavedStateHandleFactory implements b {
    private final a savedStateHandleHolderProvider;

    public SavedStateHandleModule_ProvideSavedStateHandleFactory(a aVar) {
        this.savedStateHandleHolderProvider = aVar;
    }

    public static SavedStateHandleModule_ProvideSavedStateHandleFactory create(a aVar) {
        return new SavedStateHandleModule_ProvideSavedStateHandleFactory(aVar);
    }

    public static p0 provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        p0 p0VarProvideSavedStateHandle = SavedStateHandleModule.provideSavedStateHandle(savedStateHandleHolder);
        if (p0VarProvideSavedStateHandle != null) {
            return p0VarProvideSavedStateHandle;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p8.a
    public p0 get() {
        return provideSavedStateHandle((SavedStateHandleHolder) this.savedStateHandleHolderProvider.get());
    }
}
