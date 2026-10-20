package k4;

import ja.a0;
import ja.x;
import java.io.Closeable;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f9770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja.m f9771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Closeable f9773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f9775f;

    public n(x xVar, ja.m mVar, String str, Closeable closeable) {
        this.f9770a = xVar;
        this.f9771b = mVar;
        this.f9772c = str;
        this.f9773d = closeable;
    }

    @Override // k4.o
    public final d0 a() {
        return null;
    }

    @Override // k4.o
    public final synchronized ja.i b() {
        if (!(!this.f9774e)) {
            throw new IllegalStateException("closed".toString());
        }
        a0 a0Var = this.f9775f;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0VarC = r9.a.c(this.f9771b.l(this.f9770a));
        this.f9775f = a0VarC;
        return a0VarC;
    }

    @Override // k4.o, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f9774e = true;
            a0 a0Var = this.f9775f;
            if (a0Var != null) {
                w4.e.a(a0Var);
            }
            Closeable closeable = this.f9773d;
            if (closeable != null) {
                w4.e.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
