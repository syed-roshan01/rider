.class public final Li2/d;
.super Ljava/lang/Object;

# interfaces
.implements La2/o;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La2/c0;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lf2/d;

.field public final f:Lm2/b;

.field public final g:Li2/e;

.field public final h:Ljava/lang/CharSequence;

.field public final i:Lb2/h;

.field public j:Ll/z2;

.field public final k:Z

.field public final l:I


# direct methods
.method public constructor <init>(La2/c0;Lf2/d;Lm2/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 45

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p4

    iput-object v4, v0, Li2/d;->a:Ljava/lang/String;

    iput-object v1, v0, Li2/d;->b:La2/c0;

    iput-object v3, v0, Li2/d;->c:Ljava/util/List;

    move-object/from16 v4, p6

    iput-object v4, v0, Li2/d;->d:Ljava/util/List;

    move-object/from16 v4, p2

    iput-object v4, v0, Li2/d;->e:Lf2/d;

    iput-object v2, v0, Li2/d;->f:Lm2/b;

    new-instance v4, Li2/e;

    invoke-interface/range {p3 .. p3}, Lm2/b;->c()F

    move-result v5

    invoke-direct {v4, v5}, Li2/e;-><init>(F)V

    iput-object v4, v0, Li2/d;->g:Li2/e;

    invoke-static/range {p1 .. p1}, Lo1/s;->i(La2/c0;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    move v5, v6

    goto :goto_1

    :cond_0
    sget-object v5, Li2/i;->a:Li2/g;

    sget-object v5, Li2/i;->a:Li2/g;

    iget-object v7, v5, Li2/g;->a:Lm0/l3;

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Li3/l;->c()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v5}, Li2/g;->a()Lm0/l3;

    move-result-object v7

    iput-object v7, v5, Li2/g;->a:Lm0/l3;

    goto :goto_0

    :cond_2
    sget-object v7, Li2/j;->a:Li2/k;

    :goto_0
    invoke-interface {v7}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    :goto_1
    iput-boolean v5, v0, Li2/d;->k:Z

    iget-object v5, v1, La2/c0;->b:La2/p;

    iget v7, v5, La2/p;->b:I

    iget-object v1, v1, La2/c0;->a:La2/x;

    iget-object v8, v1, La2/x;->k:Lh2/d;

    const/4 v9, 0x4

    invoke-static {v7, v9}, Ll2/k;->a(II)Z

    move-result v10

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x3

    if-eqz v10, :cond_4

    :cond_3
    :goto_2
    move v7, v11

    goto :goto_4

    :cond_4
    const/4 v10, 0x5

    invoke-static {v7, v10}, Ll2/k;->a(II)Z

    move-result v10

    if-eqz v10, :cond_6

    :cond_5
    move v7, v13

    goto :goto_4

    :cond_6
    invoke-static {v7, v12}, Ll2/k;->a(II)Z

    move-result v10

    if-eqz v10, :cond_7

    move v7, v6

    goto :goto_4

    :cond_7
    invoke-static {v7, v11}, Ll2/k;->a(II)Z

    move-result v10

    if-eqz v10, :cond_8

    move v7, v12

    goto :goto_4

    :cond_8
    invoke-static {v7, v13}, Ll2/k;->a(II)Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_3

    :cond_9
    const/high16 v10, -0x80000000

    invoke-static {v7, v10}, Ll2/k;->a(II)Z

    move-result v7

    if-eqz v7, :cond_6f

    :goto_3
    if-eqz v8, :cond_a

    iget-object v7, v8, Lh2/d;->a:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh2/c;

    iget-object v7, v7, Lh2/c;->a:Lh2/e;

    const-string v8, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"

    invoke-static {v7, v8}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lh2/a;

    iget-object v7, v7, Lh2/a;->a:Ljava/util/Locale;

    if-nez v7, :cond_b

    :cond_a
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    :cond_b
    sget v8, Lz2/e;->a:I

    invoke-static {v7}, Lz2/d;->a(Ljava/util/Locale;)I

    move-result v7

    if-eqz v7, :cond_3

    if-eq v7, v12, :cond_5

    goto :goto_2

    :goto_4
    iput v7, v0, Li2/d;->l:I

    new-instance v7, Li2/c;

    invoke-direct {v7, v0, v6}, Li2/c;-><init>(Ljava/lang/Object;I)V

    iget-object v5, v5, La2/p;->i:Ll2/r;

    if-nez v5, :cond_c

    sget-object v5, Ll2/r;->c:Ll2/r;

    :cond_c
    iget-boolean v8, v5, Ll2/r;->b:Z

    if-eqz v8, :cond_d

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v8

    or-int/lit16 v8, v8, 0x80

    goto :goto_5

    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v8

    and-int/lit16 v8, v8, -0x81

    :goto_5
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setFlags(I)V

    iget v5, v5, Ll2/r;->a:I

    if-ne v5, v12, :cond_e

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v5

    or-int/lit8 v5, v5, 0x40

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_e
    if-ne v5, v11, :cond_f

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    invoke-virtual {v4, v12}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_f
    if-ne v5, v13, :cond_10

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_10
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    :goto_6
    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    xor-int/2addr v5, v12

    iget-wide v10, v1, La2/x;->b:J

    invoke-static {v10, v11}, Lm2/n;->b(J)J

    move-result-wide v10

    const-wide v13, 0x100000000L

    invoke-static {v10, v11, v13, v14}, Lm2/o;->a(JJ)Z

    move-result v8

    const-wide v12, 0x200000000L

    move-object/from16 p4, v7

    iget-wide v6, v1, La2/x;->b:J

    if-eqz v8, :cond_11

    invoke-interface {v2, v6, v7}, Lm2/b;->Z(J)F

    move-result v6

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_7

    :cond_11
    invoke-static {v10, v11, v12, v13}, Lm2/o;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v8

    invoke-static {v6, v7}, Lm2/n;->c(J)F

    move-result v6

    mul-float/2addr v6, v8

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_12
    :goto_7
    iget-object v6, v1, La2/x;->c:Lf2/l;

    iget-object v7, v1, La2/x;->d:Lf2/j;

    iget-object v8, v1, La2/x;->f:Lf2/e;

    if-nez v8, :cond_14

    if-nez v7, :cond_14

    if-eqz v6, :cond_13

    goto :goto_8

    :cond_13
    move-object/from16 v7, p4

    goto :goto_b

    :cond_14
    :goto_8
    if-nez v6, :cond_15

    sget-object v6, Lf2/l;->c:Lf2/l;

    :cond_15
    if-eqz v7, :cond_16

    iget v7, v7, Lf2/j;->a:I

    goto :goto_9

    :cond_16
    const/4 v7, 0x0

    :goto_9
    new-instance v10, Lf2/j;

    invoke-direct {v10, v7}, Lf2/j;-><init>(I)V

    iget-object v7, v1, La2/x;->e:Lf2/k;

    if-eqz v7, :cond_17

    iget v7, v7, Lf2/k;->a:I

    goto :goto_a

    :cond_17
    const/4 v7, 0x1

    :goto_a
    new-instance v11, Lf2/k;

    invoke-direct {v11, v7}, Lf2/k;-><init>(I)V

    move-object/from16 v7, p4

    invoke-virtual {v7, v8, v6, v10, v11}, Li2/c;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Typeface;

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_b
    sget-object v6, Lj2/a;->a:Lj2/a;

    iget-object v8, v1, La2/x;->k:Lh2/d;

    if-eqz v8, :cond_18

    sget-object v10, Lh2/f;->a:Lh2/b;

    invoke-virtual {v10}, Lh2/b;->a()Lh2/d;

    move-result-object v10

    invoke-static {v8, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    invoke-virtual {v6, v4, v8}, Lj2/a;->b(Li2/e;Lh2/d;)V

    :cond_18
    iget-object v8, v1, La2/x;->g:Ljava/lang/String;

    if-eqz v8, :cond_19

    const-string v10, ""

    invoke-static {v8, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_19

    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_19
    iget-object v8, v1, La2/x;->j:Ll2/p;

    if-eqz v8, :cond_1a

    sget-object v10, Ll2/p;->c:Ll2/p;

    invoke-static {v8, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1a

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v10

    iget v11, v8, Ll2/p;->a:F

    mul-float/2addr v10, v11

    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setTextScaleX(F)V

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v10

    iget v8, v8, Ll2/p;->b:F

    add-float/2addr v10, v8

    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setTextSkewX(F)V

    :cond_1a
    iget-object v8, v1, La2/x;->a:Ll2/o;

    invoke-interface {v8}, Ll2/o;->d()J

    move-result-wide v10

    sget-wide v12, Le1/r;->g:J

    cmp-long v14, v10, v12

    const/4 v15, 0x0

    if-eqz v14, :cond_1b

    iget-object v14, v4, Li2/e;->a:Le1/g;

    invoke-virtual {v14, v10, v11}, Le1/g;->e(J)V

    invoke-virtual {v14, v15}, Le1/g;->h(Landroid/graphics/Shader;)V

    :cond_1b
    invoke-interface {v8}, Ll2/o;->e()Le1/n;

    move-result-object v10

    move-object/from16 p6, v10

    sget-wide v9, Ld1/f;->c:J

    invoke-interface {v8}, Ll2/o;->c()F

    move-result v8

    move-object/from16 v11, p6

    invoke-virtual {v4, v11, v9, v10, v8}, Li2/e;->a(Le1/n;JF)V

    iget-object v8, v1, La2/x;->n:Le1/k0;

    invoke-virtual {v4, v8}, Li2/e;->c(Le1/k0;)V

    iget-object v8, v1, La2/x;->m:Ll2/j;

    invoke-virtual {v4, v8}, Li2/e;->d(Ll2/j;)V

    iget-object v8, v1, La2/x;->p:Lg1/h;

    invoke-virtual {v4, v8}, Li2/e;->b(Lg1/h;)V

    iget-wide v8, v1, La2/x;->h:J

    invoke-static {v8, v9}, Lm2/n;->b(J)J

    move-result-wide v10

    const-wide v14, 0x100000000L

    invoke-static {v10, v11, v14, v15}, Lm2/o;->a(JJ)Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_1e

    invoke-static {v8, v9}, Lm2/n;->c(J)F

    move-result v10

    cmpg-float v10, v10, v11

    if-nez v10, :cond_1c

    goto :goto_d

    :cond_1c
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v10

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v16

    mul-float v16, v16, v10

    invoke-interface {v2, v8, v9}, Lm2/b;->Z(J)F

    move-result v2

    cmpg-float v10, v16, v11

    if-nez v10, :cond_1d

    :goto_c
    move-wide/from16 v19, v12

    goto :goto_e

    :cond_1d
    div-float v2, v2, v16

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_c

    :cond_1e
    :goto_d
    invoke-static {v8, v9}, Lm2/n;->b(J)J

    move-result-wide v14

    move-wide/from16 v19, v12

    const-wide v11, 0x200000000L

    invoke-static {v14, v15, v11, v12}, Lm2/o;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_1f

    invoke-static {v8, v9}, Lm2/n;->c(J)F

    move-result v10

    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    :cond_1f
    :goto_e
    if-eqz v5, :cond_21

    invoke-static {v8, v9}, Lm2/n;->b(J)J

    move-result-wide v4

    const-wide v10, 0x100000000L

    invoke-static {v4, v5, v10, v11}, Lm2/o;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-static {v8, v9}, Lm2/n;->c(J)F

    move-result v4

    const/4 v2, 0x0

    cmpg-float v4, v4, v2

    if-nez v4, :cond_20

    goto :goto_f

    :cond_20
    const/4 v4, 0x1

    goto :goto_10

    :cond_21
    :goto_f
    const/4 v4, 0x0

    :goto_10
    iget-wide v12, v1, La2/x;->l:J

    move-wide/from16 v14, v19

    invoke-static {v12, v13, v14, v15}, Le1/r;->c(JJ)Z

    move-result v5

    if-nez v5, :cond_22

    sget-wide v2, Le1/r;->f:J

    invoke-static {v12, v13, v2, v3}, Le1/r;->c(JJ)Z

    move-result v2

    if-nez v2, :cond_22

    const/4 v3, 0x1

    goto :goto_11

    :cond_22
    const/4 v3, 0x0

    :goto_11
    iget-object v1, v1, La2/x;->i:Ll2/a;

    if-eqz v1, :cond_24

    iget v2, v1, Ll2/a;->a:F

    const/4 v5, 0x0

    invoke-static {v2, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v16

    if-nez v16, :cond_23

    goto :goto_12

    :cond_23
    const/4 v5, 0x1

    goto :goto_13

    :cond_24
    :goto_12
    const/4 v5, 0x0

    :goto_13
    if-nez v4, :cond_25

    if-nez v3, :cond_25

    if-nez v5, :cond_25

    const/4 v1, 0x0

    goto :goto_18

    :cond_25
    if-eqz v4, :cond_26

    :goto_14
    move-wide/from16 v27, v8

    goto :goto_15

    :cond_26
    sget-wide v8, Lm2/n;->c:J

    goto :goto_14

    :goto_15
    if-eqz v3, :cond_27

    move-wide/from16 v32, v12

    goto :goto_16

    :cond_27
    move-wide/from16 v32, v14

    :goto_16
    if-eqz v5, :cond_28

    move-object/from16 v29, v1

    goto :goto_17

    :cond_28
    const/16 v29, 0x0

    :goto_17
    new-instance v1, La2/x;

    move-object/from16 v17, v1

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const v36, 0xf67f

    invoke-direct/range {v17 .. v36}, La2/x;-><init>(JJLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;I)V

    :goto_18
    if-eqz v1, :cond_2a

    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_19
    if-ge v5, v3, :cond_2b

    if-nez v5, :cond_29

    new-instance v8, La2/d;

    iget-object v9, v0, Li2/d;->a:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v12, 0x0

    invoke-direct {v8, v1, v12, v9}, La2/d;-><init>(Ljava/lang/Object;II)V

    goto :goto_1a

    :cond_29
    iget-object v8, v0, Li2/d;->c:Ljava/util/List;

    add-int/lit8 v9, v5, -0x1

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La2/d;

    :goto_1a
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_19

    :cond_2a
    move-object/from16 v4, p5

    :cond_2b
    iget-object v1, v0, Li2/d;->a:Ljava/lang/String;

    iget-object v3, v0, Li2/d;->g:Li2/e;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    iget-object v5, v0, Li2/d;->b:La2/c0;

    iget-object v8, v0, Li2/d;->d:Ljava/util/List;

    iget-object v9, v0, Li2/d;->f:Lm2/b;

    iget-boolean v12, v0, Li2/d;->k:Z

    sget-object v13, Li2/b;->a:Li2/a;

    if-eqz v12, :cond_2d

    invoke-static {}, Li3/l;->c()Z

    move-result v12

    if-eqz v12, :cond_2d

    invoke-static {}, Li3/l;->a()Li3/l;

    move-result-object v12

    if-nez v1, :cond_2c

    const/4 v13, 0x0

    :goto_1b
    const/4 v14, 0x0

    goto :goto_1c

    :cond_2c
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v13

    goto :goto_1b

    :goto_1c
    invoke-virtual {v12, v14, v13, v1}, Li3/l;->g(IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-static {v12}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_1d

    :cond_2d
    move-object v12, v1

    :goto_1d
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_2e

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_2e

    iget-object v13, v5, La2/c0;->b:La2/p;

    iget-object v13, v13, La2/p;->d:Ll2/q;

    sget-object v14, Ll2/q;->c:Ll2/q;

    invoke-static {v13, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2e

    iget-object v13, v5, La2/c0;->b:La2/p;

    iget-wide v13, v13, La2/p;->c:J

    invoke-static {v13, v14}, Lo1/s;->V(J)Z

    move-result v13

    if-eqz v13, :cond_2e

    goto/16 :goto_41

    :cond_2e
    instance-of v13, v12, Landroid/text/Spannable;

    if-eqz v13, :cond_2f

    check-cast v12, Landroid/text/Spannable;

    goto :goto_1e

    :cond_2f
    new-instance v13, Landroid/text/SpannableString;

    invoke-direct {v13, v12}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v12, v13

    :goto_1e
    iget-object v13, v5, La2/c0;->a:La2/x;

    iget-object v13, v13, La2/x;->m:Ll2/j;

    sget-object v14, Ll2/j;->c:Ll2/j;

    invoke-static {v13, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    const/16 v14, 0x21

    if-eqz v13, :cond_30

    sget-object v13, Li2/b;->a:Li2/a;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v15, 0x0

    invoke-interface {v12, v13, v15, v1, v14}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_30
    iget-object v1, v5, La2/c0;->c:La2/t;

    if-eqz v1, :cond_31

    iget-object v1, v1, La2/t;->b:La2/r;

    if-eqz v1, :cond_31

    iget-boolean v1, v1, La2/r;->a:Z

    goto :goto_1f

    :cond_31
    const/4 v1, 0x0

    :goto_1f
    iget-object v13, v5, La2/c0;->b:La2/p;

    if-eqz v1, :cond_32

    iget-object v1, v13, La2/p;->f:Ll2/g;

    if-nez v1, :cond_32

    iget-wide v10, v13, La2/p;->c:J

    invoke-static {v10, v11, v3, v9}, Lo1/s;->h0(JFLm2/b;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-nez v10, :cond_39

    new-instance v10, Ld2/g;

    invoke-direct {v10, v1}, Ld2/g;-><init>(F)V

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v11, 0x0

    invoke-interface {v12, v10, v11, v1, v14}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto/16 :goto_25

    :cond_32
    iget-object v1, v13, La2/p;->f:Ll2/g;

    if-nez v1, :cond_33

    sget-object v1, Ll2/g;->c:Ll2/g;

    :cond_33
    iget-wide v10, v13, La2/p;->c:J

    invoke-static {v10, v11, v3, v9}, Lo1/s;->h0(JFLm2/b;)F

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-nez v10, :cond_39

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_34

    goto :goto_20

    :cond_34
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-eqz v10, :cond_38

    invoke-static {v12}, Ll9/i;->L0(Ljava/lang/CharSequence;)I

    move-result v10

    invoke-interface {v12, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    const/16 v11, 0xa

    if-ne v10, v11, :cond_35

    :goto_20
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v10

    const/4 v11, 0x1

    add-int/2addr v10, v11

    :goto_21
    move/from16 v19, v10

    goto :goto_22

    :cond_35
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v10

    goto :goto_21

    :goto_22
    new-instance v10, Ld2/h;

    iget v11, v1, Ll2/g;->b:I

    and-int/lit8 v17, v11, 0x1

    if-lez v17, :cond_36

    const/16 v20, 0x1

    goto :goto_23

    :cond_36
    const/16 v20, 0x0

    :goto_23
    and-int/lit8 v11, v11, 0x10

    if-lez v11, :cond_37

    const/16 v21, 0x1

    goto :goto_24

    :cond_37
    const/16 v21, 0x0

    :goto_24
    iget v1, v1, Ll2/g;->a:F

    move-object/from16 v17, v10

    move/from16 v22, v1

    invoke-direct/range {v17 .. v22}, Ld2/h;-><init>(FIZZF)V

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v11, 0x0

    invoke-interface {v12, v10, v11, v1, v14}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_25

    :cond_38
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Char sequence is empty."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_39
    :goto_25
    iget-object v1, v13, La2/p;->d:Ll2/q;

    if-eqz v1, :cond_40

    const/4 v10, 0x0

    invoke-static {v10}, Lo1/s;->N(I)J

    move-result-wide v14

    move/from16 p5, v3

    iget-wide v2, v1, Ll2/q;->a:J

    invoke-static {v2, v3, v14, v15}, Lm2/n;->a(JJ)Z

    move-result v13

    iget-wide v14, v1, Ll2/q;->b:J

    move-object v1, v12

    if-eqz v13, :cond_3a

    invoke-static {v10}, Lo1/s;->N(I)J

    move-result-wide v11

    invoke-static {v14, v15, v11, v12}, Lm2/n;->a(JJ)Z

    move-result v10

    if-nez v10, :cond_41

    :cond_3a
    invoke-static {v2, v3}, Lo1/s;->V(J)Z

    move-result v10

    if-nez v10, :cond_41

    invoke-static {v14, v15}, Lo1/s;->V(J)Z

    move-result v10

    if-eqz v10, :cond_3b

    goto/16 :goto_28

    :cond_3b
    invoke-static {v2, v3}, Lm2/n;->b(J)J

    move-result-wide v10

    move-wide/from16 v19, v14

    const-wide v13, 0x100000000L

    invoke-static {v10, v11, v13, v14}, Lm2/o;->a(JJ)Z

    move-result v15

    if-eqz v15, :cond_3c

    invoke-interface {v9, v2, v3}, Lm2/b;->Z(J)F

    move-result v2

    const-wide v12, 0x200000000L

    goto :goto_26

    :cond_3c
    const-wide v12, 0x200000000L

    invoke-static {v10, v11, v12, v13}, Lm2/o;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_3d

    invoke-static {v2, v3}, Lm2/n;->c(J)F

    move-result v2

    mul-float v2, v2, p5

    goto :goto_26

    :cond_3d
    const/4 v2, 0x0

    :goto_26
    invoke-static/range {v19 .. v20}, Lm2/n;->b(J)J

    move-result-wide v10

    const-wide v12, 0x100000000L

    invoke-static {v10, v11, v12, v13}, Lm2/o;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_3e

    move-wide/from16 v12, v19

    invoke-interface {v9, v12, v13}, Lm2/b;->Z(J)F

    move-result v3

    goto :goto_27

    :cond_3e
    move-wide/from16 v12, v19

    const-wide v14, 0x200000000L

    invoke-static {v10, v11, v14, v15}, Lm2/o;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_3f

    invoke-static {v12, v13}, Lm2/n;->c(J)F

    move-result v3

    mul-float v3, v3, p5

    goto :goto_27

    :cond_3f
    const/4 v3, 0x0

    :goto_27
    new-instance v10, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v11, v2

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-float v2, v11

    float-to-int v2, v2

    float-to-double v11, v3

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-float v3, v11

    float-to-int v3, v3

    invoke-direct {v10, v2, v3}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    const/16 v11, 0x21

    invoke-interface {v1, v10, v3, v2, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_28

    :cond_40
    move-object v1, v12

    :cond_41
    :goto_28
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    const/4 v10, 0x0

    :goto_29
    if-ge v10, v3, :cond_45

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, La2/d;

    iget-object v12, v12, La2/d;->a:Ljava/lang/Object;

    move-object v13, v12

    check-cast v13, La2/x;

    iget-object v14, v13, La2/x;->f:Lf2/e;

    if-nez v14, :cond_43

    iget-object v14, v13, La2/x;->d:Lf2/j;

    if-nez v14, :cond_43

    iget-object v13, v13, La2/x;->c:Lf2/l;

    if-eqz v13, :cond_42

    goto :goto_2a

    :cond_42
    check-cast v12, La2/x;

    iget-object v12, v12, La2/x;->e:Lf2/k;

    if-eqz v12, :cond_44

    :cond_43
    :goto_2a
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_44
    add-int/lit8 v10, v10, 0x1

    goto :goto_29

    :cond_45
    iget-object v3, v5, La2/c0;->a:La2/x;

    iget-object v5, v3, La2/x;->f:Lf2/e;

    if-nez v5, :cond_48

    iget-object v10, v3, La2/x;->d:Lf2/j;

    if-nez v10, :cond_48

    iget-object v10, v3, La2/x;->c:Lf2/l;

    if-eqz v10, :cond_46

    goto :goto_2b

    :cond_46
    iget-object v10, v3, La2/x;->e:Lf2/k;

    if-eqz v10, :cond_47

    goto :goto_2b

    :cond_47
    const/4 v12, 0x0

    goto :goto_2c

    :cond_48
    :goto_2b
    iget-object v10, v3, La2/x;->c:Lf2/l;

    iget-object v11, v3, La2/x;->d:Lf2/j;

    iget-object v3, v3, La2/x;->e:Lf2/k;

    new-instance v12, La2/x;

    move-object/from16 v25, v12

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const v44, 0xffc3

    move-object/from16 v30, v10

    move-object/from16 v31, v11

    move-object/from16 v32, v3

    move-object/from16 v33, v5

    invoke-direct/range {v25 .. v44}, La2/x;-><init>(JJLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;I)V

    :goto_2c
    new-instance v3, Lu/l1;

    const/4 v5, 0x4

    invoke-direct {v3, v5, v1, v7}, Lu/l1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v7, 0x1

    if-gt v5, v7, :cond_4a

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    xor-int/2addr v5, v7

    if-eqz v5, :cond_53

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La2/d;

    iget-object v7, v7, La2/d;->a:Ljava/lang/Object;

    check-cast v7, La2/x;

    if-nez v12, :cond_49

    goto :goto_2d

    :cond_49
    invoke-virtual {v12, v7}, La2/x;->c(La2/x;)La2/x;

    move-result-object v7

    :goto_2d
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La2/d;

    iget v10, v10, La2/d;->b:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La2/d;

    iget v2, v2, La2/d;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v7, v10, v2}, Lu/l1;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_35

    :cond_4a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int/lit8 v7, v5, 0x2

    new-array v10, v7, [Ljava/lang/Integer;

    const/4 v11, 0x0

    :goto_2e
    if-ge v11, v7, :cond_4b

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_2e

    :cond_4b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v13, 0x0

    :goto_2f
    if-ge v13, v11, :cond_4c

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, La2/d;

    iget v15, v14, La2/d;->b:I

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v10, v13

    add-int v15, v13, v5

    iget v14, v14, La2/d;->c:I

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v10, v15

    add-int/lit8 v13, v13, 0x1

    goto :goto_2f

    :cond_4c
    move-object v5, v10

    check-cast v5, [Ljava/lang/Comparable;

    array-length v11, v5

    const/4 v13, 0x1

    if-le v11, v13, :cond_4d

    invoke-static {v5}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    :cond_4d
    if-eqz v7, :cond_6e

    const/4 v5, 0x0

    aget-object v11, v10, v5

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v11, 0x0

    :goto_30
    if-ge v11, v7, :cond_53

    aget-object v14, v10, v11

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v5, :cond_4e

    move-object/from16 p5, v2

    move/from16 p4, v7

    move-object/from16 v17, v10

    move-object/from16 v18, v12

    goto :goto_34

    :cond_4e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v15

    move/from16 p4, v7

    move-object v7, v12

    const/4 v13, 0x0

    :goto_31
    if-ge v13, v15, :cond_51

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 p5, v2

    move-object/from16 v2, v17

    check-cast v2, La2/d;

    move-object/from16 v17, v10

    iget v10, v2, La2/d;->b:I

    move-object/from16 v18, v12

    iget v12, v2, La2/d;->c:I

    if-eq v10, v12, :cond_50

    invoke-static {v5, v14, v10, v12}, La2/f;->c(IIII)Z

    move-result v10

    if-eqz v10, :cond_50

    iget-object v2, v2, La2/d;->a:Ljava/lang/Object;

    check-cast v2, La2/x;

    if-nez v7, :cond_4f

    :goto_32
    move-object v7, v2

    goto :goto_33

    :cond_4f
    invoke-virtual {v7, v2}, La2/x;->c(La2/x;)La2/x;

    move-result-object v2

    goto :goto_32

    :cond_50
    :goto_33
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v2, p5

    move-object/from16 v10, v17

    move-object/from16 v12, v18

    goto :goto_31

    :cond_51
    move-object/from16 p5, v2

    move-object/from16 v17, v10

    move-object/from16 v18, v12

    if-eqz v7, :cond_52

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v7, v2, v5}, Lu/l1;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_52
    move v5, v14

    :goto_34
    add-int/lit8 v11, v11, 0x1

    move/from16 v7, p4

    move-object/from16 v2, p5

    move-object/from16 v10, v17

    move-object/from16 v12, v18

    const/4 v13, 0x1

    goto :goto_30

    :cond_53
    :goto_35
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v12, 0x0

    :goto_36
    if-ge v12, v2, :cond_65

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La2/d;

    iget v7, v5, La2/d;->b:I

    if-ltz v7, :cond_54

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-ge v7, v10, :cond_54

    iget v10, v5, La2/d;->c:I

    if-le v10, v7, :cond_54

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-le v10, v7, :cond_55

    :cond_54
    move/from16 p5, v2

    move-object v11, v8

    move-object/from16 p4, v9

    const/4 v15, 0x0

    goto/16 :goto_3c

    :cond_55
    iget v7, v5, La2/d;->b:I

    iget v10, v5, La2/d;->c:I

    iget-object v5, v5, La2/d;->a:Ljava/lang/Object;

    check-cast v5, La2/x;

    iget-object v11, v5, La2/x;->i:Ll2/a;

    if-eqz v11, :cond_56

    new-instance v13, Ld2/a;

    iget v11, v11, Ll2/a;->a:F

    invoke-direct {v13, v11}, Ld2/a;-><init>(F)V

    const/16 v11, 0x21

    invoke-interface {v1, v13, v7, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_56
    iget-object v11, v5, La2/x;->a:Ll2/o;

    invoke-interface {v11}, Ll2/o;->d()J

    move-result-wide v13

    invoke-static {v1, v13, v14, v7, v10}, Lo1/s;->j0(Landroid/text/Spannable;JII)V

    invoke-interface {v11}, Ll2/o;->e()Le1/n;

    move-result-object v13

    invoke-interface {v11}, Ll2/o;->c()F

    move-result v11

    if-eqz v13, :cond_58

    instance-of v14, v13, Le1/n0;

    if-eqz v14, :cond_57

    check-cast v13, Le1/n0;

    iget-wide v13, v13, Le1/n0;->a:J

    invoke-static {v1, v13, v14, v7, v10}, Lo1/s;->j0(Landroid/text/Spannable;JII)V

    goto :goto_37

    :cond_57
    instance-of v14, v13, Le1/j0;

    if-eqz v14, :cond_58

    new-instance v14, Lk2/b;

    check-cast v13, Le1/j0;

    invoke-direct {v14, v13, v11}, Lk2/b;-><init>(Le1/j0;F)V

    const/16 v11, 0x21

    invoke-interface {v1, v14, v7, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_58
    :goto_37
    iget-object v11, v5, La2/x;->m:Ll2/j;

    if-eqz v11, :cond_5b

    new-instance v13, Ld2/l;

    iget v11, v11, Ll2/j;->a:I

    or-int/lit8 v14, v11, 0x1

    if-ne v14, v11, :cond_59

    const/4 v14, 0x1

    goto :goto_38

    :cond_59
    const/4 v14, 0x0

    :goto_38
    or-int/lit8 v15, v11, 0x2

    if-ne v15, v11, :cond_5a

    const/4 v11, 0x1

    goto :goto_39

    :cond_5a
    const/4 v11, 0x0

    :goto_39
    invoke-direct {v13, v14, v11}, Ld2/l;-><init>(ZZ)V

    const/16 v11, 0x21

    invoke-interface {v1, v13, v7, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_5b
    iget-wide v13, v5, La2/x;->b:J

    move-object/from16 v17, v1

    move-wide/from16 v18, v13

    move-object/from16 v20, v9

    move/from16 v21, v7

    move/from16 v22, v10

    invoke-static/range {v17 .. v22}, Lo1/s;->l0(Landroid/text/Spannable;JLm2/b;II)V

    iget-object v11, v5, La2/x;->g:Ljava/lang/String;

    if-eqz v11, :cond_5c

    new-instance v13, Ld2/b;

    invoke-direct {v13, v11}, Ld2/b;-><init>(Ljava/lang/String;)V

    const/16 v11, 0x21

    invoke-interface {v1, v13, v7, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3a

    :cond_5c
    const/16 v11, 0x21

    :goto_3a
    iget-object v13, v5, La2/x;->j:Ll2/p;

    if-eqz v13, :cond_5d

    new-instance v14, Landroid/text/style/ScaleXSpan;

    iget v15, v13, Ll2/p;->a:F

    invoke-direct {v14, v15}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    invoke-interface {v1, v14, v7, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    new-instance v14, Ld2/k;

    iget v13, v13, Ll2/p;->b:F

    invoke-direct {v14, v13}, Ld2/k;-><init>(F)V

    invoke-interface {v1, v14, v7, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_5d
    iget-object v13, v5, La2/x;->k:Lh2/d;

    if-eqz v13, :cond_5e

    invoke-virtual {v6, v13}, Lj2/a;->a(Lh2/d;)Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v1, v13, v7, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_5e
    sget-wide v13, Le1/r;->g:J

    move-object v11, v8

    move-object v15, v9

    iget-wide v8, v5, La2/x;->l:J

    cmp-long v13, v8, v13

    if-eqz v13, :cond_5f

    new-instance v13, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v8

    invoke-direct {v13, v8}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    const/16 v8, 0x21

    invoke-interface {v1, v13, v7, v10, v8}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_5f
    iget-object v8, v5, La2/x;->n:Le1/k0;

    if-eqz v8, :cond_61

    new-instance v9, Ld2/j;

    iget-wide v13, v8, Le1/k0;->a:J

    invoke-static {v13, v14}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v13

    move-object/from16 p4, v15

    iget-wide v14, v8, Le1/k0;->b:J

    move/from16 p5, v2

    invoke-static {v14, v15}, Ld1/c;->d(J)F

    move-result v2

    invoke-static {v14, v15}, Ld1/c;->e(J)F

    move-result v14

    iget v8, v8, Le1/k0;->c:F

    const/4 v15, 0x0

    cmpg-float v16, v8, v15

    if-nez v16, :cond_60

    const/4 v8, 0x1

    :cond_60
    invoke-direct {v9, v2, v14, v8, v13}, Ld2/j;-><init>(FFFI)V

    const/16 v2, 0x21

    invoke-interface {v1, v9, v7, v10, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3b

    :cond_61
    move/from16 p5, v2

    move-object/from16 p4, v15

    const/16 v2, 0x21

    const/4 v15, 0x0

    :goto_3b
    iget-object v8, v5, La2/x;->p:Lg1/h;

    if-eqz v8, :cond_62

    new-instance v9, Lk2/a;

    invoke-direct {v9, v8}, Lk2/a;-><init>(Lg1/h;)V

    invoke-interface {v1, v9, v7, v10, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_62
    iget-wide v7, v5, La2/x;->h:J

    invoke-static {v7, v8}, Lm2/n;->b(J)J

    move-result-wide v9

    const-wide v13, 0x100000000L

    invoke-static {v9, v10, v13, v14}, Lm2/o;->a(JJ)Z

    move-result v2

    if-nez v2, :cond_63

    invoke-static {v7, v8}, Lm2/n;->b(J)J

    move-result-wide v7

    const-wide v13, 0x200000000L

    invoke-static {v7, v8, v13, v14}, Lm2/o;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_64

    :cond_63
    const/4 v3, 0x1

    :cond_64
    :goto_3c
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v9, p4

    move/from16 v2, p5

    move-object v8, v11

    goto/16 :goto_36

    :cond_65
    move-object v11, v8

    move-object/from16 p4, v9

    if-eqz v3, :cond_6b

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    const/4 v12, 0x0

    :goto_3d
    if-ge v12, v2, :cond_6b

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La2/d;

    iget v5, v3, La2/d;->b:I

    iget-object v6, v3, La2/d;->a:Ljava/lang/Object;

    check-cast v6, La2/x;

    if-ltz v5, :cond_66

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v5, v7, :cond_66

    iget v3, v3, La2/d;->c:I

    if-le v3, v5, :cond_66

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-le v3, v7, :cond_67

    :cond_66
    move-object/from16 v15, p4

    const/16 v6, 0x21

    const-wide v8, 0x200000000L

    goto :goto_3f

    :cond_67
    iget-wide v6, v6, La2/x;->h:J

    invoke-static {v6, v7}, Lm2/n;->b(J)J

    move-result-wide v13

    const-wide v8, 0x100000000L

    invoke-static {v13, v14, v8, v9}, Lm2/o;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_68

    new-instance v10, Ld2/f;

    move-object/from16 v15, p4

    invoke-interface {v15, v6, v7}, Lm2/b;->Z(J)F

    move-result v6

    invoke-direct {v10, v6}, Ld2/f;-><init>(F)V

    const-wide v8, 0x200000000L

    goto :goto_3e

    :cond_68
    move-object/from16 v15, p4

    const-wide v8, 0x200000000L

    invoke-static {v13, v14, v8, v9}, Lm2/o;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_69

    new-instance v10, Ld2/e;

    invoke-static {v6, v7}, Lm2/n;->c(J)F

    move-result v6

    invoke-direct {v10, v6}, Ld2/e;-><init>(F)V

    goto :goto_3e

    :cond_69
    const/4 v10, 0x0

    :goto_3e
    const/16 v6, 0x21

    if-eqz v10, :cond_6a

    invoke-interface {v1, v10, v5, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_6a
    :goto_3f
    add-int/lit8 v12, v12, 0x1

    move-object/from16 p4, v15

    goto :goto_3d

    :cond_6b
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_6d

    move-object v3, v11

    const/4 v2, 0x0

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La2/d;

    iget-object v4, v3, La2/d;->a:Ljava/lang/Object;

    invoke-static {v4}, La7/a;->w(Ljava/lang/Object;)V

    const-class v4, Li3/e0;

    iget v5, v3, La2/d;->b:I

    iget v3, v3, La2/d;->c:I

    invoke-interface {v1, v5, v3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    array-length v4, v3

    move v6, v2

    :goto_40
    if-ge v6, v4, :cond_6c

    aget-object v2, v3, v6

    check-cast v2, Li3/e0;

    invoke-interface {v1, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_40

    :cond_6c
    new-instance v1, Ld2/i;

    const/4 v1, 0x0

    throw v1

    :cond_6d
    move-object v12, v1

    :goto_41
    iput-object v12, v0, Li2/d;->h:Ljava/lang/CharSequence;

    new-instance v1, Lb2/h;

    iget-object v2, v0, Li2/d;->g:Li2/e;

    iget v3, v0, Li2/d;->l:I

    invoke-direct {v1, v12, v2, v3}, Lb2/h;-><init>(Ljava/lang/CharSequence;Li2/e;I)V

    iput-object v1, v0, Li2/d;->i:Lb2/h;

    return-void

    :cond_6e
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Array is empty."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid TextDirection."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a()F
    .locals 11

    iget-object v0, p0, Li2/d;->i:Lb2/h;

    iget v1, v0, Lb2/h;->e:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    iget v0, v0, Lb2/h;->e:F

    goto/16 :goto_3

    :cond_0
    iget-object v1, v0, Lb2/h;->b:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object v2

    new-instance v3, Lb2/c;

    iget-object v4, v0, Lb2/h;->a:Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-direct {v3, v4, v5}, Lb2/c;-><init>(Ljava/lang/CharSequence;I)V

    invoke-virtual {v2, v3}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    new-instance v3, Ljava/util/PriorityQueue;

    new-instance v5, Lm0/r;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Lm0/r;-><init>(I)V

    const/16 v6, 0xa

    invoke-direct {v3, v6, v5}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    invoke-virtual {v2}, Ljava/text/BreakIterator;->next()I

    move-result v5

    const/4 v7, 0x0

    :goto_0
    const/4 v8, -0x1

    if-eq v5, v8, :cond_3

    invoke-virtual {v3}, Ljava/util/PriorityQueue;->size()I

    move-result v8

    if-ge v8, v6, :cond_1

    new-instance v8, Lq8/f;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v8, v7, v9}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v8}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lq8/f;

    if-eqz v8, :cond_2

    iget-object v9, v8, Lq8/f;->b:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    iget-object v8, v8, Lq8/f;->a:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    sub-int/2addr v9, v8

    sub-int v8, v5, v7

    if-ge v9, v8, :cond_2

    invoke-virtual {v3}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    new-instance v8, Lq8/f;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v8, v7, v9}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v8}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/text/BreakIterator;->next()I

    move-result v7

    move v10, v7

    move v7, v5

    move v5, v10

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq8/f;

    iget-object v6, v5, Lq8/f;->a:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    iget-object v5, v5, Lq8/f;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v4, v6, v5, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    move-result v3

    goto :goto_2

    :cond_4
    iput v3, v0, Lb2/h;->e:F

    move v0, v3

    :goto_3
    return v0
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Li2/d;->j:Ll/z2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/z2;->H()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-boolean v0, p0, Li2/d;->k:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Li2/d;->b:La2/c0;

    invoke-static {v0}, Lo1/s;->i(La2/c0;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Li2/i;->a:Li2/g;

    sget-object v0, Li2/i;->a:Li2/g;

    iget-object v1, v0, Li2/g;->a:Lm0/l3;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Li3/l;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Li2/g;->a()Lm0/l3;

    move-result-object v1

    iput-object v1, v0, Li2/g;->a:Lm0/l3;

    goto :goto_0

    :cond_2
    sget-object v1, Li2/j;->a:Li2/k;

    :goto_0
    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Li2/d;->i:Lb2/h;

    invoke-virtual {v0}, Lb2/h;->b()F

    move-result v0

    return v0
.end method
