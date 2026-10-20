package f4;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6149a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6150b;

    public d(ViewGroup viewGroup) {
        this.f6150b = viewGroup;
    }

    @Override // f4.r, f4.p
    public final void b() {
        o7.d0.k0(this.f6150b, false);
    }

    @Override // f4.p
    public final void c(q qVar) {
        if (!this.f6149a) {
            o7.d0.k0(this.f6150b, false);
        }
        qVar.w(this);
    }

    @Override // f4.r, f4.p
    public final void d() {
        o7.d0.k0(this.f6150b, true);
    }

    @Override // f4.r, f4.p
    public final void e() {
        o7.d0.k0(this.f6150b, false);
        this.f6149a = true;
    }
}
