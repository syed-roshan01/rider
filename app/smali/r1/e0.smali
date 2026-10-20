.class public final Lr1/e0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/f1;


# instance fields
.field public final synthetic a:Lr1/f0;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr1/f0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/e0;->a:Lr1/f0;

    iput-object p2, p0, Lr1/e0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lr1/e0;->a:Lr1/f0;

    invoke-virtual {v0}, Lr1/f0;->e()V

    iget-object v1, v0, Lr1/f0;->q:Ljava/util/HashMap;

    iget-object v2, p0, Lr1/e0;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/node/a;

    if-eqz v1, :cond_2

    iget v2, v0, Lr1/f0;->v:I

    if-lez v2, :cond_1

    iget-object v2, v0, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->o()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->o()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    iget v4, v0, Lr1/f0;->v:I

    sub-int/2addr v3, v4

    if-lt v1, v3, :cond_0

    iget v3, v0, Lr1/f0;->u:I

    const/4 v5, 0x1

    add-int/2addr v3, v5

    iput v3, v0, Lr1/f0;->u:I

    add-int/lit8 v4, v4, -0x1

    iput v4, v0, Lr1/f0;->v:I

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->o()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    iget v4, v0, Lr1/f0;->v:I

    sub-int/2addr v3, v4

    iget v4, v0, Lr1/f0;->u:I

    sub-int/2addr v3, v4

    iput-boolean v5, v2, Landroidx/compose/ui/node/a;->r:Z

    invoke-virtual {v2, v1, v3, v5}, Landroidx/compose/ui/node/a;->G(III)V

    const/4 v1, 0x0

    iput-boolean v1, v2, Landroidx/compose/ui/node/a;->r:Z

    invoke-virtual {v0, v3}, Lr1/f0;->d(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Item is not in pre-composed item range"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No pre-composed items to dispose"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void
.end method

.method public final b()I
    .locals 2

    iget-object v0, p0, Lr1/e0;->a:Lr1/f0;

    iget-object v0, v0, Lr1/f0;->q:Ljava/util/HashMap;

    iget-object v1, p0, Lr1/e0;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->m()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c(IJ)V
    .locals 4

    iget-object v0, p0, Lr1/e0;->a:Lr1/f0;

    iget-object v1, v0, Lr1/f0;->q:Ljava/util/HashMap;

    iget-object v2, p0, Lr1/e0;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/node/a;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->m()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ltz p1, :cond_1

    if-ge p1, v2, :cond_1

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->D()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget-object v0, v0, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    iput-boolean v3, v0, Landroidx/compose/ui/node/a;->r:Z

    invoke-static {v1}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v2

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->m()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/node/a;

    check-cast v2, Lu1/w;

    invoke-virtual {v2, p1, p2, p3}, Lu1/w;->s(Landroidx/compose/ui/node/a;J)V

    const/4 p1, 0x0

    iput-boolean p1, v0, Landroidx/compose/ui/node/a;->r:Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Pre-measure called on node that is not placed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Index ("

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bound of [0, "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    :goto_0
    return-void
.end method
