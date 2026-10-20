package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.d0;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class FragmentComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final d0 fragment;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    public interface FragmentComponentBuilderEntryPoint {
        FragmentComponentBuilder fragmentComponentBuilder();
    }

    public FragmentComponentManager(d0 d0Var) {
        this.fragment = d0Var;
    }

    private Object createComponent() {
        Preconditions.checkNotNull(this.fragment.getHost(), "Hilt Fragments must be attached before creating the component.");
        Preconditions.checkState(this.fragment.getHost() instanceof GeneratedComponentManager, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.fragment.getHost().getClass());
        validate(this.fragment);
        return ((FragmentComponentBuilderEntryPoint) EntryPoints.get(this.fragment.getHost(), FragmentComponentBuilderEntryPoint.class)).fragmentComponentBuilder().fragment(this.fragment).build();
    }

    public static ContextWrapper createContextWrapper(Context context, d0 d0Var) {
        return new ViewComponentManager.FragmentContextWrapper(context, d0Var);
    }

    public static final Context findActivity(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void initializeArguments(d0 d0Var) {
        Preconditions.checkNotNull(d0Var);
        if (d0Var.getArguments() == null) {
            d0Var.setArguments(new Bundle());
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                try {
                    if (this.component == null) {
                        this.component = createComponent();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.component;
    }

    public void validate(d0 d0Var) {
    }

    public static ContextWrapper createContextWrapper(LayoutInflater layoutInflater, d0 d0Var) {
        return new ViewComponentManager.FragmentContextWrapper(layoutInflater, d0Var);
    }
}
