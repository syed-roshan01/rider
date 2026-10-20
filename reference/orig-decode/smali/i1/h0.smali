.class public abstract Li1/h0;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Le1/r;->h:I

    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/util/List;
    .locals 36

    move-object/from16 v0, p0

    if-nez v0, :cond_0

    sget-object v0, Lr8/r;->a:Lr8/r;

    goto/16 :goto_54

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/16 v2, 0x40

    new-array v2, v2, [F

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    const/16 v6, 0x20

    if-ge v5, v3, :cond_1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, v6}, Ld7/a;->o(II)I

    move-result v7

    if-gtz v7, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-le v3, v5, :cond_2

    add-int/lit8 v7, v3, -0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, v6}, Ld7/a;->o(II)I

    move-result v7

    if-gtz v7, :cond_2

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_2
    if-ge v5, v3, :cond_7a

    :goto_3
    add-int/lit8 v8, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    or-int/lit8 v9, v5, 0x20

    add-int/lit8 v10, v9, -0x61

    add-int/lit8 v11, v9, -0x7a

    mul-int/2addr v11, v10

    const/16 v10, 0x65

    if-gtz v11, :cond_3

    if-eq v9, v10, :cond_3

    goto :goto_4

    :cond_3
    if-lt v8, v3, :cond_79

    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_78

    or-int/lit8 v9, v5, 0x20

    const/16 v11, 0x7a

    if-eq v9, v11, :cond_3a

    const/4 v7, 0x0

    :goto_5
    if-ge v8, v3, :cond_4

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9, v6}, Ld7/a;->o(II)I

    move-result v9

    if-gtz v9, :cond_4

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_4
    const-wide v14, 0xffffffffL

    const/high16 v9, 0x7fc00000    # Float.NaN

    if-ne v8, v3, :cond_5

    move/from16 v17, v5

    int-to-long v4, v8

    shl-long/2addr v4, v6

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    :goto_6
    int-to-long v8, v8

    and-long/2addr v8, v14

    or-long/2addr v4, v8

    move-object/from16 v31, v1

    move-object/from16 v33, v2

    move v9, v3

    move-wide v1, v4

    move v3, v6

    move/from16 v30, v7

    move-wide v10, v14

    const/4 v5, 0x1

    goto/16 :goto_25

    :cond_5
    move/from16 v17, v5

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2d

    if-ne v4, v5, :cond_6

    const/16 v18, 0x1

    goto :goto_7

    :cond_6
    const/16 v18, 0x0

    :goto_7
    const/16 v13, 0xa

    const/16 v11, 0x2e

    if-eqz v18, :cond_9

    add-int/lit8 v4, v8, 0x1

    if-ne v4, v3, :cond_7

    int-to-long v4, v4

    shl-long/2addr v4, v6

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    goto :goto_6

    :cond_7
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v12

    add-int/lit8 v5, v12, -0x30

    int-to-char v5, v5

    if-ge v5, v13, :cond_8

    goto :goto_8

    :cond_8
    if-eq v12, v11, :cond_a

    int-to-long v4, v4

    shl-long/2addr v4, v6

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    goto :goto_6

    :cond_9
    move v12, v4

    move v4, v8

    :cond_a
    :goto_8
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v5

    const-wide/16 v20, 0x0

    move v10, v4

    move-wide/from16 v23, v20

    :goto_9
    const-wide/16 v25, 0xa

    if-eq v10, v3, :cond_c

    add-int/lit8 v14, v12, -0x30

    int-to-char v15, v14

    if-ge v15, v13, :cond_c

    mul-long v23, v23, v25

    int-to-long v14, v14

    add-long v23, v23, v14

    add-int/lit8 v10, v10, 0x1

    if-ge v10, v5, :cond_b

    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v12

    goto :goto_a

    :cond_b
    const/4 v12, 0x0

    :goto_a
    const-wide v14, 0xffffffffL

    goto :goto_9

    :cond_c
    sub-int v14, v10, v4

    const/16 v15, 0x30

    const/16 v27, 0x10

    if-eq v10, v3, :cond_12

    if-ne v12, v11, :cond_12

    add-int/lit8 v12, v10, 0x1

    move v11, v12

    :goto_b
    sub-int v9, v3, v11

    const/4 v13, 0x4

    if-lt v9, v13, :cond_e

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v9

    move/from16 v30, v7

    int-to-long v6, v9

    add-int/lit8 v9, v11, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    move/from16 v31, v14

    int-to-long v13, v9

    shl-long v13, v13, v27

    or-long/2addr v6, v13

    add-int/lit8 v9, v11, 0x2

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    int-to-long v13, v9

    const/16 v9, 0x20

    shl-long v32, v13, v9

    or-long v6, v6, v32

    add-int/lit8 v9, v11, 0x3

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    int-to-long v13, v9

    shl-long/2addr v13, v15

    or-long/2addr v6, v13

    const-wide v13, 0x30003000300030L

    sub-long v13, v6, v13

    const-wide v33, 0x46004600460046L    # 2.447700077935472E-307

    add-long v6, v6, v33

    or-long/2addr v6, v13

    const-wide v33, -0x7f007f007f0080L

    and-long v6, v6, v33

    cmp-long v6, v6, v20

    if-eqz v6, :cond_d

    const/4 v6, -0x1

    goto :goto_c

    :cond_d
    const-wide v6, 0x3e80064000a0001L

    mul-long/2addr v13, v6

    ushr-long v6, v13, v15

    long-to-int v6, v6

    :goto_c
    if-ltz v6, :cond_f

    const-wide/16 v13, 0x2710

    mul-long v23, v23, v13

    int-to-long v6, v6

    add-long v23, v23, v6

    add-int/lit8 v11, v11, 0x4

    move/from16 v7, v30

    move/from16 v14, v31

    const/16 v6, 0x20

    const/16 v13, 0xa

    goto :goto_b

    :cond_e
    move/from16 v30, v7

    move/from16 v31, v14

    :cond_f
    if-ge v11, v5, :cond_10

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v6

    goto :goto_d

    :cond_10
    const/4 v6, 0x0

    :goto_d
    if-eq v11, v3, :cond_11

    add-int/lit8 v7, v6, -0x30

    int-to-char v9, v7

    const/16 v13, 0xa

    if-ge v9, v13, :cond_11

    mul-long v23, v23, v25

    int-to-long v6, v7

    add-long v23, v23, v6

    add-int/lit8 v11, v11, 0x1

    if-ge v11, v5, :cond_10

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v6

    goto :goto_d

    :cond_11
    sub-int v7, v12, v11

    sub-int v14, v31, v7

    move/from16 v35, v12

    move v12, v6

    move/from16 v6, v35

    goto :goto_e

    :cond_12
    move/from16 v30, v7

    move/from16 v31, v14

    move v6, v10

    move v11, v6

    move/from16 v14, v31

    const/4 v7, 0x0

    :goto_e
    if-nez v14, :cond_13

    int-to-long v4, v11

    const/16 v9, 0x20

    shl-long/2addr v4, v9

    const/high16 v6, 0x7fc00000    # Float.NaN

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    const-wide v10, 0xffffffffL

    and-long/2addr v6, v10

    or-long/2addr v4, v6

    move-object/from16 v31, v1

    move-object/from16 v33, v2

    move-wide v1, v4

    const/4 v5, 0x1

    const-wide v10, 0xffffffffL

    move/from16 v35, v9

    move v9, v3

    move/from16 v3, v35

    goto/16 :goto_25

    :cond_13
    const/16 v9, 0x20

    or-int/2addr v12, v9

    const/16 v13, 0x65

    if-ne v12, v13, :cond_1d

    add-int/lit8 v12, v11, 0x1

    if-ge v12, v5, :cond_14

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v22

    move/from16 v13, v22

    const/16 v9, 0x2d

    goto :goto_f

    :cond_14
    const/16 v9, 0x2d

    const/4 v13, 0x0

    :goto_f
    if-ne v13, v9, :cond_15

    const/4 v9, 0x1

    goto :goto_10

    :cond_15
    const/4 v9, 0x0

    :goto_10
    if-nez v9, :cond_16

    const/16 v15, 0x2b

    if-ne v13, v15, :cond_17

    :cond_16
    add-int/lit8 v12, v11, 0x2

    :cond_17
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/4 v15, 0x0

    :goto_11
    if-eq v12, v3, :cond_1a

    const/16 v29, 0x30

    add-int/lit8 v13, v13, -0x30

    move-object/from16 v31, v1

    int-to-char v1, v13

    move-object/from16 v33, v2

    const/16 v2, 0xa

    if-ge v1, v2, :cond_1b

    const/16 v1, 0x400

    if-ge v15, v1, :cond_18

    mul-int/lit8 v15, v15, 0xa

    add-int/2addr v15, v13

    :cond_18
    add-int/lit8 v12, v12, 0x1

    if-ge v12, v5, :cond_19

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move v13, v1

    goto :goto_12

    :cond_19
    const/4 v13, 0x0

    :goto_12
    move-object/from16 v1, v31

    move-object/from16 v2, v33

    goto :goto_11

    :cond_1a
    move-object/from16 v31, v1

    move-object/from16 v33, v2

    :cond_1b
    if-eqz v9, :cond_1c

    neg-int v15, v15

    :cond_1c
    add-int/2addr v7, v15

    goto :goto_13

    :cond_1d
    move-object/from16 v31, v1

    move-object/from16 v33, v2

    move v12, v11

    const/4 v15, 0x0

    :goto_13
    const/16 v1, 0x13

    if-le v14, v1, :cond_28

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move v9, v4

    :goto_14
    if-eq v12, v3, :cond_22

    const/16 v13, 0x30

    const/16 v1, 0x2e

    if-eq v2, v13, :cond_1f

    if-ne v2, v1, :cond_1e

    goto :goto_15

    :cond_1e
    const/16 v1, 0x13

    goto :goto_17

    :cond_1f
    :goto_15
    if-ne v2, v13, :cond_20

    add-int/lit8 v14, v14, -0x1

    :cond_20
    const/4 v2, 0x1

    add-int/2addr v9, v2

    if-ge v9, v5, :cond_21

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v2

    goto :goto_16

    :cond_21
    const/4 v2, 0x0

    :goto_16
    const/16 v1, 0x13

    goto :goto_14

    :cond_22
    :goto_17
    if-le v14, v1, :cond_28

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move v9, v3

    move-wide/from16 v13, v20

    :goto_18
    const-wide v2, 0xde0b6b3a7640000L

    if-eq v4, v10, :cond_24

    invoke-static {v13, v14, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v7

    if-gez v7, :cond_24

    mul-long v13, v13, v25

    const/16 v2, 0x30

    sub-int/2addr v1, v2

    int-to-long v1, v1

    add-long/2addr v13, v1

    add-int/lit8 v4, v4, 0x1

    if-ge v4, v5, :cond_23

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    goto :goto_18

    :cond_23
    const/4 v1, 0x0

    goto :goto_18

    :cond_24
    invoke-static {v13, v14, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v1

    if-ltz v1, :cond_25

    sub-int/2addr v10, v4

    add-int v7, v10, v15

    :goto_19
    const/4 v1, 0x1

    goto :goto_1c

    :cond_25
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move v4, v6

    :goto_1a
    if-eq v4, v11, :cond_27

    invoke-static {v13, v14, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v7

    if-gez v7, :cond_27

    mul-long v13, v13, v25

    const/16 v7, 0x30

    sub-int/2addr v1, v7

    int-to-long v2, v1

    add-long/2addr v13, v2

    add-int/lit8 v4, v4, 0x1

    if-ge v4, v5, :cond_26

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    goto :goto_1b

    :cond_26
    const/4 v1, 0x0

    :goto_1b
    const-wide v2, 0xde0b6b3a7640000L

    goto :goto_1a

    :cond_27
    sub-int/2addr v6, v4

    add-int v7, v6, v15

    goto :goto_19

    :cond_28
    move v9, v3

    move-wide/from16 v13, v23

    const/4 v1, 0x0

    :goto_1c
    const/16 v2, -0xa

    if-gt v2, v7, :cond_2b

    const/16 v2, 0xb

    if-ge v7, v2, :cond_2b

    if-nez v1, :cond_2b

    const-wide/32 v1, 0x1000000

    invoke-static {v13, v14, v1, v2}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v1

    if-gtz v1, :cond_2b

    long-to-float v1, v13

    sget-object v2, Li1/b;->a:[F

    if-gez v7, :cond_29

    neg-int v3, v7

    aget v2, v2, v3

    div-float/2addr v1, v2

    goto :goto_1d

    :cond_29
    aget v2, v2, v7

    mul-float/2addr v1, v2

    :goto_1d
    if-eqz v18, :cond_2a

    neg-float v1, v1

    :cond_2a
    int-to-long v2, v12

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    :goto_1e
    int-to-long v5, v1

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long v1, v2, v5

    const/16 v3, 0x20

    const/4 v5, 0x1

    :goto_1f
    const-wide v10, 0xffffffffL

    goto/16 :goto_25

    :cond_2b
    cmp-long v1, v13, v20

    if-nez v1, :cond_2d

    if-eqz v18, :cond_2c

    const/high16 v1, -0x80000000

    goto :goto_20

    :cond_2c
    const/4 v1, 0x0

    :goto_20
    int-to-long v2, v12

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    goto :goto_1e

    :cond_2d
    const/16 v1, -0x7e

    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    if-gt v1, v7, :cond_34

    const/16 v1, 0x80

    if-ge v7, v1, :cond_34

    sget-object v1, Li1/b;->b:[J

    add-int/lit16 v3, v7, 0x145

    aget-wide v5, v1, v3

    invoke-static {v13, v14}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v1

    shl-long v10, v13, v1

    const-wide v13, 0xffffffffL

    and-long v23, v10, v13

    const/16 v3, 0x20

    ushr-long/2addr v10, v3

    and-long v25, v5, v13

    ushr-long v4, v5, v3

    mul-long v28, v10, v4

    mul-long v4, v4, v23

    mul-long v10, v10, v25

    mul-long v23, v23, v25

    ushr-long v23, v23, v3

    add-long v10, v10, v23

    and-long v23, v4, v13

    add-long v10, v10, v23

    ushr-long/2addr v10, v3

    add-long v28, v28, v10

    ushr-long/2addr v4, v3

    add-long v28, v28, v4

    const/16 v4, 0x3f

    ushr-long v5, v28, v4

    long-to-int v5, v5

    add-int/lit8 v6, v5, 0x9

    ushr-long v10, v28, v6

    const/4 v6, 0x1

    xor-int/2addr v5, v6

    add-int/2addr v1, v5

    const-wide/16 v5, 0x1ff

    and-long v13, v28, v5

    cmp-long v5, v13, v5

    if-eqz v5, :cond_2e

    cmp-long v5, v13, v20

    const-wide/16 v13, 0x1

    if-nez v5, :cond_2f

    const-wide/16 v5, 0x3

    and-long/2addr v5, v10

    cmp-long v5, v5, v13

    if-nez v5, :cond_2f

    :cond_2e
    const/16 v3, 0x20

    const/4 v5, 0x1

    const-wide v10, 0xffffffffL

    goto :goto_24

    :cond_2f
    add-long/2addr v10, v13

    const/4 v5, 0x1

    ushr-long/2addr v10, v5

    const-wide/high16 v23, 0x20000000000000L

    cmp-long v6, v10, v23

    if-ltz v6, :cond_30

    add-int/lit8 v1, v1, -0x1

    const-wide/high16 v10, 0x10000000000000L

    :cond_30
    const-wide v23, -0x10000000000001L

    and-long v10, v10, v23

    const-wide/32 v23, 0x3526a

    int-to-long v6, v7

    mul-long v6, v6, v23

    shr-long v6, v6, v27

    const/16 v15, 0x400

    int-to-long v13, v15

    add-long/2addr v6, v13

    int-to-long v13, v4

    add-long/2addr v6, v13

    int-to-long v13, v1

    sub-long/2addr v6, v13

    const-wide/16 v13, 0x1

    cmp-long v1, v6, v13

    if-ltz v1, :cond_31

    const-wide/16 v13, 0x7fe

    cmp-long v1, v6, v13

    if-lez v1, :cond_32

    :cond_31
    const/16 v3, 0x20

    const-wide v10, 0xffffffffL

    goto :goto_23

    :cond_32
    const/16 v1, 0x34

    shl-long v1, v6, v1

    or-long/2addr v1, v10

    if-eqz v18, :cond_33

    const-wide/high16 v20, -0x8000000000000000L

    :cond_33
    or-long v1, v1, v20

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v1

    double-to-float v1, v1

    int-to-long v6, v12

    const/16 v3, 0x20

    shl-long/2addr v6, v3

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    :goto_21
    int-to-long v1, v1

    const-wide v10, 0xffffffffL

    :goto_22
    and-long/2addr v1, v10

    or-long/2addr v1, v6

    goto :goto_25

    :goto_23
    invoke-virtual {v0, v8, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    int-to-long v6, v12

    shl-long/2addr v6, v3

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    goto :goto_22

    :goto_24
    invoke-virtual {v0, v8, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    int-to-long v6, v12

    shl-long/2addr v6, v3

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    and-long/2addr v1, v10

    or-long/2addr v1, v6

    const/16 v3, 0x20

    goto/16 :goto_1f

    :cond_34
    const/4 v5, 0x1

    invoke-virtual {v0, v8, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    int-to-long v6, v12

    const/16 v3, 0x20

    shl-long/2addr v6, v3

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    goto :goto_21

    :goto_25
    ushr-long v6, v1, v3

    long-to-int v4, v6

    and-long/2addr v1, v10

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_36

    add-int/lit8 v7, v30, 0x1

    aput v1, v33, v30

    move-object/from16 v2, v33

    array-length v6, v2

    if-lt v7, v6, :cond_35

    mul-int/lit8 v6, v7, 0x2

    new-array v6, v6, [F

    array-length v8, v2

    const/4 v10, 0x0

    invoke-static {v2, v10, v6, v10, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v2, v6

    goto :goto_26

    :cond_35
    const/4 v10, 0x0

    :goto_26
    move v8, v4

    goto :goto_27

    :cond_36
    move-object/from16 v2, v33

    const/4 v10, 0x0

    move v8, v4

    move/from16 v7, v30

    :goto_27
    if-ge v8, v9, :cond_37

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v6, 0x2c

    if-ne v4, v6, :cond_37

    add-int/lit8 v8, v8, 0x1

    goto :goto_27

    :cond_37
    if-ge v8, v9, :cond_39

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_38

    goto :goto_28

    :cond_38
    move v6, v3

    move v3, v9

    move/from16 v5, v17

    move-object/from16 v1, v31

    const/16 v10, 0x65

    const/16 v11, 0x7a

    goto/16 :goto_5

    :cond_39
    :goto_28
    move/from16 v4, v17

    const/16 v1, 0x7a

    goto :goto_29

    :cond_3a
    move-object/from16 v31, v1

    move v9, v3

    move/from16 v17, v5

    move v3, v6

    const/4 v5, 0x1

    const/4 v10, 0x0

    move v1, v11

    move/from16 v4, v17

    :goto_29
    if-ne v4, v1, :cond_3b

    goto :goto_2a

    :cond_3b
    const/16 v1, 0x5a

    if-ne v4, v1, :cond_3c

    :goto_2a
    sget-object v1, Li1/j;->c:Li1/j;

    move-object/from16 v6, v31

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_53

    :cond_3c
    move-object/from16 v6, v31

    const/16 v1, 0x6d

    if-ne v4, v1, :cond_3f

    add-int/lit8 v1, v7, -0x2

    move v4, v10

    :goto_2b
    if-gt v4, v1, :cond_76

    new-instance v5, Li1/v;

    aget v11, v2, v4

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/v;-><init>(FF)V

    instance-of v13, v5, Li1/n;

    if-eqz v13, :cond_3d

    if-lez v4, :cond_3d

    new-instance v5, Li1/m;

    invoke-direct {v5, v11, v12}, Li1/m;-><init>(FF)V

    goto :goto_2c

    :cond_3d
    if-lez v4, :cond_3e

    new-instance v5, Li1/u;

    invoke-direct {v5, v11, v12}, Li1/u;-><init>(FF)V

    :cond_3e
    :goto_2c
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x2

    goto :goto_2b

    :cond_3f
    const/16 v1, 0x4d

    if-ne v4, v1, :cond_42

    add-int/lit8 v1, v7, -0x2

    move v4, v10

    :goto_2d
    if-gt v4, v1, :cond_76

    new-instance v5, Li1/n;

    aget v11, v2, v4

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/n;-><init>(FF)V

    if-lez v4, :cond_40

    new-instance v5, Li1/m;

    invoke-direct {v5, v11, v12}, Li1/m;-><init>(FF)V

    goto :goto_2e

    :cond_40
    instance-of v13, v5, Li1/v;

    if-eqz v13, :cond_41

    if-lez v4, :cond_41

    new-instance v5, Li1/u;

    invoke-direct {v5, v11, v12}, Li1/u;-><init>(FF)V

    :cond_41
    :goto_2e
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x2

    goto :goto_2d

    :cond_42
    const/16 v1, 0x6c

    if-ne v4, v1, :cond_45

    add-int/lit8 v1, v7, -0x2

    move v4, v10

    :goto_2f
    if-gt v4, v1, :cond_76

    new-instance v5, Li1/u;

    aget v11, v2, v4

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/u;-><init>(FF)V

    instance-of v13, v5, Li1/n;

    if-eqz v13, :cond_43

    if-lez v4, :cond_43

    new-instance v5, Li1/m;

    invoke-direct {v5, v11, v12}, Li1/m;-><init>(FF)V

    goto :goto_30

    :cond_43
    instance-of v13, v5, Li1/v;

    if-eqz v13, :cond_44

    if-lez v4, :cond_44

    new-instance v5, Li1/u;

    invoke-direct {v5, v11, v12}, Li1/u;-><init>(FF)V

    :cond_44
    :goto_30
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x2

    goto :goto_2f

    :cond_45
    const/16 v1, 0x4c

    if-ne v4, v1, :cond_48

    add-int/lit8 v1, v7, -0x2

    move v4, v10

    :goto_31
    if-gt v4, v1, :cond_76

    new-instance v5, Li1/m;

    aget v11, v2, v4

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/m;-><init>(FF)V

    instance-of v13, v5, Li1/n;

    if-eqz v13, :cond_46

    if-lez v4, :cond_46

    new-instance v5, Li1/m;

    invoke-direct {v5, v11, v12}, Li1/m;-><init>(FF)V

    goto :goto_32

    :cond_46
    instance-of v13, v5, Li1/v;

    if-eqz v13, :cond_47

    if-lez v4, :cond_47

    new-instance v5, Li1/u;

    invoke-direct {v5, v11, v12}, Li1/u;-><init>(FF)V

    :cond_47
    :goto_32
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x2

    goto :goto_31

    :cond_48
    const/16 v1, 0x68

    if-ne v4, v1, :cond_4b

    add-int/lit8 v1, v7, -0x1

    move v4, v10

    :goto_33
    if-gt v4, v1, :cond_76

    new-instance v5, Li1/t;

    aget v11, v2, v4

    invoke-direct {v5, v11}, Li1/t;-><init>(F)V

    instance-of v12, v5, Li1/n;

    if-eqz v12, :cond_49

    if-lez v4, :cond_49

    new-instance v5, Li1/m;

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/m;-><init>(FF)V

    goto :goto_34

    :cond_49
    instance-of v12, v5, Li1/v;

    if-eqz v12, :cond_4a

    if-lez v4, :cond_4a

    new-instance v5, Li1/u;

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/u;-><init>(FF)V

    :cond_4a
    :goto_34
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_33

    :cond_4b
    const/16 v1, 0x48

    if-ne v4, v1, :cond_4e

    add-int/lit8 v1, v7, -0x1

    move v4, v10

    :goto_35
    if-gt v4, v1, :cond_76

    new-instance v5, Li1/l;

    aget v11, v2, v4

    invoke-direct {v5, v11}, Li1/l;-><init>(F)V

    instance-of v12, v5, Li1/n;

    if-eqz v12, :cond_4c

    if-lez v4, :cond_4c

    new-instance v5, Li1/m;

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/m;-><init>(FF)V

    goto :goto_36

    :cond_4c
    instance-of v12, v5, Li1/v;

    if-eqz v12, :cond_4d

    if-lez v4, :cond_4d

    new-instance v5, Li1/u;

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/u;-><init>(FF)V

    :cond_4d
    :goto_36
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_35

    :cond_4e
    const/16 v1, 0x76

    if-ne v4, v1, :cond_51

    add-int/lit8 v1, v7, -0x1

    move v4, v10

    :goto_37
    if-gt v4, v1, :cond_76

    new-instance v5, Li1/z;

    aget v11, v2, v4

    invoke-direct {v5, v11}, Li1/z;-><init>(F)V

    instance-of v12, v5, Li1/n;

    if-eqz v12, :cond_4f

    if-lez v4, :cond_4f

    new-instance v5, Li1/m;

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/m;-><init>(FF)V

    goto :goto_38

    :cond_4f
    instance-of v12, v5, Li1/v;

    if-eqz v12, :cond_50

    if-lez v4, :cond_50

    new-instance v5, Li1/u;

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/u;-><init>(FF)V

    :cond_50
    :goto_38
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_37

    :cond_51
    const/16 v1, 0x56

    if-ne v4, v1, :cond_54

    add-int/lit8 v1, v7, -0x1

    move v4, v10

    :goto_39
    if-gt v4, v1, :cond_76

    new-instance v5, Li1/a0;

    aget v11, v2, v4

    invoke-direct {v5, v11}, Li1/a0;-><init>(F)V

    instance-of v12, v5, Li1/n;

    if-eqz v12, :cond_52

    if-lez v4, :cond_52

    new-instance v5, Li1/m;

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/m;-><init>(FF)V

    goto :goto_3a

    :cond_52
    instance-of v12, v5, Li1/v;

    if-eqz v12, :cond_53

    if-lez v4, :cond_53

    new-instance v5, Li1/u;

    add-int/lit8 v12, v4, 0x1

    aget v12, v2, v12

    invoke-direct {v5, v11, v12}, Li1/u;-><init>(FF)V

    :cond_53
    :goto_3a
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_39

    :cond_54
    const/16 v1, 0x63

    if-ne v4, v1, :cond_57

    add-int/lit8 v1, v7, -0x6

    move v4, v10

    :goto_3b
    if-gt v4, v1, :cond_76

    new-instance v5, Li1/s;

    aget v15, v2, v4

    add-int/lit8 v11, v4, 0x1

    aget v14, v2, v11

    add-int/lit8 v11, v4, 0x2

    aget v16, v2, v11

    add-int/lit8 v11, v4, 0x3

    aget v17, v2, v11

    add-int/lit8 v11, v4, 0x4

    aget v18, v2, v11

    add-int/lit8 v11, v4, 0x5

    aget v19, v2, v11

    move-object v11, v5

    move v12, v15

    move v13, v14

    move v3, v14

    move/from16 v14, v16

    move v10, v15

    move/from16 v15, v17

    move/from16 v16, v18

    move/from16 v17, v19

    invoke-direct/range {v11 .. v17}, Li1/s;-><init>(FFFFFF)V

    instance-of v11, v5, Li1/n;

    if-eqz v11, :cond_55

    if-lez v4, :cond_55

    new-instance v5, Li1/m;

    invoke-direct {v5, v10, v3}, Li1/m;-><init>(FF)V

    goto :goto_3c

    :cond_55
    instance-of v11, v5, Li1/v;

    if-eqz v11, :cond_56

    if-lez v4, :cond_56

    new-instance v5, Li1/u;

    invoke-direct {v5, v10, v3}, Li1/u;-><init>(FF)V

    :cond_56
    :goto_3c
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x6

    const/16 v3, 0x20

    const/4 v10, 0x0

    goto :goto_3b

    :cond_57
    const/16 v1, 0x43

    if-ne v4, v1, :cond_5a

    add-int/lit8 v1, v7, -0x6

    const/4 v3, 0x0

    :goto_3d
    if-gt v3, v1, :cond_76

    new-instance v4, Li1/k;

    aget v5, v2, v3

    add-int/lit8 v10, v3, 0x1

    aget v15, v2, v10

    add-int/lit8 v10, v3, 0x2

    aget v13, v2, v10

    add-int/lit8 v10, v3, 0x3

    aget v14, v2, v10

    add-int/lit8 v10, v3, 0x4

    aget v16, v2, v10

    add-int/lit8 v10, v3, 0x5

    aget v17, v2, v10

    move-object v10, v4

    move v11, v5

    move v12, v15

    move v0, v15

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-direct/range {v10 .. v16}, Li1/k;-><init>(FFFFFF)V

    instance-of v10, v4, Li1/n;

    if-eqz v10, :cond_58

    if-lez v3, :cond_58

    new-instance v4, Li1/m;

    invoke-direct {v4, v5, v0}, Li1/m;-><init>(FF)V

    goto :goto_3e

    :cond_58
    instance-of v10, v4, Li1/v;

    if-eqz v10, :cond_59

    if-lez v3, :cond_59

    new-instance v4, Li1/u;

    invoke-direct {v4, v5, v0}, Li1/u;-><init>(FF)V

    :cond_59
    :goto_3e
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x6

    move-object/from16 v0, p0

    goto :goto_3d

    :cond_5a
    const/16 v0, 0x73

    if-ne v4, v0, :cond_5d

    add-int/lit8 v0, v7, -0x4

    const/4 v1, 0x0

    :goto_3f
    if-gt v1, v0, :cond_76

    new-instance v3, Li1/x;

    aget v4, v2, v1

    add-int/lit8 v5, v1, 0x1

    aget v5, v2, v5

    add-int/lit8 v10, v1, 0x2

    aget v10, v2, v10

    add-int/lit8 v11, v1, 0x3

    aget v11, v2, v11

    invoke-direct {v3, v4, v5, v10, v11}, Li1/x;-><init>(FFFF)V

    instance-of v10, v3, Li1/n;

    if-eqz v10, :cond_5b

    if-lez v1, :cond_5b

    new-instance v3, Li1/m;

    invoke-direct {v3, v4, v5}, Li1/m;-><init>(FF)V

    goto :goto_40

    :cond_5b
    instance-of v10, v3, Li1/v;

    if-eqz v10, :cond_5c

    if-lez v1, :cond_5c

    new-instance v3, Li1/u;

    invoke-direct {v3, v4, v5}, Li1/u;-><init>(FF)V

    :cond_5c
    :goto_40
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x4

    goto :goto_3f

    :cond_5d
    const/16 v0, 0x53

    if-ne v4, v0, :cond_60

    add-int/lit8 v0, v7, -0x4

    const/4 v1, 0x0

    :goto_41
    if-gt v1, v0, :cond_76

    new-instance v3, Li1/p;

    aget v4, v2, v1

    add-int/lit8 v5, v1, 0x1

    aget v5, v2, v5

    add-int/lit8 v10, v1, 0x2

    aget v10, v2, v10

    add-int/lit8 v11, v1, 0x3

    aget v11, v2, v11

    invoke-direct {v3, v4, v5, v10, v11}, Li1/p;-><init>(FFFF)V

    instance-of v10, v3, Li1/n;

    if-eqz v10, :cond_5e

    if-lez v1, :cond_5e

    new-instance v3, Li1/m;

    invoke-direct {v3, v4, v5}, Li1/m;-><init>(FF)V

    goto :goto_42

    :cond_5e
    instance-of v10, v3, Li1/v;

    if-eqz v10, :cond_5f

    if-lez v1, :cond_5f

    new-instance v3, Li1/u;

    invoke-direct {v3, v4, v5}, Li1/u;-><init>(FF)V

    :cond_5f
    :goto_42
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x4

    goto :goto_41

    :cond_60
    const/16 v0, 0x71

    if-ne v4, v0, :cond_63

    add-int/lit8 v0, v7, -0x4

    const/4 v1, 0x0

    :goto_43
    if-gt v1, v0, :cond_76

    new-instance v3, Li1/w;

    aget v4, v2, v1

    add-int/lit8 v5, v1, 0x1

    aget v5, v2, v5

    add-int/lit8 v10, v1, 0x2

    aget v10, v2, v10

    add-int/lit8 v11, v1, 0x3

    aget v11, v2, v11

    invoke-direct {v3, v4, v5, v10, v11}, Li1/w;-><init>(FFFF)V

    instance-of v10, v3, Li1/n;

    if-eqz v10, :cond_61

    if-lez v1, :cond_61

    new-instance v3, Li1/m;

    invoke-direct {v3, v4, v5}, Li1/m;-><init>(FF)V

    goto :goto_44

    :cond_61
    instance-of v10, v3, Li1/v;

    if-eqz v10, :cond_62

    if-lez v1, :cond_62

    new-instance v3, Li1/u;

    invoke-direct {v3, v4, v5}, Li1/u;-><init>(FF)V

    :cond_62
    :goto_44
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x4

    goto :goto_43

    :cond_63
    const/16 v0, 0x51

    if-ne v4, v0, :cond_66

    add-int/lit8 v0, v7, -0x4

    const/4 v1, 0x0

    :goto_45
    if-gt v1, v0, :cond_76

    new-instance v3, Li1/o;

    aget v4, v2, v1

    add-int/lit8 v5, v1, 0x1

    aget v5, v2, v5

    add-int/lit8 v10, v1, 0x2

    aget v10, v2, v10

    add-int/lit8 v11, v1, 0x3

    aget v11, v2, v11

    invoke-direct {v3, v4, v5, v10, v11}, Li1/o;-><init>(FFFF)V

    instance-of v10, v3, Li1/n;

    if-eqz v10, :cond_64

    if-lez v1, :cond_64

    new-instance v3, Li1/m;

    invoke-direct {v3, v4, v5}, Li1/m;-><init>(FF)V

    goto :goto_46

    :cond_64
    instance-of v10, v3, Li1/v;

    if-eqz v10, :cond_65

    if-lez v1, :cond_65

    new-instance v3, Li1/u;

    invoke-direct {v3, v4, v5}, Li1/u;-><init>(FF)V

    :cond_65
    :goto_46
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x4

    goto :goto_45

    :cond_66
    const/16 v0, 0x74

    if-ne v4, v0, :cond_69

    add-int/lit8 v0, v7, -0x2

    const/4 v1, 0x0

    :goto_47
    if-gt v1, v0, :cond_76

    new-instance v3, Li1/y;

    aget v4, v2, v1

    add-int/lit8 v5, v1, 0x1

    aget v5, v2, v5

    invoke-direct {v3, v4, v5}, Li1/y;-><init>(FF)V

    instance-of v10, v3, Li1/n;

    if-eqz v10, :cond_67

    if-lez v1, :cond_67

    new-instance v3, Li1/m;

    invoke-direct {v3, v4, v5}, Li1/m;-><init>(FF)V

    goto :goto_48

    :cond_67
    instance-of v10, v3, Li1/v;

    if-eqz v10, :cond_68

    if-lez v1, :cond_68

    new-instance v3, Li1/u;

    invoke-direct {v3, v4, v5}, Li1/u;-><init>(FF)V

    :cond_68
    :goto_48
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x2

    goto :goto_47

    :cond_69
    const/16 v0, 0x54

    if-ne v4, v0, :cond_6c

    add-int/lit8 v0, v7, -0x2

    const/4 v1, 0x0

    :goto_49
    if-gt v1, v0, :cond_76

    new-instance v3, Li1/q;

    aget v4, v2, v1

    add-int/lit8 v5, v1, 0x1

    aget v5, v2, v5

    invoke-direct {v3, v4, v5}, Li1/q;-><init>(FF)V

    instance-of v10, v3, Li1/n;

    if-eqz v10, :cond_6a

    if-lez v1, :cond_6a

    new-instance v3, Li1/m;

    invoke-direct {v3, v4, v5}, Li1/m;-><init>(FF)V

    goto :goto_4a

    :cond_6a
    instance-of v10, v3, Li1/v;

    if-eqz v10, :cond_6b

    if-lez v1, :cond_6b

    new-instance v3, Li1/u;

    invoke-direct {v3, v4, v5}, Li1/u;-><init>(FF)V

    :cond_6b
    :goto_4a
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x2

    goto :goto_49

    :cond_6c
    const/16 v0, 0x61

    if-ne v4, v0, :cond_71

    add-int/lit8 v0, v7, -0x7

    const/4 v1, 0x0

    :goto_4b
    if-gt v1, v0, :cond_76

    new-instance v3, Li1/r;

    aget v11, v2, v1

    add-int/lit8 v4, v1, 0x1

    aget v12, v2, v4

    add-int/lit8 v10, v1, 0x2

    aget v13, v2, v10

    add-int/lit8 v10, v1, 0x3

    aget v10, v2, v10

    const/4 v14, 0x0

    invoke-static {v10, v14}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-eqz v10, :cond_6d

    move v15, v5

    goto :goto_4c

    :cond_6d
    const/4 v15, 0x0

    :goto_4c
    add-int/lit8 v10, v1, 0x4

    aget v10, v2, v10

    invoke-static {v10, v14}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-eqz v10, :cond_6e

    move/from16 v16, v5

    goto :goto_4d

    :cond_6e
    const/16 v16, 0x0

    :goto_4d
    add-int/lit8 v10, v1, 0x5

    aget v17, v2, v10

    add-int/lit8 v10, v1, 0x6

    aget v18, v2, v10

    move-object v10, v3

    move v14, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v18

    invoke-direct/range {v10 .. v17}, Li1/r;-><init>(FFFZZFF)V

    instance-of v10, v3, Li1/n;

    if-eqz v10, :cond_6f

    if-lez v1, :cond_6f

    new-instance v3, Li1/m;

    aget v10, v2, v1

    aget v4, v2, v4

    invoke-direct {v3, v10, v4}, Li1/m;-><init>(FF)V

    goto :goto_4e

    :cond_6f
    instance-of v10, v3, Li1/v;

    if-eqz v10, :cond_70

    if-lez v1, :cond_70

    new-instance v3, Li1/u;

    aget v10, v2, v1

    aget v4, v2, v4

    invoke-direct {v3, v10, v4}, Li1/u;-><init>(FF)V

    :cond_70
    :goto_4e
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x7

    goto :goto_4b

    :cond_71
    const/16 v0, 0x41

    if-ne v4, v0, :cond_77

    add-int/lit8 v0, v7, -0x7

    const/4 v1, 0x0

    :goto_4f
    if-gt v1, v0, :cond_76

    new-instance v3, Li1/i;

    aget v11, v2, v1

    add-int/lit8 v4, v1, 0x1

    aget v12, v2, v4

    add-int/lit8 v10, v1, 0x2

    aget v13, v2, v10

    add-int/lit8 v10, v1, 0x3

    aget v10, v2, v10

    const/4 v15, 0x0

    invoke-static {v10, v15}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-eqz v10, :cond_72

    move v14, v5

    goto :goto_50

    :cond_72
    const/4 v14, 0x0

    :goto_50
    add-int/lit8 v10, v1, 0x4

    aget v10, v2, v10

    invoke-static {v10, v15}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-eqz v10, :cond_73

    move/from16 v16, v5

    goto :goto_51

    :cond_73
    const/16 v16, 0x0

    :goto_51
    add-int/lit8 v10, v1, 0x5

    aget v17, v2, v10

    add-int/lit8 v10, v1, 0x6

    aget v18, v2, v10

    move-object v10, v3

    move/from16 v19, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v18

    invoke-direct/range {v10 .. v17}, Li1/i;-><init>(FFFZZFF)V

    instance-of v10, v3, Li1/n;

    if-eqz v10, :cond_74

    if-lez v1, :cond_74

    new-instance v3, Li1/m;

    aget v10, v2, v1

    aget v4, v2, v4

    invoke-direct {v3, v10, v4}, Li1/m;-><init>(FF)V

    goto :goto_52

    :cond_74
    instance-of v10, v3, Li1/v;

    if-eqz v10, :cond_75

    if-lez v1, :cond_75

    new-instance v3, Li1/u;

    aget v10, v2, v1

    aget v4, v2, v4

    invoke-direct {v3, v10, v4}, Li1/u;-><init>(FF)V

    :cond_75
    :goto_52
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x7

    goto :goto_4f

    :cond_76
    :goto_53
    move-object/from16 v0, p0

    move-object v1, v6

    move v5, v8

    move v3, v9

    const/16 v6, 0x20

    goto/16 :goto_2

    :cond_77
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown command for: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_78
    move-object/from16 v0, p0

    move v5, v8

    goto/16 :goto_2

    :cond_79
    move-object/from16 v0, p0

    move v5, v8

    goto/16 :goto_3

    :cond_7a
    move-object v6, v1

    move-object v0, v6

    :goto_54
    return-object v0
.end method

.method public static final b(Le1/l;)Z
    .locals 4

    instance-of v0, p0, Le1/l;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget v0, p0, Le1/l;->c:I

    const/4 v3, 0x5

    invoke-static {v0, v3}, Le1/g0;->b(II)Z

    move-result v0

    if-nez v0, :cond_2

    iget p0, p0, Le1/l;->c:I

    const/4 v0, 0x3

    invoke-static {p0, v0}, Le1/g0;->b(II)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    if-nez p0, :cond_0

    :cond_2
    :goto_0
    return v1
.end method
