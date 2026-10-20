.class public abstract Lr8/h;
.super Ljava/util/AbstractMap;

# interfaces
.implements Ljava/util/Map;
.implements Le9/d;


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 2

    move-object v0, p0

    check-cast v0, Lr0/f;

    new-instance v1, Lr0/h;

    invoke-direct {v1, v0}, Lr0/h;-><init>(Lr0/f;)V

    return-object v1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    move-object v0, p0

    check-cast v0, Lr0/f;

    new-instance v1, Lr0/j;

    invoke-direct {v1, v0}, Lr0/j;-><init>(Lr0/f;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    move-object v0, p0

    check-cast v0, Lr0/f;

    iget v0, v0, Lr0/f;->f:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 2

    move-object v0, p0

    check-cast v0, Lr0/f;

    new-instance v1, Lr0/l;

    invoke-direct {v1, v0}, Lr0/l;-><init>(Lr0/f;)V

    return-object v1
.end method
