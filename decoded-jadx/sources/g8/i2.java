package g8;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends e8.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e8.q0 f6849d;

    @Override // e8.i
    public final void a(int i10, String str) {
        e8.q0 q0Var = this.f6849d;
        Level levelG = z.g(i10);
        if (b0.f6654c.isLoggable(levelG)) {
            b0.a(q0Var, levelG, str);
        }
    }

    @Override // e8.i
    public final void b(int i10, String str, Object... objArr) {
        e8.q0 q0Var = this.f6849d;
        Level levelG = z.g(i10);
        if (b0.f6654c.isLoggable(levelG)) {
            b0.a(q0Var, levelG, MessageFormat.format(str, objArr));
        }
    }
}
