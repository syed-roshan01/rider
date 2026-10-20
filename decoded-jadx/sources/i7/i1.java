package i7;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final i1 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.e0 key_ = com.google.crypto.tink.shaded.protobuf.h1.f3543d;
    private int primaryKeyId_;

    static {
        i1 i1Var = new i1();
        DEFAULT_INSTANCE = i1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(i1.class, i1Var);
    }

    public static f1 D() {
        return (f1) DEFAULT_INSTANCE.i();
    }

    public static i1 E(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.t tVar) throws com.google.crypto.tink.shaded.protobuf.h0 {
        com.google.crypto.tink.shaded.protobuf.o nVar;
        i1 i1Var = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = com.google.crypto.tink.shaded.protobuf.f0.f3535b;
            nVar = com.google.crypto.tink.shaded.protobuf.o.f(bArr, 0, bArr.length, false);
        } else {
            nVar = new com.google.crypto.tink.shaded.protobuf.n(inputStream);
        }
        com.google.crypto.tink.shaded.protobuf.b0 b0VarT = com.google.crypto.tink.shaded.protobuf.b0.t(i1Var, nVar, tVar);
        com.google.crypto.tink.shaded.protobuf.b0.f(b0VarT);
        return (i1) b0VarT;
    }

    public static i1 F(byte[] bArr, com.google.crypto.tink.shaded.protobuf.t tVar) {
        i1 i1Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        com.google.crypto.tink.shaded.protobuf.b0 b0VarR = i1Var.r();
        try {
            com.google.crypto.tink.shaded.protobuf.g1 g1Var = com.google.crypto.tink.shaded.protobuf.g1.f3539c;
            g1Var.getClass();
            com.google.crypto.tink.shaded.protobuf.j1 j1VarA = g1Var.a(b0VarR.getClass());
            j1VarA.h(b0VarR, bArr, 0, length, new com.google.crypto.tink.shaded.protobuf.e(tVar));
            j1VarA.b(b0VarR);
            com.google.crypto.tink.shaded.protobuf.b0.f(b0VarR);
            return (i1) b0VarR;
        } catch (com.google.crypto.tink.shaded.protobuf.h0 e4) {
            if (e4.f3542a) {
                throw new com.google.crypto.tink.shaded.protobuf.h0(e4.getMessage(), e4);
            }
            throw e4;
        } catch (com.google.crypto.tink.shaded.protobuf.n1 e10) {
            throw new com.google.crypto.tink.shaded.protobuf.h0(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof com.google.crypto.tink.shaded.protobuf.h0) {
                throw ((com.google.crypto.tink.shaded.protobuf.h0) e11.getCause());
            }
            throw new com.google.crypto.tink.shaded.protobuf.h0(e11.getMessage(), e11);
        } catch (IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.h0.g();
        }
    }

    public static void x(i1 i1Var, int i10) {
        i1Var.primaryKeyId_ = i10;
    }

    public static void y(i1 i1Var, h1 h1Var) {
        i1Var.getClass();
        com.google.crypto.tink.shaded.protobuf.e0 e0Var = i1Var.key_;
        if (!((com.google.crypto.tink.shaded.protobuf.c) e0Var).f3525a) {
            int size = e0Var.size();
            i1Var.key_ = e0Var.a(size == 0 ? 10 : size * 2);
        }
        i1Var.key_.add(h1Var);
    }

    public final int A() {
        return this.key_.size();
    }

    public final List B() {
        return this.key_;
    }

    public final int C() {
        return this.primaryKeyId_;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", h1.class});
            case 3:
                return new i1();
            case 4:
                return new f1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (i1.class) {
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

    public final h1 z(int i10) {
        return (h1) this.key_.get(i10);
    }
}
