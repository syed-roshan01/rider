.class public interface abstract Ls1/f;
.super Ljava/lang/Object;

# interfaces
.implements Ls1/h;
.implements Lt1/n;


# virtual methods
.method public g(Ls1/i;)Ljava/lang/Object;
    .locals 9

    move-object v0, p0

    check-cast v0, Ly0/n;

    iget-object v0, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v1, v0, Ly0/n;->t:Z

    if-eqz v1, :cond_c

    if-eqz v1, :cond_b

    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_a

    iget-object v2, v1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->e:Ly0/n;

    iget v2, v2, Ly0/n;->d:I

    and-int/lit8 v2, v2, 0x20

    const/4 v3, 0x0

    if-eqz v2, :cond_8

    :goto_1
    if-eqz v0, :cond_8

    iget v2, v0, Ly0/n;->c:I

    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_7

    move-object v2, v0

    move-object v4, v3

    :goto_2
    if-eqz v2, :cond_7

    instance-of v5, v2, Ls1/f;

    if-eqz v5, :cond_0

    check-cast v2, Ls1/f;

    invoke-interface {v2}, Ls1/f;->j()Lf6/a;

    move-result-object v5

    invoke-virtual {v5, p1}, Lf6/a;->B(Ls1/c;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ls1/f;->j()Lf6/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf6/a;->I(Ls1/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget v5, v2, Ly0/n;->c:I

    and-int/lit8 v5, v5, 0x20

    if-eqz v5, :cond_6

    instance-of v5, v2, Lt1/o;

    if-eqz v5, :cond_6

    move-object v5, v2

    check-cast v5, Lt1/o;

    iget-object v5, v5, Lt1/o;->v:Ly0/n;

    const/4 v6, 0x0

    :goto_3
    const/4 v7, 0x1

    if-eqz v5, :cond_5

    iget v8, v5, Ly0/n;->c:I

    and-int/lit8 v8, v8, 0x20

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_1

    move-object v2, v5

    goto :goto_4

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, Lo0/i;

    const/16 v7, 0x10

    new-array v7, v7, [Ly0/n;

    invoke-direct {v4, v7}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v4, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_3
    invoke-virtual {v4, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    iget-object v5, v5, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_5
    if-ne v6, v7, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v4}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v2

    goto :goto_2

    :cond_7
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_1

    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v0, v1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lt1/x0;->d:Lt1/s1;

    goto :goto_0

    :cond_9
    move-object v0, v3

    goto/16 :goto_0

    :cond_a
    iget-object p1, p1, Ls1/c;->a:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ModifierLocal accessed from an unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j()Lf6/a;
    .locals 1

    sget-object v0, Ls1/b;->z:Ls1/b;

    return-object v0
.end method
