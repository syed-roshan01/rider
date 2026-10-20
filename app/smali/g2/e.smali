.class public final Lg2/e;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lo1/b0;

.field public final b:Lg2/p;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Lg2/a0;

.field public j:La2/a0;

.field public k:Lg2/s;

.field public l:Lc9/c;

.field public m:Ld1/d;

.field public n:Ld1/d;

.field public final o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field public final p:[F

.field public final q:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lo1/b0;Lg2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/e;->a:Lo1/b0;

    iput-object p2, p0, Lg2/e;->b:Lg2/p;

    sget-object p1, Lg2/d;->c:Lg2/d;

    iput-object p1, p0, Lg2/e;->l:Lc9/c;

    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    iput-object p1, p0, Lg2/e;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    const/16 p1, 0x10

    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Lg2/e;->p:[F

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lg2/e;->q:Landroid/graphics/Matrix;

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final a()V
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lg2/e;->b:Lg2/p;

    check-cast v1, Lg2/q;

    iget-object v2, v1, Lg2/q;->b:Lq8/c;

    invoke-interface {v2}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    iget-object v3, v1, Lg2/q;->a:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Lg2/e;->l:Lc9/c;

    new-instance v3, Le1/a0;

    iget-object v4, v0, Lg2/e;->p:[F

    invoke-direct {v3, v4}, Le1/a0;-><init>([F)V

    invoke-interface {v2, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lg2/e;->a:Lo1/b0;

    check-cast v2, Lu1/w;

    invoke-virtual {v2}, Lu1/w;->y()V

    iget-object v3, v2, Lu1/w;->Q:[F

    invoke-static {v4, v3}, Le1/a0;->d([F[F)V

    iget-wide v5, v2, Lu1/w;->U:J

    invoke-static {v5, v6}, Ld1/c;->d(J)F

    move-result v3

    iget-wide v5, v2, Lu1/w;->U:J

    invoke-static {v5, v6}, Ld1/c;->e(J)F

    move-result v5

    iget-object v2, v2, Lu1/w;->P:[F

    invoke-static {v2}, Le1/a0;->c([F)V

    invoke-static {v2, v3, v5}, Le1/a0;->e([FFF)V

    invoke-static {v4, v2}, Lu1/x1;->s([F[F)V

    iget-object v2, v0, Lg2/e;->q:Landroid/graphics/Matrix;

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/a;->o(Landroid/graphics/Matrix;[F)V

    iget-object v3, v0, Lg2/e;->i:Lg2/a0;

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v4, v0, Lg2/e;->k:Lg2/s;

    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v5, v0, Lg2/e;->j:La2/a0;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v6, v0, Lg2/e;->m:Ld1/d;

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v7, v0, Lg2/e;->n:Ld1/d;

    invoke-static {v7}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-boolean v8, v0, Lg2/e;->e:Z

    iget-boolean v9, v0, Lg2/e;->f:Z

    iget-boolean v10, v0, Lg2/e;->g:Z

    iget-boolean v11, v0, Lg2/e;->h:Z

    iget-object v15, v0, Lg2/e;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-virtual {v15}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->reset()V

    invoke-virtual {v15, v2}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setMatrix(Landroid/graphics/Matrix;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    iget-wide v12, v3, Lg2/a0;->b:J

    invoke-static {v12, v13}, La2/b0;->e(J)I

    move-result v2

    invoke-static {v12, v13}, La2/b0;->d(J)I

    move-result v12

    invoke-virtual {v15, v2, v12}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setSelectionRange(II)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    sget-object v14, Ll2/h;->b:Ll2/h;

    const/16 v19, 0x1

    if-eqz v8, :cond_8

    if-gez v2, :cond_1

    goto :goto_4

    :cond_1
    invoke-interface {v4, v2}, Lg2/s;->b(I)I

    move-result v2

    invoke-virtual {v5, v2}, La2/a0;->c(I)Ld1/d;

    move-result-object v8

    const/16 v12, 0x20

    move-object/from16 v16, v14

    iget-wide v13, v5, La2/a0;->c:J

    shr-long v12, v13, v12

    long-to-int v12, v12

    int-to-float v12, v12

    iget v13, v8, Ld1/d;->a:F

    const/4 v14, 0x0

    invoke-static {v13, v14, v12}, Lz6/a;->q(FFF)F

    move-result v13

    iget v12, v8, Ld1/d;->b:F

    invoke-static {v6, v13, v12}, Li1/b;->h(Ld1/d;FF)Z

    move-result v12

    iget v14, v8, Ld1/d;->d:F

    invoke-static {v6, v13, v14}, Li1/b;->h(Ld1/d;FF)Z

    move-result v14

    invoke-virtual {v5, v2}, La2/a0;->a(I)Ll2/h;

    move-result-object v2

    move-object/from16 v0, v16

    if-ne v2, v0, :cond_2

    move/from16 v2, v19

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-nez v12, :cond_4

    if-eqz v14, :cond_3

    goto :goto_1

    :cond_3
    const/16 v16, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    move/from16 v16, v19

    :goto_2
    if-eqz v12, :cond_5

    if-nez v14, :cond_6

    :cond_5
    or-int/lit8 v16, v16, 0x2

    :cond_6
    if-eqz v2, :cond_7

    or-int/lit8 v2, v16, 0x4

    goto :goto_3

    :cond_7
    move/from16 v2, v16

    :goto_3
    iget v14, v8, Ld1/d;->b:F

    iget v8, v8, Ld1/d;->d:F

    move-object v12, v15

    move-object/from16 v16, v0

    const/4 v0, 0x0

    move-object/from16 v20, v16

    move-object v0, v15

    move v15, v8

    move/from16 v16, v8

    move/from16 v17, v2

    invoke-virtual/range {v12 .. v17}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setInsertionMarkerLocation(FFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v20, v14

    move-object v0, v15

    :goto_5
    if-eqz v9, :cond_11

    const/4 v2, -0x1

    iget-object v8, v3, Lg2/a0;->c:La2/b0;

    if-eqz v8, :cond_9

    iget-wide v12, v8, La2/b0;->a:J

    invoke-static {v12, v13}, La2/b0;->e(J)I

    move-result v9

    goto :goto_6

    :cond_9
    move v9, v2

    :goto_6
    if-eqz v8, :cond_a

    iget-wide v12, v8, La2/b0;->a:J

    invoke-static {v12, v13}, La2/b0;->d(J)I

    move-result v2

    :cond_a
    if-ltz v9, :cond_11

    if-ge v9, v2, :cond_11

    iget-object v3, v3, Lg2/a0;->a:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3, v9, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v0, v9, v3}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setComposingText(ILjava/lang/CharSequence;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-interface {v4, v9}, Lg2/s;->b(I)I

    move-result v3

    invoke-interface {v4, v2}, Lg2/s;->b(I)I

    move-result v8

    sub-int v12, v8, v3

    mul-int/lit8 v12, v12, 0x4

    new-array v12, v12, [F

    invoke-static {v3, v8}, Lo1/s;->g(II)J

    move-result-wide v14

    iget-object v8, v5, La2/a0;->b:La2/i;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14, v15}, La2/b0;->e(J)I

    move-result v13

    invoke-virtual {v8, v13}, La2/i;->c(I)V

    invoke-static {v14, v15}, La2/b0;->d(J)I

    move-result v13

    invoke-virtual {v8, v13}, La2/i;->d(I)V

    new-instance v13, Ld9/s;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    move/from16 v21, v9

    const/4 v9, 0x0

    iput v9, v13, Ld9/s;->a:I

    new-instance v18, Ld9/r;

    invoke-direct/range {v18 .. v18}, Ljava/lang/Object;-><init>()V

    iget-object v8, v8, La2/i;->h:Ljava/util/ArrayList;

    new-instance v9, Lu/t;

    move-object/from16 v17, v13

    move-object v13, v9

    move-wide/from16 v22, v14

    move-object/from16 v16, v12

    invoke-direct/range {v13 .. v18}, Lu/t;-><init>(J[FLd9/s;Ld9/r;)V

    move-wide/from16 v13, v22

    invoke-static {v8, v13, v14, v9}, Lo1/s;->z(Ljava/util/ArrayList;JLc9/c;)V

    move/from16 v9, v21

    :goto_7
    if-ge v9, v2, :cond_11

    invoke-interface {v4, v9}, Lg2/s;->b(I)I

    move-result v8

    sub-int v13, v8, v3

    mul-int/lit8 v13, v13, 0x4

    aget v14, v12, v13

    add-int/lit8 v15, v13, 0x1

    aget v15, v12, v15

    add-int/lit8 v16, v13, 0x2

    move/from16 v21, v2

    aget v2, v12, v16

    add-int/lit8 v13, v13, 0x3

    aget v13, v12, v13

    move/from16 v22, v3

    iget v3, v6, Ld1/d;->c:F

    cmpg-float v3, v3, v14

    if-lez v3, :cond_d

    iget v3, v6, Ld1/d;->a:F

    cmpg-float v3, v2, v3

    if-gtz v3, :cond_b

    goto :goto_8

    :cond_b
    iget v3, v6, Ld1/d;->d:F

    cmpg-float v3, v3, v15

    if-lez v3, :cond_d

    iget v3, v6, Ld1/d;->b:F

    cmpg-float v3, v13, v3

    if-gtz v3, :cond_c

    goto :goto_8

    :cond_c
    move/from16 v3, v19

    goto :goto_9

    :cond_d
    :goto_8
    const/4 v3, 0x0

    :goto_9
    invoke-static {v6, v14, v15}, Li1/b;->h(Ld1/d;FF)Z

    move-result v16

    if-eqz v16, :cond_e

    invoke-static {v6, v2, v13}, Li1/b;->h(Ld1/d;FF)Z

    move-result v16

    if-nez v16, :cond_f

    :cond_e
    or-int/lit8 v3, v3, 0x2

    :cond_f
    invoke-virtual {v5, v8}, La2/a0;->a(I)Ll2/h;

    move-result-object v8

    move-object/from16 v23, v4

    move-object/from16 v4, v20

    if-ne v8, v4, :cond_10

    or-int/lit8 v3, v3, 0x4

    :cond_10
    move/from16 v18, v3

    move-object v3, v12

    move-object v12, v0

    move v8, v13

    move v13, v9

    move/from16 v16, v2

    move/from16 v17, v8

    invoke-virtual/range {v12 .. v18}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addCharacterBounds(IFFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    add-int/lit8 v9, v9, 0x1

    move-object v12, v3

    move-object/from16 v20, v4

    move/from16 v2, v21

    move/from16 v3, v22

    move-object/from16 v4, v23

    goto :goto_7

    :cond_11
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v2, v3, :cond_12

    if-eqz v10, :cond_12

    invoke-static {v0, v7}, Lg2/b;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ld1/d;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_12
    const/16 v3, 0x22

    if-lt v2, v3, :cond_13

    if-eqz v11, :cond_13

    invoke-static {v0, v5, v6}, Lg2/c;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;La2/a0;Ld1/d;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_13
    invoke-virtual {v0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->build()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v0

    iget-object v2, v1, Lg2/q;->b:Lq8/c;

    invoke-interface {v2}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, v1, Lg2/q;->a:Landroid/view/View;

    invoke-virtual {v2, v1, v0}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    const/4 v1, 0x0

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lg2/e;->d:Z

    return-void
.end method
