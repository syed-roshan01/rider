.class public final Lq9/j;
.super Lq9/i;


# virtual methods
.method public final d(Lu8/j;ILo9/a;)Lq9/g;
    .locals 2

    new-instance v0, Lq9/j;

    iget-object v1, p0, Lq9/i;->d:Lp9/f;

    invoke-direct {v0, p2, p1, p3, v1}, Lq9/i;-><init>(ILu8/j;Lo9/a;Lp9/f;)V

    return-object v0
.end method

.method public final e()Lp9/f;
    .locals 1

    iget-object v0, p0, Lq9/i;->d:Lp9/f;

    return-object v0
.end method

.method public final g(Lp9/g;Lu8/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq9/i;->d:Lp9/f;

    invoke-interface {v0, p1, p2}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
