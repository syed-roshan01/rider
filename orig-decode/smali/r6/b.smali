.class public abstract Lr6/b;
.super Ljava/lang/Object;


# virtual methods
.method public abstract a()Lr6/s;
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lr6/b;

    if-eqz v0, :cond_1

    check-cast p1, Lr6/b;

    invoke-virtual {p0}, Lr6/b;->a()Lr6/s;

    move-result-object v0

    invoke-virtual {p1}, Lr6/b;->a()Lr6/s;

    move-result-object p1

    invoke-virtual {v0, p1}, Lr6/s;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lr6/b;->a()Lr6/s;

    move-result-object v0

    invoke-virtual {v0}, Lr6/s;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lr6/b;->a()Lr6/s;

    move-result-object v0

    invoke-virtual {v0}, Lr6/s;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
