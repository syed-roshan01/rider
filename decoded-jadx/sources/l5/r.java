package l5;

import java.util.concurrent.Executor;
import k6.y5;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11365b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f11364a = i10;
        this.f11365b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f11364a;
        Object obj = this.f11365b;
        switch (i10) {
            case 0:
                ((Executor) obj).execute(new q(runnable));
                break;
            default:
                ((y5) obj).zzl().u(runnable);
                break;
        }
    }
}
