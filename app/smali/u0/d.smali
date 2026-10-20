.class public final Lu0/d;
.super Lr0/f;


# instance fields
.field public n:Lu0/e;


# virtual methods
.method public final bridge synthetic a()Lr0/d;
    .locals 1

    invoke-virtual {p0}, Lu0/d;->c()Lu0/e;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic build()Lp0/f;
    .locals 1

    invoke-virtual {p0}, Lu0/d;->c()Lu0/e;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lu0/e;
    .locals 3

    iget-object v0, p0, Lr0/f;->c:Lr0/r;

    iget-object v1, p0, Lu0/d;->n:Lu0/e;

    iget-object v2, v1, Lr0/d;->a:Lr0/r;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lt0/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lr0/f;->b:Lt0/b;

    new-instance v1, Lu0/e;

    iget-object v0, p0, Lr0/f;->c:Lr0/r;

    iget v2, p0, Lr0/f;->f:I

    invoke-direct {v1, v0, v2}, Lr0/d;-><init>(Lr0/r;I)V

    :goto_0
    iput-object v1, p0, Lu0/d;->n:Lu0/e;

    return-object v1
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lm0/z;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lm0/z;

    invoke-super {p0, p1}, Lr0/f;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lm0/l3;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lm0/l3;

    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lm0/z;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lm0/z;

    invoke-super {p0, p1}, Lr0/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/l3;

    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lm0/z;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Lm0/z;

    check-cast p2, Lm0/l3;

    invoke-super {p0, p1, p2}, Ljava/util/AbstractMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/l3;

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lm0/z;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lm0/z;

    invoke-super {p0, p1}, Lr0/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/l3;

    return-object p1
.end method
