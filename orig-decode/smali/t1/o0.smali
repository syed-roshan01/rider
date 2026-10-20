.class public final Lt1/o0;
.super Lt1/a;


# virtual methods
.method public final b(Lt1/c1;J)J
    .locals 4

    invoke-virtual {p1}, Lt1/c1;->I0()Lt1/r0;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v0, p1, Lt1/r0;->q:J

    sget p1, Lm2/i;->c:I

    const/16 p1, 0x20

    shr-long v2, v0, p1

    long-to-int p1, v2

    int-to-float p1, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-static {p1, v0}, Ld9/i;->f(FF)J

    move-result-wide v0

    invoke-static {v0, v1, p2, p3}, Ld1/c;->g(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c(Lt1/c1;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p1}, Lt1/c1;->I0()Lt1/r0;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lt1/r0;->s0()Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lt1/c1;Lr1/a;)I
    .locals 0

    invoke-virtual {p1}, Lt1/c1;->I0()Lt1/r0;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lt1/q0;->p(Lr1/a;)I

    move-result p1

    return p1
.end method
