package p9;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12931b;

    public n0(long j10, long j11) {
        this.f12930a = j10;
        this.f12931b = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // p9.h0
    public final f a(q9.z zVar) {
        l0 l0Var = new l0(this, null);
        int i10 = o.f12932a;
        return h6.g.Q(new k(new q9.o(l0Var, zVar, u8.k.f15438a, -2, o9.a.f12668a), new m0(2, null)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (this.f12930a == n0Var.f12930a && this.f12931b == n0Var.f12931b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12931b) + (Long.hashCode(this.f12930a) * 31);
    }

    public final String toString() {
        s8.a aVar = new s8.a(2);
        long j10 = this.f12930a;
        if (j10 > 0) {
            aVar.add("stopTimeout=" + j10 + "ms");
        }
        long j11 = this.f12931b;
        if (j11 < Long.MAX_VALUE) {
            aVar.add("replayExpiration=" + j11 + "ms");
        }
        if (aVar.f14067e != null) {
            throw new IllegalStateException();
        }
        aVar.q();
        aVar.f14066d = true;
        if (aVar.f14065c <= 0) {
            aVar = s8.a.f14062n;
        }
        return "SharingStarted.WhileSubscribed(" + r8.p.K0(aVar, null, null, null, null, 63) + ')';
    }
}
