package r5;

import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f13474f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13479e;

    static {
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        String strJ = l10 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            strJ = strJ.concat(" loadBatchSize");
        }
        if (num2 == null) {
            strJ = q.j(strJ, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            strJ = q.j(strJ, " eventCleanUpAge");
        }
        if (num3 == null) {
            strJ = q.j(strJ, " maxBlobByteSizePerRow");
        }
        if (!strJ.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strJ));
        }
        f13474f = new a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue());
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f13475a = j10;
        this.f13476b = i10;
        this.f13477c = i11;
        this.f13478d = j11;
        this.f13479e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13475a == aVar.f13475a && this.f13476b == aVar.f13476b && this.f13477c == aVar.f13477c && this.f13478d == aVar.f13478d && this.f13479e == aVar.f13479e;
    }

    public final int hashCode() {
        long j10 = this.f13475a;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13476b) * 1000003) ^ this.f13477c) * 1000003;
        long j11 = this.f13478d;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13479e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f13475a + ", loadBatchSize=" + this.f13476b + ", criticalSectionEnterTimeoutMs=" + this.f13477c + ", eventCleanUpAge=" + this.f13478d + ", maxBlobByteSizePerRow=" + this.f13479e + "}";
    }
}
