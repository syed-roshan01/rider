.class public final synthetic Lf1/n;
.super Ljava/lang/Object;

# interfaces
.implements Lf1/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf1/r;


# direct methods
.method public synthetic constructor <init>(Lf1/r;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lf1/n;->a:I

    iput-object p1, p0, Lf1/n;->b:Lf1/r;

    return-void
.end method


# virtual methods
.method public final b(D)D
    .locals 10

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iget v2, p0, Lf1/n;->a:I

    iget-object v3, p0, Lf1/n;->b:Lf1/r;

    packed-switch v2, :pswitch_data_0

    iget-wide v0, v3, Lf1/r;->b:D

    iget-wide v4, v3, Lf1/r;->e:D

    cmpl-double v2, p1, v4

    if-ltz v2, :cond_0

    mul-double/2addr v0, p1

    iget-wide p1, v3, Lf1/r;->c:D

    add-double/2addr v0, p1

    iget-wide p1, v3, Lf1/r;->a:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    iget-wide v0, v3, Lf1/r;->f:D

    add-double/2addr p1, v0

    goto :goto_0

    :cond_0
    iget-wide v0, v3, Lf1/r;->d:D

    mul-double/2addr v0, p1

    iget-wide p1, v3, Lf1/r;->g:D

    add-double/2addr p1, v0

    :goto_0
    return-wide p1

    :pswitch_0
    iget-wide v0, v3, Lf1/r;->b:D

    iget-wide v4, v3, Lf1/r;->e:D

    cmpl-double v2, p1, v4

    if-ltz v2, :cond_1

    mul-double/2addr v0, p1

    iget-wide p1, v3, Lf1/r;->c:D

    add-double/2addr v0, p1

    iget-wide p1, v3, Lf1/r;->a:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    goto :goto_1

    :cond_1
    iget-wide v0, v3, Lf1/r;->d:D

    mul-double/2addr p1, v0

    :goto_1
    return-wide p1

    :pswitch_1
    iget-wide v4, v3, Lf1/r;->b:D

    iget-wide v6, v3, Lf1/r;->e:D

    iget-wide v8, v3, Lf1/r;->d:D

    mul-double/2addr v6, v8

    cmpl-double v2, p1, v6

    if-ltz v2, :cond_2

    iget-wide v6, v3, Lf1/r;->f:D

    sub-double/2addr p1, v6

    iget-wide v6, v3, Lf1/r;->a:D

    div-double/2addr v0, v6

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    iget-wide v0, v3, Lf1/r;->c:D

    sub-double/2addr p1, v0

    div-double/2addr p1, v4

    goto :goto_2

    :cond_2
    iget-wide v0, v3, Lf1/r;->g:D

    sub-double/2addr p1, v0

    div-double/2addr p1, v8

    :goto_2
    return-wide p1

    :pswitch_2
    iget-wide v4, v3, Lf1/r;->b:D

    iget-wide v6, v3, Lf1/r;->e:D

    iget-wide v8, v3, Lf1/r;->d:D

    mul-double/2addr v6, v8

    cmpl-double v2, p1, v6

    if-ltz v2, :cond_3

    iget-wide v6, v3, Lf1/r;->a:D

    div-double/2addr v0, v6

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    iget-wide v0, v3, Lf1/r;->c:D

    sub-double/2addr p1, v0

    div-double/2addr p1, v4

    goto :goto_3

    :cond_3
    div-double/2addr p1, v8

    :goto_3
    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
