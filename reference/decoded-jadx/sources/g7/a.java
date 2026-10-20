package g7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6624b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6625a;

    static {
        w4 w4Var = new w4(8);
        HashMap map = (HashMap) w4Var.f10455b;
        if (map == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        a aVar = new a(Collections.unmodifiableMap(map));
        w4Var.f10455b = null;
        f6624b = aVar;
    }

    public a(Map map) {
        this.f6625a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6625a.equals(((a) obj).f6625a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6625a.hashCode();
    }

    public final String toString() {
        return this.f6625a.toString();
    }
}
