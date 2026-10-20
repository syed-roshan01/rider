.class public final Lg8/n2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/q2;


# direct methods
.method public synthetic constructor <init>(Lg8/q2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/n2;->a:I

    iput-object p1, p0, Lg8/n2;->b:Lg8/q2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    iget v0, p0, Lg8/n2;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg8/n2;->b:Lg8/q2;

    monitor-enter v0

    :try_start_0
    iget-object v3, p0, Lg8/n2;->b:Lg8/q2;

    const/4 v4, 0x0

    iput-object v4, v3, Lg8/q2;->g:Ljava/util/concurrent/ScheduledFuture;

    iget v4, v3, Lg8/q2;->e:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    const/4 v1, 0x4

    iput v1, v3, Lg8/q2;->e:I

    iget-object v1, v3, Lg8/q2;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v4, v3, Lg8/q2;->h:Lg8/r2;

    iget-wide v5, v3, Lg8/q2;->k:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v4, v5, v6, v7}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    iput-object v1, v3, Lg8/q2;->f:Ljava/util/concurrent/ScheduledFuture;

    move v1, v2

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v2, 0x3

    if-ne v4, v2, :cond_1

    iget-object v2, v3, Lg8/q2;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v4, v3, Lg8/q2;->i:Lg8/r2;

    iget-wide v6, v3, Lg8/q2;->j:J

    iget-object v8, v3, Lg8/q2;->b:Lq6/l;

    sget-object v9, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v8, v9}, Lq6/l;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v10

    sub-long/2addr v6, v10

    invoke-interface {v2, v4, v6, v7, v9}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    iput-object v2, v3, Lg8/q2;->g:Ljava/util/concurrent/ScheduledFuture;

    iget-object v2, p0, Lg8/n2;->b:Lg8/q2;

    iput v5, v2, Lg8/q2;->e:I

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    iget-object v0, p0, Lg8/n2;->b:Lg8/q2;

    iget-object v0, v0, Lg8/q2;->c:Lg8/p2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lg8/o2;

    invoke-direct {v1, v0}, Lg8/o2;-><init>(Lg8/p2;)V

    iget-object v0, v0, Lg8/p2;->a:Lg8/o0;

    invoke-interface {v0, v1}, Lg8/k0;->a(Lg8/o2;)V

    :cond_2
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :pswitch_0
    iget-object v0, p0, Lg8/n2;->b:Lg8/q2;

    monitor-enter v0

    :try_start_2
    iget-object v3, p0, Lg8/n2;->b:Lg8/q2;

    iget v4, v3, Lg8/q2;->e:I

    const/4 v5, 0x6

    if-eq v4, v5, :cond_3

    iput v5, v3, Lg8/q2;->e:I

    move v1, v2

    :cond_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_4

    iget-object v0, v3, Lg8/q2;->c:Lg8/p2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Le8/c2;->m:Le8/c2;

    const-string v2, "Keepalive failed. The connection is likely gone"

    invoke-virtual {v1, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v1

    iget-object v0, v0, Lg8/p2;->a:Lg8/o0;

    invoke-interface {v0, v1}, Lg8/u3;->c(Le8/c2;)V

    :cond_4
    return-void

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
