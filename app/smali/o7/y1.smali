.class public final Lo7/y1;
.super Lcom/google/protobuf/g0;

# interfaces
.implements Lcom/google/protobuf/u1;


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/z1;

    invoke-static {v0, p1}, Lo7/z1;->g(Lo7/z1;Ljava/lang/String;)V

    return-void
.end method

.method public final d(Lo7/z0;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/z1;

    invoke-virtual {p1}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p1

    check-cast p1, Lo7/u1;

    invoke-static {v0, p1}, Lo7/z1;->f(Lo7/z1;Lo7/u1;)V

    return-void
.end method
