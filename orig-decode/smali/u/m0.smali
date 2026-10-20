.class public final Lu/m0;
.super Ly0/n;

# interfaces
.implements Lt1/m;
.implements Lc1/j;


# virtual methods
.method public final s0(Lc1/h;)V
    .locals 2

    sget-object v0, Lu1/s1;->j:Lm0/m3;

    invoke-static {p0, v0}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/b;

    check-cast v0, Ll1/c;

    iget-object v0, v0, Ll1/c;->a:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/a;

    iget v0, v0, Ll1/a;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    invoke-interface {p1, v0}, Lc1/h;->b(Z)V

    return-void
.end method
