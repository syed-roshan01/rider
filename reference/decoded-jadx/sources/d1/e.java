package d1;

import d7.t;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4343h;

    static {
        long j10 = a.f4320a;
        f6.a.d(a.b(j10), a.c(j10));
    }

    public e(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f4336a = f10;
        this.f4337b = f11;
        this.f4338c = f12;
        this.f4339d = f13;
        this.f4340e = j10;
        this.f4341f = j11;
        this.f4342g = j12;
        this.f4343h = j13;
    }

    public final float a() {
        return this.f4339d - this.f4337b;
    }

    public final float b() {
        return this.f4338c - this.f4336a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f4336a, eVar.f4336a) == 0 && Float.compare(this.f4337b, eVar.f4337b) == 0 && Float.compare(this.f4338c, eVar.f4338c) == 0 && Float.compare(this.f4339d, eVar.f4339d) == 0 && a.a(this.f4340e, eVar.f4340e) && a.a(this.f4341f, eVar.f4341f) && a.a(this.f4342g, eVar.f4342g) && a.a(this.f4343h, eVar.f4343h);
    }

    public final int hashCode() {
        int iA = q.a(this.f4339d, q.a(this.f4338c, q.a(this.f4337b, Float.hashCode(this.f4336a) * 31, 31), 31), 31);
        int i10 = a.f4321b;
        return Long.hashCode(this.f4343h) + q.b(this.f4342g, q.b(this.f4341f, q.b(this.f4340e, iA, 31), 31), 31);
    }

    public final String toString() {
        String str = t.w0(this.f4336a) + ", " + t.w0(this.f4337b) + ", " + t.w0(this.f4338c) + ", " + t.w0(this.f4339d);
        long j10 = this.f4340e;
        long j11 = this.f4341f;
        boolean zA = a.a(j10, j11);
        long j12 = this.f4342g;
        long j13 = this.f4343h;
        if (!zA || !a.a(j11, j12) || !a.a(j12, j13)) {
            StringBuilder sbR = a7.a.r("RoundRect(rect=", str, ", topLeft=");
            sbR.append((Object) a.d(j10));
            sbR.append(", topRight=");
            sbR.append((Object) a.d(j11));
            sbR.append(", bottomRight=");
            sbR.append((Object) a.d(j12));
            sbR.append(", bottomLeft=");
            sbR.append((Object) a.d(j13));
            sbR.append(')');
            return sbR.toString();
        }
        if (a.b(j10) == a.c(j10)) {
            StringBuilder sbR2 = a7.a.r("RoundRect(rect=", str, ", radius=");
            sbR2.append(t.w0(a.b(j10)));
            sbR2.append(')');
            return sbR2.toString();
        }
        StringBuilder sbR3 = a7.a.r("RoundRect(rect=", str, ", x=");
        sbR3.append(t.w0(a.b(j10)));
        sbR3.append(", y=");
        sbR3.append(t.w0(a.c(j10)));
        sbR3.append(')');
        return sbR3.toString();
    }
}
