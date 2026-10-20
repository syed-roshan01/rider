.class public final Lr1/a0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/i1;


# instance fields
.field public a:Lm2/l;

.field public b:F

.field public c:F

.field public final synthetic d:Lr1/f0;


# direct methods
.method public constructor <init>(Lr1/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/a0;->d:Lr1/f0;

    sget-object p1, Lm2/l;->b:Lm2/l;

    iput-object p1, p0, Lr1/a0;->a:Lm2/l;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Lc9/e;)Ljava/util/List;
    .locals 10

    iget-object v0, p0, Lr1/a0;->d:Lr1/f0;

    invoke-virtual {v0}, Lr1/f0;->e()V

    iget-object v1, v0, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    iget-object v2, v1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v2, v2, Lt1/n0;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x3

    if-eq v2, v4, :cond_1

    if-eq v2, v5, :cond_1

    if-eq v2, v3, :cond_1

    const/4 v6, 0x4

    if-ne v2, v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "subcompose can only be used inside the measure or layout blocks"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v6, v0, Lr1/f0;->n:Ljava/util/HashMap;

    invoke-virtual {v6, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x0

    if-nez v7, :cond_5

    iget-object v7, v0, Lr1/f0;->q:Ljava/util/HashMap;

    invoke-virtual {v7, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/node/a;

    if-eqz v7, :cond_3

    iget v3, v0, Lr1/f0;->v:I

    if-lez v3, :cond_2

    add-int/lit8 v3, v3, -0x1

    iput v3, v0, Lr1/f0;->v:I

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {v0, p1}, Lr1/f0;->j(Ljava/lang/Object;)Landroidx/compose/ui/node/a;

    move-result-object v7

    if-nez v7, :cond_4

    iget v7, v0, Lr1/f0;->d:I

    new-instance v9, Landroidx/compose/ui/node/a;

    invoke-direct {v9, v4, v3}, Landroidx/compose/ui/node/a;-><init>(ZI)V

    iput-boolean v4, v1, Landroidx/compose/ui/node/a;->r:Z

    invoke-virtual {v1, v7, v9}, Landroidx/compose/ui/node/a;->v(ILandroidx/compose/ui/node/a;)V

    iput-boolean v8, v1, Landroidx/compose/ui/node/a;->r:Z

    move-object v7, v9

    :cond_4
    :goto_1
    invoke-virtual {v6, p1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    check-cast v7, Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->o()Ljava/util/List;

    move-result-object v3

    iget v6, v0, Lr1/f0;->d:I

    if-ltz v6, :cond_6

    invoke-static {v3}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v9

    if-gt v6, v9, :cond_6

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    if-eq v3, v7, :cond_8

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->o()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    iget v6, v0, Lr1/f0;->d:I

    if-lt v3, v6, :cond_7

    if-eq v6, v3, :cond_8

    iput-boolean v4, v1, Landroidx/compose/ui/node/a;->r:Z

    invoke-virtual {v1, v3, v6, v4}, Landroidx/compose/ui/node/a;->G(III)V

    iput-boolean v8, v1, Landroidx/compose/ui/node/a;->r:Z

    goto :goto_3

    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Key \""

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    :goto_3
    iget v1, v0, Lr1/f0;->d:I

    add-int/2addr v1, v4

    iput v1, v0, Lr1/f0;->d:I

    invoke-virtual {v0, v7, p1, p2}, Lr1/f0;->h(Landroidx/compose/ui/node/a;Ljava/lang/Object;Lc9/e;)V

    if-eq v2, v4, :cond_a

    if-ne v2, v5, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v7}, Landroidx/compose/ui/node/a;->k()Ljava/util/List;

    move-result-object p1

    goto :goto_5

    :cond_a
    :goto_4
    invoke-virtual {v7}, Landroidx/compose/ui/node/a;->l()Ljava/util/List;

    move-result-object p1

    :goto_5
    return-object p1
.end method

.method public final N(IILjava/util/Map;Lc9/c;)Lr1/k0;
    .locals 8

    const/high16 v0, -0x1000000

    and-int v1, p1, v0

    if-nez v1, :cond_0

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    new-instance v0, Lr1/z;

    iget-object v6, p0, Lr1/a0;->d:Lr1/f0;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p0

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lr1/z;-><init>(IILjava/util/Map;Lr1/a0;Lr1/f0;Lc9/c;)V

    return-object v0

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Size("

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " x "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lr1/a0;->b:F

    return v0
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    iget-object v0, p0, Lr1/a0;->a:Lm2/l;

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget v0, p0, Lr1/a0;->c:F

    return v0
.end method

.method public final q()Z
    .locals 2

    iget-object v0, p0, Lr1/a0;->d:Lr1/f0;

    iget-object v0, v0, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v0, v0, Lt1/n0;->c:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
