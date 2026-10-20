.class public final Lr1/h0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/s;


# instance fields
.field public final a:Lt1/r0;


# direct methods
.method public constructor <init>(Lt1/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/h0;->a:Lt1/r0;

    return-void
.end method


# virtual methods
.method public final L()Z
    .locals 1

    iget-object v0, p0, Lr1/h0;->a:Lt1/r0;

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v0

    iget-boolean v0, v0, Ly0/n;->t:Z

    return v0
.end method

.method public final M()J
    .locals 2

    iget-object v0, p0, Lr1/h0;->a:Lt1/r0;

    iget v1, v0, Lr1/x0;->a:I

    iget v0, v0, Lr1/x0;->b:I

    invoke-static {v1, v0}, Lo1/s;->e(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public final P(J)J
    .locals 3

    iget-object v0, p0, Lr1/h0;->a:Lt1/r0;

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {p0}, Lr1/h0;->a()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ld1/c;->g(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lt1/c1;->P(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final a()J
    .locals 6

    iget-object v0, p0, Lr1/h0;->a:Lt1/r0;

    invoke-static {v0}, Landroidx/compose/ui/layout/a;->f(Lt1/r0;)Lt1/r0;

    move-result-object v1

    sget v2, Ld1/c;->e:I

    sget-wide v2, Ld1/c;->b:J

    iget-object v4, v1, Lt1/r0;->s:Lr1/h0;

    invoke-virtual {p0, v4, v2, v3}, Lr1/h0;->o(Lr1/s;J)J

    move-result-wide v4

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    iget-object v1, v1, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0, v1, v2, v3}, Lt1/c1;->o(Lr1/s;J)J

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Ld1/c;->f(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final b(Lr1/s;Z)Ld1/d;
    .locals 1

    iget-object v0, p0, Lr1/h0;->a:Lt1/r0;

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0, p1, p2}, Lt1/c1;->b(Lr1/s;Z)Ld1/d;

    move-result-object p1

    return-object p1
.end method

.method public final h(J)J
    .locals 2

    iget-object v0, p0, Lr1/h0;->a:Lt1/r0;

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0, p1, p2}, Lt1/c1;->h(J)J

    move-result-wide p1

    invoke-virtual {p0}, Lr1/h0;->a()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ld1/c;->g(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final i(J)J
    .locals 3

    iget-object v0, p0, Lr1/h0;->a:Lt1/r0;

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {p0}, Lr1/h0;->a()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ld1/c;->g(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lt1/c1;->i(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final j()Lr1/s;
    .locals 2

    invoke-virtual {p0}, Lr1/h0;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr1/h0;->a:Lt1/r0;

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->c:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->r:Lt1/c1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Lt1/r0;->s:Lr1/h0;

    :cond_0
    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o(Lr1/s;J)J
    .locals 11

    instance-of v0, p1, Lr1/h0;

    iget-object v1, p0, Lr1/h0;->a:Lt1/r0;

    if-eqz v0, :cond_1

    check-cast p1, Lr1/h0;

    iget-object p1, p1, Lr1/h0;->a:Lt1/r0;

    iget-object v0, p1, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0}, Lt1/c1;->R0()V

    iget-object v0, v1, Lt1/r0;->p:Lt1/c1;

    iget-object v2, p1, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0, v2}, Lt1/c1;->G0(Lt1/c1;)Lt1/c1;

    move-result-object v0

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    const-wide v2, 0xffffffffL

    const/16 v4, 0x20

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lt1/r0;->z0(Lt1/r0;)J

    move-result-wide v5

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result p1

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result p2

    invoke-static {p2}, Ld7/t;->p0(F)I

    move-result p2

    invoke-static {p1, p2}, Li1/b;->c(II)J

    move-result-wide p1

    shr-long v7, v5, v4

    long-to-int p3, v7

    shr-long v7, p1, v4

    long-to-int v7, v7

    add-int/2addr p3, v7

    and-long/2addr v5, v2

    long-to-int v5, v5

    and-long/2addr p1, v2

    long-to-int p1, p1

    add-int/2addr v5, p1

    invoke-static {p3, v5}, Li1/b;->c(II)J

    move-result-wide p1

    invoke-virtual {v1, v0}, Lt1/r0;->z0(Lt1/r0;)J

    move-result-wide v0

    shr-long v5, p1, v4

    long-to-int p3, v5

    shr-long v5, v0, v4

    long-to-int v5, v5

    sub-int/2addr p3, v5

    and-long/2addr p1, v2

    long-to-int p1, p1

    and-long/2addr v0, v2

    long-to-int p2, v0

    sub-int/2addr p1, p2

    invoke-static {p3, p1}, Li1/b;->c(II)J

    move-result-wide p1

    shr-long v0, p1, v4

    long-to-int p3, v0

    int-to-float p3, p3

    and-long/2addr p1, v2

    long-to-int p1, p1

    int-to-float p1, p1

    invoke-static {p3, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    goto/16 :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/layout/a;->f(Lt1/r0;)Lt1/r0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lt1/r0;->z0(Lt1/r0;)J

    move-result-wide v5

    iget-wide v7, v0, Lt1/r0;->q:J

    shr-long v9, v5, v4

    long-to-int p1, v9

    shr-long v9, v7, v4

    long-to-int v9, v9

    add-int/2addr p1, v9

    and-long/2addr v5, v2

    long-to-int v5, v5

    and-long v6, v7, v2

    long-to-int v6, v6

    add-int/2addr v5, v6

    invoke-static {p1, v5}, Li1/b;->c(II)J

    move-result-wide v5

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result p1

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result p2

    invoke-static {p2}, Ld7/t;->p0(F)I

    move-result p2

    invoke-static {p1, p2}, Li1/b;->c(II)J

    move-result-wide p1

    shr-long v7, v5, v4

    long-to-int p3, v7

    shr-long v7, p1, v4

    long-to-int v7, v7

    add-int/2addr p3, v7

    and-long/2addr v5, v2

    long-to-int v5, v5

    and-long/2addr p1, v2

    long-to-int p1, p1

    add-int/2addr v5, p1

    invoke-static {p3, v5}, Li1/b;->c(II)J

    move-result-wide p1

    invoke-static {v1}, Landroidx/compose/ui/layout/a;->f(Lt1/r0;)Lt1/r0;

    move-result-object p3

    invoke-virtual {v1, p3}, Lt1/r0;->z0(Lt1/r0;)J

    move-result-wide v5

    invoke-static {v1}, Landroidx/compose/ui/layout/a;->f(Lt1/r0;)Lt1/r0;

    move-result-object p3

    iget-wide v7, p3, Lt1/r0;->q:J

    shr-long v9, v5, v4

    long-to-int p3, v9

    shr-long v9, v7, v4

    long-to-int v9, v9

    add-int/2addr p3, v9

    and-long/2addr v5, v2

    long-to-int v5, v5

    and-long v6, v7, v2

    long-to-int v6, v6

    add-int/2addr v5, v6

    invoke-static {p3, v5}, Li1/b;->c(II)J

    move-result-wide v5

    shr-long v7, p1, v4

    long-to-int p3, v7

    shr-long v7, v5, v4

    long-to-int v7, v7

    sub-int/2addr p3, v7

    and-long/2addr p1, v2

    long-to-int p1, p1

    and-long/2addr v5, v2

    long-to-int p2, v5

    sub-int/2addr p1, p2

    invoke-static {p3, p1}, Li1/b;->c(II)J

    move-result-wide p1

    invoke-static {v1}, Landroidx/compose/ui/layout/a;->f(Lt1/r0;)Lt1/r0;

    move-result-object p3

    iget-object p3, p3, Lt1/r0;->p:Lt1/c1;

    iget-object p3, p3, Lt1/c1;->r:Lt1/c1;

    invoke-static {p3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->r:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    shr-long v4, p1, v4

    long-to-int v1, v4

    int-to-float v1, v1

    and-long/2addr p1, v2

    long-to-int p1, p1

    int-to-float p1, p1

    invoke-static {v1, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    invoke-virtual {p3, v0, p1, p2}, Lt1/c1;->o(Lr1/s;J)J

    move-result-wide p1

    :goto_0
    return-wide p1

    :cond_1
    invoke-static {v1}, Landroidx/compose/ui/layout/a;->f(Lt1/r0;)Lt1/r0;

    move-result-object v0

    iget-object v1, v0, Lt1/r0;->s:Lr1/h0;

    invoke-virtual {p0, v1, p2, p3}, Lr1/h0;->o(Lr1/s;J)J

    move-result-wide p2

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Ld1/c;->e:I

    sget-wide v1, Ld1/c;->b:J

    invoke-virtual {v0, p1, v1, v2}, Lt1/c1;->o(Lr1/s;J)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ld1/c;->g(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final x(Lr1/s;[F)V
    .locals 1

    iget-object v0, p0, Lr1/h0;->a:Lt1/r0;

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0, p1, p2}, Lt1/c1;->x(Lr1/s;[F)V

    return-void
.end method
