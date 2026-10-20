package s;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f13754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f13755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f13757d;

    public b1(s0 s0Var, w0 w0Var, boolean z10, Map map) {
        this.f13754a = s0Var;
        this.f13755b = w0Var;
        this.f13756c = z10;
        this.f13757d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return d7.a.d(this.f13754a, b1Var.f13754a) && d7.a.d(null, null) && d7.a.d(null, null) && d7.a.d(this.f13755b, b1Var.f13755b) && this.f13756c == b1Var.f13756c && d7.a.d(this.f13757d, b1Var.f13757d);
    }

    public final int hashCode() {
        s0 s0Var = this.f13754a;
        int iHashCode = (s0Var == null ? 0 : s0Var.hashCode()) * 29791;
        w0 w0Var = this.f13755b;
        return this.f13757d.hashCode() + l.q.c(this.f13756c, (iHashCode + (w0Var != null ? w0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f13754a + ", slide=null, changeSize=null, scale=" + this.f13755b + ", hold=" + this.f13756c + ", effectsMap=" + this.f13757d + ')';
    }

    public /* synthetic */ b1(s0 s0Var, w0 w0Var, boolean z10, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : s0Var, (i10 & 8) != 0 ? null : w0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? r8.s.f13662a : linkedHashMap);
    }
}
