.class public final Lo7/e0;
.super Lcom/google/protobuf/g0;

# interfaces
.implements Lcom/google/protobuf/u1;


# virtual methods
.method public final c(Ljava/util/Map;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/g0;

    invoke-static {v0}, Lo7/g0;->f(Lo7/g0;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/n1;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final d(Lo7/a2;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/g0;

    invoke-static {v0, p1}, Lo7/g0;->h(Lo7/g0;Lo7/a2;)V

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/g0;

    invoke-static {v0, p1}, Lo7/g0;->g(Lo7/g0;Ljava/lang/String;)V

    return-void
.end method

.method public final f(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/g0;

    invoke-static {v0, p1}, Lo7/g0;->i(Lo7/g0;I)V

    return-void
.end method
