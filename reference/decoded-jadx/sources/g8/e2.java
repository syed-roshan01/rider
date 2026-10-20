package g8;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e2 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f6741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f6742b;

    public e2(f2 f2Var, h0 h0Var) {
        this.f6742b = f2Var;
        this.f6741a = h0Var;
    }

    @Override // g8.z5
    public final void a(int i10) {
        this.f6741a.a(i10);
    }

    @Override // g8.h0
    public final void b(int i10) {
        this.f6741a.b(i10);
    }

    @Override // g8.z5
    public final void c(boolean z10) {
        this.f6741a.c(z10);
    }

    @Override // g8.z5
    public final void d(e8.s sVar) {
        this.f6741a.d(sVar);
    }

    @Override // g8.h0
    public final void e(int i10) {
        this.f6741a.e(i10);
    }

    @Override // g8.h0
    public final void f(u uVar) {
        this.f6741a.f(uVar);
    }

    @Override // g8.z5
    public final void flush() {
        this.f6741a.flush();
    }

    @Override // g8.h0
    public final void g(e8.c0 c0Var) {
        this.f6741a.g(c0Var);
    }

    @Override // g8.h0
    public final void h(e8.e0 e0Var) {
        this.f6741a.h(e0Var);
    }

    @Override // g8.h0
    public final void i(e8.c2 c2Var) {
        this.f6741a.i(c2Var);
    }

    @Override // g8.h0
    public final void j(j0 j0Var) {
        y yVar = this.f6742b.f6760b;
        yVar.f7241b.a();
        ((k4) yVar.f7240a).a();
        this.f6741a.j(new d2(this, j0Var));
    }

    @Override // g8.z5
    public final boolean k() {
        return this.f6741a.k();
    }

    @Override // g8.z5
    public final void l(InputStream inputStream) {
        this.f6741a.l(inputStream);
    }

    @Override // g8.h0
    public final void m(String str) {
        this.f6741a.m(str);
    }

    @Override // g8.z5
    public final void n() {
        this.f6741a.n();
    }

    @Override // g8.h0
    public final void o() {
        this.f6741a.o();
    }

    @Override // g8.h0
    public final e8.c p() {
        return this.f6741a.p();
    }

    @Override // g8.h0
    public final void q(boolean z10) {
        this.f6741a.q(z10);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f6741a, "delegate");
        return gVarJ0.toString();
    }
}
