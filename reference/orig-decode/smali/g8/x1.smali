.class public final Lg8/x1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg8/x1;->a:I

    iput-object p2, p0, Lg8/x1;->c:Ljava/lang/Object;

    iput-object p3, p0, Lg8/x1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg8/g1;Le8/i;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x11

    iput v0, p0, Lg8/x1;->a:I

    iput-object p1, p0, Lg8/x1;->c:Ljava/lang/Object;

    const-string p1, "savedListener"

    .line 4
    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lg8/x1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lg8/x1;->a:I

    iput-object p1, p0, Lg8/x1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lg8/x1;->c:Ljava/lang/Object;

    return-void
.end method

.method private a()V
    .locals 3

    iget-object v0, p0, Lg8/x1;->c:Ljava/lang/Object;

    :try_start_0
    move-object v1, v0

    check-cast v1, Ll/z2;

    iget-object v1, v1, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Lg8/x3;

    iget-object v2, p0, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Lg8/m4;

    invoke-virtual {v1, v2}, Lg8/x3;->e(Lg8/m4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v2, v0

    check-cast v2, Ll/z2;

    iget-object v2, v2, Ll/z2;->c:Ljava/lang/Object;

    check-cast v2, Lg8/k;

    invoke-virtual {v2, v1}, Lg8/k;->b(Ljava/lang/Throwable;)V

    check-cast v0, Ll/z2;

    iget-object v0, v0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Lg8/x3;

    invoke-virtual {v0}, Lg8/x3;->close()V

    :goto_0
    return-void
.end method

.method private b()V
    .locals 3

    iget-object v0, p0, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v0, Lg8/o2;

    iget-object v0, v0, Lg8/o2;->a:Lg8/p2;

    iget-object v0, v0, Lg8/p2;->a:Lg8/o0;

    sget-object v1, Le8/c2;->m:Le8/c2;

    const-string v2, "Keepalive failed. The connection is likely gone"

    invoke-virtual {v1, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v1

    invoke-interface {v0, v1}, Lg8/u3;->c(Le8/c2;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v1, p0

    iget v0, v1, Lg8/x1;->a:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/f5;

    iget-object v0, v0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->u:Lg8/j0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Lg8/a6;

    invoke-interface {v0, v2}, Lg8/b6;->a(Lg8/a6;)V

    return-void

    :pswitch_0
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/f5;

    iget-object v0, v0, Lg8/f5;->b:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->u:Lg8/j0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/l1;

    invoke-interface {v0, v2}, Lg8/j0;->d(Le8/l1;)V

    return-void

    :pswitch_1
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v2, v0, Lg8/y2;->o:Lg8/c5;

    iget v2, v2, Lg8/c5;->e:I

    invoke-virtual {v0, v2, v5}, Lg8/y2;->t(IZ)Lg8/g5;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v2, Lg8/y2;

    iget-object v2, v2, Lg8/y2;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lg8/x1;

    const/16 v4, 0x18

    invoke-direct {v3, v4, v1, v0}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :pswitch_2
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/x1;

    iget-object v0, v0, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v2, v0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg8/x1;

    iget-object v3, v3, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v3, Lr7/h;

    iget-boolean v3, v3, Lr7/h;->b:Z

    if-eqz v3, :cond_1

    move v5, v6

    goto/16 :goto_2

    :cond_1
    move-object v3, v0

    check-cast v3, Lg8/x1;

    iget-object v3, v3, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/y2;

    check-cast v0, Lg8/x1;

    iget-object v0, v0, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    iget-object v6, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v6, Lg8/g5;

    invoke-virtual {v0, v6}, Lg8/c5;->a(Lg8/g5;)Lg8/c5;

    move-result-object v0

    iput-object v0, v3, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg8/x1;

    iget-object v3, v3, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/y2;

    check-cast v0, Lg8/x1;

    iget-object v0, v0, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    invoke-virtual {v3, v0}, Lg8/y2;->x(Lg8/c5;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg8/x1;

    iget-object v3, v3, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/y2;

    iget-object v3, v3, Lg8/y2;->m:Lg8/h5;

    if-eqz v3, :cond_2

    check-cast v0, Lg8/x1;

    iget-object v0, v0, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v0, v0, Lg8/y2;->m:Lg8/h5;

    iget-object v3, v0, Lg8/h5;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    iget v0, v0, Lg8/h5;->b:I

    if-le v3, v0, :cond_3

    :cond_2
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg8/x1;

    iget-object v3, v3, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/y2;

    new-instance v4, Lr7/h;

    check-cast v0, Lg8/x1;

    iget-object v0, v0, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v0, v0, Lg8/y2;->i:Ljava/lang/Object;

    invoke-direct {v4, v0}, Lr7/h;-><init>(Ljava/lang/Object;)V

    iput-object v4, v3, Lg8/y2;->w:Lr7/h;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_3
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg8/x1;

    iget-object v3, v3, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/y2;

    check-cast v0, Lg8/x1;

    iget-object v0, v0, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    iget-boolean v6, v0, Lg8/c5;->h:Z

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    new-instance v6, Lg8/c5;

    iget-object v8, v0, Lg8/c5;->b:Ljava/util/List;

    iget-object v9, v0, Lg8/c5;->c:Ljava/util/Collection;

    iget-object v10, v0, Lg8/c5;->d:Ljava/util/Collection;

    iget-object v11, v0, Lg8/c5;->f:Lg8/g5;

    iget-boolean v12, v0, Lg8/c5;->g:Z

    iget-boolean v13, v0, Lg8/c5;->a:Z

    const/4 v14, 0x1

    iget v15, v0, Lg8/c5;->e:I

    move-object v7, v6

    invoke-direct/range {v7 .. v15}, Lg8/c5;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lg8/g5;ZZZI)V

    move-object v0, v6

    :goto_1
    iput-object v0, v3, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/x1;

    iget-object v0, v0, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iput-object v4, v0, Lg8/y2;->w:Lr7/h;

    :goto_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_5

    iget-object v0, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v0, Lg8/g5;

    iget-object v2, v0, Lg8/g5;->a:Lg8/h0;

    new-instance v3, Lg8/f5;

    iget-object v4, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v4, Lg8/x1;

    iget-object v4, v4, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v4, Lg8/y2;

    invoke-direct {v3, v4, v0}, Lg8/f5;-><init>(Lg8/y2;Lg8/g5;)V

    invoke-interface {v2, v3}, Lg8/h0;->j(Lg8/j0;)V

    iget-object v0, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v0, Lg8/g5;

    iget-object v0, v0, Lg8/g5;->a:Lg8/h0;

    sget-object v2, Le8/c2;->f:Le8/c2;

    const-string v3, "Unneeded hedging"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v2

    invoke-interface {v0, v2}, Lg8/h0;->i(Le8/c2;)V

    goto :goto_3

    :cond_5
    if-eqz v4, :cond_6

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/x1;

    iget-object v0, v0, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v2, v0, Lg8/y2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Lg8/x1;

    const/16 v5, 0x19

    invoke-direct {v3, v5, v0, v4}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v0, Lg8/y2;->g:Lg8/u1;

    iget-wide v5, v0, Lg8/u1;->b:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v5, v6, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-virtual {v4, v0}, Lr7/h;->e(Ljava/util/concurrent/ScheduledFuture;)V

    :cond_6
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/x1;

    iget-object v0, v0, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Lg8/g5;

    invoke-virtual {v0, v2}, Lg8/y2;->v(Lg8/g5;)V

    :goto_3
    return-void

    :goto_4
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_3
    iget-object v0, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h3;

    iget-object v2, v0, Lg8/h3;->n:Lg8/i3;

    iget-object v2, v2, Lg8/i3;->d:Lg8/l3;

    iget-object v2, v2, Lg8/l3;->m:Le8/h2;

    new-instance v3, Lg8/t0;

    const/4 v4, 0x6

    invoke-direct {v3, v0, v4}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_4
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/i3;

    iget-object v2, v0, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lg8/l3;->h0:Lg8/t2;

    iget-object v4, v1, Lg8/x1;->b:Ljava/lang/Object;

    if-ne v2, v3, :cond_8

    iget-object v2, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v3, v2, Lg8/l3;->A:Ljava/util/Collection;

    if-nez v3, :cond_7

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v3, v2, Lg8/l3;->A:Ljava/util/Collection;

    iget-object v2, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v3, v2, Lg8/l3;->X:Lg8/z1;

    iget-object v2, v2, Lg8/l3;->B:Ljava/lang/Object;

    invoke-virtual {v3, v2, v6}, Lf4/y;->f(Ljava/lang/Object;Z)V

    :cond_7
    iget-object v0, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->A:Ljava/util/Collection;

    check-cast v4, Lg8/h3;

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    check-cast v4, Lg8/h3;

    invoke-virtual {v4}, Lg8/h3;->d()V

    :goto_5
    return-void

    :pswitch_5
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v2, v0, Lg8/d3;->f:Lg8/l3;

    iget-object v7, v2, Lg8/l3;->u:Lg8/o1;

    iget-object v0, v0, Lg8/d3;->e:Le8/j0;

    if-eq v7, v0, :cond_9

    goto/16 :goto_e

    :cond_9
    iget-object v0, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v0, Le8/s1;

    iget-object v7, v0, Le8/s1;->a:Ljava/util/List;

    iget-object v2, v2, Lg8/l3;->N:Lg8/z;

    iget-object v0, v0, Le8/s1;->b:Le8/c;

    filled-new-array {v7, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v8, "Resolved address: {0}, config={1}"

    invoke-virtual {v2, v6, v8, v0}, Lg8/z;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v0, v0, Lg8/d3;->f:Lg8/l3;

    iget v2, v0, Lg8/l3;->a0:I

    if-eq v2, v3, :cond_a

    iget-object v0, v0, Lg8/l3;->N:Lg8/z;

    const-string v2, "Address resolved: {0}"

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v3, v2, v8}, Lg8/z;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v0, v0, Lg8/d3;->f:Lg8/l3;

    iput v3, v0, Lg8/l3;->a0:I

    :cond_a
    iget-object v0, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v0, Le8/s1;

    iget-object v2, v0, Le8/s1;->c:Le8/r1;

    iget-object v0, v0, Le8/s1;->b:Le8/c;

    sget-object v8, Lg8/m5;->d:Le8/b;

    iget-object v0, v0, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, v8}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lg8/k5;

    iget-object v0, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v0, Le8/s1;

    iget-object v0, v0, Le8/s1;->b:Le8/c;

    sget-object v9, Le8/o0;->a:Le8/b;

    iget-object v0, v0, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, v9}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/o0;

    if-eqz v2, :cond_b

    iget-object v10, v2, Le8/r1;->b:Ljava/lang/Object;

    if-eqz v10, :cond_b

    check-cast v10, Lg8/s3;

    goto :goto_6

    :cond_b
    move-object v10, v4

    :goto_6
    if-eqz v2, :cond_c

    iget-object v11, v2, Le8/r1;->a:Le8/c2;

    goto :goto_7

    :cond_c
    move-object v11, v4

    :goto_7
    iget-object v12, v1, Lg8/x1;->c:Ljava/lang/Object;

    move-object v13, v12

    check-cast v13, Lg8/d3;

    iget-object v13, v13, Lg8/d3;->f:Lg8/l3;

    iget-boolean v14, v13, Lg8/l3;->S:Z

    const/16 v15, 0xb

    if-nez v14, :cond_f

    if-eqz v10, :cond_d

    iget-object v2, v13, Lg8/l3;->N:Lg8/z;

    const-string v5, "Service config from name resolver discarded by channel settings"

    invoke-virtual {v2, v3, v5}, Lg8/z;->a(ILjava/lang/String;)V

    :cond_d
    iget-object v2, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v2, Lg8/d3;

    iget-object v2, v2, Lg8/d3;->f:Lg8/l3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lg8/l3;->g0:Lg8/s3;

    if-eqz v0, :cond_e

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v0, v0, Lg8/d3;->f:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->N:Lg8/z;

    const-string v5, "Config selector from name resolver discarded by channel settings"

    invoke-virtual {v0, v3, v5}, Lg8/z;->a(ILjava/lang/String;)V

    :cond_e
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v0, v0, Lg8/d3;->f:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->P:Lg8/i3;

    invoke-virtual {v2}, Lg8/s3;->b()Lg8/r3;

    move-result-object v5

    invoke-virtual {v0, v5}, Lg8/i3;->t(Le8/o0;)V

    goto/16 :goto_b

    :cond_f
    if-eqz v10, :cond_11

    if-eqz v0, :cond_10

    iget-object v2, v13, Lg8/l3;->P:Lg8/i3;

    invoke-virtual {v2, v0}, Lg8/i3;->t(Le8/o0;)V

    invoke-virtual {v10}, Lg8/s3;->b()Lg8/r3;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v0, v0, Lg8/d3;->f:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->N:Lg8/z;

    const-string v2, "Method configs in service config will be discarded due to presence ofconfig-selector"

    invoke-virtual {v0, v6, v2}, Lg8/z;->a(ILjava/lang/String;)V

    goto :goto_8

    :cond_10
    iget-object v0, v13, Lg8/l3;->P:Lg8/i3;

    invoke-virtual {v10}, Lg8/s3;->b()Lg8/r3;

    move-result-object v2

    invoke-virtual {v0, v2}, Lg8/i3;->t(Le8/o0;)V

    goto :goto_8

    :cond_11
    if-eqz v11, :cond_13

    check-cast v12, Lg8/d3;

    iget-object v0, v12, Lg8/d3;->f:Lg8/l3;

    iget-boolean v10, v0, Lg8/l3;->R:Z

    if-nez v10, :cond_12

    iget-object v0, v0, Lg8/l3;->N:Lg8/z;

    const-string v4, "Fallback to error due to invalid first service config without default config"

    invoke-virtual {v0, v3, v4}, Lg8/z;->a(ILjava/lang/String;)V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v2, v2, Le8/r1;->a:Le8/c2;

    invoke-virtual {v0, v2}, Lg8/d3;->d(Le8/c2;)V

    if-eqz v8, :cond_1d

    iget-object v0, v8, Lg8/k5;->a:Lg8/m5;

    iget-object v2, v0, Lg8/m5;->b:Lg8/j5;

    new-instance v3, Lg8/t0;

    invoke-direct {v3, v0, v15}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    check-cast v2, Lg8/t;

    invoke-virtual {v2, v3}, Lg8/t;->a(Lg8/t0;)V

    goto/16 :goto_e

    :cond_12
    iget-object v10, v0, Lg8/l3;->Q:Lg8/s3;

    goto :goto_8

    :cond_13
    sget-object v10, Lg8/l3;->g0:Lg8/s3;

    check-cast v12, Lg8/d3;

    iget-object v0, v12, Lg8/d3;->f:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->P:Lg8/i3;

    invoke-virtual {v0, v4}, Lg8/i3;->t(Le8/o0;)V

    :cond_14
    :goto_8
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v0, v0, Lg8/d3;->f:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->Q:Lg8/s3;

    invoke-virtual {v10, v0}, Lg8/s3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v0, v0, Lg8/d3;->f:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->N:Lg8/z;

    new-array v2, v6, [Ljava/lang/Object;

    sget-object v11, Lg8/l3;->g0:Lg8/s3;

    if-ne v10, v11, :cond_15

    const-string v11, " to empty"

    goto :goto_9

    :cond_15
    const-string v11, ""

    :goto_9
    aput-object v11, v2, v5

    const-string v5, "Service config changed{0}"

    invoke-virtual {v0, v3, v5, v2}, Lg8/z;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v0, v0, Lg8/d3;->f:Lg8/l3;

    iput-object v10, v0, Lg8/l3;->Q:Lg8/s3;

    iget-object v0, v0, Lg8/l3;->Y:Lz5/k;

    iget-object v2, v10, Lg8/s3;->d:Lg8/h5;

    iput-object v2, v0, Lz5/k;->b:Ljava/lang/Object;

    :cond_16
    :try_start_2
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v0, v0, Lg8/d3;->f:Lg8/l3;

    iput-boolean v6, v0, Lg8/l3;->R:Z
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_a

    :catch_0
    move-exception v0

    sget-object v2, Lg8/l3;->b0:Ljava/util/logging/Logger;

    sget-object v5, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "["

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v12, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v12, Lg8/d3;

    iget-object v12, v12, Lg8/d3;->f:Lg8/l3;

    iget-object v12, v12, Lg8/l3;->a:Le8/q0;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, "] Unexpected exception from parsing service config"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v5, v11, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_a
    move-object v2, v10

    :goto_b
    iget-object v0, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v0, Le8/s1;

    iget-object v0, v0, Le8/s1;->b:Le8/c;

    iget-object v5, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v5, Lg8/d3;

    iget-object v10, v5, Lg8/d3;->d:Lg8/c3;

    iget-object v5, v5, Lg8/d3;->f:Lg8/l3;

    iget-object v5, v5, Lg8/l3;->w:Lg8/c3;

    if-ne v10, v5, :cond_1d

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Le8/a;

    invoke-direct {v5, v0}, Le8/a;-><init>(Le8/c;)V

    invoke-virtual {v5, v9}, Le8/a;->b(Le8/b;)V

    iget-object v0, v2, Lg8/s3;->f:Ljava/util/Map;

    if-eqz v0, :cond_17

    sget-object v9, Le8/z0;->b:Le8/b;

    invoke-virtual {v5, v9, v0}, Le8/a;->c(Le8/b;Ljava/lang/Object;)V

    invoke-virtual {v5}, Le8/a;->a()Le8/c;

    :cond_17
    invoke-virtual {v5}, Le8/a;->a()Le8/c;

    move-result-object v0

    iget-object v5, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v5, Lg8/d3;

    iget-object v5, v5, Lg8/d3;->d:Lg8/c3;

    iget-object v5, v5, Lg8/c3;->a:Li3/a0;

    sget-object v9, Le8/c;->b:Le8/c;

    iget-object v2, v2, Lg8/s3;->e:Ljava/lang/Object;

    new-instance v9, Le8/w0;

    check-cast v7, Ljava/util/List;

    invoke-direct {v9, v7, v0, v2}, Le8/w0;-><init>(Ljava/util/List;Le8/c;Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v9, Le8/w0;->c:Ljava/lang/Object;

    check-cast v0, Lg8/t5;

    if-nez v0, :cond_18

    :try_start_3
    iget-object v0, v5, Li3/a0;->d:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg8/s;

    check-cast v0, Lg8/s;

    iget-object v0, v0, Lg8/s;->b:Ljava/lang/String;

    invoke-static {v2, v0}, Lg8/s;->a(Lg8/s;Ljava/lang/String;)Le8/a1;

    move-result-object v0
    :try_end_3
    .catch Lg8/r; {:try_start_3 .. :try_end_3} :catch_1

    new-instance v2, Lg8/t5;

    invoke-direct {v2, v0, v4}, Lg8/t5;-><init>(Le8/a1;Ljava/lang/Object;)V

    move-object v0, v2

    goto :goto_c

    :catch_1
    move-exception v0

    sget-object v2, Le8/c2;->l:Le8/c2;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    iget-object v2, v5, Li3/a0;->a:Ljava/lang/Object;

    check-cast v2, Le8/j0;

    sget-object v3, Le8/x;->c:Le8/x;

    new-instance v7, Lg8/g4;

    invoke-direct {v7, v0}, Lg8/g4;-><init>(Le8/c2;)V

    invoke-virtual {v2, v3, v7}, Le8/j0;->r(Le8/x;Lz6/a;)V

    iget-object v0, v5, Li3/a0;->b:Ljava/lang/Object;

    check-cast v0, Le8/z0;

    invoke-virtual {v0}, Le8/z0;->f()V

    iput-object v4, v5, Li3/a0;->c:Ljava/lang/Object;

    new-instance v0, Lg8/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, v5, Li3/a0;->b:Ljava/lang/Object;

    goto/16 :goto_d

    :cond_18
    :goto_c
    iget-object v2, v5, Li3/a0;->c:Ljava/lang/Object;

    check-cast v2, Le8/a1;

    iget-object v4, v0, Lg8/t5;->a:Le8/a1;

    if-eqz v2, :cond_19

    invoke-virtual {v4}, Le8/a1;->f()Ljava/lang/String;

    move-result-object v2

    iget-object v7, v5, Li3/a0;->c:Ljava/lang/Object;

    check-cast v7, Le8/a1;

    invoke-virtual {v7}, Le8/a1;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    :cond_19
    iget-object v2, v5, Li3/a0;->a:Ljava/lang/Object;

    check-cast v2, Le8/j0;

    sget-object v7, Le8/x;->a:Le8/x;

    new-instance v10, Lg8/p;

    invoke-direct {v10}, Lg8/p;-><init>()V

    invoke-virtual {v2, v7, v10}, Le8/j0;->r(Le8/x;Lz6/a;)V

    iget-object v2, v5, Li3/a0;->b:Ljava/lang/Object;

    check-cast v2, Le8/z0;

    invoke-virtual {v2}, Le8/z0;->f()V

    iput-object v4, v5, Li3/a0;->c:Ljava/lang/Object;

    iget-object v2, v5, Li3/a0;->b:Ljava/lang/Object;

    check-cast v2, Le8/z0;

    iget-object v7, v5, Li3/a0;->a:Ljava/lang/Object;

    check-cast v7, Le8/j0;

    invoke-virtual {v4, v7}, Le8/i;->c(Le8/j0;)Le8/z0;

    move-result-object v4

    iput-object v4, v5, Li3/a0;->b:Ljava/lang/Object;

    iget-object v4, v5, Li3/a0;->a:Ljava/lang/Object;

    check-cast v4, Le8/j0;

    invoke-virtual {v4}, Le8/j0;->i()Le8/i;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    iget-object v7, v5, Li3/a0;->b:Ljava/lang/Object;

    check-cast v7, Le8/z0;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v2, v7}, [Ljava/lang/Object;

    move-result-object v2

    const-string v7, "Load balancer changed from {0} to {1}"

    invoke-virtual {v4, v3, v7, v2}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    :cond_1a
    iget-object v0, v0, Lg8/t5;->b:Ljava/lang/Object;

    if-eqz v0, :cond_1b

    iget-object v2, v5, Li3/a0;->a:Ljava/lang/Object;

    check-cast v2, Le8/j0;

    invoke-virtual {v2}, Le8/j0;->i()Le8/i;

    move-result-object v2

    const-string v3, "Load-balancing config: {0}"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v6, v3, v4}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    :cond_1b
    iget-object v2, v5, Li3/a0;->b:Ljava/lang/Object;

    check-cast v2, Le8/z0;

    sget-object v3, Le8/c;->b:Le8/c;

    iget-object v3, v9, Le8/w0;->a:Ljava/util/List;

    iget-object v4, v9, Le8/w0;->b:Le8/c;

    new-instance v5, Le8/w0;

    check-cast v3, Ljava/util/List;

    invoke-direct {v5, v3, v4, v0}, Le8/w0;-><init>(Ljava/util/List;Le8/c;Ljava/lang/Object;)V

    invoke-virtual {v2, v5}, Le8/z0;->a(Le8/w0;)Z

    move-result v6

    :goto_d
    if-eqz v8, :cond_1d

    iget-object v0, v8, Lg8/k5;->a:Lg8/m5;

    if-eqz v6, :cond_1c

    iget-object v0, v0, Lg8/m5;->b:Lg8/j5;

    check-cast v0, Lg8/t;

    iget-object v2, v0, Lg8/t;->b:Le8/h2;

    invoke-virtual {v2}, Le8/h2;->d()V

    new-instance v3, Landroidx/activity/d;

    const/16 v4, 0xe

    invoke-direct {v3, v0, v4}, Landroidx/activity/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    goto :goto_e

    :cond_1c
    iget-object v2, v0, Lg8/m5;->b:Lg8/j5;

    new-instance v3, Lg8/t0;

    invoke-direct {v3, v0, v15}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    check-cast v2, Lg8/t;

    invoke-virtual {v2, v3}, Lg8/t;->a(Lg8/t0;)V

    :cond_1d
    :goto_e
    return-void

    :pswitch_6
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d3;

    iget-object v3, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v3, Le8/c2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lg8/l3;->b0:Ljava/util/logging/Logger;

    sget-object v6, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    iget-object v7, v0, Lg8/d3;->f:Lg8/l3;

    iget-object v8, v7, Lg8/l3;->a:Le8/q0;

    filled-new-array {v8, v3}, [Ljava/lang/Object;

    move-result-object v8

    const-string v9, "[{0}] Failed to resolve name. status={1}"

    invoke-virtual {v5, v6, v9, v8}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v5, v7, Lg8/l3;->P:Lg8/i3;

    iget-object v6, v5, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lg8/l3;->h0:Lg8/t2;

    if-ne v6, v8, :cond_1e

    invoke-virtual {v5, v4}, Lg8/i3;->t(Le8/o0;)V

    :cond_1e
    iget v4, v7, Lg8/l3;->a0:I

    if-eq v4, v2, :cond_1f

    iget-object v4, v7, Lg8/l3;->N:Lg8/z;

    const-string v5, "Failed to resolve name: {0}"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v2, v5, v6}, Lg8/z;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    iput v2, v7, Lg8/l3;->a0:I

    :cond_1f
    iget-object v2, v7, Lg8/l3;->w:Lg8/c3;

    iget-object v0, v0, Lg8/d3;->d:Lg8/c3;

    if-eq v0, v2, :cond_20

    goto :goto_f

    :cond_20
    iget-object v0, v0, Lg8/c3;->a:Li3/a0;

    iget-object v0, v0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v0, Le8/z0;

    invoke-virtual {v0, v3}, Le8/z0;->c(Le8/c2;)V

    :goto_f
    return-void

    :pswitch_7
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->w:Le8/y;

    iget-object v0, v0, Le8/y;->a:Le8/x;

    sget-object v2, Le8/x;->e:Le8/x;

    if-ne v0, v2, :cond_21

    goto/16 :goto_12

    :cond_21
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->v:Lg8/u3;

    iget-object v2, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v2, Lg8/h2;

    iget-object v7, v2, Lg8/h2;->a:Lg8/o0;

    if-ne v0, v7, :cond_22

    iget-object v0, v2, Lg8/h2;->c:Lg8/j2;

    iput-object v4, v0, Lg8/j2;->v:Lg8/u3;

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->l:Lk3/b;

    invoke-virtual {v0}, Lk3/b;->b()V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    sget-object v2, Le8/x;->d:Le8/x;

    invoke-static {v0, v2}, Lg8/j2;->g(Lg8/j2;Le8/x;)V

    goto/16 :goto_12

    :cond_22
    iget-object v0, v2, Lg8/h2;->c:Lg8/j2;

    iget-object v2, v0, Lg8/j2;->u:Lg8/o0;

    if-ne v2, v7, :cond_28

    iget-object v0, v0, Lg8/j2;->w:Le8/y;

    iget-object v0, v0, Le8/y;->a:Le8/x;

    sget-object v2, Le8/x;->a:Le8/x;

    if-ne v0, v2, :cond_23

    move v0, v6

    goto :goto_10

    :cond_23
    move v0, v5

    :goto_10
    iget-object v2, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v2, Lg8/h2;

    iget-object v2, v2, Lg8/h2;->c:Lg8/j2;

    iget-object v2, v2, Lg8/j2;->w:Le8/y;

    iget-object v2, v2, Le8/y;->a:Le8/x;

    const-string v7, "Expected state is CONNECTING, actual state is %s"

    invoke-static {v2, v7, v0}, Ly3/e;->M(Ljava/lang/Object;Ljava/lang/String;Z)V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->l:Lk3/b;

    iget-object v2, v0, Lk3/b;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget v7, v0, Lk3/b;->b:I

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/g0;

    iget v7, v0, Lk3/b;->c:I

    add-int/2addr v7, v6

    iput v7, v0, Lk3/b;->c:I

    iget-object v2, v2, Le8/g0;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v7, v2, :cond_24

    iget v2, v0, Lk3/b;->b:I

    add-int/2addr v2, v6

    iput v2, v0, Lk3/b;->b:I

    iput v5, v0, Lk3/b;->c:I

    :cond_24
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->l:Lk3/b;

    iget v2, v0, Lk3/b;->b:I

    iget-object v0, v0, Lk3/b;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_25

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    invoke-static {v0}, Lg8/j2;->h(Lg8/j2;)V

    goto/16 :goto_12

    :cond_25
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iput-object v4, v0, Lg8/j2;->u:Lg8/o0;

    iget-object v0, v0, Lg8/j2;->l:Lk3/b;

    invoke-virtual {v0}, Lk3/b;->b()V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/c2;

    iget-object v4, v0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v4}, Le8/h2;->d()V

    invoke-virtual {v2}, Le8/c2;->e()Z

    move-result v4

    xor-int/2addr v4, v6

    const-string v7, "The error status must not be OK"

    invoke-static {v7, v4}, Ly3/e;->G(Ljava/lang/String;Z)V

    new-instance v4, Le8/y;

    sget-object v7, Le8/x;->c:Le8/x;

    invoke-direct {v4, v7, v2}, Le8/y;-><init>(Le8/x;Le8/c2;)V

    invoke-virtual {v0, v4}, Lg8/j2;->i(Le8/y;)V

    iget-object v4, v0, Lg8/j2;->n:Lg8/i1;

    if-nez v4, :cond_26

    iget-object v4, v0, Lg8/j2;->d:Lr7/e;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lr7/e;->d()Lg8/i1;

    move-result-object v4

    iput-object v4, v0, Lg8/j2;->n:Lg8/i1;

    :cond_26
    iget-object v4, v0, Lg8/j2;->n:Lg8/i1;

    invoke-virtual {v4}, Lg8/i1;->a()J

    move-result-wide v7

    sget-object v13, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, v0, Lg8/j2;->o:Lq6/l;

    invoke-virtual {v4, v13}, Lq6/l;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v9

    sub-long v11, v7, v9

    invoke-static {v2}, Lg8/j2;->j(Le8/c2;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v2, v4}, [Ljava/lang/Object;

    move-result-object v2

    iget-object v4, v0, Lg8/j2;->j:Le8/i;

    const-string v7, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns"

    invoke-virtual {v4, v3, v7, v2}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v0, Lg8/j2;->p:Lv6/d;

    if-nez v2, :cond_27

    goto :goto_11

    :cond_27
    move v6, v5

    :goto_11
    const-string v2, "previous reconnectTask is not done"

    invoke-static {v2, v6}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v9, v0, Lg8/j2;->k:Le8/h2;

    new-instance v10, Lg8/a2;

    invoke-direct {v10, v0, v5}, Lg8/a2;-><init>(Lg8/j2;I)V

    iget-object v14, v0, Lg8/j2;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual/range {v9 .. v14}, Le8/h2;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lv6/d;

    move-result-object v2

    iput-object v2, v0, Lg8/j2;->p:Lv6/d;

    :cond_28
    :goto_12
    return-void

    :pswitch_8
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/j2;

    iget-object v0, v0, Lg8/j2;->l:Lk3/b;

    iget-object v3, v0, Lk3/b;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget v6, v0, Lk3/b;->b:I

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le8/g0;

    iget-object v3, v3, Le8/g0;->a:Ljava/util/List;

    iget v0, v0, Lk3/b;->c:I

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/SocketAddress;

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iget-object v3, v3, Lg8/j2;->l:Lk3/b;

    iget-object v6, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iput-object v6, v3, Lk3/b;->d:Ljava/lang/Object;

    invoke-virtual {v3}, Lk3/b;->b()V

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iget-object v6, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iput-object v6, v3, Lg8/j2;->m:Ljava/util/List;

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iget-object v3, v3, Lg8/j2;->w:Le8/y;

    iget-object v3, v3, Le8/y;->a:Le8/x;

    sget-object v6, Le8/x;->b:Le8/x;

    if-eq v3, v6, :cond_29

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iget-object v3, v3, Lg8/j2;->w:Le8/y;

    iget-object v3, v3, Le8/y;->a:Le8/x;

    sget-object v7, Le8/x;->a:Le8/x;

    if-ne v3, v7, :cond_2d

    :cond_29
    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iget-object v3, v3, Lg8/j2;->l:Lk3/b;

    :goto_13
    iget-object v7, v3, Lk3/b;->d:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_2b

    iget-object v7, v3, Lk3/b;->d:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le8/g0;

    iget-object v7, v7, Le8/g0;->a:Ljava/util/List;

    invoke-interface {v7, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_2a

    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    :cond_2a
    iput v5, v3, Lk3/b;->b:I

    iput v7, v3, Lk3/b;->c:I

    goto :goto_14

    :cond_2b
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/j2;

    iget-object v0, v0, Lg8/j2;->w:Le8/y;

    iget-object v0, v0, Le8/y;->a:Le8/x;

    if-ne v0, v6, :cond_2c

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/j2;

    iget-object v0, v0, Lg8/j2;->v:Lg8/u3;

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iput-object v4, v3, Lg8/j2;->v:Lg8/u3;

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iget-object v3, v3, Lg8/j2;->l:Lk3/b;

    invoke-virtual {v3}, Lk3/b;->b()V

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    sget-object v5, Le8/x;->d:Le8/x;

    invoke-static {v3, v5}, Lg8/j2;->g(Lg8/j2;Le8/x;)V

    goto :goto_15

    :cond_2c
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/j2;

    iget-object v0, v0, Lg8/j2;->u:Lg8/o0;

    sget-object v3, Le8/c2;->m:Le8/c2;

    const-string v5, "InternalSubchannel closed pending transport due to address change"

    invoke-virtual {v3, v5}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-interface {v0, v3}, Lg8/u3;->f(Le8/c2;)V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/j2;

    iput-object v4, v0, Lg8/j2;->u:Lg8/o0;

    iget-object v0, v0, Lg8/j2;->l:Lk3/b;

    invoke-virtual {v0}, Lk3/b;->b()V

    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/j2;

    invoke-static {v0}, Lg8/j2;->h(Lg8/j2;)V

    :cond_2d
    :goto_14
    move-object v0, v4

    :goto_15
    if-eqz v0, :cond_2f

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iget-object v5, v3, Lg8/j2;->q:Lv6/d;

    if-eqz v5, :cond_2e

    iget-object v3, v3, Lg8/j2;->r:Lg8/u3;

    sget-object v5, Le8/c2;->m:Le8/c2;

    const-string v6, "InternalSubchannel closed transport early due to address change"

    invoke-virtual {v5, v6}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v5

    invoke-interface {v3, v5}, Lg8/u3;->f(Le8/c2;)V

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iget-object v3, v3, Lg8/j2;->q:Lv6/d;

    invoke-virtual {v3}, Lv6/d;->c()V

    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iput-object v4, v3, Lg8/j2;->q:Lv6/d;

    iput-object v4, v3, Lg8/j2;->r:Lg8/u3;

    :cond_2e
    iget-object v3, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/j2;

    iput-object v0, v3, Lg8/j2;->r:Lg8/u3;

    iget-object v4, v3, Lg8/j2;->k:Le8/h2;

    new-instance v5, Lg8/t0;

    invoke-direct {v5, v1, v2}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v6, 0x5

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v9, v3, Lg8/j2;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual/range {v4 .. v9}, Le8/h2;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lv6/d;

    move-result-object v0

    iput-object v0, v3, Lg8/j2;->q:Lv6/d;

    :cond_2f
    return-void

    :pswitch_9
    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    const-string v3, "Unable to resolve host "

    const-string v0, "Using proxy address "

    sget-object v7, Lg8/g1;->s:Ljava/util/logging/Logger;

    sget-object v8, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    invoke-virtual {v7, v8}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v9

    iget-object v10, v1, Lg8/x1;->c:Ljava/lang/Object;

    if-eqz v9, :cond_30

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v11, "Attempting DNS resolution of "

    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v11, v10

    check-cast v11, Lg8/g1;

    iget-object v11, v11, Lg8/g1;->f:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/logging/Logger;->finer(Ljava/lang/String;)V

    :cond_30
    const/4 v9, 0x4

    :try_start_4
    move-object v11, v10

    check-cast v11, Lg8/g1;

    iget-object v12, v11, Lg8/g1;->f:Ljava/lang/String;

    iget v13, v11, Lg8/g1;->g:I

    invoke-static {v12, v13}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    move-result-object v12

    iget-object v11, v11, Lg8/g1;->a:Le8/w1;

    invoke-interface {v11, v12}, Le8/w1;->a(Ljava/net/InetSocketAddress;)Le8/k0;

    move-result-object v11

    if-eqz v11, :cond_31

    new-instance v12, Le8/g0;

    invoke-direct {v12, v11}, Le8/g0;-><init>(Ljava/net/SocketAddress;)V

    goto :goto_16

    :cond_31
    move-object v12, v4

    :goto_16
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    sget-object v13, Le8/c;->b:Le8/c;

    if-eqz v12, :cond_33

    invoke-virtual {v7, v8}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v8

    if-eqz v8, :cond_32

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/logging/Logger;->finer(Ljava/lang/String;)V

    goto :goto_17

    :catchall_1
    move-exception v0

    goto/16 :goto_1c

    :catch_2
    move-exception v0

    goto/16 :goto_1a

    :cond_32
    :goto_17
    invoke-static {v12}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v7, v4

    goto :goto_19

    :cond_33
    move-object v0, v10

    check-cast v0, Lg8/g1;

    invoke-virtual {v0}, Lg8/g1;->s()Li3/a0;

    move-result-object v7
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-object v0, v7, Li3/a0;->a:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Le8/c2;

    if-eqz v8, :cond_35

    move-object v4, v2

    check-cast v4, Le8/i;

    check-cast v0, Le8/c2;

    invoke-virtual {v4, v0}, Le8/i;->d(Le8/c2;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    iget-object v0, v7, Li3/a0;->a:Ljava/lang/Object;

    check-cast v0, Le8/c2;

    if-nez v0, :cond_34

    move v5, v6

    :cond_34
    check-cast v10, Lg8/g1;

    iget-object v0, v10, Lg8/g1;->j:Le8/h2;

    new-instance v2, Lk6/m4;

    invoke-direct {v2, v9, v1, v5}, Lk6/m4;-><init>(ILjava/lang/Object;Z)V

    :goto_18
    invoke-virtual {v0, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_1b

    :catchall_2
    move-exception v0

    move-object v4, v7

    goto/16 :goto_1c

    :catch_3
    move-exception v0

    move-object v4, v7

    goto :goto_1a

    :cond_35
    :try_start_6
    iget-object v0, v7, Li3/a0;->b:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_36

    move-object v11, v0

    check-cast v11, Ljava/util/List;

    :cond_36
    iget-object v0, v7, Li3/a0;->c:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Le8/r1;

    if-eqz v8, :cond_37

    move-object v4, v0

    check-cast v4, Le8/r1;

    :cond_37
    iget-object v0, v7, Li3/a0;->d:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Le8/c;

    if-eqz v8, :cond_38

    move-object v13, v0

    check-cast v13, Le8/c;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_38
    move-object v0, v11

    move-object/from16 v16, v7

    move-object v7, v4

    move-object/from16 v4, v16

    :goto_19
    :try_start_7
    move-object v8, v2

    check-cast v8, Le8/i;

    new-instance v11, Le8/s1;

    check-cast v0, Ljava/util/List;

    invoke-direct {v11, v0, v13, v7}, Le8/s1;-><init>(Ljava/util/List;Le8/c;Le8/r1;)V

    invoke-virtual {v8, v11}, Le8/i;->e(Le8/s1;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v4, :cond_39

    iget-object v0, v4, Li3/a0;->a:Ljava/lang/Object;

    check-cast v0, Le8/c2;

    if-nez v0, :cond_39

    move v5, v6

    :cond_39
    check-cast v10, Lg8/g1;

    iget-object v0, v10, Lg8/g1;->j:Le8/h2;

    new-instance v2, Lk6/m4;

    invoke-direct {v2, v9, v1, v5}, Lk6/m4;-><init>(ILjava/lang/Object;Z)V

    goto :goto_18

    :goto_1a
    :try_start_8
    check-cast v2, Le8/i;

    sget-object v7, Le8/c2;->m:Le8/c2;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v3, v10

    check-cast v3, Lg8/g1;

    iget-object v3, v3, Lg8/g1;->f:Ljava/lang/String;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v3, v0}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object v0

    invoke-virtual {v2, v0}, Le8/i;->d(Le8/c2;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    if-eqz v4, :cond_3a

    iget-object v0, v4, Li3/a0;->a:Ljava/lang/Object;

    check-cast v0, Le8/c2;

    if-nez v0, :cond_3a

    move v5, v6

    :cond_3a
    check-cast v10, Lg8/g1;

    iget-object v0, v10, Lg8/g1;->j:Le8/h2;

    new-instance v2, Lk6/m4;

    invoke-direct {v2, v9, v1, v5}, Lk6/m4;-><init>(ILjava/lang/Object;Z)V

    goto/16 :goto_18

    :goto_1b
    return-void

    :goto_1c
    if-eqz v4, :cond_3b

    iget-object v2, v4, Li3/a0;->a:Ljava/lang/Object;

    check-cast v2, Le8/c2;

    if-nez v2, :cond_3b

    move v5, v6

    :cond_3b
    check-cast v10, Lg8/g1;

    iget-object v2, v10, Lg8/g1;->j:Le8/h2;

    new-instance v3, Lk6/m4;

    invoke-direct {v3, v9, v1, v5}, Lk6/m4;-><init>(ILjava/lang/Object;Z)V

    invoke-virtual {v2, v3}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    throw v0

    :pswitch_a
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/c1;

    iget-object v0, v0, Lg8/c1;->a:Lg8/j0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/l1;

    invoke-interface {v0, v2}, Lg8/j0;->d(Le8/l1;)V

    return-void

    :pswitch_b
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/c1;

    iget-object v0, v0, Lg8/c1;->a:Lg8/j0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Lg8/a6;

    invoke-interface {v0, v2}, Lg8/b6;->a(Lg8/a6;)V

    return-void

    :pswitch_c
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d1;

    iget-object v0, v0, Lg8/d1;->c:Lg8/h0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/c2;

    invoke-interface {v0, v2}, Lg8/h0;->i(Le8/c2;)V

    return-void

    :pswitch_d
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d1;

    iget-object v0, v0, Lg8/d1;->c:Lg8/h0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Ljava/io/InputStream;

    invoke-interface {v0, v2}, Lg8/z5;->l(Ljava/io/InputStream;)V

    return-void

    :pswitch_e
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d1;

    iget-object v0, v0, Lg8/d1;->c:Lg8/h0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v2}, Lg8/h0;->m(Ljava/lang/String;)V

    return-void

    :pswitch_f
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d1;

    iget-object v0, v0, Lg8/d1;->c:Lg8/h0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/c0;

    invoke-interface {v0, v2}, Lg8/h0;->g(Le8/c0;)V

    return-void

    :pswitch_10
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d1;

    iget-object v0, v0, Lg8/d1;->c:Lg8/h0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/e0;

    invoke-interface {v0, v2}, Lg8/h0;->h(Le8/e0;)V

    return-void

    :pswitch_11
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/d1;

    iget-object v0, v0, Lg8/d1;->c:Lg8/h0;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/s;

    invoke-interface {v0, v2}, Lg8/z5;->d(Le8/s;)V

    return-void

    :pswitch_12
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y0;

    iget-object v0, v0, Lg8/y0;->h:Lg8/t3;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/c2;

    invoke-interface {v0, v2}, Lg8/t3;->d(Le8/c2;)V

    return-void

    :pswitch_13
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/u0;

    iget-object v0, v0, Lg8/u0;->a:Le8/j;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Le8/j;->onMessage(Ljava/lang/Object;)V

    return-void

    :pswitch_14
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/u0;

    iget-object v0, v0, Lg8/u0;->a:Le8/j;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/l1;

    invoke-virtual {v0, v2}, Le8/j;->onHeaders(Le8/l1;)V

    return-void

    :pswitch_15
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/v0;

    iget-object v0, v0, Lg8/v0;->f:Le8/k;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Le8/k;->sendMessage(Ljava/lang/Object;)V

    return-void

    :pswitch_16
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/v0;

    iget-object v0, v0, Lg8/v0;->f:Le8/k;

    iget-object v2, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v2, Le8/c2;

    iget-object v3, v2, Le8/c2;->b:Ljava/lang/String;

    iget-object v2, v2, Le8/c2;->c:Ljava/lang/Throwable;

    invoke-virtual {v0, v3, v2}, Le8/k;->cancel(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :pswitch_17
    iget-object v0, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/v0;

    sget-object v2, Le8/c2;->h:Le8/c2;

    iget-object v3, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v2

    sget-object v3, Lg8/v0;->j:Le8/l;

    invoke-virtual {v0, v2, v6}, Lg8/v0;->a(Le8/c2;Z)V

    return-void

    :pswitch_18
    iget-object v0, v1, Lg8/x1;->b:Ljava/lang/Object;

    check-cast v0, Lg8/k;

    iget-object v0, v0, Lg8/k;->b:Lg8/v3;

    iget-object v2, v1, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Throwable;

    invoke-interface {v0, v2}, Lg8/v3;->b(Ljava/lang/Throwable;)V

    return-void

    :pswitch_19
    invoke-direct/range {p0 .. p0}, Lg8/x1;->a()V

    return-void

    :pswitch_1a
    invoke-direct/range {p0 .. p0}, Lg8/x1;->b()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
