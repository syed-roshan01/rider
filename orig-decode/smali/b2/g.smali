.class public final Lb2/g;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/text/Layout;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:[Z

.field public e:[C


# direct methods
.method public constructor <init>(Landroid/text/Layout;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/g;->a:Landroid/text/Layout;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    iget-object v2, p0, Lb2/g;->a:Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const/16 v3, 0xa

    const/4 v4, 0x4

    invoke-static {v2, v3, v1, v0, v4}, Ll9/i;->O0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    if-gez v1, :cond_1

    iget-object v1, p0, Lb2/g;->a:Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lb2/g;->a:Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v1, v2, :cond_0

    iput-object p1, p0, Lb2/g;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v0, p1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iput-object v1, p0, Lb2/g;->c:Ljava/util/ArrayList;

    iget-object p1, p0, Lb2/g;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lb2/g;->d:[Z

    iget-object p1, p0, Lb2/g;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    return-void
.end method


# virtual methods
.method public final a(IZ)F
    .locals 2

    iget-object v0, p0, Lb2/g;->a:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v1

    if-le p1, v1, :cond_0

    move p1, v1

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    move-result p1

    :goto_0
    return p1
.end method

.method public final b(IZZ)F
    .locals 27

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    if-nez v2, :cond_0

    invoke-virtual/range {p0 .. p2}, Lb2/g;->a(IZ)F

    move-result v1

    return v1

    :cond_0
    iget-object v3, v0, Lb2/g;->a:Landroid/text/Layout;

    invoke-static {v3, v1, v2}, Lo1/s;->G(Landroid/text/Layout;IZ)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineStart(I)I

    move-result v5

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v6

    if-eq v1, v5, :cond_1

    if-eq v1, v6, :cond_1

    invoke-virtual/range {p0 .. p2}, Lb2/g;->a(IZ)F

    move-result v1

    return v1

    :cond_1
    if-eqz v1, :cond_2f

    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ne v1, v7, :cond_2

    goto/16 :goto_1b

    :cond_2
    iget-object v7, v0, Lb2/g;->b:Ljava/util/ArrayList;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Ld7/t;->F(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    move-result v8

    const/4 v9, 0x1

    if-gez v8, :cond_3

    add-int/2addr v8, v9

    neg-int v8, v8

    goto :goto_0

    :cond_3
    add-int/2addr v8, v9

    :goto_0
    if-eqz v2, :cond_4

    if-lez v8, :cond_4

    add-int/lit8 v2, v8, -0x1

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    if-ne v1, v10, :cond_4

    move v8, v2

    :cond_4
    if-nez v8, :cond_5

    const/4 v10, 0x0

    goto :goto_1

    :cond_5
    add-int/lit8 v10, v8, -0x1

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    :goto_1
    invoke-virtual {v3, v10}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v10

    invoke-virtual {v3, v10}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v10

    const/4 v11, -0x1

    if-ne v10, v11, :cond_6

    move v10, v9

    goto :goto_2

    :cond_6
    const/4 v10, 0x0

    :goto_2
    invoke-virtual {v0, v6, v5}, Lb2/g;->c(II)I

    move-result v6

    if-nez v8, :cond_7

    const/4 v12, 0x0

    goto :goto_3

    :cond_7
    add-int/lit8 v12, v8, -0x1

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    :goto_3
    sub-int v13, v5, v12

    sub-int v12, v6, v12

    iget-object v14, v0, Lb2/g;->d:[Z

    aget-boolean v15, v14, v8

    iget-object v9, v0, Lb2/g;->c:Ljava/util/ArrayList;

    const/16 v16, 0x0

    if-eqz v15, :cond_8

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/text/Bidi;

    move/from16 v25, v4

    move/from16 v24, v6

    move-object v4, v7

    move/from16 v26, v10

    move v7, v11

    goto/16 :goto_a

    :cond_8
    if-nez v8, :cond_9

    const/4 v15, 0x0

    goto :goto_4

    :cond_9
    add-int/lit8 v15, v8, -0x1

    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    :goto_4
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Number;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    move-result v11

    sub-int v2, v11, v15

    move/from16 v24, v6

    iget-object v6, v0, Lb2/g;->e:[C

    move/from16 v25, v4

    if-eqz v6, :cond_a

    array-length v4, v6

    if-ge v4, v2, :cond_b

    :cond_a
    new-array v6, v2, [C

    :cond_b
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    move/from16 v26, v10

    const/4 v10, 0x0

    invoke-static {v4, v15, v11, v6, v10}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    invoke-static {v6, v10, v2}, Ljava/text/Bidi;->requiresBidi([CII)Z

    move-result v4

    if-eqz v4, :cond_e

    if-nez v8, :cond_c

    const/4 v10, 0x0

    goto :goto_5

    :cond_c
    add-int/lit8 v4, v8, -0x1

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v10

    :goto_5
    invoke-virtual {v3, v10}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v4

    const/4 v7, -0x1

    if-ne v4, v7, :cond_d

    const/16 v23, 0x1

    goto :goto_6

    :cond_d
    const/16 v23, 0x0

    :goto_6
    new-instance v4, Ljava/text/Bidi;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v4

    move-object/from16 v18, v6

    move/from16 v22, v2

    invoke-direct/range {v17 .. v23}, Ljava/text/Bidi;-><init>([CI[BIII)V

    invoke-virtual {v4}, Ljava/text/Bidi;->getRunCount()I

    move-result v2

    const/4 v10, 0x1

    if-ne v2, v10, :cond_f

    :goto_7
    move-object/from16 v4, v16

    goto :goto_8

    :cond_e
    const/4 v7, -0x1

    const/4 v10, 0x1

    goto :goto_7

    :cond_f
    :goto_8
    invoke-virtual {v9, v8, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    aput-boolean v10, v14, v8

    if-eqz v4, :cond_11

    iget-object v2, v0, Lb2/g;->e:[C

    if-ne v6, v2, :cond_10

    move-object/from16 v6, v16

    goto :goto_9

    :cond_10
    move-object v6, v2

    :cond_11
    :goto_9
    iput-object v6, v0, Lb2/g;->e:[C

    :goto_a
    if-eqz v4, :cond_12

    invoke-virtual {v4, v13, v12}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    move-result-object v16

    :cond_12
    move-object/from16 v2, v16

    if-eqz v2, :cond_29

    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_13

    move v7, v6

    move/from16 v8, v25

    move/from16 v2, v26

    :goto_b
    const/4 v10, 0x0

    goto/16 :goto_16

    :cond_13
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v4

    new-array v6, v4, [Lb2/f;

    const/4 v10, 0x0

    :goto_c
    if-ge v10, v4, :cond_15

    new-instance v8, Lb2/f;

    invoke-virtual {v2, v10}, Ljava/text/Bidi;->getRunStart(I)I

    move-result v9

    add-int/2addr v9, v5

    invoke-virtual {v2, v10}, Ljava/text/Bidi;->getRunLimit(I)I

    move-result v11

    add-int/2addr v11, v5

    invoke-virtual {v2, v10}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v12

    rem-int/lit8 v12, v12, 0x2

    const/4 v13, 0x1

    if-ne v12, v13, :cond_14

    const/4 v12, 0x1

    goto :goto_d

    :cond_14
    const/4 v12, 0x0

    :goto_d
    invoke-direct {v8, v9, v12, v11}, Lb2/f;-><init>(IZI)V

    aput-object v8, v6, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_c

    :cond_15
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v8

    new-array v9, v8, [B

    const/4 v10, 0x0

    :goto_e
    if-ge v10, v8, :cond_16

    invoke-virtual {v2, v10}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v11

    int-to-byte v11, v11

    aput-byte v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_e

    :cond_16
    const/4 v10, 0x0

    invoke-static {v9, v10, v6, v10, v4}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    if-ne v1, v5, :cond_1f

    move v2, v10

    :goto_f
    if-ge v2, v4, :cond_18

    aget-object v5, v6, v2

    iget v5, v5, Lb2/f;->a:I

    if-ne v5, v1, :cond_17

    move v11, v2

    goto :goto_10

    :cond_17
    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    :cond_18
    move v11, v7

    :goto_10
    aget-object v1, v6, v11

    if-nez p2, :cond_19

    iget-boolean v1, v1, Lb2/f;->c:Z

    move/from16 v2, v26

    if-ne v2, v1, :cond_1b

    goto :goto_11

    :cond_19
    move/from16 v2, v26

    :goto_11
    if-nez v2, :cond_1a

    const/4 v2, 0x1

    goto :goto_12

    :cond_1a
    move v2, v10

    :cond_1b
    :goto_12
    if-nez v11, :cond_1c

    if-eqz v2, :cond_1c

    move/from16 v8, v25

    invoke-virtual {v3, v8}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    return v1

    :cond_1c
    move/from16 v8, v25

    const/4 v1, 0x1

    sub-int/2addr v4, v1

    if-ne v11, v4, :cond_1d

    if-nez v2, :cond_1d

    invoke-virtual {v3, v8}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    return v1

    :cond_1d
    if-eqz v2, :cond_1e

    sub-int/2addr v11, v1

    aget-object v1, v6, v11

    iget v1, v1, Lb2/f;->a:I

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_1e
    add-int/2addr v11, v1

    aget-object v1, v6, v11

    iget v1, v1, Lb2/f;->a:I

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_1f
    move/from16 v9, v24

    move/from16 v8, v25

    move/from16 v2, v26

    if-le v1, v9, :cond_20

    invoke-virtual {v0, v1, v5}, Lb2/g;->c(II)I

    move-result v1

    :cond_20
    move v5, v10

    :goto_13
    if-ge v5, v4, :cond_22

    aget-object v9, v6, v5

    iget v9, v9, Lb2/f;->b:I

    if-ne v9, v1, :cond_21

    move v11, v5

    goto :goto_14

    :cond_21
    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    :cond_22
    move v11, v7

    :goto_14
    aget-object v1, v6, v11

    if-nez p2, :cond_25

    iget-boolean v1, v1, Lb2/f;->c:Z

    if-ne v2, v1, :cond_23

    goto :goto_15

    :cond_23
    if-nez v2, :cond_24

    const/4 v2, 0x1

    goto :goto_15

    :cond_24
    move v2, v10

    :cond_25
    :goto_15
    if-nez v11, :cond_26

    if-eqz v2, :cond_26

    invoke-virtual {v3, v8}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    return v1

    :cond_26
    const/4 v7, 0x1

    sub-int/2addr v4, v7

    if-ne v11, v4, :cond_27

    if-nez v2, :cond_27

    invoke-virtual {v3, v8}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    return v1

    :cond_27
    if-eqz v2, :cond_28

    sub-int/2addr v11, v7

    aget-object v1, v6, v11

    iget v1, v1, Lb2/f;->b:I

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_28
    add-int/2addr v11, v7

    aget-object v1, v6, v11

    iget v1, v1, Lb2/f;->b:I

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_29
    move/from16 v8, v25

    move/from16 v2, v26

    const/4 v7, 0x1

    goto/16 :goto_b

    :goto_16
    invoke-virtual {v3, v5}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v4

    if-nez p2, :cond_2b

    if-ne v2, v4, :cond_2a

    goto :goto_17

    :cond_2a
    move v9, v2

    goto :goto_18

    :cond_2b
    :goto_17
    if-nez v2, :cond_2c

    move v9, v7

    goto :goto_18

    :cond_2c
    move v9, v10

    :goto_18
    if-ne v1, v5, :cond_2d

    if-eqz v9, :cond_2e

    goto :goto_19

    :cond_2d
    if-nez v9, :cond_2e

    :goto_19
    invoke-virtual {v3, v8}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    goto :goto_1a

    :cond_2e
    invoke-virtual {v3, v8}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    :goto_1a
    return v1

    :cond_2f
    :goto_1b
    invoke-virtual/range {p0 .. p2}, Lb2/g;->a(IZ)F

    move-result v1

    return v1
.end method

.method public final c(II)I
    .locals 2

    :goto_0
    if-le p1, p2, :cond_2

    iget-object v0, p0, Lb2/g;->a:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1680

    if-eq v0, v1, :cond_1

    const/16 v1, 0x2000

    invoke-static {v0, v1}, Ld7/a;->o(II)I

    move-result v1

    if-ltz v1, :cond_0

    const/16 v1, 0x200a

    invoke-static {v0, v1}, Ld7/a;->o(II)I

    move-result v1

    if-gtz v1, :cond_0

    const/16 v1, 0x2007

    if-ne v0, v1, :cond_1

    :cond_0
    const/16 v1, 0x205f

    if-eq v0, v1, :cond_1

    const/16 v1, 0x3000

    if-ne v0, v1, :cond_2

    :cond_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    return p1
.end method
