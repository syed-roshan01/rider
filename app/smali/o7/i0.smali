.class public final Lo7/i0;
.super Lcom/google/protobuf/g0;

# interfaces
.implements Lcom/google/protobuf/u1;


# virtual methods
.method public final c(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/k0;

    invoke-virtual {v0}, Lo7/k0;->i()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final d(Ljava/util/Map;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/k0;

    invoke-static {v0}, Lo7/k0;->f(Lo7/k0;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/n1;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final e(Lo7/i2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/k0;

    invoke-static {v0}, Lo7/k0;->f(Lo7/k0;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lcom/google/protobuf/n1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/k0;

    invoke-static {v0}, Lo7/k0;->f(Lo7/k0;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/n1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
