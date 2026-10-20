.class public abstract Landroidx/compose/foundation/a;
.super Ljava/lang/Object;


# direct methods
.method public static final a(FJ)Lu/w;
    .locals 2

    new-instance v0, Lu/w;

    new-instance v1, Le1/n0;

    invoke-direct {v1, p1, p2}, Le1/n0;-><init>(J)V

    invoke-direct {v0, p0, v1}, Lu/w;-><init>(FLe1/n;)V

    return-object v0
.end method

.method public static final b(Ly0/o;Lc9/c;Lm0/m;I)V
    .locals 2

    check-cast p2, Lm0/q;

    const v0, -0x3799f46e

    invoke-virtual {p2, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p3, 0xe

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x70

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v0, v0, 0x5b

    const/16 v1, 0x12

    if-ne v0, v1, :cond_5

    invoke-virtual {p2}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p2}, Lm0/q;->U()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {p0, p1}, Landroidx/compose/ui/draw/a;->d(Ly0/o;Lc9/c;)Ly0/o;

    move-result-object v0

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    :goto_4
    invoke-virtual {p2}, Lm0/q;->x()Lm0/x1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lu/x;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lu/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lm0/x1;->d:Lc9/e;

    :cond_6
    return-void
.end method

.method public static final c(Lh1/c;Ljava/lang/String;Ly0/o;Ly0/d;Lr1/l;FLe1/l;Lm0/m;II)V
    .locals 17

    move-object/from16 v2, p1

    move-object/from16 v0, p7

    check-cast v0, Lm0/q;

    const v1, 0x441d0e20

    invoke-virtual {v0, v1}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v1, p9, 0x4

    sget-object v3, Ly0/l;->b:Ly0/l;

    if-eqz v1, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v1, p9, 0x8

    if-eqz v1, :cond_1

    sget-object v1, Ly0/a;->c:Ly0/g;

    move-object v12, v1

    goto :goto_1

    :cond_1
    move-object/from16 v12, p3

    :goto_1
    and-int/lit8 v1, p9, 0x10

    if-eqz v1, :cond_2

    sget-object v1, Lr1/k;->b:Lx9/v;

    move-object v13, v1

    goto :goto_2

    :cond_2
    move-object/from16 v13, p4

    :goto_2
    and-int/lit8 v1, p9, 0x20

    if-eqz v1, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    move v14, v1

    goto :goto_3

    :cond_3
    move/from16 v14, p5

    :goto_3
    and-int/lit8 v1, p9, 0x40

    const/4 v15, 0x0

    if-eqz v1, :cond_4

    move-object/from16 v16, v15

    goto :goto_4

    :cond_4
    move-object/from16 v16, p6

    :goto_4
    const/4 v1, 0x0

    if-eqz v2, :cond_7

    const v5, -0x5aaab20e

    invoke-virtual {v0, v5}, Lm0/q;->Z(I)V

    invoke-virtual {v0, v2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_5

    sget-object v5, Lm0/l;->a:Lk0/y0;

    if-ne v6, v5, :cond_6

    :cond_5
    new-instance v6, Lu/h1;

    invoke-direct {v6, v2, v1}, Lu/h1;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v6}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lc9/c;

    invoke-virtual {v0, v1}, Lm0/q;->t(Z)V

    invoke-static {v3, v1, v6}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object v3

    :cond_7
    invoke-interface {v4, v3}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v3

    invoke-static {v3}, Landroidx/compose/ui/draw/a;->c(Ly0/o;)Ly0/o;

    move-result-object v5

    const/4 v11, 0x2

    move-object/from16 v6, p0

    move-object v7, v12

    move-object v8, v13

    move v9, v14

    move-object/from16 v10, v16

    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/draw/a;->g(Ly0/o;Lh1/c;Ly0/d;Lr1/l;FLe1/l;I)Ly0/o;

    move-result-object v3

    sget-object v5, Lu/f1;->a:Lu/f1;

    const v6, 0x207baf9a

    invoke-virtual {v0, v6}, Lm0/q;->Z(I)V

    iget v6, v0, Lm0/q;->P:I

    invoke-static {v0, v3}, Lm9/e0;->G(Lm0/m;Ly0/o;)Ly0/o;

    move-result-object v3

    invoke-virtual {v0}, Lm0/q;->p()Lm0/r1;

    move-result-object v7

    sget-object v8, Lt1/l;->k:Lt1/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lt1/k;->b:Lt1/j;

    const v9, 0x53ca7ea5

    invoke-virtual {v0, v9}, Lm0/q;->Z(I)V

    iget-object v9, v0, Lm0/q;->a:Lm0/d;

    instance-of v9, v9, Lm0/d;

    if-eqz v9, :cond_c

    invoke-virtual {v0}, Lm0/q;->c0()V

    iget-boolean v9, v0, Lm0/q;->O:Z

    if-eqz v9, :cond_8

    new-instance v9, Lu/e1;

    invoke-direct {v9, v8, v1}, Lu/e1;-><init>(Lc9/a;I)V

    invoke-virtual {v0, v9}, Lm0/q;->o(Lc9/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v0}, Lm0/q;->o0()V

    :goto_5
    sget-object v8, Lt1/k;->e:Lt1/i;

    invoke-static {v0, v5, v8}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v5, Lt1/k;->d:Lt1/i;

    invoke-static {v0, v7, v5}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v5, Lt1/k;->c:Lt1/i;

    invoke-static {v0, v3, v5}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v3, Lt1/k;->f:Lt1/i;

    iget-boolean v5, v0, Lm0/q;->O:Z

    if-nez v5, :cond_9

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v6, v0, v6, v3}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_a
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lm0/q;->t(Z)V

    invoke-virtual {v0, v1}, Lm0/q;->t(Z)V

    invoke-virtual {v0, v1}, Lm0/q;->t(Z)V

    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v10

    if-eqz v10, :cond_b

    new-instance v11, Lu/g1;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v4

    move-object v4, v12

    move-object v5, v13

    move v6, v14

    move-object/from16 v7, v16

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lu/g1;-><init>(Lh1/c;Ljava/lang/String;Ly0/o;Ly0/d;Lr1/l;FLe1/l;II)V

    iput-object v11, v10, Lm0/x1;->d:Lc9/e;

    :cond_b
    return-void

    :cond_c
    invoke-static {}, Lm9/e0;->C()V

    throw v15
.end method

.method public static d(Ly0/o;Le1/j0;Le0/e;I)Ly0/o;
    .locals 7

    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    sget-object p2, Le1/g0;->a:Le1/f0;

    :cond_0
    move-object v5, p2

    and-int/lit8 p2, p3, 0x4

    if-eqz p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    :goto_0
    move v4, p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    new-instance p2, Landroidx/compose/foundation/BackgroundElement;

    const-wide/16 v1, 0x0

    const/4 v6, 0x1

    move-object v0, p2

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/BackgroundElement;-><init>(JLe1/j0;FLe1/l0;I)V

    invoke-interface {p0, p2}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ly0/o;JLe1/l0;)Ly0/o;
    .locals 8

    const/high16 v4, 0x3f800000    # 1.0f

    new-instance v7, Landroidx/compose/foundation/BackgroundElement;

    const/4 v3, 0x0

    const/4 v6, 0x2

    move-object v0, v7

    move-wide v1, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/BackgroundElement;-><init>(JLe1/j0;FLe1/l0;I)V

    invoke-interface {p0, v7}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ly0/o;FJLe1/l0;)Ly0/o;
    .locals 1

    new-instance v0, Le1/n0;

    invoke-direct {v0, p2, p3}, Le1/n0;-><init>(J)V

    invoke-static {p1, p0, v0, p4}, Landroidx/compose/foundation/a;->g(FLy0/o;Le1/n;Le1/l0;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final g(FLy0/o;Le1/n;Le1/l0;)Ly0/o;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/BorderModifierNodeElement;

    invoke-direct {v0, p0, p2, p3}, Landroidx/compose/foundation/BorderModifierNodeElement;-><init>(FLe1/n;Le1/l0;)V

    invoke-interface {p1, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final h(JLv/h1;)V
    .locals 2

    sget-object v0, Lv/h1;->a:Lv/h1;

    const v1, 0x7fffffff

    if-ne p2, v0, :cond_1

    invoke-static {p0, p1}, Lm2/a;->h(J)I

    move-result p0

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0, p1}, Lm2/a;->i(J)I

    move-result p0

    if-eq p0, v1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final i(Ly0/o;Lx/m;Lu/i1;ZLjava/lang/String;Ly1/g;Lc9/a;)Ly0/o;
    .locals 7

    sget-object v0, Ly0/l;->b:Ly0/l;

    sget-object v1, Lu/m1;->a:Lm0/m3;

    new-instance v1, Lu/l1;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p2, p1}, Lu/l1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object p2

    if-eqz p3, :cond_0

    new-instance v0, Landroidx/compose/foundation/HoverableElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/HoverableElement;-><init>(Lx/m;)V

    :cond_0
    invoke-interface {p2, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p2

    sget-object v0, Landroidx/compose/foundation/b;->a:Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;

    invoke-static {p1, v0, p3}, Landroidx/compose/foundation/b;->a(Lx/m;Ly0/o;Z)Ly0/o;

    move-result-object v0

    invoke-static {p2, v0}, Lu1/x1;->q(Ly0/o;Ly0/o;)Ly0/o;

    move-result-object p2

    new-instance v6, Landroidx/compose/foundation/ClickableElement;

    move-object v0, v6

    move-object v1, p1

    move v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/ClickableElement;-><init>(Lx/m;ZLjava/lang/String;Ly1/g;Lc9/a;)V

    invoke-interface {p2, v6}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p1

    invoke-static {p0, p1}, Lu1/x1;->q(Ly0/o;Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ly0/o;Lx/m;Lu/i1;ZLy1/g;Lc9/a;I)Ly0/o;
    .locals 7

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_0

    const/4 p3, 0x1

    :cond_0
    move v3, p3

    const/4 v4, 0x0

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v5, p4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/a;->i(Ly0/o;Lx/m;Lu/i1;ZLjava/lang/String;Ly1/g;Lc9/a;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ly0/o;Lc9/a;)Ly0/o;
    .locals 3

    new-instance v0, Ld5/x0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, p1}, Ld5/x0;-><init>(ZLjava/lang/String;Ly1/g;Lc9/a;)V

    invoke-static {p0, v0}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lm0/m;)Lu/p2;
    .locals 5

    check-cast p0, Lm0/q;

    const v0, -0x5746c6c7

    invoke-virtual {p0, v0}, Lm0/q;->Z(I)V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    sget-object v2, Lu/p2;->i:Lv0/p;

    const v3, 0x20932d98

    invoke-virtual {p0, v3}, Lm0/q;->Z(I)V

    invoke-virtual {p0, v0}, Lm0/q;->e(I)Z

    move-result v3

    invoke-virtual {p0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_0

    sget-object v3, Lm0/l;->a:Lk0/y0;

    if-ne v4, v3, :cond_1

    :cond_0
    new-instance v4, Lu/i2;

    invoke-direct {v4, v0}, Lu/i2;-><init>(I)V

    invoke-virtual {p0, v4}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    check-cast v4, Lc9/a;

    invoke-virtual {p0, v0}, Lm0/q;->t(Z)V

    const/4 v3, 0x4

    invoke-static {v1, v2, v4, p0, v3}, Lx3/c;->d([Ljava/lang/Object;Lv0/p;Lc9/a;Lm0/m;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu/p2;

    invoke-virtual {p0, v0}, Lm0/q;->t(Z)V

    return-object v1
.end method

.method public static final m(FJ)J
    .locals 2

    invoke-static {p1, p2}, Ld1/a;->b(J)F

    move-result v0

    sub-float/2addr v0, p0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {p1, p2}, Ld1/a;->c(J)F

    move-result p1

    sub-float/2addr p1, p0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {v0, p0}, Lf6/a;->d(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static n(Ly0/o;Lu/p2;)Ly0/o;
    .locals 4

    new-instance v0, Lu/n2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p1, v1, v2, v3}, Lu/n2;-><init>(Lu/p2;Lv/y0;ZZ)V

    invoke-static {p0, v0}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object p0

    return-object p0
.end method
