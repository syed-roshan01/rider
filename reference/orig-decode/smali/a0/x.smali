.class public final La0/x;
.super Ljava/lang/Object;

# interfaces
.implements La0/w;
.implements Lr1/l0;


# instance fields
.field public final a:La0/q;

.field public final b:Lr1/i1;

.field public final c:La0/s;

.field public final d:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(La0/q;Lr1/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/x;->a:La0/q;

    iput-object p2, p0, La0/x;->b:Lr1/i1;

    iget-object p1, p1, La0/q;->b:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La0/s;

    iput-object p1, p0, La0/x;->c:La0/s;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La0/x;->d:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final E(J)I
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1, p2}, Lm2/b;->E(J)I

    move-result p1

    return p1
.end method

.method public final F(J)F
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1, p2}, Lm2/b;->F(J)F

    move-result p1

    return p1
.end method

.method public final J(F)I
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1}, Lm2/b;->J(F)I

    move-result p1

    return p1
.end method

.method public final N(IILjava/util/Map;Lc9/c;)Lr1/k0;
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1, p2, p3, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method

.method public final S(J)J
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1, p2}, Lm2/b;->S(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final Z(J)F
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1, p2}, Lm2/b;->Z(J)F

    move-result p1

    return p1
.end method

.method public final a(IJ)Ljava/util/List;
    .locals 6

    iget-object v0, p0, La0/x;->d:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, La0/x;->c:La0/s;

    invoke-interface {v1, p1}, La0/s;->a(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, p1}, La0/s;->d(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, La0/x;->a:La0/q;

    invoke-virtual {v3, p1, v2, v1}, La0/q;->a(ILjava/lang/Object;Ljava/lang/Object;)Lc9/e;

    move-result-object v1

    iget-object v3, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v3, v2, v1}, Lr1/i1;->H(Ljava/lang/Object;Lc9/e;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr1/i0;

    invoke-interface {v5, p2, p3}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v3

    :goto_1
    return-object v1
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0}, Lm2/b;->c()F

    move-result v0

    return v0
.end method

.method public final e0(F)J
    .locals 2

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1}, Lm2/b;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v0

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0}, Lm2/b;->m()F

    move-result v0

    return v0
.end method

.method public final o0(I)F
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1}, Lm2/b;->o0(I)F

    move-result p1

    return p1
.end method

.method public final q()Z
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0}, Lr1/q;->q()Z

    move-result v0

    return v0
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1}, Lm2/b;->q0(F)F

    move-result p1

    return p1
.end method

.method public final t(F)J
    .locals 2

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1}, Lm2/b;->t(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final u(J)J
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1, p2}, Lm2/b;->u(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final v(F)F
    .locals 1

    iget-object v0, p0, La0/x;->b:Lr1/i1;

    invoke-interface {v0, p1}, Lm2/b;->v(F)F

    move-result p1

    return p1
.end method
