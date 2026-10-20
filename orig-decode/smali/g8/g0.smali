.class public final Lg8/g0;
.super Le8/k;


# static fields
.field public static final t:Ljava/util/logging/Logger;

.field public static final u:[B

.field public static final v:D


# instance fields
.field public final a:Le8/p1;

.field public final b:Lo8/c;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Z

.field public final e:Lg8/y;

.field public final f:Le8/b0;

.field public volatile g:Ljava/util/concurrent/ScheduledFuture;

.field public final h:Z

.field public i:Le8/h;

.field public j:Lg8/h0;

.field public volatile k:Z

.field public l:Z

.field public m:Z

.field public final n:Lz5/k;

.field public final o:Lg8/u;

.field public final p:Ljava/util/concurrent/ScheduledExecutorService;

.field public q:Z

.field public r:Le8/e0;

.field public s:Le8/w;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-class v0, Lg8/g0;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lg8/g0;->t:Ljava/util/logging/Logger;

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "gzip"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lg8/g0;->u:[B

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    sput-wide v0, Lg8/g0;->v:D

    return-void
.end method

.method public constructor <init>(Le8/p1;Ljava/util/concurrent/Executor;Le8/h;Lz5/k;Ljava/util/concurrent/ScheduledExecutorService;Lg8/y;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg8/u;

    invoke-direct {v0, p0}, Lg8/u;-><init>(Lg8/g0;)V

    iput-object v0, p0, Lg8/g0;->o:Lg8/u;

    sget-object v0, Le8/e0;->d:Le8/e0;

    iput-object v0, p0, Lg8/g0;->r:Le8/e0;

    sget-object v0, Le8/w;->b:Le8/w;

    iput-object v0, p0, Lg8/g0;->s:Le8/w;

    iput-object p1, p0, Lg8/g0;->a:Le8/p1;

    iget-object v0, p1, Le8/p1;->b:Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lo8/a;->a:Lo8/c;

    iput-object v1, p0, Lg8/g0;->b:Lo8/c;

    sget-object v1, Lu6/a;->a:Lu6/a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne p2, v1, :cond_0

    new-instance p2, Lg8/o5;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg8/g0;->c:Ljava/util/concurrent/Executor;

    iput-boolean v2, p0, Lg8/g0;->d:Z

    goto :goto_0

    :cond_0
    new-instance v1, Lg8/r5;

    invoke-direct {v1, p2}, Lg8/r5;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v1, p0, Lg8/g0;->c:Ljava/util/concurrent/Executor;

    iput-boolean v3, p0, Lg8/g0;->d:Z

    :goto_0
    iput-object p6, p0, Lg8/g0;->e:Lg8/y;

    invoke-static {}, Le8/b0;->b()Le8/b0;

    move-result-object p2

    iput-object p2, p0, Lg8/g0;->f:Le8/b0;

    sget-object p2, Le8/o1;->a:Le8/o1;

    iget-object p1, p1, Le8/p1;->a:Le8/o1;

    if-eq p1, p2, :cond_2

    sget-object p2, Le8/o1;->b:Le8/o1;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :cond_2
    :goto_1
    iput-boolean v2, p0, Lg8/g0;->h:Z

    iput-object p3, p0, Lg8/g0;->i:Le8/h;

    iput-object p4, p0, Lg8/g0;->n:Lz5/k;

    iput-object p5, p0, Lg8/g0;->p:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/concurrent/CancellationException;

    const-string v0, "Cancelled without a message or cause"

    invoke-direct {p2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v1, "Cancelling without a message or cause is suboptimal"

    sget-object v2, Lg8/g0;->t:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0, v1, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-boolean v0, p0, Lg8/g0;->l:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/g0;->l:Z

    :try_start_0
    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    if-eqz v0, :cond_4

    sget-object v0, Le8/c2;->f:Le8/c2;

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    const-string p1, "Call cancelled without message"

    invoke-virtual {v0, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {p1, p2}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    :cond_3
    iget-object p2, p0, Lg8/g0;->j:Lg8/h0;

    invoke-interface {p2, p1}, Lg8/h0;->i(Le8/c2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    invoke-virtual {p0}, Lg8/g0;->b()V

    return-void

    :goto_1
    invoke-virtual {p0}, Lg8/g0;->b()V

    throw p1
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lg8/g0;->f:Le8/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lg8/g0;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v2, "Not started"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lg8/g0;->l:Z

    xor-int/2addr v0, v1

    const-string v2, "call was cancelled"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lg8/g0;->m:Z

    xor-int/2addr v0, v1

    const-string v1, "call was half-closed"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    :try_start_0
    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    instance-of v1, v0, Lg8/y2;

    if-eqz v1, :cond_1

    check-cast v0, Lg8/y2;

    invoke-virtual {v0, p1}, Lg8/y2;->z(Ljava/lang/Object;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    iget-object v1, p0, Lg8/g0;->a:Le8/p1;

    invoke-virtual {v1, p1}, Le8/p1;->d(Ljava/lang/Object;)Ll8/a;

    move-result-object p1

    invoke-interface {v0, p1}, Lg8/z5;->l(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-boolean p1, p0, Lg8/g0;->h:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lg8/g0;->j:Lg8/h0;

    invoke-interface {p1}, Lg8/z5;->flush()V

    :cond_2
    return-void

    :goto_2
    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    sget-object v1, Le8/c2;->f:Le8/c2;

    const-string v2, "Client sendMessage() failed with Error"

    invoke-virtual {v1, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v1

    invoke-interface {v0, v1}, Lg8/h0;->i(Le8/c2;)V

    throw p1

    :goto_3
    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    sget-object v1, Le8/c2;->f:Le8/c2;

    invoke-virtual {v1, p1}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    const-string v1, "Failed to stream message"

    invoke-virtual {p1, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    invoke-interface {v0, p1}, Lg8/h0;->i(Le8/c2;)V

    return-void
.end method

.method public final cancel(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    invoke-static {}, Lo8/b;->a()V

    invoke-virtual {p0, p1, p2}, Lg8/g0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    sget-object p2, Lo8/b;->a:Lo8/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final d(Le8/j;Le8/l1;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    iget-object v2, v1, Lg8/g0;->j:Lg8/h0;

    const/4 v3, 0x0

    const/4 v10, 0x1

    if-nez v2, :cond_0

    move v2, v10

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    const-string v4, "Already started"

    invoke-static {v4, v2}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v2, v1, Lg8/g0;->l:Z

    xor-int/2addr v2, v10

    const-string v4, "call was cancelled"

    invoke-static {v4, v2}, Ly3/e;->N(Ljava/lang/String;Z)V

    const-string v2, "observer"

    invoke-static {v0, v2}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "headers"

    invoke-static {v5, v2}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, Lg8/g0;->f:Le8/b0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lg8/g0;->i:Le8/h;

    sget-object v4, Lg8/q3;->g:Lv6/d;

    invoke-virtual {v2, v4}, Le8/h;->a(Lv6/d;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg8/q3;

    const-wide/16 v6, 0x0

    if-nez v2, :cond_1

    goto/16 :goto_8

    :cond_1
    iget-object v8, v2, Lg8/q3;->a:Ljava/lang/Long;

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    sget-object v11, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v12, Le8/c0;->d:Lr7/e;

    if-eqz v11, :cond_3

    new-instance v12, Le8/c0;

    invoke-virtual {v11, v8, v9}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v8

    invoke-direct {v12, v8, v9}, Le8/c0;-><init>(J)V

    iget-object v8, v1, Lg8/g0;->i:Le8/h;

    iget-object v8, v8, Le8/h;->a:Le8/c0;

    if-eqz v8, :cond_2

    invoke-virtual {v12, v8}, Le8/c0;->a(Le8/c0;)V

    iget-wide v13, v12, Le8/c0;->b:J

    iget-wide v8, v8, Le8/c0;->b:J

    sub-long/2addr v13, v8

    cmp-long v8, v13, v6

    if-gez v8, :cond_4

    :cond_2
    iget-object v8, v1, Lg8/g0;->i:Le8/h;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object v8

    iput-object v12, v8, Le8/g;->a:Le8/c0;

    new-instance v9, Le8/h;

    invoke-direct {v9, v8}, Le8/h;-><init>(Le8/g;)V

    iput-object v9, v1, Lg8/g0;->i:Le8/h;

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "units"

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    iget-object v8, v2, Lg8/q3;->b:Ljava/lang/Boolean;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v8, v1, Lg8/g0;->i:Le8/h;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object v8

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v9, v8, Le8/g;->h:Ljava/lang/Boolean;

    new-instance v9, Le8/h;

    invoke-direct {v9, v8}, Le8/h;-><init>(Le8/g;)V

    goto :goto_2

    :cond_5
    iget-object v8, v1, Lg8/g0;->i:Le8/h;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object v8

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v9, v8, Le8/g;->h:Ljava/lang/Boolean;

    new-instance v9, Le8/h;

    invoke-direct {v9, v8}, Le8/h;-><init>(Le8/g;)V

    :goto_2
    iput-object v9, v1, Lg8/g0;->i:Le8/h;

    :cond_6
    iget-object v8, v2, Lg8/q3;->c:Ljava/lang/Integer;

    const-string v9, "invalid maxsize %s"

    if-eqz v8, :cond_a

    iget-object v11, v1, Lg8/g0;->i:Le8/h;

    iget-object v12, v11, Le8/h;->i:Ljava/lang/Integer;

    if-eqz v12, :cond_8

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v12, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-ltz v8, :cond_7

    move v12, v10

    goto :goto_3

    :cond_7
    move v12, v3

    :goto_3
    invoke-static {v9, v8, v12}, Ly3/e;->F(Ljava/lang/String;IZ)V

    invoke-static {v11}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v11, Le8/g;->i:Ljava/lang/Integer;

    new-instance v8, Le8/h;

    invoke-direct {v8, v11}, Le8/h;-><init>(Le8/g;)V

    iput-object v8, v1, Lg8/g0;->i:Le8/h;

    goto :goto_5

    :cond_8
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ltz v8, :cond_9

    move v12, v10

    goto :goto_4

    :cond_9
    move v12, v3

    :goto_4
    invoke-static {v9, v8, v12}, Ly3/e;->F(Ljava/lang/String;IZ)V

    invoke-static {v11}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v11, Le8/g;->i:Ljava/lang/Integer;

    new-instance v8, Le8/h;

    invoke-direct {v8, v11}, Le8/h;-><init>(Le8/g;)V

    iput-object v8, v1, Lg8/g0;->i:Le8/h;

    :cond_a
    :goto_5
    iget-object v2, v2, Lg8/q3;->d:Ljava/lang/Integer;

    if-eqz v2, :cond_e

    iget-object v8, v1, Lg8/g0;->i:Le8/h;

    iget-object v11, v8, Le8/h;->j:Ljava/lang/Integer;

    if-eqz v11, :cond_c

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v11, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ltz v2, :cond_b

    move v11, v10

    goto :goto_6

    :cond_b
    move v11, v3

    :goto_6
    invoke-static {v9, v2, v11}, Ly3/e;->F(Ljava/lang/String;IZ)V

    invoke-static {v8}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v8, Le8/g;->j:Ljava/lang/Integer;

    new-instance v2, Le8/h;

    invoke-direct {v2, v8}, Le8/h;-><init>(Le8/g;)V

    iput-object v2, v1, Lg8/g0;->i:Le8/h;

    goto :goto_8

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ltz v2, :cond_d

    move v11, v10

    goto :goto_7

    :cond_d
    move v11, v3

    :goto_7
    invoke-static {v9, v2, v11}, Ly3/e;->F(Ljava/lang/String;IZ)V

    invoke-static {v8}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v8, Le8/g;->j:Ljava/lang/Integer;

    new-instance v2, Le8/h;

    invoke-direct {v2, v8}, Le8/h;-><init>(Le8/g;)V

    iput-object v2, v1, Lg8/g0;->i:Le8/h;

    :cond_e
    :goto_8
    iget-object v2, v1, Lg8/g0;->i:Le8/h;

    iget-object v2, v2, Le8/h;->e:Ljava/lang/String;

    sget-object v8, Le8/r;->a:Le8/r;

    if-eqz v2, :cond_10

    iget-object v9, v1, Lg8/g0;->s:Le8/w;

    iget-object v9, v9, Le8/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v9, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Le8/s;

    if-nez v9, :cond_f

    sget-object v3, Lg8/d4;->a:Lg8/d4;

    iput-object v3, v1, Lg8/g0;->j:Lg8/h0;

    iget-object v3, v1, Lg8/g0;->c:Ljava/util/concurrent/Executor;

    new-instance v4, Lg8/d0;

    invoke-direct {v4, v1, v0, v2}, Lg8/d0;-><init>(Lg8/g0;Le8/j;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_f
    move-object v11, v9

    goto :goto_9

    :cond_10
    move-object v11, v8

    :goto_9
    iget-object v2, v1, Lg8/g0;->r:Le8/e0;

    iget-boolean v9, v1, Lg8/g0;->q:Z

    sget-object v12, Lg8/s1;->h:Le8/g1;

    invoke-virtual {v5, v12}, Le8/l1;->a(Le8/i1;)V

    sget-object v12, Lg8/s1;->d:Le8/g1;

    invoke-virtual {v5, v12}, Le8/l1;->a(Le8/i1;)V

    if-eq v11, v8, :cond_11

    invoke-interface {v11}, Le8/s;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v12, v8}, Le8/l1;->f(Le8/i1;Ljava/io/Serializable;)V

    :cond_11
    sget-object v8, Lg8/s1;->e:Le8/j1;

    invoke-virtual {v5, v8}, Le8/l1;->a(Le8/i1;)V

    iget-object v2, v2, Le8/e0;->b:[B

    array-length v12, v2

    if-eqz v12, :cond_12

    invoke-virtual {v5, v8, v2}, Le8/l1;->f(Le8/i1;Ljava/io/Serializable;)V

    :cond_12
    sget-object v2, Lg8/s1;->f:Le8/g1;

    invoke-virtual {v5, v2}, Le8/l1;->a(Le8/i1;)V

    sget-object v2, Lg8/s1;->g:Le8/j1;

    invoke-virtual {v5, v2}, Le8/l1;->a(Le8/i1;)V

    if-eqz v9, :cond_13

    sget-object v8, Lg8/g0;->u:[B

    invoke-virtual {v5, v2, v8}, Le8/l1;->f(Le8/i1;Ljava/io/Serializable;)V

    :cond_13
    iget-object v2, v1, Lg8/g0;->i:Le8/h;

    iget-object v2, v2, Le8/h;->a:Le8/c0;

    iget-object v8, v1, Lg8/g0;->f:Le8/b0;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x0

    if-nez v2, :cond_14

    move-object v13, v12

    goto :goto_a

    :cond_14
    move-object v13, v2

    :goto_a
    if-eqz v13, :cond_16

    invoke-virtual {v13}, Le8/c0;->b()Z

    move-result v2

    if-eqz v2, :cond_16

    iget-object v2, v1, Lg8/g0;->i:Le8/h;

    invoke-static {v2, v5, v3, v3}, Lg8/s1;->c(Le8/h;Le8/l1;IZ)[Le8/p;

    move-result-object v2

    iget-object v3, v1, Lg8/g0;->i:Le8/h;

    iget-object v3, v3, Le8/h;->a:Le8/c0;

    iget-object v4, v1, Lg8/g0;->f:Le8/b0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v3, :cond_15

    const-string v3, "Context"

    goto :goto_b

    :cond_15
    const-string v3, "CallOptions"

    :goto_b
    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v13, v4}, Le8/c0;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    long-to-double v4, v4

    sget-wide v6, Lg8/g0;->v:D

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "ClientCall started after %s deadline was exceeded .9%f seconds ago"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lg8/j1;

    sget-object v5, Le8/c2;->h:Le8/c2;

    invoke-virtual {v5, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    sget-object v5, Lg8/i0;->a:Lg8/i0;

    invoke-direct {v4, v3, v5, v2}, Lg8/j1;-><init>(Le8/c2;Lg8/i0;[Le8/p;)V

    iput-object v4, v1, Lg8/g0;->j:Lg8/h0;

    goto/16 :goto_11

    :cond_16
    iget-object v2, v1, Lg8/g0;->f:Le8/b0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lg8/g0;->i:Le8/h;

    iget-object v2, v2, Le8/h;->a:Le8/c0;

    sget-object v8, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    sget-object v9, Lg8/g0;->t:Ljava/util/logging/Logger;

    invoke-virtual {v9, v8}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v8

    if-eqz v8, :cond_19

    if-eqz v13, :cond_19

    invoke-virtual {v13, v12}, Le8/c0;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    goto :goto_d

    :cond_17
    sget-object v8, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v13, v8}, Le8/c0;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v14

    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    new-instance v14, Ljava/lang/StringBuilder;

    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "Call timeout set to \'%d\' ns, due to context deadline."

    invoke-static {v15, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v14, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v2, :cond_18

    const-string v2, " Explicit call timeout was not set."

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_18
    invoke-virtual {v2, v8}, Le8/c0;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v6, " Explicit call timeout was \'%d\' ns."

    invoke-static {v15, v6, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_c
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_19
    :goto_d
    iget-object v6, v1, Lg8/g0;->n:Lz5/k;

    iget-object v7, v1, Lg8/g0;->a:Le8/p1;

    iget-object v8, v1, Lg8/g0;->i:Le8/h;

    iget-object v9, v1, Lg8/g0;->f:Le8/b0;

    iget-object v2, v6, Lz5/k;->a:Ljava/lang/Object;

    check-cast v2, Lg8/l3;

    iget-boolean v2, v2, Lg8/l3;->W:Z

    if-nez v2, :cond_1a

    new-instance v2, Lg8/j4;

    invoke-direct {v2, v7, v5, v8}, Lg8/j4;-><init>(Le8/p1;Le8/l1;Le8/h;)V

    invoke-virtual {v6, v2}, Lz5/k;->b(Lg8/j4;)Lg8/k0;

    move-result-object v2

    invoke-virtual {v9}, Le8/b0;->a()Le8/b0;

    move-result-object v4

    invoke-static {v8, v5, v3, v3}, Lg8/s1;->c(Le8/h;Le8/l1;IZ)[Le8/p;

    move-result-object v3

    :try_start_0
    invoke-interface {v2, v7, v5, v8, v3}, Lg8/k0;->d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v9, v4}, Le8/b0;->c(Le8/b0;)V

    goto :goto_10

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-virtual {v9, v4}, Le8/b0;->c(Le8/b0;)V

    throw v2

    :cond_1a
    invoke-virtual {v8, v4}, Le8/h;->a(Lv6/d;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg8/q3;

    if-nez v2, :cond_1b

    move-object v14, v12

    goto :goto_e

    :cond_1b
    iget-object v3, v2, Lg8/q3;->e:Lg8/i5;

    move-object v14, v3

    :goto_e
    if-nez v2, :cond_1c

    move-object v15, v12

    goto :goto_f

    :cond_1c
    iget-object v2, v2, Lg8/q3;->f:Lg8/u1;

    move-object v15, v2

    :goto_f
    new-instance v16, Lg8/y2;

    move-object/from16 v2, v16

    move-object v3, v6

    move-object v4, v7

    move-object/from16 v5, p2

    move-object v6, v8

    move-object v7, v14

    move-object v8, v15

    invoke-direct/range {v2 .. v9}, Lg8/y2;-><init>(Lz5/k;Le8/p1;Le8/l1;Le8/h;Lg8/i5;Lg8/u1;Le8/b0;)V

    :goto_10
    iput-object v2, v1, Lg8/g0;->j:Lg8/h0;

    :goto_11
    iget-boolean v2, v1, Lg8/g0;->d:Z

    if-eqz v2, :cond_1d

    iget-object v2, v1, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v2}, Lg8/z5;->n()V

    :cond_1d
    iget-object v2, v1, Lg8/g0;->i:Le8/h;

    iget-object v2, v2, Le8/h;->c:Ljava/lang/String;

    if-eqz v2, :cond_1e

    iget-object v3, v1, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v3, v2}, Lg8/h0;->m(Ljava/lang/String;)V

    :cond_1e
    iget-object v2, v1, Lg8/g0;->i:Le8/h;

    iget-object v2, v2, Le8/h;->i:Ljava/lang/Integer;

    if-eqz v2, :cond_1f

    iget-object v3, v1, Lg8/g0;->j:Lg8/h0;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v3, v2}, Lg8/h0;->b(I)V

    :cond_1f
    iget-object v2, v1, Lg8/g0;->i:Le8/h;

    iget-object v2, v2, Le8/h;->j:Ljava/lang/Integer;

    if-eqz v2, :cond_20

    iget-object v3, v1, Lg8/g0;->j:Lg8/h0;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v3, v2}, Lg8/h0;->e(I)V

    :cond_20
    if-eqz v13, :cond_21

    iget-object v2, v1, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v2, v13}, Lg8/h0;->g(Le8/c0;)V

    :cond_21
    iget-object v2, v1, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v2, v11}, Lg8/z5;->d(Le8/s;)V

    iget-boolean v2, v1, Lg8/g0;->q:Z

    if-eqz v2, :cond_22

    iget-object v3, v1, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v3, v2}, Lg8/h0;->q(Z)V

    :cond_22
    iget-object v2, v1, Lg8/g0;->j:Lg8/h0;

    iget-object v3, v1, Lg8/g0;->r:Le8/e0;

    invoke-interface {v2, v3}, Lg8/h0;->h(Le8/e0;)V

    iget-object v2, v1, Lg8/g0;->e:Lg8/y;

    iget-object v3, v2, Lg8/y;->b:Lg8/s2;

    invoke-interface {v3}, Lg8/s2;->a()V

    iget-object v2, v2, Lg8/y;->a:Lg8/c6;

    check-cast v2, Lg8/k4;

    invoke-virtual {v2}, Lg8/k4;->a()J

    iget-object v2, v1, Lg8/g0;->j:Lg8/h0;

    new-instance v3, Lg8/f0;

    invoke-direct {v3, v1, v0}, Lg8/f0;-><init>(Lg8/g0;Le8/j;)V

    invoke-interface {v2, v3}, Lg8/h0;->j(Lg8/j0;)V

    iget-object v0, v1, Lg8/g0;->f:Le8/b0;

    iget-object v2, v1, Lg8/g0;->o:Lg8/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v2, :cond_25

    sget-object v0, Le8/b0;->a:Ljava/util/logging/Logger;

    if-eqz v13, :cond_23

    iget-object v0, v1, Lg8/g0;->f:Le8/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v13, v12}, Le8/c0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    iget-object v0, v1, Lg8/g0;->p:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_23

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v13, v0}, Le8/c0;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    new-instance v4, Lg8/r2;

    new-instance v5, Lg8/w1;

    invoke-direct {v5, v1, v2, v3, v10}, Lg8/w1;-><init>(Ljava/lang/Object;JI)V

    invoke-direct {v4, v5}, Lg8/r2;-><init>(Ljava/lang/Runnable;)V

    iget-object v5, v1, Lg8/g0;->p:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v5, v4, v2, v3, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, v1, Lg8/g0;->g:Ljava/util/concurrent/ScheduledFuture;

    :cond_23
    iget-boolean v0, v1, Lg8/g0;->k:Z

    if-eqz v0, :cond_24

    invoke-virtual/range {p0 .. p0}, Lg8/g0;->b()V

    :cond_24
    return-void

    :cond_25
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "cancellationListener"

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getAttributes()Le8/c;
    .locals 1

    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lg8/h0;->p()Le8/c;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Le8/c;->b:Le8/c;

    return-object v0
.end method

.method public final halfClose()V
    .locals 3

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    invoke-static {}, Lo8/b;->a()V

    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v2, "Not started"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lg8/g0;->l:Z

    xor-int/2addr v0, v1

    const-string v2, "call was cancelled"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lg8/g0;->m:Z

    xor-int/2addr v0, v1

    const-string v2, "call already half-closed"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-boolean v1, p0, Lg8/g0;->m:Z

    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v0}, Lg8/h0;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    sget-object v1, Lo8/b;->a:Lo8/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
.end method

.method public final isReady()Z
    .locals 1

    iget-boolean v0, p0, Lg8/g0;->m:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v0}, Lg8/z5;->k()Z

    move-result v0

    return v0
.end method

.method public final request(I)V
    .locals 4

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    invoke-static {}, Lo8/b;->a()V

    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "Not started"

    invoke-static {v3, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    if-ltz p1, :cond_1

    move v1, v2

    :cond_1
    const-string v0, "Number requested must be non-negative"

    invoke-static {v0, v1}, Ly3/e;->G(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public final sendMessage(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    invoke-static {}, Lo8/b;->a()V

    invoke-virtual {p0, p1}, Lg8/g0;->c(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final setMessageCompression(Z)V
    .locals 2

    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Not started"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->c(Z)V

    return-void
.end method

.method public final start(Le8/j;Le8/l1;)V
    .locals 0

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    invoke-static {}, Lo8/b;->a()V

    invoke-virtual {p0, p1, p2}, Lg8/g0;->d(Le8/j;Le8/l1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    sget-object p2, Lo8/b;->a:Lo8/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "method"

    iget-object v2, p0, Lg8/g0;->a:Le8/p1;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
