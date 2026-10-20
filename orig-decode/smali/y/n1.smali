.class public final Ly/n1;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public u:I

.field public v:Z

.field public w:Lc9/e;


# virtual methods
.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 8

    iget v0, p0, Ly/n1;->u:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result v0

    :goto_0
    iget v3, p0, Ly/n1;->u:I

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result v2

    :goto_1
    iget v3, p0, Ly/n1;->u:I

    const v5, 0x7fffffff

    if-eq v3, v1, :cond_2

    iget-boolean v1, p0, Ly/n1;->v:Z

    if-eqz v1, :cond_2

    move v1, v5

    goto :goto_2

    :cond_2
    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v1

    :goto_2
    iget v3, p0, Ly/n1;->u:I

    if-eq v3, v4, :cond_3

    iget-boolean v3, p0, Ly/n1;->v:Z

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result v5

    :goto_3
    invoke-static {v0, v1, v2, v5}, Lo1/s;->a(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v5

    iget p2, v5, Lr1/x0;->a:I

    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result v0

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v1

    invoke-static {p2, v0, v1}, Lz6/a;->r(III)I

    move-result p2

    iget v0, v5, Lr1/x0;->b:I

    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result v1

    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result p3

    invoke-static {v0, v1, p3}, Lz6/a;->r(III)I

    move-result p3

    new-instance p4, Ly/m1;

    move-object v2, p4

    move-object v3, p0

    move v4, p2

    move v6, p3

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Ly/m1;-><init>(Ly/n1;ILr1/x0;ILr1/l0;)V

    sget-object v0, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, p2, p3, v0, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method
