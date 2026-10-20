.class public final Lu/r0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lu/r0;->a:I

    iput-object p2, p0, Lu/r0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lu/r0;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/node/a;Ld9/u;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lu/r0;->a:I

    iput-object p1, p0, Lu/r0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lu/r0;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    sget-object v0, Lq8/l;->a:Lq8/l;

    const/4 v1, 0x0

    iget v2, p0, Lu/r0;->a:I

    iget-object v3, p0, Lu/r0;->c:Ljava/lang/Object;

    iget-object v4, p0, Lu/r0;->b:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    .line 1
    :pswitch_0
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 2
    :pswitch_1
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 3
    :pswitch_2
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    :pswitch_3
    check-cast v4, Lc9/a;

    if-eqz v4, :cond_0

    .line 4
    invoke-interface {v4}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/c;

    if-nez v0, :cond_1

    :cond_0
    check-cast v3, Landroidx/activity/p;

    invoke-virtual {v3}, Landroidx/activity/p;->getDefaultViewModelCreationExtras()Lq3/c;

    move-result-object v0

    :cond_1
    return-object v0

    .line 5
    :pswitch_4
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 6
    :pswitch_5
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 7
    :pswitch_6
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 8
    :pswitch_7
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 9
    :pswitch_8
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 10
    :pswitch_9
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 11
    :pswitch_a
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 12
    :pswitch_b
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    .line 13
    :pswitch_c
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    :pswitch_d
    check-cast v4, Lh0/v0;

    check-cast v3, Lm0/g1;

    .line 14
    invoke-interface {v3}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/k;

    .line 15
    iget-wide v2, v0, Lm2/k;->a:J

    .line 16
    invoke-virtual {v4}, Lh0/v0;->i()Ld1/c;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 17
    iget-object v5, v4, Lh0/v0;->d:Lf0/c2;

    if-eqz v5, :cond_2

    .line 18
    iget-object v5, v5, Lf0/c2;->a:Lf0/j1;

    if-eqz v5, :cond_2

    .line 19
    iget-object v1, v5, Lf0/j1;->a:La2/e;

    :cond_2
    if-eqz v1, :cond_d

    .line 20
    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_5

    .line 21
    :cond_3
    iget-object v1, v4, Lh0/v0;->o:Lm0/n1;

    .line 22
    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf0/n0;

    const/4 v5, -0x1

    if-nez v1, :cond_4

    move v1, v5

    goto :goto_0

    .line 23
    :cond_4
    sget-object v6, Lh0/y0;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v6, v1

    :goto_0
    if-eq v1, v5, :cond_c

    const/4 v5, 0x1

    const/16 v6, 0x20

    const/4 v7, 0x2

    if-eq v1, v5, :cond_6

    if-eq v1, v7, :cond_6

    const/4 v5, 0x3

    if-ne v1, v5, :cond_5

    .line 24
    invoke-virtual {v4}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    .line 25
    iget-wide v8, v1, Lg2/a0;->b:J

    .line 26
    sget v1, La2/b0;->c:I

    const-wide v10, 0xffffffffL

    and-long/2addr v8, v10

    :goto_1
    long-to-int v1, v8

    goto :goto_2

    :cond_5
    new-instance v0, Landroidx/fragment/app/a0;

    .line 27
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 28
    throw v0

    .line 29
    :cond_6
    invoke-virtual {v4}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    .line 30
    iget-wide v8, v1, Lg2/a0;->b:J

    .line 31
    sget v1, La2/b0;->c:I

    shr-long/2addr v8, v6

    goto :goto_1

    .line 32
    :goto_2
    iget-object v5, v4, Lh0/v0;->d:Lf0/c2;

    if-eqz v5, :cond_b

    .line 33
    invoke-virtual {v5}, Lf0/c2;->d()Lf0/d2;

    move-result-object v5

    if-nez v5, :cond_7

    goto :goto_4

    .line 34
    :cond_7
    iget-object v8, v4, Lh0/v0;->d:Lf0/c2;

    if-eqz v8, :cond_a

    .line 35
    iget-object v8, v8, Lf0/c2;->a:Lf0/j1;

    if-eqz v8, :cond_a

    .line 36
    iget-object v8, v8, Lf0/j1;->a:La2/e;

    if-nez v8, :cond_8

    goto :goto_3

    .line 37
    :cond_8
    iget-object v4, v4, Lh0/v0;->b:Lg2/s;

    .line 38
    invoke-interface {v4, v1}, Lg2/s;->b(I)I

    move-result v1

    .line 39
    iget-object v4, v8, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v8, 0x0

    .line 40
    invoke-static {v1, v8, v4}, Lz6/a;->r(III)I

    move-result v1

    .line 41
    iget-wide v8, v0, Ld1/c;->a:J

    invoke-virtual {v5, v8, v9}, Lf0/d2;->d(J)J

    move-result-wide v8

    invoke-static {v8, v9}, Ld1/c;->d(J)F

    move-result v0

    .line 42
    iget-object v4, v5, Lf0/d2;->a:La2/a0;

    invoke-virtual {v4, v1}, La2/a0;->f(I)I

    move-result v1

    .line 43
    invoke-virtual {v4, v1}, La2/a0;->h(I)F

    move-result v5

    .line 44
    invoke-virtual {v4, v1}, La2/a0;->i(I)F

    move-result v8

    .line 45
    invoke-static {v5, v8}, Ljava/lang/Math;->min(FF)F

    move-result v9

    .line 46
    invoke-static {v5, v8}, Ljava/lang/Math;->max(FF)F

    move-result v5

    .line 47
    invoke-static {v0, v9, v5}, Lz6/a;->q(FFF)F

    move-result v5

    sub-float/2addr v0, v5

    .line 48
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    shr-long/2addr v2, v6

    long-to-int v2, v2

    div-int/2addr v2, v7

    int-to-float v2, v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_9

    .line 49
    sget-wide v0, Ld1/c;->d:J

    goto :goto_6

    .line 50
    :cond_9
    invoke-virtual {v4, v1}, La2/a0;->k(I)F

    move-result v0

    .line 51
    invoke-virtual {v4, v1}, La2/a0;->d(I)F

    move-result v1

    sub-float/2addr v1, v0

    int-to-float v2, v7

    div-float/2addr v1, v2

    add-float/2addr v1, v0

    .line 52
    invoke-static {v5, v1}, Ld9/i;->f(FF)J

    move-result-wide v0

    goto :goto_6

    .line 53
    :cond_a
    :goto_3
    sget-wide v0, Ld1/c;->d:J

    goto :goto_6

    .line 54
    :cond_b
    :goto_4
    sget-wide v0, Ld1/c;->d:J

    goto :goto_6

    .line 55
    :cond_c
    sget-wide v0, Ld1/c;->d:J

    goto :goto_6

    .line 56
    :cond_d
    :goto_5
    sget-wide v0, Ld1/c;->d:J

    goto :goto_6

    .line 57
    :cond_e
    sget-wide v0, Ld1/c;->d:J

    .line 58
    :goto_6
    new-instance v2, Ld1/c;

    invoke-direct {v2, v0, v1}, Ld1/c;-><init>(J)V

    return-object v2

    :pswitch_e
    check-cast v4, Lf0/c2;

    .line 59
    iget-object v0, v4, Lf0/c2;->u:Lf0/v;

    check-cast v3, Lg2/o;

    .line 60
    iget v1, v3, Lg2/o;->e:I

    .line 61
    new-instance v2, Lg2/n;

    invoke-direct {v2, v1}, Lg2/n;-><init>(I)V

    .line 62
    invoke-virtual {v0, v2}, Lf0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    .line 63
    :pswitch_f
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    :pswitch_10
    check-cast v4, Ld1/d;

    if-nez v4, :cond_f

    check-cast v3, Lc0/g;

    .line 64
    invoke-virtual {v3}, Lc0/a;->G0()Lr1/s;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-interface {v0}, Lr1/s;->M()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo1/s;->m0(J)J

    move-result-wide v0

    .line 65
    sget-wide v2, Ld1/c;->b:J

    .line 66
    invoke-static {v2, v3, v0, v1}, Lm9/e0;->h(JJ)Ld1/d;

    move-result-object v1

    goto :goto_7

    :cond_f
    move-object v1, v4

    :cond_10
    :goto_7
    return-object v1

    :pswitch_11
    check-cast v4, Lm0/l3;

    .line 67
    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/r;

    .line 68
    new-instance v1, La0/r0;

    check-cast v3, Lb0/h0;

    .line 69
    iget-object v2, v3, Lb0/h0;->e:Lb0/a0;

    .line 70
    iget-object v2, v2, Lb0/a0;->f:La0/y;

    .line 71
    invoke-virtual {v2}, La0/y;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li9/g;

    .line 72
    invoke-direct {v1, v2, v0}, La0/r0;-><init>(Li9/g;Lh6/g;)V

    .line 73
    new-instance v2, Lb0/t;

    invoke-direct {v2, v3, v0, v1}, Lb0/t;-><init>(Lb0/h0;Lb0/r;La0/r0;)V

    return-object v2

    .line 74
    :pswitch_12
    invoke-virtual {p0}, Lu/r0;->invoke()V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final invoke()V
    .locals 10

    iget v0, p0, Lu/r0;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v4, p0, Lu/r0;->c:Ljava/lang/Object;

    iget-object v5, p0, Lu/r0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast v5, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    check-cast v4, Lcom/auto/accept/data/model/TransactionData;

    .line 75
    invoke-virtual {v4}, Lcom/auto/accept/data/model/TransactionData;->getOrderId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/auto/accept/data/model/TransactionData;->getPlanType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lcom/auto/accept/data/model/TransactionData;->getAmount()I

    move-result v3

    .line 76
    invoke-virtual {v5, v3, v0, v2, v1}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->v(ILjava/lang/String;Ljava/lang/String;Z)V

    return-void

    :pswitch_1
    check-cast v5, Lm9/d0;

    .line 77
    new-instance v0, Ld5/u0;

    check-cast v4, Lb0/h0;

    invoke-direct {v0, v4, v2}, Ld5/u0;-><init>(Lb0/h0;Lu8/e;)V

    const/4 v3, 0x3

    invoke-static {v5, v2, v1, v0, v3}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    return-void

    .line 78
    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    check-cast v4, Landroid/content/Context;

    .line 79
    invoke-virtual {v4, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :pswitch_3
    check-cast v5, Lu1/r2;

    .line 80
    iget-object v0, v5, Lu1/r2;->e:Ly1/h;

    .line 81
    iget-object v1, v5, Lu1/r2;->f:Ly1/h;

    .line 82
    iget-object v2, v5, Lu1/r2;->c:Ljava/lang/Float;

    .line 83
    iget-object v3, v5, Lu1/r2;->d:Ljava/lang/Float;

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    .line 84
    iget-object v7, v0, Ly1/h;->a:Lc9/a;

    invoke-interface {v7}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sub-float/2addr v7, v2

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    if-eqz v1, :cond_1

    if-eqz v3, :cond_1

    .line 85
    iget-object v2, v1, Ly1/h;->a:Lc9/a;

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    sub-float/2addr v2, v3

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    cmpg-float v3, v7, v6

    if-nez v3, :cond_2

    cmpg-float v2, v2, v6

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    check-cast v4, Lu1/p0;

    .line 86
    sget-object v2, Lu1/p0;->X:[I

    .line 87
    iget v2, v5, Lu1/r2;->a:I

    invoke-virtual {v4, v2}, Lu1/p0;->E(I)I

    move-result v2

    .line 88
    invoke-virtual {v4}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v3

    .line 89
    iget v6, v4, Lu1/p0;->t:I

    .line 90
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu1/s2;

    if-eqz v3, :cond_3

    .line 91
    :try_start_0
    iget-object v6, v4, Lu1/p0;->u:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-eqz v6, :cond_3

    .line 92
    invoke-virtual {v4, v3}, Lu1/p0;->j(Lu1/s2;)Landroid/graphics/Rect;

    move-result-object v3

    .line 93
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :catch_0
    :cond_3
    iget-object v3, v4, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 95
    invoke-virtual {v4}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v3

    .line 96
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu1/s2;

    if-eqz v3, :cond_6

    iget-object v3, v3, Lu1/s2;->a:Ly1/o;

    if-eqz v3, :cond_6

    iget-object v3, v3, Ly1/o;->c:Landroidx/compose/ui/node/a;

    if-eqz v3, :cond_6

    if-eqz v0, :cond_4

    .line 97
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 98
    iget-object v7, v4, Lu1/p0;->w:Ljava/util/HashMap;

    .line 99
    invoke-virtual {v7, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    if-eqz v1, :cond_5

    .line 100
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 101
    iget-object v6, v4, Lu1/p0;->x:Ljava/util/HashMap;

    .line 102
    invoke-virtual {v6, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    :cond_5
    invoke-virtual {v4, v3}, Lu1/p0;->A(Landroidx/compose/ui/node/a;)V

    :cond_6
    :goto_2
    if-eqz v0, :cond_7

    .line 104
    iget-object v0, v0, Ly1/h;->a:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    .line 105
    iput-object v0, v5, Lu1/r2;->c:Ljava/lang/Float;

    :cond_7
    if-eqz v1, :cond_8

    .line 106
    iget-object v0, v1, Ly1/h;->a:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    .line 107
    iput-object v0, v5, Lu1/r2;->d:Ljava/lang/Float;

    :cond_8
    return-void

    :pswitch_4
    check-cast v5, Lt1/c1;

    check-cast v4, Le1/p;

    .line 108
    sget-object v0, Lt1/c1;->I:Le1/i0;

    .line 109
    invoke-virtual {v5, v4}, Lt1/c1;->E0(Le1/p;)V

    return-void

    :pswitch_5
    check-cast v5, Lt1/n0;

    .line 110
    invoke-virtual {v5}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    .line 111
    iget-object v0, v0, Lt1/c1;->r:Lt1/c1;

    if-eqz v0, :cond_9

    .line 112
    iget-object v0, v0, Lt1/q0;->o:Lr1/g0;

    if-nez v0, :cond_a

    .line 113
    :cond_9
    iget-object v0, v5, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-static {v0}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getPlacementScope()Lr1/w0;

    move-result-object v0

    :cond_a
    check-cast v4, Lt1/l0;

    .line 114
    iget-object v1, v4, Lt1/l0;->H:Lc9/c;

    if-nez v1, :cond_b

    .line 115
    invoke-virtual {v5}, Lt1/n0;->a()Lt1/c1;

    move-result-object v1

    .line 116
    iget-wide v2, v4, Lt1/l0;->I:J

    .line 117
    iget v4, v4, Lt1/l0;->J:F

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v3, v4}, Lr1/w0;->e(Lr1/x0;JF)V

    goto :goto_3

    .line 119
    :cond_b
    invoke-virtual {v5}, Lt1/n0;->a()Lt1/c1;

    move-result-object v2

    .line 120
    iget-wide v5, v4, Lt1/l0;->I:J

    .line 121
    iget v3, v4, Lt1/l0;->J:F

    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v5, v6, v3, v1}, Lr1/w0;->l(Lr1/x0;JFLc9/c;)V

    :goto_3
    return-void

    :pswitch_6
    check-cast v4, Landroidx/compose/ui/node/a;

    .line 123
    iget-object v0, v4, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    check-cast v5, Ld9/u;

    .line 124
    iget-object v4, v0, Lt1/x0;->e:Ly0/n;

    .line 125
    iget v4, v4, Ly0/n;->d:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_16

    .line 126
    iget-object v0, v0, Lt1/x0;->d:Lt1/s1;

    :goto_4
    if-eqz v0, :cond_16

    .line 127
    iget v4, v0, Ly0/n;->c:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_15

    move-object v4, v0

    move-object v6, v2

    :goto_5
    if-eqz v4, :cond_15

    .line 128
    instance-of v7, v4, Lt1/r1;

    if-eqz v7, :cond_e

    .line 129
    check-cast v4, Lt1/r1;

    .line 130
    invoke-interface {v4}, Lt1/r1;->c0()Z

    move-result v7

    if-eqz v7, :cond_c

    .line 131
    new-instance v7, Ly1/j;

    invoke-direct {v7}, Ly1/j;-><init>()V

    iput-object v7, v5, Ld9/u;->a:Ljava/lang/Object;

    iput-boolean v3, v7, Ly1/j;->c:Z

    .line 132
    :cond_c
    invoke-interface {v4}, Lt1/r1;->d0()Z

    move-result v7

    if-eqz v7, :cond_d

    .line 133
    iget-object v7, v5, Ld9/u;->a:Ljava/lang/Object;

    check-cast v7, Ly1/j;

    .line 134
    iput-boolean v3, v7, Ly1/j;->b:Z

    .line 135
    :cond_d
    iget-object v7, v5, Ld9/u;->a:Ljava/lang/Object;

    check-cast v7, Ly1/j;

    invoke-interface {v4, v7}, Lt1/r1;->Q(Ly1/j;)V

    goto :goto_8

    .line 136
    :cond_e
    iget v7, v4, Ly0/n;->c:I

    and-int/lit8 v7, v7, 0x8

    if-eqz v7, :cond_14

    .line 137
    instance-of v7, v4, Lt1/o;

    if-eqz v7, :cond_14

    .line 138
    move-object v7, v4

    check-cast v7, Lt1/o;

    .line 139
    iget-object v7, v7, Lt1/o;->v:Ly0/n;

    move v8, v1

    :goto_6
    if-eqz v7, :cond_13

    .line 140
    iget v9, v7, Ly0/n;->c:I

    and-int/lit8 v9, v9, 0x8

    if-eqz v9, :cond_12

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v3, :cond_f

    move-object v4, v7

    goto :goto_7

    :cond_f
    if-nez v6, :cond_10

    .line 141
    new-instance v6, Lo0/i;

    const/16 v9, 0x10

    new-array v9, v9, [Ly0/n;

    invoke-direct {v6, v9}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_10
    if-eqz v4, :cond_11

    .line 142
    invoke-virtual {v6, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v4, v2

    .line 143
    :cond_11
    invoke-virtual {v6, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    .line 144
    :cond_12
    :goto_7
    iget-object v7, v7, Ly0/n;->f:Ly0/n;

    goto :goto_6

    :cond_13
    if-ne v8, v3, :cond_14

    goto :goto_5

    .line 145
    :cond_14
    :goto_8
    invoke-static {v6}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v4

    goto :goto_5

    .line 146
    :cond_15
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_4

    :cond_16
    return-void

    :pswitch_7
    check-cast v5, Ld9/u;

    check-cast v4, Lc1/p;

    .line 147
    invoke-virtual {v4}, Lc1/p;->G0()Lc1/i;

    move-result-object v0

    iput-object v0, v5, Ld9/u;->a:Ljava/lang/Object;

    return-void

    :pswitch_8
    check-cast v5, Lb1/c;

    .line 148
    iget-object v0, v5, Lb1/c;->w:Lc9/c;

    check-cast v4, Lb1/d;

    .line 149
    invoke-interface {v0, v4}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_9
    check-cast v5, Lo0/d;

    check-cast v4, Lm0/e0;

    .line 150
    iget-object v0, v5, Lo0/d;->b:[Ljava/lang/Object;

    .line 151
    iget v2, v5, Lo0/d;->a:I

    :goto_9
    if-ge v1, v2, :cond_17

    .line 152
    aget-object v3, v0, v1

    const-string v5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v3, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v4

    check-cast v5, Lm0/x;

    .line 153
    invoke-virtual {v5, v3}, Lm0/x;->z(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_17
    return-void

    :pswitch_a
    check-cast v5, Lm0/q;

    check-cast v4, Lm0/c1;

    .line 154
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v0, v1}, Lm0/q;->b(Lm0/q;Lm0/r1;Ljava/lang/Object;)V

    return-void

    :pswitch_b
    check-cast v5, Lk0/x2;

    check-cast v4, Lk0/a1;

    .line 156
    iget-object v0, v4, Lk0/a1;->a:Ljava/lang/Object;

    .line 157
    invoke-static {v5, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    .line 158
    iget-object v0, v4, Lk0/a1;->b:Ljava/util/ArrayList;

    .line 159
    new-instance v1, Lk0/t2;

    invoke-direct {v1, v5, v3}, Lk0/t2;-><init>(Lk0/x2;I)V

    invoke-static {v0, v1}, Lr8/n;->C0(Ljava/util/ArrayList;Lc9/c;)V

    .line 160
    iget-object v0, v4, Lk0/a1;->c:Lm0/w1;

    if-eqz v0, :cond_18

    check-cast v0, Lm0/x1;

    .line 161
    iget-object v1, v0, Lm0/x1;->b:Lm0/y1;

    if-eqz v1, :cond_18

    invoke-interface {v1, v0, v2}, Lm0/y1;->c(Lm0/x1;Ljava/lang/Object;)I

    :cond_18
    return-void

    :pswitch_c
    check-cast v5, Lg2/a0;

    .line 162
    iget-wide v0, v5, Lg2/a0;->b:J

    check-cast v4, Lm0/g1;

    .line 163
    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg2/a0;

    .line 164
    iget-wide v2, v2, Lg2/a0;->b:J

    .line 165
    invoke-static {v0, v1, v2, v3}, La2/b0;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 166
    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg2/a0;

    .line 167
    iget-object v0, v0, Lg2/a0;->c:La2/b0;

    .line 168
    iget-object v1, v5, Lg2/a0;->c:La2/b0;

    invoke-static {v1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    .line 169
    :cond_19
    invoke-interface {v4, v5}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    :cond_1a
    return-void

    :pswitch_d
    check-cast v5, Ld9/u;

    check-cast v4, Lu/s0;

    .line 170
    sget-object v0, Lr1/v0;->a:Lm0/p0;

    .line 171
    invoke-static {v4, v0}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Ld9/u;->a:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_c
        :pswitch_0
        :pswitch_0
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
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
