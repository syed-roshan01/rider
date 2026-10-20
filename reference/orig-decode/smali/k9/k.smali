.class public abstract Lk9/k;
.super Lk9/l;


# direct methods
.method public static G0(Lk9/f;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lk9/e;

    invoke-direct {v0, p0}, Lk9/e;-><init>(Lk9/f;)V

    invoke-virtual {v0}, Lk9/e;->hasNext()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lk9/e;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static H0(Lk9/i;Lc9/c;)Lk9/f;
    .locals 1

    new-instance v0, Lk9/h;

    invoke-direct {v0, p0, p1}, Lk9/h;-><init>(Lk9/i;Lc9/c;)V

    new-instance p0, Lk9/f;

    invoke-direct {p0, v0}, Lk9/f;-><init>(Lk9/h;)V

    return-object p0
.end method

.method public static I0(Lk9/i;)Ljava/util/List;
    .locals 2

    invoke-interface {p0}, Lk9/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Lr8/r;->a:Lr8/r;

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method
