package e8;

import java.net.URI;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends o7.d0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v1 f5375x;

    public u1(v1 v1Var) {
        this.f5375x = v1Var;
    }

    @Override // o7.d0
    public final g8.g1 a0(URI uri, q1 q1Var) {
        r6.s sVar;
        String scheme = uri.getScheme();
        if (scheme == null) {
            return null;
        }
        v1 v1Var = this.f5375x;
        synchronized (v1Var) {
            sVar = v1Var.f5388d;
        }
        t1 t1Var = (t1) ((r6.f0) sVar).get(scheme.toLowerCase(Locale.US));
        if (t1Var == null) {
            return null;
        }
        return t1Var.a0(uri, q1Var);
    }

    public final String o0() {
        String str;
        synchronized (this.f5375x) {
            str = this.f5375x.f5386b;
        }
        return str;
    }
}
