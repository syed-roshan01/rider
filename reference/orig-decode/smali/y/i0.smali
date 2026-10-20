.class public final Ly/i0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/v;
.implements Ls1/d;
.implements Ls1/g;


# instance fields
.field public final b:Ly/i1;

.field public final c:Lm0/n1;

.field public final d:Lm0/n1;


# direct methods
.method public constructor <init>(Ly/i1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/i0;->b:Ly/i1;

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    iput-object v1, p0, Ly/i0;->c:Lm0/n1;

    invoke-static {p1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Ly/i0;->d:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ly/i0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ly/i0;

    iget-object p1, p1, Ly/i0;->b:Ly/i1;

    iget-object v0, p0, Ly/i0;->b:Ly/i1;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 6

    iget-object v0, p0, Ly/i0;->c:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly/i1;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ly/i1;->a(Lm2/b;Lm2/l;)I

    move-result v1

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly/i1;

    invoke-interface {v2, p1}, Ly/i1;->d(Lm2/b;)I

    move-result v2

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly/i1;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v4

    invoke-interface {v3, p1, v4}, Ly/i1;->c(Lm2/b;Lm2/l;)I

    move-result v3

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly/i1;

    invoke-interface {v0, p1}, Ly/i1;->b(Lm2/b;)I

    move-result v0

    add-int/2addr v3, v1

    add-int/2addr v0, v2

    neg-int v4, v3

    neg-int v5, v0

    invoke-static {p3, p4, v4, v5}, Lo1/s;->a0(JII)J

    move-result-wide v4

    invoke-interface {p2, v4, v5}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    iget v4, p2, Lr1/x0;->a:I

    add-int/2addr v4, v3

    invoke-static {v4, p3, p4}, Lo1/s;->q(IJ)I

    move-result v3

    iget v4, p2, Lr1/x0;->b:I

    add-int/2addr v4, v0

    invoke-static {v4, p3, p4}, Lo1/s;->p(IJ)I

    move-result p3

    new-instance p4, Ly/h0;

    invoke-direct {p4, p2, v1, v2}, Ly/h0;-><init>(Lr1/x0;II)V

    sget-object p2, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, v3, p3, p2, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ls1/h;)V
    .locals 3

    sget-object v0, Ly/l1;->a:Ls1/i;

    invoke-interface {p1, v0}, Ls1/h;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly/i1;

    new-instance v0, Ly/b0;

    iget-object v1, p0, Ly/i0;->b:Ly/i1;

    invoke-direct {v0, v1, p1}, Ly/b0;-><init>(Ly/i1;Ly/i1;)V

    iget-object v2, p0, Ly/i0;->c:Lm0/n1;

    invoke-virtual {v2, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    new-instance v0, Ly/e1;

    invoke-direct {v0, p1, v1}, Ly/e1;-><init>(Ly/i1;Ly/i1;)V

    iget-object p1, p0, Ly/i0;->d:Lm0/n1;

    invoke-virtual {p1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final getKey()Ls1/i;
    .locals 1

    sget-object v0, Ly/l1;->a:Ls1/i;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly/i0;->d:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly/i1;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ly/i0;->b:Ly/i1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
