.class public final synthetic Li3/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Li3/n;->a:I

    iput-object p1, p0, Li3/n;->b:Ljava/lang/Object;

    iput-object p2, p0, Li3/n;->c:Ljava/lang/Object;

    iput-object p3, p0, Li3/n;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Li3/n;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li3/n;->b:Ljava/lang/Object;

    check-cast v0, Le6/a;

    iget-object v1, p0, Li3/n;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Li3/n;->d:Ljava/lang/Object;

    check-cast v2, Lcom/google/firebase/remoteconfig/internal/ConfigContainer;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/remoteconfig/internal/ConfigGetParameterHandler;->a(Le6/a;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/ConfigContainer;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Li3/n;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    iget-object v1, p0, Li3/n;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Throwable;

    iget-object v2, p0, Li3/n;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/Semaphore;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/firestore/util/AsyncQueue;->g(Ljava/lang/Runnable;[Ljava/lang/Throwable;Ljava/util/concurrent/Semaphore;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Li3/n;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Callable;

    iget-object v1, p0, Li3/n;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v2, p0, Li3/n;->d:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/firestore/util/AsyncQueue;->e(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Li3/n;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/core/FirestoreClient;

    iget-object v1, p0, Li3/n;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Li3/n;->d:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/firestore/core/FirestoreClient;->f(Lcom/google/firebase/firestore/core/FirestoreClient;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Li3/n;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/core/FirestoreClient;

    iget-object v1, p0, Li3/n;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Li3/n;->d:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/firestore/core/FirestoreClient;->h(Lcom/google/firebase/firestore/core/FirestoreClient;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Li3/n;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/core/FirestoreClient;

    iget-object v1, p0, Li3/n;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/firestore/bundle/BundleReader;

    iget-object v2, p0, Li3/n;->d:Ljava/lang/Object;

    check-cast v2, Lcom/google/firebase/firestore/LoadBundleTask;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/firestore/core/FirestoreClient;->x(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/firebase/firestore/bundle/BundleReader;Lcom/google/firebase/firestore/LoadBundleTask;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Li3/n;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/core/AsyncEventListener;

    iget-object v1, p0, Li3/n;->d:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/firestore/FirebaseFirestoreException;

    iget-object v2, p0, Li3/n;->c:Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lcom/google/firebase/firestore/core/AsyncEventListener;->a(Lcom/google/firebase/firestore/core/AsyncEventListener;Ljava/lang/Object;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Li3/n;->b:Ljava/lang/Object;

    check-cast v0, Lj/a;

    iget-object v1, p0, Li3/n;->c:Ljava/lang/Object;

    check-cast v1, Lh6/g;

    iget-object v2, p0, Li3/n;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, v0, Lj/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lo7/d0;->r(Landroid/content/Context;)Li3/y;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v3, v0, Li3/h;->a:Li3/k;

    check-cast v3, Li3/x;

    iget-object v4, v3, Li3/x;->d:Ljava/lang/Object;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object v2, v3, Li3/x;->f:Ljava/util/concurrent/Executor;

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, v0, Li3/h;->a:Li3/k;

    new-instance v3, Li3/o;

    invoke-direct {v3, v1, v2}, Li3/o;-><init>(Lh6/g;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v3}, Li3/k;->a(Lh6/g;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    invoke-virtual {v1, v0}, Lh6/g;->t0(Ljava/lang/Throwable;)V

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
