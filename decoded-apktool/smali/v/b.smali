.class public final Lv/b;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:Lv/j;

.field public c:Lm9/d0;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lm9/d0;

.field public final synthetic n:Lv/j;


# direct methods
.method public constructor <init>(Lv/j;Lu8/e;Lm9/d0;)V
    .locals 0

    iput-object p3, p0, Lv/b;->f:Lm9/d0;

    iput-object p1, p0, Lv/b;->n:Lv/j;

    invoke-direct {p0, p2}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lv/b;

    iget-object v1, p0, Lv/b;->f:Lm9/d0;

    iget-object v2, p0, Lv/b;->n:Lv/j;

    invoke-direct {v0, v2, p2, v1}, Lv/b;-><init>(Lv/j;Lu8/e;Lm9/d0;)V

    iput-object p1, v0, Lv/b;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/b;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/b;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    sget-object v2, Lv8/a;->a:Lv8/a;

    iget v0, v1, Lv/b;->d:I

    sget-object v3, Lv/z;->b:Lv/z;

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v6, :cond_1

    if-ne v0, v5, :cond_0

    iget-object v7, v1, Lv/b;->c:Lm9/d0;

    iget-object v8, v1, Lv/b;->b:Lv/j;

    iget-object v0, v1, Lv/b;->e:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lo1/h0;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    move-object v14, v1

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :catch_0
    move-exception v0

    move-object v14, v1

    goto/16 :goto_a

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Lv/b;->e:Ljava/lang/Object;

    check-cast v0, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    move-object v14, v1

    move-object v15, v2

    :goto_0
    move-object v2, v0

    goto :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v0, v1, Lv/b;->e:Ljava/lang/Object;

    check-cast v0, Lo1/h0;

    move-object v13, v1

    :goto_1
    iget-object v7, v13, Lv/b;->f:Lm9/d0;

    invoke-static {v7}, Ld7/a;->x(Lm9/d0;)Z

    move-result v7

    if-eqz v7, :cond_a

    iget-object v7, v13, Lv/b;->n:Lv/j;

    iget-object v8, v7, Lv/j;->D:Lv/a;

    iget-object v9, v7, Lv/j;->E:Lt/l0;

    iget-object v10, v7, Lv/j;->F:Lp1/d;

    check-cast v7, Lv/w0;

    iget-object v11, v7, Lv/w0;->O:Lv/d0;

    iput-object v0, v13, Lv/b;->e:Ljava/lang/Object;

    iput-object v4, v13, Lv/b;->b:Lv/j;

    iput-object v4, v13, Lv/b;->c:Lm9/d0;

    iput v6, v13, Lv/b;->d:I

    move-object v7, v0

    move-object v12, v13

    invoke-static/range {v7 .. v12}, Lv/t0;->a(Lo1/h0;Lv/a;Lt/l0;Lp1/d;Lv/d0;Lu8/e;)Ljava/io/Serializable;

    move-result-object v7

    if-ne v7, v2, :cond_3

    return-object v2

    :cond_3
    move-object v15, v2

    move-object v14, v13

    goto :goto_0

    :goto_2
    check-cast v7, Lq8/f;

    if-eqz v7, :cond_9

    iget-object v13, v14, Lv/b;->f:Lm9/d0;

    iget-object v12, v14, Lv/b;->n:Lv/j;

    iget-boolean v0, v12, Lv/j;->G:Z

    if-nez v0, :cond_4

    iput-boolean v6, v12, Lv/j;->G:Z

    invoke-virtual {v12}, Ly0/n;->v0()Lm9/d0;

    move-result-object v0

    new-instance v8, Lv/i;

    invoke-direct {v8, v12, v4}, Lv/i;-><init>(Lv/j;Lu8/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-static {v0, v4, v10, v8, v9}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :cond_4
    :try_start_1
    iget-object v0, v7, Lq8/f;->a:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    move-object v9, v0

    check-cast v9, Lo1/u;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v0, v7, Lq8/f;->b:Ljava/lang/Object;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    check-cast v0, Ld1/c;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    iget-wide v10, v0, Ld1/c;->a:J

    iget-object v0, v12, Lv/j;->F:Lp1/d;

    iget-object v7, v12, Lv/j;->I:Lo9/c;

    iget-boolean v8, v12, Lv/j;->C:Z
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    new-instance v4, Lv/a;

    invoke-direct {v4, v12, v6}, Lv/a;-><init>(Lv/j;I)V

    iput-object v2, v14, Lv/b;->e:Ljava/lang/Object;
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    iput-object v12, v14, Lv/b;->b:Lv/j;

    iput-object v13, v14, Lv/b;->c:Lm9/d0;
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    iput v5, v14, Lv/b;->d:I
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move/from16 v16, v8

    move-object v8, v2

    move-object/from16 v17, v12

    move-object v12, v0

    move-object/from16 v18, v13

    move-object v13, v7

    move-object v7, v14

    move/from16 v14, v16

    move-object v5, v15

    move-object v15, v4

    move-object/from16 v16, v7

    :try_start_9
    invoke-static/range {v8 .. v16}, Lv/t0;->b(Lo1/h0;Lo1/u;JLp1/d;Lo9/c;ZLv/a;Lv/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-ne v0, v5, :cond_5

    return-object v5

    :cond_5
    move-object v9, v2

    move-object v2, v5

    move-object v14, v7

    move-object/from16 v8, v17

    move-object/from16 v7, v18

    :goto_3
    :try_start_a
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    sget-object v4, Lu1/s1;->p:Lm0/m3;

    invoke-static {v8, v4}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu1/y2;

    invoke-interface {v4}, Lu1/y2;->a()F

    move-result v4

    if-eqz v0, :cond_7

    invoke-static {v4, v4}, Li1/b;->e(FF)J

    move-result-wide v4

    iget-object v0, v8, Lv/j;->F:Lp1/d;

    invoke-virtual {v0, v4, v5}, Lp1/d;->b(J)J

    move-result-wide v4

    invoke-virtual {v0}, Lp1/d;->c()V

    new-instance v0, Lv/c0;

    iget-boolean v7, v8, Lv/j;->C:Z

    if-eqz v7, :cond_6

    const/high16 v7, -0x40800000    # -1.0f

    goto :goto_4

    :cond_6
    const/high16 v7, 0x3f800000    # 1.0f

    :goto_4
    invoke-static {v4, v5}, Lm2/p;->b(J)F

    move-result v10

    mul-float/2addr v10, v7

    invoke-static {v4, v5}, Lm2/p;->c(J)F

    move-result v4

    mul-float/2addr v4, v7

    invoke-static {v10, v4}, Li1/b;->e(FF)J

    move-result-wide v4

    invoke-direct {v0, v4, v5}, Lv/c0;-><init>(J)V

    goto :goto_5

    :cond_7
    move-object v0, v3

    :goto_5
    iget-object v4, v8, Lv/j;->I:Lo9/c;

    invoke-interface {v4, v0}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_6
    move-object v0, v9

    move-object v13, v14

    goto :goto_b

    :catch_1
    move-exception v0

    goto :goto_a

    :catchall_1
    move-exception v0

    :goto_7
    move-object/from16 v8, v17

    goto :goto_d

    :catch_2
    move-exception v0

    :goto_8
    move-object v9, v2

    move-object v2, v5

    move-object v14, v7

    :goto_9
    move-object/from16 v8, v17

    move-object/from16 v7, v18

    goto :goto_a

    :catchall_2
    move-exception v0

    move-object/from16 v17, v12

    goto :goto_7

    :catch_3
    move-exception v0

    move-object/from16 v17, v12

    move-object/from16 v18, v13

    move-object v7, v14

    move-object v5, v15

    move-object v9, v2

    move-object v2, v5

    goto :goto_9

    :catch_4
    move-exception v0

    move-object/from16 v17, v12

    move-object/from16 v18, v13

    move-object v7, v14

    move-object v5, v15

    goto :goto_8

    :goto_a
    :try_start_b
    invoke-static {v7}, Ld7/a;->x(Lm9/d0;)Z

    move-result v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-eqz v4, :cond_8

    sget-object v0, Lu1/s1;->p:Lm0/m3;

    invoke-static {v8, v0}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/y2;

    invoke-interface {v0}, Lu1/y2;->a()F

    iget-object v0, v8, Lv/j;->I:Lo9/c;

    invoke-interface {v0, v3}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :goto_b
    const/4 v4, 0x0

    :goto_c
    const/4 v5, 0x2

    goto/16 :goto_1

    :cond_8
    :try_start_c
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :goto_d
    sget-object v2, Lu1/s1;->p:Lm0/m3;

    invoke-static {v8, v2}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu1/y2;

    invoke-interface {v2}, Lu1/y2;->a()F

    iget-object v2, v8, Lv/j;->I:Lo9/c;

    invoke-interface {v2, v3}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0

    :cond_9
    move-object v7, v14

    move-object v5, v15

    move-object v0, v2

    move-object v2, v5

    move-object v13, v7

    goto :goto_c

    :cond_a
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0
.end method
