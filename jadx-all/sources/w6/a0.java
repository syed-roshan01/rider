package w6;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b {
    public static a0 b(b0 b0Var, w4 w4Var, Integer num) throws GeneralSecurityException {
        b0 b0Var2 = b0.f16195d;
        if (b0Var != b0Var2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + b0Var + " the value of idRequirement must be non-null");
        }
        if (b0Var == b0Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (w4Var.i() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + w4Var.i());
        }
        if (b0Var == b0Var2) {
            k7.a.a(new byte[0]);
        } else if (b0Var == b0.f16194c) {
            k7.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (b0Var != b0.f16193b) {
                throw new IllegalStateException("Unknown Variant: " + b0Var);
            }
            k7.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new a0();
    }
}
