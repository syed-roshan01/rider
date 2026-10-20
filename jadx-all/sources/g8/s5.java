package g8;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7117b;

    public s5(String str, Map map) {
        y3.e.J(str, "policyName");
        this.f7116a = str;
        y3.e.J(map, "rawConfigValue");
        this.f7117b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return this.f7116a.equals(s5Var.f7116a) && this.f7117b.equals(s5Var.f7117b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7116a, this.f7117b});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f7116a, "policyName");
        gVarJ0.a(this.f7117b, "rawConfigValue");
        return gVarJ0.toString();
    }
}
