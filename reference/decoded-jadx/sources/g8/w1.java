package g8;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7190c;

    public /* synthetic */ w1(Object obj, long j10, int i10) {
        this.f7188a = i10;
        this.f7190c = obj;
        this.f7189b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7188a;
        Object obj = this.f7190c;
        switch (i10) {
            case 0:
                ((o2) obj).getClass();
                break;
            default:
                u uVar = new u();
                g0 g0Var = (g0) obj;
                g0Var.f6779j.f(uVar);
                long j10 = this.f7189b;
                long jAbs = Math.abs(j10);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long nanos = jAbs / timeUnit.toNanos(1L);
                long jAbs2 = Math.abs(j10) % timeUnit.toNanos(1L);
                StringBuilder sb = new StringBuilder("deadline exceeded after ");
                if (j10 < 0) {
                    sb.append('-');
                }
                sb.append(nanos);
                sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
                sb.append("s. ");
                sb.append(uVar);
                g0Var.f6779j.i(e8.c2.f5219h.a(sb.toString()));
                break;
        }
    }
}
