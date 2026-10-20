.class public final Lt/t0;
.super Lt/s0;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lt/t0;

    if-eqz v0, :cond_0

    check-cast p1, Lt/t0;

    iget-object v0, p1, Lt/s0;->a:Ljava/lang/Object;

    iget-object v1, p0, Lt/s0;->a:Ljava/lang/Object;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lt/s0;->b:Lt/a0;

    iget-object v0, p0, Lt/s0;->b:Lt/a0;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lt/s0;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lt/s0;->b:Lt/a0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
