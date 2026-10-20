package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1765a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i10) {
        super(str);
        this.f1765a = i10;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f1765a) {
            case 0:
                synchronized (this) {
                }
                return this;
            default:
                synchronized (this) {
                }
                return this;
        }
    }
}
