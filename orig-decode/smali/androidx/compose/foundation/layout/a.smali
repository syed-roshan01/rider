.class public abstract Landroidx/compose/foundation/layout/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(FI)Ly/u0;
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p0, v1

    :cond_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    int-to-float p1, v1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Ly/u0;

    invoke-direct {v0, p0, p1, p0, p1}, Ly/u0;-><init>(FFFF)V

    return-object v0
.end method

.method public static b(F)Ly/u0;
    .locals 4

    const/4 v0, 0x0

    int-to-float v1, v0

    int-to-float v2, v0

    int-to-float v0, v0

    new-instance v3, Ly/u0;

    invoke-direct {v3, v1, v2, v0, p0}, Ly/u0;-><init>(FFFF)V

    return-object v3
.end method

.method public static final c(Ly0/o;Lm0/m;)V
    .locals 6

    check-cast p1, Lm0/q;

    const v0, -0x4581923

    invoke-virtual {p1, v0}, Lm0/q;->Z(I)V

    sget-object v0, Ly/d1;->a:Ly/d1;

    const v1, 0x207baf9a

    invoke-virtual {p1, v1}, Lm0/q;->Z(I)V

    iget v1, p1, Lm0/q;->P:I

    invoke-static {p1, p0}, Lm9/e0;->G(Lm0/m;Ly0/o;)Ly0/o;

    move-result-object p0

    invoke-virtual {p1}, Lm0/q;->p()Lm0/r1;

    move-result-object v2

    sget-object v3, Lt1/l;->k:Lt1/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt1/k;->b:Lt1/j;

    const v4, 0x53ca7ea5

    invoke-virtual {p1, v4}, Lm0/q;->Z(I)V

    iget-object v4, p1, Lm0/q;->a:Lm0/d;

    instance-of v4, v4, Lm0/d;

    if-eqz v4, :cond_3

    invoke-virtual {p1}, Lm0/q;->c0()V

    iget-boolean v4, p1, Lm0/q;->O:Z

    if-eqz v4, :cond_0

    new-instance v4, Lu/e1;

    const/4 v5, 0x2

    invoke-direct {v4, v3, v5}, Lu/e1;-><init>(Lc9/a;I)V

    invoke-virtual {p1, v4}, Lm0/q;->o(Lc9/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lm0/q;->o0()V

    :goto_0
    sget-object v3, Lt1/k;->e:Lt1/i;

    invoke-static {p1, v0, v3}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v0, Lt1/k;->d:Lt1/i;

    invoke-static {p1, v2, v0}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v0, Lt1/k;->c:Lt1/i;

    invoke-static {p1, p0, v0}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object p0, Lt1/k;->f:Lt1/i;

    iget-boolean v0, p1, Lm0/q;->O:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-static {v1, p1, v1, p0}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_2
    const/4 p0, 0x1

    const/4 v0, 0x0

    invoke-static {p1, p0, v0, v0, v0}, Ll/q;->v(Lm0/q;ZZZZ)V

    return-void

    :cond_3
    invoke-static {}, Lm9/e0;->C()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final d(Ljava/util/List;Ly/j;Ly/j;IIII)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-ne p5, p6, :cond_4

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto/16 :goto_7

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    move v2, v0

    move p5, v1

    move p6, p5

    :goto_0
    if-ge v1, p2, :cond_3

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr1/p;

    invoke-static {v3}, Landroidx/compose/foundation/layout/a;->g(Lr1/p;)Ly/y0;

    move-result-object v4

    invoke-static {v4}, Landroidx/compose/foundation/layout/a;->h(Ly/y0;)F

    move-result v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1, v3, v5}, Ly/j;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    cmpg-float v5, v4, v0

    if-nez v5, :cond_1

    add-int/2addr p6, v3

    goto :goto_1

    :cond_1
    cmpl-float v5, v4, v0

    if-lez v5, :cond_2

    add-float/2addr v2, v4

    int-to-float v3, v3

    div-float/2addr v3, v4

    invoke-static {v3}, Ld7/t;->p0(F)I

    move-result v3

    invoke-static {p5, v3}, Ljava/lang/Math;->max(II)I

    move-result p5

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    int-to-float p1, p5

    mul-float/2addr p1, v2

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    add-int/2addr p1, p6

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    mul-int/2addr p0, p4

    add-int v1, p0, p1

    goto/16 :goto_7

    :cond_4
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p5

    if-eqz p5, :cond_5

    goto/16 :goto_7

    :cond_5
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p5

    add-int/lit8 p5, p5, -0x1

    mul-int/2addr p5, p4

    invoke-static {p5, p3}, Ljava/lang/Math;->min(II)I

    move-result p4

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p5

    move v2, v0

    move p6, v1

    move v3, p6

    :goto_2
    const v4, 0x7fffffff

    if-ge p6, p5, :cond_8

    invoke-interface {p0, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr1/p;

    invoke-static {v5}, Landroidx/compose/foundation/layout/a;->g(Lr1/p;)Ly/y0;

    move-result-object v6

    invoke-static {v6}, Landroidx/compose/foundation/layout/a;->h(Ly/y0;)F

    move-result v6

    cmpg-float v7, v6, v0

    if-nez v7, :cond_6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p2, v5, v4}, Ly/j;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    sub-int v6, p3, p4

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int/2addr p4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1, v5, v4}, Ly/j;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_3

    :cond_6
    cmpl-float v4, v6, v0

    if-lez v4, :cond_7

    add-float/2addr v2, v6

    :cond_7
    :goto_3
    add-int/lit8 p6, p6, 0x1

    goto :goto_2

    :cond_8
    cmpg-float p2, v2, v0

    if-nez p2, :cond_9

    move p2, v1

    goto :goto_4

    :cond_9
    if-ne p3, v4, :cond_a

    move p2, v4

    goto :goto_4

    :cond_a
    sub-int/2addr p3, p4

    invoke-static {p3, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v2

    invoke-static {p2}, Ld7/t;->p0(F)I

    move-result p2

    :goto_4
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p3

    :goto_5
    if-ge v1, p3, :cond_d

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lr1/p;

    invoke-static {p4}, Landroidx/compose/foundation/layout/a;->g(Lr1/p;)Ly/y0;

    move-result-object p5

    invoke-static {p5}, Landroidx/compose/foundation/layout/a;->h(Ly/y0;)F

    move-result p5

    cmpl-float p6, p5, v0

    if-lez p6, :cond_c

    if-eq p2, v4, :cond_b

    int-to-float p6, p2

    mul-float/2addr p6, p5

    invoke-static {p6}, Ld7/t;->p0(F)I

    move-result p5

    goto :goto_6

    :cond_b
    move p5, v4

    :goto_6
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p1, p4, p5}, Ly/j;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-static {v3, p4}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_d
    move v1, v3

    :goto_7
    return v1
.end method

.method public static final e(Ly/t0;Lm2/l;)F
    .locals 1

    sget-object v0, Lm2/l;->a:Lm2/l;

    if-ne p1, v0, :cond_0

    invoke-interface {p0, p1}, Ly/t0;->b(Lm2/l;)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Ly/t0;->a(Lm2/l;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static final f(Ly/t0;Lm2/l;)F
    .locals 1

    sget-object v0, Lm2/l;->a:Lm2/l;

    if-ne p1, v0, :cond_0

    invoke-interface {p0, p1}, Ly/t0;->a(Lm2/l;)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Ly/t0;->b(Lm2/l;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static final g(Lr1/p;)Ly/y0;
    .locals 1

    invoke-interface {p0}, Lr1/p;->a()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ly/y0;

    if-eqz v0, :cond_0

    check-cast p0, Ly/y0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final h(Ly/y0;)F
    .locals 0

    if-eqz p0, :cond_0

    iget p0, p0, Ly/y0;->a:F

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final i(Ly0/o;Lc9/c;)Ly0/o;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/OffsetPxElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/layout/OffsetPxElement;-><init>(Lc9/c;)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ly0/o;FF)Ly0/o;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/OffsetElement;

    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/layout/OffsetElement;-><init>(FF)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Ly0/o;Ly/t0;)Ly0/o;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/PaddingValuesElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/layout/PaddingValuesElement;-><init>(Ly/t0;)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ly0/o;F)Ly0/o;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/PaddingElement;

    invoke-direct {v0, p1, p1, p1, p1}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFF)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Ly0/o;FF)Ly0/o;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/PaddingElement;

    invoke-direct {v0, p1, p2, p1, p2}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFF)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ly0/o;FFI)Ly0/o;
    .locals 2

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    int-to-float p2, v1

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/a;->m(Ly0/o;FF)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static o(Ly0/o;FFFFI)Ly0/o;
    .locals 2

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p1, v1

    :cond_0
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_1

    int-to-float p2, v1

    :cond_1
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_2

    int-to-float p3, v1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    int-to-float p4, v1

    :cond_3
    new-instance p5, Landroidx/compose/foundation/layout/PaddingElement;

    invoke-direct {p5, p1, p2, p3, p4}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFF)V

    invoke-interface {p0, p5}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static p(Lr1/o;FFI)Ly0/o;
    .locals 2

    and-int/lit8 v0, p3, 0x2

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    move p2, v1

    :cond_1
    new-instance p3, Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;

    invoke-direct {p3, p0, p1, p2}, Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;-><init>(Lr1/o;FF)V

    return-object p3
.end method

.method public static final q(Ly0/o;)Ly0/o;
    .locals 2

    new-instance v0, Ly/l0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ly/l0;-><init>(I)V

    invoke-static {p0, v0}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final r(JI)J
    .locals 2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1}, Lm2/a;->k(J)I

    move-result p2

    invoke-static {p0, p1}, Lm2/a;->i(J)I

    move-result v0

    invoke-static {p0, p1}, Lm2/a;->j(J)I

    move-result v1

    invoke-static {p0, p1}, Lm2/a;->h(J)I

    move-result p0

    invoke-static {p2, v0, v1, p0}, Lo1/s;->a(IIII)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lm2/a;->j(J)I

    move-result p2

    invoke-static {p0, p1}, Lm2/a;->h(J)I

    move-result v0

    invoke-static {p0, p1}, Lm2/a;->k(J)I

    move-result v1

    invoke-static {p0, p1}, Lm2/a;->i(J)I

    move-result p0

    invoke-static {p2, v0, v1, p0}, Lo1/s;->a(IIII)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static final s(Lu2/c;)Ly/k0;
    .locals 4

    new-instance v0, Ly/k0;

    iget v1, p0, Lu2/c;->a:I

    iget v2, p0, Lu2/c;->c:I

    iget v3, p0, Lu2/c;->d:I

    iget p0, p0, Lu2/c;->b:I

    invoke-direct {v0, v1, p0, v2, v3}, Ly/k0;-><init>(IIII)V

    return-object v0
.end method
