.class public final Lo7/d;
.super Lcom/google/protobuf/g0;

# interfaces
.implements Lo7/f;


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/e;

    invoke-virtual {v0}, Lo7/e;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/util/List;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/e;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lo7/e;->g(Lo7/e;Ljava/util/List;)V

    return-void
.end method

.method public final d(Lo7/i2;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/e;

    invoke-static {v0, p1}, Lo7/e;->f(Lo7/e;Lo7/i2;)V

    return-void
.end method

.method public final e(I)Lo7/i2;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/e;

    invoke-virtual {v0, p1}, Lo7/e;->j(I)Lo7/i2;

    move-result-object p1

    return-object p1
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/e;

    invoke-virtual {v0}, Lo7/e;->k()I

    move-result v0

    return v0
.end method

.method public final g(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lo7/e;

    invoke-static {v0, p1}, Lo7/e;->h(Lo7/e;I)V

    return-void
.end method
