package e7;

import i7.r0;
import i7.t0;
import i7.u0;
import i7.v0;
import i7.w0;
import i7.x0;
import i7.z0;
import java.security.GeneralSecurityException;
import w6.t;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d7.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d7.n f5169d = new d7.n(new t(17), i.class);

    public j() {
        super(t0.class, new w6.f(v6.m.class, 11));
    }

    public static d7.e h(int i10, int i11, r0 r0Var, int i12) {
        u0 u0VarC = v0.C();
        w0 w0VarC = x0.C();
        w0VarC.d();
        x0.x((x0) w0VarC.f3641b, r0Var);
        w0VarC.d();
        x0.y((x0) w0VarC.f3641b, i11);
        x0 x0Var = (x0) w0VarC.a();
        u0VarC.d();
        v0.x((v0) u0VarC.f3641b, x0Var);
        u0VarC.d();
        v0.y((v0) u0VarC.f3641b, i10);
        return new d7.e((v0) u0VarC.a(), i12);
    }

    public static void i(t0 t0Var) throws GeneralSecurityException {
        j7.r.c(t0Var.D());
        if (t0Var.B().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        j(t0Var.C());
    }

    public static void j(x0 x0Var) throws GeneralSecurityException {
        if (x0Var.B() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = x0Var.A().ordinal();
        if (iOrdinal == 1) {
            if (x0Var.B() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (x0Var.B() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (x0Var.B() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (x0Var.B() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (x0Var.B() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // d7.f
    public final int a() {
        return 2;
    }

    @Override // d7.f
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // d7.f
    public final w6.g d() {
        return new w6.g(this, v0.class, 11);
    }

    @Override // d7.f
    public final z0 e() {
        return z0.SYMMETRIC;
    }

    @Override // d7.f
    public final com.google.crypto.tink.shaded.protobuf.b f(com.google.crypto.tink.shaded.protobuf.l lVar) {
        return t0.F(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
    }

    @Override // d7.f
    public final /* bridge */ /* synthetic */ void g(com.google.crypto.tink.shaded.protobuf.b bVar) throws GeneralSecurityException {
        i((t0) bVar);
    }
}
