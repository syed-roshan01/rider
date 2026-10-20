package e7;

import i7.z0;
import java.security.GeneralSecurityException;
import w6.t;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d7.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d7.n f5153d = new d7.n(new t(12), a.class);

    public static void h(i7.f fVar) {
        if (fVar.z() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (fVar.z() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // d7.f
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // d7.f
    public final w6.g d() {
        return new w6.g(this, i7.d.class, 10);
    }

    @Override // d7.f
    public final z0 e() {
        return z0.SYMMETRIC;
    }

    @Override // d7.f
    public final com.google.crypto.tink.shaded.protobuf.b f(com.google.crypto.tink.shaded.protobuf.l lVar) {
        return i7.b.E(lVar, com.google.crypto.tink.shaded.protobuf.t.a());
    }

    @Override // d7.f
    public final void g(com.google.crypto.tink.shaded.protobuf.b bVar) throws GeneralSecurityException {
        i7.b bVar2 = (i7.b) bVar;
        j7.r.c(bVar2.C());
        if (bVar2.A().size() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        h(bVar2.B());
    }
}
