.class public final Lu/d1;
.super Ly0/n;

# interfaces
.implements Lt1/p1;


# instance fields
.field public u:Lx/m;

.field public v:Lx/h;


# virtual methods
.method public final A0()V
    .locals 0

    invoke-virtual {p0}, Lu/d1;->I0()V

    return-void
.end method

.method public final G0(Lu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lu/z0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu/z0;

    iget v1, v0, Lu/z0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu/z0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu/z0;

    invoke-direct {v0, p0, p1}, Lu/z0;-><init>(Lu/d1;Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lu/z0;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lu/z0;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lu/z0;->b:Lx/h;

    iget-object v0, v0, Lu/z0;->a:Lu/d1;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/d1;->v:Lx/h;

    if-nez p1, :cond_4

    new-instance p1, Lx/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, Lu/d1;->u:Lx/m;

    iput-object p0, v0, Lu/z0;->a:Lu/d1;

    iput-object p1, v0, Lu/z0;->b:Lx/h;

    iput v3, v0, Lu/z0;->e:I

    invoke-virtual {v2, p1, v0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    :goto_1
    iput-object v1, v0, Lu/d1;->v:Lx/h;

    :cond_4
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final H0(Lu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lu/a1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu/a1;

    iget v1, v0, Lu/a1;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu/a1;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu/a1;

    invoke-direct {v0, p0, p1}, Lu/a1;-><init>(Lu/d1;Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lu/a1;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lu/a1;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lu/a1;->a:Lu/d1;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/d1;->v:Lx/h;

    if-eqz p1, :cond_4

    new-instance v2, Lx/i;

    invoke-direct {v2, p1}, Lx/i;-><init>(Lx/h;)V

    iget-object p1, p0, Lu/d1;->u:Lx/m;

    iput-object p0, v0, Lu/a1;->a:Lu/d1;

    iput v3, v0, Lu/a1;->d:I

    invoke-virtual {p1, v2, v0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Lu/d1;->v:Lx/h;

    :cond_4
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final I0()V
    .locals 2

    iget-object v0, p0, Lu/d1;->v:Lx/h;

    if-eqz v0, :cond_0

    new-instance v1, Lx/i;

    invoke-direct {v1, v0}, Lx/i;-><init>(Lx/h;)V

    iget-object v0, p0, Lu/d1;->u:Lx/m;

    invoke-virtual {v0, v1}, Lx/m;->b(Lx/k;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lu/d1;->v:Lx/h;

    :cond_0
    return-void
.end method

.method public final b0()V
    .locals 0

    invoke-virtual {p0}, Lu/d1;->I0()V

    return-void
.end method

.method public final y(Lo1/k;Lo1/l;J)V
    .locals 1

    sget-object p3, Lo1/l;->b:Lo1/l;

    if-ne p2, p3, :cond_1

    iget p1, p1, Lo1/k;->c:I

    const/4 p2, 0x4

    invoke-static {p1, p2}, Lo1/s;->t(II)Z

    move-result p2

    const/4 p3, 0x0

    const/4 p4, 0x3

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Ly0/n;->v0()Lm9/d0;

    move-result-object p1

    new-instance p2, Lu/b1;

    invoke-direct {p2, p0, v0}, Lu/b1;-><init>(Lu/d1;Lu8/e;)V

    invoke-static {p1, v0, p3, p2, p4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    goto :goto_0

    :cond_0
    const/4 p2, 0x5

    invoke-static {p1, p2}, Lo1/s;->t(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ly0/n;->v0()Lm9/d0;

    move-result-object p1

    new-instance p2, Lu/c1;

    invoke-direct {p2, p0, v0}, Lu/c1;-><init>(Lu/d1;Lu8/e;)V

    invoke-static {p1, v0, p3, p2, p4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :cond_1
    :goto_0
    return-void
.end method
