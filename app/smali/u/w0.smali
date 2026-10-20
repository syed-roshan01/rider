.class public final Lu/w0;
.super Ly0/n;

# interfaces
.implements Ls1/f;
.implements Lt1/t;


# instance fields
.field public u:Z

.field public v:Lr1/s;


# virtual methods
.method public final r0(Lt1/c1;)V
    .locals 1

    iput-object p1, p0, Lu/w0;->v:Lr1/s;

    iget-boolean v0, p0, Lu/w0;->u:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lt1/c1;->K0()Ly0/n;

    move-result-object p1

    iget-boolean p1, p1, Ly0/n;->t:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lu/w0;->v:Lr1/s;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lr1/s;->L()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Ly0/n;->t:Z

    if-eqz p1, :cond_1

    sget-object p1, Lu/v0;->a:Ls1/i;

    invoke-interface {p0, p1}, Ls1/f;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lc9/c;

    :cond_1
    if-eqz v0, :cond_4

    iget-object p1, p0, Lu/w0;->v:Lr1/s;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-boolean p1, p0, Ly0/n;->t:Z

    if-eqz p1, :cond_3

    sget-object p1, Lu/v0;->a:Ls1/i;

    invoke-interface {p0, p1}, Ls1/f;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc9/c;

    goto :goto_0

    :cond_3
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_4

    invoke-interface {p1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_1
    return-void
.end method
