package i7;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final q0 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER;
    private com.google.crypto.tink.shaded.protobuf.l encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.l.f3571b;
    private m1 keysetInfo_;

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(q0.class, q0Var);
    }

    public static p0 A() {
        return (p0) DEFAULT_INSTANCE.i();
    }

    public static q0 B(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.t tVar) throws com.google.crypto.tink.shaded.protobuf.h0 {
        com.google.crypto.tink.shaded.protobuf.o nVar;
        q0 q0Var = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = com.google.crypto.tink.shaded.protobuf.f0.f3535b;
            nVar = com.google.crypto.tink.shaded.protobuf.o.f(bArr, 0, bArr.length, false);
        } else {
            nVar = new com.google.crypto.tink.shaded.protobuf.n(inputStream);
        }
        com.google.crypto.tink.shaded.protobuf.b0 b0VarT = com.google.crypto.tink.shaded.protobuf.b0.t(q0Var, nVar, tVar);
        com.google.crypto.tink.shaded.protobuf.b0.f(b0VarT);
        return (q0) b0VarT;
    }

    public static void x(q0 q0Var, com.google.crypto.tink.shaded.protobuf.k kVar) {
        q0Var.getClass();
        q0Var.encryptedKeyset_ = kVar;
    }

    public static void y(q0 q0Var, m1 m1Var) {
        q0Var.getClass();
        q0Var.keysetInfo_ = m1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object j(int i10) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new q0();
            case 4:
                return new p0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (q0.class) {
                        try {
                            a0Var = PARSER;
                            if (a0Var == null) {
                                a0Var = new com.google.crypto.tink.shaded.protobuf.a0();
                                PARSER = a0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return a0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final com.google.crypto.tink.shaded.protobuf.l z() {
        return this.encryptedKeyset_;
    }
}
