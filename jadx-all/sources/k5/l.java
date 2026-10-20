package k5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f9836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f9841g;

    public l(long j10, Integer num, long j11, byte[] bArr, String str, long j12, w wVar) {
        this.f9835a = j10;
        this.f9836b = num;
        this.f9837c = j11;
        this.f9838d = bArr;
        this.f9839e = str;
        this.f9840f = j12;
        this.f9841g = wVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        l lVar = (l) sVar;
        if (this.f9835a == lVar.f9835a && ((num = this.f9836b) != null ? num.equals(lVar.f9836b) : lVar.f9836b == null)) {
            if (this.f9837c == lVar.f9837c) {
                if (Arrays.equals(this.f9838d, sVar instanceof l ? ((l) sVar).f9838d : lVar.f9838d)) {
                    String str = lVar.f9839e;
                    String str2 = this.f9839e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f9840f == lVar.f9840f) {
                            w wVar = lVar.f9841g;
                            w wVar2 = this.f9841g;
                            if (wVar2 == null) {
                                if (wVar == null) {
                                    return true;
                                }
                            } else if (wVar2.equals(wVar)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9835a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f9836b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.f9837c;
        int iHashCode2 = (((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f9838d)) * 1000003;
        String str = this.f9839e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f9840f;
        int i11 = (iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        w wVar = this.f9841g;
        return i11 ^ (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f9835a + ", eventCode=" + this.f9836b + ", eventUptimeMs=" + this.f9837c + ", sourceExtension=" + Arrays.toString(this.f9838d) + ", sourceExtensionJsonProto3=" + this.f9839e + ", timezoneOffsetSeconds=" + this.f9840f + ", networkConnectionInfo=" + this.f9841g + "}";
    }
}
