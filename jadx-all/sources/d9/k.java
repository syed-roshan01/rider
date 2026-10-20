package d9;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends p implements j9.d {
    @Override // d9.c
    public final j9.a a() {
        v.f4953a.getClass();
        return this;
    }

    public final void f() {
        if (this.f4947n) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        j9.a aVarD = d();
        if (aVarD == this) {
            throw new q8.e("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((k) ((j9.d) ((j9.f) aVarD))).f();
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        ((l) this).f();
        throw null;
    }
}
