package k5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9832a;

    public j(ArrayList arrayList) {
        this.f9832a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return this.f9832a.equals(((j) ((p) obj)).f9832a);
    }

    public final int hashCode() {
        return this.f9832a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f9832a + "}";
    }
}
