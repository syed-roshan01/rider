package k5;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f9844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f9845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f9847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f9848g;

    public m(long j10, long j11, r rVar, Integer num, String str, List list, x xVar) {
        this.f9842a = j10;
        this.f9843b = j11;
        this.f9844c = rVar;
        this.f9845d = num;
        this.f9846e = str;
        this.f9847f = list;
        this.f9848g = xVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        m mVar = (m) ((t) obj);
        if (this.f9842a == mVar.f9842a) {
            if (this.f9843b == mVar.f9843b) {
                r rVar = mVar.f9844c;
                r rVar2 = this.f9844c;
                if (rVar2 != null ? rVar2.equals(rVar) : rVar == null) {
                    Integer num = mVar.f9845d;
                    Integer num2 = this.f9845d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = mVar.f9846e;
                        String str2 = this.f9846e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = mVar.f9847f;
                            List list2 = this.f9847f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                x xVar = mVar.f9848g;
                                x xVar2 = this.f9848g;
                                if (xVar2 == null) {
                                    if (xVar == null) {
                                        return true;
                                    }
                                } else if (xVar2.equals(xVar)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9842a;
        long j11 = this.f9843b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        r rVar = this.f9844c;
        int iHashCode = (i10 ^ (rVar == null ? 0 : rVar.hashCode())) * 1000003;
        Integer num = this.f9845d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f9846e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f9847f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f9848g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f9842a + ", requestUptimeMs=" + this.f9843b + ", clientInfo=" + this.f9844c + ", logSource=" + this.f9845d + ", logSourceName=" + this.f9846e + ", logEvents=" + this.f9847f + ", qosTier=" + this.f9848g + "}";
    }
}
