.class public final Le8/a2;
.super Ljava/lang/Object;

# interfaces
.implements Le8/k1;


# virtual methods
.method public final a(Ljava/io/Serializable;)[B
    .locals 0

    check-cast p1, Le8/c2;

    iget-object p1, p1, Le8/c2;->a:Le8/z1;

    iget-object p1, p1, Le8/z1;->b:[B

    return-object p1
.end method

.method public final b([B)Ljava/lang/Object;
    .locals 6

    array-length v0, p1

    const/16 v1, 0x30

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    aget-byte v0, p1, v2

    if-ne v0, v1, :cond_0

    sget-object p1, Le8/c2;->e:Le8/c2;

    goto :goto_2

    :cond_0
    array-length v0, p1

    const/16 v4, 0x39

    if-eq v0, v3, :cond_3

    const/4 v5, 0x2

    if-eq v0, v5, :cond_1

    goto :goto_1

    :cond_1
    aget-byte v0, p1, v2

    if-lt v0, v1, :cond_5

    if-le v0, v4, :cond_2

    goto :goto_1

    :cond_2
    sub-int/2addr v0, v1

    mul-int/lit8 v2, v0, 0xa

    move v0, v2

    move v2, v3

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_0
    aget-byte v2, p1, v2

    if-lt v2, v1, :cond_5

    if-le v2, v4, :cond_4

    goto :goto_1

    :cond_4
    sub-int/2addr v2, v1

    add-int/2addr v2, v0

    sget-object v0, Le8/c2;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_5

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le8/c2;

    goto :goto_2

    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lq6/d;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string p1, "Unknown code "

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Le8/c2;->g:Le8/c2;

    invoke-virtual {v0, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    :goto_2
    return-object p1
.end method
