.class public final La0/b;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/q0;


# instance fields
.field public b:Z

.field public c:Lu8/l;


# virtual methods
.method public final l(Lu8/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, La0/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, La0/a;

    iget v1, v0, La0/a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La0/a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, La0/a;

    invoke-direct {v0, p0, p1}, La0/a;-><init>(La0/b;Lu8/e;)V

    :goto_0
    iget-object p1, v0, La0/a;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, La0/a;->d:I

    sget-object v3, Lq8/l;->a:Lq8/l;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, La0/a;->a:Lu8/e;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-boolean p1, p0, La0/b;->b:Z

    if-nez p1, :cond_4

    iget-object p1, p0, La0/b;->c:Lu8/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, La0/a;->a:Lu8/e;

    iput v4, v0, La0/a;->d:I

    new-instance v2, Lu8/l;

    invoke-static {v0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v0

    sget-object v4, Lv8/a;->b:Lv8/a;

    invoke-direct {v2, v4, v0}, Lu8/l;-><init>(Lv8/a;Lu8/e;)V

    iput-object v2, p0, La0/b;->c:Lu8/l;

    invoke-virtual {v2}, Lu8/l;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    if-eqz v0, :cond_4

    invoke-interface {v0, v3}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_4
    return-object v3
.end method
