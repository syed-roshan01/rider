.class public final Li1/c;
.super Li1/c0;


# instance fields
.field public b:[F

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:J

.field public f:Ljava/util/List;

.field public g:Z

.field public h:Le1/i;

.field public i:Lc9/c;

.field public final j:Lh1/b;

.field public k:Ljava/lang/String;

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li1/c;->c:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Li1/c;->d:Z

    sget-wide v1, Le1/r;->g:J

    iput-wide v1, p0, Li1/c;->e:J

    sget v1, Li1/h0;->a:I

    sget-object v1, Lr8/r;->a:Lr8/r;

    iput-object v1, p0, Li1/c;->f:Ljava/util/List;

    iput-boolean v0, p0, Li1/c;->g:Z

    new-instance v1, Lh1/b;

    invoke-direct {v1, p0, v0}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Li1/c;->j:Lh1/b;

    const-string v1, ""

    iput-object v1, p0, Li1/c;->k:Ljava/lang/String;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Li1/c;->o:F

    iput v1, p0, Li1/c;->p:F

    iput-boolean v0, p0, Li1/c;->s:Z

    return-void
.end method


# virtual methods
.method public final a(Lg1/g;)V
    .locals 22

    move-object/from16 v0, p0

    iget-boolean v1, v0, Li1/c;->s:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v0, Li1/c;->b:[F

    if-nez v1, :cond_0

    const/16 v1, 0x10

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    iput-object v1, v0, Li1/c;->b:[F

    goto :goto_0

    :cond_0
    invoke-static {v1}, Le1/a0;->c([F)V

    :goto_0
    iget v4, v0, Li1/c;->q:F

    iget v5, v0, Li1/c;->m:F

    add-float/2addr v4, v5

    iget v5, v0, Li1/c;->r:F

    iget v6, v0, Li1/c;->n:F

    add-float/2addr v5, v6

    invoke-static {v1, v4, v5}, Le1/a0;->e([FFF)V

    iget v4, v0, Li1/c;->l:F

    float-to-double v4, v4

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v4, v6

    const-wide v6, 0x4066800000000000L    # 180.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    double-to-float v6, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    aget v5, v1, v3

    const/4 v7, 0x4

    aget v8, v1, v7

    mul-float v9, v6, v5

    mul-float v10, v4, v8

    add-float/2addr v10, v9

    neg-float v9, v4

    mul-float/2addr v5, v9

    mul-float/2addr v8, v6

    add-float/2addr v8, v5

    aget v5, v1, v2

    const/4 v11, 0x5

    aget v12, v1, v11

    mul-float v13, v6, v5

    mul-float v14, v4, v12

    add-float/2addr v14, v13

    mul-float/2addr v5, v9

    mul-float/2addr v12, v6

    add-float/2addr v12, v5

    const/4 v5, 0x2

    aget v13, v1, v5

    const/4 v15, 0x6

    aget v16, v1, v15

    mul-float v17, v6, v13

    mul-float v18, v4, v16

    add-float v18, v18, v17

    mul-float/2addr v13, v9

    mul-float v16, v16, v6

    add-float v16, v16, v13

    const/4 v13, 0x3

    aget v17, v1, v13

    const/16 v19, 0x7

    aget v20, v1, v19

    mul-float v21, v6, v17

    mul-float v4, v4, v20

    add-float v4, v4, v21

    mul-float v9, v9, v17

    mul-float v6, v6, v20

    add-float/2addr v6, v9

    aput v10, v1, v3

    aput v14, v1, v2

    aput v18, v1, v5

    aput v4, v1, v13

    aput v8, v1, v7

    aput v12, v1, v11

    aput v16, v1, v15

    aput v6, v1, v19

    iget v9, v0, Li1/c;->o:F

    iget v15, v0, Li1/c;->p:F

    mul-float/2addr v10, v9

    aput v10, v1, v3

    mul-float/2addr v14, v9

    aput v14, v1, v2

    mul-float v18, v18, v9

    aput v18, v1, v5

    mul-float/2addr v4, v9

    aput v4, v1, v13

    mul-float/2addr v8, v15

    aput v8, v1, v7

    mul-float/2addr v12, v15

    aput v12, v1, v11

    mul-float v16, v16, v15

    const/4 v4, 0x6

    aput v16, v1, v4

    mul-float/2addr v6, v15

    aput v6, v1, v19

    const/16 v4, 0x8

    aget v5, v1, v4

    const/high16 v6, 0x3f800000    # 1.0f

    mul-float/2addr v5, v6

    aput v5, v1, v4

    const/16 v4, 0x9

    aget v5, v1, v4

    mul-float/2addr v5, v6

    aput v5, v1, v4

    const/16 v4, 0xa

    aget v5, v1, v4

    mul-float/2addr v5, v6

    aput v5, v1, v4

    const/16 v4, 0xb

    aget v5, v1, v4

    mul-float/2addr v5, v6

    aput v5, v1, v4

    iget v4, v0, Li1/c;->m:F

    neg-float v4, v4

    iget v5, v0, Li1/c;->n:F

    neg-float v5, v5

    invoke-static {v1, v4, v5}, Le1/a0;->e([FFF)V

    iput-boolean v3, v0, Li1/c;->s:Z

    :cond_1
    iget-boolean v1, v0, Li1/c;->g:Z

    if-eqz v1, :cond_4

    iget-object v1, v0, Li1/c;->f:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_3

    iget-object v1, v0, Li1/c;->h:Le1/i;

    if-nez v1, :cond_2

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v1

    iput-object v1, v0, Li1/c;->h:Le1/i;

    :cond_2
    iget-object v4, v0, Li1/c;->f:Ljava/util/List;

    invoke-static {v4, v1}, Li1/b;->M(Ljava/util/List;Le1/d0;)V

    :cond_3
    iput-boolean v3, v0, Li1/c;->g:Z

    :cond_4
    invoke-interface/range {p1 .. p1}, Lg1/g;->A()Lg1/b;

    move-result-object v1

    invoke-virtual {v1}, Lg1/b;->b()J

    move-result-wide v4

    invoke-virtual {v1}, Lg1/b;->a()Le1/p;

    move-result-object v6

    invoke-interface {v6}, Le1/p;->j()V

    iget-object v6, v0, Li1/c;->b:[F

    iget-object v7, v1, Lg1/b;->a:Lg1/d;

    if-eqz v6, :cond_5

    iget-object v8, v7, Lg1/d;->a:Lg1/b;

    invoke-virtual {v8}, Lg1/b;->a()Le1/p;

    move-result-object v8

    invoke-interface {v8, v6}, Le1/p;->q([F)V

    :cond_5
    iget-object v6, v0, Li1/c;->h:Le1/i;

    iget-object v8, v0, Li1/c;->f:Ljava/util/List;

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v2

    if-eqz v8, :cond_6

    if-eqz v6, :cond_6

    iget-object v7, v7, Lg1/d;->a:Lg1/b;

    invoke-virtual {v7}, Lg1/b;->a()Le1/p;

    move-result-object v7

    invoke-interface {v7, v6, v2}, Le1/p;->t(Le1/d0;I)V

    :cond_6
    iget-object v2, v0, Li1/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    :goto_1
    if-ge v3, v6, :cond_7

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li1/c0;

    move-object/from16 v8, p1

    invoke-virtual {v7, v8}, Li1/c0;->a(Lg1/g;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    invoke-virtual {v1}, Lg1/b;->a()Le1/p;

    move-result-object v2

    invoke-interface {v2}, Le1/p;->h()V

    invoke-virtual {v1, v4, v5}, Lg1/b;->c(J)V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final b()Lc9/c;
    .locals 1

    iget-object v0, p0, Li1/c;->i:Lc9/c;

    return-object v0
.end method

.method public final d(Lh1/b;)V
    .locals 0

    iput-object p1, p0, Li1/c;->i:Lc9/c;

    return-void
.end method

.method public final e(ILi1/c0;)V
    .locals 2

    iget-object v0, p0, Li1/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {p0, p2}, Li1/c;->g(Li1/c0;)V

    iget-object p1, p0, Li1/c;->j:Lh1/b;

    invoke-virtual {p2, p1}, Li1/c0;->d(Lh1/b;)V

    invoke-virtual {p0}, Li1/c0;->c()V

    return-void
.end method

.method public final f(J)V
    .locals 6

    iget-boolean v0, p0, Li1/c;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Le1/r;->g:J

    cmp-long v2, p1, v0

    if-eqz v2, :cond_3

    iget-wide v2, p0, Li1/c;->e:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_1

    iput-wide p1, p0, Li1/c;->e:J

    goto :goto_0

    :cond_1
    sget v4, Li1/h0;->a:I

    invoke-static {v2, v3}, Le1/r;->h(J)F

    move-result v4

    invoke-static {p1, p2}, Le1/r;->h(J)F

    move-result v5

    cmpg-float v4, v4, v5

    if-nez v4, :cond_2

    invoke-static {v2, v3}, Le1/r;->g(J)F

    move-result v4

    invoke-static {p1, p2}, Le1/r;->g(J)F

    move-result v5

    cmpg-float v4, v4, v5

    if-nez v4, :cond_2

    invoke-static {v2, v3}, Le1/r;->e(J)F

    move-result v2

    invoke-static {p1, p2}, Le1/r;->e(J)F

    move-result p1

    cmpg-float p1, v2, p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Li1/c;->d:Z

    iput-wide v0, p0, Li1/c;->e:J

    :cond_3
    :goto_0
    return-void
.end method

.method public final g(Li1/c0;)V
    .locals 4

    instance-of v0, p1, Li1/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    check-cast p1, Li1/h;

    iget-object v0, p1, Li1/h;->b:Le1/n;

    iget-boolean v2, p0, Li1/c;->d:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_2

    instance-of v2, v0, Le1/n0;

    if-eqz v2, :cond_1

    check-cast v0, Le1/n0;

    iget-wide v2, v0, Le1/n0;->a:J

    invoke-virtual {p0, v2, v3}, Li1/c;->f(J)V

    goto :goto_0

    :cond_1
    iput-boolean v1, p0, Li1/c;->d:Z

    sget-wide v2, Le1/r;->g:J

    iput-wide v2, p0, Li1/c;->e:J

    :cond_2
    :goto_0
    iget-object p1, p1, Li1/h;->g:Le1/n;

    iget-boolean v0, p0, Li1/c;->d:Z

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_7

    instance-of v0, p1, Le1/n0;

    if-eqz v0, :cond_4

    check-cast p1, Le1/n0;

    iget-wide v0, p1, Le1/n0;->a:J

    invoke-virtual {p0, v0, v1}, Li1/c;->f(J)V

    goto :goto_1

    :cond_4
    iput-boolean v1, p0, Li1/c;->d:Z

    sget-wide v0, Le1/r;->g:J

    iput-wide v0, p0, Li1/c;->e:J

    goto :goto_1

    :cond_5
    instance-of v0, p1, Li1/c;

    if-eqz v0, :cond_7

    check-cast p1, Li1/c;

    iget-boolean v0, p1, Li1/c;->d:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Li1/c;->d:Z

    if-eqz v0, :cond_6

    iget-wide v0, p1, Li1/c;->e:J

    invoke-virtual {p0, v0, v1}, Li1/c;->f(J)V

    goto :goto_1

    :cond_6
    iput-boolean v1, p0, Li1/c;->d:Z

    sget-wide v0, Le1/r;->g:J

    iput-wide v0, p0, Li1/c;->e:J

    :cond_7
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VGroup: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Li1/c;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li1/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li1/c0;

    const-string v5, "\t"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
