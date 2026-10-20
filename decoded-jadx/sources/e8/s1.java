package e8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f5363c;

    public s1(List list, c cVar, r1 r1Var) {
        this.f5361a = Collections.unmodifiableList(new ArrayList(list));
        y3.e.J(cVar, "attributes");
        this.f5362b = cVar;
        this.f5363c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return y3.e.f0(this.f5361a, s1Var.f5361a) && y3.e.f0(this.f5362b, s1Var.f5362b) && y3.e.f0(this.f5363c, s1Var.f5363c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5361a, this.f5362b, this.f5363c});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f5361a, "addresses");
        gVarJ0.a(this.f5362b, "attributes");
        gVarJ0.a(this.f5363c, "serviceConfig");
        return gVarJ0.toString();
    }
}
