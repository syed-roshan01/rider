package n3;

import androidx.fragment.app.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f12143a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d0 d0Var, String str) {
        super(str);
        d7.a.m(d0Var, "fragment");
        this.f12143a = d0Var;
    }
}
