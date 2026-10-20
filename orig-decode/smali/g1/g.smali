.class public interface abstract Lg1/g;
.super Ljava/lang/Object;

# interfaces
.implements Lm2/b;


# direct methods
.method public static C(Lg1/g;Le1/y;JJJFLe1/l;II)V
    .locals 18

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    sget-wide v1, Lm2/i;->b:J

    move-wide v5, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object/from16 v1, p1

    check-cast v1, Le1/f;

    iget-object v2, v1, Le1/f;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget-object v1, v1, Le1/f;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-static {v2, v1}, Lo1/s;->e(II)J

    move-result-wide v1

    move-wide v7, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    sget-wide v1, Lm2/i;->b:J

    :goto_2
    move-wide v9, v1

    goto :goto_3

    :cond_2
    const-wide/16 v1, 0x0

    goto :goto_2

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    move-wide v11, v7

    goto :goto_4

    :cond_3
    move-wide/from16 v11, p6

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    const/high16 v1, 0x3f800000    # 1.0f

    move v13, v1

    goto :goto_5

    :cond_4
    move/from16 v13, p8

    :goto_5
    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    sget-object v1, Lg1/j;->a:Lg1/j;

    move-object v14, v1

    goto :goto_6

    :cond_5
    move-object v14, v2

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    move-object v15, v2

    goto :goto_7

    :cond_6
    move-object/from16 v15, p9

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    const/4 v1, 0x3

    :goto_8
    move/from16 v16, v1

    goto :goto_9

    :cond_7
    const/4 v1, 0x0

    goto :goto_8

    :goto_9
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    move/from16 v17, v0

    goto :goto_a

    :cond_8
    move/from16 v17, p10

    :goto_a
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-interface/range {v3 .. v17}, Lg1/g;->I(Le1/y;JJJJFLg1/h;Le1/l;II)V

    return-void
.end method

.method public static synthetic D(Lg1/g;Le1/d0;Le1/n;FLg1/k;I)V
    .locals 7

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_0
    move v3, p3

    and-int/lit8 p3, p5, 0x8

    if-eqz p3, :cond_1

    sget-object p4, Lg1/j;->a:Lg1/j;

    :cond_1
    move-object v4, p4

    const/4 v5, 0x0

    and-int/lit8 p3, p5, 0x20

    if-eqz p3, :cond_2

    const/4 p3, 0x3

    :goto_0
    move v6, p3

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-interface/range {v0 .. v6}, Lg1/g;->n0(Le1/d0;Le1/n;FLg1/h;Le1/l;I)V

    return-void
.end method

.method public static synthetic K(Lg1/g;JFJLg1/h;I)V
    .locals 11

    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lg1/g;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld1/f;->c(J)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, p3

    :goto_0
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lg1/g;->O()J

    move-result-wide v0

    move-wide v5, v0

    goto :goto_1

    :cond_1
    move-wide v5, p4

    :goto_1
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    :goto_2
    move v7, v0

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_3

    sget-object v0, Lg1/j;->a:Lg1/j;

    move-object v8, v0

    goto :goto_4

    :cond_3
    move-object/from16 v8, p6

    :goto_4
    const/4 v9, 0x0

    and-int/lit8 v0, p7, 0x40

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    :goto_5
    move v10, v0

    goto :goto_6

    :cond_4
    const/4 v0, 0x0

    goto :goto_5

    :goto_6
    move-object v1, p0

    move-wide v2, p1

    invoke-interface/range {v1 .. v10}, Lg1/g;->u0(JFJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public static U(Lg1/g;JJJI)V
    .locals 13

    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_0

    sget-wide v0, Ld1/c;->b:J

    move-wide v5, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lg1/g;->e()J

    move-result-wide v0

    invoke-static {v0, v1, v5, v6}, Lg1/g;->t0(JJ)J

    move-result-wide v0

    move-wide v7, v0

    goto :goto_1

    :cond_1
    move-wide/from16 v7, p5

    :goto_1
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    :goto_2
    move v9, v0

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_3

    sget-object v0, Lg1/j;->a:Lg1/j;

    :goto_4
    move-object v10, v0

    goto :goto_5

    :cond_3
    const/4 v0, 0x0

    goto :goto_4

    :goto_5
    const/4 v11, 0x0

    and-int/lit8 v0, p7, 0x40

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    :goto_6
    move v12, v0

    goto :goto_7

    :cond_4
    const/4 v0, 0x0

    goto :goto_6

    :goto_7
    move-object v2, p0

    move-wide v3, p1

    invoke-interface/range {v2 .. v12}, Lg1/g;->i0(JJJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public static Y(Lg1/g;Le1/n;JJFLg1/h;I)V
    .locals 12

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    sget-wide v0, Ld1/c;->b:J

    move-wide v4, v0

    goto :goto_0

    :cond_0
    move-wide v4, p2

    :goto_0
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lg1/g;->e()J

    move-result-wide v0

    invoke-static {v0, v1, v4, v5}, Lg1/g;->t0(JJ)J

    move-result-wide v0

    move-wide v6, v0

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p4

    :goto_1
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    move v8, v0

    goto :goto_2

    :cond_2
    move/from16 v8, p6

    :goto_2
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_3

    sget-object v0, Lg1/j;->a:Lg1/j;

    move-object v9, v0

    goto :goto_3

    :cond_3
    move-object/from16 v9, p7

    :goto_3
    const/4 v10, 0x0

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    :goto_4
    move v11, v0

    goto :goto_5

    :cond_4
    const/4 v0, 0x0

    goto :goto_4

    :goto_5
    move-object v2, p0

    move-object v3, p1

    invoke-interface/range {v2 .. v11}, Lg1/g;->k0(Le1/n;JJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public static l0(Lg1/g;Le1/y;Le1/l;)V
    .locals 8

    sget-wide v2, Ld1/c;->b:J

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lg1/j;->a:Lg1/j;

    const/4 v7, 0x3

    move-object v0, p0

    move-object v1, p1

    move-object v6, p2

    invoke-interface/range {v0 .. v7}, Lg1/g;->T(Le1/y;JFLg1/h;Le1/l;I)V

    return-void
.end method

.method public static synthetic n(Lg1/g;JJJFII)V
    .locals 15

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v10, v2

    goto :goto_0

    :cond_0
    move/from16 v10, p7

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move v11, v3

    goto :goto_1

    :cond_1
    move/from16 v11, p8

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    const/high16 v2, 0x3f800000    # 1.0f

    :cond_2
    move v12, v2

    const/4 v13, 0x0

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_3

    const/4 v0, 0x3

    move v14, v0

    goto :goto_2

    :cond_3
    move v14, v3

    :goto_2
    move-object v3, p0

    move-wide/from16 v4, p1

    move-wide/from16 v6, p3

    move-wide/from16 v8, p5

    invoke-interface/range {v3 .. v14}, Lg1/g;->p0(JJJFIFLe1/l;I)V

    return-void
.end method

.method public static r(Lg1/g;Le1/n;JJJLg1/k;I)V
    .locals 15

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    sget-wide v1, Ld1/c;->b:J

    move-wide v5, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    invoke-interface {p0}, Lg1/g;->e()J

    move-result-wide v1

    invoke-static {v1, v2, v5, v6}, Lg1/g;->t0(JJ)J

    move-result-wide v1

    move-wide v7, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    sget-wide v1, Ld1/a;->a:J

    move-wide v9, v1

    goto :goto_2

    :cond_2
    move-wide/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    :goto_3
    move v11, v1

    goto :goto_4

    :cond_3
    const/4 v1, 0x0

    goto :goto_3

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    sget-object v1, Lg1/j;->a:Lg1/j;

    move-object v12, v1

    goto :goto_5

    :cond_4
    move-object/from16 v12, p8

    :goto_5
    const/4 v13, 0x0

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_5

    const/4 v0, 0x3

    :goto_6
    move v14, v0

    goto :goto_7

    :cond_5
    const/4 v0, 0x0

    goto :goto_6

    :goto_7
    move-object v3, p0

    move-object/from16 v4, p1

    invoke-interface/range {v3 .. v14}, Lg1/g;->s(Le1/n;JJJFLg1/h;Le1/l;I)V

    return-void
.end method

.method public static t0(JJ)J
    .locals 2

    invoke-static {p0, p1}, Ld1/f;->d(J)F

    move-result v0

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {p0, p1}, Ld1/f;->b(J)F

    move-result p0

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result p1

    sub-float/2addr p0, p1

    invoke-static {v0, p0}, Ld7/t;->j(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic z(Lg1/g;Le1/e0;FJ)V
    .locals 9

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lg1/j;->a:Lg1/j;

    const/4 v7, 0x0

    const/4 v8, 0x3

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-interface/range {v0 .. v8}, Lg1/g;->W(Le1/e0;FJFLg1/h;Le1/l;I)V

    return-void
.end method


# virtual methods
.method public abstract A()Lg1/b;
.end method

.method public abstract I(Le1/y;JJJJFLg1/h;Le1/l;II)V
.end method

.method public O()J
    .locals 2

    invoke-interface {p0}, Lg1/g;->A()Lg1/b;

    move-result-object v0

    invoke-virtual {v0}, Lg1/b;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld7/t;->V(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract T(Le1/y;JFLg1/h;Le1/l;I)V
.end method

.method public abstract W(Le1/e0;FJFLg1/h;Le1/l;I)V
.end method

.method public e()J
    .locals 2

    invoke-interface {p0}, Lg1/g;->A()Lg1/b;

    move-result-object v0

    invoke-virtual {v0}, Lg1/b;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract f0(JFFJJFLg1/h;Le1/l;I)V
.end method

.method public abstract getLayoutDirection()Lm2/l;
.end method

.method public abstract i0(JJJFLg1/h;Le1/l;I)V
.end method

.method public abstract k0(Le1/n;JJFLg1/h;Le1/l;I)V
.end method

.method public abstract n0(Le1/d0;Le1/n;FLg1/h;Le1/l;I)V
.end method

.method public abstract p0(JJJFIFLe1/l;I)V
.end method

.method public abstract s(Le1/n;JJJFLg1/h;Le1/l;I)V
.end method

.method public abstract u0(JFJFLg1/h;Le1/l;I)V
.end method
