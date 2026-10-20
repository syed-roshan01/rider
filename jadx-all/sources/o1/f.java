package o1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q.l f12360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f12361b;

    public f(q.l lVar, w wVar) {
        this.f12360a = lVar;
        this.f12361b = wVar;
    }

    public final boolean a(long j10) {
        Object obj;
        List list = this.f12361b.f12430a;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (t.a(((x) obj).f12432a, j10)) {
                break;
            }
            i10++;
        }
        x xVar = (x) obj;
        if (xVar != null) {
            return xVar.f12439h;
        }
        return false;
    }
}
