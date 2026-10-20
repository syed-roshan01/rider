.class public interface abstract Lm0/e1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/g1;
.implements Lm0/l3;


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Lm0/u2;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    move-object v0, p0

    check-cast v0, Lm0/u2;

    invoke-virtual {v0, p1}, Lm0/u2;->f(I)V

    return-void
.end method
