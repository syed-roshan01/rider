.class public final Lt/r1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FLm0/g1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lt/r1;->a:I

    iput p1, p0, Lt/r1;->b:F

    iput-object p2, p0, Lt/r1;->c:Ljava/lang/Object;

    .line 1
    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lt/u1;F)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lt/r1;->a:I

    iput-object p1, p0, Lt/r1;->c:Ljava/lang/Object;

    iput p2, p0, Lt/r1;->b:F

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lt/r1;->a:I

    iget-object v2, p0, Lt/r1;->c:Ljava/lang/Object;

    iget v3, p0, Lt/r1;->b:F

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ld1/f;

    iget-wide v4, p1, Ld1/f;->a:J

    invoke-static {v4, v5}, Ld1/f;->d(J)F

    move-result p1

    mul-float/2addr p1, v3

    invoke-static {v4, v5}, Ld1/f;->b(J)F

    move-result v1

    mul-float/2addr v1, v3

    check-cast v2, Lm0/g1;

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld1/f;

    iget-wide v3, v3, Ld1/f;->a:J

    invoke-static {v3, v4}, Ld1/f;->d(J)F

    move-result v3

    cmpg-float v3, v3, p1

    if-nez v3, :cond_0

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld1/f;

    iget-wide v3, v3, Ld1/f;->a:J

    invoke-static {v3, v4}, Ld1/f;->b(J)F

    move-result v3

    cmpg-float v3, v3, v1

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Ld7/t;->j(FF)J

    move-result-wide v3

    new-instance p1, Ld1/f;

    invoke-direct {p1, v3, v4}, Ld1/f;-><init>(J)V

    invoke-interface {v2, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    check-cast v2, Lt/u1;

    invoke-virtual {v2}, Lt/u1;->d()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v2, v3, v4, v5}, Lt/u1;->e(FJ)V

    :cond_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
