.class public interface abstract La0/h0;
.super Ljava/lang/Object;


# virtual methods
.method public a()F
    .locals 3

    move-object v0, p0

    check-cast v0, Lz/d;

    iget-object v1, v0, Lz/d;->c:Lv/f2;

    iget v0, v0, Lz/d;->a:I

    packed-switch v0, :pswitch_data_0

    move-object v2, v1

    check-cast v2, Lb0/h0;

    iget v2, v2, Lb0/h0;->g:I

    goto :goto_0

    :pswitch_0
    move-object v2, v1

    check-cast v2, Lz/g0;

    iget-object v2, v2, Lz/g0;->c:Lz/z;

    iget-object v2, v2, Lz/z;->b:Lm0/l1;

    invoke-virtual {v2}, Lm0/u2;->d()I

    move-result v2

    :goto_0
    packed-switch v0, :pswitch_data_1

    check-cast v1, Lb0/h0;

    iget v0, v1, Lb0/h0;->f:I

    goto :goto_1

    :pswitch_1
    check-cast v1, Lz/g0;

    iget-object v0, v1, Lz/g0;->c:Lz/z;

    iget-object v0, v0, Lz/z;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    :goto_1
    mul-int/lit16 v0, v0, 0x1f4

    add-int/2addr v0, v2

    int-to-float v0, v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
