package w0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f16058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f16059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry f16061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map.Entry f16062e;

    public f0(x xVar, Iterator it) {
        this.f16058a = xVar;
        this.f16059b = it;
        this.f16060c = xVar.a().f16127d;
        a();
    }

    public final void a() {
        this.f16061d = this.f16062e;
        Iterator it = this.f16059b;
        this.f16062e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.f16062e != null;
    }

    public final void remove() {
        x xVar = this.f16058a;
        if (xVar.a().f16127d != this.f16060c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f16061d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        xVar.remove(entry.getKey());
        this.f16061d = null;
        this.f16060c = xVar.a().f16127d;
    }
}
