.class public final Lr1/y;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/i1;
.implements Lr1/l0;


# instance fields
.field public final synthetic a:Lr1/a0;

.field public final synthetic b:Lr1/f0;


# direct methods
.method public constructor <init>(Lr1/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/y;->b:Lr1/f0;

    iget-object p1, p1, Lr1/f0;->o:Lr1/a0;

    iput-object p1, p0, Lr1/y;->a:Lr1/a0;

    return-void
.end method


# virtual methods
.method public final E(J)I
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-interface {v0, p1, p2}, Lm2/b;->E(J)I

    move-result p1

    return p1
.end method

.method public final F(J)F
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-interface {v0, p1, p2}, Lm2/b;->F(J)F

    move-result p1

    return p1
.end method

.method public final H(Ljava/lang/Object;Lc9/e;)Ljava/util/List;
    .locals 4

    iget-object v0, p0, Lr1/y;->b:Lr1/f0;

    iget-object v1, v0, Lr1/f0;->n:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/node/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->l()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    iget-object v1, v0, Lr1/f0;->t:Lo0/i;

    iget v2, v1, Lo0/i;->c:I

    iget v3, v0, Lr1/f0;->e:I

    if-lt v2, v3, :cond_7

    if-ne v2, v3, :cond_2

    invoke-virtual {v1, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v3, p1}, Lo0/i;->p(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget v1, v0, Lr1/f0;->e:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lr1/f0;->e:I

    iget-object v1, v0, Lr1/f0;->q:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v0, p1, p2}, Lr1/f0;->g(Ljava/lang/Object;Lc9/e;)Lr1/f1;

    move-result-object p2

    iget-object v3, v0, Lr1/f0;->s:Ljava/util/LinkedHashMap;

    invoke-interface {v3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, v0, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    iget-object v0, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v0, v0, Lt1/n0;->c:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_3

    invoke-virtual {p2, v2}, Landroidx/compose/ui/node/a;->N(Z)V

    goto :goto_2

    :cond_3
    const/4 v0, 0x2

    invoke-static {p2, v2, v0}, Landroidx/compose/ui/node/a;->O(Landroidx/compose/ui/node/a;ZI)V

    :cond_4
    :goto_2
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/node/a;

    if-eqz p1, :cond_5

    iget-object p1, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p1, p1, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {p1}, Lt1/l0;->j0()Ljava/util/List;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lo0/f;

    iget-object v0, p2, Lo0/f;->a:Lo0/i;

    iget v0, v0, Lo0/i;->c:I

    const/4 v1, 0x0

    :goto_3
    if-ge v1, v0, :cond_6

    invoke-virtual {p2, v1}, Lo0/f;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt1/l0;

    iget-object v3, v3, Lt1/l0;->L:Lt1/n0;

    iput-boolean v2, v3, Lt1/n0;->b:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    sget-object p1, Lr8/r;->a:Lr8/r;

    :cond_6
    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final J(F)I
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-interface {v0, p1}, Lm2/b;->J(F)I

    move-result p1

    return p1
.end method

.method public final N(IILjava/util/Map;Lc9/c;)Lr1/k0;
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lr1/a0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method

.method public final S(J)J
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-interface {v0, p1, p2}, Lm2/b;->S(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final Z(J)F
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-interface {v0, p1, p2}, Lm2/b;->Z(J)F

    move-result p1

    return p1
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    iget v0, v0, Lr1/a0;->b:F

    return v0
.end method

.method public final e0(F)J
    .locals 2

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-interface {v0, p1}, Lm2/b;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    iget-object v0, v0, Lr1/a0;->a:Lm2/l;

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    iget v0, v0, Lr1/a0;->c:F

    return v0
.end method

.method public final o0(I)F
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-interface {v0, p1}, Lm2/b;->o0(I)F

    move-result p1

    return p1
.end method

.method public final q()Z
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-virtual {v0}, Lr1/a0;->q()Z

    move-result v0

    return v0
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-virtual {v0}, Lr1/a0;->c()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public final t(F)J
    .locals 2

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-interface {v0, p1}, Lm2/b;->t(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final u(J)J
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-interface {v0, p1, p2}, Lm2/b;->u(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final v(F)F
    .locals 1

    iget-object v0, p0, Lr1/y;->a:Lr1/a0;

    invoke-virtual {v0}, Lr1/a0;->c()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method
