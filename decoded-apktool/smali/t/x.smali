.class public final Lt/x;
.super Ljava/lang/Object;

# interfaces
.implements Lt/j;


# instance fields
.field public final a:Lt/d2;

.field public final b:Lt/x1;

.field public final c:Ljava/lang/Object;

.field public final d:Lt/t;

.field public final e:Lt/t;

.field public final f:Lt/t;

.field public final g:Ljava/lang/Object;

.field public final h:J


# direct methods
.method public constructor <init>(Lt/y;Lt/x1;Ljava/lang/Object;Lt/t;)V
    .locals 10

    new-instance v0, Lt/d2;

    iget-object p1, p1, Lt/y;->a:Lt/g0;

    invoke-direct {v0, p1}, Lt/d2;-><init>(Lt/g0;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lt/x;->a:Lt/d2;

    iput-object p2, p0, Lt/x;->b:Lt/x1;

    iput-object p3, p0, Lt/x;->c:Ljava/lang/Object;

    iget-object p1, p2, Lt/x1;->a:Lc9/c;

    invoke-interface {p1, p3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt/t;

    iput-object p1, p0, Lt/x;->d:Lt/t;

    invoke-static {p4}, Lt/e;->j(Lt/t;)Lt/t;

    move-result-object p3

    iput-object p3, p0, Lt/x;->e:Lt/t;

    invoke-virtual {v0, p1, p4}, Lt/d2;->a(Lt/t;Lt/t;)Lt/t;

    move-result-object p3

    iget-object p2, p2, Lt/x1;->b:Lc9/c;

    invoke-interface {p2, p3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Lt/x;->g:Ljava/lang/Object;

    iget-object p2, v0, Lt/d2;->c:Lt/t;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lt/t;->c()Lt/t;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {p2, p3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, v0, Lt/d2;->c:Lt/t;

    :cond_0
    iget-object p2, v0, Lt/d2;->c:Lt/t;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lt/t;->b()I

    move-result p2

    const/4 p3, 0x0

    const-wide/16 v1, 0x0

    move v3, p3

    :goto_0
    if-ge v3, p2, :cond_1

    invoke-virtual {p1, v3}, Lt/t;->a(I)F

    invoke-virtual {p4, v3}, Lt/t;->a(I)F

    move-result v4

    iget-object v5, v0, Lt/d2;->a:Lt/g0;

    check-cast v5, Ls/z0;

    iget-object v5, v5, Ls/z0;->a:Ls/u0;

    invoke-virtual {v5, v4}, Ls/u0;->b(F)D

    move-result-wide v4

    sget v6, Ls/v0;->a:F

    float-to-double v6, v6

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v6, v8

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    move-result-wide v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    mul-double/2addr v4, v6

    double-to-long v4, v4

    const-wide/32 v6, 0xf4240

    mul-long/2addr v4, v6

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iput-wide v1, p0, Lt/x;->h:J

    iget-object p1, p0, Lt/x;->a:Lt/d2;

    iget-object p2, p0, Lt/x;->d:Lt/t;

    invoke-virtual {p1, v1, v2, p2, p4}, Lt/d2;->b(JLt/t;Lt/t;)Lt/t;

    move-result-object p1

    invoke-static {p1}, Lt/e;->j(Lt/t;)Lt/t;

    move-result-object p1

    iput-object p1, p0, Lt/x;->f:Lt/t;

    invoke-virtual {p1}, Lt/t;->b()I

    move-result p1

    :goto_1
    if-ge p3, p1, :cond_2

    iget-object p2, p0, Lt/x;->f:Lt/t;

    invoke-virtual {p2, p3}, Lt/t;->a(I)F

    move-result p4

    iget-object v0, p0, Lt/x;->a:Lt/d2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lt/x;->a:Lt/d2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/high16 v1, -0x80000000

    invoke-static {p4, v1, v0}, Lz6/a;->q(FFF)F

    move-result p4

    invoke-virtual {p2, p3, p4}, Lt/t;->e(IF)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    const-string p1, "velocityVector"

    invoke-static {p1}, Ld7/a;->D(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b(J)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-interface/range {p0 .. p2}, Lt/j;->g(J)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v0, Lt/x;->b:Lt/x1;

    iget-object v1, v1, Lt/x1;->b:Lc9/c;

    iget-object v2, v0, Lt/x;->a:Lt/d2;

    iget-object v3, v2, Lt/d2;->b:Lt/t;

    iget-object v4, v0, Lt/x;->d:Lt/t;

    if-nez v3, :cond_0

    invoke-virtual {v4}, Lt/t;->c()Lt/t;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {v3, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v2, Lt/d2;->b:Lt/t;

    :cond_0
    iget-object v3, v2, Lt/d2;->b:Lt/t;

    const-string v6, "valueVector"

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lt/t;->b()I

    move-result v3

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_3

    iget-object v8, v2, Lt/d2;->b:Lt/t;

    if-eqz v8, :cond_2

    invoke-virtual {v4, v7}, Lt/t;->a(I)F

    move-result v9

    iget-object v10, v0, Lt/x;->e:Lt/t;

    invoke-virtual {v10, v7}, Lt/t;->a(I)F

    move-result v10

    iget-object v11, v2, Lt/d2;->a:Lt/g0;

    check-cast v11, Ls/z0;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v12, 0xf4240

    div-long v12, p1, v12

    iget-object v11, v11, Ls/z0;->a:Ls/u0;

    invoke-virtual {v11, v10}, Ls/u0;->a(F)Ls/t0;

    move-result-object v10

    const-wide/16 v14, 0x0

    move-object/from16 v16, v6

    iget-wide v5, v10, Ls/t0;->c:J

    cmp-long v14, v5, v14

    if-lez v14, :cond_1

    long-to-float v12, v12

    long-to-float v5, v5

    div-float/2addr v12, v5

    goto :goto_1

    :cond_1
    const/high16 v12, 0x3f800000    # 1.0f

    :goto_1
    iget v5, v10, Ls/t0;->a:F

    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v5

    iget v6, v10, Ls/t0;->b:F

    mul-float/2addr v5, v6

    invoke-static {v12}, Ls/b;->a(F)Ls/a;

    move-result-object v6

    iget v6, v6, Ls/a;->a:F

    mul-float/2addr v5, v6

    add-float/2addr v5, v9

    invoke-virtual {v8, v7, v5}, Lt/t;->e(IF)V

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v6, v16

    goto :goto_0

    :cond_2
    move-object/from16 v16, v6

    invoke-static/range {v16 .. v16}, Ld7/a;->D(Ljava/lang/String;)V

    const/4 v3, 0x0

    throw v3

    :cond_3
    move-object/from16 v16, v6

    const/4 v3, 0x0

    iget-object v2, v2, Lt/d2;->b:Lt/t;

    if-eqz v2, :cond_4

    invoke-interface {v1, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_4
    invoke-static/range {v16 .. v16}, Ld7/a;->D(Ljava/lang/String;)V

    throw v3

    :cond_5
    move-object/from16 v16, v6

    const/4 v3, 0x0

    invoke-static/range {v16 .. v16}, Ld7/a;->D(Ljava/lang/String;)V

    throw v3

    :cond_6
    iget-object v1, v0, Lt/x;->g:Ljava/lang/Object;

    return-object v1
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lt/x;->h:J

    return-wide v0
.end method

.method public final d()Lt/x1;
    .locals 1

    iget-object v0, p0, Lt/x;->b:Lt/x1;

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt/x;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(J)Lt/t;
    .locals 3

    invoke-interface {p0, p1, p2}, Lt/j;->g(J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lt/x;->d:Lt/t;

    iget-object v1, p0, Lt/x;->e:Lt/t;

    iget-object v2, p0, Lt/x;->a:Lt/d2;

    invoke-virtual {v2, p1, p2, v0, v1}, Lt/d2;->b(JLt/t;Lt/t;)Lt/t;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lt/x;->f:Lt/t;

    return-object p1
.end method
