package g8;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.h f6890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.l1 f6891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.p1 f6892c;

    public j4(e8.p1 p1Var, e8.l1 l1Var, e8.h hVar) {
        y3.e.J(p1Var, FirebaseAnalytics.Param.METHOD);
        this.f6892c = p1Var;
        y3.e.J(l1Var, "headers");
        this.f6891b = l1Var;
        y3.e.J(hVar, "callOptions");
        this.f6890a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j4.class != obj.getClass()) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return y3.e.f0(this.f6890a, j4Var.f6890a) && y3.e.f0(this.f6891b, j4Var.f6891b) && y3.e.f0(this.f6892c, j4Var.f6892c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6890a, this.f6891b, this.f6892c});
    }

    public final String toString() {
        return "[method=" + this.f6892c + " headers=" + this.f6891b + " callOptions=" + this.f6890a + "]";
    }
}
