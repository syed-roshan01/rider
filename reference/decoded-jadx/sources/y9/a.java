package y9;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f16998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16999b;

    public /* synthetic */ a(String str, boolean z10) {
        this.f16998a = str;
        this.f16999b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f16998a;
        d7.a.m(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f16999b);
        return thread;
    }
}
