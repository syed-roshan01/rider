.class public final Lp1/c;
.super Ljava/lang/Object;


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:[Lp1/a;

.field public e:I

.field public final f:[F

.field public final g:[F

.field public final h:[F


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp1/c;->a:Z

    const/4 v0, 0x1

    iput v0, p0, Lp1/c;->b:I

    invoke-static {v0}, Lt/k;->e(I)I

    move-result v1

    const/4 v2, 0x3

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_1
    move v0, v2

    :goto_0
    iput v0, p0, Lp1/c;->c:I

    const/16 v0, 0x14

    new-array v1, v0, [Lp1/a;

    iput-object v1, p0, Lp1/c;->d:[Lp1/a;

    new-array v1, v0, [F

    iput-object v1, p0, Lp1/c;->f:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lp1/c;->g:[F

    new-array v0, v2, [F

    iput-object v0, p0, Lp1/c;->h:[F

    return-void
.end method


# virtual methods
.method public final a(FJ)V
    .locals 3

    iget v0, p0, Lp1/c;->e:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v0, v0, 0x14

    iput v0, p0, Lp1/c;->e:I

    sget-object v1, Lp1/e;->a:Lm0/n1;

    iget-object v1, p0, Lp1/c;->d:[Lp1/a;

    aget-object v2, v1, v0

    if-nez v2, :cond_0

    new-instance v2, Lp1/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-wide p2, v2, Lp1/a;->a:J

    iput p1, v2, Lp1/a;->b:F

    aput-object v2, v1, v0

    goto :goto_0

    :cond_0
    iput-wide p2, v2, Lp1/a;->a:J

    iput p1, v2, Lp1/a;->b:F

    :goto_0
    return-void
.end method

.method public final b(F)F
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-lez v3, :cond_13

    iget v3, v0, Lp1/c;->e:I

    iget-object v4, v0, Lp1/c;->d:[Lp1/a;

    aget-object v5, v4, v3

    if-nez v5, :cond_0

    move v3, v2

    goto/16 :goto_9

    :cond_0
    move-object v7, v5

    const/4 v8, 0x0

    :goto_0
    aget-object v9, v4, v3

    const/4 v10, 0x1

    iget-object v11, v0, Lp1/c;->f:[F

    iget-object v12, v0, Lp1/c;->g:[F

    if-nez v9, :cond_1

    goto :goto_2

    :cond_1
    iget-wide v13, v5, Lp1/a;->a:J

    move v15, v3

    iget-wide v2, v9, Lp1/a;->a:J

    sub-long/2addr v13, v2

    long-to-float v13, v13

    iget-wide v6, v7, Lp1/a;->a:J

    sub-long/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    long-to-float v2, v2

    const/high16 v3, 0x42c80000    # 100.0f

    cmpl-float v3, v13, v3

    if-gtz v3, :cond_5

    const/high16 v3, 0x42200000    # 40.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_2

    goto :goto_2

    :cond_2
    iget v2, v9, Lp1/a;->b:F

    aput v2, v11, v8

    neg-float v2, v13

    aput v2, v12, v8

    const/16 v2, 0x14

    if-nez v15, :cond_3

    move v3, v2

    goto :goto_1

    :cond_3
    move v3, v15

    :goto_1
    sub-int/2addr v3, v10

    add-int/lit8 v8, v8, 0x1

    if-lt v8, v2, :cond_4

    goto :goto_2

    :cond_4
    move-object v7, v9

    const/4 v2, 0x0

    goto :goto_0

    :cond_5
    :goto_2
    iget v2, v0, Lp1/c;->c:I

    if-lt v8, v2, :cond_10

    iget v2, v0, Lp1/c;->b:I

    invoke-static {v2}, Lt/k;->e(I)I

    move-result v2

    if-eqz v2, :cond_f

    if-ne v2, v10, :cond_e

    sget-object v2, Lp1/e;->a:Lm0/n1;

    const/4 v2, 0x2

    if-ge v8, v2, :cond_6

    :catch_0
    :goto_3
    const/4 v3, 0x0

    goto/16 :goto_8

    :cond_6
    iget-boolean v3, v0, Lp1/c;->a:Z

    if-ne v8, v2, :cond_9

    const/4 v4, 0x0

    aget v2, v12, v4

    aget v5, v12, v10

    cmpg-float v6, v2, v5

    if-nez v6, :cond_7

    goto :goto_3

    :cond_7
    if-eqz v3, :cond_8

    aget v3, v11, v4

    goto :goto_4

    :cond_8
    aget v3, v11, v4

    aget v4, v11, v10

    sub-float/2addr v3, v4

    :goto_4
    sub-float/2addr v2, v5

    div-float/2addr v3, v2

    goto :goto_8

    :cond_9
    sub-int/2addr v8, v10

    move v4, v8

    const/4 v5, 0x0

    :goto_5
    if-lez v4, :cond_d

    aget v6, v12, v4

    add-int/lit8 v7, v4, -0x1

    aget v9, v12, v7

    cmpg-float v6, v6, v9

    if-nez v6, :cond_a

    goto :goto_7

    :cond_a
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v6

    int-to-float v9, v2

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v10

    mul-float/2addr v10, v9

    float-to-double v9, v10

    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    double-to-float v9, v9

    mul-float/2addr v6, v9

    if-eqz v3, :cond_b

    aget v9, v11, v7

    neg-float v9, v9

    goto :goto_6

    :cond_b
    aget v9, v11, v4

    aget v10, v11, v7

    sub-float/2addr v9, v10

    :goto_6
    aget v10, v12, v4

    aget v7, v12, v7

    sub-float/2addr v10, v7

    div-float/2addr v9, v10

    sub-float v6, v9, v6

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v7

    mul-float/2addr v7, v6

    add-float/2addr v5, v7

    if-ne v4, v8, :cond_c

    const/high16 v6, 0x3f000000    # 0.5f

    mul-float/2addr v5, v6

    :cond_c
    :goto_7
    add-int/lit8 v4, v4, -0x1

    goto :goto_5

    :cond_d
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v3

    int-to-float v2, v2

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v4

    mul-float/2addr v4, v2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v2, v4

    mul-float/2addr v3, v2

    goto :goto_8

    :cond_e
    new-instance v1, Landroidx/fragment/app/a0;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_f
    :try_start_0
    iget-object v2, v0, Lp1/c;->h:[F

    invoke-static {v12, v11, v8, v2}, Lp1/e;->c([F[FI[F)V

    aget v2, v2, v10
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move v3, v2

    :goto_8
    const/16 v2, 0x3e8

    int-to-float v2, v2

    mul-float/2addr v3, v2

    const/4 v2, 0x0

    goto :goto_9

    :cond_10
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_9
    cmpg-float v4, v3, v2

    if-nez v4, :cond_11

    goto :goto_a

    :cond_11
    cmpl-float v2, v3, v2

    if-lez v2, :cond_12

    invoke-static {v3, v1}, Lz6/a;->o(FF)F

    move-result v2

    goto :goto_a

    :cond_12
    neg-float v1, v1

    invoke-static {v3, v1}, Lz6/a;->m(FF)F

    move-result v2

    :goto_a
    return v2

    :cond_13
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "maximumVelocity should be a positive value. You specified="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
