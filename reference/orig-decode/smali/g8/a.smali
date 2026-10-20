.class public abstract Lg8/a;
.super Lg8/f;


# instance fields
.field public final h:Lg8/y5;

.field public i:Z

.field public j:Lg8/j0;

.field public k:Z

.field public l:Le8/e0;

.field public m:Z

.field public n:Lk/e;

.field public volatile o:Z

.field public p:Z

.field public q:Z


# direct methods
.method public constructor <init>(ILg8/y5;Lg8/e6;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lg8/f;-><init>(ILg8/y5;Lg8/e6;)V

    sget-object p1, Le8/e0;->d:Le8/e0;

    iput-object p1, p0, Lg8/a;->l:Le8/e0;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg8/a;->m:Z

    iput-object p2, p0, Lg8/a;->h:Lg8/y5;

    return-void
.end method


# virtual methods
.method public final f(Le8/c2;Lg8/i0;Le8/l1;)V
    .locals 4

    iget-boolean v0, p0, Lg8/a;->i:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/a;->i:Z

    iget-object v1, p0, Lg8/a;->h:Lg8/y5;

    iget-object v2, v1, Lg8/y5;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lg8/y5;->a:[Lo7/d0;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    invoke-virtual {v2, p1}, Lo7/d0;->j0(Le8/c2;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg8/a;->j:Lg8/j0;

    invoke-interface {v0, p1, p2, p3}, Lg8/j0;->c(Le8/c2;Lg8/i0;Le8/l1;)V

    iget-object p2, p0, Lg8/f;->c:Lg8/e6;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Le8/c2;->e()Z

    :cond_1
    return-void
.end method

.method public final g(Le8/l1;)V
    .locals 8

    iget-boolean v0, p0, Lg8/a;->p:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "Received headers on closed stream"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/a;->h:Lg8/y5;

    iget-object v0, v0, Lg8/y5;->a:[Lo7/d0;

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    check-cast v5, Le8/p;

    invoke-virtual {v5}, Le8/p;->p0()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lg8/s1;->f:Le8/g1;

    invoke-virtual {p1, v0}, Le8/l1;->c(Le8/i1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-boolean v2, p0, Lg8/a;->k:Z

    sget-object v4, Le8/r;->a:Le8/r;

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    if-eqz v0, :cond_4

    const-string v2, "gzip"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v0, Lg8/t1;

    invoke-direct {v0}, Lg8/t1;-><init>()V

    iget-object v2, p0, Lg8/f;->d:Lg8/x3;

    iget-object v6, v2, Lg8/x3;->e:Le8/s;

    if-ne v6, v4, :cond_1

    move v6, v1

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    const-string v7, "per-message decompressor already set"

    invoke-static {v7, v6}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v6, v2, Lg8/x3;->f:Lg8/t1;

    if-nez v6, :cond_2

    move v3, v1

    :cond_2
    const-string v6, "full stream decompressor already set"

    invoke-static {v6, v3}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-object v0, v2, Lg8/x3;->f:Lg8/t1;

    iput-object v5, v2, Lg8/x3;->t:Lg8/n0;

    new-instance v0, Ll/z2;

    move-object v3, p0

    check-cast v3, Lg8/v1;

    invoke-direct {v0, v3, v3, v2}, Ll/z2;-><init>(Lg8/v1;Lg8/v1;Lg8/x3;)V

    iput-object v0, p0, Lg8/f;->a:Lg8/r0;

    goto :goto_2

    :cond_3
    const-string v1, "identity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string v1, "Can\'t find full stream decompressor for %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance v0, Le8/e2;

    invoke-direct {v0, p1}, Le8/e2;-><init>(Le8/c2;)V

    move-object p1, p0

    check-cast p1, Lh8/k;

    invoke-virtual {p1, v0}, Lh8/k;->b(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    move v1, v3

    :goto_2
    sget-object v0, Lg8/s1;->d:Le8/g1;

    invoke-virtual {p1, v0}, Le8/l1;->c(Le8/i1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v2, p0, Lg8/a;->l:Le8/e0;

    iget-object v2, v2, Le8/e0;->a:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/d0;

    if-eqz v2, :cond_5

    iget-object v5, v2, Le8/d0;->a:Le8/s;

    :cond_5
    if-nez v5, :cond_6

    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string v1, "Can\'t find decompressor for %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance v0, Le8/e2;

    invoke-direct {v0, p1}, Le8/e2;-><init>(Le8/c2;)V

    move-object p1, p0

    check-cast p1, Lh8/k;

    invoke-virtual {p1, v0}, Lh8/k;->b(Ljava/lang/Throwable;)V

    return-void

    :cond_6
    if-eq v5, v4, :cond_8

    if-eqz v1, :cond_7

    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string v0, "Full stream and gRPC message encoding cannot both be set"

    invoke-virtual {p1, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance v0, Le8/e2;

    invoke-direct {v0, p1}, Le8/e2;-><init>(Le8/c2;)V

    move-object p1, p0

    check-cast p1, Lh8/k;

    invoke-virtual {p1, v0}, Lh8/k;->b(Ljava/lang/Throwable;)V

    return-void

    :cond_7
    iget-object v0, p0, Lg8/f;->a:Lg8/r0;

    invoke-interface {v0, v5}, Lg8/r0;->g(Le8/s;)V

    :cond_8
    iget-object v0, p0, Lg8/a;->j:Lg8/j0;

    invoke-interface {v0, p1}, Lg8/j0;->d(Le8/l1;)V

    return-void
.end method

.method public final h(Le8/l1;Le8/c2;Z)V
    .locals 1

    sget-object v0, Lg8/i0;->a:Lg8/i0;

    invoke-virtual {p0, p2, v0, p3, p1}, Lg8/a;->i(Le8/c2;Lg8/i0;ZLe8/l1;)V

    return-void
.end method

.method public final i(Le8/c2;Lg8/i0;ZLe8/l1;)V
    .locals 7

    const-string v0, "status"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lg8/a;->p:Z

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/a;->p:Z

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v1

    iput-boolean v1, p0, Lg8/a;->q:Z

    iget-object v1, p0, Lg8/f;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-boolean v0, p0, Lg8/f;->g:Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v0, p0, Lg8/a;->m:Z

    if-eqz v0, :cond_1

    const/4 p3, 0x0

    iput-object p3, p0, Lg8/a;->n:Lk/e;

    invoke-virtual {p0, p1, p2, p4}, Lg8/a;->f(Le8/c2;Lg8/i0;Le8/l1;)V

    goto :goto_0

    :cond_1
    new-instance v6, Lk/e;

    const/4 v5, 0x6

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lk/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v6, p0, Lg8/a;->n:Lk/e;

    if-eqz p3, :cond_2

    iget-object p1, p0, Lg8/f;->a:Lg8/r0;

    invoke-interface {p1}, Lg8/r0;->close()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lg8/f;->a:Lg8/r0;

    invoke-interface {p1}, Lg8/r0;->f()V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
