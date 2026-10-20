.class public final Lb/d;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p6, p0, Lb/d;->a:I

    iput-object p1, p0, Lb/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb/d;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb/d;->d:Ljava/lang/Object;

    iput-object p4, p0, Lb/d;->e:Ljava/lang/Object;

    iput-object p5, p0, Lb/d;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lo2/r;Lc9/a;Lo2/u;Ljava/lang/String;Lm2/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb/d;->a:I

    iput-object p1, p0, Lb/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb/d;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb/d;->e:Ljava/lang/Object;

    iput-object p4, p0, Lb/d;->d:Ljava/lang/Object;

    iput-object p5, p0, Lb/d;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/o0;)Lm0/n0;
    .locals 6

    iget p1, p0, Lb/d;->a:I

    iget-object v0, p0, Lb/d;->f:Ljava/lang/Object;

    iget-object v1, p0, Lb/d;->d:Ljava/lang/Object;

    iget-object v2, p0, Lb/d;->e:Ljava/lang/Object;

    iget-object v3, p0, Lb/d;->c:Ljava/lang/Object;

    iget-object v4, p0, Lb/d;->b:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v4, Lo2/r;

    iget-object p1, v4, Lo2/r;->v:Landroid/view/WindowManager$LayoutParams;

    iget-object v5, v4, Lo2/r;->u:Landroid/view/WindowManager;

    invoke-interface {v5, v4, p1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    check-cast v3, Lc9/a;

    check-cast v2, Lo2/u;

    check-cast v1, Ljava/lang/String;

    check-cast v0, Lm2/l;

    invoke-virtual {v4, v3, v2, v1, v0}, Lo2/r;->i(Lc9/a;Lo2/u;Ljava/lang/String;Lm2/l;)V

    new-instance p1, Lb/c;

    const/16 v0, 0x8

    invoke-direct {p1, v4, v0}, Lb/c;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_0
    check-cast v4, Lb/a;

    check-cast v3, Ld/i;

    check-cast v1, Ljava/lang/String;

    check-cast v2, Le/b;

    check-cast v0, Lm0/l3;

    new-instance p1, Lb/b;

    const/4 v5, 0x0

    invoke-direct {p1, v0, v5}, Lb/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v1, v2, p1}, Ld/i;->d(Ljava/lang/String;Le/b;Ld/c;)Ld/f;

    move-result-object p1

    iput-object p1, v4, Lb/a;->a:Ld/d;

    new-instance p1, Lb/c;

    invoke-direct {p1, v4, v5}, Lb/c;-><init>(Ljava/lang/Object;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lq8/l;->a:Lq8/l;

    iget v2, v0, Lb/d;->a:I

    iget-object v3, v0, Lb/d;->e:Ljava/lang/Object;

    iget-object v4, v0, Lb/d;->d:Ljava/lang/Object;

    iget-object v5, v0, Lb/d;->c:Ljava/lang/Object;

    iget-object v6, v0, Lb/d;->b:Ljava/lang/Object;

    iget-object v7, v0, Lb/d;->f:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    check-cast v5, Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v6

    if-eqz v2, :cond_3

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v5, v2, Ljava/util/Collection;

    if-eqz v5, :cond_0

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const-string v2, "Turn on at least one app in the Apps tab first."

    goto :goto_2

    :cond_3
    :goto_1
    const-string v2, "Ola/Uber need Shizuku running. Review your app selection in the Apps tab."

    :goto_2
    check-cast v4, Landroid/content/Context;

    invoke-static {v4, v2, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    check-cast v3, Lc9/a;

    invoke-interface {v3}, Lc9/a;->invoke()Ljava/lang/Object;

    goto :goto_3

    :cond_4
    check-cast v7, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-virtual {v7, v6}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->r(Z)V

    goto :goto_3

    :cond_5
    check-cast v7, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->r(Z)V

    :goto_3
    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lm0/o0;

    invoke-virtual {v0, v1}, Lb/d;->a(Lm0/o0;)Lm0/n0;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v2, p1

    check-cast v2, Lg1/e;

    move-object v8, v2

    check-cast v8, Lt1/i0;

    invoke-virtual {v8}, Lt1/i0;->a()V

    check-cast v6, Lt/d;

    invoke-virtual {v6}, Lt/d;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v6, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v2, v6, v9}, Lz6/a;->q(FFF)F

    move-result v16

    cmpg-float v2, v16, v6

    if-nez v2, :cond_6

    goto :goto_5

    :cond_6
    check-cast v5, Lg2/s;

    check-cast v4, Lg2/a0;

    iget-wide v9, v4, Lg2/a0;->b:J

    sget v2, La2/b0;->c:I

    const/16 v2, 0x20

    shr-long/2addr v9, v2

    long-to-int v2, v9

    invoke-interface {v5, v2}, Lg2/s;->b(I)I

    move-result v2

    check-cast v3, Lf0/c2;

    invoke-virtual {v3}, Lf0/c2;->d()Lf0/d2;

    move-result-object v3

    if-eqz v3, :cond_7

    iget-object v3, v3, Lf0/d2;->a:La2/a0;

    if-eqz v3, :cond_7

    invoke-virtual {v3, v2}, La2/a0;->c(I)Ld1/d;

    move-result-object v2

    goto :goto_4

    :cond_7
    new-instance v2, Ld1/d;

    invoke-direct {v2, v6, v6, v6, v6}, Ld1/d;-><init>(FFFF)V

    :goto_4
    sget v3, Lf0/n1;->b:F

    invoke-virtual {v8, v3}, Lt1/i0;->v(F)F

    move-result v14

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float v3, v14, v3

    iget v4, v2, Ld1/d;->a:F

    add-float/2addr v4, v3

    iget-object v5, v8, Lt1/i0;->a:Lg1/c;

    invoke-interface {v5}, Lg1/g;->e()J

    move-result-wide v5

    invoke-static {v5, v6}, Ld1/f;->d(J)F

    move-result v5

    sub-float/2addr v5, v3

    invoke-static {v4, v5}, Lz6/a;->o(FF)F

    move-result v4

    invoke-static {v4, v3}, Lz6/a;->m(FF)F

    move-result v3

    iget v4, v2, Ld1/d;->b:F

    invoke-static {v3, v4}, Ld9/i;->f(FF)J

    move-result-wide v10

    iget v2, v2, Ld1/d;->d:F

    invoke-static {v3, v2}, Ld9/i;->f(FF)J

    move-result-wide v12

    move-object v9, v7

    check-cast v9, Le1/n;

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x3

    invoke-virtual/range {v8 .. v18}, Lt1/i0;->d(Le1/n;JJFIFLe1/l;I)V

    :goto_5
    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Lm0/o0;

    invoke-virtual {v0, v1}, Lb/d;->a(Lm0/o0;)Lm0/n0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
