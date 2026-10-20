.class public final Lu/j;
.super Ljava/lang/Object;

# interfaces
.implements Lu/b2;


# instance fields
.field public final a:Lu/z1;

.field public b:Ld1/c;

.field public final c:Landroid/widget/EdgeEffect;

.field public final d:Landroid/widget/EdgeEffect;

.field public final e:Landroid/widget/EdgeEffect;

.field public final f:Landroid/widget/EdgeEffect;

.field public final g:Ljava/util/List;

.field public final h:Landroid/widget/EdgeEffect;

.field public final i:Landroid/widget/EdgeEffect;

.field public final j:Landroid/widget/EdgeEffect;

.field public final k:Landroid/widget/EdgeEffect;

.field public l:I

.field public final m:Lm0/l1;

.field public final n:Z

.field public o:Z

.field public p:J

.field public q:Lo1/t;

.field public final r:Ly0/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu/z1;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu/j;->a:Lu/z1;

    invoke-static {p1}, Lf6/a;->C(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    move-result-object p2

    iput-object p2, p0, Lu/j;->c:Landroid/widget/EdgeEffect;

    invoke-static {p1}, Lf6/a;->C(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Lu/j;->d:Landroid/widget/EdgeEffect;

    invoke-static {p1}, Lf6/a;->C(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    move-result-object v1

    iput-object v1, p0, Lu/j;->e:Landroid/widget/EdgeEffect;

    invoke-static {p1}, Lf6/a;->C(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    move-result-object v2

    iput-object v2, p0, Lu/j;->f:Landroid/widget/EdgeEffect;

    const/4 v3, 0x4

    new-array v3, v3, [Landroid/widget/EdgeEffect;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object p2, v3, v1

    const/4 p2, 0x2

    aput-object v2, v3, p2

    const/4 p2, 0x3

    aput-object v0, v3, p2

    invoke-static {v3}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lu/j;->g:Ljava/util/List;

    invoke-static {p1}, Lf6/a;->C(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Lu/j;->h:Landroid/widget/EdgeEffect;

    invoke-static {p1}, Lf6/a;->C(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Lu/j;->i:Landroid/widget/EdgeEffect;

    invoke-static {p1}, Lf6/a;->C(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Lu/j;->j:Landroid/widget/EdgeEffect;

    invoke-static {p1}, Lf6/a;->C(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    move-result-object p1

    iput-object p1, p0, Lu/j;->k:Landroid/widget/EdgeEffect;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    move v0, v4

    :goto_0
    if-ge v0, p1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/EdgeEffect;

    iget-object v3, p0, Lu/j;->a:Lu/z1;

    iget-wide v5, v3, Lu/z1;->a:J

    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/EdgeEffect;->setColor(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    iput p1, p0, Lu/j;->l:I

    invoke-static {v4}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p1

    iput-object p1, p0, Lu/j;->m:Lm0/l1;

    iput-boolean v1, p0, Lu/j;->n:Z

    sget-wide p1, Ld1/f;->b:J

    iput-wide p1, p0, Lu/j;->p:J

    new-instance p1, Lu/i;

    invoke-direct {p1, p0}, Lu/i;-><init>(Lu/j;)V

    sget-object p2, Lu/m;->a:Ly0/o;

    sget-object v0, Lq8/l;->a:Lq8/l;

    new-instance v1, Lu/h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lu/h;-><init>(Lu/j;Lu8/e;)V

    invoke-static {p2, v0, v1}, Lo1/c0;->a(Ly0/o;Ljava/lang/Object;Lc9/e;)Ly0/o;

    move-result-object p2

    new-instance v0, Lr1/t0;

    invoke-direct {v0, p1}, Lr1/t0;-><init>(Lc9/c;)V

    invoke-interface {p2, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p1

    new-instance p2, Lu/l0;

    invoke-direct {p2, p0}, Lu/l0;-><init>(Lu/j;)V

    invoke-interface {p1, p2}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p1

    iput-object p1, p0, Lu/j;->r:Ly0/o;

    return-void
.end method


# virtual methods
.method public final a(JILu/q2;)J
    .locals 22

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p4

    iget-wide v4, v0, Lu/j;->p:J

    invoke-static {v4, v5}, Ld1/f;->e(J)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, Ld1/c;

    invoke-direct {v4, v1, v2}, Ld1/c;-><init>(J)V

    invoke-virtual {v3, v4}, Lu/q2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld1/c;

    iget-wide v1, v1, Ld1/c;->a:J

    return-wide v1

    :cond_0
    iget-boolean v4, v0, Lu/j;->o:Z

    sget-object v5, Lu/n;->a:Lu/n;

    iget-object v7, v0, Lu/j;->d:Landroid/widget/EdgeEffect;

    iget-object v8, v0, Lu/j;->c:Landroid/widget/EdgeEffect;

    iget-object v9, v0, Lu/j;->f:Landroid/widget/EdgeEffect;

    iget-object v10, v0, Lu/j;->e:Landroid/widget/EdgeEffect;

    const/16 v11, 0x1f

    const/4 v12, 0x0

    if-nez v4, :cond_9

    iget-wide v13, v0, Lu/j;->p:J

    invoke-static {v13, v14}, Ld7/t;->V(J)J

    move-result-wide v13

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v11, :cond_1

    invoke-virtual {v5, v10}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v15

    goto :goto_0

    :cond_1
    move v15, v12

    :goto_0
    cmpg-float v15, v15, v12

    if-nez v15, :cond_2

    move-object/from16 v16, v7

    goto :goto_1

    :cond_2
    move-object/from16 v16, v7

    sget-wide v6, Ld1/c;->b:J

    invoke-virtual {v0, v6, v7, v13, v14}, Lu/j;->k(JJ)F

    :goto_1
    if-lt v4, v11, :cond_3

    invoke-virtual {v5, v9}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v6

    goto :goto_2

    :cond_3
    move v6, v12

    :goto_2
    cmpg-float v6, v6, v12

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    sget-wide v6, Ld1/c;->b:J

    invoke-virtual {v0, v6, v7, v13, v14}, Lu/j;->l(JJ)F

    :goto_3
    if-lt v4, v11, :cond_5

    invoke-virtual {v5, v8}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v6

    goto :goto_4

    :cond_5
    move v6, v12

    :goto_4
    cmpg-float v6, v6, v12

    if-nez v6, :cond_6

    goto :goto_5

    :cond_6
    sget-wide v6, Ld1/c;->b:J

    invoke-virtual {v0, v6, v7, v13, v14}, Lu/j;->m(JJ)F

    :goto_5
    if-lt v4, v11, :cond_7

    move-object/from16 v4, v16

    invoke-virtual {v5, v4}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v6

    goto :goto_6

    :cond_7
    move-object/from16 v4, v16

    move v6, v12

    :goto_6
    cmpg-float v6, v6, v12

    if-nez v6, :cond_8

    :goto_7
    const/4 v6, 0x1

    goto :goto_8

    :cond_8
    sget-wide v6, Ld1/c;->b:J

    invoke-virtual {v0, v6, v7, v13, v14}, Lu/j;->j(JJ)F

    goto :goto_7

    :goto_8
    iput-boolean v6, v0, Lu/j;->o:Z

    goto :goto_9

    :cond_9
    move-object v4, v7

    :goto_9
    iget-object v6, v0, Lu/j;->b:Ld1/c;

    if-eqz v6, :cond_a

    iget-wide v6, v6, Ld1/c;->a:J

    goto :goto_a

    :cond_a
    iget-wide v6, v0, Lu/j;->p:J

    invoke-static {v6, v7}, Ld7/t;->V(J)J

    move-result-wide v6

    :goto_a
    invoke-static/range {p1 .. p2}, Ld1/c;->e(J)F

    move-result v13

    cmpg-float v13, v13, v12

    if-nez v13, :cond_b

    :goto_b
    move v14, v12

    goto :goto_10

    :cond_b
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v13, v11, :cond_c

    invoke-virtual {v5, v8}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v14

    goto :goto_c

    :cond_c
    move v14, v12

    :goto_c
    cmpg-float v14, v14, v12

    if-nez v14, :cond_10

    if-lt v13, v11, :cond_d

    invoke-virtual {v5, v4}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v14

    goto :goto_d

    :cond_d
    move v14, v12

    :goto_d
    cmpg-float v14, v14, v12

    if-nez v14, :cond_e

    goto :goto_b

    :cond_e
    invoke-virtual {v0, v1, v2, v6, v7}, Lu/j;->j(JJ)F

    move-result v14

    if-lt v13, v11, :cond_f

    invoke-virtual {v5, v4}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v13

    goto :goto_e

    :cond_f
    move v13, v12

    :goto_e
    cmpg-float v13, v13, v12

    if-nez v13, :cond_12

    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_10

    :cond_10
    invoke-virtual {v0, v1, v2, v6, v7}, Lu/j;->m(JJ)F

    move-result v14

    if-lt v13, v11, :cond_11

    invoke-virtual {v5, v8}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v13

    goto :goto_f

    :cond_11
    move v13, v12

    :goto_f
    cmpg-float v13, v13, v12

    if-nez v13, :cond_12

    invoke-virtual {v8}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_12
    :goto_10
    invoke-static/range {p1 .. p2}, Ld1/c;->d(J)F

    move-result v13

    cmpg-float v13, v13, v12

    if-nez v13, :cond_13

    :goto_11
    move v5, v12

    goto :goto_17

    :cond_13
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v13, v11, :cond_14

    invoke-virtual {v5, v10}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v16

    goto :goto_12

    :cond_14
    move/from16 v16, v12

    :goto_12
    cmpg-float v16, v16, v12

    if-nez v16, :cond_19

    if-lt v13, v11, :cond_15

    invoke-virtual {v5, v9}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v16

    goto :goto_13

    :cond_15
    move/from16 v16, v12

    :goto_13
    cmpg-float v16, v16, v12

    if-nez v16, :cond_16

    goto :goto_11

    :cond_16
    invoke-virtual {v0, v1, v2, v6, v7}, Lu/j;->l(JJ)F

    move-result v16

    if-lt v13, v11, :cond_17

    invoke-virtual {v5, v9}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v5

    goto :goto_14

    :cond_17
    move v5, v12

    :goto_14
    cmpg-float v5, v5, v12

    if-nez v5, :cond_18

    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_18
    :goto_15
    move/from16 v5, v16

    goto :goto_17

    :cond_19
    invoke-virtual {v0, v1, v2, v6, v7}, Lu/j;->k(JJ)F

    move-result v16

    if-lt v13, v11, :cond_1a

    invoke-virtual {v5, v10}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v5

    goto :goto_16

    :cond_1a
    move v5, v12

    :goto_16
    cmpg-float v5, v5, v12

    if-nez v5, :cond_18

    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_15

    :goto_17
    invoke-static {v5, v14}, Ld9/i;->f(FF)J

    move-result-wide v13

    move-object/from16 v16, v4

    sget-wide v4, Ld1/c;->b:J

    invoke-static {v13, v14, v4, v5}, Ld1/c;->b(JJ)Z

    move-result v4

    if-nez v4, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lu/j;->i()V

    :cond_1b
    invoke-static {v1, v2, v13, v14}, Ld1/c;->f(JJ)J

    move-result-wide v4

    new-instance v11, Ld1/c;

    invoke-direct {v11, v4, v5}, Ld1/c;-><init>(J)V

    invoke-virtual {v3, v11}, Lu/q2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld1/c;

    move-wide/from16 v17, v13

    iget-wide v12, v3, Ld1/c;->a:J

    invoke-static {v4, v5, v12, v13}, Ld1/c;->f(JJ)J

    move-result-wide v3

    const/4 v5, 0x0

    move/from16 v15, p3

    const/4 v14, 0x1

    if-ne v15, v14, :cond_1c

    move v15, v14

    goto :goto_18

    :cond_1c
    move v15, v5

    :goto_18
    if-eqz v15, :cond_22

    invoke-static {v3, v4}, Ld1/c;->d(J)F

    move-result v15

    const/high16 v19, 0x3f000000    # 0.5f

    cmpl-float v15, v15, v19

    const/high16 v20, -0x41000000    # -0.5f

    if-lez v15, :cond_1d

    invoke-virtual {v0, v3, v4, v6, v7}, Lu/j;->k(JJ)F

    :goto_19
    move v15, v14

    goto :goto_1a

    :cond_1d
    invoke-static {v3, v4}, Ld1/c;->d(J)F

    move-result v15

    cmpg-float v15, v15, v20

    if-gez v15, :cond_1e

    invoke-virtual {v0, v3, v4, v6, v7}, Lu/j;->l(JJ)F

    goto :goto_19

    :cond_1e
    move v15, v5

    :goto_1a
    invoke-static {v3, v4}, Ld1/c;->e(J)F

    move-result v21

    cmpl-float v19, v21, v19

    if-lez v19, :cond_1f

    invoke-virtual {v0, v3, v4, v6, v7}, Lu/j;->m(JJ)F

    :goto_1b
    move v6, v14

    goto :goto_1c

    :cond_1f
    invoke-static {v3, v4}, Ld1/c;->e(J)F

    move-result v19

    cmpg-float v19, v19, v20

    if-gez v19, :cond_20

    invoke-virtual {v0, v3, v4, v6, v7}, Lu/j;->j(JJ)F

    goto :goto_1b

    :cond_20
    move v6, v5

    :goto_1c
    if-nez v15, :cond_21

    if-eqz v6, :cond_22

    :cond_21
    move v6, v14

    goto :goto_1d

    :cond_22
    move v6, v5

    :goto_1d
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_25

    invoke-static/range {p1 .. p2}, Ld1/c;->d(J)F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-gez v3, :cond_25

    invoke-static/range {p1 .. p2}, Ld1/c;->d(J)F

    move-result v3

    instance-of v4, v10, Lu/y0;

    if-eqz v4, :cond_23

    move-object v4, v10

    check-cast v4, Lu/y0;

    iget v7, v4, Lu/y0;->b:F

    add-float/2addr v7, v3

    iput v7, v4, Lu/y0;->b:F

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v7, v4, Lu/y0;->a:F

    cmpl-float v3, v3, v7

    if-lez v3, :cond_24

    invoke-virtual {v4}, Lu/y0;->onRelease()V

    goto :goto_1e

    :cond_23
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_24
    :goto_1e
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    goto :goto_1f

    :cond_25
    move v3, v5

    :goto_1f
    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-nez v4, :cond_2a

    invoke-static/range {p1 .. p2}, Ld1/c;->d(J)F

    move-result v4

    const/4 v7, 0x0

    cmpl-float v4, v4, v7

    if-lez v4, :cond_2a

    invoke-static/range {p1 .. p2}, Ld1/c;->d(J)F

    move-result v4

    instance-of v7, v9, Lu/y0;

    if-eqz v7, :cond_26

    move-object v7, v9

    check-cast v7, Lu/y0;

    iget v10, v7, Lu/y0;->b:F

    add-float/2addr v10, v4

    iput v10, v7, Lu/y0;->b:F

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v10, v7, Lu/y0;->a:F

    cmpl-float v4, v4, v10

    if-lez v4, :cond_27

    invoke-virtual {v7}, Lu/y0;->onRelease()V

    goto :goto_20

    :cond_26
    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_27
    :goto_20
    if-nez v3, :cond_29

    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-eqz v3, :cond_28

    goto :goto_21

    :cond_28
    move v3, v5

    goto :goto_22

    :cond_29
    :goto_21
    move v3, v14

    :cond_2a
    :goto_22
    invoke-virtual {v8}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-nez v4, :cond_2f

    invoke-static/range {p1 .. p2}, Ld1/c;->e(J)F

    move-result v4

    const/4 v7, 0x0

    cmpg-float v4, v4, v7

    if-gez v4, :cond_2f

    invoke-static/range {p1 .. p2}, Ld1/c;->e(J)F

    move-result v4

    instance-of v7, v8, Lu/y0;

    if-eqz v7, :cond_2b

    move-object v7, v8

    check-cast v7, Lu/y0;

    iget v9, v7, Lu/y0;->b:F

    add-float/2addr v9, v4

    iput v9, v7, Lu/y0;->b:F

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v9, v7, Lu/y0;->a:F

    cmpl-float v4, v4, v9

    if-lez v4, :cond_2c

    invoke-virtual {v7}, Lu/y0;->onRelease()V

    goto :goto_23

    :cond_2b
    invoke-virtual {v8}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_2c
    :goto_23
    if-nez v3, :cond_2e

    invoke-virtual {v8}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-eqz v3, :cond_2d

    goto :goto_24

    :cond_2d
    move v14, v5

    :cond_2e
    :goto_24
    move v3, v14

    :cond_2f
    invoke-virtual/range {v16 .. v16}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-nez v4, :cond_32

    invoke-static/range {p1 .. p2}, Ld1/c;->e(J)F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-lez v4, :cond_32

    invoke-static/range {p1 .. p2}, Ld1/c;->e(J)F

    move-result v1

    move-object/from16 v2, v16

    instance-of v4, v2, Lu/y0;

    if-eqz v4, :cond_30

    move-object v7, v2

    check-cast v7, Lu/y0;

    iget v4, v7, Lu/y0;->b:F

    add-float/2addr v4, v1

    iput v4, v7, Lu/y0;->b:F

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v4, v7, Lu/y0;->a:F

    cmpl-float v1, v1, v4

    if-lez v1, :cond_31

    invoke-virtual {v7}, Lu/y0;->onRelease()V

    goto :goto_25

    :cond_30
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_31
    :goto_25
    if-nez v3, :cond_35

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_33

    goto :goto_27

    :cond_32
    if-nez v3, :cond_35

    :cond_33
    if-eqz v6, :cond_34

    goto :goto_27

    :cond_34
    :goto_26
    move-wide/from16 v1, v17

    goto :goto_28

    :cond_35
    :goto_27
    invoke-virtual/range {p0 .. p0}, Lu/j;->i()V

    goto :goto_26

    :goto_28
    invoke-static {v1, v2, v12, v13}, Ld1/c;->g(JJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public final b()Z
    .locals 8

    iget-object v0, p0, Lu/j;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/widget/EdgeEffect;

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1f

    const/4 v7, 0x0

    if-lt v5, v6, :cond_0

    sget-object v5, Lu/n;->a:Lu/n;

    invoke-virtual {v5, v4}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v4

    goto :goto_1

    :cond_0
    move v4, v7

    :goto_1
    cmpg-float v4, v4, v7

    const/4 v5, 0x1

    if-nez v4, :cond_1

    move v4, v5

    goto :goto_2

    :cond_1
    move v4, v2

    :goto_2
    xor-int/2addr v4, v5

    if-eqz v4, :cond_2

    move v2, v5

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_3
    return v2
.end method

.method public final c()Ly0/o;
    .locals 1

    iget-object v0, p0, Lu/j;->r:Ly0/o;

    return-object v0
.end method

.method public final d(JLv/k2;Lu8/e;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    instance-of v5, v4, Lu/f;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lu/f;

    iget v6, v5, Lu/f;->e:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lu/f;->e:I

    goto :goto_0

    :cond_0
    new-instance v5, Lu/f;

    invoke-direct {v5, v0, v4}, Lu/f;-><init>(Lu/j;Lu8/e;)V

    :goto_0
    iget-object v4, v5, Lu/f;->c:Ljava/lang/Object;

    sget-object v6, Lv8/a;->a:Lv8/a;

    iget v7, v5, Lu/f;->e:I

    sget-object v8, Lq8/l;->a:Lq8/l;

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/16 v11, 0x1f

    const/4 v12, 0x0

    if-eqz v7, :cond_3

    if-eq v7, v10, :cond_2

    if-ne v7, v9, :cond_1

    iget-wide v1, v5, Lu/f;->b:J

    iget-object v3, v5, Lu/f;->a:Lu/j;

    invoke-static {v4}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_11

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v4}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v4}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-wide v13, v0, Lu/j;->p:J

    invoke-static {v13, v14}, Ld1/f;->e(J)Z

    move-result v4

    if-eqz v4, :cond_5

    new-instance v4, Lm2/p;

    invoke-direct {v4, v1, v2}, Lm2/p;-><init>(J)V

    iput v10, v5, Lu/f;->e:I

    invoke-virtual {v3, v4, v5}, Lv/k2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_4

    return-object v6

    :cond_4
    :goto_1
    return-object v8

    :cond_5
    invoke-static/range {p1 .. p2}, Lm2/p;->b(J)F

    move-result v4

    cmpl-float v4, v4, v12

    sget-object v7, Lu/n;->a:Lu/n;

    if-lez v4, :cond_a

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v10, v0, Lu/j;->e:Landroid/widget/EdgeEffect;

    if-lt v4, v11, :cond_6

    invoke-virtual {v7, v10}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v13

    goto :goto_2

    :cond_6
    move v13, v12

    :goto_2
    cmpg-float v13, v13, v12

    if-nez v13, :cond_7

    goto :goto_4

    :cond_7
    invoke-static/range {p1 .. p2}, Lm2/p;->b(J)F

    move-result v13

    invoke-static {v13}, Ld7/t;->p0(F)I

    move-result v13

    if-lt v4, v11, :cond_8

    invoke-virtual {v10, v13}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_3

    :cond_8
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v10, v13}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_9
    :goto_3
    invoke-static/range {p1 .. p2}, Lm2/p;->b(J)F

    move-result v4

    goto :goto_8

    :cond_a
    :goto_4
    invoke-static/range {p1 .. p2}, Lm2/p;->b(J)F

    move-result v4

    cmpg-float v4, v4, v12

    if-gez v4, :cond_f

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v10, v0, Lu/j;->f:Landroid/widget/EdgeEffect;

    if-lt v4, v11, :cond_b

    invoke-virtual {v7, v10}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v13

    goto :goto_5

    :cond_b
    move v13, v12

    :goto_5
    cmpg-float v13, v13, v12

    if-nez v13, :cond_c

    goto :goto_7

    :cond_c
    invoke-static/range {p1 .. p2}, Lm2/p;->b(J)F

    move-result v13

    invoke-static {v13}, Ld7/t;->p0(F)I

    move-result v13

    neg-int v13, v13

    if-lt v4, v11, :cond_d

    invoke-virtual {v10, v13}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_6

    :cond_d
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-virtual {v10, v13}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_e
    :goto_6
    invoke-static/range {p1 .. p2}, Lm2/p;->b(J)F

    move-result v4

    goto :goto_8

    :cond_f
    :goto_7
    move v4, v12

    :goto_8
    invoke-static/range {p1 .. p2}, Lm2/p;->c(J)F

    move-result v10

    cmpl-float v10, v10, v12

    if-lez v10, :cond_14

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v13, v0, Lu/j;->c:Landroid/widget/EdgeEffect;

    if-lt v10, v11, :cond_10

    invoke-virtual {v7, v13}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v14

    goto :goto_9

    :cond_10
    move v14, v12

    :goto_9
    cmpg-float v14, v14, v12

    if-nez v14, :cond_11

    goto :goto_b

    :cond_11
    invoke-static/range {p1 .. p2}, Lm2/p;->c(J)F

    move-result v7

    invoke-static {v7}, Ld7/t;->p0(F)I

    move-result v7

    if-lt v10, v11, :cond_12

    invoke-virtual {v13, v7}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_a

    :cond_12
    invoke-virtual {v13}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-virtual {v13, v7}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_13
    :goto_a
    invoke-static/range {p1 .. p2}, Lm2/p;->c(J)F

    move-result v7

    goto :goto_f

    :cond_14
    :goto_b
    invoke-static/range {p1 .. p2}, Lm2/p;->c(J)F

    move-result v10

    cmpg-float v10, v10, v12

    if-gez v10, :cond_19

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v13, v0, Lu/j;->d:Landroid/widget/EdgeEffect;

    if-lt v10, v11, :cond_15

    invoke-virtual {v7, v13}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result v7

    goto :goto_c

    :cond_15
    move v7, v12

    :goto_c
    cmpg-float v7, v7, v12

    if-nez v7, :cond_16

    goto :goto_e

    :cond_16
    invoke-static/range {p1 .. p2}, Lm2/p;->c(J)F

    move-result v7

    invoke-static {v7}, Ld7/t;->p0(F)I

    move-result v7

    neg-int v7, v7

    if-lt v10, v11, :cond_17

    invoke-virtual {v13, v7}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_d

    :cond_17
    invoke-virtual {v13}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-virtual {v13, v7}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_18
    :goto_d
    invoke-static/range {p1 .. p2}, Lm2/p;->c(J)F

    move-result v7

    goto :goto_f

    :cond_19
    :goto_e
    move v7, v12

    :goto_f
    invoke-static {v4, v7}, Li1/b;->e(FF)J

    move-result-wide v13

    sget-wide v15, Lm2/p;->b:J

    cmp-long v4, v13, v15

    if-nez v4, :cond_1a

    goto :goto_10

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Lu/j;->i()V

    :goto_10
    invoke-static {v1, v2, v13, v14}, Lm2/p;->d(JJ)J

    move-result-wide v1

    new-instance v4, Lm2/p;

    invoke-direct {v4, v1, v2}, Lm2/p;-><init>(J)V

    iput-object v0, v5, Lu/f;->a:Lu/j;

    iput-wide v1, v5, Lu/f;->b:J

    iput v9, v5, Lu/f;->e:I

    invoke-virtual {v3, v4, v5}, Lv/k2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_1b

    return-object v6

    :cond_1b
    move-object v3, v0

    :goto_11
    check-cast v4, Lm2/p;

    iget-wide v4, v4, Lm2/p;->a:J

    invoke-static {v1, v2, v4, v5}, Lm2/p;->d(JJ)J

    move-result-wide v1

    const/4 v4, 0x0

    iput-boolean v4, v3, Lu/j;->o:Z

    invoke-static {v1, v2}, Lm2/p;->b(J)F

    move-result v4

    cmpl-float v4, v4, v12

    if-lez v4, :cond_1d

    invoke-static {v1, v2}, Lm2/p;->b(J)F

    move-result v4

    invoke-static {v4}, Ld7/t;->p0(F)I

    move-result v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v6, v3, Lu/j;->e:Landroid/widget/EdgeEffect;

    if-lt v5, v11, :cond_1c

    invoke-virtual {v6, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_12

    :cond_1c
    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-virtual {v6, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_12

    :cond_1d
    invoke-static {v1, v2}, Lm2/p;->b(J)F

    move-result v4

    cmpg-float v4, v4, v12

    if-gez v4, :cond_1f

    invoke-static {v1, v2}, Lm2/p;->b(J)F

    move-result v4

    invoke-static {v4}, Ld7/t;->p0(F)I

    move-result v4

    neg-int v4, v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v6, v3, Lu/j;->f:Landroid/widget/EdgeEffect;

    if-lt v5, v11, :cond_1e

    invoke-virtual {v6, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-virtual {v6, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_1f
    :goto_12
    invoke-static {v1, v2}, Lm2/p;->c(J)F

    move-result v4

    cmpl-float v4, v4, v12

    if-lez v4, :cond_21

    invoke-static {v1, v2}, Lm2/p;->c(J)F

    move-result v4

    invoke-static {v4}, Ld7/t;->p0(F)I

    move-result v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v6, v3, Lu/j;->c:Landroid/widget/EdgeEffect;

    if-lt v5, v11, :cond_20

    invoke-virtual {v6, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_13

    :cond_20
    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v5

    if-eqz v5, :cond_23

    invoke-virtual {v6, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_13

    :cond_21
    invoke-static {v1, v2}, Lm2/p;->c(J)F

    move-result v4

    cmpg-float v4, v4, v12

    if-gez v4, :cond_23

    invoke-static {v1, v2}, Lm2/p;->c(J)F

    move-result v4

    invoke-static {v4}, Ld7/t;->p0(F)I

    move-result v4

    neg-int v4, v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v6, v3, Lu/j;->d:Landroid/widget/EdgeEffect;

    if-lt v5, v11, :cond_22

    invoke-virtual {v6, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_13

    :cond_22
    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v5

    if-eqz v5, :cond_23

    invoke-virtual {v6, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_23
    :goto_13
    sget-wide v4, Lm2/p;->b:J

    cmp-long v1, v1, v4

    if-nez v1, :cond_24

    goto :goto_14

    :cond_24
    invoke-virtual {v3}, Lu/j;->i()V

    :goto_14
    invoke-virtual {v3}, Lu/j;->e()V

    return-object v8
.end method

.method public final e()V
    .locals 6

    iget-object v0, p0, Lu/j;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/widget/EdgeEffect;

    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v5

    if-nez v5, :cond_1

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move v4, v2

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, 0x1

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {p0}, Lu/j;->i()V

    :cond_3
    return-void
.end method

.method public final f(Lg1/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 4

    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {p3, v1}, Landroid/graphics/Canvas;->rotate(F)V

    iget-object v1, p0, Lu/j;->a:Lu/z1;

    iget-object v1, v1, Lu/z1;->b:Ly/t0;

    invoke-interface {v1}, Ly/t0;->c()F

    move-result v1

    invoke-interface {p1, v1}, Lm2/b;->v(F)F

    move-result p1

    iget-wide v1, p0, Lu/j;->p:J

    invoke-static {v1, v2}, Ld1/f;->d(J)F

    move-result v1

    neg-float v1, v1

    iget-wide v2, p0, Lu/j;->p:J

    invoke-static {v2, v3}, Ld1/f;->b(J)F

    move-result v2

    neg-float v2, v2

    add-float/2addr v2, p1

    invoke-virtual {p3, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p1

    invoke-virtual {p3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p1
.end method

.method public final g(Lg1/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 4

    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    const/high16 v1, 0x43870000    # 270.0f

    invoke-virtual {p3, v1}, Landroid/graphics/Canvas;->rotate(F)V

    iget-wide v1, p0, Lu/j;->p:J

    invoke-static {v1, v2}, Ld1/f;->b(J)F

    move-result v1

    neg-float v1, v1

    iget-object v2, p0, Lu/j;->a:Lu/z1;

    iget-object v2, v2, Lu/z1;->b:Ly/t0;

    invoke-interface {p1}, Lg1/g;->getLayoutDirection()Lm2/l;

    move-result-object v3

    invoke-interface {v2, v3}, Ly/t0;->a(Lm2/l;)F

    move-result v2

    invoke-interface {p1, v2}, Lm2/b;->v(F)F

    move-result p1

    invoke-virtual {p3, v1, p1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p1

    invoke-virtual {p3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p1
.end method

.method public final h(Lg1/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 4

    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget-wide v1, p0, Lu/j;->p:J

    invoke-static {v1, v2}, Ld1/f;->d(J)F

    move-result v1

    invoke-static {v1}, Ld7/t;->p0(F)I

    move-result v1

    iget-object v2, p0, Lu/j;->a:Lu/z1;

    iget-object v2, v2, Lu/z1;->b:Ly/t0;

    invoke-interface {p1}, Lg1/g;->getLayoutDirection()Lm2/l;

    move-result-object v3

    invoke-interface {v2, v3}, Ly/t0;->b(Lm2/l;)F

    move-result v2

    const/high16 v3, 0x42b40000    # 90.0f

    invoke-virtual {p3, v3}, Landroid/graphics/Canvas;->rotate(F)V

    int-to-float v1, v1

    neg-float v1, v1

    invoke-interface {p1, v2}, Lm2/b;->v(F)F

    move-result p1

    add-float/2addr p1, v1

    const/4 v1, 0x0

    invoke-virtual {p3, v1, p1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p1

    invoke-virtual {p3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p1
.end method

.method public final i()V
    .locals 3

    iget-boolean v0, p0, Lu/j;->n:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lu/j;->l:I

    iget-object v1, p0, Lu/j;->m:Lm0/l1;

    invoke-virtual {v1}, Lm0/u2;->d()I

    move-result v2

    if-ne v0, v2, :cond_0

    invoke-virtual {v1}, Lm0/u2;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Lm0/u2;->f(I)V

    :cond_0
    return-void
.end method

.method public final j(JJ)F
    .locals 6

    invoke-static {p3, p4}, Ld1/c;->d(J)F

    move-result p3

    iget-wide v0, p0, Lu/j;->p:J

    invoke-static {v0, v1}, Ld1/f;->d(J)F

    move-result p4

    div-float/2addr p3, p4

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p4

    iget-wide v0, p0, Lu/j;->p:J

    invoke-static {v0, v1}, Ld1/f;->b(J)F

    move-result v0

    div-float/2addr p4, v0

    neg-float p4, p4

    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p3

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Lu/n;->a:Lu/n;

    const/16 v2, 0x1f

    iget-object v3, p0, Lu/j;->d:Landroid/widget/EdgeEffect;

    if-lt p3, v2, :cond_0

    invoke-virtual {v1, v3, p4, v0}, Lu/n;->c(Landroid/widget/EdgeEffect;FF)F

    move-result p4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p4, v0}, Landroid/widget/EdgeEffect;->onPull(FF)V

    :goto_0
    neg-float p3, p4

    iget-wide v4, p0, Lu/j;->p:J

    invoke-static {v4, v5}, Ld1/f;->b(J)F

    move-result p4

    mul-float/2addr p4, p3

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    if-lt p3, v2, :cond_1

    invoke-virtual {v1, v3}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result p3

    goto :goto_1

    :cond_1
    move p3, v0

    :goto_1
    cmpg-float p3, p3, v0

    if-nez p3, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p4

    :goto_2
    return p4
.end method

.method public final k(JJ)F
    .locals 6

    invoke-static {p3, p4}, Ld1/c;->e(J)F

    move-result p3

    iget-wide v0, p0, Lu/j;->p:J

    invoke-static {v0, v1}, Ld1/f;->b(J)F

    move-result p4

    div-float/2addr p3, p4

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p4

    iget-wide v0, p0, Lu/j;->p:J

    invoke-static {v0, v1}, Ld1/f;->d(J)F

    move-result v0

    div-float/2addr p4, v0

    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p3

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Lu/n;->a:Lu/n;

    const/16 v2, 0x1f

    iget-object v3, p0, Lu/j;->e:Landroid/widget/EdgeEffect;

    if-lt p3, v2, :cond_0

    invoke-virtual {v1, v3, p4, v0}, Lu/n;->c(Landroid/widget/EdgeEffect;FF)F

    move-result p4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p4, v0}, Landroid/widget/EdgeEffect;->onPull(FF)V

    :goto_0
    iget-wide v4, p0, Lu/j;->p:J

    invoke-static {v4, v5}, Ld1/f;->d(J)F

    move-result p3

    mul-float/2addr p3, p4

    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    if-lt p4, v2, :cond_1

    invoke-virtual {v1, v3}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result p4

    goto :goto_1

    :cond_1
    move p4, v0

    :goto_1
    cmpg-float p4, p4, v0

    if-nez p4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p3

    :goto_2
    return p3
.end method

.method public final l(JJ)F
    .locals 6

    invoke-static {p3, p4}, Ld1/c;->e(J)F

    move-result p3

    iget-wide v0, p0, Lu/j;->p:J

    invoke-static {v0, v1}, Ld1/f;->b(J)F

    move-result p4

    div-float/2addr p3, p4

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p4

    iget-wide v0, p0, Lu/j;->p:J

    invoke-static {v0, v1}, Ld1/f;->d(J)F

    move-result v0

    div-float/2addr p4, v0

    neg-float p4, p4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Lu/n;->a:Lu/n;

    const/16 v2, 0x1f

    iget-object v3, p0, Lu/j;->f:Landroid/widget/EdgeEffect;

    if-lt v0, v2, :cond_0

    invoke-virtual {v1, v3, p4, p3}, Lu/n;->c(Landroid/widget/EdgeEffect;FF)F

    move-result p4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p4, p3}, Landroid/widget/EdgeEffect;->onPull(FF)V

    :goto_0
    neg-float p3, p4

    iget-wide v4, p0, Lu/j;->p:J

    invoke-static {v4, v5}, Ld1/f;->d(J)F

    move-result p4

    mul-float/2addr p4, p3

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    if-lt p3, v2, :cond_1

    invoke-virtual {v1, v3}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result p3

    goto :goto_1

    :cond_1
    move p3, v0

    :goto_1
    cmpg-float p3, p3, v0

    if-nez p3, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p4

    :goto_2
    return p4
.end method

.method public final m(JJ)F
    .locals 6

    invoke-static {p3, p4}, Ld1/c;->d(J)F

    move-result p3

    iget-wide v0, p0, Lu/j;->p:J

    invoke-static {v0, v1}, Ld1/f;->d(J)F

    move-result p4

    div-float/2addr p3, p4

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p4

    iget-wide v0, p0, Lu/j;->p:J

    invoke-static {v0, v1}, Ld1/f;->b(J)F

    move-result v0

    div-float/2addr p4, v0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Lu/n;->a:Lu/n;

    const/16 v2, 0x1f

    iget-object v3, p0, Lu/j;->c:Landroid/widget/EdgeEffect;

    if-lt v0, v2, :cond_0

    invoke-virtual {v1, v3, p4, p3}, Lu/n;->c(Landroid/widget/EdgeEffect;FF)F

    move-result p4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p4, p3}, Landroid/widget/EdgeEffect;->onPull(FF)V

    :goto_0
    iget-wide v4, p0, Lu/j;->p:J

    invoke-static {v4, v5}, Ld1/f;->b(J)F

    move-result p3

    mul-float/2addr p3, p4

    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    if-lt p4, v2, :cond_1

    invoke-virtual {v1, v3}, Lu/n;->b(Landroid/widget/EdgeEffect;)F

    move-result p4

    goto :goto_1

    :cond_1
    move p4, v0

    :goto_1
    cmpg-float p4, p4, v0

    if-nez p4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p3

    :goto_2
    return p3
.end method
