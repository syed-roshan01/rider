package p7;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12843a = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f12843a.equals(this.f12843a));
    }

    public final int hashCode() {
        return this.f12843a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12843a.iterator();
    }
}
