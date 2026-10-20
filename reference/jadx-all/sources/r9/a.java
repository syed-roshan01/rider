package r9;

import com.google.android.gms.tasks.Task;
import d5.s1;
import ja.a0;
import ja.d0;
import ja.e0;
import ja.f0;
import ja.g0;
import ja.i0;
import ja.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import m9.a2;
import m9.f1;
import m9.g2;
import m9.p1;
import m9.w0;
import m9.z1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i3.u f13688a = new i3.u("NO_DECISION", 5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i3.u f13689b = new i3.u("CLOSED", 5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i3.u f13690c = new i3.u("UNDEFINED", 5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i3.u f13691d = new i3.u("REUSABLE_CLAIMED", 5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i3.u f13692e = new i3.u("CONDITION_FALSE", 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i3.u f13693f = new i3.u("NO_THREAD_ELEMENTS", 5);

    public static final Object a(Task task, u8.e eVar) throws Exception {
        if (!task.isComplete()) {
            m9.l lVar = new m9.l(1, d7.t.b0(eVar));
            lVar.t();
            task.addOnCompleteListener(v9.a.f15973a, new v9.b(lVar));
            Object objS = lVar.s();
            v8.a aVar = v8.a.f15963a;
            return objS;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final z b(e0 e0Var) {
        d7.a.m(e0Var, "<this>");
        return new z(e0Var);
    }

    public static final a0 c(g0 g0Var) {
        d7.a.m(g0Var, "<this>");
        return new a0(g0Var);
    }

    public static final LinkedHashMap d(ArrayList arrayList) {
        String str = ja.x.f8577b;
        ja.x xVarI = fa.l.i("/", false);
        q8.f[] fVarArr = {new q8.f(xVarI, new ka.g(xVarI))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(z6.a.T(1));
        r8.v.E0(linkedHashMap, fVarArr);
        for (ka.g gVar : r8.p.R0(arrayList, new t1.p(9))) {
            if (((ka.g) linkedHashMap.put(gVar.f10669a, gVar)) == null) {
                while (true) {
                    ja.x xVar = gVar.f10669a;
                    ja.x xVarB = xVar.b();
                    if (xVarB == null) {
                        break;
                    }
                    ka.g gVar2 = (ka.g) linkedHashMap.get(xVarB);
                    if (gVar2 != null) {
                        gVar2.f10676h.add(xVar);
                        break;
                    }
                    ka.g gVar3 = new ka.g(xVarB);
                    linkedHashMap.put(xVarB, gVar3);
                    gVar3.f10676h.add(xVar);
                    gVar = gVar3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final Object e(t tVar, long j10, c9.e eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (tVar.f13728c >= j10 && !tVar.c()) {
                return tVar;
            }
            Object obj = d.f13696a.get(tVar);
            i3.u uVar = f13689b;
            if (obj == uVar) {
                return uVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) eVar.invoke(Long.valueOf(tVar.f13728c + 1), tVar);
                do {
                    atomicReferenceFieldUpdater = d.f13696a;
                    if (atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                        if (tVar.c()) {
                            tVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(tVar) == null);
            }
            tVar = tVar2;
        }
    }

    public static final String f(int i10) {
        d7.a.n(16);
        String string = Integer.toString(i10, 16);
        d7.a.l(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    public static final boolean g(AssertionError assertionError) {
        String message;
        Logger logger = ja.v.f8575a;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !l9.i.F0(message, "getsockname failed", false)) ? false : true;
    }

    public static final ka.g h(a0 a0Var) throws IOException {
        Long lValueOf;
        int iY = a0Var.y();
        if (iY != 33639248) {
            throw new IOException("bad zip: expected " + f(33639248) + " but was " + f(iY));
        }
        a0Var.l(4L);
        short sB = a0Var.b();
        int i10 = sB & 65535;
        if ((sB & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + f(i10));
        }
        int iB = a0Var.b() & 65535;
        short sB2 = a0Var.b();
        int i11 = sB2 & 65535;
        short sB3 = a0Var.b();
        int i12 = sB3 & 65535;
        if (i11 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i12 >> 9) & 127) + 1980, ((i12 >> 5) & 15) - 1, sB3 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (sB2 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l10 = lValueOf;
        a0Var.y();
        d9.t tVar = new d9.t();
        tVar.f4951a = ((long) a0Var.y()) & 4294967295L;
        d9.t tVar2 = new d9.t();
        tVar2.f4951a = ((long) a0Var.y()) & 4294967295L;
        int iB2 = a0Var.b() & 65535;
        int iB3 = a0Var.b() & 65535;
        int iB4 = a0Var.b() & 65535;
        a0Var.l(8L);
        d9.t tVar3 = new d9.t();
        tVar3.f4951a = ((long) a0Var.y()) & 4294967295L;
        String strE = a0Var.e(iB2);
        if (l9.i.G0(strE, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = tVar2.f4951a == 4294967295L ? 8 : 0L;
        if (tVar.f4951a == 4294967295L) {
            j10 += (long) 8;
        }
        if (tVar3.f4951a == 4294967295L) {
            j10 += (long) 8;
        }
        long j11 = j10;
        d9.q qVar = new d9.q();
        i(a0Var, iB3, new ka.h(qVar, j11, tVar2, a0Var, tVar, tVar3));
        if (j11 > 0 && !qVar.f4948a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strE2 = a0Var.e(iB4);
        String str = ja.x.f8577b;
        return new ka.g(fa.l.i("/", false).d(strE), l9.i.H0(strE, "/", false), strE2, tVar.f4951a, tVar2.f4951a, iB, l10, tVar3.f4951a);
    }

    public static final void i(a0 a0Var, int i10, c9.e eVar) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iB = a0Var.b() & 65535;
            long jB = ((long) a0Var.b()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jB) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            a0Var.S(jB);
            ja.g gVar = a0Var.f8502b;
            long j12 = gVar.f8534b;
            eVar.invoke(Integer.valueOf(iB), Long.valueOf(jB));
            long j13 = (gVar.f8534b + jB) - j12;
            if (j13 < 0) {
                throw new IOException(l.q.g("unsupported zip: too many bytes processed for ", iB));
            }
            if (j13 > 0) {
                gVar.l(j13);
            }
            j10 = j11 - jB;
        }
    }

    public static final ja.l j(a0 a0Var, ja.l lVar) throws IOException {
        d9.u uVar = new d9.u();
        uVar.f4952a = lVar != null ? lVar.f8555f : null;
        d9.u uVar2 = new d9.u();
        d9.u uVar3 = new d9.u();
        int iY = a0Var.y();
        if (iY != 67324752) {
            throw new IOException("bad zip: expected " + f(67324752) + " but was " + f(iY));
        }
        a0Var.l(2L);
        short sB = a0Var.b();
        int i10 = sB & 65535;
        if ((sB & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + f(i10));
        }
        a0Var.l(18L);
        long jB = ((long) a0Var.b()) & 65535;
        int iB = a0Var.b() & 65535;
        a0Var.l(jB);
        if (lVar == null) {
            a0Var.l(iB);
            return null;
        }
        i(a0Var, iB, new s1(a0Var, uVar, uVar2, uVar3));
        return new ja.l(lVar.f8550a, lVar.f8551b, null, lVar.f8553d, (Long) uVar3.f4952a, (Long) uVar.f4952a, (Long) uVar2.f4952a);
    }

    public static final void k(u8.j jVar, Object obj) {
        if (obj == f13693f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object objE = jVar.e(null, w.f13732c);
            d7.a.k(objE, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a7.a.w(objE);
            throw null;
        }
        y yVar = (y) obj;
        z1[] z1VarArr = yVar.f13738b;
        int length = z1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        z1 z1Var = z1VarArr[length];
        d7.a.j(null);
        Object obj2 = yVar.f13737a[length];
        throw null;
    }

    public static final void l(u8.e eVar, Object obj, c9.c cVar) {
        Object uVar;
        if (!(eVar instanceof h)) {
            eVar.resumeWith(obj);
            return;
        }
        h hVar = (h) eVar;
        Throwable thA = q8.h.a(obj);
        if (thA == null) {
            uVar = cVar != null ? new m9.v(cVar, obj) : obj;
        } else {
            uVar = new m9.u(thA, false);
        }
        u8.e eVar2 = hVar.f13703e;
        eVar2.getContext();
        m9.z zVar = hVar.f13702d;
        if (zVar.d0()) {
            hVar.f13704f = uVar;
            hVar.f11963c = 1;
            zVar.c0(eVar2.getContext(), hVar);
            return;
        }
        w0 w0VarA = a2.a();
        if (w0VarA.j0()) {
            hVar.f13704f = uVar;
            hVar.f11963c = 1;
            w0VarA.g0(hVar);
            return;
        }
        w0VarA.i0(true);
        try {
            f1 f1Var = (f1) eVar2.getContext().f(m9.a0.f11902b);
            if (f1Var == null || f1Var.b()) {
                Object obj2 = hVar.f13705n;
                u8.j context = eVar2.getContext();
                Object objT = t(context, obj2);
                g2 g2VarT0 = objT != f13693f ? z6.a.t0(eVar2, context, objT) : null;
                try {
                    eVar2.resumeWith(obj);
                    if (g2VarT0 == null || g2VarT0.l0()) {
                        k(context, objT);
                    }
                } catch (Throwable th) {
                    if (g2VarT0 == null || g2VarT0.l0()) {
                        k(context, objT);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionH = ((p1) f1Var).H();
                hVar.c(uVar, cancellationExceptionH);
                hVar.resumeWith(d7.t.N(cancellationExceptionH));
            }
            while (w0VarA.l0()) {
            }
        } catch (Throwable th2) {
            try {
                hVar.h(th2, null);
            } finally {
                w0VarA.f0(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int m(d0 d0Var, int i10) {
        int i11;
        d7.a.m(d0Var, "<this>");
        int i12 = i10 + 1;
        int length = d0Var.f8528e.length;
        int[] iArr = d0Var.f8529f;
        d7.a.m(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (i14 <= i13) {
            i11 = (i14 + i13) >>> 1;
            int i15 = iArr[i11];
            if (i15 < i12) {
                i14 = i11 + 1;
            } else {
                if (i15 <= i12) {
                    if (i11 >= 0) {
                        return i11;
                    }
                    return ~i11;
                }
                i13 = i11 - 1;
            }
        }
        i11 = (-i14) - 1;
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }

    public static final ja.b n(Socket socket) throws IOException {
        Logger logger = ja.v.f8575a;
        f0 f0Var = new f0(socket);
        OutputStream outputStream = socket.getOutputStream();
        d7.a.l(outputStream, "getOutputStream(...)");
        return new ja.b(f0Var, new ja.b(outputStream, f0Var));
    }

    public static final ja.c o(InputStream inputStream) {
        Logger logger = ja.v.f8575a;
        d7.a.m(inputStream, "<this>");
        return new ja.c(inputStream, new i0());
    }

    public static final ja.c p(Socket socket) throws IOException {
        Logger logger = ja.v.f8575a;
        f0 f0Var = new f0(socket);
        InputStream inputStream = socket.getInputStream();
        d7.a.l(inputStream, "getInputStream(...)");
        return new ja.c(f0Var, new ja.c(inputStream, f0Var));
    }

    public static final long q(String str, long j10, long j11, long j12) {
        String property;
        int i10 = v.f13730a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        Long lE0 = l9.h.E0(property);
        if (lE0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lE0.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int r(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) q(str, i10, i11, i12);
    }

    public static final Object s(u8.j jVar) {
        Object objE = jVar.e(0, w.f13731b);
        d7.a.j(objE);
        return objE;
    }

    public static final Object t(u8.j jVar, Object obj) {
        if (obj == null) {
            obj = s(jVar);
        }
        if (obj == 0) {
            return f13693f;
        }
        if (obj instanceof Integer) {
            return jVar.e(new y(jVar, ((Number) obj).intValue()), w.f13733d);
        }
        a7.a.w(obj);
        throw null;
    }
}
