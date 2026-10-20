package a0;

import m0.l3;
import m0.n1;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class y implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f874b;

    public y(int i10) {
        int i11 = (i10 / 30) * 30;
        this.f873a = d7.t.g0(z6.a.s0(Math.max(i11 - 100, 0), i11 + 130), o3.f11621a);
        this.f874b = i10;
    }

    public final void b(int i10) {
        if (i10 != this.f874b) {
            this.f874b = i10;
            int i11 = (i10 / 30) * 30;
            this.f873a.setValue(z6.a.s0(Math.max(i11 - 100, 0), i11 + 130));
        }
    }

    @Override // m0.l3
    public final Object getValue() {
        return (i9.g) this.f873a.getValue();
    }
}
