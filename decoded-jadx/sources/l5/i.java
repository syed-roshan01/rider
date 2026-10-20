package l5;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f11343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f11344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f11347f;

    public i(String str, Integer num, m mVar, long j10, long j11, Map map) {
        this.f11342a = str;
        this.f11343b = num;
        this.f11344c = mVar;
        this.f11345d = j10;
        this.f11346e = j11;
        this.f11347f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f11347f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f11347f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final l.r c() {
        l.r rVar = new l.r(1);
        String str = this.f11342a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        rVar.f10910b = str;
        rVar.f10911c = this.f11343b;
        rVar.i(this.f11344c);
        rVar.f10913e = Long.valueOf(this.f11345d);
        rVar.f10914f = Long.valueOf(this.f11346e);
        rVar.f10915g = new HashMap(this.f11347f);
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f11342a.equals(iVar.f11342a)) {
            Integer num = iVar.f11343b;
            Integer num2 = this.f11343b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f11344c.equals(iVar.f11344c) && this.f11345d == iVar.f11345d && this.f11346e == iVar.f11346e && this.f11347f.equals(iVar.f11347f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11342a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f11343b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f11344c.hashCode()) * 1000003;
        long j10 = this.f11345d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f11346e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f11347f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f11342a + ", code=" + this.f11343b + ", encodedPayload=" + this.f11344c + ", eventMillis=" + this.f11345d + ", uptimeMillis=" + this.f11346e + ", autoMetadata=" + this.f11347f + "}";
    }
}
