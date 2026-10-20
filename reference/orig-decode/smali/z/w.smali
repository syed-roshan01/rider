.class public final Lz/w;
.super Ljava/lang/Object;

# interfaces
.implements Lz/u;
.implements Lr1/k0;


# instance fields
.field public final a:Lz/x;

.field public b:I

.field public c:Z

.field public d:F

.field public final e:F

.field public final f:Z

.field public final g:Ljava/util/List;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final synthetic k:Lr1/k0;


# direct methods
.method public constructor <init>(Lz/x;IZFLr1/k0;FZLjava/util/List;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/w;->a:Lz/x;

    iput p2, p0, Lz/w;->b:I

    iput-boolean p3, p0, Lz/w;->c:Z

    iput p4, p0, Lz/w;->d:F

    iput p6, p0, Lz/w;->e:F

    iput-boolean p7, p0, Lz/w;->f:Z

    iput-object p8, p0, Lz/w;->g:Ljava/util/List;

    iput p9, p0, Lz/w;->h:I

    iput p10, p0, Lz/w;->i:I

    iput p11, p0, Lz/w;->j:I

    iput-object p5, p0, Lz/w;->k:Lr1/k0;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lz/w;->k:Lr1/k0;

    invoke-interface {v0}, Lr1/k0;->a()I

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lz/w;->k:Lr1/k0;

    invoke-interface {v0}, Lr1/k0;->b()I

    move-result v0

    return v0
.end method

.method public final c(IZ)Z
    .locals 11

    iget-boolean v0, p0, Lz/w;->f:Z

    const/4 v1, 0x0

    if-nez v0, :cond_a

    iget-object v0, p0, Lz/w;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p0, Lz/w;->a:Lz/x;

    if-eqz v2, :cond_a

    iget v3, p0, Lz/w;->b:I

    sub-int/2addr v3, p1

    if-ltz v3, :cond_a

    iget v2, v2, Lz/x;->o:I

    if-ge v3, v2, :cond_a

    invoke-static {v0}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz/x;

    invoke-static {v0}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz/x;

    iget-boolean v4, v2, Lz/x;->q:Z

    if-nez v4, :cond_a

    iget-boolean v4, v3, Lz/x;->q:Z

    if-eqz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    iget v4, p0, Lz/w;->i:I

    iget v5, p0, Lz/w;->h:I

    if-gez p1, :cond_1

    iget v6, v2, Lz/x;->m:I

    iget v2, v2, Lz/x;->o:I

    add-int/2addr v6, v2

    sub-int/2addr v6, v5

    iget v2, v3, Lz/x;->m:I

    iget v3, v3, Lz/x;->o:I

    add-int/2addr v2, v3

    sub-int/2addr v2, v4

    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    neg-int v3, p1

    if-le v2, v3, :cond_a

    goto :goto_0

    :cond_1
    iget v2, v2, Lz/x;->m:I

    sub-int/2addr v5, v2

    iget v2, v3, Lz/x;->m:I

    sub-int/2addr v4, v2

    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-le v2, p1, :cond_a

    :goto_0
    iget v2, p0, Lz/w;->b:I

    sub-int/2addr v2, p1

    iput v2, p0, Lz/w;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v2, :cond_8

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz/x;

    iget-boolean v6, v5, Lz/x;->q:Z

    if-eqz v6, :cond_2

    goto :goto_4

    :cond_2
    iget v6, v5, Lz/x;->m:I

    add-int/2addr v6, p1

    iput v6, v5, Lz/x;->m:I

    iget-object v6, v5, Lz/x;->s:[I

    array-length v7, v6

    move v8, v1

    :goto_2
    if-ge v8, v7, :cond_6

    iget-boolean v9, v5, Lz/x;->c:Z

    if-eqz v9, :cond_3

    rem-int/lit8 v10, v8, 0x2

    if-eq v10, v4, :cond_4

    :cond_3
    if-nez v9, :cond_5

    rem-int/lit8 v9, v8, 0x2

    if-nez v9, :cond_5

    :cond_4
    aget v9, v6, v8

    add-int/2addr v9, p1

    aput v9, v6, v8

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_6
    if-eqz p2, :cond_7

    iget-object v4, v5, Lz/x;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    move v6, v1

    :goto_3
    if-ge v6, v4, :cond_7

    iget-object v7, v5, Lz/x;->l:Lz/j;

    iget-object v7, v7, Lz/j;->a:Ljava/util/LinkedHashMap;

    iget-object v8, v5, Lz/x;->j:Ljava/lang/Object;

    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz/h;

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_8
    int-to-float p2, p1

    iput p2, p0, Lz/w;->d:F

    iget-boolean p2, p0, Lz/w;->c:Z

    if-nez p2, :cond_9

    if-lez p1, :cond_9

    iput-boolean v4, p0, Lz/w;->c:Z

    :cond_9
    move v1, v4

    :cond_a
    :goto_5
    return v1
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lz/w;->k:Lr1/k0;

    invoke-interface {v0}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lz/w;->k:Lr1/k0;

    invoke-interface {v0}, Lr1/k0;->e()V

    return-void
.end method
