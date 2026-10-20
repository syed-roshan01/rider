.class public final Lg8/l3;
.super Le8/c1;

# interfaces
.implements Le8/p0;


# static fields
.field public static final b0:Ljava/util/logging/Logger;

.field public static final c0:Ljava/util/regex/Pattern;

.field public static final d0:Le8/c2;

.field public static final e0:Le8/c2;

.field public static final f0:Le8/c2;

.field public static final g0:Lg8/s3;

.field public static final h0:Lg8/t2;

.field public static final i0:Le8/l;


# instance fields
.field public A:Ljava/util/Collection;

.field public final B:Ljava/lang/Object;

.field public final C:Ljava/util/HashSet;

.field public final D:Lg8/y0;

.field public final E:Li3/a0;

.field public final F:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public G:Z

.field public H:Z

.field public volatile I:Z

.field public final J:Ljava/util/concurrent/CountDownLatch;

.field public final K:Lg8/v2;

.field public final L:Lg8/y;

.field public final M:Lg8/b0;

.field public final N:Lg8/z;

.field public final O:Le8/n0;

.field public final P:Lg8/i3;

.field public Q:Lg8/s3;

.field public R:Z

.field public final S:Z

.field public final T:Lg8/o;

.field public final U:J

.field public final V:J

.field public final W:Z

.field public final X:Lg8/z1;

.field public final Y:Lz5/k;

.field public final Z:Lg8/s4;

.field public final a:Le8/q0;

.field public a0:I

.field public final b:Ljava/lang/String;

.field public final c:Le8/u1;

.field public final d:Le8/q1;

.field public final e:Lg8/s;

.field public final f:Lg8/x;

.field public final g:Lg8/j3;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Lg8/l1;

.field public final j:Lg8/b3;

.field public final k:Lg8/b3;

.field public final l:Lg8/c6;

.field public final m:Le8/h2;

.field public final n:Le8/e0;

.field public final o:Le8/w;

.field public final p:Lq6/m;

.field public final q:J

.field public final r:Lz5/k;

.field public final s:Lr7/e;

.field public final t:Le8/j0;

.field public u:Lg8/o1;

.field public v:Z

.field public w:Lg8/c3;

.field public volatile x:Lz6/a;

.field public y:Z

.field public final z:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-class v0, Lg8/l3;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lg8/l3;->b0:Ljava/util/logging/Logger;

    const-string v0, "[a-zA-Z][a-zA-Z0-9+.-]*:/.*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lg8/l3;->c0:Ljava/util/regex/Pattern;

    sget-object v0, Le8/c2;->m:Le8/c2;

    const-string v1, "Channel shutdownNow invoked"

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v1

    sput-object v1, Lg8/l3;->d0:Le8/c2;

    const-string v1, "Channel shutdown invoked"

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v1

    sput-object v1, Lg8/l3;->e0:Le8/c2;

    const-string v1, "Subchannel shutdown invoked"

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    sput-object v0, Lg8/l3;->f0:Le8/c2;

    new-instance v0, Lg8/s3;

    const/4 v2, 0x0

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lg8/s3;-><init>(Lg8/q3;Ljava/util/HashMap;Ljava/util/HashMap;Lg8/h5;Ljava/lang/Object;Ljava/util/Map;)V

    sput-object v0, Lg8/l3;->g0:Lg8/s3;

    new-instance v0, Lg8/t2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg8/l3;->h0:Lg8/t2;

    new-instance v0, Le8/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg8/l3;->i0:Le8/l;

    return-void
.end method

.method public constructor <init>(Lg8/n3;Lh8/h;Lr7/e;Lg8/l1;Lx9/v;Ljava/util/ArrayList;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p5

    sget-object v3, Lg8/c6;->a:Lg8/k4;

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v13, Le8/h2;

    new-instance v4, Lg8/x2;

    const/4 v14, 0x0

    invoke-direct {v4, v0, v14}, Lg8/x2;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v13, v4}, Le8/h2;-><init>(Lg8/x2;)V

    iput-object v13, v0, Lg8/l3;->m:Le8/h2;

    new-instance v4, Lz5/k;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v4, Lz5/k;->a:Ljava/lang/Object;

    sget-object v5, Le8/x;->d:Le8/x;

    iput-object v5, v4, Lz5/k;->b:Ljava/lang/Object;

    iput-object v4, v0, Lg8/l3;->r:Lz5/k;

    new-instance v4, Ljava/util/HashSet;

    const/16 v5, 0x10

    const/high16 v6, 0x3f400000    # 0.75f

    invoke-direct {v4, v5, v6}, Ljava/util/HashSet;-><init>(IF)V

    iput-object v4, v0, Lg8/l3;->z:Ljava/util/HashSet;

    new-instance v4, Ljava/lang/Object;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, v0, Lg8/l3;->B:Ljava/lang/Object;

    new-instance v4, Ljava/util/HashSet;

    const/4 v15, 0x1

    invoke-direct {v4, v15, v6}, Ljava/util/HashSet;-><init>(IF)V

    iput-object v4, v0, Lg8/l3;->C:Ljava/util/HashSet;

    new-instance v4, Li3/a0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v0, v4, Li3/a0;->d:Ljava/lang/Object;

    new-instance v5, Ljava/lang/Object;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-object v5, v4, Li3/a0;->a:Ljava/lang/Object;

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    iput-object v5, v4, Li3/a0;->b:Ljava/lang/Object;

    iput-object v4, v0, Lg8/l3;->E:Li3/a0;

    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v4, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v4, v0, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v4, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v4, v15}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v4, v0, Lg8/l3;->J:Ljava/util/concurrent/CountDownLatch;

    iput v15, v0, Lg8/l3;->a0:I

    sget-object v4, Lg8/l3;->g0:Lg8/s3;

    iput-object v4, v0, Lg8/l3;->Q:Lg8/s3;

    iput-boolean v14, v0, Lg8/l3;->R:Z

    new-instance v4, Lg8/o;

    invoke-direct {v4, v15}, Lg8/o;-><init>(I)V

    iput-object v4, v0, Lg8/l3;->T:Lg8/o;

    new-instance v12, Lg8/a3;

    invoke-direct {v12, v0}, Lg8/a3;-><init>(Lg8/l3;)V

    new-instance v4, Lg8/z1;

    invoke-direct {v4, v0}, Lg8/z1;-><init>(Lg8/l3;)V

    iput-object v4, v0, Lg8/l3;->X:Lg8/z1;

    new-instance v4, Lz5/k;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v0, v4, Lz5/k;->a:Ljava/lang/Object;

    iput-object v4, v0, Lg8/l3;->Y:Lz5/k;

    iget-object v11, v1, Lg8/n3;->e:Ljava/lang/String;

    const-string v4, "target"

    invoke-static {v11, v4}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v11, v0, Lg8/l3;->b:Ljava/lang/String;

    new-instance v4, Le8/q0;

    sget-object v5, Le8/q0;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v5

    const-string v7, "Channel"

    invoke-direct {v4, v7, v11, v5, v6}, Le8/q0;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iput-object v4, v0, Lg8/l3;->a:Le8/q0;

    iput-object v3, v0, Lg8/l3;->l:Lg8/c6;

    iget-object v5, v1, Lg8/n3;->a:Lg8/l1;

    const-string v6, "executorPool"

    invoke-static {v5, v6}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v5, v0, Lg8/l3;->i:Lg8/l1;

    iget v6, v5, Lg8/l1;->a:I

    iget-object v5, v5, Lg8/l1;->b:Ljava/lang/Object;

    packed-switch v6, :pswitch_data_0

    check-cast v5, Lg8/v5;

    invoke-static {v5}, Lg8/w5;->a(Lg8/v5;)Ljava/lang/Object;

    move-result-object v5

    :pswitch_0
    move-object v10, v5

    check-cast v10, Ljava/util/concurrent/Executor;

    const-string v5, "executor"

    invoke-static {v10, v5}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v10, v0, Lg8/l3;->h:Ljava/util/concurrent/Executor;

    new-instance v9, Lg8/b3;

    iget-object v5, v1, Lg8/n3;->b:Lg8/l1;

    const-string v6, "offloadExecutorPool"

    invoke-static {v5, v6}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v9, v5}, Lg8/b3;-><init>(Lg8/l1;)V

    iput-object v9, v0, Lg8/l3;->k:Lg8/b3;

    new-instance v5, Lg8/x;

    move-object/from16 v6, p2

    invoke-direct {v5, v6, v9}, Lg8/x;-><init>(Lh8/h;Lg8/b3;)V

    iput-object v5, v0, Lg8/l3;->f:Lg8/x;

    new-instance v8, Lg8/j3;

    invoke-interface/range {p2 .. p2}, Lg8/m0;->L()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v5

    invoke-direct {v8, v5}, Lg8/j3;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object v8, v0, Lg8/l3;->g:Lg8/j3;

    new-instance v5, Lg8/b0;

    invoke-virtual {v3}, Lg8/k4;->a()J

    move-result-wide v6

    const-string v14, "Channel for \'"

    const-string v15, "\'"

    invoke-static {v14, v11, v15}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v5, v4, v6, v7, v14}, Lg8/b0;-><init>(Le8/q0;JLjava/lang/String;)V

    iput-object v5, v0, Lg8/l3;->M:Lg8/b0;

    new-instance v14, Lg8/z;

    invoke-direct {v14, v5, v3}, Lg8/z;-><init>(Lg8/b0;Lg8/c6;)V

    iput-object v14, v0, Lg8/l3;->N:Lg8/z;

    sget-object v6, Lg8/s1;->m:Lg8/l4;

    iget-boolean v4, v1, Lg8/n3;->n:Z

    iput-boolean v4, v0, Lg8/l3;->W:Z

    new-instance v5, Lg8/s;

    iget-object v7, v1, Lg8/n3;->f:Ljava/lang/String;

    invoke-direct {v5, v7}, Lg8/s;-><init>(Ljava/lang/String;)V

    iput-object v5, v0, Lg8/l3;->e:Lg8/s;

    new-instance v15, Lg8/n5;

    iget v7, v1, Lg8/n3;->j:I

    move-object/from16 v16, v8

    iget v8, v1, Lg8/n3;->k:I

    invoke-direct {v15, v4, v7, v8, v5}, Lg8/n5;-><init>(ZIILg8/s;)V

    const/16 v17, 0x0

    iget-object v4, v1, Lg8/n3;->w:Lg8/m3;

    invoke-interface {v4}, Lg8/m3;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Le8/q1;

    move-object v4, v8

    move-object v7, v13

    move-object/from16 v18, v8

    move-object v8, v15

    move-object v15, v9

    move-object/from16 v9, v16

    move-object/from16 v19, v10

    move-object v10, v14

    move-object v14, v11

    move-object v11, v15

    move-object v15, v12

    move-object/from16 v12, v17

    invoke-direct/range {v4 .. v12}, Le8/q1;-><init>(Ljava/lang/Integer;Le8/w1;Le8/h2;Lg8/n5;Ljava/util/concurrent/ScheduledExecutorService;Le8/i;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    move-object/from16 v4, v18

    iput-object v4, v0, Lg8/l3;->d:Le8/q1;

    iget-object v5, v1, Lg8/n3;->d:Le8/u1;

    iput-object v5, v0, Lg8/l3;->c:Le8/u1;

    invoke-static {v14, v5, v4}, Lg8/l3;->D(Ljava/lang/String;Le8/u1;Le8/q1;)Lg8/o1;

    move-result-object v4

    iput-object v4, v0, Lg8/l3;->u:Lg8/o1;

    new-instance v4, Lg8/b3;

    move-object/from16 v5, p4

    invoke-direct {v4, v5}, Lg8/b3;-><init>(Lg8/l1;)V

    iput-object v4, v0, Lg8/l3;->j:Lg8/b3;

    new-instance v4, Lg8/y0;

    move-object/from16 v5, v19

    invoke-direct {v4, v5, v13}, Lg8/y0;-><init>(Ljava/util/concurrent/Executor;Le8/h2;)V

    iput-object v4, v0, Lg8/l3;->D:Lg8/y0;

    invoke-virtual {v4, v15}, Lg8/y0;->e(Lg8/t3;)Ljava/lang/Runnable;

    move-object/from16 v4, p3

    iput-object v4, v0, Lg8/l3;->s:Lr7/e;

    iget-boolean v4, v1, Lg8/n3;->p:Z

    iput-boolean v4, v0, Lg8/l3;->S:Z

    new-instance v4, Lg8/i3;

    iget-object v5, v0, Lg8/l3;->u:Lg8/o1;

    invoke-virtual {v5}, Lg8/o1;->k()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Lg8/i3;-><init>(Lg8/l3;Ljava/lang/String;)V

    iput-object v4, v0, Lg8/l3;->P:Lg8/i3;

    invoke-virtual/range {p6 .. p6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, La7/a;->w(Ljava/lang/Object;)V

    new-instance v6, Le8/m;

    invoke-direct {v6, v4}, Le8/m;-><init>(Le8/j0;)V

    move-object v4, v6

    goto :goto_0

    :cond_0
    iput-object v4, v0, Lg8/l3;->t:Le8/j0;

    const-string v4, "stopwatchSupplier"

    invoke-static {v2, v4}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v0, Lg8/l3;->p:Lq6/m;

    iget-wide v4, v1, Lg8/n3;->i:J

    const-wide/16 v6, -0x1

    cmp-long v6, v4, v6

    if-nez v6, :cond_1

    iput-wide v4, v0, Lg8/l3;->q:J

    goto :goto_2

    :cond_1
    sget-wide v6, Lg8/n3;->z:J

    cmp-long v6, v4, v6

    if-ltz v6, :cond_2

    const/4 v14, 0x1

    goto :goto_1

    :cond_2
    const/4 v14, 0x0

    :goto_1
    const-string v6, "invalid idleTimeoutMillis %s"

    invoke-static {v4, v5, v6, v14}, Ly3/e;->D(JLjava/lang/String;Z)V

    iget-wide v4, v1, Lg8/n3;->i:J

    iput-wide v4, v0, Lg8/l3;->q:J

    :goto_2
    new-instance v4, Lg8/s4;

    new-instance v5, Lg8/u2;

    invoke-direct {v5, v0}, Lg8/u2;-><init>(Lg8/l3;)V

    iget-object v6, v0, Lg8/l3;->m:Le8/h2;

    iget-object v7, v0, Lg8/l3;->f:Lg8/x;

    iget-object v7, v7, Lg8/x;->a:Lg8/m0;

    invoke-interface {v7}, Lg8/m0;->L()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v7

    invoke-virtual/range {p5 .. p5}, Lx9/v;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq6/l;

    invoke-direct {v4, v5, v6, v7, v2}, Lg8/s4;-><init>(Lg8/u2;Le8/h2;Ljava/util/concurrent/ScheduledExecutorService;Lq6/l;)V

    iput-object v4, v0, Lg8/l3;->Z:Lg8/s4;

    iget-object v2, v1, Lg8/n3;->g:Le8/e0;

    const-string v4, "decompressorRegistry"

    invoke-static {v2, v4}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v0, Lg8/l3;->n:Le8/e0;

    iget-object v2, v1, Lg8/n3;->h:Le8/w;

    const-string v4, "compressorRegistry"

    invoke-static {v2, v4}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v0, Lg8/l3;->o:Le8/w;

    iget-wide v4, v1, Lg8/n3;->l:J

    iput-wide v4, v0, Lg8/l3;->V:J

    iget-wide v4, v1, Lg8/n3;->m:J

    iput-wide v4, v0, Lg8/l3;->U:J

    new-instance v2, Lg8/v2;

    invoke-direct {v2, v0, v3}, Lg8/v2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v0, Lg8/l3;->K:Lg8/v2;

    new-instance v2, Lg8/y;

    check-cast v3, Lg8/c6;

    invoke-direct {v2, v3}, Lg8/y;-><init>(Lg8/c6;)V

    iput-object v2, v0, Lg8/l3;->L:Lg8/y;

    iget-object v1, v1, Lg8/n3;->o:Le8/n0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v0, Lg8/l3;->O:Le8/n0;

    iget-object v1, v1, Le8/n0;->a:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual/range {p0 .. p0}, Lg8/l3;->b()Le8/q0;

    move-result-object v2

    iget-wide v2, v2, Le8/q0;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/p0;

    iget-boolean v1, v0, Lg8/l3;->S:Z

    if-nez v1, :cond_3

    const/4 v1, 0x1

    iput-boolean v1, v0, Lg8/l3;->R:Z

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static A(Lg8/l3;)V
    .locals 3

    iget-boolean v0, p0, Lg8/l3;->I:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/l3;->z:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/l3;->C:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/l3;->N:Lg8/z;

    const/4 v1, 0x2

    const-string v2, "Terminated"

    invoke-virtual {v0, v1, v2}, Lg8/z;->a(ILjava/lang/String;)V

    iget-object v0, p0, Lg8/l3;->O:Le8/n0;

    iget-object v0, v0, Le8/n0;->a:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {p0}, Lg8/l3;->b()Le8/q0;

    move-result-object v1

    iget-wide v1, v1, Le8/q0;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/p0;

    iget-object v0, p0, Lg8/l3;->i:Lg8/l1;

    iget-object v1, p0, Lg8/l3;->h:Ljava/util/concurrent/Executor;

    iget v2, v0, Lg8/l1;->a:I

    packed-switch v2, :pswitch_data_0

    iget-object v0, v0, Lg8/l1;->b:Ljava/lang/Object;

    check-cast v0, Lg8/v5;

    invoke-static {v0, v1}, Lg8/w5;->b(Lg8/v5;Ljava/util/concurrent/Executor;)V

    :pswitch_0
    iget-object v0, p0, Lg8/l3;->j:Lg8/b3;

    invoke-virtual {v0}, Lg8/b3;->a()V

    iget-object v0, p0, Lg8/l3;->k:Lg8/b3;

    invoke-virtual {v0}, Lg8/b3;->a()V

    iget-object v0, p0, Lg8/l3;->f:Lg8/x;

    invoke-virtual {v0}, Lg8/x;->close()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/l3;->I:Z

    iget-object p0, p0, Lg8/l3;->J:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_1
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static D(Ljava/lang/String;Le8/u1;Le8/q1;)Lg8/o1;
    .locals 8

    const-string v0, "/"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/net/URI;

    invoke-direct {v3, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v3, v2

    :goto_0
    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {p1, v3, p2}, Le8/u1;->a0(Ljava/net/URI;Le8/q1;)Lg8/g1;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    sget-object v3, Lg8/l3;->c0:Ljava/util/regex/Pattern;

    invoke-virtual {v3, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    const-string v5, ""

    if-nez v3, :cond_2

    :try_start_1
    new-instance v3, Ljava/net/URI;

    invoke-virtual {p1}, Le8/u1;->o0()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v6, v5, v0, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {p1, v3, p2}, Le8/u1;->a0(Ljava/net/URI;Le8/q1;)Lg8/g1;

    move-result-object v3

    if-eqz v3, :cond_2

    :goto_1
    new-instance p0, Lg8/m5;

    new-instance p1, Lg8/t;

    new-instance v0, Lr7/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1, v4}, Lr7/e;-><init>(II)V

    iget-object v1, p2, Le8/q1;->e:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v1, :cond_1

    iget-object p2, p2, Le8/q1;->c:Le8/h2;

    invoke-direct {p1, v0, v1, p2}, Lg8/t;-><init>(Lr7/e;Ljava/util/concurrent/ScheduledExecutorService;Le8/h2;)V

    invoke-direct {p0, v3, p1, p2}, Lg8/m5;-><init>(Le8/j0;Lg8/t;Le8/h2;)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "ScheduledExecutorService not set in Builder"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p0, p2, v4

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-lez p0, :cond_3

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_3
    const/4 p0, 0x1

    aput-object v5, p2, p0

    const-string p0, "cannot find a NameResolver for %s%s"

    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static y(Lg8/l3;)V
    .locals 6

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lg8/l3;->G(Z)V

    const/4 v0, 0x0

    iget-object v1, p0, Lg8/l3;->D:Lg8/y0;

    invoke-virtual {v1, v0}, Lg8/y0;->i(Lz6/a;)V

    iget-object v0, p0, Lg8/l3;->N:Lg8/z;

    const-string v2, "Entering IDLE state"

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v2}, Lg8/z;->a(ILjava/lang/String;)V

    sget-object v0, Le8/x;->d:Le8/x;

    iget-object v2, p0, Lg8/l3;->r:Lz5/k;

    invoke-virtual {v2, v0}, Lz5/k;->c(Le8/x;)V

    iget-object v0, p0, Lg8/l3;->B:Ljava/lang/Object;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lg8/l3;->X:Lg8/z1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    iget-object v5, v1, Lf4/y;->a:Ljava/lang/Object;

    check-cast v5, Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Lg8/l3;->C()V

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static z(Lg8/l3;)V
    .locals 6

    iget-boolean v0, p0, Lg8/l3;->G:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg8/l3;->z:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/j2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lg8/b2;

    const/4 v3, 0x0

    sget-object v4, Lg8/l3;->d0:Le8/c2;

    invoke-direct {v2, v1, v4, v3}, Lg8/b2;-><init>(Lg8/j2;Le8/c2;I)V

    iget-object v3, v1, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v3, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    new-instance v2, Lg8/b2;

    const/4 v5, 0x1

    invoke-direct {v2, v1, v4, v5}, Lg8/b2;-><init>(Lg8/j2;Le8/c2;I)V

    invoke-virtual {v3, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lg8/l3;->C:Ljava/util/HashSet;

    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final B(Z)V
    .locals 2

    iget-object v0, p0, Lg8/l3;->Z:Lg8/s4;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lg8/s4;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, v0, Lg8/s4;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p1, :cond_0

    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 p1, 0x0

    iput-object p1, v0, Lg8/s4;->g:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public final C()V
    .locals 5

    iget-object v0, p0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v0}, Le8/h2;->d()V

    iget-object v0, p0, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lg8/l3;->y:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lg8/l3;->X:Lg8/z1;

    iget-object v0, v0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lg8/l3;->B(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lg8/l3;->E()V

    :goto_0
    iget-object v0, p0, Lg8/l3;->w:Lg8/c3;

    if-eqz v0, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x2

    const-string v2, "Exiting idle mode"

    iget-object v3, p0, Lg8/l3;->N:Lg8/z;

    invoke-virtual {v3, v0, v2}, Lg8/z;->a(ILjava/lang/String;)V

    new-instance v0, Lg8/c3;

    invoke-direct {v0, p0}, Lg8/c3;-><init>(Lg8/l3;)V

    iget-object v2, p0, Lg8/l3;->e:Lg8/s;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Li3/a0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v2, v3, Li3/a0;->d:Ljava/lang/Object;

    iput-object v0, v3, Li3/a0;->a:Ljava/lang/Object;

    iget-object v4, v2, Lg8/s;->a:Le8/b1;

    iget-object v2, v2, Lg8/s;->b:Ljava/lang/String;

    invoke-virtual {v4, v2}, Le8/b1;->b(Ljava/lang/String;)Le8/a1;

    move-result-object v4

    iput-object v4, v3, Li3/a0;->c:Ljava/lang/Object;

    if-eqz v4, :cond_3

    invoke-virtual {v4, v0}, Le8/i;->c(Le8/j0;)Le8/z0;

    move-result-object v2

    iput-object v2, v3, Li3/a0;->b:Ljava/lang/Object;

    iput-object v3, v0, Lg8/c3;->a:Li3/a0;

    iput-object v0, p0, Lg8/l3;->w:Lg8/c3;

    new-instance v2, Lg8/d3;

    iget-object v3, p0, Lg8/l3;->u:Lg8/o1;

    invoke-direct {v2, p0, v0, v3}, Lg8/d3;-><init>(Lg8/l3;Lg8/c3;Le8/j0;)V

    iget-object v0, p0, Lg8/l3;->u:Lg8/o1;

    invoke-virtual {v0, v2}, Lg8/o1;->q(Le8/i;)V

    iput-boolean v1, p0, Lg8/l3;->v:Z

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not find policy \'"

    const-string v3, "\'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."

    invoke-static {v1, v2, v3}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    return-void
.end method

.method public final E()V
    .locals 11

    iget-wide v0, p0, Lg8/l3;->q:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lg8/l3;->Z:Lg8/s4;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, v3, Lg8/s4;->d:Lq6/l;

    invoke-virtual {v4, v2}, Lq6/l;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    add-long/2addr v4, v0

    const/4 v6, 0x1

    iput-boolean v6, v3, Lg8/s4;->f:Z

    iget-wide v7, v3, Lg8/s4;->e:J

    sub-long v7, v4, v7

    const-wide/16 v9, 0x0

    cmp-long v7, v7, v9

    if-ltz v7, :cond_1

    iget-object v7, v3, Lg8/s4;->g:Ljava/util/concurrent/ScheduledFuture;

    if-nez v7, :cond_3

    :cond_1
    iget-object v7, v3, Lg8/s4;->g:Ljava/util/concurrent/ScheduledFuture;

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    invoke-interface {v7, v8}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_2
    new-instance v7, Lg8/r4;

    invoke-direct {v7, v3, v6, v8}, Lg8/r4;-><init>(Lg8/s4;II)V

    iget-object v6, v3, Lg8/s4;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v6, v7, v0, v1, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, v3, Lg8/s4;->g:Ljava/util/concurrent/ScheduledFuture;

    :cond_3
    iput-wide v4, v3, Lg8/s4;->e:J

    return-void
.end method

.method public final F()V
    .locals 5

    const-string v0, "shutdown() called"

    iget-object v1, p0, Lg8/l3;->N:Lg8/z;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Lg8/z;->a(ILjava/lang/String;)V

    iget-object v0, p0, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lg8/u2;

    const/4 v2, 0x3

    invoke-direct {v0, p0, v2}, Lg8/u2;-><init>(Lg8/l3;I)V

    iget-object v2, p0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v2, v0}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lg8/l3;->P:Lg8/i3;

    iget-object v3, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v3, v3, Lg8/l3;->m:Le8/h2;

    new-instance v4, Lg8/f3;

    invoke-direct {v4, v0, v1}, Lg8/f3;-><init>(Lg8/i3;I)V

    invoke-virtual {v3, v4}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    new-instance v0, Lg8/u2;

    invoke-direct {v0, p0, v1}, Lg8/u2;-><init>(Lg8/l3;I)V

    invoke-virtual {v2, v0}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final G(Z)V
    .locals 3

    iget-object v0, p0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v0}, Le8/h2;->d()V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean v1, p0, Lg8/l3;->v:Z

    const-string v2, "nameResolver is not started"

    invoke-static {v2, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v1, p0, Lg8/l3;->w:Lg8/c3;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const-string v2, "lbHelper is null"

    invoke-static {v2, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    :cond_1
    iget-object v1, p0, Lg8/l3;->u:Lg8/o1;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lg8/o1;->p()V

    iput-boolean v0, p0, Lg8/l3;->v:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lg8/l3;->b:Ljava/lang/String;

    iget-object v0, p0, Lg8/l3;->c:Le8/u1;

    iget-object v1, p0, Lg8/l3;->d:Le8/q1;

    invoke-static {p1, v0, v1}, Lg8/l3;->D(Ljava/lang/String;Le8/u1;Le8/q1;)Lg8/o1;

    move-result-object p1

    iput-object p1, p0, Lg8/l3;->u:Lg8/o1;

    goto :goto_1

    :cond_2
    iput-object v2, p0, Lg8/l3;->u:Lg8/o1;

    :cond_3
    :goto_1
    iget-object p1, p0, Lg8/l3;->w:Lg8/c3;

    if-eqz p1, :cond_4

    iget-object p1, p1, Lg8/c3;->a:Li3/a0;

    iget-object v0, p1, Li3/a0;->b:Ljava/lang/Object;

    check-cast v0, Le8/z0;

    invoke-virtual {v0}, Le8/z0;->f()V

    iput-object v2, p1, Li3/a0;->b:Ljava/lang/Object;

    iput-object v2, p0, Lg8/l3;->w:Lg8/c3;

    :cond_4
    iput-object v2, p0, Lg8/l3;->x:Lz6/a;

    return-void
.end method

.method public final b()Le8/q0;
    .locals 1

    iget-object v0, p0, Lg8/l3;->a:Le8/q0;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg8/l3;->t:Le8/j0;

    invoke-virtual {v0}, Le8/j0;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m(Le8/p1;Le8/h;)Le8/k;
    .locals 1

    iget-object v0, p0, Lg8/l3;->t:Le8/j0;

    invoke-virtual {v0, p1, p2}, Le8/j0;->m(Le8/p1;Le8/h;)Le8/k;

    move-result-object p1

    return-object p1
.end method

.method public final s(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lg8/l3;->J:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public final t()V
    .locals 2

    new-instance v0, Lg8/u2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lg8/u2;-><init>(Lg8/l3;I)V

    iget-object v1, p0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v1, v0}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget-object v1, p0, Lg8/l3;->a:Le8/q0;

    iget-wide v1, v1, Le8/q0;->c:J

    const-string v3, "logId"

    invoke-virtual {v0, v3, v1, v2}, Lq6/g;->b(Ljava/lang/String;J)V

    const-string v1, "target"

    iget-object v2, p0, Lg8/l3;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Le8/x;
    .locals 4

    iget-object v0, p0, Lg8/l3;->r:Lz5/k;

    iget-object v0, v0, Lz5/k;->b:Ljava/lang/Object;

    check-cast v0, Le8/x;

    if-eqz v0, :cond_1

    sget-object v1, Le8/x;->d:Le8/x;

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lg8/l3;->m:Le8/h2;

    new-instance v2, Lg8/u2;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lg8/u2;-><init>(Lg8/l3;I)V

    invoke-virtual {v1, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Channel state API is not implemented"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final v(Le8/x;Lcom/google/firebase/firestore/remote/f;)V
    .locals 2

    new-instance v0, Ly2/a;

    const/16 v1, 0x14

    invoke-direct {v0, p0, p2, p1, v1}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {p1, v0}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic w()Le8/c1;
    .locals 0

    invoke-virtual {p0}, Lg8/l3;->F()V

    return-object p0
.end method

.method public final x()Le8/c1;
    .locals 4

    iget-object v0, p0, Lg8/l3;->N:Lg8/z;

    const-string v1, "shutdownNow() called"

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lg8/z;->a(ILjava/lang/String;)V

    invoke-virtual {p0}, Lg8/l3;->F()V

    iget-object v0, p0, Lg8/l3;->P:Lg8/i3;

    iget-object v1, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v1, v1, Lg8/l3;->m:Le8/h2;

    new-instance v3, Lg8/f3;

    invoke-direct {v3, v0, v2}, Lg8/f3;-><init>(Lg8/i3;I)V

    invoke-virtual {v1, v3}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    new-instance v0, Lg8/u2;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lg8/u2;-><init>(Lg8/l3;I)V

    iget-object v1, p0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v1, v0}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-object p0
.end method
