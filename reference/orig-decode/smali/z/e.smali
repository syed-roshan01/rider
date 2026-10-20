.class public final Lz/e;
.super Ljava/lang/Object;

# interfaces
.implements La0/n;


# instance fields
.field public final a:Lz/g0;

.field public final b:I


# direct methods
.method public constructor <init>(Lz/g0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/e;->a:Lz/g0;

    iput p2, p0, Lz/e;->b:I

    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget-object v0, p0, Lz/e;->a:Lz/g0;

    iget-object v0, v0, Lz/g0;->d:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/u;

    check-cast v0, Lz/w;

    iget v0, v0, Lz/w;->j:I

    return v0
.end method

.method public final d()I
    .locals 3

    invoke-virtual {p0}, Lz/e;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lz/e;->a:Lz/g0;

    iget-object v1, v1, Lz/g0;->d:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/u;

    check-cast v1, Lz/w;

    iget-object v1, v1, Lz/w;->g:Ljava/util/List;

    invoke-static {v1}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/k;

    check-cast v1, Lz/x;

    iget v1, v1, Lz/x;->a:I

    iget v2, p0, Lz/e;->b:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lz/e;->a:Lz/g0;

    iget-object v0, v0, Lz/g0;->d:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/u;

    check-cast v0, Lz/w;

    iget-object v0, v0, Lz/w;->g:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lz/e;->a:Lz/g0;

    iget-object v0, v0, Lz/g0;->m:Lr1/a1;

    if-eqz v0, :cond_0

    check-cast v0, Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->j()V

    :cond_0
    return-void
.end method

.method public final g()I
    .locals 2

    iget-object v0, p0, Lz/e;->a:Lz/g0;

    iget-object v0, v0, Lz/g0;->c:Lz/z;

    iget-object v0, v0, Lz/z;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    iget v1, p0, Lz/e;->b:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method
