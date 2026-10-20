.class public final Lcom/google/protobuf/a3;
.super Lcom/google/protobuf/n2;


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/protobuf/a3;->c:I

    return-void
.end method

.method public static X(J[BII)I
    .locals 2

    if-eqz p4, :cond_2

    const/4 v0, 0x1

    if-eq p4, v0, :cond_1

    const/4 v0, 0x2

    if-ne p4, v0, :cond_0

    invoke-static {p2, p0, p1}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result p4

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    invoke-static {p2, p0, p1}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result p0

    invoke-static {p3, p4, p0}, Lcom/google/protobuf/c3;->e(III)I

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :cond_1
    invoke-static {p2, p0, p1}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result p0

    invoke-static {p3, p0}, Lcom/google/protobuf/c3;->d(II)I

    move-result p0

    return p0

    :cond_2
    sget-object p0, Lcom/google/protobuf/c3;->a:Lcom/google/protobuf/a3;

    const/16 p0, -0xc

    if-le p3, p0, :cond_3

    const/4 p3, -0x1

    :cond_3
    return p3
.end method


# virtual methods
.method public final T([BII)Ljava/lang/String;
    .locals 9

    iget v0, p0, Lcom/google/protobuf/a3;->c:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/String;

    sget-object v1, Lcom/google/protobuf/y0;->a:Ljava/nio/charset/Charset;

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
    invoke-static {}, Lcom/google/protobuf/a1;->c()Lcom/google/protobuf/a1;

    move-result-object p1

    throw p1

    :pswitch_0
    or-int v0, p2, p3

    array-length v1, p1

    sub-int/2addr v1, p2

    sub-int/2addr v1, p3

    or-int/2addr v0, v1

    if-ltz v0, :cond_d

    add-int v0, p2, p3

    new-array p3, p3, [C

    const/4 v7, 0x0

    move v1, v7

    :goto_1
    if-ge p2, v0, :cond_3

    aget-byte v2, p1, p2

    invoke-static {v2}, Lcom/google/protobuf/n2;->b(B)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    add-int/lit8 v3, v1, 0x1

    int-to-char v2, v2

    aput-char v2, p3, v1

    move v1, v3

    goto :goto_1

    :cond_3
    :goto_2
    move v8, v1

    :goto_3
    if-ge p2, v0, :cond_c

    add-int/lit8 v1, p2, 0x1

    aget-byte v2, p1, p2

    invoke-static {v2}, Lcom/google/protobuf/n2;->b(B)Z

    move-result v3

    if-eqz v3, :cond_6

    add-int/lit8 p2, v8, 0x1

    int-to-char v2, v2

    aput-char v2, p3, v8

    :goto_4
    if-ge v1, v0, :cond_5

    aget-byte v2, p1, v1

    invoke-static {v2}, Lcom/google/protobuf/n2;->b(B)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v3, p2, 0x1

    int-to-char v2, v2

    aput-char v2, p3, p2

    move p2, v3

    goto :goto_4

    :cond_5
    :goto_5
    move v8, p2

    move p2, v1

    goto :goto_3

    :cond_6
    const/16 v3, -0x20

    if-ge v2, v3, :cond_8

    if-ge v1, v0, :cond_7

    add-int/lit8 p2, p2, 0x2

    aget-byte v1, p1, v1

    add-int/lit8 v3, v8, 0x1

    invoke-static {v2, v1, p3, v8}, Lcom/google/protobuf/n2;->c(BB[CI)V

    move v8, v3

    goto :goto_3

    :cond_7
    invoke-static {}, Lcom/google/protobuf/a1;->c()Lcom/google/protobuf/a1;

    move-result-object p1

    throw p1

    :cond_8
    const/16 v3, -0x10

    if-ge v2, v3, :cond_a

    add-int/lit8 v3, v0, -0x1

    if-ge v1, v3, :cond_9

    add-int/lit8 v3, p2, 0x2

    aget-byte v1, p1, v1

    add-int/lit8 p2, p2, 0x3

    aget-byte v3, p1, v3

    add-int/lit8 v4, v8, 0x1

    invoke-static {v2, v1, v3, p3, v8}, Lcom/google/protobuf/n2;->d(BBB[CI)V

    move v8, v4

    goto :goto_3

    :cond_9
    invoke-static {}, Lcom/google/protobuf/a1;->c()Lcom/google/protobuf/a1;

    move-result-object p1

    throw p1

    :cond_a
    add-int/lit8 v3, v0, -0x2

    if-ge v1, v3, :cond_b

    add-int/lit8 v3, p2, 0x2

    aget-byte v4, p1, v1

    add-int/lit8 v1, p2, 0x3

    aget-byte v3, p1, v3

    add-int/lit8 p2, p2, 0x4

    aget-byte v5, p1, v1

    move v1, v2

    move v2, v4

    move v4, v5

    move-object v5, p3

    move v6, v8

    invoke-static/range {v1 .. v6}, Lcom/google/protobuf/n2;->a(BBBB[CI)V

    add-int/lit8 v8, v8, 0x2

    goto :goto_3

    :cond_b
    invoke-static {}, Lcom/google/protobuf/a1;->c()Lcom/google/protobuf/a1;

    move-result-object p1

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p3, v7, v8}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_d
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

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final U(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 20

    move/from16 v0, p2

    move-object/from16 v1, p0

    move/from16 v2, p3

    iget v3, v1, Lcom/google/protobuf/a3;->c:I

    packed-switch v3, :pswitch_data_0

    or-int v3, v0, v2

    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->limit()I

    move-result v4

    sub-int/2addr v4, v0

    sub-int/2addr v4, v2

    or-int/2addr v3, v4

    if-ltz v3, :cond_d

    sget-object v3, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    sget-wide v4, Lcom/google/protobuf/z2;->g:J

    move-object/from16 v6, p1

    invoke-virtual {v3, v6, v4, v5}, Lcom/google/protobuf/y2;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    int-to-long v5, v0

    add-long/2addr v3, v5

    int-to-long v5, v2

    add-long/2addr v5, v3

    new-array v0, v2, [C

    const/4 v2, 0x0

    move v7, v2

    :goto_0
    cmp-long v8, v3, v5

    const-wide/16 v13, 0x1

    if-gez v8, :cond_1

    sget-object v8, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v8, v3, v4}, Lcom/google/protobuf/y2;->e(J)B

    move-result v8

    invoke-static {v8}, Lcom/google/protobuf/n2;->b(B)Z

    move-result v9

    if-nez v9, :cond_0

    goto :goto_1

    :cond_0
    add-long/2addr v3, v13

    add-int/lit8 v9, v7, 0x1

    int-to-char v8, v8

    aput-char v8, v0, v7

    move v7, v9

    goto :goto_0

    :cond_1
    :goto_1
    move v15, v7

    :goto_2
    cmp-long v7, v3, v5

    if-gez v7, :cond_c

    add-long v7, v3, v13

    sget-object v9, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v9, v3, v4}, Lcom/google/protobuf/y2;->e(J)B

    move-result v10

    invoke-static {v10}, Lcom/google/protobuf/n2;->b(B)Z

    move-result v11

    if-eqz v11, :cond_4

    add-int/lit8 v3, v15, 0x1

    int-to-char v4, v10

    aput-char v4, v0, v15

    :goto_3
    cmp-long v4, v7, v5

    if-gez v4, :cond_3

    sget-object v4, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v4, v7, v8}, Lcom/google/protobuf/y2;->e(J)B

    move-result v4

    invoke-static {v4}, Lcom/google/protobuf/n2;->b(B)Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_4

    :cond_2
    add-long/2addr v7, v13

    add-int/lit8 v9, v3, 0x1

    int-to-char v4, v4

    aput-char v4, v0, v3

    move v3, v9

    goto :goto_3

    :cond_3
    :goto_4
    move v15, v3

    move-wide v3, v7

    goto/16 :goto_7

    :cond_4
    const/16 v11, -0x20

    const/4 v12, 0x1

    if-ge v10, v11, :cond_5

    move v11, v12

    goto :goto_5

    :cond_5
    move v11, v2

    :goto_5
    const-wide/16 v16, 0x2

    if-eqz v11, :cond_7

    cmp-long v11, v7, v5

    if-gez v11, :cond_6

    add-long v3, v3, v16

    invoke-virtual {v9, v7, v8}, Lcom/google/protobuf/y2;->e(J)B

    move-result v7

    add-int/lit8 v8, v15, 0x1

    invoke-static {v10, v7, v0, v15}, Lcom/google/protobuf/n2;->c(BB[CI)V

    move v15, v8

    goto :goto_7

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->c()Lcom/google/protobuf/a1;

    move-result-object v0

    throw v0

    :cond_7
    const/16 v11, -0x10

    if-ge v10, v11, :cond_8

    goto :goto_6

    :cond_8
    move v12, v2

    :goto_6
    const-wide/16 v18, 0x3

    if-eqz v12, :cond_a

    sub-long v11, v5, v13

    cmp-long v11, v7, v11

    if-gez v11, :cond_9

    add-long v11, v3, v16

    invoke-virtual {v9, v7, v8}, Lcom/google/protobuf/y2;->e(J)B

    move-result v7

    add-long v3, v3, v18

    invoke-virtual {v9, v11, v12}, Lcom/google/protobuf/y2;->e(J)B

    move-result v8

    add-int/lit8 v9, v15, 0x1

    invoke-static {v10, v7, v8, v0, v15}, Lcom/google/protobuf/n2;->d(BBB[CI)V

    move v15, v9

    goto :goto_7

    :cond_9
    invoke-static {}, Lcom/google/protobuf/a1;->c()Lcom/google/protobuf/a1;

    move-result-object v0

    throw v0

    :cond_a
    sub-long v11, v5, v16

    cmp-long v11, v7, v11

    if-gez v11, :cond_b

    add-long v11, v3, v16

    invoke-virtual {v9, v7, v8}, Lcom/google/protobuf/y2;->e(J)B

    move-result v8

    add-long v13, v3, v18

    invoke-virtual {v9, v11, v12}, Lcom/google/protobuf/y2;->e(J)B

    move-result v11

    const-wide/16 v16, 0x4

    add-long v3, v3, v16

    invoke-virtual {v9, v13, v14}, Lcom/google/protobuf/y2;->e(J)B

    move-result v12

    move v7, v10

    move v9, v11

    move v10, v12

    move-object v11, v0

    move v12, v15

    invoke-static/range {v7 .. v12}, Lcom/google/protobuf/n2;->a(BBBB[CI)V

    add-int/lit8 v15, v15, 0x2

    :goto_7
    const-wide/16 v13, 0x1

    goto/16 :goto_2

    :cond_b
    invoke-static {}, Lcom/google/protobuf/a1;->c()Lcom/google/protobuf/a1;

    move-result-object v0

    throw v0

    :cond_c
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0, v2, v15}, Ljava/lang/String;-><init>([CII)V

    return-object v3

    :cond_d
    move-object/from16 v6, p1

    new-instance v3, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->limit()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v4, v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "buffer limit=%d, index=%d, limit=%d"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v3

    :pswitch_0
    move-object/from16 v6, p1

    invoke-static/range {p1 .. p3}, Lcom/google/protobuf/n2;->H(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final V(Ljava/lang/CharSequence;[BII)I
    .locals 25

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p0

    move/from16 v4, p4

    iget v5, v3, Lcom/google/protobuf/a3;->c:I

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

    invoke-static {v1, v13, v14, v4}, Lcom/google/protobuf/z2;->o([BJB)V

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

    invoke-static {v1, v13, v14, v4}, Lcom/google/protobuf/z2;->o([BJB)V

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

    invoke-static {v1, v13, v14, v8}, Lcom/google/protobuf/z2;->o([BJB)V

    add-long v13, v13, v18

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v9

    int-to-byte v4, v4

    invoke-static {v1, v6, v7, v4}, Lcom/google/protobuf/z2;->o([BJB)V

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

    invoke-static {v1, v13, v14, v8}, Lcom/google/protobuf/z2;->o([BJB)V

    move-wide/from16 v22, v10

    add-long v9, v13, v18

    ushr-int/lit8 v11, v4, 0x6

    and-int/lit8 v11, v11, 0x3f

    const/16 v8, 0x80

    or-int/2addr v11, v8

    int-to-byte v11, v11

    invoke-static {v1, v6, v7, v11}, Lcom/google/protobuf/z2;->o([BJB)V

    const-wide/16 v6, 0x3

    add-long/2addr v13, v6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v8

    int-to-byte v4, v4

    invoke-static {v1, v9, v10, v4}, Lcom/google/protobuf/z2;->o([BJB)V

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

    invoke-static {v1, v13, v14, v4}, Lcom/google/protobuf/z2;->o([BJB)V

    move/from16 v24, v9

    add-long v8, v13, v18

    ushr-int/lit8 v4, v2, 0xc

    and-int/lit8 v4, v4, 0x3f

    const/16 v6, 0x80

    or-int/2addr v4, v6

    int-to-byte v4, v4

    invoke-static {v1, v10, v11, v4}, Lcom/google/protobuf/z2;->o([BJB)V

    const-wide/16 v10, 0x3

    add-long/2addr v10, v13

    ushr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v6

    int-to-byte v4, v4

    invoke-static {v1, v8, v9, v4}, Lcom/google/protobuf/z2;->o([BJB)V

    const-wide/16 v7, 0x4

    add-long/2addr v13, v7

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v6

    int-to-byte v2, v2

    invoke-static {v1, v10, v11, v2}, Lcom/google/protobuf/z2;->o([BJB)V

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
    new-instance v0, Lcom/google/protobuf/b3;

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v0, v2, v5}, Lcom/google/protobuf/b3;-><init>(II)V

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
    new-instance v0, Lcom/google/protobuf/b3;

    invoke-direct {v0, v2, v5}, Lcom/google/protobuf/b3;-><init>(II)V

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
    new-instance v0, Lcom/google/protobuf/b3;

    add-int/lit8 v10, v10, -0x1

    invoke-direct {v0, v10, v5}, Lcom/google/protobuf/b3;-><init>(II)V

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
    new-instance v0, Lcom/google/protobuf/b3;

    invoke-direct {v0, v10, v5}, Lcom/google/protobuf/b3;-><init>(II)V

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

.method public final W(I[BII)I
    .locals 24

    move/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p0

    move/from16 v4, p4

    iget v5, v3, Lcom/google/protobuf/a3;->c:I

    const/16 v6, -0x41

    const/16 v7, -0x20

    const/16 v8, -0x60

    const/16 v9, -0x3e

    const/16 v10, -0x10

    const/16 v11, -0x13

    packed-switch v5, :pswitch_data_0

    or-int v5, v2, v4

    array-length v14, v1

    sub-int/2addr v14, v4

    or-int/2addr v5, v14

    if-ltz v5, :cond_23

    int-to-long v14, v2

    int-to-long v4, v4

    const-wide/16 v16, 0x1

    if-eqz v0, :cond_e

    cmp-long v2, v14, v4

    if-ltz v2, :cond_0

    goto/16 :goto_d

    :cond_0
    int-to-byte v2, v0

    if-ge v2, v7, :cond_3

    if-lt v2, v9, :cond_2

    add-long v18, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v0

    if-le v0, v6, :cond_1

    goto :goto_0

    :cond_1
    move-wide/from16 v14, v18

    goto/16 :goto_2

    :cond_2
    :goto_0
    const/4 v0, -0x1

    goto/16 :goto_d

    :cond_3
    if-ge v2, v10, :cond_8

    shr-int/lit8 v0, v0, 0x8

    not-int v0, v0

    int-to-byte v0, v0

    if-nez v0, :cond_5

    add-long v18, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v0

    cmp-long v14, v18, v4

    if-ltz v14, :cond_4

    invoke-static {v2, v0}, Lcom/google/protobuf/c3;->d(II)I

    move-result v0

    goto/16 :goto_d

    :cond_4
    move-wide/from16 v14, v18

    :cond_5
    if-gt v0, v6, :cond_2

    if-ne v2, v7, :cond_6

    if-lt v0, v8, :cond_2

    :cond_6
    if-ne v2, v11, :cond_7

    if-ge v0, v8, :cond_2

    :cond_7
    add-long v18, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v0

    if-le v0, v6, :cond_1

    goto :goto_0

    :cond_8
    shr-int/lit8 v12, v0, 0x8

    not-int v12, v12

    int-to-byte v12, v12

    if-nez v12, :cond_a

    add-long v19, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v12

    cmp-long v0, v19, v4

    if-ltz v0, :cond_9

    invoke-static {v2, v12}, Lcom/google/protobuf/c3;->d(II)I

    move-result v0

    goto/16 :goto_d

    :cond_9
    move-wide/from16 v14, v19

    const/4 v0, 0x0

    goto :goto_1

    :cond_a
    shr-int/lit8 v0, v0, 0x10

    int-to-byte v0, v0

    :goto_1
    if-nez v0, :cond_c

    add-long v19, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v0

    cmp-long v14, v19, v4

    if-ltz v14, :cond_b

    invoke-static {v2, v12, v0}, Lcom/google/protobuf/c3;->e(III)I

    move-result v0

    goto/16 :goto_d

    :cond_b
    move-wide/from16 v14, v19

    :cond_c
    if-gt v12, v6, :cond_2

    shl-int/lit8 v2, v2, 0x1c

    add-int/lit8 v12, v12, 0x70

    add-int/2addr v12, v2

    shr-int/lit8 v2, v12, 0x1e

    if-nez v2, :cond_2

    if-gt v0, v6, :cond_2

    add-long v19, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v0

    if-le v0, v6, :cond_d

    goto :goto_0

    :cond_d
    move-wide/from16 v14, v19

    :cond_e
    :goto_2
    sub-long/2addr v4, v14

    long-to-int v0, v4

    const/16 v2, 0x10

    if-ge v0, v2, :cond_f

    const/4 v4, 0x0

    goto :goto_6

    :cond_f
    long-to-int v2, v14

    and-int/lit8 v2, v2, 0x7

    rsub-int/lit8 v2, v2, 0x8

    move-wide v11, v14

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v2, :cond_11

    add-long v19, v11, v16

    invoke-static {v1, v11, v12}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v11

    if-gez v11, :cond_10

    goto :goto_6

    :cond_10
    add-int/lit8 v4, v4, 0x1

    move-wide/from16 v11, v19

    goto :goto_3

    :cond_11
    :goto_4
    add-int/lit8 v2, v4, 0x8

    if-gt v2, v0, :cond_13

    sget-wide v19, Lcom/google/protobuf/z2;->f:J

    add-long v5, v19, v11

    sget-object v13, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v13, v1, v5, v6}, Lcom/google/protobuf/y2;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v5, v5, v21

    const-wide/16 v21, 0x0

    cmp-long v5, v5, v21

    if-eqz v5, :cond_12

    goto :goto_5

    :cond_12
    const-wide/16 v4, 0x8

    add-long/2addr v11, v4

    move v4, v2

    const/16 v6, -0x41

    goto :goto_4

    :cond_13
    :goto_5
    if-ge v4, v0, :cond_15

    add-long v5, v11, v16

    invoke-static {v1, v11, v12}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v2

    if-gez v2, :cond_14

    goto :goto_6

    :cond_14
    add-int/lit8 v4, v4, 0x1

    move-wide v11, v5

    goto :goto_5

    :cond_15
    move v4, v0

    :goto_6
    sub-int/2addr v0, v4

    int-to-long v4, v4

    add-long/2addr v14, v4

    :goto_7
    const/4 v2, 0x0

    :goto_8
    if-lez v0, :cond_17

    add-long v4, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v2

    if-ltz v2, :cond_16

    add-int/lit8 v0, v0, -0x1

    move-wide v14, v4

    goto :goto_8

    :cond_16
    move-wide v14, v4

    :cond_17
    if-nez v0, :cond_18

    const/16 v19, 0x0

    goto/16 :goto_c

    :cond_18
    add-int/lit8 v4, v0, -0x1

    if-ge v2, v7, :cond_1c

    if-nez v4, :cond_19

    move/from16 v19, v2

    goto/16 :goto_c

    :cond_19
    add-int/lit8 v0, v0, -0x2

    if-lt v2, v9, :cond_1b

    add-long v4, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v2

    const/16 v6, -0x41

    if-le v2, v6, :cond_1a

    goto :goto_9

    :cond_1a
    move-wide v14, v4

    goto :goto_b

    :cond_1b
    :goto_9
    const/16 v19, -0x1

    goto :goto_c

    :cond_1c
    const-wide/16 v11, 0x2

    if-ge v2, v10, :cond_20

    const/4 v5, 0x2

    if-ge v4, v5, :cond_1d

    invoke-static {v14, v15, v1, v2, v4}, Lcom/google/protobuf/a3;->X(J[BII)I

    move-result v0

    :goto_a
    move/from16 v19, v0

    goto :goto_c

    :cond_1d
    add-int/lit8 v0, v0, -0x3

    add-long v4, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v6

    const/16 v13, -0x41

    if-gt v6, v13, :cond_1b

    if-ne v2, v7, :cond_1e

    if-lt v6, v8, :cond_1b

    :cond_1e
    const/16 v13, -0x13

    move-wide v9, v4

    if-ne v2, v13, :cond_1f

    if-ge v6, v8, :cond_1b

    :cond_1f
    add-long/2addr v14, v11

    invoke-static {v1, v9, v10}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v2

    const/16 v4, -0x41

    if-le v2, v4, :cond_22

    goto :goto_9

    :cond_20
    const/4 v6, 0x3

    if-ge v4, v6, :cond_21

    invoke-static {v14, v15, v1, v2, v4}, Lcom/google/protobuf/a3;->X(J[BII)I

    move-result v0

    goto :goto_a

    :cond_21
    add-int/lit8 v0, v0, -0x4

    add-long v9, v14, v16

    invoke-static {v1, v14, v15}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v4

    const/16 v6, -0x41

    if-gt v4, v6, :cond_1b

    shl-int/lit8 v2, v2, 0x1c

    add-int/lit8 v4, v4, 0x70

    add-int/2addr v4, v2

    shr-int/lit8 v2, v4, 0x1e

    if-nez v2, :cond_1b

    add-long/2addr v11, v14

    invoke-static {v1, v9, v10}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v2

    if-gt v2, v6, :cond_1b

    const-wide/16 v9, 0x3

    add-long/2addr v14, v9

    invoke-static {v1, v11, v12}, Lcom/google/protobuf/z2;->g([BJ)B

    move-result v2

    if-le v2, v6, :cond_22

    goto :goto_9

    :cond_22
    :goto_b
    const/16 v9, -0x3e

    const/16 v10, -0x10

    goto/16 :goto_7

    :goto_c
    move/from16 v0, v19

    :goto_d
    return v0

    :cond_23
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v1, v2, v4}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Array length=%d, index=%d, limit=%d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    if-eqz v0, :cond_31

    if-lt v2, v4, :cond_24

    goto/16 :goto_17

    :cond_24
    int-to-byte v6, v0

    if-ge v6, v7, :cond_27

    const/16 v9, -0x3e

    if-lt v6, v9, :cond_26

    add-int/lit8 v0, v2, 0x1

    aget-byte v2, v1, v2

    const/16 v6, -0x41

    if-le v2, v6, :cond_25

    goto :goto_e

    :cond_25
    move v2, v0

    goto/16 :goto_12

    :cond_26
    :goto_e
    const/4 v0, -0x1

    goto/16 :goto_17

    :cond_27
    const/16 v9, -0x10

    if-ge v6, v9, :cond_2c

    shr-int/lit8 v0, v0, 0x8

    not-int v0, v0

    int-to-byte v0, v0

    if-nez v0, :cond_29

    add-int/lit8 v0, v2, 0x1

    aget-byte v2, v1, v2

    if-lt v0, v4, :cond_28

    invoke-static {v6, v2}, Lcom/google/protobuf/c3;->d(II)I

    move-result v0

    goto/16 :goto_17

    :cond_28
    const/16 v9, -0x41

    goto :goto_f

    :cond_29
    const/16 v9, -0x41

    move/from16 v23, v2

    move v2, v0

    move/from16 v0, v23

    :goto_f
    if-gt v2, v9, :cond_26

    if-ne v6, v7, :cond_2a

    if-lt v2, v8, :cond_26

    :cond_2a
    const/16 v5, -0x13

    if-ne v6, v5, :cond_2b

    if-ge v2, v8, :cond_26

    :cond_2b
    add-int/lit8 v2, v0, 0x1

    aget-byte v0, v1, v0

    const/16 v6, -0x41

    if-le v0, v6, :cond_31

    goto :goto_e

    :cond_2c
    shr-int/lit8 v9, v0, 0x8

    not-int v9, v9

    int-to-byte v9, v9

    if-nez v9, :cond_2e

    add-int/lit8 v0, v2, 0x1

    aget-byte v9, v1, v2

    if-lt v0, v4, :cond_2d

    invoke-static {v6, v9}, Lcom/google/protobuf/c3;->d(II)I

    move-result v0

    goto/16 :goto_17

    :cond_2d
    const/4 v2, 0x0

    goto :goto_10

    :cond_2e
    shr-int/lit8 v0, v0, 0x10

    int-to-byte v0, v0

    move/from16 v23, v2

    move v2, v0

    move/from16 v0, v23

    :goto_10
    if-nez v2, :cond_30

    add-int/lit8 v2, v0, 0x1

    aget-byte v0, v1, v0

    if-lt v2, v4, :cond_2f

    invoke-static {v6, v9, v0}, Lcom/google/protobuf/c3;->e(III)I

    move-result v0

    goto/16 :goto_17

    :cond_2f
    const/16 v10, -0x41

    move/from16 v23, v2

    move v2, v0

    move/from16 v0, v23

    goto :goto_11

    :cond_30
    const/16 v10, -0x41

    :goto_11
    if-gt v9, v10, :cond_26

    shl-int/lit8 v6, v6, 0x1c

    add-int/lit8 v9, v9, 0x70

    add-int/2addr v9, v6

    shr-int/lit8 v6, v9, 0x1e

    if-nez v6, :cond_26

    if-gt v2, v10, :cond_26

    add-int/lit8 v2, v0, 0x1

    aget-byte v0, v1, v0

    if-le v0, v10, :cond_31

    goto :goto_e

    :cond_31
    :goto_12
    if-ge v2, v4, :cond_32

    aget-byte v0, v1, v2

    if-ltz v0, :cond_32

    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    :cond_32
    if-lt v2, v4, :cond_33

    :goto_13
    const/4 v12, 0x0

    goto/16 :goto_16

    :cond_33
    :goto_14
    if-lt v2, v4, :cond_34

    goto :goto_13

    :cond_34
    add-int/lit8 v0, v2, 0x1

    aget-byte v6, v1, v2

    if-gez v6, :cond_3f

    if-ge v6, v7, :cond_38

    if-lt v0, v4, :cond_35

    move v12, v6

    goto/16 :goto_16

    :cond_35
    const/16 v9, -0x3e

    if-lt v6, v9, :cond_37

    add-int/lit8 v2, v2, 0x2

    aget-byte v0, v1, v0

    const/16 v6, -0x41

    if-le v0, v6, :cond_36

    goto :goto_15

    :cond_36
    move v12, v6

    const/16 v5, -0x13

    const/16 v10, -0x10

    goto :goto_14

    :cond_37
    :goto_15
    const/4 v12, -0x1

    goto :goto_16

    :cond_38
    const/16 v9, -0x3e

    const/16 v10, -0x10

    if-ge v6, v10, :cond_3d

    add-int/lit8 v11, v4, -0x1

    if-lt v0, v11, :cond_39

    invoke-static {v1, v0, v4}, Lcom/google/protobuf/c3;->a([BII)I

    move-result v12

    goto :goto_16

    :cond_39
    add-int/lit8 v11, v2, 0x2

    aget-byte v0, v1, v0

    const/16 v12, -0x41

    if-gt v0, v12, :cond_37

    if-ne v6, v7, :cond_3a

    if-lt v0, v8, :cond_37

    :cond_3a
    const/16 v5, -0x13

    if-ne v6, v5, :cond_3b

    if-ge v0, v8, :cond_37

    :cond_3b
    add-int/lit8 v2, v2, 0x3

    aget-byte v0, v1, v11

    const/16 v6, -0x41

    if-le v0, v6, :cond_3c

    goto :goto_15

    :cond_3c
    move v12, v6

    goto :goto_14

    :cond_3d
    const/16 v5, -0x13

    add-int/lit8 v11, v4, -0x2

    if-lt v0, v11, :cond_3e

    invoke-static {v1, v0, v4}, Lcom/google/protobuf/c3;->a([BII)I

    move-result v12

    goto :goto_16

    :cond_3e
    add-int/lit8 v11, v2, 0x2

    aget-byte v0, v1, v0

    const/16 v12, -0x41

    if-gt v0, v12, :cond_37

    shl-int/lit8 v6, v6, 0x1c

    add-int/lit8 v0, v0, 0x70

    add-int/2addr v0, v6

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_37

    add-int/lit8 v0, v2, 0x3

    aget-byte v6, v1, v11

    if-gt v6, v12, :cond_37

    add-int/lit8 v2, v2, 0x4

    aget-byte v0, v1, v0

    if-le v0, v12, :cond_33

    goto :goto_15

    :goto_16
    move v0, v12

    :goto_17
    return v0

    :cond_3f
    const/16 v5, -0x13

    move v2, v0

    goto :goto_14

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
