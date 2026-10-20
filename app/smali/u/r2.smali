.class public final Lu/r2;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public u:Lu/p2;

.field public v:Z

.field public w:Z


# virtual methods
.method public final a(Lr1/q;Lr1/p;I)I
    .locals 0

    iget-boolean p1, p0, Lu/r2;->w:Z

    if-eqz p1, :cond_0

    invoke-interface {p2, p3}, Lr1/p;->g(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    invoke-interface {p2, p1}, Lr1/p;->g(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final b(Lr1/q;Lr1/p;I)I
    .locals 0

    iget-boolean p1, p0, Lu/r2;->w:Z

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    invoke-interface {p2, p1}, Lr1/p;->V(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, Lr1/p;->V(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final d(Lr1/q;Lr1/p;I)I
    .locals 0

    iget-boolean p1, p0, Lu/r2;->w:Z

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    invoke-interface {p2, p1}, Lr1/p;->Q(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, Lr1/p;->Q(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 9

    iget-boolean v0, p0, Lu/r2;->w:Z

    if-eqz v0, :cond_0

    sget-object v0, Lv/h1;->a:Lv/h1;

    goto :goto_0

    :cond_0
    sget-object v0, Lv/h1;->b:Lv/h1;

    :goto_0
    invoke-static {p3, p4, v0}, Landroidx/compose/foundation/a;->h(JLv/h1;)V

    iget-boolean v0, p0, Lu/r2;->w:Z

    const v1, 0x7fffffff

    if-eqz v0, :cond_1

    move v7, v1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result v0

    move v7, v0

    :goto_1
    iget-boolean v0, p0, Lu/r2;->w:Z

    if-eqz v0, :cond_2

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v1

    :cond_2
    move v5, v1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x5

    move-wide v2, p3

    invoke-static/range {v2 .. v8}, Lm2/a;->b(JIIIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    iget v0, p2, Lr1/x0;->a:I

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v1

    if-le v0, v1, :cond_3

    move v0, v1

    :cond_3
    iget v1, p2, Lr1/x0;->b:I

    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result p3

    if-le v1, p3, :cond_4

    move v1, p3

    :cond_4
    iget p3, p2, Lr1/x0;->b:I

    sub-int/2addr p3, v1

    iget p4, p2, Lr1/x0;->a:I

    sub-int/2addr p4, v0

    iget-boolean v2, p0, Lu/r2;->w:Z

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    move p3, p4

    :goto_2
    iget-object p4, p0, Lu/r2;->u:Lu/p2;

    iget-object v2, p4, Lu/p2;->d:Lm0/l1;

    iget-object p4, p4, Lu/p2;->a:Lm0/l1;

    invoke-virtual {v2, p3}, Lm0/u2;->f(I)V

    invoke-static {}, Lk0/y0;->c()Lw0/i;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2}, Lw0/i;->j()Lw0/i;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p4}, Lm0/u2;->d()I

    move-result v4

    if-le v4, p3, :cond_6

    invoke-virtual {p4, p3}, Lm0/u2;->f(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_6
    :goto_3
    :try_start_2
    invoke-static {v3}, Lw0/i;->p(Lw0/i;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v2}, Lw0/i;->c()V

    iget-object p4, p0, Lu/r2;->u:Lu/p2;

    iget-boolean v2, p0, Lu/r2;->w:Z

    if-eqz v2, :cond_7

    move v2, v1

    goto :goto_4

    :cond_7
    move v2, v0

    :goto_4
    iget-object p4, p4, Lu/p2;->b:Lm0/l1;

    invoke-virtual {p4, v2}, Lm0/u2;->f(I)V

    new-instance p4, Lu/q2;

    const/4 v2, 0x0

    invoke-direct {p4, p0, p3, p2, v2}, Lu/q2;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    sget-object p2, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, v0, v1, p2, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1

    :goto_5
    :try_start_3
    invoke-static {v3}, Lw0/i;->p(Lw0/i;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {v2}, Lw0/i;->c()V

    throw p1
.end method

.method public final h(Lr1/q;Lr1/p;I)I
    .locals 0

    iget-boolean p1, p0, Lu/r2;->w:Z

    if-eqz p1, :cond_0

    invoke-interface {p2, p3}, Lr1/p;->X(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    invoke-interface {p2, p1}, Lr1/p;->X(I)I

    move-result p1

    :goto_0
    return p1
.end method
