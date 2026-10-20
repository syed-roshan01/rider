package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public abstract class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f3567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p1 f3568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f3569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p1 f3570d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f3567a = cls;
        f3568b = A(false);
        f3569c = A(true);
        f3570d = new p1();
    }

    public static p1 A(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (p1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
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
    public static void B(p1 p1Var, Object obj, Object obj2) {
        p1Var.getClass();
        b0 b0Var = (b0) obj;
        o1 o1Var = b0Var.unknownFields;
        o1 o1Var2 = ((b0) obj2).unknownFields;
        o1 o1Var3 = o1.f3602f;
        if (!o1Var3.equals(o1Var2)) {
            if (o1Var3.equals(o1Var)) {
                int i10 = o1Var.f3603a + o1Var2.f3603a;
                int[] iArrCopyOf = Arrays.copyOf(o1Var.f3604b, i10);
                System.arraycopy(o1Var2.f3604b, 0, iArrCopyOf, o1Var.f3603a, o1Var2.f3603a);
                Object[] objArrCopyOf = Arrays.copyOf(o1Var.f3605c, i10);
                System.arraycopy(o1Var2.f3605c, 0, objArrCopyOf, o1Var.f3603a, o1Var2.f3603a);
                o1Var = new o1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                o1Var.getClass();
                if (!o1Var2.equals(o1Var3)) {
                    if (!o1Var.f3607e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = o1Var.f3603a + o1Var2.f3603a;
                    o1Var.a(i11);
                    System.arraycopy(o1Var2.f3604b, 0, o1Var.f3604b, o1Var.f3603a, o1Var2.f3603a);
                    System.arraycopy(o1Var2.f3605c, 0, o1Var.f3605c, o1Var.f3603a, o1Var2.f3603a);
                    o1Var.f3603a = i11;
                }
            }
        }
        b0Var.unknownFields = o1Var;
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

    public static void K(int i10, List list, w4 w4Var, j1 j1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            w4Var.y(i10, j1Var, list.get(i11));
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

    public static void N(int i10, List list, w4 w4Var, j1 j1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            w4Var.G(i10, j1Var, list.get(i11));
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
        return p.r0(i10) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iI0 = p.I0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = ((l) list.get(i11)).size();
            iI0 += p.K0(size2) + size2;
        }
        return iI0;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.I0(i10) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c0)) {
            int iA0 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iA0 += p.A0(((Integer) list.get(i10)).intValue());
            }
            return iA0;
        }
        c0 c0Var = (c0) list;
        if (size <= 0) {
            return 0;
        }
        c0Var.k(0);
        c0Var.getClass();
        throw null;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return p.v0(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return p.w0(i10) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, j1 j1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iY0 += p.y0(i10, (b) list.get(i11), j1Var);
        }
        return iY0;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.I0(i10) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c0)) {
            int iA0 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iA0 += p.A0(((Integer) list.get(i10)).intValue());
            }
            return iA0;
        }
        c0 c0Var = (c0) list;
        if (size <= 0) {
            return 0;
        }
        c0Var.k(0);
        c0Var.getClass();
        throw null;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (p.I0(i10) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o0)) {
            int iM0 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iM0 += p.M0(((Long) list.get(i10)).longValue());
            }
            return iM0;
        }
        o0 o0Var = (o0) list;
        if (size <= 0) {
            return 0;
        }
        o0Var.k(0);
        o0Var.getClass();
        throw null;
    }

    public static int o(int i10, j1 j1Var, Object obj) {
        int iI0 = p.I0(i10);
        int iA = ((b) obj).a(j1Var);
        return p.K0(iA) + iA + iI0;
    }

    public static int p(int i10, List list, j1 j1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iI0 = p.I0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int iA = ((b) list.get(i11)).a(j1Var);
            iI0 += p.K0(iA) + iA;
        }
        return iI0;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.I0(i10) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            if (size <= 0) {
                return 0;
            }
            c0Var.k(0);
            c0Var.getClass();
            throw null;
        }
        int iK0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iK0 += p.K0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iK0;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.I0(i10) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0) {
            o0 o0Var = (o0) list;
            if (size <= 0) {
                return 0;
            }
            o0Var.k(0);
            o0Var.getClass();
            throw null;
        }
        int iM0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iM0 += p.M0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM0;
    }

    public static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iI0 = p.I0(i10) * size;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            while (i11 < size) {
                Object objC = k0Var.c(i11);
                if (objC instanceof l) {
                    int size2 = ((l) objC).size();
                    iI0 = p.K0(size2) + size2 + iI0;
                } else {
                    iI0 = p.H0((String) objC) + iI0;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof l) {
                    int size3 = ((l) obj).size();
                    iI0 = p.K0(size3) + size3 + iI0;
                } else {
                    iI0 = p.H0((String) obj) + iI0;
                }
                i11++;
            }
        }
        return iI0;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.I0(i10) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c0)) {
            int iK0 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iK0 += p.K0(((Integer) list.get(i10)).intValue());
            }
            return iK0;
        }
        c0 c0Var = (c0) list;
        if (size <= 0) {
            return 0;
        }
        c0Var.k(0);
        c0Var.getClass();
        throw null;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.I0(i10) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o0)) {
            int iM0 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iM0 += p.M0(((Long) list.get(i10)).longValue());
            }
            return iM0;
        }
        o0 o0Var = (o0) list;
        if (size <= 0) {
            return 0;
        }
        o0Var.k(0);
        o0Var.getClass();
        throw null;
    }

    public static Object z(Object obj, int i10, List list, Object obj2, p1 p1Var) {
        return obj2;
    }
}
