.class public final Lw0/e;
.super Lw0/i;


# instance fields
.field public final f:Lw0/i;

.field public final g:Lc9/c;


# direct methods
.method public constructor <init>(ILw0/n;Lc9/c;Lw0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw0/i;-><init>(ILw0/n;)V

    iput-object p4, p0, Lw0/e;->f:Lw0/i;

    invoke-virtual {p4}, Lw0/i;->k()V

    if-eqz p3, :cond_0

    invoke-virtual {p4}, Lw0/i;->f()Lc9/c;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lw0/a;

    const/4 p4, 0x1

    invoke-direct {p2, p3, p1, p4}, Lw0/a;-><init>(Lc9/c;Lc9/c;I)V

    move-object p3, p2

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Lw0/i;->f()Lc9/c;

    move-result-object p3

    :cond_1
    :goto_0
    iput-object p3, p0, Lw0/e;->g:Lc9/c;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-boolean v0, p0, Lw0/i;->c:Z

    if-nez v0, :cond_2

    iget v0, p0, Lw0/i;->b:I

    iget-object v1, p0, Lw0/e;->f:Lw0/i;

    invoke-virtual {v1}, Lw0/i;->d()I

    move-result v2

    if-eq v0, v2, :cond_0

    invoke-virtual {p0}, Lw0/i;->a()V

    :cond_0
    invoke-virtual {v1}, Lw0/i;->l()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw0/i;->c:Z

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lw0/i;->d:I

    if-ltz v1, :cond_1

    invoke-static {v1}, Lw0/p;->s(I)V

    const/4 v1, -0x1

    iput v1, p0, Lw0/i;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_2
    :goto_0
    return-void
.end method

.method public final f()Lc9/c;
    .locals 1

    iget-object v0, p0, Lw0/e;->g:Lc9/c;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final i()Lc9/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()V
    .locals 1

    invoke-static {}, Lw0/y;->a()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final l()V
    .locals 1

    invoke-static {}, Lw0/y;->a()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final m()V
    .locals 0

    return-void
.end method

.method public final n(Lw0/g0;)V
    .locals 1

    sget-object p1, Lw0/p;->a:Lm0/h3;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot modify a state object in a read-only snapshot"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t(Lc9/c;)Lw0/i;
    .locals 4

    new-instance v0, Lw0/e;

    iget v1, p0, Lw0/i;->b:I

    iget-object v2, p0, Lw0/i;->a:Lw0/n;

    iget-object v3, p0, Lw0/e;->f:Lw0/i;

    invoke-direct {v0, v1, v2, p1, v3}, Lw0/e;-><init>(ILw0/n;Lc9/c;Lw0/i;)V

    return-object v0
.end method
