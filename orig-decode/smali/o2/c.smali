.class public final Lo2/c;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm0/l3;


# direct methods
.method public synthetic constructor <init>(Lm0/l3;I)V
    .locals 0

    iput p2, p0, Lo2/c;->a:I

    iput-object p1, p0, Lo2/c;->b:Lm0/l3;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ly0/l;->b:Ly0/l;

    iget v4, v0, Lo2/c;->a:I

    iget-object v5, v0, Lo2/c;->b:Lm0/l3;

    const/4 v6, 0x2

    packed-switch v4, :pswitch_data_0

    and-int/lit8 v3, p2, 0xb

    if-ne v3, v6, :cond_1

    move-object v3, v8

    check-cast v3, Lm0/q;

    invoke-virtual {v3}, Lm0/q;->G()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lm0/q;->U()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v8

    check-cast v2, Lm0/q;

    const v3, -0x2109cf1c

    invoke-virtual {v2, v3}, Lm0/q;->Z(I)V

    const-string v6, "No transactions yet."

    const/4 v7, 0x0

    sget-wide v8, Le5/a;->m:J

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x186

    const/16 v29, 0x0

    const v30, 0x1fffa

    move-object/from16 v27, v2

    invoke-static/range {v6 .. v30}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    invoke-virtual {v2, v1}, Lm0/q;->t(Z)V

    goto/16 :goto_3

    :cond_2
    move-object v3, v8

    check-cast v3, Lm0/q;

    const v4, -0x2109ceb8

    invoke-virtual {v3, v4}, Lm0/q;->Z(I)V

    sget-object v4, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    const/16 v6, 0x190

    int-to-float v6, v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v4, v7, v6, v8}, Landroidx/compose/foundation/layout/c;->e(Ly0/o;FFI)Ly0/o;

    move-result-object v4

    invoke-static {v3}, Landroidx/compose/foundation/a;->l(Lm0/m;)Lu/p2;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/compose/foundation/a;->n(Ly0/o;Lu/p2;)Ly0/o;

    move-result-object v4

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v6}, Ly/k;->j(F)Ly/h;

    move-result-object v6

    const v7, -0x1cd0f17e

    invoke-virtual {v3, v7}, Lm0/q;->Z(I)V

    sget-object v7, Ly0/a;->o:Ly0/e;

    invoke-static {v6, v7, v3}, Ly/u;->a(Ly/i;Ly0/e;Lm0/m;)Lr1/j0;

    move-result-object v6

    const v7, -0x4ee9b9da

    invoke-virtual {v3, v7}, Lm0/q;->Z(I)V

    iget v7, v3, Lm0/q;->P:I

    invoke-virtual {v3}, Lm0/q;->p()Lm0/r1;

    move-result-object v9

    sget-object v10, Lt1/l;->k:Lt1/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, Lt1/k;->b:Lt1/j;

    invoke-static {v4}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v4

    iget-object v11, v3, Lm0/q;->a:Lm0/d;

    instance-of v11, v11, Lm0/d;

    if-eqz v11, :cond_7

    invoke-virtual {v3}, Lm0/q;->c0()V

    iget-boolean v11, v3, Lm0/q;->O:Z

    if-eqz v11, :cond_3

    invoke-virtual {v3, v10}, Lm0/q;->o(Lc9/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lm0/q;->o0()V

    :goto_1
    sget-object v10, Lt1/k;->e:Lt1/i;

    invoke-static {v3, v6, v10}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v6, Lt1/k;->d:Lt1/i;

    invoke-static {v3, v9, v6}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v6, Lt1/k;->f:Lt1/i;

    iget-boolean v9, v3, Lm0/q;->O:Z

    if-nez v9, :cond_4

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    :cond_4
    invoke-static {v7, v3, v7, v6}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_5
    const v6, 0x7ab4aae9

    invoke-static {v3, v4, v3, v2, v6}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    const v2, -0x2109cd44

    invoke-virtual {v3, v2}, Lm0/q;->Z(I)V

    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/auto/accept/data/model/TransactionData;

    sget-wide v5, Le5/a;->i:J

    const v7, 0x3e99999a    # 0.3f

    invoke-static {v5, v6, v7}, Le1/r;->b(JF)J

    move-result-wide v5

    const/4 v7, 0x6

    invoke-static {v5, v6, v3, v7}, Lk0/t0;->d(JLm0/m;I)Lk0/g0;

    move-result-object v33

    const/16 v5, 0xc

    int-to-float v5, v5

    invoke-static {v5}, Le0/f;->a(F)Le0/e;

    move-result-object v32

    const/16 v31, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    new-instance v5, Ls/h;

    const/16 v6, 0xa

    invoke-direct {v5, v4, v6}, Ls/h;-><init>(Ljava/lang/Object;I)V

    const v4, 0x73523dba

    invoke-static {v3, v4, v5}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v36

    const/high16 v38, 0x30000

    const/16 v39, 0x19

    move-object/from16 v37, v3

    invoke-static/range {v31 .. v39}, Lf6/a;->a(Ly0/o;Le1/l0;Lk0/g0;Lk0/h0;Lu/w;Lc9/f;Lm0/m;II)V

    goto :goto_2

    :cond_6
    invoke-static {v3, v1, v1, v8, v1}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-virtual {v3, v1}, Lm0/q;->t(Z)V

    invoke-virtual {v3, v1}, Lm0/q;->t(Z)V

    :goto_3
    return-void

    :cond_7
    invoke-static {}, Lm9/e0;->C()V

    const/4 v1, 0x0

    throw v1

    :pswitch_0
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v6, :cond_9

    move-object v1, v8

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_5

    :cond_9
    :goto_4
    sget-object v1, Lg5/b;->a:Ljava/util/List;

    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "profile"

    invoke-static {v2, v1}, Lg5/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v22, Lf2/l;->f:Lf2/l;

    sget-wide v3, Le5/a;->l:J

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/high16 v23, 0x30000

    const/16 v24, 0x0

    const v25, 0x1ffda

    move-object/from16 v8, v22

    move-object/from16 v22, p1

    invoke-static/range {v1 .. v25}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_5
    return-void

    :pswitch_1
    and-int/lit8 v2, p2, 0xb

    move-object/from16 v4, p1

    if-ne v2, v6, :cond_b

    move-object v2, v4

    check-cast v2, Lm0/q;

    invoke-virtual {v2}, Lm0/q;->G()Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v2}, Lm0/q;->U()V

    goto/16 :goto_a

    :cond_b
    :goto_6
    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_c

    goto :goto_7

    :cond_c
    move-object v2, v4

    check-cast v2, Lm0/q;

    const v4, -0x6bd4f113

    invoke-virtual {v2, v4}, Lm0/q;->Z(I)V

    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v2}, Ly3/e;->B0(Ljava/lang/String;Lm0/m;)Lj4/l;

    move-result-object v6

    const-string v7, "Profile"

    const/16 v4, 0x1e

    int-to-float v4, v4

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/c;->h(Ly0/o;F)Ly0/o;

    move-result-object v3

    sget-object v4, Le0/f;->a:Le0/e;

    invoke-static {v3, v4}, Landroidx/compose/ui/draw/a;->b(Ly0/o;Le1/l0;)Ly0/o;

    move-result-object v8

    const/4 v9, 0x0

    sget-object v10, Lr1/k;->a:Lx9/v;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v14, 0x6030

    const/16 v15, 0x68

    move-object v13, v2

    invoke-static/range {v6 .. v15}, Landroidx/compose/foundation/a;->c(Lh1/c;Ljava/lang/String;Ly0/o;Ly0/d;Lr1/l;FLe1/l;Lm0/m;II)V

    invoke-virtual {v2, v1}, Lm0/q;->t(Z)V

    goto/16 :goto_a

    :cond_d
    :goto_7
    move-object v2, v4

    check-cast v2, Lm0/q;

    const v3, -0x6bd4eef1

    invoke-virtual {v2, v3}, Lm0/q;->Z(I)V

    sget-object v3, Lo7/d0;->h:Li1/f;

    if-eqz v3, :cond_e

    :goto_8
    move-object/from16 v16, v3

    goto/16 :goto_9

    :cond_e
    const-string v5, "Filled.AccountCircle"

    const/4 v13, 0x0

    new-instance v3, Li1/e;

    const/high16 v6, 0x41c00000    # 24.0f

    const/high16 v7, 0x41c00000    # 24.0f

    const/high16 v8, 0x41c00000    # 24.0f

    const/high16 v9, 0x41c00000    # 24.0f

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v14, 0x60

    move-object v4, v3

    invoke-direct/range {v4 .. v14}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v4, Li1/h0;->a:I

    new-instance v4, Le1/n0;

    sget-wide v5, Le1/r;->b:J

    invoke-direct {v4, v5, v6}, Le1/n0;-><init>(J)V

    const/4 v5, 0x7

    const/high16 v6, 0x41400000    # 12.0f

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v5, v6, v7}, Lt/k;->c(IFF)Lk/f;

    move-result-object v5

    const v9, 0x40cf5c29    # 6.48f

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v11, 0x40000000    # 2.0f

    const v12, 0x40cf5c29    # 6.48f

    const/high16 v13, 0x40000000    # 2.0f

    const/high16 v14, 0x41400000    # 12.0f

    move-object v8, v5

    invoke-virtual/range {v8 .. v14}, Lk/f;->u(FFFFFF)V

    const v8, 0x408f5c29    # 4.48f

    const/high16 v9, 0x41200000    # 10.0f

    invoke-virtual {v5, v8, v9, v9, v9}, Lk/f;->H(FFFF)V

    const v8, -0x3f70a3d7    # -4.48f

    const/high16 v10, -0x3ee00000    # -10.0f

    invoke-virtual {v5, v9, v8, v9, v10}, Lk/f;->H(FFFF)V

    const v8, 0x418c28f6    # 17.52f

    invoke-virtual {v5, v8, v7, v6, v7}, Lk/f;->G(FFFF)V

    invoke-virtual {v5}, Lk/f;->p()V

    const/high16 v7, 0x40c00000    # 6.0f

    invoke-virtual {v5, v6, v7}, Lk/f;->D(FF)V

    const v9, 0x3ff70a3d    # 1.93f

    const/4 v10, 0x0

    const/high16 v11, 0x40600000    # 3.5f

    const v12, 0x3fc8f5c3    # 1.57f

    const/high16 v13, 0x40600000    # 3.5f

    const/high16 v14, 0x40600000    # 3.5f

    move-object v8, v5

    invoke-virtual/range {v8 .. v14}, Lk/f;->v(FFFFFF)V

    const v8, 0x415ee148    # 13.93f

    const/high16 v9, 0x41500000    # 13.0f

    invoke-virtual {v5, v8, v9, v6, v9}, Lk/f;->G(FFFF)V

    const v8, -0x40370a3d    # -1.57f

    const/high16 v9, -0x3fa00000    # -3.5f

    invoke-virtual {v5, v9, v8, v9, v9}, Lk/f;->H(FFFF)V

    const v8, 0x41211eb8    # 10.07f

    invoke-virtual {v5, v8, v7, v6, v7}, Lk/f;->G(FFFF)V

    invoke-virtual {v5}, Lk/f;->p()V

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-virtual {v5, v6, v7}, Lk/f;->D(FF)V

    const v9, -0x3ffe147b    # -2.03f

    const v11, -0x3f723d71    # -4.43f

    const v12, -0x40ae147b    # -0.82f

    const v13, -0x3f3b851f    # -6.14f

    const v14, -0x3fc7ae14    # -2.88f

    move-object v8, v5

    invoke-virtual/range {v8 .. v14}, Lk/f;->v(FFFFFF)V

    const v9, 0x40f1999a    # 7.55f

    const v10, 0x417ccccd    # 15.8f

    const v11, 0x411ae148    # 9.68f

    const/high16 v12, 0x41700000    # 15.0f

    const/high16 v13, 0x41400000    # 12.0f

    const/high16 v14, 0x41700000    # 15.0f

    invoke-virtual/range {v8 .. v14}, Lk/f;->u(FFFFFF)V

    const v6, 0x408e6666    # 4.45f

    const v7, 0x3f4ccccd    # 0.8f

    const v8, 0x40c47ae1    # 6.14f

    const v9, 0x4007ae14    # 2.12f

    invoke-virtual {v5, v6, v7, v8, v9}, Lk/f;->H(FFFF)V

    const v9, 0x418370a4    # 16.43f

    const v10, 0x419970a4    # 19.18f

    const v11, 0x41607ae1    # 14.03f

    const/high16 v12, 0x41a00000    # 20.0f

    const/high16 v14, 0x41a00000    # 20.0f

    move-object v8, v5

    invoke-virtual/range {v8 .. v14}, Lk/f;->u(FFFFFF)V

    invoke-virtual {v5}, Lk/f;->p()V

    iget-object v5, v5, Lk/f;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-static {v3, v5, v4}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v3}, Li1/e;->b()Li1/f;

    move-result-object v3

    sput-object v3, Lo7/d0;->h:Li1/f;

    goto/16 :goto_8

    :goto_9
    const-string v17, "Profile"

    const/16 v18, 0x0

    sget-wide v19, Le5/a;->m:J

    const/16 v22, 0x30

    const/16 v23, 0x4

    move-object/from16 v21, v2

    invoke-static/range {v16 .. v23}, Lk0/e1;->b(Li1/f;Ljava/lang/String;Ly0/o;JLm0/m;II)V

    invoke-virtual {v2, v1}, Lm0/q;->t(Z)V

    :goto_a
    return-void

    :pswitch_2
    move-object v4, v8

    and-int/lit8 v1, p2, 0xb

    if-ne v1, v6, :cond_10

    move-object v1, v4

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
    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "The app \""

    const-string v3, "\" is not allowed on this device while using this app. Please uninstall it to continue."

    invoke-static {v2, v1, v3}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    sget-wide v26, Le5/a;->l:J

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x180

    const/16 v24, 0x0

    const v25, 0x1fffa

    move-wide/from16 v3, v26

    move-object/from16 v22, p1

    invoke-static/range {v1 .. v25}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_c
    return-void

    :pswitch_3
    and-int/lit8 v1, p2, 0xb

    move-object/from16 v4, p1

    if-ne v1, v6, :cond_12

    move-object v1, v4

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
    sget-object v1, Lo2/j;->a:Lm0/p0;

    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc9/e;

    invoke-interface {v1, v4, v2}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_e
    return-void

    :pswitch_4
    move-object v4, v8

    and-int/lit8 v2, p2, 0xb

    if-ne v2, v6, :cond_14

    move-object v2, v4

    check-cast v2, Lm0/q;

    invoke-virtual {v2}, Lm0/q;->G()Z

    move-result v6

    if-nez v6, :cond_13

    goto :goto_f

    :cond_13
    invoke-virtual {v2}, Lm0/q;->U()V

    goto :goto_10

    :cond_14
    :goto_f
    sget-object v2, Lo2/b;->b:Lo2/b;

    invoke-static {v3, v1, v2}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object v2

    new-instance v3, Lo2/c;

    invoke-direct {v3, v5, v1}, Lo2/c;-><init>(Lm0/l3;I)V

    const v5, -0x1fcf3bc7

    invoke-static {v4, v5, v3}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v3

    const/16 v5, 0x30

    invoke-static {v2, v3, v4, v5, v1}, Lo1/s;->h(Ly0/o;Lc9/e;Lm0/m;II)V

    :goto_10
    return-void

    :pswitch_5
    move-object v4, v8

    and-int/lit8 v1, p2, 0xb

    if-ne v1, v6, :cond_16

    move-object v1, v4

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_15

    goto :goto_11

    :cond_15
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_12

    :cond_16
    :goto_11
    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc9/e;

    invoke-interface {v1, v4, v2}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_12
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lo2/c;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lo2/c;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lo2/c;->a(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lo2/c;->a(Lm0/m;I)V

    return-object v0

    :pswitch_2
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lo2/c;->a(Lm0/m;I)V

    return-object v0

    :pswitch_3
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lo2/c;->a(Lm0/m;I)V

    return-object v0

    :pswitch_4
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lo2/c;->a(Lm0/m;I)V

    return-object v0

    :pswitch_5
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lo2/c;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
