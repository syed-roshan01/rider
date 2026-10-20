.class public final Landroidx/concurrent/futures/h;
.super Landroidx/concurrent/futures/a;


# virtual methods
.method public final a(Landroidx/concurrent/futures/j;Landroidx/concurrent/futures/e;Landroidx/concurrent/futures/e;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Landroidx/concurrent/futures/j;->listeners:Landroidx/concurrent/futures/e;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Landroidx/concurrent/futures/j;->listeners:Landroidx/concurrent/futures/e;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final b(Landroidx/concurrent/futures/j;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Landroidx/concurrent/futures/j;->value:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Landroidx/concurrent/futures/j;->value:Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final c(Landroidx/concurrent/futures/j;Landroidx/concurrent/futures/i;Landroidx/concurrent/futures/i;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Landroidx/concurrent/futures/j;->waiters:Landroidx/concurrent/futures/i;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Landroidx/concurrent/futures/j;->waiters:Landroidx/concurrent/futures/i;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final d(Landroidx/concurrent/futures/i;Landroidx/concurrent/futures/i;)V
    .locals 0

    iput-object p2, p1, Landroidx/concurrent/futures/i;->b:Landroidx/concurrent/futures/i;

    return-void
.end method

.method public final e(Landroidx/concurrent/futures/i;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Landroidx/concurrent/futures/i;->a:Ljava/lang/Thread;

    return-void
.end method
