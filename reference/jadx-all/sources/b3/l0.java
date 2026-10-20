package b3;

import android.view.View;
import android.view.autofill.AutofillId;
import com.ride.accepter.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public static void a(View view, o0 o0Var) {
        q.z zVar = (q.z) view.getTag(R.id.tag_unhandled_key_listeners);
        if (zVar == null) {
            zVar = new q.z();
            view.setTag(R.id.tag_unhandled_key_listeners, zVar);
        }
        Objects.requireNonNull(o0Var);
        View.OnUnhandledKeyEventListener k0Var = new k0();
        zVar.put(o0Var, k0Var);
        view.addOnUnhandledKeyEventListener(k0Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, o0 o0Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        q.z zVar = (q.z) view.getTag(R.id.tag_unhandled_key_listeners);
        if (zVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) zVar.get(o0Var)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i10) {
        return (T) view.requireViewById(i10);
    }

    public static void g(View view, boolean z10) {
        view.setAccessibilityHeading(z10);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void j(View view, boolean z10) {
        view.setScreenReaderFocusable(z10);
    }
}
