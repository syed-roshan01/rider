.class public final Lg9/c;
.super Lg9/d;

# interfaces
.implements Ljava/io/Serializable;


# virtual methods
.method public final a()I
    .locals 1

    sget-object v0, Lg9/d;->b:Lg9/a;

    invoke-virtual {v0}, Lg9/a;->a()I

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final c(I)I
    .locals 1

    sget-object v0, Lg9/d;->b:Lg9/a;

    invoke-virtual {v0}, Lg9/a;->c()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    return p1
.end method
