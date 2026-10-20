package ja;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f8577b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f8578a;

    static {
        String str = File.separator;
        d7.a.l(str, "separator");
        f8577b = str;
    }

    public x(j jVar) {
        d7.a.m(jVar, "bytes");
        this.f8578a = jVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = ka.c.a(this);
        j jVar = this.f8578a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < jVar.d() && jVar.i(iA) == 92) {
            iA++;
        }
        int iD = jVar.d();
        int i10 = iA;
        while (iA < iD) {
            if (jVar.i(iA) == 47 || jVar.i(iA) == 92) {
                arrayList.add(jVar.p(i10, iA));
                i10 = iA + 1;
            }
            iA++;
        }
        if (i10 < jVar.d()) {
            arrayList.add(jVar.p(i10, jVar.d()));
        }
        return arrayList;
    }

    public final x b() {
        j jVar = ka.c.f10658d;
        j jVar2 = this.f8578a;
        if (d7.a.d(jVar2, jVar)) {
            return null;
        }
        j jVar3 = ka.c.f10655a;
        if (d7.a.d(jVar2, jVar3)) {
            return null;
        }
        j jVar4 = ka.c.f10656b;
        if (d7.a.d(jVar2, jVar4)) {
            return null;
        }
        j jVar5 = ka.c.f10659e;
        jVar2.getClass();
        d7.a.m(jVar5, "suffix");
        int iD = jVar2.d();
        byte[] bArr = jVar5.f8540a;
        if (jVar2.m(iD - bArr.length, jVar5, bArr.length) && (jVar2.d() == 2 || jVar2.m(jVar2.d() - 3, jVar3, 1) || jVar2.m(jVar2.d() - 3, jVar4, 1))) {
            return null;
        }
        int iK = j.k(jVar2, jVar3);
        if (iK == -1) {
            iK = j.k(jVar2, jVar4);
        }
        if (iK == 2 && g() != null) {
            if (jVar2.d() == 3) {
                return null;
            }
            return new x(j.q(jVar2, 0, 3, 1));
        }
        if (iK == 1 && jVar2.o(jVar4)) {
            return null;
        }
        if (iK != -1 || g() == null) {
            if (iK == -1) {
                return new x(jVar);
            }
            return iK == 0 ? new x(j.q(jVar2, 0, 1, 1)) : new x(j.q(jVar2, 0, iK, 1));
        }
        if (jVar2.d() == 2) {
            return null;
        }
        return new x(j.q(jVar2, 0, 2, 1));
    }

    public final x c(x xVar) {
        d7.a.m(xVar, "other");
        int iA = ka.c.a(this);
        j jVar = this.f8578a;
        x xVar2 = iA == -1 ? null : new x(jVar.p(0, iA));
        int iA2 = ka.c.a(xVar);
        j jVar2 = xVar.f8578a;
        if (!d7.a.d(xVar2, iA2 != -1 ? new x(jVar2.p(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + xVar).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = xVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i10 = 0;
        while (i10 < iMin && d7.a.d(arrayListA.get(i10), arrayListA2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && jVar.d() == jVar2.d()) {
            return fa.l.i(".", false);
        }
        if (arrayListA2.subList(i10, arrayListA2.size()).indexOf(ka.c.f10659e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + xVar).toString());
        }
        g gVar = new g();
        j jVarC = ka.c.c(xVar);
        if (jVarC == null && (jVarC = ka.c.c(this)) == null) {
            jVarC = ka.c.f(f8577b);
        }
        int size = arrayListA2.size();
        for (int i11 = i10; i11 < size; i11++) {
            gVar.e0(ka.c.f10659e);
            gVar.e0(jVarC);
        }
        int size2 = arrayListA.size();
        while (i10 < size2) {
            gVar.e0((j) arrayListA.get(i10));
            gVar.e0(jVarC);
            i10++;
        }
        return ka.c.d(gVar, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        d7.a.m(xVar, "other");
        return this.f8578a.compareTo(xVar.f8578a);
    }

    public final x d(String str) {
        d7.a.m(str, "child");
        g gVar = new g();
        gVar.n0(str);
        return ka.c.b(this, ka.c.d(gVar, false), false);
    }

    public final File e() {
        return new File(this.f8578a.t());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && d7.a.d(((x) obj).f8578a, this.f8578a);
    }

    public final Path f() {
        Path path = Paths.get(this.f8578a.t(), new String[0]);
        d7.a.l(path, "get(...)");
        return path;
    }

    public final Character g() {
        j jVar = ka.c.f10655a;
        j jVar2 = this.f8578a;
        if (j.g(jVar2, jVar) != -1 || jVar2.d() < 2 || jVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) jVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f8578a.hashCode();
    }

    public final String toString() {
        return this.f8578a.t();
    }
}
