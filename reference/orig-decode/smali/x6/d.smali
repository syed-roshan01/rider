.class public abstract Lx6/d;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;


# virtual methods
.method public final a(I[B)Ljava/nio/ByteBuffer;
    .locals 15

    invoke-static/range {p2 .. p2}, Lx6/a;->c([B)[I

    move-result-object v0

    move-object v1, p0

    check-cast v1, Lx6/c;

    const/16 v2, 0x18

    const/16 v3, 0xc

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/16 v6, 0x10

    iget v7, v1, Lx6/c;->c:I

    const/16 v8, 0xd

    const/4 v9, 0x4

    packed-switch v7, :pswitch_data_0

    array-length v10, v0

    packed-switch v7, :pswitch_data_1

    goto :goto_0

    :pswitch_0
    move v2, v3

    :goto_0
    div-int/2addr v2, v9

    if-ne v10, v2, :cond_0

    new-array v2, v6, [I

    iget-object v1, v1, Lx6/d;->b:Ljava/lang/Object;

    check-cast v1, [I

    new-array v7, v6, [I

    sget-object v10, Lx6/a;->a:[I

    array-length v11, v10

    invoke-static {v10, v5, v7, v5, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v11, v10

    invoke-static {v1, v5, v7, v11, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget v1, v0, v5

    aput v1, v7, v3

    const/4 v1, 0x1

    aget v1, v0, v1

    aput v1, v7, v8

    const/4 v1, 0x2

    aget v1, v0, v1

    const/16 v11, 0xe

    aput v1, v7, v11

    const/4 v1, 0x3

    aget v1, v0, v1

    const/16 v12, 0xf

    aput v1, v7, v12

    invoke-static {v7}, Lx6/a;->b([I)V

    aget v1, v7, v3

    aput v1, v7, v9

    aget v1, v7, v8

    const/4 v13, 0x5

    aput v1, v7, v13

    const/4 v1, 0x6

    aget v14, v7, v11

    aput v14, v7, v1

    const/4 v1, 0x7

    aget v14, v7, v12

    aput v14, v7, v1

    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    array-length v7, v10

    invoke-static {v10, v5, v2, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v7, v10

    invoke-static {v1, v5, v2, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput p1, v2, v3

    aput v5, v2, v8

    aget v1, v0, v9

    aput v1, v2, v11

    aget v0, v0, v13

    aput v0, v2, v12

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    array-length v10, v0

    packed-switch v7, :pswitch_data_2

    goto :goto_1

    :pswitch_2
    move v2, v3

    :goto_1
    div-int/2addr v2, v9

    if-ne v10, v2, :cond_2

    new-array v2, v6, [I

    iget-object v1, v1, Lx6/d;->b:Ljava/lang/Object;

    check-cast v1, [I

    sget-object v7, Lx6/a;->a:[I

    array-length v9, v7

    invoke-static {v7, v5, v2, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v7, v7

    invoke-static {v1, v5, v2, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput p1, v2, v3

    array-length v1, v0

    invoke-static {v0, v5, v2, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_2
    invoke-virtual {v2}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    invoke-static {v0}, Lx6/a;->b([I)V

    move v1, v5

    :goto_3
    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget v3, v2, v1

    aget v4, v0, v1

    add-int/2addr v3, v4

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_1
    const/16 v0, 0x40

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    move-result-object v1

    invoke-virtual {v1, v2, v5, v6}, Ljava/nio/IntBuffer;->put([III)Ljava/nio/IntBuffer;

    return-object v0

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method

.method public final b([BLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    .locals 6

    array-length v0, p1

    move-object v1, p0

    check-cast v1, Lx6/c;

    const/16 v2, 0xc

    const/16 v3, 0x18

    iget v1, v1, Lx6/c;->c:I

    packed-switch v1, :pswitch_data_0

    move v4, v3

    goto :goto_0

    :pswitch_0
    move v4, v2

    :goto_0
    if-ne v0, v4, :cond_2

    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    div-int/lit8 v1, v0, 0x40

    add-int/lit8 v2, v1, 0x1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    iget v4, p0, Lx6/d;->a:I

    add-int/2addr v4, v3

    invoke-virtual {p0, v4, p1}, Lx6/d;->a(I[B)Ljava/nio/ByteBuffer;

    move-result-object v4

    const/16 v5, 0x40

    if-ne v3, v1, :cond_0

    rem-int/lit8 v5, v0, 0x40

    invoke-static {p2, p3, v4, v5}, Lz6/a;->y0(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V

    goto :goto_2

    :cond_0
    invoke-static {p2, p3, v4, v5}, Lz6/a;->y0(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "The nonce length (in bytes) must be "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    packed-switch v1, :pswitch_data_1

    move v2, v3

    :pswitch_1
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
