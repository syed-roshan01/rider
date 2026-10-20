package e8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f5309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f5311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p0 f5312e;

    public m0(String str, l0 l0Var, long j10, p0 p0Var, p0 p0Var2) {
        this.f5308a = str;
        y3.e.J(l0Var, "severity");
        this.f5309b = l0Var;
        this.f5310c = j10;
        this.f5311d = p0Var;
        this.f5312e = p0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return y3.e.f0(this.f5308a, m0Var.f5308a) && y3.e.f0(this.f5309b, m0Var.f5309b) && this.f5310c == m0Var.f5310c && y3.e.f0(this.f5311d, m0Var.f5311d) && y3.e.f0(this.f5312e, m0Var.f5312e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5308a, this.f5309b, Long.valueOf(this.f5310c), this.f5311d, this.f5312e});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f5308a, "description");
        gVarJ0.a(this.f5309b, "severity");
        gVarJ0.b("timestampNanos", this.f5310c);
        gVarJ0.a(this.f5311d, "channelRef");
        gVarJ0.a(this.f5312e, "subchannelRef");
        return gVarJ0.toString();
    }
}
