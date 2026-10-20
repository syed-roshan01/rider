.class public final Li1/h;
.super Li1/c0;


# instance fields
.field public b:Le1/n;

.field public c:F

.field public d:Ljava/util/List;

.field public e:F

.field public f:F

.field public g:Le1/n;

.field public h:I

.field public i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Lg1/k;

.field public final r:Le1/i;

.field public s:Le1/i;

.field public final t:Lq8/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Li1/h;->c:F

    sget v1, Li1/h0;->a:I

    sget-object v1, Lr8/r;->a:Lr8/r;

    iput-object v1, p0, Li1/h;->d:Ljava/util/List;

    iput v0, p0, Li1/h;->e:F

    const/4 v1, 0x0

    iput v1, p0, Li1/h;->h:I

    iput v1, p0, Li1/h;->i:I

    const/high16 v1, 0x40800000    # 4.0f

    iput v1, p0, Li1/h;->j:F

    iput v0, p0, Li1/h;->l:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Li1/h;->n:Z

    iput-boolean v0, p0, Li1/h;->o:Z

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v0

    iput-object v0, p0, Li1/h;->r:Le1/i;

    iput-object v0, p0, Li1/h;->s:Le1/i;

    sget-object v0, Lq8/d;->a:[Lq8/d;

    sget-object v0, Li1/g;->b:Li1/g;

    invoke-static {v0}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v0

    iput-object v0, p0, Li1/h;->t:Lq8/c;

    return-void
.end method


# virtual methods
.method public final a(Lg1/g;)V
    .locals 13

    iget-boolean v0, p0, Li1/h;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Li1/h;->d:Ljava/util/List;

    iget-object v1, p0, Li1/h;->r:Le1/i;

    invoke-static {v0, v1}, Li1/b;->M(Ljava/util/List;Le1/d0;)V

    invoke-virtual {p0}, Li1/h;->e()V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Li1/h;->p:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Li1/h;->e()V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Li1/h;->n:Z

    iput-boolean v0, p0, Li1/h;->p:Z

    iget-object v3, p0, Li1/h;->b:Le1/n;

    if-eqz v3, :cond_2

    iget-object v2, p0, Li1/h;->s:Le1/i;

    iget v4, p0, Li1/h;->c:F

    const/4 v5, 0x0

    const/16 v6, 0x38

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lg1/g;->D(Lg1/g;Le1/d0;Le1/n;FLg1/k;I)V

    :cond_2
    iget-object v9, p0, Li1/h;->g:Le1/n;

    if-eqz v9, :cond_5

    iget-object v1, p0, Li1/h;->q:Lg1/k;

    iget-boolean v2, p0, Li1/h;->o:Z

    if-nez v2, :cond_4

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v11, v1

    goto :goto_3

    :cond_4
    :goto_2
    new-instance v1, Lg1/k;

    iget v4, p0, Li1/h;->f:F

    iget v5, p0, Li1/h;->j:F

    iget v6, p0, Li1/h;->h:I

    iget v7, p0, Li1/h;->i:I

    const/16 v8, 0x10

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lg1/k;-><init>(FFIII)V

    iput-object v1, p0, Li1/h;->q:Lg1/k;

    iput-boolean v0, p0, Li1/h;->o:Z

    goto :goto_1

    :goto_3
    iget-object v8, p0, Li1/h;->s:Le1/i;

    iget v10, p0, Li1/h;->e:F

    const/16 v12, 0x30

    move-object v7, p1

    invoke-static/range {v7 .. v12}, Lg1/g;->D(Lg1/g;Le1/d0;Le1/n;FLg1/k;I)V

    :cond_5
    return-void
.end method

.method public final e()V
    .locals 7

    iget v0, p0, Li1/h;->k:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    iget-object v2, p0, Li1/h;->r:Le1/i;

    const/high16 v3, 0x3f800000    # 1.0f

    if-nez v0, :cond_0

    iget v0, p0, Li1/h;->l:F

    cmpg-float v0, v0, v3

    if-nez v0, :cond_0

    iput-object v2, p0, Li1/h;->s:Le1/i;

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Li1/h;->s:Le1/i;

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v0

    iput-object v0, p0, Li1/h;->s:Le1/i;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Li1/h;->s:Le1/i;

    iget-object v0, v0, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    move-result-object v0

    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    if-ne v0, v5, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v4

    :goto_0
    iget-object v5, p0, Li1/h;->s:Le1/i;

    iget-object v5, v5, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    iget-object v5, p0, Li1/h;->s:Le1/i;

    invoke-virtual {v5, v0}, Le1/i;->c(I)V

    :goto_1
    iget-object v0, p0, Li1/h;->t:Lq8/c;

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le1/j;

    if-eqz v2, :cond_3

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Le1/i;->a:Landroid/graphics/Path;

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    iget-object v5, v5, Le1/j;->a:Landroid/graphics/PathMeasure;

    invoke-virtual {v5, v2, v4}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le1/j;

    iget-object v2, v2, Le1/j;->a:Landroid/graphics/PathMeasure;

    invoke-virtual {v2}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v2

    iget v4, p0, Li1/h;->k:F

    iget v5, p0, Li1/h;->m:F

    add-float/2addr v4, v5

    rem-float/2addr v4, v3

    mul-float/2addr v4, v2

    iget v6, p0, Li1/h;->l:F

    add-float/2addr v6, v5

    rem-float/2addr v6, v3

    mul-float/2addr v6, v2

    cmpl-float v3, v4, v6

    if-lez v3, :cond_4

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le1/j;

    iget-object v5, p0, Li1/h;->s:Le1/i;

    invoke-virtual {v3, v4, v2, v5}, Le1/j;->a(FFLe1/d0;)V

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1/j;

    iget-object v2, p0, Li1/h;->s:Le1/i;

    invoke-virtual {v0, v1, v6, v2}, Le1/j;->a(FFLe1/d0;)V

    goto :goto_3

    :cond_4
    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1/j;

    iget-object v1, p0, Li1/h;->s:Le1/i;

    invoke-virtual {v0, v4, v6, v1}, Le1/j;->a(FFLe1/d0;)V

    :goto_3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li1/h;->r:Le1/i;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
