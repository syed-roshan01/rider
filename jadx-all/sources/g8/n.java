package g8;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f6967c = Logger.getLogger(n.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f6969b;

    public n(long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f6969b = atomicLong;
        y3.e.G("value must be positive", j10 > 0);
        this.f6968a = "keepalive time nanos";
        atomicLong.set(j10);
    }
}
