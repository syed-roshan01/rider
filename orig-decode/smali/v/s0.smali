.class public final Lv/s0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm0/l3;


# direct methods
.method public synthetic constructor <init>(Lm0/l3;I)V
    .locals 0

    iput p2, p0, Lv/s0;->a:I

    iput-object p1, p0, Lv/s0;->b:Lm0/l3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lv/s0;->a:I

    iget-object v2, p0, Lv/s0;->b:Lm0/l3;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lg1/g;

    const-string v1, "$this$drawBehind"

    invoke-static {p1, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-wide v3, Le5/a;->a:J

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const v5, 0x3d75c28f    # 0.06f

    mul-float/2addr v1, v5

    const v5, 0x3da3d70a    # 0.08f

    add-float/2addr v1, v5

    invoke-static {v3, v4, v1}, Le1/r;->b(JF)J

    move-result-wide v3

    new-instance v1, Le1/r;

    invoke-direct {v1, v3, v4}, Le1/r;-><init>(J)V

    sget-wide v3, Le1/r;->f:J

    new-instance v5, Le1/r;

    invoke-direct {v5, v3, v4}, Le1/r;-><init>(J)V

    filled-new-array {v1, v5}, [Le1/r;

    move-result-object v1

    invoke-static {v1}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/high16 v5, 0x43c80000    # 400.0f

    const/16 v6, 0xa

    invoke-static {v1, v5, v6}, La4/q;->j(Ljava/util/List;FI)Le1/e0;

    move-result-object v1

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v7

    invoke-static {v7, v8}, Ld1/f;->d(J)F

    move-result v7

    const v8, 0x3e4ccccd    # 0.2f

    mul-float/2addr v7, v8

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v9

    invoke-static {v9, v10}, Ld1/f;->b(J)F

    move-result v9

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    const v11, 0x3dcccccd    # 0.1f

    mul-float/2addr v10, v11

    add-float/2addr v10, v8

    mul-float/2addr v10, v9

    invoke-static {v7, v10}, Ld9/i;->f(FF)J

    move-result-wide v7

    invoke-static {p1, v1, v5, v7, v8}, Lg1/g;->z(Lg1/g;Le1/e0;FJ)V

    sget-wide v7, Le5/a;->f:J

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const v5, 0x3d23d70a    # 0.04f

    mul-float/2addr v1, v5

    const v9, 0x3d4ccccd    # 0.05f

    add-float/2addr v1, v9

    invoke-static {v7, v8, v1}, Le1/r;->b(JF)J

    move-result-wide v7

    new-instance v1, Le1/r;

    invoke-direct {v1, v7, v8}, Le1/r;-><init>(J)V

    new-instance v7, Le1/r;

    invoke-direct {v7, v3, v4}, Le1/r;-><init>(J)V

    filled-new-array {v1, v7}, [Le1/r;

    move-result-object v1

    invoke-static {v1}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/high16 v7, 0x43af0000    # 350.0f

    invoke-static {v1, v7, v6}, La4/q;->j(Ljava/util/List;FI)Le1/e0;

    move-result-object v1

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v8

    invoke-static {v8, v9}, Ld1/f;->d(J)F

    move-result v8

    const v9, 0x3f59999a    # 0.85f

    mul-float/2addr v8, v9

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v12

    invoke-static {v12, v13}, Ld1/f;->b(J)F

    move-result v10

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    mul-float/2addr v12, v11

    const v11, 0x3f266666    # 0.65f

    sub-float/2addr v11, v12

    mul-float/2addr v11, v10

    invoke-static {v8, v11}, Ld9/i;->f(FF)J

    move-result-wide v10

    invoke-static {p1, v1, v7, v10, v11}, Lg1/g;->z(Lg1/g;Le1/e0;FJ)V

    sget-wide v7, Le5/a;->d:J

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const v2, 0x3cf5c28f    # 0.03f

    mul-float/2addr v1, v2

    add-float/2addr v1, v5

    invoke-static {v7, v8, v1}, Le1/r;->b(JF)J

    move-result-wide v1

    new-instance v5, Le1/r;

    invoke-direct {v5, v1, v2}, Le1/r;-><init>(J)V

    new-instance v1, Le1/r;

    invoke-direct {v1, v3, v4}, Le1/r;-><init>(J)V

    filled-new-array {v5, v1}, [Le1/r;

    move-result-object v1

    invoke-static {v1}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/high16 v2, 0x43960000    # 300.0f

    invoke-static {v1, v2, v6}, La4/q;->j(Ljava/util/List;FI)Le1/e0;

    move-result-object v1

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v3

    invoke-static {v3, v4}, Ld1/f;->d(J)F

    move-result v3

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v3, v4

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v4

    invoke-static {v4, v5}, Ld1/f;->b(J)F

    move-result v4

    mul-float/2addr v4, v9

    invoke-static {v3, v4}, Ld9/i;->f(FF)J

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lg1/g;->z(Lg1/g;Le1/e0;FJ)V

    return-object v0

    :pswitch_0
    check-cast p1, Ld1/c;

    iget-wide v3, p1, Ld1/c;->a:J

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc9/c;

    new-instance v1, Ld1/c;

    invoke-direct {v1, v3, v4}, Ld1/c;-><init>(J)V

    invoke-interface {p1, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc9/c;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc9/c;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
