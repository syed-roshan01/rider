.class public final Lt/f2;
.super Ljava/lang/Object;

# interfaces
.implements Lt/a2;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:I

.field public c:Lt/t;

.field public d:Lt/t;


# direct methods
.method public constructor <init>(ILjava/util/LinkedHashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt/f2;->a:Ljava/util/Map;

    iput p1, p0, Lt/f2;->b:I

    return-void
.end method


# virtual methods
.method public final c(JLt/t;Lt/t;Lt/t;)Lt/t;
    .locals 16

    move-object/from16 v6, p0

    const-wide/32 v7, 0xf4240

    div-long v0, p1, v7

    const/4 v9, 0x0

    int-to-long v2, v9

    sub-long v10, v0, v2

    const-wide/16 v12, 0x0

    invoke-virtual/range {p0 .. p0}, Lt/f2;->f()I

    move-result v0

    int-to-long v14, v0

    invoke-static/range {v10 .. v15}, Lz6/a;->s(JJJ)J

    move-result-wide v10

    const-wide/16 v0, 0x0

    cmp-long v0, v10, v0

    if-gtz v0, :cond_0

    return-object p5

    :cond_0
    const-wide/16 v0, 0x1

    sub-long v0, v10, v0

    mul-long v1, v0, v7

    move-object/from16 v0, p0

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    invoke-virtual/range {v0 .. v5}, Lt/f2;->d(JLt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object v12

    mul-long v1, v10, v7

    move-object/from16 v0, p0

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    invoke-virtual/range {v0 .. v5}, Lt/f2;->d(JLt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object v0

    iget-object v1, v6, Lt/f2;->c:Lt/t;

    if-nez v1, :cond_1

    invoke-virtual/range {p3 .. p3}, Lt/t;->c()Lt/t;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v6, Lt/f2;->c:Lt/t;

    invoke-virtual/range {p3 .. p3}, Lt/t;->c()Lt/t;

    move-result-object v1

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v6, Lt/f2;->d:Lt/t;

    :cond_1
    invoke-virtual {v12}, Lt/t;->b()I

    move-result v1

    :goto_0
    const/4 v2, 0x0

    const-string v3, "velocityVector"

    if-ge v9, v1, :cond_3

    iget-object v4, v6, Lt/f2;->d:Lt/t;

    if-eqz v4, :cond_2

    invoke-virtual {v12, v9}, Lt/t;->a(I)F

    move-result v2

    invoke-virtual {v0, v9}, Lt/t;->a(I)F

    move-result v3

    sub-float/2addr v2, v3

    const/high16 v3, 0x447a0000    # 1000.0f

    mul-float/2addr v2, v3

    invoke-virtual {v4, v9, v2}, Lt/t;->e(IF)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v3}, Ld7/a;->D(Ljava/lang/String;)V

    throw v2

    :cond_3
    iget-object v0, v6, Lt/f2;->d:Lt/t;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    invoke-static {v3}, Ld7/a;->D(Ljava/lang/String;)V

    throw v2
.end method

.method public final d(JLt/t;Lt/t;Lt/t;)Lt/t;
    .locals 8

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    const/4 p5, 0x0

    int-to-long v0, p5

    sub-long v2, p1, v0

    const-wide/16 v4, 0x0

    invoke-virtual {p0}, Lt/f2;->f()I

    move-result p1

    int-to-long v6, p1

    invoke-static/range {v2 .. v7}, Lz6/a;->s(JJJ)J

    move-result-wide p1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lt/f2;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v0}, Lr8/v;->B0(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq8/f;

    iget-object p1, p1, Lq8/f;->a:Ljava/lang/Object;

    check-cast p1, Lt/t;

    return-object p1

    :cond_0
    iget p2, p0, Lt/f2;->b:I

    if-lt p1, p2, :cond_1

    return-object p4

    :cond_1
    if-gtz p1, :cond_2

    return-object p3

    :cond_2
    sget-object v1, Lt/d0;->c:Lt/b0;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v3, p3

    move v2, p5

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq8/f;

    if-le p1, v5, :cond_4

    if-lt v5, v2, :cond_4

    iget-object v1, v4, Lq8/f;->a:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lt/t;

    iget-object v1, v4, Lq8/f;->b:Ljava/lang/Object;

    check-cast v1, Lt/a0;

    move v2, v5

    goto :goto_0

    :cond_4
    if-ge p1, v5, :cond_3

    if-gt v5, p2, :cond_3

    iget-object p2, v4, Lq8/f;->a:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, Lt/t;

    move p2, v5

    goto :goto_0

    :cond_5
    sub-int/2addr p1, v2

    int-to-float p1, p1

    sub-int/2addr p2, v2

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-interface {v1, p1}, Lt/a0;->a(F)F

    move-result p1

    iget-object p2, p0, Lt/f2;->c:Lt/t;

    if-nez p2, :cond_6

    invoke-virtual {p3}, Lt/t;->c()Lt/t;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {p2, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lt/f2;->c:Lt/t;

    invoke-virtual {p3}, Lt/t;->c()Lt/t;

    move-result-object p2

    invoke-static {p2, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lt/f2;->d:Lt/t;

    :cond_6
    invoke-virtual {v3}, Lt/t;->b()I

    move-result p2

    :goto_1
    const/4 p3, 0x0

    const-string v0, "valueVector"

    if-ge p5, p2, :cond_8

    iget-object v1, p0, Lt/f2;->c:Lt/t;

    if-eqz v1, :cond_7

    invoke-virtual {v3, p5}, Lt/t;->a(I)F

    move-result p3

    invoke-virtual {p4, p5}, Lt/t;->a(I)F

    move-result v0

    sget-object v2, Lt/y1;->a:Lt/x1;

    const/4 v2, 0x1

    int-to-float v2, v2

    sub-float/2addr v2, p1

    mul-float/2addr v2, p3

    mul-float/2addr v0, p1

    add-float/2addr v0, v2

    invoke-virtual {v1, p5, v0}, Lt/t;->e(IF)V

    add-int/lit8 p5, p5, 0x1

    goto :goto_1

    :cond_7
    invoke-static {v0}, Ld7/a;->D(Ljava/lang/String;)V

    throw p3

    :cond_8
    iget-object p1, p0, Lt/f2;->c:Lt/t;

    if-eqz p1, :cond_9

    return-object p1

    :cond_9
    invoke-static {v0}, Ld7/a;->D(Ljava/lang/String;)V

    throw p3
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lt/f2;->b:I

    return v0
.end method
