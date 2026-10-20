package i3;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.bundle.BundleReader;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7984d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i10) {
        this.f7981a = i10;
        this.f7982b = obj;
        this.f7983c = obj2;
        this.f7984d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7981a) {
            case 0:
                j.a aVar = (j.a) this.f7982b;
                h6.g gVar = (h6.g) this.f7983c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f7984d;
                aVar.getClass();
                try {
                    y yVarR = o7.d0.r(aVar.f8194a);
                    if (yVarR == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    x xVar = (x) yVarR.f7965a;
                    synchronized (xVar.f8007d) {
                        xVar.f8009f = threadPoolExecutor;
                        break;
                    }
                    yVarR.f7965a.a(new o(gVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    gVar.t0(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ((AsyncEventListener) this.f7982b).lambda$onEvent$0(this.f7983c, (FirebaseFirestoreException) this.f7984d);
                return;
            case 2:
                ((FirestoreClient) this.f7982b).lambda$loadBundle$19((BundleReader) this.f7983c, (LoadBundleTask) this.f7984d);
                return;
            case 3:
                ((FirestoreClient) this.f7982b).lambda$getNamedQuery$20((String) this.f7983c, (TaskCompletionSource) this.f7984d);
                return;
            case 4:
                ((FirestoreClient) this.f7982b).lambda$write$12((List) this.f7983c, (TaskCompletionSource) this.f7984d);
                return;
            case 5:
                AsyncQueue.lambda$callTask$1((Callable) this.f7982b, (Executor) this.f7983c, (TaskCompletionSource) this.f7984d);
                return;
            case 6:
                AsyncQueue.lambda$runSync$4((Runnable) this.f7982b, (Throwable[]) this.f7983c, (Semaphore) this.f7984d);
                return;
            default:
                ConfigGetParameterHandler.lambda$callListeners$0((e6.a) this.f7982b, (String) this.f7983c, (ConfigContainer) this.f7984d);
                return;
        }
    }
}
