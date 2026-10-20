package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements w {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k0 f2149p = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2151b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f2154e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2152c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2153d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f2155f = new y(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.activity.d f2156n = new androidx.activity.d(this, 9);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j0 f2157o = new j0(this);

    public final void a() {
        int i10 = this.f2151b + 1;
        this.f2151b = i10;
        if (i10 == 1) {
            if (this.f2152c) {
                this.f2155f.f(p.ON_RESUME);
                this.f2152c = false;
            } else {
                Handler handler = this.f2154e;
                d7.a.j(handler);
                handler.removeCallbacks(this.f2156n);
            }
        }
    }

    @Override // androidx.lifecycle.w
    public final r getLifecycle() {
        return this.f2155f;
    }
}
