.class public final Lg8/f5;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/j0;


# instance fields
.field public final a:Lg8/g5;

.field public final synthetic b:Lg8/y2;


# direct methods
.method public constructor <init>(Lg8/y2;Lg8/g5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/f5;->b:Lg8/y2;

    iput-object p2, p0, Lg8/f5;->a:Lg8/g5;

    return-void
.end method


# virtual methods
.method public final a(Lg8/a6;)V
    .locals 3

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    iget-object v1, v0, Lg8/c5;->f:Lg8/g5;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Headers should be received prior to messages."

    invoke-static {v2, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    iget-object v1, p0, Lg8/f5;->a:Lg8/g5;

    if-eq v0, v1, :cond_2

    sget-object v0, Lg8/s1;->a:Ljava/util/logging/Logger;

    :goto_1
    invoke-interface {p1}, Lg8/a6;->next()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lg8/s1;->b(Ljava/io/Closeable;)V

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->c:Le8/h2;

    new-instance v1, Lg8/x1;

    const/16 v2, 0x1b

    invoke-direct {v1, v2, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    invoke-virtual {v0}, Lg8/y2;->k()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Lg8/e5;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lg8/e5;-><init>(Lg8/f5;I)V

    iget-object v0, v0, Lg8/y2;->c:Le8/h2;

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c(Le8/c2;Lg8/i0;Le8/l1;)V
    .locals 10

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v2, v1, Lg8/y2;->o:Lg8/c5;

    iget-object v3, p0, Lg8/f5;->a:Lg8/g5;

    invoke-virtual {v2, v3}, Lg8/c5;->d(Lg8/g5;)Lg8/c5;

    move-result-object v2

    iput-object v2, v1, Lg8/y2;->o:Lg8/c5;

    iget-object v1, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v1, v1, Lg8/y2;->n:Lg8/u;

    iget-object v2, p1, Le8/c2;->a:Le8/z1;

    invoke-virtual {v1, v2}, Lg8/u;->b(Ljava/lang/Object;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    const/high16 v1, -0x80000000

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lg8/f5;->b:Lg8/y2;

    iget-object p1, p1, Lg8/y2;->c:Le8/h2;

    new-instance p2, Lg8/e5;

    invoke-direct {p2, p0, v2}, Lg8/e5;-><init>(Lg8/f5;I)V

    invoke-virtual {p1, p2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lg8/f5;->a:Lg8/g5;

    iget-boolean v1, v0, Lg8/g5;->c:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lg8/f5;->b:Lg8/y2;

    invoke-virtual {v1, v0}, Lg8/y2;->s(Lg8/g5;)Lb3/a1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lb3/a1;->run()V

    :cond_1
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    iget-object v1, p0, Lg8/f5;->a:Lg8/g5;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    invoke-virtual {v0, p1, p2, p3}, Lg8/y2;->y(Le8/c2;Lg8/i0;Le8/l1;)V

    :cond_2
    return-void

    :cond_3
    sget-object v0, Lg8/i0;->d:Lg8/i0;

    if-ne p2, v0, :cond_6

    iget-object v1, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v1, v1, Lg8/y2;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    const/16 v3, 0x3e8

    if-le v1, v3, :cond_6

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v1, p0, Lg8/f5;->a:Lg8/g5;

    invoke-virtual {v0, v1}, Lg8/y2;->s(Lg8/g5;)Lb3/a1;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lb3/a1;->run()V

    :cond_4
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    iget-object v1, p0, Lg8/f5;->a:Lg8/g5;

    if-ne v0, v1, :cond_5

    sget-object v0, Le8/c2;->l:Le8/c2;

    const-string v1, "Too many transparent retries. Might be a bug in gRPC"

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    new-instance v1, Le8/e2;

    invoke-direct {v1, p1}, Le8/e2;-><init>(Le8/c2;)V

    invoke-virtual {v0, v1}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    invoke-virtual {v0, p1, p2, p3}, Lg8/y2;->y(Le8/c2;Lg8/i0;Le8/l1;)V

    :cond_5
    return-void

    :cond_6
    iget-object v1, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v1, v1, Lg8/y2;->o:Lg8/c5;

    iget-object v1, v1, Lg8/c5;->f:Lg8/g5;

    if-nez v1, :cond_1c

    const/4 v1, 0x1

    if-eq p2, v0, :cond_19

    sget-object v0, Lg8/i0;->b:Lg8/i0;

    if-ne p2, v0, :cond_7

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_9

    :cond_7
    sget-object v0, Lg8/i0;->c:Lg8/i0;

    if-ne p2, v0, :cond_8

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-boolean v1, v0, Lg8/y2;->h:Z

    if-eqz v1, :cond_1c

    invoke-virtual {v0}, Lg8/y2;->w()V

    goto/16 :goto_b

    :cond_8
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-boolean v3, v0, Lg8/y2;->h:Z

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-eqz v3, :cond_11

    sget-object v0, Lg8/y2;->F:Le8/g1;

    invoke-virtual {p3, v0}, Le8/l1;->c(Le8/i1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_9

    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_9
    :goto_0
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v3, v0, Lg8/y2;->g:Lg8/u1;

    iget-object v3, v3, Lg8/u1;->c:Lr6/t;

    iget-object v5, p1, Le8/c2;->a:Le8/z1;

    invoke-interface {v3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v3, v1

    iget-object v5, v0, Lg8/y2;->m:Lg8/h5;

    if-eqz v5, :cond_b

    if-eqz v3, :cond_a

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gez v5, :cond_b

    :cond_a
    iget-object v0, v0, Lg8/y2;->m:Lg8/h5;

    invoke-virtual {v0}, Lg8/h5;->a()Z

    move-result v0

    xor-int/2addr v0, v1

    goto :goto_1

    :cond_b
    move v0, v2

    :goto_1
    if-nez v3, :cond_c

    if-nez v0, :cond_c

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v5

    if-nez v5, :cond_c

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-lez v5, :cond_c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_c
    if-nez v3, :cond_d

    if-nez v0, :cond_d

    move v2, v1

    :cond_d
    if-eqz v2, :cond_e

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    invoke-static {v0, v4}, Lg8/y2;->r(Lg8/y2;Ljava/lang/Integer;)V

    :cond_e
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v3, v0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v3

    :try_start_2
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v1, v0, Lg8/y2;->o:Lg8/c5;

    iget-object v4, p0, Lg8/f5;->a:Lg8/g5;

    invoke-virtual {v1, v4}, Lg8/c5;->b(Lg8/g5;)Lg8/c5;

    move-result-object v1

    iput-object v1, v0, Lg8/y2;->o:Lg8/c5;

    if-eqz v2, :cond_10

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v1, v0, Lg8/y2;->o:Lg8/c5;

    invoke-virtual {v0, v1}, Lg8/y2;->x(Lg8/c5;)Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->d:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_f
    :goto_2
    monitor-exit v3

    return-void

    :cond_10
    monitor-exit v3

    goto/16 :goto_b

    :goto_3
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_11
    iget-object v3, v0, Lg8/y2;->f:Lg8/i5;

    const-wide/16 v6, 0x0

    if-nez v3, :cond_12

    new-instance v0, Lg8/a5;

    invoke-direct {v0, v6, v7, v2}, Lg8/a5;-><init>(JZ)V

    goto/16 :goto_8

    :cond_12
    iget-object v3, v3, Lg8/i5;->f:Lr6/t;

    iget-object v8, p1, Le8/c2;->a:Le8/z1;

    invoke-interface {v3, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    sget-object v8, Lg8/y2;->F:Le8/g1;

    invoke-virtual {p3, v8}, Le8/l1;->c(Le8/i1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_13

    :try_start_3
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_4

    :catch_1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_13
    :goto_4
    iget-object v5, v0, Lg8/y2;->m:Lg8/h5;

    if-eqz v5, :cond_15

    if-nez v3, :cond_14

    if-eqz v4, :cond_15

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gez v5, :cond_15

    :cond_14
    iget-object v5, v0, Lg8/y2;->m:Lg8/h5;

    invoke-virtual {v5}, Lg8/h5;->a()Z

    move-result v5

    xor-int/2addr v5, v1

    goto :goto_5

    :cond_15
    move v5, v2

    :goto_5
    iget-object v8, v0, Lg8/y2;->f:Lg8/i5;

    iget v8, v8, Lg8/i5;->a:I

    iget-object v9, p0, Lg8/f5;->a:Lg8/g5;

    iget v9, v9, Lg8/g5;->d:I

    add-int/2addr v9, v1

    if-le v8, v9, :cond_17

    if-nez v5, :cond_17

    if-nez v4, :cond_16

    if-eqz v3, :cond_17

    iget-wide v3, v0, Lg8/y2;->x:J

    long-to-double v3, v3

    sget-object v5, Lg8/y2;->H:Ljava/util/Random;

    invoke-virtual {v5}, Ljava/util/Random;->nextDouble()D

    move-result-wide v5

    mul-double/2addr v5, v3

    double-to-long v6, v5

    iget-wide v3, v0, Lg8/y2;->x:J

    long-to-double v3, v3

    iget-object v5, v0, Lg8/y2;->f:Lg8/i5;

    iget-wide v8, v5, Lg8/i5;->d:D

    mul-double/2addr v3, v8

    double-to-long v3, v3

    iget-wide v8, v5, Lg8/i5;->c:J

    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    iput-wide v3, v0, Lg8/y2;->x:J

    :goto_6
    move v0, v1

    goto :goto_7

    :cond_16
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ltz v3, :cond_17

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v6

    iget-object v3, v0, Lg8/y2;->f:Lg8/i5;

    iget-wide v3, v3, Lg8/i5;->b:J

    iput-wide v3, v0, Lg8/y2;->x:J

    goto :goto_6

    :cond_17
    move v0, v2

    :goto_7
    new-instance v3, Lg8/a5;

    invoke-direct {v3, v6, v7, v0}, Lg8/a5;-><init>(JZ)V

    move-object v0, v3

    :goto_8
    iget-boolean v3, v0, Lg8/a5;->a:Z

    if-eqz v3, :cond_1c

    iget-object p1, p0, Lg8/f5;->b:Lg8/y2;

    iget-object p2, p0, Lg8/f5;->a:Lg8/g5;

    iget p2, p2, Lg8/g5;->d:I

    add-int/2addr p2, v1

    invoke-virtual {p1, p2, v2}, Lg8/y2;->t(IZ)Lg8/g5;

    move-result-object p1

    if-nez p1, :cond_18

    return-void

    :cond_18
    iget-object p2, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v1, p2, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_4
    iget-object p2, p0, Lg8/f5;->b:Lg8/y2;

    new-instance p3, Lr7/h;

    iget-object v3, p2, Lg8/y2;->i:Ljava/lang/Object;

    invoke-direct {p3, v3}, Lr7/h;-><init>(Ljava/lang/Object;)V

    iput-object p3, p2, Lg8/y2;->v:Lr7/h;

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object p2, p2, Lg8/y2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lg8/d5;

    invoke-direct {v1, p0, p1, v2}, Lg8/d5;-><init>(Lg8/f5;Lg8/g5;I)V

    iget-wide v2, v0, Lg8/a5;->b:J

    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p2, v1, v2, v3, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    invoke-virtual {p3, p1}, Lr7/h;->e(Ljava/util/concurrent/ScheduledFuture;)V

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1

    :cond_19
    :goto_9
    iget-object p1, p0, Lg8/f5;->b:Lg8/y2;

    iget-object p2, p0, Lg8/f5;->a:Lg8/g5;

    iget p2, p2, Lg8/g5;->d:I

    invoke-virtual {p1, p2, v1}, Lg8/y2;->t(IZ)Lg8/g5;

    move-result-object p1

    if-nez p1, :cond_1a

    return-void

    :cond_1a
    iget-object p2, p0, Lg8/f5;->b:Lg8/y2;

    iget-boolean p3, p2, Lg8/y2;->h:Z

    if-eqz p3, :cond_1b

    iget-object p2, p2, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter p2

    :try_start_6
    iget-object p3, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, p3, Lg8/y2;->o:Lg8/c5;

    iget-object v2, p0, Lg8/f5;->a:Lg8/g5;

    invoke-virtual {v0, v2, p1}, Lg8/c5;->c(Lg8/g5;Lg8/g5;)Lg8/c5;

    move-result-object v0

    iput-object v0, p3, Lg8/y2;->o:Lg8/c5;

    monitor-exit p2

    goto :goto_a

    :catchall_2
    move-exception p1

    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1

    :cond_1b
    :goto_a
    iget-object p2, p0, Lg8/f5;->b:Lg8/y2;

    iget-object p2, p2, Lg8/y2;->b:Ljava/util/concurrent/Executor;

    new-instance p3, Lg8/d5;

    invoke-direct {p3, p0, p1, v1}, Lg8/d5;-><init>(Lg8/f5;Lg8/g5;I)V

    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1c
    :goto_b
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v1, p0, Lg8/f5;->a:Lg8/g5;

    invoke-virtual {v0, v1}, Lg8/y2;->s(Lg8/g5;)Lb3/a1;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lb3/a1;->run()V

    :cond_1d
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    iget-object v1, p0, Lg8/f5;->a:Lg8/g5;

    if-ne v0, v1, :cond_1e

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    invoke-virtual {v0, p1, p2, p3}, Lg8/y2;->y(Le8/c2;Lg8/i0;Le8/l1;)V

    :cond_1e
    return-void

    :catchall_3
    move-exception p1

    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p1
.end method

.method public final d(Le8/l1;)V
    .locals 5

    iget-object v0, p0, Lg8/f5;->a:Lg8/g5;

    iget v0, v0, Lg8/g5;->d:I

    if-lez v0, :cond_0

    sget-object v0, Lg8/y2;->E:Le8/g1;

    invoke-virtual {p1, v0}, Le8/l1;->a(Le8/i1;)V

    iget-object v1, p0, Lg8/f5;->a:Lg8/g5;

    iget v1, v1, Lg8/g5;->d:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Le8/l1;->f(Le8/i1;Ljava/io/Serializable;)V

    :cond_0
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v1, p0, Lg8/f5;->a:Lg8/g5;

    sget-object v2, Lg8/y2;->E:Le8/g1;

    invoke-virtual {v0, v1}, Lg8/y2;->s(Lg8/g5;)Lb3/a1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lb3/a1;->run()V

    :cond_1
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    iget-object v1, p0, Lg8/f5;->a:Lg8/g5;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->m:Lg8/h5;

    if-eqz v0, :cond_4

    :cond_2
    iget-object v1, v0, Lg8/h5;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    iget v3, v0, Lg8/h5;->a:I

    if-ne v2, v3, :cond_3

    goto :goto_0

    :cond_3
    iget v4, v0, Lg8/h5;->c:I

    add-int/2addr v4, v2

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_4
    :goto_0
    iget-object v0, p0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->c:Le8/h2;

    new-instance v1, Lg8/x1;

    const/16 v2, 0x1a

    invoke-direct {v1, v2, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    :cond_5
    return-void
.end method
