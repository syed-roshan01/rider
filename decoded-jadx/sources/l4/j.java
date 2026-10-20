package l4;

import ja.a0;
import ja.t;
import ja.x;
import ja.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable, Flushable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l9.d f11298x = new l9.d("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f11299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f11301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f11302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f11303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f11304f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r9.e f11305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ja.h f11308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f11314w;

    public j(t tVar, x xVar, t9.c cVar, long j10) {
        this.f11299a = xVar;
        this.f11300b = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f11301c = xVar.d("journal");
        this.f11302d = xVar.d("journal.tmp");
        this.f11303e = xVar.d("journal.bkp");
        this.f11304f = new LinkedHashMap(0, 0.75f, true);
        this.f11305n = d7.a.b(d7.a.A(d7.t.k(), cVar.e0(1)));
        this.f11314w = new h(tVar);
    }

    public static void T(String str) {
        if (f11298x.a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public static final void a(j jVar, e eVar, boolean z10) {
        synchronized (jVar) {
            f fVar = (f) eVar.f11281b;
            if (!d7.a.d(fVar.f11290g, eVar)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!z10 || fVar.f11289f) {
                for (int i10 = 0; i10 < 2; i10++) {
                    jVar.f11314w.e((x) fVar.f11287d.get(i10));
                }
            } else {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (((boolean[]) eVar.f11282c)[i11] && !jVar.f11314w.f((x) fVar.f11287d.get(i11))) {
                        eVar.d(false);
                        return;
                    }
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    x xVar = (x) fVar.f11287d.get(i12);
                    x xVar2 = (x) fVar.f11286c.get(i12);
                    if (jVar.f11314w.f(xVar)) {
                        jVar.f11314w.b(xVar, xVar2);
                    } else {
                        h hVar = jVar.f11314w;
                        x xVar3 = (x) fVar.f11286c.get(i12);
                        if (!hVar.f(xVar3)) {
                            w4.e.a(hVar.k(xVar3));
                        }
                    }
                    long j10 = fVar.f11285b[i12];
                    Long l10 = jVar.f11314w.h(xVar2).f8553d;
                    long jLongValue = l10 != null ? l10.longValue() : 0L;
                    fVar.f11285b[i12] = jLongValue;
                    jVar.f11306o = (jVar.f11306o - j10) + jLongValue;
                }
            }
            fVar.f11290g = null;
            if (fVar.f11289f) {
                jVar.P(fVar);
                return;
            }
            jVar.f11307p++;
            ja.h hVar2 = jVar.f11308q;
            d7.a.j(hVar2);
            if (z10 || fVar.f11288e) {
                fVar.f11288e = true;
                hVar2.V("CLEAN");
                hVar2.C(32);
                hVar2.V(fVar.f11284a);
                for (long j11 : fVar.f11285b) {
                    hVar2.C(32).W(j11);
                }
                hVar2.C(10);
            } else {
                jVar.f11304f.remove(fVar.f11284a);
                hVar2.V("REMOVE");
                hVar2.C(32);
                hVar2.V(fVar.f11284a);
                hVar2.C(10);
            }
            hVar2.flush();
            if (jVar.f11306o > jVar.f11300b || jVar.f11307p >= 2000) {
                jVar.p();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    public final void M() throws Throwable {
        q8.l lVar;
        a0 a0VarC = r9.a.c(this.f11314w.l(this.f11301c));
        Throwable th = null;
        try {
            String strK = a0VarC.K(Long.MAX_VALUE);
            String strK2 = a0VarC.K(Long.MAX_VALUE);
            String strK3 = a0VarC.K(Long.MAX_VALUE);
            String strK4 = a0VarC.K(Long.MAX_VALUE);
            String strK5 = a0VarC.K(Long.MAX_VALUE);
            if (!d7.a.d("libcore.io.DiskLruCache", strK) || !d7.a.d("1", strK2) || !d7.a.d(String.valueOf(1), strK3) || !d7.a.d(String.valueOf(2), strK4) || strK5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strK + ", " + strK2 + ", " + strK3 + ", " + strK4 + ", " + strK5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    O(a0VarC.K(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f11307p = i10 - this.f11304f.size();
                    if (a0VarC.B()) {
                        this.f11308q = q();
                    } else {
                        c0();
                    }
                    lVar = q8.l.f13235a;
                    try {
                        a0VarC.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    d7.a.j(lVar);
                }
            }
        } catch (Throwable th3) {
            try {
                a0VarC.close();
            } catch (Throwable th4) {
                d7.a.c(th3, th4);
            }
            th = th3;
            lVar = null;
            if (th == null) {
                throw th;
            }
            d7.a.j(lVar);
        }
    }

    public final void O(String str) throws IOException {
        String strSubstring;
        int iO0 = l9.i.O0(str, ' ', 0, false, 6);
        if (iO0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iO0 + 1;
        int iO1 = l9.i.O0(str, ' ', i10, false, 4);
        LinkedHashMap linkedHashMap = this.f11304f;
        if (iO1 == -1) {
            strSubstring = str.substring(i10);
            d7.a.l(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iO0 == 6 && l9.i.h1(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iO1);
            d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        }
        Object fVar = linkedHashMap.get(strSubstring);
        if (fVar == null) {
            fVar = new f(this, strSubstring);
            linkedHashMap.put(strSubstring, fVar);
        }
        f fVar2 = (f) fVar;
        if (iO1 == -1 || iO0 != 5 || !l9.i.h1(str, "CLEAN", false)) {
            if (iO1 == -1 && iO0 == 5 && l9.i.h1(str, "DIRTY", false)) {
                fVar2.f11290g = new e(this, fVar2);
                return;
            } else {
                if (iO1 != -1 || iO0 != 4 || !l9.i.h1(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iO1 + 1);
        d7.a.l(strSubstring2, "this as java.lang.String).substring(startIndex)");
        List listF1 = l9.i.f1(strSubstring2, new char[]{' '});
        fVar2.f11288e = true;
        fVar2.f11290g = null;
        int size = listF1.size();
        fVar2.f11292i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listF1);
        }
        try {
            int size2 = listF1.size();
            for (int i11 = 0; i11 < size2; i11++) {
                fVar2.f11285b[i11] = Long.parseLong((String) listF1.get(i11));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listF1);
        }
    }

    public final void P(f fVar) {
        ja.h hVar;
        int i10 = fVar.f11291h;
        String str = fVar.f11284a;
        if (i10 > 0 && (hVar = this.f11308q) != null) {
            hVar.V("DIRTY");
            hVar.C(32);
            hVar.V(str);
            hVar.C(10);
            hVar.flush();
        }
        if (fVar.f11291h > 0 || fVar.f11290g != null) {
            fVar.f11289f = true;
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.f11314w.e((x) fVar.f11286c.get(i11));
            long j10 = this.f11306o;
            long[] jArr = fVar.f11285b;
            this.f11306o = j10 - jArr[i11];
            jArr[i11] = 0;
        }
        this.f11307p++;
        ja.h hVar2 = this.f11308q;
        if (hVar2 != null) {
            hVar2.V("REMOVE");
            hVar2.C(32);
            hVar2.V(str);
            hVar2.C(10);
        }
        this.f11304f.remove(str);
        if (this.f11307p >= 2000) {
            p();
        }
    }

    public final void Q() {
        while (this.f11306o > this.f11300b) {
            for (f fVar : this.f11304f.values()) {
                if (!fVar.f11289f) {
                    P(fVar);
                }
            }
            return;
        }
        this.f11312u = false;
    }

    public final void b() {
        if (!(!this.f11311t)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized void c0() {
        q8.l lVar;
        try {
            ja.h hVar = this.f11308q;
            if (hVar != null) {
                hVar.close();
            }
            z zVarB = r9.a.b(this.f11314w.k(this.f11302d));
            Throwable th = null;
            try {
                zVarB.V("libcore.io.DiskLruCache");
                zVarB.C(10);
                zVarB.V("1");
                zVarB.C(10);
                zVarB.W(1);
                zVarB.C(10);
                zVarB.W(2);
                zVarB.C(10);
                zVarB.C(10);
                for (f fVar : this.f11304f.values()) {
                    if (fVar.f11290g != null) {
                        zVarB.V("DIRTY");
                        zVarB.C(32);
                        zVarB.V(fVar.f11284a);
                        zVarB.C(10);
                    } else {
                        zVarB.V("CLEAN");
                        zVarB.C(32);
                        zVarB.V(fVar.f11284a);
                        for (long j10 : fVar.f11285b) {
                            zVarB.C(32);
                            zVarB.W(j10);
                        }
                        zVarB.C(10);
                    }
                }
                lVar = q8.l.f13235a;
                try {
                    zVarB.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    zVarB.close();
                } catch (Throwable th4) {
                    d7.a.c(th3, th4);
                }
                lVar = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            d7.a.j(lVar);
            if (this.f11314w.f(this.f11301c)) {
                this.f11314w.b(this.f11301c, this.f11303e);
                this.f11314w.b(this.f11302d, this.f11301c);
                this.f11314w.e(this.f11303e);
            } else {
                this.f11314w.b(this.f11302d, this.f11301c);
            }
            this.f11308q = q();
            this.f11307p = 0;
            this.f11309r = false;
            this.f11313v = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f11310s && !this.f11311t) {
                for (f fVar : (f[]) this.f11304f.values().toArray(new f[0])) {
                    e eVar = fVar.f11290g;
                    if (eVar != null) {
                        Object obj = eVar.f11281b;
                        if (d7.a.d(((f) obj).f11290g, eVar)) {
                            ((f) obj).f11289f = true;
                        }
                    }
                }
                Q();
                d7.a.i(this.f11305n, null);
                ja.h hVar = this.f11308q;
                d7.a.j(hVar);
                hVar.close();
                this.f11308q = null;
                this.f11311t = true;
                return;
            }
            this.f11311t = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized e e(String str) {
        try {
            b();
            T(str);
            g();
            f fVar = (f) this.f11304f.get(str);
            if ((fVar != null ? fVar.f11290g : null) != null) {
                return null;
            }
            if (fVar != null && fVar.f11291h != 0) {
                return null;
            }
            if (!this.f11312u && !this.f11313v) {
                ja.h hVar = this.f11308q;
                d7.a.j(hVar);
                hVar.V("DIRTY");
                hVar.C(32);
                hVar.V(str);
                hVar.C(10);
                hVar.flush();
                if (this.f11309r) {
                    return null;
                }
                if (fVar == null) {
                    fVar = new f(this, str);
                    this.f11304f.put(str, fVar);
                }
                e eVar = new e(this, fVar);
                fVar.f11290g = eVar;
                return eVar;
            }
            p();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized g f(String str) {
        g gVarA;
        b();
        T(str);
        g();
        f fVar = (f) this.f11304f.get(str);
        if (fVar != null && (gVarA = fVar.a()) != null) {
            this.f11307p++;
            ja.h hVar = this.f11308q;
            d7.a.j(hVar);
            hVar.V("READ");
            hVar.C(32);
            hVar.V(str);
            hVar.C(10);
            if (this.f11307p >= 2000) {
                p();
            }
            return gVarA;
        }
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f11310s) {
            b();
            Q();
            ja.h hVar = this.f11308q;
            d7.a.j(hVar);
            hVar.flush();
        }
    }

    public final synchronized void g() {
        try {
            if (this.f11310s) {
                return;
            }
            this.f11314w.e(this.f11302d);
            if (this.f11314w.f(this.f11303e)) {
                if (this.f11314w.f(this.f11301c)) {
                    this.f11314w.e(this.f11303e);
                } else {
                    this.f11314w.b(this.f11303e, this.f11301c);
                }
            }
            if (this.f11314w.f(this.f11301c)) {
                try {
                    M();
                    u();
                    this.f11310s = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        y3.e.a0(this.f11314w, this.f11299a);
                        this.f11311t = false;
                        c0();
                        this.f11310s = true;
                    } catch (Throwable th) {
                        this.f11311t = false;
                        throw th;
                    }
                }
            }
            c0();
            this.f11310s = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void p() {
        z6.a.Q(this.f11305n, null, 0, new i(this, null), 3);
    }

    public final z q() {
        h hVar = this.f11314w;
        hVar.getClass();
        x xVar = this.f11301c;
        d7.a.m(xVar, "file");
        return r9.a.b(new k(hVar.f11296b.a(xVar), new h1.b(this, 12)));
    }

    public final void u() {
        Iterator it = this.f11304f.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            f fVar = (f) it.next();
            int i10 = 0;
            if (fVar.f11290g == null) {
                while (i10 < 2) {
                    j10 += fVar.f11285b[i10];
                    i10++;
                }
            } else {
                fVar.f11290g = null;
                while (i10 < 2) {
                    x xVar = (x) fVar.f11286c.get(i10);
                    h hVar = this.f11314w;
                    hVar.e(xVar);
                    hVar.e((x) fVar.f11287d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f11306o = j10;
    }
}
