.class public abstract Lg8/v0;
.super Le8/k;


# static fields
.field public static final j:Le8/l;


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledFuture;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Le8/b0;

.field public volatile d:Z

.field public e:Le8/j;

.field public f:Le8/k;

.field public g:Le8/c2;

.field public h:Ljava/util/List;

.field public i:Lg8/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lg8/v0;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    new-instance v0, Le8/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg8/v0;->j:Le8/l;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lg8/j3;Le8/c0;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg8/v0;->h:Ljava/util/List;

    const-string v0, "callExecutor"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/v0;->b:Ljava/util/concurrent/Executor;

    const-string p1, "scheduler"

    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Le8/b0;->b()Le8/b0;

    move-result-object p1

    iput-object p1, p0, Lg8/v0;->c:Le8/b0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p3, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, p1}, Le8/c0;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    sget-object p3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1

    invoke-virtual {p3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v6

    div-long/2addr v2, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v6

    invoke-virtual {p3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    rem-long/2addr v6, v4

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-gez v4, :cond_1

    const-string v4, "ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for "

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v4, "Deadline CallOptions will be exceeded in "

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p3, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, ".%09d"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "s. "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Lg8/x1;

    const/4 v3, 0x3

    invoke-direct {v2, v3, p0, p3}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p2, Lg8/j3;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p2, v2, v0, v1, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lg8/v0;->a:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public final a(Le8/c2;Z)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/v0;->f:Le8/k;

    const/4 v1, 0x1

    if-nez v0, :cond_2

    sget-object p2, Lg8/v0;->j:Le8/l;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const-string v3, "realCall already set to %s"

    invoke-static {v0, v3, v1}, Ly3/e;->M(Ljava/lang/Object;Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/v0;->a:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    iput-object p2, p0, Lg8/v0;->f:Le8/k;

    iget-object p2, p0, Lg8/v0;->e:Le8/j;

    iput-object p1, p0, Lg8/v0;->g:Le8/c2;

    move v1, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    if-eqz p2, :cond_3

    monitor-exit p0

    return-void

    :cond_3
    const/4 p2, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    new-instance p2, Lg8/x1;

    const/4 v0, 0x4

    invoke-direct {p2, v0, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lg8/v0;->b(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_4
    if-eqz p2, :cond_5

    iget-object v0, p0, Lg8/v0;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lg8/d0;

    invoke-direct {v1, p0, p2, p1}, Lg8/d0;-><init>(Lg8/v0;Le8/j;Le8/c2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_5
    invoke-virtual {p0}, Lg8/v0;->c()V

    :goto_2
    move-object p1, p0

    check-cast p1, Lg8/h3;

    iget-object p2, p1, Lg8/h3;->n:Lg8/i3;

    iget-object p2, p2, Lg8/i3;->d:Lg8/l3;

    iget-object p2, p2, Lg8/l3;->m:Le8/h2;

    new-instance v0, Lg8/t0;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b(Ljava/lang/Runnable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lg8/v0;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lg8/v0;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lg8/v0;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lg8/v0;->h:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/v0;->d:Z

    iget-object v0, p0, Lg8/v0;->i:Lg8/u0;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg8/v0;->b:Ljava/util/concurrent/Executor;

    new-instance v2, Lg8/c0;

    invoke-direct {v2, p0, v0}, Lg8/c0;-><init>(Lg8/v0;Lg8/u0;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :try_start_1
    iget-object v1, p0, Lg8/v0;->h:Ljava/util/List;

    iput-object v0, p0, Lg8/v0;->h:Ljava/util/List;

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->clear()V

    move-object v0, v1

    goto :goto_0

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final cancel(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Le8/c2;->f:Le8/c2;

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "Call cancelled without message"

    invoke-virtual {v0, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p1, p2}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lg8/v0;->a(Le8/c2;Z)V

    return-void
.end method

.method public final getAttributes()Le8/c;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/v0;->f:Le8/k;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le8/k;->getAttributes()Le8/c;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Le8/c;->b:Le8/c;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final halfClose()V
    .locals 2

    new-instance v0, Lg8/t0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/v0;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final isReady()Z
    .locals 1

    iget-boolean v0, p0, Lg8/v0;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/v0;->f:Le8/k;

    invoke-virtual {v0}, Le8/k;->isReady()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final request(I)V
    .locals 2

    iget-boolean v0, p0, Lg8/v0;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/v0;->f:Le8/k;

    invoke-virtual {v0, p1}, Le8/k;->request(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/internal/c0;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/common/api/internal/c0;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {p0, v0}, Lg8/v0;->b(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final sendMessage(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lg8/v0;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/v0;->f:Le8/k;

    invoke-virtual {v0, p1}, Le8/k;->sendMessage(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/x1;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lg8/v0;->b(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final setMessageCompression(Z)V
    .locals 2

    iget-boolean v0, p0, Lg8/v0;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/v0;->f:Le8/k;

    invoke-virtual {v0, p1}, Le8/k;->setMessageCompression(Z)V

    goto :goto_0

    :cond_0
    new-instance v0, Lk6/m4;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0, p1}, Lk6/m4;-><init>(ILjava/lang/Object;Z)V

    invoke-virtual {p0, v0}, Lg8/v0;->b(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final start(Le8/j;Le8/l1;)V
    .locals 3

    iget-object v0, p0, Lg8/v0;->e:Le8/j;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "already started"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    monitor-enter p0

    :try_start_0
    const-string v0, "listener"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/v0;->e:Le8/j;

    iget-object v0, p0, Lg8/v0;->g:Le8/c2;

    iget-boolean v1, p0, Lg8/v0;->d:Z

    if-nez v1, :cond_1

    new-instance v2, Lg8/u0;

    invoke-direct {v2, p1}, Lg8/u0;-><init>(Le8/j;)V

    iput-object v2, p0, Lg8/v0;->i:Lg8/u0;

    move-object p1, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    iget-object p2, p0, Lg8/v0;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lg8/d0;

    invoke-direct {v1, p0, p1, v0}, Lg8/d0;-><init>(Lg8/v0;Le8/j;Le8/c2;)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    if-eqz v1, :cond_3

    iget-object v0, p0, Lg8/v0;->f:Le8/k;

    invoke-virtual {v0, p1, p2}, Le8/k;->start(Le8/j;Le8/l1;)V

    goto :goto_2

    :cond_3
    new-instance v0, Ly2/a;

    const/16 v1, 0x12

    invoke-direct {v0, p0, p1, p2, v1}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/v0;->b(Ljava/lang/Runnable;)V

    :goto_2
    return-void

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "realCall"

    iget-object v2, p0, Lg8/v0;->f:Le8/k;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
