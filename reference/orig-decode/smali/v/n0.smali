.class public final Lv/n0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lv/n0;->a:I

    iput-object p2, p0, Lv/n0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lv/n0;->c:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v7, p1

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ly0/l;->b:Ly0/l;

    iget v5, v0, Lv/n0;->a:I

    const v6, 0x7ab4aae9

    const v8, -0x4ee9b9da

    const/4 v9, 0x0

    const/4 v10, 0x1

    iget-object v11, v0, Lv/n0;->c:Ljava/lang/Object;

    iget-object v12, v0, Lv/n0;->b:Ljava/lang/Object;

    const/4 v13, 0x2

    packed-switch v5, :pswitch_data_0

    :pswitch_0
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v13, :cond_1

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v1, Lo2/c;

    check-cast v12, Lm0/l3;

    const/4 v3, 0x5

    invoke-direct {v1, v12, v3}, Lo2/c;-><init>(Lm0/l3;I)V

    const v3, -0xd2d4c8

    invoke-static {v7, v3, v1}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v1

    const/4 v3, 0x0

    new-instance v4, Ld5/b1;

    check-cast v11, Lc9/a;

    invoke-direct {v4, v11, v2}, Ld5/b1;-><init>(Lc9/a;I)V

    const v2, 0x5e7e3f3a

    invoke-static {v7, v2, v4}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-wide v8, Le5/a;->g:J

    invoke-static {v8, v9, v7}, Lk0/t0;->j(JLm0/m;)Lk0/d5;

    move-result-object v8

    const/16 v9, 0x186

    const/16 v10, 0x5a

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v8

    move-object/from16 v7, p1

    move v8, v9

    move v9, v10

    invoke-static/range {v1 .. v9}, Lk0/x;->b(Lc9/e;Ly0/o;Lc9/e;Lc9/f;Ly/i1;Lk0/d5;Lm0/m;II)V

    :goto_1
    return-void

    :pswitch_1
    and-int/lit8 v5, p2, 0xb

    if-ne v5, v13, :cond_3

    move-object v5, v7

    check-cast v5, Lm0/q;

    invoke-virtual {v5}, Lm0/q;->G()Z

    move-result v14

    if-nez v14, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lm0/q;->U()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    sget-object v5, Lo2/b;->e:Lo2/b;

    invoke-static {v4, v2, v5}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object v4

    new-instance v5, Lo2/i;

    check-cast v12, Lo2/r;

    invoke-direct {v5, v12, v10}, Lo2/i;-><init>(Lo2/r;I)V

    new-instance v14, Lr1/t0;

    invoke-direct {v14, v5}, Lr1/t0;-><init>(Lc9/c;)V

    invoke-interface {v4, v14}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v4

    invoke-virtual {v12}, Lo2/r;->getCanCalculatePosition()Z

    move-result v5

    if-eqz v5, :cond_4

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    invoke-static {v4, v5}, Landroidx/compose/ui/draw/a;->a(Ly0/o;F)Ly0/o;

    move-result-object v4

    new-instance v5, Lo2/c;

    check-cast v11, Lm0/l3;

    invoke-direct {v5, v11, v13}, Lo2/c;-><init>(Lm0/l3;I)V

    const v11, 0x24266c85

    invoke-static {v7, v11, v5}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v5

    check-cast v7, Lm0/q;

    const v11, 0x53d02508

    invoke-virtual {v7, v11}, Lm0/q;->Z(I)V

    sget-object v11, Lo2/e;->c:Lo2/e;

    invoke-virtual {v7, v8}, Lm0/q;->Z(I)V

    iget v8, v7, Lm0/q;->P:I

    invoke-virtual {v7}, Lm0/q;->p()Lm0/r1;

    move-result-object v12

    sget-object v13, Lt1/l;->k:Lt1/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, Lt1/k;->b:Lt1/j;

    invoke-static {v4}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v4

    iget-object v14, v7, Lm0/q;->a:Lm0/d;

    instance-of v14, v14, Lm0/d;

    if-eqz v14, :cond_8

    invoke-virtual {v7}, Lm0/q;->c0()V

    iget-boolean v9, v7, Lm0/q;->O:Z

    if-eqz v9, :cond_5

    invoke-virtual {v7, v13}, Lm0/q;->o(Lc9/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lm0/q;->o0()V

    :goto_4
    sget-object v9, Lt1/k;->e:Lt1/i;

    invoke-static {v7, v11, v9}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v9, Lt1/k;->d:Lt1/i;

    invoke-static {v7, v12, v9}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v9, Lt1/k;->f:Lt1/i;

    iget-boolean v11, v7, Lm0/q;->O:Z

    if-nez v11, :cond_6

    invoke-virtual {v7}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    :cond_6
    invoke-static {v8, v7, v8, v9}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_7
    invoke-static {v7, v4, v7, v3, v6}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    invoke-virtual {v5, v7, v1}, Lu0/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v2}, Lm0/q;->t(Z)V

    invoke-virtual {v7, v10}, Lm0/q;->t(Z)V

    invoke-virtual {v7, v2}, Lm0/q;->t(Z)V

    invoke-virtual {v7, v2}, Lm0/q;->t(Z)V

    :goto_5
    return-void

    :cond_8
    invoke-static {}, Lm9/e0;->C()V

    throw v9

    :pswitch_2
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v13, :cond_a

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_8

    :cond_a
    :goto_6
    check-cast v12, Lr1/x;

    iget-object v1, v12, Lr1/x;->f:Lm0/g1;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    check-cast v11, Lc9/e;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object v4, v7

    check-cast v4, Lm0/q;

    invoke-virtual {v4, v2}, Lm0/q;->b0(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Lm0/q;->h(Z)Z

    move-result v2

    if-eqz v1, :cond_b

    invoke-interface {v11, v4, v3}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_b
    invoke-virtual {v4, v2}, Lm0/q;->q(Z)V

    :goto_7
    invoke-virtual {v4}, Lm0/q;->y()V

    :goto_8
    return-void

    :pswitch_3
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v13, :cond_c

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v1}, Lm0/q;->U()V

    return-void

    :cond_c
    invoke-static {v12}, La7/a;->w(Ljava/lang/Object;)V

    throw v9

    :pswitch_4
    and-int/lit8 v1, p2, 0x3

    if-ne v1, v13, :cond_e

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_a

    :cond_e
    :goto_9
    check-cast v12, Lc9/f;

    check-cast v11, Ljava/util/List;

    invoke-interface {v12, v11, v7, v3}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_a
    return-void

    :pswitch_5
    and-int/lit8 v1, p2, 0x3

    if-ne v1, v13, :cond_10

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_c

    :cond_10
    :goto_b
    check-cast v12, Lc9/f;

    check-cast v11, Lk0/x2;

    invoke-static {v11}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v12, v11, v7, v3}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_c
    return-void

    :pswitch_6
    and-int/lit8 v1, p2, 0x3

    if-ne v1, v13, :cond_12

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_11

    goto :goto_d

    :cond_11
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_e

    :cond_12
    :goto_d
    check-cast v12, Lk0/e5;

    iget-object v1, v12, Lk0/e5;->j:La2/c0;

    check-cast v11, Lc9/e;

    invoke-static {v1, v11, v7, v2}, Lk0/c5;->a(La2/c0;Lc9/e;Lm0/m;I)V

    :goto_e
    return-void

    :pswitch_7
    and-int/lit8 v5, p2, 0x3

    if-ne v5, v13, :cond_14

    move-object v5, v7

    check-cast v5, Lm0/q;

    invoke-virtual {v5}, Lm0/q;->G()Z

    move-result v13

    if-nez v13, :cond_13

    goto :goto_f

    :cond_13
    invoke-virtual {v5}, Lm0/q;->U()V

    goto :goto_11

    :cond_14
    :goto_f
    sget v5, Lk0/z;->c:F

    sget v13, Lk0/z;->d:F

    invoke-static {v4, v5, v13}, Landroidx/compose/foundation/layout/c;->a(Ly0/o;FF)Ly0/o;

    move-result-object v4

    check-cast v12, Ly/t0;

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/a;->k(Ly0/o;Ly/t0;)Ly0/o;

    move-result-object v4

    sget-object v5, Ly/k;->e:Ly/f;

    sget-object v12, Ly0/a;->n:Ly0/f;

    check-cast v11, Lc9/f;

    check-cast v7, Lm0/q;

    const v13, 0x2952b718

    invoke-virtual {v7, v13}, Lm0/q;->Z(I)V

    invoke-static {v5, v12, v7}, Ly/z0;->a(Ly/g;Ly0/f;Lm0/m;)Lr1/j0;

    move-result-object v5

    invoke-virtual {v7, v8}, Lm0/q;->Z(I)V

    iget v8, v7, Lm0/q;->P:I

    invoke-virtual {v7}, Lm0/q;->p()Lm0/r1;

    move-result-object v12

    sget-object v13, Lt1/l;->k:Lt1/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, Lt1/k;->b:Lt1/j;

    invoke-static {v4}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v4

    iget-object v14, v7, Lm0/q;->a:Lm0/d;

    instance-of v14, v14, Lm0/d;

    if-eqz v14, :cond_18

    invoke-virtual {v7}, Lm0/q;->c0()V

    iget-boolean v9, v7, Lm0/q;->O:Z

    if-eqz v9, :cond_15

    invoke-virtual {v7, v13}, Lm0/q;->o(Lc9/a;)V

    goto :goto_10

    :cond_15
    invoke-virtual {v7}, Lm0/q;->o0()V

    :goto_10
    sget-object v9, Lt1/k;->e:Lt1/i;

    invoke-static {v7, v5, v9}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v5, Lt1/k;->d:Lt1/i;

    invoke-static {v7, v12, v5}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v5, Lt1/k;->f:Lt1/i;

    iget-boolean v9, v7, Lm0/q;->O:Z

    if-nez v9, :cond_16

    invoke-virtual {v7}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_17

    :cond_16
    invoke-static {v8, v7, v8, v5}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_17
    invoke-static {v7, v4, v7, v3, v6}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    sget-object v3, Ly/b1;->a:Ly/b1;

    invoke-interface {v11, v3, v7, v1}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7, v2, v10, v2, v2}, Ll/q;->v(Lm0/q;ZZZZ)V

    :goto_11
    return-void

    :cond_18
    invoke-static {}, Lm9/e0;->C()V

    throw v9

    :pswitch_8
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v13, :cond_1a

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_19

    goto :goto_12

    :cond_19
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_13

    :cond_1a
    :goto_12
    check-cast v12, La0/o0;

    move-object v1, v7

    check-cast v1, Lm0/q;

    const v3, 0xebd1ab

    invoke-virtual {v1, v3}, Lm0/q;->Z(I)V

    new-array v3, v2, [Ljava/lang/Object;

    sget-object v4, Lv0/j;->d:Lv0/p;

    sget-object v5, Lv0/k;->b:Lv0/k;

    const/4 v6, 0x4

    invoke-static {v3, v4, v5, v1, v6}, Lx3/c;->d([Ljava/lang/Object;Lv0/p;Lc9/a;Lm0/m;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv0/j;

    sget-object v4, Lv0/o;->a:Lm0/m3;

    invoke-virtual {v1, v4}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv0/l;

    iput-object v4, v3, Lv0/j;->c:Lv0/l;

    invoke-virtual {v1, v2}, Lm0/q;->t(Z)V

    iget-object v1, v12, La0/o0;->b:Lm0/n1;

    invoke-virtual {v1, v3}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    check-cast v11, Lc9/f;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v11, v12, v7, v1}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_13
    return-void

    :pswitch_9
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v13, :cond_1c

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_1b

    goto :goto_14

    :cond_1b
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_16

    :cond_1c
    :goto_14
    check-cast v12, La0/q;

    iget-object v1, v12, La0/q;->b:Lc9/a;

    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, La0/s;

    check-cast v11, La0/p;

    iget v1, v11, La0/p;->c:I

    invoke-interface {v3}, La0/s;->c()I

    move-result v4

    iget-object v9, v11, La0/p;->a:Ljava/lang/Object;

    const/4 v5, -0x1

    if-ge v1, v4, :cond_1d

    invoke-interface {v3, v1}, La0/s;->a(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    :cond_1d
    invoke-interface {v3, v9}, La0/s;->b(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v5, :cond_1e

    iput v1, v11, La0/p;->c:I

    :cond_1e
    if-eq v1, v5, :cond_1f

    move v2, v10

    :cond_1f
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move-object v10, v7

    check-cast v10, Lm0/q;

    invoke-virtual {v10, v4}, Lm0/q;->b0(Ljava/lang/Object;)V

    invoke-virtual {v10, v2}, Lm0/q;->h(Z)Z

    move-result v4

    if-eqz v2, :cond_20

    iget-object v4, v12, La0/q;->a:Lv0/e;

    iget-object v6, v11, La0/p;->a:Ljava/lang/Object;

    const/4 v8, 0x0

    move v5, v1

    move-object v7, v10

    invoke-static/range {v3 .. v8}, Lf6/a;->k(La0/s;Ljava/lang/Object;ILjava/lang/Object;Lm0/m;I)V

    goto :goto_15

    :cond_20
    invoke-virtual {v10, v4}, Lm0/q;->q(Z)V

    :goto_15
    invoke-virtual {v10}, Lm0/q;->y()V

    new-instance v1, Lq/w;

    const/16 v2, 0xf

    invoke-direct {v1, v11, v2}, Lq/w;-><init>(Ljava/lang/Object;I)V

    invoke-static {v9, v1, v10}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    :goto_16
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lv/n0;->a:I

    iget-object v2, p0, Lv/n0;->c:Ljava/lang/Object;

    iget-object v3, p0, Lv/n0;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_2
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_3
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_4
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_5
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_6
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_7
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_8
    check-cast p1, Lr1/i1;

    check-cast p2, Lm2/a;

    iget-wide v0, p2, Lm2/a;->a:J

    new-instance p2, La0/x;

    check-cast v3, La0/q;

    invoke-direct {p2, v3, p1}, La0/x;-><init>(La0/q;Lr1/i1;)V

    check-cast v2, Lc9/e;

    new-instance p1, Lm2/a;

    invoke-direct {p1, v0, v1}, Lm2/a;-><init>(J)V

    invoke-interface {v2, p2, p1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr1/k0;

    return-object p1

    :pswitch_9
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/n0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_a
    check-cast p1, Lo1/u;

    check-cast p2, Ld1/c;

    iget-wide v4, p2, Ld1/c;->a:J

    check-cast v3, Lp1/d;

    invoke-static {v3, p1}, Lp1/e;->a(Lp1/d;Lo1/u;)V

    invoke-virtual {p1}, Lo1/u;->a()V

    check-cast v2, Ld9/t;

    iput-wide v4, v2, Ld9/t;->a:J

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
