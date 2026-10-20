package com.google.protobuf;

import com.google.firebase.remoteconfig.internal.Code;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2 f4072a = new k2(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4073b;

    static {
        new c0(0);
    }

    public c0() {
    }

    public static int a(h3 h3Var, int i10, Object obj) {
        int iK0 = v.k0(i10);
        if (h3Var == h3.f4129d) {
            iK0 *= 2;
        }
        return b(h3Var, obj) + iK0;
    }

    public static int b(h3 h3Var, Object obj) {
        switch (h3Var.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = v.f4248d;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = v.f4248d;
                return 4;
            case 2:
                return v.o0(((Long) obj).longValue());
            case 3:
                return v.o0(((Long) obj).longValue());
            case 4:
                return v.c0(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = v.f4248d;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = v.f4248d;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = v.f4248d;
                return 1;
            case 8:
                if (!(obj instanceof n)) {
                    return v.j0((String) obj);
                }
                Logger logger6 = v.f4248d;
                int size = ((n) obj).size();
                return v.m0(size) + size;
            case 9:
                Logger logger7 = v.f4248d;
                return ((t1) obj).getSerializedSize();
            case 10:
                Logger logger8 = v.f4248d;
                int serializedSize = ((t1) obj).getSerializedSize();
                return v.m0(serializedSize) + serializedSize;
            case 11:
                if (obj instanceof n) {
                    Logger logger9 = v.f4248d;
                    int size2 = ((n) obj).size();
                    return v.m0(size2) + size2;
                }
                Logger logger10 = v.f4248d;
                int length = ((byte[]) obj).length;
                return v.m0(length) + length;
            case 12:
                return v.m0(((Integer) obj).intValue());
            case 13:
                return obj instanceof s0 ? v.c0(((s0) obj).getNumber()) : v.c0(((Integer) obj).intValue());
            case Code.UNAVAILABLE /* 14 */:
                ((Integer) obj).intValue();
                Logger logger11 = v.f4248d;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = v.f4248d;
                return 8;
            case Code.UNAUTHENTICATED /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                return v.m0((iIntValue >> 31) ^ (iIntValue << 1));
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                return v.o0((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public static void e(i0 i0Var, Object obj) {
        boolean z10;
        h3 h3Var = i0Var.f4135b;
        Charset charset = y0.f4276a;
        obj.getClass();
        switch (h3Var.f4132a) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof n) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof s0)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
            case MESSAGE:
                z10 = obj instanceof t1;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i0Var.f4134a), i0Var.f4135b.f4132a, obj.getClass().getName()));
        }
    }

    public static void f(v vVar, h3 h3Var, int i10, Object obj) {
        if (h3Var == h3.f4129d) {
            vVar.G0(i10, 3);
            ((t1) obj).writeTo(vVar);
            vVar.G0(i10, 4);
            return;
        }
        vVar.G0(i10, h3Var.f4133b);
        switch (h3Var.ordinal()) {
            case 0:
                vVar.z0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                vVar.x0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                vVar.K0(((Long) obj).longValue());
                break;
            case 3:
                vVar.K0(((Long) obj).longValue());
                break;
            case 4:
                vVar.B0(((Integer) obj).intValue());
                break;
            case 5:
                vVar.z0(((Long) obj).longValue());
                break;
            case 6:
                vVar.x0(((Integer) obj).intValue());
                break;
            case 7:
                vVar.r0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof n)) {
                    vVar.F0((String) obj);
                } else {
                    vVar.v0((n) obj);
                }
                break;
            case 9:
                ((t1) obj).writeTo(vVar);
                break;
            case 10:
                vVar.D0((t1) obj);
                break;
            case 11:
                if (!(obj instanceof n)) {
                    byte[] bArr = (byte[]) obj;
                    vVar.t0(bArr, bArr.length);
                } else {
                    vVar.v0((n) obj);
                }
                break;
            case 12:
                vVar.I0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof s0)) {
                    vVar.B0(((Integer) obj).intValue());
                } else {
                    vVar.B0(((s0) obj).getNumber());
                }
                break;
            case Code.UNAVAILABLE /* 14 */:
                vVar.x0(((Integer) obj).intValue());
                break;
            case 15:
                vVar.z0(((Long) obj).longValue());
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                vVar.I0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                vVar.K0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void c() {
        k2 k2Var;
        if (this.f4073b) {
            return;
        }
        int i10 = 0;
        while (true) {
            k2Var = this.f4072a;
            if (i10 >= k2Var.f4170b.size()) {
                break;
            }
            Map.Entry entryI = k2Var.i(i10);
            if (entryI.getValue() instanceof l0) {
                ((l0) entryI.getValue()).makeImmutable();
            }
            i10++;
        }
        if (!k2Var.f4172d) {
            for (int i11 = 0; i11 < k2Var.f4170b.size(); i11++) {
                Map.Entry entryI2 = k2Var.i(i11);
                if (((i0) entryI2.getKey()).f4136c) {
                    entryI2.setValue(Collections.unmodifiableList((List) entryI2.getValue()));
                }
            }
            for (Map.Entry entry : k2Var.j()) {
                if (((i0) entry.getKey()).f4136c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!k2Var.f4172d) {
            k2Var.f4171c = k2Var.f4171c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(k2Var.f4171c);
            k2Var.f4174f = k2Var.f4174f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(k2Var.f4174f);
            k2Var.f4172d = true;
        }
        this.f4073b = true;
    }

    public final Object clone() {
        k2 k2Var;
        c0 c0Var = new c0();
        int i10 = 0;
        while (true) {
            k2Var = this.f4072a;
            if (i10 >= k2Var.f4170b.size()) {
                break;
            }
            Map.Entry entryI = k2Var.i(i10);
            c0Var.d((i0) entryI.getKey(), entryI.getValue());
            i10++;
        }
        for (Map.Entry entry : k2Var.j()) {
            c0Var.d((i0) entry.getKey(), entry.getValue());
        }
        return c0Var;
    }

    public final void d(i0 i0Var, Object obj) {
        if (!i0Var.f4136c) {
            e(i0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e(i0Var, it.next());
            }
            obj = arrayList;
        }
        this.f4072a.put(i0Var, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return this.f4072a.equals(((c0) obj).f4072a);
    }

    public final int hashCode() {
        return this.f4072a.hashCode();
    }

    public c0(int i10) {
        c();
        c();
    }
}
