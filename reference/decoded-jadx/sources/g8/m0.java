package g8;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface m0 extends Closeable {
    ScheduledExecutorService L();

    o0 a0(SocketAddress socketAddress, l0 l0Var, i2 i2Var);
}
