package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import p7.r;
import p7.s;
import p7.t;

/* JADX INFO: loaded from: classes.dex */
public final class d extends v7.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f3977v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final t f3978w = new t("closed");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f3979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f3980t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p7.p f3981u;

    public d() {
        super(f3977v);
        this.f3979s = new ArrayList();
        this.f3981u = r.f12844a;
    }

    @Override // v7.b
    public final v7.b M() {
        i0(r.f12844a);
        return this;
    }

    @Override // v7.b
    public final void Q(double d10) {
        if (this.f15959e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            i0(new t(Double.valueOf(d10)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
    }

    @Override // v7.b
    public final void T(long j10) {
        i0(new t(Long.valueOf(j10)));
    }

    @Override // v7.b
    public final void b() {
        p7.o oVar = new p7.o();
        i0(oVar);
        this.f3979s.add(oVar);
    }

    @Override // v7.b
    public final void c0(Boolean bool) {
        if (bool == null) {
            i0(r.f12844a);
        } else {
            i0(new t(bool));
        }
    }

    @Override // v7.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f3979s;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f3978w);
    }

    @Override // v7.b
    public final void d0(Number number) {
        if (number == null) {
            i0(r.f12844a);
            return;
        }
        if (!this.f15959e) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        i0(new t(number));
    }

    @Override // v7.b
    public final void e() {
        s sVar = new s();
        i0(sVar);
        this.f3979s.add(sVar);
    }

    @Override // v7.b
    public final void e0(String str) {
        if (str == null) {
            i0(r.f12844a);
        } else {
            i0(new t(str));
        }
    }

    @Override // v7.b
    public final void f0(boolean z10) {
        i0(new t(Boolean.valueOf(z10)));
    }

    @Override // v7.b, java.io.Flushable
    public final void flush() {
    }

    @Override // v7.b
    public final void g() {
        ArrayList arrayList = this.f3979s;
        if (arrayList.isEmpty() || this.f3980t != null) {
            throw new IllegalStateException();
        }
        if (!(h0() instanceof p7.o)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public final p7.p h0() {
        return (p7.p) a7.a.k(this.f3979s, 1);
    }

    public final void i0(p7.p pVar) {
        if (this.f3980t != null) {
            if (!(pVar instanceof r) || this.f15962o) {
                s sVar = (s) h0();
                sVar.f12845a.put(this.f3980t, pVar);
            }
            this.f3980t = null;
            return;
        }
        if (this.f3979s.isEmpty()) {
            this.f3981u = pVar;
            return;
        }
        p7.p pVarH0 = h0();
        if (!(pVarH0 instanceof p7.o)) {
            throw new IllegalStateException();
        }
        ((p7.o) pVarH0).f12843a.add(pVar);
    }

    @Override // v7.b
    public final void p() {
        ArrayList arrayList = this.f3979s;
        if (arrayList.isEmpty() || this.f3980t != null) {
            throw new IllegalStateException();
        }
        if (!(h0() instanceof s)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // v7.b
    public final void q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f3979s.isEmpty() || this.f3980t != null) {
            throw new IllegalStateException();
        }
        if (!(h0() instanceof s)) {
            throw new IllegalStateException();
        }
        this.f3980t = str;
    }
}
