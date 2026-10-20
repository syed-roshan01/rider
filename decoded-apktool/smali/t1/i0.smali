.class public final Lt1/i0;
.super Ljava/lang/Object;

# interfaces
.implements Lg1/g;
.implements Lg1/e;


# instance fields
.field public final a:Lg1/c;

.field public b:Lt1/s;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lg1/c;

    invoke-direct {v0}, Lg1/c;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lt1/i0;->a:Lg1/c;

    return-void
.end method


# virtual methods
.method public final A()Lg1/b;
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    iget-object v0, v0, Lg1/c;->b:Lg1/b;

    return-object v0
.end method

.method public final E(J)I
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0, p1, p2}, Lm2/b;->E(J)I

    move-result p1

    return p1
.end method

.method public final F(J)F
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0, p1, p2}, Lm2/b;->F(J)F

    move-result p1

    return p1
.end method

.method public final I(Le1/y;JJJJFLg1/h;Le1/l;II)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    invoke-virtual/range {v1 .. v15}, Lg1/c;->I(Le1/y;JJJJFLg1/h;Le1/l;II)V

    return-void
.end method

.method public final J(F)I
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0, p1}, Lm2/b;->J(F)I

    move-result p1

    return p1
.end method

.method public final O()J
    .locals 2

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0}, Lg1/g;->O()J

    move-result-wide v0

    return-wide v0
.end method

.method public final S(J)J
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0, p1, p2}, Lm2/b;->S(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final T(Le1/y;JFLg1/h;Le1/l;I)V
    .locals 8

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Lg1/c;->T(Le1/y;JFLg1/h;Le1/l;I)V

    return-void
.end method

.method public final W(Le1/e0;FJFLg1/h;Le1/l;I)V
    .locals 10

    move-object v0, p0

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-virtual/range {v1 .. v9}, Lg1/c;->W(Le1/e0;FJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public final Z(J)F
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0, p1, p2}, Lm2/b;->Z(J)F

    move-result p1

    return p1
.end method

.method public final a()V
    .locals 10

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    iget-object v0, v0, Lg1/c;->b:Lg1/b;

    invoke-virtual {v0}, Lg1/b;->a()Le1/p;

    move-result-object v0

    iget-object v1, p0, Lt1/i0;->b:Lt1/s;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    move-object v2, v1

    check-cast v2, Ly0/n;

    iget-object v3, v2, Ly0/n;->a:Ly0/n;

    iget-object v3, v3, Ly0/n;->f:Ly0/n;

    const/4 v7, 0x4

    const/4 v8, 0x0

    if-nez v3, :cond_1

    :cond_0
    :goto_0
    move-object v3, v8

    goto :goto_2

    :cond_1
    iget v4, v3, Ly0/n;->d:I

    and-int/2addr v4, v7

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v3, :cond_0

    iget v4, v3, Ly0/n;->c:I

    and-int/lit8 v5, v4, 0x2

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    and-int/lit8 v4, v4, 0x4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, v3, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :goto_2
    if-eqz v3, :cond_c

    move-object v9, v8

    :goto_3
    if-eqz v3, :cond_e

    instance-of v1, v3, Lt1/s;

    if-eqz v1, :cond_5

    move-object v6, v3

    check-cast v6, Lt1/s;

    invoke-static {v6, v7}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v5

    iget-wide v1, v5, Lr1/x0;->c:J

    invoke-static {v1, v2}, Lo1/s;->m0(J)J

    move-result-wide v3

    iget-object v1, v5, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v1

    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getSharedDrawScope()Lt1/i0;

    move-result-object v1

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Lt1/i0;->b(Le1/p;JLt1/c1;Lt1/s;)V

    goto :goto_6

    :cond_5
    iget v1, v3, Ly0/n;->c:I

    and-int/2addr v1, v7

    if-eqz v1, :cond_b

    instance-of v1, v3, Lt1/o;

    if-eqz v1, :cond_b

    move-object v1, v3

    check-cast v1, Lt1/o;

    iget-object v1, v1, Lt1/o;->v:Ly0/n;

    const/4 v2, 0x0

    :goto_4
    const/4 v4, 0x1

    if-eqz v1, :cond_a

    iget v5, v1, Ly0/n;->c:I

    and-int/2addr v5, v7

    if-eqz v5, :cond_9

    add-int/lit8 v2, v2, 0x1

    if-ne v2, v4, :cond_6

    move-object v3, v1

    goto :goto_5

    :cond_6
    if-nez v9, :cond_7

    new-instance v9, Lo0/i;

    const/16 v4, 0x10

    new-array v4, v4, [Ly0/n;

    invoke-direct {v9, v4}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v3, :cond_8

    invoke-virtual {v9, v3}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v3, v8

    :cond_8
    invoke-virtual {v9, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_9
    :goto_5
    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    goto :goto_4

    :cond_a
    if-ne v2, v4, :cond_b

    goto :goto_3

    :cond_b
    :goto_6
    invoke-static {v9}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v3

    goto :goto_3

    :cond_c
    invoke-static {v1, v7}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v1

    invoke-virtual {v1}, Lt1/c1;->K0()Ly0/n;

    move-result-object v3

    iget-object v2, v2, Ly0/n;->a:Ly0/n;

    if-ne v3, v2, :cond_d

    iget-object v1, v1, Lt1/c1;->q:Lt1/c1;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    :cond_d
    invoke-virtual {v1, v0}, Lt1/c1;->U0(Le1/p;)V

    :cond_e
    return-void
.end method

.method public final b(Le1/p;JLt1/c1;Lt1/s;)V
    .locals 9

    iget-object v0, p0, Lt1/i0;->b:Lt1/s;

    iput-object p5, p0, Lt1/i0;->b:Lt1/s;

    iget-object v1, p4, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v1, v1, Landroidx/compose/ui/node/a;->y:Lm2/l;

    iget-object v2, p0, Lt1/i0;->a:Lg1/c;

    iget-object v3, v2, Lg1/c;->a:Lg1/a;

    iget-object v4, v3, Lg1/a;->a:Lm2/b;

    iget-object v5, v3, Lg1/a;->b:Lm2/l;

    iget-object v6, v3, Lg1/a;->c:Le1/p;

    iget-wide v7, v3, Lg1/a;->d:J

    iput-object p4, v3, Lg1/a;->a:Lm2/b;

    iput-object v1, v3, Lg1/a;->b:Lm2/l;

    iput-object p1, v3, Lg1/a;->c:Le1/p;

    iput-wide p2, v3, Lg1/a;->d:J

    invoke-interface {p1}, Le1/p;->j()V

    invoke-interface {p5, p0}, Lt1/s;->i(Lg1/e;)V

    invoke-interface {p1}, Le1/p;->h()V

    iget-object p1, v2, Lg1/c;->a:Lg1/a;

    iput-object v4, p1, Lg1/a;->a:Lm2/b;

    iput-object v5, p1, Lg1/a;->b:Lm2/l;

    iput-object v6, p1, Lg1/a;->c:Le1/p;

    iput-wide v7, p1, Lg1/a;->d:J

    iput-object v0, p0, Lt1/i0;->b:Lt1/s;

    return-void
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-virtual {v0}, Lg1/c;->c()F

    move-result v0

    return v0
.end method

.method public final d(Le1/n;JJFIFLe1/l;I)V
    .locals 13

    move-object v0, p1

    move/from16 v1, p6

    move/from16 v2, p7

    move/from16 v3, p8

    move-object/from16 v4, p9

    move/from16 v5, p10

    move-object v6, p0

    iget-object v7, v6, Lt1/i0;->a:Lg1/c;

    iget-object v8, v7, Lg1/c;->a:Lg1/a;

    iget-object v8, v8, Lg1/a;->c:Le1/p;

    iget-object v9, v7, Lg1/c;->d:Le1/g;

    const/4 v10, 0x1

    if-nez v9, :cond_0

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object v9

    invoke-virtual {v9, v10}, Le1/g;->l(I)V

    iput-object v9, v7, Lg1/c;->d:Le1/g;

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v7}, Lg1/g;->e()J

    move-result-wide v11

    invoke-virtual {p1, v3, v11, v12, v9}, Le1/n;->a(FJLe1/g;)V

    goto :goto_0

    :cond_1
    iget-object v0, v9, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v7, 0x437f0000    # 255.0f

    div-float/2addr v0, v7

    cmpg-float v0, v0, v3

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v9, v3}, Le1/g;->c(F)V

    :goto_0
    iget-object v0, v9, Le1/g;->d:Le1/l;

    invoke-static {v0, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v9, v4}, Le1/g;->f(Le1/l;)V

    :cond_3
    iget v0, v9, Le1/g;->b:I

    invoke-static {v0, v5}, Le1/g0;->b(II)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v9, v5}, Le1/g;->d(I)V

    :cond_4
    iget-object v0, v9, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    cmpg-float v3, v3, v1

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v9, v1}, Le1/g;->k(F)V

    :goto_1
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeMiter()F

    move-result v1

    const/high16 v3, 0x40800000    # 4.0f

    cmpg-float v1, v1, v3

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    iget-object v1, v9, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    :goto_2
    invoke-virtual {v9}, Le1/g;->a()I

    move-result v1

    invoke-static {v1, v2}, Le1/g0;->f(II)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v9, v2}, Le1/g;->i(I)V

    :cond_7
    invoke-virtual {v9}, Le1/g;->b()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Le1/g0;->g(II)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v9, v2}, Le1/g;->j(I)V

    :cond_8
    const/4 v1, 0x0

    invoke-static {v1, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    iget-object v2, v9, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_9
    invoke-virtual {v0}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result v0

    invoke-static {v0, v10}, Le1/g0;->d(II)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {v9, v10}, Le1/g;->g(I)V

    :cond_a
    move-object v0, v8

    move-wide v1, p2

    move-wide/from16 v3, p4

    move-object v5, v9

    invoke-interface/range {v0 .. v5}, Le1/p;->g(JJLe1/g;)V

    return-void
.end method

.method public final e()J
    .locals 2

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0}, Lg1/g;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e0(F)J
    .locals 2

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0, p1}, Lm2/b;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final f(Le1/i;JFLg1/h;Le1/l;I)V
    .locals 8

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Lg1/c;->d(Le1/i;JFLg1/h;Le1/l;I)V

    return-void
.end method

.method public final f0(JFFJJFLg1/h;Le1/l;I)V
    .locals 14

    move-object v0, p0

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    move-wide v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    invoke-virtual/range {v1 .. v13}, Lg1/c;->f0(JFFJJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public final g(JJJJLg1/h;FLe1/l;I)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    iget-object v2, v1, Lg1/c;->a:Lg1/a;

    iget-object v8, v2, Lg1/a;->c:Le1/p;

    invoke-static/range {p3 .. p4}, Ld1/c;->d(J)F

    move-result v9

    invoke-static/range {p3 .. p4}, Ld1/c;->e(J)F

    move-result v10

    invoke-static/range {p3 .. p4}, Ld1/c;->d(J)F

    move-result v2

    invoke-static/range {p5 .. p6}, Ld1/f;->d(J)F

    move-result v3

    add-float v11, v3, v2

    invoke-static/range {p3 .. p4}, Ld1/c;->e(J)F

    move-result v2

    invoke-static/range {p5 .. p6}, Ld1/f;->b(J)F

    move-result v3

    add-float v12, v3, v2

    invoke-static/range {p7 .. p8}, Ld1/a;->b(J)F

    move-result v13

    invoke-static/range {p7 .. p8}, Ld1/a;->c(J)F

    move-result v14

    move-wide/from16 v2, p1

    move-object/from16 v4, p9

    move/from16 v5, p10

    move-object/from16 v6, p11

    move/from16 v7, p12

    invoke-static/range {v1 .. v7}, Lg1/c;->a(Lg1/c;JLg1/h;FLe1/l;I)Le1/g;

    move-result-object v1

    move-object/from16 p1, v8

    move/from16 p2, v9

    move/from16 p3, v10

    move/from16 p4, v11

    move/from16 p5, v12

    move/from16 p6, v13

    move/from16 p7, v14

    move-object/from16 p8, v1

    invoke-interface/range {p1 .. p8}, Le1/p;->l(FFFFFFLe1/g;)V

    return-void
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    iget-object v0, v0, Lg1/c;->a:Lg1/a;

    iget-object v0, v0, Lg1/a;->b:Lm2/l;

    return-object v0
.end method

.method public final i0(JJJFLg1/h;Le1/l;I)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    move-wide v2, p1

    move-wide v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    invoke-virtual/range {v1 .. v11}, Lg1/c;->i0(JJJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public final k0(Le1/n;JJFLg1/h;Le1/l;I)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lg1/c;->k0(Le1/n;JJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-virtual {v0}, Lg1/c;->m()F

    move-result v0

    return v0
.end method

.method public final n0(Le1/d0;Le1/n;FLg1/h;Le1/l;I)V
    .locals 7

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lg1/c;->n0(Le1/d0;Le1/n;FLg1/h;Le1/l;I)V

    return-void
.end method

.method public final o0(I)F
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0, p1}, Lm2/b;->o0(I)F

    move-result p1

    return p1
.end method

.method public final p0(JJJFIFLe1/l;I)V
    .locals 13

    move-object v0, p0

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    invoke-virtual/range {v1 .. v12}, Lg1/c;->p0(JJJFIFLe1/l;I)V

    return-void
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-virtual {v0}, Lg1/c;->c()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public final s(Le1/n;JJJFLg1/h;Le1/l;I)V
    .locals 13

    move-object v0, p0

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    move-object v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    invoke-virtual/range {v1 .. v12}, Lg1/c;->s(Le1/n;JJJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public final t(F)J
    .locals 2

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0, p1}, Lm2/b;->t(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final u(J)J
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0, p1, p2}, Lm2/b;->u(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final u0(JFJFLg1/h;Le1/l;I)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    move-wide v2, p1

    move v4, p3

    move-wide v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lg1/c;->u0(JFJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public final v(F)F
    .locals 1

    iget-object v0, p0, Lt1/i0;->a:Lg1/c;

    invoke-virtual {v0}, Lg1/c;->c()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method
