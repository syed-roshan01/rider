package e8;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5258d = new b("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5261c;

    public g0(List list, c cVar) {
        y3.e.G("addrs is empty", !list.isEmpty());
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f5259a = listUnmodifiableList;
        y3.e.J(cVar, "attrs");
        this.f5260b = cVar;
        this.f5261c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        List list = this.f5259a;
        if (list.size() != g0Var.f5259a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!((SocketAddress) list.get(i10)).equals(g0Var.f5259a.get(i10))) {
                return false;
            }
        }
        return this.f5260b.equals(g0Var.f5260b);
    }

    public final int hashCode() {
        return this.f5261c;
    }

    public final String toString() {
        return "[" + this.f5259a + "/" + this.f5260b + "]";
    }

    public g0(SocketAddress socketAddress) {
        this(Collections.singletonList(socketAddress), c.f5206b);
    }
}
