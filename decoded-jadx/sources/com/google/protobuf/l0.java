package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends c {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, l0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected s2 unknownFields;

    public l0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = s2.f4234f;
    }

    public static j0 access$000(x xVar) {
        xVar.getClass();
        return (j0) xVar;
    }

    public static void c(l0 l0Var) throws a1 {
        if (l0Var == null || l0Var.isInitialized()) {
            return;
        }
        r2 r2VarNewUninitializedMessageException = l0Var.newUninitializedMessageException();
        r2VarNewUninitializedMessageException.getClass();
        throw new a1(r2VarNewUninitializedMessageException.getMessage());
    }

    public static l0 d(l0 l0Var, InputStream inputStream, z zVar) throws a1 {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            s sVarG = s.g(new a(inputStream, s.t(inputStream, i10)));
            l0 partialFrom = parsePartialFrom(l0Var, sVarG, zVar);
            sVarG.a(0);
            return partialFrom;
        } catch (a1 e4) {
            if (e4.f4055a) {
                throw new a1(e4.getMessage(), e4);
            }
            throw e4;
        } catch (IOException e10) {
            throw new a1(e10.getMessage(), e10);
        }
    }

    public static l0 e(l0 l0Var, byte[] bArr, int i10, int i11, z zVar) throws a1 {
        l0 l0VarNewMutableInstance = l0Var.newMutableInstance();
        try {
            i2 i2VarB = d2.f4094c.b(l0VarNewMutableInstance);
            i2VarB.i(l0VarNewMutableInstance, bArr, i10, i10 + i11, new com.google.crypto.tink.shaded.protobuf.e(zVar));
            i2VarB.b(l0VarNewMutableInstance);
            return l0VarNewMutableInstance;
        } catch (a1 e4) {
            if (e4.f4055a) {
                throw new a1(e4.getMessage(), e4);
            }
            throw e4;
        } catch (r2 e10) {
            throw new a1(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof a1) {
                throw ((a1) e11.getCause());
            }
            throw new a1(e11.getMessage(), e11);
        } catch (IndexOutOfBoundsException unused) {
            throw a1.h();
        }
    }

    public static q0 emptyBooleanList() {
        return g.f4111d;
    }

    public static r0 emptyDoubleList() {
        return w.f4252d;
    }

    public static u0 emptyFloatList() {
        return e0.f4099d;
    }

    public static v0 emptyIntList() {
        return p0.f4209d;
    }

    public static w0 emptyLongList() {
        return i1.f4137d;
    }

    public static <E> x0 emptyProtobufList() {
        return e2.f4102d;
    }

    public static <T extends l0> T getDefaultInstance(Class<T> cls) {
        l0 l0Var = defaultInstanceMap.get(cls);
        if (l0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (l0Var == null) {
            l0Var = (T) ((l0) z2.b(cls)).getDefaultInstanceForType();
            if (l0Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, l0Var);
        }
        return (T) l0Var;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e4);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    public static v0 mutableCopy(v0 v0Var) {
        int size = v0Var.size();
        int i10 = size == 0 ? 10 : size * 2;
        p0 p0Var = (p0) v0Var;
        if (i10 >= p0Var.f4211c) {
            return new p0(Arrays.copyOf(p0Var.f4210b, i10), p0Var.f4211c);
        }
        throw new IllegalArgumentException();
    }

    public static Object newMessageInfo(t1 t1Var, String str, Object[] objArr) {
        return new f2(t1Var, str, objArr);
    }

    public static <ContainingType extends t1, Type> j0 newRepeatedGeneratedExtension(ContainingType containingtype, t1 t1Var, t0 t0Var, int i10, h3 h3Var, boolean z10, Class cls) {
        return new j0(containingtype, Collections.emptyList(), t1Var, new i0(t0Var, i10, h3Var, true, z10));
    }

    public static <ContainingType extends t1, Type> j0 newSingularGeneratedExtension(ContainingType containingtype, Type type, t1 t1Var, t0 t0Var, int i10, h3 h3Var, Class cls) {
        return new j0(containingtype, type, t1Var, new i0(t0Var, i10, h3Var, false, false));
    }

    public static <T extends l0> T parseDelimitedFrom(T t10, InputStream inputStream) throws a1 {
        T t11 = (T) d(t10, inputStream, z.a());
        c(t11);
        return t11;
    }

    public static <T extends l0> T parseFrom(T t10, ByteBuffer byteBuffer, z zVar) throws a1 {
        T t11 = (T) parseFrom(t10, s.h(byteBuffer, false), zVar);
        c(t11);
        return t11;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static <T extends l0> T parsePartialFrom(T t10, s sVar, z zVar) throws a1 {
        T t11 = (T) t10.newMutableInstance();
        try {
            i2 i2VarB = d2.f4094c.b(t11);
            g2.m mVar = sVar.f4233d;
            if (mVar == null) {
                mVar = new g2.m(sVar);
            }
            i2VarB.h(t11, mVar, zVar);
            i2VarB.b(t11);
            return t11;
        } catch (a1 e4) {
            if (e4.f4055a) {
                throw new a1(e4.getMessage(), e4);
            }
            throw e4;
        } catch (r2 e10) {
            throw new a1(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof a1) {
                throw ((a1) e11.getCause());
            }
            throw new a1(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof a1) {
                throw ((a1) e12.getCause());
            }
            throw e12;
        }
    }

    public static <T extends l0> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(k0.f4161c);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        d2 d2Var = d2.f4094c;
        d2Var.getClass();
        return d2Var.a(getClass()).g(this);
    }

    public final <MessageType extends l0, BuilderType extends g0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(k0.f4163e);
    }

    public Object dynamicMethod(k0 k0Var, Object obj) {
        return dynamicMethod(k0Var, obj, null);
    }

    public abstract Object dynamicMethod(k0 k0Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d2 d2Var = d2.f4094c;
        d2Var.getClass();
        return d2Var.a(getClass()).d(this, (l0) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.t1
    public final b2 getParserForType() {
        return (b2) dynamicMethod(k0.f4165n);
    }

    @Override // com.google.protobuf.c
    public int getSerializedSize(i2 i2Var) {
        int iE;
        int iE2;
        if (isMutable()) {
            if (i2Var == null) {
                d2 d2Var = d2.f4094c;
                d2Var.getClass();
                iE2 = d2Var.a(getClass()).e(this);
            } else {
                iE2 = i2Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(l.q.g("serialized size must be non-negative, was ", iE2));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (i2Var == null) {
            d2 d2Var2 = d2.f4094c;
            d2Var2.getClass();
            iE = d2Var2.a(getClass()).e(this);
        } else {
            iE = i2Var.e(this);
        }
        setMemoizedSerializedSize(iE);
        return iE;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.u1
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        d2 d2Var = d2.f4094c;
        d2Var.getClass();
        d2Var.a(getClass()).b(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i10, n nVar) {
        if (this.unknownFields == s2.f4234f) {
            this.unknownFields = new s2();
        }
        s2 s2Var = this.unknownFields;
        s2Var.a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        s2Var.f((i10 << 3) | 2, nVar);
    }

    public final void mergeUnknownFields(s2 s2Var) {
        this.unknownFields = s2.e(this.unknownFields, s2Var);
    }

    public void mergeVarintField(int i10, int i11) {
        if (this.unknownFields == s2.f4234f) {
            this.unknownFields = new s2();
        }
        s2 s2Var = this.unknownFields;
        s2Var.a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        s2Var.f(i10 << 3, Long.valueOf(i11));
    }

    public l0 newMutableInstance() {
        return (l0) dynamicMethod(k0.f4162d);
    }

    public boolean parseUnknownField(int i10, s sVar) {
        if ((i10 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == s2.f4234f) {
            this.unknownFields = new s2();
        }
        return this.unknownFields.d(i10, sVar);
    }

    public void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    public void setMemoizedSerializedSize(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(l.q.g("serialized size must be non-negative, was ", i10));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = v1.f4251a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        v1.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.protobuf.t1
    public void writeTo(v vVar) {
        d2 d2Var = d2.f4094c;
        d2Var.getClass();
        i2 i2VarA = d2Var.a(getClass());
        w4 w4Var = vVar.f4250c;
        if (w4Var == null) {
            w4Var = new w4(vVar);
        }
        i2VarA.j(this, w4Var);
    }

    public static final <T extends l0> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(k0.f4159a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        d2 d2Var = d2.f4094c;
        d2Var.getClass();
        boolean zC = d2Var.a(t10.getClass()).c(t10);
        if (z10) {
            t10.dynamicMethod(k0.f4160b, zC ? t10 : null);
        }
        return zC;
    }

    public final <MessageType extends l0, BuilderType extends g0> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((l0) messagetype);
    }

    public Object dynamicMethod(k0 k0Var) {
        return dynamicMethod(k0Var, null, null);
    }

    @Override // com.google.protobuf.u1
    public final l0 getDefaultInstanceForType() {
        return (l0) dynamicMethod(k0.f4164f);
    }

    @Override // com.google.protobuf.t1
    public final g0 newBuilderForType() {
        return (g0) dynamicMethod(k0.f4163e);
    }

    /* JADX INFO: renamed from: toBuilder, reason: merged with bridge method [inline-methods] */
    public final g0 m4005toBuilder() {
        return ((g0) dynamicMethod(k0.f4163e)).mergeFrom(this);
    }

    public static <T extends l0> T parseDelimitedFrom(T t10, InputStream inputStream, z zVar) throws a1 {
        T t11 = (T) d(t10, inputStream, zVar);
        c(t11);
        return t11;
    }

    public static <T extends l0> T parseFrom(T t10, ByteBuffer byteBuffer) {
        return (T) parseFrom(t10, byteBuffer, z.a());
    }

    public static w0 mutableCopy(w0 w0Var) {
        int size = w0Var.size();
        int i10 = size == 0 ? 10 : size * 2;
        i1 i1Var = (i1) w0Var;
        if (i10 >= i1Var.f4139c) {
            return new i1(Arrays.copyOf(i1Var.f4138b, i10), i1Var.f4139c);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends l0> T parseFrom(T t10, n nVar) throws a1 {
        T t11 = (T) parseFrom(t10, nVar, z.a());
        c(t11);
        return t11;
    }

    public static <T extends l0> T parseFrom(T t10, n nVar, z zVar) throws a1 {
        s sVarV = nVar.v();
        T t11 = (T) parsePartialFrom(t10, sVarV, zVar);
        sVarV.a(0);
        c(t11);
        return t11;
    }

    public static u0 mutableCopy(u0 u0Var) {
        int size = u0Var.size();
        int i10 = size == 0 ? 10 : size * 2;
        e0 e0Var = (e0) u0Var;
        if (i10 >= e0Var.f4101c) {
            return new e0(e0Var.f4101c, Arrays.copyOf(e0Var.f4100b, i10));
        }
        throw new IllegalArgumentException();
    }

    public static <T extends l0> T parseFrom(T t10, byte[] bArr) throws a1 {
        T t11 = (T) e(t10, bArr, 0, bArr.length, z.a());
        c(t11);
        return t11;
    }

    public static r0 mutableCopy(r0 r0Var) {
        int size = r0Var.size();
        int i10 = size == 0 ? 10 : size * 2;
        w wVar = (w) r0Var;
        if (i10 >= wVar.f4254c) {
            return new w(Arrays.copyOf(wVar.f4253b, i10), wVar.f4254c);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends l0> T parseFrom(T t10, byte[] bArr, z zVar) throws a1 {
        T t11 = (T) e(t10, bArr, 0, bArr.length, zVar);
        c(t11);
        return t11;
    }

    public static q0 mutableCopy(q0 q0Var) {
        int size = q0Var.size();
        int i10 = size == 0 ? 10 : size * 2;
        g gVar = (g) q0Var;
        if (i10 >= gVar.f4113c) {
            return new g(Arrays.copyOf(gVar.f4112b, i10), gVar.f4113c);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends l0> T parseFrom(T t10, InputStream inputStream) throws a1 {
        T t11 = (T) parsePartialFrom(t10, s.g(inputStream), z.a());
        c(t11);
        return t11;
    }

    public static <E> x0 mutableCopy(x0 x0Var) {
        int size = x0Var.size();
        return x0Var.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends l0> T parseFrom(T t10, InputStream inputStream, z zVar) throws a1 {
        T t11 = (T) parsePartialFrom(t10, s.g(inputStream), zVar);
        c(t11);
        return t11;
    }

    public static <T extends l0> T parsePartialFrom(T t10, s sVar) {
        return (T) parsePartialFrom(t10, sVar, z.a());
    }

    @Override // com.google.protobuf.t1
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends l0> T parseFrom(T t10, s sVar) {
        return (T) parseFrom(t10, sVar, z.a());
    }

    public static <T extends l0> T parseFrom(T t10, s sVar, z zVar) throws a1 {
        T t11 = (T) parsePartialFrom(t10, sVar, zVar);
        c(t11);
        return t11;
    }
}
