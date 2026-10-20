.class public final Lt1/h0;
.super Lt1/a;


# virtual methods
.method public final b(Lt1/c1;J)J
    .locals 0

    invoke-virtual {p1, p2, p3}, Lt1/c1;->a1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c(Lt1/c1;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p1}, Lt1/c1;->s0()Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lt1/c1;Lr1/a;)I
    .locals 0

    invoke-virtual {p1, p2}, Lt1/q0;->p(Lr1/a;)I

    move-result p1

    return p1
.end method
