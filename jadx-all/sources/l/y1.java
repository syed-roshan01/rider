package l;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10979h;

    public final void a(int i10, int i11) {
        this.f10974c = i10;
        this.f10975d = i11;
        this.f10979h = true;
        if (this.f10978g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f10972a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f10973b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f10972a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f10973b = i11;
        }
    }
}
