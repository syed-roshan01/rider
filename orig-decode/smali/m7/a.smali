.class public final Lm7/a;
.super Lcom/google/protobuf/g0;

# interfaces
.implements Lcom/google/protobuf/u1;


# virtual methods
.method public final c(Lm7/c;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lm7/g;

    invoke-virtual {p1}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p1

    check-cast p1, Lm7/e;

    invoke-static {v0, p1}, Lm7/g;->g(Lm7/g;Lm7/e;)V

    return-void
.end method

.method public final d()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lm7/g;

    invoke-static {v0}, Lm7/g;->f(Lm7/g;)V

    return-void
.end method
