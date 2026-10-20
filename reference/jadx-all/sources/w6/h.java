package w6;

import i7.f0;
import i7.h0;
import i7.j0;
import i7.o0;
import i7.o1;
import i7.p1;
import i7.r0;
import i7.r1;
import i7.s1;
import i7.u0;
import i7.v0;
import i7.w0;
import i7.w1;
import i7.x0;
import i7.x1;
import i7.z0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d7.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10) {
        super(i7.h.class, new f(v6.a.class, 0));
        this.f16209d = i10;
        switch (i10) {
            case 1:
                super(i7.l.class, new f(j7.l.class, 1));
                break;
            case 2:
                super(i7.r.class, new f(v6.a.class, 2));
                break;
            case 3:
                super(i7.x.class, new f(v6.a.class, 3));
                break;
            case 4:
                super(i7.b0.class, new f(v6.a.class, 4));
                break;
            case 5:
                super(j0.class, new f(v6.a.class, 5));
                break;
            case 6:
                super(o1.class, new f(v6.a.class, 6));
                break;
            case 7:
                super(r1.class, new f(v6.a.class, 7));
                break;
            case 8:
                super(w1.class, new f(v6.a.class, 8));
                break;
            case 9:
                super(f0.class, new f(v6.c.class, 9));
                break;
            default:
                break;
        }
    }

    public static d7.e h(int i10, int i11) {
        i7.s sVarB = i7.t.B();
        sVarB.d();
        i7.t.y((i7.t) sVarB.f3641b, i10);
        i7.u uVarA = i7.v.A();
        uVarA.d();
        i7.v.x((i7.v) uVarA.f3641b);
        i7.v vVar = (i7.v) uVarA.a();
        sVarB.d();
        i7.t.x((i7.t) sVarB.f3641b, vVar);
        return new d7.e((i7.t) sVarB.a(), i11);
    }

    public static d7.e i(int i10, int i11, int i12) {
        r0 r0Var = r0.SHA256;
        i7.m mVarC = i7.n.C();
        i7.o oVarA = i7.p.A();
        oVarA.d();
        i7.p.x((i7.p) oVarA.f3641b);
        i7.p pVar = (i7.p) oVarA.a();
        mVarC.d();
        i7.n.x((i7.n) mVarC.f3641b, pVar);
        mVarC.d();
        i7.n.y((i7.n) mVarC.f3641b, i10);
        i7.n nVar = (i7.n) mVarC.a();
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
        v0.y((v0) u0VarC.f3641b, 32);
        v0 v0Var = (v0) u0VarC.a();
        i7.i iVarB = i7.j.B();
        iVarB.d();
        i7.j.x((i7.j) iVarB.f3641b, nVar);
        iVarB.d();
        i7.j.y((i7.j) iVarB.f3641b, v0Var);
        return new d7.e((i7.j) iVarB.a(), i12);
    }

    public static d7.e j(int i10, int i11) {
        i7.y yVarZ = i7.z.z();
        yVarZ.d();
        i7.z.x((i7.z) yVarZ.f3641b, i10);
        return new d7.e((i7.z) yVarZ.a(), i11);
    }

    public static d7.e k(int i10, int i11) {
        i7.c0 c0VarZ = i7.d0.z();
        c0VarZ.d();
        i7.d0.x((i7.d0) c0VarZ.f3641b, i10);
        return new d7.e((i7.d0) c0VarZ.a(), i11);
    }

    @Override // d7.f
    public final int a() {
        switch (this.f16209d) {
            case 0:
            case 3:
                return 2;
            default:
                return 1;
        }
    }

    @Override // d7.f
    public final String b() {
        switch (this.f16209d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 8:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    @Override // d7.f
    public final g d() {
        switch (this.f16209d) {
            case 0:
                return new g(this, i7.j.class, 0);
            case 1:
                return new g(this, i7.n.class, 1);
            case 2:
                return new g(this, i7.t.class, 2);
            case 3:
                return new g(this, i7.z.class, 3);
            case 4:
                return new g(this, i7.d0.class, 4);
            case 5:
                return new g(this, o0.class, 5);
            case 6:
                return new g(this, p1.class, 6);
            case 7:
                return new g(this, s1.class, 7);
            case 8:
                return new g(this, x1.class, 8);
            default:
                return new g(this, h0.class, 9);
        }
    }

    @Override // d7.f
    public final z0 e() {
        z0 z0Var = z0.REMOTE;
        z0 z0Var2 = z0.SYMMETRIC;
        switch (this.f16209d) {
            case 6:
            case 7:
                return z0Var;
            default:
                return z0Var2;
        }
    }

    @Override // d7.f
    public final com.google.crypto.tink.shaded.protobuf.b f(com.google.crypto.tink.shaded.protobuf.l lVar) {
        switch (this.f16209d) {
            case 0:
                return i7.h.E(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 1:
                return i7.l.F(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 2:
                return i7.r.E(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 3:
                return i7.x.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 4:
                return i7.b0.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 5:
                return j0.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 6:
                return o1.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 7:
                return r1.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 8:
                return w1.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            default:
                return f0.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
        }
    }

    @Override // d7.f
    public final void g(com.google.crypto.tink.shaded.protobuf.b bVar) throws GeneralSecurityException {
        switch (this.f16209d) {
            case 0:
                i7.h hVar = (i7.h) bVar;
                j7.r.c(hVar.C());
                new h(1);
                i7.l lVarA = hVar.A();
                j7.r.c(lVarA.D());
                j7.r.a(lVarA.B().size());
                i7.p pVarC = lVarA.C();
                if (pVarC.z() < 12 || pVarC.z() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                new e7.j();
                e7.j.i(hVar.B());
                return;
            case 1:
                i7.l lVar = (i7.l) bVar;
                j7.r.c(lVar.D());
                j7.r.a(lVar.B().size());
                i7.p pVarC2 = lVar.C();
                if (pVarC2.z() < 12 || pVarC2.z() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                return;
            case 2:
                i7.r rVar = (i7.r) bVar;
                j7.r.c(rVar.C());
                j7.r.a(rVar.A().size());
                if (rVar.B().z() != 12 && rVar.B().z() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                i7.x xVar = (i7.x) bVar;
                j7.r.c(xVar.A());
                j7.r.a(xVar.z().size());
                return;
            case 4:
                i7.b0 b0Var = (i7.b0) bVar;
                j7.r.c(b0Var.A());
                j7.r.a(b0Var.z().size());
                return;
            case 5:
                j0 j0Var = (j0) bVar;
                j7.r.c(j0Var.A());
                if (j0Var.z().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 6:
                j7.r.c(((o1) bVar).A());
                return;
            case 7:
                j7.r.c(((r1) bVar).A());
                return;
            case 8:
                w1 w1Var = (w1) bVar;
                j7.r.c(w1Var.A());
                if (w1Var.z().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                f0 f0Var = (f0) bVar;
                j7.r.c(f0Var.A());
                if (f0Var.z().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + f0Var.z().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
