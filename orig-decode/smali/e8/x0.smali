.class public abstract Le8/x0;
.super Ljava/lang/Object;


# virtual methods
.method public final a()Le8/g0;
    .locals 4

    invoke-virtual {p0}, Le8/x0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    const-string v1, "%s does not have exactly one group"

    invoke-static {v0, v1, v3}, Ly3/e;->M(Ljava/lang/Object;Ljava/lang/String;Z)V

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/g0;

    return-object v0
.end method

.method public abstract b()Ljava/util/List;
.end method

.method public abstract c()Le8/c;
.end method

.method public abstract d()Le8/i;
.end method

.method public abstract e()Ljava/lang/Object;
.end method

.method public abstract f()V
.end method

.method public abstract g()V
.end method

.method public abstract h(Le8/y0;)V
.end method

.method public abstract i(Ljava/util/List;)V
.end method
