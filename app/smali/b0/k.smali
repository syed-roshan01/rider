.class public final Lb0/k;
.super Ljava/lang/Object;

# interfaces
.implements La0/n;


# instance fields
.field public final a:Lb0/h0;

.field public final b:I


# direct methods
.method public constructor <init>(ILb0/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb0/k;->a:Lb0/h0;

    iput p1, p0, Lb0/k;->b:I

    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget-object v0, p0, Lb0/k;->a:Lb0/h0;

    invoke-virtual {v0}, Lb0/h0;->k()I

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 3

    iget-object v0, p0, Lb0/k;->a:Lb0/h0;

    invoke-virtual {v0}, Lb0/h0;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0}, Lb0/h0;->j()Lb0/q;

    move-result-object v0

    check-cast v0, Lb0/x;

    iget-object v0, v0, Lb0/x;->a:Ljava/util/List;

    invoke-static {v0}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/h;

    check-cast v0, Lb0/g;

    iget v0, v0, Lb0/g;->a:I

    iget v2, p0, Lb0/k;->b:I

    add-int/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lb0/k;->a:Lb0/h0;

    invoke-virtual {v0}, Lb0/h0;->j()Lb0/q;

    move-result-object v0

    check-cast v0, Lb0/x;

    iget-object v0, v0, Lb0/x;->a:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lb0/k;->a:Lb0/h0;

    iget-object v0, v0, Lb0/h0;->x:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/a1;

    if-eqz v0, :cond_0

    check-cast v0, Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->j()V

    :cond_0
    return-void
.end method

.method public final g()I
    .locals 2

    iget-object v0, p0, Lb0/k;->a:Lb0/h0;

    iget v0, v0, Lb0/h0;->f:I

    iget v1, p0, Lb0/k;->b:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method
