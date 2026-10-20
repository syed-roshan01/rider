package m;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f11437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11438c;

    public c(String str) {
        this.f11436a = 1;
        this.f11438c = Executors.defaultThreadFactory();
        if (str == null) {
            throw new NullPointerException("Name must not be null");
        }
        this.f11437b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.f11436a;
        Serializable serializable = this.f11437b;
        switch (i10) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) serializable).getAndIncrement());
                return thread;
            default:
                Thread threadNewThread = ((ThreadFactory) this.f11438c).newThread(new q(runnable, 0));
                threadNewThread.setName((String) serializable);
                return threadNewThread;
        }
    }

    public c(e eVar) {
        this.f11436a = 0;
        this.f11438c = eVar;
        this.f11437b = new AtomicInteger(0);
    }
}
