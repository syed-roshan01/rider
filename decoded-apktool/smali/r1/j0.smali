.class public interface abstract Lr1/j0;
.super Ljava/lang/Object;


# virtual methods
.method public a(Lt1/c1;Ljava/util/List;I)I
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/p;

    new-instance v5, Lr1/m;

    const/4 v6, 0x2

    invoke-direct {v5, v4, v6, v6}, Lr1/m;-><init>(Lr1/p;II)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/16 p2, 0xd

    invoke-static {p3, v2, p2}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    iget-object v2, p1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v2, v2, Landroidx/compose/ui/node/a;->y:Lm2/l;

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lr1/j0;->e(Lr1/l0;Ljava/util/List;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result p1

    return p1
.end method

.method public b(Lt1/c1;Ljava/util/List;I)I
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/p;

    new-instance v5, Lr1/m;

    const/4 v6, 0x2

    const/4 v7, 0x1

    invoke-direct {v5, v4, v6, v7}, Lr1/m;-><init>(Lr1/p;II)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x7

    invoke-static {v2, p3, p2}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    iget-object v2, p1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v2, v2, Landroidx/compose/ui/node/a;->y:Lm2/l;

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lr1/j0;->e(Lr1/l0;Ljava/util/List;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->b()I

    move-result p1

    return p1
.end method

.method public c(Lt1/c1;Ljava/util/List;I)I
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/p;

    new-instance v5, Lr1/m;

    const/4 v6, 0x2

    const/4 v7, 0x1

    invoke-direct {v5, v4, v7, v6}, Lr1/m;-><init>(Lr1/p;II)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/16 p2, 0xd

    invoke-static {p3, v2, p2}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    iget-object v2, p1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v2, v2, Landroidx/compose/ui/node/a;->y:Lm2/l;

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lr1/j0;->e(Lr1/l0;Ljava/util/List;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result p1

    return p1
.end method

.method public d(Lt1/c1;Ljava/util/List;I)I
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/p;

    new-instance v5, Lr1/m;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6, v6}, Lr1/m;-><init>(Lr1/p;II)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x7

    invoke-static {v2, p3, p2}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    iget-object v2, p1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v2, v2, Landroidx/compose/ui/node/a;->y:Lm2/l;

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lr1/j0;->e(Lr1/l0;Ljava/util/List;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->b()I

    move-result p1

    return p1
.end method

.method public abstract e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
.end method
