.class public abstract Lr8/f;
.super Ljava/util/AbstractCollection;

# interfaces
.implements Ljava/util/Collection;
.implements Le9/b;


# virtual methods
.method public final size()I
    .locals 1

    move-object v0, p0

    check-cast v0, Lr0/l;

    iget-object v0, v0, Lr0/l;->a:Lr0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Lr0/f;->f:I

    return v0
.end method
