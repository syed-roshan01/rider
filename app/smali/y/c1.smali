.class public final Ly/c1;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public u:F

.field public v:F

.field public w:F

.field public x:F

.field public y:Z


# virtual methods
.method public final G0(Lm2/b;)J
    .locals 7

    iget v0, p0, Ly/c1;->w:F

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-static {v0, v1}, Lm2/e;->a(FF)Z

    move-result v0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iget v0, p0, Ly/c1;->w:F

    invoke-interface {p1, v0}, Lm2/b;->J(F)I

    move-result v0

    if-gez v0, :cond_1

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :cond_1
    :goto_0
    iget v4, p0, Ly/c1;->x:F

    invoke-static {v4, v1}, Lm2/e;->a(FF)Z

    move-result v4

    if-nez v4, :cond_2

    iget v4, p0, Ly/c1;->x:F

    invoke-interface {p1, v4}, Lm2/b;->J(F)I

    move-result v4

    if-gez v4, :cond_3

    move v4, v3

    goto :goto_1

    :cond_2
    move v4, v2

    :cond_3
    :goto_1
    iget v5, p0, Ly/c1;->u:F

    invoke-static {v5, v1}, Lm2/e;->a(FF)Z

    move-result v5

    if-nez v5, :cond_6

    iget v5, p0, Ly/c1;->u:F

    invoke-interface {p1, v5}, Lm2/b;->J(F)I

    move-result v5

    if-le v5, v0, :cond_4

    move v5, v0

    :cond_4
    if-gez v5, :cond_5

    move v5, v3

    :cond_5
    if-eq v5, v2, :cond_6

    goto :goto_2

    :cond_6
    move v5, v3

    :goto_2
    iget v6, p0, Ly/c1;->v:F

    invoke-static {v6, v1}, Lm2/e;->a(FF)Z

    move-result v1

    if-nez v1, :cond_9

    iget v1, p0, Ly/c1;->v:F

    invoke-interface {p1, v1}, Lm2/b;->J(F)I

    move-result p1

    if-le p1, v4, :cond_7

    move p1, v4

    :cond_7
    if-gez p1, :cond_8

    move p1, v3

    :cond_8
    if-eq p1, v2, :cond_9

    move v3, p1

    :cond_9
    invoke-static {v5, v0, v3, v4}, Lo1/s;->a(IIII)J

    move-result-wide v0

    return-wide v0
.end method

.method public final a(Lr1/q;Lr1/p;I)I
    .locals 2

    invoke-virtual {p0, p1}, Ly/c1;->G0(Lm2/b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lm2/a;->f(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, Lm2/a;->h(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, Lr1/p;->g(I)I

    move-result p1

    invoke-static {p1, v0, v1}, Lo1/s;->p(IJ)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final b(Lr1/q;Lr1/p;I)I
    .locals 2

    invoke-virtual {p0, p1}, Ly/c1;->G0(Lm2/b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lm2/a;->g(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, Lm2/a;->i(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, Lr1/p;->V(I)I

    move-result p1

    invoke-static {p1, v0, v1}, Lo1/s;->q(IJ)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final d(Lr1/q;Lr1/p;I)I
    .locals 2

    invoke-virtual {p0, p1}, Ly/c1;->G0(Lm2/b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lm2/a;->g(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, Lm2/a;->i(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, Lr1/p;->Q(I)I

    move-result p1

    invoke-static {p1, v0, v1}, Lo1/s;->q(IJ)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 7

    invoke-virtual {p0, p1}, Ly/c1;->G0(Lm2/b;)J

    move-result-wide v0

    iget-boolean v2, p0, Ly/c1;->y:Z

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Lm2/a;->k(J)I

    move-result v2

    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result v3

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v4

    invoke-static {v2, v3, v4}, Lz6/a;->r(III)I

    move-result v2

    invoke-static {v0, v1}, Lm2/a;->i(J)I

    move-result v3

    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result v4

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v5

    invoke-static {v3, v4, v5}, Lz6/a;->r(III)I

    move-result v3

    invoke-static {v0, v1}, Lm2/a;->j(J)I

    move-result v4

    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result v5

    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result v6

    invoke-static {v4, v5, v6}, Lz6/a;->r(III)I

    move-result v4

    invoke-static {v0, v1}, Lm2/a;->h(J)I

    move-result v0

    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result v1

    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result p3

    invoke-static {v0, v1, p3}, Lz6/a;->r(III)I

    move-result p3

    invoke-static {v2, v3, v4, p3}, Lo1/s;->a(IIII)J

    move-result-wide p3

    goto/16 :goto_4

    :cond_0
    iget v2, p0, Ly/c1;->u:F

    const/high16 v3, 0x7fc00000    # Float.NaN

    invoke-static {v2, v3}, Lm2/e;->a(FF)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Lm2/a;->k(J)I

    move-result v2

    goto :goto_0

    :cond_1
    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result v2

    invoke-static {v0, v1}, Lm2/a;->i(J)I

    move-result v4

    if-le v2, v4, :cond_2

    move v2, v4

    :cond_2
    :goto_0
    iget v4, p0, Ly/c1;->w:F

    invoke-static {v4, v3}, Lm2/e;->a(FF)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-static {v0, v1}, Lm2/a;->i(J)I

    move-result v4

    goto :goto_1

    :cond_3
    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v4

    invoke-static {v0, v1}, Lm2/a;->k(J)I

    move-result v5

    if-ge v4, v5, :cond_4

    move v4, v5

    :cond_4
    :goto_1
    iget v5, p0, Ly/c1;->v:F

    invoke-static {v5, v3}, Lm2/e;->a(FF)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {v0, v1}, Lm2/a;->j(J)I

    move-result v5

    goto :goto_2

    :cond_5
    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result v5

    invoke-static {v0, v1}, Lm2/a;->h(J)I

    move-result v6

    if-le v5, v6, :cond_6

    move v5, v6

    :cond_6
    :goto_2
    iget v6, p0, Ly/c1;->x:F

    invoke-static {v6, v3}, Lm2/e;->a(FF)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-static {v0, v1}, Lm2/a;->h(J)I

    move-result p3

    goto :goto_3

    :cond_7
    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result p3

    invoke-static {v0, v1}, Lm2/a;->j(J)I

    move-result p4

    if-ge p3, p4, :cond_8

    move p3, p4

    :cond_8
    :goto_3
    invoke-static {v2, v4, v5, p3}, Lo1/s;->a(IIII)J

    move-result-wide p3

    :goto_4
    invoke-interface {p2, p3, p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    iget p3, p2, Lr1/x0;->a:I

    iget p4, p2, Lr1/x0;->b:I

    new-instance v0, Ls/z;

    const/4 v1, 0x3

    invoke-direct {v0, p2, v1}, Ls/z;-><init>(Lr1/x0;I)V

    sget-object p2, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, p3, p4, p2, v0}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lr1/q;Lr1/p;I)I
    .locals 2

    invoke-virtual {p0, p1}, Ly/c1;->G0(Lm2/b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lm2/a;->f(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, Lm2/a;->h(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, Lr1/p;->X(I)I

    move-result p1

    invoke-static {p1, v0, v1}, Lo1/s;->p(IJ)I

    move-result p1

    :goto_0
    return p1
.end method
