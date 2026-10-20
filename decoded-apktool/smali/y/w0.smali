.class public final Ly/w0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/j0;


# instance fields
.field public final a:I

.field public final b:Ly/g;

.field public final c:Ly/i;

.field public final d:F

.field public final e:Ly/a0;


# direct methods
.method public constructor <init>(ILy/g;Ly/i;FLy/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly/w0;->a:I

    iput-object p2, p0, Ly/w0;->b:Ly/g;

    iput-object p3, p0, Ly/w0;->c:Ly/i;

    iput p4, p0, Ly/w0;->d:F

    iput-object p5, p0, Ly/w0;->e:Ly/a0;

    return-void
.end method


# virtual methods
.method public final a(Lt1/c1;Ljava/util/List;I)I
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Ly/w0;->a:I

    if-ne v1, v0, :cond_0

    sget-object v0, Ly/l0;->b:Ly/l0;

    goto :goto_0

    :cond_0
    sget-object v0, Ly/l0;->f:Ly/l0;

    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget v1, p0, Ly/w0;->d:F

    invoke-interface {p1, v1}, Lm2/b;->J(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p2, p3, p1}, Ly/l0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public final b(Lt1/c1;Ljava/util/List;I)I
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Ly/w0;->a:I

    if-ne v1, v0, :cond_0

    sget-object v0, Ly/l0;->c:Ly/l0;

    goto :goto_0

    :cond_0
    sget-object v0, Ly/l0;->n:Ly/l0;

    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget v1, p0, Ly/w0;->d:F

    invoke-interface {p1, v1}, Lm2/b;->J(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p2, p3, p1}, Ly/l0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public final c(Lt1/c1;Ljava/util/List;I)I
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Ly/w0;->a:I

    if-ne v1, v0, :cond_0

    sget-object v0, Ly/l0;->d:Ly/l0;

    goto :goto_0

    :cond_0
    sget-object v0, Ly/l0;->o:Ly/l0;

    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget v1, p0, Ly/w0;->d:F

    invoke-interface {p1, v1}, Lm2/b;->J(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p2, p3, p1}, Ly/l0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public final d(Lt1/c1;Ljava/util/List;I)I
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Ly/w0;->a:I

    if-ne v1, v0, :cond_0

    sget-object v0, Ly/l0;->e:Ly/l0;

    goto :goto_0

    :cond_0
    sget-object v0, Ly/l0;->p:Ly/l0;

    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget v1, p0, Ly/w0;->d:F

    invoke-interface {p1, v1}, Lm2/b;->J(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p2, p3, p1}, Ly/l0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    new-array v15, v1, [Lr1/x0;

    new-instance v6, Ly/x0;

    iget v1, v0, Ly/w0;->a:I

    iget-object v10, v0, Ly/w0;->b:Ly/g;

    iget-object v11, v0, Ly/w0;->c:Ly/i;

    iget v2, v0, Ly/w0;->d:F

    iget-object v13, v0, Ly/w0;->e:Ly/a0;

    move-object v8, v6

    move v9, v1

    move v12, v2

    move-object/from16 v14, p2

    invoke-direct/range {v8 .. v15}, Ly/x0;-><init>(ILy/g;Ly/i;FLy/a0;Ljava/util/List;[Lr1/x0;)V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x1

    if-ne v1, v9, :cond_0

    invoke-static/range {p3 .. p4}, Lm2/a;->k(J)I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-static/range {p3 .. p4}, Lm2/a;->j(J)I

    move-result v3

    :goto_0
    if-ne v1, v9, :cond_1

    invoke-static/range {p3 .. p4}, Lm2/a;->i(J)I

    move-result v4

    goto :goto_1

    :cond_1
    invoke-static/range {p3 .. p4}, Lm2/a;->h(J)I

    move-result v4

    :goto_1
    if-ne v1, v9, :cond_2

    invoke-static/range {p3 .. p4}, Lm2/a;->j(J)I

    move-result v5

    goto :goto_2

    :cond_2
    invoke-static/range {p3 .. p4}, Lm2/a;->k(J)I

    move-result v5

    :goto_2
    if-ne v1, v9, :cond_3

    invoke-static/range {p3 .. p4}, Lm2/a;->h(J)I

    move-result v10

    goto :goto_3

    :cond_3
    invoke-static/range {p3 .. p4}, Lm2/a;->i(J)I

    move-result v10

    :goto_3
    invoke-static {v3, v4, v5, v10}, Lo1/s;->a(IIII)J

    move-result-wide v3

    invoke-interface {v7, v2}, Lm2/b;->J(F)I

    move-result v2

    int-to-long v10, v2

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    :goto_4
    iget v9, v6, Ly/x0;->a:I

    iget-object v2, v6, Ly/x0;->e:Ljava/util/List;

    iget-object v5, v6, Ly/x0;->g:[Ly/y0;

    iget-object v0, v6, Ly/x0;->f:[Lr1/x0;

    if-ge v14, v8, :cond_8

    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/i0;

    aget-object v5, v5, v14

    invoke-static {v5}, Landroidx/compose/foundation/layout/a;->h(Ly/y0;)F

    move-result v5

    const/16 v19, 0x0

    cmpl-float v20, v5, v19

    if-lez v20, :cond_4

    add-float v16, v16, v5

    add-int/lit8 v15, v15, 0x1

    move/from16 v21, v8

    move-wide/from16 v22, v10

    goto :goto_8

    :cond_4
    invoke-static {v3, v4}, Lm2/a;->i(J)I

    move-result v5

    aget-object v12, v0, v14

    if-nez v12, :cond_6

    const v12, 0x7fffffff

    if-ne v5, v12, :cond_5

    move/from16 v21, v8

    const v7, 0x7fffffff

    goto :goto_5

    :cond_5
    move/from16 v21, v8

    int-to-long v7, v5

    sub-long v7, v7, v17

    invoke-static {v7, v8}, Lz6/a;->n(J)J

    move-result-wide v7

    long-to-int v7, v7

    :goto_5
    invoke-static {v3, v4}, Lm2/a;->h(J)I

    move-result v8

    const/4 v12, 0x0

    invoke-static {v12, v7, v12, v8}, Lo1/s;->a(IIII)J

    move-result-wide v7

    invoke-static {v7, v8, v1}, Landroidx/compose/foundation/layout/a;->r(JI)J

    move-result-wide v7

    invoke-interface {v2, v7, v8}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v12

    goto :goto_6

    :cond_6
    move/from16 v21, v8

    move-object/from16 v20, v12

    :goto_6
    long-to-int v2, v10

    int-to-long v7, v5

    sub-long v7, v7, v17

    invoke-virtual {v6, v12}, Ly/x0;->a(Lr1/x0;)I

    move-result v5

    move-wide/from16 v22, v10

    int-to-long v10, v5

    sub-long/2addr v7, v10

    invoke-static {v7, v8}, Lz6/a;->n(J)J

    move-result-wide v7

    long-to-int v5, v7

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v6, v12}, Ly/x0;->a(Lr1/x0;)I

    move-result v5

    add-int/2addr v5, v2

    int-to-long v7, v5

    add-long v17, v17, v7

    const/4 v5, 0x1

    if-ne v9, v5, :cond_7

    iget v5, v12, Lr1/x0;->b:I

    goto :goto_7

    :cond_7
    iget v5, v12, Lr1/x0;->a:I

    :goto_7
    invoke-static {v13, v5}, Ljava/lang/Math;->max(II)I

    move-result v13

    aput-object v12, v0, v14

    move v12, v2

    :goto_8
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v8, v21

    move-wide/from16 v10, v22

    goto/16 :goto_4

    :cond_8
    move/from16 v21, v8

    move-wide/from16 v22, v10

    if-nez v15, :cond_9

    int-to-long v7, v12

    sub-long v17, v17, v7

    move/from16 v8, v21

    const/4 v12, 0x0

    goto/16 :goto_16

    :cond_9
    const/4 v7, 0x0

    cmpl-float v8, v16, v7

    if-lez v8, :cond_a

    invoke-static {v3, v4}, Lm2/a;->i(J)I

    move-result v7

    const v10, 0x7fffffff

    if-eq v7, v10, :cond_a

    invoke-static {v3, v4}, Lm2/a;->i(J)I

    move-result v7

    :goto_9
    const/4 v10, 0x1

    goto :goto_a

    :cond_a
    invoke-static {v3, v4}, Lm2/a;->k(J)I

    move-result v7

    goto :goto_9

    :goto_a
    sub-int/2addr v15, v10

    int-to-long v10, v15

    mul-long v10, v10, v22

    int-to-long v14, v7

    sub-long v14, v14, v17

    sub-long/2addr v14, v10

    invoke-static {v14, v15}, Lz6/a;->n(J)J

    move-result-wide v14

    if-lez v8, :cond_b

    long-to-float v7, v14

    div-float v7, v7, v16

    move/from16 v8, v21

    :goto_b
    const/4 v12, 0x0

    goto :goto_c

    :cond_b
    move/from16 v8, v21

    const/4 v7, 0x0

    goto :goto_b

    :goto_c
    invoke-static {v12, v8}, Lz6/a;->s0(II)Li9/g;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Li9/e;->e()Li9/f;

    move-result-object v12

    move-wide/from16 v20, v10

    move/from16 v16, v13

    const/4 v13, 0x0

    :goto_d
    iget-boolean v10, v12, Li9/f;->c:Z

    if-eqz v10, :cond_c

    invoke-virtual {v12}, Li9/f;->b()I

    move-result v10

    aget-object v10, v5, v10

    invoke-static {v10}, Landroidx/compose/foundation/layout/a;->h(Ly/y0;)F

    move-result v10

    mul-float/2addr v10, v7

    invoke-static {v10}, Ld7/t;->p0(F)I

    move-result v10

    add-int/2addr v13, v10

    goto :goto_d

    :cond_c
    int-to-long v10, v13

    sub-long/2addr v14, v10

    move/from16 v13, v16

    const/4 v10, 0x0

    const/4 v12, 0x0

    :goto_e
    if-ge v12, v8, :cond_15

    aget-object v11, v0, v12

    if-nez v11, :cond_14

    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lr1/i0;

    move-object/from16 v16, v2

    aget-object v2, v5, v12

    invoke-static {v2}, Landroidx/compose/foundation/layout/a;->h(Ly/y0;)F

    move-result v22

    const/16 v19, 0x0

    cmpl-float v23, v22, v19

    if-lez v23, :cond_13

    const-wide/16 v23, 0x0

    cmp-long v25, v14, v23

    if-gez v25, :cond_d

    const/16 v25, -0x1

    move/from16 p2, v12

    move/from16 p3, v13

    move/from16 v28, v25

    move-object/from16 v25, v5

    move/from16 v5, v28

    goto :goto_f

    :cond_d
    if-lez v25, :cond_e

    move-object/from16 v25, v5

    move/from16 p2, v12

    move/from16 p3, v13

    const/4 v5, 0x1

    goto :goto_f

    :cond_e
    move-object/from16 v25, v5

    move/from16 p2, v12

    move/from16 p3, v13

    const/4 v5, 0x0

    :goto_f
    int-to-long v12, v5

    sub-long/2addr v14, v12

    mul-float v22, v22, v7

    invoke-static/range {v22 .. v22}, Ld7/t;->p0(F)I

    move-result v12

    add-int/2addr v12, v5

    const/4 v5, 0x0

    invoke-static {v5, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    if-eqz v2, :cond_f

    iget-boolean v2, v2, Ly/y0;->b:Z

    if-eqz v2, :cond_10

    :cond_f
    const v2, 0x7fffffff

    goto :goto_10

    :cond_10
    const v2, 0x7fffffff

    goto :goto_11

    :goto_10
    if-eq v12, v2, :cond_11

    move v5, v12

    goto :goto_12

    :cond_11
    :goto_11
    const/4 v5, 0x0

    :goto_12
    invoke-static {v3, v4}, Lm2/a;->h(J)I

    move-result v13

    const/4 v2, 0x0

    invoke-static {v5, v12, v2, v13}, Lo1/s;->a(IIII)J

    move-result-wide v12

    invoke-static {v12, v13, v1}, Landroidx/compose/foundation/layout/a;->r(JI)J

    move-result-wide v12

    invoke-interface {v11, v12, v13}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v2

    invoke-virtual {v6, v2}, Ly/x0;->a(Lr1/x0;)I

    move-result v5

    add-int/2addr v5, v10

    const/4 v10, 0x1

    if-ne v9, v10, :cond_12

    iget v10, v2, Lr1/x0;->b:I

    :goto_13
    move/from16 v11, p3

    goto :goto_14

    :cond_12
    iget v10, v2, Lr1/x0;->a:I

    goto :goto_13

    :goto_14
    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    aput-object v2, v0, p2

    move v13, v10

    move v10, v5

    goto :goto_15

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "All weights <= 0 should have placeables"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    move-object/from16 v16, v2

    move-object/from16 v25, v5

    move/from16 p2, v12

    move v11, v13

    const/16 v19, 0x0

    const-wide/16 v23, 0x0

    :goto_15
    add-int/lit8 v12, p2, 0x1

    move-object/from16 v2, v16

    move-object/from16 v5, v25

    goto/16 :goto_e

    :cond_15
    move v11, v13

    int-to-long v9, v10

    add-long v22, v9, v20

    const-wide/16 v24, 0x0

    invoke-static {v3, v4}, Lm2/a;->i(J)I

    move-result v2

    int-to-long v9, v2

    sub-long v26, v9, v17

    invoke-static/range {v22 .. v27}, Lz6/a;->s(JJJ)J

    move-result-wide v9

    long-to-int v12, v9

    :goto_16
    int-to-long v9, v12

    add-long v17, v17, v9

    invoke-static/range {v17 .. v18}, Lz6/a;->n(J)J

    move-result-wide v9

    long-to-int v2, v9

    invoke-static {v3, v4}, Lm2/a;->k(J)I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v3, v4}, Lm2/a;->h(J)I

    invoke-static {v3, v4}, Lm2/a;->j(J)I

    move-result v2

    const/4 v12, 0x0

    invoke-static {v2, v12}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v13, v2}, Ljava/lang/Math;->max(II)I

    move-result v9

    new-array v10, v8, [I

    move v2, v12

    :goto_17
    if-ge v2, v8, :cond_16

    aput v12, v10, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_17

    :cond_16
    new-array v4, v8, [I

    move v2, v12

    :goto_18
    if-ge v2, v8, :cond_17

    aget-object v3, v0, v2

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v6, v3}, Ly/x0;->a(Lr1/x0;)I

    move-result v3

    aput v3, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_18

    :cond_17
    const/4 v0, 0x2

    if-ne v1, v0, :cond_19

    iget-object v0, v6, Ly/x0;->c:Ly/i;

    if-eqz v0, :cond_18

    move-object/from16 v11, p1

    invoke-interface {v0, v11, v7, v4, v10}, Ly/i;->c(Lm2/b;I[I[I)V

    move-object v0, v6

    goto :goto_19

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null verticalArrangement in Column"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    move-object/from16 v11, p1

    iget-object v1, v6, Ly/x0;->b:Ly/g;

    if-eqz v1, :cond_1b

    invoke-interface/range {p1 .. p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v5

    move-object/from16 v2, p1

    move v3, v7

    move-object v0, v6

    move-object v6, v10

    invoke-interface/range {v1 .. v6}, Ly/g;->b(Lm2/b;I[ILm2/l;[I)V

    :goto_19
    new-instance v1, La4/k;

    invoke-direct {v1, v9, v7, v8, v10}, La4/k;-><init>(III[I)V

    move-object/from16 v2, p0

    iget v3, v2, Ly/w0;->a:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1a

    goto :goto_1a

    :cond_1a
    move/from16 v28, v9

    move v9, v7

    move/from16 v7, v28

    :goto_1a
    new-instance v3, Lb/g;

    const/16 v4, 0x9

    invoke-direct {v3, v0, v1, v11, v4}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object v0, Lr8/s;->a:Lr8/s;

    invoke-interface {v11, v7, v9, v0, v3}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v0

    return-object v0

    :cond_1b
    move-object/from16 v2, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null horizontalArrangement in Row"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly/w0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly/w0;

    iget v1, p1, Ly/w0;->a:I

    iget v3, p0, Ly/w0;->a:I

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly/w0;->b:Ly/g;

    iget-object v3, p1, Ly/w0;->b:Ly/g;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly/w0;->c:Ly/i;

    iget-object v3, p1, Ly/w0;->c:Ly/i;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Ly/w0;->d:F

    iget v3, p1, Ly/w0;->d:F

    invoke-static {v1, v3}, Lm2/e;->a(FF)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly/w0;->e:Ly/a0;

    iget-object p1, p1, Ly/w0;->e:Ly/a0;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Ly/w0;->a:I

    invoke-static {v0}, Lt/k;->e(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Ly/w0;->b:Ly/g;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly/w0;->c:Ly/i;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ly/w0;->d:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    const/4 v2, 0x1

    invoke-static {v2}, Lt/k;->e(I)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ly/w0;->e:Ly/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RowColumnMeasurePolicy(orientation="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ly/w0;->a:I

    invoke-static {v1}, Lu/k1;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalArrangement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly/w0;->b:Ly/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verticalArrangement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly/w0;->c:Ly/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", arrangementSpacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ly/w0;->d:F

    invoke-static {v1}, Lm2/e;->b(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", crossAxisSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {v1}, Lu/k1;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", crossAxisAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly/w0;->e:Ly/a0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
