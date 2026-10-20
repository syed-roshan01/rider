.class public final Lu1/j2;
.super Ljava/lang/Object;


# instance fields
.field public a:Lm2/b;

.field public b:Z

.field public final c:Landroid/graphics/Outline;

.field public d:J

.field public e:Le1/l0;

.field public f:Le1/i;

.field public g:Le1/d0;

.field public h:Z

.field public i:Z

.field public j:Le1/d0;

.field public k:Ld1/e;

.field public l:F

.field public m:J

.field public n:J

.field public o:Z

.field public p:Lm2/l;

.field public q:Le1/g0;


# direct methods
.method public constructor <init>(Lm2/b;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/j2;->a:Lm2/b;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu1/j2;->b:Z

    new-instance p1, Landroid/graphics/Outline;

    invoke-direct {p1}, Landroid/graphics/Outline;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setAlpha(F)V

    iput-object p1, p0, Lu1/j2;->c:Landroid/graphics/Outline;

    sget-wide v0, Ld1/f;->b:J

    iput-wide v0, p0, Lu1/j2;->d:J

    sget-object p1, Le1/g0;->a:Le1/f0;

    iput-object p1, p0, Lu1/j2;->e:Le1/l0;

    sget-wide v2, Ld1/c;->b:J

    iput-wide v2, p0, Lu1/j2;->m:J

    iput-wide v0, p0, Lu1/j2;->n:J

    sget-object p1, Lm2/l;->a:Lm2/l;

    iput-object p1, p0, Lu1/j2;->p:Lm2/l;

    return-void
.end method


# virtual methods
.method public final a(Le1/p;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p0 .. p0}, Lu1/j2;->e()V

    iget-object v2, v0, Lu1/j2;->g:Le1/d0;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v1, v2, v3}, Le1/p;->t(Le1/d0;I)V

    goto/16 :goto_3

    :cond_0
    iget v2, v0, Lu1/j2;->l:F

    const/4 v4, 0x0

    cmpl-float v4, v2, v4

    if-lez v4, :cond_4

    iget-object v4, v0, Lu1/j2;->j:Le1/d0;

    iget-object v5, v0, Lu1/j2;->k:Ld1/e;

    if-eqz v4, :cond_2

    iget-wide v6, v0, Lu1/j2;->m:J

    iget-wide v8, v0, Lu1/j2;->n:J

    if-eqz v5, :cond_2

    invoke-static {v5}, Lf6/a;->Z(Ld1/e;)Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v6, v7}, Ld1/c;->d(J)F

    move-result v10

    iget v11, v5, Ld1/e;->a:F

    cmpg-float v10, v11, v10

    if-nez v10, :cond_2

    invoke-static {v6, v7}, Ld1/c;->e(J)F

    move-result v10

    iget v11, v5, Ld1/e;->b:F

    cmpg-float v10, v11, v10

    if-nez v10, :cond_2

    invoke-static {v6, v7}, Ld1/c;->d(J)F

    move-result v10

    invoke-static {v8, v9}, Ld1/f;->d(J)F

    move-result v11

    add-float/2addr v11, v10

    iget v10, v5, Ld1/e;->c:F

    cmpg-float v10, v10, v11

    if-nez v10, :cond_2

    invoke-static {v6, v7}, Ld1/c;->e(J)F

    move-result v6

    invoke-static {v8, v9}, Ld1/f;->b(J)F

    move-result v7

    add-float/2addr v7, v6

    iget v6, v5, Ld1/e;->d:F

    cmpg-float v6, v6, v7

    if-nez v6, :cond_2

    iget-wide v5, v5, Ld1/e;->e:J

    invoke-static {v5, v6}, Ld1/a;->b(J)F

    move-result v5

    cmpg-float v2, v5, v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    :goto_0
    iget-wide v5, v0, Lu1/j2;->m:J

    invoke-static {v5, v6}, Ld1/c;->d(J)F

    move-result v8

    iget-wide v5, v0, Lu1/j2;->m:J

    invoke-static {v5, v6}, Ld1/c;->e(J)F

    move-result v9

    iget-wide v5, v0, Lu1/j2;->m:J

    invoke-static {v5, v6}, Ld1/c;->d(J)F

    move-result v2

    iget-wide v5, v0, Lu1/j2;->n:J

    invoke-static {v5, v6}, Ld1/f;->d(J)F

    move-result v5

    add-float v10, v5, v2

    iget-wide v5, v0, Lu1/j2;->m:J

    invoke-static {v5, v6}, Ld1/c;->e(J)F

    move-result v2

    iget-wide v5, v0, Lu1/j2;->n:J

    invoke-static {v5, v6}, Ld1/f;->b(J)F

    move-result v5

    add-float v11, v5, v2

    iget v2, v0, Lu1/j2;->l:F

    invoke-static {v2, v2}, Lf6/a;->d(FF)J

    move-result-wide v5

    invoke-static {v5, v6}, Ld1/a;->b(J)F

    move-result v2

    invoke-static {v5, v6}, Ld1/a;->c(J)F

    move-result v5

    invoke-static {v2, v5}, Lf6/a;->d(FF)J

    move-result-wide v18

    new-instance v2, Ld1/e;

    move-object v7, v2

    move-wide/from16 v12, v18

    move-wide/from16 v14, v18

    move-wide/from16 v16, v18

    invoke-direct/range {v7 .. v19}, Ld1/e;-><init>(FFFFJJJJ)V

    if-nez v4, :cond_3

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v5, v4

    check-cast v5, Le1/i;

    iget-object v5, v5, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    :goto_1
    move-object v5, v4

    check-cast v5, Le1/i;

    invoke-virtual {v5, v2}, Le1/i;->a(Ld1/e;)V

    iput-object v2, v0, Lu1/j2;->k:Ld1/e;

    iput-object v4, v0, Lu1/j2;->j:Le1/d0;

    :goto_2
    invoke-interface {v1, v4, v3}, Le1/p;->t(Le1/d0;I)V

    goto :goto_3

    :cond_4
    iget-wide v2, v0, Lu1/j2;->m:J

    invoke-static {v2, v3}, Ld1/c;->d(J)F

    move-result v2

    iget-wide v3, v0, Lu1/j2;->m:J

    invoke-static {v3, v4}, Ld1/c;->e(J)F

    move-result v3

    iget-wide v4, v0, Lu1/j2;->m:J

    invoke-static {v4, v5}, Ld1/c;->d(J)F

    move-result v4

    iget-wide v5, v0, Lu1/j2;->n:J

    invoke-static {v5, v6}, Ld1/f;->d(J)F

    move-result v5

    add-float/2addr v4, v5

    iget-wide v5, v0, Lu1/j2;->m:J

    invoke-static {v5, v6}, Ld1/c;->e(J)F

    move-result v5

    iget-wide v6, v0, Lu1/j2;->n:J

    invoke-static {v6, v7}, Ld1/f;->b(J)F

    move-result v6

    add-float/2addr v5, v6

    const/4 v6, 0x1

    move-object/from16 v1, p1

    invoke-interface/range {v1 .. v6}, Le1/p;->d(FFFFI)V

    :goto_3
    return-void
.end method

.method public final b()Landroid/graphics/Outline;
    .locals 1

    invoke-virtual {p0}, Lu1/j2;->e()V

    iget-boolean v0, p0, Lu1/j2;->o:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu1/j2;->b:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/j2;->c:Landroid/graphics/Outline;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final c(J)Z
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lu1/j2;->o:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v1, v0, Lu1/j2;->q:Le1/g0;

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-static/range {p1 .. p2}, Ld1/c;->d(J)F

    move-result v3

    invoke-static/range {p1 .. p2}, Ld1/c;->e(J)F

    move-result v4

    instance-of v5, v1, Le1/b0;

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    check-cast v1, Le1/b0;

    iget-object v1, v1, Le1/b0;->e:Ld1/d;

    iget v5, v1, Ld1/d;->a:F

    cmpg-float v5, v5, v3

    if-gtz v5, :cond_f

    iget v5, v1, Ld1/d;->c:F

    cmpg-float v3, v3, v5

    if-gez v3, :cond_f

    iget v3, v1, Ld1/d;->b:F

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_f

    iget v1, v1, Ld1/d;->d:F

    cmpg-float v1, v4, v1

    if-gez v1, :cond_f

    goto/16 :goto_2

    :cond_2
    instance-of v5, v1, Le1/c0;

    if-eqz v5, :cond_10

    check-cast v1, Le1/c0;

    iget-object v1, v1, Le1/c0;->e:Ld1/e;

    iget v5, v1, Ld1/e;->a:F

    cmpg-float v5, v3, v5

    if-ltz v5, :cond_f

    iget v5, v1, Ld1/e;->c:F

    cmpl-float v7, v3, v5

    if-gez v7, :cond_f

    iget v7, v1, Ld1/e;->b:F

    cmpg-float v8, v4, v7

    if-ltz v8, :cond_f

    iget v8, v1, Ld1/e;->d:F

    cmpl-float v9, v4, v8

    if-ltz v9, :cond_3

    goto/16 :goto_1

    :cond_3
    iget-wide v9, v1, Ld1/e;->e:J

    invoke-static {v9, v10}, Ld1/a;->b(J)F

    move-result v6

    iget-wide v11, v1, Ld1/e;->f:J

    invoke-static {v11, v12}, Ld1/a;->b(J)F

    move-result v13

    add-float/2addr v13, v6

    invoke-virtual {v1}, Ld1/e;->b()F

    move-result v6

    cmpg-float v6, v13, v6

    if-gtz v6, :cond_8

    iget-wide v13, v1, Ld1/e;->h:J

    invoke-static {v13, v14}, Ld1/a;->b(J)F

    move-result v6

    move v15, v3

    iget-wide v2, v1, Ld1/e;->g:J

    invoke-static {v2, v3}, Ld1/a;->b(J)F

    move-result v16

    add-float v16, v16, v6

    invoke-virtual {v1}, Ld1/e;->b()F

    move-result v6

    cmpg-float v6, v16, v6

    if-gtz v6, :cond_9

    invoke-static {v9, v10}, Ld1/a;->c(J)F

    move-result v6

    invoke-static {v13, v14}, Ld1/a;->c(J)F

    move-result v16

    add-float v16, v16, v6

    invoke-virtual {v1}, Ld1/e;->a()F

    move-result v6

    cmpg-float v6, v16, v6

    if-gtz v6, :cond_9

    invoke-static {v11, v12}, Ld1/a;->c(J)F

    move-result v6

    invoke-static {v2, v3}, Ld1/a;->c(J)F

    move-result v16

    add-float v16, v16, v6

    invoke-virtual {v1}, Ld1/e;->a()F

    move-result v6

    cmpg-float v6, v16, v6

    if-gtz v6, :cond_9

    invoke-static {v9, v10}, Ld1/a;->b(J)F

    move-result v6

    iget v0, v1, Ld1/e;->a:F

    add-float/2addr v6, v0

    invoke-static {v9, v10}, Ld1/a;->c(J)F

    move-result v9

    add-float/2addr v9, v7

    invoke-static {v11, v12}, Ld1/a;->b(J)F

    move-result v10

    sub-float v10, v5, v10

    invoke-static {v11, v12}, Ld1/a;->c(J)F

    move-result v11

    add-float/2addr v7, v11

    invoke-static {v2, v3}, Ld1/a;->b(J)F

    move-result v11

    sub-float/2addr v5, v11

    invoke-static {v2, v3}, Ld1/a;->c(J)F

    move-result v2

    sub-float v2, v8, v2

    invoke-static {v13, v14}, Ld1/a;->c(J)F

    move-result v3

    sub-float/2addr v8, v3

    invoke-static {v13, v14}, Ld1/a;->b(J)F

    move-result v3

    add-float/2addr v0, v3

    cmpg-float v3, v15, v6

    if-gez v3, :cond_4

    cmpg-float v3, v4, v9

    if-gez v3, :cond_4

    iget-wide v7, v1, Ld1/e;->e:J

    move v3, v15

    move v5, v6

    move v6, v9

    invoke-static/range {v3 .. v8}, Li1/b;->u(FFFFJ)Z

    move-result v2

    goto :goto_0

    :cond_4
    cmpg-float v3, v15, v0

    if-gez v3, :cond_5

    cmpl-float v3, v4, v8

    if-lez v3, :cond_5

    iget-wide v1, v1, Ld1/e;->h:J

    move v3, v15

    move v5, v0

    move v6, v8

    move-wide v7, v1

    invoke-static/range {v3 .. v8}, Li1/b;->u(FFFFJ)Z

    move-result v2

    goto :goto_0

    :cond_5
    cmpl-float v0, v15, v10

    if-lez v0, :cond_6

    cmpg-float v0, v4, v7

    if-gez v0, :cond_6

    iget-wide v0, v1, Ld1/e;->f:J

    move v3, v15

    move v5, v10

    move v6, v7

    move-wide v7, v0

    invoke-static/range {v3 .. v8}, Li1/b;->u(FFFFJ)Z

    move-result v2

    goto :goto_0

    :cond_6
    cmpl-float v0, v15, v5

    if-lez v0, :cond_7

    cmpl-float v0, v4, v2

    if-lez v0, :cond_7

    iget-wide v7, v1, Ld1/e;->g:J

    move v3, v15

    move v6, v2

    invoke-static/range {v3 .. v8}, Li1/b;->u(FFFFJ)Z

    move-result v2

    goto :goto_0

    :cond_7
    const/4 v2, 0x1

    :goto_0
    move v6, v2

    goto/16 :goto_1

    :cond_8
    move v15, v3

    :cond_9
    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v0

    invoke-virtual {v0, v1}, Le1/i;->a(Ld1/e;)V

    const v1, 0x3ba3d70a    # 0.005f

    sub-float v3, v15, v1

    sub-float v2, v4, v1

    add-float v5, v15, v1

    add-float/2addr v4, v1

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    const/4 v7, 0x1

    xor-int/2addr v6, v7

    if-eqz v6, :cond_e

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    xor-int/2addr v6, v7

    if-eqz v6, :cond_d

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    xor-int/2addr v6, v7

    if-eqz v6, :cond_c

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    xor-int/2addr v6, v7

    if-eqz v6, :cond_b

    iget-object v6, v1, Le1/i;->b:Landroid/graphics/RectF;

    if-nez v6, :cond_a

    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    iput-object v6, v1, Le1/i;->b:Landroid/graphics/RectF;

    :cond_a
    iget-object v6, v1, Le1/i;->b:Landroid/graphics/RectF;

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v6, v3, v2, v5, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v1, Le1/i;->b:Landroid/graphics/RectF;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    sget-object v3, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    iget-object v4, v1, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3}, Le1/i;->b(Le1/d0;Le1/d0;I)Z

    iget-object v0, v2, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    xor-int/lit8 v6, v1, 0x1

    goto :goto_1

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Rect.bottom is NaN"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Rect.right is NaN"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Rect.top is NaN"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Rect.left is NaN"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    :goto_1
    move v2, v6

    :goto_2
    return v2

    :cond_10
    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final d(Le1/l0;FZFLm2/l;Lm2/b;)Z
    .locals 1

    iget-object v0, p0, Lu1/j2;->c:Landroid/graphics/Outline;

    invoke-virtual {v0, p2}, Landroid/graphics/Outline;->setAlpha(F)V

    iget-object p2, p0, Lu1/j2;->e:Le1/l0;

    invoke-static {p2, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x1

    xor-int/2addr p2, v0

    if-eqz p2, :cond_0

    iput-object p1, p0, Lu1/j2;->e:Le1/l0;

    iput-boolean v0, p0, Lu1/j2;->h:Z

    :cond_0
    if-nez p3, :cond_2

    const/4 p1, 0x0

    cmpl-float p1, p4, p1

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move p1, v0

    :goto_1
    iget-boolean p3, p0, Lu1/j2;->o:Z

    if-eq p3, p1, :cond_3

    iput-boolean p1, p0, Lu1/j2;->o:Z

    iput-boolean v0, p0, Lu1/j2;->h:Z

    :cond_3
    iget-object p1, p0, Lu1/j2;->p:Lm2/l;

    if-eq p1, p5, :cond_4

    iput-object p5, p0, Lu1/j2;->p:Lm2/l;

    iput-boolean v0, p0, Lu1/j2;->h:Z

    :cond_4
    iget-object p1, p0, Lu1/j2;->a:Lm2/b;

    invoke-static {p1, p6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    iput-object p6, p0, Lu1/j2;->a:Lm2/b;

    iput-boolean v0, p0, Lu1/j2;->h:Z

    :cond_5
    return p2
.end method

.method public final e()V
    .locals 14

    iget-boolean v0, p0, Lu1/j2;->h:Z

    if-eqz v0, :cond_6

    sget-wide v0, Ld1/c;->b:J

    iput-wide v0, p0, Lu1/j2;->m:J

    iget-wide v0, p0, Lu1/j2;->d:J

    iput-wide v0, p0, Lu1/j2;->n:J

    const/4 v2, 0x0

    iput v2, p0, Lu1/j2;->l:F

    const/4 v3, 0x0

    iput-object v3, p0, Lu1/j2;->g:Le1/d0;

    const/4 v3, 0x0

    iput-boolean v3, p0, Lu1/j2;->h:Z

    iput-boolean v3, p0, Lu1/j2;->i:Z

    iget-boolean v4, p0, Lu1/j2;->o:Z

    iget-object v5, p0, Lu1/j2;->c:Landroid/graphics/Outline;

    if-eqz v4, :cond_5

    invoke-static {v0, v1}, Ld1/f;->d(J)F

    move-result v0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    iget-wide v0, p0, Lu1/j2;->d:J

    invoke-static {v0, v1}, Ld1/f;->b(J)F

    move-result v0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/j2;->b:Z

    iget-object v1, p0, Lu1/j2;->e:Le1/l0;

    iget-wide v6, p0, Lu1/j2;->d:J

    iget-object v2, p0, Lu1/j2;->p:Lm2/l;

    iget-object v4, p0, Lu1/j2;->a:Lm2/b;

    invoke-interface {v1, v6, v7, v2, v4}, Le1/l0;->d(JLm2/l;Lm2/b;)Le1/g0;

    move-result-object v1

    iput-object v1, p0, Lu1/j2;->q:Le1/g0;

    instance-of v2, v1, Le1/b0;

    if-eqz v2, :cond_0

    check-cast v1, Le1/b0;

    iget-object v0, v1, Le1/b0;->e:Ld1/d;

    iget v1, v0, Ld1/d;->a:F

    iget v2, v0, Ld1/d;->b:F

    invoke-static {v1, v2}, Ld9/i;->f(FF)J

    move-result-wide v3

    iput-wide v3, p0, Lu1/j2;->m:J

    invoke-virtual {v0}, Ld1/d;->c()F

    move-result v1

    invoke-virtual {v0}, Ld1/d;->b()F

    move-result v3

    invoke-static {v1, v3}, Ld7/t;->j(FF)J

    move-result-wide v3

    iput-wide v3, p0, Lu1/j2;->n:J

    iget v1, v0, Ld1/d;->a:F

    invoke-static {v1}, Ld7/t;->p0(F)I

    move-result v1

    invoke-static {v2}, Ld7/t;->p0(F)I

    move-result v2

    iget v3, v0, Ld1/d;->c:F

    invoke-static {v3}, Ld7/t;->p0(F)I

    move-result v3

    iget v0, v0, Ld1/d;->d:F

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    invoke-virtual {v5, v1, v2, v3, v0}, Landroid/graphics/Outline;->setRect(IIII)V

    goto/16 :goto_2

    :cond_0
    instance-of v2, v1, Le1/c0;

    if-eqz v2, :cond_6

    check-cast v1, Le1/c0;

    iget-object v1, v1, Le1/c0;->e:Ld1/e;

    iget-wide v6, v1, Ld1/e;->e:J

    invoke-static {v6, v7}, Ld1/a;->b(J)F

    move-result v2

    iget v4, v1, Ld1/e;->a:F

    iget v6, v1, Ld1/e;->b:F

    invoke-static {v4, v6}, Ld9/i;->f(FF)J

    move-result-wide v7

    iput-wide v7, p0, Lu1/j2;->m:J

    invoke-virtual {v1}, Ld1/e;->b()F

    move-result v7

    invoke-virtual {v1}, Ld1/e;->a()F

    move-result v8

    invoke-static {v7, v8}, Ld7/t;->j(FF)J

    move-result-wide v7

    iput-wide v7, p0, Lu1/j2;->n:J

    invoke-static {v1}, Lf6/a;->Z(Ld1/e;)Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v8, p0, Lu1/j2;->c:Landroid/graphics/Outline;

    invoke-static {v4}, Ld7/t;->p0(F)I

    move-result v9

    invoke-static {v6}, Ld7/t;->p0(F)I

    move-result v10

    iget v0, v1, Ld1/e;->c:F

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v11

    iget v0, v1, Ld1/e;->d:F

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v12

    move v13, v2

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    iput v2, p0, Lu1/j2;->l:F

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lu1/j2;->f:Le1/i;

    if-nez v2, :cond_2

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v2

    iput-object v2, p0, Lu1/j2;->f:Le1/i;

    :cond_2
    iget-object v4, v2, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v2, v1}, Le1/i;->a(Ld1/e;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-gt v1, v6, :cond_4

    invoke-virtual {v4}, Landroid/graphics/Path;->isConvex()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    iput-boolean v3, p0, Lu1/j2;->b:Z

    invoke-virtual {v5}, Landroid/graphics/Outline;->setEmpty()V

    iput-boolean v0, p0, Lu1/j2;->i:Z

    goto :goto_1

    :cond_4
    :goto_0
    invoke-virtual {v5, v4}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    invoke-virtual {v5}, Landroid/graphics/Outline;->canClip()Z

    move-result v1

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lu1/j2;->i:Z

    :goto_1
    iput-object v2, p0, Lu1/j2;->g:Le1/d0;

    goto :goto_2

    :cond_5
    invoke-virtual {v5}, Landroid/graphics/Outline;->setEmpty()V

    :cond_6
    :goto_2
    return-void
.end method
