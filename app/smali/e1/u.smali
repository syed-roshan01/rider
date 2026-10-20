.class public abstract Le1/u;
.super Ljava/lang/Object;


# direct methods
.method public static final a(Lf1/d;)Landroid/graphics/ColorSpace;
    .locals 23

    move-object/from16 v0, p0

    sget-object v1, Lf1/e;->c:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_0
    sget-object v1, Lf1/e;->o:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Landroid/graphics/ColorSpace$Named;->ACES:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_1
    sget-object v1, Lf1/e;->p:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Landroid/graphics/ColorSpace$Named;->ACESCG:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_2
    sget-object v1, Lf1/e;->m:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v0, Landroid/graphics/ColorSpace$Named;->ADOBE_RGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_3
    sget-object v1, Lf1/e;->h:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Landroid/graphics/ColorSpace$Named;->BT2020:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_4
    sget-object v1, Lf1/e;->g:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v0, Landroid/graphics/ColorSpace$Named;->BT709:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_5
    sget-object v1, Lf1/e;->r:Lf1/k;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v0, Landroid/graphics/ColorSpace$Named;->CIE_LAB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_6
    sget-object v1, Lf1/e;->q:Lf1/t;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v0, Landroid/graphics/ColorSpace$Named;->CIE_XYZ:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_7
    sget-object v1, Lf1/e;->i:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v0, Landroid/graphics/ColorSpace$Named;->DCI_P3:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_8
    sget-object v1, Lf1/e;->j:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v0, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_9
    sget-object v1, Lf1/e;->e:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v0, Landroid/graphics/ColorSpace$Named;->EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_a
    sget-object v1, Lf1/e;->f:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v0, Landroid/graphics/ColorSpace$Named;->LINEAR_EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_b
    sget-object v1, Lf1/e;->d:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    sget-object v0, Landroid/graphics/ColorSpace$Named;->LINEAR_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_c
    sget-object v1, Lf1/e;->k:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    sget-object v0, Landroid/graphics/ColorSpace$Named;->NTSC_1953:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_d
    sget-object v1, Lf1/e;->n:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v0, Landroid/graphics/ColorSpace$Named;->PRO_PHOTO_RGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_e
    sget-object v1, Lf1/e;->l:Lf1/q;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    sget-object v0, Landroid/graphics/ColorSpace$Named;->SMPTE_C:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_1

    :cond_f
    instance-of v1, v0, Lf1/q;

    if-eqz v1, :cond_12

    move-object v1, v0

    check-cast v1, Lf1/q;

    iget-object v2, v1, Lf1/q;->d:Lf1/s;

    invoke-virtual {v2}, Lf1/s;->a()[F

    move-result-object v6

    iget-object v1, v1, Lf1/q;->g:Lf1/r;

    if-eqz v1, :cond_10

    new-instance v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    iget-wide v8, v1, Lf1/r;->b:D

    iget-wide v10, v1, Lf1/r;->c:D

    iget-wide v12, v1, Lf1/r;->d:D

    iget-wide v14, v1, Lf1/r;->e:D

    iget-wide v3, v1, Lf1/r;->f:D

    move-object/from16 v22, v6

    iget-wide v5, v1, Lf1/r;->g:D

    iget-wide v0, v1, Lf1/r;->a:D

    move-object v7, v2

    move-wide/from16 v16, v3

    move-wide/from16 v18, v5

    move-wide/from16 v20, v0

    invoke-direct/range {v7 .. v21}, Landroid/graphics/ColorSpace$Rgb$TransferParameters;-><init>(DDDDDDD)V

    goto :goto_0

    :cond_10
    move-object/from16 v22, v6

    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_11

    new-instance v0, Landroid/graphics/ColorSpace$Rgb;

    move-object/from16 v1, p0

    iget-object v3, v1, Lf1/d;->a:Ljava/lang/String;

    check-cast v1, Lf1/q;

    iget-object v1, v1, Lf1/q;->h:[F

    move-object/from16 v6, v22

    invoke-direct {v0, v3, v1, v6, v2}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLandroid/graphics/ColorSpace$Rgb$TransferParameters;)V

    goto :goto_1

    :cond_11
    move-object/from16 v1, p0

    move-object/from16 v6, v22

    new-instance v0, Landroid/graphics/ColorSpace$Rgb;

    iget-object v4, v1, Lf1/d;->a:Ljava/lang/String;

    move-object v2, v1

    check-cast v2, Lf1/q;

    iget-object v5, v2, Lf1/q;->h:[F

    new-instance v7, Le1/s;

    const/4 v3, 0x0

    iget-object v8, v2, Lf1/q;->l:Lf1/p;

    invoke-direct {v7, v3, v8}, Le1/s;-><init>(ILf1/p;)V

    new-instance v8, Le1/s;

    const/4 v9, 0x1

    iget-object v2, v2, Lf1/q;->o:Lf1/p;

    invoke-direct {v8, v9, v2}, Le1/s;-><init>(ILf1/p;)V

    invoke-virtual {v1, v3}, Lf1/d;->b(I)F

    move-result v9

    invoke-virtual {v1, v3}, Lf1/d;->a(I)F

    move-result v10

    move-object v3, v0

    invoke-direct/range {v3 .. v10}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLjava/util/function/DoubleUnaryOperator;Ljava/util/function/DoubleUnaryOperator;FF)V

    goto :goto_1

    :cond_12
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public static final b(Landroid/graphics/ColorSpace;)Lf1/d;
    .locals 27

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/ColorSpace;->getId()I

    move-result v1

    sget-object v2, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_0

    sget-object v0, Lf1/e;->c:Lf1/q;

    goto/16 :goto_3

    :cond_0
    sget-object v2, Landroid/graphics/ColorSpace$Named;->ACES:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_1

    sget-object v0, Lf1/e;->o:Lf1/q;

    goto/16 :goto_3

    :cond_1
    sget-object v2, Landroid/graphics/ColorSpace$Named;->ACESCG:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_2

    sget-object v0, Lf1/e;->p:Lf1/q;

    goto/16 :goto_3

    :cond_2
    sget-object v2, Landroid/graphics/ColorSpace$Named;->ADOBE_RGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_3

    sget-object v0, Lf1/e;->m:Lf1/q;

    goto/16 :goto_3

    :cond_3
    sget-object v2, Landroid/graphics/ColorSpace$Named;->BT2020:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_4

    sget-object v0, Lf1/e;->h:Lf1/q;

    goto/16 :goto_3

    :cond_4
    sget-object v2, Landroid/graphics/ColorSpace$Named;->BT709:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_5

    sget-object v0, Lf1/e;->g:Lf1/q;

    goto/16 :goto_3

    :cond_5
    sget-object v2, Landroid/graphics/ColorSpace$Named;->CIE_LAB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_6

    sget-object v0, Lf1/e;->r:Lf1/k;

    goto/16 :goto_3

    :cond_6
    sget-object v2, Landroid/graphics/ColorSpace$Named;->CIE_XYZ:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_7

    sget-object v0, Lf1/e;->q:Lf1/t;

    goto/16 :goto_3

    :cond_7
    sget-object v2, Landroid/graphics/ColorSpace$Named;->DCI_P3:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_8

    sget-object v0, Lf1/e;->i:Lf1/q;

    goto/16 :goto_3

    :cond_8
    sget-object v2, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_9

    sget-object v0, Lf1/e;->j:Lf1/q;

    goto/16 :goto_3

    :cond_9
    sget-object v2, Landroid/graphics/ColorSpace$Named;->EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_a

    sget-object v0, Lf1/e;->e:Lf1/q;

    goto/16 :goto_3

    :cond_a
    sget-object v2, Landroid/graphics/ColorSpace$Named;->LINEAR_EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_b

    sget-object v0, Lf1/e;->f:Lf1/q;

    goto/16 :goto_3

    :cond_b
    sget-object v2, Landroid/graphics/ColorSpace$Named;->LINEAR_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_c

    sget-object v0, Lf1/e;->d:Lf1/q;

    goto/16 :goto_3

    :cond_c
    sget-object v2, Landroid/graphics/ColorSpace$Named;->NTSC_1953:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_d

    sget-object v0, Lf1/e;->k:Lf1/q;

    goto/16 :goto_3

    :cond_d
    sget-object v2, Landroid/graphics/ColorSpace$Named;->PRO_PHOTO_RGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_e

    sget-object v0, Lf1/e;->n:Lf1/q;

    goto/16 :goto_3

    :cond_e
    sget-object v2, Landroid/graphics/ColorSpace$Named;->SMPTE_C:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_f

    sget-object v0, Lf1/e;->l:Lf1/q;

    goto/16 :goto_3

    :cond_f
    instance-of v1, v0, Landroid/graphics/ColorSpace$Rgb;

    if-eqz v1, :cond_12

    move-object v1, v0

    check-cast v1, Landroid/graphics/ColorSpace$Rgb;

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getTransferParameters()Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    move-result-object v2

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v3

    array-length v3, v3

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v4, :cond_10

    new-instance v3, Lf1/s;

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v4

    aget v4, v4, v6

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v7

    aget v7, v7, v5

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v8

    const/4 v9, 0x2

    aget v8, v8, v9

    add-float v9, v4, v7

    add-float/2addr v9, v8

    div-float/2addr v4, v9

    div-float/2addr v7, v9

    invoke-direct {v3, v4, v7}, Lf1/s;-><init>(FF)V

    :goto_0
    move-object v11, v3

    goto :goto_1

    :cond_10
    new-instance v3, Lf1/s;

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v4

    aget v4, v4, v6

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v7

    aget v7, v7, v5

    invoke-direct {v3, v4, v7}, Lf1/s;-><init>(FF)V

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_11

    new-instance v3, Lf1/r;

    iget-wide v13, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->g:D

    iget-wide v7, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->a:D

    iget-wide v9, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->b:D

    iget-wide v5, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->c:D

    move-wide/from16 v19, v5

    iget-wide v4, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->d:D

    move-object v6, v1

    iget-wide v0, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->e:D

    move-wide/from16 v23, v0

    iget-wide v0, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->f:D

    move-object v12, v3

    move-wide v15, v7

    move-wide/from16 v17, v9

    move-wide/from16 v21, v4

    move-wide/from16 v25, v0

    invoke-direct/range {v12 .. v26}, Lf1/r;-><init>(DDDDDDD)V

    move-object/from16 v17, v3

    goto :goto_2

    :cond_11
    move-object v6, v1

    const/4 v0, 0x0

    move-object/from16 v17, v0

    :goto_2
    new-instance v0, Lf1/q;

    invoke-virtual {v6}, Landroid/graphics/ColorSpace;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Landroid/graphics/ColorSpace$Rgb;->getPrimaries()[F

    move-result-object v10

    invoke-virtual {v6}, Landroid/graphics/ColorSpace$Rgb;->getTransform()[F

    move-result-object v12

    new-instance v13, Le1/t;

    const/4 v2, 0x0

    move-object/from16 v1, p0

    invoke-direct {v13, v1, v2}, Le1/t;-><init>(Landroid/graphics/ColorSpace;I)V

    new-instance v14, Le1/t;

    const/4 v3, 0x1

    invoke-direct {v14, v1, v3}, Le1/t;-><init>(Landroid/graphics/ColorSpace;I)V

    invoke-virtual {v1, v2}, Landroid/graphics/ColorSpace;->getMinValue(I)F

    move-result v15

    invoke-virtual {v1, v2}, Landroid/graphics/ColorSpace;->getMaxValue(I)F

    move-result v16

    invoke-virtual {v6}, Landroid/graphics/ColorSpace;->getId()I

    move-result v18

    move-object v8, v0

    invoke-direct/range {v8 .. v18}, Lf1/q;-><init>(Ljava/lang/String;[FLf1/s;[FLf1/i;Lf1/i;FFLf1/r;I)V

    goto :goto_3

    :cond_12
    sget-object v0, Lf1/e;->c:Lf1/q;

    :goto_3
    return-object v0
.end method
