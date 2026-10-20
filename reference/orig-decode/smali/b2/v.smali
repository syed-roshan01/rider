.class public final Lb2/v;
.super Ljava/lang/Object;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Landroid/text/Layout;

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:F

.field public final i:F

.field public final j:Z

.field public final k:Landroid/graphics/Paint$FontMetricsInt;

.field public final l:I

.field public final m:[Ld2/h;

.field public final n:Landroid/graphics/Rect;

.field public final o:Lq8/c;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;FLi2/e;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILb2/h;)V
    .locals 47

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    move/from16 v3, p4

    move/from16 v15, p7

    move/from16 v14, p8

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v13, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v15, v1, Lb2/v;->a:Z

    iput-boolean v13, v1, Lb2/v;->b:Z

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    iput-object v6, v1, Lb2/v;->n:Landroid/graphics/Rect;

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    invoke-static/range {p6 .. p6}, Lb2/w;->a(I)Landroid/text/TextDirectionHeuristic;

    move-result-object v38

    sget-object v7, Lb2/r;->a:Landroid/text/Layout$Alignment;

    const/4 v12, 0x1

    const/4 v11, 0x2

    if-eqz v3, :cond_4

    if-eq v3, v12, :cond_3

    if-eq v3, v11, :cond_2

    const/4 v7, 0x3

    if-eq v3, v7, :cond_1

    const/4 v7, 0x4

    if-eq v3, v7, :cond_0

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :goto_0
    move-object/from16 v16, v3

    goto :goto_1

    :cond_0
    sget-object v3, Lb2/r;->b:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_1
    sget-object v3, Lb2/r;->a:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_2
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_3
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_4
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_0

    :goto_1
    instance-of v3, v0, Landroid/text/Spanned;

    if-eqz v3, :cond_5

    move-object v3, v0

    check-cast v3, Landroid/text/Spanned;

    const/4 v7, -0x1

    const-class v8, Ld2/a;

    invoke-interface {v3, v7, v6, v8}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v3

    if-ge v3, v6, :cond_5

    move v3, v12

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    const-string v6, "TextLayout:initLayout"

    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual/range {p14 .. p14}, Lb2/h;->a()Landroid/text/BoringLayout$Metrics;

    move-result-object v8

    float-to-double v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    double-to-float v9, v10

    float-to-int v11, v9

    sget-object v10, Lb2/o;->a:Lb2/j;

    const/16 v9, 0x21

    if-eqz v8, :cond_9

    :try_start_1
    invoke-virtual/range {p14 .. p14}, Lb2/h;->b()F

    move-result v17

    cmpg-float v2, v17, v2

    if-gtz v2, :cond_9

    if-nez v3, :cond_9

    iput-boolean v12, v1, Lb2/v;->j:Z

    if-ltz v11, :cond_8

    if-ltz v11, :cond_7

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v9, :cond_6

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move v4, v11

    move-object/from16 v5, v16

    move/from16 v9, p7

    move-object/from16 v46, v10

    move v10, v13

    move/from16 v17, v11

    const/4 v13, 0x2

    move-object/from16 v11, p5

    move v0, v12

    move/from16 v12, v17

    invoke-static/range {v2 .. v12}, Lb2/a;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    move-result-object v2

    goto :goto_3

    :cond_6
    move-object/from16 v46, v10

    move/from16 v17, v11

    move v0, v12

    const/4 v13, 0x2

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move/from16 v4, v17

    move-object/from16 v5, v16

    move/from16 v9, p7

    move-object/from16 v10, p5

    invoke-static/range {v2 .. v11}, Lb2/b;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    move-result-object v2

    :goto_3
    move-object v0, v2

    move-object/from16 v2, v46

    goto/16 :goto_4

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "negative ellipsized width"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "negative width"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    goto/16 :goto_14

    :cond_9
    move-object/from16 v46, v10

    move/from16 v17, v11

    move v0, v12

    const/4 v12, 0x2

    const/4 v11, 0x0

    iput-boolean v11, v1, Lb2/v;->j:Z

    const/4 v8, 0x0

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v9

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v10, v2

    new-instance v7, Lb2/q;

    move-object v2, v7

    move v3, v4

    move v4, v5

    move v5, v8

    move v6, v9

    move-object v9, v7

    move/from16 v7, v17

    move/from16 v8, p8

    move-object v0, v9

    move v9, v10

    move/from16 v10, p13

    move/from16 v11, p9

    move/from16 v12, p10

    move/from16 v21, v13

    move/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, v16

    move-object/from16 v16, v38

    move-object/from16 v17, p3

    move-object/from16 v18, p5

    move-object/from16 v19, p1

    move/from16 v20, p7

    invoke-direct/range {v2 .. v23}, Lb2/q;-><init>(FFIIIIIIIIIILandroid/text/Layout$Alignment;Landroid/text/TextDirectionHeuristic;Li2/e;Landroid/text/TextUtils$TruncateAt;Ljava/lang/CharSequence;ZZ[I[I)V

    move-object/from16 v2, v46

    invoke-interface {v2, v0}, Lb2/p;->a(Lb2/q;)Landroid/text/StaticLayout;

    move-result-object v0

    :goto_4
    iput-object v0, v1, Lb2/v;->d:Landroid/text/Layout;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v3

    move/from16 v4, p8

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v1, Lb2/v;->e:I

    add-int/lit8 v5, v3, -0x1

    if-ge v3, v4, :cond_b

    :cond_a
    const/4 v12, 0x0

    goto :goto_5

    :cond_b
    invoke-virtual {v0, v5}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v4

    if-gtz v4, :cond_c

    invoke-virtual {v0, v5}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v4

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-eq v4, v6, :cond_a

    :cond_c
    const/4 v12, 0x1

    :goto_5
    iput-boolean v12, v1, Lb2/v;->c:Z

    sget-wide v6, Lb2/w;->b:J

    const-wide v8, 0xffffffffL

    const/16 v4, 0x20

    if-nez p7, :cond_f

    iget-boolean v10, v1, Lb2/v;->j:Z

    if-eqz v10, :cond_d

    move-object v10, v0

    check-cast v10, Landroid/text/BoringLayout;

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x21

    if-lt v11, v12, :cond_10

    invoke-static {v10}, Landroidx/activity/q;->r(Landroid/text/BoringLayout;)Z

    move-result v10

    goto :goto_6

    :cond_d
    const/16 v12, 0x21

    move-object v10, v0

    check-cast v10, Landroid/text/StaticLayout;

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v11, v12, :cond_e

    invoke-static {v10}, Lb2/n;->a(Landroid/text/StaticLayout;)Z

    move-result v10

    :goto_6
    if-eqz v10, :cond_10

    goto :goto_7

    :cond_e
    const/16 v10, 0x1c

    if-lt v11, v10, :cond_10

    :cond_f
    :goto_7
    const/4 v13, 0x0

    goto :goto_c

    :cond_10
    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v10

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v11

    const/4 v13, 0x0

    invoke-virtual {v0, v13}, Landroid/text/Layout;->getLineStart(I)I

    move-result v14

    invoke-virtual {v0, v13}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v15

    invoke-static {v10, v11, v14, v15}, Li1/b;->q(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    move-result-object v14

    invoke-virtual {v0, v13}, Landroid/text/Layout;->getLineAscent(I)I

    move-result v15

    iget v12, v14, Landroid/graphics/Rect;->top:I

    if-ge v12, v15, :cond_11

    sub-int/2addr v15, v12

    :goto_8
    const/4 v12, 0x1

    goto :goto_9

    :cond_11
    invoke-virtual {v0}, Landroid/text/Layout;->getTopPadding()I

    move-result v15

    goto :goto_8

    :goto_9
    if-ne v3, v12, :cond_12

    goto :goto_a

    :cond_12
    invoke-virtual {v0, v5}, Landroid/text/Layout;->getLineStart(I)I

    move-result v3

    invoke-virtual {v0, v5}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v12

    invoke-static {v10, v11, v3, v12}, Li1/b;->q(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    move-result-object v14

    :goto_a
    invoke-virtual {v0, v5}, Landroid/text/Layout;->getLineDescent(I)I

    move-result v3

    iget v10, v14, Landroid/graphics/Rect;->bottom:I

    if-le v10, v3, :cond_13

    sub-int/2addr v10, v3

    goto :goto_b

    :cond_13
    invoke-virtual {v0}, Landroid/text/Layout;->getBottomPadding()I

    move-result v10

    :goto_b
    if-nez v15, :cond_14

    if-nez v10, :cond_14

    goto :goto_c

    :cond_14
    int-to-long v6, v15

    shl-long/2addr v6, v4

    int-to-long v10, v10

    and-long/2addr v10, v8

    or-long/2addr v6, v10

    :goto_c
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    instance-of v3, v3, Landroid/text/Spanned;

    if-nez v3, :cond_15

    new-array v0, v13, [Ld2/h;

    goto :goto_d

    :cond_15
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    const-string v10, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {v3, v10}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/text/Spanned;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v10, Ld2/h;

    invoke-interface {v3, v13, v0, v10}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld2/h;

    array-length v3, v0

    if-nez v3, :cond_16

    new-array v0, v13, [Ld2/h;

    :cond_16
    :goto_d
    iput-object v0, v1, Lb2/v;->m:[Ld2/h;

    array-length v3, v0

    move v10, v13

    move v11, v10

    move v12, v11

    :goto_e
    if-ge v10, v3, :cond_19

    aget-object v14, v0, v10

    iget v15, v14, Ld2/h;->k:I

    if-gez v15, :cond_17

    invoke-static {v15}, Ljava/lang/Math;->abs(I)I

    move-result v15

    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    move-result v11

    :cond_17
    iget v14, v14, Ld2/h;->l:I

    if-gez v14, :cond_18

    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    move-result v12

    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    :cond_18
    add-int/lit8 v10, v10, 0x1

    goto :goto_e

    :cond_19
    if-nez v11, :cond_1a

    if-nez v12, :cond_1a

    sget-wide v10, Lb2/w;->b:J

    goto :goto_f

    :cond_1a
    int-to-long v10, v11

    shl-long/2addr v10, v4

    int-to-long v14, v12

    and-long/2addr v14, v8

    or-long/2addr v10, v14

    :goto_f
    shr-long v14, v6, v4

    long-to-int v0, v14

    shr-long v3, v10, v4

    long-to-int v3, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v1, Lb2/v;->f:I

    and-long v3, v6, v8

    long-to-int v0, v3

    and-long v3, v10, v8

    long-to-int v3, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v1, Lb2/v;->g:I

    iget-object v0, v1, Lb2/v;->m:[Ld2/h;

    iget v3, v1, Lb2/v;->e:I

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    iget-object v6, v1, Lb2/v;->d:Landroid/text/Layout;

    invoke-virtual {v6, v3}, Landroid/text/Layout;->getLineStart(I)I

    move-result v7

    invoke-virtual {v6, v3}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v6

    if-ne v7, v6, :cond_1e

    array-length v6, v0

    if-nez v6, :cond_1b

    move v12, v4

    goto :goto_10

    :cond_1b
    move v12, v13

    :goto_10
    xor-int/2addr v4, v12

    if-eqz v4, :cond_1e

    new-instance v4, Landroid/text/SpannableString;

    const-string v6, "\u200b"

    invoke-direct {v4, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    array-length v6, v0

    if-eqz v6, :cond_1d

    aget-object v0, v0, v13

    invoke-virtual {v4}, Landroid/text/SpannableString;->length()I

    move-result v6

    if-eqz v3, :cond_1c

    iget-boolean v3, v0, Ld2/h;->e:Z

    if-eqz v3, :cond_1c

    move v10, v13

    goto :goto_11

    :cond_1c
    iget-boolean v10, v0, Ld2/h;->e:Z

    :goto_11
    new-instance v3, Ld2/h;

    iget v7, v0, Ld2/h;->a:F

    iget-boolean v8, v0, Ld2/h;->e:Z

    iget v0, v0, Ld2/h;->f:F

    move-object/from16 p4, v3

    move/from16 p5, v7

    move/from16 p6, v6

    move/from16 p7, v10

    move/from16 p8, v8

    move/from16 p9, v0

    invoke-direct/range {p4 .. p9}, Ld2/h;-><init>(FIZZF)V

    invoke-virtual {v4}, Landroid/text/SpannableString;->length()I

    move-result v0

    const/16 v6, 0x21

    invoke-virtual {v4, v3, v13, v0, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    const v29, 0x7fffffff

    invoke-virtual {v4}, Landroid/text/SpannableString;->length()I

    move-result v28

    iget-boolean v0, v1, Lb2/v;->a:Z

    iget-boolean v3, v1, Lb2/v;->b:Z

    const/16 v27, 0x0

    sget-object v37, Lb2/e;->a:Landroid/text/Layout$Alignment;

    const v30, 0x7fffffff

    const/16 v40, 0x0

    const v31, 0x7fffffff

    const/high16 v25, 0x3f800000    # 1.0f

    const/16 v26, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    new-instance v6, Lb2/q;

    move-object/from16 v24, v6

    move-object/from16 v39, p3

    move-object/from16 v41, v4

    move/from16 v42, v0

    move/from16 v43, v3

    invoke-direct/range {v24 .. v45}, Lb2/q;-><init>(FFIIIIIIIIIILandroid/text/Layout$Alignment;Landroid/text/TextDirectionHeuristic;Li2/e;Landroid/text/TextUtils$TruncateAt;Ljava/lang/CharSequence;ZZ[I[I)V

    invoke-interface {v2, v6}, Lb2/p;->a(Lb2/q;)Landroid/text/StaticLayout;

    move-result-object v0

    new-instance v2, Landroid/graphics/Paint$FontMetricsInt;

    invoke-direct {v2}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    invoke-virtual {v0, v13}, Landroid/text/Layout;->getLineAscent(I)I

    move-result v3

    iput v3, v2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-virtual {v0, v13}, Landroid/text/StaticLayout;->getLineDescent(I)I

    move-result v3

    iput v3, v2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    invoke-virtual {v0, v13}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v3

    iput v3, v2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    invoke-virtual {v0, v13}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v0

    iput v0, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto :goto_12

    :cond_1d
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "Array is empty."

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    const/4 v2, 0x0

    :goto_12
    if-eqz v2, :cond_1f

    iget v0, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    invoke-virtual {v1, v5}, Lb2/v;->d(I)F

    move-result v3

    invoke-virtual {v1, v5}, Lb2/v;->f(I)F

    move-result v4

    sub-float/2addr v3, v4

    float-to-int v3, v3

    sub-int v10, v0, v3

    goto :goto_13

    :cond_1f
    move v10, v13

    :goto_13
    iput v10, v1, Lb2/v;->l:I

    iput-object v2, v1, Lb2/v;->k:Landroid/graphics/Paint$FontMetricsInt;

    iget-object v0, v1, Lb2/v;->d:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-static {v0, v5, v2}, Lo1/s;->E(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result v0

    iput v0, v1, Lb2/v;->h:F

    iget-object v0, v1, Lb2/v;->d:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-static {v0, v5, v2}, Lo1/s;->F(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result v0

    iput v0, v1, Lb2/v;->i:F

    sget-object v0, Lq8/d;->a:[Lq8/d;

    new-instance v0, Lu1/z0;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v0

    iput-object v0, v1, Lb2/v;->o:Lq8/c;

    return-void

    :goto_14
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget-boolean v0, p0, Lb2/v;->c:Z

    iget-object v1, p0, Lb2/v;->d:Landroid/text/Layout;

    if-eqz v0, :cond_0

    iget v0, p0, Lb2/v;->e:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    move-result v0

    :goto_0
    iget v1, p0, Lb2/v;->f:I

    add-int/2addr v0, v1

    iget v1, p0, Lb2/v;->g:I

    add-int/2addr v0, v1

    iget v1, p0, Lb2/v;->l:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final b(I)F
    .locals 1

    iget v0, p0, Lb2/v;->e:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    iget p1, p0, Lb2/v;->h:F

    iget v0, p0, Lb2/v;->i:F

    add-float/2addr p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(I)F
    .locals 2

    iget v0, p0, Lb2/v;->f:I

    int-to-float v0, v0

    iget v1, p0, Lb2/v;->e:I

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lb2/v;->k:Landroid/graphics/Paint$FontMetricsInt;

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lb2/v;->f(I)F

    move-result p1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    int-to-float v1, v1

    sub-float/2addr p1, v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lb2/v;->d:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineBaseline(I)I

    move-result p1

    int-to-float p1, p1

    :goto_0
    add-float/2addr v0, p1

    return v0
.end method

.method public final d(I)F
    .locals 3

    iget v0, p0, Lb2/v;->e:I

    add-int/lit8 v1, v0, -0x1

    iget-object v2, p0, Lb2/v;->d:Landroid/text/Layout;

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lb2/v;->k:Landroid/graphics/Paint$FontMetricsInt;

    if-eqz v1, :cond_0

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result p1

    int-to-float p1, p1

    iget v0, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    int-to-float v0, v0

    add-float/2addr p1, v0

    return p1

    :cond_0
    iget v1, p0, Lb2/v;->f:I

    int-to-float v1, v1

    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Lb2/v;->g:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    int-to-float p1, p1

    add-float/2addr v1, p1

    return v1
.end method

.method public final e(I)I
    .locals 2

    iget-object v0, p0, Lb2/v;->d:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final f(I)F
    .locals 1

    iget-object v0, p0, Lb2/v;->d:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    move-result v0

    int-to-float v0, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p0, Lb2/v;->f:I

    :goto_0
    int-to-float p1, p1

    add-float/2addr v0, p1

    return v0
.end method

.method public final g(IZ)F
    .locals 2

    iget-object v0, p0, Lb2/v;->o:Lq8/c;

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb2/g;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2}, Lb2/g;->b(IZZ)F

    move-result p2

    iget-object v0, p0, Lb2/v;->d:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lb2/v;->b(I)F

    move-result p1

    add-float/2addr p1, p2

    return p1
.end method

.method public final h(IZ)F
    .locals 2

    iget-object v0, p0, Lb2/v;->o:Lq8/c;

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb2/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Lb2/g;->b(IZZ)F

    move-result p2

    iget-object v0, p0, Lb2/v;->d:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lb2/v;->b(I)F

    move-result p1

    add-float/2addr p1, p2

    return p1
.end method
