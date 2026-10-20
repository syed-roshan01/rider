package x9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f16387c = new f(r8.p.a1(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f16388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6.a f16389b;

    public f(Set set, f6.a aVar) {
        d7.a.m(set, "pins");
        this.f16388a = set;
        this.f16389b = aVar;
    }

    public final void a(String str, c9.a aVar) {
        d7.a.m(str, "hostname");
        Iterator it = this.f16388a.iterator();
        if (it.hasNext()) {
            a7.a.w(it.next());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (d7.a.d(fVar.f16388a, this.f16388a) && d7.a.d(fVar.f16389b, this.f16389b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f16388a.hashCode() + 1517) * 41;
        f6.a aVar = this.f16389b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
