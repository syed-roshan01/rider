package g8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends e8.a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f6854d = !f6.a.Y(System.getenv("GRPC_EXPERIMENTAL_PICKFIRST_LB_CONFIG"));

    @Override // e8.i
    public final e8.z0 c(e8.j0 j0Var) {
        return new h4(j0Var);
    }

    @Override // e8.a1
    public String f() {
        return "pick_first";
    }

    @Override // e8.a1
    public int g() {
        return 5;
    }

    @Override // e8.a1
    public boolean h() {
        return true;
    }

    @Override // e8.a1
    public e8.r1 i(Map map) {
        if (!f6854d) {
            return new e8.r1("no service config");
        }
        try {
            return new e8.r1(new f4(m2.b("shuffleAddressList", map)));
        } catch (RuntimeException e4) {
            return new e8.r1(e8.c2.f5224m.f(e4).g("Failed parsing configuration for " + f()));
        }
    }
}
