package n8;

import e8.v0;
import e8.x0;
import g8.j4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class s extends u {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12306u = AtomicIntegerFieldUpdater.newUpdater(s.class, "t");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f12307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f12308t;

    public s(int i10, ArrayList arrayList) {
        y3.e.G("empty list", !arrayList.isEmpty());
        this.f12307s = arrayList;
        this.f12308t = i10 - 1;
    }

    @Override // n8.u
    public final boolean B0(u uVar) {
        if (!(uVar instanceof s)) {
            return false;
        }
        s sVar = (s) uVar;
        if (sVar != this) {
            List list = this.f12307s;
            if (list.size() != sVar.f12307s.size() || !new HashSet(list).containsAll(sVar.f12307s)) {
                return false;
            }
        }
        return true;
    }

    @Override // z6.a
    public final v0 Y(j4 j4Var) {
        List list = this.f12307s;
        int size = list.size();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12306u;
        int iIncrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
        if (iIncrementAndGet >= size) {
            int i10 = iIncrementAndGet % size;
            atomicIntegerFieldUpdater.compareAndSet(this, iIncrementAndGet, i10);
            iIncrementAndGet = i10;
        }
        return v0.b((x0) list.get(iIncrementAndGet), null);
    }

    public final String toString() {
        q6.g gVar = new q6.g(s.class.getSimpleName());
        gVar.a(this.f12307s, "list");
        return gVar.toString();
    }
}
