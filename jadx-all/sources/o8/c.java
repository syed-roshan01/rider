package o8;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12667c;

    public c(e6.b bVar) {
        this.f12665a = 3;
        f6.a.x(bVar);
        this.f12667c = bVar;
    }

    public final int a(int i10) {
        Object obj = this.f12667c;
        if (((c) obj) == null) {
            return i10 >= 64 ? Long.bitCount(this.f12666b) : Long.bitCount(this.f12666b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f12666b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f12666b) + ((c) obj).a(i10 - 64);
    }

    public final void b() {
        if (((c) this.f12667c) == null) {
            this.f12667c = new c(1);
        }
    }

    public final boolean c(int i10) {
        if (i10 < 64) {
            return (this.f12666b & (1 << i10)) != 0;
        }
        b();
        return ((c) this.f12667c).c(i10 - 64);
    }

    public final void d() {
        this.f12666b = 0L;
        Object obj = this.f12667c;
        if (((c) obj) != null) {
            ((c) obj).d();
        }
    }

    public final String toString() {
        switch (this.f12665a) {
            case 1:
                if (((c) this.f12667c) == null) {
                    return Long.toBinaryString(this.f12666b);
                }
                return ((c) this.f12667c).toString() + "xx" + Long.toBinaryString(this.f12666b);
            default:
                return super.toString();
        }
    }

    public c() {
        this.f12665a = 0;
        this.f12667c = "";
        this.f12666b = Long.MIN_VALUE;
    }

    public c(int i10) {
        this.f12665a = i10;
        if (i10 != 2) {
            this.f12666b = 0L;
        } else {
            this.f12666b = 0L;
            this.f12667c = o5.c.REASON_UNKNOWN;
        }
    }
}
