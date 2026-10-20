package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2138a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f2138a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).clear();
        }
        linkedHashMap.clear();
    }
}
