.class public final Lt/d2;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lt/g0;

.field public b:Lt/t;

.field public c:Lt/t;

.field public d:Lt/t;


# direct methods
.method public constructor <init>(Lt/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/d2;->a:Lt/g0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Lt/t;Lt/t;)Lt/t;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lt/d2;->d:Lt/t;

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lt/t;->c()Lt/t;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lt/d2;->d:Lt/t;

    :cond_0
    iget-object v1, v0, Lt/d2;->d:Lt/t;

    const-string v3, "targetVector"

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lt/t;->b()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    iget-object v5, v0, Lt/d2;->d:Lt/t;

    if-eqz v5, :cond_1

    move-object/from16 v6, p1

    invoke-virtual {v6, v4}, Lt/t;->a(I)F

    move-result v7

    move-object/from16 v8, p2

    invoke-virtual {v8, v4}, Lt/t;->a(I)F

    move-result v9

    iget-object v10, v0, Lt/d2;->a:Lt/g0;

    check-cast v10, Ls/z0;

    iget-object v10, v10, Ls/z0;->a:Ls/u0;

    invoke-virtual {v10, v9}, Ls/u0;->b(F)D

    move-result-wide v11

    sget v13, Ls/v0;->a:F

    float-to-double v13, v13

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    sub-double v15, v13, v15

    iget v2, v10, Ls/u0;->a:F

    iget v10, v10, Ls/u0;->b:F

    mul-float/2addr v2, v10

    move v10, v1

    float-to-double v1, v2

    div-double/2addr v13, v15

    mul-double/2addr v13, v11

    invoke-static {v13, v14}, Ljava/lang/Math;->exp(D)D

    move-result-wide v11

    mul-double/2addr v11, v1

    double-to-float v1, v11

    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    move-result v2

    mul-float/2addr v2, v1

    add-float/2addr v2, v7

    invoke-virtual {v5, v4, v2}, Lt/t;->e(IF)V

    add-int/lit8 v4, v4, 0x1

    move v1, v10

    goto :goto_0

    :cond_1
    invoke-static {v3}, Ld7/a;->D(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    :cond_2
    const/4 v1, 0x0

    iget-object v2, v0, Lt/d2;->d:Lt/t;

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    invoke-static {v3}, Ld7/a;->D(Ljava/lang/String;)V

    throw v1

    :cond_4
    const/4 v1, 0x0

    invoke-static {v3}, Ld7/a;->D(Ljava/lang/String;)V

    throw v1
.end method

.method public final b(JLt/t;Lt/t;)Lt/t;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lt/d2;->c:Lt/t;

    if-nez v1, :cond_0

    invoke-virtual/range {p3 .. p3}, Lt/t;->c()Lt/t;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lt/d2;->c:Lt/t;

    :cond_0
    iget-object v1, v0, Lt/d2;->c:Lt/t;

    const/4 v2, 0x0

    const-string v3, "velocityVector"

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lt/t;->b()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    iget-object v5, v0, Lt/d2;->c:Lt/t;

    if-eqz v5, :cond_2

    move-object/from16 v6, p3

    invoke-virtual {v6, v4}, Lt/t;->a(I)F

    move-object/from16 v7, p4

    invoke-virtual {v7, v4}, Lt/t;->a(I)F

    move-result v8

    iget-object v9, v0, Lt/d2;->a:Lt/g0;

    check-cast v9, Ls/z0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v10, 0xf4240

    div-long v10, p1, v10

    iget-object v9, v9, Ls/z0;->a:Ls/u0;

    invoke-virtual {v9, v8}, Ls/u0;->a(F)Ls/t0;

    move-result-object v8

    iget-wide v12, v8, Ls/t0;->c:J

    const-wide/16 v14, 0x0

    cmp-long v9, v12, v14

    if-lez v9, :cond_1

    long-to-float v9, v10

    long-to-float v10, v12

    div-float/2addr v9, v10

    goto :goto_1

    :cond_1
    const/high16 v9, 0x3f800000    # 1.0f

    :goto_1
    invoke-static {v9}, Ls/b;->a(F)Ls/a;

    move-result-object v9

    iget v10, v8, Ls/t0;->a:F

    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    move-result v10

    iget v9, v9, Ls/a;->b:F

    mul-float/2addr v10, v9

    iget v8, v8, Ls/t0;->b:F

    mul-float/2addr v10, v8

    long-to-float v8, v12

    div-float/2addr v10, v8

    const/high16 v8, 0x447a0000    # 1000.0f

    mul-float/2addr v10, v8

    invoke-virtual {v5, v4, v10}, Lt/t;->e(IF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v3}, Ld7/a;->D(Ljava/lang/String;)V

    throw v2

    :cond_3
    iget-object v1, v0, Lt/d2;->c:Lt/t;

    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    invoke-static {v3}, Ld7/a;->D(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v3}, Ld7/a;->D(Ljava/lang/String;)V

    throw v2
.end method
