package o7;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends com.google.protobuf.g0 implements com.google.protobuf.u1 {
    public final void c(Map map) {
        copyOnWrite();
        g0.f((g0) this.instance).putAll(map);
    }

    public final void d(a2 a2Var) {
        copyOnWrite();
        g0.h((g0) this.instance, a2Var);
    }

    public final void e(String str) {
        copyOnWrite();
        g0.g((g0) this.instance, str);
    }

    public final void f(int i10) {
        copyOnWrite();
        g0.i((g0) this.instance, i10);
    }
}
