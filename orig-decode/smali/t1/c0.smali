.class public final Lt1/c0;
.super Lt1/c1;


# static fields
.field public static final P:Le1/g;


# instance fields
.field public N:Lt1/b0;

.field public O:Lt1/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object v0

    sget v1, Le1/r;->h:I

    sget-wide v1, Le1/r;->e:J

    invoke-virtual {v0, v1, v2}, Le1/g;->e(J)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Le1/g;->k(F)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Le1/g;->l(I)V

    sput-object v0, Lt1/c0;->P:Le1/g;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/node/a;Lt1/b0;)V
    .locals 0

    invoke-direct {p0, p1}, Lt1/c1;-><init>(Landroidx/compose/ui/node/a;)V

    iput-object p2, p0, Lt1/c0;->N:Lt1/b0;

    iget-object p1, p1, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz p1, :cond_0

    new-instance p1, Lt1/w;

    invoke-direct {p1, p0}, Lt1/w;-><init>(Lt1/c0;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lt1/c0;->O:Lt1/r0;

    return-void
.end method


# virtual methods
.method public final F0()V
    .locals 1

    iget-object v0, p0, Lt1/c0;->O:Lt1/r0;

    if-nez v0, :cond_0

    new-instance v0, Lt1/w;

    invoke-direct {v0, p0}, Lt1/w;-><init>(Lt1/c0;)V

    iput-object v0, p0, Lt1/c0;->O:Lt1/r0;

    :cond_0
    return-void
.end method

.method public final I0()Lt1/r0;
    .locals 1

    iget-object v0, p0, Lt1/c0;->O:Lt1/r0;

    return-object v0
.end method

.method public final K0()Ly0/n;
    .locals 1

    iget-object v0, p0, Lt1/c0;->N:Lt1/b0;

    check-cast v0, Ly0/n;

    iget-object v0, v0, Ly0/n;->a:Ly0/n;

    return-object v0
.end method

.method public final Q(I)I
    .locals 2

    iget-object v0, p0, Lt1/c0;->N:Lt1/b0;

    iget-object v1, p0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, Lt1/b0;->d(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1
.end method

.method public final U0(Le1/p;)V
    .locals 1

    iget-object v0, p0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lt1/c1;->C0(Le1/p;)V

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-static {v0}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getShowLayoutBounds()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lt1/c0;->P:Le1/g;

    invoke-virtual {p0, p1, v0}, Lt1/c1;->D0(Le1/p;Le1/g;)V

    :cond_0
    return-void
.end method

.method public final V(I)I
    .locals 2

    iget-object v0, p0, Lt1/c0;->N:Lt1/b0;

    iget-object v1, p0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, Lt1/b0;->b(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1
.end method

.method public final X(I)I
    .locals 2

    iget-object v0, p0, Lt1/c0;->N:Lt1/b0;

    iget-object v1, p0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, Lt1/b0;->h(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1
.end method

.method public final d0(JFLc9/c;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lt1/c1;->V0(JFLc9/c;)V

    iget-boolean p1, p0, Lt1/q0;->f:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lt1/c1;->T0()V

    invoke-virtual {p0}, Lt1/c1;->s0()Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->e()V

    return-void
.end method

.method public final f(J)Lr1/x0;
    .locals 2

    invoke-virtual {p0, p1, p2}, Lr1/x0;->h0(J)V

    iget-object v0, p0, Lt1/c0;->N:Lt1/b0;

    iget-object v1, p0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1, p2}, Lt1/b0;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt1/c1;->X0(Lr1/k0;)V

    invoke-virtual {p0}, Lt1/c1;->S0()V

    return-object p0
.end method

.method public final g(I)I
    .locals 2

    iget-object v0, p0, Lt1/c0;->N:Lt1/b0;

    iget-object v1, p0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, Lt1/b0;->a(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1
.end method

.method public final j0(Lr1/a;)I
    .locals 1

    iget-object v0, p0, Lt1/c0;->O:Lt1/r0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lt1/r0;->u:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/high16 p1, -0x80000000

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Lt1/g;->c(Lt1/q0;Lr1/a;)I

    move-result p1

    :goto_0
    return p1
.end method
