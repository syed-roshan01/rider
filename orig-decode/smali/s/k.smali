.class public final Ls/k;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Ls/k;->a:I

    iput-object p1, p0, Ls/k;->b:Ljava/lang/Object;

    iput-object p2, p0, Ls/k;->c:Ljava/lang/Object;

    iput-object p3, p0, Ls/k;->d:Ljava/lang/Object;

    iput-object p4, p0, Ls/k;->e:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 50

    move-object/from16 v0, p0

    sget-object v1, Lm0/l;->a:Lk0/y0;

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v11, Ly0/l;->b:Ly0/l;

    iget v5, v0, Ls/k;->a:I

    const v15, -0x4ee9b9da

    const/16 v16, 0xe

    iget-object v8, v0, Ls/k;->e:Ljava/lang/Object;

    iget-object v10, v0, Ls/k;->d:Ljava/lang/Object;

    iget-object v6, v0, Ls/k;->c:Ljava/lang/Object;

    iget-object v9, v0, Ls/k;->b:Ljava/lang/Object;

    packed-switch v5, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ly/v;

    move-object/from16 v5, p2

    check-cast v5, Lm0/m;

    move-object/from16 v18, p3

    check-cast v18, Ljava/lang/Number;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    move-result v18

    const-string v7, "$this$Card"

    invoke-static {v1, v7}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v18, 0x51

    const/16 v7, 0x10

    if-ne v1, v7, :cond_1

    move-object v1, v5

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v18

    if-nez v18, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lm0/q;->U()V

    move-object/from16 v49, v2

    goto/16 :goto_16

    :cond_1
    :goto_0
    int-to-float v1, v7

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/a;->l(Ly0/o;F)Ly0/o;

    move-result-object v1

    check-cast v9, Lm0/g1;

    check-cast v6, Lm0/l3;

    check-cast v10, Landroid/content/Context;

    check-cast v8, Lm0/g1;

    move-object v7, v5

    check-cast v7, Lm0/q;

    const v5, -0x1cd0f17e

    invoke-virtual {v7, v5}, Lm0/q;->Z(I)V

    sget-object v5, Ly/k;->c:Ly/e;

    sget-object v12, Ly0/a;->o:Ly0/e;

    invoke-static {v5, v12, v7}, Ly/u;->a(Ly/i;Ly0/e;Lm0/m;)Lr1/j0;

    move-result-object v3

    invoke-virtual {v7, v15}, Lm0/q;->Z(I)V

    iget v13, v7, Lm0/q;->P:I

    invoke-virtual {v7}, Lm0/q;->p()Lm0/r1;

    move-result-object v15

    sget-object v18, Lt1/l;->k:Lt1/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, Lt1/k;->b:Lt1/j;

    invoke-static {v1}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v1

    iget-object v0, v7, Lm0/q;->a:Lm0/d;

    instance-of v0, v0, Lm0/d;

    if-eqz v0, :cond_19

    invoke-virtual {v7}, Lm0/q;->c0()V

    move-object/from16 v49, v2

    iget-boolean v2, v7, Lm0/q;->O:Z

    if-eqz v2, :cond_2

    invoke-virtual {v7, v14}, Lm0/q;->o(Lc9/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v7}, Lm0/q;->o0()V

    :goto_1
    sget-object v2, Lt1/k;->e:Lt1/i;

    invoke-static {v7, v3, v2}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v3, Lt1/k;->d:Lt1/i;

    invoke-static {v7, v15, v3}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v15, Lt1/k;->f:Lt1/i;

    move-object/from16 p2, v8

    iget-boolean v8, v7, Lm0/q;->O:Z

    if-nez v8, :cond_4

    invoke-virtual {v7}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 p3, v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    const v8, 0x7ab4aae9

    goto :goto_4

    :cond_4
    move-object/from16 p3, v10

    :goto_3
    invoke-static {v13, v7, v13, v15}, Ll/q;->r(ILm0/q;ILt1/i;)V

    goto :goto_2

    :goto_4
    invoke-static {v7, v1, v7, v4, v8}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    sget-object v1, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    sget-object v8, Ly/k;->g:Ly/f;

    sget-object v10, Ly0/a;->n:Ly0/f;

    const v13, 0x2952b718

    invoke-virtual {v7, v13}, Lm0/q;->Z(I)V

    invoke-static {v8, v10, v7}, Ly/z0;->a(Ly/g;Ly0/f;Lm0/m;)Lr1/j0;

    move-result-object v8

    const v13, -0x4ee9b9da

    invoke-virtual {v7, v13}, Lm0/q;->Z(I)V

    iget v13, v7, Lm0/q;->P:I

    move-object/from16 v19, v6

    invoke-virtual {v7}, Lm0/q;->p()Lm0/r1;

    move-result-object v6

    invoke-static {v1}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v1

    if-eqz v0, :cond_18

    invoke-virtual {v7}, Lm0/q;->c0()V

    move-object/from16 v20, v5

    iget-boolean v5, v7, Lm0/q;->O:Z

    if-eqz v5, :cond_5

    invoke-virtual {v7, v14}, Lm0/q;->o(Lc9/a;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v7}, Lm0/q;->o0()V

    :goto_5
    invoke-static {v7, v8, v2}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    invoke-static {v7, v6, v3}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-boolean v5, v7, Lm0/q;->O:Z

    if-nez v5, :cond_6

    invoke-virtual {v7}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v13, v7, v13, v15}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_7
    new-instance v5, Lm0/l2;

    invoke-direct {v5, v7}, Lm0/l2;-><init>(Lm0/m;)V

    invoke-virtual {v1, v5, v7, v4}, Lu0/b;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-virtual {v7, v1}, Lm0/q;->Z(I)V

    invoke-static {}, Ly/a1;->a()Ly0/o;

    move-result-object v1

    const v5, 0x2952b718

    invoke-virtual {v7, v5}, Lm0/q;->Z(I)V

    sget-object v5, Ly/k;->a:Ly/d;

    invoke-static {v5, v10, v7}, Ly/z0;->a(Ly/g;Ly0/f;Lm0/m;)Lr1/j0;

    move-result-object v5

    const v6, -0x4ee9b9da

    invoke-virtual {v7, v6}, Lm0/q;->Z(I)V

    iget v6, v7, Lm0/q;->P:I

    invoke-virtual {v7}, Lm0/q;->p()Lm0/r1;

    move-result-object v8

    invoke-static {v1}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v1

    if-eqz v0, :cond_17

    invoke-virtual {v7}, Lm0/q;->c0()V

    iget-boolean v10, v7, Lm0/q;->O:Z

    if-eqz v10, :cond_8

    invoke-virtual {v7, v14}, Lm0/q;->o(Lc9/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v7}, Lm0/q;->o0()V

    :goto_6
    invoke-static {v7, v5, v2}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    invoke-static {v7, v8, v3}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-boolean v5, v7, Lm0/q;->O:Z

    if-nez v5, :cond_a

    invoke-virtual {v7}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_8

    :cond_9
    :goto_7
    const v5, 0x7ab4aae9

    goto :goto_9

    :cond_a
    :goto_8
    invoke-static {v6, v7, v6, v15}, Ll/q;->r(ILm0/q;ILt1/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v7, v1, v7, v4, v5}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    const/16 v1, 0x28

    int-to-float v1, v1

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/c;->h(Ly0/o;F)Ly0/o;

    move-result-object v1

    sget-object v5, Le0/f;->a:Le0/e;

    invoke-static {v1, v5}, Landroidx/compose/ui/draw/a;->b(Ly0/o;Le1/l0;)Ly0/o;

    move-result-object v1

    invoke-interface {v9}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_b

    sget-wide v5, Le5/a;->a:J

    const v8, 0x3e4ccccd    # 0.2f

    invoke-static {v5, v6, v8}, Le1/r;->b(JF)J

    move-result-wide v5

    goto :goto_a

    :cond_b
    sget-wide v5, Le5/a;->i:J

    :goto_a
    sget-object v8, Le1/g0;->a:Le1/f0;

    invoke-static {v1, v5, v6, v8}, Landroidx/compose/foundation/a;->e(Ly0/o;JLe1/l0;)Ly0/o;

    move-result-object v1

    sget-object v5, Ly0/a;->c:Ly0/g;

    const v6, 0x2bb5b5d7

    invoke-virtual {v7, v6}, Lm0/q;->Z(I)V

    const/4 v6, 0x0

    invoke-static {v5, v6, v7}, Ly/p;->c(Ly0/g;ZLm0/m;)Lr1/j0;

    move-result-object v5

    const v6, -0x4ee9b9da

    invoke-virtual {v7, v6}, Lm0/q;->Z(I)V

    iget v6, v7, Lm0/q;->P:I

    invoke-virtual {v7}, Lm0/q;->p()Lm0/r1;

    move-result-object v8

    invoke-static {v1}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v1

    if-eqz v0, :cond_16

    invoke-virtual {v7}, Lm0/q;->c0()V

    iget-boolean v10, v7, Lm0/q;->O:Z

    if-eqz v10, :cond_c

    invoke-virtual {v7, v14}, Lm0/q;->o(Lc9/a;)V

    goto :goto_b

    :cond_c
    invoke-virtual {v7}, Lm0/q;->o0()V

    :goto_b
    invoke-static {v7, v5, v2}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    invoke-static {v7, v8, v3}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-boolean v5, v7, Lm0/q;->O:Z

    if-nez v5, :cond_e

    invoke-virtual {v7}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    goto :goto_d

    :cond_d
    :goto_c
    const v5, 0x7ab4aae9

    goto :goto_e

    :cond_e
    :goto_d
    invoke-static {v6, v7, v6, v15}, Ll/q;->r(ILm0/q;ILt1/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v7, v1, v7, v4, v5}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    sget-object v1, Lh6/g;->r:Li1/f;

    if-eqz v1, :cond_f

    move-object/from16 v24, v1

    move-object v6, v3

    move-object v13, v4

    goto/16 :goto_f

    :cond_f
    const-string v35, "Filled.Speed"

    const/16 v43, 0x0

    new-instance v1, Li1/e;

    const/high16 v36, 0x41c00000    # 24.0f

    const/high16 v37, 0x41c00000    # 24.0f

    const/high16 v38, 0x41c00000    # 24.0f

    const/high16 v39, 0x41c00000    # 24.0f

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x60

    move-object/from16 v34, v1

    invoke-direct/range {v34 .. v44}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v5, Li1/h0;->a:I

    new-instance v5, Le1/n0;

    move-object v6, v3

    move-object v13, v4

    sget-wide v3, Le1/r;->b:J

    invoke-direct {v5, v3, v4}, Le1/n0;-><init>(J)V

    new-instance v3, Lk/f;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lk/f;-><init>(I)V

    const v4, 0x41a30a3d    # 20.38f

    const v8, 0x41091eb8    # 8.57f

    invoke-virtual {v3, v4, v8}, Lk/f;->D(FF)V

    const v4, -0x40628f5c    # -1.23f

    const v8, 0x3feccccd    # 1.85f

    invoke-virtual {v3, v4, v8}, Lk/f;->C(FF)V

    const/high16 v25, 0x41000000    # 8.0f

    const/high16 v26, 0x41000000    # 8.0f

    const/16 v27, 0x1

    const v28, -0x419eb852    # -0.22f

    const v29, 0x40f28f5c    # 7.58f

    move-object/from16 v24, v3

    invoke-virtual/range {v24 .. v29}, Lk/f;->o(FFZFF)V

    const v10, 0x40a23d71    # 5.07f

    const/high16 v4, 0x41900000    # 18.0f

    invoke-virtual {v3, v10, v4}, Lk/f;->B(FF)V

    const/16 v29, 0x1

    const v30, 0x417947ae    # 15.58f

    const v31, 0x40db3333    # 6.85f

    const/16 v27, 0x0

    const/16 v28, 0x0

    iget-object v4, v3, Lk/f;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    new-instance v10, Li1/i;

    move-object/from16 v24, v10

    invoke-direct/range {v24 .. v31}, Li1/i;-><init>(FFFZZFF)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v4, -0x40628f5c    # -1.23f

    invoke-virtual {v3, v8, v4}, Lk/f;->C(FF)V

    const/high16 v25, 0x41200000    # 10.0f

    const/high16 v26, 0x41200000    # 10.0f

    const/16 v29, 0x0

    const v30, 0x40566666    # 3.35f

    const/high16 v31, 0x41980000    # 19.0f

    const/16 v27, 0x0

    const/16 v28, 0x0

    iget-object v4, v3, Lk/f;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    new-instance v8, Li1/i;

    move-object/from16 v24, v8

    invoke-direct/range {v24 .. v31}, Li1/i;-><init>(FFFZZFF)V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v25, 0x40000000    # 2.0f

    const/high16 v26, 0x40000000    # 2.0f

    const/16 v27, 0x0

    const v28, 0x3fdc28f6    # 1.72f

    const/high16 v29, 0x3f800000    # 1.0f

    move-object/from16 v24, v3

    invoke-virtual/range {v24 .. v29}, Lk/f;->o(FFZFF)V

    const v4, 0x415d999a    # 13.85f

    invoke-virtual {v3, v4}, Lk/f;->A(F)V

    const v28, 0x3fdeb852    # 1.74f

    const/high16 v29, -0x40800000    # -1.0f

    invoke-virtual/range {v24 .. v29}, Lk/f;->o(FFZFF)V

    const/high16 v25, 0x41200000    # 10.0f

    const/high16 v26, 0x41200000    # 10.0f

    const v28, -0x4175c28f    # -0.27f

    const v29, -0x3ed8f5c3    # -10.44f

    invoke-virtual/range {v24 .. v29}, Lk/f;->o(FFZFF)V

    invoke-virtual {v3}, Lk/f;->p()V

    const v4, 0x412970a4    # 10.59f

    const v8, 0x41768f5c    # 15.41f

    invoke-virtual {v3, v4, v8}, Lk/f;->D(FF)V

    const/high16 v25, 0x40000000    # 2.0f

    const/high16 v26, 0x40000000    # 2.0f

    const v28, 0x40351eb8    # 2.83f

    const/16 v29, 0x0

    invoke-virtual/range {v24 .. v29}, Lk/f;->o(FFZFF)V

    const v4, 0x40b51eb8    # 5.66f

    const v8, -0x3ef828f6    # -8.49f

    invoke-virtual {v3, v4, v8}, Lk/f;->C(FF)V

    invoke-virtual {v3, v8, v4}, Lk/f;->C(FF)V

    const/16 v28, 0x0

    const v29, 0x40351eb8    # 2.83f

    invoke-virtual/range {v24 .. v29}, Lk/f;->o(FFZFF)V

    invoke-virtual {v3}, Lk/f;->p()V

    iget-object v3, v3, Lk/f;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-static {v1, v3, v5}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v1}, Li1/e;->b()Li1/f;

    move-result-object v1

    sput-object v1, Lh6/g;->r:Li1/f;

    move-object/from16 v24, v1

    :goto_f
    invoke-interface {v9}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_10

    sget-wide v3, Le5/a;->a:J

    :goto_10
    move-wide/from16 v27, v3

    goto :goto_11

    :cond_10
    sget-wide v3, Le5/a;->m:J

    goto :goto_10

    :goto_11
    const/16 v1, 0x16

    int-to-float v1, v1

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/c;->h(Ly0/o;F)Ly0/o;

    move-result-object v26

    const/16 v25, 0x0

    const/16 v30, 0x1b0

    const/16 v31, 0x0

    move-object/from16 v29, v7

    invoke-static/range {v24 .. v31}, Lk0/e1;->b(Li1/f;Ljava/lang/String;Ly0/o;JLm0/m;II)V

    const/4 v1, 0x0

    const/4 v3, 0x1

    invoke-static {v7, v1, v3, v1, v1}, Ll/q;->v(Lm0/q;ZZZZ)V

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/c;->k(Ly0/o;F)Ly0/o;

    move-result-object v1

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    const v1, -0x1cd0f17e

    invoke-virtual {v7, v1}, Lm0/q;->Z(I)V

    move-object/from16 v1, v20

    invoke-static {v1, v12, v7}, Ly/u;->a(Ly/i;Ly0/e;Lm0/m;)Lr1/j0;

    move-result-object v1

    const v3, -0x4ee9b9da

    invoke-virtual {v7, v3}, Lm0/q;->Z(I)V

    iget v3, v7, Lm0/q;->P:I

    invoke-virtual {v7}, Lm0/q;->p()Lm0/r1;

    move-result-object v4

    invoke-static {v11}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v5

    if-eqz v0, :cond_15

    invoke-virtual {v7}, Lm0/q;->c0()V

    iget-boolean v0, v7, Lm0/q;->O:Z

    if-eqz v0, :cond_11

    invoke-virtual {v7, v14}, Lm0/q;->o(Lc9/a;)V

    goto :goto_12

    :cond_11
    invoke-virtual {v7}, Lm0/q;->o0()V

    :goto_12
    invoke-static {v7, v1, v2}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    invoke-static {v7, v4, v6}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-boolean v0, v7, Lm0/q;->O:Z

    if-nez v0, :cond_13

    invoke-virtual {v7}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_14

    :cond_12
    :goto_13
    move-object v0, v13

    const v1, 0x7ab4aae9

    goto :goto_15

    :cond_13
    :goto_14
    invoke-static {v3, v7, v3, v15}, Ll/q;->r(ILm0/q;ILt1/i;)V

    goto :goto_13

    :goto_15
    invoke-static {v7, v5, v7, v0, v1}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    sget-object v0, Lg5/b;->a:Ljava/util/List;

    invoke-interface/range {v19 .. v19}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "accept_timer_title"

    invoke-static {v1, v0}, Lg5/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    sget-object v31, Lf2/l;->f:Lf2/l;

    sget-wide v26, Le5/a;->l:J

    invoke-static/range {v16 .. v16}, Lo1/s;->N(I)J

    move-result-wide v28

    const/16 v25, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const v46, 0x30c00

    const/16 v47, 0x0

    const v48, 0x1ffd2

    move-object/from16 v45, v7

    invoke-static/range {v24 .. v48}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v7, v0, v1, v0, v0}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-static {v7, v0, v1, v0, v0}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-interface {v9}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    new-instance v1, Lb/g;

    const/16 v2, 0x15

    move-object/from16 v8, p2

    move-object/from16 v10, p3

    invoke-direct {v1, v10, v8, v9, v2}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v8}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    sget-wide v26, Le5/a;->a:J

    sget-wide v24, Le1/r;->c:J

    const-wide/16 v28, 0x0

    const v31, 0xfffc

    move-object/from16 v30, v7

    invoke-static/range {v24 .. v31}, Lk0/t0;->f(JJJLm0/m;I)Lk0/q3;

    move-result-object v29

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x4c

    move/from16 v24, v0

    move-object/from16 v25, v1

    move-object/from16 v26, v2

    move-object/from16 v27, v3

    move/from16 v28, v4

    move-object/from16 v31, v7

    invoke-static/range {v24 .. v33}, Lk0/u3;->a(ZLc9/c;Ly0/o;Lc9/e;ZLk0/q3;Lx/m;Lm0/m;II)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v7, v0, v1, v0, v0}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-interface/range {v19 .. v19}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "accept_timer_desc"

    invoke-static {v1, v0}, Lg5/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    sget-wide v26, Le5/a;->m:J

    const/16 v0, 0xb

    invoke-static {v0}, Lo1/s;->N(I)J

    move-result-wide v28

    const/4 v6, 0x0

    const/16 v1, 0x8

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xd

    move-object v5, v11

    move-object v3, v7

    move v7, v1

    move-object v1, v8

    move v8, v2

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->o(Ly0/o;FFFFI)Ly0/o;

    move-result-object v25

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v46, 0xc30

    const/16 v47, 0x0

    const v48, 0x1fff0

    move-object/from16 v45, v3

    invoke-static/range {v24 .. v48}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    const v2, -0x6faac7b9

    invoke-virtual {v3, v2}, Lm0/q;->Z(I)V

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_14

    const/4 v1, 0x6

    int-to-float v1, v1

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    const-string v24, "\u26a0 Shizuku is not active \u2014 this option is disabled."

    const/16 v25, 0x0

    const-wide v1, 0xffff9800L

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide v26

    invoke-static {v0}, Lo1/s;->N(I)J

    move-result-wide v28

    const/16 v30, 0x0

    sget-object v31, Lf2/l;->e:Lf2/l;

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const v46, 0x30d86

    const/16 v47, 0x0

    const v48, 0x1ffd2

    move-object/from16 v45, v3

    invoke-static/range {v24 .. v48}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :cond_14
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v3, v0, v0, v1, v0}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-virtual {v3, v0}, Lm0/q;->t(Z)V

    :goto_16
    return-object v49

    :cond_15
    invoke-static {}, Lm9/e0;->C()V

    const/4 v0, 0x0

    throw v0

    :cond_16
    const/4 v0, 0x0

    invoke-static {}, Lm9/e0;->C()V

    throw v0

    :cond_17
    const/4 v0, 0x0

    invoke-static {}, Lm9/e0;->C()V

    throw v0

    :cond_18
    const/4 v0, 0x0

    invoke-static {}, Lm9/e0;->C()V

    throw v0

    :cond_19
    const/4 v0, 0x0

    invoke-static {}, Lm9/e0;->C()V

    throw v0

    :pswitch_0
    move-object/from16 v49, v2

    move-object v0, v4

    move-object/from16 v2, p1

    check-cast v2, Lc9/e;

    move-object/from16 v3, p2

    check-cast v3, Lm0/m;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_1b

    move-object v5, v3

    check-cast v5, Lm0/q;

    invoke-virtual {v5, v2}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1a

    const/16 v18, 0x4

    goto :goto_17

    :cond_1a
    const/16 v18, 0x2

    :goto_17
    or-int v4, v4, v18

    :cond_1b
    and-int/lit8 v5, v4, 0x13

    const/16 v7, 0x12

    if-ne v5, v7, :cond_1d

    move-object v5, v3

    check-cast v5, Lm0/q;

    invoke-virtual {v5}, Lm0/q;->G()Z

    move-result v7

    if-nez v7, :cond_1c

    goto :goto_18

    :cond_1c
    invoke-virtual {v5}, Lm0/q;->U()V

    goto/16 :goto_26

    :cond_1d
    :goto_18
    move-object v13, v9

    check-cast v13, Lk0/x2;

    check-cast v6, Lk0/x2;

    invoke-static {v13, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0x4b

    if-eqz v5, :cond_1e

    const/16 v7, 0x96

    goto :goto_19

    :cond_1e
    move v7, v6

    :goto_19
    if-eqz v5, :cond_21

    check-cast v10, Ljava/util/List;

    new-instance v9, Ljava/util/ArrayList;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v12

    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v12

    const/4 v14, 0x0

    :goto_1a
    if-ge v14, v12, :cond_20

    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    if-eqz v15, :cond_1f

    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1f
    add-int/lit8 v14, v14, 0x1

    goto :goto_1a

    :cond_20
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v12, 0x1

    if-eq v9, v12, :cond_22

    goto :goto_1b

    :cond_21
    const/4 v12, 0x1

    :cond_22
    const/4 v6, 0x0

    :goto_1b
    sget-object v9, Lt/d0;->c:Lt/b0;

    new-instance v10, Lt/w1;

    invoke-direct {v10, v7, v6, v9}, Lt/w1;-><init>(IILt/a0;)V

    check-cast v3, Lm0/q;

    const v9, 0x33db8c37

    invoke-virtual {v3, v9}, Lm0/q;->Z(I)V

    invoke-virtual {v3, v13}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v9

    check-cast v8, Lk0/a1;

    invoke-virtual {v3, v8}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v9, v14

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v14

    if-nez v9, :cond_23

    if-ne v14, v1, :cond_24

    :cond_23
    new-instance v14, Lu/r0;

    const/4 v9, 0x6

    invoke-direct {v14, v9, v13, v8}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v14}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_24
    move-object v8, v14

    check-cast v8, Lc9/a;

    const/4 v9, 0x0

    invoke-virtual {v3, v9}, Lm0/q;->t(Z)V

    const v9, 0x5558e4ee

    invoke-virtual {v3, v9}, Lm0/q;->Z(I)V

    const v9, 0x67246e44

    invoke-virtual {v3, v9}, Lm0/q;->Z(I)V

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_26

    if-nez v5, :cond_25

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_1c

    :cond_25
    const/4 v9, 0x0

    :goto_1c
    invoke-static {v9}, Lt/e;->a(F)Lt/d;

    move-result-object v9

    invoke-virtual {v3, v9}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_26
    check-cast v9, Lt/d;

    const/4 v14, 0x0

    invoke-virtual {v3, v14}, Lm0/q;->t(Z)V

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    const v15, 0x67246e92

    invoke-virtual {v3, v15}, Lm0/q;->Z(I)V

    invoke-virtual {v3, v9}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v3, v5}, Lm0/q;->h(Z)Z

    move-result v17

    or-int v15, v15, v17

    invoke-virtual {v3, v10}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v15, v15, v17

    invoke-virtual {v3, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v15, v15, v17

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v12

    if-nez v15, :cond_27

    if-ne v12, v1, :cond_28

    :cond_27
    new-instance v12, Lk0/v2;

    const/16 v30, 0x0

    move-object/from16 v25, v12

    move-object/from16 v26, v9

    move/from16 v27, v5

    move-object/from16 v28, v10

    move-object/from16 v29, v8

    invoke-direct/range {v25 .. v30}, Lk0/v2;-><init>(Lt/d;ZLt/n;Lc9/a;Lu8/e;)V

    invoke-virtual {v3, v12}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_28
    check-cast v12, Lc9/e;

    const/4 v8, 0x0

    invoke-virtual {v3, v8}, Lm0/q;->t(Z)V

    invoke-static {v14, v12, v3}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    iget-object v9, v9, Lt/d;->c:Lt/o;

    invoke-virtual {v3, v8}, Lm0/q;->t(Z)V

    sget-object v8, Lt/d0;->a:Lt/w;

    new-instance v10, Lt/w1;

    invoke-direct {v10, v7, v6, v8}, Lt/w1;-><init>(IILt/a0;)V

    const v6, 0x753b22a1

    invoke-virtual {v3, v6}, Lm0/q;->Z(I)V

    const v6, -0x5809024

    invoke-virtual {v3, v6}, Lm0/q;->Z(I)V

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_2a

    if-nez v5, :cond_29

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_1d

    :cond_29
    const v6, 0x3f4ccccd    # 0.8f

    :goto_1d
    invoke-static {v6}, Lt/e;->a(F)Lt/d;

    move-result-object v6

    invoke-virtual {v3, v6}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v6, Lt/d;

    const/4 v7, 0x0

    invoke-virtual {v3, v7}, Lm0/q;->t(Z)V

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const v8, -0x5808fd4

    invoke-virtual {v3, v8}, Lm0/q;->Z(I)V

    invoke-virtual {v3, v6}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v3, v5}, Lm0/q;->h(Z)Z

    move-result v12

    or-int/2addr v8, v12

    invoke-virtual {v3, v10}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v8, v12

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_2c

    if-ne v12, v1, :cond_2b

    goto :goto_1e

    :cond_2b
    const/4 v8, 0x0

    goto :goto_1f

    :cond_2c
    :goto_1e
    new-instance v12, Lk0/w2;

    const/4 v8, 0x0

    invoke-direct {v12, v6, v5, v10, v8}, Lk0/w2;-><init>(Lt/d;ZLt/n;Lu8/e;)V

    invoke-virtual {v3, v12}, Lm0/q;->l0(Ljava/lang/Object;)V

    :goto_1f
    check-cast v12, Lc9/e;

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    invoke-static {v7, v12, v3}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    iget-object v6, v6, Lt/d;->c:Lt/o;

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    iget-object v5, v6, Lt/o;->b:Lm0/n1;

    invoke-virtual {v5}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v7

    iget-object v5, v6, Lt/o;->b:Lm0/n1;

    invoke-virtual {v5}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v10

    iget-object v5, v9, Lt/o;->b:Lm0/n1;

    invoke-virtual {v5}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v9

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v17, 0x1fff8

    move-object v5, v11

    move v6, v7

    move-object v11, v8

    move v7, v10

    move v8, v9

    move v9, v12

    move-object v10, v14

    move-object v14, v11

    move v11, v15

    const/4 v15, 0x1

    move/from16 v12, v17

    invoke-static/range {v5 .. v12}, Landroidx/compose/ui/graphics/a;->k(Ly0/o;FFFFLe1/l0;ZI)Ly0/o;

    move-result-object v5

    const v6, 0x33db8fd9

    invoke-virtual {v3, v6}, Lm0/q;->Z(I)V

    invoke-virtual {v3, v13}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_2e

    if-ne v7, v1, :cond_2d

    goto :goto_20

    :cond_2d
    const/4 v1, 0x0

    goto :goto_21

    :cond_2e
    :goto_20
    new-instance v7, Lk0/t2;

    const/4 v1, 0x0

    invoke-direct {v7, v13, v1}, Lk0/t2;-><init>(Lk0/x2;I)V

    invoke-virtual {v3, v7}, Lm0/q;->l0(Ljava/lang/Object;)V

    :goto_21
    check-cast v7, Lc9/c;

    invoke-virtual {v3, v1}, Lm0/q;->t(Z)V

    invoke-static {v5, v1, v7}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object v5

    const v6, 0x2bb5b5d7

    invoke-virtual {v3, v6}, Lm0/q;->Z(I)V

    sget-object v6, Ly0/a;->a:Ly0/g;

    invoke-static {v6, v1, v3}, Ly/p;->c(Ly0/g;ZLm0/m;)Lr1/j0;

    move-result-object v6

    const v1, -0x4ee9b9da

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    iget v1, v3, Lm0/q;->P:I

    invoke-virtual {v3}, Lm0/q;->p()Lm0/r1;

    move-result-object v7

    sget-object v8, Lt1/l;->k:Lt1/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lt1/k;->b:Lt1/j;

    invoke-static {v5}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v5

    iget-object v9, v3, Lm0/q;->a:Lm0/d;

    instance-of v9, v9, Lm0/d;

    if-eqz v9, :cond_32

    invoke-virtual {v3}, Lm0/q;->c0()V

    iget-boolean v9, v3, Lm0/q;->O:Z

    if-eqz v9, :cond_2f

    invoke-virtual {v3, v8}, Lm0/q;->o(Lc9/a;)V

    goto :goto_22

    :cond_2f
    invoke-virtual {v3}, Lm0/q;->o0()V

    :goto_22
    sget-object v8, Lt1/k;->e:Lt1/i;

    invoke-static {v3, v6, v8}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v6, Lt1/k;->d:Lt1/i;

    invoke-static {v3, v7, v6}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v6, Lt1/k;->f:Lt1/i;

    iget-boolean v7, v3, Lm0/q;->O:Z

    if-nez v7, :cond_31

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_30

    goto :goto_24

    :cond_30
    :goto_23
    const v1, 0x7ab4aae9

    goto :goto_25

    :cond_31
    :goto_24
    invoke-static {v1, v3, v1, v6}, Ll/q;->r(ILm0/q;ILt1/i;)V

    goto :goto_23

    :goto_25
    invoke-static {v3, v5, v3, v0, v1}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    and-int/lit8 v0, v4, 0xe

    const/4 v1, 0x0

    invoke-static {v0, v2, v3, v1, v15}, Ll/q;->q(ILc9/e;Lm0/q;ZZ)V

    invoke-virtual {v3, v1}, Lm0/q;->t(Z)V

    invoke-virtual {v3, v1}, Lm0/q;->t(Z)V

    :goto_26
    return-object v49

    :cond_32
    invoke-static {}, Lm9/e0;->C()V

    throw v14

    :pswitch_1
    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object/from16 v0, p1

    check-cast v0, Ly0/o;

    move-object/from16 v2, p2

    check-cast v2, Lm0/m;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    check-cast v2, Lm0/q;

    const v3, 0x6169e59c

    invoke-virtual {v2, v3}, Lm0/q;->Z(I)V

    const v3, -0x1d58f75c

    invoke-virtual {v2, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_33

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Lt/e;->a(F)Lt/d;

    move-result-object v3

    invoke-virtual {v2, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_33
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lm0/q;->t(Z)V

    move-object v1, v3

    check-cast v1, Lt/d;

    move-object v3, v9

    check-cast v3, Le1/n;

    instance-of v4, v3, Le1/n0;

    if-eqz v4, :cond_34

    move-object v4, v3

    check-cast v4, Le1/n0;

    iget-wide v4, v4, Le1/n0;->a:J

    sget-wide v12, Le1/r;->g:J

    cmp-long v4, v4, v12

    if-nez v4, :cond_34

    const/4 v12, 0x0

    goto :goto_27

    :cond_34
    move v12, v15

    :goto_27
    move-object/from16 v20, v6

    check-cast v20, Lf0/c2;

    invoke-virtual/range {v20 .. v20}, Lf0/c2;->b()Z

    move-result v4

    if-eqz v4, :cond_35

    move-object v4, v10

    check-cast v4, Lg2/a0;

    iget-wide v5, v4, Lg2/a0;->b:J

    invoke-static {v5, v6}, La2/b0;->b(J)Z

    move-result v5

    if-eqz v5, :cond_35

    if-eqz v12, :cond_35

    new-instance v5, La2/b0;

    iget-wide v6, v4, Lg2/a0;->b:J

    invoke-direct {v5, v6, v7}, La2/b0;-><init>(J)V

    new-instance v6, Lf0/m1;

    invoke-direct {v6, v1, v14}, Lf0/m1;-><init>(Lt/d;Lu8/e;)V

    iget-object v7, v4, Lg2/a0;->a:La2/e;

    invoke-static {v7, v5, v6, v2}, Lm0/s;->c(Ljava/lang/Object;Ljava/lang/Object;Lc9/e;Lm0/m;)V

    new-instance v5, Lb/d;

    move-object/from16 v18, v8

    check-cast v18, Lg2/s;

    const/16 v22, 0x1

    move-object/from16 v16, v5

    move-object/from16 v17, v1

    move-object/from16 v19, v4

    move-object/from16 v21, v3

    invoke-direct/range {v16 .. v22}, Lb/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0, v5}, Landroidx/compose/ui/draw/a;->f(Ly0/o;Lc9/c;)Ly0/o;

    move-result-object v11

    :cond_35
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lm0/q;->t(Z)V

    return-object v11

    :pswitch_2
    move-object/from16 v49, v2

    const/4 v15, 0x1

    move-object/from16 v0, p1

    check-cast v0, Lv0/e;

    move-object/from16 v2, p2

    check-cast v2, Lm0/m;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    check-cast v8, Lm0/l3;

    check-cast v2, Lm0/q;

    const v3, -0x1d58f75c

    invoke-virtual {v2, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_36

    new-instance v3, La0/q;

    new-instance v4, Lz/o;

    invoke-direct {v4, v8, v15}, Lz/o;-><init>(Lm0/l3;I)V

    invoke-direct {v3, v0, v4}, La0/q;-><init>(Lv0/e;Lz/o;)V

    invoke-virtual {v2, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_36
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lm0/q;->t(Z)V

    check-cast v3, La0/q;

    const v0, -0x1d58f75c

    invoke-virtual {v2, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_37

    new-instance v0, Lr1/h1;

    new-instance v4, La0/t;

    invoke-direct {v4, v3}, La0/t;-><init>(La0/q;)V

    invoke-direct {v0, v4}, Lr1/h1;-><init>(Lr1/k1;)V

    invoke-virtual {v2, v0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_37
    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lm0/q;->t(Z)V

    check-cast v0, Lr1/h1;

    check-cast v9, La0/d0;

    const v5, -0x5ad3741a

    invoke-virtual {v2, v5}, Lm0/q;->Z(I)V

    if-nez v9, :cond_38

    goto :goto_28

    :cond_38
    const/16 v5, 0x240

    invoke-static {v9, v3, v0, v2, v5}, Lf6/a;->h(La0/d0;La0/q;Lr1/h1;Lm0/m;I)V

    :goto_28
    invoke-virtual {v2, v4}, Lm0/q;->t(Z)V

    move-object/from16 v23, v6

    check-cast v23, Ly0/o;

    check-cast v10, Lc9/e;

    const v4, 0x1e7b2b64

    invoke-virtual {v2, v4}, Lm0/q;->Z(I)V

    invoke-virtual {v2, v3}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v2, v10}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3a

    if-ne v5, v1, :cond_39

    goto :goto_2a

    :cond_39
    :goto_29
    const/4 v1, 0x0

    goto :goto_2b

    :cond_3a
    :goto_2a
    new-instance v5, Lv/n0;

    const/4 v4, 0x2

    invoke-direct {v5, v4, v3, v10}, Lv/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v5}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_29

    :goto_2b
    invoke-virtual {v2, v1}, Lm0/q;->t(Z)V

    move-object/from16 v24, v5

    check-cast v24, Lc9/e;

    const/16 v26, 0x8

    const/16 v27, 0x0

    move-object/from16 v22, v0

    move-object/from16 v25, v2

    invoke-static/range {v22 .. v27}, Lr1/e1;->a(Lr1/h1;Ly0/o;Lc9/e;Lm0/m;II)V

    return-object v49

    :pswitch_3
    move-object/from16 v49, v2

    move-object v0, v4

    const/4 v4, 0x2

    const/4 v15, 0x1

    move-object/from16 v2, p1

    check-cast v2, Ls/e0;

    move-object/from16 v3, p2

    check-cast v3, Lm0/m;

    move-object/from16 v5, p3

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    and-int/lit8 v7, v5, 0xe

    if-nez v7, :cond_3c

    move-object v7, v3

    check-cast v7, Lm0/q;

    invoke-virtual {v7, v2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3b

    const/16 v18, 0x4

    goto :goto_2c

    :cond_3b
    move/from16 v18, v4

    :goto_2c
    or-int v5, v5, v18

    :cond_3c
    and-int/lit8 v4, v5, 0x5b

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3e

    move-object v4, v3

    check-cast v4, Lm0/q;

    invoke-virtual {v4}, Lm0/q;->G()Z

    move-result v5

    if-nez v5, :cond_3d

    goto :goto_2d

    :cond_3d
    invoke-virtual {v4}, Lm0/q;->U()V

    goto :goto_2e

    :cond_3e
    :goto_2d
    new-instance v4, Lb/g;

    check-cast v10, Lw0/u;

    check-cast v9, Ls/w;

    invoke-direct {v4, v10, v6, v9, v15}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2, v4, v3}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    iget-object v4, v9, Ls/w;->d:Ljava/util/LinkedHashMap;

    const-string v5, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl"

    invoke-static {v2, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ls/f0;

    iget-object v2, v2, Ls/f0;->a:Lm0/n1;

    invoke-interface {v4, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Lm0/q;

    const v2, -0x1d58f75c

    invoke-virtual {v3, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3f

    new-instance v2, Ls/q;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_3f
    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lm0/q;->t(Z)V

    check-cast v8, Lc9/g;

    check-cast v2, Ls/q;

    invoke-interface {v8, v2, v6, v3, v0}, Lc9/g;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2e
    return-object v49

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
