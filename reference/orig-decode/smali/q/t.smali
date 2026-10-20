.class public final Lq/t;
.super Lq/x;


# instance fields
.field public e:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 5
    invoke-direct {p0, v0}, Lq/t;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lq/v;->a:[J

    iput-object v0, p0, Lq/x;->a:[J

    sget-object v0, Lr/a;->c:[Ljava/lang/Object;

    iput-object v0, p0, Lq/x;->b:[Ljava/lang/Object;

    if-ltz p1, :cond_0

    .line 3
    invoke-static {p1}, Lq/v;->d(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lq/t;->g(I)V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Capacity must be a positive value."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    invoke-virtual {p0, p1}, Lq/t;->e(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lq/x;->b:[Ljava/lang/Object;

    aput-object p1, v1, v0

    return-void
.end method

.method public final d()V
    .locals 10

    const/4 v0, 0x0

    iput v0, p0, Lq/x;->d:I

    iget-object v1, p0, Lq/x;->a:[J

    sget-object v2, Lq/v;->a:[J

    if-eq v1, v2, :cond_0

    invoke-static {v1}, Lb9/b;->P([J)V

    iget-object v1, p0, Lq/x;->a:[J

    iget v2, p0, Lq/x;->c:I

    shr-int/lit8 v3, v2, 0x3

    and-int/lit8 v2, v2, 0x7

    shl-int/lit8 v2, v2, 0x3

    aget-wide v4, v1, v3

    const-wide/16 v6, 0xff

    shl-long/2addr v6, v2

    not-long v8, v6

    and-long/2addr v4, v8

    or-long/2addr v4, v6

    aput-wide v4, v1, v3

    :cond_0
    iget-object v1, p0, Lq/x;->b:[Ljava/lang/Object;

    iget v2, p0, Lq/x;->c:I

    invoke-static {v0, v2, v1}, Lb9/b;->O(II[Ljava/lang/Object;)V

    iget v0, p0, Lq/x;->c:I

    invoke-static {v0}, Lq/v;->a(I)I

    move-result v0

    iget v1, p0, Lq/x;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Lq/t;->e:I

    return-void
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const v4, -0x3361d2af    # -8.293031E7f

    mul-int/2addr v3, v4

    shl-int/lit8 v4, v3, 0x10

    xor-int/2addr v3, v4

    ushr-int/lit8 v4, v3, 0x7

    and-int/lit8 v3, v3, 0x7f

    iget v5, v0, Lq/x;->c:I

    and-int v6, v4, v5

    const/4 v7, 0x0

    :goto_1
    iget-object v8, v0, Lq/x;->a:[J

    shr-int/lit8 v9, v6, 0x3

    and-int/lit8 v10, v6, 0x7

    shl-int/lit8 v10, v10, 0x3

    aget-wide v11, v8, v9

    ushr-long/2addr v11, v10

    const/4 v13, 0x1

    add-int/2addr v9, v13

    aget-wide v14, v8, v9

    rsub-int/lit8 v8, v10, 0x40

    shl-long v8, v14, v8

    int-to-long v14, v10

    neg-long v14, v14

    const/16 v10, 0x3f

    shr-long/2addr v14, v10

    and-long/2addr v8, v14

    or-long/2addr v8, v11

    int-to-long v10, v3

    const-wide v14, 0x101010101010101L

    mul-long v16, v10, v14

    move/from16 v18, v3

    xor-long v2, v8, v16

    sub-long v14, v2, v14

    not-long v2, v2

    and-long/2addr v2, v14

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v2, v14

    :goto_2
    const-wide/16 v16, 0x0

    cmp-long v19, v2, v16

    if-eqz v19, :cond_2

    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v16

    shr-int/lit8 v16, v16, 0x3

    add-int v16, v6, v16

    and-int v16, v16, v5

    iget-object v12, v0, Lq/x;->b:[Ljava/lang/Object;

    aget-object v12, v12, v16

    invoke-static {v12, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    return v16

    :cond_1
    const-wide/16 v16, 0x1

    sub-long v16, v2, v16

    and-long v2, v2, v16

    goto :goto_2

    :cond_2
    not-long v2, v8

    const/4 v12, 0x6

    shl-long/2addr v2, v12

    and-long/2addr v2, v8

    and-long/2addr v2, v14

    cmp-long v2, v2, v16

    const/16 v3, 0x8

    if-eqz v2, :cond_7

    invoke-virtual {v0, v4}, Lq/t;->f(I)I

    move-result v1

    iget v2, v0, Lq/t;->e:I

    const-wide/16 v5, 0xff

    if-nez v2, :cond_5

    iget-object v2, v0, Lq/x;->a:[J

    shr-int/lit8 v7, v1, 0x3

    aget-wide v7, v2, v7

    and-int/lit8 v2, v1, 0x7

    shl-int/lit8 v2, v2, 0x3

    shr-long/2addr v7, v2

    and-long/2addr v7, v5

    const-wide/16 v14, 0xfe

    cmp-long v2, v7, v14

    if-nez v2, :cond_3

    goto :goto_4

    :cond_3
    iget v1, v0, Lq/x;->c:I

    if-le v1, v3, :cond_4

    iget v2, v0, Lq/x;->d:I

    int-to-long v2, v2

    const-wide/16 v7, 0x20

    mul-long/2addr v2, v7

    int-to-long v7, v1

    const-wide/16 v14, 0x19

    mul-long/2addr v7, v14

    invoke-static {v2, v3, v7, v8}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v1

    if-gtz v1, :cond_4

    iget v1, v0, Lq/x;->c:I

    invoke-static {v1}, Lq/v;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lq/t;->i(I)V

    goto :goto_3

    :cond_4
    iget v1, v0, Lq/x;->c:I

    invoke-static {v1}, Lq/v;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lq/t;->i(I)V

    :goto_3
    invoke-virtual {v0, v4}, Lq/t;->f(I)I

    move-result v1

    :cond_5
    :goto_4
    iget v2, v0, Lq/x;->d:I

    add-int/2addr v2, v13

    iput v2, v0, Lq/x;->d:I

    iget v2, v0, Lq/t;->e:I

    iget-object v3, v0, Lq/x;->a:[J

    shr-int/lit8 v4, v1, 0x3

    aget-wide v7, v3, v4

    and-int/lit8 v9, v1, 0x7

    shl-int/lit8 v9, v9, 0x3

    shr-long v14, v7, v9

    and-long/2addr v14, v5

    const-wide/16 v16, 0x80

    cmp-long v12, v14, v16

    if-nez v12, :cond_6

    move/from16 v19, v13

    goto :goto_5

    :cond_6
    const/16 v19, 0x0

    :goto_5
    sub-int v2, v2, v19

    iput v2, v0, Lq/t;->e:I

    shl-long v12, v5, v9

    not-long v12, v12

    and-long/2addr v7, v12

    shl-long v12, v10, v9

    or-long/2addr v7, v12

    aput-wide v7, v3, v4

    iget v2, v0, Lq/x;->c:I

    add-int/lit8 v4, v1, -0x7

    and-int/2addr v4, v2

    and-int/lit8 v2, v2, 0x7

    add-int/2addr v4, v2

    shr-int/lit8 v2, v4, 0x3

    and-int/lit8 v4, v4, 0x7

    shl-int/lit8 v4, v4, 0x3

    aget-wide v7, v3, v2

    shl-long/2addr v5, v4

    not-long v5, v5

    and-long/2addr v5, v7

    shl-long v7, v10, v4

    or-long v4, v5, v7

    aput-wide v4, v3, v2

    return v1

    :cond_7
    add-int/2addr v7, v3

    add-int/2addr v6, v7

    and-int/2addr v6, v5

    move/from16 v3, v18

    goto/16 :goto_1
.end method

.method public final f(I)I
    .locals 9

    iget v0, p0, Lq/x;->c:I

    and-int/2addr p1, v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lq/x;->a:[J

    shr-int/lit8 v3, p1, 0x3

    and-int/lit8 v4, p1, 0x7

    shl-int/lit8 v4, v4, 0x3

    aget-wide v5, v2, v3

    ushr-long/2addr v5, v4

    add-int/lit8 v3, v3, 0x1

    aget-wide v7, v2, v3

    rsub-int/lit8 v2, v4, 0x40

    shl-long v2, v7, v2

    int-to-long v7, v4

    neg-long v7, v7

    const/16 v4, 0x3f

    shr-long/2addr v7, v4

    and-long/2addr v2, v7

    or-long/2addr v2, v5

    not-long v4, v2

    const/4 v6, 0x7

    shl-long/2addr v4, v6

    and-long/2addr v2, v4

    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v1

    shr-int/lit8 v1, v1, 0x3

    add-int/2addr p1, v1

    and-int/2addr p1, v0

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x8

    add-int/2addr p1, v1

    and-int/2addr p1, v0

    goto :goto_0
.end method

.method public final g(I)V
    .locals 9

    if-lez p1, :cond_0

    invoke-static {p1}, Lq/v;->c(I)I

    move-result p1

    const/4 v0, 0x7

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lq/x;->c:I

    if-nez p1, :cond_1

    sget-object v0, Lq/v;->a:[J

    goto :goto_1

    :cond_1
    add-int/lit8 v0, p1, 0xf

    and-int/lit8 v0, v0, -0x8

    shr-int/lit8 v0, v0, 0x3

    new-array v0, v0, [J

    invoke-static {v0}, Lb9/b;->P([J)V

    :goto_1
    iput-object v0, p0, Lq/x;->a:[J

    shr-int/lit8 v1, p1, 0x3

    and-int/lit8 v2, p1, 0x7

    shl-int/lit8 v2, v2, 0x3

    aget-wide v3, v0, v1

    const-wide/16 v5, 0xff

    shl-long/2addr v5, v2

    not-long v7, v5

    and-long v2, v3, v7

    or-long/2addr v2, v5

    aput-wide v2, v0, v1

    iget v0, p0, Lq/x;->c:I

    invoke-static {v0}, Lq/v;->a(I)I

    move-result v0

    iget v1, p0, Lq/x;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Lq/t;->e:I

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lq/x;->b:[Ljava/lang/Object;

    return-void
.end method

.method public final h(I)V
    .locals 11

    iget v0, p0, Lq/x;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lq/x;->d:I

    iget-object v0, p0, Lq/x;->a:[J

    shr-int/lit8 v1, p1, 0x3

    and-int/lit8 v2, p1, 0x7

    shl-int/lit8 v2, v2, 0x3

    aget-wide v3, v0, v1

    const-wide/16 v5, 0xff

    shl-long v7, v5, v2

    not-long v7, v7

    and-long/2addr v3, v7

    const-wide/16 v7, 0xfe

    shl-long v9, v7, v2

    or-long v2, v3, v9

    aput-wide v2, v0, v1

    iget v1, p0, Lq/x;->c:I

    add-int/lit8 v2, p1, -0x7

    and-int/2addr v2, v1

    and-int/lit8 v1, v1, 0x7

    add-int/2addr v2, v1

    shr-int/lit8 v1, v2, 0x3

    and-int/lit8 v2, v2, 0x7

    shl-int/lit8 v2, v2, 0x3

    aget-wide v3, v0, v1

    shl-long/2addr v5, v2

    not-long v5, v5

    and-long/2addr v3, v5

    shl-long v5, v7, v2

    or-long v2, v3, v5

    aput-wide v2, v0, v1

    iget-object v0, p0, Lq/x;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    return-void
.end method

.method public final i(I)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lq/x;->a:[J

    iget-object v2, v0, Lq/x;->b:[Ljava/lang/Object;

    iget v3, v0, Lq/x;->c:I

    invoke-virtual/range {p0 .. p1}, Lq/t;->g(I)V

    iget-object v4, v0, Lq/x;->b:[Ljava/lang/Object;

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_2

    shr-int/lit8 v7, v6, 0x3

    aget-wide v7, v1, v7

    and-int/lit8 v9, v6, 0x7

    shl-int/lit8 v9, v9, 0x3

    shr-long/2addr v7, v9

    const-wide/16 v9, 0xff

    and-long/2addr v7, v9

    const-wide/16 v11, 0x80

    cmp-long v7, v7, v11

    if-gez v7, :cond_1

    aget-object v7, v2, v6

    if-eqz v7, :cond_0

    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_1

    :cond_0
    const/4 v8, 0x0

    :goto_1
    const v11, -0x3361d2af    # -8.293031E7f

    mul-int/2addr v8, v11

    shl-int/lit8 v11, v8, 0x10

    xor-int/2addr v8, v11

    ushr-int/lit8 v11, v8, 0x7

    invoke-virtual {v0, v11}, Lq/t;->f(I)I

    move-result v11

    and-int/lit8 v8, v8, 0x7f

    int-to-long v12, v8

    iget-object v8, v0, Lq/x;->a:[J

    shr-int/lit8 v14, v11, 0x3

    and-int/lit8 v15, v11, 0x7

    shl-int/lit8 v15, v15, 0x3

    aget-wide v16, v8, v14

    move/from16 v18, v6

    shl-long v5, v9, v15

    not-long v5, v5

    and-long v5, v16, v5

    shl-long v15, v12, v15

    or-long/2addr v5, v15

    aput-wide v5, v8, v14

    iget v5, v0, Lq/x;->c:I

    add-int/lit8 v6, v11, -0x7

    and-int/2addr v6, v5

    and-int/lit8 v5, v5, 0x7

    add-int/2addr v6, v5

    shr-int/lit8 v5, v6, 0x3

    and-int/lit8 v6, v6, 0x7

    shl-int/lit8 v6, v6, 0x3

    aget-wide v14, v8, v5

    shl-long/2addr v9, v6

    not-long v9, v9

    and-long/2addr v9, v14

    shl-long/2addr v12, v6

    or-long/2addr v9, v12

    aput-wide v9, v8, v5

    aput-object v7, v4, v11

    goto :goto_2

    :cond_1
    move/from16 v18, v6

    :goto_2
    add-int/lit8 v6, v18, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
