package u9;

import java.util.concurrent.atomic.AtomicReferenceArray;
import r9.t;

/* JADX INFO: loaded from: classes.dex */
public final class k extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceArray f15464e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.f15464e = new AtomicReferenceArray(j.f15463f);
    }

    @Override // r9.t
    public final int f() {
        return j.f15463f;
    }

    @Override // r9.t
    public final void g(int i10, u8.j jVar) {
        this.f15464e.set(i10, j.f15462e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f13728c + ", hashCode=" + hashCode() + ']';
    }
}
