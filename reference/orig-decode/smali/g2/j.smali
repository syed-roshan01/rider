.class public final Lg2/j;
.super Ljava/lang/Object;


# instance fields
.field public a:Lg2/a0;

.field public b:Lg2/k;


# virtual methods
.method public final a(Ljava/util/List;)Lg2/a0;
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v2, 0x0

    move-object v3, v0

    :goto_0
    if-ge v2, v1, :cond_0

    :try_start_1
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg2/i;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v3, p0, Lg2/j;->b:Lg2/k;

    invoke-interface {v4, v3}, Lg2/i;->a(Lg2/k;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    add-int/lit8 v2, v2, 0x1

    move-object v3, v4

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v3, v4

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_0
    iget-object p1, p0, Lg2/j;->b:Lg2/k;

    new-instance v1, La2/e;

    iget-object p1, p1, Lg2/k;->a:Lg2/t;

    invoke-virtual {p1}, Lg2/t;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x6

    invoke-direct {v1, p1, v0, v2}, La2/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;I)V

    iget-object p1, p0, Lg2/j;->b:Lg2/k;

    iget v2, p1, Lg2/k;->b:I

    iget p1, p1, Lg2/k;->c:I

    invoke-static {v2, p1}, Lo1/s;->g(II)J

    move-result-wide v2

    new-instance p1, La2/b0;

    invoke-direct {p1, v2, v3}, La2/b0;-><init>(J)V

    iget-object v4, p0, Lg2/j;->a:Lg2/a0;

    iget-wide v4, v4, Lg2/a0;->b:J

    invoke-static {v4, v5}, La2/b0;->f(J)Z

    move-result v4

    if-nez v4, :cond_1

    move-object v0, p1

    :cond_1
    if-eqz v0, :cond_2

    iget-wide v2, v0, La2/b0;->a:J

    goto :goto_1

    :cond_2
    invoke-static {v2, v3}, La2/b0;->d(J)I

    move-result p1

    invoke-static {v2, v3}, La2/b0;->e(J)I

    move-result v0

    invoke-static {p1, v0}, Lo1/s;->g(II)J

    move-result-wide v2

    :goto_1
    iget-object p1, p0, Lg2/j;->b:Lg2/k;

    invoke-virtual {p1}, Lg2/k;->c()La2/b0;

    move-result-object p1

    new-instance v0, Lg2/a0;

    invoke-direct {v0, v1, v2, v3, p1}, Lg2/a0;-><init>(La2/e;JLa2/b0;)V

    iput-object v0, p0, Lg2/j;->a:Lg2/a0;

    return-object v0

    :catch_2
    move-exception v1

    move-object v3, v0

    move-object v0, v1

    :goto_2
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error while applying EditCommand batch to buffer (length="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lg2/j;->b:Lg2/k;

    iget-object v5, v5, Lg2/k;->a:Lg2/t;

    invoke-virtual {v5}, Lg2/t;->a()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", composition="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lg2/j;->b:Lg2/k;

    invoke-virtual {v5}, Lg2/k;->c()La2/b0;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", selection="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lg2/j;->b:Lg2/k;

    iget v6, v5, Lg2/k;->b:I

    iget v5, v5, Lg2/k;->c:I

    invoke-static {v6, v5}, Lo1/s;->g(II)J

    move-result-wide v5

    invoke-static {v5, v6}, La2/b0;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "):"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0xa

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v4, Lu/s;

    const/16 v5, 0x1a

    invoke-direct {v4, v5, v3, p0}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x3c

    invoke-static {p1, v2, v4, v3}, Lr8/p;->J0(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Lu/s;I)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
