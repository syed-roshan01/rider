.class public final Lg8/y0;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/u3;


# instance fields
.field public final a:Le8/q0;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Le8/h2;

.field public e:Lg8/w0;

.field public f:Lg8/w0;

.field public g:Ljava/lang/Runnable;

.field public h:Lg8/t3;

.field public i:Ljava/util/Collection;

.field public j:Le8/c2;

.field public k:Lz6/a;

.field public l:J


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Le8/h2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lg8/y0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le8/q0;->a(Ljava/lang/Class;Ljava/lang/String;)Le8/q0;

    move-result-object v0

    iput-object v0, p0, Lg8/y0;->a:Le8/q0;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg8/y0;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lg8/y0;->i:Ljava/util/Collection;

    iput-object p1, p0, Lg8/y0;->c:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg8/y0;->d:Le8/h2;

    return-void
.end method


# virtual methods
.method public final b()Le8/q0;
    .locals 1

    iget-object v0, p0, Lg8/y0;->a:Le8/q0;

    return-object v0
.end method

.method public final c(Le8/c2;)V
    .locals 6

    invoke-virtual {p0, p1}, Lg8/y0;->f(Le8/c2;)V

    iget-object v0, p0, Lg8/y0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg8/y0;->i:Ljava/util/Collection;

    iget-object v2, p0, Lg8/y0;->g:Ljava/lang/Runnable;

    const/4 v3, 0x0

    iput-object v3, p0, Lg8/y0;->g:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lg8/y0;->i:Ljava/util/Collection;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/x0;

    new-instance v3, Lg8/j1;

    sget-object v4, Lg8/i0;->b:Lg8/i0;

    iget-object v5, v1, Lg8/x0;->l:[Le8/p;

    invoke-direct {v3, p1, v4, v5}, Lg8/j1;-><init>(Le8/c2;Lg8/i0;[Le8/p;)V

    invoke-virtual {v1, v3}, Lg8/d1;->u(Lg8/h0;)Lg8/a1;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lg8/a1;->run()V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lg8/y0;->d:Le8/h2;

    invoke-virtual {p1, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    :cond_3
    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;
    .locals 6

    :try_start_0
    new-instance v0, Lg8/j4;

    invoke-direct {v0, p1, p2, p3}, Lg8/j4;-><init>(Le8/p1;Le8/l1;Le8/h;)V

    const/4 p1, 0x0

    const-wide/16 v1, -0x1

    :goto_0
    iget-object p2, p0, Lg8/y0;->b:Ljava/lang/Object;

    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, p0, Lg8/y0;->j:Le8/c2;

    if-eqz v3, :cond_0

    new-instance p1, Lg8/j1;

    sget-object p3, Lg8/i0;->a:Lg8/i0;

    invoke-direct {p1, v3, p3, p4}, Lg8/j1;-><init>(Le8/c2;Lg8/i0;[Le8/p;)V

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iget-object p2, p0, Lg8/y0;->d:Le8/h2;

    invoke-virtual {p2}, Le8/h2;->a()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :try_start_2
    iget-object v3, p0, Lg8/y0;->k:Lz6/a;

    if-nez v3, :cond_1

    invoke-virtual {p0, v0, p4}, Lg8/y0;->g(Lg8/j4;[Le8/p;)Lg8/x0;

    move-result-object p1

    monitor-exit p2

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    iget-wide v4, p0, Lg8/y0;->l:J

    cmp-long p1, v1, v4

    if-nez p1, :cond_2

    invoke-virtual {p0, v0, p4}, Lg8/y0;->g(Lg8/j4;[Le8/p;)Lg8/x0;

    move-result-object p1

    monitor-exit p2

    goto :goto_1

    :cond_2
    iget-wide v1, p0, Lg8/y0;->l:J

    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v3, v0}, Lz6/a;->Y(Lg8/j4;)Le8/v0;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v4, p3, Le8/h;->h:Ljava/lang/Boolean;

    invoke-virtual {p2, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p1, p2}, Lg8/s1;->f(Le8/v0;Z)Lg8/k0;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p2, v0, Lg8/j4;->c:Le8/p1;

    iget-object p3, v0, Lg8/j4;->b:Le8/l1;

    iget-object v0, v0, Lg8/j4;->a:Le8/h;

    invoke-interface {p1, p2, p3, v0, p4}, Lg8/k0;->d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_3
    move-object p1, v3

    goto :goto_0

    :goto_2
    :try_start_4
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_3
    iget-object p2, p0, Lg8/y0;->d:Le8/h2;

    invoke-virtual {p2}, Le8/h2;->a()V

    throw p1
.end method

.method public final e(Lg8/t3;)Ljava/lang/Runnable;
    .locals 2

    iput-object p1, p0, Lg8/y0;->h:Lg8/t3;

    new-instance v0, Lg8/w0;

    check-cast p1, Lg8/a3;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lg8/w0;-><init>(Lg8/a3;I)V

    iput-object v0, p0, Lg8/y0;->e:Lg8/w0;

    new-instance v0, Lg8/w0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lg8/w0;-><init>(Lg8/a3;I)V

    iput-object v0, p0, Lg8/y0;->f:Lg8/w0;

    new-instance v0, Lg8/w0;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lg8/w0;-><init>(Lg8/a3;I)V

    iput-object v0, p0, Lg8/y0;->g:Ljava/lang/Runnable;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final f(Le8/c2;)V
    .locals 4

    iget-object v0, p0, Lg8/y0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg8/y0;->j:Le8/c2;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lg8/y0;->j:Le8/c2;

    iget-object v1, p0, Lg8/y0;->d:Le8/h2;

    new-instance v2, Lg8/x1;

    const/16 v3, 0x8

    invoke-direct {v2, v3, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Le8/h2;->b(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lg8/y0;->h()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lg8/y0;->g:Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lg8/y0;->d:Le8/h2;

    invoke-virtual {v1, p1}, Le8/h2;->b(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lg8/y0;->g:Ljava/lang/Runnable;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lg8/y0;->d:Le8/h2;

    invoke-virtual {p1}, Le8/h2;->a()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final g(Lg8/j4;[Le8/p;)Lg8/x0;
    .locals 3

    new-instance v0, Lg8/x0;

    invoke-direct {v0, p0, p1, p2}, Lg8/x0;-><init>(Lg8/y0;Lg8/j4;[Le8/p;)V

    iget-object p1, p0, Lg8/y0;->i:Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lg8/y0;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, Lg8/y0;->i:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Lg8/y0;->d:Le8/h2;

    iget-object v1, p0, Lg8/y0;->e:Lg8/w0;

    invoke-virtual {p1, v1}, Le8/h2;->b(Ljava/lang/Runnable;)V

    :cond_0
    array-length p1, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    aget-object v2, p2, v1

    invoke-virtual {v2}, Le8/p;->o0()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Lg8/y0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg8/y0;->i:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final i(Lz6/a;)V
    .locals 11

    iget-object v0, p0, Lg8/y0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lg8/y0;->k:Lz6/a;

    iget-wide v1, p0, Lg8/y0;->l:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lg8/y0;->l:J

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lg8/y0;->h()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lg8/y0;->i:Ljava/util/Collection;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg8/x0;

    iget-object v3, v2, Lg8/x0;->j:Lg8/j4;

    invoke-virtual {p1, v3}, Lz6/a;->Y(Lg8/j4;)Le8/v0;

    move-result-object v3

    iget-object v4, v2, Lg8/x0;->j:Lg8/j4;

    iget-object v4, v4, Lg8/j4;->a:Le8/h;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v6, v4, Le8/h;->h:Ljava/lang/Boolean;

    invoke-virtual {v5, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v3, v5}, Lg8/s1;->f(Le8/v0;Z)Lg8/k0;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v5, p0, Lg8/y0;->c:Ljava/util/concurrent/Executor;

    iget-object v4, v4, Le8/h;->b:Ljava/util/concurrent/Executor;

    if-eqz v4, :cond_2

    move-object v5, v4

    :cond_2
    iget-object v4, v2, Lg8/x0;->k:Le8/b0;

    invoke-virtual {v4}, Le8/b0;->a()Le8/b0;

    move-result-object v6

    :try_start_1
    iget-object v7, v2, Lg8/x0;->j:Lg8/j4;

    iget-object v8, v7, Lg8/j4;->c:Le8/p1;

    iget-object v9, v7, Lg8/j4;->b:Le8/l1;

    iget-object v7, v7, Lg8/j4;->a:Le8/h;

    iget-object v10, v2, Lg8/x0;->l:[Le8/p;

    invoke-interface {v3, v8, v9, v7, v10}, Lg8/k0;->d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v4, v6}, Le8/b0;->c(Le8/b0;)V

    invoke-virtual {v2, v3}, Lg8/d1;->u(Lg8/h0;)Lg8/a1;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v5, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v4, v6}, Le8/b0;->c(Le8/b0;)V

    throw p1

    :cond_4
    iget-object p1, p0, Lg8/y0;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_2
    invoke-virtual {p0}, Lg8/y0;->h()Z

    move-result v1

    if-nez v1, :cond_5

    monitor-exit p1

    return-void

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lg8/y0;->i:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lg8/y0;->i:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lg8/y0;->i:Ljava/util/Collection;

    :cond_6
    invoke-virtual {p0}, Lg8/y0;->h()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lg8/y0;->d:Le8/h2;

    iget-object v1, p0, Lg8/y0;->f:Lg8/w0;

    invoke-virtual {v0, v1}, Le8/h2;->b(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lg8/y0;->j:Le8/c2;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lg8/y0;->g:Ljava/lang/Runnable;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lg8/y0;->d:Le8/h2;

    invoke-virtual {v1, v0}, Le8/h2;->b(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lg8/y0;->g:Ljava/lang/Runnable;

    :cond_7
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object p1, p0, Lg8/y0;->d:Le8/h2;

    invoke-virtual {p1}, Le8/h2;->a()V

    return-void

    :goto_1
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :catchall_2
    move-exception p1

    goto :goto_3

    :cond_8
    :goto_2
    :try_start_4
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method
