package w6;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class v extends b {
    public static v b(w wVar, w4 w4Var, Integer num) throws GeneralSecurityException {
        w wVar2 = w.f16247d;
        if (wVar != wVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + wVar + " the value of idRequirement must be non-null");
        }
        if (wVar == wVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (w4Var.i() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + w4Var.i());
        }
        if (wVar == wVar2) {
            k7.a.a(new byte[0]);
        } else if (wVar == w.f16246c) {
            k7.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (wVar != w.f16245b) {
                throw new IllegalStateException("Unknown Variant: " + wVar);
            }
            k7.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new v();
    }
}
