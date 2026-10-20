.class public final Lw0/a0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lc9/c;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public c:Z

.field public final d:Ls/i;

.field public final e:Lq/w;

.field public final f:Lo0/i;

.field public g:Lw0/h;

.field public h:Z

.field public i:Lw0/z;

.field public j:J


# direct methods
.method public constructor <init>(Lc9/c;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/a0;->a:Lc9/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lw0/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ls/i;

    const/16 v0, 0x8

    invoke-direct {p1, p0, v0}, Ls/i;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lw0/a0;->d:Ls/i;

    new-instance p1, Lq/w;

    const/16 v0, 0x1b

    invoke-direct {p1, p0, v0}, Lq/w;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lw0/a0;->e:Lq/w;

    new-instance p1, Lo0/i;

    const/16 v0, 0x10

    new-array v0, v0, [Lw0/z;

    invoke-direct {p1, v0}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lw0/a0;->f:Lo0/i;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lw0/a0;->j:J

    return-void
.end method

.method public static final a(Lw0/a0;)Z
    .locals 10

    iget-object v0, p0, Lw0/a0;->f:Lo0/i;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lw0/a0;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    const/4 v0, 0x0

    if-eqz v1, :cond_0

    goto :goto_4

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lw0/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    instance-of v6, v3, Ljava/util/Set;

    if-eqz v6, :cond_3

    move-object v6, v3

    check-cast v6, Ljava/util/Set;

    move-object v7, v6

    :cond_2
    :goto_1
    move-object v6, v4

    goto :goto_2

    :cond_3
    instance-of v6, v3, Ljava/util/List;

    if-eqz v6, :cond_c

    move-object v6, v3

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Set;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x2

    if-ne v8, v9, :cond_4

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    goto :goto_1

    :cond_4
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    if-le v8, v9, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v6, v5, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_5
    :goto_2
    invoke-virtual {v2, v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object v4, v7

    :goto_3
    if-nez v4, :cond_6

    move v0, v1

    :goto_4
    return v0

    :cond_6
    iget-object v2, p0, Lw0/a0;->f:Lo0/i;

    monitor-enter v2

    :try_start_1
    iget-object v3, p0, Lw0/a0;->f:Lo0/i;

    iget v6, v3, Lo0/i;->c:I

    if-lez v6, :cond_a

    iget-object v3, v3, Lo0/i;->a:[Ljava/lang/Object;

    move v7, v0

    :cond_7
    aget-object v8, v3, v7

    check-cast v8, Lw0/z;

    invoke-virtual {v8, v4}, Lw0/z;->b(Ljava/util/Set;)Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v8, :cond_9

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    move v1, v0

    goto :goto_6

    :cond_9
    :goto_5
    move v1, v5

    :goto_6
    add-int/lit8 v7, v7, 0x1

    if-lt v7, v6, :cond_7

    goto :goto_7

    :catchall_0
    move-exception p0

    goto :goto_8

    :cond_a
    :goto_7
    monitor-exit v2

    goto :goto_0

    :goto_8
    monitor-exit v2

    throw p0

    :cond_b
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v3, :cond_5

    goto :goto_0

    :cond_c
    const-string p0, "Unexpected notification"

    invoke-static {p0}, Lm0/s;->g(Ljava/lang/String;)V

    throw v4

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final b()V
    .locals 6

    iget-object v0, p0, Lw0/a0;->f:Lo0/i;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/a0;->f:Lo0/i;

    iget v2, v1, Lo0/i;->c:I

    if-lez v2, :cond_1

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, Lw0/z;

    iget-object v5, v4, Lw0/z;->e:Lo0/j;

    iget-object v5, v5, Lo0/j;->a:Lq/s;

    invoke-virtual {v5}, Lq/s;->a()V

    iget-object v5, v4, Lw0/z;->f:Lq/s;

    invoke-virtual {v5}, Lq/s;->a()V

    iget-object v5, v4, Lw0/z;->k:Lo0/j;

    iget-object v5, v5, Lo0/j;->a:Lq/s;

    invoke-virtual {v5}, Lq/s;->a()V

    iget-object v4, v4, Lw0/z;->l:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final c(Ljava/lang/Object;Lc9/c;Lc9/a;)V
    .locals 8

    iget-object v0, p0, Lw0/a0;->f:Lo0/i;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/a0;->f:Lo0/i;

    iget v2, v1, Lo0/i;->c:I

    const/4 v3, 0x0

    if-lez v2, :cond_2

    iget-object v4, v1, Lo0/i;->a:[Ljava/lang/Object;

    move v5, v3

    :cond_0
    aget-object v6, v4, v5

    move-object v7, v6

    check-cast v7, Lw0/z;

    iget-object v7, v7, Lw0/z;->a:Lc9/c;

    if-ne v7, p2, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v5, v5, 0x1

    if-lt v5, v2, :cond_0

    :cond_2
    const/4 v6, 0x0

    :goto_0
    check-cast v6, Lw0/z;

    if-nez v6, :cond_3

    new-instance v6, Lw0/z;

    const-string v2, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"

    invoke-static {p2, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-static {v2, p2}, Lz6/a;->f(ILjava/lang/Object;)V

    invoke-direct {v6, p2}, Lw0/z;-><init>(Lc9/c;)V

    invoke-virtual {v1, v6}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_3
    monitor-exit v0

    iget-boolean p2, p0, Lw0/a0;->h:Z

    iget-object v0, p0, Lw0/a0;->i:Lw0/z;

    iget-wide v1, p0, Lw0/a0;->j:J

    const-wide/16 v4, -0x1

    cmp-long v4, v1, v4

    if-eqz v4, :cond_5

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    cmp-long v4, v1, v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Detected multithreaded access to SnapshotStateObserver: previousThreadId="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, "), currentThread={id="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getId()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ", name="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    :goto_1
    :try_start_1
    iput-boolean v3, p0, Lw0/a0;->h:Z

    iput-object v6, p0, Lw0/a0;->i:Lw0/z;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    iput-wide v3, p0, Lw0/a0;->j:J

    iget-object v3, p0, Lw0/a0;->e:Lq/w;

    invoke-virtual {v6, p1, v3, p3}, Lw0/z;->a(Ljava/lang/Object;Lq/w;Lc9/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v0, p0, Lw0/a0;->i:Lw0/z;

    iput-boolean p2, p0, Lw0/a0;->h:Z

    iput-wide v1, p0, Lw0/a0;->j:J

    return-void

    :catchall_0
    move-exception p1

    iput-object v0, p0, Lw0/a0;->i:Lw0/z;

    iput-boolean p2, p0, Lw0/a0;->h:Z

    iput-wide v1, p0, Lw0/a0;->j:J

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method
