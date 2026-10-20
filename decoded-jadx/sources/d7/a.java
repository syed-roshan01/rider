package d7;

import androidx.fragment.app.a0;
import j0.b0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.d0;
import m9.f1;
import m9.h0;
import m9.i1;
import m9.p1;
import m9.v1;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x9.v f4882a = new x9.v((Object) null);

    public static u8.j A(u8.j jVar, u8.j jVar2) {
        m(jVar2, "context");
        return jVar2 == u8.k.f15438a ? jVar : (u8.j) jVar2.e(jVar, u8.c.f15432c);
    }

    public static void B(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
    }

    public static void C() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void D(String str) {
        a0 a0Var = new a0(l.q.k("lateinit property ", str, " has not been initialized"));
        B(a.class.getName(), a0Var);
        throw a0Var;
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final r9.e b(u8.j jVar) {
        if (jVar.f(m9.a0.f11902b) == null) {
            jVar = jVar.O(new i1(null));
        }
        return new r9.e(jVar);
    }

    public static void c(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        m(th, "<this>");
        m(th2, "exception");
        if (th != th2) {
            Integer num = z8.a.f17335a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = y8.a.f16997a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object e(h0[] h0VarArr, u8.e eVar) {
        int iF0;
        if (h0VarArr.length == 0) {
            return r8.r.f13661a;
        }
        m9.e eVar2 = new m9.e(h0VarArr);
        m9.l lVar = new m9.l(1, t.b0(eVar));
        lVar.t();
        int length = h0VarArr.length;
        m9.c[] cVarArr = new m9.c[length];
        for (int i10 = 0; i10 < length; i10++) {
            p1 p1Var = (p1) h0VarArr[i10];
            do {
                iF0 = p1Var.f0(p1Var.N());
                if (iF0 == 0) {
                    break;
                }
            } while (iF0 != 1);
            m9.c cVar = new m9.c(eVar2, lVar);
            cVar.f11911f = p1Var.U(false, true, cVar);
            cVarArr[i10] = cVar;
        }
        m9.d dVar = new m9.d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            m9.c cVar2 = cVarArr[i11];
            cVar2.getClass();
            m9.c.f11909o.set(cVar2, dVar);
        }
        if (!(m9.l.f11959n.get(lVar) instanceof v1)) {
            dVar.b();
        } else {
            lVar.v(dVar);
        }
        Object objS = lVar.s();
        v8.a aVar = v8.a.f15963a;
        return objS;
    }

    public static final b.g f(c9.c cVar, Object obj, u8.j jVar) {
        return new b.g(cVar, obj, jVar, 24);
    }

    public static final a0 g(c9.c cVar, Object obj, a0 a0Var) throws IllegalAccessException, InvocationTargetException {
        try {
            cVar.invoke(obj);
        } catch (Throwable th) {
            if (a0Var == null || a0Var.getCause() == th) {
                return new a0("Exception in undelivered element handler for " + obj, th);
            }
            c(a0Var, th);
        }
        return a0Var;
    }

    public static final void h(d0 d0Var, String str, Throwable th) {
        i(d0Var, a(str, th));
    }

    public static final void i(d0 d0Var, CancellationException cancellationException) {
        f1 f1Var = (f1) d0Var.q().f(m9.a0.f11902b);
        if (f1Var != null) {
            f1Var.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + d0Var).toString());
        }
    }

    public static void j(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        B(a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        B(a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        B(a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = a.class.getName();
            int i10 = 0;
            while (!stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            while (stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            StringBuilder sbC = k1.c("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbC.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbC.toString());
            B(a.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void n(int i10) {
        if (new i9.g(2, 36, 1).i(i10)) {
            return;
        }
        StringBuilder sbQ = a7.a.q("radix ", i10, " was not in valid range ");
        sbQ.append(new i9.g(2, 36, 1));
        throw new IllegalArgumentException(sbQ.toString());
    }

    public static int o(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static final void p(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    public static final Object q(c9.e eVar, u8.e eVar2) {
        r9.s sVar = new r9.s(eVar2, eVar2.getContext());
        Object objI0 = o7.d0.i0(sVar, sVar, eVar);
        v8.a aVar = v8.a.f15963a;
        return objI0;
    }

    public static byte[] r(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = (byte) ((bArr[i10] << 1) & 254);
            bArr2[i10] = b10;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((byte) ((bArr[i10 + 1] >> 7) & 1)) | b10);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static byte[] s(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int iDigit = Character.digit(str.charAt(i11), 16);
            int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i10] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String t(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb.append("0123456789abcdef".charAt(i10 / 16));
            sb.append("0123456789abcdef".charAt(i10 % 16));
        }
        return sb.toString();
    }

    public static final boolean u(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static void v(b0 b0Var) {
        v6.g gVar;
        ArrayList arrayList = new ArrayList();
        g7.a aVar = g7.a.f6624b;
        Iterator it = ((ConcurrentMap) b0Var.f8249b).values().iterator();
        while (it.hasNext()) {
            for (v6.n nVar : (List) it.next()) {
                int iOrdinal = nVar.f15925d.ordinal();
                if (iOrdinal == 1) {
                    gVar = v6.g.f15912b;
                } else if (iOrdinal == 2) {
                    gVar = v6.g.f15913c;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    gVar = v6.g.f15914d;
                }
                String strSubstring = nVar.f15928g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new g7.b(gVar, nVar.f15927f, strSubstring, nVar.f15926e.name()));
            }
        }
        v6.n nVar2 = (v6.n) b0Var.f8250c;
        Integer numValueOf = nVar2 != null ? Integer.valueOf(nVar2.f15927f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((g7.b) it2.next()).f6627b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e4) {
                throw new IllegalStateException(e4);
            }
        }
        Collections.unmodifiableList(arrayList);
    }

    public static final m9.l w(u8.e eVar) {
        m9.l lVar;
        m9.l lVar2;
        if (!(eVar instanceof r9.h)) {
            return new m9.l(1, eVar);
        }
        r9.h hVar = (r9.h) eVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r9.h.f13701o;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            i3.u uVar = r9.a.f13691d;
            lVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, uVar);
                lVar2 = null;
                break;
            }
            if (obj instanceof m9.l) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, uVar)) {
                        lVar2 = (m9.l) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == obj);
            } else if (obj != uVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m9.l.f11959n;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if (!(obj2 instanceof m9.t) || ((m9.t) obj2).f12000d == null) {
                m9.l.f11958f.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, m9.b.f11905a);
                lVar = lVar2;
            } else {
                lVar2.p();
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new m9.l(2, eVar);
    }

    public static final boolean x(d0 d0Var) {
        f1 f1Var = (f1) d0Var.q().f(m9.a0.f11902b);
        if (f1Var != null) {
            return f1Var.b();
        }
        return true;
    }

    public static final boolean y(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object z(List list, u8.e eVar) {
        m9.f fVar;
        Iterator it;
        if (eVar instanceof m9.f) {
            fVar = (m9.f) eVar;
            int i10 = fVar.f11939c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f11939c = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new m9.f(eVar);
            }
        } else {
            fVar = new m9.f(eVar);
        }
        Object obj = fVar.f11938b;
        v8.a aVar = v8.a.f15963a;
        int i11 = fVar.f11939c;
        if (i11 == 0) {
            t.v0(obj);
            it = list.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = fVar.f11937a;
            t.v0(obj);
        }
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            fVar.f11937a = it;
            fVar.f11939c = 1;
            if (((p1) f1Var).W(fVar) == aVar) {
                return aVar;
            }
        }
        return q8.l.f13235a;
    }
}
