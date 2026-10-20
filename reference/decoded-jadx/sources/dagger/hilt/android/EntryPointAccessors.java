package dagger.hilt.android;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.d0;
import d7.a;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;

/* JADX INFO: loaded from: classes.dex */
public final class EntryPointAccessors {
    public static final EntryPointAccessors INSTANCE = new EntryPointAccessors();

    private EntryPointAccessors() {
    }

    public static final <T> T fromActivity(Activity activity, Class<T> cls) {
        a.m(activity, "activity");
        a.m(cls, "entryPoint");
        return (T) EntryPoints.get(activity, cls);
    }

    public static final <T> T fromApplication(Context context, Class<T> cls) {
        a.m(context, "context");
        a.m(cls, "entryPoint");
        return (T) EntryPoints.get(Contexts.getApplication(context.getApplicationContext()), cls);
    }

    public static final <T> T fromFragment(d0 d0Var, Class<T> cls) {
        a.m(d0Var, "fragment");
        a.m(cls, "entryPoint");
        return (T) EntryPoints.get(d0Var, cls);
    }

    public static final <T> T fromView(View view, Class<T> cls) {
        a.m(view, "view");
        a.m(cls, "entryPoint");
        return (T) EntryPoints.get(view, cls);
    }

    public final <T> T fromActivity(Activity activity) {
        a.m(activity, "activity");
        a.C();
        throw null;
    }

    public final <T> T fromApplication(Context context) {
        a.m(context, "context");
        a.C();
        throw null;
    }

    public final <T> T fromFragment(d0 d0Var) {
        a.m(d0Var, "fragment");
        a.C();
        throw null;
    }

    public final <T> T fromView(View view) {
        a.m(view, "view");
        a.C();
        throw null;
    }
}
