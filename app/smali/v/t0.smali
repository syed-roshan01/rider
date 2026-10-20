.class public abstract Lv/t0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lv/l0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lv/l0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv/t0;->a:Lv/l0;

    return-void
.end method

.method public static final a(Lo1/h0;Lv/a;Lt/l0;Lp1/d;Lv/d0;Lu8/e;)Ljava/io/Serializable;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    instance-of v2, v1, Lv/m0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lv/m0;

    iget v3, v2, Lv/m0;->q:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lv/m0;->q:I

    goto :goto_0

    :cond_0
    new-instance v2, Lv/m0;

    invoke-direct {v2, v1}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object v1, v2, Lv/m0;->p:Ljava/lang/Object;

    sget-object v3, Lv8/a;->a:Lv8/a;

    iget v4, v2, Lv/m0;->q:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v6, :cond_4

    if-eq v4, v5, :cond_3

    if-eq v4, v8, :cond_2

    if-ne v4, v7, :cond_1

    iget-wide v4, v2, Lv/m0;->o:J

    iget v0, v2, Lv/m0;->n:F

    iget-object v6, v2, Lv/m0;->f:Lo1/u;

    iget-object v11, v2, Lv/m0;->e:Ljava/lang/Object;

    check-cast v11, Ld9/t;

    iget-object v12, v2, Lv/m0;->d:Ljava/lang/Object;

    check-cast v12, Lo1/h0;

    iget-object v13, v2, Lv/m0;->c:Ljava/lang/Object;

    check-cast v13, Lc9/e;

    iget-object v14, v2, Lv/m0;->b:Ljava/lang/Object;

    check-cast v14, Ld9/t;

    iget-object v15, v2, Lv/m0;->a:Ljava/lang/Object;

    check-cast v15, Lv/i1;

    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move v1, v0

    move v10, v7

    move-object v0, v13

    move-wide/from16 v17, v4

    move-object v4, v11

    move-object v11, v12

    move-wide/from16 v12, v17

    goto/16 :goto_c

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v4, v2, Lv/m0;->o:J

    iget v0, v2, Lv/m0;->n:F

    iget-object v6, v2, Lv/m0;->e:Ljava/lang/Object;

    check-cast v6, Ld9/t;

    iget-object v11, v2, Lv/m0;->d:Ljava/lang/Object;

    check-cast v11, Lo1/h0;

    iget-object v12, v2, Lv/m0;->c:Ljava/lang/Object;

    check-cast v12, Lc9/e;

    iget-object v13, v2, Lv/m0;->b:Ljava/lang/Object;

    check-cast v13, Ld9/t;

    iget-object v14, v2, Lv/m0;->a:Ljava/lang/Object;

    check-cast v14, Lv/i1;

    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v17, v2

    move v2, v0

    move-object v0, v12

    move-object/from16 v18, v3

    move-object/from16 v3, v17

    move-wide/from16 v19, v4

    move-object/from16 v4, v18

    move v5, v8

    move-wide/from16 v7, v19

    goto/16 :goto_5

    :cond_3
    iget-object v0, v2, Lv/m0;->c:Ljava/lang/Object;

    check-cast v0, Lv/i1;

    iget-object v4, v2, Lv/m0;->b:Ljava/lang/Object;

    check-cast v4, Lp1/d;

    iget-object v6, v2, Lv/m0;->a:Ljava/lang/Object;

    check-cast v6, Lo1/h0;

    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_4
    iget-object v0, v2, Lv/m0;->e:Ljava/lang/Object;

    check-cast v0, Lv/i1;

    iget-object v4, v2, Lv/m0;->d:Ljava/lang/Object;

    check-cast v4, Lp1/d;

    iget-object v6, v2, Lv/m0;->c:Ljava/lang/Object;

    check-cast v6, Lc9/a;

    iget-object v11, v2, Lv/m0;->b:Ljava/lang/Object;

    check-cast v11, Lc9/c;

    iget-object v12, v2, Lv/m0;->a:Ljava/lang/Object;

    check-cast v12, Lo1/h0;

    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v13, v0

    goto :goto_1

    :cond_5
    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V

    sget-object v1, Lo1/l;->a:Lo1/l;

    iput-object v0, v2, Lv/m0;->a:Ljava/lang/Object;

    move-object/from16 v4, p1

    iput-object v4, v2, Lv/m0;->b:Ljava/lang/Object;

    move-object/from16 v11, p2

    iput-object v11, v2, Lv/m0;->c:Ljava/lang/Object;

    move-object/from16 v12, p3

    iput-object v12, v2, Lv/m0;->d:Ljava/lang/Object;

    move-object/from16 v13, p4

    iput-object v13, v2, Lv/m0;->e:Ljava/lang/Object;

    iput v6, v2, Lv/m0;->q:I

    invoke-static {v0, v9, v1, v2}, Lv/k3;->b(Lo1/h0;ZLo1/l;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto/16 :goto_e

    :cond_6
    move-object v6, v11

    move-object v11, v4

    move-object v4, v12

    move-object v12, v0

    :goto_1
    check-cast v1, Lo1/u;

    invoke-interface {v11, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_7

    move-object v3, v10

    goto/16 :goto_e

    :cond_7
    invoke-interface {v6}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v1}, Lo1/u;->a()V

    invoke-static {v4, v1}, Lp1/e;->a(Lp1/d;Lo1/u;)V

    sget-wide v2, Ld1/c;->b:J

    new-instance v0, Ld1/c;

    invoke-direct {v0, v2, v3}, Ld1/c;-><init>(J)V

    new-instance v2, Lq8/f;

    invoke-direct {v2, v1, v0}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v2

    goto/16 :goto_e

    :cond_8
    iput-object v12, v2, Lv/m0;->a:Ljava/lang/Object;

    iput-object v4, v2, Lv/m0;->b:Ljava/lang/Object;

    iput-object v13, v2, Lv/m0;->c:Ljava/lang/Object;

    iput-object v10, v2, Lv/m0;->d:Ljava/lang/Object;

    iput-object v10, v2, Lv/m0;->e:Ljava/lang/Object;

    iput v5, v2, Lv/m0;->q:I

    invoke-static {v12, v2, v5}, Lv/k3;->c(Lo1/h0;Lu8/e;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto/16 :goto_e

    :cond_9
    move-object v6, v12

    move-object v0, v13

    :goto_2
    check-cast v1, Lo1/u;

    invoke-static {v4, v1}, Lp1/e;->a(Lp1/d;Lo1/u;)V

    new-instance v11, Ld9/t;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    sget-wide v12, Ld1/c;->b:J

    iput-wide v12, v11, Ld9/t;->a:J

    new-instance v14, Lv/n0;

    invoke-direct {v14, v9, v4, v11}, Lv/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, v6, Lo1/h0;->e:Lo1/j0;

    iget-object v4, v4, Lo1/j0;->w:Lo1/k;

    iget-wide v7, v1, Lo1/u;->a:J

    invoke-static {v4, v7, v8}, Lv/j0;->d(Lo1/k;J)Z

    move-result v4

    if-eqz v4, :cond_a

    move-object v5, v10

    goto/16 :goto_d

    :cond_a
    invoke-virtual {v6}, Lo1/h0;->g()Lu1/y2;

    move-result-object v4

    iget v1, v1, Lo1/u;->i:I

    invoke-static {v1, v5}, Lo1/s;->u(II)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v4}, Lu1/y2;->e()F

    move-result v1

    sget v4, Lv/j0;->d:F

    mul-float/2addr v1, v4

    goto :goto_3

    :cond_b
    invoke-interface {v4}, Lu1/y2;->e()F

    move-result v1

    :goto_3
    new-instance v4, Ld9/t;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-wide v7, v4, Ld9/t;->a:J

    move-object/from16 v17, v14

    move-object v14, v0

    move-object/from16 v0, v17

    :goto_4
    iput-object v14, v2, Lv/m0;->a:Ljava/lang/Object;

    iput-object v11, v2, Lv/m0;->b:Ljava/lang/Object;

    iput-object v0, v2, Lv/m0;->c:Ljava/lang/Object;

    iput-object v6, v2, Lv/m0;->d:Ljava/lang/Object;

    iput-object v4, v2, Lv/m0;->e:Ljava/lang/Object;

    iput-object v10, v2, Lv/m0;->f:Lo1/u;

    iput v1, v2, Lv/m0;->n:F

    iput-wide v12, v2, Lv/m0;->o:J

    const/4 v5, 0x3

    iput v5, v2, Lv/m0;->q:I

    sget-object v7, Lo1/l;->b:Lo1/l;

    invoke-virtual {v6, v7, v2}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_c

    goto/16 :goto_e

    :cond_c
    move-object/from16 v17, v2

    move v2, v1

    move-object v1, v7

    move-wide v7, v12

    move-object v13, v11

    move-object v11, v6

    move-object v6, v4

    move-object v4, v3

    move-object/from16 v3, v17

    :goto_5
    check-cast v1, Lo1/k;

    iget-object v12, v1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v15

    move v5, v9

    :goto_6
    if-ge v5, v15, :cond_e

    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v9, v16

    check-cast v9, Lo1/u;

    move-object/from16 p1, v11

    iget-wide v10, v9, Lo1/u;->a:J

    move-object/from16 p2, v12

    move-object v9, v13

    iget-wide v12, v6, Ld9/t;->a:J

    invoke-static {v10, v11, v12, v13}, Lo1/t;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_d

    goto :goto_7

    :cond_d
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move-object v13, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    goto :goto_6

    :cond_e
    move-object/from16 p1, v11

    move-object v9, v13

    const/16 v16, 0x0

    :goto_7
    move-object/from16 v5, v16

    check-cast v5, Lo1/u;

    if-nez v5, :cond_f

    :goto_8
    move-object v11, v9

    :goto_9
    const/4 v5, 0x0

    goto/16 :goto_d

    :cond_f
    invoke-virtual {v5}, Lo1/u;->b()Z

    move-result v10

    if-eqz v10, :cond_10

    goto :goto_8

    :cond_10
    invoke-static {v5}, Lm9/e0;->t(Lo1/u;)Z

    move-result v10

    if-eqz v10, :cond_14

    iget-object v1, v1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v10, 0x0

    :goto_a
    if-ge v10, v5, :cond_12

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lo1/u;

    iget-boolean v12, v12, Lo1/u;->d:Z

    if-eqz v12, :cond_11

    goto :goto_b

    :cond_11
    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :cond_12
    const/4 v11, 0x0

    :goto_b
    check-cast v11, Lo1/u;

    if-nez v11, :cond_13

    goto :goto_8

    :cond_13
    iget-wide v10, v11, Lo1/u;->a:J

    iput-wide v10, v6, Ld9/t;->a:J

    move v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-wide v12, v7

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v6, p1

    goto/16 :goto_4

    :cond_14
    iget-wide v10, v5, Lo1/u;->c:J

    iget-wide v12, v5, Lo1/u;->g:J

    invoke-static {v10, v11, v12, v13}, Ld1/c;->f(JJ)J

    move-result-wide v10

    invoke-static {v7, v8, v10, v11}, Ld1/c;->g(JJ)J

    move-result-wide v7

    check-cast v14, Lv/d0;

    invoke-virtual {v14, v7, v8}, Lv/d0;->a(J)F

    move-result v1

    cmpg-float v1, v1, v2

    if-gez v1, :cond_17

    sget-object v1, Lo1/l;->c:Lo1/l;

    iput-object v14, v3, Lv/m0;->a:Ljava/lang/Object;

    iput-object v9, v3, Lv/m0;->b:Ljava/lang/Object;

    iput-object v0, v3, Lv/m0;->c:Ljava/lang/Object;

    move-object/from16 v11, p1

    iput-object v11, v3, Lv/m0;->d:Ljava/lang/Object;

    iput-object v6, v3, Lv/m0;->e:Ljava/lang/Object;

    iput-object v5, v3, Lv/m0;->f:Lo1/u;

    iput v2, v3, Lv/m0;->n:F

    iput-wide v7, v3, Lv/m0;->o:J

    const/4 v10, 0x4

    iput v10, v3, Lv/m0;->q:I

    invoke-virtual {v11, v1, v3}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_15

    move-object v3, v4

    goto :goto_e

    :cond_15
    move v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-wide v12, v7

    move-object v15, v14

    move-object v6, v5

    move-object v14, v9

    :goto_c
    invoke-virtual {v6}, Lo1/u;->b()Z

    move-result v5

    if-eqz v5, :cond_16

    move-object v11, v14

    goto/16 :goto_9

    :cond_16
    move-object v6, v11

    move-object v11, v14

    move-object v14, v15

    const/4 v9, 0x0

    const/4 v10, 0x0

    goto/16 :goto_4

    :cond_17
    move-object/from16 v11, p1

    const/4 v10, 0x4

    invoke-virtual {v14, v2, v7, v8}, Lv/d0;->b(FJ)J

    move-result-wide v7

    new-instance v1, Ld1/c;

    invoke-direct {v1, v7, v8}, Ld1/c;-><init>(J)V

    invoke-interface {v0, v5, v1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Lo1/u;->b()Z

    move-result v1

    if-eqz v1, :cond_19

    move-object v11, v9

    :goto_d
    if-eqz v5, :cond_18

    iget-wide v0, v11, Ld9/t;->a:J

    new-instance v2, Ld1/c;

    invoke-direct {v2, v0, v1}, Ld1/c;-><init>(J)V

    new-instance v0, Lq8/f;

    invoke-direct {v0, v5, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v0

    goto :goto_e

    :cond_18
    const/4 v3, 0x0

    :goto_e
    return-object v3

    :cond_19
    sget-wide v12, Ld1/c;->b:J

    move v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object v6, v11

    const/4 v10, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    goto/16 :goto_4
.end method

.method public static final b(Lo1/h0;Lo1/u;JLp1/d;Lo9/c;ZLv/a;Lv/b;)Ljava/lang/Object;
    .locals 7

    iget-wide v0, p1, Lo1/u;->c:J

    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    iget-wide v1, p1, Lo1/u;->c:J

    invoke-static {v1, v2}, Ld1/c;->e(J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v4

    mul-float/2addr v4, v0

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result v0

    mul-float/2addr v0, v3

    invoke-static {v4, v0}, Ld9/i;->f(FF)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ld1/c;->f(JJ)J

    move-result-wide v0

    new-instance v2, Lv/b0;

    invoke-direct {v2, v0, v1}, Lv/b0;-><init>(J)V

    invoke-interface {p5, v2}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lv/a0;

    if-eqz p6, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    invoke-static {v1, p2, p3}, Ld1/c;->h(FJ)J

    move-result-wide p2

    :cond_0
    invoke-direct {v0, p2, p3}, Lv/a0;-><init>(J)V

    invoke-interface {p5, v0}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v3, p1, Lo1/u;->a:J

    new-instance v5, Lv/o0;

    invoke-direct {v5, p4, p5, p6}, Lv/o0;-><init>(Ljava/lang/Object;Lo9/c;Z)V

    move-object v1, p0

    move-object v2, p7

    move-object v6, p8

    invoke-static/range {v1 .. v6}, Lv/t0;->c(Lo1/h0;Lv/a;JLv/o0;Lu8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lo1/h0;Lv/a;JLv/o0;Lu8/e;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p5

    instance-of v1, v0, Lv/r0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lv/r0;

    iget v2, v1, Lv/r0;->n:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lv/r0;->n:I

    goto :goto_0

    :cond_0
    new-instance v1, Lv/r0;

    invoke-direct {v1, v0}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object v0, v1, Lv/r0;->f:Ljava/lang/Object;

    sget-object v2, Lv8/a;->a:Lv8/a;

    iget v3, v1, Lv/r0;->n:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v3, v1, Lv/r0;->e:Ld9/t;

    iget-object v7, v1, Lv/r0;->d:Lo1/h0;

    iget-object v8, v1, Lv/r0;->c:Lo1/h0;

    iget-object v9, v1, Lv/r0;->b:Lc9/c;

    iget-object v10, v1, Lv/r0;->a:Lc9/c;

    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v16, v3

    move-object v3, v1

    move-object v1, v10

    move-object/from16 v10, v16

    move-object/from16 v17, v9

    move-object v9, v2

    move-object/from16 v2, v17

    goto :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lo1/h0;->e:Lo1/j0;

    iget-object v3, v3, Lo1/j0;->w:Lo1/k;

    move-wide/from16 v7, p2

    invoke-static {v3, v7, v8}, Lv/j0;->d(Lo1/k;J)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object/from16 v2, p4

    :goto_1
    const/4 v14, 0x0

    goto/16 :goto_b

    :cond_3
    move-object v3, v1

    move-object v9, v2

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    :goto_2
    new-instance v10, Ld9/t;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iput-wide v7, v10, Ld9/t;->a:J

    move-object v7, v0

    :goto_3
    iput-object v1, v3, Lv/r0;->a:Lc9/c;

    iput-object v2, v3, Lv/r0;->b:Lc9/c;

    iput-object v0, v3, Lv/r0;->c:Lo1/h0;

    iput-object v7, v3, Lv/r0;->d:Lo1/h0;

    iput-object v10, v3, Lv/r0;->e:Ld9/t;

    iput v4, v3, Lv/r0;->n:I

    sget-object v8, Lo1/l;->b:Lo1/l;

    invoke-virtual {v7, v8, v3}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v9, :cond_4

    return-object v9

    :cond_4
    move-object/from16 v16, v8

    move-object v8, v0

    move-object/from16 v0, v16

    :goto_4
    check-cast v0, Lo1/k;

    iget-object v11, v0, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v12, :cond_6

    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lo1/u;

    iget-wide v4, v15, Lo1/u;->a:J

    move-object/from16 p0, v7

    iget-wide v6, v10, Ld9/t;->a:J

    invoke-static {v4, v5, v6, v7}, Lo1/t;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v13, v13, 0x1

    const/4 v4, 0x1

    move-object/from16 v7, p0

    goto :goto_5

    :cond_6
    move-object/from16 p0, v7

    const/4 v14, 0x0

    :goto_6
    check-cast v14, Lo1/u;

    if-nez v14, :cond_7

    const/4 v14, 0x0

    goto :goto_9

    :cond_7
    invoke-static {v14}, Lm9/e0;->t(Lo1/u;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v0, v0, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_7
    if-ge v5, v4, :cond_9

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lo1/u;

    iget-boolean v7, v7, Lo1/u;->d:Z

    if-eqz v7, :cond_8

    goto :goto_8

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_9
    const/4 v6, 0x0

    :goto_8
    check-cast v6, Lo1/u;

    if-nez v6, :cond_a

    goto :goto_9

    :cond_a
    iget-wide v4, v6, Lo1/u;->a:J

    iput-wide v4, v10, Ld9/t;->a:J

    goto :goto_e

    :cond_b
    invoke-interface {v1, v14}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_11

    :goto_9
    if-nez v14, :cond_c

    :goto_a
    goto/16 :goto_1

    :cond_c
    invoke-virtual {v14}, Lo1/u;->b()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_a

    :cond_d
    invoke-static {v14}, Lm9/e0;->t(Lo1/u;)Z

    move-result v0

    if-eqz v0, :cond_10

    :goto_b
    if-eqz v14, :cond_e

    invoke-interface {v2, v14}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lq8/l;->a:Lq8/l;

    goto :goto_c

    :cond_e
    const/4 v6, 0x0

    :goto_c
    if-eqz v6, :cond_f

    const/4 v4, 0x1

    goto :goto_d

    :cond_f
    const/4 v4, 0x0

    :goto_d
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_10
    invoke-interface {v2, v14}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v4, v14, Lo1/u;->a:J

    move-object v0, v8

    move-wide v7, v4

    const/4 v4, 0x1

    goto/16 :goto_2

    :cond_11
    :goto_e
    move-object/from16 v7, p0

    move-object v0, v8

    const/4 v4, 0x1

    goto/16 :goto_3
.end method

.method public static d(Lm0/m;)Lu/b2;
    .locals 5

    check-cast p0, Lm0/q;

    const v0, 0x6bdf63e4

    invoke-virtual {p0, v0}, Lm0/q;->Z(I)V

    sget-object v0, Lu/m;->a:Ly0/o;

    const v0, -0x57ff4a94

    invoke-virtual {p0, v0}, Lm0/q;->Z(I)V

    sget-object v0, Lu1/y0;->b:Lm0/m3;

    invoke-virtual {p0, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sget-object v1, Lu/a2;->a:Lm0/p0;

    invoke-virtual {p0, v1}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu/z1;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const v3, 0x1e7b2b64

    invoke-virtual {p0, v3}, Lm0/q;->Z(I)V

    invoke-virtual {p0, v0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p0, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_0

    sget-object v3, Lm0/l;->a:Lk0/y0;

    if-ne v4, v3, :cond_1

    :cond_0
    new-instance v4, Lu/j;

    invoke-direct {v4, v0, v1}, Lu/j;-><init>(Landroid/content/Context;Lu/z1;)V

    invoke-virtual {p0, v4}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0, v2}, Lm0/q;->t(Z)V

    check-cast v4, Lu/b2;

    goto :goto_0

    :cond_2
    sget-object v4, Lu/y1;->a:Lu/y1;

    :goto_0
    invoke-virtual {p0, v2}, Lm0/q;->t(Z)V

    invoke-virtual {p0, v2}, Lm0/q;->t(Z)V

    return-object v4
.end method
