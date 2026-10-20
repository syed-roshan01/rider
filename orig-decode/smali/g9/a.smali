.class public abstract Lg9/a;
.super Lg9/d;


# virtual methods
.method public final a()I
    .locals 1

    invoke-virtual {p0}, Lg9/a;->c()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    return v0
.end method

.method public abstract c()Ljava/util/Random;
.end method
