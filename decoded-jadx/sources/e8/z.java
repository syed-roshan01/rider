package e8;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f5405a;

    static {
        a0 i2Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            i2Var = (a0) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(a0.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e4) {
            atomicReference.set(e4);
            i2Var = new i2();
        } catch (Exception e10) {
            throw new RuntimeException("Storage override failed to initialize", e10);
        }
        f5405a = i2Var;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            b0.f5198a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
