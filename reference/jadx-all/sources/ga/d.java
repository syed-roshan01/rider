package ga;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7318a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i10;
        int iMin;
        d7.a.m(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f7316a;
        String loggerName = logRecord.getLoggerName();
        d7.a.l(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i10 = 5;
        } else {
            i10 = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        d7.a.l(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strP1 = (String) c.f7317b.get(loggerName);
        if (strP1 == null) {
            strP1 = l9.j.p1(23, loggerName);
        }
        if (Log.isLoggable(strP1, i10)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iO0 = l9.i.O0(message, '\n', i11, false, 4);
                if (iO0 == -1) {
                    iO0 = length;
                }
                while (true) {
                    iMin = Math.min(iO0, i11 + 4000);
                    String strSubstring = message.substring(i11, iMin);
                    d7.a.l(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strP1, strSubstring);
                    if (iMin >= iO0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }
}
