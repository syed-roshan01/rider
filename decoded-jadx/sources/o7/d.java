package o7;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.protobuf.g0 implements f {
    @Override // o7.f
    public final List a() {
        return Collections.unmodifiableList(((e) this.instance).a());
    }

    public final void c(List list) {
        copyOnWrite();
        e.g((e) this.instance, list);
    }

    public final void d(i2 i2Var) {
        copyOnWrite();
        e.f((e) this.instance, i2Var);
    }

    public final i2 e(int i10) {
        return ((e) this.instance).j(i10);
    }

    public final int f() {
        return ((e) this.instance).k();
    }

    public final void g(int i10) {
        copyOnWrite();
        e.h((e) this.instance, i10);
    }
}
