.class public interface abstract Lr1/v;
.super Ljava/lang/Object;

# interfaces
.implements Ly0/m;


# virtual methods
.method public a(Lr1/q;Lr1/p;I)I
    .locals 4

    new-instance v0, Lr1/n0;

    sget-object v1, Lr1/o0;->b:Lr1/o0;

    sget-object v2, Lr1/p0;->b:Lr1/p0;

    const/4 v3, 0x0

    invoke-direct {v0, p2, v1, v2, v3}, Lr1/n0;-><init>(Lr1/p;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/16 p2, 0xd

    invoke-static {p3, v3, p2}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lr1/v;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result p1

    return p1
.end method

.method public b(Lr1/q;Lr1/p;I)I
    .locals 4

    new-instance v0, Lr1/n0;

    sget-object v1, Lr1/o0;->b:Lr1/o0;

    sget-object v2, Lr1/p0;->a:Lr1/p0;

    const/4 v3, 0x0

    invoke-direct {v0, p2, v1, v2, v3}, Lr1/n0;-><init>(Lr1/p;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x7

    invoke-static {v3, p3, p2}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lr1/v;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->b()I

    move-result p1

    return p1
.end method

.method public d(Lr1/q;Lr1/p;I)I
    .locals 4

    new-instance v0, Lr1/n0;

    sget-object v1, Lr1/o0;->a:Lr1/o0;

    sget-object v2, Lr1/p0;->a:Lr1/p0;

    const/4 v3, 0x0

    invoke-direct {v0, p2, v1, v2, v3}, Lr1/n0;-><init>(Lr1/p;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x7

    invoke-static {v3, p3, p2}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lr1/v;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

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

    sget-object v1, Lr1/o0;->a:Lr1/o0;

    sget-object v2, Lr1/p0;->b:Lr1/p0;

    const/4 v3, 0x0

    invoke-direct {v0, p2, v1, v2, v3}, Lr1/n0;-><init>(Lr1/p;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/16 p2, 0xd

    invoke-static {p3, v3, p2}, Lo1/s;->b(III)J

    move-result-wide p2

    new-instance v1, Lr1/r;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lr1/r;-><init>(Lr1/q;Lm2/l;)V

    invoke-interface {p0, v1, v0, p2, p3}, Lr1/v;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result p1

    return p1
.end method
