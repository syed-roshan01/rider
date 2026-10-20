package r9;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f13699a;

    static {
        Iterator itO = l.q.o();
        d7.a.m(itO, "<this>");
        r8.o oVar = new r8.o(itO, 2);
        boolean z10 = oVar instanceof k9.a;
        k9.i aVar = oVar;
        if (!z10) {
            aVar = new k9.a(oVar);
        }
        f13699a = k9.k.I0(aVar);
    }
}
