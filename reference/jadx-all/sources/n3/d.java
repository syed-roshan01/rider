package n3;

import android.view.ViewGroup;
import androidx.fragment.app.d0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d0 d0Var, ViewGroup viewGroup, int i10) {
        super(d0Var, "Attempting to use <fragment> tag to add fragment " + d0Var + " to container " + viewGroup);
        if (i10 != 1) {
            return;
        }
        d7.a.m(viewGroup, "container");
        super(d0Var, "Attempting to add fragment " + d0Var + " to container " + viewGroup + " which is not a FragmentContainerView");
    }
}
