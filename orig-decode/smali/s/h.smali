.class public final Ls/h;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ls/h;->a:I

    iput-object p1, p0, Ls/h;->b:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/o;Lm0/m;)Ly0/o;
    .locals 12

    sget-object v0, Lm0/l;->a:Lk0/y0;

    iget v1, p0, Ls/h;->a:I

    const v2, 0x44faf204

    const/4 v3, 0x1

    const v4, -0x1d58f75c

    iget-object v5, p0, Ls/h;->b:Ljava/lang/Object;

    const/4 v6, 0x0

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    check-cast p2, Lm0/q;

    const v1, 0x760d4197

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    sget-object v1, Lu1/s1;->e:Lm0/m3;

    invoke-virtual {p2, v1}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/b;

    invoke-virtual {p2, v4}, Lm0/q;->Z(I)V

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    new-instance v2, Lm2/k;

    const-wide/16 v7, 0x0

    invoke-direct {v2, v7, v8}, Lm2/k;-><init>(J)V

    sget-object v4, Lm0/o3;->a:Lm0/o3;

    invoke-static {v2, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v2

    invoke-virtual {p2, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    check-cast v2, Lm0/g1;

    new-instance v4, Lu/r0;

    check-cast v5, Lh0/v0;

    const/4 v7, 0x5

    invoke-direct {v4, v7, v5, v2}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, -0xdea45df

    invoke-virtual {p2, v5}, Lm0/q;->Z(I)V

    invoke-virtual {p2, v2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {p2, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_1

    if-ne v7, v0, :cond_2

    :cond_1
    new-instance v7, Lh0/z0;

    invoke-direct {v7, v1, v2, v3}, Lh0/z0;-><init>(Lm2/b;Lm0/g1;I)V

    invoke-virtual {p2, v7}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    check-cast v7, Lc9/c;

    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    sget-object v0, Lh0/k0;->a:Lt/q;

    new-instance v0, Lu/l1;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v4, v7}, Lu/l1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object p1

    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    return-object p1

    :pswitch_1
    check-cast p2, Lm0/q;

    const p1, 0x5e56a525

    invoke-virtual {p2, p1}, Lm0/q;->Z(I)V

    sget-object p1, Lu1/s1;->e:Lm0/m3;

    invoke-virtual {p2, p1}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm2/b;

    sget-object v1, Lu1/s1;->h:Lm0/m3;

    invoke-virtual {p2, v1}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/d;

    sget-object v2, Lu1/s1;->k:Lm0/m3;

    invoke-virtual {p2, v2}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm2/l;

    check-cast v5, La2/c0;

    const v7, 0x1e7b2b64

    invoke-virtual {p2, v7}, Lm0/q;->Z(I)V

    invoke-virtual {p2, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {p2, v2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_3

    if-ne v9, v0, :cond_4

    :cond_3
    invoke-static {v5, v2}, Lo1/s;->g0(La2/c0;Lm2/l;)La2/c0;

    move-result-object v9

    invoke-virtual {p2, v9}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    check-cast v9, La2/c0;

    invoke-virtual {p2, v7}, Lm0/q;->Z(I)V

    invoke-virtual {p2, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {p2, v9}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_5

    if-ne v8, v0, :cond_9

    :cond_5
    iget-object v7, v9, La2/c0;->a:La2/x;

    iget-object v8, v7, La2/x;->f:Lf2/e;

    iget-object v10, v7, La2/x;->c:Lf2/l;

    if-nez v10, :cond_6

    sget-object v10, Lf2/l;->c:Lf2/l;

    :cond_6
    iget-object v11, v7, La2/x;->d:Lf2/j;

    if-eqz v11, :cond_7

    iget v11, v11, Lf2/j;->a:I

    goto :goto_0

    :cond_7
    move v11, v6

    :goto_0
    iget-object v7, v7, La2/x;->e:Lf2/k;

    if-eqz v7, :cond_8

    iget v3, v7, Lf2/k;->a:I

    :cond_8
    move-object v7, v1

    check-cast v7, Lf2/f;

    invoke-virtual {v7, v8, v10, v11, v3}, Lf2/f;->b(Lf2/e;Lf2/l;II)Lf2/w;

    move-result-object v8

    invoke-virtual {p2, v8}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_9
    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    check-cast v8, Lm0/l3;

    invoke-virtual {p2, v4}, Lm0/q;->Z(I)V

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_a

    new-instance v3, Lf0/b2;

    invoke-interface {v8}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v2, v3, Lf0/b2;->a:Lm2/l;

    iput-object p1, v3, Lf0/b2;->b:Lm2/b;

    iput-object v1, v3, Lf0/b2;->c:Lf2/d;

    iput-object v5, v3, Lf0/b2;->d:La2/c0;

    iput-object v0, v3, Lf0/b2;->e:Ljava/lang/Object;

    invoke-static {v5, p1, v1}, Lf0/o1;->b(La2/c0;Lm2/b;Lf2/d;)J

    move-result-wide v4

    iput-wide v4, v3, Lf0/b2;->f:J

    invoke-virtual {p2, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    check-cast v3, Lf0/b2;

    invoke-interface {v8}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v4, v3, Lf0/b2;->a:Lm2/l;

    if-ne v2, v4, :cond_b

    iget-object v4, v3, Lf0/b2;->b:Lm2/b;

    invoke-static {p1, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v4, v3, Lf0/b2;->c:Lf2/d;

    invoke-static {v1, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v4, v3, Lf0/b2;->d:La2/c0;

    invoke-static {v9, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v4, v3, Lf0/b2;->e:Ljava/lang/Object;

    invoke-static {v0, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    iput-object v2, v3, Lf0/b2;->a:Lm2/l;

    iput-object p1, v3, Lf0/b2;->b:Lm2/b;

    iput-object v1, v3, Lf0/b2;->c:Lf2/d;

    iput-object v9, v3, Lf0/b2;->d:La2/c0;

    iput-object v0, v3, Lf0/b2;->e:Ljava/lang/Object;

    invoke-static {v9, p1, v1}, Lf0/o1;->b(La2/c0;Lm2/b;Lf2/d;)J

    move-result-wide v0

    iput-wide v0, v3, Lf0/b2;->f:J

    :cond_c
    sget-object p1, Ly0/l;->b:Ly0/l;

    new-instance v0, Ls/h;

    const/4 v1, 0x4

    invoke-direct {v0, v3, v1}, Ls/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Landroidx/compose/ui/layout/a;->g(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object p1

    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    return-object p1

    :pswitch_2
    check-cast p2, Lm0/q;

    const p1, -0x5461a65a

    invoke-virtual {p2, p1}, Lm0/q;->Z(I)V

    check-cast v5, Ly/i1;

    invoke-virtual {p2, v2}, Lm0/q;->Z(I)V

    invoke-virtual {p2, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_d

    if-ne v1, v0, :cond_e

    :cond_d
    new-instance v1, Ly/i0;

    invoke-direct {v1, v5}, Ly/i0;-><init>(Ly/i1;)V

    invoke-virtual {p2, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_e
    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    check-cast v1, Ly/i0;

    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    return-object v1

    :pswitch_3
    check-cast p2, Lm0/q;

    const p1, -0x5fda9847

    invoke-virtual {p2, p1}, Lm0/q;->Z(I)V

    check-cast v5, Lc9/c;

    invoke-virtual {p2, v2}, Lm0/q;->Z(I)V

    invoke-virtual {p2, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_f

    if-ne v1, v0, :cond_10

    :cond_f
    new-instance v1, Ly/x;

    invoke-direct {v1, v5}, Ly/x;-><init>(Lc9/c;)V

    invoke-virtual {p2, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_10
    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    check-cast v1, Ly/x;

    invoke-virtual {p2, v6}, Lm0/q;->t(Z)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final b(Ly/a1;Lm0/m;I)V
    .locals 58

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    iget v2, v0, Ls/h;->a:I

    iget-object v3, v0, Ls/h;->b:Ljava/lang/Object;

    const/16 v4, 0x10

    packed-switch v2, :pswitch_data_0

    const-string v2, "$this$TopAppBar"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x51

    if-ne v1, v4, :cond_1

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_1

    :cond_1
    :goto_0
    check-cast v3, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, v3, Lcom/auto/accept/ui/viewmodel/MainViewModel;->C0:Lp9/z;

    invoke-static {v1, v7}, Ld7/t;->I(Lp9/z;Lm0/m;)Lm0/g1;

    move-result-object v1

    new-instance v2, Lc5/j;

    const/16 v4, 0xf

    invoke-direct {v2, v3, v4}, Lc5/j;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v8, Lo2/c;

    const/4 v9, 0x4

    invoke-direct {v8, v1, v9}, Lo2/c;-><init>(Lm0/l3;I)V

    const v1, -0x201c54f8

    invoke-static {v7, v1, v8}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v8

    const/high16 v9, 0x30000

    const/16 v10, 0x1e

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v8

    move-object/from16 v7, p2

    move v8, v9

    move v9, v10

    invoke-static/range {v1 .. v9}, Lo7/d0;->b(Lc9/a;Ly0/o;ZLk0/b1;Lx/m;Lc9/e;Lm0/m;II)V

    :goto_1
    return-void

    :pswitch_0
    const-string v2, "$this$Button"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x51

    if-ne v1, v4, :cond_3

    move-object v1, v7

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lm0/q;->U()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    check-cast v3, Lm0/g1;

    invoke-interface {v3}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    sget-object v2, Ly0/l;->b:Ly0/l;

    const/16 v3, 0x8

    const/4 v5, 0x0

    if-eqz v1, :cond_4

    move-object v1, v7

    check-cast v1, Lm0/q;

    const v6, -0x2ca1c628

    invoke-virtual {v1, v6}, Lm0/q;->Z(I)V

    const/16 v6, 0x16

    int-to-float v6, v6

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/c;->h(Ly0/o;F)Ly0/o;

    move-result-object v6

    sget-wide v31, Le5/a;->j:J

    const/4 v7, 0x2

    int-to-float v9, v7

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v14, 0x1b6

    const/16 v15, 0x18

    move-wide/from16 v7, v31

    move-object v13, v1

    invoke-static/range {v6 .. v15}, Lk0/b2;->a(Ly0/o;JFJILm0/m;II)V

    int-to-float v3, v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/c;->k(Ly0/o;F)Ly0/o;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    invoke-static {v4}, Lo1/s;->N(I)J

    move-result-wide v10

    sget-object v13, Lf2/l;->f:Lf2/l;

    const-string v6, "Downloading..."

    const/4 v7, 0x0

    const/4 v12, 0x0

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

    const v28, 0x30d86

    const/16 v29, 0x0

    const v30, 0x1ffd2

    move-wide/from16 v8, v31

    move-object/from16 v27, v1

    invoke-static/range {v6 .. v30}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    invoke-virtual {v1, v5}, Lm0/q;->t(Z)V

    goto :goto_3

    :cond_4
    move-object v1, v7

    check-cast v1, Lm0/q;

    const v6, -0x2ca1c3f2

    invoke-virtual {v1, v6}, Lm0/q;->Z(I)V

    invoke-static {}, Lo7/d0;->B()Li1/f;

    move-result-object v33

    const/16 v34, 0x0

    const/16 v35, 0x0

    sget-wide v6, Le5/a;->j:J

    const/16 v39, 0xc30

    const/16 v40, 0x4

    move-wide/from16 v36, v6

    move-object/from16 v38, v1

    invoke-static/range {v33 .. v40}, Lk0/e1;->b(Li1/f;Ljava/lang/String;Ly0/o;JLm0/m;II)V

    int-to-float v3, v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/c;->k(Ly0/o;F)Ly0/o;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    invoke-static {v4}, Lo1/s;->N(I)J

    move-result-wide v37

    sget-object v40, Lf2/l;->f:Lf2/l;

    const-string v33, "Download Update"

    const/16 v34, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const-wide/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const v55, 0x30d86

    const/16 v56, 0x0

    const v57, 0x1ffd2

    move-wide/from16 v35, v6

    move-object/from16 v54, v1

    invoke-static/range {v33 .. v57}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    invoke-virtual {v1, v5}, Lm0/q;->t(Z)V

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lr8/s;->a:Lr8/s;

    iget v3, v0, Ls/h;->a:I

    iget-object v4, v0, Ls/h;->b:Ljava/lang/Object;

    packed-switch v3, :pswitch_data_0

    sget-object v3, Ly0/l;->b:Ly0/l;

    const/high16 v5, 0x7fc00000    # Float.NaN

    invoke-static {v3, v5, v5}, Landroidx/compose/foundation/layout/c;->a(Ly0/o;FF)Ly0/o;

    check-cast v4, Lf0/b2;

    iget-wide v3, v4, Lf0/b2;->f:J

    const/16 v5, 0x20

    shr-long v5, v3, v5

    long-to-int v5, v5

    invoke-static/range {p3 .. p4}, Lm2/a;->k(J)I

    move-result v6

    invoke-static/range {p3 .. p4}, Lm2/a;->i(J)I

    move-result v7

    invoke-static {v5, v6, v7}, Lz6/a;->r(III)I

    move-result v10

    const/4 v11, 0x0

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static/range {p3 .. p4}, Lm2/a;->j(J)I

    move-result v4

    invoke-static/range {p3 .. p4}, Lm2/a;->h(J)I

    move-result v5

    invoke-static {v3, v4, v5}, Lz6/a;->r(III)I

    move-result v12

    const/4 v13, 0x0

    const/16 v14, 0xa

    move-wide/from16 v8, p3

    invoke-static/range {v8 .. v14}, Lm2/a;->b(JIIIII)J

    move-result-wide v3

    move-object/from16 v5, p2

    invoke-interface {v5, v3, v4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v3

    iget v4, v3, Lr1/x0;->a:I

    iget v5, v3, Lr1/x0;->b:I

    new-instance v6, Ls/z;

    const/4 v7, 0x5

    invoke-direct {v6, v3, v7}, Ls/z;-><init>(Lr1/x0;I)V

    invoke-interface {v1, v4, v5, v2, v6}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v5, p2

    invoke-interface/range {p2 .. p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v3

    invoke-static {v4}, La7/a;->w(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lr1/q;->q()Z

    move-result v4

    if-nez v4, :cond_0

    iget v4, v3, Lr1/x0;->a:I

    iget v5, v3, Lr1/x0;->b:I

    new-instance v6, Ls/z;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v7}, Ls/z;-><init>(Lr1/x0;I)V

    invoke-interface {v1, v4, v5, v2, v6}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v1

    return-object v1

    :cond_0
    iget v1, v3, Lr1/x0;->a:I

    const/4 v1, 0x0

    throw v1

    :pswitch_1
    move-object/from16 v5, p2

    invoke-interface/range {p2 .. p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v3

    iget v5, v3, Lr1/x0;->a:I

    iget v6, v3, Lr1/x0;->b:I

    new-instance v7, Ls/u;

    check-cast v4, Ls/i0;

    const/4 v8, 0x1

    invoke-direct {v7, v8, v3, v4}, Ls/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v5, v6, v2, v7}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 50

    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lq8/l;->a:Lq8/l;

    iget v4, v0, Ls/h;->a:I

    iget-object v5, v0, Ls/h;->b:Ljava/lang/Object;

    packed-switch v4, :pswitch_data_0

    move-object/from16 v4, p1

    check-cast v4, Ly/v;

    move-object/from16 v6, p2

    check-cast v6, Lm0/m;

    move-object/from16 v7, p3

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    const-string v8, "$this$Card"

    invoke-static {v4, v8}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v7, 0x51

    const/16 v7, 0x10

    if-ne v4, v7, :cond_1

    move-object v4, v6

    check-cast v4, Lm0/q;

    invoke-virtual {v4}, Lm0/q;->G()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lm0/q;->U()V

    goto/16 :goto_d

    :cond_1
    :goto_0
    sget-object v4, Ly0/l;->b:Ly0/l;

    sget-object v7, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    const/16 v8, 0xc

    int-to-float v8, v8

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/a;->l(Ly0/o;F)Ly0/o;

    move-result-object v7

    sget-object v8, Ly0/a;->n:Ly0/f;

    check-cast v5, Lcom/auto/accept/data/model/TransactionData;

    check-cast v6, Lm0/q;

    const v9, 0x2952b718

    invoke-virtual {v6, v9}, Lm0/q;->Z(I)V

    sget-object v9, Ly/k;->a:Ly/d;

    invoke-static {v9, v8, v6}, Ly/z0;->a(Ly/g;Ly0/f;Lm0/m;)Lr1/j0;

    move-result-object v8

    const v11, -0x4ee9b9da

    invoke-virtual {v6, v11}, Lm0/q;->Z(I)V

    iget v9, v6, Lm0/q;->P:I

    invoke-virtual {v6}, Lm0/q;->p()Lm0/r1;

    move-result-object v10

    sget-object v12, Lt1/l;->k:Lt1/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, Lt1/k;->b:Lt1/j;

    invoke-static {v7}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v7

    iget-object v13, v6, Lm0/q;->a:Lm0/d;

    instance-of v15, v13, Lm0/d;

    const/16 v34, 0x0

    if-eqz v15, :cond_10

    invoke-virtual {v6}, Lm0/q;->c0()V

    iget-boolean v13, v6, Lm0/q;->O:Z

    if-eqz v13, :cond_2

    invoke-virtual {v6, v12}, Lm0/q;->o(Lc9/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, Lm0/q;->o0()V

    :goto_1
    sget-object v13, Lt1/k;->e:Lt1/i;

    invoke-static {v6, v8, v13}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v8, Lt1/k;->d:Lt1/i;

    invoke-static {v6, v10, v8}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v10, Lt1/k;->f:Lt1/i;

    iget-boolean v14, v6, Lm0/q;->O:Z

    if-nez v14, :cond_3

    invoke-virtual {v6}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v14, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    invoke-static {v9, v6, v9, v10}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_4
    new-instance v1, Lm0/l2;

    invoke-direct {v1, v6}, Lm0/l2;-><init>(Lm0/m;)V

    invoke-virtual {v7, v1, v6, v2}, Lu0/b;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-virtual {v6, v1}, Lm0/q;->Z(I)V

    invoke-static {}, Ly/a1;->a()Ly0/o;

    move-result-object v7

    const v9, -0x1cd0f17e

    invoke-virtual {v6, v9}, Lm0/q;->Z(I)V

    sget-object v14, Ly/k;->c:Ly/e;

    sget-object v9, Ly0/a;->o:Ly0/e;

    invoke-static {v14, v9, v6}, Ly/u;->a(Ly/i;Ly0/e;Lm0/m;)Lr1/j0;

    move-result-object v9

    invoke-virtual {v6, v11}, Lm0/q;->Z(I)V

    iget v11, v6, Lm0/q;->P:I

    invoke-virtual {v6}, Lm0/q;->p()Lm0/r1;

    move-result-object v1

    invoke-static {v7}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v7

    if-eqz v15, :cond_f

    invoke-virtual {v6}, Lm0/q;->c0()V

    move-object/from16 v16, v14

    iget-boolean v14, v6, Lm0/q;->O:Z

    if-eqz v14, :cond_5

    invoke-virtual {v6, v12}, Lm0/q;->o(Lc9/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v6}, Lm0/q;->o0()V

    :goto_2
    invoke-static {v6, v9, v13}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    invoke-static {v6, v1, v8}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-boolean v1, v6, Lm0/q;->O:Z

    if-nez v1, :cond_7

    invoke-virtual {v6}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    const v1, 0x7ab4aae9

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {v11, v6, v11, v10}, Ll/q;->r(ILm0/q;ILt1/i;)V

    goto :goto_3

    :goto_5
    invoke-static {v6, v7, v6, v2, v1}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    invoke-virtual {v5}, Lcom/auto/accept/data/model/TransactionData;->getPlanType()Ljava/lang/String;

    move-result-object v1

    const-string v7, "_"

    const-string v9, " "

    invoke-static {v1, v7, v9}, Ll9/i;->c1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v7, " Plan"

    invoke-virtual {v1, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    sget-object v1, Lf2/l;->f:Lf2/l;

    sget-wide v35, Le1/r;->c:J

    const/16 v7, 0xd

    invoke-static {v7}, Lo1/s;->N(I)J

    move-result-wide v17

    move-object v7, v13

    move-object/from16 v11, v16

    move-wide/from16 v13, v17

    const/16 v16, 0x0

    move-object/from16 v37, v10

    move-object/from16 v10, v16

    move/from16 v38, v15

    move-object/from16 v15, v16

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v31, 0x30d80

    const/16 v32, 0x0

    const v33, 0x1ffd2

    move-object/from16 v40, v11

    move-object/from16 v39, v12

    move-wide/from16 v11, v35

    move-object/from16 v16, v1

    move-object/from16 v30, v6

    invoke-static/range {v9 .. v33}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    invoke-virtual {v5}, Lcom/auto/accept/data/model/TransactionData;->getOrderId()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    sget-wide v11, Le5/a;->m:J

    const/16 v13, 0xb

    invoke-static {v13}, Lo1/s;->N(I)J

    move-result-wide v13

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    new-instance v41, La2/c0;

    move-object/from16 v29, v41

    const-wide/16 v42, 0x0

    const-wide/16 v44, 0x0

    const/16 v46, 0x0

    sget-object v47, Lf2/e;->c:Lf2/m;

    const/16 v48, 0x0

    const v49, 0xffffdf

    invoke-direct/range {v41 .. v49}, La2/c0;-><init>(JJLf2/l;Lf2/m;Le1/k0;I)V

    const/16 v31, 0xd80

    const/16 v32, 0x0

    const v33, 0xfff2

    move-object/from16 v30, v6

    invoke-static/range {v9 .. v33}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    const v9, 0x60d52604

    invoke-virtual {v6, v9}, Lm0/q;->Z(I)V

    invoke-virtual {v5}, Lcom/auto/accept/data/model/TransactionData;->getCouponCode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    const/16 v35, 0xa

    if-lez v9, :cond_8

    invoke-virtual {v5}, Lcom/auto/accept/data/model/TransactionData;->getCouponCode()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Coupon: "

    invoke-static {v10, v9}, Ll/q;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    sget-wide v11, Le5/a;->a:J

    invoke-static/range {v35 .. v35}, Lo1/s;->N(I)J

    move-result-wide v13

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0xd80

    const/16 v32, 0x0

    const v33, 0x1fff2

    move-object/from16 v30, v6

    invoke-static/range {v9 .. v33}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :cond_8
    const/4 v11, 0x1

    const/4 v9, 0x0

    invoke-static {v6, v9, v9, v11, v9}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-virtual {v6, v9}, Lm0/q;->t(Z)V

    sget-object v9, Ly0/a;->q:Ly0/e;

    const v10, -0x1cd0f17e

    invoke-virtual {v6, v10}, Lm0/q;->Z(I)V

    move-object/from16 v10, v40

    invoke-static {v10, v9, v6}, Ly/u;->a(Ly/i;Ly0/e;Lm0/m;)Lr1/j0;

    move-result-object v9

    const v10, -0x4ee9b9da

    invoke-virtual {v6, v10}, Lm0/q;->Z(I)V

    iget v10, v6, Lm0/q;->P:I

    invoke-virtual {v6}, Lm0/q;->p()Lm0/r1;

    move-result-object v12

    invoke-static {v4}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v4

    if-eqz v38, :cond_e

    invoke-virtual {v6}, Lm0/q;->c0()V

    iget-boolean v13, v6, Lm0/q;->O:Z

    if-eqz v13, :cond_9

    move-object/from16 v13, v39

    invoke-virtual {v6, v13}, Lm0/q;->o(Lc9/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v6}, Lm0/q;->o0()V

    :goto_6
    invoke-static {v6, v9, v7}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    invoke-static {v6, v12, v8}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-boolean v7, v6, Lm0/q;->O:Z

    if-nez v7, :cond_a

    invoke-virtual {v6}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    move-object/from16 v7, v37

    goto :goto_8

    :cond_b
    :goto_7
    const v7, 0x7ab4aae9

    goto :goto_9

    :goto_8
    invoke-static {v10, v6, v10, v7}, Ll/q;->r(ILm0/q;ILt1/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v6, v4, v6, v2, v7}, Ll/q;->u(Lm0/q;Lu0/b;Lm0/q;Ljava/lang/Integer;I)V

    invoke-virtual {v5}, Lcom/auto/accept/data/model/TransactionData;->getAmount()I

    move-result v2

    const-string v4, "\u20b9"

    invoke-static {v4, v2}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5}, Lcom/auto/accept/data/model/TransactionData;->getStatus()Ljava/lang/String;

    move-result-object v2

    const-string v4, "SUCCESS"

    invoke-static {v2, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    sget-wide v7, Le5/a;->o:J

    goto :goto_a

    :cond_c
    sget-wide v7, Le5/a;->n:J

    :goto_a
    const/16 v2, 0xe

    invoke-static {v2}, Lo1/s;->N(I)J

    move-result-wide v13

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v31, 0x30c00

    const/16 v32, 0x0

    const v33, 0x1ffd2

    move v2, v11

    move-wide v11, v7

    move-object/from16 v16, v1

    move-object/from16 v30, v6

    invoke-static/range {v9 .. v33}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    invoke-virtual {v5}, Lcom/auto/accept/data/model/TransactionData;->getStatus()Ljava/lang/String;

    move-result-object v9

    invoke-static/range {v35 .. v35}, Lo1/s;->N(I)J

    move-result-wide v13

    invoke-virtual {v5}, Lcom/auto/accept/data/model/TransactionData;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    sget-wide v4, Le5/a;->o:J

    :goto_b
    move-wide v11, v4

    goto :goto_c

    :cond_d
    sget-wide v4, Le5/a;->n:J

    goto :goto_b

    :goto_c
    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0xc00

    const/16 v32, 0x0

    const v33, 0x1fff2

    move-object/from16 v30, v6

    invoke-static/range {v9 .. v33}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    const/4 v1, 0x0

    invoke-static {v6, v1, v2, v1, v1}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-static {v6, v1, v2, v1, v1}, Ll/q;->v(Lm0/q;ZZZZ)V

    :goto_d
    return-object v3

    :cond_e
    invoke-static {}, Lm9/e0;->C()V

    throw v34

    :cond_f
    invoke-static {}, Lm9/e0;->C()V

    throw v34

    :cond_10
    invoke-static {}, Lm9/e0;->C()V

    throw v34

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ly/a1;

    move-object/from16 v2, p2

    check-cast v2, Lm0/m;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v0, v1, v2, v4}, Ls/h;->b(Ly/a1;Lm0/m;I)V

    return-object v3

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ly/a1;

    move-object/from16 v2, p2

    check-cast v2, Lm0/m;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v0, v1, v2, v4}, Ls/h;->b(Ly/a1;Lm0/m;I)V

    return-object v3

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Lm0/l2;

    iget-object v1, v1, Lm0/l2;->a:Lm0/m;

    move-object/from16 v2, p2

    check-cast v2, Lm0/m;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-object v4, v2

    check-cast v4, Lm0/q;

    iget v4, v4, Lm0/q;->P:I

    check-cast v5, Ly0/o;

    invoke-static {v2, v5}, Lm9/e0;->G(Lm0/m;Ly0/o;)Ly0/o;

    move-result-object v2

    check-cast v1, Lm0/q;

    const v5, 0x1e65194f

    invoke-virtual {v1, v5}, Lm0/q;->Z(I)V

    sget-object v5, Lt1/l;->k:Lt1/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lt1/k;->c:Lt1/i;

    invoke-static {v1, v2, v5}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v2, Lt1/k;->f:Lt1/i;

    iget-boolean v5, v1, Lm0/q;->O:Z

    if-nez v5, :cond_12

    invoke-virtual {v1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    goto :goto_f

    :cond_11
    :goto_e
    const/4 v2, 0x0

    goto :goto_10

    :cond_12
    :goto_f
    invoke-static {v4, v1, v4, v2}, Ll/q;->r(ILm0/q;ILt1/i;)V

    goto :goto_e

    :goto_10
    invoke-virtual {v1, v2}, Lm0/q;->t(Z)V

    return-object v3

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Ly0/o;

    move-object/from16 v2, p2

    check-cast v2, Lm0/m;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    invoke-virtual {v0, v1, v2}, Ls/h;->a(Ly0/o;Lm0/m;)Ly0/o;

    move-result-object v1

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Ly0/o;

    move-object/from16 v2, p2

    check-cast v2, Lm0/m;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    invoke-virtual {v0, v1, v2}, Ls/h;->a(Ly0/o;Lm0/m;)Ly0/o;

    move-result-object v1

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Lr1/l0;

    move-object/from16 v2, p2

    check-cast v2, Lr1/i0;

    move-object/from16 v3, p3

    check-cast v3, Lm2/a;

    iget-wide v3, v3, Lm2/a;->a:J

    invoke-virtual {v0, v1, v2, v3, v4}, Ls/h;->d(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object v1

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Ly0/o;

    move-object/from16 v2, p2

    check-cast v2, Lm0/m;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    invoke-virtual {v0, v1, v2}, Ls/h;->a(Ly0/o;Lm0/m;)Ly0/o;

    move-result-object v1

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Ly0/o;

    move-object/from16 v2, p2

    check-cast v2, Lm0/m;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    invoke-virtual {v0, v1, v2}, Ls/h;->a(Ly0/o;Lm0/m;)Ly0/o;

    move-result-object v1

    return-object v1

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Lr1/l0;

    move-object/from16 v2, p2

    check-cast v2, Lr1/i0;

    move-object/from16 v3, p3

    check-cast v3, Lm2/a;

    iget-wide v3, v3, Lm2/a;->a:J

    invoke-virtual {v0, v1, v2, v3, v4}, Ls/h;->d(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object v1

    return-object v1

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Lr1/l0;

    move-object/from16 v2, p2

    check-cast v2, Lr1/i0;

    move-object/from16 v3, p3

    check-cast v3, Lm2/a;

    iget-wide v3, v3, Lm2/a;->a:J

    invoke-virtual {v0, v1, v2, v3, v4}, Ls/h;->d(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
