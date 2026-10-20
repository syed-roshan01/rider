.class public final Lcom/google/protobuf/o1;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/Object;)Li3/a0;
    .locals 0

    check-cast p0, Lcom/google/protobuf/m1;

    iget-object p0, p0, Lcom/google/protobuf/m1;->a:Li3/a0;

    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Lcom/google/protobuf/n1;
    .locals 0

    check-cast p0, Lcom/google/protobuf/n1;

    return-object p0
.end method

.method public static c(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    check-cast p1, Lcom/google/protobuf/n1;

    check-cast p2, Lcom/google/protobuf/m1;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/n1;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lcom/google/protobuf/v;->k0(I)I

    move-result v3

    iget-object v4, p2, Lcom/google/protobuf/m1;->a:Li3/a0;

    invoke-static {v4, v2, v0}, Lcom/google/protobuf/m1;->a(Li3/a0;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0, v0, v3, v1}, La7/a;->x(IIII)I

    move-result v1

    goto :goto_0

    :cond_1
    :goto_1
    return v1
.end method

.method public static d(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Lcom/google/protobuf/n1;

    iget-boolean p0, p0, Lcom/google/protobuf/n1;->a:Z

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/protobuf/n1;
    .locals 1

    check-cast p0, Lcom/google/protobuf/n1;

    check-cast p1, Lcom/google/protobuf/n1;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/protobuf/n1;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/n1;->c()Lcom/google/protobuf/n1;

    move-result-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/n1;->b()V

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/n1;->putAll(Ljava/util/Map;)V

    :cond_1
    return-object p0
.end method

.method public static f()Lcom/google/protobuf/n1;
    .locals 1

    sget-object v0, Lcom/google/protobuf/n1;->b:Lcom/google/protobuf/n1;

    invoke-virtual {v0}, Lcom/google/protobuf/n1;->c()Lcom/google/protobuf/n1;

    move-result-object v0

    return-object v0
.end method

.method public static g(Ljava/lang/Object;)V
    .locals 1

    check-cast p0, Lcom/google/protobuf/n1;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/n1;->a:Z

    return-void
.end method
