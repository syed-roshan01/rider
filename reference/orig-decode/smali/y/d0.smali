.class public final Ly/d0;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public u:I

.field public v:F


# virtual methods
.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 5

    invoke-static {p3, p4}, Lm2/a;->e(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ly/d0;->u:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ly/d0;->v:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result v1

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v2

    invoke-static {v0, v1, v2}, Lz6/a;->r(III)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result v0

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v1

    :goto_0
    invoke-static {p3, p4}, Lm2/a;->d(J)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_1

    iget v2, p0, Ly/d0;->u:I

    if-eq v2, v3, :cond_1

    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result v2

    int-to-float v2, v2

    iget v4, p0, Ly/d0;->v:F

    mul-float/2addr v2, v4

    invoke-static {v2}, Ld7/t;->p0(F)I

    move-result v2

    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result v4

    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result p3

    invoke-static {v2, v4, p3}, Lz6/a;->r(III)I

    move-result p3

    move p4, p3

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result v2

    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result p3

    move p4, p3

    move p3, v2

    :goto_1
    invoke-static {v0, v1, p3, p4}, Lo1/s;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    iget p3, p2, Lr1/x0;->a:I

    iget p4, p2, Lr1/x0;->b:I

    new-instance v0, Ls/z;

    invoke-direct {v0, p2, v3}, Ls/z;-><init>(Lr1/x0;I)V

    sget-object p2, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, p3, p4, p2, v0}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method
