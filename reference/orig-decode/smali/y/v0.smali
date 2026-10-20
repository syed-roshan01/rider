.class public final Ly/v0;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public u:Ly/t0;


# virtual methods
.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 5

    iget-object v0, p0, Ly/v0;->u:Ly/t0;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v1

    invoke-interface {v0, v1}, Ly/t0;->a(Lm2/l;)F

    move-result v0

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Ly/v0;->u:Ly/t0;

    invoke-interface {v0}, Ly/t0;->d()F

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Ly/v0;->u:Ly/t0;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-interface {v0, v2}, Ly/t0;->b(Lm2/l;)F

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Ly/v0;->u:Ly/t0;

    invoke-interface {v0}, Ly/t0;->c()F

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Ly/v0;->u:Ly/t0;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v1

    invoke-interface {v0, v1}, Ly/t0;->a(Lm2/l;)F

    move-result v0

    invoke-interface {p1, v0}, Lm2/b;->J(F)I

    move-result v0

    iget-object v1, p0, Ly/v0;->u:Ly/t0;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-interface {v1, v2}, Ly/t0;->b(Lm2/l;)F

    move-result v1

    invoke-interface {p1, v1}, Lm2/b;->J(F)I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Ly/v0;->u:Ly/t0;

    invoke-interface {v0}, Ly/t0;->d()F

    move-result v0

    invoke-interface {p1, v0}, Lm2/b;->J(F)I

    move-result v0

    iget-object v2, p0, Ly/v0;->u:Ly/t0;

    invoke-interface {v2}, Ly/t0;->c()F

    move-result v2

    invoke-interface {p1, v2}, Lm2/b;->J(F)I

    move-result v2

    add-int/2addr v2, v0

    neg-int v0, v1

    neg-int v3, v2

    invoke-static {p3, p4, v0, v3}, Lo1/s;->a0(JII)J

    move-result-wide v3

    invoke-interface {p2, v3, v4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    iget v0, p2, Lr1/x0;->a:I

    add-int/2addr v0, v1

    invoke-static {v0, p3, p4}, Lo1/s;->q(IJ)I

    move-result v0

    iget v1, p2, Lr1/x0;->b:I

    add-int/2addr v1, v2

    invoke-static {v1, p3, p4}, Lo1/s;->p(IJ)I

    move-result p3

    new-instance p4, Lb/g;

    const/16 v1, 0x8

    invoke-direct {p4, p2, p1, p0, v1}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object p2, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, v0, p3, p2, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Padding must be non-negative"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
