.class public final Lr1/m;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/i0;


# instance fields
.field public final a:Lr1/p;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lr1/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/m;->a:Lr1/p;

    iput p2, p0, Lr1/m;->b:I

    iput p3, p0, Lr1/m;->c:I

    return-void
.end method


# virtual methods
.method public final Q(I)I
    .locals 1

    iget-object v0, p0, Lr1/m;->a:Lr1/p;

    invoke-interface {v0, p1}, Lr1/p;->Q(I)I

    move-result p1

    return p1
.end method

.method public final V(I)I
    .locals 1

    iget-object v0, p0, Lr1/m;->a:Lr1/p;

    invoke-interface {v0, p1}, Lr1/p;->V(I)I

    move-result p1

    return p1
.end method

.method public final X(I)I
    .locals 1

    iget-object v0, p0, Lr1/m;->a:Lr1/p;

    invoke-interface {v0, p1}, Lr1/p;->X(I)I

    move-result p1

    return p1
.end method

.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr1/m;->a:Lr1/p;

    invoke-interface {v0}, Lr1/p;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final f(J)Lr1/x0;
    .locals 7

    iget v0, p0, Lr1/m;->c:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x7fff

    const/4 v4, 0x2

    iget v5, p0, Lr1/m;->b:I

    iget-object v6, p0, Lr1/m;->a:Lr1/p;

    if-ne v0, v1, :cond_2

    if-ne v5, v4, :cond_0

    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result v0

    invoke-interface {v6, v0}, Lr1/p;->V(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result v0

    invoke-interface {v6, v0}, Lr1/p;->Q(I)I

    move-result v0

    :goto_0
    invoke-static {p1, p2}, Lm2/a;->d(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result v3

    :cond_1
    new-instance p1, Lr1/n;

    invoke-direct {p1, v0, v3, v2}, Lr1/n;-><init>(III)V

    return-object p1

    :cond_2
    if-ne v5, v4, :cond_3

    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result v0

    invoke-interface {v6, v0}, Lr1/p;->g(I)I

    move-result v0

    goto :goto_1

    :cond_3
    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result v0

    invoke-interface {v6, v0}, Lr1/p;->X(I)I

    move-result v0

    :goto_1
    invoke-static {p1, p2}, Lm2/a;->e(J)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result v3

    :cond_4
    new-instance p1, Lr1/n;

    invoke-direct {p1, v3, v0, v2}, Lr1/n;-><init>(III)V

    return-object p1
.end method

.method public final g(I)I
    .locals 1

    iget-object v0, p0, Lr1/m;->a:Lr1/p;

    invoke-interface {v0, p1}, Lr1/p;->g(I)I

    move-result p1

    return p1
.end method
