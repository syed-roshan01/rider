package n3;

import androidx.fragment.app.d0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d0 d0Var, int i10) {
        super(1, d0Var, "Attempting to get target request code from fragment " + d0Var);
        if (i10 != 1) {
            d7.a.m(d0Var, "fragment");
            return;
        }
        d7.a.m(d0Var, "fragment");
        super(1, d0Var, "Attempting to get target fragment from fragment " + d0Var);
    }
}
