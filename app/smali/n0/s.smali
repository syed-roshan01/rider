.class public final Ln0/s;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ln0/s;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/s;->c:Ln0/s;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 20

    move-object/from16 v0, p3

    const/4 v1, 0x0

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Ln0/h0;->a(I)I

    move-result v2

    iget v3, v0, Lm0/q2;->m:I

    const/4 v4, 0x1

    if-nez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    const/4 v5, 0x0

    if-eqz v3, :cond_e

    if-ltz v2, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const-string v6, "Parameter offset is out of bounds"

    if-eqz v3, :cond_d

    if-nez v2, :cond_2

    goto/16 :goto_8

    :cond_2
    iget v3, v0, Lm0/q2;->r:I

    iget v7, v0, Lm0/q2;->t:I

    iget v8, v0, Lm0/q2;->s:I

    move v9, v3

    :goto_2
    if-lez v2, :cond_4

    iget-object v10, v0, Lm0/q2;->b:[I

    invoke-virtual {v0, v9}, Lm0/q2;->o(I)I

    move-result v11

    invoke-static {v10, v11}, Ld7/t;->s([II)I

    move-result v10

    add-int/2addr v9, v10

    if-gt v9, v8, :cond_3

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/s;->g(Ljava/lang/String;)V

    throw v5

    :cond_4
    iget-object v2, v0, Lm0/q2;->b:[I

    invoke-virtual {v0, v9}, Lm0/q2;->o(I)I

    move-result v6

    invoke-static {v2, v6}, Ld7/t;->s([II)I

    move-result v2

    iget v6, v0, Lm0/q2;->h:I

    iget-object v8, v0, Lm0/q2;->b:[I

    invoke-virtual {v0, v9}, Lm0/q2;->o(I)I

    move-result v10

    invoke-virtual {v0, v8, v10}, Lm0/q2;->f([II)I

    move-result v8

    iget-object v10, v0, Lm0/q2;->b:[I

    add-int/2addr v9, v2

    invoke-virtual {v0, v9}, Lm0/q2;->o(I)I

    move-result v11

    invoke-virtual {v0, v10, v11}, Lm0/q2;->f([II)I

    move-result v10

    sub-int v11, v10, v8

    iget v12, v0, Lm0/q2;->r:I

    sub-int/2addr v12, v4

    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    move-result v12

    invoke-virtual {v0, v11, v12}, Lm0/q2;->s(II)V

    invoke-virtual {v0, v2}, Lm0/q2;->r(I)V

    iget-object v12, v0, Lm0/q2;->b:[I

    invoke-virtual {v0, v9}, Lm0/q2;->o(I)I

    move-result v13

    mul-int/lit8 v13, v13, 0x5

    invoke-virtual {v0, v3}, Lm0/q2;->o(I)I

    move-result v14

    mul-int/lit8 v14, v14, 0x5

    mul-int/lit8 v15, v2, 0x5

    add-int/2addr v15, v13

    invoke-static {v14, v13, v15, v12, v12}, Lb9/b;->G(III[I[I)V

    if-lez v11, :cond_5

    iget-object v13, v0, Lm0/q2;->c:[Ljava/lang/Object;

    add-int v14, v8, v11

    invoke-virtual {v0, v14}, Lm0/q2;->g(I)I

    move-result v14

    add-int/2addr v10, v11

    invoke-virtual {v0, v10}, Lm0/q2;->g(I)I

    move-result v10

    invoke-static {v6, v14, v10, v13, v13}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_5
    add-int/2addr v8, v11

    sub-int v6, v8, v6

    iget v10, v0, Lm0/q2;->j:I

    iget v13, v0, Lm0/q2;->k:I

    iget-object v14, v0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length v14, v14

    iget v15, v0, Lm0/q2;->l:I

    add-int v1, v3, v2

    move v5, v3

    :goto_3
    if-ge v5, v1, :cond_7

    invoke-virtual {v0, v5}, Lm0/q2;->o(I)I

    move-result v4

    invoke-virtual {v0, v12, v4}, Lm0/q2;->f([II)I

    move-result v16

    move/from16 v17, v1

    sub-int v1, v16, v6

    move/from16 v16, v6

    if-ge v15, v4, :cond_6

    const/4 v6, 0x0

    goto :goto_4

    :cond_6
    move v6, v10

    :goto_4
    invoke-static {v1, v6, v13, v14}, Lm0/q2;->h(IIII)I

    move-result v1

    iget v6, v0, Lm0/q2;->j:I

    move/from16 v18, v10

    iget v10, v0, Lm0/q2;->k:I

    move/from16 v19, v13

    iget-object v13, v0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length v13, v13

    invoke-static {v1, v6, v10, v13}, Lm0/q2;->h(IIII)I

    move-result v1

    mul-int/lit8 v4, v4, 0x5

    add-int/lit8 v4, v4, 0x4

    aput v1, v12, v4

    add-int/lit8 v5, v5, 0x1

    move/from16 v6, v16

    move/from16 v1, v17

    move/from16 v10, v18

    move/from16 v13, v19

    const/4 v4, 0x1

    goto :goto_3

    :cond_7
    add-int v1, v9, v2

    invoke-virtual/range {p3 .. p3}, Lm0/q2;->n()I

    move-result v4

    iget-object v5, v0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-static {v5, v9, v4}, Ld7/t;->w(Ljava/util/ArrayList;II)I

    move-result v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    if-ltz v5, :cond_8

    :goto_5
    iget-object v10, v0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v5, v10, :cond_8

    iget-object v10, v0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm0/c;

    invoke-virtual {v0, v10}, Lm0/q2;->c(Lm0/c;)I

    move-result v12

    if-lt v12, v9, :cond_8

    if-ge v12, v1, :cond_8

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v10, v0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_5

    :cond_8
    sub-int v1, v3, v9

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v10, 0x0

    :goto_6
    if-ge v10, v5, :cond_a

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm0/c;

    invoke-virtual {v0, v12}, Lm0/q2;->c(Lm0/c;)I

    move-result v13

    add-int/2addr v13, v1

    iget v14, v0, Lm0/q2;->f:I

    if-lt v13, v14, :cond_9

    sub-int v14, v4, v13

    neg-int v14, v14

    iput v14, v12, Lm0/c;->a:I

    goto :goto_7

    :cond_9
    iput v13, v12, Lm0/c;->a:I

    :goto_7
    iget-object v14, v0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-static {v14, v13, v4}, Ld7/t;->w(Ljava/util/ArrayList;II)I

    move-result v13

    iget-object v14, v0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v14, v13, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_a
    invoke-virtual {v0, v9, v2}, Lm0/q2;->B(II)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_c

    iget v1, v0, Lm0/q2;->s:I

    invoke-virtual {v0, v7, v1, v3}, Lm0/q2;->l(III)V

    if-lez v11, :cond_b

    sub-int/2addr v9, v2

    invoke-virtual {v0, v8, v11, v9}, Lm0/q2;->C(III)V

    :cond_b
    :goto_8
    return-void

    :cond_c
    const-string v0, "Unexpectedly removed anchors"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_d
    move-object v0, v5

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object v0, v5

    const-string v1, "Cannot move a group while inserting"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo7/d0;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "offset"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Ln0/g0;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
