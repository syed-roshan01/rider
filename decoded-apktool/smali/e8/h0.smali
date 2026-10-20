.class public abstract Le8/h0;
.super Le8/d1;


# virtual methods
.method public final b(Ljava/util/concurrent/TimeUnit;)V
    .locals 1

    move-object v0, p0

    check-cast v0, Lf8/c;

    iget-object v0, v0, Lf8/c;->a:Le8/d1;

    invoke-virtual {v0, p1}, Le8/d1;->b(Ljava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public final c()V
    .locals 1

    move-object v0, p0

    check-cast v0, Lf8/c;

    iget-object v0, v0, Lf8/c;->a:Le8/d1;

    invoke-virtual {v0}, Le8/d1;->c()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Lf8/c;

    iget-object v1, v1, Lf8/c;->a:Le8/d1;

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
