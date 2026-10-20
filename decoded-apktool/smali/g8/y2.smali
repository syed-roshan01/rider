.class public final Lg8/y2;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/h0;


# static fields
.field public static final E:Le8/g1;

.field public static final F:Le8/g1;

.field public static final G:Le8/c2;

.field public static final H:Ljava/util/Random;


# instance fields
.field public final synthetic A:Le8/p1;

.field public final synthetic B:Le8/h;

.field public final synthetic C:Le8/b0;

.field public final synthetic D:Lz5/k;

.field public final a:Le8/p1;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Le8/h2;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Le8/l1;

.field public final f:Lg8/i5;

.field public final g:Lg8/u1;

.field public final h:Z

.field public final i:Ljava/lang/Object;

.field public final j:Lg8/o;

.field public final k:J

.field public final l:J

.field public final m:Lg8/h5;

.field public final n:Lg8/u;

.field public volatile o:Lg8/c5;

.field public final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final q:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final r:Ljava/util/concurrent/atomic/AtomicInteger;

.field public s:Ll/z2;

.field public t:J

.field public u:Lg8/j0;

.field public v:Lr7/h;

.field public w:Lr7/h;

.field public x:J

.field public y:Le8/c2;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Le8/l1;->d:Lx9/v;

    sget-object v1, Le8/i1;->d:Ljava/util/BitSet;

    new-instance v1, Le8/g1;

    const-string v2, "grpc-previous-rpc-attempts"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lg8/y2;->E:Le8/g1;

    new-instance v1, Le8/g1;

    const-string v2, "grpc-retry-pushback-ms"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lg8/y2;->F:Le8/g1;

    sget-object v0, Le8/c2;->f:Le8/c2;

    const-string v1, "Stream thrown away because RetriableStream committed"

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    sput-object v0, Lg8/y2;->G:Le8/c2;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lg8/y2;->H:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Lz5/k;Le8/p1;Le8/l1;Le8/h;Lg8/i5;Lg8/u1;Le8/b0;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lg8/y2;->D:Lz5/k;

    iput-object v2, v0, Lg8/y2;->A:Le8/p1;

    iput-object v3, v0, Lg8/y2;->B:Le8/h;

    move-object/from16 v6, p7

    iput-object v6, v0, Lg8/y2;->C:Le8/b0;

    iget-object v6, v1, Lz5/k;->a:Ljava/lang/Object;

    check-cast v6, Lg8/l3;

    iget-object v7, v6, Lg8/l3;->T:Lg8/o;

    iget-wide v8, v6, Lg8/l3;->U:J

    iget-wide v10, v6, Lg8/l3;->V:J

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, Le8/h;->b:Ljava/util/concurrent/Executor;

    if-nez v3, :cond_0

    iget-object v3, v6, Lg8/l3;->h:Ljava/util/concurrent/Executor;

    :cond_0
    iget-object v6, v1, Lz5/k;->a:Ljava/lang/Object;

    check-cast v6, Lg8/l3;

    iget-object v6, v6, Lg8/l3;->f:Lg8/x;

    iget-object v6, v6, Lg8/x;->a:Lg8/m0;

    invoke-interface {v6}, Lg8/m0;->L()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    iget-object v1, v1, Lz5/k;->b:Ljava/lang/Object;

    check-cast v1, Lg8/h5;

    new-instance v12, Le8/h2;

    new-instance v13, Lg8/x2;

    const/4 v14, 0x1

    invoke-direct {v13, v0, v14}, Lg8/x2;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v12, v13}, Le8/h2;-><init>(Lg8/x2;)V

    iput-object v12, v0, Lg8/y2;->c:Le8/h2;

    new-instance v12, Ljava/lang/Object;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    iput-object v12, v0, Lg8/y2;->i:Ljava/lang/Object;

    new-instance v12, Lg8/u;

    invoke-direct {v12}, Lg8/u;-><init>()V

    iput-object v12, v0, Lg8/y2;->n:Lg8/u;

    new-instance v12, Lg8/c5;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v15, 0x8

    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v15, v12

    move-object/from16 v16, v13

    invoke-direct/range {v15 .. v23}, Lg8/c5;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lg8/g5;ZZZI)V

    iput-object v12, v0, Lg8/y2;->o:Lg8/c5;

    new-instance v12, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v12, v0, Lg8/y2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v12, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v12, v0, Lg8/y2;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v12, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v12, v0, Lg8/y2;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object v2, v0, Lg8/y2;->a:Le8/p1;

    iput-object v7, v0, Lg8/y2;->j:Lg8/o;

    iput-wide v8, v0, Lg8/y2;->k:J

    iput-wide v10, v0, Lg8/y2;->l:J

    iput-object v3, v0, Lg8/y2;->b:Ljava/util/concurrent/Executor;

    iput-object v6, v0, Lg8/y2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    move-object/from16 v2, p3

    iput-object v2, v0, Lg8/y2;->e:Le8/l1;

    iput-object v4, v0, Lg8/y2;->f:Lg8/i5;

    if-eqz v4, :cond_1

    iget-wide v2, v4, Lg8/i5;->b:J

    iput-wide v2, v0, Lg8/y2;->x:J

    :cond_1
    iput-object v5, v0, Lg8/y2;->g:Lg8/u1;

    const/4 v2, 0x0

    if-eqz v4, :cond_3

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    move v3, v2

    goto :goto_1

    :cond_3
    :goto_0
    move v3, v14

    :goto_1
    const-string v4, "Should not provide both retryPolicy and hedgingPolicy"

    invoke-static {v4, v3}, Ly3/e;->G(Ljava/lang/String;Z)V

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    move v14, v2

    :goto_2
    iput-boolean v14, v0, Lg8/y2;->h:Z

    iput-object v1, v0, Lg8/y2;->m:Lg8/h5;

    return-void
.end method

.method public static r(Lg8/y2;Ljava/lang/Integer;)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_1

    invoke-virtual {p0}, Lg8/y2;->w()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg8/y2;->w:Lr7/h;

    if-nez v1, :cond_2

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_2
    const/4 v2, 0x1

    iput-boolean v2, v1, Lr7/h;->b:Z

    iget-object v1, v1, Lr7/h;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Future;

    new-instance v2, Lr7/h;

    iget-object v3, p0, Lg8/y2;->i:Ljava/lang/Object;

    invoke-direct {v2, v3}, Lr7/h;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lg8/y2;->w:Lr7/h;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_3
    iget-object v0, p0, Lg8/y2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lg8/x1;

    const/16 v3, 0x19

    invoke-direct {v1, v3, p0, v2}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long p0, p0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p0, p1, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    invoke-virtual {v2, p0}, Lr7/h;->e(Ljava/util/concurrent/ScheduledFuture;)V

    :goto_0
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lg8/y2;->o:Lg8/c5;

    iget-boolean v1, v0, Lg8/c5;->a:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    iget-object v0, v0, Lg8/g5;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->a(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/w4;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lg8/w4;-><init>(II)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    :goto_0
    return-void
.end method

.method public final b(I)V
    .locals 2

    new-instance v0, Lg8/w4;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lg8/w4;-><init>(II)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final c(Z)V
    .locals 2

    new-instance v0, Lg8/v4;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lg8/v4;-><init>(IZ)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final d(Le8/s;)V
    .locals 2

    new-instance v0, Lg8/t4;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lg8/t4;-><init>(Lg8/y2;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final e(I)V
    .locals 2

    new-instance v0, Lg8/w4;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lg8/w4;-><init>(II)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final f(Lg8/u;)V
    .locals 4

    iget-object v0, p0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "closed"

    iget-object v2, p0, Lg8/y2;->n:Lg8/u;

    invoke-virtual {p1, v2, v1}, Lg8/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lg8/c5;->f:Lg8/g5;

    if-eqz v0, :cond_0

    new-instance v0, Lg8/u;

    invoke-direct {v0}, Lg8/u;-><init>()V

    iget-object v1, v1, Lg8/c5;->f:Lg8/g5;

    iget-object v1, v1, Lg8/g5;->a:Lg8/h0;

    invoke-interface {v1, v0}, Lg8/h0;->f(Lg8/u;)V

    const-string v1, "committed"

    invoke-virtual {p1, v0, v1}, Lg8/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    new-instance v0, Lg8/u;

    invoke-direct {v0}, Lg8/u;-><init>()V

    iget-object v1, v1, Lg8/c5;->c:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg8/g5;

    new-instance v3, Lg8/u;

    invoke-direct {v3}, Lg8/u;-><init>()V

    iget-object v2, v2, Lg8/g5;->a:Lg8/h0;

    invoke-interface {v2, v3}, Lg8/h0;->f(Lg8/u;)V

    invoke-virtual {v0, v3}, Lg8/u;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v1, "open"

    invoke-virtual {p1, v0, v1}, Lg8/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final flush()V
    .locals 2

    iget-object v0, p0, Lg8/y2;->o:Lg8/c5;

    iget-boolean v1, v0, Lg8/c5;->a:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    iget-object v0, v0, Lg8/g5;->a:Lg8/h0;

    invoke-interface {v0}, Lg8/z5;->flush()V

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/u4;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg8/u4;-><init>(I)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    :goto_0
    return-void
.end method

.method public final g(Le8/c0;)V
    .locals 2

    new-instance v0, Lg8/t4;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lg8/t4;-><init>(Lg8/y2;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final h(Le8/e0;)V
    .locals 2

    new-instance v0, Lg8/t4;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, v1}, Lg8/t4;-><init>(Lg8/y2;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final i(Le8/c2;)V
    .locals 13

    new-instance v0, Lg8/g5;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg8/g5;-><init>(I)V

    new-instance v1, Lg8/d4;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lg8/g5;->a:Lg8/h0;

    invoke-virtual {p0, v0}, Lg8/y2;->s(Lg8/g5;)Lb3/a1;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Lg8/y2;->o:Lg8/c5;

    invoke-virtual {v3, v0}, Lg8/c5;->e(Lg8/g5;)Lg8/c5;

    move-result-object v0

    iput-object v0, p0, Lg8/y2;->o:Lg8/c5;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lb3/a1;->run()V

    sget-object v0, Lg8/i0;->a:Lg8/i0;

    new-instance v1, Le8/l1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, v0, v1}, Lg8/y2;->y(Le8/c2;Lg8/i0;Le8/l1;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    iget-object v0, p0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v1, v1, Lg8/c5;->c:Ljava/util/Collection;

    iget-object v2, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v2, v2, Lg8/c5;->f:Lg8/g5;

    invoke-interface {v1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v1, v1, Lg8/c5;->f:Lg8/g5;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_1
    iput-object p1, p0, Lg8/y2;->y:Le8/c2;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lg8/y2;->o:Lg8/c5;

    new-instance v12, Lg8/c5;

    iget-object v4, v2, Lg8/c5;->b:Ljava/util/List;

    iget-object v5, v2, Lg8/c5;->c:Ljava/util/Collection;

    iget-object v6, v2, Lg8/c5;->d:Ljava/util/Collection;

    iget-object v7, v2, Lg8/c5;->f:Lg8/g5;

    const/4 v8, 0x1

    iget-boolean v9, v2, Lg8/c5;->a:Z

    iget-boolean v10, v2, Lg8/c5;->h:Z

    iget v11, v2, Lg8/c5;->e:I

    move-object v3, v12

    invoke-direct/range {v3 .. v11}, Lg8/c5;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lg8/g5;ZZZI)V

    iput-object v12, p0, Lg8/y2;->o:Lg8/c5;

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_2

    iget-object v0, v1, Lg8/g5;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->i(Le8/c2;)V

    :cond_2
    :goto_1
    return-void

    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final j(Lg8/j0;)V
    .locals 6

    iput-object p1, p0, Lg8/y2;->u:Lg8/j0;

    iget-object p1, p0, Lg8/y2;->D:Lz5/k;

    iget-object p1, p1, Lz5/k;->a:Ljava/lang/Object;

    check-cast p1, Lg8/l3;

    iget-object p1, p1, Lg8/l3;->E:Li3/a0;

    iget-object v0, p1, Li3/a0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, Li3/a0;->c:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Le8/c2;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Le8/c2;

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    iget-object p1, p1, Li3/a0;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p0, v1}, Lg8/y2;->i(Le8/c2;)V

    goto :goto_4

    :cond_1
    iget-object p1, p0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter p1

    :try_start_1
    iget-object v0, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->b:Ljava/util/List;

    new-instance v1, Lg8/b5;

    invoke-direct {v1, p0}, Lg8/b5;-><init>(Lg8/y2;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lg8/y2;->t(IZ)Lg8/g5;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_4

    :cond_2
    iget-boolean v0, p0, Lg8/y2;->h:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    invoke-virtual {v1, p1}, Lg8/c5;->a(Lg8/g5;)Lg8/c5;

    move-result-object v1

    iput-object v1, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    invoke-virtual {p0, v1}, Lg8/y2;->x(Lg8/c5;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lg8/y2;->m:Lg8/h5;

    if-eqz v1, :cond_3

    iget-object v2, v1, Lg8/h5;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    iget v1, v1, Lg8/h5;->b:I

    if-le v2, v1, :cond_4

    :cond_3
    new-instance v3, Lr7/h;

    iget-object v1, p0, Lg8/y2;->i:Ljava/lang/Object;

    invoke-direct {v3, v1}, Lr7/h;-><init>(Ljava/lang/Object;)V

    iput-object v3, p0, Lg8/y2;->w:Lr7/h;

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_4
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v3, :cond_5

    iget-object v0, p0, Lg8/y2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lg8/x1;

    const/16 v2, 0x19

    invoke-direct {v1, v2, p0, v3}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Lg8/y2;->g:Lg8/u1;

    iget-wide v4, v2, Lg8/u1;->b:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v4, v5, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-virtual {v3, v0}, Lr7/h;->e(Ljava/util/concurrent/ScheduledFuture;)V

    goto :goto_3

    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_5
    :goto_3
    invoke-virtual {p0, p1}, Lg8/y2;->v(Lg8/g5;)V

    :goto_4
    return-void

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    :goto_5
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/g5;

    iget-object v1, v1, Lg8/g5;->a:Lg8/h0;

    invoke-interface {v1}, Lg8/z5;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l(Ljava/io/InputStream;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "RetriableStream.writeMessage() should not be called directly"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lg8/t4;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lg8/t4;-><init>(Lg8/y2;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final n()V
    .locals 2

    new-instance v0, Lg8/u4;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg8/u4;-><init>(I)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final o()V
    .locals 2

    new-instance v0, Lg8/u4;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg8/u4;-><init>(I)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final p()Le8/c;
    .locals 1

    iget-object v0, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    iget-object v0, v0, Lg8/g5;->a:Lg8/h0;

    invoke-interface {v0}, Lg8/h0;->p()Le8/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Le8/c;->b:Le8/c;

    :goto_0
    return-object v0
.end method

.method public final q(Z)V
    .locals 2

    new-instance v0, Lg8/v4;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Lg8/v4;-><init>(IZ)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    return-void
.end method

.method public final s(Lg8/g5;)Lb3/a1;
    .locals 19

    move-object/from16 v8, p0

    iget-object v9, v8, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v9

    :try_start_0
    iget-object v0, v8, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit v9

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    iget-object v0, v8, Lg8/y2;->o:Lg8/c5;

    iget-object v3, v0, Lg8/c5;->c:Ljava/util/Collection;

    iget-object v0, v8, Lg8/y2;->o:Lg8/c5;

    iget-object v2, v0, Lg8/c5;->f:Lg8/g5;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v5

    :goto_0
    const-string v6, "Already committed"

    invoke-static {v6, v2}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v2, v0, Lg8/c5;->c:Ljava/util/Collection;

    move-object/from16 v6, p1

    invoke-interface {v2, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static/range {p1 .. p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    move-object v11, v1

    move-object v12, v2

    move/from16 v16, v4

    goto :goto_1

    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    iget-object v7, v0, Lg8/c5;->b:Ljava/util/List;

    move-object v12, v2

    move/from16 v16, v5

    move-object v11, v7

    :goto_1
    new-instance v2, Lg8/c5;

    iget-object v13, v0, Lg8/c5;->d:Ljava/util/Collection;

    iget-boolean v15, v0, Lg8/c5;->g:Z

    iget-boolean v5, v0, Lg8/c5;->h:Z

    iget v0, v0, Lg8/c5;->e:I

    move-object v10, v2

    move-object/from16 v14, p1

    move/from16 v17, v5

    move/from16 v18, v0

    invoke-direct/range {v10 .. v18}, Lg8/c5;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lg8/g5;ZZZI)V

    iput-object v2, v8, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v8, Lg8/y2;->j:Lg8/o;

    iget-wide v10, v8, Lg8/y2;->t:J

    neg-long v10, v10

    iget-object v0, v0, Lg8/o;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, v10, v11}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    iget-object v0, v8, Lg8/y2;->v:Lr7/h;

    if-eqz v0, :cond_3

    iput-boolean v4, v0, Lr7/h;->b:Z

    iget-object v0, v0, Lr7/h;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Future;

    iput-object v1, v8, Lg8/y2;->v:Lr7/h;

    move-object v5, v0

    goto :goto_2

    :cond_3
    move-object v5, v1

    :goto_2
    iget-object v0, v8, Lg8/y2;->w:Lr7/h;

    if-eqz v0, :cond_4

    iput-boolean v4, v0, Lr7/h;->b:Z

    iget-object v0, v0, Lr7/h;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Future;

    iput-object v1, v8, Lg8/y2;->w:Lr7/h;

    goto :goto_3

    :cond_4
    move-object v0, v1

    :goto_3
    new-instance v10, Lb3/a1;

    const/4 v7, 0x3

    move-object v1, v10

    move-object/from16 v2, p0

    move-object/from16 v4, p1

    move-object v6, v0

    invoke-direct/range {v1 .. v7}, Lb3/a1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    monitor-exit v9

    move-object v1, v10

    :goto_4
    return-object v1

    :goto_5
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final t(IZ)Lg8/g5;
    .locals 7

    :cond_0
    iget-object v0, p0, Lg8/y2;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-gez v1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lg8/g5;

    invoke-direct {v0, p1}, Lg8/g5;-><init>(I)V

    new-instance v1, Lg8/z4;

    invoke-direct {v1, p0, v0}, Lg8/z4;-><init>(Lg8/y2;Lg8/g5;)V

    new-instance v2, Lg8/x4;

    invoke-direct {v2, v1}, Lg8/x4;-><init>(Lg8/z4;)V

    new-instance v1, Le8/l1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v3, p0, Lg8/y2;->e:Le8/l1;

    invoke-virtual {v1, v3}, Le8/l1;->d(Le8/l1;)V

    if-lez p1, :cond_2

    sget-object v3, Lg8/y2;->E:Le8/g1;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Le8/l1;->f(Le8/i1;Ljava/io/Serializable;)V

    :cond_2
    iget-object v3, p0, Lg8/y2;->B:Le8/h;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v5, v3, Le8/h;->g:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v3}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object v2

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v2, Le8/g;->g:Ljava/util/List;

    new-instance v3, Le8/h;

    invoke-direct {v3, v2}, Le8/h;-><init>(Le8/g;)V

    invoke-static {v3, v1, p1, p2}, Lg8/s1;->c(Le8/h;Le8/l1;IZ)[Le8/p;

    move-result-object p1

    new-instance p2, Lg8/j4;

    iget-object v2, p0, Lg8/y2;->A:Le8/p1;

    invoke-direct {p2, v2, v1, v3}, Lg8/j4;-><init>(Le8/p1;Le8/l1;Le8/h;)V

    iget-object v4, p0, Lg8/y2;->D:Lz5/k;

    invoke-virtual {v4, p2}, Lz5/k;->b(Lg8/j4;)Lg8/k0;

    move-result-object p2

    iget-object v4, p0, Lg8/y2;->C:Le8/b0;

    invoke-virtual {v4}, Le8/b0;->a()Le8/b0;

    move-result-object v5

    :try_start_0
    invoke-interface {p2, v2, v1, v3, p1}, Lg8/k0;->d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4, v5}, Le8/b0;->c(Le8/b0;)V

    iput-object p1, v0, Lg8/g5;->a:Lg8/h0;

    move-object p1, v0

    :goto_0
    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v4, v5}, Le8/b0;->c(Le8/b0;)V

    throw p1
.end method

.method public final u(Lg8/y4;)V
    .locals 2

    iget-object v0, p0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    iget-boolean v1, v1, Lg8/c5;->a:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v1, v1, Lg8/c5;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v1, v1, Lg8/c5;->c:Ljava/util/Collection;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/g5;

    invoke-interface {p1, v1}, Lg8/y4;->a(Lg8/g5;)V

    goto :goto_1

    :cond_1
    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final v(Lg8/g5;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v0

    move-object v3, v1

    :goto_0
    iget-object v4, p0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v6, v5, Lg8/c5;->f:Lg8/g5;

    if-eqz v6, :cond_0

    if-eq v6, p1, :cond_0

    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    iget-boolean v6, v5, Lg8/c5;->g:Z

    if-eqz v6, :cond_1

    monitor-exit v4

    goto :goto_1

    :cond_1
    iget-object v6, v5, Lg8/c5;->b:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v0, v6, :cond_6

    invoke-virtual {v5, p1}, Lg8/c5;->e(Lg8/g5;)Lg8/c5;

    move-result-object v0

    iput-object v0, p0, Lg8/y2;->o:Lg8/c5;

    invoke-virtual {p0}, Lg8/y2;->k()Z

    move-result v0

    if-nez v0, :cond_2

    monitor-exit v4

    goto :goto_3

    :cond_2
    new-instance v1, Lg8/t0;

    const/16 v0, 0x9

    invoke-direct {v1, p0, v0}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    if-eqz v1, :cond_3

    iget-object p1, p0, Lg8/y2;->c:Le8/h2;

    invoke-virtual {p1, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_3
    if-nez v2, :cond_4

    iget-object v0, p1, Lg8/g5;->a:Lg8/h0;

    new-instance v1, Lg8/f5;

    invoke-direct {v1, p0, p1}, Lg8/f5;-><init>(Lg8/y2;Lg8/g5;)V

    invoke-interface {v0, v1}, Lg8/h0;->j(Lg8/j0;)V

    :cond_4
    iget-object v0, p1, Lg8/g5;->a:Lg8/h0;

    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v1, v1, Lg8/c5;->f:Lg8/g5;

    if-ne v1, p1, :cond_5

    iget-object p1, p0, Lg8/y2;->y:Le8/c2;

    goto :goto_2

    :cond_5
    sget-object p1, Lg8/y2;->G:Le8/c2;

    :goto_2
    invoke-interface {v0, p1}, Lg8/h0;->i(Le8/c2;)V

    goto :goto_3

    :cond_6
    :try_start_1
    iget-boolean v6, p1, Lg8/g5;->b:Z

    if-eqz v6, :cond_7

    monitor-exit v4

    :goto_3
    return-void

    :cond_7
    add-int/lit16 v6, v0, 0x80

    iget-object v7, v5, Lg8/c5;->b:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-nez v3, :cond_8

    new-instance v3, Ljava/util/ArrayList;

    iget-object v5, v5, Lg8/c5;->b:Ljava/util/List;

    invoke-interface {v5, v0, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_4

    :cond_8
    invoke-interface {v3}, Ljava/util/List;->clear()V

    iget-object v5, v5, Lg8/c5;->b:Ljava/util/List;

    invoke-interface {v5, v0, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_4
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg8/y4;

    invoke-interface {v4, p1}, Lg8/y4;->a(Lg8/g5;)V

    instance-of v4, v4, Lg8/b5;

    if-eqz v4, :cond_a

    const/4 v2, 0x1

    :cond_a
    iget-object v4, p0, Lg8/y2;->o:Lg8/c5;

    iget-object v5, v4, Lg8/c5;->f:Lg8/g5;

    if-eqz v5, :cond_b

    if-eq v5, p1, :cond_b

    goto :goto_5

    :cond_b
    iget-boolean v4, v4, Lg8/c5;->g:Z

    if-eqz v4, :cond_9

    :cond_c
    :goto_5
    move v0, v6

    goto/16 :goto_0

    :goto_6
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final w()V
    .locals 13

    iget-object v0, p0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg8/y2;->w:Lr7/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v3, 0x1

    iput-boolean v3, v1, Lr7/h;->b:Z

    iget-object v1, v1, Lr7/h;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Future;

    iput-object v2, p0, Lg8/y2;->w:Lr7/h;

    move-object v2, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lg8/y2;->o:Lg8/c5;

    iget-boolean v3, v1, Lg8/c5;->h:Z

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v3, Lg8/c5;

    iget-object v5, v1, Lg8/c5;->b:Ljava/util/List;

    iget-object v6, v1, Lg8/c5;->c:Ljava/util/Collection;

    iget-object v7, v1, Lg8/c5;->d:Ljava/util/Collection;

    iget-object v8, v1, Lg8/c5;->f:Lg8/g5;

    iget-boolean v9, v1, Lg8/c5;->g:Z

    iget-boolean v10, v1, Lg8/c5;->a:Z

    const/4 v11, 0x1

    iget v12, v1, Lg8/c5;->e:I

    move-object v4, v3

    invoke-direct/range {v4 .. v12}, Lg8/c5;-><init>(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Lg8/g5;ZZZI)V

    move-object v1, v3

    :goto_1
    iput-object v1, p0, Lg8/y2;->o:Lg8/c5;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_2
    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final x(Lg8/c5;)Z
    .locals 2

    iget-object v0, p1, Lg8/c5;->f:Lg8/g5;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg8/y2;->g:Lg8/u1;

    iget v0, v0, Lg8/u1;->a:I

    iget v1, p1, Lg8/c5;->e:I

    if-ge v1, v0, :cond_0

    iget-boolean p1, p1, Lg8/c5;->h:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final y(Le8/c2;Lg8/i0;Le8/l1;)V
    .locals 8

    new-instance v0, Ll/z2;

    const/16 v1, 0x16

    invoke-direct {v0, p1, p2, p3, v1}, Ll/z2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, Lg8/y2;->s:Ll/z2;

    iget-object v0, p0, Lg8/y2;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-ne v0, v1, :cond_0

    new-instance v0, Lk/e;

    const/16 v7, 0x8

    move-object v2, v0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lk/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Lg8/y2;->c:Le8/h2;

    invoke-virtual {p1, v0}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final z(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lg8/y2;->o:Lg8/c5;

    iget-boolean v1, v0, Lg8/c5;->a:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    iget-object v0, v0, Lg8/g5;->a:Lg8/h0;

    iget-object v1, p0, Lg8/y2;->a:Le8/p1;

    invoke-virtual {v1, p1}, Le8/p1;->d(Ljava/lang/Object;)Ll8/a;

    move-result-object p1

    invoke-interface {v0, p1}, Lg8/z5;->l(Ljava/io/InputStream;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/t4;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p1, v1}, Lg8/t4;-><init>(Lg8/y2;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/y2;->u(Lg8/y4;)V

    :goto_0
    return-void
.end method
