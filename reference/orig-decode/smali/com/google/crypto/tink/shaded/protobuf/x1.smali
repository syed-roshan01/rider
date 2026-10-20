.class public final Lcom/google/crypto/tink/shaded/protobuf/x1;
.super Lf6/a;


# instance fields
.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/x1;->z:I

    return-void
.end method

.method public static u0(J[BII)I
    .locals 2

    if-eqz p4, :cond_2

    const/4 v0, 0x1

    if-eq p4, v0, :cond_1

    const/4 v0, 0x2

    if-ne p4, v0, :cond_0

    invoke-static {p2, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result p4

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    invoke-static {p2, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result p0

    invoke-static {p3, p4, p0}, Lcom/google/crypto/tink/shaded/protobuf/z1;->d(III)I

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :cond_1
    invoke-static {p2, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result p0

    invoke-static {p3, p0}, Lcom/google/crypto/tink/shaded/protobuf/z1;->c(II)I

    move-result p0

    return p0

    :cond_2
    sget-object p0, Lcom/google/crypto/tink/shaded/protobuf/z1;->a:Lcom/google/crypto/tink/shaded/protobuf/x1;

    const/16 p0, -0xc

    if-le p3, p0, :cond_3

    const/4 p3, -0x1

    :cond_3
    return p3
.end method


# virtual methods
.method public final r0([BII)Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x1;->z:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/String;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, p2, p3, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const-string v2, "\ufffd"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    add-int/2addr p3, p2

    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    :pswitch_0
    or-int v0, p2, p3

    array-length v1, p1

    sub-int/2addr v1, p2

    sub-int/2addr v1, p3

    or-int/2addr v0, v1

    if-ltz v0, :cond_10

    add-int v0, p2, p3

    new-array p3, p3, [C

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    if-ge p2, v0, :cond_2

    aget-byte v3, p1, p2

    if-ltz v3, :cond_2

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 v4, v2, 0x1

    int-to-char v3, v3

    aput-char v3, p3, v2

    move v2, v4

    goto :goto_1

    :cond_2
    :goto_2
    if-ge p2, v0, :cond_f

    add-int/lit8 v3, p2, 0x1

    aget-byte v4, p1, p2

    if-ltz v4, :cond_4

    add-int/lit8 p2, v2, 0x1

    int-to-char v4, v4

    aput-char v4, p3, v2

    :goto_3
    if-ge v3, v0, :cond_3

    aget-byte v2, p1, v3

    if-ltz v2, :cond_3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, p2, 0x1

    int-to-char v2, v2

    aput-char v2, p3, p2

    move p2, v4

    goto :goto_3

    :cond_3
    move v2, p2

    move p2, v3

    goto :goto_2

    :cond_4
    const/16 v5, -0x20

    if-ge v4, v5, :cond_7

    if-ge v3, v0, :cond_6

    add-int/lit8 p2, p2, 0x2

    aget-byte v3, p1, v3

    add-int/lit8 v5, v2, 0x1

    const/16 v6, -0x3e

    if-lt v4, v6, :cond_5

    invoke-static {v3}, Lh6/g;->p0(B)Z

    move-result v6

    if-nez v6, :cond_5

    and-int/lit8 v4, v4, 0x1f

    shl-int/lit8 v4, v4, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v4

    int-to-char v3, v3

    aput-char v3, p3, v2

    move v2, v5

    goto :goto_2

    :cond_5
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    :cond_7
    const/16 v6, -0x10

    if-ge v4, v6, :cond_c

    add-int/lit8 v6, v0, -0x1

    if-ge v3, v6, :cond_b

    add-int/lit8 v6, p2, 0x2

    aget-byte v3, p1, v3

    add-int/lit8 p2, p2, 0x3

    aget-byte v6, p1, v6

    add-int/lit8 v7, v2, 0x1

    invoke-static {v3}, Lh6/g;->p0(B)Z

    move-result v8

    if-nez v8, :cond_a

    const/16 v8, -0x60

    if-ne v4, v5, :cond_8

    if-lt v3, v8, :cond_a

    :cond_8
    const/16 v5, -0x13

    if-ne v4, v5, :cond_9

    if-ge v3, v8, :cond_a

    :cond_9
    invoke-static {v6}, Lh6/g;->p0(B)Z

    move-result v5

    if-nez v5, :cond_a

    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0xc

    and-int/lit8 v3, v3, 0x3f

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v3, v4

    and-int/lit8 v4, v6, 0x3f

    or-int/2addr v3, v4

    int-to-char v3, v3

    aput-char v3, p3, v2

    move v2, v7

    goto/16 :goto_2

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    :cond_b
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    :cond_c
    add-int/lit8 v5, v0, -0x2

    if-ge v3, v5, :cond_e

    add-int/lit8 v5, p2, 0x2

    aget-byte v3, p1, v3

    add-int/lit8 v6, p2, 0x3

    aget-byte v5, p1, v5

    add-int/lit8 p2, p2, 0x4

    aget-byte v6, p1, v6

    add-int/lit8 v7, v2, 0x1

    invoke-static {v3}, Lh6/g;->p0(B)Z

    move-result v8

    if-nez v8, :cond_d

    shl-int/lit8 v8, v4, 0x1c

    add-int/lit8 v9, v3, 0x70

    add-int/2addr v9, v8

    shr-int/lit8 v8, v9, 0x1e

    if-nez v8, :cond_d

    invoke-static {v5}, Lh6/g;->p0(B)Z

    move-result v8

    if-nez v8, :cond_d

    invoke-static {v6}, Lh6/g;->p0(B)Z

    move-result v8

    if-nez v8, :cond_d

    and-int/lit8 v4, v4, 0x7

    shl-int/lit8 v4, v4, 0x12

    and-int/lit8 v3, v3, 0x3f

    shl-int/lit8 v3, v3, 0xc

    or-int/2addr v3, v4

    and-int/lit8 v4, v5, 0x3f

    shl-int/lit8 v4, v4, 0x6

    or-int/2addr v3, v4

    and-int/lit8 v4, v6, 0x3f

    or-int/2addr v3, v4

    ushr-int/lit8 v4, v3, 0xa

    const v5, 0xd7c0

    add-int/2addr v4, v5

    int-to-char v4, v4

    aput-char v4, p3, v2

    and-int/lit16 v3, v3, 0x3ff

    const v4, 0xdc00

    add-int/2addr v3, v4

    int-to-char v3, v3

    aput-char v3, p3, v7

    add-int/lit8 v2, v2, 0x2

    goto/16 :goto_2

    :cond_d
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    :cond_e
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    :cond_f
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_10
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "buffer length=%d, index=%d, size=%d"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final s0(Ljava/lang/CharSequence;[BII)I
    .locals 25

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p0

    move/from16 v4, p4

    iget v5, v3, Lcom/google/crypto/tink/shaded/protobuf/x1;->z:I

    const/16 v8, 0x800

    const/16 v9, 0x80

    const-string v11, "Failed writing "

    const-string v12, " at index "

    packed-switch v5, :pswitch_data_0

    int-to-long v13, v2

    move-object v15, v11

    int-to-long v10, v4

    add-long/2addr v10, v13

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-gt v5, v4, :cond_c

    array-length v7, v1

    sub-int/2addr v7, v4

    if-lt v7, v2, :cond_c

    const/4 v2, 0x0

    :goto_0
    const-wide/16 v16, 0x1

    if-ge v2, v5, :cond_0

    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-ge v4, v9, :cond_0

    add-long v16, v13, v16

    int-to-byte v4, v4

    invoke-static {v1, v13, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    add-int/lit8 v2, v2, 0x1

    move-wide/from16 v13, v16

    goto :goto_0

    :cond_0
    if-ne v2, v5, :cond_2

    :cond_1
    long-to-int v0, v13

    goto/16 :goto_5

    :cond_2
    :goto_1
    if-ge v2, v5, :cond_1

    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-ge v4, v9, :cond_3

    cmp-long v7, v13, v10

    if-gez v7, :cond_3

    add-long v18, v13, v16

    int-to-byte v4, v4

    invoke-static {v1, v13, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    move-wide/from16 v22, v10

    move-wide/from16 v13, v18

    goto/16 :goto_4

    :cond_3
    const-wide/16 v18, 0x2

    if-ge v4, v8, :cond_4

    sub-long v20, v10, v18

    cmp-long v7, v13, v20

    if-gtz v7, :cond_4

    add-long v6, v13, v16

    ushr-int/lit8 v8, v4, 0x6

    or-int/lit16 v8, v8, 0x3c0

    int-to-byte v8, v8

    invoke-static {v1, v13, v14, v8}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    add-long v13, v13, v18

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v9

    int-to-byte v4, v4

    invoke-static {v1, v6, v7, v4}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    move-wide/from16 v22, v10

    goto/16 :goto_4

    :cond_4
    const-wide/16 v6, 0x3

    const v8, 0xd800

    if-lt v4, v8, :cond_6

    const v8, 0xdfff

    if-ge v8, v4, :cond_5

    goto :goto_2

    :cond_5
    move-wide/from16 v22, v10

    goto :goto_3

    :cond_6
    :goto_2
    sub-long v22, v10, v6

    cmp-long v8, v13, v22

    if-gtz v8, :cond_5

    add-long v6, v13, v16

    ushr-int/lit8 v8, v4, 0xc

    or-int/lit16 v8, v8, 0x1e0

    int-to-byte v8, v8

    invoke-static {v1, v13, v14, v8}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    move-wide/from16 v22, v10

    add-long v9, v13, v18

    ushr-int/lit8 v11, v4, 0x6

    and-int/lit8 v11, v11, 0x3f

    const/16 v8, 0x80

    or-int/2addr v11, v8

    int-to-byte v11, v11

    invoke-static {v1, v6, v7, v11}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    const-wide/16 v6, 0x3

    add-long/2addr v13, v6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v8

    int-to-byte v4, v4

    invoke-static {v1, v9, v10, v4}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    goto :goto_4

    :goto_3
    const-wide/16 v6, 0x4

    sub-long v10, v22, v6

    cmp-long v9, v13, v10

    if-gtz v9, :cond_9

    add-int/lit8 v9, v2, 0x1

    if-eq v9, v5, :cond_8

    invoke-interface {v0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v4, v2}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-static {v4, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v2

    add-long v10, v13, v16

    ushr-int/lit8 v4, v2, 0x12

    or-int/lit16 v4, v4, 0xf0

    int-to-byte v4, v4

    invoke-static {v1, v13, v14, v4}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    move/from16 v24, v9

    add-long v8, v13, v18

    ushr-int/lit8 v4, v2, 0xc

    and-int/lit8 v4, v4, 0x3f

    const/16 v6, 0x80

    or-int/2addr v4, v6

    int-to-byte v4, v4

    invoke-static {v1, v10, v11, v4}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    const-wide/16 v10, 0x3

    add-long/2addr v10, v13

    ushr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v6

    int-to-byte v4, v4

    invoke-static {v1, v8, v9, v4}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    const-wide/16 v7, 0x4

    add-long/2addr v13, v7

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v6

    int-to-byte v2, v2

    invoke-static {v1, v10, v11, v2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->o([BJB)V

    move/from16 v2, v24

    :goto_4
    add-int/lit8 v2, v2, 0x1

    move-wide/from16 v10, v22

    const/16 v8, 0x800

    const/16 v9, 0x80

    goto/16 :goto_1

    :cond_7
    move/from16 v24, v9

    move/from16 v2, v24

    :cond_8
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/y1;

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v0, v2, v5}, Lcom/google/crypto/tink/shaded/protobuf/y1;-><init>(II)V

    throw v0

    :cond_9
    const v1, 0xd800

    if-gt v1, v4, :cond_b

    const v1, 0xdfff

    if-gt v4, v1, :cond_b

    add-int/lit8 v1, v2, 0x1

    if-eq v1, v5, :cond_a

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/y1;

    invoke-direct {v0, v2, v5}, Lcom/google/crypto/tink/shaded/protobuf/y1;-><init>(II)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    move-object v6, v15

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    return v0

    :cond_c
    move-object v6, v15

    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v5, v5, -0x1

    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int v0, v2, v4

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    move-object v6, v11

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    add-int/2addr v4, v2

    const/4 v10, 0x0

    :goto_6
    if-ge v10, v5, :cond_d

    add-int v7, v10, v2

    if-ge v7, v4, :cond_d

    invoke-interface {v0, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    const/16 v8, 0x80

    if-ge v9, v8, :cond_d

    int-to-byte v9, v9

    aput-byte v9, v1, v7

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_d
    if-ne v10, v5, :cond_e

    add-int v0, v2, v5

    goto/16 :goto_a

    :cond_e
    add-int/2addr v2, v10

    :goto_7
    if-ge v10, v5, :cond_18

    invoke-interface {v0, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    const/16 v8, 0x80

    if-ge v7, v8, :cond_f

    if-ge v2, v4, :cond_f

    add-int/lit8 v9, v2, 0x1

    int-to-byte v7, v7

    aput-byte v7, v1, v2

    move v2, v9

    const/16 v8, 0x80

    const/16 v9, 0x800

    goto/16 :goto_9

    :cond_f
    const/16 v9, 0x800

    if-ge v7, v9, :cond_10

    add-int/lit8 v11, v4, -0x2

    if-gt v2, v11, :cond_10

    add-int/lit8 v11, v2, 0x1

    ushr-int/lit8 v13, v7, 0x6

    or-int/lit16 v13, v13, 0x3c0

    int-to-byte v13, v13

    aput-byte v13, v1, v2

    add-int/lit8 v2, v2, 0x2

    and-int/lit8 v7, v7, 0x3f

    const/16 v8, 0x80

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v1, v11

    :goto_8
    const/16 v8, 0x80

    goto :goto_9

    :cond_10
    const v11, 0xd800

    if-lt v7, v11, :cond_11

    const v11, 0xdfff

    if-ge v11, v7, :cond_12

    :cond_11
    add-int/lit8 v11, v4, -0x3

    if-gt v2, v11, :cond_12

    add-int/lit8 v11, v2, 0x1

    ushr-int/lit8 v13, v7, 0xc

    or-int/lit16 v13, v13, 0x1e0

    int-to-byte v13, v13

    aput-byte v13, v1, v2

    add-int/lit8 v13, v2, 0x2

    ushr-int/lit8 v14, v7, 0x6

    and-int/lit8 v14, v14, 0x3f

    const/16 v8, 0x80

    or-int/2addr v14, v8

    int-to-byte v14, v14

    aput-byte v14, v1, v11

    add-int/lit8 v2, v2, 0x3

    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v1, v13

    goto :goto_8

    :cond_12
    add-int/lit8 v11, v4, -0x4

    if-gt v2, v11, :cond_15

    add-int/lit8 v11, v10, 0x1

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-eq v11, v13, :cond_14

    invoke-interface {v0, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    invoke-static {v7, v10}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v13

    if-eqz v13, :cond_13

    invoke-static {v7, v10}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v7

    add-int/lit8 v10, v2, 0x1

    ushr-int/lit8 v13, v7, 0x12

    or-int/lit16 v13, v13, 0xf0

    int-to-byte v13, v13

    aput-byte v13, v1, v2

    add-int/lit8 v13, v2, 0x2

    ushr-int/lit8 v14, v7, 0xc

    and-int/lit8 v14, v14, 0x3f

    const/16 v8, 0x80

    or-int/2addr v14, v8

    int-to-byte v14, v14

    aput-byte v14, v1, v10

    add-int/lit8 v10, v2, 0x3

    ushr-int/lit8 v14, v7, 0x6

    and-int/lit8 v14, v14, 0x3f

    or-int/2addr v14, v8

    int-to-byte v14, v14

    aput-byte v14, v1, v13

    add-int/lit8 v2, v2, 0x4

    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v1, v10

    move v10, v11

    :goto_9
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_7

    :cond_13
    move v10, v11

    :cond_14
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/y1;

    add-int/lit8 v10, v10, -0x1

    invoke-direct {v0, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/y1;-><init>(II)V

    throw v0

    :cond_15
    const v1, 0xd800

    if-gt v1, v7, :cond_17

    const v1, 0xdfff

    if-gt v7, v1, :cond_17

    add-int/lit8 v1, v10, 0x1

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-eq v1, v4, :cond_16

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v7, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/y1;

    invoke-direct {v0, v10, v5}, Lcom/google/crypto/tink/shaded/protobuf/y1;-><init>(II)V

    throw v0

    :cond_17
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    move v0, v2

    :goto_a
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final t0([BII)I
    .locals 21

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p0

    move/from16 v3, p3

    iget v4, v2, Lcom/google/crypto/tink/shaded/protobuf/x1;->z:I

    const/16 v5, -0x41

    const/16 v6, -0x20

    const/16 v8, -0x3e

    packed-switch v4, :pswitch_data_0

    or-int v4, v1, v3

    array-length v13, v0

    sub-int/2addr v13, v3

    or-int/2addr v4, v13

    if-ltz v4, :cond_14

    int-to-long v13, v1

    int-to-long v3, v3

    sub-long/2addr v3, v13

    long-to-int v1, v3

    const/16 v3, 0x10

    const-wide/16 v15, 0x1

    if-ge v1, v3, :cond_0

    const/4 v4, 0x0

    goto :goto_3

    :cond_0
    long-to-int v3, v13

    and-int/lit8 v3, v3, 0x7

    rsub-int/lit8 v3, v3, 0x8

    move-wide v11, v13

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    add-long v17, v11, v15

    invoke-static {v0, v11, v12}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result v11

    if-gez v11, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    move-wide/from16 v11, v17

    goto :goto_0

    :cond_2
    :goto_1
    add-int/lit8 v3, v4, 0x8

    if-gt v3, v1, :cond_4

    sget-wide v17, Lcom/google/crypto/tink/shaded/protobuf/w1;->f:J

    add-long v9, v17, v11

    sget-object v7, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v7, v0, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v9

    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v9, v9, v19

    const-wide/16 v19, 0x0

    cmp-long v7, v9, v19

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    const-wide/16 v9, 0x8

    add-long/2addr v11, v9

    move v4, v3

    goto :goto_1

    :cond_4
    :goto_2
    if-ge v4, v1, :cond_6

    add-long v9, v11, v15

    invoke-static {v0, v11, v12}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result v3

    if-gez v3, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v4, 0x1

    move-wide v11, v9

    goto :goto_2

    :cond_6
    move v4, v1

    :goto_3
    sub-int/2addr v1, v4

    int-to-long v3, v4

    add-long/2addr v13, v3

    :goto_4
    const/4 v3, 0x0

    :goto_5
    if-lez v1, :cond_8

    add-long v3, v13, v15

    invoke-static {v0, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result v7

    if-ltz v7, :cond_7

    add-int/lit8 v1, v1, -0x1

    move-wide v13, v3

    move v3, v7

    goto :goto_5

    :cond_7
    move-wide v13, v3

    move v3, v7

    :cond_8
    if-nez v1, :cond_9

    const/4 v11, 0x0

    goto/16 :goto_8

    :cond_9
    add-int/lit8 v4, v1, -0x1

    if-ge v3, v6, :cond_d

    if-nez v4, :cond_a

    move v11, v3

    goto/16 :goto_8

    :cond_a
    add-int/lit8 v1, v1, -0x2

    if-lt v3, v8, :cond_c

    add-long v3, v13, v15

    invoke-static {v0, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result v7

    if-le v7, v5, :cond_b

    goto :goto_6

    :cond_b
    move-wide v13, v3

    goto :goto_7

    :cond_c
    :goto_6
    const/4 v11, -0x1

    goto :goto_8

    :cond_d
    const-wide/16 v9, 0x2

    const/16 v7, -0x10

    if-ge v3, v7, :cond_11

    const/4 v7, 0x2

    if-ge v4, v7, :cond_e

    invoke-static {v13, v14, v0, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/x1;->u0(J[BII)I

    move-result v11

    goto :goto_8

    :cond_e
    add-int/lit8 v1, v1, -0x3

    add-long v11, v13, v15

    invoke-static {v0, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result v4

    if-gt v4, v5, :cond_c

    const/16 v7, -0x60

    if-ne v3, v6, :cond_f

    if-lt v4, v7, :cond_c

    :cond_f
    const/16 v8, -0x13

    if-ne v3, v8, :cond_10

    if-ge v4, v7, :cond_c

    :cond_10
    add-long/2addr v13, v9

    invoke-static {v0, v11, v12}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result v3

    if-le v3, v5, :cond_13

    goto :goto_6

    :cond_11
    const/4 v7, 0x3

    if-ge v4, v7, :cond_12

    invoke-static {v13, v14, v0, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/x1;->u0(J[BII)I

    move-result v11

    goto :goto_8

    :cond_12
    add-int/lit8 v1, v1, -0x4

    add-long v7, v13, v15

    invoke-static {v0, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result v4

    if-gt v4, v5, :cond_c

    shl-int/lit8 v3, v3, 0x1c

    add-int/lit8 v4, v4, 0x70

    add-int/2addr v4, v3

    shr-int/lit8 v3, v4, 0x1e

    if-nez v3, :cond_c

    add-long/2addr v9, v13

    invoke-static {v0, v7, v8}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result v3

    if-gt v3, v5, :cond_c

    const-wide/16 v3, 0x3

    add-long/2addr v13, v3

    invoke-static {v0, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/w1;->g([BJ)B

    move-result v3

    if-le v3, v5, :cond_13

    goto :goto_6

    :cond_13
    :goto_7
    const/16 v8, -0x3e

    goto/16 :goto_4

    :goto_8
    return v11

    :cond_14
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v1, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Array length=%d, index=%d, limit=%d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v4

    :goto_9
    :pswitch_0
    if-ge v1, v3, :cond_15

    aget-byte v4, v0, v1

    if-ltz v4, :cond_15

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_15
    if-lt v1, v3, :cond_16

    :goto_a
    const/4 v11, 0x0

    goto/16 :goto_d

    :cond_16
    :goto_b
    if-lt v1, v3, :cond_17

    goto :goto_a

    :cond_17
    add-int/lit8 v4, v1, 0x1

    aget-byte v7, v0, v1

    if-gez v7, :cond_21

    if-ge v7, v6, :cond_1b

    if-lt v4, v3, :cond_18

    move v11, v7

    goto/16 :goto_d

    :cond_18
    const/16 v8, -0x3e

    if-lt v7, v8, :cond_1a

    add-int/lit8 v1, v1, 0x2

    aget-byte v4, v0, v4

    if-le v4, v5, :cond_19

    goto :goto_c

    :cond_19
    const/16 v9, -0x10

    const/16 v11, -0x60

    const/16 v12, -0x13

    goto :goto_b

    :cond_1a
    :goto_c
    const/4 v11, -0x1

    goto :goto_d

    :cond_1b
    const/16 v8, -0x3e

    const/16 v9, -0x10

    if-ge v7, v9, :cond_1f

    add-int/lit8 v10, v3, -0x1

    if-lt v4, v10, :cond_1c

    invoke-static {v0, v4, v3}, Lcom/google/crypto/tink/shaded/protobuf/z1;->a([BII)I

    move-result v11

    goto :goto_d

    :cond_1c
    add-int/lit8 v10, v1, 0x2

    aget-byte v4, v0, v4

    if-gt v4, v5, :cond_1a

    const/16 v11, -0x60

    if-ne v7, v6, :cond_1d

    if-lt v4, v11, :cond_1a

    :cond_1d
    const/16 v12, -0x13

    if-ne v7, v12, :cond_1e

    if-ge v4, v11, :cond_1a

    :cond_1e
    add-int/lit8 v1, v1, 0x3

    aget-byte v4, v0, v10

    if-le v4, v5, :cond_16

    goto :goto_c

    :cond_1f
    const/16 v11, -0x60

    const/16 v12, -0x13

    add-int/lit8 v10, v3, -0x2

    if-lt v4, v10, :cond_20

    invoke-static {v0, v4, v3}, Lcom/google/crypto/tink/shaded/protobuf/z1;->a([BII)I

    move-result v11

    goto :goto_d

    :cond_20
    add-int/lit8 v10, v1, 0x2

    aget-byte v4, v0, v4

    if-gt v4, v5, :cond_1a

    shl-int/lit8 v7, v7, 0x1c

    add-int/lit8 v4, v4, 0x70

    add-int/2addr v4, v7

    shr-int/lit8 v4, v4, 0x1e

    if-nez v4, :cond_1a

    add-int/lit8 v4, v1, 0x3

    aget-byte v7, v0, v10

    if-gt v7, v5, :cond_1a

    add-int/lit8 v1, v1, 0x4

    aget-byte v4, v0, v4

    if-le v4, v5, :cond_16

    goto :goto_c

    :goto_d
    return v11

    :cond_21
    move v1, v4

    goto :goto_b

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
