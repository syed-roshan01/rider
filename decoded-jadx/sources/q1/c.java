package q1;

import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13080d;

    public c(float f10, float f11, long j10, int i10) {
        this.f13077a = f10;
        this.f13078b = f11;
        this.f13079c = j10;
        this.f13080d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f13077a == this.f13077a && cVar.f13078b == this.f13078b && cVar.f13079c == this.f13079c && cVar.f13080d == this.f13080d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13080d) + q.b(this.f13079c, q.a(this.f13078b, Float.hashCode(this.f13077a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.f13077a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.f13078b);
        sb.append(",uptimeMillis=");
        sb.append(this.f13079c);
        sb.append(",deviceId=");
        return a7.a.o(sb, this.f13080d, ')');
    }
}
