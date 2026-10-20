.class public final Lw/d;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Ld9/r;

.field public b:I

.field public final synthetic c:Lw/h;

.field public final synthetic d:F

.field public final synthetic e:Lc9/c;

.field public final synthetic f:Lv/r1;


# direct methods
.method public constructor <init>(FLv/r1;Lw/h;Lu8/e;Lc9/c;)V
    .locals 0

    iput-object p3, p0, Lw/d;->c:Lw/h;

    iput p1, p0, Lw/d;->d:F

    iput-object p5, p0, Lw/d;->e:Lc9/c;

    iput-object p2, p0, Lw/d;->f:Lv/r1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 6

    new-instance p1, Lw/d;

    iget-object v3, p0, Lw/d;->c:Lw/h;

    iget v1, p0, Lw/d;->d:F

    iget-object v5, p0, Lw/d;->e:Lc9/c;

    iget-object v2, p0, Lw/d;->f:Lv/r1;

    move-object v0, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lw/d;-><init>(FLv/r1;Lw/h;Lu8/e;Lc9/c;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lw/d;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lw/d;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lw/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v7, p0

    sget-object v8, Lv8/a;->a:Lv8/a;

    iget v0, v7, Lw/d;->b:I

    const/4 v6, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    iget-object v11, v7, Lw/d;->e:Lc9/c;

    iget-object v12, v7, Lw/d;->c:Lw/h;

    const/4 v13, 0x2

    if-eqz v0, :cond_2

    if-eq v0, v6, :cond_1

    if-ne v0, v13, :cond_0

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_f

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v7, Lw/d;->a:Ld9/r;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v14, v0

    move-object/from16 v0, p1

    goto/16 :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v0, v12, Lw/h;->a:Lb0/p;

    iget-object v1, v0, Lb0/p;->a:Lb0/h0;

    invoke-virtual {v1}, Lb0/h0;->l()I

    move-result v2

    invoke-virtual {v1}, Lb0/h0;->n()I

    move-result v3

    add-int/2addr v3, v2

    sget-object v2, Lt/y1;->a:Lt/x1;

    new-instance v2, Lt/d2;

    iget-object v4, v0, Lb0/p;->c:Lt/y;

    iget-object v4, v4, Lt/y;->a:Lt/g0;

    invoke-direct {v2, v4}, Lt/d2;-><init>(Lt/g0;)V

    new-instance v4, Lt/p;

    invoke-direct {v4, v10}, Lt/p;-><init>(F)V

    new-instance v5, Lt/p;

    iget v14, v7, Lw/d;->d:F

    invoke-direct {v5, v14}, Lt/p;-><init>(F)V

    invoke-virtual {v2, v4, v5}, Lt/d2;->a(Lt/t;Lt/t;)Lt/t;

    move-result-object v2

    check-cast v2, Lt/p;

    iget v2, v2, Lt/p;->a:F

    cmpg-float v4, v14, v10

    if-gez v4, :cond_3

    iget v4, v1, Lb0/h0;->f:I

    add-int/2addr v4, v6

    goto :goto_0

    :cond_3
    iget v4, v1, Lb0/h0;->f:I

    :goto_0
    int-to-float v5, v3

    div-float/2addr v2, v5

    float-to-int v2, v2

    add-int/2addr v2, v4

    invoke-virtual {v1}, Lb0/h0;->k()I

    move-result v5

    invoke-static {v2, v9, v5}, Lz6/a;->r(III)I

    move-result v2

    invoke-virtual {v1}, Lb0/h0;->l()I

    invoke-virtual {v1}, Lb0/h0;->n()I

    iget-object v0, v0, Lb0/p;->d:Lb0/b0;

    check-cast v0, Lb0/c0;

    iget v0, v0, Lb0/c0;->a:I

    sub-int v5, v4, v0

    add-int/2addr v0, v4

    invoke-static {v2, v5, v0}, Lz6/a;->r(III)I

    move-result v0

    invoke-virtual {v1}, Lb0/h0;->k()I

    move-result v1

    invoke-static {v0, v9, v1}, Lz6/a;->r(III)I

    move-result v0

    sub-int/2addr v0, v4

    mul-int/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    sub-int/2addr v0, v3

    if-gez v0, :cond_4

    move v0, v9

    :cond_4
    if-nez v0, :cond_5

    int-to-float v0, v0

    goto :goto_1

    :cond_5
    int-to-float v0, v0

    invoke-static {v14}, Ljava/lang/Math;->signum(F)F

    move-result v1

    mul-float/2addr v0, v1

    :goto_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v14}, Ljava/lang/Math;->signum(F)F

    move-result v1

    mul-float/2addr v1, v0

    new-instance v14, Ld9/r;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    iput v1, v14, Ld9/r;->a:F

    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, v1}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v11, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v7, Lw/d;->c:Lw/h;

    iget-object v1, v7, Lw/d;->f:Lv/r1;

    iget v2, v14, Ld9/r;->a:F

    iget v3, v7, Lw/d;->d:F

    new-instance v4, Lw/c;

    invoke-direct {v4, v14, v11, v6}, Lw/c;-><init>(Ld9/r;Lc9/c;I)V

    iput-object v14, v7, Lw/d;->a:Ld9/r;

    iput v6, v7, Lw/d;->b:I

    move-object/from16 v5, p0

    invoke-static/range {v0 .. v5}, Lw/h;->b(Lw/h;Lv/r1;FFLw/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_6

    return-object v8

    :cond_6
    :goto_2
    check-cast v0, Lt/o;

    iget-object v1, v12, Lw/h;->a:Lb0/p;

    invoke-virtual {v0}, Lt/o;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget-object v3, v1, Lb0/p;->a:Lb0/h0;

    invoke-virtual {v3}, Lb0/h0;->l()I

    move-result v4

    invoke-virtual {v3}, Lb0/h0;->n()I

    move-result v5

    add-int/2addr v5, v4

    iget-object v4, v3, Lb0/h0;->e:Lb0/a0;

    iget-object v15, v4, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v15}, Lm0/u2;->d()I

    move-result v15

    invoke-static {v5, v3}, Ld9/i;->m(ILb0/h0;)I

    move-result v16

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v17

    move-object/from16 v6, v17

    check-cast v6, Lb0/x;

    iget-object v6, v6, Lb0/x;->a:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    div-int/2addr v6, v13

    const/high16 v17, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v18, -0x800000    # Float.NEGATIVE_INFINITY

    move v13, v15

    move/from16 v10, v16

    move/from16 v21, v17

    move/from16 v20, v18

    :goto_3
    sub-int v22, v15, v6

    if-gez v22, :cond_7

    goto :goto_4

    :cond_7
    move/from16 v9, v22

    :goto_4
    if-lt v13, v9, :cond_a

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v9

    invoke-static {v9}, Lf6/a;->Q(Lb0/q;)I

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v9

    check-cast v9, Lb0/x;

    iget v9, v9, Lb0/x;->f:I

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v9

    check-cast v9, Lb0/x;

    iget v9, v9, Lb0/x;->d:I

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v9

    check-cast v9, Lb0/x;

    iget v9, v9, Lb0/x;->b:I

    sget v9, Lb0/o0;->a:F

    move-object/from16 v22, v8

    const/4 v9, 0x0

    int-to-float v8, v9

    int-to-float v9, v10

    sub-float/2addr v9, v8

    const/4 v8, 0x0

    cmpg-float v19, v9, v8

    if-gtz v19, :cond_8

    cmpl-float v19, v9, v20

    if-lez v19, :cond_8

    move/from16 v20, v9

    :cond_8
    cmpl-float v23, v9, v8

    if-ltz v23, :cond_9

    cmpg-float v8, v9, v21

    if-gez v8, :cond_9

    move/from16 v21, v9

    :cond_9
    sub-int/2addr v10, v5

    add-int/lit8 v13, v13, -0x1

    move-object/from16 v8, v22

    const/4 v9, 0x0

    goto :goto_3

    :cond_a
    move-object/from16 v22, v8

    add-int/lit8 v8, v15, 0x1

    add-int v16, v16, v5

    move/from16 v9, v16

    :goto_5
    add-int v10, v15, v6

    invoke-virtual {v3}, Lb0/h0;->k()I

    move-result v13

    const/16 v16, 0x1

    add-int/lit8 v13, v13, -0x1

    if-le v10, v13, :cond_b

    move v10, v13

    :cond_b
    if-gt v8, v10, :cond_e

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v10

    invoke-static {v10}, Lf6/a;->Q(Lb0/q;)I

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v10

    check-cast v10, Lb0/x;

    iget v10, v10, Lb0/x;->f:I

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v10

    check-cast v10, Lb0/x;

    iget v10, v10, Lb0/x;->d:I

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v10

    check-cast v10, Lb0/x;

    iget v10, v10, Lb0/x;->b:I

    sget v10, Lb0/o0;->a:F

    const/4 v10, 0x0

    int-to-float v13, v10

    int-to-float v10, v9

    sub-float/2addr v10, v13

    const/4 v13, 0x0

    cmpl-float v16, v10, v13

    if-ltz v16, :cond_c

    cmpg-float v16, v10, v21

    if-gez v16, :cond_c

    move/from16 v21, v10

    :cond_c
    cmpg-float v16, v10, v13

    if-gtz v16, :cond_d

    cmpl-float v13, v10, v20

    if-lez v13, :cond_d

    move/from16 v20, v10

    :cond_d
    add-int/2addr v9, v5

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_e
    cmpg-float v5, v20, v18

    if-nez v5, :cond_f

    move/from16 v20, v21

    :cond_f
    cmpg-float v5, v21, v17

    if-nez v5, :cond_10

    move/from16 v21, v20

    :cond_10
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v8

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v6

    check-cast v6, Lb0/x;

    iget-object v6, v6, Lb0/x;->e:Lv/h1;

    sget-object v9, Lv/h1;->b:Lv/h1;

    if-ne v6, v9, :cond_11

    invoke-virtual {v3}, Lb0/h0;->o()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ld1/c;->d(J)F

    move-result v6

    :goto_6
    const/4 v10, 0x0

    goto :goto_7

    :cond_11
    invoke-virtual {v3}, Lb0/h0;->o()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ld1/c;->e(J)F

    move-result v6

    goto :goto_6

    :goto_7
    cmpg-float v6, v6, v10

    if-gez v6, :cond_12

    const/4 v6, 0x1

    goto :goto_8

    :cond_12
    const/4 v6, 0x0

    :goto_8
    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v10

    check-cast v10, Lb0/x;

    iget-object v10, v10, Lb0/x;->e:Lv/h1;

    if-ne v10, v9, :cond_13

    invoke-virtual {v3}, Lb0/h0;->o()J

    move-result-wide v9

    invoke-static {v9, v10}, Ld1/c;->d(J)F

    move-result v9

    goto :goto_9

    :cond_13
    invoke-virtual {v3}, Lb0/h0;->o()J

    move-result-wide v9

    invoke-static {v9, v10}, Ld1/c;->e(J)F

    move-result v9

    :goto_9
    invoke-virtual {v3}, Lb0/h0;->j()Lb0/q;

    move-result-object v10

    check-cast v10, Lb0/x;

    iget v10, v10, Lb0/x;->b:I

    int-to-float v10, v10

    div-float/2addr v9, v10

    float-to-int v10, v9

    int-to-float v10, v10

    sub-float/2addr v9, v10

    iget-object v10, v3, Lb0/h0;->q:Lm2/b;

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v13

    sget v15, Lw/l;->a:F

    invoke-interface {v10, v15}, Lm2/b;->v(F)F

    move-result v10

    cmpg-float v10, v13, v10

    if-gez v10, :cond_14

    const/4 v2, 0x0

    goto :goto_a

    :cond_14
    const/4 v10, 0x0

    cmpl-float v2, v2, v10

    if-lez v2, :cond_15

    const/4 v2, 0x1

    goto :goto_a

    :cond_15
    const/4 v2, 0x2

    :goto_a
    if-nez v2, :cond_18

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v1, v1, Lb0/p;->b:F

    cmpl-float v1, v2, v1

    if-lez v1, :cond_16

    if-eqz v6, :cond_1c

    goto :goto_b

    :cond_16
    iget-object v1, v4, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v1}, Lm0/s2;->d()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget-object v2, v3, Lb0/h0;->q:Lm2/b;

    sget v4, Lb0/o0;->a:F

    invoke-interface {v2, v4}, Lm2/b;->v(F)F

    move-result v2

    invoke-virtual {v3}, Lb0/h0;->l()I

    move-result v4

    int-to-float v4, v4

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v4, v9

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-virtual {v3}, Lb0/h0;->l()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_17

    if-eqz v6, :cond_19

    goto :goto_c

    :cond_17
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_19

    goto :goto_c

    :cond_18
    const/4 v1, 0x1

    if-ne v2, v1, :cond_1a

    :cond_19
    :goto_b
    move v8, v5

    goto :goto_c

    :cond_1a
    const/4 v1, 0x2

    if-ne v2, v1, :cond_1b

    goto :goto_c

    :cond_1b
    const/4 v8, 0x0

    :cond_1c
    :goto_c
    cmpg-float v1, v8, v17

    if-nez v1, :cond_1d

    goto :goto_d

    :cond_1d
    cmpg-float v1, v8, v18

    if-nez v1, :cond_1e

    :goto_d
    const/4 v2, 0x0

    goto :goto_e

    :cond_1e
    move v2, v8

    :goto_e
    iput v2, v14, Ld9/r;->a:F

    iget-object v1, v7, Lw/d;->f:Lv/r1;

    const/16 v3, 0x1e

    const/4 v4, 0x0

    invoke-static {v0, v4, v4, v3}, Lt/e;->k(Lt/o;FFI)Lt/o;

    move-result-object v3

    iget-object v4, v12, Lw/h;->d:Lt/n;

    new-instance v5, Lw/c;

    const/4 v0, 0x0

    invoke-direct {v5, v14, v11, v0}, Lw/c;-><init>(Ld9/r;Lc9/c;I)V

    const/4 v0, 0x0

    iput-object v0, v7, Lw/d;->a:Ld9/r;

    const/4 v0, 0x2

    iput v0, v7, Lw/d;->b:I

    move-object v0, v1

    move v1, v2

    move-object/from16 v6, p0

    invoke-static/range {v0 .. v6}, Lw/l;->b(Lv/r1;FFLt/o;Lt/n;Lw/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v22

    if-ne v0, v1, :cond_1f

    return-object v1

    :cond_1f
    :goto_f
    return-object v0
.end method
