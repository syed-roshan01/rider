.class public interface abstract Lt1/b0;
.super Ljava/lang/Object;

# interfaces
.implements Lt1/n;


# virtual methods
.method public a(Lr1/q;Lr1/p;I)I
    .locals 4

    new-instance v0, Lr1/n0;

    sget-object v1, Lt1/d1;->b:Lt1/d1;

    sget-object v2, Lt1/e1;->b:Lt1/e1;

    const/4 v3, 0x1

    invoke-direct {v0, p2, v1, v2, v3}, Lr1/n0;-><init>(Lr1/p;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x0

    const/16 v1, 0xd

    invoke-static {p3, p2, v1}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lt1/b0;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result p1

    return p1
.end method

.method public b(Lr1/q;Lr1/p;I)I
    .locals 4

    new-instance v0, Lr1/n0;

    sget-object v1, Lt1/d1;->b:Lt1/d1;

    sget-object v2, Lt1/e1;->a:Lt1/e1;

    const/4 v3, 0x1

    invoke-direct {v0, p2, v1, v2, v3}, Lr1/n0;-><init>(Lr1/p;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x0

    const/4 v1, 0x7

    invoke-static {p2, p3, v1}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lt1/b0;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->b()I

    move-result p1

    return p1
.end method

.method public d(Lr1/q;Lr1/p;I)I
    .locals 4

    new-instance v0, Lr1/n0;

    sget-object v1, Lt1/d1;->a:Lt1/d1;

    sget-object v2, Lt1/e1;->a:Lt1/e1;

    const/4 v3, 0x1

    invoke-direct {v0, p2, v1, v2, v3}, Lr1/n0;-><init>(Lr1/p;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x0

    const/4 v1, 0x7

    invoke-static {p2, p3, v1}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lt1/b0;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->b()I

    move-result p1

    return p1
.end method

.method public abstract f(Lr1/l0;Lr1/i0;J)Lr1/k0;
.end method

.method public h(Lr1/q;Lr1/p;I)I
    .locals 4

    new-instance v0, Lr1/n0;

    sget-object v1, Lt1/d1;->a:Lt1/d1;

    sget-object v2, Lt1/e1;->b:Lt1/e1;

    const/4 v3, 0x1

    invoke-direct {v0, p2, v1, v2, v3}, Lr1/n0;-><init>(Lr1/p;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x0

    const/16 v1, 0xd

    invoke-static {p3, p2, v1}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lt1/b0;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result p1

    return p1
.end method
