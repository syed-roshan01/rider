package ka;

import d7.t;
import fa.l;
import ja.j;
import ja.x;
import java.io.EOFException;
import java.util.ArrayList;
import l.q;
import r8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f10655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f10656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f10657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f10658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f10659e;

    static {
        j jVar = j.f8539d;
        f10655a = l.h("/");
        f10656b = l.h("\\");
        f10657c = l.h("/\\");
        f10658d = l.h(".");
        f10659e = l.h("..");
    }

    public static final int a(x xVar) {
        if (xVar.f8578a.d() == 0) {
            return -1;
        }
        j jVar = xVar.f8578a;
        if (jVar.i(0) != 47) {
            if (jVar.i(0) != 92) {
                if (jVar.d() <= 2 || jVar.i(1) != 58 || jVar.i(2) != 92) {
                    return -1;
                }
                char cI = (char) jVar.i(0);
                return (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) ? -1 : 3;
            }
            if (jVar.d() > 2 && jVar.i(1) == 92) {
                j jVar2 = f10656b;
                d7.a.m(jVar2, "other");
                int iF = jVar.f(2, jVar2.f8540a);
                return iF == -1 ? jVar.d() : iF;
            }
        }
        return 1;
    }

    public static final x b(x xVar, x xVar2, boolean z10) {
        d7.a.m(xVar, "<this>");
        d7.a.m(xVar2, "child");
        if (a(xVar2) != -1 || xVar2.g() != null) {
            return xVar2;
        }
        j jVarC = c(xVar);
        if (jVarC == null && (jVarC = c(xVar2)) == null) {
            jVarC = f(x.f8577b);
        }
        ja.g gVar = new ja.g();
        gVar.e0(xVar.f8578a);
        if (gVar.f8534b > 0) {
            gVar.e0(jVarC);
        }
        gVar.e0(xVar2.f8578a);
        return d(gVar, z10);
    }

    public static final j c(x xVar) {
        j jVar = xVar.f8578a;
        j jVar2 = f10655a;
        if (j.g(jVar, jVar2) != -1) {
            return jVar2;
        }
        j jVar3 = f10656b;
        if (j.g(xVar.f8578a, jVar3) != -1) {
            return jVar3;
        }
        return null;
    }

    public static final x d(ja.g gVar, boolean z10) throws EOFException {
        j jVar;
        char cF;
        j jVar2;
        j jVarI;
        ja.g gVar2 = new ja.g();
        j jVarE = null;
        int i10 = 0;
        while (true) {
            if (!gVar.q(f10655a)) {
                jVar = f10656b;
                if (!gVar.q(jVar)) {
                    break;
                }
            }
            byte b10 = gVar.readByte();
            if (jVarE == null) {
                jVarE = e(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && d7.a.d(jVarE, jVar);
        j jVar3 = f10657c;
        if (z11) {
            d7.a.j(jVarE);
            gVar2.e0(jVarE);
            gVar2.e0(jVarE);
        } else if (i10 > 0) {
            d7.a.j(jVarE);
            gVar2.e0(jVarE);
        } else {
            long jP = gVar.p(jVar3);
            if (jVarE == null) {
                jVarE = jP == -1 ? f(x.f8577b) : e(gVar.f(jP));
            }
            if (d7.a.d(jVarE, jVar) && gVar.f8534b >= 2 && gVar.f(1L) == 58 && (('a' <= (cF = (char) gVar.f(0L)) && cF < '{') || ('A' <= cF && cF < '['))) {
                if (jP == 2) {
                    gVar2.b0(gVar, 3L);
                } else {
                    gVar2.b0(gVar, 2L);
                }
            }
        }
        boolean z12 = gVar2.f8534b > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zB = gVar.B();
            jVar2 = f10658d;
            if (zB) {
                break;
            }
            long jP2 = gVar.p(jVar3);
            if (jP2 == -1) {
                jVarI = gVar.i(gVar.f8534b);
            } else {
                jVarI = gVar.i(jP2);
                gVar.readByte();
            }
            j jVar4 = f10659e;
            if (d7.a.d(jVarI, jVar4)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || d7.a.d(p.L0(arrayList), jVar4)))) {
                        arrayList.add(jVarI);
                    } else if (!z11 || arrayList.size() != 1) {
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(t.Y(arrayList));
                        }
                    }
                }
            } else if (!d7.a.d(jVarI, jVar2) && !d7.a.d(jVarI, j.f8539d)) {
                arrayList.add(jVarI);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                gVar2.e0(jVarE);
            }
            gVar2.e0((j) arrayList.get(i11));
        }
        if (gVar2.f8534b == 0) {
            gVar2.e0(jVar2);
        }
        return new x(gVar2.i(gVar2.f8534b));
    }

    public static final j e(byte b10) {
        if (b10 == 47) {
            return f10655a;
        }
        if (b10 == 92) {
            return f10656b;
        }
        throw new IllegalArgumentException(q.g("not a directory separator: ", b10));
    }

    public static final j f(String str) {
        if (d7.a.d(str, "/")) {
            return f10655a;
        }
        if (d7.a.d(str, "\\")) {
            return f10656b;
        }
        throw new IllegalArgumentException(q.x("not a directory separator: ", str));
    }
}
