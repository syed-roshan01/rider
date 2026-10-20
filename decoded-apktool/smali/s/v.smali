.class public final Ls/v;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/v;


# instance fields
.field public final b:Lt/n1;

.field public final c:Lm0/l3;

.field public final synthetic d:Ls/w;


# direct methods
.method public constructor <init>(Ls/w;Lt/n1;Lm0/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/v;->d:Ls/w;

    iput-object p2, p0, Ls/v;->b:Lt/n1;

    iput-object p3, p0, Ls/v;->c:Lm0/l3;

    return-void
.end method


# virtual methods
.method public final a(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-interface {p2, p3}, Lr1/p;->g(I)I

    move-result p1

    return p1
.end method

.method public final b(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-interface {p2, p3}, Lr1/p;->V(I)I

    move-result p1

    return p1
.end method

.method public final d(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-interface {p2, p3}, Lr1/p;->Q(I)I

    move-result p1

    return p1
.end method

.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 8

    invoke-interface {p2, p3, p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    new-instance p3, Ls/u;

    const/4 p4, 0x0

    iget-object v0, p0, Ls/v;->d:Ls/w;

    invoke-direct {p3, p4, v0, p0}, Ls/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p4, Lq/w;

    const/4 v1, 0x2

    invoke-direct {p4, v0, v1}, Lq/w;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Ls/v;->b:Lt/n1;

    invoke-virtual {v1, p3, p4}, Lt/n1;->a(Lc9/c;Lc9/c;)Lt/m1;

    move-result-object p3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p4, v0, Ls/w;->b:Ly0/d;

    iget v0, p2, Lr1/x0;->a:I

    iget v1, p2, Lr1/x0;->b:I

    invoke-static {v0, v1}, Lo1/s;->e(II)J

    move-result-wide v3

    invoke-virtual {p3}, Lt/m1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/k;

    iget-wide v5, v0, Lm2/k;->a:J

    sget-object v7, Lm2/l;->a:Lm2/l;

    move-object v2, p4

    check-cast v2, Ly0/g;

    invoke-virtual/range {v2 .. v7}, Ly0/g;->a(JJLm2/l;)J

    move-result-wide v0

    invoke-virtual {p3}, Lt/m1;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lm2/k;

    iget-wide v2, p4, Lm2/k;->a:J

    const/16 p4, 0x20

    shr-long/2addr v2, p4

    long-to-int p4, v2

    invoke-virtual {p3}, Lt/m1;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lm2/k;

    iget-wide v2, p3, Lm2/k;->a:J

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int p3, v2

    new-instance v2, Ls/t;

    invoke-direct {v2, p2, v0, v1}, Ls/t;-><init>(Lr1/x0;J)V

    sget-object p2, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, p4, p3, p2, v2}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-interface {p2, p3}, Lr1/p;->X(I)I

    move-result p1

    return p1
.end method
