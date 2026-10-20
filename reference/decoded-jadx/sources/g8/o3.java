package g8;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class o3 extends WeakReference {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f7016f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final RuntimeException f7017g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f7018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f7019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SoftReference f7021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7022e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f7017g = runtimeException;
    }

    public o3(p3 p3Var, l3 l3Var, ReferenceQueue referenceQueue, ConcurrentHashMap concurrentHashMap) {
        super(p3Var, referenceQueue);
        this.f7022e = new AtomicBoolean();
        this.f7021d = new SoftReference(f7016f ? new RuntimeException("ManagedChannel allocation site") : f7017g);
        this.f7020c = l3Var.toString();
        this.f7018a = referenceQueue;
        this.f7019b = concurrentHashMap;
        concurrentHashMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            o3 o3Var = (o3) referenceQueue.poll();
            if (o3Var == null) {
                return;
            }
            SoftReference softReference = o3Var.f7021d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            o3Var.f7019b.remove(o3Var);
            softReference.clear();
            if (!o3Var.f7022e.get()) {
                Level level = Level.SEVERE;
                Logger logger = p3.f7036e;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{o3Var.f7020c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f7019b.remove(this);
        this.f7021d.clear();
        a(this.f7018a);
    }
}
