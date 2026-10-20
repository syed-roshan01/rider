package g8;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f6654c = Logger.getLogger(e8.i.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6655a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.q0 f6656b;

    public b0(e8.q0 q0Var, long j10, String str) {
        y3.e.J(str, "description");
        this.f6656b = q0Var;
        String strConcat = str.concat(" created");
        e8.l0 l0Var = e8.l0.f5298a;
        Long lValueOf = Long.valueOf(j10);
        y3.e.J(strConcat, "description");
        y3.e.J(lValueOf, "timestampNanos");
        b(new e8.m0(strConcat, l0Var, lValueOf.longValue(), null, null));
    }

    public static void a(e8.q0 q0Var, Level level, String str) {
        Logger logger = f6654c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + q0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(e8.m0 m0Var) {
        Level level;
        int iOrdinal = m0Var.f5309b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.f6655a) {
        }
        a(this.f6656b, level, m0Var.f5308a);
    }
}
