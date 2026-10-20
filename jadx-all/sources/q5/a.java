package q5;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5.a f13151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13152b;

    public a(t5.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f13151a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f13152b = map;
    }

    public final long a(i5.d dVar, long j10, int i10) {
        long jA = j10 - ((t5.c) this.f13151a).a();
        b bVar = (b) this.f13152b.get(dVar);
        long j11 = bVar.f13153a;
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * ((long) i11)))), jA), bVar.f13154b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13151a.equals(aVar.f13151a) && this.f13152b.equals(aVar.f13152b);
    }

    public final int hashCode() {
        return ((this.f13151a.hashCode() ^ 1000003) * 1000003) ^ this.f13152b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f13151a + ", values=" + this.f13152b + "}";
    }
}
