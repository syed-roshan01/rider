package x9;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.r f16344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f16345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f16348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f16349f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k4.o f16350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f16351o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f16352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f16353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f16354r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f16355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ba.d f16356t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f16357u;

    public b0(l.r rVar, x xVar, String str, int i10, o oVar, q qVar, k4.o oVar2, b0 b0Var, b0 b0Var2, b0 b0Var3, long j10, long j11, ba.d dVar) {
        this.f16344a = rVar;
        this.f16345b = xVar;
        this.f16346c = str;
        this.f16347d = i10;
        this.f16348e = oVar;
        this.f16349f = qVar;
        this.f16350n = oVar2;
        this.f16351o = b0Var;
        this.f16352p = b0Var2;
        this.f16353q = b0Var3;
        this.f16354r = j10;
        this.f16355s = j11;
        this.f16356t = dVar;
    }

    public static String b(b0 b0Var, String str) {
        b0Var.getClass();
        String strE = b0Var.f16349f.e(str);
        if (strE == null) {
            return null;
        }
        return strE;
    }

    public final c a() {
        c cVar = this.f16357u;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = c.f16358n;
        c cVarL = q8.k.l(this.f16349f);
        this.f16357u = cVarL;
        return cVarL;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        k4.o oVar = this.f16350n;
        if (oVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        oVar.close();
    }

    public final a0 e() {
        a0 a0Var = new a0();
        a0Var.f16330a = this.f16344a;
        a0Var.f16331b = this.f16345b;
        a0Var.f16332c = this.f16347d;
        a0Var.f16333d = this.f16346c;
        a0Var.f16334e = this.f16348e;
        a0Var.f16335f = this.f16349f.k();
        a0Var.f16336g = this.f16350n;
        a0Var.f16337h = this.f16351o;
        a0Var.f16338i = this.f16352p;
        a0Var.f16339j = this.f16353q;
        a0Var.f16340k = this.f16354r;
        a0Var.f16341l = this.f16355s;
        a0Var.f16342m = this.f16356t;
        return a0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.f16345b + ", code=" + this.f16347d + ", message=" + this.f16346c + ", url=" + ((s) this.f16344a.f10910b) + '}';
    }
}
