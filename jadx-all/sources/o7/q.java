package o7;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.protobuf.g0 implements com.google.protobuf.u1 {
    public final void c(Map map) {
        copyOnWrite();
        s.g((s) this.instance).putAll(map);
    }

    public final void d(String str) {
        copyOnWrite();
        s.f((s) this.instance, str);
    }

    public final void e(com.google.protobuf.q2 q2Var) {
        copyOnWrite();
        s.h((s) this.instance, q2Var);
    }
}
