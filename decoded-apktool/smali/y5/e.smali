.class public final synthetic Ly5/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Ly5/c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public synthetic constructor <init>(Ly5/c;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/e;->a:Ly5/c;

    iput-object p2, p0, Ly5/e;->b:Ljava/lang/String;

    iput-object p3, p0, Ly5/e;->c:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object p1, p0, Ly5/e;->a:Ly5/c;

    iget-object v0, p0, Ly5/e;->b:Ljava/lang/String;

    iget-object v1, p0, Ly5/e;->c:Ljava/util/concurrent/ScheduledFuture;

    iget-object v2, p1, Ly5/c;->a:Lq/z;

    monitor-enter v2

    :try_start_0
    iget-object p1, p1, Ly5/c;->a:Lq/z;

    invoke-virtual {p1, v0}, Lq/z;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-interface {v1, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
