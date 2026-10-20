.class public final Lm0/m3;
.super Lm0/u1;


# virtual methods
.method public final a(Lm0/l3;Ljava/lang/Object;)Lm0/l3;
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lm0/n3;

    invoke-direct {p1, p2}, Lm0/n3;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method
