package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements q8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.b f2205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f2206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.a f2207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.a f2208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x0 f2209e;

    public y0(d9.e eVar, c5.h hVar, c5.h hVar2, u.r0 r0Var) {
        this.f2205a = eVar;
        this.f2206b = hVar;
        this.f2207c = hVar2;
        this.f2208d = r0Var;
    }

    @Override // q8.c
    public final Object getValue() {
        x0 x0Var = this.f2209e;
        if (x0Var != null) {
            return x0Var;
        }
        e1 e1Var = new e1((f1) this.f2206b.invoke(), (b1) this.f2207c.invoke(), (q3.c) this.f2208d.invoke());
        j9.b bVar = this.f2205a;
        d7.a.m(bVar, "<this>");
        Class clsA = ((d9.d) bVar).a();
        d7.a.k(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        x0 x0VarA = e1Var.a(clsA);
        this.f2209e = x0VarA;
        return x0VarA;
    }
}
