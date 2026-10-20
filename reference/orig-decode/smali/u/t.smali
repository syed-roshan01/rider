.class public final Lu/t;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/io/Serializable;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(J[FLd9/s;Ld9/r;)V
    .locals 0

    iput-wide p1, p0, Lu/t;->a:J

    iput-object p3, p0, Lu/t;->b:Ljava/lang/Object;

    iput-object p4, p0, Lu/t;->c:Ljava/io/Serializable;

    iput-object p5, p0, Lu/t;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    sget-object v1, Lq8/l;->a:Lq8/l;

    move-object/from16 v2, p1

    check-cast v2, La2/m;

    iget-object v3, v0, Lu/t;->b:Ljava/lang/Object;

    check-cast v3, [F

    iget-object v4, v0, Lu/t;->c:Ljava/io/Serializable;

    check-cast v4, Ld9/s;

    iget-object v5, v0, Lu/t;->d:Ljava/lang/Object;

    check-cast v5, Ld9/r;

    iget v6, v2, La2/m;->b:I

    iget-wide v7, v0, Lu/t;->a:J

    invoke-static {v7, v8}, La2/b0;->e(J)I

    move-result v9

    if-le v6, v9, :cond_0

    iget v6, v2, La2/m;->b:I

    goto :goto_0

    :cond_0
    invoke-static {v7, v8}, La2/b0;->e(J)I

    move-result v6

    :goto_0
    invoke-static {v7, v8}, La2/b0;->d(J)I

    move-result v9

    iget v10, v2, La2/m;->c:I

    if-ge v10, v9, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v7, v8}, La2/b0;->d(J)I

    move-result v10

    :goto_1
    invoke-virtual {v2, v6}, La2/m;->a(I)I

    move-result v6

    invoke-virtual {v2, v10}, La2/m;->a(I)I

    move-result v7

    invoke-static {v6, v7}, Lo1/s;->g(II)J

    move-result-wide v6

    iget v8, v4, Ld9/s;->a:I

    iget-object v2, v2, La2/m;->a:La2/l;

    check-cast v2, La2/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, La2/b0;->e(J)I

    move-result v9

    invoke-static {v6, v7}, La2/b0;->d(J)I

    move-result v10

    iget-object v11, v2, La2/a;->d:Lb2/v;

    iget-object v12, v11, Lb2/v;->d:Landroid/text/Layout;

    invoke-virtual {v12}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v13

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-ltz v9, :cond_d

    if-ge v9, v13, :cond_c

    if-le v10, v9, :cond_b

    if-gt v10, v13, :cond_a

    sub-int v13, v10, v9

    mul-int/lit8 v13, v13, 0x4

    array-length v14, v3

    sub-int/2addr v14, v8

    if-lt v14, v13, :cond_9

    invoke-virtual {v12, v9}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v13

    add-int/lit8 v14, v10, -0x1

    invoke-virtual {v12, v14}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v14

    new-instance v15, Lb2/d;

    invoke-direct {v15, v11}, Lb2/d;-><init>(Lb2/v;)V

    if-gt v13, v14, :cond_7

    :goto_2
    invoke-virtual {v12, v13}, Landroid/text/Layout;->getLineStart(I)I

    move-result v0

    move/from16 p1, v8

    invoke-virtual {v11, v13}, Lb2/v;->e(I)I

    move-result v8

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v10, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-virtual {v11, v13}, Lb2/v;->f(I)F

    move-result v16

    invoke-virtual {v11, v13}, Lb2/v;->d(I)F

    move-result v17

    move/from16 v18, v0

    invoke-virtual {v12, v13}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v0

    move/from16 v19, v9

    const/4 v9, 0x1

    move/from16 v20, v10

    const/4 v10, 0x0

    if-ne v0, v9, :cond_2

    move v0, v9

    goto :goto_3

    :cond_2
    move v0, v10

    :goto_3
    xor-int/lit8 v21, v0, 0x1

    move/from16 v9, v18

    move/from16 v18, p1

    :goto_4
    if-ge v9, v8, :cond_6

    invoke-virtual {v12, v9}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v22

    if-eqz v0, :cond_3

    if-nez v22, :cond_3

    move/from16 p1, v8

    const/4 v8, 0x1

    invoke-virtual {v15, v9, v10, v10, v8}, Lb2/d;->a(IZZZ)F

    move-result v22

    add-int/lit8 v10, v9, 0x1

    invoke-virtual {v15, v10, v8, v8, v8}, Lb2/d;->a(IZZZ)F

    move-result v10

    move/from16 v23, v0

    move/from16 v8, v22

    const/4 v0, 0x0

    move/from16 v22, v10

    const/4 v10, 0x1

    goto :goto_5

    :cond_3
    move/from16 p1, v8

    if-eqz v0, :cond_4

    if-eqz v22, :cond_4

    const/4 v8, 0x0

    invoke-virtual {v15, v9, v8, v8, v8}, Lb2/d;->a(IZZZ)F

    move-result v10

    move/from16 v23, v0

    add-int/lit8 v0, v9, 0x1

    move/from16 v22, v10

    const/4 v10, 0x1

    invoke-virtual {v15, v0, v10, v10, v8}, Lb2/d;->a(IZZZ)F

    move-result v0

    move/from16 v24, v8

    move v8, v0

    move/from16 v0, v24

    goto :goto_5

    :cond_4
    move/from16 v23, v0

    const/4 v8, 0x0

    const/4 v10, 0x1

    if-eqz v21, :cond_5

    if-eqz v22, :cond_5

    invoke-virtual {v15, v9, v8, v8, v10}, Lb2/d;->a(IZZZ)F

    move-result v0

    add-int/lit8 v8, v9, 0x1

    invoke-virtual {v15, v8, v10, v10, v10}, Lb2/d;->a(IZZZ)F

    move-result v22

    move/from16 v8, v22

    move/from16 v22, v0

    const/4 v0, 0x0

    goto :goto_5

    :cond_5
    move v0, v8

    invoke-virtual {v15, v9, v0, v0, v0}, Lb2/d;->a(IZZZ)F

    move-result v22

    add-int/lit8 v8, v9, 0x1

    invoke-virtual {v15, v8, v10, v10, v0}, Lb2/d;->a(IZZZ)F

    move-result v8

    move/from16 v24, v22

    move/from16 v22, v8

    move/from16 v8, v24

    :goto_5
    aput v8, v3, v18

    add-int/lit8 v8, v18, 0x1

    aput v16, v3, v8

    add-int/lit8 v8, v18, 0x2

    aput v22, v3, v8

    add-int/lit8 v8, v18, 0x3

    aput v17, v3, v8

    add-int/lit8 v18, v18, 0x4

    add-int/lit8 v9, v9, 0x1

    move/from16 v8, p1

    move v10, v0

    move/from16 v0, v23

    goto :goto_4

    :cond_6
    if-eq v13, v14, :cond_7

    add-int/lit8 v13, v13, 0x1

    move/from16 v8, v18

    move/from16 v9, v19

    move/from16 v10, v20

    goto/16 :goto_2

    :cond_7
    iget v0, v4, Ld9/s;->a:I

    invoke-static {v6, v7}, La2/b0;->c(J)I

    move-result v6

    mul-int/lit8 v6, v6, 0x4

    add-int/2addr v6, v0

    iget v0, v4, Ld9/s;->a:I

    :goto_6
    if-ge v0, v6, :cond_8

    add-int/lit8 v7, v0, 0x1

    aget v8, v3, v7

    iget v9, v5, Ld9/r;->a:F

    add-float/2addr v8, v9

    aput v8, v3, v7

    add-int/lit8 v7, v0, 0x3

    aget v8, v3, v7

    add-float/2addr v8, v9

    aput v8, v3, v7

    add-int/lit8 v0, v0, 0x4

    goto :goto_6

    :cond_8
    iput v6, v4, Ld9/s;->a:I

    iget v0, v5, Ld9/r;->a:F

    invoke-virtual {v2}, La2/a;->b()F

    move-result v2

    add-float/2addr v2, v0

    iput v2, v5, Ld9/r;->a:F

    return-object v1

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "endOffset must be smaller or equal to text length"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "endOffset must be greater than startOffset"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "startOffset must be less than text length"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "startOffset must be > 0"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
