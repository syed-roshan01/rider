.class public abstract Ln8/b;
.super Le8/j0;


# virtual methods
.method public final i()Le8/i;
    .locals 1

    invoke-virtual {p0}, Ln8/b;->s()Le8/j0;

    move-result-object v0

    invoke-virtual {v0}, Le8/j0;->i()Le8/i;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-virtual {p0}, Ln8/b;->s()Le8/j0;

    move-result-object v0

    invoke-virtual {v0}, Le8/j0;->j()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public final l()Le8/h2;
    .locals 1

    invoke-virtual {p0}, Ln8/b;->s()Le8/j0;

    move-result-object v0

    invoke-virtual {v0}, Le8/j0;->l()Le8/h2;

    move-result-object v0

    return-object v0
.end method

.method public final o()V
    .locals 1

    invoke-virtual {p0}, Ln8/b;->s()Le8/j0;

    move-result-object v0

    invoke-virtual {v0}, Le8/j0;->o()V

    return-void
.end method

.method public abstract s()Le8/j0;
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Ln8/b;->s()Le8/j0;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
