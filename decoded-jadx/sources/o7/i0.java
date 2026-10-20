package o7;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends com.google.protobuf.g0 implements com.google.protobuf.u1 {
    public final boolean c(String str) {
        str.getClass();
        return ((k0) this.instance).i().containsKey(str);
    }

    public final void d(Map map) {
        copyOnWrite();
        k0.f((k0) this.instance).putAll(map);
    }

    public final void e(i2 i2Var, String str) {
        str.getClass();
        i2Var.getClass();
        copyOnWrite();
        k0.f((k0) this.instance).put(str, i2Var);
    }

    public final void f(String str) {
        copyOnWrite();
        k0.f((k0) this.instance).remove(str);
    }
}
