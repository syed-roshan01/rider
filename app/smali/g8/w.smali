.class public final Lg8/w;
.super Lg8/m1;


# instance fields
.field public final a:Lg8/o0;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public volatile c:Le8/c2;

.field public d:Le8/c2;

.field public e:Le8/c2;

.field public final f:Lg8/u;

.field public final synthetic g:Lg8/x;


# direct methods
.method public constructor <init>(Lg8/x;Lg8/o0;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/w;->g:Lg8/x;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const v0, -0x7fffffff

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Lg8/u;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lg8/u;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lg8/w;->f:Lg8/u;

    const-string p1, "delegate"

    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lg8/w;->a:Lg8/o0;

    const-string p1, "authority"

    invoke-static {p3, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static h(Lg8/w;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lg8/w;->d:Le8/c2;

    iget-object v1, p0, Lg8/w;->e:Le8/c2;

    const/4 v2, 0x0

    iput-object v2, p0, Lg8/w;->d:Le8/c2;

    iput-object v2, p0, Lg8/w;->e:Le8/c2;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    invoke-super {p0, v0}, Lg8/m1;->f(Le8/c2;)V

    :cond_1
    if-eqz v1, :cond_2

    invoke-super {p0, v1}, Lg8/m1;->c(Le8/c2;)V

    :cond_2
    :goto_0
    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final c(Le8/c2;)V
    .locals 2

    const-string v0, "status"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gez v0, :cond_0

    iput-object p1, p0, Lg8/w;->c:Le8/c2;

    iget-object v0, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lg8/w;->e:Le8/c2;

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lg8/w;->e:Le8/c2;

    monitor-exit p0

    return-void

    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0, p1}, Lg8/m1;->c(Le8/c2;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;
    .locals 9

    iget-object v0, p3, Le8/h;->d:Le8/f;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg8/w;->g:Lg8/x;

    iget-object v0, v0, Lg8/x;->b:Le8/f;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lg8/w;->g:Lg8/x;

    iget-object v1, v1, Lg8/x;->b:Le8/f;

    if-eqz v1, :cond_1

    new-instance v2, Le8/v;

    invoke-direct {v2, v1, v0}, Le8/v;-><init>(Le8/f;Le8/f;)V

    move-object v0, v2

    :cond_1
    :goto_0
    if-eqz v0, :cond_4

    new-instance v8, Lg8/c4;

    iget-object v2, p0, Lg8/w;->a:Lg8/o0;

    iget-object v6, p0, Lg8/w;->f:Lg8/u;

    move-object v1, v8

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lg8/c4;-><init>(Lg8/o0;Le8/p1;Le8/l1;Le8/h;Lg8/u;[Le8/p;)V

    iget-object p1, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    if-lez p1, :cond_2

    iget-object p1, p0, Lg8/w;->f:Lg8/u;

    invoke-virtual {p1}, Lg8/u;->d()V

    new-instance p1, Lg8/j1;

    iget-object p2, p0, Lg8/w;->c:Le8/c2;

    invoke-direct {p1, p2, p4}, Lg8/j1;-><init>(Le8/c2;[Le8/p;)V

    return-object p1

    :cond_2
    new-instance p1, Lg8/v;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :try_start_0
    iget-object p2, p0, Lg8/w;->g:Lg8/x;

    iget-object p2, p2, Lg8/x;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, p1, p2, v8}, Le8/f;->applyRequestMetadata(Le8/e;Ljava/util/concurrent/Executor;Le8/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object p2, Le8/c2;->j:Le8/c2;

    const-string p3, "Credentials should use fail() instead of throwing exceptions"

    invoke-virtual {p2, p3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p2

    invoke-virtual {p2, p1}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    invoke-virtual {v8, p1}, Lg8/c4;->b(Le8/c2;)V

    :goto_1
    iget-object v0, v8, Lg8/c4;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object p1, v8, Lg8/c4;->i:Lg8/h0;

    if-nez p1, :cond_3

    new-instance p1, Lg8/d1;

    invoke-direct {p1}, Lg8/d1;-><init>()V

    iput-object p1, v8, Lg8/c4;->k:Lg8/d1;

    iput-object p1, v8, Lg8/c4;->i:Lg8/h0;

    monitor-exit v0

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_3
    monitor-exit v0

    :goto_2
    return-object p1

    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_4
    iget-object v0, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ltz v0, :cond_5

    new-instance p1, Lg8/j1;

    iget-object p2, p0, Lg8/w;->c:Le8/c2;

    invoke-direct {p1, p2, p4}, Lg8/j1;-><init>(Le8/c2;[Le8/p;)V

    return-object p1

    :cond_5
    iget-object v0, p0, Lg8/w;->a:Lg8/o0;

    invoke-interface {v0, p1, p2, p3, p4}, Lg8/k0;->d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;

    move-result-object p1

    return-object p1
.end method

.method public final f(Le8/c2;)V
    .locals 2

    const-string v0, "status"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gez v0, :cond_1

    iput-object p1, p0, Lg8/w;->c:Le8/c2;

    iget-object v0, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    iget-object v0, p0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lg8/w;->d:Le8/c2;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0, p1}, Lg8/m1;->f(Le8/c2;)V

    return-void

    :cond_1
    :try_start_1
    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final g()Lg8/o0;
    .locals 1

    iget-object v0, p0, Lg8/w;->a:Lg8/o0;

    return-object v0
.end method
