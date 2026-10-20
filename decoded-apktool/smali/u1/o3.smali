.class public final Lu1/o3;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lu1/o3;->a:I

    iput-object p1, p0, Lu1/o3;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu1/o3;->a:I

    iget-object v2, p0, Lu1/o3;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    instance-of v1, p2, Lj4/k;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lj4/k;

    iget v3, v1, Lj4/k;->b:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v1, Lj4/k;->b:I

    goto :goto_0

    :cond_0
    new-instance v1, Lj4/k;

    invoke-direct {v1, p0, p2}, Lj4/k;-><init>(Lu1/o3;Lu8/e;)V

    :goto_0
    iget-object p2, v1, Lj4/k;->a:Ljava/lang/Object;

    sget-object v3, Lv8/a;->a:Lv8/a;

    iget v4, v1, Lj4/k;->b:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    check-cast v2, Lp9/g;

    check-cast p1, Ld1/f;

    iget-wide p1, p1, Ld1/f;->a:J

    sget-wide v6, Ld1/f;->c:J

    cmp-long v4, p1, v6

    if-nez v4, :cond_3

    sget-object p1, Lt4/f;->c:Lt4/f;

    goto :goto_2

    :cond_3
    invoke-static {p1, p2}, Ld1/f;->d(J)F

    move-result v4

    float-to-double v6, v4

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    cmpl-double v4, v6, v8

    if-ltz v4, :cond_6

    invoke-static {p1, p2}, Ld1/f;->b(J)F

    move-result v4

    float-to-double v6, v4

    cmpl-double v4, v6, v8

    if-ltz v4, :cond_6

    new-instance v4, Lt4/f;

    invoke-static {p1, p2}, Ld1/f;->d(J)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v7

    sget-object v8, Lt4/b;->z:Lt4/b;

    if-nez v7, :cond_4

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {p1, p2}, Ld1/f;->d(J)F

    move-result v6

    invoke-static {v6}, Ld7/t;->p0(F)I

    move-result v6

    new-instance v7, Lt4/a;

    invoke-direct {v7, v6}, Lt4/a;-><init>(I)V

    goto :goto_1

    :cond_4
    move-object v7, v8

    :goto_1
    invoke-static {p1, p2}, Ld1/f;->b(J)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v9

    if-nez v9, :cond_5

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-static {p1, p2}, Ld1/f;->b(J)F

    move-result p1

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    new-instance v8, Lt4/a;

    invoke-direct {v8, p1}, Lt4/a;-><init>(I)V

    :cond_5
    invoke-direct {v4, v7, v8}, Lt4/f;-><init>(Lf6/a;Lf6/a;)V

    move-object p1, v4

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_7

    iput v5, v1, Lj4/k;->b:I

    invoke-interface {v2, p1, v1}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_7

    move-object v0, v3

    :cond_7
    :goto_3
    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast v2, Lu1/h2;

    iget-object p2, v2, Lu1/h2;->a:Lm0/k1;

    invoke-virtual {p2, p1}, Lm0/s2;->f(F)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
