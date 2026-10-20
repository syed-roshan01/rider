.class public interface abstract Lm2/b;
.super Ljava/lang/Object;


# virtual methods
.method public E(J)I
    .locals 0

    invoke-interface {p0, p1, p2}, Lm2/b;->Z(J)F

    move-result p1

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    return p1
.end method

.method public F(J)F
    .locals 4

    invoke-static {p1, p2}, Lm2/n;->b(J)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    invoke-static {v0, v1, v2, v3}, Lm2/o;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Ln2/b;->a:Lq/a0;

    invoke-interface {p0}, Lm2/b;->m()F

    move-result v0

    sget v1, Ln2/b;->c:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    sget-object v0, Lm2/h;->a:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lm2/b;->m()F

    move-result v0

    invoke-static {v0}, Ln2/b;->a(F)Ln2/a;

    move-result-object v0

    invoke-static {p1, p2}, Lm2/n;->c(J)F

    move-result p1

    if-nez v0, :cond_1

    invoke-interface {p0}, Lm2/b;->m()F

    move-result p2

    :goto_0
    mul-float/2addr p2, p1

    goto :goto_2

    :cond_1
    invoke-interface {v0, p1}, Ln2/a;->b(F)F

    move-result p2

    goto :goto_2

    :cond_2
    :goto_1
    invoke-static {p1, p2}, Lm2/n;->c(J)F

    move-result p1

    invoke-interface {p0}, Lm2/b;->m()F

    move-result p2

    goto :goto_0

    :goto_2
    return p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Only Sp can convert to Px"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public J(F)I
    .locals 1

    invoke-interface {p0, p1}, Lm2/b;->v(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7fffffff

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    :goto_0
    return p1
.end method

.method public S(J)J
    .locals 2

    sget-wide v0, Lm2/g;->c:J

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lm2/g;->b(J)F

    move-result v0

    invoke-interface {p0, v0}, Lm2/b;->v(F)F

    move-result v0

    invoke-static {p1, p2}, Lm2/g;->a(J)F

    move-result p1

    invoke-interface {p0, p1}, Lm2/b;->v(F)F

    move-result p1

    invoke-static {v0, p1}, Ld7/t;->j(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-wide p1, Ld1/f;->c:J

    :goto_0
    return-wide p1
.end method

.method public Z(J)F
    .locals 4

    invoke-static {p1, p2}, Lm2/n;->b(J)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    invoke-static {v0, v1, v2, v3}, Lm2/o;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1, p2}, Lm2/b;->F(J)F

    move-result p1

    invoke-interface {p0, p1}, Lm2/b;->v(F)F

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Only Sp can convert to Px"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract c()F
.end method

.method public e0(F)J
    .locals 2

    invoke-interface {p0, p1}, Lm2/b;->q0(F)F

    move-result p1

    invoke-interface {p0, p1}, Lm2/b;->t(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract m()F
.end method

.method public o0(I)F
    .locals 1

    int-to-float p1, p1

    invoke-interface {p0}, Lm2/b;->c()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public q0(F)F
    .locals 1

    invoke-interface {p0}, Lm2/b;->c()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public t(F)J
    .locals 3

    sget-object v0, Ln2/b;->a:Lq/a0;

    invoke-interface {p0}, Lm2/b;->m()F

    move-result v0

    sget v1, Ln2/b;->c:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide v1, 0x100000000L

    if-eqz v0, :cond_3

    sget-object v0, Lm2/h;->a:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {p0}, Lm2/b;->m()F

    move-result v0

    invoke-static {v0}, Ln2/b;->a(F)Ln2/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Ln2/a;->a(F)F

    move-result p1

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Lm2/b;->m()F

    move-result v0

    div-float/2addr p1, v0

    :goto_1
    invoke-static {p1, v1, v2}, Lo1/s;->c0(FJ)J

    move-result-wide v0

    goto :goto_3

    :cond_3
    :goto_2
    invoke-interface {p0}, Lm2/b;->m()F

    move-result v0

    div-float/2addr p1, v0

    invoke-static {p1, v1, v2}, Lo1/s;->c0(FJ)J

    move-result-wide v0

    :goto_3
    return-wide v0
.end method

.method public u(J)J
    .locals 2

    sget v0, Ld1/f;->d:I

    sget-wide v0, Ld1/f;->c:J

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ld1/f;->d(J)F

    move-result v0

    invoke-interface {p0, v0}, Lm2/b;->q0(F)F

    move-result v0

    invoke-static {p1, p2}, Ld1/f;->b(J)F

    move-result p1

    invoke-interface {p0, p1}, Lm2/b;->q0(F)F

    move-result p1

    invoke-static {v0, p1}, Li1/b;->b(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget p1, Lm2/g;->d:I

    sget-wide p1, Lm2/g;->c:J

    :goto_0
    return-wide p1
.end method

.method public v(F)F
    .locals 1

    invoke-interface {p0}, Lm2/b;->c()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method
