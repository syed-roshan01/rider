.class public abstract Lo2/j;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lo2/d;->c:Lo2/d;

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    new-instance v2, Lm0/p0;

    invoke-direct {v2, v1, v0}, Lm0/p0;-><init>(Lm0/z2;Lc9/a;)V

    sput-object v2, Lo2/j;->a:Lm0/p0;

    return-void
.end method

.method public static final a(Lo2/t;Lc9/a;Lo2/u;Lc9/e;Lm0/m;II)V
    .locals 22

    move-object/from16 v8, p0

    move-object/from16 v9, p3

    move/from16 v10, p5

    move-object/from16 v11, p4

    check-cast v11, Lm0/q;

    const v0, -0x317c909c

    invoke-virtual {v11, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v0, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, v10, 0xe

    if-nez v0, :cond_2

    invoke-virtual {v11, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_2
    move v0, v10

    :goto_1
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v2, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v2, v10, 0x70

    if-nez v2, :cond_3

    move-object/from16 v2, p1

    invoke-virtual {v11, v2}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x20

    goto :goto_2

    :cond_5
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :goto_3
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v4, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v10, 0x380

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-virtual {v11, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x100

    goto :goto_4

    :cond_8
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :goto_5
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v0, v0, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v10, 0x1c00

    if-nez v5, :cond_b

    invoke-virtual {v11, v9}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x800

    goto :goto_6

    :cond_a
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v0, v5

    :cond_b
    :goto_7
    and-int/lit16 v0, v0, 0x16db

    const/16 v5, 0x492

    if-ne v0, v5, :cond_d

    invoke-virtual {v11}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v11}, Lm0/q;->U()V

    move-object v3, v4

    goto/16 :goto_d

    :cond_d
    :goto_8
    const/4 v12, 0x0

    if-eqz v1, :cond_e

    move-object/from16 v20, v12

    goto :goto_9

    :cond_e
    move-object/from16 v20, v2

    :goto_9
    const/4 v15, 0x0

    if-eqz v3, :cond_f

    new-instance v0, Lo2/u;

    const/16 v1, 0x3f

    invoke-direct {v0, v15, v1}, Lo2/u;-><init>(ZI)V

    move-object/from16 v21, v0

    goto :goto_a

    :cond_f
    move-object/from16 v21, v4

    :goto_a
    sget-object v0, Lu1/y0;->f:Lm0/m3;

    invoke-virtual {v11, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    sget-object v0, Lu1/s1;->e:Lm0/m3;

    invoke-virtual {v11, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lm2/b;

    sget-object v0, Lo2/j;->a:Lm0/p0;

    invoke-virtual {v11, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Ljava/lang/String;

    sget-object v0, Lu1/s1;->k:Lm0/m3;

    invoke-virtual {v11, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lm2/l;

    invoke-static {v11}, Lm9/e0;->K(Lm0/m;)Lm0/o;

    move-result-object v13

    invoke-static {v9, v11}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v7

    new-array v0, v15, [Ljava/lang/Object;

    sget-object v1, Lo2/d;->d:Lo2/d;

    const/4 v2, 0x6

    invoke-static {v0, v12, v1, v11, v2}, Lx3/c;->d([Ljava/lang/Object;Lv0/p;Lc9/a;Lm0/m;I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/util/UUID;

    const v0, -0x1d58f75c

    invoke-virtual {v11, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm0/l;->a:Lk0/y0;

    const/4 v6, 0x1

    if-ne v0, v1, :cond_10

    new-instance v3, Lo2/r;

    move-object v0, v3

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    move-object v12, v3

    move-object/from16 v3, v19

    move v15, v6

    move-object/from16 v6, p0

    move-object v15, v7

    move-object/from16 v7, v16

    invoke-direct/range {v0 .. v7}, Lo2/r;-><init>(Lc9/a;Lo2/u;Ljava/lang/String;Landroid/view/View;Lm2/b;Lo2/t;Ljava/util/UUID;)V

    new-instance v0, Lv/n0;

    const/16 v1, 0xa

    invoke-direct {v0, v1, v12, v15}, Lv/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lu0/b;

    const v2, 0x4da88f2f    # 3.534945E8f

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, Lu0/b;-><init>(ILd9/j;Z)V

    invoke-virtual {v12, v13, v1}, Lo2/r;->h(Lm0/u;Lc9/e;)V

    invoke-virtual {v11, v12}, Lm0/q;->l0(Ljava/lang/Object;)V

    move-object v0, v12

    const/4 v1, 0x0

    goto :goto_b

    :cond_10
    move v3, v6

    move v1, v15

    :goto_b
    invoke-virtual {v11, v1}, Lm0/q;->t(Z)V

    check-cast v0, Lo2/r;

    new-instance v2, Lb/d;

    move-object v13, v2

    move-object v4, v14

    move-object v14, v0

    move-object/from16 v15, v20

    move-object/from16 v16, v21

    move-object/from16 v17, v19

    move-object/from16 v18, v4

    invoke-direct/range {v13 .. v18}, Lb/d;-><init>(Lo2/r;Lc9/a;Lo2/u;Ljava/lang/String;Lm2/l;)V

    invoke-static {v0, v2, v11}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    new-instance v2, Lo2/f;

    const/4 v5, 0x0

    move-object v13, v2

    move/from16 v19, v5

    invoke-direct/range {v13 .. v19}, Lo2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2, v11}, Lm0/s;->d(Lc9/a;Lm0/m;)V

    new-instance v2, Lu/s;

    const/16 v5, 0x1b

    invoke-direct {v2, v5, v0, v8}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v2, v11}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    new-instance v2, Lo2/h;

    const/4 v5, 0x0

    invoke-direct {v2, v0, v5}, Lo2/h;-><init>(Lo2/r;Lu8/e;)V

    invoke-static {v0, v2, v11}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    sget-object v2, Ly0/l;->b:Ly0/l;

    new-instance v5, Lo2/i;

    invoke-direct {v5, v0, v1}, Lo2/i;-><init>(Lo2/r;I)V

    invoke-static {v2, v5}, Landroidx/compose/ui/layout/a;->j(Ly0/o;Lc9/c;)Ly0/o;

    move-result-object v2

    new-instance v5, Lk0/a4;

    invoke-direct {v5, v3, v0, v4}, Lk0/a4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x4ee9b9da

    invoke-virtual {v11, v0}, Lm0/q;->Z(I)V

    iget v0, v11, Lm0/q;->P:I

    invoke-virtual {v11}, Lm0/q;->p()Lm0/r1;

    move-result-object v4

    sget-object v6, Lt1/l;->k:Lt1/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lt1/k;->b:Lt1/j;

    invoke-static {v2}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v2

    iget-object v7, v11, Lm0/q;->a:Lm0/d;

    instance-of v7, v7, Lm0/d;

    if-eqz v7, :cond_15

    invoke-virtual {v11}, Lm0/q;->c0()V

    iget-boolean v7, v11, Lm0/q;->O:Z

    if-eqz v7, :cond_11

    invoke-virtual {v11, v6}, Lm0/q;->o(Lc9/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v11}, Lm0/q;->o0()V

    :goto_c
    sget-object v6, Lt1/k;->e:Lt1/i;

    invoke-static {v11, v5, v6}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v5, Lt1/k;->d:Lt1/i;

    invoke-static {v11, v4, v5}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v4, Lt1/k;->f:Lt1/i;

    iget-boolean v5, v11, Lm0/q;->O:Z

    if-nez v5, :cond_12

    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    :cond_12
    invoke-static {v0, v11, v0, v4}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_13
    new-instance v0, Lm0/l2;

    invoke-direct {v0, v11}, Lm0/l2;-><init>(Lm0/m;)V

    const v4, 0x7ab4aae9

    invoke-static {v1, v2, v0, v11, v4}, Ll/q;->s(ILu0/b;Lm0/l2;Lm0/q;I)V

    invoke-virtual {v11, v1}, Lm0/q;->t(Z)V

    invoke-virtual {v11, v3}, Lm0/q;->t(Z)V

    invoke-virtual {v11, v1}, Lm0/q;->t(Z)V

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    :goto_d
    invoke-virtual {v11}, Lm0/q;->x()Lm0/x1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v11, La0/v;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, La0/v;-><init>(Lo2/t;Lc9/a;Lo2/u;Lc9/e;II)V

    iput-object v11, v7, Lm0/x1;->d:Lc9/e;

    :cond_14
    return-void

    :cond_15
    invoke-static {}, Lm9/e0;->C()V

    const/4 v0, 0x0

    throw v0
.end method

.method public static final b(Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    instance-of v0, p0, Landroid/view/WindowManager$LayoutParams;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 p0, p0, 0x2000

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method
