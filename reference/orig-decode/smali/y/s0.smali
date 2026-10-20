.class public final Ly/s0;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public u:F

.field public v:F

.field public w:F

.field public x:F

.field public y:Z


# virtual methods
.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 5

    iget v0, p0, Ly/s0;->u:F

    invoke-interface {p1, v0}, Lm2/b;->J(F)I

    move-result v0

    iget v1, p0, Ly/s0;->w:F

    invoke-interface {p1, v1}, Lm2/b;->J(F)I

    move-result v1

    add-int/2addr v1, v0

    iget v0, p0, Ly/s0;->v:F

    invoke-interface {p1, v0}, Lm2/b;->J(F)I

    move-result v0

    iget v2, p0, Ly/s0;->x:F

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

    const/4 v1, 0x7

    invoke-direct {p4, p0, p2, p1, v1}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object p2, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, v0, p3, p2, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method
