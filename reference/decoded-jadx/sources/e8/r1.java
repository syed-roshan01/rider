package e8;

import com.google.firebase.messaging.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f5357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5358b;

    public r1(Object obj) {
        this.f5358b = obj;
        this.f5357a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r1.class != obj.getClass()) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return y3.e.f0(this.f5357a, r1Var.f5357a) && y3.e.f0(this.f5358b, r1Var.f5358b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5357a, this.f5358b});
    }

    public final String toString() {
        Object obj = this.f5358b;
        if (obj != null) {
            q6.g gVarJ0 = f6.a.j0(this);
            gVarJ0.a(obj, "config");
            return gVarJ0.toString();
        }
        q6.g gVarJ1 = f6.a.j0(this);
        gVarJ1.a(this.f5357a, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return gVarJ1.toString();
    }

    public r1(c2 c2Var) {
        this.f5358b = null;
        y3.e.J(c2Var, "status");
        this.f5357a = c2Var;
        y3.e.E(c2Var, "cannot use OK status: %s", !c2Var.e());
    }
}
