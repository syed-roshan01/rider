.class public abstract Lk4/o;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract a()Lo7/d0;
.end method

.method public abstract b()Lja/i;
.end method

.method public close()V
    .locals 1

    move-object v0, p0

    check-cast v0, Lx9/c0;

    iget-object v0, v0, Lx9/c0;->c:Lja/i;

    invoke-static {v0}, Ly9/b;->b(Ljava/io/Closeable;)V

    return-void
.end method
