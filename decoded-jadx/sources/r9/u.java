package r9;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13729a = 0;

    static {
        Object objN;
        Object objN2;
        Exception exc = new Exception();
        String simpleName = f6.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objN = w8.a.class.getCanonicalName();
        } catch (Throwable th) {
            objN = d7.t.N(th);
        }
        if (q8.h.a(objN) != null) {
            objN = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objN2 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            objN2 = d7.t.N(th2);
        }
        if (q8.h.a(objN2) != null) {
            objN2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
