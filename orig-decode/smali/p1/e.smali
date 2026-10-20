.class public abstract Lp1/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    sput-object v0, Lp1/e;->a:Lm0/n1;

    return-void
.end method

.method public static final a(Lp1/d;Lo1/u;)V
    .locals 10

    sget-object v0, Lp1/e;->a:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget-object v1, Lr8/r;->a:Lr8/r;

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-static {p1}, Lm9/e0;->r(Lo1/u;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lp1/d;->c()V

    :cond_0
    invoke-static {p1}, Lm9/e0;->t(Lo1/u;)Z

    move-result v0

    iget-wide v3, p1, Lo1/u;->b:J

    if-nez v0, :cond_3

    iget-object v0, p1, Lo1/u;->k:Ljava/util/List;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo1/d;

    iget-wide v6, v5, Lo1/d;->a:J

    iget-wide v8, v5, Lo1/d;->c:J

    invoke-virtual {p0, v6, v7, v8, v9}, Lp1/d;->a(JJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    iget-wide v0, p1, Lo1/u;->l:J

    invoke-virtual {p0, v3, v4, v0, v1}, Lp1/d;->a(JJ)V

    :cond_3
    invoke-static {p1}, Lm9/e0;->t(Lo1/u;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-wide v0, p0, Lp1/d;->d:J

    sub-long v0, v3, v0

    const-wide/16 v5, 0x28

    cmp-long p1, v0, v5

    if-lez p1, :cond_4

    invoke-virtual {p0}, Lp1/d;->c()V

    :cond_4
    iput-wide v3, p0, Lp1/d;->d:J

    goto :goto_4

    :cond_5
    invoke-static {p1}, Lm9/e0;->r(Lo1/u;)Z

    move-result v0

    iget-wide v3, p1, Lo1/u;->c:J

    if-eqz v0, :cond_6

    iput-wide v3, p0, Lp1/d;->c:J

    invoke-virtual {p0}, Lp1/d;->c()V

    :cond_6
    iget-object v0, p1, Lo1/u;->k:Ljava/util/List;

    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    move-object v1, v0

    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iget-wide v5, p1, Lo1/u;->g:J

    :goto_3
    if-ge v2, v0, :cond_8

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo1/d;

    iget-wide v8, v7, Lo1/d;->b:J

    invoke-static {v8, v9, v5, v6}, Ld1/c;->f(JJ)J

    move-result-wide v5

    iget-wide v8, p0, Lp1/d;->c:J

    invoke-static {v8, v9, v5, v6}, Ld1/c;->g(JJ)J

    move-result-wide v5

    iput-wide v5, p0, Lp1/d;->c:J

    iget-wide v8, v7, Lo1/d;->a:J

    invoke-virtual {p0, v8, v9, v5, v6}, Lp1/d;->a(JJ)V

    add-int/lit8 v2, v2, 0x1

    iget-wide v5, v7, Lo1/d;->b:J

    goto :goto_3

    :cond_8
    invoke-static {v3, v4, v5, v6}, Ld1/c;->f(JJ)J

    move-result-wide v0

    iget-wide v2, p0, Lp1/d;->c:J

    invoke-static {v2, v3, v0, v1}, Ld1/c;->g(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lp1/d;->c:J

    iget-wide v2, p1, Lo1/u;->b:J

    invoke-virtual {p0, v2, v3, v0, v1}, Lp1/d;->a(JJ)V

    :goto_4
    return-void
.end method

.method public static final b([F[F)F
    .locals 5

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget v3, p0, v2

    aget v4, p1, v2

    mul-float/2addr v3, v4

    add-float/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static final c([F[FI[F)V
    .locals 16

    move/from16 v0, p2

    if-eqz v0, :cond_10

    const/4 v1, 0x2

    if-lt v1, v0, :cond_0

    add-int/lit8 v1, v0, -0x1

    :cond_0
    add-int/lit8 v2, v1, 0x1

    new-array v3, v2, [[F

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_1

    new-array v6, v0, [F

    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move v5, v4

    :goto_1
    const/high16 v6, 0x3f800000    # 1.0f

    if-ge v5, v0, :cond_3

    aget-object v7, v3, v4

    aput v6, v7, v5

    const/4 v6, 0x1

    :goto_2
    if-ge v6, v2, :cond_2

    add-int/lit8 v7, v6, -0x1

    aget-object v7, v3, v7

    aget v7, v7, v5

    aget v8, p0, v5

    mul-float/2addr v7, v8

    aget-object v8, v3, v6

    aput v7, v8, v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    new-array v5, v2, [[F

    move v7, v4

    :goto_3
    if-ge v7, v2, :cond_4

    new-array v8, v0, [F

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    new-array v7, v2, [[F

    move v8, v4

    :goto_4
    if-ge v8, v2, :cond_5

    new-array v9, v2, [F

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_5
    move v8, v4

    :goto_5
    if-ge v8, v2, :cond_d

    aget-object v9, v5, v8

    aget-object v10, v3, v8

    move v11, v4

    :goto_6
    if-ge v11, v0, :cond_6

    aget v12, v10, v11

    aput v12, v9, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_6
    move v10, v4

    :goto_7
    if-ge v10, v8, :cond_8

    aget-object v11, v5, v10

    invoke-static {v9, v11}, Lp1/e;->b([F[F)F

    move-result v12

    move v13, v4

    :goto_8
    if-ge v13, v0, :cond_7

    aget v14, v9, v13

    aget v15, v11, v13

    mul-float/2addr v15, v12

    sub-float/2addr v14, v15

    aput v14, v9, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_8

    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_8
    invoke-static {v9, v9}, Lp1/e;->b([F[F)F

    move-result v10

    float-to-double v10, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    double-to-float v10, v10

    const v11, 0x358637bd    # 1.0E-6f

    cmpg-float v11, v10, v11

    if-ltz v11, :cond_c

    div-float v10, v6, v10

    move v11, v4

    :goto_9
    if-ge v11, v0, :cond_9

    aget v12, v9, v11

    mul-float/2addr v12, v10

    aput v12, v9, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_9
    aget-object v10, v7, v8

    move v11, v4

    :goto_a
    if-ge v11, v2, :cond_b

    if-ge v11, v8, :cond_a

    const/4 v12, 0x0

    goto :goto_b

    :cond_a
    aget-object v12, v3, v11

    invoke-static {v9, v12}, Lp1/e;->b([F[F)F

    move-result v12

    :goto_b
    aput v12, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_a

    :cond_b
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    move v0, v1

    :goto_c
    const/4 v2, -0x1

    if-ge v2, v0, :cond_f

    aget-object v2, v5, v0

    move-object/from16 v3, p1

    invoke-static {v2, v3}, Lp1/e;->b([F[F)F

    move-result v2

    aput v2, p3, v0

    add-int/lit8 v2, v0, 0x1

    if-gt v2, v1, :cond_e

    move v4, v1

    :goto_d
    aget v6, p3, v0

    aget-object v8, v7, v0

    aget v8, v8, v4

    aget v9, p3, v4

    mul-float/2addr v8, v9

    sub-float/2addr v6, v8

    aput v6, p3, v0

    if-eq v4, v2, :cond_e

    add-int/lit8 v4, v4, -0x1

    goto :goto_d

    :cond_e
    aget v2, p3, v0

    aget-object v4, v7, v0

    aget v4, v4, v0

    div-float/2addr v2, v4

    aput v2, p3, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_c

    :cond_f
    return-void

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "At least one point must be provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
