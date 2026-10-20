package com.google.protobuf;

import java.util.List;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public abstract class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f4153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t2 f4154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2 f4155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t2 f4156d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f4153a = cls;
        f4154b = A(false);
        f4155c = A(true);
        f4156d = new t2();
    }

    public static t2 A(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (t2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
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
    public static void B(t2 t2Var, Object obj, Object obj2) {
        t2Var.getClass();
        l0 l0Var = (l0) obj;
        s2 s2VarE = l0Var.unknownFields;
        s2 s2Var = ((l0) obj2).unknownFields;
        s2 s2Var2 = s2.f4234f;
        if (!s2Var2.equals(s2Var)) {
            if (s2Var2.equals(s2VarE)) {
                s2VarE = s2.e(s2VarE, s2Var);
            } else {
                s2VarE.getClass();
                if (!s2Var.equals(s2Var2)) {
                    s2VarE.a();
                    int i10 = s2VarE.f4235a + s2Var.f4235a;
                    s2VarE.b(i10);
                    System.arraycopy(s2Var.f4236b, 0, s2VarE.f4236b, s2VarE.f4235a, s2Var.f4235a);
                    System.arraycopy(s2Var.f4237c, 0, s2VarE.f4237c, s2VarE.f4235a, s2Var.f4235a);
                    s2VarE.f4235a = i10;
                }
            }
        }
        l0Var.unknownFields = s2VarE;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.k(i10, list, z10);
    }

    public static void E(int i10, List list, w4 w4Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.n(i10, list);
    }

    public static void F(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.p(i10, list, z10);
    }

    public static void G(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.r(i10, list, z10);
    }

    public static void H(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.t(i10, list, z10);
    }

    public static void I(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.v(i10, list, z10);
    }

    public static void J(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.x(i10, list, z10);
    }

    public static void K(int i10, List list, w4 w4Var, i2 i2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            w4Var.z(i10, i2Var, list.get(i11));
        }
    }

    public static void L(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.C(i10, list, z10);
    }

    public static void M(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.E(i10, list, z10);
    }

    public static void N(int i10, List list, w4 w4Var, i2 i2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            w4Var.H(i10, i2Var, list.get(i11));
        }
    }

    public static void O(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.J(i10, list, z10);
    }

    public static void P(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.L(i10, list, z10);
    }

    public static void Q(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.N(i10, list, z10);
    }

    public static void R(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.P(i10, list, z10);
    }

    public static void S(int i10, List list, w4 w4Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.R(i10, list);
    }

    public static void T(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.T(i10, list, z10);
    }

    public static void U(int i10, List list, w4 w4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.V(i10, list, z10);
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v.T(i10) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = v.k0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = ((n) list.get(i11)).size();
            iK0 += v.m0(size2) + size2;
        }
        return iK0;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v.k0(i10) * size) + e(list);
    }

    public static int e(List list) {
        int iC0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p0) {
            p0 p0Var = (p0) list;
            iC0 = 0;
            while (i10 < size) {
                p0Var.k(i10);
                iC0 += v.c0(p0Var.f4210b[i10]);
                i10++;
            }
        } else {
            iC0 = 0;
            while (i10 < size) {
                iC0 += v.c0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iC0;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v.X(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v.Y(i10) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, i2 i2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iA0 += v.a0(i10, (t1) list.get(i11), i2Var);
        }
        return iA0;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v.k0(i10) * size) + l(list);
    }

    public static int l(List list) {
        int iC0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p0) {
            p0 p0Var = (p0) list;
            iC0 = 0;
            while (i10 < size) {
                p0Var.k(i10);
                iC0 += v.c0(p0Var.f4210b[i10]);
                i10++;
            }
        } else {
            iC0 = 0;
            while (i10 < size) {
                iC0 += v.c0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iC0;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (v.k0(i10) * list.size()) + n(list);
    }

    public static int n(List list) {
        int iO0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i1) {
            i1 i1Var = (i1) list;
            iO0 = 0;
            while (i10 < size) {
                i1Var.k(i10);
                iO0 += v.o0(i1Var.f4138b[i10]);
                i10++;
            }
        } else {
            iO0 = 0;
            while (i10 < size) {
                iO0 += v.o0(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iO0;
    }

    public static int o(int i10, i2 i2Var, Object obj) {
        int iK0 = v.k0(i10);
        int serializedSize = ((c) ((t1) obj)).getSerializedSize(i2Var);
        return v.m0(serializedSize) + serializedSize + iK0;
    }

    public static int p(int i10, List list, i2 i2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = v.k0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int serializedSize = ((c) ((t1) list.get(i11))).getSerializedSize(i2Var);
            iK0 += v.m0(serializedSize) + serializedSize;
        }
        return iK0;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v.k0(i10) * size) + r(list);
    }

    public static int r(List list) {
        int iM0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p0) {
            p0 p0Var = (p0) list;
            iM0 = 0;
            while (i10 < size) {
                p0Var.k(i10);
                int i11 = p0Var.f4210b[i10];
                iM0 += v.m0((i11 >> 31) ^ (i11 << 1));
                i10++;
            }
        } else {
            iM0 = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iM0 += v.m0((iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
        }
        return iM0;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v.k0(i10) * size) + t(list);
    }

    public static int t(List list) {
        int iO0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i1) {
            i1 i1Var = (i1) list;
            iO0 = 0;
            while (i10 < size) {
                i1Var.k(i10);
                long j10 = i1Var.f4138b[i10];
                iO0 += v.o0((j10 >> 63) ^ (j10 << 1));
                i10++;
            }
        } else {
            iO0 = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iO0 += v.o0((jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
        }
        return iO0;
    }

    public static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iK0 = v.k0(i10) * size;
        if (list instanceof e1) {
            e1 e1Var = (e1) list;
            while (i11 < size) {
                Object objC = e1Var.c(i11);
                if (objC instanceof n) {
                    int size2 = ((n) objC).size();
                    iK0 = v.m0(size2) + size2 + iK0;
                } else {
                    iK0 = v.j0((String) objC) + iK0;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof n) {
                    int size3 = ((n) obj).size();
                    iK0 = v.m0(size3) + size3 + iK0;
                } else {
                    iK0 = v.j0((String) obj) + iK0;
                }
                i11++;
            }
        }
        return iK0;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v.k0(i10) * size) + w(list);
    }

    public static int w(List list) {
        int iM0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p0) {
            p0 p0Var = (p0) list;
            iM0 = 0;
            while (i10 < size) {
                p0Var.k(i10);
                iM0 += v.m0(p0Var.f4210b[i10]);
                i10++;
            }
        } else {
            iM0 = 0;
            while (i10 < size) {
                iM0 += v.m0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM0;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v.k0(i10) * size) + y(list);
    }

    public static int y(List list) {
        int iO0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i1) {
            i1 i1Var = (i1) list;
            iO0 = 0;
            while (i10 < size) {
                i1Var.k(i10);
                iO0 += v.o0(i1Var.f4138b[i10]);
                i10++;
            }
        } else {
            iO0 = 0;
            while (i10 < size) {
                iO0 += v.o0(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iO0;
    }

    public static Object z(Object obj, int i10, List list, Object obj2, t2 t2Var) {
        return obj2;
    }
}
