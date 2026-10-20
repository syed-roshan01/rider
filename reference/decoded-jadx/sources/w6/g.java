package w6;

import i7.e0;
import i7.f0;
import i7.g0;
import i7.h0;
import i7.i0;
import i7.j0;
import i7.n1;
import i7.o0;
import i7.o1;
import i7.p1;
import i7.q1;
import i7.r0;
import i7.r1;
import i7.s0;
import i7.s1;
import i7.t0;
import i7.v0;
import i7.v1;
import i7.w1;
import i7.x0;
import i7.x1;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f4.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d7.f f16208c;

    public g(d7.f fVar, Class cls, int i10) {
        this.f16207b = i10;
        this.f16208c = fVar;
        this.f6226a = cls;
    }

    @Override // f4.y
    public final com.google.crypto.tink.shaded.protobuf.b0 b(com.google.crypto.tink.shaded.protobuf.b bVar) {
        int i10 = this.f16207b;
        d7.f fVar = this.f16208c;
        switch (i10) {
            case 0:
                i7.j jVar = (i7.j) bVar;
                i7.l lVar = (i7.l) new h(1).d().b(jVar.z());
                t0 t0Var = (t0) new e7.j().d().b(jVar.A());
                i7.g gVarD = i7.h.D();
                gVarD.d();
                i7.h.y((i7.h) gVarD.f3641b, lVar);
                gVarD.d();
                i7.h.z((i7.h) gVarD.f3641b, t0Var);
                ((h) fVar).getClass();
                gVarD.d();
                i7.h.x((i7.h) gVarD.f3641b);
                return (i7.h) gVarD.a();
            case 1:
                i7.n nVar = (i7.n) bVar;
                i7.k kVarE = i7.l.E();
                i7.p pVarB = nVar.B();
                kVarE.d();
                i7.l.y((i7.l) kVarE.f3641b, pVarB);
                byte[] bArrA = j7.q.a(nVar.A());
                com.google.crypto.tink.shaded.protobuf.k kVarI = com.google.crypto.tink.shaded.protobuf.l.i(bArrA, 0, bArrA.length);
                kVarE.d();
                i7.l.z((i7.l) kVarE.f3641b, kVarI);
                ((h) fVar).getClass();
                kVarE.d();
                i7.l.x((i7.l) kVarE.f3641b);
                return (i7.l) kVarE.a();
            case 2:
                i7.t tVar = (i7.t) bVar;
                i7.q qVarD = i7.r.D();
                byte[] bArrA2 = j7.q.a(tVar.z());
                com.google.crypto.tink.shaded.protobuf.k kVarI2 = com.google.crypto.tink.shaded.protobuf.l.i(bArrA2, 0, bArrA2.length);
                qVarD.d();
                i7.r.z((i7.r) qVarD.f3641b, kVarI2);
                i7.v vVarA = tVar.A();
                qVarD.d();
                i7.r.y((i7.r) qVarD.f3641b, vVarA);
                ((h) fVar).getClass();
                qVarD.d();
                i7.r.x((i7.r) qVarD.f3641b);
                return (i7.r) qVarD.a();
            case 3:
                i7.w wVarB = i7.x.B();
                byte[] bArrA3 = j7.q.a(((i7.z) bVar).y());
                com.google.crypto.tink.shaded.protobuf.k kVarI3 = com.google.crypto.tink.shaded.protobuf.l.i(bArrA3, 0, bArrA3.length);
                wVarB.d();
                i7.x.y((i7.x) wVarB.f3641b, kVarI3);
                ((h) fVar).getClass();
                wVarB.d();
                i7.x.x((i7.x) wVarB.f3641b);
                return (i7.x) wVarB.a();
            case 4:
                i7.a0 a0VarB = i7.b0.B();
                byte[] bArrA4 = j7.q.a(((i7.d0) bVar).y());
                com.google.crypto.tink.shaded.protobuf.k kVarI4 = com.google.crypto.tink.shaded.protobuf.l.i(bArrA4, 0, bArrA4.length);
                a0VarB.d();
                i7.b0.y((i7.b0) a0VarB.f3641b, kVarI4);
                ((h) fVar).getClass();
                a0VarB.d();
                i7.b0.x((i7.b0) a0VarB.f3641b);
                return (i7.b0) a0VarB.a();
            case 5:
                i0 i0VarB = j0.B();
                ((h) fVar).getClass();
                i0VarB.d();
                j0.x((j0) i0VarB.f3641b);
                byte[] bArrA5 = j7.q.a(32);
                com.google.crypto.tink.shaded.protobuf.k kVarI5 = com.google.crypto.tink.shaded.protobuf.l.i(bArrA5, 0, bArrA5.length);
                i0VarB.d();
                j0.y((j0) i0VarB.f3641b, kVarI5);
                return (j0) i0VarB.a();
            case 6:
                n1 n1VarB = o1.B();
                n1VarB.d();
                o1.y((o1) n1VarB.f3641b, (p1) bVar);
                ((h) fVar).getClass();
                n1VarB.d();
                o1.x((o1) n1VarB.f3641b);
                return (o1) n1VarB.a();
            case 7:
                q1 q1VarB = r1.B();
                q1VarB.d();
                r1.y((r1) q1VarB.f3641b, (s1) bVar);
                ((h) fVar).getClass();
                q1VarB.d();
                r1.x((r1) q1VarB.f3641b);
                return (r1) q1VarB.a();
            case 8:
                v1 v1VarB = w1.B();
                ((h) fVar).getClass();
                v1VarB.d();
                w1.x((w1) v1VarB.f3641b);
                byte[] bArrA6 = j7.q.a(32);
                com.google.crypto.tink.shaded.protobuf.k kVarI6 = com.google.crypto.tink.shaded.protobuf.l.i(bArrA6, 0, bArrA6.length);
                v1VarB.d();
                w1.y((w1) v1VarB.f3641b, kVarI6);
                return (w1) v1VarB.a();
            case 9:
                e0 e0VarB = f0.B();
                byte[] bArrA7 = j7.q.a(((h0) bVar).y());
                com.google.crypto.tink.shaded.protobuf.k kVarI7 = com.google.crypto.tink.shaded.protobuf.l.i(bArrA7, 0, bArrA7.length);
                e0VarB.d();
                f0.y((f0) e0VarB.f3641b, kVarI7);
                ((h) fVar).getClass();
                e0VarB.d();
                f0.x((f0) e0VarB.f3641b);
                return (f0) e0VarB.a();
            case 10:
                i7.d dVar = (i7.d) bVar;
                i7.a aVarD = i7.b.D();
                aVarD.d();
                i7.b.x((i7.b) aVarD.f3641b);
                byte[] bArrA8 = j7.q.a(dVar.z());
                com.google.crypto.tink.shaded.protobuf.k kVarI8 = com.google.crypto.tink.shaded.protobuf.l.i(bArrA8, 0, bArrA8.length);
                aVarD.d();
                i7.b.y((i7.b) aVarD.f3641b, kVarI8);
                i7.f fVarA = dVar.A();
                aVarD.d();
                i7.b.z((i7.b) aVarD.f3641b, fVarA);
                return (i7.b) aVarD.a();
            default:
                v0 v0Var = (v0) bVar;
                s0 s0VarE = t0.E();
                ((e7.j) fVar).getClass();
                s0VarE.d();
                t0.x((t0) s0VarE.f3641b);
                x0 x0VarB = v0Var.B();
                s0VarE.d();
                t0.y((t0) s0VarE.f3641b, x0VarB);
                byte[] bArrA9 = j7.q.a(v0Var.A());
                com.google.crypto.tink.shaded.protobuf.k kVarI9 = com.google.crypto.tink.shaded.protobuf.l.i(bArrA9, 0, bArrA9.length);
                s0VarE.d();
                t0.z((t0) s0VarE.f3641b, kVarI9);
                return (t0) s0VarE.a();
        }
    }

    @Override // f4.y
    public final com.google.crypto.tink.shaded.protobuf.b0 e(com.google.crypto.tink.shaded.protobuf.l lVar) {
        switch (this.f16207b) {
            case 0:
                return i7.j.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 1:
                return i7.n.D(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 2:
                return i7.t.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 3:
                return i7.z.A(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 4:
                return i7.d0.A(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 5:
                return o0.z(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 6:
                return p1.A(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 7:
                return s1.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 8:
                return x1.z(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 9:
                return h0.A(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            case 10:
                return i7.d.C(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
            default:
                return v0.D(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
        }
    }

    @Override // f4.y
    public final void g(com.google.crypto.tink.shaded.protobuf.b bVar) throws GeneralSecurityException {
        switch (this.f16207b) {
            case 0:
                i7.j jVar = (i7.j) bVar;
                new h(1).d().g(jVar.z());
                new e7.j().d().g(jVar.A());
                j7.r.a(jVar.z().A());
                return;
            case 1:
                i7.n nVar = (i7.n) bVar;
                j7.r.a(nVar.A());
                h hVar = (h) this.f16208c;
                i7.p pVarB = nVar.B();
                hVar.getClass();
                if (pVarB.z() < 12 || pVarB.z() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                return;
            case 2:
                i7.t tVar = (i7.t) bVar;
                j7.r.a(tVar.z());
                if (tVar.A().z() != 12 && tVar.A().z() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                j7.r.a(((i7.z) bVar).y());
                return;
            case 4:
                j7.r.a(((i7.d0) bVar).y());
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                s1 s1Var = (s1) bVar;
                if (s1Var.A().isEmpty() || !s1Var.B()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case 8:
                return;
            case 9:
                h0 h0Var = (h0) bVar;
                if (h0Var.y() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + h0Var.y() + ". Valid keys must have 64 bytes.");
            case 10:
                i7.d dVar = (i7.d) bVar;
                e7.b.h(dVar.A());
                if (dVar.z() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                return;
            default:
                v0 v0Var = (v0) bVar;
                if (v0Var.A() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                e7.j.j(v0Var.B());
                return;
        }
    }

    public final Map m() {
        r0 r0Var = r0.SHA256;
        switch (this.f16207b) {
            case 0:
                HashMap map = new HashMap();
                map.put("AES128_CTR_HMAC_SHA256", h.i(16, 16, 1));
                map.put("AES128_CTR_HMAC_SHA256_RAW", h.i(16, 16, 3));
                map.put("AES256_CTR_HMAC_SHA256", h.i(32, 32, 1));
                map.put("AES256_CTR_HMAC_SHA256_RAW", h.i(32, 32, 3));
                return Collections.unmodifiableMap(map);
            case 1:
            case 6:
            case 7:
            default:
                return Collections.emptyMap();
            case 2:
                HashMap map2 = new HashMap();
                map2.put("AES128_EAX", h.h(16, 1));
                map2.put("AES128_EAX_RAW", h.h(16, 3));
                map2.put("AES256_EAX", h.h(32, 1));
                map2.put("AES256_EAX_RAW", h.h(32, 3));
                return Collections.unmodifiableMap(map2);
            case 3:
                HashMap map3 = new HashMap();
                map3.put("AES128_GCM", h.j(16, 1));
                map3.put("AES128_GCM_RAW", h.j(16, 3));
                map3.put("AES256_GCM", h.j(32, 1));
                map3.put("AES256_GCM_RAW", h.j(32, 3));
                return Collections.unmodifiableMap(map3);
            case 4:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM_SIV", h.k(16, 1));
                map4.put("AES128_GCM_SIV_RAW", h.k(16, 3));
                map4.put("AES256_GCM_SIV", h.k(32, 1));
                map4.put("AES256_GCM_SIV_RAW", h.k(32, 3));
                return Collections.unmodifiableMap(map4);
            case 5:
                HashMap map5 = new HashMap();
                map5.put("CHACHA20_POLY1305", new d7.e(o0.y(), 1));
                map5.put("CHACHA20_POLY1305_RAW", new d7.e(o0.y(), 3));
                return Collections.unmodifiableMap(map5);
            case 8:
                HashMap map6 = new HashMap();
                map6.put("XCHACHA20_POLY1305", new d7.e(x1.y(), 1));
                map6.put("XCHACHA20_POLY1305_RAW", new d7.e(x1.y(), 3));
                return Collections.unmodifiableMap(map6);
            case 9:
                HashMap map7 = new HashMap();
                g0 g0VarZ = h0.z();
                g0VarZ.d();
                h0.x((h0) g0VarZ.f3641b);
                map7.put("AES256_SIV", new d7.e((h0) g0VarZ.a(), 1));
                g0 g0VarZ2 = h0.z();
                g0VarZ2.d();
                h0.x((h0) g0VarZ2.f3641b);
                map7.put("AES256_SIV_RAW", new d7.e((h0) g0VarZ2.a(), 3));
                return Collections.unmodifiableMap(map7);
            case 10:
                HashMap map8 = new HashMap();
                i7.c cVarB = i7.d.B();
                cVarB.d();
                i7.d.x((i7.d) cVarB.f3641b);
                i7.e eVarA = i7.f.A();
                eVarA.d();
                i7.f.x((i7.f) eVarA.f3641b);
                i7.f fVar = (i7.f) eVarA.a();
                cVarB.d();
                i7.d.y((i7.d) cVarB.f3641b, fVar);
                map8.put("AES_CMAC", new d7.e((i7.d) cVarB.a(), 1));
                i7.c cVarB2 = i7.d.B();
                cVarB2.d();
                i7.d.x((i7.d) cVarB2.f3641b);
                i7.e eVarA2 = i7.f.A();
                eVarA2.d();
                i7.f.x((i7.f) eVarA2.f3641b);
                i7.f fVar2 = (i7.f) eVarA2.a();
                cVarB2.d();
                i7.d.y((i7.d) cVarB2.f3641b, fVar2);
                map8.put("AES256_CMAC", new d7.e((i7.d) cVarB2.a(), 1));
                i7.c cVarB3 = i7.d.B();
                cVarB3.d();
                i7.d.x((i7.d) cVarB3.f3641b);
                i7.e eVarA3 = i7.f.A();
                eVarA3.d();
                i7.f.x((i7.f) eVarA3.f3641b);
                i7.f fVar3 = (i7.f) eVarA3.a();
                cVarB3.d();
                i7.d.y((i7.d) cVarB3.f3641b, fVar3);
                map8.put("AES256_CMAC_RAW", new d7.e((i7.d) cVarB3.a(), 3));
                return Collections.unmodifiableMap(map8);
            case 11:
                HashMap map9 = new HashMap();
                map9.put("HMAC_SHA256_128BITTAG", e7.j.h(32, 16, r0Var, 1));
                map9.put("HMAC_SHA256_128BITTAG_RAW", e7.j.h(32, 16, r0Var, 3));
                map9.put("HMAC_SHA256_256BITTAG", e7.j.h(32, 32, r0Var, 1));
                map9.put("HMAC_SHA256_256BITTAG_RAW", e7.j.h(32, 32, r0Var, 3));
                r0 r0Var2 = r0.SHA512;
                map9.put("HMAC_SHA512_128BITTAG", e7.j.h(64, 16, r0Var2, 1));
                map9.put("HMAC_SHA512_128BITTAG_RAW", e7.j.h(64, 16, r0Var2, 3));
                map9.put("HMAC_SHA512_256BITTAG", e7.j.h(64, 32, r0Var2, 1));
                map9.put("HMAC_SHA512_256BITTAG_RAW", e7.j.h(64, 32, r0Var2, 3));
                map9.put("HMAC_SHA512_512BITTAG", e7.j.h(64, 64, r0Var2, 1));
                map9.put("HMAC_SHA512_512BITTAG_RAW", e7.j.h(64, 64, r0Var2, 3));
                return Collections.unmodifiableMap(map9);
        }
    }
}
