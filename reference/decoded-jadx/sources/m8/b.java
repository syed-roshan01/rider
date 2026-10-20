package m8;

import java.io.Serializable;
import java.util.logging.Logger;
import v6.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11899a;

    static {
        Logger.getLogger(b.class.getName());
        if (!f6.a.Y(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f11899a = new d(8, "internal-stub-type", (Serializable) null);
    }
}
