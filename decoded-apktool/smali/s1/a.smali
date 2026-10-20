.class public final Ls1/a;
.super Lf6/a;


# instance fields
.field public z:Ls1/g;


# virtual methods
.method public final B(Ls1/c;)Z
    .locals 1

    iget-object v0, p0, Ls1/a;->z:Ls1/g;

    invoke-interface {v0}, Ls1/g;->getKey()Ls1/i;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final I(Ls1/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/a;->z:Ls1/g;

    invoke-interface {v0}, Ls1/g;->getKey()Ls1/i;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ls1/a;->z:Ls1/g;

    invoke-interface {p1}, Ls1/g;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
