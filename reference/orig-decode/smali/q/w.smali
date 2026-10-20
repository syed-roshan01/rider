.class public final Lq/w;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lq/w;->a:I

    iput-object p1, p0, Lq/w;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/Float;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    sget-object v2, Lq8/l;->a:Lq8/l;

    iget v3, v0, Lq/w;->a:I

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v6, 0x0

    iget-object v7, v0, Lq/w;->b:Ljava/lang/Object;

    const/4 v8, 0x1

    sparse-switch v3, :sswitch_data_0

    check-cast v7, Lf0/a2;

    iget-object v2, v7, Lf0/a2;->a:Lm0/k1;

    invoke-virtual {v2}, Lm0/s2;->d()F

    move-result v2

    add-float/2addr v2, v1

    iget-object v3, v7, Lf0/a2;->b:Lm0/k1;

    invoke-virtual {v3}, Lm0/s2;->d()F

    move-result v4

    cmpl-float v4, v2, v4

    iget-object v5, v7, Lf0/a2;->a:Lm0/k1;

    if-lez v4, :cond_0

    invoke-virtual {v3}, Lm0/s2;->d()F

    move-result v1

    invoke-virtual {v5}, Lm0/s2;->d()F

    move-result v2

    sub-float/2addr v1, v2

    goto :goto_0

    :cond_0
    cmpg-float v2, v2, v6

    if-gez v2, :cond_1

    invoke-virtual {v5}, Lm0/s2;->d()F

    move-result v1

    neg-float v1, v1

    :cond_1
    :goto_0
    invoke-virtual {v5}, Lm0/s2;->d()F

    move-result v2

    add-float/2addr v2, v1

    invoke-virtual {v5, v2}, Lm0/s2;->f(F)V

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    return-object v1

    :sswitch_0
    check-cast v7, Lb0/h0;

    iget-object v3, v7, Lb0/h0;->e:Lb0/a0;

    iget-object v9, v3, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v9}, Lm0/u2;->d()I

    move-result v9

    int-to-float v9, v9

    iget-object v10, v3, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v10}, Lm0/s2;->d()F

    move-result v11

    add-float/2addr v11, v9

    iget-object v3, v3, Lb0/a0;->a:Lb0/h0;

    invoke-virtual {v3}, Lb0/h0;->m()I

    move-result v9

    int-to-float v9, v9

    mul-float/2addr v11, v9

    invoke-static {v11}, Ld7/t;->p0(F)I

    move-result v9

    int-to-float v9, v9

    add-float v11, v9, v1

    iget v12, v7, Lb0/h0;->i:F

    add-float/2addr v11, v12

    iget v12, v7, Lb0/h0;->h:I

    int-to-float v12, v12

    invoke-static {v11, v6, v12}, Lz6/a;->q(FFF)F

    move-result v12

    cmpg-float v11, v11, v12

    if-nez v11, :cond_2

    move v11, v8

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    :goto_1
    xor-int/2addr v11, v8

    sub-float/2addr v12, v9

    iput v12, v7, Lb0/h0;->j:F

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v9

    cmpg-float v9, v9, v6

    if-nez v9, :cond_3

    goto :goto_3

    :cond_3
    cmpl-float v9, v12, v6

    if-lez v9, :cond_4

    move v9, v8

    goto :goto_2

    :cond_4
    const/4 v9, 0x0

    :goto_2
    iget-object v13, v7, Lb0/h0;->d:Lm0/n1;

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v13, v9}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :goto_3
    invoke-static {v12}, Ld7/t;->p0(F)I

    move-result v9

    iget-object v13, v7, Lb0/h0;->p:Lm0/n1;

    invoke-virtual {v13}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lb0/x;

    neg-int v14, v9

    iget v15, v13, Lb0/x;->b:I

    iget v5, v13, Lb0/x;->c:I

    add-int/2addr v15, v5

    iget-boolean v5, v13, Lb0/x;->n:Z

    if-nez v5, :cond_e

    iget-object v5, v13, Lb0/x;->a:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_e

    iget-object v6, v13, Lb0/x;->i:Lb0/g;

    if-eqz v6, :cond_e

    iget v6, v13, Lb0/x;->l:I

    sub-int/2addr v6, v14

    if-ltz v6, :cond_e

    if-ge v6, v15, :cond_e

    if-eqz v15, :cond_5

    int-to-float v6, v14

    int-to-float v8, v15

    div-float/2addr v6, v8

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    :goto_4
    iget v8, v13, Lb0/x;->k:F

    sub-float/2addr v8, v6

    iget-object v0, v13, Lb0/x;->j:Lb0/g;

    if-eqz v0, :cond_e

    cmpl-float v0, v8, v4

    if-gez v0, :cond_e

    const/high16 v0, -0x41000000    # -0.5f

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_6

    goto/16 :goto_a

    :cond_6
    invoke-static {v5}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/g;

    invoke-static {v5}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb0/g;

    iget v8, v13, Lb0/x;->g:I

    iget v1, v13, Lb0/x;->f:I

    if-gez v14, :cond_7

    iget v0, v0, Lb0/g;->m:I

    add-int/2addr v0, v15

    sub-int/2addr v0, v1

    iget v1, v4, Lb0/g;->m:I

    add-int/2addr v1, v15

    sub-int/2addr v1, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    neg-int v1, v14

    if-le v0, v1, :cond_e

    goto :goto_5

    :cond_7
    iget v0, v0, Lb0/g;->m:I

    sub-int/2addr v1, v0

    iget v0, v4, Lb0/g;->m:I

    sub-int/2addr v8, v0

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-le v0, v14, :cond_e

    :goto_5
    iget v0, v13, Lb0/x;->k:F

    sub-float/2addr v0, v6

    iput v0, v13, Lb0/x;->k:F

    iget v0, v13, Lb0/x;->l:I

    sub-int/2addr v0, v14

    iput v0, v13, Lb0/x;->l:I

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v0, :cond_c

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb0/g;

    iget v4, v3, Lb0/g;->m:I

    add-int/2addr v4, v14

    iput v4, v3, Lb0/g;->m:I

    iget-object v4, v3, Lb0/g;->l:[I

    array-length v6, v4

    const/4 v8, 0x0

    :goto_7
    if-ge v8, v6, :cond_b

    iget-boolean v10, v3, Lb0/g;->j:Z

    if-eqz v10, :cond_8

    rem-int/lit8 v15, v8, 0x2

    move/from16 v16, v0

    const/4 v0, 0x1

    if-eq v15, v0, :cond_9

    goto :goto_8

    :cond_8
    move/from16 v16, v0

    :goto_8
    if-nez v10, :cond_a

    rem-int/lit8 v0, v8, 0x2

    if-nez v0, :cond_a

    :cond_9
    aget v0, v4, v8

    add-int/2addr v0, v14

    aput v0, v4, v8

    :cond_a
    add-int/lit8 v8, v8, 0x1

    move/from16 v0, v16

    goto :goto_7

    :cond_b
    move/from16 v16, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_c
    iget-boolean v0, v13, Lb0/x;->m:Z

    if-nez v0, :cond_d

    if-lez v14, :cond_d

    const/4 v0, 0x1

    iput-boolean v0, v13, Lb0/x;->m:Z

    goto :goto_9

    :cond_d
    const/4 v0, 0x1

    :goto_9
    invoke-virtual {v7, v13, v0}, Lb0/h0;->h(Lb0/x;Z)V

    iget-object v0, v7, Lb0/h0;->B:Lm0/g1;

    invoke-interface {v0, v2}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    goto :goto_c

    :cond_e
    :goto_a
    invoke-virtual {v3}, Lb0/h0;->m()I

    move-result v0

    if-nez v0, :cond_f

    const/4 v6, 0x0

    goto :goto_b

    :cond_f
    int-to-float v0, v9

    invoke-virtual {v3}, Lb0/h0;->m()I

    move-result v1

    int-to-float v1, v1

    div-float v6, v0, v1

    :goto_b
    invoke-virtual {v10}, Lm0/s2;->d()F

    move-result v0

    add-float/2addr v0, v6

    invoke-virtual {v10, v0}, Lm0/s2;->f(F)V

    iget-object v0, v7, Lb0/h0;->x:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/a1;

    if-eqz v0, :cond_10

    check-cast v0, Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->j()V

    :cond_10
    :goto_c
    int-to-float v0, v9

    sub-float v0, v12, v0

    iput v0, v7, Lb0/h0;->i:F

    if-eqz v11, :cond_11

    goto :goto_d

    :cond_11
    move/from16 v12, p1

    :goto_d
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :sswitch_1
    check-cast v7, Lz/g0;

    move/from16 v0, p1

    neg-float v0, v0

    const/4 v1, 0x0

    cmpg-float v3, v0, v1

    if-gez v3, :cond_12

    invoke-virtual {v7}, Lz/g0;->d()Z

    move-result v3

    if-eqz v3, :cond_13

    :cond_12
    cmpl-float v3, v0, v1

    if-lez v3, :cond_14

    invoke-virtual {v7}, Lz/g0;->a()Z

    move-result v1

    if-nez v1, :cond_14

    :cond_13
    const/4 v6, 0x0

    goto/16 :goto_10

    :cond_14
    iget v1, v7, Lz/g0;->f:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v4

    if-gtz v1, :cond_1a

    iget v1, v7, Lz/g0;->f:F

    add-float/2addr v1, v0

    iput v1, v7, Lz/g0;->f:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v4

    if-lez v1, :cond_18

    iget-object v1, v7, Lz/g0;->d:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz/w;

    iget v5, v7, Lz/g0;->f:F

    invoke-static {v5}, Ld7/t;->p0(F)I

    move-result v6

    iget-object v8, v7, Lz/g0;->b:Lz/w;

    iget-boolean v9, v7, Lz/g0;->a:Z

    const/4 v10, 0x1

    xor-int/2addr v9, v10

    invoke-virtual {v3, v6, v9}, Lz/w;->c(IZ)Z

    move-result v9

    if-eqz v9, :cond_15

    if-eqz v8, :cond_15

    invoke-virtual {v8, v6, v10}, Lz/w;->c(IZ)Z

    move-result v9

    :cond_15
    if-eqz v9, :cond_16

    iget-boolean v1, v7, Lz/g0;->a:Z

    invoke-virtual {v7, v3, v1, v10}, Lz/g0;->f(Lz/w;ZZ)V

    iget-object v1, v7, Lz/g0;->v:Lm0/g1;

    invoke-interface {v1, v2}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    iget v1, v7, Lz/g0;->f:F

    sub-float/2addr v5, v1

    invoke-virtual {v7, v5, v3}, Lz/g0;->g(FLz/u;)V

    goto :goto_e

    :cond_16
    iget-object v2, v7, Lz/g0;->m:Lr1/a1;

    if-eqz v2, :cond_17

    check-cast v2, Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->j()V

    :cond_17
    iget v2, v7, Lz/g0;->f:F

    sub-float/2addr v5, v2

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/u;

    invoke-virtual {v7, v5, v1}, Lz/g0;->g(FLz/u;)V

    :cond_18
    :goto_e
    iget v1, v7, Lz/g0;->f:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v4

    if-gtz v1, :cond_19

    :goto_f
    move v6, v0

    goto :goto_10

    :cond_19
    iget v1, v7, Lz/g0;->f:F

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    iput v1, v7, Lz/g0;->f:F

    goto :goto_f

    :goto_10
    neg-float v0, v6

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :cond_1a
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "entered drag with non-zero pending scroll: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v7, Lz/g0;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_2
    move v0, v1

    check-cast v7, Lu/p2;

    iget-object v1, v7, Lu/p2;->a:Lm0/l1;

    invoke-virtual {v1}, Lm0/u2;->d()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v1, v0

    iget v2, v7, Lu/p2;->e:F

    add-float/2addr v1, v2

    iget-object v2, v7, Lu/p2;->d:Lm0/l1;

    invoke-virtual {v2}, Lm0/u2;->d()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lz6/a;->q(FFF)F

    move-result v2

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1b

    const/4 v1, 0x1

    const/4 v5, 0x1

    goto :goto_11

    :cond_1b
    const/4 v1, 0x1

    const/4 v5, 0x0

    :goto_11
    xor-int/2addr v1, v5

    iget-object v3, v7, Lu/p2;->a:Lm0/l1;

    invoke-virtual {v3}, Lm0/u2;->d()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v2, v4

    invoke-static {v2}, Ld7/t;->p0(F)I

    move-result v4

    invoke-virtual {v3}, Lm0/u2;->d()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v3, v5}, Lm0/u2;->f(I)V

    int-to-float v3, v4

    sub-float v3, v2, v3

    iput v3, v7, Lu/p2;->e:F

    if-eqz v1, :cond_1c

    move v0, v2

    :cond_1c
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0xe -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(Lm0/o0;)Lm0/n0;
    .locals 2

    iget p1, p0, Lq/w;->a:I

    iget-object v0, p0, Lq/w;->b:Ljava/lang/Object;

    sparse-switch p1, :sswitch_data_0

    check-cast v0, La0/z;

    new-instance p1, Lb/c;

    const/4 v1, 0x4

    invoke-direct {p1, v0, v1}, Lb/c;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :sswitch_0
    check-cast v0, La0/p;

    new-instance p1, Lb/c;

    const/4 v1, 0x3

    invoke-direct {p1, v0, v1}, Lb/c;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :sswitch_1
    check-cast v0, Lt/u1;

    new-instance p1, Lb/c;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, Lb/c;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, Lq/w;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq/w;->b:Ljava/lang/Object;

    check-cast v0, Lw0/a0;

    iget-boolean v1, v0, Lw0/a0;->h:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Lw0/a0;->f:Lo0/i;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lw0/a0;->i:Lw0/z;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v2, v0, Lw0/z;->b:Ljava/lang/Object;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v3, v0, Lw0/z;->d:I

    iget-object v4, v0, Lw0/z;->c:Lq/r;

    if-nez v4, :cond_0

    new-instance v4, Lq/r;

    invoke-direct {v4}, Lq/r;-><init>()V

    iput-object v4, v0, Lw0/z;->c:Lq/r;

    iget-object v5, v0, Lw0/z;->f:Lq/s;

    invoke-virtual {v5, v2, v4}, Lq/s;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0, p1, v3, v2, v4}, Lw0/z;->c(Ljava/lang/Object;ILjava/lang/Object;Lq/r;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lw0/h0;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lw0/h0;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lw0/h0;->c(I)V

    :cond_2
    iget-object v0, p0, Lq/w;->b:Ljava/lang/Object;

    check-cast v0, Lq/t;

    invoke-virtual {v0, p1}, Lq/t;->c(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lq/w;->b:Ljava/lang/Object;

    check-cast v0, Lm0/e0;

    check-cast v0, Lm0/x;

    invoke-virtual {v0, p1}, Lm0/x;->d(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Throwable;)V
    .locals 6

    iget v0, p0, Lq/w;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Recomposer effect job completed"

    invoke-static {v0, p1}, Ld7/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    iget-object v1, p0, Lq/w;->b:Ljava/lang/Object;

    check-cast v1, Lm0/g2;

    iget-object v2, v1, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, v1, Lm0/g2;->c:Lm9/f1;

    if-eqz v3, :cond_0

    iget-object v4, v1, Lm0/g2;->r:Lp9/q0;

    sget-object v5, Lm0/a2;->b:Lm0/a2;

    invoke-virtual {v4, v5}, Lp9/q0;->i(Ljava/lang/Object;)V

    invoke-interface {v3, v0}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lm0/g2;->o:Lm9/k;

    new-instance v0, Lu/s;

    const/16 v4, 0x11

    invoke-direct {v0, v4, v1, p1}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    check-cast v3, Lm9/p1;

    const/4 p1, 0x0

    const/4 v1, 0x1

    invoke-virtual {v3, p1, v1, v0}, Lm9/p1;->U(ZZLc9/c;)Lm9/o0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iput-object v0, v1, Lm0/g2;->d:Ljava/lang/Throwable;

    iget-object p1, v1, Lm0/g2;->r:Lp9/q0;

    sget-object v0, Lm0/a2;->a:Lm0/a2;

    invoke-virtual {p1, v0}, Lp9/q0;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v2

    return-void

    :goto_1
    monitor-exit v2

    throw p1

    :pswitch_0
    sget-object p1, Lm0/h0;->a:Landroid/view/Choreographer;

    iget-object v0, p0, Lq/w;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/Choreographer$FrameCallback;

    invoke-virtual {p1, v0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lo1/u;)V
    .locals 4

    iget v0, p0, Lq/w;->a:I

    iget-object v1, p0, Lq/w;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lh0/l;

    iget-wide v2, p1, Lo1/u;->c:J

    invoke-interface {v1, v2, v3}, Lh0/l;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo1/u;->a()V

    :cond_0
    return-void

    :pswitch_0
    check-cast v1, Lc9/e;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lm9/e0;->I(Lo1/u;Z)J

    move-result-wide v2

    new-instance v0, Ld1/c;

    invoke-direct {v0, v2, v3}, Ld1/c;-><init>(J)V

    invoke-interface {v1, p1, v0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lo1/u;->a()V

    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lr1/s;)V
    .locals 2

    iget v0, p0, Lq/w;->a:I

    iget-object v1, p0, Lq/w;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lv/e2;

    iget-object v0, v1, Lv/e2;->H:Lv/s;

    iput-object p1, v0, Lv/s;->A:Lr1/s;

    return-void

    :pswitch_0
    check-cast v1, Lu/x0;

    iget-boolean v0, v1, Ly0/n;->t:Z

    if-eqz v0, :cond_1

    iget-object v0, v1, Lu/x0;->u:Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, v1, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    sget-object v0, Lu/v0;->a:Ls1/i;

    invoke-interface {v1, v0}, Ls1/f;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc9/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x0

    iget v4, v0, Lq/w;->a:I

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    iget-object v7, v0, Lq/w;->b:Ljava/lang/Object;

    packed-switch v4, :pswitch_data_0

    :pswitch_0
    check-cast v1, Le1/w;

    check-cast v7, Le1/m0;

    iget v4, v7, Le1/m0;->u:F

    check-cast v1, Le1/i0;

    invoke-virtual {v1, v4}, Le1/i0;->b(F)V

    iget v4, v7, Le1/m0;->v:F

    invoke-virtual {v1, v4}, Le1/i0;->d(F)V

    iget v4, v7, Le1/m0;->w:F

    invoke-virtual {v1, v4}, Le1/i0;->a(F)V

    iget v4, v7, Le1/m0;->x:F

    iget v5, v1, Le1/i0;->e:F

    cmpg-float v5, v5, v4

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    iget v5, v1, Le1/i0;->a:I

    or-int/lit8 v5, v5, 0x8

    iput v5, v1, Le1/i0;->a:I

    iput v4, v1, Le1/i0;->e:F

    :goto_0
    iget v4, v7, Le1/m0;->y:F

    iget v5, v1, Le1/i0;->f:F

    cmpg-float v5, v5, v4

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    iget v5, v1, Le1/i0;->a:I

    or-int/lit8 v5, v5, 0x10

    iput v5, v1, Le1/i0;->a:I

    iput v4, v1, Le1/i0;->f:F

    :goto_1
    iget v4, v7, Le1/m0;->z:F

    iget v5, v1, Le1/i0;->n:F

    cmpg-float v5, v5, v4

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    iget v5, v1, Le1/i0;->a:I

    or-int/lit8 v5, v5, 0x20

    iput v5, v1, Le1/i0;->a:I

    iput v4, v1, Le1/i0;->n:F

    :goto_2
    iget v4, v7, Le1/m0;->A:F

    iget v5, v1, Le1/i0;->q:F

    cmpg-float v5, v5, v4

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    iget v5, v1, Le1/i0;->a:I

    or-int/lit16 v5, v5, 0x100

    iput v5, v1, Le1/i0;->a:I

    iput v4, v1, Le1/i0;->q:F

    :goto_3
    iget v4, v7, Le1/m0;->B:F

    iget v5, v1, Le1/i0;->r:F

    cmpg-float v5, v5, v4

    if-nez v5, :cond_4

    goto :goto_4

    :cond_4
    iget v5, v1, Le1/i0;->a:I

    or-int/lit16 v5, v5, 0x200

    iput v5, v1, Le1/i0;->a:I

    iput v4, v1, Le1/i0;->r:F

    :goto_4
    iget v4, v7, Le1/m0;->C:F

    iget v5, v1, Le1/i0;->s:F

    cmpg-float v5, v5, v4

    if-nez v5, :cond_5

    goto :goto_5

    :cond_5
    iget v5, v1, Le1/i0;->a:I

    or-int/lit16 v5, v5, 0x400

    iput v5, v1, Le1/i0;->a:I

    iput v4, v1, Le1/i0;->s:F

    :goto_5
    iget v4, v7, Le1/m0;->D:F

    iget v5, v1, Le1/i0;->t:F

    cmpg-float v5, v5, v4

    if-nez v5, :cond_6

    goto :goto_6

    :cond_6
    iget v5, v1, Le1/i0;->a:I

    or-int/lit16 v5, v5, 0x800

    iput v5, v1, Le1/i0;->a:I

    iput v4, v1, Le1/i0;->t:F

    :goto_6
    iget-wide v4, v7, Le1/m0;->E:J

    invoke-virtual {v1, v4, v5}, Le1/i0;->f(J)V

    iget-object v4, v7, Le1/m0;->F:Le1/l0;

    iget-object v5, v1, Le1/i0;->v:Le1/l0;

    invoke-static {v5, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    iget v5, v1, Le1/i0;->a:I

    or-int/lit16 v5, v5, 0x2000

    iput v5, v1, Le1/i0;->a:I

    iput-object v4, v1, Le1/i0;->v:Le1/l0;

    :cond_7
    iget-boolean v4, v7, Le1/m0;->G:Z

    iget-boolean v5, v1, Le1/i0;->w:Z

    if-eq v5, v4, :cond_8

    iget v5, v1, Le1/i0;->a:I

    or-int/lit16 v5, v5, 0x4000

    iput v5, v1, Le1/i0;->a:I

    iput-boolean v4, v1, Le1/i0;->w:Z

    :cond_8
    invoke-static {v3, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    iget v3, v1, Le1/i0;->a:I

    const/high16 v4, 0x20000

    or-int/2addr v3, v4

    iput v3, v1, Le1/i0;->a:I

    :cond_9
    iget-wide v3, v7, Le1/m0;->H:J

    iget-wide v5, v1, Le1/i0;->o:J

    invoke-static {v5, v6, v3, v4}, Le1/r;->c(JJ)Z

    move-result v5

    if-nez v5, :cond_a

    iget v5, v1, Le1/i0;->a:I

    or-int/lit8 v5, v5, 0x40

    iput v5, v1, Le1/i0;->a:I

    iput-wide v3, v1, Le1/i0;->o:J

    :cond_a
    iget-wide v3, v7, Le1/m0;->I:J

    iget-wide v5, v1, Le1/i0;->p:J

    invoke-static {v5, v6, v3, v4}, Le1/r;->c(JJ)Z

    move-result v5

    if-nez v5, :cond_b

    iget v5, v1, Le1/i0;->a:I

    or-int/lit16 v5, v5, 0x80

    iput v5, v1, Le1/i0;->a:I

    iput-wide v3, v1, Le1/i0;->p:J

    :cond_b
    iget v3, v7, Le1/m0;->J:I

    iget v4, v1, Le1/i0;->x:I

    invoke-static {v4, v3}, Le1/g0;->c(II)Z

    move-result v4

    if-nez v4, :cond_c

    iget v4, v1, Le1/i0;->a:I

    const v5, 0x8000

    or-int/2addr v4, v5

    iput v4, v1, Le1/i0;->a:I

    iput v3, v1, Le1/i0;->x:I

    :cond_c
    return-object v2

    :pswitch_1
    check-cast v1, La1/e;

    check-cast v7, La1/a;

    invoke-virtual {v1, v7}, La1/e;->I0(La1/a;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :pswitch_2
    invoke-virtual/range {p0 .. p1}, Lq/w;->d(Ljava/lang/Object;)V

    return-object v2

    :pswitch_3
    invoke-virtual/range {p0 .. p1}, Lq/w;->d(Ljava/lang/Object;)V

    return-object v2

    :pswitch_4
    invoke-virtual/range {p0 .. p1}, Lq/w;->d(Ljava/lang/Object;)V

    return-object v2

    :pswitch_5
    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lq/w;->f(Ljava/lang/Throwable;)V

    return-object v2

    :pswitch_6
    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lq/w;->f(Ljava/lang/Throwable;)V

    return-object v2

    :pswitch_7
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Lq/w;->a(F)Ljava/lang/Float;

    move-result-object v1

    return-object v1

    :pswitch_8
    check-cast v1, Le1/a0;

    iget-object v1, v1, Le1/a0;->a:[F

    check-cast v7, Lr1/s;

    invoke-static {v7}, Landroidx/compose/ui/layout/a;->d(Lr1/s;)Lr1/s;

    move-result-object v3

    invoke-interface {v3, v7, v1}, Lr1/s;->x(Lr1/s;[F)V

    return-object v2

    :pswitch_9
    check-cast v1, Ly1/v;

    check-cast v7, Lz1/a;

    sget-object v3, Ly1/t;->a:[Lj9/f;

    sget-object v3, Ly1/r;->B:Ly1/u;

    sget-object v4, Ly1/t;->a:[Lj9/f;

    const/16 v5, 0x14

    aget-object v4, v4, v5

    invoke-virtual {v3, v1, v7}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    return-object v2

    :pswitch_a
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    check-cast v7, Lb0/q0;

    iget-object v3, v7, Lb0/q0;->b:Lb0/h0;

    iget-object v3, v3, Lb0/h0;->b:Lm0/k1;

    invoke-virtual {v3, v1}, Lm0/s2;->f(F)V

    return-object v2

    :pswitch_b
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Lq/w;->a(F)Ljava/lang/Float;

    move-result-object v1

    return-object v1

    :pswitch_c
    check-cast v1, Lm0/o0;

    invoke-virtual {v0, v1}, Lq/w;->b(Lm0/o0;)Lm0/n0;

    move-result-object v1

    return-object v1

    :pswitch_d
    check-cast v1, Lm0/o0;

    invoke-virtual {v0, v1}, Lq/w;->b(Lm0/o0;)Lm0/n0;

    move-result-object v1

    return-object v1

    :pswitch_e
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Lq/w;->a(F)Ljava/lang/Float;

    move-result-object v1

    return-object v1

    :pswitch_f
    invoke-static/range {p1 .. p1}, La7/a;->w(Ljava/lang/Object;)V

    packed-switch v4, :pswitch_data_1

    throw v3

    :pswitch_10
    throw v3

    :pswitch_11
    check-cast v1, Lr1/s;

    invoke-virtual {v0, v1}, Lq/w;->i(Lr1/s;)V

    return-object v2

    :pswitch_12
    check-cast v1, Lo1/u;

    invoke-virtual {v0, v1}, Lq/w;->h(Lo1/u;)V

    return-object v2

    :pswitch_13
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Lq/w;->a(F)Ljava/lang/Float;

    move-result-object v1

    return-object v1

    :pswitch_14
    check-cast v1, Lr1/s;

    invoke-virtual {v0, v1}, Lq/w;->i(Lr1/s;)V

    return-object v2

    :pswitch_15
    check-cast v1, Ld1/c;

    iget-wide v3, v1, Ld1/c;->a:J

    check-cast v7, Lu/e0;

    iget-boolean v1, v7, Lu/e;->w:Z

    if-eqz v1, :cond_d

    iget-object v1, v7, Lu/e;->y:Lc9/a;

    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_d
    return-object v2

    :pswitch_16
    check-cast v1, Lb1/d;

    check-cast v7, Lu/v;

    iget v2, v7, Lu/v;->x:F

    invoke-virtual {v1}, Lb1/d;->c()F

    move-result v3

    mul-float/2addr v3, v2

    cmpl-float v2, v3, v6

    if-ltz v2, :cond_19

    iget-object v2, v1, Lb1/d;->a:Lb1/a;

    invoke-interface {v2}, Lb1/a;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ld1/f;->c(J)F

    move-result v2

    cmpl-float v2, v2, v6

    if-lez v2, :cond_19

    iget v2, v7, Lu/v;->x:F

    invoke-static {v2, v6}, Lm2/e;->a(FF)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget v2, v7, Lu/v;->x:F

    invoke-virtual {v1}, Lb1/d;->c()F

    move-result v3

    mul-float/2addr v3, v2

    float-to-double v2, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v5, v2

    :goto_7
    iget-object v2, v1, Lb1/d;->a:Lb1/a;

    invoke-interface {v2}, Lb1/a;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ld1/f;->c(J)F

    move-result v2

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v8, v2

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-float v2, v8

    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    div-float v4, v2, v3

    invoke-static {v4, v4}, Ld9/i;->f(FF)J

    move-result-wide v15

    iget-object v5, v1, Lb1/d;->a:Lb1/a;

    invoke-interface {v5}, Lb1/a;->e()J

    move-result-wide v5

    invoke-static {v5, v6}, Ld1/f;->d(J)F

    move-result v5

    sub-float/2addr v5, v2

    iget-object v6, v1, Lb1/d;->a:Lb1/a;

    invoke-interface {v6}, Lb1/a;->e()J

    move-result-wide v8

    invoke-static {v8, v9}, Ld1/f;->b(J)F

    move-result v6

    sub-float/2addr v6, v2

    invoke-static {v5, v6}, Ld7/t;->j(FF)J

    move-result-wide v17

    mul-float/2addr v3, v2

    iget-object v5, v1, Lb1/d;->a:Lb1/a;

    invoke-interface {v5}, Lb1/a;->e()J

    move-result-wide v5

    invoke-static {v5, v6}, Ld1/f;->c(J)F

    move-result v5

    cmpl-float v3, v3, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lez v3, :cond_f

    move v3, v6

    goto :goto_8

    :cond_f
    move v3, v5

    :goto_8
    iget-object v8, v7, Lu/v;->z:Le1/l0;

    iget-object v9, v1, Lb1/d;->a:Lb1/a;

    invoke-interface {v9}, Lb1/a;->e()J

    move-result-wide v9

    iget-object v11, v1, Lb1/d;->a:Lb1/a;

    invoke-interface {v11}, Lb1/a;->getLayoutDirection()Lm2/l;

    move-result-object v11

    invoke-interface {v8, v9, v10, v11, v1}, Le1/l0;->d(JLm2/l;Lm2/b;)Le1/g0;

    move-result-object v8

    instance-of v9, v8, Le1/c0;

    if-eqz v9, :cond_14

    iget-object v14, v7, Lu/v;->y:Le1/n;

    check-cast v8, Le1/c0;

    iget-object v9, v8, Le1/c0;->e:Ld1/e;

    invoke-static {v9}, Lf6/a;->Z(Ld1/e;)Z

    move-result v9

    iget-object v8, v8, Le1/c0;->e:Ld1/e;

    if-eqz v9, :cond_10

    iget-wide v5, v8, Ld1/e;->e:J

    new-instance v19, Lg1/k;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x1e

    move-object/from16 v8, v19

    move v9, v2

    invoke-direct/range {v8 .. v13}, Lg1/k;-><init>(FFIII)V

    new-instance v7, Lu/u;

    move-object v8, v7

    move v9, v3

    move-object v10, v14

    move-wide v11, v5

    move v13, v4

    move v14, v2

    invoke-direct/range {v8 .. v19}, Lu/u;-><init>(ZLe1/n;JFFJJLg1/k;)V

    invoke-virtual {v1, v7}, Lb1/d;->a(Lc9/c;)Lb1/g;

    move-result-object v1

    goto/16 :goto_b

    :cond_10
    iget-object v4, v7, Lu/v;->w:Lu/q;

    if-nez v4, :cond_11

    new-instance v4, Lu/q;

    invoke-direct {v4}, Lu/q;-><init>()V

    iput-object v4, v7, Lu/v;->w:Lu/q;

    :cond_11
    iget-object v4, v7, Lu/v;->w:Lu/q;

    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v7, v4, Lu/q;->d:Le1/d0;

    if-nez v7, :cond_12

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v7

    iput-object v7, v4, Lu/q;->d:Le1/d0;

    :cond_12
    check-cast v7, Le1/i;

    iget-object v4, v7, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v7, v8}, Le1/i;->a(Ld1/e;)V

    if-nez v3, :cond_13

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v3

    invoke-virtual {v8}, Ld1/e;->b()F

    move-result v4

    sub-float v11, v4, v2

    invoke-virtual {v8}, Ld1/e;->a()F

    move-result v4

    sub-float v12, v4, v2

    iget-wide v9, v8, Ld1/e;->e:J

    invoke-static {v2, v9, v10}, Landroidx/compose/foundation/a;->m(FJ)J

    move-result-wide v15

    iget-wide v9, v8, Ld1/e;->f:J

    invoke-static {v2, v9, v10}, Landroidx/compose/foundation/a;->m(FJ)J

    move-result-wide v17

    iget-wide v9, v8, Ld1/e;->h:J

    invoke-static {v2, v9, v10}, Landroidx/compose/foundation/a;->m(FJ)J

    move-result-wide v19

    iget-wide v8, v8, Ld1/e;->g:J

    invoke-static {v2, v8, v9}, Landroidx/compose/foundation/a;->m(FJ)J

    move-result-wide v21

    new-instance v4, Ld1/e;

    move-object v8, v4

    move v9, v2

    move v10, v2

    move-object v2, v14

    move-wide v13, v15

    move-wide/from16 v15, v17

    move-wide/from16 v17, v21

    invoke-direct/range {v8 .. v20}, Ld1/e;-><init>(FFFFJJJJ)V

    invoke-virtual {v3, v4}, Le1/i;->a(Ld1/e;)V

    invoke-virtual {v7, v7, v3, v5}, Le1/i;->b(Le1/d0;Le1/d0;I)Z

    goto :goto_9

    :cond_13
    move-object v2, v14

    :goto_9
    new-instance v3, Lu/s;

    invoke-direct {v3, v6, v7, v2}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Lb1/d;->a(Lc9/c;)Lb1/g;

    move-result-object v1

    goto :goto_b

    :cond_14
    instance-of v4, v8, Le1/b0;

    if-eqz v4, :cond_18

    iget-object v4, v7, Lu/v;->y:Le1/n;

    if-eqz v3, :cond_15

    sget-wide v15, Ld1/c;->b:J

    :cond_15
    move-wide/from16 v21, v15

    if-eqz v3, :cond_16

    iget-object v5, v1, Lb1/d;->a:Lb1/a;

    invoke-interface {v5}, Lb1/a;->e()J

    move-result-wide v17

    :cond_16
    move-wide/from16 v23, v17

    if-eqz v3, :cond_17

    sget-object v2, Lg1/j;->a:Lg1/j;

    move-object/from16 v25, v2

    goto :goto_a

    :cond_17
    new-instance v3, Lg1/k;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x1e

    move-object v8, v3

    move v9, v2

    invoke-direct/range {v8 .. v13}, Lg1/k;-><init>(FFIII)V

    move-object/from16 v25, v3

    :goto_a
    new-instance v2, Ls/m0;

    const/16 v26, 0x1

    move-object/from16 v19, v2

    move-object/from16 v20, v4

    invoke-direct/range {v19 .. v26}, Ls/m0;-><init>(Ljava/lang/Object;JJLjava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lb1/d;->a(Lc9/c;)Lb1/g;

    move-result-object v1

    goto :goto_b

    :cond_18
    new-instance v1, Landroidx/fragment/app/a0;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_19
    sget-object v2, Lu/r;->b:Lu/r;

    invoke-virtual {v1, v2}, Lb1/d;->a(Lc9/c;)Lb1/g;

    move-result-object v1

    :goto_b
    return-object v1

    :pswitch_17
    check-cast v1, Lm0/o0;

    invoke-virtual {v0, v1}, Lq/w;->b(Lm0/o0;)Lm0/n0;

    move-result-object v1

    return-object v1

    :pswitch_18
    check-cast v1, Lt/s;

    iget v2, v1, Lt/s;->b:F

    invoke-static {v2, v6, v5}, Lz6/a;->q(FFF)F

    move-result v2

    iget v3, v1, Lt/s;->c:F

    const/high16 v4, -0x41000000    # -0.5f

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-static {v3, v4, v8}, Lz6/a;->q(FFF)F

    move-result v3

    iget v9, v1, Lt/s;->d:F

    invoke-static {v9, v4, v8}, Lz6/a;->q(FFF)F

    move-result v4

    iget v1, v1, Lt/s;->a:F

    invoke-static {v1, v6, v5}, Lz6/a;->q(FFF)F

    move-result v1

    sget-object v5, Lf1/e;->t:Lf1/l;

    invoke-static {v2, v3, v4, v1, v5}, Landroidx/compose/ui/graphics/a;->a(FFFFLf1/d;)J

    move-result-wide v1

    check-cast v7, Lf1/d;

    invoke-static {v1, v2, v7}, Le1/r;->a(JLf1/d;)J

    move-result-wide v1

    new-instance v3, Le1/r;

    invoke-direct {v3, v1, v2}, Le1/r;-><init>(J)V

    return-object v3

    :pswitch_19
    check-cast v7, Ls/w;

    iget-object v2, v7, Ls/w;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/l3;

    if-eqz v1, :cond_1a

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/k;

    iget-wide v1, v1, Lm2/k;->a:J

    goto :goto_c

    :cond_1a
    const-wide/16 v1, 0x0

    :goto_c
    new-instance v3, Lm2/k;

    invoke-direct {v3, v1, v2}, Lm2/k;-><init>(J)V

    return-object v3

    :pswitch_1a
    invoke-static {v1, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_1b
    check-cast v7, Lq/x;

    if-ne v1, v7, :cond_1b

    const-string v1, "(this)"

    goto :goto_d

    :cond_1b
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_d
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xc
        :pswitch_10
    .end packed-switch
.end method
