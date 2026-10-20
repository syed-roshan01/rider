.class public final Lu/o;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLe1/y;Le1/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lu/o;->a:I

    iput p1, p0, Lu/o;->b:F

    iput-object p2, p0, Lu/o;->c:Ljava/lang/Object;

    iput-object p3, p0, Lu/o;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLjava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lu/o;->a:I

    iput-object p1, p0, Lu/o;->c:Ljava/lang/Object;

    iput p2, p0, Lu/o;->b:F

    iput-object p3, p0, Lu/o;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    sget-object v1, Lq8/l;->a:Lq8/l;

    iget v2, v0, Lu/o;->a:I

    const/4 v3, 0x0

    iget-object v4, v0, Lu/o;->d:Ljava/lang/Object;

    iget v5, v0, Lu/o;->b:F

    iget-object v6, v0, Lu/o;->c:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lm0/o0;

    check-cast v6, Lt/d;

    iget-object v1, v6, Lt/d;->e:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    cmpg-float v1, v1, v5

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast v4, Lm9/d0;

    new-instance v1, Lk0/r3;

    const/4 v2, 0x0

    invoke-direct {v1, v6, v5, v2}, Lk0/r3;-><init>(Lt/d;FLu8/e;)V

    const/4 v3, 0x3

    const/4 v5, 0x0

    invoke-static {v4, v2, v5, v1, v3}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :goto_0
    new-instance v1, Lf0/q;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    return-object v1

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, Lg1/e;

    check-cast v2, Lt1/i0;

    invoke-virtual {v2}, Lt1/i0;->a()V

    check-cast v6, Le1/y;

    check-cast v4, Le1/l;

    iget-object v7, v2, Lt1/i0;->a:Lg1/c;

    iget-object v7, v7, Lg1/c;->b:Lg1/b;

    invoke-virtual {v7}, Lg1/b;->b()J

    move-result-wide v8

    invoke-virtual {v7}, Lg1/b;->a()Le1/p;

    move-result-object v10

    invoke-interface {v10}, Le1/p;->j()V

    iget-object v10, v7, Lg1/b;->a:Lg1/d;

    iget-object v11, v10, Lg1/d;->a:Lg1/b;

    invoke-virtual {v11}, Lg1/b;->a()Le1/p;

    move-result-object v11

    invoke-interface {v11, v5, v3}, Le1/p;->e(FF)V

    sget-wide v11, Ld1/c;->b:J

    iget-object v3, v10, Lg1/d;->a:Lg1/b;

    invoke-virtual {v3}, Lg1/b;->a()Le1/p;

    move-result-object v3

    invoke-static {v11, v12}, Ld1/c;->d(J)F

    move-result v5

    invoke-static {v11, v12}, Ld1/c;->e(J)F

    move-result v10

    invoke-interface {v3, v5, v10}, Le1/p;->e(FF)V

    invoke-interface {v3}, Le1/p;->f()V

    invoke-static {v11, v12}, Ld1/c;->d(J)F

    move-result v5

    neg-float v5, v5

    invoke-static {v11, v12}, Ld1/c;->e(J)F

    move-result v10

    neg-float v10, v10

    invoke-interface {v3, v5, v10}, Le1/p;->e(FF)V

    invoke-static {v2, v6, v4}, Lg1/g;->l0(Lg1/g;Le1/y;Le1/l;)V

    invoke-virtual {v7}, Lg1/b;->a()Le1/p;

    move-result-object v2

    invoke-interface {v2}, Le1/p;->h()V

    invoke-virtual {v7, v8, v9}, Lg1/b;->c(J)V

    return-object v1

    :pswitch_1
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    check-cast v6, Lv/m3;

    iget-wide v9, v6, Lv/m3;->b:J

    const-wide/high16 v11, -0x8000000000000000L

    cmp-long v2, v9, v11

    if-nez v2, :cond_1

    iput-wide v7, v6, Lv/m3;->b:J

    :cond_1
    new-instance v2, Lt/p;

    iget v9, v6, Lv/m3;->e:F

    invoke-direct {v2, v9}, Lt/p;-><init>(F)V

    cmpg-float v3, v5, v3

    sget-object v15, Lv/m3;->f:Lt/p;

    if-nez v3, :cond_2

    new-instance v3, Lt/p;

    invoke-direct {v3, v9}, Lt/p;-><init>(F)V

    iget-object v5, v6, Lv/m3;->c:Lt/p;

    iget-object v9, v6, Lv/m3;->a:Lt/z1;

    invoke-interface {v9, v3, v15, v5}, Lt/z1;->b(Lt/t;Lt/t;Lt/t;)J

    move-result-wide v9

    :goto_1
    move-wide/from16 v16, v9

    goto :goto_2

    :cond_2
    iget-wide v9, v6, Lv/m3;->b:J

    sub-long v9, v7, v9

    long-to-float v3, v9

    div-float/2addr v3, v5

    float-to-double v9, v3

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    move-result-wide v9

    goto :goto_1

    :goto_2
    iget-object v9, v6, Lv/m3;->a:Lt/z1;

    iget-object v14, v6, Lv/m3;->c:Lt/p;

    move-wide/from16 v10, v16

    move-object v12, v2

    move-object v13, v15

    invoke-interface/range {v9 .. v14}, Lt/z1;->d(JLt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object v3

    check-cast v3, Lt/p;

    iget v3, v3, Lt/p;->a:F

    iget-object v9, v6, Lv/m3;->a:Lt/z1;

    iget-object v14, v6, Lv/m3;->c:Lt/p;

    move-wide/from16 v10, v16

    move-object v12, v2

    move-object v13, v15

    invoke-interface/range {v9 .. v14}, Lt/z1;->c(JLt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object v2

    check-cast v2, Lt/p;

    iput-object v2, v6, Lv/m3;->c:Lt/p;

    iput-wide v7, v6, Lv/m3;->b:J

    iget v2, v6, Lv/m3;->e:F

    sub-float/2addr v2, v3

    iput v3, v6, Lv/m3;->e:F

    check-cast v4, Lc9/c;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v4, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot round NaN value."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
