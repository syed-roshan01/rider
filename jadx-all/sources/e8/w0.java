package e8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5393c;

    public w0(List list, c cVar, Object obj) {
        y3.e.J(list, "addresses");
        this.f5391a = Collections.unmodifiableList(new ArrayList(list));
        y3.e.J(cVar, "attributes");
        this.f5392b = cVar;
        this.f5393c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return y3.e.f0(this.f5391a, w0Var.f5391a) && y3.e.f0(this.f5392b, w0Var.f5392b) && y3.e.f0(this.f5393c, w0Var.f5393c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5391a, this.f5392b, this.f5393c});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f5391a, "addresses");
        gVarJ0.a(this.f5392b, "attributes");
        gVarJ0.a(this.f5393c, "loadBalancingPolicyConfig");
        return gVarJ0.toString();
    }
}
