.class public final Lt1/l0;
.super Lr1/x0;

# interfaces
.implements Lr1/i0;
.implements Lt1/b;


# instance fields
.field public final A:Lt1/h0;

.field public final B:Lo0/i;

.field public C:Z

.field public D:Z

.field public final E:Lt/l0;

.field public F:F

.field public G:Z

.field public H:Lc9/c;

.field public I:J

.field public J:F

.field public final K:Lu/r0;

.field public final synthetic L:Lt1/n0;

.field public f:Z

.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:I

.field public s:Z

.field public t:J

.field public u:Lc9/c;

.field public v:F

.field public w:Z

.field public x:Ljava/lang/Object;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lt1/n0;)V
    .locals 5

    iput-object p1, p0, Lt1/l0;->L:Lt1/n0;

    invoke-direct {p0}, Lr1/x0;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lt1/l0;->n:I

    iput v0, p0, Lt1/l0;->o:I

    const/4 v0, 0x3

    iput v0, p0, Lt1/l0;->r:I

    sget-wide v0, Lm2/i;->b:J

    iput-wide v0, p0, Lt1/l0;->t:J

    const/4 v2, 0x1

    iput-boolean v2, p0, Lt1/l0;->w:Z

    new-instance v3, Lt1/h0;

    invoke-direct {v3, p0}, Lt1/a;-><init>(Lt1/b;)V

    iput-object v3, p0, Lt1/l0;->A:Lt1/h0;

    new-instance v3, Lo0/i;

    const/16 v4, 0x10

    new-array v4, v4, [Lt1/l0;

    invoke-direct {v3, v4}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v3, p0, Lt1/l0;->B:Lo0/i;

    iput-boolean v2, p0, Lt1/l0;->C:Z

    new-instance v2, Lt/l0;

    const/16 v3, 0x1a

    invoke-direct {v2, p0, v3}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object v2, p0, Lt1/l0;->E:Lt/l0;

    iput-wide v0, p0, Lt1/l0;->I:J

    new-instance v0, Lu/r0;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p1, p0}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lt1/l0;->K:Lu/r0;

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 13

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt1/l0;->D:Z

    iget-object v1, p0, Lt1/l0;->A:Lt1/h0;

    invoke-virtual {v1}, Lt1/a;->i()V

    iget-object v2, p0, Lt1/l0;->L:Lt1/n0;

    iget-boolean v3, v2, Lt1/n0;->e:Z

    const/4 v4, 0x3

    iget-object v5, v2, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    const/4 v6, 0x0

    if-eqz v3, :cond_4

    invoke-virtual {v5}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v3

    iget v7, v3, Lo0/i;->c:I

    if-lez v7, :cond_4

    iget-object v3, v3, Lo0/i;->a:[Ljava/lang/Object;

    move v8, v6

    :cond_0
    aget-object v9, v3, v8

    check-cast v9, Landroidx/compose/ui/node/a;

    iget-object v10, v9, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v11, v10, Lt1/n0;->d:Z

    if-eqz v11, :cond_3

    iget-object v10, v10, Lt1/n0;->o:Lt1/l0;

    iget v11, v10, Lt1/l0;->r:I

    if-ne v11, v0, :cond_3

    iget-boolean v11, v10, Lt1/l0;->p:Z

    if-eqz v11, :cond_1

    iget-wide v10, v10, Lr1/x0;->d:J

    new-instance v12, Lm2/a;

    invoke-direct {v12, v10, v11}, Lm2/a;-><init>(J)V

    goto :goto_0

    :cond_1
    const/4 v12, 0x0

    :goto_0
    if-eqz v12, :cond_3

    iget v10, v9, Landroidx/compose/ui/node/a;->K:I

    if-ne v10, v4, :cond_2

    invoke-virtual {v9}, Landroidx/compose/ui/node/a;->e()V

    :cond_2
    iget-object v9, v9, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v9, v9, Lt1/n0;->o:Lt1/l0;

    iget-wide v10, v12, Lm2/a;->a:J

    invoke-virtual {v9, v10, v11}, Lt1/l0;->y0(J)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v5, v6, v4}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    :cond_3
    add-int/lit8 v8, v8, 0x1

    if-lt v8, v7, :cond_0

    :cond_4
    iget-boolean v3, v2, Lt1/n0;->f:Z

    if-nez v3, :cond_5

    iget-boolean v3, p0, Lt1/l0;->s:Z

    if-nez v3, :cond_7

    invoke-virtual {p0}, Lt1/l0;->l()Lt1/x;

    move-result-object v3

    iget-boolean v3, v3, Lt1/q0;->n:Z

    if-nez v3, :cond_7

    iget-boolean v3, v2, Lt1/n0;->e:Z

    if-eqz v3, :cond_7

    :cond_5
    iput-boolean v6, v2, Lt1/n0;->e:Z

    iget v3, v2, Lt1/n0;->c:I

    iput v4, v2, Lt1/n0;->c:I

    invoke-virtual {v2, v6}, Lt1/n0;->d(Z)V

    invoke-static {v5}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v4

    check-cast v4, Lu1/w;

    invoke-virtual {v4}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v4

    iget-object v7, v4, Lt1/n1;->e:Lt1/f;

    iget-object v8, p0, Lt1/l0;->E:Lt/l0;

    invoke-virtual {v4, v5, v7, v8}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    iput v3, v2, Lt1/n0;->c:I

    invoke-virtual {p0}, Lt1/l0;->l()Lt1/x;

    move-result-object v3

    iget-boolean v3, v3, Lt1/q0;->n:Z

    if-eqz v3, :cond_6

    iget-boolean v3, v2, Lt1/n0;->l:Z

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lt1/l0;->requestLayout()V

    :cond_6
    iput-boolean v6, v2, Lt1/n0;->f:Z

    :cond_7
    iget-boolean v2, v1, Lt1/a;->d:Z

    if-eqz v2, :cond_8

    iput-boolean v0, v1, Lt1/a;->e:Z

    :cond_8
    iget-boolean v0, v1, Lt1/a;->b:Z

    if-eqz v0, :cond_9

    invoke-virtual {v1}, Lt1/a;->f()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v1}, Lt1/a;->h()V

    :cond_9
    iput-boolean v6, p0, Lt1/l0;->D:Z

    return-void
.end method

.method public final G()Z
    .locals 1

    iget-boolean v0, p0, Lt1/l0;->y:Z

    return v0
.end method

.method public final Q(I)I
    .locals 1

    invoke-virtual {p0}, Lt1/l0;->v0()V

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    invoke-interface {v0, p1}, Lr1/p;->Q(I)I

    move-result p1

    return p1
.end method

.method public final R()V
    .locals 3

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    return-void
.end method

.method public final V(I)I
    .locals 1

    invoke-virtual {p0}, Lt1/l0;->v0()V

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    invoke-interface {v0, p1}, Lr1/p;->V(I)I

    move-result p1

    return p1
.end method

.method public final X(I)I
    .locals 1

    invoke-virtual {p0}, Lt1/l0;->v0()V

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    invoke-interface {v0, p1}, Lr1/p;->X(I)I

    move-result p1

    return p1
.end method

.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt1/l0;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final a0()I
    .locals 1

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    invoke-virtual {v0}, Lr1/x0;->a0()I

    move-result v0

    return v0
.end method

.method public final b0()I
    .locals 1

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    invoke-virtual {v0}, Lr1/x0;->b0()I

    move-result v0

    return v0
.end method

.method public final d()Lt1/a;
    .locals 1

    iget-object v0, p0, Lt1/l0;->A:Lt1/h0;

    return-object v0
.end method

.method public final d0(JFLc9/c;)V
    .locals 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt1/l0;->z:Z

    iget-wide v1, p0, Lt1/l0;->t:J

    invoke-static {p1, p2, v1, v2}, Lm2/i;->a(JJ)Z

    move-result v1

    iget-object v2, p0, Lt1/l0;->L:Lt1/n0;

    if-nez v1, :cond_2

    iget-boolean v1, v2, Lt1/n0;->m:Z

    if-nez v1, :cond_0

    iget-boolean v1, v2, Lt1/n0;->l:Z

    if-eqz v1, :cond_1

    :cond_0
    iput-boolean v0, v2, Lt1/n0;->e:Z

    :cond_1
    invoke-virtual {p0}, Lt1/l0;->s0()V

    :cond_2
    iget-object v1, v2, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-static {v1}, Lt1/g;->v(Landroidx/compose/ui/node/a;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    invoke-virtual {v2}, Lt1/n0;->a()Lt1/c1;

    move-result-object v1

    iget-object v1, v1, Lt1/c1;->r:Lt1/c1;

    iget-object v4, v2, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    if-eqz v1, :cond_3

    iget-object v1, v1, Lt1/q0;->o:Lr1/g0;

    if-nez v1, :cond_4

    :cond_3
    invoke-static {v4}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v1

    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getPlacementScope()Lr1/w0;

    move-result-object v1

    :cond_4
    iget-object v5, v2, Lt1/n0;->p:Lt1/k0;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v4}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v4, v4, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iput v3, v4, Lt1/n0;->j:I

    :cond_5
    const v4, 0x7fffffff

    iput v4, v5, Lt1/k0;->o:I

    const/16 v4, 0x20

    shr-long v6, p1, v4

    long-to-int v4, v6

    const-wide v6, 0xffffffffL

    and-long/2addr v6, p1

    long-to-int v6, v6

    invoke-static {v1, v5, v4, v6}, Lr1/w0;->d(Lr1/w0;Lr1/x0;II)V

    :cond_6
    iget-object v1, v2, Lt1/n0;->p:Lt1/k0;

    if-eqz v1, :cond_7

    iget-boolean v1, v1, Lt1/k0;->r:Z

    if-nez v1, :cond_7

    move v3, v0

    :cond_7
    xor-int/2addr v0, v3

    if-eqz v0, :cond_8

    invoke-virtual {p0, p1, p2, p3, p4}, Lt1/l0;->x0(JFLc9/c;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Error: Placement happened before lookahead."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(J)Lr1/x0;
    .locals 4

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    iget v2, v1, Landroidx/compose/ui/node/a;->K:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->e()V

    :cond_0
    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-static {v1}, Lt1/g;->v(Landroidx/compose/ui/node/a;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Lt1/n0;->p:Lt1/k0;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iput v3, v0, Lt1/k0;->p:I

    invoke-virtual {v0, p1, p2}, Lt1/k0;->f(J)Lr1/x0;

    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_6

    iget v2, p0, Lt1/l0;->r:I

    if-eq v2, v3, :cond_3

    iget-boolean v1, v1, Landroidx/compose/ui/node/a;->B:Z

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object v0, v0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v1, v0, Lt1/n0;->c:I

    invoke-static {v1}, Lt/k;->e(I)I

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x2

    if-ne v1, v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget p2, v0, Lt1/n0;->c:I

    invoke-static {p2}, Ll/q;->B(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    const/4 v2, 0x1

    :goto_1
    iput v2, p0, Lt1/l0;->r:I

    goto :goto_2

    :cond_6
    iput v3, p0, Lt1/l0;->r:I

    :goto_2
    invoke-virtual {p0, p1, p2}, Lt1/l0;->y0(J)Z

    return-object p0
.end method

.method public final g(I)I
    .locals 1

    invoke-virtual {p0}, Lt1/l0;->v0()V

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    invoke-interface {v0, p1}, Lr1/p;->g(I)I

    move-result p1

    return p1
.end method

.method public final j0()Ljava/util/List;
    .locals 8

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->Z()V

    iget-boolean v1, p0, Lt1/l0;->C:Z

    iget-object v2, p0, Lt1/l0;->B:Lo0/i;

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lo0/i;->f()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v1

    iget v3, v1, Lo0/i;->c:I

    const/4 v4, 0x0

    if-lez v3, :cond_3

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    move v5, v4

    :cond_1
    aget-object v6, v1, v5

    check-cast v6, Landroidx/compose/ui/node/a;

    iget v7, v2, Lo0/i;->c:I

    if-gt v7, v5, :cond_2

    iget-object v6, v6, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v6, v6, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v2, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v6, v6, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v6, v6, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v2, v5, v6}, Lo0/i;->p(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_0
    add-int/lit8 v5, v5, 0x1

    if-lt v5, v3, :cond_1

    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->m()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, v2, Lo0/i;->c:I

    invoke-virtual {v2, v0, v1}, Lo0/i;->o(II)V

    iput-boolean v4, p0, Lt1/l0;->C:Z

    invoke-virtual {v2}, Lo0/i;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lc9/c;)V
    .locals 4

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v0

    iget v1, v0, Lo0/i;->c:I

    if-lez v1, :cond_1

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, Landroidx/compose/ui/node/a;

    iget-object v3, v3, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v3, v3, Lt1/n0;->o:Lt1/l0;

    invoke-interface {p1, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    return-void
.end method

.method public final l()Lt1/x;
    .locals 1

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->b:Lt1/x;

    return-object v0
.end method

.method public final m0()V
    .locals 6

    iget-boolean v0, p0, Lt1/l0;->y:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lt1/l0;->y:Z

    iget-object v2, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v2, v2, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    if-nez v0, :cond_1

    iget-object v0, v2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v3, v0, Lt1/n0;->d:Z

    const/4 v4, 0x2

    if-eqz v3, :cond_0

    invoke-static {v2, v1, v4}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    goto :goto_0

    :cond_0
    iget-boolean v0, v0, Lt1/n0;->g:Z

    if-eqz v0, :cond_1

    invoke-static {v2, v1, v4}, Landroidx/compose/ui/node/a;->O(Landroidx/compose/ui/node/a;ZI)V

    :cond_1
    :goto_0
    iget-object v0, v2, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v0, Lt1/x0;->c:Lt1/c1;

    iget-object v0, v0, Lt1/x0;->b:Lt1/x;

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    :goto_1
    invoke-static {v1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v1, :cond_3

    iget-boolean v3, v1, Lt1/c1;->G:Z

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lt1/c1;->P0()V

    :cond_2
    iget-object v1, v1, Lt1/c1;->q:Lt1/c1;

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v0

    iget v1, v0, Lo0/i;->c:I

    if-lez v1, :cond_6

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v2, 0x0

    :cond_4
    aget-object v3, v0, v2

    check-cast v3, Landroidx/compose/ui/node/a;

    invoke-virtual {v3}, Landroidx/compose/ui/node/a;->r()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_5

    iget-object v4, v3, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v4, v4, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v4}, Lt1/l0;->m0()V

    invoke-static {v3}, Landroidx/compose/ui/node/a;->R(Landroidx/compose/ui/node/a;)V

    :cond_5
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_4

    :cond_6
    return-void
.end method

.method public final p(Lr1/a;)I
    .locals 6

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v1, v1, Lt1/n0;->c:I

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/4 v3, 0x1

    iget-object v4, p0, Lt1/l0;->A:Lt1/h0;

    if-ne v1, v3, :cond_1

    iput-boolean v3, v4, Lt1/a;->c:Z

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, v1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v1, v1, Lt1/n0;->c:I

    const/4 v5, 0x3

    if-ne v1, v5, :cond_2

    iput-boolean v3, v4, Lt1/a;->d:Z

    :cond_2
    :goto_1
    iput-boolean v3, p0, Lt1/l0;->s:Z

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lt1/q0;->p(Lr1/a;)I

    move-result p1

    iput-boolean v2, p0, Lt1/l0;->s:Z

    return p1
.end method

.method public final r0()V
    .locals 4

    iget-boolean v0, p0, Lt1/l0;->y:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt1/l0;->y:Z

    iget-object v1, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v1, v1, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v1

    iget v2, v1, Lo0/i;->c:I

    if-lez v2, :cond_1

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    :cond_0
    aget-object v3, v1, v0

    check-cast v3, Landroidx/compose/ui/node/a;

    iget-object v3, v3, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v3, v3, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v3}, Lt1/l0;->r0()V

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v2, :cond_0

    :cond_1
    return-void
.end method

.method public final requestLayout()V
    .locals 2

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/compose/ui/node/a;->P(Z)V

    return-void
.end method

.method public final s0()V
    .locals 7

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget v1, v0, Lt1/n0;->n:I

    if-lez v1, :cond_3

    iget-object v0, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v0

    iget v1, v0, Lo0/i;->c:I

    if-lez v1, :cond_3

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, Landroidx/compose/ui/node/a;

    iget-object v5, v4, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v6, v5, Lt1/n0;->l:Z

    if-nez v6, :cond_1

    iget-boolean v6, v5, Lt1/n0;->m:Z

    if-eqz v6, :cond_2

    :cond_1
    iget-boolean v6, v5, Lt1/n0;->e:Z

    if-nez v6, :cond_2

    invoke-virtual {v4, v2}, Landroidx/compose/ui/node/a;->P(Z)V

    :cond_2
    iget-object v4, v5, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v4}, Lt1/l0;->s0()V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    :cond_3
    return-void
.end method

.method public final v0()V
    .locals 4

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    iget-object v0, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_2

    iget v2, v0, Landroidx/compose/ui/node/a;->K:I

    if-ne v2, v3, :cond_2

    iget-object v2, v1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v2, v2, Lt1/n0;->c:I

    invoke-static {v2}, Lt/k;->e(I)I

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    iget v3, v1, Landroidx/compose/ui/node/a;->K:I

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    :cond_1
    :goto_0
    iput v3, v0, Landroidx/compose/ui/node/a;->K:I

    :cond_2
    return-void
.end method

.method public final w0()V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt1/l0;->G:Z

    iget-object v1, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v2, v1, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v2

    invoke-virtual {p0}, Lt1/l0;->l()Lt1/x;

    move-result-object v3

    iget v3, v3, Lt1/c1;->B:F

    iget-object v1, v1, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    iget-object v1, v1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v4, v1, Lt1/x0;->c:Lt1/c1;

    :goto_0
    iget-object v5, v1, Lt1/x0;->b:Lt1/x;

    if-eq v4, v5, :cond_0

    const-string v5, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v4, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lt1/c0;

    iget v5, v4, Lt1/c1;->B:F

    add-float/2addr v3, v5

    iget-object v4, v4, Lt1/c1;->q:Lt1/c1;

    goto :goto_0

    :cond_0
    iget v1, p0, Lt1/l0;->F:F

    cmpg-float v1, v3, v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iput v3, p0, Lt1/l0;->F:F

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->J()V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->x()V

    :cond_3
    :goto_1
    iget-boolean v1, p0, Lt1/l0;->y:Z

    const/4 v3, 0x0

    if-nez v1, :cond_5

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->x()V

    :cond_4
    invoke-virtual {p0}, Lt1/l0;->m0()V

    iget-boolean v1, p0, Lt1/l0;->f:Z

    if-eqz v1, :cond_5

    if-eqz v2, :cond_5

    invoke-virtual {v2, v3}, Landroidx/compose/ui/node/a;->P(Z)V

    :cond_5
    if-eqz v2, :cond_7

    iget-boolean v1, p0, Lt1/l0;->f:Z

    if-nez v1, :cond_8

    iget-object v1, v2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v2, v1, Lt1/n0;->c:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_8

    iget v2, p0, Lt1/l0;->o:I

    const v3, 0x7fffffff

    if-ne v2, v3, :cond_6

    iget v2, v1, Lt1/n0;->k:I

    iput v2, p0, Lt1/l0;->o:I

    add-int/2addr v2, v0

    iput v2, v1, Lt1/n0;->k:I

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Place was called on a node which was placed already"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iput v3, p0, Lt1/l0;->o:I

    :cond_8
    :goto_2
    invoke-virtual {p0}, Lt1/l0;->B()V

    return-void
.end method

.method public final x0(JFLc9/c;)V
    .locals 8

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    iget-boolean v2, v1, Landroidx/compose/ui/node/a;->J:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_1

    const/4 v2, 0x3

    iput v2, v0, Lt1/n0;->c:I

    iput-wide p1, p0, Lt1/l0;->t:J

    iput p3, p0, Lt1/l0;->v:F

    iput-object p4, p0, Lt1/l0;->u:Lc9/c;

    iput-boolean v3, p0, Lt1/l0;->q:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lt1/l0;->G:Z

    invoke-static {v1}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v1

    iget-boolean v3, v0, Lt1/n0;->e:Z

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lt1/l0;->y:Z

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v1

    iget-wide v2, v1, Lr1/x0;->e:J

    sget v4, Lm2/i;->c:I

    const/16 v4, 0x20

    shr-long v5, p1, v4

    long-to-int v5, v5

    shr-long v6, v2, v4

    long-to-int v4, v6

    add-int/2addr v5, v4

    const-wide v6, 0xffffffffL

    and-long/2addr p1, v6

    long-to-int p1, p1

    and-long/2addr v2, v6

    long-to-int p2, v2

    add-int/2addr p1, p2

    invoke-static {v5, p1}, Li1/b;->c(II)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2, p3, p4}, Lt1/c1;->V0(JFLc9/c;)V

    invoke-virtual {p0}, Lt1/l0;->w0()V

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lt1/l0;->A:Lt1/h0;

    iput-boolean v2, v3, Lt1/a;->g:Z

    invoke-virtual {v0, v2}, Lt1/n0;->c(Z)V

    iput-object p4, p0, Lt1/l0;->H:Lc9/c;

    iput-wide p1, p0, Lt1/l0;->I:J

    iput p3, p0, Lt1/l0;->J:F

    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object p1

    iget-object p2, p1, Lt1/n1;->f:Lt1/f;

    iget-object p3, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    iget-object p4, p0, Lt1/l0;->K:Lu/r0;

    invoke-virtual {p1, p3, p2, p4}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lt1/l0;->H:Lc9/c;

    :goto_0
    const/4 p1, 0x5

    iput p1, v0, Lt1/n0;->c:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "place is called on a deactivated node"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y()Lt1/b;
    .locals 1

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final y0(J)Z
    .locals 8

    iget-object v0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    iget-boolean v2, v1, Landroidx/compose/ui/node/a;->J:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_8

    invoke-static {v1}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v1

    iget-object v2, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v4

    iget-boolean v5, v2, Landroidx/compose/ui/node/a;->B:Z

    const/4 v6, 0x0

    if-nez v5, :cond_1

    if-eqz v4, :cond_0

    iget-boolean v4, v4, Landroidx/compose/ui/node/a;->B:Z

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v6

    goto :goto_1

    :cond_1
    :goto_0
    move v4, v3

    :goto_1
    iput-boolean v4, v2, Landroidx/compose/ui/node/a;->B:Z

    iget-object v4, v2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v4, v4, Lt1/n0;->d:Z

    if-nez v4, :cond_3

    iget-wide v4, p0, Lr1/x0;->d:J

    invoke-static {v4, v5, p1, p2}, Lm2/a;->c(JJ)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    check-cast v1, Lu1/w;

    invoke-virtual {v1, v2, v6}, Lu1/w;->j(Landroidx/compose/ui/node/a;Z)V

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->T()V

    return v6

    :cond_3
    :goto_2
    iget-object v1, p0, Lt1/l0;->A:Lt1/h0;

    iput-boolean v6, v1, Lt1/a;->f:Z

    sget-object v1, Lt1/f;->o:Lt1/f;

    invoke-virtual {p0, v1}, Lt1/l0;->k(Lc9/c;)V

    iput-boolean v3, p0, Lt1/l0;->p:Z

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v1

    iget-wide v4, v1, Lr1/x0;->c:J

    invoke-virtual {p0, p1, p2}, Lr1/x0;->h0(J)V

    iget v1, v0, Lt1/n0;->c:I

    const/4 v7, 0x5

    if-ne v1, v7, :cond_7

    iput v3, v0, Lt1/n0;->c:I

    iput-boolean v6, v0, Lt1/n0;->d:Z

    iput-wide p1, v0, Lt1/n0;->q:J

    invoke-static {v2}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object p1

    check-cast p1, Lu1/w;

    invoke-virtual {p1}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object p1

    iget-object p2, p1, Lt1/n1;->c:Lt1/f;

    iget-object v1, v0, Lt1/n0;->r:Lt/l0;

    invoke-virtual {p1, v2, p2, v1}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    iget p1, v0, Lt1/n0;->c:I

    if-ne p1, v3, :cond_4

    iput-boolean v3, v0, Lt1/n0;->e:Z

    iput-boolean v3, v0, Lt1/n0;->f:Z

    iput v7, v0, Lt1/n0;->c:I

    :cond_4
    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object p1

    iget-wide p1, p1, Lr1/x0;->c:J

    invoke-static {p1, p2, v4, v5}, Lm2/k;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object p1

    iget p1, p1, Lr1/x0;->a:I

    iget p2, p0, Lr1/x0;->a:I

    if-ne p1, p2, :cond_6

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object p1

    iget p1, p1, Lr1/x0;->b:I

    iget p2, p0, Lr1/x0;->b:I

    if-eq p1, p2, :cond_5

    goto :goto_3

    :cond_5
    move v3, v6

    :cond_6
    :goto_3
    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object p1

    iget p1, p1, Lr1/x0;->a:I

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object p2

    iget p2, p2, Lr1/x0;->b:I

    invoke-static {p1, p2}, Lo1/s;->e(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lr1/x0;->g0(J)V

    return v3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "layout state is not idle before measure starts"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "measure is called on a deactivated node"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
