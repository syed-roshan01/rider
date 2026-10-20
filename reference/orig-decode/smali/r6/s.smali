.class public abstract Lr6/s;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;


# instance fields
.field public transient a:Lr6/c0;

.field public transient b:Lr6/d0;

.field public transient c:Lr6/e0;


# direct methods
.method public static a(Ljava/util/HashMap;)Lr6/s;
    .locals 4

    instance-of v0, p0, Lr6/s;

    if-eqz v0, :cond_0

    instance-of v0, p0, Ljava/util/SortedMap;

    if-nez v0, :cond_0

    check-cast p0, Lr6/s;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    :goto_0
    new-instance v2, Lr6/r;

    invoke-direct {v2, v1}, Lr6/r;-><init>(I)V

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, v2, Lr6/r;->a:[Ljava/lang/Object;

    array-length v3, v1

    if-le v0, v3, :cond_2

    array-length v3, v1

    invoke-static {v3, v0}, Lo7/d0;->w(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lr6/r;->a:[Ljava/lang/Object;

    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lr6/r;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget-object p0, v2, Lr6/r;->c:Lr6/q;

    if-nez p0, :cond_5

    iget p0, v2, Lr6/r;->b:I

    iget-object v0, v2, Lr6/r;->a:[Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lr6/f0;->b(I[Ljava/lang/Object;Lr6/r;)Lr6/f0;

    move-result-object p0

    iget-object v0, v2, Lr6/r;->c:Lr6/q;

    if-nez v0, :cond_4

    return-object p0

    :cond_4
    invoke-virtual {v0}, Lr6/q;->a()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0

    :cond_5
    invoke-virtual {p0}, Lr6/q;->a()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final clear()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lr6/s;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, Lr6/s;->c:Lr6/e0;

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, Lr6/f0;

    new-instance v1, Lr6/e0;

    const/4 v2, 0x1

    iget v3, v0, Lr6/f0;->f:I

    iget-object v0, v0, Lr6/f0;->e:[Ljava/lang/Object;

    invoke-direct {v1, v0, v2, v3}, Lr6/e0;-><init>([Ljava/lang/Object;II)V

    iput-object v1, p0, Lr6/s;->c:Lr6/e0;

    move-object v0, v1

    :cond_0
    invoke-virtual {v0, p1}, Lr6/p;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 4

    iget-object v0, p0, Lr6/s;->a:Lr6/c0;

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, Lr6/f0;

    new-instance v1, Lr6/c0;

    iget v2, v0, Lr6/f0;->f:I

    iget-object v3, v0, Lr6/f0;->e:[Ljava/lang/Object;

    invoke-direct {v1, v0, v3, v2}, Lr6/c0;-><init>(Lr6/s;[Ljava/lang/Object;I)V

    iput-object v1, p0, Lr6/s;->a:Lr6/c0;

    move-object v0, v1

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0}, Lr6/s;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract get(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr6/s;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lr6/s;->a:Lr6/c0;

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, Lr6/f0;

    new-instance v1, Lr6/c0;

    iget v2, v0, Lr6/f0;->f:I

    iget-object v3, v0, Lr6/f0;->e:[Ljava/lang/Object;

    invoke-direct {v1, v0, v3, v2}, Lr6/c0;-><init>(Lr6/s;[Ljava/lang/Object;I)V

    iput-object v1, p0, Lr6/s;->a:Lr6/c0;

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lr6/c0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    move-object v3, v0

    check-cast v3, Lr6/a;

    invoke-virtual {v3}, Lr6/a;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Lr6/a;->next()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    add-int/2addr v2, v3

    not-int v2, v2

    not-int v2, v2

    goto :goto_0

    :cond_2
    return v2
.end method

.method public final isEmpty()Z
    .locals 1

    move-object v0, p0

    check-cast v0, Lr6/f0;

    iget v0, v0, Lr6/f0;->f:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 5

    iget-object v0, p0, Lr6/s;->b:Lr6/d0;

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, Lr6/f0;

    new-instance v1, Lr6/e0;

    const/4 v2, 0x0

    iget v3, v0, Lr6/f0;->f:I

    iget-object v4, v0, Lr6/f0;->e:[Ljava/lang/Object;

    invoke-direct {v1, v4, v2, v3}, Lr6/e0;-><init>([Ljava/lang/Object;II)V

    new-instance v2, Lr6/d0;

    invoke-direct {v2, v0, v1}, Lr6/d0;-><init>(Lr6/s;Lr6/e0;)V

    iput-object v2, p0, Lr6/s;->b:Lr6/d0;

    move-object v0, v2

    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    move-object v0, p0

    check-cast v0, Lr6/f0;

    iget v0, v0, Lr6/f0;->f:I

    if-ltz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    int-to-long v2, v0

    const-wide/16 v4, 0x8

    mul-long/2addr v2, v4

    const-wide/32 v4, 0x40000000

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v0, 0x7b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr6/s;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Lr6/c0;

    invoke-virtual {v0}, Lr6/c0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    if-nez v2, :cond_0

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "size cannot be negative but was: "

    invoke-static {v2, v0}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final values()Ljava/util/Collection;
    .locals 4

    iget-object v0, p0, Lr6/s;->c:Lr6/e0;

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, Lr6/f0;

    new-instance v1, Lr6/e0;

    const/4 v2, 0x1

    iget v3, v0, Lr6/f0;->f:I

    iget-object v0, v0, Lr6/f0;->e:[Ljava/lang/Object;

    invoke-direct {v1, v0, v2, v3}, Lr6/e0;-><init>([Ljava/lang/Object;II)V

    iput-object v1, p0, Lr6/s;->c:Lr6/e0;

    move-object v0, v1

    :cond_0
    return-object v0
.end method
