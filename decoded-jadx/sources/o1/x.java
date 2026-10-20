package o1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f12437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f12440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f12442k;

    public x(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, ArrayList arrayList, long j14, long j15) {
        this.f12432a = j10;
        this.f12433b = j11;
        this.f12434c = j12;
        this.f12435d = j13;
        this.f12436e = z10;
        this.f12437f = f10;
        this.f12438g = i10;
        this.f12439h = z11;
        this.f12440i = arrayList;
        this.f12441j = j14;
        this.f12442k = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return t.a(this.f12432a, xVar.f12432a) && this.f12433b == xVar.f12433b && d1.c.b(this.f12434c, xVar.f12434c) && d1.c.b(this.f12435d, xVar.f12435d) && this.f12436e == xVar.f12436e && Float.compare(this.f12437f, xVar.f12437f) == 0 && s.u(this.f12438g, xVar.f12438g) && this.f12439h == xVar.f12439h && d7.a.d(this.f12440i, xVar.f12440i) && d1.c.b(this.f12441j, xVar.f12441j) && d1.c.b(this.f12442k, xVar.f12442k);
    }

    public final int hashCode() {
        int iB = l.q.b(this.f12433b, Long.hashCode(this.f12432a) * 31, 31);
        int i10 = d1.c.f4329e;
        return Long.hashCode(this.f12442k) + l.q.b(this.f12441j, (this.f12440i.hashCode() + l.q.c(this.f12439h, a7.a.u(this.f12438g, l.q.a(this.f12437f, l.q.c(this.f12436e, l.q.b(this.f12435d, l.q.b(this.f12434c, iB, 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) t.b(this.f12432a));
        sb.append(", uptime=");
        sb.append(this.f12433b);
        sb.append(", positionOnScreen=");
        sb.append((Object) d1.c.i(this.f12434c));
        sb.append(", position=");
        sb.append((Object) d1.c.i(this.f12435d));
        sb.append(", down=");
        sb.append(this.f12436e);
        sb.append(", pressure=");
        sb.append(this.f12437f);
        sb.append(", type=");
        int i10 = this.f12438g;
        if (i10 == 1) {
            str = "Touch";
        } else if (i10 == 2) {
            str = "Mouse";
        } else if (i10 != 3) {
            str = i10 != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb.append((Object) str);
        sb.append(", issuesEnterExit=");
        sb.append(this.f12439h);
        sb.append(", historical=");
        sb.append(this.f12440i);
        sb.append(", scrollDelta=");
        sb.append((Object) d1.c.i(this.f12441j));
        sb.append(", originalEventPosition=");
        sb.append((Object) d1.c.i(this.f12442k));
        sb.append(')');
        return sb.toString();
    }
}
