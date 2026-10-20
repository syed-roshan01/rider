package com.google.firebase.firestore.remote;

import android.content.Context;
import androidx.fragment.app.a0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import e8.c1;
import e8.d1;
import e8.e1;
import e8.f1;
import e8.k;
import e8.p1;
import e8.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import u1.n0;

/* JADX INFO: loaded from: classes.dex */
public class GrpcCallProvider {
    private static final int CONNECTIVITY_ATTEMPT_TIMEOUT_MS = 15000;
    private static final String LOG_TAG = "GrpcCallProvider";
    private static Supplier<d1> overrideChannelBuilderSupplier;
    private final AsyncQueue asyncQueue;
    private e8.h callOptions;
    private Task<c1> channelTask;
    private AsyncQueue.DelayedTask connectivityAttemptTimer;
    private final Context context;
    private final DatabaseInfo databaseInfo;
    private final e8.f firestoreHeaders;

    public GrpcCallProvider(AsyncQueue asyncQueue, Context context, DatabaseInfo databaseInfo, e8.f fVar) {
        this.asyncQueue = asyncQueue;
        this.context = context;
        this.databaseInfo = databaseInfo;
        this.firestoreHeaders = fVar;
        initChannelTask();
    }

    private void clearConnectivityAttemptTimer() {
        if (this.connectivityAttemptTimer != null) {
            Logger.debug(LOG_TAG, "Clearing the connectivityAttemptTimer", new Object[0]);
            this.connectivityAttemptTimer.cancel();
            this.connectivityAttemptTimer = null;
        }
    }

    private c1 initChannel(Context context, DatabaseInfo databaseInfo) {
        e1 e1Var;
        f1 f1Var;
        List list;
        d1 d1Var;
        try {
            l6.a.a(context);
        } catch (IllegalStateException | z5.g | z5.h e4) {
            Logger.warn(LOG_TAG, "Failed to update ssl context: %s", e4);
        }
        Supplier<d1> supplier = overrideChannelBuilderSupplier;
        if (supplier != null) {
            d1Var = supplier.get();
        } else {
            String host = databaseInfo.getHost();
            java.util.logging.Logger logger = f1.f5240c;
            synchronized (f1.class) {
                try {
                    e1Var = null;
                    if (f1.f5241d == null) {
                        List<e1> listS = z6.a.S(e1.class, f1.a(), e1.class.getClassLoader(), new r7.e(e1Var));
                        f1.f5241d = new f1();
                        for (e1 e1Var2 : listS) {
                            f1.f5240c.fine("Service loader found " + e1Var2);
                            f1 f1Var2 = f1.f5241d;
                            synchronized (f1Var2) {
                                y3.e.G("isAvailable() returned false", e1Var2.b());
                                f1Var2.f5242a.add(e1Var2);
                            }
                        }
                        f1 f1Var3 = f1.f5241d;
                        synchronized (f1Var3) {
                            ArrayList arrayList = new ArrayList(f1Var3.f5242a);
                            Collections.sort(arrayList, Collections.reverseOrder(new n0(f1Var3, 1)));
                            f1Var3.f5243b = Collections.unmodifiableList(arrayList);
                        }
                    }
                    f1Var = f1.f5241d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (f1Var) {
                list = f1Var.f5243b;
            }
            e1Var = list.isEmpty() ? null : (e1) list.get(0);
            if (e1Var == null) {
                throw new a0("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
            }
            d1 d1VarA = e1Var.a(host);
            if (!databaseInfo.isSslEnabled()) {
                d1VarA.c();
            }
            d1Var = d1VarA;
        }
        d1Var.b(TimeUnit.SECONDS);
        f8.c cVar = new f8.c(d1Var);
        cVar.f6387b = context;
        return cVar.a();
    }

    private void initChannelTask() {
        this.channelTask = Tasks.call(Executors.BACKGROUND_EXECUTOR, new Callable() { // from class: com.google.firebase.firestore.remote.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3858a.lambda$initChannelTask$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$createClientCall$0(p1 p1Var, Task task) {
        return Tasks.forResult(((c1) task.getResult()).m(p1Var, this.callOptions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c1 lambda$initChannelTask$6() {
        c1 c1VarInitChannel = initChannel(this.context, this.databaseInfo);
        this.asyncQueue.enqueueAndForget(new f(this, c1VarInitChannel, 1));
        e8.h hVarC = e8.h.f5266k.c(m8.b.f11899a, m8.a.f11897a);
        y3.e.J(c1VarInitChannel, "channel");
        e8.f fVar = this.firestoreHeaders;
        e8.g gVarB = e8.h.b(hVarC);
        gVarB.f5251d = fVar;
        e8.h hVar = new e8.h(gVarB);
        Executor executor = this.asyncQueue.getExecutor();
        e8.g gVarB2 = e8.h.b(hVar);
        gVarB2.f5249b = executor;
        this.callOptions = new e8.h(gVarB2);
        Logger.debug(LOG_TAG, "Channel successfully reset.", new Object[0]);
        return c1VarInitChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$1(c1 c1Var) {
        Logger.debug(LOG_TAG, "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        clearConnectivityAttemptTimer();
        resetChannel(c1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$3(c1 c1Var) {
        this.asyncQueue.enqueueAndForget(new f(this, c1Var, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetChannel$4(c1 c1Var) {
        c1Var.x();
        initChannelTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onConnectivityStateChange, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$onConnectivityStateChange$2(c1 c1Var) {
        x xVarU = c1Var.u();
        Logger.debug(LOG_TAG, "Current gRPC connectivity state: " + xVarU, new Object[0]);
        clearConnectivityAttemptTimer();
        if (xVarU == x.f5394a) {
            Logger.debug(LOG_TAG, "Setting the connectivityAttemptTimer", new Object[0]);
            this.connectivityAttemptTimer = this.asyncQueue.enqueueAfterDelay(AsyncQueue.TimerId.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new f(this, c1Var, 2));
        }
        c1Var.v(xVarU, new f(this, c1Var, 3));
    }

    private void resetChannel(c1 c1Var) {
        this.asyncQueue.enqueueAndForget(new f(this, c1Var, 0));
    }

    public <ReqT, RespT> Task<k> createClientCall(p1 p1Var) {
        return this.channelTask.continueWithTask(this.asyncQueue.getExecutor(), new d(1, this, p1Var));
    }

    public void shutdown() {
        try {
            c1 c1Var = (c1) Tasks.await(this.channelTask);
            c1Var.w();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (c1Var.s(1L, timeUnit)) {
                    return;
                }
                Logger.debug("FirestoreChannel", "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                c1Var.x();
                if (c1Var.s(60L, timeUnit)) {
                    return;
                }
                Logger.warn("FirestoreChannel", "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
            } catch (InterruptedException unused) {
                c1Var.x();
                Logger.warn("FirestoreChannel", "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused2) {
            Logger.warn("FirestoreChannel", "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e4) {
            Logger.warn("FirestoreChannel", "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e4);
        }
    }
}
