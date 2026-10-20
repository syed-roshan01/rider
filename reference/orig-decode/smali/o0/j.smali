.class public final Lo0/j;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lq/s;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lq/v;->a:[J

    new-instance v0, Lq/s;

    invoke-direct {v0}, Lq/s;-><init>()V

    iput-object v0, p0, Lo0/j;->a:Lq/s;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lo0/j;->a:Lq/s;

    invoke-virtual {v0, p1}, Lq/s;->e(Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    iget-object v3, v0, Lq/s;->c:[Ljava/lang/Object;

    aget-object v3, v3, v1

    :goto_1
    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    instance-of v4, v3, Lq/t;

    if-eqz v4, :cond_3

    move-object v4, v3

    check-cast v4, Lq/t;

    invoke-virtual {v4, p2}, Lq/t;->c(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    if-eq v3, p2, :cond_4

    new-instance v4, Lq/t;

    invoke-direct {v4}, Lq/t;-><init>()V

    invoke-virtual {v4, v3}, Lq/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, p2}, Lq/t;->c(Ljava/lang/Object;)V

    move-object p2, v4

    goto :goto_3

    :cond_4
    :goto_2
    move-object p2, v3

    :goto_3
    if-eqz v2, :cond_5

    not-int v1, v1

    iget-object v2, v0, Lq/s;->b:[Ljava/lang/Object;

    aput-object p1, v2, v1

    iget-object p1, v0, Lq/s;->c:[Ljava/lang/Object;

    aput-object p2, p1, v1

    goto :goto_4

    :cond_5
    iget-object p1, v0, Lq/s;->c:[Ljava/lang/Object;

    aput-object p2, p1, v1

    :goto_4
    return-void
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget-object v3, v1, Lo0/j;->a:Lq/s;

    invoke-virtual {v3, v0}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    return v5

    :cond_0
    instance-of v6, v4, Lq/t;

    const/4 v7, 0x1

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, Lq/t;

    if-eqz v2, :cond_1

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_0
    const v8, -0x3361d2af    # -8.293031E7f

    mul-int/2addr v4, v8

    shl-int/lit8 v8, v4, 0x10

    xor-int/2addr v4, v8

    and-int/lit8 v8, v4, 0x7f

    iget v9, v6, Lq/x;->c:I

    ushr-int/lit8 v4, v4, 0x7

    and-int/2addr v4, v9

    move v10, v5

    :goto_1
    iget-object v11, v6, Lq/x;->a:[J

    shr-int/lit8 v12, v4, 0x3

    and-int/lit8 v13, v4, 0x7

    shl-int/lit8 v13, v13, 0x3

    aget-wide v14, v11, v12

    ushr-long/2addr v14, v13

    add-int/2addr v12, v7

    aget-wide v16, v11, v12

    rsub-int/lit8 v11, v13, 0x40

    shl-long v11, v16, v11

    move-object/from16 v17, v6

    int-to-long v5, v13

    neg-long v5, v5

    const/16 v13, 0x3f

    shr-long/2addr v5, v13

    and-long/2addr v5, v11

    or-long/2addr v5, v14

    int-to-long v11, v8

    const-wide v13, 0x101010101010101L

    mul-long/2addr v11, v13

    xor-long/2addr v11, v5

    sub-long v13, v11, v13

    not-long v11, v11

    and-long/2addr v11, v13

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v11, v13

    :goto_2
    const-wide/16 v18, 0x0

    cmp-long v15, v11, v18

    if-eqz v15, :cond_3

    invoke-static {v11, v12}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v15

    shr-int/lit8 v15, v15, 0x3

    add-int/2addr v15, v4

    and-int/2addr v15, v9

    move-object/from16 v7, v17

    iget-object v13, v7, Lq/x;->b:[Ljava/lang/Object;

    aget-object v13, v13, v15

    invoke-static {v13, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    goto :goto_3

    :cond_2
    const-wide/16 v13, 0x1

    sub-long v13, v11, v13

    and-long/2addr v11, v13

    move-object/from16 v17, v7

    const/4 v7, 0x1

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto :goto_2

    :cond_3
    move-object/from16 v7, v17

    not-long v11, v5

    const/4 v13, 0x6

    shl-long/2addr v11, v13

    and-long/2addr v5, v11

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v5, v11

    cmp-long v5, v5, v18

    if-eqz v5, :cond_7

    const/4 v15, -0x1

    :goto_3
    if-ltz v15, :cond_4

    const/4 v5, 0x1

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_5

    invoke-virtual {v7, v15}, Lq/t;->h(I)V

    :cond_5
    if-eqz v5, :cond_6

    invoke-virtual {v7}, Lq/x;->b()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v3, v0}, Lq/s;->i(Ljava/lang/Object;)V

    :cond_6
    return v5

    :cond_7
    add-int/lit8 v10, v10, 0x8

    add-int/2addr v4, v10

    and-int/2addr v4, v9

    move-object v6, v7

    const/4 v5, 0x0

    const/4 v7, 0x1

    goto/16 :goto_1

    :cond_8
    invoke-static {v4, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v3, v0}, Lq/s;->i(Ljava/lang/Object;)V

    const/4 v5, 0x1

    goto :goto_5

    :cond_9
    const/4 v5, 0x0

    :goto_5
    return v5
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 32

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iget-object v2, v1, Lo0/j;->a:Lq/s;

    iget-object v3, v2, Lq/s;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_a

    const/4 v6, 0x0

    :goto_0
    aget-wide v7, v3, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v12

    cmp-long v9, v9, v12

    if-eqz v9, :cond_9

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v9, :cond_8

    const-wide/16 v15, 0xff

    and-long v17, v7, v15

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_7

    shl-int/lit8 v17, v6, 0x3

    add-int v5, v17, v14

    iget-object v15, v2, Lq/s;->b:[Ljava/lang/Object;

    aget-object v15, v15, v5

    iget-object v15, v2, Lq/s;->c:[Ljava/lang/Object;

    aget-object v15, v15, v5

    instance-of v10, v15, Lq/t;

    if-eqz v10, :cond_5

    const-string v10, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>"

    invoke-static {v15, v10}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Lq/t;

    iget-object v10, v15, Lq/x;->b:[Ljava/lang/Object;

    iget-object v12, v15, Lq/x;->a:[J

    array-length v13, v12

    add-int/lit8 v13, v13, -0x2

    move-object/from16 v25, v3

    move/from16 v26, v4

    if-ltz v13, :cond_3

    const/4 v11, 0x0

    :goto_2
    aget-wide v3, v12, v11

    move/from16 v27, v6

    move-wide/from16 v28, v7

    not-long v6, v3

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v3

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v6, v6, v23

    cmp-long v6, v6, v23

    if-eqz v6, :cond_2

    sub-int v6, v11, v13

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_1

    const-wide/16 v21, 0xff

    and-long v30, v3, v21

    cmp-long v17, v30, v19

    if-gez v17, :cond_0

    shl-int/lit8 v17, v11, 0x3

    add-int v8, v17, v7

    aget-object v1, v10, v8

    if-ne v1, v0, :cond_0

    invoke-virtual {v15, v8}, Lq/t;->h(I)V

    :cond_0
    const/16 v1, 0x8

    shr-long/2addr v3, v1

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p0

    const/4 v8, 0x7

    goto :goto_3

    :cond_1
    const/16 v1, 0x8

    const-wide/16 v21, 0xff

    if-ne v6, v1, :cond_4

    goto :goto_4

    :cond_2
    const-wide/16 v21, 0xff

    :goto_4
    if-eq v11, v13, :cond_4

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, p0

    move/from16 v6, v27

    move-wide/from16 v7, v28

    goto :goto_2

    :cond_3
    move/from16 v27, v6

    move-wide/from16 v28, v7

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    :cond_4
    invoke-virtual {v15}, Lq/x;->b()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_5
    move-object/from16 v25, v3

    move/from16 v26, v4

    move/from16 v27, v6

    move-wide/from16 v28, v7

    move-wide/from16 v23, v12

    const-string v1, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1"

    invoke-static {v15, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne v15, v0, :cond_6

    :goto_5
    invoke-virtual {v2, v5}, Lq/s;->j(I)Ljava/lang/Object;

    :cond_6
    const/16 v1, 0x8

    goto :goto_6

    :cond_7
    move-object/from16 v25, v3

    move/from16 v26, v4

    move/from16 v27, v6

    move-wide/from16 v28, v7

    move-wide/from16 v23, v12

    move v1, v10

    :goto_6
    shr-long v7, v28, v1

    add-int/lit8 v14, v14, 0x1

    move v10, v1

    move-wide/from16 v12, v23

    move-object/from16 v3, v25

    move/from16 v4, v26

    move/from16 v6, v27

    const/4 v11, 0x7

    move-object/from16 v1, p0

    goto/16 :goto_1

    :cond_8
    move-object/from16 v25, v3

    move/from16 v26, v4

    move/from16 v27, v6

    move v1, v10

    if-ne v9, v1, :cond_a

    move/from16 v4, v26

    move/from16 v5, v27

    goto :goto_7

    :cond_9
    move-object/from16 v25, v3

    move v5, v6

    :goto_7
    if-eq v5, v4, :cond_a

    add-int/lit8 v6, v5, 0x1

    move-object/from16 v1, p0

    move-object/from16 v3, v25

    goto/16 :goto_0

    :cond_a
    return-void
.end method
