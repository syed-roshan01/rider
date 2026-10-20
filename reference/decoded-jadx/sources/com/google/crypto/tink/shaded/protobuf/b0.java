package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, b0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected o1 unknownFields;

    public b0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = o1.f3602f;
    }

    public static void f(b0 b0Var) throws h0 {
        if (!n(b0Var, true)) {
            throw new h0(new n1().getMessage());
        }
    }

    public static b0 k(Class cls) {
        b0 defaultInstanceForType = defaultInstanceMap.get(cls);
        if (defaultInstanceForType == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                defaultInstanceForType = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (defaultInstanceForType == null) {
            defaultInstanceForType = ((b0) w1.b(cls)).getDefaultInstanceForType();
            if (defaultInstanceForType == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, defaultInstanceForType);
        }
        return defaultInstanceForType;
    }

    public static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean n(b0 b0Var, boolean z10) {
        byte bByteValue = ((Byte) b0Var.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        g1 g1Var = g1.f3539c;
        g1Var.getClass();
        boolean zC = g1Var.a(b0Var.getClass()).c(b0Var);
        if (z10) {
            b0Var.j(2);
        }
        return zC;
    }

    public static b0 s(b0 b0Var, l lVar, t tVar) throws h0 {
        k kVar = (k) lVar;
        m mVarF = o.f(kVar.f3566d, kVar.p(), kVar.size(), true);
        b0 b0VarT = t(b0Var, mVarF, tVar);
        mVarF.a(0);
        f(b0VarT);
        return b0VarT;
    }

    public static b0 t(b0 b0Var, o oVar, t tVar) throws h0 {
        b0 b0VarR = b0Var.r();
        try {
            g1 g1Var = g1.f3539c;
            g1Var.getClass();
            j1 j1VarA = g1Var.a(b0VarR.getClass());
            g2.m mVar = oVar.f3601d;
            if (mVar == null) {
                mVar = new g2.m(oVar);
            }
            j1VarA.j(b0VarR, mVar, tVar);
            j1VarA.b(b0VarR);
            return b0VarR;
        } catch (h0 e4) {
            if (e4.f3542a) {
                throw new h0(e4.getMessage(), e4);
            }
            throw e4;
        } catch (n1 e10) {
            throw new h0(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof h0) {
                throw ((h0) e11.getCause());
            }
            throw new h0(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof h0) {
                throw ((h0) e12.getCause());
            }
            throw e12;
        }
    }

    public static void u(Class cls, b0 b0Var) {
        b0Var.p();
        defaultInstanceMap.put(cls, b0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b
    public final int a(j1 j1Var) {
        int iE;
        int iE2;
        if (o()) {
            if (j1Var == null) {
                g1 g1Var = g1.f3539c;
                g1Var.getClass();
                iE2 = g1Var.a(getClass()).e(this);
            } else {
                iE2 = j1Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(l.q.g("serialized size must be non-negative, was ", iE2));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (j1Var == null) {
            g1 g1Var2 = g1.f3539c;
            g1Var2.getClass();
            iE = g1Var2.a(getClass()).e(this);
        } else {
            iE = j1Var.e(this);
        }
        v(iE);
        return iE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b
    public final void e(p pVar) {
        g1 g1Var = g1.f3539c;
        g1Var.getClass();
        j1 j1VarA = g1Var.a(getClass());
        w4 w4Var = pVar.f3608z;
        if (w4Var == null) {
            w4Var = new w4(pVar);
        }
        j1VarA.i(this, w4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g1 g1Var = g1.f3539c;
        g1Var.getClass();
        return g1Var.a(getClass()).d(this, (b0) obj);
    }

    public final void g() {
        this.memoizedHashCode = 0;
    }

    public final void h() {
        v(Integer.MAX_VALUE);
    }

    public final int hashCode() {
        if (o()) {
            g1 g1Var = g1.f3539c;
            g1Var.getClass();
            return g1Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            g1 g1Var2 = g1.f3539c;
            g1Var2.getClass();
            this.memoizedHashCode = g1Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final z i() {
        return (z) j(5);
    }

    public abstract Object j(int i10);

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final b0 getDefaultInstanceForType() {
        return (b0) j(6);
    }

    public final boolean o() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void p() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final z c() {
        return (z) j(5);
    }

    public final b0 r() {
        return (b0) j(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = z0.f3642a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        z0.c(this, sb, 0);
        return sb.toString();
    }

    public final void v(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(l.q.g("serialized size must be non-negative, was ", i10));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final z w() {
        z zVar = (z) j(5);
        zVar.e(this);
        return zVar;
    }
}
