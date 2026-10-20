package ka;

import fa.l;
import ja.e0;
import ja.g0;
import ja.m;
import ja.s;
import ja.t;
import ja.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import q8.i;
import r8.n;
import r8.p;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f10665e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f10666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f10667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f10668d;

    static {
        String str = x.f8577b;
        f10665e = l.i("/", false);
    }

    public f(ClassLoader classLoader) {
        t tVar = m.f8558a;
        d7.a.m(tVar, "systemFileSystem");
        this.f10666b = classLoader;
        this.f10667c = tVar;
        this.f10668d = new i(new z0(this, 16));
    }

    public static String m(x xVar) {
        x xVar2 = f10665e;
        xVar2.getClass();
        d7.a.m(xVar, "child");
        return c.b(xVar2, xVar, true).c(xVar2).f8578a.t();
    }

    @Override // ja.m
    public final e0 a(x xVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // ja.m
    public final void b(x xVar, x xVar2) throws IOException {
        d7.a.m(xVar, "source");
        d7.a.m(xVar2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // ja.m
    public final void c(x xVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // ja.m
    public final void d(x xVar) throws IOException {
        d7.a.m(xVar, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // ja.m
    public final List g(x xVar) throws FileNotFoundException {
        d7.a.m(xVar, "dir");
        String strM = m(xVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (q8.f fVar : (List) this.f10668d.getValue()) {
            m mVar = (m) fVar.f13225a;
            x xVar2 = (x) fVar.f13226b;
            try {
                List listG = mVar.g(xVar2.d(strM));
                ArrayList<x> arrayList = new ArrayList();
                for (Object obj : listG) {
                    if (l.b((x) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(f9.a.y0(arrayList));
                for (x xVar3 : arrayList) {
                    d7.a.m(xVar3, "<this>");
                    String strT = xVar2.f8578a.t();
                    x xVar4 = f10665e;
                    String strReplace = l9.i.a1(strT, xVar3.f8578a.t()).replace('\\', '/');
                    d7.a.l(strReplace, "replace(...)");
                    arrayList2.add(xVar4.d(strReplace));
                }
                n.A0(arrayList2, linkedHashSet);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return p.W0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + xVar);
    }

    @Override // ja.m
    public final ja.l i(x xVar) {
        d7.a.m(xVar, "path");
        if (!l.b(xVar)) {
            return null;
        }
        String strM = m(xVar);
        for (q8.f fVar : (List) this.f10668d.getValue()) {
            ja.l lVarI = ((m) fVar.f13225a).i(((x) fVar.f13226b).d(strM));
            if (lVarI != null) {
                return lVarI;
            }
        }
        return null;
    }

    @Override // ja.m
    public final s j(x xVar) throws FileNotFoundException {
        d7.a.m(xVar, "file");
        if (!l.b(xVar)) {
            throw new FileNotFoundException("file not found: " + xVar);
        }
        String strM = m(xVar);
        for (q8.f fVar : (List) this.f10668d.getValue()) {
            try {
                return ((m) fVar.f13225a).j(((x) fVar.f13226b).d(strM));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + xVar);
    }

    @Override // ja.m
    public final e0 k(x xVar) throws IOException {
        d7.a.m(xVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // ja.m
    public final g0 l(x xVar) throws FileNotFoundException {
        d7.a.m(xVar, "file");
        if (!l.b(xVar)) {
            throw new FileNotFoundException("file not found: " + xVar);
        }
        x xVar2 = f10665e;
        xVar2.getClass();
        InputStream resourceAsStream = this.f10666b.getResourceAsStream(c.b(xVar2, xVar, false).c(xVar2).f8578a.t());
        if (resourceAsStream != null) {
            return r9.a.o(resourceAsStream);
        }
        throw new FileNotFoundException("file not found: " + xVar);
    }
}
