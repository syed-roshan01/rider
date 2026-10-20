.class public abstract Ln8/a;
.super Le8/z0;


# virtual methods
.method public final b()Z
    .locals 1

    invoke-virtual {p0}, Ln8/a;->g()Le8/z0;

    move-result-object v0

    invoke-virtual {v0}, Le8/z0;->b()Z

    move-result v0

    return v0
.end method

.method public final c(Le8/c2;)V
    .locals 1

    invoke-virtual {p0}, Ln8/a;->g()Le8/z0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le8/z0;->c(Le8/c2;)V

    return-void
.end method

.method public final d(Le8/w0;)V
    .locals 1

    invoke-virtual {p0}, Ln8/a;->g()Le8/z0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le8/z0;->d(Le8/w0;)V

    return-void
.end method

.method public final e()V
    .locals 1

    invoke-virtual {p0}, Ln8/a;->g()Le8/z0;

    move-result-object v0

    invoke-virtual {v0}, Le8/z0;->e()V

    return-void
.end method

.method public abstract g()Le8/z0;
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Ln8/a;->g()Le8/z0;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
