.class public final Lt1/w;
.super Lt1/r0;


# instance fields
.field public final synthetic v:I

.field public final synthetic w:Lt1/c1;


# direct methods
.method public constructor <init>(Lt1/c0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lt1/w;->v:I

    iput-object p1, p0, Lt1/w;->w:Lt1/c1;

    .line 1
    invoke-direct {p0, p1}, Lt1/r0;-><init>(Lt1/c1;)V

    return-void
.end method

.method public constructor <init>(Lt1/x;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lt1/w;->v:I

    iput-object p1, p0, Lt1/w;->w:Lt1/c1;

    .line 2
    invoke-direct {p0, p1}, Lt1/r0;-><init>(Lt1/c1;)V

    return-void
.end method


# virtual methods
.method public final Q(I)I
    .locals 3

    iget v0, p0, Lt1/w;->v:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt1/w;->w:Lt1/c1;

    check-cast v0, Lt1/c0;

    iget-object v1, v0, Lt1/c0;->N:Lt1/b0;

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v1, p0, v0, p1}, Lt1/b0;->d(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    invoke-virtual {v0}, Lt1/y;->a()Lr1/j0;

    move-result-object v1

    iget-object v0, v0, Lt1/y;->a:Landroidx/compose/ui/node/a;

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Lr1/j0;->d(Lt1/c1;Ljava/util/List;I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final V(I)I
    .locals 3

    iget v0, p0, Lt1/w;->v:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt1/w;->w:Lt1/c1;

    check-cast v0, Lt1/c0;

    iget-object v1, v0, Lt1/c0;->N:Lt1/b0;

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v1, p0, v0, p1}, Lt1/b0;->b(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    invoke-virtual {v0}, Lt1/y;->a()Lr1/j0;

    move-result-object v1

    iget-object v0, v0, Lt1/y;->a:Landroidx/compose/ui/node/a;

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Lr1/j0;->b(Lt1/c1;Ljava/util/List;I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final X(I)I
    .locals 3

    iget v0, p0, Lt1/w;->v:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt1/w;->w:Lt1/c1;

    check-cast v0, Lt1/c0;

    iget-object v1, v0, Lt1/c0;->N:Lt1/b0;

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v1, p0, v0, p1}, Lt1/b0;->h(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    invoke-virtual {v0}, Lt1/y;->a()Lr1/j0;

    move-result-object v1

    iget-object v0, v0, Lt1/y;->a:Landroidx/compose/ui/node/a;

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Lr1/j0;->c(Lt1/c1;Ljava/util/List;I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(J)Lr1/x0;
    .locals 6

    iget v0, p0, Lt1/w;->v:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt1/w;->w:Lt1/c1;

    check-cast v0, Lt1/c0;

    invoke-virtual {p0, p1, p2}, Lr1/x0;->h0(J)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lt1/c0;->N:Lt1/b0;

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v1, p0, v0, p1, p2}, Lt1/b0;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    invoke-static {p0, p1}, Lt1/r0;->y0(Lt1/r0;Lr1/k0;)V

    return-object p0

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lr1/x0;->h0(J)V

    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    iget-object v1, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v1

    iget v2, v1, Lo0/i;->c:I

    if-lez v2, :cond_1

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, Landroidx/compose/ui/node/a;

    iget-object v4, v4, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v4, v4, Lt1/n0;->p:Lt1/k0;

    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    const/4 v5, 0x3

    iput v5, v4, Lt1/k0;->p:I

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_1
    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v1, v0, Landroidx/compose/ui/node/a;->v:Lr1/j0;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, p0, v0, p1, p2}, Lr1/j0;->e(Lr1/l0;Ljava/util/List;J)Lr1/k0;

    move-result-object p1

    invoke-static {p0, p1}, Lt1/r0;->y0(Lt1/r0;Lr1/k0;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(I)I
    .locals 3

    iget v0, p0, Lt1/w;->v:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt1/w;->w:Lt1/c1;

    check-cast v0, Lt1/c0;

    iget-object v1, v0, Lt1/c0;->N:Lt1/b0;

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v1, p0, v0, p1}, Lt1/b0;->a(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    invoke-virtual {v0}, Lt1/y;->a()Lr1/j0;

    move-result-object v1

    iget-object v0, v0, Lt1/y;->a:Landroidx/compose/ui/node/a;

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Lr1/j0;->a(Lt1/c1;Ljava/util/List;I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j0(Lr1/a;)I
    .locals 7

    iget-object v0, p0, Lt1/r0;->u:Ljava/util/LinkedHashMap;

    iget v1, p0, Lt1/w;->v:I

    packed-switch v1, :pswitch_data_0

    invoke-static {p0, p1}, Lt1/g;->c(Lt1/q0;Lr1/a;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :pswitch_0
    iget-object v1, p0, Lt1/r0;->p:Lt1/c1;

    iget-object v1, v1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v1, v1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v1, v1, Lt1/n0;->p:Lt1/k0;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-boolean v2, v1, Lt1/k0;->q:Z

    const/4 v3, 0x1

    iget-object v4, v1, Lt1/k0;->w:Lt1/o0;

    if-nez v2, :cond_1

    iget-object v2, v1, Lt1/k0;->D:Lt1/n0;

    iget v5, v2, Lt1/n0;->c:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_0

    iput-boolean v3, v4, Lt1/a;->f:Z

    iget-boolean v5, v4, Lt1/a;->b:Z

    if-eqz v5, :cond_1

    iput-boolean v3, v2, Lt1/n0;->h:Z

    iput-boolean v3, v2, Lt1/n0;->i:Z

    goto :goto_0

    :cond_0
    iput-boolean v3, v4, Lt1/a;->g:Z

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lt1/k0;->l()Lt1/x;

    move-result-object v2

    iget-object v2, v2, Lt1/x;->O:Lt1/r0;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    iput-boolean v3, v2, Lt1/q0;->n:Z

    :goto_1
    invoke-virtual {v1}, Lt1/k0;->B()V

    invoke-virtual {v1}, Lt1/k0;->l()Lt1/x;

    move-result-object v1

    iget-object v1, v1, Lt1/x;->O:Lt1/r0;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    iput-boolean v2, v1, Lt1/q0;->n:Z

    :goto_2
    iget-object v1, v4, Lt1/a;->i:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_3

    :cond_4
    const/high16 v1, -0x80000000

    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
