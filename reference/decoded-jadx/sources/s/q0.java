package s;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f13857b = new q0(new b1(null, null, false, null, 63));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f13858a;

    public q0(b1 b1Var) {
        this.f13858a = b1Var;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        return (obj instanceof q0) && d7.a.d(((q0) obj).f13858a, this.f13858a);
    }

    public final q0 b(q0 q0Var) {
        b1 b1Var = this.f13858a;
        s0 s0Var = b1Var.f13754a;
        if (s0Var == null) {
            s0Var = q0Var.f13858a.f13754a;
        }
        q0Var.f13858a.getClass();
        b1 b1Var2 = q0Var.f13858a;
        b1Var2.getClass();
        w0 w0Var = b1Var.f13755b;
        if (w0Var == null) {
            w0Var = b1Var2.f13755b;
        }
        Map map = b1Var.f13757d;
        d7.a.m(map, "<this>");
        Map map2 = b1Var2.f13757d;
        d7.a.m(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new q0(new b1(s0Var, w0Var, false, linkedHashMap, 16));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (d7.a.d(this, f13857b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        b1 b1Var = this.f13858a;
        s0 s0Var = b1Var.f13754a;
        sb.append(s0Var != null ? s0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        w0 w0Var = b1Var.f13755b;
        sb.append(w0Var != null ? w0Var.toString() : null);
        return sb.toString();
    }

    public final int hashCode() {
        return this.f13858a.hashCode();
    }
}
