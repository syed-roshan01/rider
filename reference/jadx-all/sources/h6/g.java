package h6;

import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import b3.p0;
import b3.q0;
import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.o1;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.z1;
import com.google.firebase.messaging.ServiceStarter;
import com.ride.accepter.R;
import d7.t;
import d9.u;
import e1.n0;
import i1.n;
import i1.z;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import l.q;
import m9.a0;
import m9.b0;
import m9.f1;
import m9.p1;
import m9.r1;
import m9.x1;
import p9.d0;
import p9.g0;
import p9.p;
import p9.r;
import p9.s;
import p9.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ClassLoader f7578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Thread f7579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f7581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static i1.f f7582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static i1.f f7583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static i1.f f7584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static i1.f f7585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static i1.f f7586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static i1.f f7587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static i1.f f7588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static i1.f f7589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static i1.f f7590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static i1.f f7591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static i1.f f7592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static i1.f f7593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static i1.f f7594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static i1.f f7595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static i1.f f7596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static i1.f f7597t;

    public static int A(byte[] bArr, int i10, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        o0 o0Var = (o0) e0Var;
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a + iL;
        while (iL < i11) {
            iL = N(bArr, iL, eVar);
            o0Var.i(o.c(eVar.f3531b));
        }
        if (iL == i11) {
            return iL;
        }
        throw h0.g();
    }

    public static final double A0(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    public static int B(byte[] bArr, int i10, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        c0 c0Var = (c0) e0Var;
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a + iL;
        while (iL < i11) {
            iL = L(bArr, iL, eVar);
            c0Var.i(eVar.f3530a);
        }
        if (iL == i11) {
            return iL;
        }
        throw h0.g();
    }

    public static void B0(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + q.k("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }

    public static int C(byte[] bArr, int i10, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        o0 o0Var = (o0) e0Var;
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a + iL;
        while (iL < i11) {
            iL = N(bArr, iL, eVar);
            o0Var.i(eVar.f3531b);
        }
        if (iL == i11) {
            return iL;
        }
        throw h0.g();
    }

    public static synchronized ClassLoader C0() {
        try {
            if (f7578a == null) {
                f7578a = D0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7578a;
    }

    public static int D(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        c0 c0Var = (c0) e0Var;
        int iL = L(bArr, i11, eVar);
        c0Var.i(o.b(eVar.f3530a));
        while (iL < i12) {
            int iL2 = L(bArr, iL, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iL = L(bArr, iL2, eVar);
            c0Var.i(o.b(eVar.f3530a));
        }
        return iL;
    }

    public static synchronized ClassLoader D0() {
        ClassLoader contextClassLoader = null;
        if (f7579b == null) {
            f7579b = E0();
            if (f7579b == null) {
                return null;
            }
        }
        synchronized (f7579b) {
            try {
                contextClassLoader = f7579b.getContextClassLoader();
            } catch (SecurityException e4) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e4.getMessage());
            }
        }
        return contextClassLoader;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        o0 o0Var = (o0) e0Var;
        int iN = N(bArr, i11, eVar);
        o0Var.i(o.c(eVar.f3531b));
        while (iN < i12) {
            int iL = L(bArr, iN, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iN = N(bArr, iL, eVar);
            o0Var.i(o.c(eVar.f3531b));
        }
        return iN;
    }

    public static synchronized Thread E0() {
        SecurityException e4;
        Thread fVar;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                try {
                    int iActiveGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= iActiveGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i11];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i11++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int iActiveCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[iActiveCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 >= iActiveCount) {
                            thread = null;
                            break;
                        }
                        thread = threadArr[i10];
                        if ("GmsDynamite".equals(thread.getName())) {
                            break;
                        }
                        i10++;
                    }
                    if (thread == null) {
                        try {
                            fVar = new f(threadGroup);
                            try {
                                fVar.setContextClassLoader(null);
                                fVar.start();
                            } catch (SecurityException e10) {
                                e4 = e10;
                                Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e4.getMessage());
                            }
                        } catch (SecurityException e11) {
                            e4 = e11;
                            fVar = thread;
                        }
                        thread = fVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (SecurityException e12) {
                e4 = e12;
                fVar = null;
            }
        }
        return thread;
    }

    public static int F(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a;
        if (i11 < 0) {
            throw h0.e();
        }
        if (i11 == 0) {
            eVar.f3532c = "";
            return iL;
        }
        eVar.f3532c = new String(bArr, iL, i11, f0.f3534a);
        return iL + i11;
    }

    public static int G(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        int iL = L(bArr, i11, eVar);
        int i13 = eVar.f3530a;
        if (i13 < 0) {
            throw h0.e();
        }
        if (i13 == 0) {
            e0Var.add("");
        } else {
            e0Var.add(new String(bArr, iL, i13, f0.f3534a));
            iL += i13;
        }
        while (iL < i12) {
            int iL2 = L(bArr, iL, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iL = L(bArr, iL2, eVar);
            int i14 = eVar.f3530a;
            if (i14 < 0) {
                throw h0.e();
            }
            if (i14 == 0) {
                e0Var.add("");
            } else {
                e0Var.add(new String(bArr, iL, i14, f0.f3534a));
                iL += i14;
            }
        }
        return iL;
    }

    public static int H(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        int iL = L(bArr, i11, eVar);
        int i13 = eVar.f3530a;
        if (i13 < 0) {
            throw h0.e();
        }
        if (i13 == 0) {
            e0Var.add("");
        } else {
            int i14 = iL + i13;
            if (z1.f3643a.t0(bArr, iL, i14) != 0) {
                throw h0.b();
            }
            e0Var.add(new String(bArr, iL, i13, f0.f3534a));
            iL = i14;
        }
        while (iL < i12) {
            int iL2 = L(bArr, iL, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iL = L(bArr, iL2, eVar);
            int i15 = eVar.f3530a;
            if (i15 < 0) {
                throw h0.e();
            }
            if (i15 == 0) {
                e0Var.add("");
            } else {
                int i16 = iL + i15;
                if (z1.f3643a.t0(bArr, iL, i16) != 0) {
                    throw h0.b();
                }
                e0Var.add(new String(bArr, iL, i15, f0.f3534a));
                iL = i16;
            }
        }
        return iL;
    }

    public static int I(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a;
        if (i11 < 0) {
            throw h0.e();
        }
        if (i11 == 0) {
            eVar.f3532c = "";
            return iL;
        }
        eVar.f3532c = z1.f3643a.r0(bArr, iL, i11);
        return iL + i11;
    }

    public static int J(int i10, byte[] bArr, int i11, int i12, o1 o1Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        if ((i10 >>> 3) == 0) {
            throw h0.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iN = N(bArr, i11, eVar);
            o1Var.d(i10, Long.valueOf(eVar.f3531b));
            return iN;
        }
        if (i13 == 1) {
            o1Var.d(i10, Long.valueOf(n(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iL = L(bArr, i11, eVar);
            int i14 = eVar.f3530a;
            if (i14 < 0) {
                throw h0.e();
            }
            if (i14 > bArr.length - iL) {
                throw h0.g();
            }
            if (i14 == 0) {
                o1Var.d(i10, l.f3571b);
            } else {
                o1Var.d(i10, l.i(bArr, iL, i14));
            }
            return iL + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw h0.a();
            }
            o1Var.d(i10, Integer.valueOf(l(i11, bArr)));
            return i11 + 4;
        }
        o1 o1VarC = o1.c();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (i11 < i12) {
            int iL2 = L(bArr, i11, eVar);
            int i17 = eVar.f3530a;
            if (i17 == i15) {
                i16 = i17;
                i11 = iL2;
                break;
            }
            i16 = i17;
            i11 = J(i17, bArr, iL2, i12, o1VarC, eVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw h0.f();
        }
        o1Var.d(i10, o1VarC);
        return i11;
    }

    public static int K(int i10, byte[] bArr, int i11, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            eVar.f3530a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            eVar.f3530a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            eVar.f3530a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            eVar.f3530a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                eVar.f3530a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int L(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return K(b10, bArr, i11, eVar);
        }
        eVar.f3530a = b10;
        return i11;
    }

    public static int M(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        c0 c0Var = (c0) e0Var;
        int iL = L(bArr, i11, eVar);
        c0Var.i(eVar.f3530a);
        while (iL < i12) {
            int iL2 = L(bArr, iL, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iL = L(bArr, iL2, eVar);
            c0Var.i(eVar.f3530a);
        }
        return iL;
    }

    public static int N(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            eVar.f3531b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        eVar.f3531b = j11;
        return i12;
    }

    public static int O(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        o0 o0Var = (o0) e0Var;
        int iN = N(bArr, i11, eVar);
        o0Var.i(eVar.f3531b);
        while (iN < i12) {
            int iL = L(bArr, iN, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iN = N(bArr, iL, eVar);
            o0Var.i(eVar.f3531b);
        }
        return iN;
    }

    public static boolean P(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = q0.f2670a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = p0.f2663d;
        p0 p0Var = (p0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (p0Var == null) {
            p0Var = new p0();
            p0Var.f2664a = null;
            p0Var.f2665b = null;
            p0Var.f2666c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, p0Var);
        }
        WeakReference weakReference2 = p0Var.f2666c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        p0Var.f2666c = new WeakReference(keyEvent);
        if (p0Var.f2665b == null) {
            p0Var.f2665b = new SparseArray();
        }
        SparseArray sparseArray = p0Var.f2665b;
        if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !b3.e0.b(view2) || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        a7.a.w(arrayList.get(size));
        throw null;
    }

    public static final p9.f Q(p9.f fVar) {
        if (fVar instanceof p9.o0) {
            return fVar;
        }
        p9.j jVar = p9.j.f12904a;
        p9.i iVar = p9.i.f12902a;
        if (fVar instanceof p9.e) {
            p9.e eVar = (p9.e) fVar;
            if (eVar.f12886b == jVar && eVar.f12887c == iVar) {
                return fVar;
            }
        }
        return new p9.e(fVar);
    }

    public static int R(int i10, int i11, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (t6.a.f14663a[roundingMode.ordinal()]) {
            case 1:
                if (i13 == 0) {
                    return i12;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i12 & 1) != 0))) {
                            return i12;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i12;
                }
            default:
                throw new AssertionError();
        }
        return i12 + i14;
    }

    public static final void S(u8.j jVar) {
        f1 f1Var = (f1) jVar.f(a0.f11902b);
        if (f1Var != null && !f1Var.b()) {
            throw ((p1) f1Var).H();
        }
    }

    public static final boolean T(int i10, int i11) {
        return i10 == i11;
    }

    public static String U(l lVar) {
        StringBuilder sb = new StringBuilder(lVar.size());
        for (int i10 = 0; i10 < lVar.size(); i10++) {
            byte bE = lVar.e(i10);
            if (bE == 34) {
                sb.append("\\\"");
            } else if (bE == 39) {
                sb.append("\\'");
            } else if (bE != 92) {
                switch (bE) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bE < 32 || bE > 126) {
                            sb.append('\\');
                            sb.append((char) (((bE >>> 6) & 3) + 48));
                            sb.append((char) (((bE >>> 3) & 7) + 48));
                            sb.append((char) ((bE & 7) + 48));
                        } else {
                            sb.append((char) bE);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object V(a4.c0 c0Var, u8.e eVar) {
        s sVar;
        u uVar;
        q9.a e4;
        p pVar;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i10 = sVar.f12955d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f12955d = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object obj = sVar.f12954c;
        Object obj2 = v8.a.f15963a;
        int i11 = sVar.f12955d;
        Object obj3 = q9.c.f13247b;
        if (i11 == 0) {
            t.v0(obj);
            u uVar2 = new u();
            uVar2.f4952a = obj3;
            p pVar2 = new p(uVar2);
            try {
                sVar.f12952a = uVar2;
                sVar.f12953b = pVar2;
                sVar.f12955d = 1;
                if (c0Var.collect(pVar2, sVar) != obj2) {
                    uVar = uVar2;
                    obj2 = uVar.f4952a;
                    if (obj2 == obj3) {
                        throw new NoSuchElementException("Expected at least one element");
                    }
                }
            } catch (q9.a e10) {
                uVar = uVar2;
                e4 = e10;
                pVar = pVar2;
                if (e4.f13238a != pVar) {
                    throw e4;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = sVar.f12953b;
            uVar = sVar.f12952a;
            try {
                t.v0(obj);
            } catch (q9.a e11) {
                e4 = e11;
                if (e4.f13238a != pVar) {
                    throw e4;
                }
            }
            obj2 = uVar.f4952a;
            if (obj2 == obj3) {
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0068, please report this as an issue */
    public static final Object W(p9.f fVar, c9.e eVar, u8.e eVar2) {
        p9.t tVar;
        c9.e eVar3;
        u uVar;
        q9.a e4;
        r rVar;
        if (eVar2 instanceof p9.t) {
            tVar = (p9.t) eVar2;
            int i10 = tVar.f12960e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f12960e = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new p9.t(eVar2);
            }
        } else {
            tVar = new p9.t(eVar2);
        }
        Object obj = tVar.f12959d;
        Object obj2 = v8.a.f15963a;
        int i11 = tVar.f12960e;
        Object obj3 = q9.c.f13247b;
        if (i11 == 0) {
            t.v0(obj);
            u uVar2 = new u();
            uVar2.f4952a = obj3;
            r rVar2 = new r(eVar, uVar2);
            try {
                tVar.f12956a = eVar;
                tVar.f12957b = uVar2;
                tVar.f12958c = rVar2;
                tVar.f12960e = 1;
                if (fVar.collect(rVar2, tVar) != obj2) {
                    eVar3 = eVar;
                    uVar = uVar2;
                    obj2 = uVar.f4952a;
                    if (obj2 == obj3) {
                        throw new NoSuchElementException("Expected at least one element matching the predicate " + eVar3);
                    }
                }
            } catch (q9.a e10) {
                eVar3 = eVar;
                uVar = uVar2;
                e4 = e10;
                rVar = rVar2;
                if (e4.f13238a != rVar) {
                    throw e4;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = tVar.f12958c;
            uVar = tVar.f12957b;
            eVar3 = tVar.f12956a;
            try {
                t.v0(obj);
            } catch (q9.a e11) {
                e4 = e11;
                if (e4.f13238a != rVar) {
                    throw e4;
                }
            }
            obj2 = uVar.f4952a;
            if (obj2 == obj3) {
                throw new NoSuchElementException("Expected at least one element matching the predicate " + eVar3);
            }
        }
        return obj2;
    }

    public static final String X(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) ServiceStarter.ERROR_UNKNOWN)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) ServiceStarter.ERROR_UNKNOWN)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        d7.a.l(str2, "format(format, *args)");
        return str2;
    }

    public static final i1.f Y() {
        i1.f fVar = f7582e;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Accessibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVarC = t.k.c(7, 12.0f, 2.0f);
        fVarC.v(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        fVarC.H(-0.9f, 2.0f, -2.0f, 2.0f);
        fVarC.H(-2.0f, -0.9f, -2.0f, -2.0f);
        fVarC.H(0.9f, -2.0f, 2.0f, -2.0f);
        fVarC.p();
        fVarC.D(21.0f, 9.0f);
        fVarC.A(-6.0f);
        fVarC.K(13.0f);
        fVarC.A(-2.0f);
        fVarC.K(-6.0f);
        fVarC.A(-2.0f);
        fVarC.K(6.0f);
        fVarC.B(9.0f, 22.0f);
        fVarC.B(9.0f, 9.0f);
        fVarC.B(3.0f, 9.0f);
        fVarC.B(3.0f, 7.0f);
        fVarC.A(18.0f);
        fVarC.K(2.0f);
        fVarC.p();
        i1.e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7582e = fVarB;
        return fVarB;
    }

    public static final i1.f Z() {
        i1.f fVar = f7583f;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(20.0f, 11.0f);
        fVar2.z(7.83f);
        fVar2.C(5.59f, -5.59f);
        fVar2.B(12.0f, 4.0f);
        fVar2.C(-8.0f, 8.0f);
        fVar2.C(8.0f, 8.0f);
        fVar2.C(1.41f, -1.41f);
        fVar2.B(7.83f, 13.0f);
        fVar2.z(20.0f);
        fVar2.K(-2.0f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7583f = fVarB;
        return fVarB;
    }

    public static final void a(aa.a aVar, aa.c cVar, String str) {
        Logger loggerV = aa.f.f1350h.v();
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f1343b);
        sb.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        d7.a.l(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(aVar.f1336a);
        loggerV.fine(sb.toString());
    }

    public static final i1.f a0() {
        i1.f fVar = f7584g;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.CalendarMonth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(19.0f, 4.0f);
        fVar2.A(-1.0f);
        fVar2.J(2.0f);
        fVar2.A(-2.0f);
        fVar2.K(2.0f);
        fVar2.z(8.0f);
        fVar2.J(2.0f);
        fVar2.z(6.0f);
        fVar2.K(2.0f);
        fVar2.z(5.0f);
        fVar2.u(3.89f, 4.0f, 3.01f, 4.9f, 3.01f, 6.0f);
        fVar2.B(3.0f, 20.0f);
        fVar2.v(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        fVar2.A(14.0f);
        fVar2.v(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        fVar2.J(6.0f);
        fVar2.u(21.0f, 4.9f, 20.1f, 4.0f, 19.0f, 4.0f);
        fVar2.p();
        fVar2.D(19.0f, 20.0f);
        fVar2.z(5.0f);
        fVar2.J(10.0f);
        fVar2.A(14.0f);
        fVar2.J(20.0f);
        fVar2.p();
        fVar2.D(9.0f, 14.0f);
        fVar2.z(7.0f);
        fVar2.K(-2.0f);
        fVar2.A(2.0f);
        fVar2.J(14.0f);
        fVar2.p();
        fVar2.D(13.0f, 14.0f);
        fVar2.A(-2.0f);
        fVar2.K(-2.0f);
        fVar2.A(2.0f);
        fVar2.J(14.0f);
        fVar2.p();
        fVar2.D(17.0f, 14.0f);
        fVar2.A(-2.0f);
        fVar2.K(-2.0f);
        fVar2.A(2.0f);
        fVar2.J(14.0f);
        fVar2.p();
        fVar2.D(9.0f, 18.0f);
        fVar2.z(7.0f);
        fVar2.K(-2.0f);
        fVar2.A(2.0f);
        fVar2.J(18.0f);
        fVar2.p();
        fVar2.D(13.0f, 18.0f);
        fVar2.A(-2.0f);
        fVar2.K(-2.0f);
        fVar2.A(2.0f);
        fVar2.J(18.0f);
        fVar2.p();
        fVar2.D(17.0f, 18.0f);
        fVar2.A(-2.0f);
        fVar2.K(-2.0f);
        fVar2.A(2.0f);
        fVar2.J(18.0f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7584g = fVarB;
        return fVarB;
    }

    public static final p9.c b(c9.e eVar) {
        return new p9.c(eVar, u8.k.f15438a, -2, o9.a.f12668a);
    }

    public static final i1.f b0() {
        i1.f fVar = f7585h;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVarC = t.k.c(7, 12.0f, 2.0f);
        fVarC.u(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVarC.H(4.48f, 10.0f, 10.0f, 10.0f);
        fVarC.H(10.0f, -4.48f, 10.0f, -10.0f);
        fVarC.G(17.52f, 2.0f, 12.0f, 2.0f);
        fVarC.p();
        fVarC.D(10.0f, 17.0f);
        fVarC.C(-5.0f, -5.0f);
        fVarC.C(1.41f, -1.41f);
        fVarC.B(10.0f, 14.17f);
        fVarC.C(7.59f, -7.59f);
        fVarC.B(19.0f, 8.0f);
        fVarC.C(-9.0f, 9.0f);
        fVarC.p();
        i1.e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7585h = fVarB;
        return fVarB;
    }

    public static final void c(o9.s sVar, Throwable th) {
        CancellationException cancellationExceptionA = null;
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = d7.a.a("Channel was consumed, consumer had failed", th);
            }
        }
        sVar.a(cancellationExceptionA);
    }

    public static final i1.f c0() {
        i1.f fVar = f7587j;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.DirectionsCar", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVarC = t.k.c(7, 18.92f, 6.01f);
        fVarC.u(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f);
        fVarC.A(-11.0f);
        fVarC.v(-0.66f, 0.0f, -1.21f, 0.42f, -1.42f, 1.01f);
        fVarC.B(3.0f, 12.0f);
        fVarC.K(8.0f);
        fVarC.v(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        fVarC.A(1.0f);
        fVarC.v(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        fVarC.K(-1.0f);
        fVarC.A(12.0f);
        fVarC.K(1.0f);
        fVarC.v(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        fVarC.A(1.0f);
        fVarC.v(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        fVarC.K(-8.0f);
        fVarC.C(-2.08f, -5.99f);
        fVarC.p();
        fVarC.D(6.5f, 16.0f);
        fVarC.v(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        fVarC.G(5.67f, 13.0f, 6.5f, 13.0f);
        fVarC.H(1.5f, 0.67f, 1.5f, 1.5f);
        fVarC.G(7.33f, 16.0f, 6.5f, 16.0f);
        fVarC.p();
        fVarC.D(17.5f, 16.0f);
        fVarC.v(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        fVarC.H(0.67f, -1.5f, 1.5f, -1.5f);
        fVarC.H(1.5f, 0.67f, 1.5f, 1.5f);
        fVarC.H(-0.67f, 1.5f, -1.5f, 1.5f);
        fVarC.p();
        fVarC.D(5.0f, 11.0f);
        fVarC.C(1.5f, -4.5f);
        fVarC.A(11.0f);
        fVarC.B(19.0f, 11.0f);
        fVarC.B(5.0f, 11.0f);
        fVarC.p();
        i1.e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7587j = fVarB;
        return fVarB;
    }

    public static final void d(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(q.g("Expected positive parallelism level, but got ", i10).toString());
        }
    }

    public static final i1.f d0() {
        i1.f fVar = f7588k;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(11.0f, 15.0f);
        fVar2.A(2.0f);
        fVar2.K(2.0f);
        fVar2.A(-2.0f);
        fVar2.p();
        fVar2.D(11.0f, 7.0f);
        fVar2.A(2.0f);
        fVar2.K(6.0f);
        fVar2.A(-2.0f);
        fVar2.p();
        fVar2.D(11.99f, 2.0f);
        fVar2.u(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVar2.H(4.47f, 10.0f, 9.99f, 10.0f);
        fVar2.u(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        fVar2.G(17.52f, 2.0f, 11.99f, 2.0f);
        fVar2.p();
        fVar2.D(12.0f, 20.0f);
        fVar2.v(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        fVar2.H(3.58f, -8.0f, 8.0f, -8.0f);
        fVar2.H(8.0f, 3.58f, 8.0f, 8.0f);
        fVar2.H(-3.58f, 8.0f, -8.0f, 8.0f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7588k = fVarB;
        return fVarB;
    }

    public static final void e(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                d7.a.c(th, th2);
            }
        }
    }

    public static final i1.f e0() {
        i1.f fVar = f7589l;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVarC = t.k.c(7, 12.0f, 2.0f);
        fVarC.u(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVarC.H(4.48f, 10.0f, 10.0f, 10.0f);
        fVarC.H(10.0f, -4.48f, 10.0f, -10.0f);
        fVarC.G(17.52f, 2.0f, 12.0f, 2.0f);
        fVarC.p();
        fVarC.D(13.0f, 17.0f);
        fVarC.A(-2.0f);
        fVarC.K(-6.0f);
        fVarC.A(2.0f);
        fVarC.K(6.0f);
        fVarC.p();
        fVarC.D(13.0f, 9.0f);
        fVarC.A(-2.0f);
        fVarC.B(11.0f, 7.0f);
        fVarC.A(2.0f);
        fVarC.K(2.0f);
        fVarC.p();
        i1.e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7589l = fVarB;
        return fVarB;
    }

    public static final double f(int i10, int i11, int i12, int i13, t4.e eVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d10, d11);
        }
        if (iOrdinal == 1) {
            return Math.min(d10, d11);
        }
        throw new androidx.fragment.app.a0();
    }

    public static int g(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        com.google.crypto.tink.shaded.protobuf.f fVar = (com.google.crypto.tink.shaded.protobuf.f) e0Var;
        int iN = N(bArr, i11, eVar);
        fVar.i(eVar.f3531b != 0);
        while (iN < i12) {
            int iL = L(bArr, iN, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iN = N(bArr, iL, eVar);
            fVar.i(eVar.f3531b != 0);
        }
        return iN;
    }

    public static final f1 g0(u8.j jVar) {
        f1 f1Var = (f1) jVar.f(a0.f11902b);
        if (f1Var != null) {
            return f1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + jVar).toString());
    }

    public static int h(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a;
        if (i11 < 0) {
            throw h0.e();
        }
        if (i11 > bArr.length - iL) {
            throw h0.g();
        }
        if (i11 == 0) {
            eVar.f3532c = l.f3571b;
            return iL;
        }
        eVar.f3532c = l.i(bArr, iL, i11);
        return iL + i11;
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        int iL = L(bArr, i11, eVar);
        int i13 = eVar.f3530a;
        if (i13 < 0) {
            throw h0.e();
        }
        if (i13 > bArr.length - iL) {
            throw h0.g();
        }
        if (i13 == 0) {
            e0Var.add(l.f3571b);
        } else {
            e0Var.add(l.i(bArr, iL, i13));
            iL += i13;
        }
        while (iL < i12) {
            int iL2 = L(bArr, iL, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iL = L(bArr, iL2, eVar);
            int i14 = eVar.f3530a;
            if (i14 < 0) {
                throw h0.e();
            }
            if (i14 > bArr.length - iL) {
                throw h0.g();
            }
            if (i14 == 0) {
                e0Var.add(l.f3571b);
            } else {
                e0Var.add(l.i(bArr, iL, i14));
                iL += i14;
            }
        }
        return iL;
    }

    public static final i1.f i0() {
        i1.f fVar = f7590m;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVarC = t.k.c(7, 11.99f, 2.0f);
        fVarC.u(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVarC.H(4.47f, 10.0f, 9.99f, 10.0f);
        fVarC.u(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        fVarC.G(17.52f, 2.0f, 11.99f, 2.0f);
        fVarC.p();
        fVarC.D(18.92f, 8.0f);
        fVarC.A(-2.95f);
        fVarC.v(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
        fVarC.v(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
        fVarC.p();
        fVarC.D(12.0f, 4.04f);
        fVarC.v(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
        fVarC.A(-3.82f);
        fVarC.v(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
        fVarC.p();
        fVarC.D(4.26f, 14.0f);
        fVarC.u(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        fVarC.H(0.1f, -1.36f, 0.26f, -2.0f);
        fVarC.A(3.38f);
        fVarC.v(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
        fVarC.v(0.0f, 0.68f, 0.06f, 1.34f, 0.14f, 2.0f);
        fVarC.B(4.26f, 14.0f);
        fVarC.p();
        fVarC.D(5.08f, 16.0f);
        fVarC.A(2.95f);
        fVarC.v(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
        fVarC.v(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
        fVarC.p();
        fVarC.D(8.03f, 8.0f);
        fVarC.B(5.08f, 8.0f);
        fVarC.v(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
        fVarC.u(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
        fVarC.p();
        fVarC.D(12.0f, 19.96f);
        fVarC.v(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
        fVarC.A(3.82f);
        fVarC.v(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
        fVarC.p();
        fVarC.D(14.34f, 14.0f);
        fVarC.B(9.66f, 14.0f);
        fVarC.v(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
        fVarC.v(0.0f, -0.68f, 0.07f, -1.35f, 0.16f, -2.0f);
        fVarC.A(4.68f);
        fVarC.v(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
        fVarC.v(0.0f, 0.68f, -0.07f, 1.34f, -0.16f, 2.0f);
        fVarC.p();
        fVarC.D(14.59f, 19.56f);
        fVarC.v(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
        fVarC.A(2.95f);
        fVarC.v(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
        fVarC.p();
        fVarC.D(16.36f, 14.0f);
        fVarC.v(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
        fVarC.v(0.0f, -0.68f, -0.06f, -1.34f, -0.14f, -2.0f);
        fVarC.A(3.38f);
        fVarC.v(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
        fVarC.H(-0.1f, 1.36f, -0.26f, 2.0f);
        fVarC.A(-3.38f);
        fVarC.p();
        i1.e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7590m = fVarB;
        return fVarB;
    }

    public static double j(int i10, byte[] bArr) {
        return Double.longBitsToDouble(n(i10, bArr));
    }

    public static final i1.f j0() {
        i1.f fVar = f7591n;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Logout", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(17.0f, 7.0f);
        fVar2.C(-1.41f, 1.41f);
        fVar2.B(18.17f, 11.0f);
        fVar2.z(8.0f);
        fVar2.K(2.0f);
        fVar2.A(10.17f);
        fVar2.C(-2.58f, 2.58f);
        fVar2.B(17.0f, 17.0f);
        fVar2.C(5.0f, -5.0f);
        fVar2.p();
        fVar2.D(4.0f, 5.0f);
        fVar2.A(8.0f);
        fVar2.J(3.0f);
        fVar2.z(4.0f);
        fVar2.v(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        fVar2.K(14.0f);
        fVar2.v(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        fVar2.A(8.0f);
        fVar2.K(-2.0f);
        fVar2.z(4.0f);
        fVar2.J(5.0f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7591n = fVarB;
        return fVarB;
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        com.google.crypto.tink.shaded.protobuf.r rVar = (com.google.crypto.tink.shaded.protobuf.r) e0Var;
        rVar.i(Double.longBitsToDouble(n(i11, bArr)));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iL = L(bArr, i13, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            rVar.i(Double.longBitsToDouble(n(iL, bArr)));
            i13 = iL + 8;
        }
        return i13;
    }

    public static final i1.f k0() {
        i1.f fVar = f7593p;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(8.0f, 5.0f));
        arrayList.add(new z(14.0f));
        arrayList.add(new i1.u(11.0f, -7.0f));
        arrayList.add(i1.j.f7840c);
        i1.e.a(eVar, arrayList, n0Var);
        i1.f fVarB = eVar.b();
        f7593p = fVarB;
        return fVarB;
    }

    public static int l(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static final g3.a l0(View view) {
        g3.a aVar = (g3.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        g3.a aVar2 = new g3.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static int m(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        c0 c0Var = (c0) e0Var;
        c0Var.i(l(i11, bArr));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iL = L(bArr, i13, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            c0Var.i(l(iL, bArr));
            i13 = iL + 4;
        }
        return i13;
    }

    public static final i1.f m0() {
        i1.f fVar = f7594q;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Save", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        n0 n0Var = new n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(17.0f, 3.0f);
        fVar2.B(5.0f, 3.0f);
        fVar2.v(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        fVar2.K(14.0f);
        fVar2.v(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        fVar2.A(14.0f);
        fVar2.v(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        fVar2.B(21.0f, 7.0f);
        fVar2.C(-4.0f, -4.0f);
        fVar2.p();
        fVar2.D(12.0f, 19.0f);
        fVar2.v(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        fVar2.H(1.34f, -3.0f, 3.0f, -3.0f);
        fVar2.H(3.0f, 1.34f, 3.0f, 3.0f);
        fVar2.H(-1.34f, 3.0f, -3.0f, 3.0f);
        fVar2.p();
        fVar2.D(15.0f, 9.0f);
        fVar2.B(5.0f, 9.0f);
        fVar2.B(5.0f, 5.0f);
        fVar2.A(10.0f);
        fVar2.K(4.0f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f7594q = fVarB;
        return fVarB;
    }

    public static long n(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static final void n0(u8.j jVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            b0 b0Var = (b0) jVar.f(a0.f11901a);
            if (b0Var != null) {
                b0Var.p(jVar, th);
            } else {
                t.a0(jVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                d7.a.c(runtimeException, th);
                th = runtimeException;
            }
            t.a0(jVar, th);
        }
    }

    public static int o(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        o0 o0Var = (o0) e0Var;
        o0Var.i(n(i11, bArr));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iL = L(bArr, i13, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            o0Var.i(n(iL, bArr));
            i13 = iL + 8;
        }
        return i13;
    }

    public static final boolean o0(u8.j jVar) {
        f1 f1Var = (f1) jVar.f(a0.f11902b);
        if (f1Var != null) {
            return f1Var.b();
        }
        return true;
    }

    public static float p(int i10, byte[] bArr) {
        return Float.intBitsToFloat(l(i10, bArr));
    }

    public static boolean p0(byte b10) {
        return b10 > -65;
    }

    public static int q(int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        x xVar = (x) e0Var;
        xVar.i(Float.intBitsToFloat(l(i11, bArr)));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iL = L(bArr, i13, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            xVar.i(Float.intBitsToFloat(l(iL, bArr)));
            i13 = iL + 4;
        }
        return i13;
    }

    public static int q0(int i10, RoundingMode roundingMode) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(q.h("x (", i10, ") must be > 0"));
        }
        switch (t6.a.f14663a[roundingMode.ordinal()]) {
            case 1:
                if (!((i10 > 0) & (((i10 + (-1)) & i10) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i10))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static int r(j1 j1Var, int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int i13 = (i10 & (-8)) | 4;
        Object objF = j1Var.f();
        int iR0 = r0(objF, j1Var, bArr, i11, i12, i13, eVar);
        j1Var.b(objF);
        eVar.f3532c = objF;
        e0Var.add(objF);
        while (iR0 < i12) {
            int iL = L(bArr, iR0, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            Object objF2 = j1Var.f();
            int iR1 = r0(objF2, j1Var, bArr, iL, i12, i13, eVar);
            j1Var.b(objF2);
            eVar.f3532c = objF2;
            e0Var.add(objF2);
            iR0 = iR1;
        }
        return iR0;
    }

    public static int r0(Object obj, j1 j1Var, byte[] bArr, int i10, int i11, int i12, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int iJ = ((a1) j1Var).J(obj, bArr, i10, i11, i12, eVar);
        eVar.f3532c = obj;
        return iJ;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1 A[LOOP:1: B:56:0x00a5->B:59:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[EDGE_INSN: B:82:0x00b7->B:60:0x00b7 BREAK  A[LOOP:1: B:56:0x00a5->B:59:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public static final InetAddress s(int i10, int i11, String str) {
        int i12;
        ?? r14;
        int i13;
        char cCharAt;
        int i14;
        int i15;
        int i16;
        int iP;
        int i17 = 16;
        byte[] bArr = new byte[16];
        boolean z10 = false;
        int i18 = i10;
        int i19 = 0;
        int i20 = -1;
        int i21 = -1;
        while (true) {
            if (i18 >= i11) {
                i12 = i17;
                break;
            }
            if (i19 == i17) {
                return null;
            }
            int i22 = i18 + 2;
            if (i22 <= i11 && l9.i.g1(i18, str, "::", z10)) {
                if (i20 != -1) {
                    return null;
                }
                i19 += 2;
                if (i22 == i11) {
                    i12 = i17;
                    i20 = i19;
                    break;
                }
                i20 = i19;
                i21 = i22;
                i18 = i21;
                i15 = 0;
                while (i18 < i11) {
                    iP = y9.b.p(str.charAt(i18));
                    if (iP != -1) {
                        break;
                        break;
                    }
                    i15 = (i15 << 4) + iP;
                    i18++;
                }
                i16 = i18 - i21;
                if (i16 != 0) {
                }
                return null;
            }
            if (i19 != 0) {
                if (!l9.i.g1(i18, str, ":", z10)) {
                    if (l9.i.g1(i18, str, ".", z10)) {
                        int i23 = i19 - 2;
                        int i24 = i23;
                        while (i21 < i11) {
                            if (i24 != i17) {
                                if (i24 == i23) {
                                    r14 = z10;
                                    i13 = i21;
                                    while (i13 < i11) {
                                        cCharAt = str.charAt(i13);
                                        if (d7.a.o(cCharAt, 48) < 0 || d7.a.o(cCharAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 != 0 || i21 == i13) && (i14 = ((r14 * 10) + cCharAt) - 48) <= 255) {
                                            i13++;
                                            r14 = i14;
                                        }
                                    }
                                    if (i13 - i21 == 0) {
                                        bArr[i24] = (byte) r14;
                                        i24++;
                                        i21 = i13;
                                        i17 = 16;
                                        z10 = false;
                                    }
                                } else if (str.charAt(i21) == '.') {
                                    i21++;
                                    r14 = z10;
                                    i13 = i21;
                                    while (i13 < i11) {
                                        cCharAt = str.charAt(i13);
                                        if (d7.a.o(cCharAt, 48) < 0) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (i13 - i21 == 0) {
                                        bArr[i24] = (byte) r14;
                                        i24++;
                                        i21 = i13;
                                        i17 = 16;
                                        z10 = false;
                                    }
                                }
                            }
                        }
                        if (i24 == i19 + 2) {
                            i19 += 2;
                            i12 = 16;
                            break;
                        }
                    }
                    return null;
                }
                i18++;
            }
            i21 = i18;
            i18 = i21;
            i15 = 0;
            while (i18 < i11) {
                iP = y9.b.p(str.charAt(i18));
                if (iP != -1) {
                    break;
                }
                i15 = (i15 << 4) + iP;
                i18++;
            }
            i16 = i18 - i21;
            if (i16 != 0 || i16 > 4) {
                return null;
            }
            int i25 = i19 + 1;
            bArr[i19] = (byte) ((i15 >>> 8) & 255);
            i19 += 2;
            bArr[i25] = (byte) (i15 & 255);
            i17 = 16;
            z10 = false;
        }
        if (i19 != i12) {
            if (i20 == -1) {
                return null;
            }
            int i26 = i19 - i20;
            System.arraycopy(bArr, i20, bArr, 16 - i26, i26);
            Arrays.fill(bArr, i20, (16 - i19) + i20, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static int s0(Object obj, j1 j1Var, byte[] bArr, int i10, int i11, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        int iK = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iK = K(i12, bArr, iK, eVar);
            i12 = eVar.f3530a;
        }
        int i13 = iK;
        if (i12 < 0 || i12 > i11 - i13) {
            throw h0.g();
        }
        int i14 = i12 + i13;
        j1Var.h(obj, bArr, i13, i14, eVar);
        eVar.f3532c = obj;
        return i14;
    }

    public static int t(j1 j1Var, int i10, byte[] bArr, int i11, int i12, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        Object objF = j1Var.f();
        int iS0 = s0(objF, j1Var, bArr, i11, i12, eVar);
        j1Var.b(objF);
        eVar.f3532c = objF;
        e0Var.add(objF);
        while (iS0 < i12) {
            int iL = L(bArr, iS0, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            Object objF2 = j1Var.f();
            int iS1 = s0(objF2, j1Var, bArr, iL, i12, eVar);
            j1Var.b(objF2);
            eVar.f3532c = objF2;
            e0Var.add(objF2);
            iS0 = iS1;
        }
        return iS0;
    }

    public static int u(byte[] bArr, int i10, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        com.google.crypto.tink.shaded.protobuf.f fVar = (com.google.crypto.tink.shaded.protobuf.f) e0Var;
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a + iL;
        while (iL < i11) {
            iL = N(bArr, iL, eVar);
            fVar.i(eVar.f3531b != 0);
        }
        if (iL == i11) {
            return iL;
        }
        throw h0.g();
    }

    public static int v(byte[] bArr, int i10, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        com.google.crypto.tink.shaded.protobuf.r rVar = (com.google.crypto.tink.shaded.protobuf.r) e0Var;
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a + iL;
        while (iL < i11) {
            rVar.i(Double.longBitsToDouble(n(iL, bArr)));
            iL += 8;
        }
        if (iL == i11) {
            return iL;
        }
        throw h0.g();
    }

    public static void v0(c9.e eVar, m9.a aVar, m9.a aVar2) {
        try {
            r9.a.l(t.b0(t.M(aVar, aVar2, eVar)), q8.l.f13235a, null);
        } catch (Throwable th) {
            aVar2.resumeWith(t.N(th));
            throw th;
        }
    }

    public static int w(byte[] bArr, int i10, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        c0 c0Var = (c0) e0Var;
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a + iL;
        while (iL < i11) {
            c0Var.i(l(iL, bArr));
            iL += 4;
        }
        if (iL == i11) {
            return iL;
        }
        throw h0.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p9.z w0(a4.c0 c0Var, r9.e eVar, p9.n0 n0Var, Float f10) {
        y5.o oVar;
        q9.g gVar;
        p9.f fVarE;
        o9.g.f12708j.getClass();
        int i10 = o9.f.f12707b;
        if (1 >= i10) {
            i10 = 1;
        }
        int i11 = i10 - 1;
        boolean z10 = c0Var instanceof q9.g;
        o9.a aVar = o9.a.f12668a;
        if (!z10 || (fVarE = (gVar = (q9.g) c0Var).e()) == null) {
            oVar = new y5.o(i11, u8.k.f15438a, aVar, c0Var);
        } else {
            o9.a aVar2 = gVar.f13257c;
            int i12 = gVar.f13256b;
            if (i12 != -3 && i12 != -2 && i12 != 0) {
                i11 = i12;
            } else if (aVar2 != aVar || i12 == 0) {
                i11 = 0;
            }
            oVar = new y5.o(i11, gVar.f13255a, aVar2, fVarE);
        }
        p9.q0 q0VarA = d0.a(f10);
        u8.j jVar = (u8.j) oVar.f16985d;
        p9.f fVar = (p9.f) oVar.f16983b;
        int i13 = d7.a.d(n0Var, g0.f12894a) ? 1 : 4;
        w wVar = new w(n0Var, fVar, q0VarA, f10, null);
        u8.j jVarW = z6.a.W(eVar, jVar);
        m9.a r1Var = i13 == 2 ? new r1(jVarW, wVar) : new x1(jVarW, true);
        r1Var.k0(i13, r1Var, wVar);
        return new p9.z(q0VarA);
    }

    public static int x(byte[] bArr, int i10, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        o0 o0Var = (o0) e0Var;
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a + iL;
        while (iL < i11) {
            o0Var.i(n(iL, bArr));
            iL += 8;
        }
        if (iL == i11) {
            return iL;
        }
        throw h0.g();
    }

    public static final String x0(String str) {
        d7.a.m(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!l9.i.F0(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                d7.a.l(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                d7.a.l(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                d7.a.l(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = lowerCase.charAt(i12);
                    if (d7.a.o(cCharAt, 31) <= 0 || d7.a.o(cCharAt, 127) >= 0 || l9.i.O0(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressS = (l9.i.h1(str, "[", false) && l9.i.H0(str, "]", false)) ? s(1, str.length() - 1, str) : s(0, str.length(), str);
        if (inetAddressS == null) {
            return null;
        }
        byte[] address = inetAddressS.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressS.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        ja.g gVar = new ja.g();
        while (i10 < address.length) {
            if (i10 == i11) {
                gVar.h0(58);
                i10 += i14;
                if (i10 == 16) {
                    gVar.h0(58);
                }
            } else {
                if (i10 > 0) {
                    gVar.h0(58);
                }
                byte b10 = address[i10];
                byte[] bArr = y9.b.f17000a;
                gVar.j0(((b10 & 255) << 8) | (address[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return gVar.Q();
    }

    public static int y(byte[] bArr, int i10, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        x xVar = (x) e0Var;
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a + iL;
        while (iL < i11) {
            xVar.i(Float.intBitsToFloat(l(iL, bArr)));
            iL += 4;
        }
        if (iL == i11) {
            return iL;
        }
        throw h0.g();
    }

    public static String y0(int i10) {
        if (T(i10, 1)) {
            return "Clip";
        }
        if (T(i10, 2)) {
            return "Ellipsis";
        }
        return T(i10, 3) ? "Visible" : "Invalid";
    }

    public static int z(byte[] bArr, int i10, e0 e0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws h0 {
        c0 c0Var = (c0) e0Var;
        int iL = L(bArr, i10, eVar);
        int i11 = eVar.f3530a + iL;
        while (iL < i11) {
            iL = L(bArr, iL, eVar);
            c0Var.i(o.b(eVar.f3530a));
        }
        if (iL == i11) {
            return iL;
        }
        throw h0.g();
    }

    public static final void z0(o9.t tVar, Object obj) {
        Object objN = tVar.n(obj);
        if (!(objN instanceof o9.i)) {
        } else {
            Object obj2 = ((o9.j) z6.a.d0(u8.k.f15438a, new o9.l(tVar, obj, null))).f12711a;
        }
    }

    public abstract a0.q0 f0();

    public Object h0(int i10) {
        Object objInvoke;
        a0.e eVarC = f0().c(i10);
        int i11 = i10 - eVarC.f782a;
        c9.c key = ((a0.o) eVarC.f784c).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i11))) == null) ? new a0.c(i10) : objInvoke;
    }

    public abstract void t0(Throwable th);

    public abstract void u0(i3.a0 a0Var);
}
