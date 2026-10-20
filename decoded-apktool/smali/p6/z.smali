.class public final Lp6/z;
.super Lp6/w;


# instance fields
.field public final synthetic n:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic o:Lp6/w;

.field public final synthetic p:Lp6/c;


# direct methods
.method public constructor <init>(Lp6/c;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lp6/w;)V
    .locals 0

    iput-object p1, p0, Lp6/z;->p:Lp6/c;

    iput-object p3, p0, Lp6/z;->n:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lp6/z;->o:Lp6/w;

    invoke-direct {p0, p2}, Lp6/w;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Lp6/z;->p:Lp6/c;

    iget-object v0, v0, Lp6/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp6/z;->p:Lp6/c;

    iget-object v2, p0, Lp6/z;->n:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v3, v1, Lp6/c;->e:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v3

    new-instance v4, Lp6/x;

    invoke-direct {v4, v1, v2}, Lp6/x;-><init>(Lp6/c;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lp6/z;->p:Lp6/c;

    iget-object v1, v1, Lp6/c;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lp6/z;->p:Lp6/c;

    iget-object v1, v1, Lp6/c;->b:Lp6/v;

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lp6/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lp6/z;->p:Lp6/c;

    iget-object v2, p0, Lp6/z;->o:Lp6/w;

    invoke-static {v1, v2}, Lp6/c;->b(Lp6/c;Lp6/w;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
