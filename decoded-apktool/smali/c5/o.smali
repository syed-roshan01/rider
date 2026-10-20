.class public final Lc5/o;
.super Ld9/j;

# interfaces
.implements Lc9/g;


# instance fields
.field public final synthetic a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final synthetic b:Lm0/g1;

.field public final synthetic c:Lm0/l3;

.field public final synthetic d:Lm0/l3;

.field public final synthetic e:Lm0/l3;


# direct methods
.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/g1;Lm0/g1;Lm0/g1;Lm0/g1;)V
    .locals 0

    iput-object p1, p0, Lc5/o;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lc5/o;->b:Lm0/g1;

    iput-object p3, p0, Lc5/o;->c:Lm0/l3;

    iput-object p4, p0, Lc5/o;->d:Lm0/l3;

    iput-object p5, p0, Lc5/o;->e:Lm0/l3;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ls/q;

    move-object/from16 v2, p2

    check-cast v2, Lf5/h;

    move-object/from16 v3, p3

    check-cast v3, Lm0/m;

    move-object/from16 v4, p4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    const-string v4, "$this$AnimatedContent"

    invoke-static {v1, v4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "state"

    invoke-static {v2, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v2, Lf5/d;

    sget-object v4, Lq8/l;->a:Lq8/l;

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    check-cast v3, Lm0/q;

    const v1, -0x34e00e81    # -1.0482047E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    invoke-static {v3, v5}, Ly3/e;->d(Lm0/m;I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto/16 :goto_5

    :cond_0
    instance-of v1, v2, Lf5/f;

    sget-object v6, Lm0/l;->a:Lk0/y0;

    const/16 v7, 0x38

    const/4 v8, 0x1

    iget-object v9, v0, Lc5/o;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, v2, Lf5/c;

    if-eqz v1, :cond_5

    :goto_0
    check-cast v3, Lm0/q;

    const v1, -0x34e00dfb    # -1.0482181E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    iget-object v1, v0, Lc5/o;->b:Lm0/g1;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    const v2, -0x34e00dd9    # -1.0482215E7f

    invoke-virtual {v3, v2}, Lm0/q;->Z(I)V

    const v2, -0x34e00d5a    # -1.0482342E7f

    invoke-virtual {v3, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_2

    invoke-static {v5, v1, v3}, Lu/k1;->b(ILm0/g1;Lm0/q;)Lc5/m;

    move-result-object v2

    :cond_2
    check-cast v2, Lc9/a;

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    invoke-static {v9, v2, v3, v7}, Ly3/e;->u(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lc9/a;Lm0/m;I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto :goto_1

    :cond_3
    const v2, -0x34e00d16    # -1.048241E7f

    invoke-virtual {v3, v2}, Lm0/q;->Z(I)V

    const v2, -0x34e00c97    # -1.0482537E7f

    invoke-virtual {v3, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_4

    invoke-static {v8, v1, v3}, Lu/k1;->b(ILm0/g1;Lm0/q;)Lc5/m;

    move-result-object v2

    :cond_4
    check-cast v2, Lc9/a;

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    invoke-static {v9, v2, v3, v7}, Ly3/e;->e(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lc9/a;Lm0/m;I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    :goto_1
    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto/16 :goto_5

    :cond_5
    instance-of v1, v2, Lf5/b;

    const/16 v10, 0x8

    if-eqz v1, :cond_6

    check-cast v3, Lm0/q;

    const v1, -0x34e00c10    # -1.0482672E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    check-cast v2, Lf5/b;

    iget-object v1, v2, Lf5/b;->a:Ljava/lang/String;

    invoke-static {v9, v1, v3, v10}, Lf6/a;->e(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lm0/m;I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto/16 :goto_5

    :cond_6
    instance-of v1, v2, Lf5/g;

    if-eqz v1, :cond_7

    check-cast v3, Lm0/q;

    const v1, -0x34e00ae0

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    invoke-static {v9, v3, v10}, Ly3/e;->z(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto/16 :goto_5

    :cond_7
    instance-of v1, v2, Lf5/a;

    if-eqz v1, :cond_8

    check-cast v3, Lm0/q;

    const v1, -0x34e00a69    # -1.0483095E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    invoke-static {v9, v3, v10}, Ly3/e;->b(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto/16 :goto_5

    :cond_8
    instance-of v1, v2, Lf5/e;

    if-eqz v1, :cond_f

    check-cast v3, Lm0/q;

    const v1, -0x34e009f1    # -1.0483215E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    iget-object v1, v0, Lc5/o;->c:Lm0/l3;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, v0, Lc5/o;->d:Lm0/l3;

    if-eqz v1, :cond_9

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    cmp-long v1, v11, v13

    if-lez v1, :cond_9

    move v1, v8

    goto :goto_2

    :cond_9
    move v1, v5

    :goto_2
    iget-object v11, v0, Lc5/o;->e:Lm0/l3;

    invoke-interface {v11}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "SUCCESS"

    invoke-static {v11, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    nop

    const v1, -0x34e0090f    # -1.0483441E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    new-instance v1, Lc5/n;

    const/4 v2, 0x0

    invoke-direct {v1, v9, v2}, Lc5/n;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    invoke-static {v4, v1, v3}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    invoke-static {v9, v3, v10}, Ld5/o1;->f(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto/16 :goto_4

    :cond_a
    if-eqz v1, :cond_d

    const v1, -0x34e007f6    # -1.0483722E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    iget-object v1, v9, Lcom/auto/accept/ui/viewmodel/MainViewModel;->H0:Lp9/z;

    invoke-static {v1, v3}, Ld7/t;->I(Lp9/z;Lm0/m;)Lm0/g1;

    move-result-object v1

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_c

    const v1, -0x34e00775    # -1.0483851E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    iget-object v1, v9, Lcom/auto/accept/ui/viewmodel/MainViewModel;->F0:Lp9/z;

    invoke-static {v1, v3}, Ld7/t;->I(Lp9/z;Lm0/m;)Lm0/g1;

    move-result-object v1

    const v2, -0x34e006e4

    invoke-virtual {v3, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_b

    invoke-virtual {v9}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->m()Lq8/f;

    move-result-object v2

    invoke-virtual {v3, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lq8/f;

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    iget-object v6, v2, Lq8/f;->a:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v12

    iget-object v2, v2, Lq8/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v13

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/util/List;

    new-instance v14, Lc5/j;

    const/4 v1, 0x2

    invoke-direct {v14, v9, v1}, Lc5/j;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;I)V

    new-instance v15, Lc5/j;

    const/4 v1, 0x3

    invoke-direct {v15, v9, v1}, Lc5/j;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;I)V

    const/16 v17, 0x8

    move-object/from16 v16, v3

    invoke-static/range {v11 .. v17}, Ly3/e;->t(Ljava/util/List;IILc9/a;Lc9/a;Lm0/m;I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto :goto_3

    :cond_c
    const v1, -0x34e0051c    # -1.0484452E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    invoke-static {v9, v3, v10}, Ld5/o1;->f(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    :goto_3
    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto :goto_4

    :cond_d
    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v2, v10, v12

    if-lez v2, :cond_e

    if-nez v1, :cond_e

    const v1, -0x34e00484    # -1.0484604E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    invoke-static {v9, v8, v3, v7, v5}, Ly3/e;->y(Lcom/auto/accept/ui/viewmodel/MainViewModel;ZLm0/m;II)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto :goto_4

    :cond_e
    const v1, -0x34e003ca    # -1.048479E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    invoke-static {v9, v5, v3, v7, v5}, Ly3/e;->y(Lcom/auto/accept/ui/viewmodel/MainViewModel;ZLm0/m;II)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    :goto_4
    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    goto :goto_5

    :cond_f
    check-cast v3, Lm0/q;

    const v1, -0x34e00302    # -1.048499E7f

    invoke-virtual {v3, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v3, v5}, Lm0/q;->t(Z)V

    :goto_5
    return-object v4
.end method
