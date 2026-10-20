.class public final Le1/f0;
.super Ljava/lang/Object;

# interfaces
.implements Le1/l0;


# virtual methods
.method public final d(JLm2/l;Lm2/b;)Le1/g0;
    .locals 2

    new-instance p3, Le1/b0;

    sget-wide v0, Ld1/c;->b:J

    invoke-static {v0, v1, p1, p2}, Lm9/e0;->h(JJ)Ld1/d;

    move-result-object p1

    invoke-direct {p3, p1}, Le1/b0;-><init>(Ld1/d;)V

    return-object p3
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "RectangleShape"

    return-object v0
.end method
