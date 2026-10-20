.class public final Lo7/a1;
.super Lcom/google/protobuf/g0;

# interfaces
.implements Lcom/google/protobuf/u1;


# virtual methods
.method public final c()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/b1;

    invoke-static {v0}, Lo7/b1;->g(Lo7/b1;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/b1;

    invoke-static {v0, p1}, Lo7/b1;->f(Lo7/b1;Ljava/lang/String;)V

    return-void
.end method
