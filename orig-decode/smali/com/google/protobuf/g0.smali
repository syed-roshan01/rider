.class public abstract Lcom/google/protobuf/g0;
.super Lcom/google/protobuf/b;


# instance fields
.field private final defaultInstance:Lcom/google/protobuf/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/l0;"
        }
    .end annotation
.end field

.field protected instance:Lcom/google/protobuf/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/l0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/protobuf/l0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/g0;->defaultInstance:Lcom/google/protobuf/l0;

    invoke-virtual {p1}, Lcom/google/protobuf/l0;->isMutable()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/protobuf/l0;->newMutableInstance()Lcom/google/protobuf/l0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final build()Lcom/google/protobuf/l0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->buildPartial()Lcom/google/protobuf/l0;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/l0;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 4
    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/b;->newUninitializedMessageException(Lcom/google/protobuf/t1;)Lcom/google/protobuf/r2;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/t1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    .line 2
    invoke-virtual {v0}, Lcom/google/protobuf/l0;->isMutable()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/l0;->makeImmutable()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/t1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->buildPartial()Lcom/google/protobuf/l0;

    move-result-object v0

    return-object v0
.end method

.method public final clear()Lcom/google/protobuf/g0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/g0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/g0;->defaultInstance:Lcom/google/protobuf/l0;

    .line 2
    invoke-virtual {v0}, Lcom/google/protobuf/l0;->isMutable()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/g0;->defaultInstance:Lcom/google/protobuf/l0;

    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/l0;->newMutableInstance()Lcom/google/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    return-object p0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Default instance must be immutable."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/s1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->clear()Lcom/google/protobuf/g0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->clone()Lcom/google/protobuf/g0;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/g0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/g0;"
        }
    .end annotation

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->getDefaultInstanceForType()Lcom/google/protobuf/l0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->newBuilderForType()Lcom/google/protobuf/g0;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->buildPartial()Lcom/google/protobuf/l0;

    move-result-object v1

    iput-object v1, v0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/s1;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->clone()Lcom/google/protobuf/g0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->clone()Lcom/google/protobuf/g0;

    move-result-object v0

    return-object v0
.end method

.method public final copyOnWrite()V
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->isMutable()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWriteInternal()V

    :cond_0
    return-void
.end method

.method public copyOnWriteInternal()V
    .locals 4

    iget-object v0, p0, Lcom/google/protobuf/g0;->defaultInstance:Lcom/google/protobuf/l0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->newMutableInstance()Lcom/google/protobuf/l0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    sget-object v2, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/d2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/protobuf/d2;->a(Ljava/lang/Class;)Lcom/google/protobuf/i2;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/google/protobuf/i2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    return-void
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/g0;->defaultInstance:Lcom/google/protobuf/l0;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/t1;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->getDefaultInstanceForType()Lcom/google/protobuf/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic internalMergeFrom(Lcom/google/protobuf/c;)Lcom/google/protobuf/b;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/l0;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/g0;->internalMergeFrom(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;

    move-result-object p1

    return-object p1
.end method

.method public internalMergeFrom(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/l0;",
            ")",
            "Lcom/google/protobuf/g0;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/protobuf/g0;->mergeFrom(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;

    move-result-object p1

    return-object p1
.end method

.method public final isInitialized()Z
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/protobuf/l0;->isInitialized(Lcom/google/protobuf/l0;Z)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/s;Lcom/google/protobuf/z;)Lcom/google/protobuf/b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/g0;->mergeFrom(Lcom/google/protobuf/s;Lcom/google/protobuf/z;)Lcom/google/protobuf/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BII)Lcom/google/protobuf/b;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/g0;->mergeFrom([BII)Lcom/google/protobuf/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BIILcom/google/protobuf/z;)Lcom/google/protobuf/b;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/protobuf/g0;->mergeFrom([BIILcom/google/protobuf/z;)Lcom/google/protobuf/g0;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/l0;",
            ")",
            "Lcom/google/protobuf/g0;"
        }
    .end annotation

    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->getDefaultInstanceForType()Lcom/google/protobuf/l0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    .line 9
    sget-object v1, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/d2;

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/protobuf/d2;->a(Ljava/lang/Class;)Lcom/google/protobuf/i2;

    move-result-object v1

    .line 12
    invoke-interface {v1, v0, p1}, Lcom/google/protobuf/i2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/s;Lcom/google/protobuf/z;)Lcom/google/protobuf/g0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/s;",
            "Lcom/google/protobuf/z;",
            ")",
            "Lcom/google/protobuf/g0;"
        }
    .end annotation

    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    .line 21
    :try_start_0
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/d2;

    iget-object v1, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    .line 22
    invoke-virtual {v0, v1}, Lcom/google/protobuf/d2;->b(Ljava/lang/Object;)Lcom/google/protobuf/i2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    .line 23
    iget-object v2, p1, Lcom/google/protobuf/s;->d:Lg2/m;

    if-eqz v2, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lg2/m;

    invoke-direct {v2, p1}, Lg2/m;-><init>(Lcom/google/protobuf/s;)V

    .line 25
    :goto_0
    invoke-interface {v0, v1, v2, p2}, Lcom/google/protobuf/i2;->h(Ljava/lang/Object;Lg2/m;Lcom/google/protobuf/z;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/io/IOException;

    if-eqz p2, :cond_1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/IOException;

    throw p1

    .line 28
    :cond_1
    throw p1
.end method

.method public mergeFrom([BII)Lcom/google/protobuf/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII)",
            "Lcom/google/protobuf/g0;"
        }
    .end annotation

    .line 19
    invoke-static {}, Lcom/google/protobuf/z;->a()Lcom/google/protobuf/z;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/protobuf/g0;->mergeFrom([BIILcom/google/protobuf/z;)Lcom/google/protobuf/g0;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom([BIILcom/google/protobuf/z;)Lcom/google/protobuf/g0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lcom/google/protobuf/z;",
            ")",
            "Lcom/google/protobuf/g0;"
        }
    .end annotation

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    .line 14
    :try_start_0
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/d2;

    iget-object v1, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    .line 15
    invoke-virtual {v0, v1}, Lcom/google/protobuf/d2;->b(Ljava/lang/Object;)Lcom/google/protobuf/i2;

    move-result-object v2

    iget-object v3, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    add-int v6, p2, p3

    new-instance v7, Lcom/google/crypto/tink/shaded/protobuf/e;

    invoke-direct {v7, p4}, Lcom/google/crypto/tink/shaded/protobuf/e;-><init>(Lcom/google/protobuf/z;)V

    move-object v4, p1

    move v5, p2

    invoke-interface/range {v2 .. v7}, Lcom/google/protobuf/i2;->i(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e;)V
    :try_end_0
    .catch Lcom/google/protobuf/a1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    .line 16
    :goto_0
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Reading from byte array should not throw IOException."

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 17
    :catch_2
    invoke-static {}, Lcom/google/protobuf/a1;->h()Lcom/google/protobuf/a1;

    move-result-object p1

    throw p1

    .line 18
    :goto_1
    throw p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/s;Lcom/google/protobuf/z;)Lcom/google/protobuf/s1;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/g0;->mergeFrom(Lcom/google/protobuf/s;Lcom/google/protobuf/z;)Lcom/google/protobuf/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BII)Lcom/google/protobuf/s1;
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/g0;->mergeFrom([BII)Lcom/google/protobuf/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BIILcom/google/protobuf/z;)Lcom/google/protobuf/s1;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/protobuf/g0;->mergeFrom([BIILcom/google/protobuf/z;)Lcom/google/protobuf/g0;

    move-result-object p1

    return-object p1
.end method
