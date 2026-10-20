package i3;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class o extends h6.g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h6.g f7985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f7986v;

    public o(h6.g gVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f7985u = gVar;
        this.f7986v = threadPoolExecutor;
    }

    @Override // h6.g
    public final void t0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f7986v;
        try {
            this.f7985u.t0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // h6.g
    public final void u0(a0 a0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.f7986v;
        try {
            this.f7985u.u0(a0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
