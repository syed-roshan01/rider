package f4;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f6224b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6223a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6225c = new ArrayList();

    public x(View view) {
        this.f6224b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f6224b == xVar.f6224b && this.f6223a.equals(xVar.f6223a);
    }

    public final int hashCode() {
        return this.f6223a.hashCode() + (this.f6224b.hashCode() * 31);
    }

    public final String toString() {
        String strJ = l.q.j(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6224b + "\n", "    values:");
        HashMap map = this.f6223a;
        for (String str : map.keySet()) {
            strJ = strJ + "    " + str + ": " + map.get(str) + "\n";
        }
        return strJ;
    }
}
