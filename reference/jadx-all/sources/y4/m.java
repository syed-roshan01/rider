package y4;

import a5.i0;
import a5.z;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;

/* JADX INFO: loaded from: classes.dex */
public final class m implements d8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16932b;

    public m(n nVar, int i10) {
        this.f16931a = nVar;
        this.f16932b = i10;
    }

    @Override // p8.a
    public final Object get() {
        n nVar = this.f16931a;
        int i10 = this.f16932b;
        if (i10 == 0) {
            return new z4.d(ApplicationContextModule_ProvideContextFactory.provideContext(nVar.f16933a), (z4.b) nVar.f16935c.get());
        }
        if (i10 == 1) {
            return new z4.b(ApplicationContextModule_ProvideContextFactory.provideContext(nVar.f16933a));
        }
        if (i10 == 2) {
            return new a5.j();
        }
        if (i10 == 3) {
            return new z();
        }
        if (i10 == 4) {
            return new i0();
        }
        throw new AssertionError(i10);
    }
}
