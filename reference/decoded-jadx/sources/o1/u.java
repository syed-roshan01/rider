package o1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f12424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f12425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f12426m;

    public u(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f12414a = j10;
        this.f12415b = j11;
        this.f12416c = j12;
        this.f12417d = z10;
        this.f12418e = f10;
        this.f12419f = j13;
        this.f12420g = j14;
        this.f12421h = z11;
        this.f12422i = i10;
        this.f12423j = j15;
        this.f12425l = d1.c.f4326b;
        c cVar = new c();
        cVar.f12348a = z12;
        cVar.f12349b = z12;
        this.f12426m = cVar;
    }

    public final void a() {
        c cVar = this.f12426m;
        cVar.f12349b = true;
        cVar.f12348a = true;
    }

    public final boolean b() {
        c cVar = this.f12426m;
        return cVar.f12349b || cVar.f12348a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) t.b(this.f12414a));
        sb.append(", uptimeMillis=");
        sb.append(this.f12415b);
        sb.append(", position=");
        sb.append((Object) d1.c.i(this.f12416c));
        sb.append(", pressed=");
        sb.append(this.f12417d);
        sb.append(", pressure=");
        sb.append(this.f12418e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f12419f);
        sb.append(", previousPosition=");
        sb.append((Object) d1.c.i(this.f12420g));
        sb.append(", previousPressed=");
        sb.append(this.f12421h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i10 = this.f12422i;
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
        sb.append(", historical=");
        Object obj = this.f12424k;
        if (obj == null) {
            obj = r8.r.f13661a;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) d1.c.i(this.f12423j));
        sb.append(')');
        return sb.toString();
    }

    public u(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, j15);
        this.f12424k = list;
        this.f12425l = j16;
    }
}
