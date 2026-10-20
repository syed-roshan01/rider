.class public final Lg8/c4;
.super Le8/d;


# instance fields
.field public final a:Lg8/k0;

.field public final b:Le8/p1;

.field public final c:Le8/l1;

.field public final d:Le8/h;

.field public final e:Le8/b0;

.field public final f:Lg8/u;

.field public final g:[Le8/p;

.field public final h:Ljava/lang/Object;

.field public i:Lg8/h0;

.field public j:Z

.field public k:Lg8/d1;


# direct methods
.method public constructor <init>(Lg8/o0;Le8/p1;Le8/l1;Le8/h;Lg8/u;[Le8/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg8/c4;->h:Ljava/lang/Object;

    iput-object p1, p0, Lg8/c4;->a:Lg8/k0;

    iput-object p2, p0, Lg8/c4;->b:Le8/p1;

    iput-object p3, p0, Lg8/c4;->c:Le8/l1;

    iput-object p4, p0, Lg8/c4;->d:Le8/h;

    invoke-static {}, Le8/b0;->b()Le8/b0;

    move-result-object p1

    iput-object p1, p0, Lg8/c4;->e:Le8/b0;

    iput-object p5, p0, Lg8/c4;->f:Lg8/u;

    iput-object p6, p0, Lg8/c4;->g:[Le8/p;

    return-void
.end method


# virtual methods
.method public final a(Le8/l1;)V
    .locals 6

    iget-boolean v0, p0, Lg8/c4;->j:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "apply() or fail() already called"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/c4;->c:Le8/l1;

    invoke-virtual {v0, p1}, Le8/l1;->d(Le8/l1;)V

    iget-object p1, p0, Lg8/c4;->e:Le8/b0;

    invoke-virtual {p1}, Le8/b0;->a()Le8/b0;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lg8/c4;->a:Lg8/k0;

    iget-object v3, p0, Lg8/c4;->b:Le8/p1;

    iget-object v4, p0, Lg8/c4;->d:Le8/h;

    iget-object v5, p0, Lg8/c4;->g:[Le8/p;

    invoke-interface {v2, v3, v0, v4, v5}, Lg8/k0;->d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v1}, Le8/b0;->c(Le8/b0;)V

    invoke-virtual {p0, v0}, Lg8/c4;->c(Lg8/h0;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v1}, Le8/b0;->c(Le8/b0;)V

    throw v0
.end method

.method public final b(Le8/c2;)V
    .locals 3

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot fail with OK status"

    invoke-static {v1, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lg8/c4;->j:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "apply() or fail() already called"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    new-instance v0, Lg8/j1;

    invoke-static {p1}, Lg8/s1;->h(Le8/c2;)Le8/c2;

    move-result-object p1

    sget-object v1, Lg8/i0;->a:Lg8/i0;

    iget-object v2, p0, Lg8/c4;->g:[Le8/p;

    invoke-direct {v0, p1, v1, v2}, Lg8/j1;-><init>(Le8/c2;Lg8/i0;[Le8/p;)V

    invoke-virtual {p0, v0}, Lg8/c4;->c(Lg8/h0;)V

    return-void
.end method

.method public final c(Lg8/h0;)V
    .locals 4

    iget-boolean v0, p0, Lg8/c4;->j:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "already finalized"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-boolean v1, p0, Lg8/c4;->j:Z

    iget-object v0, p0, Lg8/c4;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lg8/c4;->i:Lg8/h0;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iput-object p1, p0, Lg8/c4;->i:Lg8/h0;

    move v2, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move v2, v3

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    iget-object p1, p0, Lg8/c4;->f:Lg8/u;

    invoke-virtual {p1}, Lg8/u;->d()V

    return-void

    :cond_1
    iget-object v0, p0, Lg8/c4;->k:Lg8/d1;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    const-string v0, "delayedStream is null"

    invoke-static {v0, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/c4;->k:Lg8/d1;

    invoke-virtual {v0, p1}, Lg8/d1;->u(Lg8/h0;)Lg8/a1;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lg8/a1;->run()V

    :cond_3
    iget-object p1, p0, Lg8/c4;->f:Lg8/u;

    invoke-virtual {p1}, Lg8/u;->d()V

    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
