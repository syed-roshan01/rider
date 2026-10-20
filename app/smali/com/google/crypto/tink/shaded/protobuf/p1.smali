.class public final Lcom/google/crypto/tink/shaded/protobuf/p1;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/o1;
    .locals 2

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/o1;->f:Lcom/google/crypto/tink/shaded/protobuf/o1;

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o1;->c()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    :cond_0
    return-object v0
.end method

.method public static b(Ljava/lang/Object;)V
    .locals 1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object p0, p0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->e:Z

    return-void
.end method

.method public static c(Ljava/lang/Object;Lg2/m;)Z
    .locals 8

    invoke-virtual {p1}, Lg2/m;->c()I

    move-result v0

    ushr-int/lit8 v1, v0, 0x3

    and-int/lit8 v0, v0, 0x7

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eqz v0, :cond_8

    if-eq v0, v3, :cond_7

    const/4 v4, 0x2

    if-eq v0, v4, :cond_6

    const/4 v4, 0x0

    if-eq v0, v2, :cond_2

    const/4 v5, 0x4

    if-eq v0, v5, :cond_1

    const/4 v4, 0x5

    if-ne v0, v4, :cond_0

    invoke-virtual {p1}, Lg2/m;->t()I

    move-result p1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/o1;

    shl-int/lit8 v0, v1, 0x3

    or-int/2addr v0, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p0

    throw p0

    :cond_1
    move v3, v4

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o1;->c()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v0

    shl-int/2addr v1, v2

    or-int/lit8 v5, v1, 0x4

    :cond_3
    invoke-virtual {p1}, Lg2/m;->b()I

    move-result v6

    const v7, 0x7fffffff

    if-eq v6, v7, :cond_4

    invoke-static {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/p1;->c(Ljava/lang/Object;Lg2/m;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_4
    invoke-virtual {p1}, Lg2/m;->c()I

    move-result p1

    if-ne v5, p1, :cond_5

    iput-boolean v4, v0, Lcom/google/crypto/tink/shaded/protobuf/o1;->e:Z

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/o1;

    or-int/lit8 p1, v1, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    goto :goto_0

    :cond_5
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/h0;

    const-string p1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p1}, Lg2/m;->l()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/o1;

    shl-int/lit8 v0, v1, 0x3

    or-int/2addr v0, v4

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Lg2/m;->v()J

    move-result-wide v4

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/o1;

    shl-int/lit8 p1, v1, 0x3

    or-int/2addr p1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lg2/m;->B()J

    move-result-wide v4

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/o1;

    shl-int/lit8 p1, v1, 0x3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    :goto_0
    return v3
.end method
