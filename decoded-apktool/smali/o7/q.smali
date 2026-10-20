.class public final Lo7/q;
.super Lcom/google/protobuf/g0;

# interfaces
.implements Lcom/google/protobuf/u1;


# virtual methods
.method public final c(Ljava/util/Map;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/s;

    invoke-static {v0}, Lo7/s;->g(Lo7/s;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/n1;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/s;

    invoke-static {v0, p1}, Lo7/s;->f(Lo7/s;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Lcom/google/protobuf/q2;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/s;

    invoke-static {v0, p1}, Lo7/s;->h(Lo7/s;Lcom/google/protobuf/q2;)V

    return-void
.end method
