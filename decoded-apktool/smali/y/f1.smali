.class public final Ly/f1;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public u:F

.field public v:F


# virtual methods
.method public final a(Lr1/q;Lr1/p;I)I
    .locals 1

    invoke-interface {p2, p3}, Lr1/p;->g(I)I

    move-result p2

    iget p3, p0, Ly/f1;->v:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-static {p3, v0}, Lm2/e;->a(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Ly/f1;->v:F

    invoke-interface {p1, p3}, Lm2/b;->J(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    move p2, p1

    :cond_1
    return p2
.end method

.method public final b(Lr1/q;Lr1/p;I)I
    .locals 1

    invoke-interface {p2, p3}, Lr1/p;->V(I)I

    move-result p2

    iget p3, p0, Ly/f1;->u:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-static {p3, v0}, Lm2/e;->a(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Ly/f1;->u:F

    invoke-interface {p1, p3}, Lm2/b;->J(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    move p2, p1

    :cond_1
    return p2
.end method

.method public final d(Lr1/q;Lr1/p;I)I
    .locals 1

    invoke-interface {p2, p3}, Lr1/p;->Q(I)I

    move-result p2

    iget p3, p0, Ly/f1;->u:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-static {p3, v0}, Lm2/e;->a(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Ly/f1;->u:F

    invoke-interface {p1, p3}, Lm2/b;->J(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    move p2, p1

    :cond_1
    return p2
.end method

.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 5

    iget v0, p0, Ly/f1;->u:F

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-static {v0, v1}, Lm2/e;->a(FF)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Ly/f1;->u:F

    invoke-interface {p1, v0}, Lm2/b;->J(F)I

    move-result v0

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v3

    if-le v0, v3, :cond_0

    move v0, v3

    :cond_0
    if-gez v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_1
    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result v0

    :cond_2
    :goto_0
    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v3

    iget v4, p0, Ly/f1;->v:F

    invoke-static {v4, v1}, Lm2/e;->a(FF)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result v1

    if-nez v1, :cond_5

    iget v1, p0, Ly/f1;->v:F

    invoke-interface {p1, v1}, Lm2/b;->J(F)I

    move-result v1

    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result v4

    if-le v1, v4, :cond_3

    move v1, v4

    :cond_3
    if-gez v1, :cond_4

    goto :goto_1

    :cond_4
    move v2, v1

    goto :goto_1

    :cond_5
    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result v2

    :goto_1
    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result p3

    invoke-static {v0, v3, v2, p3}, Lo1/s;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    iget p3, p2, Lr1/x0;->a:I

    iget p4, p2, Lr1/x0;->b:I

    new-instance v0, Ls/z;

    const/4 v1, 0x4

    invoke-direct {v0, p2, v1}, Ls/z;-><init>(Lr1/x0;I)V

    sget-object p2, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, p3, p4, p2, v0}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lr1/q;Lr1/p;I)I
    .locals 1

    invoke-interface {p2, p3}, Lr1/p;->X(I)I

    move-result p2

    iget p3, p0, Ly/f1;->v:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-static {p3, v0}, Lm2/e;->a(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Ly/f1;->v:F

    invoke-interface {p1, p3}, Lm2/b;->J(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    move p2, p1

    :cond_1
    return p2
.end method
