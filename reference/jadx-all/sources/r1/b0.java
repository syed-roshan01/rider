package r1;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f13344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f13345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f13347e;

    public /* synthetic */ b0(k0 k0Var, f0 f0Var, int i10, k0 k0Var2, int i11) {
        this.f13343a = i11;
        this.f13345c = f0Var;
        this.f13346d = i10;
        this.f13347e = k0Var2;
        this.f13344b = k0Var;
    }

    @Override // r1.k0
    public final int a() {
        int i10 = this.f13343a;
        k0 k0Var = this.f13344b;
        switch (i10) {
            case 0:
                break;
        }
        return k0Var.a();
    }

    @Override // r1.k0
    public final int b() {
        int i10 = this.f13343a;
        k0 k0Var = this.f13344b;
        switch (i10) {
            case 0:
                break;
        }
        return k0Var.b();
    }

    @Override // r1.k0
    public final Map d() {
        int i10 = this.f13343a;
        k0 k0Var = this.f13344b;
        switch (i10) {
            case 0:
                break;
        }
        return k0Var.d();
    }

    @Override // r1.k0
    public final void e() {
        int i10 = this.f13343a;
        k0 k0Var = this.f13347e;
        int i11 = this.f13346d;
        f0 f0Var = this.f13345c;
        switch (i10) {
            case 0:
                f0Var.f13363e = i11;
                k0Var.e();
                Set setEntrySet = f0Var.f13370s.entrySet();
                h1.b bVar = new h1.b(f0Var, 3);
                d7.a.m(setEntrySet, "<this>");
                r8.n.B0(setEntrySet, bVar);
                break;
            default:
                f0Var.f13362d = i11;
                k0Var.e();
                f0Var.d(f0Var.f13362d);
                break;
        }
    }
}
