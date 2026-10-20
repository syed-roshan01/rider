.class public final Lcom/google/crypto/tink/shaded/protobuf/t0;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    const/4 p0, 0x0

    throw p0
.end method

.method public static c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/s0;

    iget-boolean p0, p0, Lcom/google/crypto/tink/shaded/protobuf/s0;->a:Z

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static d(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/s0;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/s0;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->c()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->b()V

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/s0;->putAll(Ljava/util/Map;)V

    :cond_1
    return-object p0
.end method

.method public static e()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/s0;->b:Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->c()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v0

    return-object v0
.end method

.method public static f(Ljava/lang/Object;)V
    .locals 1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/s0;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/s0;->a:Z

    return-void
.end method
