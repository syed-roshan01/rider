.class public final Lu/p;
.super Ly0/n;

# interfaces
.implements Lt1/s;


# instance fields
.field public A:Le1/g0;

.field public B:Le1/l0;

.field public u:J

.field public v:Le1/n;

.field public w:F

.field public x:Le1/l0;

.field public y:Ld1/f;

.field public z:Lm2/l;


# virtual methods
.method public final i(Lg1/e;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    iget-object v1, v0, Lu/p;->x:Le1/l0;

    sget-object v2, Le1/g0;->a:Le1/f0;

    if-ne v1, v2, :cond_1

    iget-wide v1, v0, Lu/p;->u:J

    sget-wide v3, Le1/r;->g:J

    invoke-static {v1, v2, v3, v4}, Le1/r;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_0

    iget-wide v2, v0, Lu/p;->u:J

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/16 v8, 0x7e

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v8}, Lg1/g;->U(Lg1/g;JJJI)V

    :cond_0
    iget-object v2, v0, Lu/p;->v:Le1/n;

    if-eqz v2, :cond_d

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    iget v7, v0, Lu/p;->w:F

    const/4 v8, 0x0

    const/16 v9, 0x76

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v9}, Lg1/g;->Y(Lg1/g;Le1/n;JJFLg1/h;I)V

    goto/16 :goto_4

    :cond_1
    move-object v1, v10

    check-cast v1, Lt1/i0;

    iget-object v2, v1, Lt1/i0;->a:Lg1/c;

    invoke-interface {v2}, Lg1/g;->e()J

    move-result-wide v2

    iget-object v4, v0, Lu/p;->y:Ld1/f;

    sget v5, Ld1/f;->d:I

    instance-of v5, v4, Ld1/f;

    iget-object v6, v1, Lt1/i0;->a:Lg1/c;

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    iget-wide v4, v4, Ld1/f;->a:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lt1/i0;->getLayoutDirection()Lm2/l;

    move-result-object v2

    iget-object v3, v0, Lu/p;->z:Lm2/l;

    if-ne v2, v3, :cond_4

    iget-object v2, v0, Lu/p;->B:Le1/l0;

    iget-object v3, v0, Lu/p;->x:Le1/l0;

    invoke-static {v2, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v0, Lu/p;->A:Le1/g0;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    :goto_0
    iget-object v2, v0, Lu/p;->x:Le1/l0;

    invoke-interface {v6}, Lg1/g;->e()J

    move-result-wide v3

    invoke-virtual {v1}, Lt1/i0;->getLayoutDirection()Lm2/l;

    move-result-object v5

    invoke-interface {v2, v3, v4, v5, v10}, Le1/l0;->d(JLm2/l;Lm2/b;)Le1/g0;

    move-result-object v2

    :goto_1
    iget-wide v3, v0, Lu/p;->u:J

    sget-wide v7, Le1/r;->g:J

    invoke-static {v3, v4, v7, v8}, Le1/r;->c(JJ)Z

    move-result v3

    sget-object v4, Lg1/j;->a:Lg1/j;

    if-nez v3, :cond_8

    iget-wide v7, v0, Lu/p;->u:J

    const/high16 v21, 0x3f800000    # 1.0f

    const/16 v22, 0x0

    const/16 v23, 0x3

    instance-of v3, v2, Le1/b0;

    if-eqz v3, :cond_5

    move-object v3, v2

    check-cast v3, Le1/b0;

    iget-object v3, v3, Le1/b0;->e:Ld1/d;

    iget v5, v3, Ld1/d;->a:F

    iget v9, v3, Ld1/d;->b:F

    invoke-static {v5, v9}, Ld9/i;->f(FF)J

    move-result-wide v14

    invoke-virtual {v3}, Ld1/d;->c()F

    move-result v5

    invoke-virtual {v3}, Ld1/d;->b()F

    move-result v3

    invoke-static {v5, v3}, Ld7/t;->j(FF)J

    move-result-wide v16

    move-object v11, v1

    move-wide v12, v7

    move/from16 v18, v21

    move-object/from16 v19, v4

    move-object/from16 v20, v22

    move/from16 v21, v23

    invoke-virtual/range {v11 .. v21}, Lt1/i0;->i0(JJJFLg1/h;Le1/l;I)V

    goto :goto_2

    :cond_5
    instance-of v3, v2, Le1/c0;

    if-eqz v3, :cond_7

    move-object v3, v2

    check-cast v3, Le1/c0;

    iget-object v12, v3, Le1/c0;->f:Le1/i;

    if-eqz v12, :cond_6

    move-object v11, v1

    move-wide v13, v7

    move/from16 v15, v21

    move-object/from16 v16, v4

    move-object/from16 v17, v22

    move/from16 v18, v23

    invoke-virtual/range {v11 .. v18}, Lt1/i0;->f(Le1/i;JFLg1/h;Le1/l;I)V

    goto :goto_2

    :cond_6
    iget-object v3, v3, Le1/c0;->e:Ld1/e;

    iget-wide v11, v3, Ld1/e;->h:J

    invoke-static {v11, v12}, Ld1/a;->b(J)F

    move-result v5

    iget v9, v3, Ld1/e;->b:F

    iget v11, v3, Ld1/e;->a:F

    invoke-static {v11, v9}, Ld9/i;->f(FF)J

    move-result-wide v14

    invoke-virtual {v3}, Ld1/e;->b()F

    move-result v9

    invoke-virtual {v3}, Ld1/e;->a()F

    move-result v3

    invoke-static {v9, v3}, Ld7/t;->j(FF)J

    move-result-wide v16

    invoke-static {v5, v5}, Lf6/a;->d(FF)J

    move-result-wide v18

    move-object v11, v1

    move-wide v12, v7

    move-object/from16 v20, v4

    invoke-virtual/range {v11 .. v23}, Lt1/i0;->g(JJJJLg1/h;FLe1/l;I)V

    goto :goto_2

    :cond_7
    new-instance v1, Landroidx/fragment/app/a0;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_8
    :goto_2
    iget-object v3, v0, Lu/p;->v:Le1/n;

    if-eqz v3, :cond_c

    iget v5, v0, Lu/p;->w:F

    const/16 v21, 0x0

    const/16 v22, 0x3

    instance-of v7, v2, Le1/b0;

    if-eqz v7, :cond_9

    move-object v7, v2

    check-cast v7, Le1/b0;

    iget-object v7, v7, Le1/b0;->e:Ld1/d;

    iget v8, v7, Ld1/d;->a:F

    iget v9, v7, Ld1/d;->b:F

    invoke-static {v8, v9}, Ld9/i;->f(FF)J

    move-result-wide v13

    invoke-virtual {v7}, Ld1/d;->c()F

    move-result v8

    invoke-virtual {v7}, Ld1/d;->b()F

    move-result v7

    invoke-static {v8, v7}, Ld7/t;->j(FF)J

    move-result-wide v15

    move-object v11, v1

    move-object v12, v3

    move/from16 v17, v5

    move-object/from16 v18, v4

    move-object/from16 v19, v21

    move/from16 v20, v22

    invoke-virtual/range {v11 .. v20}, Lt1/i0;->k0(Le1/n;JJFLg1/h;Le1/l;I)V

    goto :goto_3

    :cond_9
    instance-of v7, v2, Le1/c0;

    if-eqz v7, :cond_b

    move-object v7, v2

    check-cast v7, Le1/c0;

    iget-object v12, v7, Le1/c0;->f:Le1/i;

    if-eqz v12, :cond_a

    move-object v11, v1

    move-object v13, v3

    move v14, v5

    move-object v15, v4

    move-object/from16 v16, v21

    move/from16 v17, v22

    invoke-virtual/range {v11 .. v17}, Lt1/i0;->n0(Le1/d0;Le1/n;FLg1/h;Le1/l;I)V

    goto :goto_3

    :cond_a
    iget-object v7, v7, Le1/c0;->e:Ld1/e;

    iget-wide v8, v7, Ld1/e;->h:J

    invoke-static {v8, v9}, Ld1/a;->b(J)F

    move-result v8

    iget v9, v7, Ld1/e;->b:F

    iget v11, v7, Ld1/e;->a:F

    invoke-static {v11, v9}, Ld9/i;->f(FF)J

    move-result-wide v13

    invoke-virtual {v7}, Ld1/e;->b()F

    move-result v9

    invoke-virtual {v7}, Ld1/e;->a()F

    move-result v7

    invoke-static {v9, v7}, Ld7/t;->j(FF)J

    move-result-wide v15

    invoke-static {v8, v8}, Lf6/a;->d(FF)J

    move-result-wide v17

    move-object v11, v1

    move-object v12, v3

    move/from16 v19, v5

    move-object/from16 v20, v4

    invoke-virtual/range {v11 .. v22}, Lt1/i0;->s(Le1/n;JJJFLg1/h;Le1/l;I)V

    goto :goto_3

    :cond_b
    new-instance v1, Landroidx/fragment/app/a0;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_c
    :goto_3
    iput-object v2, v0, Lu/p;->A:Le1/g0;

    invoke-interface {v6}, Lg1/g;->e()J

    move-result-wide v2

    new-instance v4, Ld1/f;

    invoke-direct {v4, v2, v3}, Ld1/f;-><init>(J)V

    iput-object v4, v0, Lu/p;->y:Ld1/f;

    invoke-virtual {v1}, Lt1/i0;->getLayoutDirection()Lm2/l;

    move-result-object v1

    iput-object v1, v0, Lu/p;->z:Lm2/l;

    iget-object v1, v0, Lu/p;->x:Le1/l0;

    iput-object v1, v0, Lu/p;->B:Le1/l0;

    :cond_d
    :goto_4
    move-object v1, v10

    check-cast v1, Lt1/i0;

    invoke-virtual {v1}, Lt1/i0;->a()V

    return-void
.end method
