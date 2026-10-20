.class public interface abstract Lm0/f1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/g1;
.implements Lm0/l3;


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    check-cast v0, Lm0/w2;

    invoke-virtual {v0}, Lm0/w2;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    move-object p1, p0

    check-cast p1, Lm0/w2;

    invoke-virtual {p1, v0, v1}, Lm0/w2;->f(J)V

    return-void
.end method
