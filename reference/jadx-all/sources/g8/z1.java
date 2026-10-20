package g8;

import java.util.Collections;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends f4.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e8.p0 f7300c;

    public z1(e8.p0 p0Var, int i10) {
        this.f7299b = i10;
        this.f7300c = p0Var;
        this.f6226a = Collections.newSetFromMap(new IdentityHashMap());
    }

    @Override // f4.y
    public final void c() {
        int i10 = this.f7299b;
        e8.p0 p0Var = this.f7300c;
        switch (i10) {
            case 0:
                j2 j2Var = (j2) p0Var;
                ((k3) j2Var.f6869e.f7176b).f6908j.X.f(j2Var, true);
                break;
            case 1:
                ((l3) p0Var).C();
                break;
            default:
                ((h8.n) p0Var).f7679h.b(true);
                break;
        }
    }

    @Override // f4.y
    public final void d() {
        int i10 = this.f7299b;
        e8.p0 p0Var = this.f7300c;
        switch (i10) {
            case 0:
                j2 j2Var = (j2) p0Var;
                ((k3) j2Var.f6869e.f7176b).f6908j.X.f(j2Var, false);
                break;
            case 1:
                l3 l3Var = (l3) p0Var;
                if (!l3Var.F.get()) {
                    l3Var.E();
                    break;
                }
                break;
            default:
                ((h8.n) p0Var).f7679h.b(false);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(l3 l3Var) {
        this(l3Var, 1);
        this.f7299b = 1;
    }
}
