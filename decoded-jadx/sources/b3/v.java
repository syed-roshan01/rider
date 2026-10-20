package b3;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public class v extends l2.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2684a;

    public v(View view) {
        this.f2684a = view;
    }

    @Override // l2.l
    public void g() {
        View view = this.f2684a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // l2.l
    public void j() {
        View viewFindViewById;
        View view = this.f2684a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new androidx.activity.d(viewFindViewById, 8));
    }
}
