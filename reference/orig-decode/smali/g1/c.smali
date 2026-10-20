.class public final Lg1/c;
.super Ljava/lang/Object;

# interfaces
.implements Lg1/g;


# instance fields
.field public final a:Lg1/a;

.field public final b:Lg1/b;

.field public c:Le1/g;

.field public d:Le1/g;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg1/a;

    sget-object v1, Lg1/f;->a:Lm2/c;

    sget-object v2, Lm2/l;->a:Lm2/l;

    new-instance v3, Lg1/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    sget-wide v4, Ld1/f;->b:J

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lg1/a;->a:Lm2/b;

    iput-object v2, v0, Lg1/a;->b:Lm2/l;

    iput-object v3, v0, Lg1/a;->c:Le1/p;

    iput-wide v4, v0, Lg1/a;->d:J

    iput-object v0, p0, Lg1/c;->a:Lg1/a;

    new-instance v0, Lg1/b;

    invoke-direct {v0, p0}, Lg1/b;-><init>(Lg1/c;)V

    iput-object v0, p0, Lg1/c;->b:Lg1/b;

    return-void
.end method

.method public static a(Lg1/c;JLg1/h;FLe1/l;I)Le1/g;
    .locals 0

    invoke-virtual {p0, p3}, Lg1/c;->f(Lg1/h;)Le1/g;

    move-result-object p0

    const/high16 p3, 0x3f800000    # 1.0f

    cmpg-float p3, p4, p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Le1/r;->d(J)F

    move-result p3

    mul-float/2addr p3, p4

    invoke-static {p1, p2, p3}, Le1/r;->b(JF)J

    move-result-wide p1

    :goto_0
    iget-object p3, p0, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p3}, Landroid/graphics/Paint;->getColor()I

    move-result p3

    invoke-static {p3}, Landroidx/compose/ui/graphics/a;->b(I)J

    move-result-wide p3

    invoke-static {p3, p4, p1, p2}, Le1/r;->c(JJ)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p0, p1, p2}, Le1/g;->e(J)V

    :cond_1
    iget-object p1, p0, Le1/g;->c:Landroid/graphics/Shader;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Le1/g;->h(Landroid/graphics/Shader;)V

    :cond_2
    iget-object p1, p0, Le1/g;->d:Le1/l;

    invoke-static {p1, p5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0, p5}, Le1/g;->f(Le1/l;)V

    :cond_3
    iget p1, p0, Le1/g;->b:I

    invoke-static {p1, p6}, Le1/g0;->b(II)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0, p6}, Le1/g;->d(I)V

    :cond_4
    iget-object p1, p0, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result p1

    const/4 p2, 0x1

    invoke-static {p1, p2}, Le1/g0;->d(II)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p0, p2}, Le1/g;->g(I)V

    :cond_5
    return-object p0
.end method


# virtual methods
.method public final A()Lg1/b;
    .locals 1

    iget-object v0, p0, Lg1/c;->b:Lg1/b;

    return-object v0
.end method

.method public final I(Le1/y;JJJJFLg1/h;Le1/l;II)V
    .locals 19

    move-object/from16 v7, p0

    iget-object v0, v7, Lg1/c;->a:Lg1/a;

    iget-object v8, v0, Lg1/a;->c:Le1/p;

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p11

    move/from16 v3, p10

    move-object/from16 v4, p12

    move/from16 v5, p13

    move/from16 v6, p14

    invoke-virtual/range {v0 .. v6}, Lg1/c;->b(Le1/n;Lg1/h;FLe1/l;II)Le1/g;

    move-result-object v18

    move-object/from16 v9, p1

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-interface/range {v8 .. v18}, Le1/p;->a(Le1/y;JJJJLe1/g;)V

    return-void
.end method

.method public final T(Le1/y;JFLg1/h;Le1/l;I)V
    .locals 8

    iget-object v0, p0, Lg1/c;->a:Lg1/a;

    iget-object v0, v0, Lg1/a;->c:Le1/p;

    const/4 v2, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    move-object v3, p5

    move v4, p4

    move-object v5, p6

    move v6, p7

    invoke-virtual/range {v1 .. v7}, Lg1/c;->b(Le1/n;Lg1/h;FLe1/l;II)Le1/g;

    move-result-object p4

    invoke-interface {v0, p1, p2, p3, p4}, Le1/p;->u(Le1/y;JLe1/g;)V

    return-void
.end method

.method public final W(Le1/e0;FJFLg1/h;Le1/l;I)V
    .locals 9

    move-object v7, p0

    iget-object v0, v7, Lg1/c;->a:Lg1/a;

    iget-object v8, v0, Lg1/a;->c:Le1/p;

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p6

    move v3, p5

    move-object/from16 v4, p7

    move/from16 v5, p8

    invoke-virtual/range {v0 .. v6}, Lg1/c;->b(Le1/n;Lg1/h;FLe1/l;II)Le1/g;

    move-result-object v0

    move v1, p2

    move-wide v2, p3

    invoke-interface {v8, p2, p3, p4, v0}, Le1/p;->p(FJLe1/g;)V

    return-void
.end method

.method public final b(Le1/n;Lg1/h;FLe1/l;II)Le1/g;
    .locals 4

    invoke-virtual {p0, p2}, Lg1/c;->f(Lg1/h;)Le1/g;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lg1/g;->e()J

    move-result-wide v0

    invoke-virtual {p1, p3, v0, v1, p2}, Le1/n;->a(FJLe1/g;)V

    goto :goto_0

    :cond_0
    iget-object p1, p2, Le1/g;->c:Landroid/graphics/Shader;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Le1/g;->h(Landroid/graphics/Shader;)V

    :cond_1
    iget-object p1, p2, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/graphics/a;->b(I)J

    move-result-wide v0

    sget-wide v2, Le1/r;->b:J

    invoke-static {v0, v1, v2, v3}, Le1/r;->c(JJ)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p2, v2, v3}, Le1/g;->e(J)V

    :cond_2
    iget-object p1, p2, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getAlpha()I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p1, v0

    cmpg-float p1, p1, p3

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p2, p3}, Le1/g;->c(F)V

    :goto_0
    iget-object p1, p2, Le1/g;->d:Le1/l;

    invoke-static {p1, p4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p2, p4}, Le1/g;->f(Le1/l;)V

    :cond_4
    iget p1, p2, Le1/g;->b:I

    invoke-static {p1, p5}, Le1/g0;->b(II)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p2, p5}, Le1/g;->d(I)V

    :cond_5
    iget-object p1, p2, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result p1

    invoke-static {p1, p6}, Le1/g0;->d(II)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p2, p6}, Le1/g;->g(I)V

    :cond_6
    return-object p2
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lg1/c;->a:Lg1/a;

    iget-object v0, v0, Lg1/a;->a:Lm2/b;

    invoke-interface {v0}, Lm2/b;->c()F

    move-result v0

    return v0
.end method

.method public final d(Le1/i;JFLg1/h;Le1/l;I)V
    .locals 8

    iget-object v0, p0, Lg1/c;->a:Lg1/a;

    iget-object v0, v0, Lg1/a;->c:Le1/p;

    move-object v1, p0

    move-wide v2, p2

    move-object v4, p5

    move v5, p4

    move-object v6, p6

    move v7, p7

    invoke-static/range {v1 .. v7}, Lg1/c;->a(Lg1/c;JLg1/h;FLe1/l;I)Le1/g;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Le1/p;->k(Le1/d0;Le1/g;)V

    return-void
.end method

.method public final f(Lg1/h;)Le1/g;
    .locals 4

    sget-object v0, Lg1/j;->a:Lg1/j;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lg1/c;->c:Le1/g;

    if-nez p1, :cond_7

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Le1/g;->l(I)V

    iput-object p1, p0, Lg1/c;->c:Le1/g;

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lg1/k;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lg1/c;->d:Le1/g;

    if-nez v0, :cond_1

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Le1/g;->l(I)V

    iput-object v0, p0, Lg1/c;->d:Le1/g;

    :cond_1
    iget-object v1, v0, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v2

    check-cast p1, Lg1/k;

    iget v3, p1, Lg1/k;->a:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v3}, Le1/g;->k(F)V

    :goto_0
    invoke-virtual {v0}, Le1/g;->a()I

    move-result v2

    iget v3, p1, Lg1/k;->c:I

    invoke-static {v2, v3}, Le1/g0;->f(II)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0, v3}, Le1/g;->i(I)V

    :cond_3
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeMiter()F

    move-result v1

    iget v2, p1, Lg1/k;->b:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    iget-object v1, v0, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    :goto_1
    invoke-virtual {v0}, Le1/g;->b()I

    move-result v1

    iget p1, p1, Lg1/k;->d:I

    invoke-static {v1, p1}, Le1/g0;->g(II)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0, p1}, Le1/g;->j(I)V

    :cond_5
    const/4 p1, 0x0

    invoke-static {p1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v0, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_6
    move-object p1, v0

    :cond_7
    :goto_2
    return-object p1

    :cond_8
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final f0(JFFJJFLg1/h;Le1/l;I)V
    .locals 13

    move-object v7, p0

    iget-object v0, v7, Lg1/c;->a:Lg1/a;

    iget-object v8, v0, Lg1/a;->c:Le1/p;

    invoke-static/range {p5 .. p6}, Ld1/c;->d(J)F

    move-result v9

    invoke-static/range {p5 .. p6}, Ld1/c;->e(J)F

    move-result v10

    invoke-static/range {p5 .. p6}, Ld1/c;->d(J)F

    move-result v0

    invoke-static/range {p7 .. p8}, Ld1/f;->d(J)F

    move-result v1

    add-float v11, v1, v0

    invoke-static/range {p5 .. p6}, Ld1/c;->e(J)F

    move-result v0

    invoke-static/range {p7 .. p8}, Ld1/f;->b(J)F

    move-result v1

    add-float v12, v1, v0

    move-object v0, p0

    move-wide v1, p1

    move-object/from16 v3, p10

    move/from16 v4, p9

    move-object/from16 v5, p11

    move/from16 v6, p12

    invoke-static/range {v0 .. v6}, Lg1/c;->a(Lg1/c;JLg1/h;FLe1/l;I)Le1/g;

    move-result-object v0

    move-object/from16 p5, v8

    move/from16 p6, v9

    move/from16 p7, v10

    move/from16 p8, v11

    move/from16 p9, v12

    move/from16 p10, p3

    move/from16 p11, p4

    move-object/from16 p12, v0

    invoke-interface/range {p5 .. p12}, Le1/p;->n(FFFFFFLe1/g;)V

    return-void
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    iget-object v0, p0, Lg1/c;->a:Lg1/a;

    iget-object v0, v0, Lg1/a;->b:Lm2/l;

    return-object v0
.end method

.method public final i0(JJJFLg1/h;Le1/l;I)V
    .locals 13

    move-object v7, p0

    iget-object v0, v7, Lg1/c;->a:Lg1/a;

    iget-object v8, v0, Lg1/a;->c:Le1/p;

    invoke-static/range {p3 .. p4}, Ld1/c;->d(J)F

    move-result v9

    invoke-static/range {p3 .. p4}, Ld1/c;->e(J)F

    move-result v10

    invoke-static/range {p3 .. p4}, Ld1/c;->d(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ld1/f;->d(J)F

    move-result v1

    add-float v11, v1, v0

    invoke-static/range {p3 .. p4}, Ld1/c;->e(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ld1/f;->b(J)F

    move-result v1

    add-float v12, v1, v0

    move-object v0, p0

    move-wide v1, p1

    move-object/from16 v3, p8

    move/from16 v4, p7

    move-object/from16 v5, p9

    move/from16 v6, p10

    invoke-static/range {v0 .. v6}, Lg1/c;->a(Lg1/c;JLg1/h;FLe1/l;I)Le1/g;

    move-result-object v0

    move-object p1, v8

    move p2, v9

    move/from16 p3, v10

    move/from16 p4, v11

    move/from16 p5, v12

    move-object/from16 p6, v0

    invoke-interface/range {p1 .. p6}, Le1/p;->s(FFFFLe1/g;)V

    return-void
.end method

.method public final k0(Le1/n;JJFLg1/h;Le1/l;I)V
    .locals 13

    move-object v7, p0

    iget-object v0, v7, Lg1/c;->a:Lg1/a;

    iget-object v8, v0, Lg1/a;->c:Le1/p;

    invoke-static/range {p2 .. p3}, Ld1/c;->d(J)F

    move-result v9

    invoke-static/range {p2 .. p3}, Ld1/c;->e(J)F

    move-result v10

    invoke-static/range {p2 .. p3}, Ld1/c;->d(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ld1/f;->d(J)F

    move-result v1

    add-float v11, v1, v0

    invoke-static/range {p2 .. p3}, Ld1/c;->e(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ld1/f;->b(J)F

    move-result v1

    add-float v12, v1, v0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p7

    move/from16 v3, p6

    move-object/from16 v4, p8

    move/from16 v5, p9

    invoke-virtual/range {v0 .. v6}, Lg1/c;->b(Le1/n;Lg1/h;FLe1/l;II)Le1/g;

    move-result-object v0

    move-object p1, v8

    move p2, v9

    move/from16 p3, v10

    move/from16 p4, v11

    move/from16 p5, v12

    move-object/from16 p6, v0

    invoke-interface/range {p1 .. p6}, Le1/p;->s(FFFFLe1/g;)V

    return-void
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Lg1/c;->a:Lg1/a;

    iget-object v0, v0, Lg1/a;->a:Lm2/b;

    invoke-interface {v0}, Lm2/b;->m()F

    move-result v0

    return v0
.end method

.method public final n0(Le1/d0;Le1/n;FLg1/h;Le1/l;I)V
    .locals 8

    iget-object v0, p0, Lg1/c;->a:Lg1/a;

    iget-object v0, v0, Lg1/a;->c:Le1/p;

    const/4 v7, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p4

    move v4, p3

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v1 .. v7}, Lg1/c;->b(Le1/n;Lg1/h;FLe1/l;II)Le1/g;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Le1/p;->k(Le1/d0;Le1/g;)V

    return-void
.end method

.method public final p0(JJJFIFLe1/l;I)V
    .locals 14

    move-object v0, p0

    move/from16 v1, p7

    move/from16 v2, p8

    move-object/from16 v3, p10

    move/from16 v4, p11

    iget-object v5, v0, Lg1/c;->a:Lg1/a;

    iget-object v6, v5, Lg1/a;->c:Le1/p;

    iget-object v5, v0, Lg1/c;->d:Le1/g;

    const/4 v7, 0x1

    if-nez v5, :cond_0

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object v5

    invoke-virtual {v5, v7}, Le1/g;->l(I)V

    iput-object v5, v0, Lg1/c;->d:Le1/g;

    :cond_0
    move-object v11, v5

    const/high16 v5, 0x3f800000    # 1.0f

    cmpg-float v5, p9, v5

    if-nez v5, :cond_1

    move-wide v8, p1

    goto :goto_0

    :cond_1
    invoke-static/range {p1 .. p2}, Le1/r;->d(J)F

    move-result v5

    mul-float v5, v5, p9

    move-wide v8, p1

    invoke-static {v8, v9, v5}, Le1/r;->b(JF)J

    move-result-wide v8

    :goto_0
    iget-object v5, v11, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getColor()I

    move-result v5

    invoke-static {v5}, Landroidx/compose/ui/graphics/a;->b(I)J

    move-result-wide v12

    invoke-static {v12, v13, v8, v9}, Le1/r;->c(JJ)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v11, v8, v9}, Le1/g;->e(J)V

    :cond_2
    iget-object v5, v11, Le1/g;->c:Landroid/graphics/Shader;

    const/4 v8, 0x0

    if-eqz v5, :cond_3

    invoke-virtual {v11, v8}, Le1/g;->h(Landroid/graphics/Shader;)V

    :cond_3
    iget-object v5, v11, Le1/g;->d:Le1/l;

    invoke-static {v5, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v11, v3}, Le1/g;->f(Le1/l;)V

    :cond_4
    iget v3, v11, Le1/g;->b:I

    invoke-static {v3, v4}, Le1/g0;->b(II)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v11, v4}, Le1/g;->d(I)V

    :cond_5
    iget-object v3, v11, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v4

    cmpg-float v4, v4, v1

    if-nez v4, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v11, v1}, Le1/g;->k(F)V

    :goto_1
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeMiter()F

    move-result v1

    const/high16 v4, 0x40800000    # 4.0f

    cmpg-float v1, v1, v4

    if-nez v1, :cond_7

    goto :goto_2

    :cond_7
    iget-object v1, v11, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    :goto_2
    invoke-virtual {v11}, Le1/g;->a()I

    move-result v1

    invoke-static {v1, v2}, Le1/g0;->f(II)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v11, v2}, Le1/g;->i(I)V

    :cond_8
    invoke-virtual {v11}, Le1/g;->b()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Le1/g0;->g(II)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {v11, v2}, Le1/g;->j(I)V

    :cond_9
    invoke-static {v8, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v11, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v1, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_a
    invoke-virtual {v3}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result v1

    invoke-static {v1, v7}, Le1/g0;->d(II)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v11, v7}, Le1/g;->g(I)V

    :cond_b
    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    invoke-interface/range {v6 .. v11}, Le1/p;->g(JJLe1/g;)V

    return-void
.end method

.method public final s(Le1/n;JJJFLg1/h;Le1/l;I)V
    .locals 15

    move-object v7, p0

    iget-object v0, v7, Lg1/c;->a:Lg1/a;

    iget-object v8, v0, Lg1/a;->c:Le1/p;

    invoke-static/range {p2 .. p3}, Ld1/c;->d(J)F

    move-result v9

    invoke-static/range {p2 .. p3}, Ld1/c;->e(J)F

    move-result v10

    invoke-static/range {p2 .. p3}, Ld1/c;->d(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ld1/f;->d(J)F

    move-result v1

    add-float v11, v1, v0

    invoke-static/range {p2 .. p3}, Ld1/c;->e(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ld1/f;->b(J)F

    move-result v1

    add-float v12, v1, v0

    invoke-static/range {p6 .. p7}, Ld1/a;->b(J)F

    move-result v13

    invoke-static/range {p6 .. p7}, Ld1/a;->c(J)F

    move-result v14

    const/4 v6, 0x1

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p9

    move/from16 v3, p8

    move-object/from16 v4, p10

    move/from16 v5, p11

    invoke-virtual/range {v0 .. v6}, Lg1/c;->b(Le1/n;Lg1/h;FLe1/l;II)Le1/g;

    move-result-object v0

    move-object/from16 p1, v8

    move/from16 p2, v9

    move/from16 p3, v10

    move/from16 p4, v11

    move/from16 p5, v12

    move/from16 p6, v13

    move/from16 p7, v14

    move-object/from16 p8, v0

    invoke-interface/range {p1 .. p8}, Le1/p;->l(FFFFFFLe1/g;)V

    return-void
.end method

.method public final u0(JFJFLg1/h;Le1/l;I)V
    .locals 9

    move-object v7, p0

    iget-object v0, v7, Lg1/c;->a:Lg1/a;

    iget-object v8, v0, Lg1/a;->c:Le1/p;

    move-object v0, p0

    move-wide v1, p1

    move-object/from16 v3, p7

    move v4, p6

    move-object/from16 v5, p8

    move/from16 v6, p9

    invoke-static/range {v0 .. v6}, Lg1/c;->a(Lg1/c;JLg1/h;FLe1/l;I)Le1/g;

    move-result-object v0

    move v1, p3

    move-wide v2, p4

    invoke-interface {v8, p3, p4, p5, v0}, Le1/p;->p(FJLe1/g;)V

    return-void
.end method
