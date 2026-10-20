.class public abstract Lg8/c;
.super Le8/d1;


# virtual methods
.method public final a()Le8/c1;
    .locals 1

    move-object v0, p0

    check-cast v0, Lh8/i;

    iget-object v0, v0, Lh8/i;->a:Lg8/n3;

    invoke-virtual {v0}, Lg8/n3;->a()Le8/c1;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Lh8/i;

    iget-object v1, v1, Lh8/i;->a:Lg8/n3;

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
