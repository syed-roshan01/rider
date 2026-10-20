.class public abstract Lt1/r0;
.super Lt1/q0;

# interfaces
.implements Lr1/i0;


# instance fields
.field public final p:Lt1/c1;

.field public q:J

.field public r:Ljava/util/LinkedHashMap;

.field public final s:Lr1/h0;

.field public t:Lr1/k0;

.field public final u:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lt1/c1;)V
    .locals 2

    invoke-direct {p0}, Lt1/q0;-><init>()V

    iput-object p1, p0, Lt1/r0;->p:Lt1/c1;

    sget-wide v0, Lm2/i;->b:J

    iput-wide v0, p0, Lt1/r0;->q:J

    new-instance p1, Lr1/h0;

    invoke-direct {p1, p0}, Lr1/h0;-><init>(Lt1/r0;)V

    iput-object p1, p0, Lt1/r0;->s:Lr1/h0;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lt1/r0;->u:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static final y0(Lt1/r0;Lr1/k0;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lr1/k0;->b()I

    move-result v0

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result v1

    invoke-static {v0, v1}, Lo1/s;->e(II)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lr1/x0;->g0(J)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lr1/x0;->g0(J)V

    :cond_1
    iget-object v0, p0, Lt1/r0;->t:Lr1/k0;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz p1, :cond_5

    iget-object v0, p0, Lt1/r0;->r:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-interface {p1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_5

    :cond_3
    invoke-interface {p1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lt1/r0;->r:Ljava/util/LinkedHashMap;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->p:Lt1/k0;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v0, v0, Lt1/k0;->w:Lt1/o0;

    invoke-virtual {v0}, Lt1/a;->g()V

    iget-object v0, p0, Lt1/r0;->r:Ljava/util/LinkedHashMap;

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lt1/r0;->r:Ljava/util/LinkedHashMap;

    :cond_4
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-interface {p1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_5
    iput-object p1, p0, Lt1/r0;->t:Lr1/k0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0}, Lt1/c1;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0}, Lt1/c1;->c()F

    move-result v0

    return v0
.end method

.method public final d0(JFLc9/c;)V
    .locals 0

    iget-wide p3, p0, Lt1/r0;->q:J

    invoke-static {p3, p4, p1, p2}, Lm2/i;->a(JJ)Z

    move-result p3

    if-nez p3, :cond_1

    iput-wide p1, p0, Lt1/r0;->q:J

    iget-object p1, p0, Lt1/r0;->p:Lt1/c1;

    iget-object p2, p1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object p2, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p2, p2, Lt1/n0;->p:Lt1/k0;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lt1/k0;->r0()V

    :cond_0
    invoke-static {p1}, Lt1/q0;->w0(Lt1/c1;)V

    :cond_1
    iget-boolean p1, p0, Lt1/q0;->f:Z

    if-eqz p1, :cond_2

    return-void

    :cond_2
    move-object p1, p0

    check-cast p1, Lt1/w;

    iget p2, p1, Lt1/w;->v:I

    packed-switch p2, :pswitch_data_0

    invoke-virtual {p1}, Lt1/r0;->s0()Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->e()V

    goto :goto_0

    :pswitch_0
    iget-object p1, p1, Lt1/r0;->p:Lt1/c1;

    iget-object p1, p1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object p1, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p1, p1, Lt1/n0;->p:Lt1/k0;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lt1/k0;->v0()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->y:Lm2/l;

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    invoke-virtual {v0}, Lt1/c1;->m()F

    move-result v0

    return v0
.end method

.method public final m0()Lt1/q0;
    .locals 1

    iget-object v0, p0, Lt1/r0;->p:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final r0()Z
    .locals 1

    iget-object v0, p0, Lt1/r0;->t:Lr1/k0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final s0()Lr1/k0;
    .locals 2

    iget-object v0, p0, Lt1/r0;->t:Lr1/k0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LookaheadDelegate has not been measured yet when measureResult is requested."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final v0()J
    .locals 2

    iget-wide v0, p0, Lt1/r0;->q:J

    return-wide v0
.end method

.method public final x0()V
    .locals 4

    iget-wide v0, p0, Lt1/r0;->q:J

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lt1/r0;->d0(JFLc9/c;)V

    return-void
.end method

.method public final z0(Lt1/r0;)J
    .locals 9

    sget-wide v0, Lm2/i;->b:J

    move-object v2, p0

    :goto_0
    invoke-static {v2, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-wide v3, v2, Lt1/r0;->q:J

    const/16 v5, 0x20

    shr-long v6, v0, v5

    long-to-int v6, v6

    shr-long v7, v3, v5

    long-to-int v5, v7

    add-int/2addr v6, v5

    const-wide v7, 0xffffffffL

    and-long/2addr v0, v7

    long-to-int v0, v0

    and-long/2addr v3, v7

    long-to-int v1, v3

    add-int/2addr v0, v1

    invoke-static {v6, v0}, Li1/b;->c(II)J

    move-result-wide v0

    iget-object v2, v2, Lt1/r0;->p:Lt1/c1;

    iget-object v2, v2, Lt1/c1;->r:Lt1/c1;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v2

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-wide v0
.end method
